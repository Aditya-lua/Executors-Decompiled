/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a60900
 */

char * EVP_PKEY_get0_type_name(EVP_PKEY *param_1)

{
  char *pcVar1;
  EVP_PKEY_ASN1_METHOD *ameth;
  char *local_18;
  
  local_18 = (char *)0x0;
  if (*(long *)&param_1[1].save_parameters == 0) {
    ameth = EVP_PKEY_get0_asn1(param_1);
    pcVar1 = (char *)0x0;
    if (ameth != (EVP_PKEY_ASN1_METHOD *)0x0) {
      EVP_PKEY_asn1_get0_info((int *)0x0,(int *)0x0,(int *)0x0,(char **)0x0,&local_18,ameth);
      pcVar1 = local_18;
    }
  }
  else {
    pcVar1 = (char *)EVP_KEYMGMT_get0_name(*(long *)&param_1[1].save_parameters);
  }
  return pcVar1;
}

