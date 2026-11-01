
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 * FUN_0051bbc8(void)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined1 uVar4;
  undefined1 uVar5;
  undefined1 uVar6;
  undefined1 uVar7;
  undefined1 uVar8;
  code *pcVar9;
  undefined8 *puVar10;
  undefined1 in_w8;
  undefined8 *unaff_x20;
  undefined8 *unaff_x21;
  long unaff_x22;
  long unaff_x28;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined7 uStack0000000000000039;
  undefined7 uStack0000000000000041;
  undefined7 uStack0000000000000049;
  undefined8 in_stack_00000058;
  undefined7 uStack0000000000000061;
  undefined7 uStack0000000000000069;
  undefined7 uStack0000000000000071;
  undefined8 in_stack_00000080;
  undefined7 uStack0000000000000089;
  undefined1 uStack0000000000000090;
  undefined7 uStack0000000000000091;
  undefined8 uStack00000000000000a0;
  undefined7 uStack00000000000000a8;
  undefined1 uStack00000000000000af;
  undefined7 uStack00000000000000b0;
  undefined1 uStack00000000000000b7;
  undefined7 uStack00000000000000b8;
  undefined1 uStack00000000000000bf;
  undefined8 in_stack_000000c0;
  undefined8 in_stack_000000c8;
  undefined8 in_stack_000000d0;
  undefined8 in_stack_000000d8;
  undefined8 in_stack_000000e0;
  undefined8 in_stack_000000e8;
  undefined1 uStack00000000000000f0;
  undefined7 uStack00000000000000f1;
  undefined1 uStack00000000000000f8;
  undefined7 uStack00000000000000f9;
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
  undefined4 uStack0000000000000170;
  undefined4 uStack0000000000000174;
  undefined2 uStack0000000000000178;
  undefined6 uStack000000000000017a;
  
  uVar1 = _uStack0000000000000170;
  uStack0000000000000170 = CONCAT31(uStack0000000000000170._1_3_,in_w8);
  uStack0000000000000174 = CONCAT31(SUB83(uVar1,5),in_w8);
  uStack0000000000000178 = 0;
  *(int *)(unaff_x28 + 0xda) = (int)_UNK_008a6af8;
  puVar10 = (undefined8 *)func_0x00187bd0(0xe0,8);
  if (puVar10 == (undefined8 *)0x0) {
    func_0x007a1f18(8,0xe0);
                    /* WARNING: Does not return */
    pcVar9 = (code *)SoftwareBreakpoint(1,0x51bd80);
    (*pcVar9)();
  }
  puVar10[0x15] = in_stack_00000148;
  puVar10[0x14] = in_stack_00000140;
  puVar10[0x17] = in_stack_00000158;
  puVar10[0x16] = in_stack_00000150;
  puVar10[0x19] = in_stack_00000168;
  puVar10[0x18] = in_stack_00000160;
  puVar10[0x1b] = CONCAT62(uStack000000000000017a,uStack0000000000000178);
  puVar10[0x1a] = CONCAT44(uStack0000000000000174,uStack0000000000000170);
  puVar10[0xd] = in_stack_00000108;
  puVar10[0xc] = in_stack_00000100;
  puVar10[0xf] = in_stack_00000118;
  puVar10[0xe] = in_stack_00000110;
  puVar10[0x11] = in_stack_00000128;
  puVar10[0x10] = in_stack_00000120;
  puVar10[0x13] = in_stack_00000138;
  puVar10[0x12] = in_stack_00000130;
  puVar10[5] = in_stack_000000c8;
  puVar10[4] = in_stack_000000c0;
  puVar10[7] = in_stack_000000d8;
  puVar10[6] = in_stack_000000d0;
  puVar10[9] = in_stack_000000e8;
  puVar10[8] = in_stack_000000e0;
  puVar10[0xb] = CONCAT71(uStack00000000000000f9,uStack00000000000000f8);
  puVar10[10] = CONCAT71(uStack00000000000000f1,uStack00000000000000f0);
  puVar10[1] = CONCAT17(uStack00000000000000af,uStack00000000000000a8);
  *puVar10 = CONCAT17(uStack00000000000000a0._7_1_,
                      CONCAT61(uStack00000000000000a0._1_6_,(undefined1)uStack00000000000000a0));
  puVar10[3] = CONCAT17(uStack00000000000000bf,uStack00000000000000b8);
  puVar10[2] = CONCAT17(uStack00000000000000b7,uStack00000000000000b0);
  func_0x0051ab00();
  uStack00000000000000af = (undefined1)unaff_x21[1];
  uVar7 = uStack00000000000000af;
  uStack00000000000000b0 = (undefined7)((ulong)unaff_x21[1] >> 8);
  uStack0000000000000049 = uStack00000000000000b0;
  uStack00000000000000a0._7_1_ = (undefined1)*unaff_x21;
  uVar5 = uStack00000000000000a0._7_1_;
  uStack00000000000000a8 = (undefined7)((ulong)*unaff_x21 >> 8);
  *(undefined8 *)(unaff_x28 + 0x17) = unaff_x21[2];
  uStack0000000000000039 = CONCAT61(uStack00000000000000a0._1_6_,(undefined1)uStack00000000000000a0)
  ;
  uStack0000000000000041 = uStack00000000000000a8;
  uVar2 = CONCAT71(uStack00000000000000b8,uStack00000000000000b7);
  uStack00000000000000af = (undefined1)unaff_x20[1];
  uVar8 = uStack00000000000000af;
  uStack00000000000000b0 = (undefined7)((ulong)unaff_x20[1] >> 8);
  uStack00000000000000a0._7_1_ = (undefined1)*unaff_x20;
  uVar6 = uStack00000000000000a0._7_1_;
  uStack00000000000000a8 = (undefined7)((ulong)*unaff_x20 >> 8);
  *(undefined8 *)(unaff_x28 + 0x17) = unaff_x20[2];
  uStack0000000000000061 = CONCAT61(uStack00000000000000a0._1_6_,(undefined1)uStack00000000000000a0)
  ;
  uStack0000000000000069 = uStack00000000000000a8;
  uVar3 = CONCAT71(uStack00000000000000b8,uStack00000000000000b7);
  uStack0000000000000071 = uStack00000000000000b0;
  func_0x004e7858(&uStack00000000000000a0);
  uVar4 = (undefined1)uStack00000000000000a0;
  uStack0000000000000090 = (undefined1)uStack00000000000000a8;
  uStack0000000000000091 =
       (undefined7)(CONCAT17(uStack00000000000000af,uStack00000000000000a8) >> 8);
  uStack0000000000000089 =
       (undefined7)
       (CONCAT17(uStack00000000000000a0._7_1_,
                 CONCAT61(uStack00000000000000a0._1_6_,(undefined1)uStack00000000000000a0)) >> 8);
  uVar1 = CONCAT17(uStack00000000000000b7,uStack00000000000000b0);
  uStack00000000000000a8 = (undefined7)CONCAT71(uStack0000000000000039,2);
  uStack00000000000000af = (undefined1)((uint7)uStack0000000000000039 >> 0x30);
  uStack00000000000000a0._0_1_ = 1;
  uStack00000000000000a0._1_6_ = (undefined6)((ulong)in_stack_00000030 >> 8);
  uStack00000000000000a0._7_1_ = (undefined1)((ulong)in_stack_00000030 >> 0x38);
  uStack00000000000000b8 = (undefined7)CONCAT71(uStack0000000000000049,uVar7);
  uStack00000000000000bf = (undefined1)((uint7)uStack0000000000000049 >> 0x30);
  uStack00000000000000b0 = (undefined7)CONCAT71(uStack0000000000000041,uVar5);
  uStack00000000000000b7 = (undefined1)((uint7)uStack0000000000000041 >> 0x30);
  *(ulong *)(unaff_x28 + 0x30) = CONCAT71(uStack0000000000000061,2);
  *(ulong *)(unaff_x28 + 0x28) = CONCAT71(in_stack_00000058._1_7_,5);
  *(ulong *)(unaff_x28 + 0x40) = CONCAT71(uStack0000000000000071,uVar8);
  *(ulong *)(unaff_x28 + 0x38) = CONCAT71(uStack0000000000000069,uVar6);
  uStack00000000000000f0 = 4;
  uStack00000000000000f8 = 3;
  *(undefined8 *)(unaff_x28 + 0x70) = uVar1;
  *(ulong *)(unaff_x28 + 0x68) = CONCAT71(uStack0000000000000091,uStack0000000000000090);
  *(ulong *)(unaff_x28 + 0x61) = CONCAT17(uStack0000000000000090,uStack0000000000000089);
  *(ulong *)(unaff_x28 + 0x59) = CONCAT17(uVar4,in_stack_00000080._1_7_);
  in_stack_000000c0 = uVar2;
  in_stack_000000e8 = uVar3;
  func_0x0051b138(puVar10,&uStack00000000000000a0);
  if (unaff_x22 != -0x8000000000000000) {
    uStack00000000000000a8 = (undefined7)unaff_x22;
    uStack00000000000000af = (undefined1)((ulong)unaff_x22 >> 0x38);
    uStack00000000000000b0 = (undefined7)in_stack_00000028;
    uStack00000000000000b7 = (undefined1)((ulong)in_stack_00000028 >> 0x38);
    uStack00000000000000b8 = (undefined7)in_stack_00000020;
    uStack00000000000000bf = (undefined1)((ulong)in_stack_00000020 >> 0x38);
    uStack00000000000000a0._0_1_ = 2;
    func_0x0051b078(puVar10,0xc,&uStack00000000000000a0);
  }
  return puVar10;
}

