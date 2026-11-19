/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0d548
 */

void __cxa_guard_release(undefined1 *param_1)

{
  byte bVar1;
  int iVar2;
  char *pcVar3;
  
  *param_1 = 1;
  iVar2 = pthread_mutex_lock((pthread_mutex_t *)&DAT_00d27e08);
  if (iVar2 == 0) {
    bVar1 = param_1[1];
    param_1[1] = 1;
                    /* try { // try from 00c0d580 to 00c0d58b has its CatchHandler @ 00c0d5ec */
    iVar2 = pthread_mutex_unlock((pthread_mutex_t *)&DAT_00d27e08);
    if (iVar2 != 0) {
                    /* try { // try from 00c0d5c4 to 00c0d5d7 has its CatchHandler @ 00c0d5ec */
                    /* WARNING: Subroutine does not return */
      FUN_00c0de94("%s failed to release mutex","__cxa_guard_release");
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
  FUN_00c0de94(pcVar3,"__cxa_guard_release");
}

