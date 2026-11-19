/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc5628
 */

/* std::__ndk1::basic_string<wchar_t, std::__ndk1::char_traits<wchar_t>,
   std::__ndk1::allocator<wchar_t> >::basic_string(std::__ndk1::basic_string<wchar_t,
   std::__ndk1::char_traits<wchar_t>, std::__ndk1::allocator<wchar_t> > const&) */

void __thiscall
std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
::basic_string(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
               *this,basic_string_conflict *param_1)

{
  undefined8 uVar1;
  undefined8 uVar2;
  
  if (((byte)*param_1 & 1) == 0) {
    uVar2 = *(undefined8 *)(param_1 + 8);
    uVar1 = *(undefined8 *)param_1;
    *(undefined8 *)(this + 0x10) = *(undefined8 *)(param_1 + 0x10);
    *(undefined8 *)(this + 8) = uVar2;
    *(undefined8 *)this = uVar1;
    return;
  }
  FUN_00bc5654(this,*(undefined8 *)(param_1 + 0x10),*(undefined8 *)(param_1 + 8));
  return;
}

