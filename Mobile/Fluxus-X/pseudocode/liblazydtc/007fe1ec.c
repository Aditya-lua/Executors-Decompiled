/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 007fe1ec
 */

/* WARNING: Removing unreachable block (ram,0x007fe34c) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulong FUN_007fe1ec(byte *param_1)

{
  char *pcVar1;
  byte bVar2;
  long lVar3;
  char *__nptr;
  undefined4 uVar4;
  int iVar5;
  long *plVar6;
  size_t __n;
  char *pcVar7;
  ulong uVar8;
  locale alStack_1e8 [8];
  ulong local_1e0;
  ulong uStack_1d8;
  char *local_1d0;
  pointer_____offset_0x18___ local_1c0 [2];
  basic_filebuf<char,std::__ndk1::char_traits<char>> abStack_1b0 [120];
  long local_138;
  undefined **appuStack_108 [19];
  long local_70;
  
  lVar3 = tpidr_el0;
  local_70 = *(long *)(lVar3 + 0x28);
  uStack_1d8 = 0x5f1a3912bee8ef29;
  local_1e0 = 0x3a1a6610bcb5f96a;
  if (((DAT_00ccab78 & 1) == 0) && (iVar5 = __cxa_guard_acquire(&DAT_00ccab78), iVar5 != 0)) {
                    /* try { // try from 007fe46c to 007fe47f has its CatchHandler @ 007fe4b0 */
    FUN_007fe674(&DAT_00ccab60,&local_1e0);
    __cxa_atexit(&LAB_007fe700,&DAT_00ccab60,&PTR_LOOP_00c48880);
    __cxa_guard_release(&DAT_00ccab78);
  }
  if (DAT_00ccab70 == '\x01') {
    DAT_00ccab70 = '\0';
    _DAT_00ccab60 = _DAT_00ccab60 ^ 0x5f694973d3c78945;
    uRam0000000000ccab68 = uRam0000000000ccab68 ^ 0x5f694973d3c78945;
  }
  FUN_007fe518(local_1c0,&DAT_00ccab60,8);
  if (local_138 != 0) {
    local_1e0 = 0;
    uStack_1d8 = 0;
    local_1d0 = (char *)0x0;
    do {
                    /* try { // try from 007fe2b4 to 007fe2bf has its CatchHandler @ 007fe4d4 */
      std::__ndk1::ios_base::getloc();
                    /* try { // try from 007fe2c0 to 007fe2db has its CatchHandler @ 007fe4c4 */
      plVar6 = (long *)std::__ndk1::locale::use_facet
                                 (alStack_1e8,(id *)&std::__ndk1::ctype<char>::id);
      uVar4 = (**(code **)(*plVar6 + 0x38))(plVar6,10);
      std::__ndk1::locale::~locale(alStack_1e8);
                    /* try { // try from 007fe2e8 to 007fe2f7 has its CatchHandler @ 007fe4d4 */
      plVar6 = (long *)FUN_007fe708(local_1c0,&local_1e0,uVar4);
      if ((*(byte *)((long)plVar6 + *(long *)(*plVar6 + -0x18) + 0x20) & 5) != 0) {
        uVar8 = 0;
        goto LAB_007fe3d4;
      }
      uVar8 = local_1e0 >> 1 & 0x7f;
      __nptr = (char *)((ulong)&local_1e0 | 1);
      if ((local_1e0 & 1) != 0) {
        uVar8 = uStack_1d8;
        __nptr = local_1d0;
      }
      __n = strlen((char *)param_1);
      if (__n == 0) goto LAB_007fe3b0;
      if ((long)__n <= (long)uVar8) {
        bVar2 = *param_1;
        pcVar1 = __nptr + uVar8;
        pcVar7 = __nptr;
        do {
          if ((0xfffffffffffffffe < uVar8 - __n) ||
             (pcVar7 = memchr(pcVar7,(uint)bVar2,(uVar8 - __n) + 1), pcVar7 == (char *)0x0)) break;
          iVar5 = memcmp(pcVar7,param_1,__n);
          if (iVar5 == 0) {
            if ((pcVar7 != pcVar1) && ((long)pcVar7 - (long)__nptr != -1)) goto LAB_007fe3b0;
            break;
          }
          pcVar7 = pcVar7 + 1;
          uVar8 = (long)pcVar1 - (long)pcVar7;
        } while ((long)__n <= (long)uVar8);
      }
    } while( true );
  }
  uVar8 = 0;
LAB_007fe3f0:
  local_1c0[0] = (pointer_____offset_0x18___)&PTR_FUN_00c51bf0;
  appuStack_108[0] = &PTR_LAB_00c51c18;
  std::__ndk1::basic_filebuf<char,std::__ndk1::char_traits<char>>::~basic_filebuf(abStack_1b0);
  std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::~basic_istream
            ((basic_istream<char,std::__ndk1::char_traits<char>> *)local_1c0);
  std::__ndk1::basic_ios<char,std::__ndk1::char_traits<char>>::~basic_ios
            ((basic_ios<char,std::__ndk1::char_traits<char>> *)appuStack_108);
  if (*(long *)(lVar3 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar8;
LAB_007fe3b0:
  uVar8 = strtoul(__nptr,(char **)0x0,0x10);
LAB_007fe3d4:
  if ((local_1e0 & 1) != 0) {
    operator_delete(local_1d0,local_1e0 & 0xfffffffffffffffe);
  }
  goto LAB_007fe3f0;
}

