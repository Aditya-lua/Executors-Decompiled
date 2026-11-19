/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a74a28
 */

undefined8 EVP_PKEY_fromdata(byte *param_1,long *param_2,undefined4 param_3,undefined8 param_4)

{
  undefined8 uVar1;
  EVP_PKEY *pEVar2;
  long lVar3;
  EVP_PKEY *pkey;
  
  if ((param_1 == (byte *)0x0) || ((*param_1 >> 3 & 1) == 0)) {
    ERR_new();
    ERR_set_debug("crypto/evp/pmeth_gn.c",0x172,"EVP_PKEY_fromdata");
    ERR_set_error(6,0x96,0);
    uVar1 = 0xfffffffe;
  }
  else if (param_2 == (long *)0x0) {
    uVar1 = 0xffffffff;
  }
  else {
    pEVar2 = (EVP_PKEY *)*param_2;
    if (pEVar2 == (EVP_PKEY *)0x0) {
      pEVar2 = EVP_PKEY_new();
      *param_2 = (long)pEVar2;
      pkey = pEVar2;
      if (pEVar2 == (EVP_PKEY *)0x0) {
        ERR_new();
        ERR_set_debug("crypto/evp/pmeth_gn.c",0x17d,"EVP_PKEY_fromdata");
        ERR_set_error(6,0xc0100,0);
        return 0xffffffff;
      }
    }
    else {
      pkey = (EVP_PKEY *)0x0;
    }
    lVar3 = evp_keymgmt_util_fromdata(pEVar2,*(undefined8 *)(param_1 + 0x20),param_3,param_4);
    if (lVar3 == 0) {
      if (pkey != (EVP_PKEY *)0x0) {
        *param_2 = 0;
        EVP_PKEY_free(pkey);
      }
      uVar1 = 0;
    }
    else {
      uVar1 = 1;
    }
  }
  return uVar1;
}

