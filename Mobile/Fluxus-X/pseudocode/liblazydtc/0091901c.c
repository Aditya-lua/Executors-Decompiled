/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0091901c
 */

undefined8 FUN_0091901c(long param_1,undefined8 param_2)

{
  undefined8 uVar1;
  
  FUN_00908c4c(param_2,0);
  if ((*(char *)(param_1 + 0x1318) != '\x1f') ||
     (uVar1 = FUN_00971a84(param_1,param_2), (int)uVar1 == 0)) {
    uVar1 = 0;
  }
  return uVar1;
}

