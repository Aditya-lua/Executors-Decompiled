
/* WARNING: Removing unreachable block (ram,0x00037108) */

void FUN_000371a4(undefined8 param_1)

{
  ulong uVar1;
  long unaff_x19;
  long *unaff_x20;
  long unaff_x21;
  long in_stack_00000000;
  undefined7 uStack0000000000000019;
  undefined1 uStack0000000000000020;
  undefined8 uStack0000000000000021;
  
  uStack0000000000000019 = (undefined7)param_1;
  uStack0000000000000020 = (undefined1)((ulong)param_1 >> 0x38);
  uVar1 = func_0x00034500();
  func_0x0003732c();
  if (in_stack_00000000 != 0) {
    __ZdlPv();
  }
  if ((uVar1 & 1) == 0) {
    *(uint *)(unaff_x19 + 0x18) = *(uint *)(unaff_x19 + 0x18) | 0x80;
    uStack0000000000000021 = 0;
    uStack0000000000000019 = 0;
    uStack0000000000000020 = 0;
    uVar1 = func_0x00034500(*(undefined8 *)(unaff_x19 + 0x10),unaff_x21 + 1,
                            *(undefined8 *)(unaff_x19 + 8));
    func_0x0003732c();
    if ((uVar1 & 1) == 0) {
      if (*unaff_x20 != 0) {
        *(long *)(unaff_x19 + 0x28) = *unaff_x20;
        __ZdlPv();
        *unaff_x20 = 0;
        unaff_x20[1] = 0;
        unaff_x20[2] = 0;
      }
      *(undefined1 *)(unaff_x19 + 0x80) = 0;
      unaff_x20[1] = 0;
      *unaff_x20 = 0;
      unaff_x20[3] = 0;
      unaff_x20[2] = 0;
      *(undefined8 *)((long)unaff_x20 + 0x21) = 0;
      *(undefined8 *)((long)unaff_x20 + 0x19) = 0;
      *(undefined8 *)(unaff_x19 + 0x50) = 0;
      *(undefined8 *)(unaff_x19 + 0x58) = 0;
      *(undefined1 *)(unaff_x19 + 0x60) = 0;
      *(undefined8 *)(unaff_x19 + 0x68) = 0;
      *(undefined8 *)(unaff_x19 + 0x70) = 0;
      *(undefined1 *)(unaff_x19 + 0x78) = 0;
      *(undefined8 *)(unaff_x19 + 0x88) = 0;
    }
  }
  return;
}

