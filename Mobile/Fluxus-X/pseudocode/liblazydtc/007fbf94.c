/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 007fbf94
 */

void _INIT_6(void)

{
  int iVar1;
  
  if (((DAT_00cca8a0 & 1) != 0) || (iVar1 = __cxa_guard_acquire(&DAT_00cca8a0), iVar1 == 0)) {
    return;
  }
  if (((DAT_00cca9b8 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00cca9b8), iVar1 != 0)) {
    DAT_00cca9b0 = '\x01';
    DAT_00cca9a8 = 0xd9c99cce61ba8f6b;
    __cxa_atexit(&LAB_007fdd54,&DAT_00cca9a8,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00cca9b8);
  }
  if (DAT_00cca9b0 == '\x01') {
    DAT_00cca9b0 = '\0';
    DAT_00cca9a8 = DAT_00cca9a8 ^ 0xd993efbb19cfe32d;
  }
  DAT_00cca898 = &DAT_00cca9a8;
  __cxa_guard_release(&DAT_00cca8a0);
  return;
}

