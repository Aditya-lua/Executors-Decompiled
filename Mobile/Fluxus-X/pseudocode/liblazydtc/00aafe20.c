/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aafe20
 */

undefined8 OCSP_resp_get1_id(long param_1,long *param_2,long *param_3)

{
  X509_NAME *pXVar1;
  ASN1_STRING *pAVar2;
  
  if (*(int *)(param_1 + 8) == 1) {
    pAVar2 = ASN1_OCTET_STRING_dup(*(ASN1_STRING **)(param_1 + 0x10));
    *param_2 = (long)pAVar2;
    *param_3 = 0;
    if (*param_2 == 0) {
      return 0;
    }
  }
  else {
    if (*(int *)(param_1 + 8) != 0) {
      return 0;
    }
    pXVar1 = X509_NAME_dup(*(X509_NAME **)(param_1 + 0x10));
    *param_3 = (long)pXVar1;
    *param_2 = 0;
    if (*param_3 == 0) {
      return 0;
    }
  }
  return 1;
}

