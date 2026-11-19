/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b9a9c
 */

void FUN_008b9a9c(long param_1,long param_2,undefined8 param_3)

{
  code *pcVar1;
  
  pcVar1 = *(code **)(*(long *)(param_1 + 0x60) + 0x660);
  if (pcVar1 != (code *)0x0) {
    (*pcVar1)(0,param_2);
  }
  FUN_008b7a9c(param_1,*(undefined8 *)(param_2 + 0x20),(long)*(int *)(param_2 + 0x44) * 0x30,
               *(undefined1 *)(param_2 + 1));
  FUN_008b7a9c(param_1,*(undefined8 *)(param_2 + 0x58),(long)*(int *)(param_2 + 0x40) << 4,
               *(undefined1 *)(param_2 + 1));
  FUN_008b7bd4(param_1,param_2,0x88,*(undefined1 *)(param_2 + 1),param_3);
  return;
}

