/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fceb8
 */

size_t BIO_ctrl_pending(BIO *b)

{
  ulong uVar1;
  
  uVar1 = BIO_ctrl(b,10,0,(void *)0x0);
  return uVar1 & ((long)uVar1 >> 0x3f ^ 0xffffffffffffffffU);
}

