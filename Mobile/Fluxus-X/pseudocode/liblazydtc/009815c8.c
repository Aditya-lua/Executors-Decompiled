/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009815c8
 */

/* ix::Http::trim(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&) */

void __thiscall ix::Http::trim(Http *this,basic_string_conflict *param_1)

{
  ulong uVar1;
  Http *pHVar2;
  Http HVar3;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *in_x8;
  
  *(undefined8 *)(in_x8 + 8) = 0;
  *(undefined8 *)(in_x8 + 0x10) = 0;
  *(undefined8 *)in_x8 = 0;
  uVar1 = *(ulong *)(this + 8);
  pHVar2 = *(Http **)(this + 0x10);
  if (((byte)*this & 1) == 0) {
    pHVar2 = this + 1;
    uVar1 = (ulong)((byte)*this >> 1);
  }
  for (; uVar1 != 0; uVar1 = uVar1 - 1) {
    HVar3 = *pHVar2;
    if ((0x20 < (byte)HVar3) || ((1L << ((ulong)(byte)HVar3 & 0x3f) & 0x100002400U) == 0)) {
                    /* try { // try from 00981628 to 0098162f has its CatchHandler @ 00981650 */
      std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
      push_back(in_x8,(char)HVar3);
    }
    pHVar2 = pHVar2 + 1;
  }
  return;
}

