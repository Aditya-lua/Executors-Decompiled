
/* WARNING: Removing unreachable block (ram,0x006ddc00) */

undefined8 FUN_006ddbf0(long param_1)

{
  int iVar1;
  undefined1 in_ZR;
  undefined1 in_CY;
  long lVar2;
  long in_x9;
  ulong in_x10;
  long lVar3;
  ulong uVar4;
  long in_x11;
  ulong in_x12;
  ulong uVar5;
  ulong in_x13;
  long *plVar6;
  ulong uVar7;
  ulong uVar8;
  long unaff_x19;
  long unaff_x20;
  
  while (!(bool)in_CY || (bool)in_ZR) {
    uVar4 = in_x13 & in_x12;
    lVar2 = *(long *)(in_x11 + uVar4 * 0x10);
    if (lVar2 == param_1) {
      lVar2 = in_x11 + uVar4 * 0x10;
      plVar6 = *(long **)(unaff_x20 + 0x18);
      lVar3 = plVar6[2];
      goto joined_r0x006ddc78;
    }
    if (lVar2 == in_x9) break;
    in_x10 = in_x10 + 1;
    in_x13 = in_x10 + uVar4;
    in_ZR = in_x10 == in_x12;
    in_CY = in_x12 <= in_x10;
  }
  lVar2 = 0;
  plVar6 = *(long **)(unaff_x20 + 0x18);
  lVar3 = plVar6[2];
joined_r0x006ddc78:
  if (lVar3 != 0) {
    uVar4 = *(ulong *)(unaff_x19 + 0x20);
    if (uVar4 != plVar6[3]) {
      uVar5 = 0;
      uVar7 = uVar4 >> 4 ^ uVar4 >> 9;
      do {
        uVar7 = uVar7 & plVar6[1] - 1U;
        uVar8 = *(ulong *)(*plVar6 + uVar7 * 0x10);
        if (uVar8 == uVar4) {
          if (lVar2 == 0) {
            return 0;
          }
          iVar1 = *(int *)(*plVar6 + uVar7 * 0x10 + 8);
          if ((iVar1 == 2) || (iVar1 == 8)) {
            func_0x006de830();
            return 0;
          }
          return 0;
        }
        uVar5 = uVar5 + 1;
        uVar7 = uVar5 + uVar7;
      } while (uVar8 != plVar6[3] && uVar5 <= plVar6[1] - 1U);
    }
  }
  return 0;
}

