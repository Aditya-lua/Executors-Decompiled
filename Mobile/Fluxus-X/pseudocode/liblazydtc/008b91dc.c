/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b91dc
 */

int FUN_008b91dc(uint param_1)

{
  uint uVar1;
  uint uVar2;
  int iVar3;
  
  iVar3 = -1;
  uVar2 = param_1;
  if (0xff < param_1) {
    do {
      param_1 = uVar2 >> 8;
      uVar1 = uVar2 >> 0x10;
      iVar3 = iVar3 + 8;
      uVar2 = param_1;
    } while (uVar1 != 0);
  }
  return iVar3 + (uint)(byte)(&DAT_00364b99)[param_1];
}

