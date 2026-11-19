/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0082062c
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0082062c(undefined8 param_1)

{
  long lVar1;
  undefined4 uVar2;
  undefined4 uVar3;
  int iVar4;
  undefined8 *puVar5;
  long *plVar6;
  long lVar7;
  code *pcVar8;
  undefined1 *puVar9;
  code *local_40;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  if (((DAT_00d1cb10 & 1) == 0) && (iVar4 = __cxa_guard_acquire(&DAT_00d1cb10), iVar4 != 0)) {
    DAT_00d1cb08 = '\x01';
    DAT_00d1cb00 = 0x81d40bf203259aa4;
    __cxa_atexit(&LAB_008240d8,&DAT_00d1cb00,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1cb10);
  }
  if (DAT_00d1cb08 == '\x01') {
    DAT_00d1cb08 = '\0';
    DAT_00d1cb00 = DAT_00d1cb00 ^ 0x81bb7b975151ffc3;
  }
  FUN_008ac76c(param_1,FUN_0082112c,&DAT_00d1cb00,0,0);
  puVar5 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_40 = (code *)*puVar5;
  FUN_00807f14(&DAT_00d1ca50,&local_40,&local_40);
  local_40 = FUN_0082112c;
  FUN_0080837c(&DAT_00cca848,&local_40,&local_40);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1cb00);
  if (((DAT_00d1cf50 & 1) == 0) && (iVar4 = __cxa_guard_acquire(&DAT_00d1cf50), iVar4 != 0)) {
    DAT_00d1cf48 = '\x01';
    DAT_00d1cf40 = 0xb93340b402ae6e91;
    __cxa_atexit(&LAB_00827614,&DAT_00d1cf40,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1cf50);
  }
  if (DAT_00d1cf48 == '\x01') {
    DAT_00d1cf48 = '\0';
    DAT_00d1cf40 = DAT_00d1cf40 ^ 0xb94733d177df0be3;
  }
  FUN_008ac76c(param_1,FUN_00821414,&DAT_00d1cf40,0,0);
  uVar2 = FUN_008aa984(param_1);
  if (((DAT_00d1cf68 & 1) == 0) && (iVar4 = __cxa_guard_acquire(&DAT_00d1cf68), iVar4 != 0)) {
    DAT_00d1cf60 = '\x01';
    DAT_00d1cf58 = 0x436b1e56b4768845;
    __cxa_atexit(&LAB_0082761c,&DAT_00d1cf58,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1cf68);
  }
  if (DAT_00d1cf60 == '\x01') {
    DAT_00d1cf60 = '\0';
    DAT_00d1cf58 = DAT_00d1cf58 ^ 0x431f6d33c107ed37;
  }
  if (((DAT_00d1cf80 & 1) == 0) && (iVar4 = __cxa_guard_acquire(&DAT_00d1cf80), iVar4 != 0)) {
    DAT_00d1cf70 = 0x327a1f6cb173995f;
    DAT_00d1cf78 = 0xb5748842;
    _DAT_00d1cf7c = 0x133;
    __cxa_atexit(&LAB_00827624,&DAT_00d1cf70,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1cf80);
  }
  if (DAT_00d1cf7d == '\x01') {
    _DAT_00d1cf7c = (ushort)(DAT_00d1cf7c ^ 0x33);
    DAT_00d1cf70 = DAT_00d1cf70 ^ 0x431f6d33c107ed37;
    DAT_00d1cf78 = DAT_00d1cf78 ^ 0xc107ed37;
  }
  uVar3 = FUN_008aa958(param_1,uVar2);
  FUN_008aaf04(param_1,uVar3);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1cf58);
  FUN_008aaf04(param_1,uVar3);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1cf70);
  FUN_008ad0b0(param_1,0,0);
  if (((DAT_00d1cf98 & 1) == 0) && (iVar4 = __cxa_guard_acquire(&DAT_00d1cf98), iVar4 != 0)) {
    DAT_00d1cf90 = '\x01';
    DAT_00d1cf88 = 0x57bdd67ed2be2a97;
    __cxa_atexit(&LAB_00827630,&DAT_00d1cf88,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1cf98);
  }
  if (DAT_00d1cf90 == '\x01') {
    DAT_00d1cf90 = '\0';
    DAT_00d1cf88 = DAT_00d1cf88 ^ 0x57c9a51ba7cf4fe5;
  }
  uVar3 = FUN_008aa958(param_1,uVar2);
  FUN_008aaf04(param_1,uVar3);
  FUN_008ad800(param_1,0xfffffffe,&DAT_00d1cf88);
  if (((DAT_00d1cfa8 & 1) == 0) && (iVar4 = __cxa_guard_acquire(&DAT_00d1cfa8), iVar4 != 0)) {
    DAT_00d1cfa4 = '\x01';
    DAT_00d1cfa0 = 0xa32b4ea4;
    __cxa_atexit(&LAB_00827638,&DAT_00d1cfa0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1cfa8);
  }
  if (DAT_00d1cfa4 == '\x01') {
    DAT_00d1cfa4 = '\0';
    DAT_00d1cfa0 = DAT_00d1cfa0 ^ 0xa34537d7;
  }
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1cfa0);
  FUN_008ad0b0(param_1,0,0);
  if (((DAT_00d1cfc0 & 1) == 0) && (iVar4 = __cxa_guard_acquire(&DAT_00d1cfc0), iVar4 != 0)) {
    DAT_00d1cfb8 = '\x01';
    DAT_00d1cfb0 = 0xbd07aae09e5260e5;
    __cxa_atexit(&LAB_00827640,&DAT_00d1cfb0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1cfc0);
  }
  if (DAT_00d1cfb8 == '\x01') {
    DAT_00d1cfb8 = '\0';
    DAT_00d1cfb0 = DAT_00d1cfb0 ^ 0xbd73d985eb230597;
  }
  uVar2 = FUN_008aa958(param_1,uVar2);
  FUN_008aaf04(param_1,uVar2);
  FUN_008ad800(param_1,0xfffffffe,&DAT_00d1cfb0);
  if (((DAT_00d1cfd0 & 1) == 0) && (iVar4 = __cxa_guard_acquire(&DAT_00d1cfd0), iVar4 != 0)) {
    _DAT_00d1cfcc = 0x1e3;
    DAT_00d1cfc8 = 0x5f9d8943;
    __cxa_atexit(&LAB_00827648,&DAT_00d1cfc8,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1cfd0);
  }
  if (DAT_00d1cfcd == '\x01') {
    _DAT_00d1cfcc = (ushort)(DAT_00d1cfcc ^ 0xe3);
    DAT_00d1cfc8 = DAT_00d1cfc8 ^ 0x2fe9fd2b;
  }
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1cfc8);
  FUN_008aa994(param_1,0xfffffffe);
  if (((DAT_00d1cfe0 & 1) == 0) && (iVar4 = __cxa_guard_acquire(&DAT_00d1cfe0), iVar4 != 0)) {
    _DAT_00d1cfdc = 0x10b;
    DAT_00d1cfd8 = 0x5444704c;
    __cxa_atexit(&LAB_00827654,&DAT_00d1cfd8,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1cfe0);
  }
  if (DAT_00d1cfdd == '\x01') {
    _DAT_00d1cfdc = (ushort)(DAT_00d1cfdc ^ 0xb);
    DAT_00d1cfd8 = DAT_00d1cfd8 ^ 0x3129112b;
  }
  FUN_008acba4(param_1,0xffffd8ee,&DAT_00d1cfd8);
  iVar4 = FUN_008ab45c(param_1,0xffffffff);
  if (iVar4 != 0) {
    DAT_00d1ca98 = FUN_008abd78(param_1,0xffffffff);
  }
  if ((DAT_00d1ca98 != 0) && (iVar4 = FUN_008ad4b0(param_1,0xffffffff), iVar4 != 0)) {
    if (((DAT_00d1cff8 & 1) == 0) && (iVar4 = __cxa_guard_acquire(&DAT_00d1cff8), iVar4 != 0)) {
      DAT_00d1cfe8 = 0x76b22800fa33b670;
      _DAT_00d1cff0 = 0x15d8543;
      __cxa_atexit(&LAB_00827660,&DAT_00d1cfe8,&PTR_LOOP_00c48880);
      __cxa_guard_release(&DAT_00d1cff8);
    }
    if (DAT_00d1cff3 == '\x01') {
      DAT_00d1cfe8 = DAT_00d1cfe8 ^ 0x17d14d6d9b5de92f;
      _DAT_00d1cff0 = _DAT_00d1cff0 & 0xffffff ^ 0x5de92f;
    }
    FUN_008acba4(param_1,0xffffffff,&DAT_00d1cfe8);
    iVar4 = FUN_008ab238(param_1,0xffffffff);
    if (iVar4 != 0) {
      plVar6 = (long *)FUN_008aa2e4(param_1,0xffffffff);
      lVar7 = *plVar6;
      if (((lVar7 != 0) && (*(char *)(lVar7 + 6) != '\0')) &&
         (pcVar8 = *(code **)(lVar7 + 0x28), pcVar8 != FUN_00823c6c)) {
        *(code **)(lVar7 + 0x28) = FUN_00823c6c;
        DAT_00d1caa0 = pcVar8;
      }
    }
    FUN_008aa994(param_1,0xfffffffd);
  }
  FUN_008aa994(param_1,0xfffffffe);
  if (((DAT_00d1d0d8 & 1) == 0) && (iVar4 = __cxa_guard_acquire(&DAT_00d1d0d8), iVar4 != 0)) {
    _DAT_00d1d0d4 = 0x1ff;
    DAT_00d1d0d0 = 0xdaca0004;
    __cxa_atexit(&LAB_00828b9c,&DAT_00d1d0d0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1d0d8);
  }
  if (DAT_00d1d0d5 == '\x01') {
    _DAT_00d1d0d4 = (ushort)(byte)~DAT_00d1d0d4;
    DAT_00d1d0d0 = DAT_00d1d0d0 ^ 0xbfa76163;
  }
  FUN_008acba4(param_1,0xffffd8ee,&DAT_00d1d0d0);
  if ((DAT_00d1ca98 != 0) && (iVar4 = FUN_008ad4b0(param_1,0xffffffff), iVar4 != 0)) {
    if (((DAT_00d1d0f0 & 1) == 0) && (iVar4 = __cxa_guard_acquire(&DAT_00d1d0f0), iVar4 != 0)) {
      DAT_00d1d0e8 = '\x01';
      DAT_00d1d0e0 = 0x1d6196ebc35c7410;
      __cxa_atexit(&LAB_00828ba8,&DAT_00d1d0e0,&PTR_LOOP_00c48880);
      __cxa_guard_release(&DAT_00d1d0f0);
    }
    if (DAT_00d1d0e8 == '\x01') {
      DAT_00d1d0e8 = '\0';
      DAT_00d1d0e0 = DAT_00d1d0e0 ^ 0x1d19f38fad352b4f;
    }
    FUN_008acba4(param_1,0xffffffff,&DAT_00d1d0e0);
    iVar4 = FUN_008ab238(param_1,0xffffffff);
    if (iVar4 != 0) {
      plVar6 = (long *)FUN_008aa2e4(param_1,0xffffffff);
      lVar7 = *plVar6;
      if (((lVar7 != 0) && (*(char *)(lVar7 + 6) != '\0')) &&
         (puVar9 = *(undefined1 **)(lVar7 + 0x28), puVar9 != &LAB_00823e94)) {
        *(undefined1 **)(lVar7 + 0x28) = &LAB_00823e94;
        DAT_00d1caa8 = puVar9;
      }
    }
    FUN_008aa994(param_1,0xfffffffd);
  }
  FUN_008aa994(param_1,0xfffffffe);
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

