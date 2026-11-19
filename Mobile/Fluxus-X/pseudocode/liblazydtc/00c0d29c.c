/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0d29c
 */

/* std::__ndk1::__get_classname(char const*, bool) */

ushort std::__ndk1::__get_classname(char *param_1,bool param_2)

{
  ushort uVar1;
  pointer_____offset_0x10___ *ppuVar2;
  ushort uVar3;
  int iVar4;
  undefined **ppuVar5;
  ulong uVar6;
  ulong uVar7;
  
  uVar6 = 0xf;
  ppuVar5 = &PTR_s_alnum_00cb0338;
  do {
    uVar7 = uVar6 >> 1;
    iVar4 = strcmp(ppuVar5[uVar7 * 2],param_1);
    uVar6 = uVar6 + ~uVar7;
    ppuVar2 = ppuVar5 + uVar7 * 2 + 2;
    if (-1 < iVar4) {
      uVar6 = uVar7;
      ppuVar2 = ppuVar5;
    }
    ppuVar5 = ppuVar2;
  } while (uVar6 != 0);
  if ((ppuVar5 == &regex_error::typeinfo) || (iVar4 = strcmp(param_1,*ppuVar5), iVar4 != 0)) {
    uVar3 = 0;
  }
  else {
    uVar1 = *(ushort *)(ppuVar5 + 1);
    uVar3 = uVar1;
    if (uVar1 == 0x8000) {
      uVar3 = 0x8078;
    }
    if ((param_2) && (uVar1 != 0x8000)) {
      uVar3 = uVar1;
      if ((uVar1 & 0x18) != 0) {
        uVar3 = uVar1 | 0x20;
      }
    }
  }
  return uVar3;
}

