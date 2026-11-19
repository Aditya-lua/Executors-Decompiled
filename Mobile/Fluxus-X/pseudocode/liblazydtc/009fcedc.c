/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fcedc
 */

size_t BIO_ctrl_wpending(BIO *b)

{
  ulong uVar1;
  
  uVar1 = BIO_ctrl(b,0xd,0,(void *)0x0);
  return uVar1 & ((long)uVar1 >> 0x3f ^ 0xffffffffffffffffU);
}

