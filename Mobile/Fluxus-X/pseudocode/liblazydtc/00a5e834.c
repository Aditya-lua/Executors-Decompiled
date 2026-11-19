/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5e834
 */

int EVP_CIPHER_get_asn1_iv(EVP_CIPHER_CTX *c,ASN1_TYPE *type)

{
  uint max_len;
  uint uVar1;
  int iVar2;
  uchar auStack_40 [16];
  
  if (type == (ASN1_TYPE *)0x0) {
    max_len = 0;
  }
  else {
    max_len = EVP_CIPHER_CTX_get_iv_length();
    if (((0x10 < max_len) ||
        (uVar1 = ASN1_TYPE_get_octetstring(type,auStack_40,max_len), uVar1 != max_len)) ||
       (iVar2 = EVP_CipherInit_ex(c,(EVP_CIPHER *)0x0,(ENGINE *)0x0,(uchar *)0x0,auStack_40,-1),
       iVar2 == 0)) {
      max_len = 0xffffffff;
    }
  }
  return max_len;
}

