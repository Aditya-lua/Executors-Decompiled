/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008998dc
 */

void FUN_008998dc(long param_1,long param_2,long *param_3,long *param_4)

{
  uint uVar1;
  int iVar2;
  byte bVar3;
  long lVar4;
  undefined8 *puVar5;
  int *piVar6;
  int *piVar7;
  int *piVar8;
  uint uVar9;
  ulong uVar10;
  uint uVar11;
  long lVar12;
  ulong uVar13;
  undefined **local_b8;
  long lStack_b0;
  ulong local_a8 [9];
  
  lVar4 = tpidr_el0;
  local_a8[8] = *(long *)(lVar4 + 0x28);
  local_b8 = &PTR_LAB_00c4b520;
  piVar8 = (int *)*param_3;
  piVar6 = (int *)param_3[1];
  local_a8[1] = 0;
  local_a8[0] = 0;
  local_a8[3] = 0;
  local_a8[2] = 0;
  local_a8[5] = 0;
  local_a8[4] = 0;
  local_a8[7] = 0;
  local_a8[6] = 0;
  lStack_b0 = param_1;
  if (piVar6 == piVar8) {
    uVar10 = 0;
    if (piVar6 == piVar8) goto LAB_00899a70;
  }
  else {
    lVar12 = 0;
    uVar13 = 0;
    piVar7 = piVar8;
    do {
      if (*(int *)((long)piVar8 + lVar12) == 0) {
        if (uVar13 < (ulong)param_4[1]) {
          puVar5 = *(undefined8 **)(*param_4 + uVar13 * 8);
          (**(code **)*puVar5)(puVar5,&local_b8);
          piVar7 = (int *)*param_3;
          piVar6 = (int *)param_3[1];
        }
        bVar3 = *(byte *)((long)piVar8 + lVar12 + 4);
        uVar10 = (ulong)(bVar3 >> 3) & 0x18;
        *(ulong *)((long)local_a8 + uVar10 + 0x20) =
             1L << ((ulong)bVar3 & 0x3f) | *(ulong *)((long)local_a8 + uVar10 + 0x20);
        piVar8 = piVar7;
      }
      uVar13 = uVar13 + 1;
      lVar12 = lVar12 + 0x38;
      uVar10 = ((long)piVar6 - (long)piVar8 >> 3) * 0x6db6db6db6db6db7;
    } while (uVar13 < uVar10);
    if (piVar6 == piVar8) goto LAB_00899a70;
  }
  lVar12 = 0;
  uVar13 = 0;
  do {
    if ((*(int *)((long)piVar8 + lVar12) != 0) && (uVar13 < (ulong)param_4[1])) {
      puVar5 = *(undefined8 **)(*param_4 + uVar13 * 8);
      (**(code **)*puVar5)(puVar5,&local_b8);
      piVar8 = (int *)*param_3;
      piVar6 = (int *)param_3[1];
    }
    uVar13 = uVar13 + 1;
    lVar12 = lVar12 + 0x38;
    uVar10 = ((long)piVar6 - (long)piVar8 >> 3) * 0x6db6db6db6db6db7;
  } while (uVar13 < uVar10);
LAB_00899a70:
  if (uVar10 < (ulong)param_4[1]) {
    do {
      puVar5 = *(undefined8 **)(*param_4 + uVar10 * 8);
      (**(code **)*puVar5)(puVar5,&local_b8);
      uVar10 = uVar10 + 1;
    } while (uVar10 < (ulong)param_4[1]);
    piVar8 = (int *)*param_3;
    piVar6 = (int *)param_3[1];
  }
  bVar3 = DAT_00d1ec80;
  if (piVar8 != piVar6) {
    piVar7 = piVar8;
    do {
      iVar2 = *piVar7;
      if (iVar2 - 3U < 3 || (iVar2 == 6 & bVar3) != 0) {
        uVar10 = (ulong)(*(byte *)(piVar7 + 1) >> 6);
        uVar13 = 1L << ((ulong)*(byte *)(piVar7 + 1) & 0x3f);
        if ((uVar13 & local_a8[uVar10 + 4]) != 0) {
          local_a8[uVar10] = local_a8[uVar10] | uVar13;
        }
        if (iVar2 == 5) {
          uVar10 = (ulong)(*(byte *)((long)piVar7 + 6) >> 6);
          uVar13 = 1L << ((ulong)*(byte *)((long)piVar7 + 6) & 0x3f);
          if ((uVar13 & local_a8[uVar10 + 4]) != 0) {
            local_a8[uVar10] = local_a8[uVar10] | uVar13;
          }
        }
      }
      piVar7 = piVar7 + 0xe;
    } while (piVar7 != piVar6);
    uVar11 = *(uint *)(param_1 + 0x64c);
    uVar9 = *(uint *)(param_1 + 0x650);
    do {
      if ((*piVar8 == 0) &&
         ((local_a8[*(byte *)(piVar8 + 1) >> 6] >> ((ulong)*(byte *)(piVar8 + 1) & 0x3f) & 1) != 0))
      {
        uVar1 = uVar11 + 1;
        if (0xff < uVar1) {
          if (*(long *)(lVar4 + 0x28) == local_a8[8]) {
                    /* WARNING: Subroutine does not return */
            FUN_0087fcd8(param_2 + 0xc,
                         "Out of registers when trying to allocate %d registers: exceeded limit %d",
                         1,0xff);
          }
          goto LAB_00899c08;
        }
        *(char *)(piVar8 + 0xc) = (char)uVar11;
        if (uVar9 <= uVar1) {
          uVar9 = uVar1;
        }
        *(uint *)(param_1 + 0x64c) = uVar1;
        *(uint *)(param_1 + 0x650) = uVar9;
        uVar11 = uVar1;
      }
      piVar8 = piVar8 + 0xe;
    } while (piVar8 != piVar6);
  }
  if (*(long *)(lVar4 + 0x28) == local_a8[8]) {
    return;
  }
LAB_00899c08:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

