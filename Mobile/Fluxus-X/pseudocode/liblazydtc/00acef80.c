/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00acef80
 */

RSA * RSAPrivateKey_dup(RSA *rsa)

{
  RSA *pRVar1;
  
  pRVar1 = ASN1_item_dup((ASN1_ITEM *)&DAT_00c7ce48,rsa);
  return pRVar1;
}

