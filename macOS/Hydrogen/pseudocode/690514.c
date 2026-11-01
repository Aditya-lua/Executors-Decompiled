
void FUN_00690514(void)

{
  long lVar1;
  uint uVar2;
  ulong uVar3;
  uint unaff_w23;
  long unaff_x24;
  uint unaff_w25;
  long unaff_x26;
  undefined8 unaff_x27;
  uint unaff_w28;
  long unaff_x29;
  undefined8 uStack00000000000000f8;
  ulong in_stack_00000108;
  ulong in_stack_00000110;
  long in_stack_00000118;
  undefined8 uStack0000000000000128;
  ulong in_stack_00000138;
  ulong in_stack_00000140;
  long in_stack_00000148;
  undefined8 uStack0000000000000158;
  ulong in_stack_00000168;
  ulong in_stack_00000170;
  long in_stack_00000178;
  undefined8 uStack0000000000000188;
  ulong in_stack_00000198;
  ulong in_stack_000001a0;
  long in_stack_000001a8;
  
code_r0x00690514:
  uVar2 = (uint)*(ushort *)(unaff_x24 + (ulong)unaff_w28 * 2);
  unaff_w28 = unaff_w28 + 1;
  if (uVar2 < unaff_w23) goto LAB_00690508;
  do {
    if ((uVar2 != unaff_w23) || (lVar1 = func_0x00609cf4(), lVar1 != 0)) {
      return;
    }
    while( true ) {
      func_0x005ffa7c(unaff_x29 + -0xa8);
      func_0x005ffa7c(&uStack0000000000000188);
      func_0x005fe1e8(&uStack0000000000000158,1);
      func_0x00607398(unaff_x29 + -0xd8,&uStack0000000000000188,&uStack0000000000000158);
      func_0x005fe1e8(&uStack0000000000000128,1);
      func_0x005fe1e8(&uStack00000000000000f8,2);
      func_0x005ff820();
      uVar3 = in_stack_00000108;
      if (in_stack_00000110 <= in_stack_00000108) {
        uVar3 = in_stack_00000110;
      }
      uStack00000000000000f8 = unaff_x27;
      if (in_stack_00000118 != 0) {
        if (uVar3 != 0) {
          do {
            *(undefined8 *)(in_stack_00000118 + -8 + uVar3 * 8) = 0;
            uVar3 = uVar3 - 1;
          } while (uVar3 != 0);
        }
        func_0x00611644();
      }
      lVar1 = unaff_x26 + 0x10;
      uVar3 = in_stack_00000138;
      if (in_stack_00000140 <= in_stack_00000138) {
        uVar3 = in_stack_00000140;
      }
      uStack0000000000000128 = lVar1;
      if (in_stack_00000148 != 0) {
        if (uVar3 != 0) {
          do {
            *(undefined8 *)(in_stack_00000148 + -8 + uVar3 * 8) = 0;
            uVar3 = uVar3 - 1;
          } while (uVar3 != 0);
        }
        func_0x00611644();
      }
      *(long *)(unaff_x29 + -0xd8) = lVar1;
      lVar1 = *(long *)(unaff_x29 + -0xb8);
      uVar3 = *(ulong *)(unaff_x29 + -200);
      if (*(ulong *)(unaff_x29 + -0xc0) <= *(ulong *)(unaff_x29 + -200)) {
        uVar3 = *(ulong *)(unaff_x29 + -0xc0);
      }
      if (lVar1 != 0) {
        if (uVar3 != 0) {
          do {
            *(undefined8 *)(lVar1 + -8 + uVar3 * 8) = 0;
            uVar3 = uVar3 - 1;
          } while (uVar3 != 0);
        }
        func_0x00611644();
      }
      lVar1 = unaff_x26 + 0x10;
      uVar3 = in_stack_00000168;
      if (in_stack_00000170 <= in_stack_00000168) {
        uVar3 = in_stack_00000170;
      }
      uStack0000000000000158 = lVar1;
      if (in_stack_00000178 != 0) {
        if (uVar3 != 0) {
          do {
            *(undefined8 *)(in_stack_00000178 + -8 + uVar3 * 8) = 0;
            uVar3 = uVar3 - 1;
          } while (uVar3 != 0);
        }
        func_0x00611644();
      }
      uVar3 = in_stack_00000198;
      if (in_stack_000001a0 <= in_stack_00000198) {
        uVar3 = in_stack_000001a0;
      }
      uStack0000000000000188 = lVar1;
      if (in_stack_000001a8 != 0) {
        if (uVar3 != 0) {
          do {
            *(undefined8 *)(in_stack_000001a8 + -8 + uVar3 * 8) = 0;
            uVar3 = uVar3 - 1;
          } while (uVar3 != 0);
        }
        func_0x00611644();
      }
      *(long *)(unaff_x29 + -0xa8) = unaff_x26 + 0x10;
      lVar1 = *(long *)(unaff_x29 + -0x88);
      uVar3 = *(ulong *)(unaff_x29 + -0x98);
      if (*(ulong *)(unaff_x29 + -0x90) <= *(ulong *)(unaff_x29 + -0x98)) {
        uVar3 = *(ulong *)(unaff_x29 + -0x90);
      }
      if (lVar1 != 0) {
        if (uVar3 != 0) {
          do {
            *(undefined8 *)(lVar1 + -8 + uVar3 * 8) = 0;
            uVar3 = uVar3 - 1;
          } while (uVar3 != 0);
        }
        func_0x00611644();
      }
      uVar2 = unaff_w25;
      if (unaff_w23 <= unaff_w25) break;
      unaff_w28 = 1;
LAB_00690508:
      lVar1 = func_0x00609cf4();
      if (lVar1 != 0) goto code_r0x00690514;
    }
  } while( true );
}

