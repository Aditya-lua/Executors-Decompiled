/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0d5f0
 */

void __cxa_guard_abort(long param_1)

{
  byte bVar1;
  int iVar2;
  char *pcVar3;
  
  iVar2 = pthread_mutex_lock((pthread_mutex_t *)&DAT_00d27e08);
  if (iVar2 == 0) {
    bVar1 = *(byte *)(param_1 + 1);
    *(undefined4 *)(param_1 + 4) = 0;
    *(undefined1 *)(param_1 + 1) = 0;
                    /* try { // try from 00c0d620 to 00c0d62b has its CatchHandler @ 00c0d688 */
    iVar2 = pthread_mutex_unlock((pthread_mutex_t *)&DAT_00d27e08);
    if (iVar2 != 0) {
                    /* try { // try from 00c0d660 to 00c0d673 has its CatchHandler @ 00c0d688 */
                    /* WARNING: Subroutine does not return */
      FUN_00c0de94("%s failed to release mutex","__cxa_guard_abort");
    }
    if (((bVar1 >> 2 & 1) == 0) ||
       (iVar2 = pthread_cond_broadcast((pthread_cond_t *)&DAT_00d27e30), iVar2 == 0)) {
      return;
    }
    pcVar3 = "%s failed to broadcast";
  }
  else {
    pcVar3 = "%s failed to acquire mutex";
  }
                    /* WARNING: Subroutine does not return */
  FUN_00c0de94(pcVar3,"__cxa_guard_abort");
}

