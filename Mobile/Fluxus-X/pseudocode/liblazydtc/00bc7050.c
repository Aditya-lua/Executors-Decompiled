/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc7050
 */

/* std::__ndk1::basic_string<wchar_t, std::__ndk1::char_traits<wchar_t>,
   std::__ndk1::allocator<wchar_t> >::TEMPNAMEPLACEHOLDERVALUE(std::__ndk1::basic_string<wchar_t,
   std::__ndk1::char_traits<wchar_t>, std::__ndk1::allocator<wchar_t> > const&) */

basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> * __thiscall
std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
::operator=(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
            *this,basic_string_conflict *param_1)

{
  ulong uVar1;
  basic_string_conflict bVar2;
  basic_string_conflict *__src;
  ulong uVar3;
  basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> *__dest;
  void *pvVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  
  if (this != (basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>
               *)param_1) {
    bVar2 = *param_1;
    if (((byte)*this & 1) != 0) {
      uVar1 = (ulong)((byte)bVar2 >> 1);
      __src = param_1 + 4;
      if (((byte)bVar2 & 1) != 0) {
        uVar1 = *(ulong *)(param_1 + 8);
        __src = *(basic_string_conflict **)(param_1 + 0x10);
      }
      uVar3 = *(ulong *)this & 0xfffffffffffffffe;
      if (uVar1 < uVar3) {
        pvVar4 = *(void **)(this + 0x10);
        *(ulong *)(this + 8) = uVar1;
        if (uVar1 != 0) {
          memmove(pvVar4,__src,uVar1 << 2);
        }
        *(undefined4 *)((long)pvVar4 + uVar1 * 4) = 0;
      }
      else {
        __grow_by_and_replace
                  (this,uVar3 - 1,(uVar1 - uVar3) + 1,*(ulong *)(this + 8),0,*(ulong *)(this + 8),
                   uVar1,(wchar_t *)__src);
      }
      return this;
    }
    if (((byte)bVar2 & 1) != 0) {
      uVar1 = *(ulong *)(param_1 + 8);
      pvVar4 = *(void **)(param_1 + 0x10);
      if (uVar1 < 5) {
        __dest = this + 4;
        *this = SUB41((int)uVar1 << 1,0);
        if (uVar1 != 0) {
          memmove(__dest,pvVar4,uVar1 << 2);
        }
      }
      else {
        if (uVar1 + 0xc000000000000009 < 0xc00000000000000d) {
                    /* WARNING: Subroutine does not return */
          FUN_00bc5610();
        }
        uVar3 = uVar1;
        if (uVar1 < 9) {
          uVar3 = 8;
        }
        __dest = operator_new((uVar3 | 1) * 4 + 4);
        memcpy(__dest,pvVar4,uVar1 << 2);
        *(ulong *)(this + 8) = uVar1;
        *(basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>> **
         )(this + 0x10) = __dest;
        *(ulong *)this = (uVar3 | 1) + 2;
      }
      *(undefined4 *)(__dest + uVar1 * 4) = 0;
      return this;
    }
    uVar6 = *(undefined8 *)(param_1 + 8);
    uVar5 = *(undefined8 *)param_1;
    *(undefined8 *)(this + 0x10) = *(undefined8 *)(param_1 + 0x10);
    *(undefined8 *)(this + 8) = uVar6;
    *(undefined8 *)this = uVar5;
  }
  return this;
}

