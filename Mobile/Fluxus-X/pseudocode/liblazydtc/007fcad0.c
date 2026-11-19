/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 007fcad0
 */

void _INIT_16(void)

{
  int iVar1;
  
  if (((DAT_00cca960 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00cca960), iVar1 != 0)) {
                    /* try { // try from 007fcafc to 007fcb03 has its CatchHandler @ 007fcb50 */
    DAT_00cca958 = operator_new(8);
    *DAT_00cca958 = &PTR_LAB_00c48898;
    __cxa_atexit(&LAB_007fcb68,&DAT_00cca958,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00cca960);
    return;
  }
  return;
}

