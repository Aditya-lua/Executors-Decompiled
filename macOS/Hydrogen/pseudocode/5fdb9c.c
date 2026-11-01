
void FUN_005fdb9c(long param_1)

{
  ulong *puVar1;
  byte in_CY;
  long in_x9;
  ulong uVar2;
  ulong in_x10;
  ulong in_x11;
  ulong uVar3;
  ulong in_x12;
  ulong *in_x13;
  ulong uVar4;
  ulong uVar5;
  ulong in_x16;
  ulong unaff_x19;
  long unaff_x20;
  long unaff_x21;
  byte *unaff_x22;
  
  do {
    uVar4 = (ulong)in_CY;
    if (CARRY8(in_x10,in_x16)) {
      uVar4 = uVar4 + 1;
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
      *(ulong *)(unaff_x22 + in_x9) = *(long *)(unaff_x22 + in_x9) + (uVar4 << 0x3f);
      while( true ) {
        unaff_x21 = unaff_x21 + -1;
        if (unaff_x21 == 0) {
          return;
        }
        if ((*unaff_x22 & 1) != 0) break;
        uVar2 = 0;
        uVar4 = unaff_x19;
        do {
          uVar3 = *(ulong *)(param_1 + uVar4 * 8);
          *(ulong *)(param_1 + uVar4 * 8) = uVar2 | uVar3 >> 1;
          uVar2 = uVar3 << 0x3f;
          uVar4 = uVar4 - 1;
        } while (uVar4 != 0);
      }
      uVar4 = 0;
      in_x11 = 0;
    }
    in_x13 = (ulong *)(unaff_x22 + in_x11 * 8);
    puVar1 = (ulong *)(unaff_x20 + in_x11 * 8);
    uVar3 = *puVar1;
    uVar2 = *in_x13;
    in_x16 = in_x13[1];
    uVar5 = (ulong)CARRY8(uVar3 + uVar2,uVar4);
    *in_x13 = uVar3 + uVar2 + uVar4;
    in_x10 = puVar1[1];
    uVar4 = in_x10 + in_x16;
    in_CY = CARRY8(uVar4,uVar5) || CARRY8(uVar4 + uVar5,(ulong)CARRY8(uVar3,uVar2));
    in_x12 = uVar4 + uVar5 + (ulong)CARRY8(uVar3,uVar2);
  } while( true );
}

