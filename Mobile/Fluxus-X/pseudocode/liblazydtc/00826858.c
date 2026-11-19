/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00826858
 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00826858(void)

{
  ulong uVar1;
  char *pcVar2;
  size_t __n;
  ulong uVar3;
  ulong uVar4;
  long lVar5;
  pointer_____offset_0x18___ puVar6;
  undefined8 uVar7;
  pointer_____offset_0x18___ puVar8;
  undefined8 uVar9;
  ulong *puVar10;
  void *__dest;
  void *pvVar11;
  char *__path;
  pointer_____offset_0x18___ local_1f0;
  undefined8 local_1e8;
  void *local_1e0;
  ulong local_1d8;
  ulong local_1d0;
  void *local_1c8;
  undefined8 local_1c0;
  size_t sStack_1b8;
  char *local_1b0;
  pointer_____offset_0x18___ local_1a0;
  undefined8 uStack_198;
  void *local_190;
  undefined **appuStack_f0 [19];
  long local_58;
  
  lVar5 = tpidr_el0;
  local_58 = *(long *)(lVar5 + 0x28);
  FUN_00801c04(&local_1a0);
                    /* try { // try from 00826888 to 00826897 has its CatchHandler @ 00826c0c */
  puVar10 = (ulong *)std::__ndk1::
                     basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                     ::append((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                               *)&local_1a0,"/files");
  local_1b0 = (char *)puVar10[2];
  sStack_1b8 = puVar10[1];
  local_1c0 = *puVar10;
  *puVar10 = 0;
  puVar10[1] = 0;
  puVar10[2] = 0;
  if (((ulong)local_1a0 & 1) != 0) {
    operator_delete(local_190,(ulong)local_1a0 & 0xfffffffffffffffe);
  }
  uVar3 = local_1c0;
  __n = local_1c0 >> 1 & 0x7f;
  if ((local_1c0 & 1) != 0) {
    __n = sStack_1b8;
  }
  uVar1 = __n + 0xb;
  if (0xfffffffffffffff7 < uVar1) {
    if (*(long *)(lVar5 + 0x28) == local_58) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00826b90 to 00826b93 has its CatchHandler @ 00826c24 */
      FUN_007fe124();
    }
    goto LAB_00826c58;
  }
  if (uVar1 < 0x17) {
    local_1d0 = 0;
    __dest = (void *)((ulong)&local_1d8 | 1);
    local_1c8 = (void *)0x0;
    local_1d8 = (ulong)(byte)((int)uVar1 << 1);
    pvVar11 = __dest;
    if (__n != 0) {
      goto LAB_00826944;
    }
    __path = local_1b0;
  }
  else {
    uVar4 = 0x1a;
    if ((uVar1 | 7) != 0x17) {
      uVar4 = (uVar1 | 7) + 1;
    }
                    /* try { // try from 00826924 to 0082692b has its CatchHandler @ 00826c24 */
    __dest = operator_new(uVar4);
    local_1d8 = uVar4 | 1;
    pvVar11 = (void *)((ulong)&local_1d8 | 1);
    local_1d0 = uVar1;
    local_1c8 = __dest;
LAB_00826944:
    __path = local_1b0;
    pcVar2 = local_1b0;
    if ((uVar3 & 1) == 0) {
      pcVar2 = (char *)((long)&local_1c0 + 1);
    }
    memmove(__dest,pcVar2,__n);
  }
  pcVar2 = (char *)((long)__dest + __n);
  pcVar2[0xb] = '\0';
  builtin_strncpy(pcVar2,"/cacert.",8);
  if ((uVar3 & 1) == 0) {
    __path = (char *)((long)&local_1c0 + 1);
  }
  builtin_strncpy(pcVar2 + 7,".pem",4);
  mkdir(__path,0x1c0);
                    /* try { // try from 00826998 to 008269a7 has its CatchHandler @ 00826bec */
  FUN_0081f528(&local_1a0,&local_1d8,0x24);
                    /* try { // try from 008269a8 to 008269c3 has its CatchHandler @ 00826bdc */
  std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::write
            ((basic_ostream<char,std::__ndk1::char_traits<char>> *)&local_1a0,&DAT_0032d788,0x30db5)
  ;
  local_1a0 = (pointer_____offset_0x18___)&PTR_FUN_00cad200;
  appuStack_f0[0] = &PTR_FUN_00cad228;
  std::__ndk1::basic_filebuf<char,std::__ndk1::char_traits<char>>::~basic_filebuf
            ((basic_filebuf<char,std::__ndk1::char_traits<char>> *)&uStack_198);
  std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::~basic_ostream
            ((basic_ostream<char,std::__ndk1::char_traits<char>> *)&local_1a0);
  std::__ndk1::basic_ios<char,std::__ndk1::char_traits<char>>::~basic_ios
            ((basic_ios<char,std::__ndk1::char_traits<char>> *)appuStack_f0);
  local_1f0 = (pointer_____offset_0x18___)0x0;
  local_1e8 = 0;
  local_1e0 = (void *)0x0;
  uVar3 = local_1d8 >> 1 & 0x7f;
  if ((local_1d8 & 1) != 0) {
    uVar3 = local_1d0;
    pvVar11 = local_1c8;
  }
                    /* try { // try from 00826a1c to 00826a27 has its CatchHandler @ 00826bbc */
  FUN_00826e2c(&local_1f0,pvVar11,(long)pvVar11 + uVar3);
  pvVar11 = local_1e0;
  uVar7 = local_1e8;
  puVar6 = local_1f0;
  DAT_00d1cdac = 0x10000;
  local_1e8 = 0;
  local_1e0 = (void *)0x0;
  local_1f0 = (pointer_____offset_0x18___)0x0;
  uRam0000000000d1cd00 = 0;
  _DAT_00d1ccf8 = 0;
  uRam0000000000d1cd10 = 0;
  _DAT_00d1cd08 = 0;
  uRam0000000000d1cd20 = 0;
  _DAT_00d1cd18 = 0;
  uRam0000000000d1cd30 = 0;
  _DAT_00d1cd28 = 0;
  uRam0000000000d1cd40 = 0;
  _DAT_00d1cd38 = 0;
  uRam0000000000d1cd50 = 0;
  _DAT_00d1cd48 = 0;
  uRam0000000000d1cd60 = 0;
  _DAT_00d1cd58 = 0;
  uRam0000000000d1cd70 = 0;
  _DAT_00d1cd68 = 0;
  uRam0000000000d1cd80 = 0;
  _DAT_00d1cd78 = 0;
  uRam0000000000d1cd90 = 0;
  _DAT_00d1cd88 = 0;
  DAT_00d1cd98 = 0;
  DAT_00d1cda0 = 0x10101;
  DAT_00d1cda4 = 0;
  DAT_00d1cda8 = 0;
  uRam0000000000d1cdb8 = 0;
  _DAT_00d1cdb0 = (pointer_____offset_0x18___)0x0;
  uRam0000000000d1cdc8 = 0;
  DAT_00d1cdc0 = (void *)0x0;
  uRam0000000000d1cdd8 = 0;
  _DAT_00d1cdd0 = 0;
  uRam0000000000d1cde8 = 0;
  _DAT_00d1cde0 = 0;
  uRam0000000000d1cdf8 = 0;
  _DAT_00d1cdf0 = 0;
  uRam0000000000d1ce08 = 0;
  _DAT_00d1ce00 = 0;
  uRam0000000000d1ce18 = 0;
  _DAT_00d1ce10 = 0;
  uRam0000000000d1ce28 = 0;
  _DAT_00d1ce20 = 0;
  uRam0000000000d1ce38 = 0;
  _DAT_00d1ce30 = 0;
  DAT_00d1ce40 = 1;
  puVar8 = puVar6;
  uVar9 = uVar7;
  if (((ulong)puVar6 & 1) != 0) {
                    /* try { // try from 00826abc to 00826ac7 has its CatchHandler @ 00826b94 */
    FUN_007ff40c(&local_1a0,pvVar11);
    uRam0000000000d1cdb8 = uStack_198;
    _DAT_00d1cdb0 = local_1a0;
    DAT_00d1cdc0 = local_190;
    operator_delete(pvVar11,(ulong)puVar6 & 0xfffffffffffffffe);
    puVar6 = _DAT_00d1cdb0;
    uVar7 = uRam0000000000d1cdb8;
    pvVar11 = DAT_00d1cdc0;
    puVar8 = local_1a0;
    uVar9 = uStack_198;
    if (((ulong)local_1f0 & 1) != 0) {
      operator_delete(local_1e0,(ulong)local_1f0 & 0xfffffffffffffffe);
      puVar6 = _DAT_00d1cdb0;
      uVar7 = uRam0000000000d1cdb8;
      pvVar11 = DAT_00d1cdc0;
      puVar8 = local_1a0;
      uVar9 = uStack_198;
    }
  }
  uStack_198 = uVar9;
  local_1a0 = puVar8;
  DAT_00d1cdc0 = pvVar11;
  uRam0000000000d1cdb8 = uVar7;
  _DAT_00d1cdb0 = puVar6;
  if ((local_1d8 & 1) != 0) {
    operator_delete(local_1c8,local_1d8 & 0xfffffffffffffffe);
  }
  if ((local_1c0 & 1) != 0) {
    operator_delete(local_1b0,local_1c0 & 0xfffffffffffffffe);
  }
  if (*(long *)(lVar5 + 0x28) == local_58) {
    return;
  }
LAB_00826c58:
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

