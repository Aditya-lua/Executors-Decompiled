/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad07e4
 */

int RSA_blinding_on(RSA *rsa,BN_CTX *ctx)

{
  uint uVar1;
  BN_BLINDING *pBVar2;
  
  if ((BN_BLINDING *)rsa[1].engine != (BN_BLINDING *)0x0) {
    BN_BLINDING_free((BN_BLINDING *)rsa[1].engine);
    uVar1 = *(uint *)((long)&rsa->mt_blinding + 4);
    rsa[1].engine = (ENGINE *)0x0;
    *(uint *)((long)&rsa->mt_blinding + 4) = uVar1 & 0xfffffff7 | 0x80;
  }
  pBVar2 = RSA_setup_blinding(rsa,ctx);
  rsa[1].engine = (ENGINE *)pBVar2;
  if (pBVar2 != (BN_BLINDING *)0x0) {
    *(uint *)((long)&rsa->mt_blinding + 4) = *(uint *)((long)&rsa->mt_blinding + 4) & 0xffffff7f | 8
    ;
  }
  return (int)(pBVar2 != (BN_BLINDING *)0x0);
}

