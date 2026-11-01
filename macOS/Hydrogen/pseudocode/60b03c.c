
void FUN_0060b03c(ulong param_1)

{
  ulong *puVar1;
  ulong *puVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  byte *in_x9;
  long in_x10;
  long in_x11;
  long in_x12;
  long in_x13;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  long unaff_x22;
  ulong unaff_x23;
  
  do {
    uVar6 = 0;
    uVar8 = param_1;
    do {
      uVar9 = *(ulong *)(in_x12 + uVar8 * 8);
      *(ulong *)(in_x12 + uVar8 * 8) = uVar6 | uVar9 >> 1;
      uVar6 = uVar9 << 0x3f;
      uVar8 = uVar8 - 1;
    } while (uVar8 != 0);
    while( true ) {
      in_x11 = in_x11 + -1;
      if (in_x11 == 0) {
        if (0x1ffffffffffffffe < unaff_x23) {
          unaff_x23 = 0x1fffffffffffffff;
        }
        if (unaff_x22 != 0) {
          if (unaff_x23 != 0) {
            do {
              *(undefined8 *)(unaff_x22 + -8 + unaff_x23 * 8) = 0;
              unaff_x23 = unaff_x23 - 1;
            } while (unaff_x23 != 0);
          }
          func_0x00611644();
        }
        return;
      }
      if ((*in_x9 & 1) == 0) break;
      uVar6 = 0;
      uVar8 = 0;
      do {
        puVar1 = (ulong *)(in_x9 + uVar8 * 8);
        puVar2 = (ulong *)(in_x10 + uVar8 * 8);
        uVar3 = *puVar2;
        uVar4 = *puVar1;
        uVar5 = (ulong)CARRY8(uVar3 + uVar4,uVar6);
        *puVar1 = uVar3 + uVar4 + uVar6;
        uVar7 = puVar2[1];
        uVar9 = uVar7 + puVar1[1];
        uVar6 = (ulong)(CARRY8(uVar9,uVar5) || CARRY8(uVar9 + uVar5,(ulong)CARRY8(uVar3,uVar4)));
        if (CARRY8(uVar7,puVar1[1])) {
          uVar6 = uVar6 + 1;
        }
        puVar1[1] = uVar9 + uVar5 + (ulong)CARRY8(uVar3,uVar4);
        uVar8 = uVar8 + 2;
      } while (uVar8 < param_1);
      uVar9 = 0;
      uVar8 = param_1;
      do {
        uVar4 = *(ulong *)(in_x12 + uVar8 * 8);
        *(ulong *)(in_x12 + uVar8 * 8) = uVar9 | uVar4 >> 1;
        uVar9 = uVar4 << 0x3f;
        uVar8 = uVar8 - 1;
      } while (uVar8 != 0);
      *(ulong *)(in_x9 + in_x13) = *(long *)(in_x9 + in_x13) + (uVar6 << 0x3f);
    }
  } while( true );
}

