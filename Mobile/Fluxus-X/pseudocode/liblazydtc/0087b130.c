/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0087b130
 */

void FUN_0087b130(ulong *param_1,ulong *param_2,ulong *param_3,ulong *param_4,ulong *param_5)

{
  uint uVar1;
  uint uVar2;
  ulong uVar3;
  ulong uVar4;
  
  uVar1 = (uint)*param_2;
  uVar2 = (uint)*param_3;
  uVar3 = (ulong)uVar2;
  if (uVar1 < (uint)*param_1) {
    uVar4 = *param_1;
    if (uVar2 < uVar1) {
      *param_1 = *param_3;
    }
    else {
      *param_1 = *param_2;
      *param_2 = uVar4;
      uVar3 = (ulong)(uint)*param_3;
      if ((uint)uVar4 <= (uint)*param_3) goto LAB_0087b1c4;
      *param_2 = *param_3;
    }
    uVar3 = uVar4 & 0xffffffff;
    *param_3 = uVar4;
  }
  else if (uVar2 < uVar1) {
    uVar3 = *param_2;
    *param_2 = *param_3;
    *param_3 = uVar3;
    if ((uint)*param_2 < (uint)*param_1) {
      uVar3 = *param_1;
      *param_1 = *param_2;
      *param_2 = uVar3;
      uVar3 = (ulong)(uint)*param_3;
    }
  }
LAB_0087b1c4:
  if ((uint)*param_4 < (uint)uVar3) {
    uVar3 = *param_3;
    *param_3 = *param_4;
    *param_4 = uVar3;
    if ((uint)*param_3 < (uint)*param_2) {
      uVar3 = *param_2;
      *param_2 = *param_3;
      *param_3 = uVar3;
      if ((uint)*param_2 < (uint)*param_1) {
        uVar3 = *param_1;
        *param_1 = *param_2;
        *param_2 = uVar3;
      }
    }
  }
  if ((uint)*param_5 < (uint)*param_4) {
    uVar3 = *param_4;
    *param_4 = *param_5;
    *param_5 = uVar3;
    if ((uint)*param_4 < (uint)*param_3) {
      uVar3 = *param_3;
      *param_3 = *param_4;
      *param_4 = uVar3;
      if ((uint)*param_3 < (uint)*param_2) {
        uVar3 = *param_2;
        *param_2 = *param_3;
        *param_3 = uVar3;
        if ((uint)*param_2 < (uint)*param_1) {
          uVar3 = *param_1;
          *param_1 = *param_2;
          *param_2 = uVar3;
        }
      }
    }
  }
  return;
}

