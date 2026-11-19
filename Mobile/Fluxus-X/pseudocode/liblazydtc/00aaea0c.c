/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aaea0c
 */

void * OBJ_bsearch_(void *key,void *base,int num,int size,cmp *cmp)

{
  void *pvVar1;
  
  pvVar1 = (void *)ossl_bsearch(key,base,num,size,cmp,0);
  return pvVar1;
}

