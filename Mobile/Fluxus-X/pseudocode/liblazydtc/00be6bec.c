/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00be6bec
 */

long * FUN_00be6bec(long *param_1,long param_2,long param_3,long param_4,long param_5,
                   undefined4 param_6)

{
  ulong uVar1;
  undefined4 *puVar2;
  ulong uVar3;
  long lVar4;
  undefined4 *puVar5;
  ulong uVar6;
  ulong uVar7;
  undefined8 *puVar8;
  ulong uVar9;
  long lVar10;
  ulong local_68;
  ulong local_60;
  undefined4 *local_58;
  
  if (param_1 == (long *)0x0) {
    return (long *)0x0;
  }
  lVar4 = param_4 - param_2 >> 2;
  lVar10 = param_3 - param_2 >> 2;
  uVar3 = *(long *)(param_5 + 0x18) - lVar4;
  uVar1 = uVar3;
  if (uVar3 == 0 || *(long *)(param_5 + 0x18) < lVar4) {
    uVar1 = 0;
  }
  if ((0 < lVar10) &&
     (lVar4 = (**(code **)(*param_1 + 0x60))(param_1,param_2,lVar10), lVar4 != lVar10)) {
    return (long *)0x0;
  }
  if ((long)uVar1 < 1) goto LAB_00be6d5c;
  if (0x3ffffffffffffff7 < uVar1) {
                    /* WARNING: Subroutine does not return */
    FUN_00bc5610();
  }
  if (uVar1 < 5) {
    puVar2 = (undefined4 *)((ulong)&local_68 | 4);
    local_68 = CONCAT71(local_68._1_7_,(char)((int)uVar1 << 1));
  }
  else {
    uVar6 = 8;
    if ((uVar1 | 1) != 5) {
      uVar6 = (uVar1 | 1) + 1;
    }
    puVar2 = operator_new(uVar6 << 2);
    local_68 = uVar6 | 1;
    local_60 = uVar1;
    local_58 = puVar2;
  }
  puVar5 = puVar2;
  uVar6 = uVar3;
  if (uVar3 < 8) {
LAB_00be6cf8:
    do {
      uVar6 = uVar6 - 1;
      *puVar5 = param_6;
      puVar5 = puVar5 + 1;
    } while (uVar6 != 0);
  }
  else {
    uVar7 = uVar3 & 0xfffffffffffffff8;
    uVar6 = uVar3 & 7;
    puVar8 = (undefined8 *)(puVar2 + 4);
    uVar9 = uVar7;
    do {
      uVar9 = uVar9 - 8;
      puVar8[-1] = CONCAT44(param_6,param_6);
      puVar8[-2] = CONCAT44(param_6,param_6);
      puVar8[1] = CONCAT44(param_6,param_6);
      *puVar8 = CONCAT44(param_6,param_6);
      puVar8 = puVar8 + 4;
    } while (uVar9 != 0);
    puVar5 = puVar2 + uVar7;
    if (uVar3 != uVar7) goto LAB_00be6cf8;
  }
  puVar2[uVar1] = 0;
  puVar2 = (undefined4 *)((ulong)&local_68 | 4);
  if ((local_68 & 1) != 0) {
    puVar2 = local_58;
  }
                    /* try { // try from 00be6d28 to 00be6d33 has its CatchHandler @ 00be6dc0 */
  uVar3 = (**(code **)(*param_1 + 0x60))(param_1,puVar2,uVar1);
  if ((local_68 & 1) != 0) {
    operator_delete(local_58,(local_68 & 0x3ffffffffffffffe) << 2);
  }
  if (uVar3 != uVar1) {
    return (long *)0x0;
  }
LAB_00be6d5c:
  lVar4 = param_4 - param_3 >> 2;
  if ((lVar4 < 1) ||
     (lVar10 = (**(code **)(*param_1 + 0x60))(param_1,param_3,lVar4), lVar10 == lVar4)) {
    *(undefined8 *)(param_5 + 0x18) = 0;
    return param_1;
  }
  return (long *)0x0;
}

