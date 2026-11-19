/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc184c
 */

void FUN_00bc184c(ulong *param_1,ulong *param_2,ushort *param_3)

{
  uint uVar1;
  uint uVar2;
  ulong uVar3;
  ulong uVar4;
  
  uVar2 = (int)param_2[1] + (uint)*param_3;
  uVar1 = *(uint *)(&DAT_00789b24 + (ulong)*param_3 * 4);
  *(uint *)(param_2 + 1) = uVar2;
  *param_1 = *param_2 >> ((ulong)-uVar2 & 0x3f) & (ulong)uVar1;
  if (uVar2 < 0x41) {
    uVar3 = param_2[2];
    if (uVar3 < param_2[4]) {
      uVar4 = param_2[3];
      if (uVar3 == uVar4) goto LAB_00bc18d8;
      uVar1 = (int)uVar3 - (int)uVar4;
      if (uVar4 <= uVar3 - (uVar2 >> 3)) {
        uVar1 = uVar2 >> 3;
      }
      uVar2 = uVar2 + uVar1 * -8;
    }
    else {
      uVar1 = uVar2 >> 3;
      uVar2 = uVar2 & 7;
    }
    param_2[2] = uVar3 - uVar1;
    uVar3 = *(ulong *)(uVar3 - uVar1);
    *(uint *)(param_2 + 1) = uVar2;
    *param_2 = uVar3;
  }
  else {
    param_2[2] = (ulong)&DAT_00789ba8;
  }
LAB_00bc18d8:
  param_1[1] = (ulong)(param_3 + 2);
  return;
}

