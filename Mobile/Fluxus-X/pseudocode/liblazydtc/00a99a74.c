/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a99a74
 */

void * CRYPTO_realloc(void *addr,int num,char *file,int line)

{
  void *pvVar1;
  ulong __size;
  
  __size = (ulong)(uint)num;
  if ((code *)PTR_CRYPTO_realloc_00cc9140 != CRYPTO_realloc) {
                    /* WARNING: Could not recover jumptable at 0x00a99a98. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    pvVar1 = (void *)(*(code *)PTR_CRYPTO_realloc_00cc9140)();
    return pvVar1;
  }
  if (addr == (void *)0x0) {
    if ((code *)PTR_CRYPTO_malloc_00cc9138 != CRYPTO_malloc) {
                    /* WARNING: Could not recover jumptable at 0x00a99ad4. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      pvVar1 = (void *)(*(code *)PTR_CRYPTO_malloc_00cc9138)(__size,file,line);
      return pvVar1;
    }
    if (__size != 0) {
      if ((DAT_00d220e8 & 1) == 0) {
        DAT_00d220e8 = 1;
      }
      pvVar1 = malloc(__size);
      return pvVar1;
    }
  }
  else {
    if (__size != 0) {
      pvVar1 = realloc(addr,__size);
      return pvVar1;
    }
    if ((code *)PTR_CRYPTO_free_00cc9148 == CRYPTO_free) {
      free(addr);
    }
    else {
      (*(code *)PTR_CRYPTO_free_00cc9148)(addr,file,line);
    }
  }
  return (void *)0x0;
}

