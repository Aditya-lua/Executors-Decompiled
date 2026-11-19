/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd0384
 */

/* std::__ndk1::basic_istream<char, std::__ndk1::char_traits<char> >::getline(char*, long) */

void __thiscall
std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::getline
          (basic_istream<char,std::__ndk1::char_traits<char>> *this,char *param_1,long param_2)

{
  char cVar1;
  long *plVar2;
  locale alStack_38 [8];
  
  ios_base::getloc();
                    /* try { // try from 00bd03bc to 00bd03db has its CatchHandler @ 00bd0414 */
  plVar2 = (long *)locale::use_facet(alStack_38,(id *)&ctype<char>::id);
  cVar1 = (**(code **)(*plVar2 + 0x38))(plVar2,10);
  locale::~locale(alStack_38);
  getline(this,param_1,param_2,cVar1);
  return;
}

