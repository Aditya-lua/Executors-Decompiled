/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aefa9c
 */

undefined8 FUN_00aefa9c(long param_1)

{
  if (DAT_00d22328 != (FILE *)&__sF) {
    fclose(DAT_00d22328);
  }
  if (DAT_00d22330 != (FILE *)sched_yield) {
    fclose(DAT_00d22330);
  }
  CRYPTO_THREAD_unlock(*(undefined8 *)(param_1 + 0x30));
  return 1;
}

