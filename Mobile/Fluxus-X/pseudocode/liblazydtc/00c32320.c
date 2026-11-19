/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c32320
 */

void * CRYPTO_malloc(int num,char *file,int line)

{
  void *pvVar1;
  
  pvVar1 = CRYPTO_malloc(num,file,line);
  return pvVar1;
}

