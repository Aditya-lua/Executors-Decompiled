/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bd49e8
 */

/* std::__ndk1::basic_istream<wchar_t, std::__ndk1::char_traits<wchar_t> >::getline(wchar_t*, long)
    */

void __thiscall
std::__ndk1::basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>>::getline
          (basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>> *this,wchar_t *param_1,
          long param_2)

{
  wchar_t wVar1;
  long *plVar2;
  locale alStack_38 [8];
  
  ios_base::getloc();
                    /* try { // try from 00bd4a20 to 00bd4a3f has its CatchHandler @ 00bd4a78 */
  plVar2 = (long *)locale::use_facet(alStack_38,(id *)&ctype<wchar_t>::id);
  wVar1 = (**(code **)(*plVar2 + 0x58))(plVar2,10);
  locale::~locale(alStack_38);
  getline(this,param_1,param_2,wVar1);
  return;
}

