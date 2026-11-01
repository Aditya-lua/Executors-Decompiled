
undefined * FUN_007920fc(undefined8 param_1,undefined8 param_2,undefined4 *param_3)

{
  int iVar1;
  undefined8 uVar2;
  undefined *puVar3;
  undefined8 uVar4;
  undefined4 uVar5;
  undefined4 uVar6;
  long lVar7;
  long unaff_x29;
  undefined1 auStack_168 [8];
  undefined *puStack_160;
  undefined1 auStack_158 [16];
  undefined1 auStack_148 [256];
  long lStack_48;
  
  func_0x0073c9e4();
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return (undefined *)0x1c;
  }
  auStack_158 = ___stack_chk_fail();
  uVar4 = auStack_158._8_8_;
  lStack_48 = *(long *)PTR____stack_chk_guard_009b01e8;
  lVar7 = *(long *)(*(long *)(auStack_158._0_8_ + 0x10) + 0x40);
  puStack_160 = (undefined *)0x0;
  uVar2 = func_0x00172474(*(undefined8 *)(lVar7 + 8),&DAT_00792bec,auStack_158,&puStack_160);
  if ((int)uVar2 == 0) {
    uVar2 = func_0x001728a0(*(undefined8 *)(lVar7 + 8));
    if ((int)uVar2 == 7000) {
      *(byte *)(lVar7 + 0x18) = *(byte *)(lVar7 + 0x18) | 1;
      *param_3 = 0;
      puVar3 = puStack_160;
      goto code_r0x00792bb0;
    }
    func_0x0017816c(uVar2,auStack_148,0xff,auStack_168);
    func_0x0073c9e4(uVar4,"rustls_connection_process_new_packets: %.*s");
    iVar1 = func_0x00178d78(uVar2);
    uVar6 = 0x2b;
    if ((int)uVar2 != 0x1b5a) {
      uVar6 = 0x38;
    }
    uVar5 = 0x3c;
    if (iVar1 == 0) {
      uVar5 = uVar6;
    }
  }
  else if ((int)uVar2 == 0x23) {
    uVar5 = 0x51;
  }
  else {
    func_0x0077ea88(uVar2,auStack_148,0x100);
    func_0x0073c9e4(uVar4,"reading from socket: %s");
    uVar5 = 0x38;
  }
  *param_3 = uVar5;
  puVar3 = (undefined *)0xffffffffffffffff;
code_r0x00792bb0:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_48) {
    return puVar3;
  }
  ___stack_chk_fail(puVar3);
  return &UNK_00001b58;
}

