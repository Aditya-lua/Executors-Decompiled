/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00970360
 */

undefined8 FUN_00970360(long param_1)

{
  int iVar1;
  undefined8 uVar2;
  char *pcVar3;
  
  uVar2 = 0;
  if (*(ENGINE **)(param_1 + 0xdc0) != (ENGINE *)0x0) {
    iVar1 = ENGINE_set_default(*(ENGINE **)(param_1 + 0xdc0),0xffff);
    if (iVar1 < 1) {
      pcVar3 = ENGINE_get_id(*(ENGINE **)(param_1 + 0xdc0));
      FUN_00904b80(param_1,"set default crypto engine \'%s\' failed",pcVar3);
      uVar2 = 0x36;
    }
    else {
      uVar2 = 0;
      if ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) {
        if ((*(long *)(param_1 + 0x12a0) == 0) || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))) {
          pcVar3 = ENGINE_get_id(*(ENGINE **)(param_1 + 0xdc0));
          FUN_00904c98(param_1,"set default crypto engine \'%s\'",pcVar3);
          uVar2 = 0;
        }
        else {
          uVar2 = 0;
        }
      }
    }
  }
  return uVar2;
}

