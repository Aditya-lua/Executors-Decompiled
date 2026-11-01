
/* WARNING: Removing unreachable block (ram,0x00496034) */
/* WARNING: Removing unreachable block (ram,0x00495db4) */
/* WARNING: Removing unreachable block (ram,0x00495db8) */
/* WARNING: Removing unreachable block (ram,0x00495b58) */
/* WARNING: Removing unreachable block (ram,0x00495e88) */
/* WARNING: Removing unreachable block (ram,0x004963bc) */

void FUN_00495928(undefined8 *param_1)

{
  undefined8 uVar1;
  code *pcVar2;
  undefined8 *puVar3;
  long unaff_x19;
  long unaff_x22;
  long unaff_x26;
  undefined8 uVar4;
  long in_stack_00000008;
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
  
  *(undefined8 *)(unaff_x19 + 0x24c) = *param_1;
  if (lRam0000000000a3c048 != 3) {
    func_0x007a4acc(0xa3c048);
  }
  uVar1 = uRam0000000000a3c060;
  uVar4 = uRam0000000000a3c058;
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
    uVar1 = uRam0000000000a3c080;
    uVar4 = uRam0000000000a3c078;
    _memcpy(auStack_7ffffffe + 0x8000059e,auStack_7ffffffe + 0x80000b4e,600);
    puVar3 = (undefined8 *)func_0x00187bd0(0x10,8);
    if (puVar3 != (undefined8 *)0x0) {
      *puVar3 = uVar4;
      puVar3[1] = uVar1;
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
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x496694);
  (*pcVar2)();
}

