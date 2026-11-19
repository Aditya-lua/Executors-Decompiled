/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0083f868
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0083f868(undefined8 param_1)

{
  long lVar1;
  int iVar2;
  undefined8 *puVar3;
  undefined1 *local_40;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  FUN_008ad0b0(param_1,0,0);
  if (((DAT_00d1e878 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1e878), iVar2 != 0)) {
    DAT_00d1e870 = '\x01';
    DAT_00d1e868 = 0x187d20a63535c5e;
    __cxa_atexit(&LAB_0084e784,&DAT_00d1e868,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1e878);
  }
  if (DAT_00d1e870 == '\x01') {
    DAT_00d1e870 = '\0';
    DAT_00d1e868 = DAT_00d1e868 ^ 0x1f3b16f0d3d333d;
  }
  FUN_008ac76c(param_1,&LAB_0083fe9c,&DAT_00d1e868,0,0);
  puVar3 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_40 = (undefined1 *)*puVar3;
  FUN_00807f14(&DAT_00d1e628,&local_40,&local_40);
  local_40 = &LAB_0083fe9c;
  FUN_0080837c(&DAT_00cca848,&local_40,&local_40);
  FUN_008ad800(param_1,0xfffffffe,&DAT_00d1e868);
  if (((DAT_00d1e890 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1e890), iVar2 != 0)) {
    DAT_00d1e888 = '\x01';
    DAT_00d1e880 = 0x57e356ce839da672;
    __cxa_atexit(&LAB_0084e78c,&DAT_00d1e880,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1e890);
  }
  if (DAT_00d1e888 == '\x01') {
    DAT_00d1e888 = '\0';
    DAT_00d1e880 = DAT_00d1e880 ^ 0x579735abedf3c931;
  }
  FUN_008ac76c(param_1,&LAB_0083fe9c,&DAT_00d1e880,0,0);
  puVar3 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_40 = (undefined1 *)*puVar3;
  FUN_00807f14(&DAT_00d1e628,&local_40,&local_40);
  local_40 = &LAB_0083fe9c;
  FUN_0080837c(&DAT_00cca848,&local_40,&local_40);
  FUN_008ad800(param_1,0xfffffffe,&DAT_00d1e880);
  if (((DAT_00d1e8a8 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1e8a8), iVar2 != 0)) {
    DAT_00d1e8a2 = '\x01';
    DAT_00d1e898 = 0x7e1ede7e4ac17a0a;
    _DAT_00d1e8a0 = 0x1f29;
    __cxa_atexit(&LAB_0084e794,&DAT_00d1e898,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1e8a8);
  }
  if (DAT_00d1e8a2 == '\x01') {
    DAT_00d1e8a2 = '\0';
    DAT_00d1e898 = DAT_00d1e898 ^ 0x1b75bd1119a31f5d;
    _DAT_00d1e8a0 = _DAT_00d1e8a0 ^ 0x1f5d;
  }
  FUN_00807e7c(param_1,&DAT_00d1e898);
  FUN_008ad0b0(param_1,0,0);
  if (((DAT_00d1e8c0 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1e8c0), iVar2 != 0)) {
    DAT_00d1e8b8 = '\x01';
    DAT_00d1e8b0 = 0x194766725353ac18;
    __cxa_atexit(&LAB_0084e7a0,&DAT_00d1e8b0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1e8c0);
  }
  if (DAT_00d1e8b8 == '\x01') {
    DAT_00d1e8b8 = '\0';
    DAT_00d1e8b0 = DAT_00d1e8b0 ^ 0x193305173d3dc37b;
  }
  FUN_008ac76c(param_1,&LAB_0083fe9c,&DAT_00d1e8b0,0,0);
  puVar3 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_40 = (undefined1 *)*puVar3;
  FUN_00807f14(&DAT_00d1e628,&local_40,&local_40);
  local_40 = &LAB_0083fe9c;
  FUN_0080837c(&DAT_00cca848,&local_40,&local_40);
  FUN_008ad800(param_1,0xfffffffe,&DAT_00d1e8b0);
  if (((DAT_00d1e8d8 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1e8d8), iVar2 != 0)) {
    DAT_00d1e8d0 = '\x01';
    DAT_00d1e8c8 = 0x9430c50575b7a30;
    __cxa_atexit(&LAB_0084e7a8,&DAT_00d1e8c8,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1e8d8);
  }
  if (DAT_00d1e8d0 == '\x01') {
    DAT_00d1e8d0 = '\0';
    DAT_00d1e8c8 = DAT_00d1e8c8 ^ 0x9376f3539351573;
  }
  FUN_008ac76c(param_1,&LAB_0083fe9c,&DAT_00d1e8c8,0,0);
  puVar3 = (undefined8 *)FUN_008aa2e4(param_1,0xffffffff);
  local_40 = (undefined1 *)*puVar3;
  FUN_00807f14(&DAT_00d1e628,&local_40,&local_40);
  local_40 = &LAB_0083fe9c;
  FUN_0080837c(&DAT_00cca848,&local_40,&local_40);
  FUN_008ad800(param_1,0xfffffffe,&DAT_00d1e8c8);
  if (((DAT_00d1e8f0 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1e8f0), iVar2 != 0)) {
    DAT_00d1e8ea = '\x01';
    DAT_00d1e8e0 = 0x766ac0c86e47ee5e;
    _DAT_00d1e8e8 = 0x8b5d;
    __cxa_atexit(&LAB_0084e7b0,&DAT_00d1e8e0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1e8f0);
  }
  if (DAT_00d1e8ea == '\x01') {
    DAT_00d1e8ea = '\0';
    DAT_00d1e8e0 = DAT_00d1e8e0 ^ 0x1301a3a71d258b29;
    _DAT_00d1e8e8 = _DAT_00d1e8e8 ^ 0x8b29;
  }
  FUN_00807e7c(param_1,&DAT_00d1e8e0);
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

