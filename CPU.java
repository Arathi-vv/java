class CPU {
    double price;

    CPU(double priceValue) {
        price = priceValue; 
    }

    class Processor {
        int cores;
        String manufacturer;

        Processor(int coreCount, String maker) {
            cores = coreCount;  
            manufacturer = maker;  
        }

        void display() {
            System.out.println("Processor Cores: " + cores);
            System.out.println("Processor Manufacturer: " + manufacturer);
        }
    }

    static class RAM {
        int memory;
        String manufacturer;

        RAM(int memorySize, String maker) {
            memory = memorySize; 
            manufacturer = maker;  
        }

        void display() {
            System.out.println("RAM Memory: " + memory + " GB");
            System.out.println("RAM Manufacturer: " + manufacturer);
        }
    }

    public static void main(String[] args) {

        CPU myCPU = new CPU(299.99);

        CPU.Processor processor = myCPU.new Processor(8, "Intel");
        processor.display();
        
        CPU.RAM ram = new CPU.RAM(16, "Corsair");
        ram.display();
    }
}

