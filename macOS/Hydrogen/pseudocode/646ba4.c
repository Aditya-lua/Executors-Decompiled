
undefined8 FUN_00646ba4(void)

{
  ulong uVar1;
  undefined1 *unaff_x19;
  ulong unaff_x21;
  long unaff_x22;
  undefined1 *unaff_x23;
  long unaff_x25;
  ulong unaff_x27;
  undefined8 in_stack_00000018;
  undefined8 uStack0000000000000060;
  undefined *in_stack_00000068;
  ulong in_stack_00000078;
  ulong in_stack_00000080;
  long in_stack_00000088;
  undefined *in_stack_00000098;
  undefined1 uStack00000000000000a4;
  undefined1 uStack00000000000000a8;
  undefined1 uStack00000000000000e9;
  ulong in_stack_000000f0;
  ulong in_stack_000000f8;
  undefined8 uStack0000000000000100;
  undefined1 uStack0000000000000108;
  undefined8 in_stack_00000148;
  ulong in_stack_00000150;
  ulong in_stack_00000158;
  undefined1 *in_stack_00000160;
  
  while( true ) {
    uVar1 = unaff_x21;
    if (0x1f < unaff_x21) {
      uVar1 = unaff_x27;
    }
    _memcpy(unaff_x22);
    unaff_x21 = unaff_x21 - uVar1;
    if (unaff_x21 == 0) break;
    unaff_x22 = unaff_x22 + uVar1;
    if (in_stack_00000018._7_1_ != '\0') {
      func_0x00680f00(&uStack0000000000000060);
    }
    if (unaff_x25 != 0) {
      func_0x00680f00(&uStack0000000000000060);
    }
    (**(code **)((long)in_stack_00000068 + 0x28))();
    (**(code **)((long)in_stack_00000068 + 0x38))();
    in_stack_00000018._7_1_ = in_stack_00000018._7_1_ + '\x01';
  }
  if (unaff_x23 != (undefined1 *)0x0) {
    unaff_x23[0x1f] = 0;
    unaff_x23[0x1e] = 0;
    unaff_x23[0x1d] = 0;
    unaff_x23[0x1c] = 0;
    unaff_x23[0x1b] = 0;
    unaff_x23[0x1a] = 0;
    unaff_x23[0x19] = 0;
    unaff_x23[0x18] = 0;
    unaff_x23[0x17] = 0;
    unaff_x23[0x16] = 0;
    unaff_x23[0x15] = 0;
    unaff_x23[0x14] = 0;
    unaff_x23[0x13] = 0;
    unaff_x23[0x12] = 0;
    unaff_x23[0x11] = 0;
    unaff_x23[0x10] = 0;
    unaff_x23[0xf] = 0;
    unaff_x23[0xe] = 0;
    unaff_x23[0xd] = 0;
    unaff_x23[0xc] = 0;
    unaff_x23[0xb] = 0;
    unaff_x23[10] = 0;
    unaff_x23[9] = 0;
    unaff_x23[8] = 0;
    unaff_x23[7] = 0;
    unaff_x23[6] = 0;
    unaff_x23[5] = 0;
    unaff_x23[4] = 0;
    unaff_x23[3] = 0;
    unaff_x23[2] = 0;
    unaff_x23[1] = 0;
    *unaff_x23 = 0;
    func_0x00611644();
  }
  if (unaff_x19 != (undefined1 *)0x0) {
    unaff_x19[0x1f] = 0;
    unaff_x19[0x1e] = 0;
    unaff_x19[0x1d] = 0;
    unaff_x19[0x1c] = 0;
    unaff_x19[0x1b] = 0;
    unaff_x19[0x1a] = 0;
    unaff_x19[0x19] = 0;
    unaff_x19[0x18] = 0;
    unaff_x19[0x17] = 0;
    unaff_x19[0x16] = 0;
    unaff_x19[0x15] = 0;
    unaff_x19[0x14] = 0;
    unaff_x19[0x13] = 0;
    unaff_x19[0x12] = 0;
    unaff_x19[0x11] = 0;
    unaff_x19[0x10] = 0;
    unaff_x19[0xf] = 0;
    unaff_x19[0xe] = 0;
    unaff_x19[0xd] = 0;
    unaff_x19[0xc] = 0;
    unaff_x19[0xb] = 0;
    unaff_x19[10] = 0;
    unaff_x19[9] = 0;
    unaff_x19[8] = 0;
    unaff_x19[7] = 0;
    unaff_x19[6] = 0;
    unaff_x19[5] = 0;
    unaff_x19[4] = 0;
    unaff_x19[3] = 0;
    unaff_x19[2] = 0;
    unaff_x19[1] = 0;
    *unaff_x19 = 0;
    func_0x00611644();
  }
  uVar1 = in_stack_00000150;
  if (in_stack_00000158 <= in_stack_00000150) {
    uVar1 = in_stack_00000158;
  }
  if (in_stack_00000160 == &uStack0000000000000108) {
    in_stack_00000148._1_1_ = 0;
    for (; uVar1 != 0; uVar1 = uVar1 - 1) {
      *(undefined4 *)((long)&uStack0000000000000100 + uVar1 * 4 + 4) = 0;
    }
  }
  in_stack_00000098 = &UNK_009b66c8;
  uVar1 = in_stack_000000f0;
  if (in_stack_000000f8 <= in_stack_000000f0) {
    uVar1 = in_stack_000000f8;
  }
  uStack00000000000000e9 = 0;
  if (uStack0000000000000100 == &uStack00000000000000a8 && uVar1 != 0) {
    do {
      *(undefined4 *)(&uStack00000000000000a4 + uVar1 * 4) = 0;
      uVar1 = uVar1 - 1;
    } while (uVar1 != 0);
  }
  uStack0000000000000060 = &UNK_00a12330;
  in_stack_00000068 = &UNK_00a123f0;
  uVar1 = in_stack_00000078;
  if (in_stack_00000080 <= in_stack_00000078) {
    uVar1 = in_stack_00000080;
  }
  if (in_stack_00000088 != 0) {
    if (uVar1 != 0) {
      do {
        *(undefined1 *)(in_stack_00000088 + -1 + uVar1) = 0;
        uVar1 = uVar1 - 1;
      } while (uVar1 != 0);
    }
    func_0x00611644();
  }
  return 1;
}

