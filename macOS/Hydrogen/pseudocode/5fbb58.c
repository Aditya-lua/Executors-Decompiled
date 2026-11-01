
void FUN_005fbb58(ulong param_1)

{
  ulong *puVar1;
  ulong *puVar2;
  byte in_CY;
  ulong in_x9;
  ulong uVar3;
  ulong uVar4;
  ulong in_x10;
  ulong *in_x11;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  ulong in_x14;
  ulong uVar8;
  ulong uVar9;
  long unaff_x19;
  ulong unaff_x20;
  long unaff_x24;
  
  while( true ) {
    uVar6 = (ulong)in_CY;
    if (CARRY8(in_x9,in_x14)) {
      uVar6 = uVar6 + 1;
    }
    in_x11[1] = in_x10;
    param_1 = param_1 + 2;
    if (unaff_x20 <= param_1) break;
    in_x11 = (ulong *)(unaff_x24 + param_1 * 8);
    puVar1 = (ulong *)(unaff_x19 + param_1 * 8);
    uVar5 = *puVar1;
    uVar3 = *in_x11;
    in_x14 = in_x11[1];
    uVar8 = (ulong)CARRY8(uVar5 + uVar3,uVar6);
    *in_x11 = uVar5 + uVar3 + uVar6;
    in_x9 = puVar1[1];
    uVar6 = in_x9 + in_x14;
    in_CY = CARRY8(uVar6,uVar8) || CARRY8(uVar6 + uVar8,(ulong)CARRY8(uVar5,uVar3));
    in_x10 = uVar6 + uVar8 + (ulong)CARRY8(uVar5,uVar3);
  }
  func_0x005fba78();
  uVar3 = 0;
  uVar6 = 0;
  do {
    puVar1 = (ulong *)(unaff_x24 + uVar6 * 8);
    puVar2 = (ulong *)(unaff_x19 + uVar6 * 8);
    uVar7 = *puVar2;
    uVar8 = *puVar1;
    uVar9 = (ulong)CARRY8(uVar7 + uVar8,uVar3);
    *puVar1 = uVar7 + uVar8 + uVar3;
    uVar4 = puVar2[1];
    uVar5 = uVar4 + puVar1[1];
    uVar3 = (ulong)(CARRY8(uVar5,uVar9) || CARRY8(uVar5 + uVar9,(ulong)CARRY8(uVar7,uVar8)));
    if (CARRY8(uVar4,puVar1[1])) {
      uVar3 = uVar3 + 1;
    }
    puVar1[1] = uVar5 + uVar9 + (ulong)CARRY8(uVar7,uVar8);
    uVar6 = uVar6 + 2;
  } while (uVar6 < unaff_x20);
  return;
}

