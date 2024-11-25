/**
 * Write a description of class Gene here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gene  
{
    // instance variables - replace the example below with your own
    private int geneCount;
    private String DNA;

    /**
     * Constructor for objects of class Gene
     */
    public Gene(String dna){
        DNA = dna;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static int countNucleotides(String g, char nucleotide){
        int count = 0;
        for(int i = 0; i < g.length(); i++){
            if(g.charAt(i) == nucleotide){
                count++;
            }
        }
        return count;
    }
    public static int findStopCodons(String genome, int start)
    {
        if(genome.substring(start).length() % 3 != 0){
            return -1;
        }
        for(int i = start; i < genome.substring(start).length(); i +=3){
            if (genome.substring(i, i +3 ).equals("TAA") || genome.substring(i, i +3 ).equals("TAG") || genome.substring(i, i +3 ).equals("TGA")){
                return i;
            }
        }
    
        return -1;
    }
    
    
    
    public static String findGenes(String dna, int startIndex){
        int start = 0;
        for(int i = startIndex; i < dna.substring(startIndex).length(); i +=3){
            if (dna.substring(i, i+3).equals("ATG")){
                start = i;
            }
        }
        int end = findStopCodons(dna.substring(start),0);
        if (end != -1){
            return dna.substring(start,end);
        }
        return "No Genes found!";
        
    }
    public static boolean potentialGene(String dna){
        if(dna.startsWith("ATG")){
            if((dna.endsWith("TAG")) || (dna.endsWith("TAA")) || (dna.endsWith("TGA"))){
             int gene_start_index = dna.indexOf("ATG") + "ATG".length();
             int gene_end_index = dna.length()-3;
             String gene = dna.substring(gene_start_index, gene_end_index);
                if(gene.length() % 3 == 0){
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }
    public static void main(String[] args){
        System.out.println(potentialGene("ATGCGATACGCTTGA"));
        System.out.println(countNucleotides("ATGCGATACGCTTGA",'T'));
        System.out.println(findGenes("ATTAATATGTACTGA",0));
    }
    
}
