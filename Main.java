/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        String s1 = "AABAACAADAABAABA";
        String s2 = "DAA";

        String sGigante = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut ultrices dui eu gravida rutrum. Quisque facilisis mi a lacus sollicitudin, nec pulvinar orci dapibus. Cras maximus hendrerit lacus a lobortis. Vestibulum egestas quis odio nec porttitor. Suspendisse sodales urna nec tellus pretium, et facilisis tellus commodo. Etiam finibus lorem a ultrices vulputate. Morbi non iaculis augue. Aenean tortor augue, aliquam sit amet est id, pretium congue felis. Cras aliquam justo quis viverra lacinia. In hac habitasse platea dictumst. Suspendisse placerat sodales scelerisque. Phasellus luctus, ex interdum sollicitudin fringilla, metus lectus interdum ipsum, nec ornare libero urna ut ipsum. In molestie cursus augue sed blandit. Mauris tempor luctus orci ut vehicula. Nunc id tortor eget ipsum mattis lobortis non commodo tortor. Nunc mollis interdum ultrices. Praesent eleifend nunc neque, ac ultrices ante imperdiet vitae. Nullam quis lacus sed erat bibendum tempor. Nunc vitae enim diam. Integer in ligula sit amet dui scelerisque convallis. Vestibulum ultrices ex id urna fringilla porta. Nulla rhoncus venenatis orci, vel varius velit fringilla et. Etiam non ipsum varius ex lobortis rutrum. Donec maximus id erat at gravida. Integer ultrices viverra lacinia. Nulla viverra eros nec nisi rutrum condimentum. Sed fermentum erat id auctor accumsan. Pellentesque volutpat euismod neque at aliquam. Pellentesque at augue in augue sodales rutrum vitae sed augue. Nulla nibh mauris, porta eget tellus ac, condimentum volutpat augue. Vestibulum quam dolor, accumsan at malesuada vel, lobortis vel ipsum. Duis quis lectus felis. Sed ut arcu ornare, gravida turpis finibus, rutrum leo. Vivamus non arcu consequat, dictum magna sed, viverra sapien. Ut dignissim tempus purus, vitae ultricies urna tristique in. Nulla facilisi. Nam vehicula, diam eget accumsan gravida, erat odio venenatis orci, eget vehicula libero mi vel nibh. Etiam ut consequat ipsum. Duis euismod sed erat vel ultricies. Aenean ornare justo id nunc elementum, sed pretium lectus congue. Nunc et pharetra leo. Sed viverra neque nec diam tincidunt, non finibus velit congue. Sed velit lacus, congue at mollis nec, dapibus id odio. Cras placerat augue eget lorem mattis, et tempus erat facilisis. Nulla facilisi. Aenean vitae dictum orci. Aenean egestas purus eget mauris sollicitudin, at placerat ante iaculis. Vestibulum feugiat ante a aliquam sagittis. Aenean molestie condimentum commodo. Curabitur ligula ipsum, fringilla quis tortor eu, rhoncus auctor justo. Curabitur mattis risus sed laoreet bibendum. Pellentesque enim eros, tincidunt nec orci eget, sollicitudin maximus sapien. Nullam et tortor fringilla, accumsan purus posuere, tempor dolor. Quisque mauris odio, luctus eu ipsum eget, interdum vestibulum enim. Suspendisse quis ornare risus. Curabitur rhoncus tellus nec diam consequat molestie. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras lectus lacus, pellentesque vel sem nec, eleifend accumsan nulla. Nulla facilisi. In et tellus hendrerit, consectetur ligula lacinia, congue elit. Duis quis leo eleifend, scelerisque nulla in, pulvinar dui. Donec purus ex, vulputate in commodo quis, tempus non ligula. Donec sed mauris semper, fermentum nibh sed, semper turpis. Sed eu semper nisi, sed rutrum nisl. Donec pulvinar dolor nec nisl convallis, laoreet gravida risus tempus. Etiam ut bibendum ipsum. Nulla lacinia justo venenatis felis posuere, a auctor augue commodo. Maecenas eu elementum arcu, et mattis nibh. Curabitur ipsum turpis, feugiat a maximus nec, aliquam vel dolor. Morbi finibus pulvinar quam, eget euismod justo finibus dapibus. Fusce in aliquet dui. Pellentesque venenatis quam a sollicitudin laoreet. Praesent et nibh urna. Integer at fermentum leo. Vestibulum aliquam pretium urna non porta. Proin eu fringilla ligula. Fusce pretium tellus quis accumsan efficitur. In tempus ligula et pretium eleifend. Proin ac luctus urna, sed malesuada turpis. Integer a dignissim velit. In sit amet mauris dignissim, condimentum quam nec, faucibus metus. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Vivamus ut mauris lectus. Integer ut luctus nunc. Maecenas ac felis in lorem placerat pellentesque. Aenean vitae pellentesque lectus. Mauris vel ornare neque. Donec ultricies magna vitae augue euismod molestie. Integer ultrices, sapien eu suscipit vulputate, diam justo faucibus metus, vitae rhoncus est orci ac lectus. Donec venenatis eleifend libero vitae blandit. Fusce eu nibh ut ligula scelerisque cursus. Aliquam erat volutpat. Nullam ut blandit velit, quis pulvinar purus. Etiam accumsan neque nec quam venenatis, at porta leo tristique. Aliquam lacus eros, feugiat et porttitor sit amet, varius eget nulla. Curabitur vehicula sapien ac purus posuere, dapibus vehicula metus tincidunt. Morbi scelerisque tempus tellus, at molestie justo dignissim sollicitudin. Praesent non egestas ex. Duis quis lectus magna. Ut blandit gravida tempus. Pellentesque mollis ultrices velit non finibus. Aliquam tristique ante id molestie interdum. Duis eget libero mollis, venenatis enim eu, ullamcorper nunc. Aenean molestie lectus fermentum velit posuere, nec viverra tortor tristique. Suspendisse quis ornare sem, vel suscipit lorem. Etiam finibus tortor risus, sed bibendum est vulputate quis.";
        String sGigantePadrao = "tortor";

        System.out.println("----- Pattern Matching Simples -----");
        procurarPadroesTexto(s1, s2);

        System.out.println("\n----- Pattern Matching Rabin-Karp -----");
        procurarPadroesTextoRapin(sGigante, sGigantePadrao);

        System.out.println("\n----- Pattern Matching KMPSearch ------");
        procurarPadroesTextoKMP(sGigante, sGigantePadrao);

    }

    public static void procurarPadroesTexto(String texto, String padrao) {
        Algoritmos algoritmos = new Algoritmos();
        System.out.println("Posição: " + algoritmos.procurarPadroesTexto(texto, padrao));
        System.out.println("Iterações: " + algoritmos.getIteracaoMatchingSimples());
    }

    public static void procurarPadroesTextoRapin(String texto, String padrao){
        Algoritmos algoritmos = new Algoritmos();
        System.out.println("Posição: " + algoritmos.search(padrao, texto)); 
        System.out.println("Iterações: " + algoritmos.getIteracaoMatchingRabin());
    }

    public static void procurarPadroesTextoKMP(String texto, String padrao){
        Algoritmos algoritmos = new Algoritmos();
        algoritmos.KMPSearch(padrao, texto);
        System.out.println("\nIterações: " + algoritmos.getIteracaoMatchingKMP());
    }

}