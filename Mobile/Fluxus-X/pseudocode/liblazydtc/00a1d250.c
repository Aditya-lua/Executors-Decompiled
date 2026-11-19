/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1d250
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

BN_RECP_CTX * BN_RECP_CTX_new(void)

{
  BN_RECP_CTX *pBVar1;
  
  pBVar1 = (BN_RECP_CTX *)CRYPTO_zalloc(0x40,"crypto/bn/bn_recp.c",0x18);
  if (pBVar1 == (BN_RECP_CTX *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/bn/bn_recp.c",0x19,"BN_RECP_CTX_new");
    ERR_set_error(3,0xc0100,0);
  }
  else {
    bn_init(pBVar1);
    bn_init(&pBVar1->Nr);
    pBVar1->flags = 1;
  }
  return pBVar1;
}

