/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00846500
 */

void FUN_00846500(undefined8 *param_1)

{
  byte *pbVar1;
  byte *pbVar2;
  byte *pbVar3;
  
  pbVar1 = (byte *)*param_1;
  if (pbVar1 == (byte *)0x0) {
    return;
  }
  pbVar3 = pbVar1;
  pbVar2 = (byte *)param_1[1];
  if (pbVar1 != (byte *)param_1[1]) {
    do {
      if ((pbVar2[-0x18] & 1) != 0) {
        operator_delete(*(void **)(pbVar2 + -8),*(ulong *)(pbVar2 + -0x18) & 0xfffffffffffffffe);
      }
      pbVar3 = pbVar2 + -0x30;
      if ((*pbVar3 & 1) != 0) {
        operator_delete(*(void **)(pbVar2 + -0x20),*(ulong *)(pbVar2 + -0x30) & 0xfffffffffffffffe);
      }
      pbVar2 = pbVar3;
    } while (pbVar3 != pbVar1);
    pbVar3 = (byte *)*param_1;
  }
  param_1[1] = pbVar1;
  operator_delete(pbVar3,param_1[2] - (long)pbVar3);
  return;
}

