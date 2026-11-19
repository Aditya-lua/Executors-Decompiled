/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ae110
 */

undefined1 FUN_008ae110(long param_1,long param_2)

{
  char cVar1;
  undefined1 uVar2;
  
  if (param_2 == param_1) {
    return 0;
  }
  cVar1 = *(char *)(param_2 + 3);
  if (cVar1 == '\0') {
    if (*(long *)(param_2 + 0x50) != *(long *)(param_2 + 0x20)) {
      return 2;
    }
    uVar2 = 3;
    if (*(long *)(param_2 + 0x68) != *(long *)(param_2 + 0x70)) {
      uVar2 = 1;
    }
  }
  else {
    uVar2 = 1;
    if (cVar1 != '\x01') {
      if (cVar1 == '\x06') {
        return 2;
      }
      return 4;
    }
  }
  return uVar2;
}

