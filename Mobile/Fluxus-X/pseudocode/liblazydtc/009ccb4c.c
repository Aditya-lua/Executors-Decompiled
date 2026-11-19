/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ccb4c
 */

void SSL3_BUFFER_set_data(undefined8 *param_1,void *param_2,size_t param_3)

{
  if (param_2 != (void *)0x0) {
    memcpy((void *)*param_1,param_2,param_3);
  }
  param_1[3] = 0;
  param_1[4] = param_3;
  return;
}

