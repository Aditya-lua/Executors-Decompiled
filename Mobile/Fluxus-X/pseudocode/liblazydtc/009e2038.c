/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e2038
 */

void * FUN_009e2038(long param_1,int param_2)

{
  void *ptr;
  void *ptr_00;
  long lVar1;
  
  ptr = (void *)CRYPTO_zalloc(0x68,"ssl/statem/statem_dtls.c",0x3e);
  if (ptr == (void *)0x0) {
    ERR_new();
    ERR_set_debug("ssl/statem/statem_dtls.c",0x3f,"dtls1_hm_fragment_new");
    ERR_set_error(0x14,0xc0100,0);
    return (void *)0x0;
  }
  if (param_1 == 0) {
    ptr_00 = (void *)0x0;
    *(undefined8 *)((long)ptr + 0x58) = 0;
    if (param_2 != 0) goto LAB_009e2094;
LAB_009e2144:
    lVar1 = 0;
LAB_009e2148:
    *(long *)((long)ptr + 0x60) = lVar1;
  }
  else {
    ptr_00 = CRYPTO_malloc((int)param_1,"ssl/statem/statem_dtls.c",0x44);
    if (ptr_00 == (void *)0x0) {
      ERR_new();
      ERR_set_debug("ssl/statem/statem_dtls.c",0x45,"dtls1_hm_fragment_new");
      ERR_set_error(0x14,0xc0100,0);
    }
    else {
      *(void **)((long)ptr + 0x58) = ptr_00;
      if (param_2 == 0) goto LAB_009e2144;
LAB_009e2094:
      lVar1 = CRYPTO_zalloc(param_1 + 7U >> 3,"ssl/statem/statem_dtls.c",0x50);
      if (lVar1 != 0) goto LAB_009e2148;
      ERR_new();
      ERR_set_debug("ssl/statem/statem_dtls.c",0x52,"dtls1_hm_fragment_new");
      ERR_set_error(0x14,0xc0100,0);
      CRYPTO_free(ptr_00);
    }
    CRYPTO_free(ptr);
    ptr = (void *)0x0;
  }
  return ptr;
}

