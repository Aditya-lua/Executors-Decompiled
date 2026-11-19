/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b4eb4
 */

uint SSL_write_ex(void)

{
  uint uVar1;
  
  uVar1 = ssl_write_internal();
  return uVar1 & ((int)uVar1 >> 0x1f ^ 0xffffffffU);
}

