/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bccee0
 */

undefined8 * FUN_00bccee0(undefined8 *param_1)

{
  uint uVar1;
  
  if (*(char *)(param_1 + 1) == '\x01') {
                    /* try { // try from 00bccefc to 00bcceff has its CatchHandler @ 00bccf0c */
    uVar1 = pthread_mutex_unlock((pthread_mutex_t *)*param_1);
    param_1 = (undefined8 *)(ulong)uVar1;
  }
  return param_1;
}

