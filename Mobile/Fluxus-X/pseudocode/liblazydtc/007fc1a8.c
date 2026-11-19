/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 007fc1a8
 */

void _INIT_8(void)

{
  long lVar1;
  int iVar2;
  undefined8 local_40;
  undefined8 uStack_38;
  undefined8 local_30;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  if (((DAT_00cca8c0 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00cca8c0), iVar2 != 0)) {
    uStack_38 = 0x8e43f2446d968842;
    local_40 = 0xc65de81c67869751;
    local_30 = 0xeb55fe00799a8f59;
    if (((DAT_00ccaa00 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00ccaa00), iVar2 != 0)) {
                    /* try { // try from 007fc290 to 007fc29f has its CatchHandler @ 007fc2cc */
      FUN_007fddfc(&DAT_00cca9e0,&local_40);
      __cxa_atexit(&LAB_007fdec8,&DAT_00cca9e0,&PTR_LOOP_00c48880);
      __cxa_guard_release(&DAT_00ccaa00);
    }
    if (DAT_00cca9f8 == '\x01') {
      DAT_00cca9f8 = '\0';
      DAT_00cca9e0 = DAT_00cca9e0 ^ 0xeb279b691ff3fb37;
      DAT_00cca9e8 = DAT_00cca9e8 ^ 0xeb279b691ff3fb37;
      DAT_00cca9f0 = DAT_00cca9f0 ^ 0xeb279b691ff3fb37;
    }
    DAT_00cca8b8 = &DAT_00cca9e0;
    __cxa_guard_release(&DAT_00cca8c0);
  }
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

