/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4c140
 */

uint ossl_curve448_scalar_decode(ulong *param_1,undefined8 param_2)

{
  ulong uVar1;
  ulong uVar2;
  
  FUN_00a4c270(param_1,param_2,0x38);
  uVar1 = (ulong)(0x2378c292ab5844f2 < *param_1) - 1;
  uVar1 = ((long)uVar1 >> 0x3f) + (ulong)CARRY8(uVar1,param_1[1]) + -1 +
          (ulong)(0x216cc2728dc58f54 < uVar1 + param_1[1]);
  uVar1 = ((long)uVar1 >> 0x3f) + (ulong)CARRY8(uVar1,param_1[2]) + -1 +
          (ulong)(0xc44edb49aed6368f < uVar1 + param_1[2]);
  uVar1 = ((long)uVar1 >> 0x3f) + (ulong)CARRY8(uVar1,param_1[3]) + -1 +
          (ulong)(0xffffffff7cca23e8 < uVar1 + param_1[3]);
  uVar1 = ((long)uVar1 >> 0x3f) + (ulong)CARRY8(uVar1,param_1[4]) + -1 +
          (ulong)(0xfffffffffffffffe < uVar1 + param_1[4]);
  uVar2 = param_1[6];
  uVar1 = ((long)uVar1 >> 0x3f) + (ulong)CARRY8(uVar1,param_1[5]) + -1 +
          (ulong)(0xfffffffffffffffe < uVar1 + param_1[5]);
  FUN_00a4bc44(param_1,param_1,ossl_curve448_scalar_one);
  FUN_00a4bc44(param_1,param_1,&DAT_00765ef0);
  return ~(uint)((long)((((long)uVar1 >> 0x3f) + (ulong)CARRY8(uVar1,uVar2) + 0xffffffff +
                         (ulong)(0x3ffffffffffffffe < uVar1 + uVar2) & 0xffffffff) - 1) >> 0x3f);
}

