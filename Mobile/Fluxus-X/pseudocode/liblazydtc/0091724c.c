/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0091724c
 */

bool FUN_0091724c(long param_1)

{
  bool bVar1;
  int iVar2;
  char cVar3;
  
  if (param_1 == 0) {
    iVar2 = socket(10,2,0);
    if (iVar2 == -1) {
      bVar1 = false;
    }
    else {
      close(iVar2);
      bVar1 = true;
    }
  }
  else {
    cVar3 = *(char *)(*(long *)(param_1 + 0xc0) + 0x230);
    if (cVar3 == '\0') {
      iVar2 = socket(10,2,0);
      if (iVar2 == -1) {
        cVar3 = '\x01';
      }
      else {
        close(iVar2);
        cVar3 = '\x02';
      }
      *(char *)(*(long *)(param_1 + 0xc0) + 0x230) = cVar3;
    }
    bVar1 = cVar3 == '\x02';
  }
  return bVar1;
}

