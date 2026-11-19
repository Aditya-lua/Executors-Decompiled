/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00968e24
 */

undefined8 FUN_00968e24(long param_1,undefined8 param_2)

{
  undefined8 uVar1;
  long lVar2;
  
  uVar1 = 0;
  if (*(long *)(param_1 + 0xca8) == 0) {
    lVar2 = (*(code *)PTR_calloc_00cc4690)(param_2,200);
    if (lVar2 == 0) {
      uVar1 = 0x1b;
    }
    else {
      uVar1 = 0;
      *(long *)(param_1 + 0xca8) = lVar2;
      *(undefined8 *)(param_1 + 0x6d0) = param_2;
      *(undefined8 *)(param_1 + 0xcb0) = 1;
    }
  }
  return uVar1;
}

