/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b274c
 */

undefined8 SSL_add1_host(long param_1,char *param_2)

{
  ASN1_OCTET_STRING *a;
  void *ptr;
  undefined8 uVar1;
  
  if ((param_2 == (char *)0x0) || (a = a2i_IPADDRESS(param_2), a == (ASN1_OCTET_STRING *)0x0)) {
    uVar1 = X509_VERIFY_PARAM_add1_host(*(undefined8 *)(param_1 + 0x4d8),param_2,0);
    return uVar1;
  }
  ASN1_OCTET_STRING_free(a);
  ptr = (void *)X509_VERIFY_PARAM_get1_ip_asc(*(undefined8 *)(param_1 + 0x4d8));
  if (ptr == (void *)0x0) {
    uVar1 = X509_VERIFY_PARAM_set1_ip_asc(*(undefined8 *)(param_1 + 0x4d8),param_2);
    return uVar1;
  }
  CRYPTO_free(ptr);
  return 0;
}

