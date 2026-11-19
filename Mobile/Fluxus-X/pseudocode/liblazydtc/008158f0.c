/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008158f0
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void _INIT_84(void)

{
  long lVar1;
  int iVar2;
  undefined8 local_40;
  undefined8 uStack_38;
  undefined1 local_30;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  uRam0000000000d1ba00 = 0;
  _DAT_00d1b9f8 = 0;
  uRam0000000000d1ba10 = 0;
  _DAT_00d1ba08 = 0;
  DAT_00d1ba18 = 0x3f800000;
  __cxa_atexit(FUN_007fbc70,&DAT_00d1b9f8,&PTR_LOOP_00c48880);
  local_30 = 0x99;
  uStack_38 = 0xa11a134009cc7ea1;
  local_40 = 0xf0494217589f76a9;
  if (((DAT_00d1ba40 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1ba40), iVar2 != 0)) {
                    /* try { // try from 008159a8 to 008159b7 has its CatchHandler @ 008159e4 */
    FUN_008144d0(&DAT_00d1ba28,&local_40);
    __cxa_atexit(&LAB_00814564,&DAT_00d1ba28,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1ba40);
  }
  FUN_008158bc(&DAT_00d1ba28);
  DAT_00d1ba20 = &DAT_00d1ba28;
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

