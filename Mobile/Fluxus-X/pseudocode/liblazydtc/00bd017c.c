/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd017c
 */

/* std::__ndk1::basic_istream<char, std::__ndk1::char_traits<char>
   >::get(std::__ndk1::basic_streambuf<char, std::__ndk1::char_traits<char> >&) */

void __thiscall
std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::get
          (basic_istream<char,std::__ndk1::char_traits<char>> *this,basic_streambuf *param_1)

{
  char cVar1;
  long *plVar2;
  locale alStack_18 [8];
  
  ios_base::getloc();
                    /* try { // try from 00bd01ac to 00bd01cb has its CatchHandler @ 00bd01fc */
  plVar2 = (long *)locale::use_facet(alStack_18,(id *)&ctype<char>::id);
  cVar1 = (**(code **)(*plVar2 + 0x38))(plVar2,10);
  locale::~locale(alStack_18);
  get(this,param_1,cVar1);
  return;
}

