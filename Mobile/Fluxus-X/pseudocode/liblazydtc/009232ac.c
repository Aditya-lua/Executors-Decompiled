/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009232ac
 */

undefined8 FUN_009232ac(long *param_1,long param_2)

{
  long lVar1;
  
  lVar1 = *param_1;
  if (param_2 == 0) {
    param_2 = param_1[2] + (ulong)*(uint *)(lVar1 + 0x18);
  }
  (**(code **)(lVar1 + 0x10))(param_2,param_1[1]);
  (**(code **)(lVar1 + 8))(param_1[2],param_2,*(undefined4 *)(lVar1 + 0x20));
  (**(code **)(lVar1 + 0x10))(param_2,param_1[2]);
  (*(code *)PTR_free_00cc4678)(param_1);
  return 0;
}

