/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b833c
 */

void FUN_008b833c(long param_1,undefined1 *param_2,long param_3,byte param_4,long param_5)

{
  long lVar1;
  long lVar2;
  int iVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  
  lVar8 = *(long *)(param_1 + 0x60);
  if (*(code **)(lVar8 + 0x650) != (code *)0x0) {
    (**(code **)(lVar8 + 0x650))();
  }
  if ((*(uint *)(param_5 + 0x24) - 1 < 0x400) &&
     (lVar4 = (long)(char)(&DAT_00d1f6d8)[*(uint *)(param_5 + 0x24)], -1 < lVar4)) {
    *param_2 = 0;
    lVar5 = *(long *)(param_1 + 0x60);
    lVar6 = *(long *)(param_5 + 0x28);
    lVar1 = 0x3450;
    if (DAT_00d1f5f8 == '\0') {
      lVar1 = 0x4c8;
    }
    lVar1 = lVar5 + lVar1;
    lVar2 = 0x3590;
    if (DAT_00d1f5f8 == '\0') {
      lVar2 = 0x4b8;
    }
    if ((lVar6 == 0) && (*(int *)(param_5 + 0x30) < 0)) {
      lVar7 = *(long *)(lVar1 + lVar4 * 8);
      *(long *)(param_5 + 0x18) = lVar7;
      if (lVar7 != 0) {
        *(long *)(lVar7 + 0x10) = param_5;
      }
      *(long *)(lVar1 + lVar4 * 8) = param_5;
    }
    iVar3 = *(int *)(param_5 + 0x34);
    *(long *)(param_2 + 8) = lVar6;
    *(undefined1 **)(param_5 + 0x28) = param_2;
    iVar3 = iVar3 + -1;
    *(int *)(param_5 + 0x34) = iVar3;
    if (iVar3 != 0) goto LAB_008b8434;
    lVar6 = *(long *)(param_5 + 0x10);
    lVar7 = *(long *)(param_5 + 0x18);
    lVar5 = lVar5 + lVar2;
    if (lVar7 != 0) {
      *(long *)(lVar7 + 0x10) = lVar6;
    }
    if (lVar6 == 0) {
      if (*(long *)(lVar1 + lVar4 * 8) == param_5) {
        *(long *)(lVar1 + lVar4 * 8) = lVar7;
      }
    }
    else {
      *(long *)(lVar6 + 0x18) = lVar7;
    }
  }
  else {
    lVar5 = 0x3590;
    if (DAT_00d1f5f8 == '\0') {
      lVar5 = 0x4b8;
    }
    lVar5 = lVar8 + lVar5;
  }
  FUN_008b8010(param_1,lVar5,param_5);
LAB_008b8434:
  lVar4 = lVar8 + (ulong)param_4 * 8;
  lVar5 = *(long *)(lVar4 + 0x3848);
  *(long *)(lVar8 + 0x10) = *(long *)(lVar8 + 0x10) - param_3;
  *(long *)(lVar4 + 0x3848) = lVar5 - param_3;
  return;
}

