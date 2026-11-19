/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b7d74
 */

void FUN_008b7d74(long param_1,undefined1 *param_2,long param_3,ulong param_4,long *param_5)

{
  long lVar1;
  long *plVar2;
  int iVar3;
  long lVar4;
  uint uVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  
  lVar8 = *(long *)(param_1 + 0x60);
  if (*(code **)(lVar8 + 0x650) != (code *)0x0) {
    (**(code **)(lVar8 + 0x650))();
  }
  if (param_3 - 1U < 0x400) {
    uVar5 = (uint)(char)(&DAT_00d1f6d8)[param_3];
  }
  else {
    uVar5 = 0xffffffff;
  }
  *param_2 = 0;
  lVar4 = *(long *)(param_1 + 0x60);
  lVar6 = param_5[5];
  lVar1 = lVar4 + 0x1f0;
  if ((lVar6 == 0) && ((int)param_5[6] < 0)) {
    lVar7 = *(long *)(lVar1 + (long)(int)uVar5 * 8);
    param_5[3] = lVar7;
    if (lVar7 != 0) {
      *(long **)(lVar7 + 0x10) = param_5;
    }
    *(long **)(lVar1 + (long)(int)uVar5 * 8) = param_5;
  }
  iVar3 = *(int *)((long)param_5 + 0x34);
  *(long *)(param_2 + 8) = lVar6;
  param_5[5] = (long)param_2;
  iVar3 = iVar3 + -1;
  *(int *)((long)param_5 + 0x34) = iVar3;
  if (iVar3 == 0) {
    lVar6 = param_5[2];
    lVar7 = param_5[3];
    if (lVar7 != 0) {
      *(long *)(lVar7 + 0x10) = lVar6;
    }
    if (lVar6 == 0) {
      if (*(long **)(lVar1 + (ulong)(uVar5 & 0xff) * 8) == param_5) {
        *(long *)(lVar1 + (ulong)(uVar5 & 0xff) * 8) = lVar7;
      }
    }
    else {
      *(long *)(lVar6 + 0x18) = lVar7;
    }
    lVar1 = *param_5;
    plVar2 = (long *)param_5[1];
    lVar6 = *(long *)(param_1 + 0x60);
    if (plVar2 != (long *)0x0) {
      *plVar2 = lVar1;
    }
    if (lVar1 == 0) {
      if (*(long **)(lVar4 + 0x330) == param_5) {
        *(long **)(lVar4 + 0x330) = plVar2;
      }
    }
    else {
      *(long **)(lVar1 + 8) = plVar2;
    }
    (**(code **)(lVar6 + 0x48))(*(undefined8 *)(lVar6 + 0x50),param_5,(long)(int)param_5[4],0);
  }
  lVar1 = lVar8 + (param_4 & 0xff) * 8;
  lVar4 = *(long *)(lVar1 + 0x3848);
  *(long *)(lVar8 + 0x10) = *(long *)(lVar8 + 0x10) - param_3;
  *(long *)(lVar1 + 0x3848) = lVar4 - param_3;
  return;
}

