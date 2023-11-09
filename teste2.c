#include <stdio.h>

static int var= 4; // Variável dinâmica de escopo
void exemploFuncao() {
    
    var++;
    printf("Variável estatica: %d\n", var);
}

int main() {
    printf("%d\n", var );
    exemploFuncao(); // 
    exemploFuncao(); // 
    exemploFuncao(); //
    return 0;
}
