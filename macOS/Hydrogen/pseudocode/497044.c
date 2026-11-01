
/* WARNING: Removing unreachable block (ram,0x004978d8) */
/* WARNING: Removing unreachable block (ram,0x00497644) */
/* WARNING: Removing unreachable block (ram,0x00497648) */
/* WARNING: Removing unreachable block (ram,0x004973e8) */
/* WARNING: Removing unreachable block (ram,0x00497718) */
/* WARNING: Removing unreachable block (ram,0x00497c64) */

void FUN_00497044(long param_1,undefined1 param_2 [16])

{
  undefined8 uVar1;
  code *pcVar2;
  undefined8 *puVar3;
  long unaff_x22;
  long unaff_x26;
  undefined8 uVar4;
  long in_stack_00000008;
  undefined1 uStack00000000000000f0;
  long in_stack_000002d8;
  undefined8 in_stack_000002e0;
  long in_stack_00000530;
  undefined8 in_stack_00000538;
  undefined8 in_stack_000005b8;
  undefined8 in_stack_000005c0;
  undefined8 in_stack_000005d0;
  undefined8 in_stack_000005f8;
  undefined8 in_stack_00000600;
  undefined8 in_stack_00000898;
  undefined8 in_stack_000008a0;
  undefined8 in_stack_000008d8;
  undefined8 in_stack_000008e0;
  long in_stack_000009f0;
  undefined8 in_stack_000009f8;
  long in_stack_00000a80;
  undefined8 in_stack_00000a88;
  undefined8 in_stack_00000af0;
  undefined8 in_stack_00000af8;
  undefined8 in_stack_00000b00;
  undefined8 in_stack_00000b08;
  undefined8 in_stack_00000b10;
  undefined8 in_stack_00000b18;
  undefined8 in_stack_00000b20;
  undefined8 in_stack_00000b28;
  undefined8 in_stack_00000b30;
  undefined8 in_stack_00000b38;
  undefined8 in_stack_00000b40;
  undefined1 auStack_7ffffffe [2147483646];
  
  *(long *)(param_1 + 0x250) = param_2._8_8_;
  *(long *)(param_1 + 0x248) = param_2._0_8_;
  puVar3 = (undefined8 *)func_0x00187bd0(8,8);
  if (puVar3 == (undefined8 *)0x0) {
    func_0x007a1f18(8,8);
  }
  else {
    *puVar3 = &DAT_00492248;
    func_0x0049fe30(auStack_7ffffffe + 0x8000087e,auStack_7ffffffe + 0x80000dae,
                    auStack_7ffffffe + 0x80000b4e);
    _memcpy(&uStack00000000000000f0,auStack_7ffffffe + 0x8000087e,600);
    func_0x005124f4(auStack_7ffffffe + 0x8000087e,&UNK_0089f133,0x28);
    if ((in_stack_000002d8 != -0x8000000000000000) && (in_stack_000002d8 != 0)) {
      func_0x00187bd4(in_stack_000002e0,in_stack_000002d8,1);
    }
    _memcpy(auStack_7ffffffe + 0x8000087e,&uStack00000000000000f0,600);
    func_0x0050fe50(auStack_7ffffffe + 0x80000dae,0);
    if ((in_stack_00000a80 != -0x8000000000000000) && (in_stack_00000a80 != 0)) {
      func_0x00187bd4(in_stack_00000a88,in_stack_00000a80,1);
    }
    _memcpy(auStack_7ffffffe + 0x80000b4e,auStack_7ffffffe + 0x8000087e,0x228);
    if (lRam0000000000a3c088 != 3) {
      func_0x007a4a54(0xa3c088);
    }
    uVar1 = uRam0000000000a3c0a0;
    uVar4 = uRam0000000000a3c098;
    _memcpy(auStack_7ffffffe + 0x8000087e,auStack_7ffffffe + 0x80000b4e,600);
    puVar3 = (undefined8 *)func_0x00187bd0(0x10,8);
    if (puVar3 == (undefined8 *)0x0) {
      func_0x007a1f00(8,0x10,&UNK_009e20d0);
    }
    else {
      *puVar3 = uVar4;
      puVar3[1] = uVar1;
      if (in_stack_000009f0 != 0) {
        func_0x00187bd4(in_stack_000009f8,in_stack_000009f0 << 4,8);
      }
      _memcpy(auStack_7ffffffe + 0x80000dae,auStack_7ffffffe + 0x8000087e,0x250);
      func_0x004fe4a4(auStack_7ffffffe + 0x8000059e,auStack_7ffffffe + 0x80000dae);
      _memcpy(auStack_7ffffffe + 0x8000087e,auStack_7ffffffe + 0x8000059e,0x2c8);
      func_0x0048fb5c(auStack_7ffffffe + 0x80000b4e,auStack_7ffffffe + 0x80000dae,&UNK_009e2ee8);
      *(undefined8 *)(unaff_x22 + 0x20) = in_stack_000005c0;
      *(undefined8 *)(unaff_x22 + 0x18) = in_stack_000005b8;
      *(undefined8 *)(unaff_x22 + 0x60) = in_stack_00000600;
      *(undefined8 *)(unaff_x22 + 0x58) = in_stack_000005f8;
      *(undefined8 *)(unaff_x22 + 0x80) = 0;
      *(undefined8 *)(unaff_x22 + 0x78) = 0;
      *(undefined8 *)(unaff_x22 + 0xb0) = 0;
      *(undefined8 *)(unaff_x22 + 0xa8) = 0;
      *(undefined8 *)(unaff_x22 + 0xe0) = 0;
      *(undefined8 *)(unaff_x22 + 0xd8) = 0;
      *(undefined8 *)(unaff_x22 + 0x30) = in_stack_000005d0;
      *(undefined8 *)(unaff_x22 + 0x28) = 0;
      func_0x0052ea68(auStack_7ffffffe + 0x80000b4e);
      func_0x0049ff0c(auStack_7ffffffe + 0x8000059e,auStack_7ffffffe + 0x80000dae,
                      auStack_7ffffffe + 0x80000b4e);
      _memcpy(auStack_7ffffffe + 0x80000346,auStack_7ffffffe + 0x8000059e,600);
      func_0x005124f4(auStack_7ffffffe + 0x8000059e,&UNK_0089f15e,0x37);
      if ((in_stack_00000530 != -0x8000000000000000) && (in_stack_00000530 != 0)) {
        func_0x00187bd4(in_stack_00000538,in_stack_00000530,1);
      }
      _memcpy(auStack_7ffffffe + 0x8000059e,auStack_7ffffffe + 0x80000346,600);
      func_0x0050fe50(auStack_7ffffffe + 0x80000dae,0);
      _memcpy(auStack_7ffffffe + 0x80000b4e,auStack_7ffffffe + 0x8000059e,0x228);
      if (lRam0000000000a3c0a8 != 3) {
        func_0x007a4a18(0xa3c0a8);
      }
      uVar1 = uRam0000000000a3c0c0;
      uVar4 = uRam0000000000a3c0b8;
      _memcpy(auStack_7ffffffe + 0x8000059e,auStack_7ffffffe + 0x80000b4e,600);
      puVar3 = (undefined8 *)func_0x00187bd0(0x10,8);
      if (puVar3 != (undefined8 *)0x0) {
        *puVar3 = uVar4;
        puVar3[1] = uVar1;
        _memcpy(auStack_7ffffffe + 0x80000dae,auStack_7ffffffe + 0x8000059e,0x250);
        func_0x004fe4a4(auStack_7ffffffe + 0x8000087e,auStack_7ffffffe + 0x80000dae);
        _memcpy(auStack_7ffffffe + 0x8000059e,auStack_7ffffffe + 0x8000087e,0x2c8);
        func_0x0048fb5c(auStack_7ffffffe + 0x80000b4e,auStack_7ffffffe + 0x80000dae,&UNK_009e2ee8);
        *(undefined8 *)(unaff_x22 + 0x20) = in_stack_000008a0;
        *(undefined8 *)(unaff_x22 + 0x18) = in_stack_00000898;
        *(undefined8 *)(unaff_x22 + 0x60) = in_stack_000008e0;
        *(undefined8 *)(unaff_x22 + 0x58) = in_stack_000008d8;
        *(undefined8 *)(unaff_x22 + 0x80) = 0;
        *(undefined8 *)(unaff_x22 + 0x78) = 0;
        *(undefined8 *)(unaff_x22 + 0xb0) = 0;
        *(undefined8 *)(unaff_x22 + 0xa8) = 0;
        *(undefined8 *)(unaff_x22 + 0xe0) = 0;
        *(undefined8 *)(unaff_x22 + 0xd8) = 0;
        uVar4 = *(undefined8 *)(unaff_x26 + 0x40);
        *(undefined8 *)(unaff_x22 + 0x30) = *(undefined8 *)(unaff_x26 + 0x48);
        *(undefined8 *)(unaff_x22 + 0x28) = uVar4;
        func_0x0049fe30(auStack_7ffffffe + 0x8000087e,auStack_7ffffffe + 0x80000dae,
                        auStack_7ffffffe + 0x80000b4e);
        _memcpy(auStack_7ffffffe + 0x80000dae,auStack_7ffffffe + 0x8000087e,0x228);
        func_0x004fe4a4(auStack_7ffffffe + 0x8000059e,auStack_7ffffffe + 0x80000dae);
        _memcpy(auStack_7ffffffe + 0x8000087e,auStack_7ffffffe + 0x8000059e,0x2c8);
        func_0x0048fb5c(auStack_7ffffffe + 0x80000b4e,auStack_7ffffffe + 0x80000dae,&UNK_009e2ee8);
        *(undefined8 *)(unaff_x22 + 0x20) = in_stack_000005c0;
        *(undefined8 *)(unaff_x22 + 0x18) = in_stack_000005b8;
        *(undefined8 *)(unaff_x22 + 0x60) = in_stack_00000600;
        *(undefined8 *)(unaff_x22 + 0x58) = in_stack_000005f8;
        *(undefined8 *)(unaff_x22 + 0x80) = 0;
        *(undefined8 *)(unaff_x22 + 0x78) = 0;
        *(undefined8 *)(unaff_x22 + 0xb0) = 0;
        *(undefined8 *)(unaff_x22 + 0xa8) = 0;
        *(undefined8 *)(unaff_x22 + 0xe0) = 0;
        *(undefined8 *)(unaff_x22 + 0xd8) = 0;
        *(undefined8 *)(unaff_x22 + 0x30) = in_stack_000005d0;
        *(undefined8 *)(unaff_x22 + 0x28) = 0;
        func_0x0049fe30(auStack_7ffffffe + 0x80000b4e,auStack_7ffffffe + 0x80000dae,
                        auStack_7ffffffe + 0x80000866);
        _memcpy(auStack_7ffffffe + 0x8000059e,auStack_7ffffffe + 0x80000b4e,0x228);
        func_0x004fe4a4(auStack_7ffffffe + 0x8000087e,auStack_7ffffffe + 0x8000059e);
        _memcpy(in_stack_00000008,auStack_7ffffffe + 0x8000087e,0x260);
        *(undefined8 *)(in_stack_00000008 + 0x298) = in_stack_00000b18;
        *(undefined8 *)(in_stack_00000008 + 0x290) = in_stack_00000b10;
        *(undefined8 *)(in_stack_00000008 + 0x2a8) = in_stack_00000b28;
        *(undefined8 *)(in_stack_00000008 + 0x2a0) = in_stack_00000b20;
        *(undefined8 *)(in_stack_00000008 + 0x2b8) = in_stack_00000b38;
        *(undefined8 *)(in_stack_00000008 + 0x2b0) = in_stack_00000b30;
        *(undefined8 *)(in_stack_00000008 + 0x2c0) = in_stack_00000b40;
        *(undefined8 *)(in_stack_00000008 + 0x278) = in_stack_00000af8;
        *(undefined8 *)(in_stack_00000008 + 0x270) = in_stack_00000af0;
        *(undefined8 *)(in_stack_00000008 + 0x288) = in_stack_00000b08;
        *(undefined8 *)(in_stack_00000008 + 0x280) = in_stack_00000b00;
        *(undefined **)(in_stack_00000008 + 0x260) = &UNK_0089f1a5;
        *(undefined8 *)(in_stack_00000008 + 0x268) = 5;
        return;
      }
      func_0x007a1f00(8,0x10,&UNK_009e20d0);
    }
  }
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x497f40);
  (*pcVar2)();
}

