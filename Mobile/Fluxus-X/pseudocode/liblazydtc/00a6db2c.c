/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6db2c
 */

long FUN_00a6db2c(int *param_1,int param_2)

{
  long lVar1;
  int iVar2;
  int iVar3;
  EVP_PKEY_ASN1_METHOD *pEVar4;
  long lVar5;
  ENGINE *local_28;
  
  pEVar4 = EVP_PKEY_asn1_find(&local_28,*param_1);
  if (pEVar4 == (EVP_PKEY_ASN1_METHOD *)0x0) {
    iVar3 = 0;
  }
  else {
    iVar3 = *(int *)pEVar4;
  }
  iVar2 = ENGINE_finish(local_28);
  if (iVar3 == param_2) {
    lVar5 = evp_pkey_get_legacy(param_1);
    if (lVar5 != 0) {
      iVar3 = ossl_ecx_key_up_ref();
      lVar1 = 0;
      if (iVar3 != 0) {
        lVar1 = lVar5;
      }
      return lVar1;
    }
  }
  else {
    ERR_new(iVar2);
    ERR_set_debug("crypto/evp/p_lib.c",0x371,"evp_pkey_get0_ECX_KEY");
    ERR_set_error(6,0xdb,0);
  }
  return 0;
}

