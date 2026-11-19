/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b7bd4
 */

void FUN_008b7bd4(long param_1,undefined1 *param_2,long param_3,ulong param_4,long *param_5)

{
  long *plVar1;
  int iVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  
  lVar8 = *(long *)(param_1 + 0x60);
  if (*(code **)(lVar8 + 0x650) != (code *)0x0) {
    (**(code **)(lVar8 + 0x650))();
  }
  if ((param_3 - 1U < 0x400) && (lVar4 = (long)(char)(&DAT_00d1f6d8)[param_3], -1 < lVar4)) {
    *param_2 = 0;
    lVar3 = *(long *)(param_1 + 0x60);
    lVar6 = param_5[5];
    lVar5 = lVar3 + 0x1f0;
    if ((lVar6 == 0) && ((int)param_5[6] < 0)) {
      lVar7 = *(long *)(lVar5 + lVar4 * 8);
      param_5[3] = lVar7;
      if (lVar7 != 0) {
        *(long **)(lVar7 + 0x10) = param_5;
      }
      *(long **)(lVar5 + lVar4 * 8) = param_5;
    }
    iVar2 = *(int *)((long)param_5 + 0x34);
    *(long *)(param_2 + 8) = lVar6;
    param_5[5] = (long)param_2;
    iVar2 = iVar2 + -1;
    *(int *)((long)param_5 + 0x34) = iVar2;
    if (iVar2 == 0) {
      lVar6 = param_5[2];
      lVar7 = param_5[3];
      if (lVar7 != 0) {
        *(long *)(lVar7 + 0x10) = lVar6;
      }
      if (lVar6 == 0) {
        if (*(long **)(lVar5 + lVar4 * 8) == param_5) {
          *(long *)(lVar5 + lVar4 * 8) = lVar7;
        }
      }
      else {
        *(long *)(lVar6 + 0x18) = lVar7;
      }
      lVar4 = *param_5;
      plVar1 = (long *)param_5[1];
      lVar5 = *(long *)(param_1 + 0x60);
      if (plVar1 != (long *)0x0) {
        *plVar1 = lVar4;
      }
      if (lVar4 == 0) {
        if (*(long **)(lVar3 + 0x330) == param_5) {
          *(long **)(lVar3 + 0x330) = plVar1;
        }
      }
      else {
        *(long **)(lVar4 + 8) = plVar1;
      }
      (**(code **)(lVar5 + 0x48))(*(undefined8 *)(lVar5 + 0x50),param_5,(long)(int)param_5[4],0);
    }
  }
  else {
    lVar4 = *param_5;
    plVar1 = (long *)param_5[1];
    lVar5 = *(long *)(param_1 + 0x60);
    if (plVar1 != (long *)0x0) {
      *plVar1 = lVar4;
    }
    if (lVar4 == 0) {
      if (*(long **)(lVar8 + 0x330) == param_5) {
        *(long **)(lVar8 + 0x330) = plVar1;
      }
    }
    else {
      *(long **)(lVar4 + 8) = plVar1;
    }
    (**(code **)(lVar5 + 0x48))(*(undefined8 *)(lVar5 + 0x50),param_5,(long)(int)param_5[4],0);
  }
  lVar4 = lVar8 + (param_4 & 0xff) * 8;
  lVar5 = *(long *)(lVar4 + 0x3848);
  *(long *)(lVar8 + 0x10) = *(long *)(lVar8 + 0x10) - param_3;
  *(long *)(lVar4 + 0x3848) = lVar5 - param_3;
  return;
}

