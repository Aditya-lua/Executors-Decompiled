/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e9210
 */

/* std::__ndk1::basic_stringbuf<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char>
   >::seekoff(long long, std::__ndk1::ios_base::seekdir, unsigned int) */

undefined1  [16] __thiscall
std::__ndk1::basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
seekoff(basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *this,
       long param_1,int param_3,uint param_4)

{
  ulong uVar1;
  undefined1 auVar2 [16];
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  long lVar6;
  long lVar7;
  
  uVar5 = *(ulong *)(this + 0x30);
  uVar4 = *(ulong *)(this + 0x58);
  if (*(ulong *)(this + 0x58) < uVar5) {
    *(ulong *)(this + 0x58) = uVar5;
    uVar4 = uVar5;
  }
  if ((param_4 & 0x18) == 0) {
    return ZEXT816(0xffffffffffffffff) << 0x40;
  }
  if ((param_3 == 1) && ((param_4 & 0x18) == 0x18)) {
    return ZEXT816(0xffffffffffffffff) << 0x40;
  }
  if (uVar4 == 0) {
    lVar6 = 0;
  }
  else if (((byte)this[0x40] & 1) == 0) {
    lVar6 = uVar4 - (long)(this + 0x41);
  }
  else {
    lVar6 = uVar4 - *(long *)(this + 0x50);
  }
  if (param_3 == 0) {
    lVar7 = 0;
  }
  else if (param_3 == 2) {
    lVar7 = lVar6;
  }
  else {
    if (param_3 != 1) {
      return ZEXT816(0xffffffffffffffff) << 0x40;
    }
    if ((param_4 >> 3 & 1) == 0) {
      lVar7 = uVar5 - *(long *)(this + 0x28);
    }
    else {
      lVar7 = *(long *)(this + 0x18) - *(long *)(this + 0x10);
    }
  }
  uVar1 = lVar7 + param_1;
  uVar3 = 0xffffffffffffffff;
  if ((-1 < (long)uVar1) && ((long)uVar1 <= lVar6)) {
    if (uVar1 != 0) {
      if (((param_4 >> 3 & 1) != 0) && (*(long *)(this + 0x18) == 0)) {
        return ZEXT816(0xffffffffffffffff) << 0x40;
      }
      if (((param_4 >> 4 & 1) != 0) && (uVar5 == 0)) {
        return ZEXT816(0xffffffffffffffff) << 0x40;
      }
    }
    if ((param_4 >> 3 & 1) != 0) {
      *(ulong *)(this + 0x18) = *(long *)(this + 0x10) + uVar1;
      *(ulong *)(this + 0x20) = uVar4;
    }
    if ((param_4 >> 4 & 1) != 0) {
      *(long *)(this + 0x30) = *(long *)(this + 0x28) + (long)(int)uVar1;
    }
    uVar3 = uVar1;
  }
  auVar2._8_8_ = 0;
  auVar2._0_8_ = uVar3;
  return auVar2 << 0x40;
}

