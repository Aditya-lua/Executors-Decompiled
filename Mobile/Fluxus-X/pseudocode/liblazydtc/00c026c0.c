/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c026c0
 */

/* std::__ndk1::numpunct_byname<wchar_t>::numpunct_byname(std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&, unsigned long) */

void __thiscall
std::__ndk1::numpunct_byname<wchar_t>::numpunct_byname
          (numpunct_byname<wchar_t> *this,basic_string_conflict *param_1,ulong param_2)

{
  basic_string_conflict *pbVar1;
  
  *(undefined8 *)(this + 0x20) = 0;
  *(undefined8 *)(this + 0x28) = 0;
  *(undefined8 *)(this + 0x18) = 0;
  *(undefined8 *)(this + 0x10) = 0x2c0000002e;
  *(undefined ***)this = &PTR__numpunct_byname_00cad880;
  *(ulong *)(this + 8) = param_2 - 1;
  pbVar1 = *(basic_string_conflict **)(param_1 + 0x10);
  if (((byte)*param_1 & 1) == 0) {
    pbVar1 = param_1 + 1;
  }
                    /* try { // try from 00c0270c to 00c0270f has its CatchHandler @ 00c02720 */
  __init(this,(char *)pbVar1);
  return;
}

