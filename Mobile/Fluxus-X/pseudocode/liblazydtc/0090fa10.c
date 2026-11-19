/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0090fa10
 */

undefined8 FUN_0090fa10(undefined8 *param_1)

{
  code *pcVar1;
  undefined8 uVar2;
  
  pcVar1 = (code *)*param_1;
  uVar2 = param_1[1];
  (*(code *)PTR_free_00cc4678)();
  (*pcVar1)(uVar2);
  return 0;
}

