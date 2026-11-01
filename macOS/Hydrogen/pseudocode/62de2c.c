
void FUN_0062de2c(void)

{
  uint uVar1;
  uint uVar2;
  long lVar3;
  int in_w8;
  uint in_w10;
  ulong uVar4;
  ulong in_x11;
  long unaff_x19;
  long *unaff_x20;
  uint uVar5;
  uint unaff_w21;
  uint uVar6;
  uint unaff_w22;
  int iVar7;
  uint unaff_w27;
  ulong uVar8;
  int unaff_w28;
  undefined8 in_stack_00000008;
  ulong uStack0000000000000010;
  int in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  uint in_stack_00000038;
  ulong in_stack_00000040;
  undefined8 *in_stack_00000048;
  undefined8 *in_stack_00000050;
  
  do {
    iVar7 = in_w8 - unaff_w28;
    uStack0000000000000010 = in_x11;
    if ((in_w10 & 1) == 0) goto joined_r0x0062dd80;
    func_0x005ffccc();
    func_0x005ffccc();
    *(undefined1 *)(unaff_x19 + 0x68) =
         *(undefined1 *)
          (in_stack_00000048 +
          (ulong)((unaff_w22 << (ulong)(in_stack_00000008._4_4_ & 0x1f)) + unaff_w21) * 0xe + 0xd);
    while( true ) {
      for (; unaff_w28 != 0; unaff_w28 = unaff_w28 + -1) {
        lVar3 = (**(code **)(*unaff_x20 + 0x38))();
        func_0x005ffccc();
        func_0x005ffccc();
        *(undefined1 *)(unaff_x19 + 0x68) = *(undefined1 *)(lVar3 + 0x68);
      }
      in_w10 = 0;
      uVar5 = 0;
      uVar6 = 0;
      iVar7 = (int)in_stack_00000040;
      in_x11 = uStack0000000000000010;
      uVar8 = in_stack_00000040;
      do {
        uVar4 = in_x11;
        in_stack_00000018 = in_stack_00000018 + 1;
        if ((long)uVar8 < 1) {
          if (in_stack_00000048 != (undefined8 *)0x0) {
            while (in_stack_00000050 != in_stack_00000048) {
              in_stack_00000050 = in_stack_00000050 + -0xe;
              (**(code **)*in_stack_00000050)(in_stack_00000050);
            }
            __ZdlPv(in_stack_00000048);
          }
          return;
        }
        uVar1 = func_0x005ffe3c(in_stack_00000040,in_stack_00000028,uVar4);
        uVar2 = func_0x005ffe3c(in_stack_00000020,uVar4);
        uVar5 = uVar1 | uVar5 << 1;
        uVar6 = uVar2 | uVar6 << 1;
        in_x11 = uVar4 - 1;
      } while ((uVar4 != 0) &&
              (in_stack_00000040 = (ulong)(uVar5 << 1), uVar8 = uVar4,
              uVar5 << 1 < in_stack_00000038 && uVar6 << 1 < in_stack_00000038));
      unaff_w27 = (uint)(uVar5 != 0 || uVar6 != 0);
      if (uVar5 == 0 && uVar6 == 0) {
        uVar1 = 1;
      }
      unaff_w28 = 0;
      in_stack_00000040 = uVar4;
      if (((uVar1 | uVar2) & 1) == 0) break;
      iVar7 = iVar7 - (int)uVar4;
      uStack0000000000000010 = in_x11;
joined_r0x0062dd80:
      for (; iVar7 != 0; iVar7 = iVar7 + -1) {
        lVar3 = (**(code **)(*unaff_x20 + 0x38))();
        func_0x005ffccc();
        func_0x005ffccc();
        *(undefined1 *)(unaff_x19 + 0x68) = *(undefined1 *)(lVar3 + 0x68);
      }
      if (unaff_w27 != 0) {
        (**(code **)(*unaff_x20 + 0x48))();
      }
    }
    do {
      unaff_w21 = uVar5 >> 1;
      unaff_w22 = uVar6 >> 1;
      unaff_w28 = unaff_w28 + 1;
      unaff_w27 = (uint)(1 < uVar5 || 1 < uVar6);
      if (((uVar5 >> 1 & 1) != 0) || (1 >= uVar5 && 1 >= uVar6)) break;
      uVar1 = uVar6 >> 1;
      uVar5 = unaff_w21;
      uVar6 = unaff_w22;
    } while ((uVar1 & 1) == 0);
    in_w8 = iVar7 + in_stack_00000018;
  } while( true );
}

