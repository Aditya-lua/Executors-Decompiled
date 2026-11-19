/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfb21c
 */

/* std::__ndk1::locale::locale(std::__ndk1::locale const&, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&, int) */

void __thiscall
std::__ndk1::locale::locale(locale *this,locale *param_1,basic_string_conflict *param_2,int param_3)

{
  void *pvVar1;
  
  pvVar1 = operator_new(0x138);
                    /* try { // try from 00bfb250 to 00bfb25b has its CatchHandler @ 00bfb280 */
  FUN_00bf7758(pvVar1,*(undefined8 *)param_1,param_2,param_3);
  *(void **)this = pvVar1;
  FUN_00c2bce0(1,(long)pvVar1 + 8);
  return;
}

