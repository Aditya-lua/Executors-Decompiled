
void FUN_005fdb40(long param_1)

{
  ulong *puVar1;
  ulong *puVar2;
  long in_x9;
  ulong in_x10;
  ulong uVar3;
  ulong uVar4;
  ulong in_x11;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  ulong unaff_x19;
  long unaff_x20;
  long unaff_x21;
  byte *unaff_x22;
  
  do {
    do {
      uVar6 = *(ulong *)(param_1 + in_x11 * 8);
      *(ulong *)(param_1 + in_x11 * 8) = in_x10 | uVar6 >> 1;
      in_x10 = uVar6 << 0x3f;
      in_x11 = in_x11 - 1;
    } while (in_x11 != 0);
    while( true ) {
      unaff_x21 = unaff_x21 + -1;
      if (unaff_x21 == 0) {
        return;
      }
      if ((*unaff_x22 & 1) == 0) break;
      uVar3 = 0;
      uVar6 = 0;
      do {
        puVar1 = (ulong *)(unaff_x22 + uVar6 * 8);
        puVar2 = (ulong *)(unaff_x20 + uVar6 * 8);
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
      } while (uVar6 < unaff_x19);
      uVar5 = 0;
      uVar6 = unaff_x19;
      do {
        uVar8 = *(ulong *)(param_1 + uVar6 * 8);
        *(ulong *)(param_1 + uVar6 * 8) = uVar5 | uVar8 >> 1;
        uVar5 = uVar8 << 0x3f;
        uVar6 = uVar6 - 1;
      } while (uVar6 != 0);
      *(ulong *)(unaff_x22 + in_x9) = *(long *)(unaff_x22 + in_x9) + (uVar3 << 0x3f);
    }
    in_x10 = 0;
    in_x11 = unaff_x19;
  } while( true );
}

