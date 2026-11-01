
void FUN_005fc460(ulong param_1)

{
  long *plVar1;
  byte in_CY;
  ulong in_x9;
  long lVar2;
  ulong *in_x10;
  ulong uVar3;
  ulong *in_x11;
  ulong in_x12;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  ulong in_x15;
  ulong in_x16;
  ulong in_x17;
  ulong unaff_x20;
  long unaff_x26;
  long unaff_x27;
  
  while( true ) {
    uVar6 = (ulong)(CARRY8(in_x17,in_x15) || CARRY8(in_x17 + in_x15,(ulong)in_CY));
    if (CARRY8(in_x16,in_x12)) {
      uVar6 = uVar6 + 1;
    }
    *in_x11 = in_x17 + in_x15 + (ulong)in_CY;
    in_x9 = in_x9 + 2;
    if (param_1 <= in_x9) break;
    uVar4 = in_x11[1];
    uVar5 = in_x10[-1];
    uVar3 = uVar5 + uVar4;
    in_x15 = (ulong)CARRY8(uVar3,uVar6);
    in_x11[1] = uVar3 + uVar6;
    in_x12 = in_x11[2];
    in_x16 = *in_x10;
    in_x17 = in_x16 + in_x12;
    in_CY = CARRY8(uVar5,uVar4);
    in_x10 = in_x10 + 2;
    in_x11 = in_x11 + 2;
  }
  if (uVar6 != 0) {
    plVar1 = (long *)(unaff_x27 + unaff_x26 * 8);
    lVar2 = *plVar1;
    *plVar1 = lVar2 + 1;
    if ((1 < unaff_x20) && (lVar2 == -1)) {
      uVar6 = 2;
      uVar3 = 1;
      do {
        uVar4 = uVar6;
        lVar2 = plVar1[uVar3];
        plVar1[uVar3] = lVar2 + 1;
        uVar6 = (ulong)((int)uVar4 + 1);
        uVar3 = uVar4;
      } while ((lVar2 == -1 && uVar4 <= unaff_x20) && (lVar2 != -1 || unaff_x20 != uVar4));
    }
  }
  return;
}

