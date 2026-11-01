
undefined8 FUN_0056c860(void)

{
  long *plVar1;
  undefined8 uVar2;
  code *pcVar3;
  undefined4 *puVar4;
  long lVar5;
  long unaff_x20;
  undefined4 unaff_w23;
  long lVar6;
  undefined8 *unaff_x25;
  ulong unaff_x26;
  ulong unaff_x27;
  undefined8 uVar7;
  ulong in_stack_00000008;
  undefined8 uStack0000000000000040;
  undefined1 uStack0000000000000080;
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
  undefined8 in_stack_00000178;
  undefined8 in_stack_00000180;
  long in_stack_00000188;
  long in_stack_00000198;
  undefined8 uStack00000000000001a0;
  long in_stack_000001a8;
  long in_stack_000001b0;
  undefined1 uStack00000000000001b8;
  undefined7 uStack00000000000001b9;
  undefined8 uStack00000000000001c8;
  undefined8 in_stack_000001d0;
  undefined8 uStack00000000000001e0;
  undefined4 *in_stack_000001e8;
  long in_stack_000001f8;
  undefined4 in_stack_00000200;
  
  if (unaff_x27 < *(ulong *)(unaff_x20 + 0x28)) {
    plVar1 = (long *)(*(long *)(unaff_x20 + 0x20) + unaff_x27 * 0x20);
    lVar6 = *plVar1;
    if (lVar6 != -0x8000000000000000) {
      _memcpy(&uStack00000000000001e0,&uStack0000000000000080,0x108);
      lVar5 = plVar1[2];
      if ((ulong)(lVar6 - lVar5) < (ulong)(in_stack_000001f8 != 0x21)) {
        func_0x007abb04(plVar1,lVar5,(ulong)(in_stack_000001f8 != 0x21),8,0x108);
        lVar5 = plVar1[2];
      }
      if (in_stack_000001f8 != 0x21) {
        lVar6 = plVar1[1] + lVar5 * 0x108;
        *(long *)(lVar6 + 0x18) = in_stack_000001f8;
        *(undefined8 *)(lVar6 + 0x78) = in_stack_000000f8;
        *(undefined8 *)(lVar6 + 0x70) = in_stack_000000f0;
        *(undefined8 *)(lVar6 + 0x88) = in_stack_00000108;
        *(undefined8 *)(lVar6 + 0x80) = in_stack_00000100;
        *(undefined8 *)(lVar6 + 0x58) = in_stack_000000d8;
        *(undefined8 *)(lVar6 + 0x50) = in_stack_000000d0;
        *(undefined8 *)(lVar6 + 0x68) = in_stack_000000e8;
        *(undefined8 *)(lVar6 + 0x60) = in_stack_000000e0;
        *(undefined8 *)(lVar6 + 0xb8) = in_stack_00000138;
        *(undefined8 *)(lVar6 + 0xb0) = in_stack_00000130;
        *(undefined8 *)(lVar6 + 200) = in_stack_00000148;
        *(undefined8 *)(lVar6 + 0xc0) = in_stack_00000140;
        *(undefined8 *)(lVar6 + 0x98) = in_stack_00000118;
        *(undefined8 *)(lVar6 + 0x90) = in_stack_00000110;
        *(undefined8 *)(lVar6 + 0xa8) = in_stack_00000128;
        *(undefined8 *)(lVar6 + 0xa0) = in_stack_00000120;
        *(undefined8 *)(lVar6 + 0x100) = in_stack_00000180;
        *(undefined8 *)(lVar6 + 0xe8) = in_stack_00000168;
        *(undefined8 *)(lVar6 + 0xe0) = in_stack_00000160;
        *(undefined8 *)(lVar6 + 0xf8) = in_stack_00000178;
        *(undefined8 *)(lVar6 + 0xf0) = in_stack_00000170;
        *(undefined8 *)(lVar6 + 0xd8) = in_stack_00000158;
        *(undefined8 *)(lVar6 + 0xd0) = in_stack_00000150;
        *(undefined8 *)(lVar6 + 0x38) = in_stack_000000b8;
        *(undefined8 *)(lVar6 + 0x30) = in_stack_000000b0;
        *(undefined8 *)(lVar6 + 0x48) = in_stack_000000c8;
        *(undefined8 *)(lVar6 + 0x40) = in_stack_000000c0;
        *(undefined8 *)(lVar6 + 0x28) = in_stack_000000a8;
        *(undefined8 *)(lVar6 + 0x20) = in_stack_000000a0;
        lVar5 = lVar5 + 1;
      }
      plVar1[2] = lVar5;
      func_0x0058497c(&uStack00000000000001a0);
      uVar2 = uStack00000000000001a0;
      lVar6 = in_stack_000001a8 + in_stack_000001b0 * 0x28;
      uStack00000000000001e0 = in_stack_000001a8;
      in_stack_000001e8 = (undefined4 *)in_stack_000001a8;
      if (in_stack_000001b0 != 0) {
        in_stack_000001e8 = (undefined4 *)(in_stack_000001a8 + 0x28);
        lVar5 = *(long *)(in_stack_000001a8 + 8);
        if (lVar5 != -0x8000000000000000) {
          uVar7 = *(undefined8 *)(in_stack_000001a8 + 0x10);
          unaff_x25[2] = *(undefined8 *)(in_stack_000001a8 + 0x18);
          unaff_x25[1] = uVar7;
          in_stack_00000188 = lVar5;
          func_0x005934d8(&uStack00000000000001e0);
          uStack00000000000001b8 = 0;
          uStack00000000000001a0 = 0;
          in_stack_000001a8 = 8;
          in_stack_000001b0 = 0;
          func_0x00558024(&uStack00000000000001a0);
          in_stack_000001a8 = unaff_x25[1];
          uStack00000000000001a0 = *unaff_x25;
          in_stack_000001b0 = in_stack_00000198;
          puVar4 = (undefined4 *)func_0x00187bd0(0x28,8);
          if (puVar4 != (undefined4 *)0x0) {
            *(long *)((long)unaff_x25 + 100) = in_stack_000001a8;
            *(undefined8 *)((long)unaff_x25 + 0x5c) = uStack00000000000001a0;
            *(ulong *)((long)unaff_x25 + 0x74) =
                 CONCAT71(uStack00000000000001b9,uStack00000000000001b8);
            *(long *)((long)unaff_x25 + 0x6c) = in_stack_000001b0;
            *(undefined4 **)(puVar4 + 3) = in_stack_000001e8;
            *(long *)(puVar4 + 1) = uStack00000000000001e0;
            *puVar4 = unaff_w23;
            *(long *)(puVar4 + 7) = lVar6;
            *(undefined8 *)(puVar4 + 5) = uVar2;
            puVar4[9] = in_stack_00000200;
            uStack00000000000001e0 = 1;
            in_stack_000001e8 = puVar4;
            func_0x00584c34(&uStack00000000000001c8);
            func_0x005581a0(&uStack00000000000001c8);
            if (uStack00000000000001c8 != 0) {
              func_0x00187bd4(in_stack_000001d0,uStack00000000000001c8 * 0x28,8);
            }
            if ((unaff_x26 & 1) != 0) {
              if (uStack0000000000000040 == 2) {
                if ((in_stack_00000008 & 1) != 0) {
                  func_0x005656ec((ulong)&uStack0000000000000040 | 8);
                }
              }
              else if (uStack0000000000000040 == 3) {
                if ((in_stack_00000008 & 0x100000000) != 0) {
                  func_0x00565938((ulong)&uStack0000000000000040 | 8);
                }
              }
              else {
                func_0x005649d4(&uStack0000000000000040);
              }
            }
            return 1;
          }
          func_0x007a1f18(8,0x28);
          goto code_r0x0056cb80;
        }
      }
      func_0x007a23bc(&UNK_009eedb8);
      goto code_r0x0056cb80;
    }
  }
  func_0x007a23bc(&UNK_009eeda0);
code_r0x0056cb80:
                    /* WARNING: Does not return */
  pcVar3 = (code *)SoftwareBreakpoint(1,0x56cb84);
  (*pcVar3)();
}

