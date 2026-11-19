/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00beb9f0
 */

/* std::__ndk1::time_get<wchar_t, std::__ndk1::istreambuf_iterator<wchar_t,
   std::__ndk1::char_traits<wchar_t> > >::__get_minute(int&,
   std::__ndk1::istreambuf_iterator<wchar_t, std::__ndk1::char_traits<wchar_t> >&,
   std::__ndk1::istreambuf_iterator<wchar_t, std::__ndk1::char_traits<wchar_t> >, unsigned int&,
   std::__ndk1::ctype<wchar_t> const&) const */

void __thiscall
std::__ndk1::
time_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::
__get_minute(undefined8 param_1_00,int *param_1,undefined8 param_2,undefined8 param_4,uint *param_5,
            undefined8 param_6)

{
  int iVar1;
  
  iVar1 = FUN_00bec028(param_2,param_4,param_5,param_6,2);
  if ((iVar1 < 0x3c) && ((*param_5 >> 2 & 1) == 0)) {
    *param_1 = iVar1;
  }
  else {
    *param_5 = *param_5 | 4;
  }
  return;
}

