/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f07ec
 */

EVP_PKEY_ASN1_METHOD * EVP_PKEY_asn1_new(int id,int flags,char *pem_str,char *info)

{
  EVP_PKEY_ASN1_METHOD *ptr;
  char *pcVar1;
  
  ptr = (EVP_PKEY_ASN1_METHOD *)CRYPTO_zalloc(0x140,"crypto/asn1/ameth_lib.c",0xdf);
  if (ptr == (EVP_PKEY_ASN1_METHOD *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/asn1/ameth_lib.c",0xe2,"EVP_PKEY_asn1_new");
    ERR_set_error(0xd,0xc0100,0);
    return (EVP_PKEY_ASN1_METHOD *)0x0;
  }
  *(int *)ptr = id;
  *(int *)(ptr + 4) = id;
  *(long *)(ptr + 8) = (long)(int)(flags | 2);
  if (info != (char *)0x0) {
    pcVar1 = CRYPTO_strdup(info,"crypto/asn1/ameth_lib.c",0xeb);
    *(char **)(ptr + 0x18) = pcVar1;
    if (pcVar1 == (char *)0x0) goto LAB_009f087c;
  }
  if (pem_str == (char *)0x0) {
    return ptr;
  }
  pcVar1 = CRYPTO_strdup(pem_str,"crypto/asn1/ameth_lib.c",0xf1);
  *(char **)(ptr + 0x10) = pcVar1;
  if (pcVar1 != (char *)0x0) {
    return ptr;
  }
LAB_009f087c:
  if (((byte)ptr[8] >> 1 & 1) != 0) {
    CRYPTO_free(*(void **)(ptr + 0x10));
    CRYPTO_free(*(void **)(ptr + 0x18));
    CRYPTO_free(ptr);
  }
  ERR_new();
  ERR_set_debug("crypto/asn1/ameth_lib.c",0xfa,"EVP_PKEY_asn1_new");
  ERR_set_error(0xd,0xc0100,0);
  return (EVP_PKEY_ASN1_METHOD *)0x0;
}

