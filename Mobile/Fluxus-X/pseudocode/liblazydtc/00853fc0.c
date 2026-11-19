/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00853fc0
 */

void FUN_00853fc0(undefined4 *param_1,long *param_2)

{
  uint uVar1;
  uint uVar2;
  int iVar3;
  int iVar4;
  undefined4 uVar5;
  long lVar6;
  ulong uVar7;
  long lVar8;
  long lVar9;
  char cVar10;
  ulong uVar11;
  ulong uVar12;
  uint uVar13;
  undefined8 local_30;
  long local_28;
  
  lVar8 = tpidr_el0;
  local_28 = *(long *)(lVar8 + 0x28);
  iVar4 = (int)param_2[2];
  uVar5 = *(undefined4 *)((long)param_2 + 0x14);
  lVar9 = param_2[3];
  lVar6 = *param_2;
  uVar7 = param_2[1];
  uVar1 = iVar4 + 2;
  uVar11 = (ulong)uVar1;
  local_30 = CONCAT44(iVar4 - (int)lVar9,uVar5);
  *(uint *)(param_2 + 2) = uVar1;
  if ((uVar11 < uVar7) && (*(char *)(lVar6 + uVar11) == '[')) {
    uVar12 = (ulong)(iVar4 + 3U);
    *(uint *)(param_2 + 2) = iVar4 + 3U;
    if (uVar12 < uVar7) {
      uVar13 = 0;
      do {
        cVar10 = *(char *)(lVar6 + uVar12);
        if (cVar10 != '=') goto LAB_00854054;
        iVar3 = iVar4 + uVar13;
        uVar13 = uVar13 + 1;
        uVar2 = iVar3 + 4;
        uVar12 = (ulong)uVar2;
        *(uint *)(param_2 + 2) = uVar2;
      } while (uVar12 < uVar7);
      cVar10 = '\0';
LAB_00854054:
      uVar12 = (ulong)(iVar4 + uVar13 + 3);
      if (cVar10 != '[') {
        uVar13 = ~uVar13;
      }
      if (-1 < (int)uVar13) {
        FUN_0085411c(param_2,&local_30,uVar13,0x11b,0x11f);
        goto LAB_008540f8;
      }
    }
    uVar13 = (uint)uVar12;
    if (uVar12 < uVar7) goto LAB_00854090;
  }
  else {
    uVar12 = uVar11;
    uVar13 = uVar1;
    if (uVar11 < uVar7) {
LAB_00854090:
      do {
        uVar13 = (uint)uVar12;
        if (*(byte *)(lVar6 + uVar12) < 0xe &&
            (1 << (ulong)(*(byte *)(lVar6 + uVar12) & 0x1f) & 0x2401U) != 0) break;
        uVar13 = (uint)uVar12 + 1;
        *(uint *)(param_2 + 2) = uVar13;
        uVar12 = (ulong)uVar13;
      } while (uVar13 < uVar7);
    }
  }
  *(undefined8 *)(param_1 + 1) = local_30;
  param_1[5] = uVar13 - uVar1;
  *param_1 = 0x11a;
  *(ulong *)(param_1 + 3) = CONCAT44(uVar13 - (int)lVar9,uVar5);
  *(ulong *)(param_1 + 6) = lVar6 + uVar11;
LAB_008540f8:
  if (*(long *)(lVar8 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

