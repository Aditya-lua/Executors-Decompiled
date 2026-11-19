/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9b8c0
 */

void * ossl_hexstr2buf_sep(char *param_1,undefined8 *param_2,undefined4 param_3)

{
  int iVar1;
  size_t sVar2;
  void *ptr;
  undefined8 local_38;
  
  sVar2 = strlen(param_1);
  if (sVar2 < 2) {
    ERR_new();
    ERR_set_debug("crypto/o_str.c",0xc3,"ossl_hexstr2buf_sep");
    ERR_set_error(0xf,0x79,0);
  }
  else {
    ptr = CRYPTO_malloc((int)(sVar2 >> 1),"crypto/o_str.c",199);
    if (ptr == (void *)0x0) {
      ERR_new();
      ERR_set_debug("crypto/o_str.c",200,"ossl_hexstr2buf_sep");
      ERR_set_error(0xf,0xc0100,0);
      return (void *)0x0;
    }
    if (param_2 != (undefined8 *)0x0) {
      *param_2 = 0;
    }
    local_38 = 0;
    iVar1 = FUN_00a9b780(ptr,sVar2 >> 1,&local_38,param_1,param_3);
    if (iVar1 != 0) {
      if (param_2 == (undefined8 *)0x0) {
        return ptr;
      }
      *param_2 = local_38;
      return ptr;
    }
    CRYPTO_free(ptr);
  }
  return (void *)0x0;
}

