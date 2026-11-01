
/* WARNING: Removing unreachable block (ram,0x006de090) */

undefined8 FUN_006de034(long param_1)

{
  long lVar1;
  ulong uVar2;
  long *in_x10;
  ulong uVar3;
  int *piVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  long unaff_x19;
  
  uVar3 = *(ulong *)(unaff_x19 + 0x30);
  uVar2 = in_x10[3];
  if (uVar3 == uVar2) {
    uVar3 = *(ulong *)(unaff_x19 + 0x40);
  }
  else {
    uVar5 = 0;
    uVar6 = uVar3 >> 4 ^ uVar3 >> 9;
    do {
      uVar6 = uVar6 & in_x10[1] - 1U;
      uVar7 = *(ulong *)(*in_x10 + uVar6 * 0x10);
      if (uVar7 == uVar3) {
        lVar1 = *in_x10 + uVar6 * 0x10;
        piVar4 = (int *)0x0;
        if (lVar1 != 0) {
          piVar4 = (int *)(lVar1 + 8);
        }
        uVar3 = *(ulong *)(unaff_x19 + 0x40);
        if (uVar3 == uVar2) {
          return 0;
        }
        goto LAB_006de0d4;
      }
      if (uVar7 == uVar2) break;
      uVar5 = uVar5 + 1;
      uVar6 = uVar5 + uVar6;
    } while (uVar5 <= in_x10[1] - 1U);
    uVar3 = *(ulong *)(unaff_x19 + 0x40);
  }
  piVar4 = (int *)0x0;
  if (uVar3 != uVar2) {
LAB_006de0d4:
    uVar5 = 0;
    uVar6 = uVar3 >> 4 ^ uVar3 >> 9;
    do {
      uVar6 = uVar6 & in_x10[1] - 1U;
      uVar7 = *(ulong *)(*in_x10 + uVar6 * 0x10);
      if (uVar7 == uVar3) {
        if (param_1 == 0) {
          return 0;
        }
        if (piVar4 == (int *)0x0) {
          return 0;
        }
        if (*piVar4 == *(int *)(*in_x10 + uVar6 * 0x10 + 8)) {
          func_0x006de830();
          return 0;
        }
        return 0;
      }
      uVar5 = uVar5 + 1;
      uVar6 = uVar5 + uVar6;
    } while (uVar7 != uVar2 && uVar5 <= in_x10[1] - 1U);
  }
  return 0;
}

