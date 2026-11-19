/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a18e84
 */

undefined8 bn_copy_words(void *param_1,undefined8 *param_2,ulong param_3)

{
  undefined8 uVar1;
  
  uVar1 = 0;
  if (*(int *)(param_2 + 1) <= (int)param_3) {
    memset(param_1,0,-(param_3 >> 0x1f & 1) & 0xfffffff800000000 | (param_3 & 0xffffffff) << 3);
    if ((void *)*param_2 != (void *)0x0) {
      memcpy(param_1,(void *)*param_2,(long)*(int *)(param_2 + 1) << 3);
    }
    uVar1 = 1;
  }
  return uVar1;
}

