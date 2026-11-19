/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc66e8
 */

/* std::__ndk1::basic_string<wchar_t, std::__ndk1::char_traits<wchar_t>,
   std::__ndk1::allocator<wchar_t> >::push_back(wchar_t) */

void __thiscall
std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
::push_back(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
            *this,wchar_t param_1)

{
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> bVar1;
  ulong uVar2;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *pbVar3;
  ulong uVar4;
  
  bVar1 = *this;
  if (((byte)bVar1 & 1) == 0) {
    if (bVar1 != (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
                  )0x8) {
      uVar2 = (ulong)((byte)bVar1 >> 1);
      pbVar3 = this + 4;
      *this = (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
               )((char)bVar1 + 2);
      goto LAB_00bc6774;
    }
    uVar4 = 4;
LAB_00bc6730:
    uVar2 = uVar4;
    __grow_by(this,uVar2,1,uVar2,uVar2,0,0);
  }
  else {
    uVar2 = *(ulong *)(this + 8);
    uVar4 = (*(ulong *)this & 0xfffffffffffffffe) - 1;
    if (uVar2 == uVar4) goto LAB_00bc6730;
  }
  pbVar3 = *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
             **)(this + 0x10);
  *(ulong *)(this + 8) = uVar2 + 1;
LAB_00bc6774:
  *(wchar_t *)(pbVar3 + uVar2 * 4) = param_1;
  *(undefined4 *)(pbVar3 + uVar2 * 4 + 4) = 0;
  return;
}

