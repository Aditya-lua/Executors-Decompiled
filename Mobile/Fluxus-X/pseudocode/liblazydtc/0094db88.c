/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0094db88
 */

void FUN_0094db88(long param_1,undefined8 param_2)

{
  long lVar1;
  
  lVar1 = *(long *)(param_1 + 0x20);
  FUN_009450b4(param_1,lVar1 + 0x428,0,0);
  *(bool *)param_2 = *(char *)(lVar1 + 0x536) == '\0';
  return;
}

