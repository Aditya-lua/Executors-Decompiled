
void FUN_005fc428(ulong param_1)

{
  ulong uVar1;
  long *plVar2;
  ulong in_x9;
  long lVar3;
  ulong *puVar4;
  ulong *puVar5;
  ulong in_x12;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  ulong unaff_x20;
  long unaff_x21;
  long unaff_x25;
  long unaff_x26;
  long unaff_x27;
  
  puVar4 = (ulong *)(unaff_x21 + unaff_x25 * 8 + 8);
  puVar5 = (ulong *)(unaff_x27 + unaff_x20 * 8 + 8);
  do {
    uVar6 = puVar5[-1];
    uVar7 = puVar4[-1];
    uVar8 = (ulong)CARRY8(uVar7 + uVar6,in_x12);
    puVar5[-1] = uVar7 + uVar6 + in_x12;
    uVar1 = *puVar4 + *puVar5;
    in_x12 = (ulong)(CARRY8(uVar1,uVar8) || CARRY8(uVar1 + uVar8,(ulong)CARRY8(uVar7,uVar6)));
    if (CARRY8(*puVar4,*puVar5)) {
      in_x12 = in_x12 + 1;
    }
    *puVar5 = uVar1 + uVar8 + (ulong)CARRY8(uVar7,uVar6);
    in_x9 = in_x9 + 2;
    puVar4 = puVar4 + 2;
    puVar5 = puVar5 + 2;
  } while (in_x9 < param_1);
  if (in_x12 != 0) {
    plVar2 = (long *)(unaff_x27 + unaff_x26 * 8);
    lVar3 = *plVar2;
    *plVar2 = lVar3 + 1;
    if ((1 < unaff_x20) && (lVar3 == -1)) {
      uVar1 = 2;
      uVar6 = 1;
      do {
        uVar7 = uVar1;
        lVar3 = plVar2[uVar6];
        plVar2[uVar6] = lVar3 + 1;
        uVar1 = (ulong)((int)uVar7 + 1);
        uVar6 = uVar7;
      } while ((lVar3 == -1 && uVar7 <= unaff_x20) && (lVar3 != -1 || unaff_x20 != uVar7));
    }
  }
  return;
}

