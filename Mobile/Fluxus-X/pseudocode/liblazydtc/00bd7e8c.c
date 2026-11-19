/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd7e8c
 */

/* std::__ndk1::basic_filebuf<char, std::__ndk1::char_traits<char> >::open(char const*, unsigned
   int) */

basic_filebuf<char,std::__ndk1::char_traits<char>> * __thiscall
std::__ndk1::basic_filebuf<char,std::__ndk1::char_traits<char>>::open
          (basic_filebuf<char,std::__ndk1::char_traits<char>> *this,char *param_1,uint param_2)

{
  int iVar1;
  char *__modes;
  FILE *__stream;
  
  if (*(long *)(this + 0x78) != 0) {
    return (basic_filebuf<char,std::__ndk1::char_traits<char>> *)0x0;
  }
  __modes = (char *)FUN_00bd87dc(param_2);
  if (__modes == (char *)0x0) {
    return (basic_filebuf<char,std::__ndk1::char_traits<char>> *)0x0;
  }
  __stream = fopen(param_1,__modes);
  *(FILE **)(this + 0x78) = __stream;
  if (__stream != (FILE *)0x0) {
    *(uint *)(this + 0x98) = param_2;
    if (*(int *)(this + 0x9c) == 0x22) {
      ::setbuf(__stream,(char *)0x0);
      *(undefined4 *)(this + 0x9c) = 0;
    }
    if ((param_2 >> 1 & 1) == 0) {
      return this;
    }
    *(undefined4 *)(this + 0x9c) = 0;
    iVar1 = fseek(*(FILE **)(this + 0x78),0,2);
    if (iVar1 == 0) {
      return this;
    }
    fclose(*(FILE **)(this + 0x78));
    *(undefined8 *)(this + 0x78) = 0;
  }
  return (basic_filebuf<char,std::__ndk1::char_traits<char>> *)0x0;
}

