/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd8424
 */

/* std::__ndk1::basic_filebuf<char, std::__ndk1::char_traits<char> >::close() */

basic_filebuf<char,std::__ndk1::char_traits<char>> * __thiscall
std::__ndk1::basic_filebuf<char,std::__ndk1::char_traits<char>>::close
          (basic_filebuf<char,std::__ndk1::char_traits<char>> *this)

{
  int iVar1;
  int iVar2;
  FILE *__stream;
  basic_filebuf<char,std::__ndk1::char_traits<char>> *pbVar3;
  
  __stream = *(FILE **)(this + 0x78);
  pbVar3 = (basic_filebuf<char,std::__ndk1::char_traits<char>> *)0x0;
  if (__stream != (FILE *)0x0) {
                    /* try { // try from 00bd844c to 00bd844f has its CatchHandler @ 00bd849c */
    iVar1 = (**(code **)(*(long *)this + 0x30))();
    iVar2 = fclose(__stream);
    *(undefined8 *)(this + 0x78) = 0;
    pbVar3 = this;
    if (iVar2 != 0 || iVar1 != 0) {
      pbVar3 = (basic_filebuf<char,std::__ndk1::char_traits<char>> *)0x0;
    }
    (**(code **)(*(long *)this + 0x18))(this,0,0);
  }
  return pbVar3;
}

