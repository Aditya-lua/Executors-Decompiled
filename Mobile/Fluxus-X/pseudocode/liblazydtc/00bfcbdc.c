/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfcbdc
 */

/* std::__ndk1::ctype<char>::do_toupper(char) const */

uint __thiscall std::__ndk1::ctype<char>::do_toupper(ctype<char> *this,char param_1)

{
  int iVar1;
  uint uVar2;
  
  uVar2 = (uint)(byte)param_1;
  if (-1 < param_1) {
    if (((DAT_00d270f8 & 1) == 0) && (iVar1 = __cxa_guard_acquire(&DAT_00d270f8), iVar1 != 0)) {
                    /* try { // try from 00bfcc3c to 00bfcc4f has its CatchHandler @ 00bfcc68 */
      DAT_00d270f0 = newlocale(0x1fbf,"C",(__locale_t)0x0);
      __cxa_guard_release(&DAT_00d270f8);
    }
    uVar2 = (uint)(byte)param_1;
    if (0xe5 < (byte)(param_1 + 0x85U)) {
      uVar2 = (byte)param_1 - 0x20;
    }
  }
  return uVar2;
}

