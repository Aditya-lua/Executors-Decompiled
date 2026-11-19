/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a03a7c
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

BN_CTX * BN_CTX_new(void)

{
  BN_CTX *pBVar1;
  
  pBVar1 = (BN_CTX *)CRYPTO_zalloc(0x48,"crypto/bn/bn_ctx.c",0x7a);
  if (pBVar1 == (BN_CTX *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/bn/bn_ctx.c",0x7b,"BN_CTX_new_ex");
    ERR_set_error(3,0xc0100,0);
    return (BN_CTX *)0x0;
  }
  *(undefined8 *)(pBVar1 + 0x18) = 0;
  *(undefined8 *)(pBVar1 + 0x10) = 0;
  *(undefined8 *)(pBVar1 + 0x28) = 0;
  *(undefined8 *)(pBVar1 + 0x20) = 0;
  *(undefined8 *)(pBVar1 + 8) = 0;
  *(undefined8 *)pBVar1 = 0;
  *(undefined8 *)(pBVar1 + 0x40) = 0;
  return pBVar1;
}

