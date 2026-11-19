/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad7a58
 */

undefined8 FUN_00ad7a58(long param_1)

{
  int iVar1;
  int iVar2;
  uint uVar3;
  RSA *rsa;
  undefined8 uVar4;
  long lVar5;
  int local_3c;
  undefined8 local_38;
  undefined8 local_28;
  
  if (**(int **)(param_1 + 0x78) != 0x390) {
    return 0;
  }
  lVar5 = *(long *)(param_1 + 0x98);
  rsa = (RSA *)EVP_PKEY_get0_RSA(*(undefined8 *)(param_1 + 0x88));
  if (rsa->_method_mod_p != (BN_MONT_CTX *)0x0) {
    uVar4 = ossl_rsa_pss_get_param(rsa->_method_mod_p,&local_28,&local_38,&local_3c);
    if ((int)uVar4 == 0) {
      return uVar4;
    }
    iVar1 = RSA_size(rsa);
    iVar2 = EVP_MD_get_size(local_28);
    uVar3 = RSA_bits(rsa);
    if ((int)((iVar1 - iVar2) - (uint)((uVar3 & 7) == 1)) < local_3c) {
      ERR_new();
      ERR_set_debug("crypto/rsa/rsa_pmeth.c",0x357,"pkey_pss_init");
      ERR_set_error(4,0x96,0);
      return 0;
    }
    *(int *)(lVar5 + 0x30) = local_3c;
    *(int *)(lVar5 + 0x34) = local_3c;
    *(undefined8 *)(lVar5 + 0x20) = local_28;
    *(undefined8 *)(lVar5 + 0x28) = local_38;
  }
  return 1;
}

