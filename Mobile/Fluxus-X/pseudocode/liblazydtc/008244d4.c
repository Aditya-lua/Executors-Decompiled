/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008244d4
 */

void FUN_008244d4(void)

{
  int iVar1;
  
  if (((DAT_00d1ce48 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d1ce48), iVar1 != 0)) {
                    /* try { // try from 0082450c to 0082450f has its CatchHandler @ 00824540 */
    FUN_00826858();
    __cxa_atexit(FUN_00826c5c,&DAT_00d1ccf8,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1ce48);
    return;
  }
  return;
}

