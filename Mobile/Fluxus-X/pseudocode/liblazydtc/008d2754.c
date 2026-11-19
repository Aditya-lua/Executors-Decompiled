/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008d2754
 */

void LZ4_attach_dictionary(long param_1,long param_2)

{
  long lVar1;
  
  if (param_2 == 0) {
    *(undefined8 *)(param_1 + 0x4008) = 0;
    return;
  }
  if (*(int *)(param_1 + 0x4010) == 0) {
    *(undefined4 *)(param_1 + 0x4010) = 0x10000;
  }
  lVar1 = 0;
  if (*(int *)(param_2 + 0x4018) != 0) {
    lVar1 = param_2;
  }
  *(long *)(param_1 + 0x4008) = lVar1;
  return;
}

