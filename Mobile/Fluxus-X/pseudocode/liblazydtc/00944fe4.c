/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00944fe4
 */

undefined8 FUN_00944fe4(long *param_1,undefined8 param_2)

{
  (**(code **)(*param_1 + 0x10))(param_2,param_1[1]);
  (*(code *)PTR_free_00cc4678)(param_1[1]);
  (*(code *)PTR_free_00cc4678)(param_1);
  return 0;
}

