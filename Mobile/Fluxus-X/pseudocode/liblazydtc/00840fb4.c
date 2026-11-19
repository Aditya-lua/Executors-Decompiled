/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00840fb4
 */

void FUN_00840fb4(void)

{
  long lVar1;
  int iVar2;
  undefined8 local_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  undefined8 local_40;
  undefined8 uStack_38;
  undefined1 local_30;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  uStack_58 = 0x1340a4401c465952;
  local_60 = 0x1a1eb267401e4b25;
  uStack_48 = 0x445d9e211b423e56;
  uStack_50 = 0x3543fc3603334e3a;
  uStack_38 = 0x4d52ec311d464b44;
  local_40 = 0x4010f03702123e42;
  local_30 = 0x7b;
  if (((DAT_00d1e728 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1e728), iVar2 != 0)) {
                    /* try { // try from 00841030 to 0084103f has its CatchHandler @ 0084106c */
    FUN_00841da0(&DAT_00d1e6f0,&local_60);
    __cxa_atexit(&LAB_00841f34,&DAT_00d1e6f0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1e728);
  }
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

