/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcfeec
 */

/* std::__ndk1::basic_istream<char, std::__ndk1::char_traits<char> >::get(char*, long) */

void __thiscall
std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::get
          (basic_istream<char,std::__ndk1::char_traits<char>> *this,char *param_1,long param_2)

{
  char cVar1;
  long *plVar2;
  locale alStack_38 [8];
  
  ios_base::getloc();
                    /* try { // try from 00bcff24 to 00bcff43 has its CatchHandler @ 00bcff7c */
  plVar2 = (long *)locale::use_facet(alStack_38,(id *)&ctype<char>::id);
  cVar1 = (**(code **)(*plVar2 + 0x38))(plVar2,10);
  locale::~locale(alStack_38);
  get(this,param_1,param_2,cVar1);
  return;
}

