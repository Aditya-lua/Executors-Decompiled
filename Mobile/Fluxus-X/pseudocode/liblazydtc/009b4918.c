/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b4918
 */

uint SSL_read_ex(void)

{
  uint uVar1;
  
  uVar1 = ssl_read_internal();
  return uVar1 & ((int)uVar1 >> 0x1f ^ 0xffffffffU);
}

