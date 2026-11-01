
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0023636c(void)

{
  undefined8 uVar1;
  int iVar2;
  undefined8 uVar3;
  undefined8 *puVar4;
  undefined8 *puVar5;
  code *pcVar6;
  code *in_x9;
  undefined8 *unaff_x19;
  uint unaff_w20;
  long unaff_x21;
  long unaff_x22;
  undefined8 unaff_x23;
  undefined8 *unaff_x25;
  undefined1 auVar7 [16];
  undefined8 in_stack_00000008;
  undefined1 uStack0000000000000010;
  undefined1 uStack0000000000000058;
  ulong in_stack_00000098;
  undefined8 uStack00000000000000a0;
  undefined8 uStack00000000000000a8;
  undefined8 in_stack_000000b0;
  long in_stack_000000b8;
  undefined8 in_stack_000000c0;
  undefined *in_stack_000000c8;
  undefined8 in_stack_000000d0;
  undefined *in_stack_000000d8;
  undefined8 in_stack_000000e0;
  long in_stack_000000e8;
  undefined8 in_stack_000000f0;
  undefined1 *in_stack_000000f8;
  ulong in_stack_00000100;
  
  (*in_x9)();
  if ((code *)*unaff_x25 != (code *)0x0) {
    (*(code *)*unaff_x25)();
  }
  if (unaff_x25[1] != 0) {
    func_0x00187bd4();
  }
  uVar3 = 0;
  if (unaff_x22 == 0) {
    unaff_x22 = 1;
  }
  else {
    uVar3 = unaff_x23;
  }
  (**(code **)(*(long *)(unaff_x21 + 0x38) + 0x20))
            (&uStack0000000000000058,*(undefined8 *)(unaff_x21 + 0x30),unaff_x22,uVar3);
  auVar7 = (**(code **)(*(long *)(unaff_x21 + 0x18) + 0x30))
                     (*(undefined8 *)(unaff_x21 + 0x10),&uStack0000000000000010);
  puVar5 = auVar7._8_8_;
  uVar3 = auVar7._0_8_;
  if (0x40 < in_stack_00000098) {
    func_0x007a28b0(in_stack_00000098,0x40,&UNK_009c9ca0);
LAB_00236548:
                    /* WARNING: Does not return */
    pcVar6 = (code *)SoftwareBreakpoint(1,0x23654c);
    (*pcVar6)();
  }
  uStack00000000000000a0._4_2_ =
       (ushort)(unaff_w20 >> 8) & 0xff | (ushort)((unaff_w20 & 0xff00ff) << 8);
  uStack00000000000000a0._6_1_ = 0xe;
  uStack00000000000000a0._7_1_ = (undefined1)in_stack_00000098;
  uStack00000000000000a8 = (long)&uStack00000000000000a0 + 4;
  in_stack_000000b0 = 2;
  in_stack_000000b8 = (long)&uStack00000000000000a0 + 6;
  in_stack_000000c0 = 1;
  in_stack_000000c8 = &UNK_008294b3;
  in_stack_000000d0 = 6;
  in_stack_000000d8 = &UNK_008296b8;
  in_stack_000000e0 = 8;
  in_stack_000000e8 = (long)&uStack00000000000000a0 + 7;
  in_stack_000000f0 = 1;
  in_stack_000000f8 = &uStack0000000000000058;
  in_stack_00000100 = in_stack_00000098;
  iVar2 = (*(code *)puVar5[3])(uVar3,&uStack00000000000000a8,6,in_stack_00000008);
  if (iVar2 == 0) {
    *unaff_x19 = 0x8000000000000027;
    pcVar6 = (code *)*puVar5;
  }
  else {
    puVar4 = (undefined8 *)func_0x00187bd0(0x12,1);
    if (puVar4 == (undefined8 *)0x0) {
      func_0x007a1f00(1,0x12,&UNK_009c8d00);
      goto LAB_00236548;
    }
    *(undefined2 *)(puVar4 + 2) = 0x6863;
    uVar1 = _UNK_008294a1;
    puVar4[1] = _UNK_008294a9;
    *puVar4 = uVar1;
    uVar1 = _UNK_00829670;
    unaff_x19[1] = _UNK_00829678;
    *unaff_x19 = uVar1;
    unaff_x19[2] = puVar4;
    unaff_x19[3] = 0x12;
    pcVar6 = (code *)*puVar5;
  }
  if (pcVar6 != (code *)0x0) {
    (*pcVar6)(uVar3);
  }
  if (puVar5[1] != 0) {
    func_0x00187bd4(uVar3,puVar5[1],puVar5[2]);
  }
  func_0x00252db4(&uStack0000000000000010);
  return;
}

