/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00beab74
 */

/* std::__ndk1::time_get<wchar_t, std::__ndk1::istreambuf_iterator<wchar_t,
   std::__ndk1::char_traits<wchar_t> > >::do_get_date(std::__ndk1::istreambuf_iterator<wchar_t,
   std::__ndk1::char_traits<wchar_t> >, std::__ndk1::istreambuf_iterator<wchar_t,
   std::__ndk1::char_traits<wchar_t> >, std::__ndk1::ios_base&, unsigned int&, tm*) const */

void __thiscall
std::__ndk1::
time_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::
do_get_date(time_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>
            *this,undefined8 param_2,undefined8 param_3,undefined8 param_4,undefined8 param_5,
           undefined8 param_6)

{
  ulong uVar1;
  byte *pbVar2;
  byte *pbVar3;
  
  pbVar3 = (byte *)(**(code **)(*(long *)(this + 0x10) + 0x28))();
  uVar1 = (ulong)(*pbVar3 >> 1);
  pbVar2 = pbVar3 + 4;
  if ((*pbVar3 & 1) != 0) {
    uVar1 = *(ulong *)(pbVar3 + 8);
    pbVar2 = *(byte **)(pbVar3 + 0x10);
  }
  get(this,param_2,param_3,param_4,param_5,param_6,pbVar2,pbVar2 + uVar1 * 4);
  return;
}

