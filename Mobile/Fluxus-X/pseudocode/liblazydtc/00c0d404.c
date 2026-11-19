/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0d404
 */

bool __cxa_guard_acquire(char *param_1)

{
  byte bVar1;
  byte bVar2;
  bool bVar3;
  int iVar4;
  long lVar5;
  int unaff_w20;
  
  if (*param_1 == '\0') {
    iVar4 = pthread_mutex_lock((pthread_mutex_t *)&DAT_00d27e08);
    if (iVar4 != 0) {
                    /* WARNING: Subroutine does not return */
      FUN_00c0de94("%s failed to acquire mutex","__cxa_guard_acquire");
    }
    bVar1 = param_1[1];
    if ((bVar1 >> 1 & 1) != 0) {
      iVar4 = *(int *)(param_1 + 4);
                    /* try { // try from 00c0d45c to 00c0d463 has its CatchHandler @ 00c0d52c */
      lVar5 = syscall(0xb2);
      unaff_w20 = (int)lVar5;
      if (iVar4 == unaff_w20) {
                    /* try { // try from 00c0d520 to 00c0d52b has its CatchHandler @ 00c0d52c */
                    /* WARNING: Subroutine does not return */
        FUN_00c0de94(
                    "__cxa_guard_acquire detected recursive initialization: do you have a function-local static variable whose initialization depends on that function?"
                    );
      }
    }
    while (bVar2 = param_1[1], (bVar2 >> 1 & 1) != 0) {
      param_1[1] = bVar2 | 4;
                    /* try { // try from 00c0d490 to 00c0d49b has its CatchHandler @ 00c0d534 */
      pthread_cond_wait((pthread_cond_t *)&DAT_00d27e30,(pthread_mutex_t *)&DAT_00d27e08);
    }
    if (bVar2 != 1) {
      if ((bVar1 >> 1 & 1) == 0) {
                    /* try { // try from 00c0d4ac to 00c0d4b3 has its CatchHandler @ 00c0d52c */
        lVar5 = syscall(0xb2);
        unaff_w20 = (int)lVar5;
      }
      *(int *)(param_1 + 4) = unaff_w20;
      param_1[1] = '\x02';
    }
                    /* try { // try from 00c0d4c4 to 00c0d4cf has its CatchHandler @ 00c0d530 */
    iVar4 = pthread_mutex_unlock((pthread_mutex_t *)&DAT_00d27e08);
    if (iVar4 != 0) {
                    /* try { // try from 00c0d50c to 00c0d51f has its CatchHandler @ 00c0d530 */
                    /* WARNING: Subroutine does not return */
      FUN_00c0de94("%s failed to release mutex","__cxa_guard_acquire");
    }
    bVar3 = bVar2 != 1;
  }
  else {
    bVar3 = false;
  }
  return bVar3;
}

