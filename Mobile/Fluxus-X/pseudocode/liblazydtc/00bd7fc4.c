/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd7fc4
 */

/* std::__ndk1::basic_ofstream<char, std::__ndk1::char_traits<char> >::open(char const*, unsigned
   int) */

void __thiscall
std::__ndk1::basic_ofstream<char,std::__ndk1::char_traits<char>>::open
          (basic_ofstream<char,std::__ndk1::char_traits<char>> *this,char *param_1,uint param_2)

{
  long lVar1;
  uint uVar2;
  
  lVar1 = basic_filebuf<char,std::__ndk1::char_traits<char>>::open
                    ((basic_filebuf<char,std::__ndk1::char_traits<char>> *)(this + 8),param_1,
                     param_2 | 0x10);
  if (lVar1 == 0) {
    uVar2 = *(uint *)((ios_base *)(this + *(long *)(*(long *)this + -0x18)) + 0x20) | 4;
  }
  else {
    uVar2 = 0;
  }
  ios_base::clear((ios_base *)(this + *(long *)(*(long *)this + -0x18)),uVar2);
  return;
}

