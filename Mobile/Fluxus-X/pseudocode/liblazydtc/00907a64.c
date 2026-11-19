/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00907a64
 */

void FUN_00907a64(long *param_1,undefined8 param_2,undefined8 param_3)

{
  long lVar1;
  ushort uVar2;
  undefined4 uVar3;
  byte bVar4;
  long lVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  long *plVar9;
  byte local_80 [4];
  ushort auStack_7c [18];
  byte local_58 [20];
  uint uStack_44;
  byte abStack_40 [8];
  long local_38;
  
  lVar5 = tpidr_el0;
  local_38 = *(long *)(lVar5 + 0x28);
  abStack_40[0] = 0;
  abStack_40[1] = 0;
  abStack_40[2] = 0;
  abStack_40[3] = 0;
  abStack_40[4] = 0;
  abStack_40[5] = 0;
  abStack_40[6] = 0;
  abStack_40[7] = 0;
  stack0xffffffffffffffb8 = 0;
  local_58[8] = 0;
  local_58[9] = 0;
  local_58[10] = 0;
  local_58[0xb] = 0;
  local_58[0xc] = 0;
  local_58[0xd] = 0;
  local_58[0xe] = 0;
  local_58[0xf] = 0;
  local_58[0] = 0;
  local_58[1] = 0;
  local_58[2] = 0;
  local_58[3] = 0;
  local_58[4] = 0;
  local_58[5] = 0;
  local_58[6] = 0;
  local_58[7] = 0;
  auStack_7c[10] = 0;
  auStack_7c[0xb] = 0;
  auStack_7c[0xc] = 0;
  auStack_7c[0xd] = 0;
  auStack_7c[0xe] = 0;
  auStack_7c[0xf] = 0;
  auStack_7c[0x10] = 0;
  auStack_7c[0x11] = 0;
  auStack_7c[2] = 0;
  auStack_7c[3] = 0;
  auStack_7c[4] = 0;
  auStack_7c[5] = 0;
  auStack_7c[6] = 0;
  auStack_7c[7] = 0;
  auStack_7c[8] = 0;
  auStack_7c[9] = 0;
  _local_80 = 0;
  do {
    plVar9 = param_1;
    if (plVar9 == (long *)0x0) goto LAB_00907b54;
    bVar4 = *(byte *)((long)plVar9 + 0x24);
  } while ((((bVar4 & 1) == 0) && (param_1 = (long *)plVar9[1], param_1 != (long *)0x0)) &&
          ((*(byte *)((long)param_1 + 0x24) & 1) == 0));
  while ((bVar4 >> 1 & 1) != 0) {
    plVar9 = (long *)plVar9[1];
    if (plVar9 == (long *)0x0) goto LAB_00907b54;
    bVar4 = *(byte *)((long)plVar9 + 0x24);
  }
  do {
    (**(code **)(*plVar9 + 0x38))(plVar9,param_2,local_58);
    plVar9 = (long *)plVar9[1];
  } while (plVar9 != (long *)0x0);
  if (uStack_44 == 0) {
LAB_00907b54:
    uVar6 = 0;
  }
  else {
    uVar8 = (ulong)uStack_44;
    uVar7 = 0;
    uVar6 = 0;
    do {
      uVar2 = abStack_40[uVar7] & 1 | (abStack_40[uVar7] >> 1 & 1) << 2;
      if (uVar2 != 0) {
        uVar3 = *(undefined4 *)(abStack_40 + uVar7 * 4 + -0x18);
        lVar1 = uVar6 * 8;
        uVar6 = (ulong)((int)uVar6 + 1);
        *(ushort *)(abStack_40 + lVar1 + -0x3c) = uVar2;
        *(undefined4 *)(abStack_40 + lVar1 + -0x40) = uVar3;
      }
      uVar7 = uVar7 + 1;
    } while (uVar7 < uVar8);
  }
  FUN_0093475c(local_80,uVar6,param_3);
  if (*(long *)(lVar5 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

