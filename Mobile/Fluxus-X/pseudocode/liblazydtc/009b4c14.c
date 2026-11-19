/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b4c14
 */

uint SSL_peek_ex(void)

{
  uint uVar1;
  
  uVar1 = FUN_009b4b24();
  return uVar1 & ((int)uVar1 >> 0x1f ^ 0xffffffffU);
}

