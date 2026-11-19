/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b816c
 */

void FUN_008b816c(long param_1,undefined1 *param_2,long param_3,ulong param_4,long *param_5)

{
  long lVar1;
  long *plVar2;
  int iVar3;
  undefined8 uVar4;
  code *pcVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  long lVar9;
  long lVar10;
  long lVar11;
  
  lVar11 = *(long *)(param_1 + 0x60);
  if (*(code **)(lVar11 + 0x650) != (code *)0x0) {
    (**(code **)(lVar11 + 0x650))();
  }
  if ((*(uint *)((long)param_5 + 0x24) - 1 < 0x400) &&
     (lVar7 = (long)(char)(&DAT_00d1f6d8)[*(uint *)((long)param_5 + 0x24)], -1 < lVar7)) {
    *param_2 = 0;
    lVar6 = *(long *)(param_1 + 0x60);
    lVar9 = param_5[5];
    lVar8 = 0x3450;
    if (DAT_00d1f5f8 == '\0') {
      lVar8 = 0x1f0;
    }
    lVar1 = 0x3590;
    if (DAT_00d1f5f8 == '\0') {
      lVar1 = 0x330;
    }
    lVar8 = lVar6 + lVar8;
    if ((lVar9 == 0) && ((int)param_5[6] < 0)) {
      lVar10 = *(long *)(lVar8 + lVar7 * 8);
      param_5[3] = lVar10;
      if (lVar10 != 0) {
        *(long **)(lVar10 + 0x10) = param_5;
      }
      *(long **)(lVar8 + lVar7 * 8) = param_5;
    }
    iVar3 = *(int *)((long)param_5 + 0x34);
    *(long *)(param_2 + 8) = lVar9;
    param_5[5] = (long)param_2;
    iVar3 = iVar3 + -1;
    *(int *)((long)param_5 + 0x34) = iVar3;
    if (iVar3 != 0) goto LAB_008b82a0;
    lVar9 = param_5[2];
    lVar10 = param_5[3];
    if (lVar10 != 0) {
      *(long *)(lVar10 + 0x10) = lVar9;
    }
    if (lVar9 == 0) {
      if (*(long **)(lVar8 + lVar7 * 8) == param_5) {
        *(long *)(lVar8 + lVar7 * 8) = lVar10;
      }
    }
    else {
      *(long *)(lVar9 + 0x18) = lVar10;
    }
    lVar7 = *param_5;
    plVar2 = (long *)param_5[1];
    lVar8 = *(long *)(param_1 + 0x60);
    if (plVar2 != (long *)0x0) {
      *plVar2 = lVar7;
    }
    if (lVar7 == 0) {
      if (*(long **)(lVar6 + lVar1) == param_5) {
        *(long **)(lVar6 + lVar1) = plVar2;
      }
    }
    else {
      *(long **)(lVar7 + 8) = plVar2;
    }
    pcVar5 = *(code **)(lVar8 + 0x48);
    uVar4 = *(undefined8 *)(lVar8 + 0x50);
  }
  else {
    lVar8 = *param_5;
    plVar2 = (long *)param_5[1];
    lVar6 = *(long *)(param_1 + 0x60);
    lVar7 = 0x3590;
    if (DAT_00d1f5f8 == '\0') {
      lVar7 = 0x330;
    }
    if (plVar2 != (long *)0x0) {
      *plVar2 = lVar8;
    }
    if (lVar8 == 0) {
      if (*(long **)(lVar11 + lVar7) == param_5) {
        *(long **)(lVar11 + lVar7) = plVar2;
      }
    }
    else {
      *(long **)(lVar8 + 8) = plVar2;
    }
    pcVar5 = *(code **)(lVar6 + 0x48);
    uVar4 = *(undefined8 *)(lVar6 + 0x50);
  }
  (*pcVar5)(uVar4,param_5,(long)(int)param_5[4],0);
LAB_008b82a0:
  lVar7 = lVar11 + (param_4 & 0xff) * 8;
  lVar8 = *(long *)(lVar7 + 0x3848);
  *(long *)(lVar11 + 0x10) = *(long *)(lVar11 + 0x10) - param_3;
  *(long *)(lVar7 + 0x3848) = lVar8 - param_3;
  return;
}

