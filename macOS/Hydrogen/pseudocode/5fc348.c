
void FUN_005fc348(void)

{
  long *plVar1;
  bool in_ZR;
  bool in_CY;
  ulong uVar2;
  long lVar3;
  ulong uVar4;
  ulong *puVar5;
  ulong *puVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  ulong unaff_x19;
  ulong unaff_x20;
  long unaff_x21;
  long unaff_x24;
  long unaff_x25;
  long in_stack_00000010;
  
  if (in_CY && !in_ZR) {
    uVar2 = unaff_x20;
    do {
      func_0x005fb3a8(in_stack_00000010 + unaff_x24);
      unaff_x24 = unaff_x24 + unaff_x20 * 0x10;
      uVar2 = uVar2 + unaff_x25;
    } while (uVar2 < unaff_x19);
  }
  if (unaff_x19 != unaff_x20) {
    uVar7 = 0;
    uVar2 = 0;
    puVar5 = (ulong *)(unaff_x21 + unaff_x25 * 8 + 8);
    puVar6 = (ulong *)(in_stack_00000010 + unaff_x20 * 8 + 8);
    do {
      uVar8 = puVar6[-1];
      uVar9 = puVar5[-1];
      uVar10 = (ulong)CARRY8(uVar9 + uVar8,uVar7);
      puVar6[-1] = uVar9 + uVar8 + uVar7;
      uVar4 = *puVar5 + *puVar6;
      uVar7 = (ulong)(CARRY8(uVar4,uVar10) || CARRY8(uVar4 + uVar10,(ulong)CARRY8(uVar9,uVar8)));
      if (CARRY8(*puVar5,*puVar6)) {
        uVar7 = uVar7 + 1;
      }
      *puVar6 = uVar4 + uVar10 + (ulong)CARRY8(uVar9,uVar8);
      uVar2 = uVar2 + 2;
      puVar5 = puVar5 + 2;
      puVar6 = puVar6 + 2;
    } while (uVar2 < unaff_x19 - unaff_x20);
    if (uVar7 != 0) {
      plVar1 = (long *)(in_stack_00000010 + unaff_x19 * 8);
      lVar3 = *plVar1;
      *plVar1 = lVar3 + 1;
      if ((1 < unaff_x20) && (lVar3 == -1)) {
        uVar2 = 2;
        uVar7 = 1;
        do {
          uVar4 = uVar2;
          lVar3 = plVar1[uVar7];
          plVar1[uVar7] = lVar3 + 1;
          uVar2 = (ulong)((int)uVar4 + 1);
          uVar7 = uVar4;
        } while ((lVar3 == -1 && uVar4 <= unaff_x20) && (lVar3 != -1 || unaff_x20 != uVar4));
      }
    }
  }
  return;
}

