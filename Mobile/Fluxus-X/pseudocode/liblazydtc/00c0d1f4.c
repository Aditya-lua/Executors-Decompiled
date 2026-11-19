/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0d1f4
 */

/* std::__ndk1::__get_collation_name(char const*) */

void __thiscall std::__ndk1::__get_collation_name(__ndk1 *this,char *param_1)

{
  undefined1 uVar1;
  undefined **ppuVar2;
  int iVar3;
  undefined8 *in_x8;
  undefined **ppuVar4;
  ulong uVar5;
  ulong uVar6;
  
  uVar5 = 0x6f;
  ppuVar4 = &PTR_DAT_00cafc48;
  do {
    uVar6 = uVar5 >> 1;
    iVar3 = strcmp(ppuVar4[uVar6 * 2],(char *)this);
    uVar5 = uVar5 + ~uVar6;
    ppuVar2 = ppuVar4 + uVar6 * 2 + 2;
    if (-1 < iVar3) {
      uVar5 = uVar6;
      ppuVar2 = ppuVar4;
    }
    ppuVar4 = ppuVar2;
  } while (uVar5 != 0);
  *in_x8 = 0;
  in_x8[1] = 0;
  in_x8[2] = 0;
  if ((ppuVar4 != &PTR_s_alnum_00cb0338) && (iVar3 = strcmp((char *)this,*ppuVar4), iVar3 == 0)) {
    uVar1 = *(undefined1 *)(ppuVar4 + 1);
    *(undefined1 *)in_x8 = 2;
    *(undefined1 *)((long)in_x8 + 1) = uVar1;
  }
  return;
}

