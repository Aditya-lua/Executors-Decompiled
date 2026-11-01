
/* WARNING: Removing unreachable block (ram,0x00496034) */
/* WARNING: Removing unreachable block (ram,0x00495db4) */
/* WARNING: Removing unreachable block (ram,0x00495db8) */
/* WARNING: Removing unreachable block (ram,0x00495b58) */
/* WARNING: Removing unreachable block (ram,0x004959ac) */
/* WARNING: Removing unreachable block (ram,0x00495658) */
/* WARNING: Removing unreachable block (ram,0x004958d8) */
/* WARNING: Removing unreachable block (ram,0x004958dc) */
/* WARNING: Removing unreachable block (ram,0x00495e88) */
/* WARNING: Removing unreachable block (ram,0x004963bc) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0049540c(void)

{
  undefined8 uVar1;
  undefined8 uVar2;
  code *pcVar3;
  undefined8 *puVar4;
  long unaff_x22;
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
  undefined8 in_stack_000008b0;
  undefined8 in_stack_000008d8;
  undefined8 in_stack_000008e0;
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
  
  *(undefined1 *)(unaff_x22 + 0x254) = 9;
  func_0x0049fe30(auStack_7ffffffe + 0x8000059e,auStack_7ffffffe + 0x80000dae,
                  auStack_7ffffffe + 0x80000b4e);
  _memcpy(auStack_7ffffffe + 0x80000dae,auStack_7ffffffe + 0x8000059e,600);
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
  *(undefined8 *)(unaff_x22 + 0x30) = in_stack_000008b0;
  *(undefined8 *)(unaff_x22 + 0x28) = 0;
  puVar4 = (undefined8 *)func_0x00187bd0(8,8);
  if (puVar4 == (undefined8 *)0x0) {
    func_0x007a1f18(8,8);
  }
  else {
    *puVar4 = &DAT_00492248;
    func_0x0049fe30(auStack_7ffffffe + 0x8000087e,auStack_7ffffffe + 0x80000dae,
                    auStack_7ffffffe + 0x80000b4e);
    _memcpy(&uStack00000000000000f0,auStack_7ffffffe + 0x8000087e,600);
    func_0x005124f4(auStack_7ffffffe + 0x8000087e,&UNK_0089f133,0x28);
    if ((in_stack_000002d8 != -0x8000000000000000) && (in_stack_000002d8 != 0)) {
      func_0x00187bd4(in_stack_000002e0,in_stack_000002d8,1);
    }
    _memcpy(auStack_7ffffffe + 0x8000087e,&uStack00000000000000f0,600);
    func_0x0050fe50(auStack_7ffffffe + 0x80000dae,0);
    _memcpy(auStack_7ffffffe + 0x80000b4e,auStack_7ffffffe + 0x8000087e,0x228);
    if (lRam0000000000a3c048 != 3) {
      func_0x007a4acc(0xa3c048);
    }
    uVar2 = uRam0000000000a3c060;
    uVar1 = uRam0000000000a3c058;
    _memcpy(auStack_7ffffffe + 0x8000087e,auStack_7ffffffe + 0x80000b4e,600);
    puVar4 = (undefined8 *)func_0x00187bd0(0x10,8);
    if (puVar4 == (undefined8 *)0x0) {
      func_0x007a1f00(8,0x10,&UNK_009e20d0);
    }
    else {
      *puVar4 = uVar1;
      puVar4[1] = uVar2;
      _memcpy(auStack_7ffffffe + 0x80000dae,auStack_7ffffffe + 0x8000087e,600);
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
      if (lRam0000000000a3c068 != 3) {
        func_0x007a4a90(0xa3c068);
      }
      uVar2 = uRam0000000000a3c080;
      uVar1 = uRam0000000000a3c078;
      _memcpy(auStack_7ffffffe + 0x8000059e,auStack_7ffffffe + 0x80000b4e,600);
      puVar4 = (undefined8 *)func_0x00187bd0(0x10,8);
      if (puVar4 != (undefined8 *)0x0) {
        *puVar4 = uVar1;
        puVar4[1] = uVar2;
        _memcpy(auStack_7ffffffe + 0x80000dae,auStack_7ffffffe + 0x8000059e,600);
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
        *(undefined8 *)(unaff_x22 + 0x30) = in_stack_000008b0;
        *(undefined8 *)(unaff_x22 + 0x28) = 0;
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
  pcVar3 = (code *)SoftwareBreakpoint(1,0x496694);
  (*pcVar3)();
}

