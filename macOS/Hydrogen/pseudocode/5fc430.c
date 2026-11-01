
void FUN_005fc430(ulong param_1)

{
  ulong uVar1;
  long *plVar2;
  ulong in_x9;
  long lVar3;
  ulong *in_x10;
  ulong *puVar4;
  ulong in_x12;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  ulong unaff_x20;
  long unaff_x26;
  long unaff_x27;
  
  puVar4 = (ulong *)(unaff_x27 + unaff_x20 * 8 + 8);
  do {
    uVar5 = puVar4[-1];
    uVar6 = in_x10[-1];
    uVar7 = (ulong)CARRY8(uVar6 + uVar5,in_x12);
    puVar4[-1] = uVar6 + uVar5 + in_x12;
    uVar1 = *in_x10 + *puVar4;
    in_x12 = (ulong)(CARRY8(uVar1,uVar7) || CARRY8(uVar1 + uVar7,(ulong)CARRY8(uVar6,uVar5)));
    if (CARRY8(*in_x10,*puVar4)) {
      in_x12 = in_x12 + 1;
    }
    *puVar4 = uVar1 + uVar7 + (ulong)CARRY8(uVar6,uVar5);
    in_x9 = in_x9 + 2;
    in_x10 = in_x10 + 2;
    puVar4 = puVar4 + 2;
  } while (in_x9 < param_1);
  if (in_x12 != 0) {
    plVar2 = (long *)(unaff_x27 + unaff_x26 * 8);
    lVar3 = *plVar2;
    *plVar2 = lVar3 + 1;
    if ((1 < unaff_x20) && (lVar3 == -1)) {
      uVar1 = 2;
      uVar5 = 1;
      do {
        uVar6 = uVar1;
        lVar3 = plVar2[uVar5];
        plVar2[uVar5] = lVar3 + 1;
        uVar1 = (ulong)((int)uVar6 + 1);
        uVar5 = uVar6;
      } while ((lVar3 == -1 && uVar6 <= unaff_x20) && (lVar3 != -1 || unaff_x20 != uVar6));
    }
  }
  return;
}

