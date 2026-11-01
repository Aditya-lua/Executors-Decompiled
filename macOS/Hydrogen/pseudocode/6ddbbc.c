
/* WARNING: Removing unreachable block (ram,0x006ddc00) */

undefined8 FUN_006ddbbc(ulong param_1)

{
  int iVar1;
  long lVar2;
  ulong in_x9;
  ulong in_x10;
  long lVar3;
  long in_x11;
  long in_x12;
  ulong uVar4;
  long *plVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  long unaff_x19;
  long unaff_x20;
  
  uVar4 = param_1 >> 4 ^ param_1 >> 9;
  do {
    uVar4 = uVar4 & in_x12 - 1U;
    uVar6 = *(ulong *)(in_x11 + uVar4 * 0x10);
    if (uVar6 == param_1) {
      lVar2 = in_x11 + uVar4 * 0x10;
      plVar5 = *(long **)(unaff_x20 + 0x18);
      lVar3 = plVar5[2];
      goto joined_r0x006ddc78;
    }
    if (uVar6 == in_x9) break;
    in_x10 = in_x10 + 1;
    uVar4 = in_x10 + uVar4;
  } while (in_x10 <= in_x12 - 1U);
  lVar2 = 0;
  plVar5 = *(long **)(unaff_x20 + 0x18);
  lVar3 = plVar5[2];
joined_r0x006ddc78:
  if (lVar3 != 0) {
    uVar4 = *(ulong *)(unaff_x19 + 0x20);
    if (uVar4 != plVar5[3]) {
      uVar6 = 0;
      uVar7 = uVar4 >> 4 ^ uVar4 >> 9;
      do {
        uVar7 = uVar7 & plVar5[1] - 1U;
        uVar8 = *(ulong *)(*plVar5 + uVar7 * 0x10);
        if (uVar8 == uVar4) {
          if (lVar2 == 0) {
            return 0;
          }
          iVar1 = *(int *)(*plVar5 + uVar7 * 0x10 + 8);
          if ((iVar1 == 2) || (iVar1 == 8)) {
            func_0x006de830();
            return 0;
          }
          return 0;
        }
        uVar6 = uVar6 + 1;
        uVar7 = uVar6 + uVar7;
      } while (uVar8 != plVar5[3] && uVar6 <= plVar5[1] - 1U);
    }
  }
  return 0;
}

