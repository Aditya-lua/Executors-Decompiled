
undefined8 thunk_FUN_004be660(void)

{
  long lVar1;
  code *pcVar2;
  long *plVar3;
  undefined4 *puVar4;
  long lVar5;
  long lVar6;
  undefined4 unaff_w22;
  ulong unaff_x24;
  ulong unaff_x26;
  undefined8 uStack0000000000000030;
  undefined1 uStack0000000000000070;
  undefined8 in_stack_00000090;
  undefined8 in_stack_00000098;
  undefined8 in_stack_000000a0;
  undefined8 in_stack_000000a8;
  undefined8 in_stack_000000b0;
  undefined8 in_stack_000000b8;
  undefined8 in_stack_000000c0;
  undefined8 in_stack_000000c8;
  undefined8 in_stack_000000d0;
  undefined8 in_stack_000000d8;
  undefined8 in_stack_000000e0;
  undefined8 in_stack_000000e8;
  undefined8 in_stack_000000f0;
  undefined8 in_stack_000000f8;
  undefined8 in_stack_00000100;
  undefined8 in_stack_00000108;
  undefined8 in_stack_00000110;
  undefined8 in_stack_00000118;
  undefined8 in_stack_00000120;
  undefined8 in_stack_00000128;
  undefined8 in_stack_00000130;
  undefined8 in_stack_00000138;
  undefined8 in_stack_00000140;
  undefined8 in_stack_00000148;
  undefined8 in_stack_00000150;
  undefined8 in_stack_00000158;
  undefined8 in_stack_00000160;
  undefined8 in_stack_00000168;
  undefined8 in_stack_00000170;
  undefined8 uStack0000000000000178;
  undefined8 in_stack_00000180;
  undefined8 uStack0000000000000190;
  undefined4 *in_stack_00000198;
  undefined8 in_stack_000001a0;
  long in_stack_000001a8;
  
  plVar3 = (long *)func_0x005847cc();
  if (plVar3 == (long *)0x0) {
    func_0x007a23bc(&UNK_009e5fb8);
  }
  else {
    _memcpy(&uStack0000000000000190,&uStack0000000000000070,0x108);
    lVar1 = in_stack_000001a8;
    lVar5 = plVar3[2];
    if ((ulong)(*plVar3 - lVar5) < (ulong)(in_stack_000001a8 != 0x21)) {
      func_0x007a535c(plVar3,lVar5,(ulong)(in_stack_000001a8 != 0x21),8,0x108);
      lVar5 = plVar3[2];
    }
    if (lVar1 != 0x21) {
      lVar6 = plVar3[1] + lVar5 * 0x108;
      *(long *)(lVar6 + 0x18) = lVar1;
      *(undefined8 *)(lVar6 + 0x78) = in_stack_000000e8;
      *(undefined8 *)(lVar6 + 0x70) = in_stack_000000e0;
      *(undefined8 *)(lVar6 + 0x88) = in_stack_000000f8;
      *(undefined8 *)(lVar6 + 0x80) = in_stack_000000f0;
      *(undefined8 *)(lVar6 + 0x58) = in_stack_000000c8;
      *(undefined8 *)(lVar6 + 0x50) = in_stack_000000c0;
      *(undefined8 *)(lVar6 + 0x68) = in_stack_000000d8;
      *(undefined8 *)(lVar6 + 0x60) = in_stack_000000d0;
      *(undefined8 *)(lVar6 + 0xb8) = in_stack_00000128;
      *(undefined8 *)(lVar6 + 0xb0) = in_stack_00000120;
      *(undefined8 *)(lVar6 + 200) = in_stack_00000138;
      *(undefined8 *)(lVar6 + 0xc0) = in_stack_00000130;
      *(undefined8 *)(lVar6 + 0x98) = in_stack_00000108;
      *(undefined8 *)(lVar6 + 0x90) = in_stack_00000100;
      *(undefined8 *)(lVar6 + 0xa8) = in_stack_00000118;
      *(undefined8 *)(lVar6 + 0xa0) = in_stack_00000110;
      *(undefined8 *)(lVar6 + 0x100) = in_stack_00000170;
      *(undefined8 *)(lVar6 + 0xe8) = in_stack_00000158;
      *(undefined8 *)(lVar6 + 0xe0) = in_stack_00000150;
      *(undefined8 *)(lVar6 + 0xf8) = in_stack_00000168;
      *(undefined8 *)(lVar6 + 0xf0) = in_stack_00000160;
      *(undefined8 *)(lVar6 + 0xd8) = in_stack_00000148;
      *(undefined8 *)(lVar6 + 0xd0) = in_stack_00000140;
      *(undefined8 *)(lVar6 + 0x38) = in_stack_000000a8;
      *(undefined8 *)(lVar6 + 0x30) = in_stack_000000a0;
      *(undefined8 *)(lVar6 + 0x48) = in_stack_000000b8;
      *(undefined8 *)(lVar6 + 0x40) = in_stack_000000b0;
      *(undefined8 *)(lVar6 + 0x28) = in_stack_00000098;
      *(undefined8 *)(lVar6 + 0x20) = in_stack_00000090;
      lVar5 = lVar5 + 1;
    }
    plVar3[2] = lVar5;
    puVar4 = (undefined4 *)func_0x00187bd0(0x28,8);
    if (puVar4 != (undefined4 *)0x0) {
      *puVar4 = unaff_w22;
      *(undefined8 *)(puVar4 + 2) = 0;
      *(undefined8 *)(puVar4 + 4) = 8;
      *(undefined8 *)(puVar4 + 6) = 0;
      *(undefined1 *)(puVar4 + 8) = 0;
      uStack0000000000000190 = 1;
      in_stack_000001a0 = 1;
      in_stack_00000198 = puVar4;
      func_0x00584c34(&uStack0000000000000178);
      func_0x004ce364(&uStack0000000000000178);
      if (uStack0000000000000178 != 0) {
        func_0x00187bd4(in_stack_00000180,uStack0000000000000178 * 0x28,8);
      }
      if ((unaff_x26 & 1) != 0) {
        if (uStack0000000000000030 == 2) {
          if ((unaff_x24 & 1) != 0) {
            func_0x004bc150((ulong)&uStack0000000000000030 | 8);
          }
        }
        else if (uStack0000000000000030 == 3) {
          func_0x004bc4a8((ulong)&uStack0000000000000030 | 8);
        }
        else {
          func_0x004bb4f4(&uStack0000000000000030);
        }
      }
      return 1;
    }
    func_0x007a1f18(8,0x28);
  }
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x4be8e4);
  (*pcVar2)();
}

