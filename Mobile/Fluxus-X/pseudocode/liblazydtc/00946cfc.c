/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00946cfc
 */

void FUN_00946cfc(undefined8 param_1,long param_2,byte param_3)

{
  if ((*(long *)(param_2 + 1000) != 0) && ((param_3 & 1) == 0)) {
    return;
  }
  if (*(long *)(param_2 + 0x30) != 0) {
    FUN_00917b54(param_1);
    *(undefined8 *)(param_2 + 0x30) = 0;
  }
  FUN_00924ee4(param_2);
  FUN_009109f8(param_1,param_2,*(char *)(param_2 + 0x575) != '\0' | param_3 & 1);
  return;
}

