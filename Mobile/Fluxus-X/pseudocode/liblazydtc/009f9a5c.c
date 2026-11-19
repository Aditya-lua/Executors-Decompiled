/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f9a5c
 */

undefined8 ASYNC_WAIT_CTX_get_fd(long *param_1,long param_2,undefined4 *param_3,long *param_4)

{
  param_1 = (long *)*param_1;
  if (param_1 == (long *)0x0) {
    return 0;
  }
  while ((*(int *)((long)param_1 + 0x24) != 0 || (*param_1 != param_2))) {
    param_1 = (long *)param_1[5];
    if (param_1 == (long *)0x0) {
      return 0;
    }
  }
  *param_3 = (int)param_1[1];
  *param_4 = param_1[2];
  return 1;
}

