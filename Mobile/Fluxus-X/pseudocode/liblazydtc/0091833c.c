/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0091833c
 */

undefined8 FUN_0091833c(undefined8 param_1,long param_2)

{
  undefined8 uVar1;
  
  if (*(char *)(param_2 + 0x573) == '\x02') {
    uVar1 = FUN_0091724c();
    return uVar1;
  }
  return 1;
}

