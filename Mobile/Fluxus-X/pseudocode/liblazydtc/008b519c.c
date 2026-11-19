/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b519c
 */

void FUN_008b519c(undefined8 param_1,long param_2,undefined8 param_3)

{
  long lVar1;
  
  lVar1 = 0x20;
  if (*(char *)(param_2 + 6) != '\0') {
    lVar1 = 0x30;
  }
  FUN_008b7bd4(param_1,param_2,lVar1 + (ulong)*(byte *)(param_2 + 5) * 0x10,
               *(undefined1 *)(param_2 + 1),param_3);
  return;
}

