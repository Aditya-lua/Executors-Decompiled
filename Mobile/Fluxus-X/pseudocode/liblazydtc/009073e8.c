/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009073e8
 */

void FUN_009073e8(long param_1,long param_2)

{
  long lVar1;
  undefined8 uVar2;
  
  uVar2 = *(undefined8 *)(param_1 + 8);
  *(long *)(param_1 + 8) = param_2;
  do {
    lVar1 = param_2;
    *(undefined8 *)(lVar1 + 0x18) = *(undefined8 *)(param_1 + 0x18);
    *(undefined4 *)(lVar1 + 0x20) = *(undefined4 *)(param_1 + 0x20);
    param_2 = *(long *)(lVar1 + 8);
  } while (*(long *)(lVar1 + 8) != 0);
  *(undefined8 *)(lVar1 + 8) = uVar2;
  return;
}

