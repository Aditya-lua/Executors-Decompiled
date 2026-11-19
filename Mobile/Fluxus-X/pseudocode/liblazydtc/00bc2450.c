/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc2450
 */

undefined8 * FUN_00bc2450(undefined8 *param_1)

{
  uint uVar1;
  
  if ((*(byte *)(param_1 + 1) & 1) == 0) {
                    /* try { // try from 00bc2468 to 00bc2497 has its CatchHandler @ 00bc24a8 */
    pthread_mutex_lock((pthread_mutex_t *)&DAT_00d26194);
    *(undefined8 *)*param_1 = 0;
    pthread_mutex_unlock((pthread_mutex_t *)&DAT_00d26194);
    uVar1 = pthread_cond_broadcast((pthread_cond_t *)&DAT_00d261bc);
    param_1 = (undefined8 *)(ulong)uVar1;
  }
  return param_1;
}

