/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00846474
 */

void FUN_00846474(undefined8 *param_1)

{
  byte *pbVar1;
  byte *pbVar2;
  byte *pbVar3;
  
  pbVar2 = (byte *)*param_1;
  if (pbVar2 == (byte *)0x0) {
    return;
  }
  pbVar1 = pbVar2;
  if (pbVar2 != (byte *)param_1[1]) {
    pbVar1 = (byte *)param_1[1];
    do {
      pbVar3 = pbVar1 + -0x18;
      if ((*pbVar3 & 1) != 0) {
        operator_delete(*(void **)(pbVar1 + -8),*(ulong *)(pbVar1 + -0x18) & 0xfffffffffffffffe);
      }
      pbVar1 = pbVar3;
    } while (pbVar3 != pbVar2);
    pbVar1 = (byte *)*param_1;
  }
  param_1[1] = pbVar2;
  operator_delete(pbVar1,param_1[2] - (long)pbVar1);
  return;
}

