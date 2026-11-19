/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009308ec
 */

int FUN_009308ec(int param_1,int param_2)

{
  uint uVar1;
  uint uVar2;
  int iVar3;
  
  uVar2 = fcntl(param_1,3,0);
  if ((int)uVar2 < 0) {
    iVar3 = -1;
  }
  else {
    iVar3 = 0;
    if ((uint)(param_2 != 0) != (uVar2 & 0x800) >> 0xb) {
      uVar1 = uVar2 | 0x800;
      if (param_2 == 0) {
        uVar1 = uVar2 & 0xfffff7ff;
      }
      iVar3 = fcntl(param_1,4,(ulong)uVar1);
      return iVar3;
    }
  }
  return iVar3;
}

