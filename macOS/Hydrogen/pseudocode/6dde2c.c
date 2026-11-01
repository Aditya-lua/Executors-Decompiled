
undefined8 FUN_006dde2c(void)

{
  int iVar1;
  int iVar2;
  ulong uVar3;
  long *in_x9;
  ulong in_x10;
  long lVar4;
  long in_x11;
  long in_x12;
  ulong in_x13;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  long unaff_x19;
  long unaff_x20;
  
  if (in_x10 != in_x13) {
    uVar5 = 0;
    uVar6 = *(long *)(unaff_x20 + 200) - 1;
    uVar7 = in_x10 >> 4 ^ in_x10 >> 9;
    do {
      uVar7 = uVar7 & uVar6;
      uVar3 = *(ulong *)(*(long *)(unaff_x20 + 0xc0) + uVar7 * 0x10);
      if (uVar3 == in_x10) {
        lVar4 = *(long *)(unaff_x20 + 0xc0) + uVar7 * 0x10;
        goto LAB_006dde80;
      }
      if (uVar3 == in_x13) break;
      uVar5 = uVar5 + 1;
      uVar7 = uVar5 + uVar7;
    } while (uVar5 <= uVar6);
  }
  lVar4 = 0;
LAB_006dde80:
  uVar5 = *(ulong *)(unaff_x19 + 0x28);
  if (uVar5 != in_x9[3]) {
    uVar7 = 0;
    uVar6 = uVar5 >> 4 ^ uVar5 >> 9;
    do {
      uVar6 = uVar6 & in_x9[1] - 1U;
      uVar3 = *(ulong *)(*in_x9 + uVar6 * 0x10);
      if (uVar3 == uVar5) {
        if (lVar4 == 0) {
          return 0;
        }
        iVar1 = *(int *)(in_x11 + in_x12 * 0x10 + 8);
        if ((iVar1 != 8) && (iVar2 = *(int *)(*in_x9 + uVar6 * 0x10 + 8), iVar2 != 8)) {
          if (iVar1 != 2) {
            return 0;
          }
          if (iVar2 != 2) {
            return 0;
          }
        }
        func_0x006de830();
        return 0;
      }
      uVar7 = uVar7 + 1;
      uVar6 = uVar7 + uVar6;
    } while (uVar3 != in_x9[3] && uVar7 <= in_x9[1] - 1U);
  }
  return 0;
}

