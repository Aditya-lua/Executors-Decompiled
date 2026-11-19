/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc62ac
 */

/* std::__ndk1::basic_string<wchar_t, std::__ndk1::char_traits<wchar_t>,
   std::__ndk1::allocator<wchar_t> >::basic_string(std::__ndk1::basic_string<wchar_t,
   std::__ndk1::char_traits<wchar_t>, std::__ndk1::allocator<wchar_t> > const&, unsigned long,
   unsigned long, std::__ndk1::allocator<wchar_t> const&) */

void std::__ndk1::
     basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::
     basic_string(basic_string_conflict *param_1,ulong param_2,ulong param_3,allocator *param_4)

{
  long lVar1;
  allocator *paVar2;
  ulong uVar3;
  byte bVar4;
  basic_string_conflict *__dest;
  
  bVar4 = *(byte *)param_2;
  uVar3 = (ulong)(bVar4 >> 1);
  if ((bVar4 & 1) != 0) {
    uVar3 = *(ulong *)(param_2 + 8);
  }
  if (uVar3 < param_3) {
                    /* WARNING: Subroutine does not return */
    FUN_00bc531c();
  }
  lVar1 = param_2 + 4;
  if ((bVar4 & 1) != 0) {
    lVar1 = *(long *)(param_2 + 0x10);
  }
  paVar2 = (allocator *)(uVar3 - param_3);
  if (param_4 <= (allocator *)(uVar3 - param_3)) {
    paVar2 = param_4;
  }
  if ((allocator *)0x3ffffffffffffff7 < paVar2) {
                    /* WARNING: Subroutine does not return */
    FUN_00bc5610();
  }
  if (paVar2 < (allocator *)0x5) {
    __dest = param_1 + 4;
    *param_1 = SUB41((int)paVar2 << 1,0);
    if (paVar2 == (allocator *)0x0) goto LAB_00bc635c;
  }
  else {
    uVar3 = 8;
    if (((ulong)paVar2 | 1) != 5) {
      uVar3 = ((ulong)paVar2 | 1) + 1;
    }
    __dest = operator_new(uVar3 << 2);
    *(allocator **)(param_1 + 8) = paVar2;
    *(basic_string_conflict **)(param_1 + 0x10) = __dest;
    *(ulong *)param_1 = uVar3 | 1;
  }
  memmove(__dest,(void *)(lVar1 + param_3 * 4),(long)paVar2 << 2);
LAB_00bc635c:
  *(undefined4 *)(__dest + (long)paVar2 * 4) = 0;
  return;
}

