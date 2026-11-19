/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00808a1c
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00808a1c(undefined8 param_1)

{
  long lVar1;
  uint3 uVar2;
  int iVar3;
  undefined8 *puVar4;
  undefined1 *local_50;
  undefined8 uStack_48;
  undefined2 local_40;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  if (((DAT_00d1b5c8 & 1) == 0) && (iVar3 = __cxa_guard_acquire(&DAT_00d1b5c8), iVar3 != 0)) {
    DAT_00d1b5b8 = 0x12e785d0a5c49e81;
    _DAT_00d1b5c0 = 0x1a59683;
    __cxa_atexit(&LAB_0080c3d4,&DAT_00d1b5b8,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1b5c8);
  }
  if (DAT_00d1b5c3 == '\x01') {
    DAT_00d1b5b8 = DAT_00d1b5b8 ^ 0x7b95f1a3c1a5f1ed;
    uVar2 = (uint3)_DAT_00d1b5c0;
    _DAT_00d1b5c0 = (uint)(uVar2 ^ 0xa5f1ed);
  }
  FUN_008ac76c(param_1,&LAB_00809958,&DAT_00d1b5b8,0,0);
  puVar4 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (undefined1 *)*puVar4;
  FUN_00807f14(&DAT_00d1b520,&local_50,&local_50);
  local_50 = &LAB_00809958;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1b5b8);
  if (((DAT_00d1b658 & 1) == 0) && (iVar3 = __cxa_guard_acquire(&DAT_00d1b658), iVar3 != 0)) {
    DAT_00d1b654 = '\x01';
    DAT_00d1b648 = 0x1eaaed5e04f83e7d;
    DAT_00d1b650 = 0x67ea2966;
    __cxa_atexit(&LAB_0080cea8,&DAT_00d1b648,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1b658);
  }
  if (DAT_00d1b654 == '\x01') {
    DAT_00d1b654 = '\0';
    DAT_00d1b648 = DAT_00d1b648 ^ 0x6dc5813d678f5b13;
    DAT_00d1b650 = DAT_00d1b650 ^ 0x678f5b13;
  }
  FUN_008ac76c(param_1,&LAB_00809cb8,&DAT_00d1b648,0,0);
  puVar4 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (undefined1 *)*puVar4;
  FUN_00807f14(&DAT_00d1b520,&local_50,&local_50);
  local_50 = &LAB_00809cb8;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1b648);
  if (((DAT_00d1b708 & 1) == 0) && (iVar3 = __cxa_guard_acquire(&DAT_00d1b708), iVar3 != 0)) {
    DAT_00d1b704 = '\x01';
    DAT_00d1b6f8 = 0xdac073fc7596d6e7;
    DAT_00d1b700 = 0x1984c1fc;
    __cxa_atexit(&LAB_0080cf5c,&DAT_00d1b6f8,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1b708);
  }
  if (DAT_00d1b704 == '\x01') {
    DAT_00d1b704 = '\0';
    DAT_00d1b6f8 = DAT_00d1b6f8 ^ 0xa9af1f9f19e1b389;
    DAT_00d1b700 = DAT_00d1b700 ^ 0x19e1b389;
  }
  FUN_008ac76c(param_1,&LAB_0080a0a0,&DAT_00d1b6f8,0,0);
  puVar4 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (undefined1 *)*puVar4;
  FUN_00807f14(&DAT_00d1b520,&local_50,&local_50);
  local_50 = &LAB_0080a0a0;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1b6f8);
  if (((DAT_00d1b720 & 1) == 0) && (iVar3 = __cxa_guard_acquire(&DAT_00d1b720), iVar3 != 0)) {
    DAT_00d1b710 = 0x1a36c2815a5306b8;
    _DAT_00d1b718 = 0x13f10a3;
    __cxa_atexit(&LAB_0080cf68,&DAT_00d1b710,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1b720);
  }
  if (DAT_00d1b71b == '\x01') {
    DAT_00d1b710 = DAT_00d1b710 ^ 0x6f45aded393f75d1;
    uVar2 = (uint3)_DAT_00d1b718;
    _DAT_00d1b718 = (uint)(uVar2 ^ 0x3f75d1);
  }
  FUN_008ac76c(param_1,&LAB_0080a510,&DAT_00d1b710,0,0);
  puVar4 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (undefined1 *)*puVar4;
  FUN_00807f14(&DAT_00d1b520,&local_50,&local_50);
  local_50 = &LAB_0080a510;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1b710);
  if (((DAT_00d1b738 & 1) == 0) && (iVar3 = __cxa_guard_acquire(&DAT_00d1b738), iVar3 != 0)) {
    DAT_00d1b728 = 0xd84c5601dc52e206;
    _DAT_00d1b730 = 0x131f41d;
    __cxa_atexit(&LAB_0080cf74,&DAT_00d1b728,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1b738);
  }
  if (DAT_00d1b733 == '\x01') {
    DAT_00d1b728 = DAT_00d1b728 ^ 0xad3f396dbf31916f;
    _DAT_00d1b730 = _DAT_00d1b730 & 0xffffff ^ 0x31916f;
  }
  FUN_008ac76c(param_1,&LAB_0080a558,&DAT_00d1b728,0,0);
  puVar4 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (undefined1 *)*puVar4;
  FUN_00807f14(&DAT_00d1b520,&local_50,&local_50);
  local_50 = &LAB_0080a558;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1b728);
  local_40 = 0x591e;
  uStack_48 = 0xcf6622e85f082b14;
  local_50 = (undefined1 *)0xc96632e24b0e2a12;
  if (((DAT_00d1b758 & 1) == 0) && (iVar3 = __cxa_guard_acquire(&DAT_00d1b758), iVar3 != 0)) {
                    /* try { // try from 008095fc to 0080960b has its CatchHandler @ 0080992c */
    FUN_0080cf80(&DAT_00d1b740,&local_50);
    __cxa_atexit(&LAB_0080d01c,&DAT_00d1b740,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1b758);
  }
  FUN_0080ec98(&DAT_00d1b740);
  FUN_008ac76c(param_1,&LAB_0080a59c,&DAT_00d1b740,0,0);
  puVar4 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (undefined1 *)*puVar4;
  FUN_00807f14(&DAT_00d1b520,&local_50,&local_50);
  local_50 = &LAB_0080a59c;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1b740);
  local_40 = CONCAT11(local_40._1_1_,0x7d);
  uStack_48 = 0x671ac89a689fc912;
  local_50 = (undefined1 *)0x6a0bc09b7291d414;
  if (((DAT_00d1b778 & 1) == 0) && (iVar3 = __cxa_guard_acquire(&DAT_00d1b778), iVar3 != 0)) {
                    /* try { // try from 00809648 to 00809657 has its CatchHandler @ 0080991c */
    FUN_0080d028(&DAT_00d1b760,&local_50);
    __cxa_atexit(&LAB_0080d0bc,&DAT_00d1b760,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1b778);
  }
  FUN_0080ece0(&DAT_00d1b760);
  FUN_008ac76c(param_1,&LAB_0080a910,&DAT_00d1b760,0,0);
  puVar4 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (undefined1 *)*puVar4;
  FUN_00807f14(&DAT_00d1b520,&local_50,&local_50);
  local_50 = &LAB_0080a910;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1b760);
  uStack_48 = 0xc7d972b42328a17c;
  local_50 = (undefined1 *)0xa1d26fb22338aa7b;
  if (((DAT_00d1b798 & 1) == 0) && (iVar3 = __cxa_guard_acquire(&DAT_00d1b798), iVar3 != 0)) {
                    /* try { // try from 00809694 to 008096a3 has its CatchHandler @ 0080990c */
    FUN_0080db68(&DAT_00d1b780,&local_50);
    __cxa_atexit(&LAB_0080dbf4,&DAT_00d1b780,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1b798);
  }
  if (DAT_00d1b790 == '\x01') {
    DAT_00d1b790 = '\0';
    _DAT_00d1b780 = _DAT_00d1b780 ^ 0xc7b71ddd574bcf09;
    uRam0000000000d1b788 = uRam0000000000d1b788 ^ 0xc7b71ddd574bcf09;
  }
  FUN_008ac76c(param_1,&LAB_0080aa44,&DAT_00d1b780,0,0);
  puVar4 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (undefined1 *)*puVar4;
  FUN_00807f14(&DAT_00d1b520,&local_50,&local_50);
  local_50 = &LAB_0080aa44;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1b780);
  if (((DAT_00d1b7c8 & 1) == 0) && (iVar3 = __cxa_guard_acquire(&DAT_00d1b7c8), iVar3 != 0)) {
    DAT_00d1b7c6 = '\x01';
    DAT_00d1b7b8 = 0xb934f5ac5da0956a;
    DAT_00d1b7c0 = 0x5ca68d6a;
    _DAT_00d1b7c4 = 0x93a7;
    __cxa_atexit(&LAB_0080df04,&DAT_00d1b7b8,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1b7c8);
  }
  if (DAT_00d1b7c6 == '\x01') {
    DAT_00d1b7c6 = '\0';
    DAT_00d1b7b8 = DAT_00d1b7b8 ^ 0xd74193c933cff909;
    DAT_00d1b7c0 = DAT_00d1b7c0 ^ 0x33cff909;
    _DAT_00d1b7c4 = _DAT_00d1b7c4 ^ 0x93c9;
  }
  FUN_008ac76c(param_1,&LAB_0080ad88,&DAT_00d1b7b8,0,0);
  puVar4 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (undefined1 *)*puVar4;
  FUN_00807f14(&DAT_00d1b520,&local_50,&local_50);
  local_50 = &LAB_0080ad88;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1b7b8);
  if (((DAT_00d1b950 & 1) == 0) && (iVar3 = __cxa_guard_acquire(&DAT_00d1b950), iVar3 != 0)) {
    DAT_00d1b940 = 0x12935033fa6868df;
    DAT_00d1b948 = 0xff686ec3;
    _DAT_00d1b94c = 0x155;
    __cxa_atexit(&LAB_0080ea20,&DAT_00d1b940,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1b950);
  }
  if (DAT_00d1b94d == '\x01') {
    _DAT_00d1b94c = (ushort)(DAT_00d1b94c ^ 0x55);
    DAT_00d1b940 = DAT_00d1b940 ^ 0x71fd2555910707b7;
    DAT_00d1b948 = DAT_00d1b948 ^ 0x910707b7;
  }
  FUN_008ac76c(param_1,&LAB_0080b098,&DAT_00d1b940,0,0);
  puVar4 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (undefined1 *)*puVar4;
  FUN_00807f14(&DAT_00d1b520,&local_50,&local_50);
  local_50 = &LAB_0080b098;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1b940);
  uStack_48 = 0xd9f4e7423a3a2f0;
  local_50 = (undefined1 *)0x799453602db9a8fe;
  if (((DAT_00d1b9a8 & 1) == 0) && (iVar3 = __cxa_guard_acquire(&DAT_00d1b9a8), iVar3 != 0)) {
                    /* try { // try from 008097c0 to 008097cf has its CatchHandler @ 008098fc */
    FUN_0080ebe0(&DAT_00d1b990,&local_50);
    __cxa_atexit(&LAB_0080ec6c,&DAT_00d1b990,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1b9a8);
  }
  if (DAT_00d1b9a0 == '\x01') {
    DAT_00d1b9a0 = '\0';
    _DAT_00d1b990 = _DAT_00d1b990 ^ 0xdf73d154bcdcd99;
    uRam0000000000d1b998 = uRam0000000000d1b998 ^ 0xdf73d154bcdcd99;
  }
  FUN_008ac76c(param_1,&LAB_0080ba78,&DAT_00d1b990,0,0);
  puVar4 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_50 = (undefined1 *)*puVar4;
  FUN_00807f14(&DAT_00d1b520,&local_50,&local_50);
  local_50 = &LAB_0080ba78;
  FUN_0080837c(&DAT_00cca848,&local_50,&local_50);
  FUN_008ad800(param_1,0xffffd8ee,&DAT_00d1b990);
  if (((DAT_00d1b9c0 & 1) == 0) && (iVar3 = __cxa_guard_acquire(&DAT_00d1b9c0), iVar3 != 0)) {
    uRam0000000000d1b9b8 = 0x1017819505a36b1;
    _DAT_00d1b9b0 = 0xb0647e0a49593caf;
    __cxa_atexit(&LAB_0080ec74,&DAT_00d1b9b0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1b9c0);
  }
  FUN_0080c088(param_1,&LAB_0080b098,&DAT_00d1b9b0);
  if (((DAT_00d1b9d8 & 1) == 0) && (iVar3 = __cxa_guard_acquire(&DAT_00d1b9d8), iVar3 != 0)) {
    DAT_00d1b9c8 = 0x208f3ce740848272;
    DAT_00d1b9d0 = 0x50998468;
    DAT_00d1b9d4 = 0x195;
    __cxa_atexit(&LAB_0080ec80,&DAT_00d1b9c8,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1b9d8);
  }
  FUN_0080c1b0(param_1,&LAB_0080a59c,&DAT_00d1b9c8);
  if (((DAT_00d1b9f0 & 1) == 0) && (iVar3 = __cxa_guard_acquire(&DAT_00d1b9f0), iVar3 != 0)) {
    DAT_00d1b9e0 = 0xae1b88de0ea4f1e6;
    DAT_00d1b9e8 = 0x8b3ecf6;
    DAT_00d1b9ec = 0x1b5;
    __cxa_atexit(&LAB_0080ec8c,&DAT_00d1b9e0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1b9f0);
  }
  FUN_0080c2bc(param_1,&LAB_0080a59c,&DAT_00d1b9e0);
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

