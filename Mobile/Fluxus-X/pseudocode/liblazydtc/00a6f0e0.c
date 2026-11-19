/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a6f0e0
 */

int evp_pkey_free_legacy(int *param_1)

{
  int iVar1;
  EVP_PKEY_ASN1_METHOD *pEVar2;
  ENGINE *local_18;
  
  pEVar2 = *(EVP_PKEY_ASN1_METHOD **)(param_1 + 2);
  local_18 = (ENGINE *)0x0;
  if ((pEVar2 != (EVP_PKEY_ASN1_METHOD *)0x0) ||
     ((*(long *)(param_1 + 10) != 0 &&
      (pEVar2 = EVP_PKEY_asn1_find(&local_18,*param_1), pEVar2 != (EVP_PKEY_ASN1_METHOD *)0x0)))) {
    if (*(long *)(param_1 + 10) != 0) {
      *(long *)(param_1 + 8) = *(long *)(param_1 + 10);
      param_1[10] = 0;
      param_1[0xb] = 0;
    }
    if (*(code **)(pEVar2 + 0xa8) != (code *)0x0) {
      (**(code **)(pEVar2 + 0xa8))(param_1);
    }
    param_1[8] = 0;
    param_1[9] = 0;
  }
  ENGINE_finish(local_18);
  ENGINE_finish(*(ENGINE **)(param_1 + 4));
  param_1[4] = 0;
  param_1[5] = 0;
  iVar1 = ENGINE_finish(*(ENGINE **)(param_1 + 6));
  param_1[6] = 0;
  param_1[7] = 0;
  return iVar1;
}

