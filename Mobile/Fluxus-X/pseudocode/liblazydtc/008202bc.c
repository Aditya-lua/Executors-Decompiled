/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008202bc
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void _INIT_86(void)

{
  ulong uVar1;
  long lVar2;
  char *pcVar3;
  int iVar4;
  size_t __n;
  ulong *puVar5;
  undefined8 *puVar6;
  void *__dest;
  ulong local_78;
  size_t local_70;
  void *local_68;
  ulong local_60;
  ulong uStack_58;
  void *local_50;
  long local_48;
  
  lVar2 = tpidr_el0;
  local_48 = *(long *)(lVar2 + 0x28);
  uRam0000000000d1c5a0 = 0;
  _DAT_00d1c598 = 0;
  uRam0000000000d1c5b0 = 0;
  _DAT_00d1c5a8 = 0;
  DAT_00d1c5b8 = 0x3f800000;
  __cxa_atexit(FUN_007fbc70,&DAT_00d1c598,&PTR_LOOP_00c48880);
  DAT_00d1c5d8 = DAT_00cca878;
  if (((DAT_00d1c5f0 & 1) == 0) && (iVar4 = __cxa_guard_acquire(&DAT_00d1c5f0), iVar4 != 0)) {
    _DAT_00d1c5e8 = 0x137;
    DAT_00d1c5e0 = 0xb87d33b86e1b9418;
    __cxa_atexit(&LAB_0081e9a0,&DAT_00d1c5e0,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c5f0);
  }
  if (DAT_00d1c5e9 == '\x01') {
    DAT_00d1c5e0 = DAT_00d1c5e0 ^ 0x971941d90d7fe737;
    _DAT_00d1c5e8 = (ushort)(DAT_00d1c5e8 ^ 0x37);
  }
  __n = strlen((char *)&DAT_00d1c5e0);
  if (0xfffffffffffffff7 < __n) {
    if (*(long *)(lVar2 + 0x28) == local_48) {
                    /* WARNING: Subroutine does not return */
      FUN_007fe124();
    }
    goto LAB_00820620;
  }
  if (__n < 0x17) {
    __dest = (void *)((ulong)&local_78 | 1);
    local_78 = CONCAT71(local_78._1_7_,(char)((int)__n << 1));
    if (__n != 0) goto LAB_008203cc;
  }
  else {
    uVar1 = 0x1a;
    if ((__n | 7) != 0x17) {
      uVar1 = (__n | 7) + 1;
    }
    __dest = operator_new(uVar1);
    local_78 = uVar1 | 1;
    local_70 = __n;
    local_68 = __dest;
LAB_008203cc:
    memcpy(__dest,&DAT_00d1c5e0,__n);
  }
  pcVar3 = DAT_00d1c5d8;
  *(undefined1 *)((long)__dest + __n) = 0;
                    /* try { // try from 008203e8 to 008203ef has its CatchHandler @ 008205ec */
  puVar5 = (ulong *)std::__ndk1::
                    basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
                    append((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                            *)&local_78,pcVar3);
  local_50 = (void *)puVar5[2];
  uStack_58 = puVar5[1];
  local_60 = *puVar5;
  puVar5[1] = 0;
  puVar5[2] = 0;
  *puVar5 = 0;
  if (((DAT_00d1c608 & 1) == 0) && (iVar4 = __cxa_guard_acquire(&DAT_00d1c608), iVar4 != 0)) {
    DAT_00d1c604 = '\x01';
    DAT_00d1c5f8 = 0xf66932b27f10b018;
    DAT_00d1c600 = 0xd508254;
    __cxa_atexit(&LAB_0081e9ac,&DAT_00d1c5f8,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00d1c608);
  }
  if (DAT_00d1c604 == '\x01') {
    DAT_00d1c604 = '\0';
    DAT_00d1c5f8 = DAT_00d1c5f8 ^ 0x971941d90d7fe737;
    DAT_00d1c600 = DAT_00d1c600 ^ 0xd7fe737;
  }
                    /* try { // try from 00820464 to 00820473 has its CatchHandler @ 008205cc */
  puVar6 = (undefined8 *)
           std::__ndk1::
           basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::append
                     ((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                       *)&local_60,(char *)&DAT_00d1c5f8);
  DAT_00d1c5d0 = puVar6[2];
  uRam0000000000d1c5c8 = puVar6[1];
  _DAT_00d1c5c0 = *puVar6;
  puVar6[1] = 0;
  puVar6[2] = 0;
  *puVar6 = 0;
  if ((local_60 & 1) != 0) {
    operator_delete(local_50,local_60 & 0xfffffffffffffffe);
  }
  if ((local_78 & 1) != 0) {
    operator_delete(local_68,local_78 & 0xfffffffffffffffe);
  }
  __cxa_atexit(std::__ndk1::
               basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
               ~basic_string,&DAT_00d1c5c0,&PTR_LOOP_00c48880);
  if (*(long *)(lVar2 + 0x28) == local_48) {
    return;
  }
LAB_00820620:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

