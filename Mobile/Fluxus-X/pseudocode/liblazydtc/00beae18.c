/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00beae18
 */

/* std::__ndk1::time_get<wchar_t, std::__ndk1::istreambuf_iterator<wchar_t,
   std::__ndk1::char_traits<wchar_t> > >::do_get_monthname(std::__ndk1::istreambuf_iterator<wchar_t,
   std::__ndk1::char_traits<wchar_t> >, std::__ndk1::istreambuf_iterator<wchar_t,
   std::__ndk1::char_traits<wchar_t> >, std::__ndk1::ios_base&, unsigned int&, tm*) const */

undefined8 __thiscall
std::__ndk1::
time_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>::
do_get_monthname(time_get<wchar_t,std::__ndk1::istreambuf_iterator<wchar_t,std::__ndk1::char_traits<wchar_t>>>
                 *this,undefined8 param_2,undefined8 param_3,undefined8 param_4,undefined8 param_5,
                long param_6)

{
  int iVar1;
  long lVar2;
  long lVar3;
  long local_68;
  undefined8 local_60;
  undefined8 *local_58;
  undefined ***local_50;
  undefined8 **local_48;
  
  local_60 = param_2;
  ios_base::getloc();
  local_58 = &ctype<wchar_t>::id;
  if (ctype<wchar_t>::id != -1) {
    local_48 = &local_58;
    local_50 = (undefined ***)&local_48;
                    /* try { // try from 00beae7c to 00beae93 has its CatchHandler @ 00beaf50 */
    __call_once((ulong *)&ctype<wchar_t>::id,&local_50,(_func_void_void_ptr *)&LAB_00c0bab0);
  }
  if (((ulong)(*(long *)(local_68 + 0x18) - *(long *)(local_68 + 0x10) >> 3) <=
       (long)DAT_00d27268 - 1U) ||
     (lVar3 = *(long *)(*(long *)(local_68 + 0x10) + ((long)DAT_00d27268 - 1U) * 8), lVar3 == 0)) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00beaf4c to 00beaf4f has its CatchHandler @ 00beaf50 */
    FUN_00bd8968();
  }
  locale::~locale((locale *)&local_68);
  lVar2 = (**(code **)(*(long *)(this + 0x10) + 8))(this + 0x10);
  lVar3 = FUN_00bdede4(&local_60,param_3,lVar2,lVar2 + 0x240,lVar3,param_5,0);
  if (lVar3 - lVar2 < 0x240) {
    lVar3 = (lVar3 - lVar2 >> 3) * -0x5555555555555555;
    iVar1 = (int)(lVar3 >> 0x3f);
    *(uint *)(param_6 + 0x10) =
         (int)lVar3 + (((uint)((int)(lVar3 / 6) + iVar1) >> 1) - iVar1) * -0xc;
  }
  return local_60;
}

