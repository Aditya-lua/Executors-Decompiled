/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00921ca8
 */

undefined8 FUN_00921ca8(long param_1)

{
  undefined8 uVar1;
  undefined8 *puVar2;
  
  puVar2 = *(undefined8 **)(param_1 + 0x1208);
  while (puVar2 != (undefined8 *)0x0) {
    uVar1 = *puVar2;
    puVar2 = (undefined8 *)puVar2[2];
    (*(code *)PTR_free_00cc4678)(uVar1);
  }
  FUN_00925c98(param_1 + 0x1208,0);
  *(undefined8 *)(param_1 + 0x1288) = 0;
  return 0;
}

