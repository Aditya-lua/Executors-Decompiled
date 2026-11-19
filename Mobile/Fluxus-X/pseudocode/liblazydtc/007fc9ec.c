/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 007fc9ec
 */

void _INIT_15(void)

{
  int iVar1;
  undefined8 *puVar2;
  
  if (((DAT_00cca950 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00cca950), iVar1 != 0)) {
                    /* try { // try from 007fca18 to 007fca1f has its CatchHandler @ 007fca70 */
    puVar2 = operator_new(0x60);
    DAT_00cca948 = puVar2;
    puVar2[1] = 0;
    *puVar2 = 0;
    puVar2[3] = 0;
    puVar2[2] = 0;
    puVar2[5] = 0;
    puVar2[4] = 0;
    puVar2[7] = 0;
    puVar2[6] = 0;
    puVar2[9] = 0;
    puVar2[8] = 0;
    puVar2[0xb] = 0;
    puVar2[10] = 0;
    __cxa_atexit(&LAB_007fca88,&DAT_00cca948,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00cca950);
    return;
  }
  return;
}

