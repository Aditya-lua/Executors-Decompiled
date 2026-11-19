/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a12bc0
 */

undefined8
CTLOG_new_from_base64_ex
          (long *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,undefined8 param_5
          )

{
  void *ptr;
  int iVar1;
  EVP_PKEY *pkey;
  long lVar2;
  undefined8 uVar3;
  void *local_50;
  void *local_48;
  
  local_48 = (void *)0x0;
  if (param_1 == (long *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ct/ct_b64.c",0x91,"CTLOG_new_from_base64_ex");
    uVar3 = 0x80106;
  }
  else {
    iVar1 = FUN_00a12a9c(param_2,&local_48);
    ptr = local_48;
    if (iVar1 < 0) {
      ERR_new();
      uVar3 = 0x97;
    }
    else {
      local_50 = local_48;
      pkey = (EVP_PKEY *)d2i_PUBKEY_ex(0,&local_50,(long)iVar1,param_4,param_5);
      CRYPTO_free(ptr);
      if (pkey != (EVP_PKEY *)0x0) {
        lVar2 = CTLOG_new_ex(pkey,param_3,param_4,param_5);
        *param_1 = lVar2;
        if (lVar2 == 0) {
          EVP_PKEY_free(pkey);
          return 0;
        }
        return 1;
      }
      ERR_new();
      uVar3 = 0x9f;
    }
    ERR_set_debug("crypto/ct/ct_b64.c",uVar3,"CTLOG_new_from_base64_ex");
    uVar3 = 0x6e;
  }
  ERR_set_error(0x32,uVar3,0);
  return 0;
}

