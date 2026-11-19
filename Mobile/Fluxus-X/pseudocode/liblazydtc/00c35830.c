/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c35830
 */

void * OBJ_bsearch_(void *key,void *base,int num,int size,cmp *cmp)

{
  void *pvVar1;
  
  pvVar1 = OBJ_bsearch_(key,base,num,size,cmp);
  return pvVar1;
}

