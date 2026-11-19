/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a85330
 */

undefined8 ossl_cmp_asn1_octet_string_set1(long *param_1,ASN1_STRING *param_2)

{
  ASN1_STRING *a;
  ASN1_STRING *pAVar1;
  undefined8 uVar2;
  
  if (param_1 == (long *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/cmp/cmp_util.c",0xf8,"ossl_cmp_asn1_octet_string_set1");
    ERR_set_error(0x3a,0x67,0);
    uVar2 = 0;
  }
  else {
    a = (ASN1_STRING *)*param_1;
    if (a != param_2) {
      if (param_2 == (ASN1_STRING *)0x0) {
        pAVar1 = (ASN1_STRING *)0x0;
      }
      else {
        pAVar1 = ASN1_OCTET_STRING_dup(param_2);
        if (pAVar1 == (ASN1_STRING *)0x0) {
          return 0;
        }
        a = (ASN1_STRING *)*param_1;
      }
      ASN1_OCTET_STRING_free(a);
      *param_1 = (long)pAVar1;
    }
    uVar2 = 1;
  }
  return uVar2;
}

