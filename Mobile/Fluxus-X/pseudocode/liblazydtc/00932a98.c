/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00932a98
 */

void FUN_00932a98(long param_1,undefined8 param_2)

{
  (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 200));
  *(undefined8 *)(param_1 + 200) = 0;
  (*(code *)PTR_free_00cc4678)(*(undefined8 *)(param_1 + 0xc0));
  *(undefined8 *)(param_1 + 0xc0) = 0;
  if ((*(byte *)(param_1 + 0xdb) >> 1 & 1) != 0) {
    FUN_009242d4(param_1 + 0x68);
  }
  FUN_009350e4(param_2);
  FUN_00911d38(param_2);
  return;
}

