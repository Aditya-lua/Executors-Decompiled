/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad07ac
 */

void RSA_blinding_off(RSA *rsa)

{
  uint uVar1;
  
  BN_BLINDING_free((BN_BLINDING *)rsa[1].engine);
  uVar1 = *(uint *)((long)&rsa->mt_blinding + 4);
  rsa[1].engine = (ENGINE *)0x0;
  *(uint *)((long)&rsa->mt_blinding + 4) = uVar1 & 0xfffffff7 | 0x80;
  return;
}

