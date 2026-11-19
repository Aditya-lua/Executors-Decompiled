/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0d68c
 */

void FUN_00c0d68c(undefined8 *param_1)

{
  int iVar1;
  
                    /* try { // try from 00c0d6a0 to 00c0d6cf has its CatchHandler @ 00c0d6d0 */
  iVar1 = pthread_mutex_unlock((pthread_mutex_t *)&DAT_00d27e08);
  if (iVar1 != 0) {
                    /* WARNING: Subroutine does not return */
    FUN_00c0de94("%s failed to release mutex",*param_1);
  }
  return;
}

