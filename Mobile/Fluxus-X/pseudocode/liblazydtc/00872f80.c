/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00872f80
 */

void FUN_00872f80(undefined8 *param_1)

{
  byte *pbVar1;
  long lVar2;
  undefined8 *puVar3;
  undefined8 *puVar4;
  byte *pbVar5;
  byte *pbVar6;
  
  if ((*(byte *)(param_1 + 1) & 1) == 0) {
    puVar4 = (undefined8 *)*param_1;
    pbVar5 = (byte *)*puVar4;
    if (pbVar5 != (byte *)0x0) {
      pbVar1 = pbVar5;
      puVar3 = puVar4;
      if (pbVar5 != (byte *)puVar4[1]) {
        pbVar1 = (byte *)puVar4[1];
        do {
          pbVar6 = pbVar1 + -0x18;
          if ((*pbVar6 & 1) != 0) {
            operator_delete(*(void **)(pbVar1 + -8),*(ulong *)(pbVar1 + -0x18) & 0xfffffffffffffffe)
            ;
          }
          pbVar1 = pbVar6;
        } while (pbVar6 != pbVar5);
        puVar3 = (undefined8 *)*param_1;
        pbVar1 = (byte *)*puVar3;
      }
      lVar2 = puVar3[2];
      puVar4[1] = pbVar5;
      operator_delete(pbVar1,lVar2 - (long)pbVar1);
      return;
    }
  }
  return;
}

