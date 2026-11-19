/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 007fc900
 */

void _INIT_14(void)

{
  int iVar1;
  undefined8 *puVar2;
  
  if (((DAT_00cca940 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00cca940), iVar1 != 0)) {
                    /* try { // try from 007fc92c to 007fc933 has its CatchHandler @ 007fc98c */
    puVar2 = operator_new(0x88);
    puVar2[0x10] = 0;
    DAT_00cca938 = puVar2;
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
    puVar2[0xd] = 0;
    puVar2[0xc] = 0;
    puVar2[0xf] = 0;
    puVar2[0xe] = 0;
    __cxa_atexit(&LAB_007fc9a4,&DAT_00cca938,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00cca940);
    return;
  }
  return;
}

