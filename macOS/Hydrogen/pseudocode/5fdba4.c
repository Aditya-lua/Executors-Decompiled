
void FUN_005fdba4(long param_1)

{
  ulong *puVar1;
  undefined1 in_CY;
  long in_x9;
  ulong uVar2;
  ulong in_x11;
  ulong uVar3;
  ulong in_x12;
  ulong *in_x13;
  ulong uVar4;
  ulong in_x14;
  ulong uVar5;
  ulong uVar6;
  ulong unaff_x19;
  long unaff_x20;
  long unaff_x21;
  byte *unaff_x22;
  
  do {
    if ((bool)in_CY) {
      in_x14 = in_x14 + 1;
    }
    in_x13[1] = in_x12;
    in_x11 = in_x11 + 2;
    if (unaff_x19 <= in_x11) {
      uVar3 = 0;
      uVar2 = unaff_x19;
      do {
        uVar5 = *(ulong *)(param_1 + uVar2 * 8);
        *(ulong *)(param_1 + uVar2 * 8) = uVar3 | uVar5 >> 1;
        uVar3 = uVar5 << 0x3f;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
      *(ulong *)(unaff_x22 + in_x9) = *(long *)(unaff_x22 + in_x9) + (in_x14 << 0x3f);
      while( true ) {
        unaff_x21 = unaff_x21 + -1;
        if (unaff_x21 == 0) {
          return;
        }
        if ((*unaff_x22 & 1) != 0) break;
        uVar3 = 0;
        uVar2 = unaff_x19;
        do {
          uVar5 = *(ulong *)(param_1 + uVar2 * 8);
          *(ulong *)(param_1 + uVar2 * 8) = uVar3 | uVar5 >> 1;
          uVar3 = uVar5 << 0x3f;
          uVar2 = uVar2 - 1;
        } while (uVar2 != 0);
      }
      in_x14 = 0;
      in_x11 = 0;
    }
    in_x13 = (ulong *)(unaff_x22 + in_x11 * 8);
    puVar1 = (ulong *)(unaff_x20 + in_x11 * 8);
    uVar4 = *puVar1;
    uVar3 = *in_x13;
    uVar6 = (ulong)CARRY8(uVar4 + uVar3,in_x14);
    *in_x13 = uVar4 + uVar3 + in_x14;
    uVar5 = puVar1[1];
    uVar2 = uVar5 + in_x13[1];
    in_x12 = uVar2 + uVar6 + (ulong)CARRY8(uVar4,uVar3);
    in_x14 = (ulong)(CARRY8(uVar2,uVar6) || CARRY8(uVar2 + uVar6,(ulong)CARRY8(uVar4,uVar3)));
    in_CY = CARRY8(uVar5,in_x13[1]);
  } while( true );
}

