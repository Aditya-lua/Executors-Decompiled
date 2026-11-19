/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0097019c
 */

int FUN_0097019c(long param_1)

{
  int iVar1;
  
  iVar1 = 0;
  if (*(ENGINE **)(param_1 + 0xdc0) != (ENGINE *)0x0) {
    ENGINE_finish(*(ENGINE **)(param_1 + 0xdc0));
    iVar1 = ENGINE_free(*(ENGINE **)(param_1 + 0xdc0));
    *(undefined8 *)(param_1 + 0xdc0) = 0;
  }
  return iVar1;
}

