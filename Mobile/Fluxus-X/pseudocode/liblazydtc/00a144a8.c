/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a144a8
 */

void * SCT_CTX_new(undefined8 param_1,char *param_2)

{
  void *ptr;
  char *pcVar1;
  
  ptr = (void *)CRYPTO_zalloc(0x60,"crypto/ct/ct_sct_ctx.c",0x19);
  if (ptr == (void *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ct/ct_sct_ctx.c",0x1c,"SCT_CTX_new");
    ERR_set_error(0x32,0xc0100,0);
  }
  else {
    *(undefined8 *)((long)ptr + 0x50) = param_1;
    if (param_2 != (char *)0x0) {
      pcVar1 = CRYPTO_strdup(param_2,"crypto/ct/ct_sct_ctx.c",0x22);
      *(char **)((long)ptr + 0x58) = pcVar1;
      if (pcVar1 == (char *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/ct/ct_sct_ctx.c",0x24,"SCT_CTX_new");
        ERR_set_error(0x32,0xc0100,0);
        CRYPTO_free(ptr);
        ptr = (void *)0x0;
      }
    }
  }
  return ptr;
}

