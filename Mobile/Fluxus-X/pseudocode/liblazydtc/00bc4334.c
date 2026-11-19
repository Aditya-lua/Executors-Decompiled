/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc4334
 */

/* std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char>
   >::basic_string(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&, unsigned long, unsigned long, std::__ndk1::allocator<char>
   const&) */

void std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
     basic_string(basic_string_conflict *param_1,ulong param_2,ulong param_3,allocator *param_4)

{
  allocator *__n;
  ulong uVar1;
  byte bVar2;
  long lVar3;
  basic_string_conflict *__dest;
  
  bVar2 = *(byte *)param_2;
  uVar1 = (ulong)(bVar2 >> 1);
  if ((bVar2 & 1) != 0) {
    uVar1 = *(ulong *)(param_2 + 8);
  }
  if (uVar1 < param_3) {
                    /* WARNING: Subroutine does not return */
    FUN_00814f80();
  }
  lVar3 = *(long *)(param_2 + 0x10);
  if ((bVar2 & 1) == 0) {
    lVar3 = param_2 + 1;
  }
  __n = (allocator *)(uVar1 - param_3);
  if (param_4 <= (allocator *)(uVar1 - param_3)) {
    __n = param_4;
  }
  if ((allocator *)0xfffffffffffffff7 < __n) {
                    /* WARNING: Subroutine does not return */
    FUN_007fe124();
  }
  if (__n < (allocator *)0x17) {
    __dest = param_1 + 1;
    *param_1 = SUB41((int)__n << 1,0);
    if (__n == (allocator *)0x0) goto LAB_00bc43dc;
  }
  else {
    uVar1 = 0x1a;
    if (((ulong)__n | 7) != 0x17) {
      uVar1 = ((ulong)__n | 7) + 1;
    }
    __dest = operator_new(uVar1);
    *(allocator **)(param_1 + 8) = __n;
    *(basic_string_conflict **)(param_1 + 0x10) = __dest;
    *(ulong *)param_1 = uVar1 | 1;
  }
  memmove(__dest,(void *)(lVar3 + param_3),(size_t)__n);
LAB_00bc43dc:
  __dest[(long)__n] = (basic_string_conflict)0x0;
  return;
}

