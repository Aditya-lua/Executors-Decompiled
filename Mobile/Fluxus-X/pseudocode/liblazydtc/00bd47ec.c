/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd47ec
 */

/* std::__ndk1::basic_istream<wchar_t, std::__ndk1::char_traits<wchar_t>
   >::get(std::__ndk1::basic_streambuf<wchar_t, std::__ndk1::char_traits<wchar_t> >&) */

void __thiscall
std::__ndk1::basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>>::get
          (basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>> *this,basic_streambuf *param_1)

{
  wchar_t wVar1;
  long *plVar2;
  locale alStack_18 [8];
  
  ios_base::getloc();
                    /* try { // try from 00bd481c to 00bd483b has its CatchHandler @ 00bd486c */
  plVar2 = (long *)locale::use_facet(alStack_18,(id *)&ctype<wchar_t>::id);
  wVar1 = (**(code **)(*plVar2 + 0x58))(plVar2,10);
  locale::~locale(alStack_18);
  get(this,param_1,wVar1);
  return;
}

