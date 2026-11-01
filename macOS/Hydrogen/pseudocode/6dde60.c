
undefined8 FUN_006dde60(void)

{
  int iVar1;
  int iVar2;
  undefined1 in_ZR;
  long *in_x9;
  long in_x10;
  long lVar3;
  long in_x11;
  long in_x12;
  long in_x13;
  ulong uVar4;
  ulong in_x14;
  long in_x15;
  ulong uVar5;
  ulong in_x16;
  ulong uVar6;
  ulong in_x17;
  ulong uVar7;
  long unaff_x19;
  
  while (!(bool)in_ZR) {
    in_x14 = in_x14 + 1;
    if (in_x16 < in_x14) break;
    in_x17 = in_x14 + in_x17 & in_x16;
    lVar3 = *(long *)(in_x15 + in_x17 * 0x10);
    if (lVar3 == in_x10) {
      lVar3 = in_x15 + in_x17 * 0x10;
      goto LAB_006dde80;
    }
    in_ZR = lVar3 == in_x13;
  }
  lVar3 = 0;
LAB_006dde80:
  uVar4 = *(ulong *)(unaff_x19 + 0x28);
  if (uVar4 != in_x9[3]) {
    uVar5 = 0;
    uVar6 = uVar4 >> 4 ^ uVar4 >> 9;
    do {
      uVar6 = uVar6 & in_x9[1] - 1U;
      uVar7 = *(ulong *)(*in_x9 + uVar6 * 0x10);
      if (uVar7 == uVar4) {
        if (lVar3 == 0) {
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
      uVar5 = uVar5 + 1;
      uVar6 = uVar5 + uVar6;
    } while (uVar7 != in_x9[3] && uVar5 <= in_x9[1] - 1U);
  }
  return 0;
}

