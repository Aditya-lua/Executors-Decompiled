/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0090a660
 */

void FUN_0090a660(long param_1,undefined8 param_2)

{
  long lVar1;
  long lVar2;
  
  lVar2 = *(long *)(param_1 + 0x10);
  lVar1 = *(long *)(lVar2 + 0x20);
  if (lVar1 != 0) {
    if (*(long *)(lVar1 + 0x28) != 0) {
      FUN_00906ef0((long *)(lVar1 + 0x28),param_2);
    }
    (*(code *)PTR_free_00cc4678)(lVar1);
  }
  lVar1 = *(long *)(lVar2 + 0x28);
  *(undefined8 *)(lVar2 + 0x20) = 0;
  if (lVar1 != 0) {
    if (*(long *)(lVar1 + 0x28) != 0) {
      FUN_00906ef0((long *)(lVar1 + 0x28),param_2);
    }
    (*(code *)PTR_free_00cc4678)(lVar1);
  }
  lVar1 = *(long *)(lVar2 + 0x30);
  *(undefined8 *)(lVar2 + 0x28) = 0;
  if (lVar1 != 0) {
    if (*(long *)(lVar1 + 0x28) != 0) {
      FUN_00906ef0((long *)(lVar1 + 0x28),param_2);
    }
    (*(code *)PTR_free_00cc4678)(lVar1);
  }
  *(undefined8 *)(lVar2 + 0x30) = 0;
  return;
}

