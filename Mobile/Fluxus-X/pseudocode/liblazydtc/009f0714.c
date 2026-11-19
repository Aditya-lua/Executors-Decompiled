/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f0714
 */

int EVP_PKEY_asn1_add_alias(int to,int from)

{
  int iVar1;
  EVP_PKEY_ASN1_METHOD *ameth;
  
  ameth = (EVP_PKEY_ASN1_METHOD *)CRYPTO_zalloc(0x140,"crypto/asn1/ameth_lib.c",0xdf);
  if (ameth == (EVP_PKEY_ASN1_METHOD *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/asn1/ameth_lib.c",0xe2,"EVP_PKEY_asn1_new");
    ERR_set_error(0xd,0xc0100,0);
  }
  else {
    *(undefined8 *)(ameth + 8) = 3;
    *(int *)ameth = from;
    *(int *)(ameth + 4) = to;
    iVar1 = EVP_PKEY_asn1_add0(ameth);
    if (iVar1 != 0) {
      return 1;
    }
    if (((byte)ameth[8] >> 1 & 1) == 0) {
      return 0;
    }
    CRYPTO_free(*(void **)(ameth + 0x10));
    CRYPTO_free(*(void **)(ameth + 0x18));
    CRYPTO_free(ameth);
  }
  return 0;
}

