/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00873020
 */

void FUN_00873020(long param_1)

{
  byte *pbVar1;
  byte *pbVar3;
  byte *pbVar2;
  
  if ((*(byte *)(param_1 + 0x18) & 1) == 0) {
    pbVar1 = (byte *)**(undefined8 **)(param_1 + 8);
    if ((byte *)**(undefined8 **)(param_1 + 0x10) != pbVar1) {
      pbVar3 = (byte *)**(undefined8 **)(param_1 + 0x10);
      do {
        pbVar2 = pbVar3 + -0x18;
        if ((*pbVar2 & 1) != 0) {
          operator_delete(*(void **)(pbVar3 + -8),*(ulong *)(pbVar3 + -0x18) & 0xfffffffffffffffe);
        }
        pbVar3 = pbVar2;
      } while (pbVar2 != pbVar1);
    }
  }
  return;
}

