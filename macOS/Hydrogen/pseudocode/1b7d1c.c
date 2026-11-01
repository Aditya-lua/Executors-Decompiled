
void FUN_001b7d1c(undefined1 param_1 [16])

{
  long *plVar1;
  undefined2 uVar2;
  undefined2 uVar3;
  undefined2 uVar4;
  undefined4 uVar5;
  long lVar6;
  long *unaff_x19;
  long lVar7;
  long unaff_x23;
  long unaff_x24;
  long unaff_x25;
  long unaff_x29;
  undefined8 in_stack_00000000;
  long in_stack_00000008;
  undefined1 uStack0000000000000018;
  ulong in_stack_00000020;
  ulong in_stack_00000028;
  long in_stack_00000030;
  undefined1 in_stack_00000038;
  undefined1 uStack0000000000000039;
  undefined6 uStack000000000000003a;
  undefined2 in_stack_00000040;
  undefined2 uStack0000000000000042;
  undefined4 uStack0000000000000044;
  undefined2 uStack0000000000000048;
  undefined2 uStack000000000000004a;
  undefined4 uStack000000000000004c;
  undefined8 uStack0000000000000050;
  undefined8 uStack0000000000000058;
  long in_stack_00000060;
  long in_stack_00000068;
  long in_stack_00000070;
  long in_stack_00000078;
  long in_stack_00000080;
  long in_stack_00000088;
  long in_stack_00000090;
  long in_stack_00000098;
  long in_stack_000000a0;
  long in_stack_000000a8;
  long in_stack_000000b0;
  long in_stack_000000b8;
  long in_stack_000000c0;
  long in_stack_000000c8;
  long in_stack_000000d0;
  long in_stack_000000d8;
  
  *(long *)(unaff_x25 + 0x40) = param_1._8_8_;
  *(long *)(unaff_x25 + 0x38) = param_1._0_8_;
  func_0x001f6b2c(unaff_x29 + -0x98,&uStack0000000000000018);
  if (*(char *)(unaff_x29 + -0x98) == '\x15') {
    uVar2 = *(undefined2 *)(unaff_x29 + -0x96);
    uVar3 = *(undefined2 *)(unaff_x29 + -0x94);
    uVar5 = *(undefined4 *)(unaff_x29 + -0x96);
    func_0x00223f7c(unaff_x29 + -0x98,&uStack0000000000000018);
    if (((*(uint *)(unaff_x29 + -0x98) & 1) == 0) &&
       (lVar7 = *(long *)(unaff_x29 + -0x90), lVar7 != -0x8000000000000000)) {
      in_stack_00000038 = *(undefined1 *)(unaff_x29 + -0x88);
      uStack0000000000000039 = *(undefined1 *)(unaff_x29 + -0x87);
      uVar4 = *(undefined2 *)(unaff_x29 + -0x88);
      uStack0000000000000042 = *(undefined2 *)(unaff_x29 + -0x7e);
      uStack0000000000000044 = *(undefined4 *)(unaff_x29 + -0x7c);
      uStack000000000000003a = (undefined6)*(undefined8 *)(unaff_x25 + 0x82);
      in_stack_00000040 = (undefined2)((ulong)*(undefined8 *)(unaff_x25 + 0x82) >> 0x30);
      in_stack_00000078 = in_stack_000000c0;
      in_stack_00000070 = in_stack_000000b8;
      in_stack_00000088 = in_stack_000000d0;
      in_stack_00000080 = in_stack_000000c8;
      in_stack_00000090 = in_stack_000000d8;
      uStack0000000000000058 = in_stack_000000a0;
      uStack0000000000000050 = in_stack_00000098;
      in_stack_00000068 = in_stack_000000b0;
      in_stack_00000060 = in_stack_000000a8;
      if (in_stack_00000020 <= in_stack_00000028) {
        unaff_x19[9] = in_stack_000000c0;
        unaff_x19[8] = in_stack_000000b8;
        unaff_x19[0xb] = in_stack_000000d0;
        unaff_x19[10] = in_stack_000000c8;
        unaff_x19[0xc] = in_stack_000000d8;
        unaff_x19[1] = CONCAT62(uStack000000000000003a,uVar4);
        *unaff_x19 = lVar7;
        unaff_x19[3] = CONCAT44(uStack000000000000004c,uVar5);
        unaff_x19[2] = CONCAT44(uStack0000000000000044,
                                CONCAT22(uStack0000000000000042,in_stack_00000040));
        unaff_x19[5] = in_stack_000000a0;
        unaff_x19[4] = in_stack_00000098;
        unaff_x19[7] = in_stack_000000b0;
        unaff_x19[6] = in_stack_000000a8;
        return;
      }
      in_stack_00000030 = lVar7;
      uStack0000000000000048 = uVar2;
      uStack000000000000004a = uVar3;
      if (in_stack_00000098 == -0x8000000000000000) {
        lVar6 = 8;
      }
      else {
        if (in_stack_00000098 != 0) {
          func_0x00187bd4(in_stack_000000a0,in_stack_00000098,1);
        }
        if (in_stack_00000068 != 0) {
          func_0x00187bd4(in_stack_00000070,in_stack_00000068,1);
        }
        lVar6 = 0x30;
      }
      if (*(long *)((long)&uStack0000000000000050 + lVar6) != 0) {
        func_0x00187bd4(*(undefined8 *)((long)&uStack0000000000000058 + lVar6),
                        *(long *)((long)&uStack0000000000000050 + lVar6),1);
      }
      if (lVar7 != 0) {
        func_0x00187bd4(CONCAT62(uStack000000000000003a,
                                 CONCAT11(uStack0000000000000039,in_stack_00000038)),lVar7,1);
      }
      *unaff_x19 = unaff_x24;
      return;
    }
  }
  *unaff_x19 = -0x8000000000000000;
  if (unaff_x23 == -0x8000000000000000) {
    plVar1 = (long *)(unaff_x25 + 8);
    lVar7 = *plVar1;
  }
  else {
    plVar1 = (long *)(unaff_x25 + 0x30);
    if (unaff_x23 != 0) {
      func_0x00187bd4(in_stack_00000000);
    }
    if (in_stack_00000008 != 0) {
      in_stack_00000000 = func_0x00187bd4(in_stack_00000000);
    }
    lVar7 = *plVar1;
  }
  if (lVar7 != 0) {
    func_0x00187bd4(in_stack_00000000,plVar1[1],lVar7,1);
  }
  return;
}

