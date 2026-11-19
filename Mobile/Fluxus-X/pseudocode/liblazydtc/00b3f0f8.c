/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b3f0f8
 */

ulong FUN_00b3f0f8(DH *param_1,uchar **param_2)

{
  int iVar1;
  uint uVar2;
  ulong uVar3;
  
  iVar1 = DH_test_flags(param_1,0x1000);
  if (iVar1 == 0) {
    uVar2 = i2d_DHparams(param_1,param_2);
    return (ulong)uVar2;
  }
  uVar3 = i2d_DHxparams(param_1,param_2);
  return uVar3;
}

