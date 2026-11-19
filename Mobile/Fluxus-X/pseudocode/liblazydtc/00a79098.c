/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a79098
 */

int FUN_00a79098(long param_1,EVP_PKEY *param_2)

{
  int iVar1;
  DSA *pDVar2;
  
  if (*(long *)(param_1 + 0x88) == 0) {
    ERR_new();
    ERR_set_debug("crypto/dsa/dsa_pmeth.c",0xf8,"pkey_dsa_keygen");
    ERR_set_error(10,0x6b,0);
  }
  else {
    pDVar2 = DSA_new();
    if (pDVar2 != (DSA *)0x0) {
      EVP_PKEY_assign(param_2,0x74,pDVar2);
      iVar1 = EVP_PKEY_copy_parameters(param_2,*(EVP_PKEY **)(param_1 + 0x88));
      if (iVar1 != 0) {
        pDVar2 = (DSA *)EVP_PKEY_get0_DSA(param_2);
        iVar1 = DSA_generate_key(pDVar2);
        return iVar1;
      }
    }
  }
  return 0;
}

