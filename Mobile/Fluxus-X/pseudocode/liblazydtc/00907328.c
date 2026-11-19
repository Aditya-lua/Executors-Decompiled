/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00907328
 */

undefined8 FUN_00907328(long *param_1,undefined8 param_2,undefined8 param_3)

{
  undefined8 *puVar1;
  undefined8 uVar2;
  
  puVar1 = (undefined8 *)(*(code *)PTR_calloc_00cc4690)(1,0x28);
  if (puVar1 == (undefined8 *)0x0) {
    uVar2 = 0x1b;
  }
  else {
    uVar2 = 0;
    *puVar1 = param_2;
    puVar1[2] = param_3;
  }
  *param_1 = (long)puVar1;
  return uVar2;
}

