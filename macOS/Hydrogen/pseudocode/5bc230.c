
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_005bc230(long param_1,int *param_2,undefined8 *param_3)

{
  long lVar1;
  long in_x10;
  ulong in_x11;
  ulong uVar2;
  long in_x13;
  long *plVar3;
  ulong uVar4;
  long lVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  
  uVar2 = in_x11 & 0x3fffffffffffff8;
  lVar1 = in_x13 + uVar2;
  plVar3 = (long *)(param_1 + in_x13 * 8 + 0x20);
  uVar4 = uVar2;
  lVar5 = _UNK_007fc2d0;
  lVar6 = _UNK_007fc2d8;
  do {
    lVar7 = in_x10 + lVar5 * 0x40;
    lVar8 = in_x10 + lVar6 * 0x40;
    plVar3[-3] = lVar8;
    plVar3[-4] = lVar7;
    plVar3[-1] = lVar8 + 0x80;
    plVar3[-2] = lVar7 + 0x80;
    plVar3[1] = lVar8 + 0x100;
    *plVar3 = lVar7 + 0x100;
    plVar3[3] = lVar8 + 0x180;
    plVar3[2] = lVar7 + 0x180;
    lVar5 = lVar5 + 8;
    lVar6 = lVar6 + 8;
    uVar4 = uVar4 - 8;
    plVar3 = plVar3 + 8;
  } while (uVar4 != 0);
  if (in_x11 != uVar2) {
    lVar6 = in_x11 - uVar2;
    lVar5 = in_x10 + uVar2 * 0x40;
    do {
      *(long *)(param_1 + lVar1 * 8) = lVar5;
      lVar1 = lVar1 + 1;
      lVar5 = lVar5 + 0x40;
      lVar6 = lVar6 + -1;
    } while (lVar6 != 0);
  }
  param_3[1] = lVar1;
  if (*param_2 != 1) {
    *(undefined8 *)*param_3 = param_3[1];
    return;
  }
  plVar3 = (long *)*param_3;
  lVar1 = param_3[1];
  if (*(long *)(param_2 + 2) != 0) {
    *(long *)(param_3[2] + lVar1 * 8) = *(long *)(param_2 + 2);
    lVar1 = lVar1 + 1;
  }
  *plVar3 = lVar1;
  return;
}

