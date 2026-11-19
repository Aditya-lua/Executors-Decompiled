/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f2838
 */

EVP_PKEY * d2i_PrivateKey(int type,EVP_PKEY **a,uchar **pp,long length)

{
  EVP_PKEY *pEVar1;
  
  pEVar1 = (EVP_PKEY *)FUN_009f25b4();
  if (pEVar1 == (EVP_PKEY *)0x0) {
    pEVar1 = (EVP_PKEY *)ossl_d2i_PrivateKey_legacy(type,a,pp,length,0,0);
    return pEVar1;
  }
  return pEVar1;
}

