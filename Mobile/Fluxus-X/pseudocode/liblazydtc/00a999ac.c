/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a999ac
 */

void * CRYPTO_malloc(int num,char *file,int line)

{
  ulong __size;
  void *pvVar1;
  
  __size = (ulong)(uint)num;
  if ((code *)PTR_CRYPTO_malloc_00cc9138 != CRYPTO_malloc) {
                    /* WARNING: Could not recover jumptable at 0x00a999c4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    pvVar1 = (void *)(*(code *)PTR_CRYPTO_malloc_00cc9138)(__size,file,line);
    return pvVar1;
  }
  if (__size == 0) {
    return (void *)0x0;
  }
  if ((DAT_00d220e8 & 1) == 0) {
    DAT_00d220e8 = 1;
  }
  pvVar1 = malloc(__size);
  return pvVar1;
}

