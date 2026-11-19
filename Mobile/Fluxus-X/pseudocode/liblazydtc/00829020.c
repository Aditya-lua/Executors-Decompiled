/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00829020
 */

/* WARNING: Type propagation algorithm not settling */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void _INIT_87(void)

{
  long lVar1;
  int iVar2;
  undefined8 local_e0;
  byte bStack_d8;
  undefined7 uStack_d7;
  undefined1 uStack_d0;
  undefined1 local_cf;
  void *local_c8;
  undefined4 local_c0 [2];
  uint local_b8;
  undefined4 uStack_b4;
  undefined1 local_b0;
  void *local_a8;
  undefined4 local_a0 [2];
  byte local_98;
  undefined4 uStack_97;
  undefined1 uStack_93;
  undefined2 uStack_92;
  void *local_88;
  undefined4 local_80 [2];
  byte local_78;
  undefined4 uStack_77;
  undefined1 uStack_73;
  undefined2 uStack_72;
  void *local_68;
  undefined4 local_60 [2];
  byte local_58;
  undefined7 uStack_57;
  undefined1 uStack_50;
  undefined1 local_4f;
  void *local_48;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  uRam0000000000d1ca58 = 0;
  _DAT_00d1ca50 = 0;
  uRam0000000000d1ca68 = 0;
  _DAT_00d1ca60 = 0;
  DAT_00d1ca70 = 0x3f800000;
  __cxa_atexit(FUN_007fbc70,&DAT_00d1ca50,&PTR_LOOP_00c48880);
  bStack_d8 = 0x10;
  local_58 = 0x10;
  uStack_d7 = 0x7469746e656469;
  uStack_d0 = 0x79;
  local_c0[0] = 1;
  uStack_97 = 0x62696c7a;
  local_b8 = 0x6665640e;
  local_e0 = (ulong)local_e0._4_4_ << 0x20;
  uStack_b4 = 0x6574616c;
  local_a0[0] = 2;
  local_98 = 8;
  local_78 = 8;
  local_cf = 0;
  uStack_77 = 0x70697a67;
  local_b0 = 0;
  uStack_93 = 0;
  local_80[0] = 3;
  uStack_73 = 0;
  local_60[0] = 4;
  uStack_57 = 0x656c6261736964;
  uStack_50 = 100;
  local_4f = 0;
  DAT_00d1ca88 = 0;
  DAT_00d1ca80 = 0;
  DAT_00d1ca78 = &DAT_00d1ca80;
                    /* try { // try from 00829138 to 00829197 has its CatchHandler @ 00829314 */
  FUN_00828c58(&DAT_00d1ca78,&DAT_00d1ca80,&local_e0,&local_e0);
  FUN_00828c58(&DAT_00d1ca78,&DAT_00d1ca80,local_c0,local_c0);
  FUN_00828c58(&DAT_00d1ca78,&DAT_00d1ca80,local_a0,local_a0);
  FUN_00828c58(&DAT_00d1ca78,&DAT_00d1ca80,local_80,local_80);
  FUN_00828c58(&DAT_00d1ca78,&DAT_00d1ca80,local_60,local_60);
  if ((local_58 & 1) != 0) {
    operator_delete(local_48,CONCAT71(uStack_57,local_58) & 0xfffffffffffffffe);
  }
  if ((local_78 & 1) != 0) {
    operator_delete(local_68,CONCAT26(uStack_72,CONCAT15(uStack_73,CONCAT41(uStack_77,local_78))) &
                             0xfffffffffffffffe);
  }
  if ((local_98 & 1) != 0) {
    operator_delete(local_88,CONCAT26(uStack_92,CONCAT15(uStack_93,CONCAT41(uStack_97,local_98))) &
                             0xfffffffffffffffe);
  }
  if ((local_b8 & 1) != 0) {
    operator_delete(local_a8,CONCAT44(uStack_b4,local_b8) & 0xfffffffffffffffe);
  }
  if ((bStack_d8 & 1) != 0) {
    operator_delete(local_c8,CONCAT71(uStack_d7,bStack_d8) & 0xfffffffffffffffe);
  }
  __cxa_atexit(&LAB_00820624,&DAT_00d1ca78,&PTR_LOOP_00c48880);
  uStack_d0 = 0xed;
  bStack_d8 = 0xd5;
  uStack_d7 = 0x19b6c9d2e38062;
  local_e0 = 0x48e59885b2d36add;
  if (((DAT_00d1cac8 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1cac8), iVar2 != 0)) {
                    /* try { // try from 008292c4 to 008292d3 has its CatchHandler @ 00829300 */
    FUN_00824014(&DAT_00d1cab0,&local_e0);
    __cxa_atexit(&LAB_008240a8,&DAT_00d1cab0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1cac8);
  }
  FUN_00828fe8(&DAT_00d1cab0);
  DAT_00d1ca90 = &DAT_00d1cab0;
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

