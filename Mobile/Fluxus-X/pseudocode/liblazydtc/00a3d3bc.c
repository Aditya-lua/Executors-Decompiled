/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a3d3bc
 */

undefined8 FUN_00a3d3bc(undefined8 param_1,EVP_PKEY_CTX *param_2,int param_3)

{
  int iVar1;
  EVP_PKEY *pkey;
  void *key;
  undefined4 uVar2;
  
  pkey = EVP_PKEY_CTX_get0_pkey(param_2);
  if ((param_3 == 0x43f) || (param_3 == 0x40a)) {
    uVar2 = 0;
    if (param_3 != 0x40a) {
      uVar2 = 2;
    }
  }
  else {
    uVar2 = 3;
    if (param_3 == 0x40b) {
      uVar2 = 1;
    }
  }
  key = (void *)ossl_ecx_key_new(*(undefined8 *)(param_2 + 8),uVar2,0,
                                 *(undefined8 *)(param_2 + 0x10));
  if (key == (void *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/ec/ecx_meth.c",0x18b,"ecx_generic_import_from");
    ERR_set_error(5,0xc0100,0);
  }
  else {
    iVar1 = ossl_ecx_key_fromdata(key,param_1,1);
    if ((iVar1 != 0) && (iVar1 = EVP_PKEY_assign(pkey,param_3,key), iVar1 != 0)) {
      return 1;
    }
    ossl_ecx_key_free(key);
  }
  return 0;
}

