/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009685e4
 */

long FUN_009685e4(long *param_1,long param_2)

{
  long lVar1;
  
  lVar1 = param_2 + 0x5f8;
  if (((*(uint *)(*param_1 + 8) ^ 0xffffffff) & 10) != 0) {
    lVar1 = param_2 + 0x530;
  }
  return lVar1;
}

