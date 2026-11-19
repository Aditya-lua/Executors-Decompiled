/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009685c0
 */

long FUN_009685c0(long *param_1)

{
  long lVar1;
  
  lVar1 = param_1[3] + 800;
  if (((*(uint *)(*param_1 + 8) ^ 0xffffffff) & 10) != 0) {
    lVar1 = param_1[3] + 0x2a0;
  }
  return lVar1;
}

