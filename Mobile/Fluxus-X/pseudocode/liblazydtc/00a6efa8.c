/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6efa8
 */

EVP_PKEY * EVP_PKEY_dup(int *param_1)

{
  int iVar1;
  EVP_PKEY *pkey;
  long lVar2;
  code *pcVar3;
  
  if (param_1 == (int *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/evp/p_lib.c",0x68d,"EVP_PKEY_dup");
    ERR_set_error(6,0xc0102,0);
    return (EVP_PKEY *)0x0;
  }
  pkey = EVP_PKEY_new();
  if (pkey == (EVP_PKEY *)0x0) {
    return (EVP_PKEY *)0x0;
  }
  if (*param_1 == 0) {
    if (*(long *)(param_1 + 0x18) != 0) goto LAB_00a6f034;
  }
  else {
    if (*(long *)(param_1 + 0x18) == 0) {
      if ((*(long *)(param_1 + 2) == 0) ||
         (pcVar3 = *(code **)(*(long *)(param_1 + 2) + 0x130), pcVar3 == (code *)0x0)) {
        if ((*(long *)(param_1 + 8) != 0) ||
           (iVar1 = FUN_00a6d2f4(pkey,0,*param_1,0,0xffffffff,0), iVar1 == 0)) {
          ERR_new();
          ERR_set_debug("crypto/evp/p_lib.c",0x6a5,"EVP_PKEY_dup");
          ERR_set_error(6,0xe0,0);
          goto LAB_00a6f0c4;
        }
        goto LAB_00a6f048;
      }
      iVar1 = (*pcVar3)(pkey,param_1);
    }
    else {
LAB_00a6f034:
      iVar1 = evp_keymgmt_util_copy(pkey,param_1,0x87);
    }
    if (iVar1 == 0) goto LAB_00a6f0c4;
  }
LAB_00a6f048:
  iVar1 = CRYPTO_dup_ex_data(0x11,(CRYPTO_EX_DATA *)&pkey[1].engine,
                             (CRYPTO_EX_DATA *)(param_1 + 0x14));
  if (iVar1 != 0) {
    if (*(long *)(param_1 + 0x10) == 0) {
      return pkey;
    }
    lVar2 = ossl_x509at_dup();
    *(long *)&pkey[1].references = lVar2;
    if (lVar2 != 0) {
      return pkey;
    }
  }
LAB_00a6f0c4:
  EVP_PKEY_free(pkey);
  return (EVP_PKEY *)0x0;
}

