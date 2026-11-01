
void FUN_005fc438(ulong param_1)

{
  ulong uVar1;
  long *plVar2;
  ulong in_x9;
  long lVar3;
  ulong *in_x10;
  ulong *in_x11;
  ulong in_x12;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  ulong unaff_x20;
  long unaff_x26;
  long unaff_x27;
  
  do {
    uVar4 = in_x11[-1];
    uVar5 = in_x10[-1];
    uVar6 = (ulong)CARRY8(uVar5 + uVar4,in_x12);
    in_x11[-1] = uVar5 + uVar4 + in_x12;
    uVar1 = *in_x10 + *in_x11;
    in_x12 = (ulong)(CARRY8(uVar1,uVar6) || CARRY8(uVar1 + uVar6,(ulong)CARRY8(uVar5,uVar4)));
    if (CARRY8(*in_x10,*in_x11)) {
      in_x12 = in_x12 + 1;
    }
    *in_x11 = uVar1 + uVar6 + (ulong)CARRY8(uVar5,uVar4);
    in_x9 = in_x9 + 2;
    in_x10 = in_x10 + 2;
    in_x11 = in_x11 + 2;
  } while (in_x9 < param_1);
  if (in_x12 != 0) {
    plVar2 = (long *)(unaff_x27 + unaff_x26 * 8);
    lVar3 = *plVar2;
    *plVar2 = lVar3 + 1;
    if ((1 < unaff_x20) && (lVar3 == -1)) {
      uVar1 = 2;
      uVar4 = 1;
      do {
        uVar5 = uVar1;
        lVar3 = plVar2[uVar4];
        plVar2[uVar4] = lVar3 + 1;
        uVar1 = (ulong)((int)uVar5 + 1);
        uVar4 = uVar5;
      } while ((lVar3 == -1 && uVar5 <= unaff_x20) && (lVar3 != -1 || unaff_x20 != uVar5));
    }
  }
  return;
}

