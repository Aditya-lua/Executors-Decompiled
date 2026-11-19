/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c3fe10
 */

BN_BLINDING * RSA_setup_blinding(RSA *rsa,BN_CTX *ctx)

{
  BN_BLINDING *pBVar1;
  
  pBVar1 = RSA_setup_blinding(rsa,ctx);
  return pBVar1;
}

