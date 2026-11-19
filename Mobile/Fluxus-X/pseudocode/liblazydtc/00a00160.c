/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a00160
 */

uint BIO_closesocket(int param_1)

{
  uint uVar1;
  
  if (param_1 < 0) {
    return 0;
  }
  uVar1 = close(param_1);
  return uVar1 >> 0x1f ^ 1;
}

