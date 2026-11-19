/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba2384
 */

void psa_format_key_data_for_storage
               (void *param_1,size_t param_2,undefined2 *param_3,undefined8 *param_4)

{
  *(undefined4 *)(param_4 + 1) = 0;
  *param_4 = 0x59454b00415350;
  *(undefined4 *)((long)param_4 + 0xc) = *(undefined4 *)(param_3 + 2);
  *(undefined2 *)(param_4 + 2) = *param_3;
  *(undefined2 *)((long)param_4 + 0x12) = param_3[1];
  *(undefined4 *)((long)param_4 + 0x14) = *(undefined4 *)(param_3 + 4);
  *(undefined4 *)(param_4 + 3) = *(undefined4 *)(param_3 + 6);
  *(undefined4 *)((long)param_4 + 0x1c) = *(undefined4 *)(param_3 + 8);
  *(int *)(param_4 + 4) = (int)param_2;
  memcpy((void *)((long)param_4 + 0x24),param_1,param_2);
  return;
}

