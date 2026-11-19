/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfb054
 */

/* std::__ndk1::locale::locale(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&) */

void __thiscall std::__ndk1::locale::locale(locale *this,basic_string_conflict *param_1)

{
  void *pvVar1;
  
  pvVar1 = operator_new(0x138);
                    /* try { // try from 00bfb07c to 00bfb087 has its CatchHandler @ 00bfb0ac */
  FUN_00bf52bc(pvVar1,param_1,0);
  *(void **)this = pvVar1;
  FUN_00c2bce0(1,(long)pvVar1 + 8);
  return;
}

