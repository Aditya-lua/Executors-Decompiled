/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098166c
 */

/* ix::Http::parseStatusLine(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&) */

void __thiscall ix::Http::parseStatusLine(Http *this,basic_string_conflict *param_1)

{
  ulong uVar1;
  byte bVar2;
  long lVar3;
  char *pcVar4;
  basic_istream *pbVar5;
  ulong *in_x8;
  long lVar6;
  ulong *puVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  undefined **__src;
  ulong *puVar12;
  ulong *puVar11;
  byte *pbVar13;
  undefined **ppuVar14;
  void *pvVar15;
  ulong uVar16;
  ulong local_300;
  ulong local_2f8;
  char *local_2f0;
  int local_2e4;
  ulong *local_2e0;
  ulong *local_2d8;
  ulong *local_2d0;
  ulong local_2c8;
  ulong uStack_2c0;
  void *local_2b8;
  undefined **local_2b0;
  ulong uStack_2a8;
  undefined **local_2a0;
  undefined **ppuStack_298;
  locale alStack_290 [8];
  undefined8 local_288;
  undefined8 uStack_280;
  undefined8 local_278;
  undefined8 uStack_270;
  undefined8 local_268;
  undefined8 uStack_260;
  ulong local_258;
  undefined8 uStack_250;
  void *local_248;
  undefined8 uStack_240;
  undefined4 local_238;
  undefined **local_230 [17];
  undefined8 local_1a8;
  undefined4 local_1a0;
  undefined **local_190;
  undefined8 uStack_188;
  undefined **local_180;
  undefined **ppuStack_178;
  locale alStack_170 [8];
  undefined8 local_168;
  undefined8 uStack_160;
  undefined8 local_158;
  undefined8 uStack_150;
  undefined8 local_148;
  undefined8 uStack_140;
  ulong local_138;
  undefined8 uStack_130;
  void *local_128;
  undefined8 uStack_120;
  undefined4 local_118;
  undefined **local_110 [17];
  undefined8 local_88;
  undefined4 local_80;
  
  lVar3 = tpidr_el0;
  lVar6 = *(long *)(lVar3 + 0x28);
  local_2c8 = 0;
  uStack_2c0 = 0;
  local_2b8 = (void *)0x0;
  local_180 = &PTR_FUN_00c4e508;
  local_110[0] = &PTR__basic_istream_00c4e640;
  uStack_188 = 0;
  local_190 = &PTR__basic_istream_00c4e618;
                    /* try { // try from 009816e4 to 009816ef has its CatchHandler @ 00981cf8 */
  std::__ndk1::ios_base::init
            ((ios_base *)local_110,
             (basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
             &ppuStack_178);
  local_88 = 0;
  local_80 = 0xffffffff;
  local_190 = &PTR_LAB_00c4e4e0;
  local_110[0] = &PTR_FUN_00c4e530;
  ppuStack_178 = &PTR__basic_streambuf_00c4e728;
  local_180 = &PTR_FUN_00c4e508;
  std::__ndk1::locale::locale(alStack_170);
  uStack_140 = 0;
  local_148 = 0;
  uStack_150 = 0;
  local_158 = 0;
  uStack_160 = 0;
  local_168 = 0;
  ppuStack_178 = &PTR_LAB_00c4e678;
  uStack_120 = 0;
  local_128 = (void *)0x0;
  uStack_130 = 0;
  local_138 = 0;
  local_118 = 0x18;
                    /* try { // try from 00981760 to 0098176b has its CatchHandler @ 00981cc4 */
  std::__ndk1::basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
  str((basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
      &ppuStack_178,(basic_string_conflict *)this);
  local_2e0 = (ulong *)0x0;
  local_2d8 = (ulong *)0x0;
  local_2d0 = (ulong *)0x0;
  while( true ) {
                    /* try { // try from 00981788 to 00981827 has its CatchHandler @ 00981dbc */
    pbVar5 = std::__ndk1::getline<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                       ((basic_istream *)&local_190,(basic_string_conflict *)&local_2c8,' ');
    pvVar15 = local_2b8;
    uVar9 = uStack_2c0;
    puVar7 = local_2d8;
    if (((byte)pbVar5[*(long *)(*(long *)pbVar5 + -0x18) + 0x20] & 5) != 0) break;
    if (local_2d8 == local_2d0) {
      std::__ndk1::
      vector<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
      ::
      __push_back_slow_path<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const&>
                ((vector<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
                  *)&local_2e0,(basic_string_conflict *)&local_2c8);
    }
    else {
      local_2d8[1] = 0;
      local_2d8[2] = 0;
      *local_2d8 = 0;
      if ((local_2c8 & 1) == 0) {
        local_2d8[2] = (ulong)local_2b8;
        local_2d8[1] = uStack_2c0;
        *local_2d8 = local_2c8;
      }
      else {
        if (0xffffffffffffffef < uStack_2c0) {
                    /* try { // try from 00981c60 to 00981c67 has its CatchHandler @ 00981c74 */
                    /* WARNING: Subroutine does not return */
          std::__ndk1::__basic_string_common<true>::__throw_length_error();
        }
        if (uStack_2c0 < 0x17) {
          pbVar13 = (byte *)((long)local_2d8 + 1);
          *(byte *)local_2d8 = (byte)((int)uStack_2c0 << 1);
          if (uStack_2c0 != 0) goto LAB_00981838;
        }
        else {
          uVar16 = uStack_2c0 + 0x10 & 0xfffffffffffffff0;
          pbVar13 = operator_new(uVar16);
          puVar7[1] = uVar9;
          puVar7[2] = (ulong)pbVar13;
          *puVar7 = uVar16 | 1;
LAB_00981838:
          memcpy(pbVar13,pvVar15,uVar9);
        }
        pbVar13[uVar9] = 0;
      }
      local_2d8 = local_2d8 + 3;
    }
  }
  if (local_2d8 == local_2e0) {
    uVar9 = 0;
    uVar10 = 0;
    ppuVar14 = (undefined **)0x0;
    __src = (undefined **)0x0;
    uVar16 = 0;
  }
  else {
    uStack_2a8 = 0;
    local_2a0 = (undefined **)0x0;
    local_2b0 = (undefined **)0x0;
    uVar9 = local_2e0[1];
    pbVar13 = (byte *)local_2e0[2];
    uVar16 = uStack_2a8;
    __src = local_2a0;
    ppuVar14 = local_2b0;
    puVar7 = local_2e0;
    if (((byte)*local_2e0 & 1) == 0) {
      pbVar13 = (byte *)((long)local_2e0 + 1);
      uVar9 = (ulong)(byte)((byte)*local_2e0 >> 1);
    }
    while( true ) {
      local_2e0 = puVar7;
      local_2b0 = ppuVar14;
      uStack_2a8 = uVar16;
      local_2a0 = __src;
      if (uVar9 == 0) break;
      bVar2 = *pbVar13;
      if ((0x20 < bVar2) || ((1L << ((ulong)bVar2 & 0x3f) & 0x100002400U) == 0)) {
                    /* try { // try from 009818c0 to 009818c7 has its CatchHandler @ 00981d98 */
        std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
        ::push_back((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                     *)&local_2b0,bVar2);
      }
      pbVar13 = pbVar13 + 1;
      uVar16 = uStack_2a8;
      __src = local_2a0;
      ppuVar14 = local_2b0;
      uVar9 = uVar9 - 1;
      puVar7 = local_2e0;
    }
    uVar9 = (ulong)ppuVar14 & 0xffffffffffff0000;
    uVar10 = (ulong)ppuVar14 & 0xff00;
  }
  local_2e4 = -1;
  if (1 < (ulong)(((long)local_2d8 - (long)puVar7 >> 3) * -0x5555555555555555)) {
    local_2a0 = &PTR_FUN_00c4e508;
    local_230[0] = &PTR__basic_istream_00c4e640;
    uStack_2a8 = 0;
    local_2b0 = &PTR__basic_istream_00c4e618;
                    /* try { // try from 0098194c to 00981953 has its CatchHandler @ 00981cac */
    std::__ndk1::ios_base::init((ios_base *)local_230,&ppuStack_298);
    local_1a8 = 0;
    local_1a0 = 0xffffffff;
    local_2b0 = &PTR_LAB_00c4e4e0;
    local_230[0] = &PTR_FUN_00c4e530;
    ppuStack_298 = &PTR__basic_streambuf_00c4e728;
    local_2a0 = &PTR_FUN_00c4e508;
    std::__ndk1::locale::locale(alStack_290);
    uStack_260 = 0;
    local_268 = 0;
    uStack_270 = 0;
    local_278 = 0;
    uStack_280 = 0;
    local_288 = 0;
    local_2f8 = 0;
    local_2f0 = (char *)0x0;
    local_300 = 0;
    ppuStack_298 = &PTR_LAB_00c4e678;
    uStack_240 = 0;
    local_248 = (void *)0x0;
    uStack_250 = 0;
    local_258 = 0;
    local_238 = 0x18;
    pbVar13 = (byte *)((long)local_2e0 + 0x19);
    uVar8 = (ulong)(byte)((byte)local_2e0[3] >> 1);
    if (((byte)local_2e0[3] & 1) != 0) {
      pbVar13 = (byte *)local_2e0[5];
      uVar8 = local_2e0[4];
    }
    if (uVar8 == 0) {
      uVar8 = 0;
    }
    else {
      do {
        bVar2 = *pbVar13;
        if ((0x20 < bVar2) || ((1L << ((ulong)bVar2 & 0x3f) & 0x100002400U) == 0)) {
                    /* try { // try from 00981a1c to 00981a23 has its CatchHandler @ 00981d04 */
          std::__ndk1::
          basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::push_back
                    ((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                      *)&local_300,bVar2);
        }
        uVar8 = uVar8 - 1;
        pbVar13 = pbVar13 + 1;
      } while (uVar8 != 0);
      uVar8 = local_300 & 0xff;
    }
    uVar1 = uVar8 >> 1;
    pcVar4 = (char *)((ulong)&local_300 | 1);
    if ((uVar8 & 1) != 0) {
      uVar1 = local_2f8;
      pcVar4 = local_2f0;
    }
                    /* try { // try from 00981a6c to 00981a77 has its CatchHandler @ 00981c90 */
    std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
              ((basic_ostream *)&local_2a0,pcVar4,uVar1);
    if ((local_300 & 1) != 0) {
      operator_delete(local_2f0);
    }
                    /* try { // try from 00981a88 to 00981a93 has its CatchHandler @ 00981c84 */
    std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::operator>>
              ((basic_istream<char,std::__ndk1::char_traits<char>> *)&local_2b0,&local_2e4);
    local_2b0 = &PTR_LAB_00c4e4e0;
    local_230[0] = &PTR_FUN_00c4e530;
    local_2a0 = &PTR_FUN_00c4e508;
    ppuStack_298 = &PTR_LAB_00c4e678;
    if ((local_258 & 1) != 0) {
      operator_delete(local_248);
    }
    ppuStack_298 = &PTR__basic_streambuf_00c4e728;
    std::__ndk1::locale::~locale(alStack_290);
    std::__ndk1::ios_base::~ios_base((ios_base *)local_230);
  }
  *in_x8 = 0;
  in_x8[1] = 0;
  in_x8[2] = 0;
  if (((ulong)ppuVar14 & 1) == 0) {
    *in_x8 = uVar10 | uVar9 | (ulong)ppuVar14 & 0xff;
    in_x8[1] = uVar16;
    in_x8[2] = (ulong)__src;
    *(int *)(in_x8 + 3) = local_2e4;
    goto LAB_00981b80;
  }
  if (0xffffffffffffffef < uVar16) {
                    /* try { // try from 00981c6c to 00981c73 has its CatchHandler @ 00981c78 */
                    /* WARNING: Subroutine does not return */
    std::__ndk1::__basic_string_common<true>::__throw_length_error();
  }
  if (uVar16 < 0x17) {
    pvVar15 = (void *)((long)in_x8 + 1);
    *(char *)in_x8 = (char)((int)uVar16 << 1);
    if (uVar16 != 0) goto LAB_00981b5c;
  }
  else {
    uVar9 = uVar16 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 00981b44 to 00981b4b has its CatchHandler @ 00981c78 */
    pvVar15 = operator_new(uVar9);
    in_x8[1] = uVar16;
    in_x8[2] = (ulong)pvVar15;
    *in_x8 = uVar9 | 1;
LAB_00981b5c:
    memcpy(pvVar15,__src,uVar16);
  }
  *(undefined1 *)((long)pvVar15 + uVar16) = 0;
  *(int *)(in_x8 + 3) = local_2e4;
  operator_delete(__src);
LAB_00981b80:
  puVar7 = local_2e0;
  if (local_2e0 != (ulong *)0x0) {
    if (local_2d8 != local_2e0) {
      puVar11 = local_2d8;
      do {
        puVar12 = puVar11 + -3;
        if ((*puVar12 & 1) != 0) {
          operator_delete((void *)puVar11[-1]);
        }
        puVar11 = puVar12;
      } while (puVar7 != puVar12);
    }
    local_2d8 = puVar7;
    operator_delete(local_2e0);
  }
  local_190 = &PTR_LAB_00c4e4e0;
  local_110[0] = &PTR_FUN_00c4e530;
  local_180 = &PTR_FUN_00c4e508;
  ppuStack_178 = &PTR_LAB_00c4e678;
  if ((local_138 & 1) != 0) {
    operator_delete(local_128);
  }
  ppuStack_178 = &PTR__basic_streambuf_00c4e728;
  std::__ndk1::locale::~locale(alStack_170);
  std::__ndk1::ios_base::~ios_base((ios_base *)local_110);
  if ((local_2c8 & 1) != 0) {
    operator_delete(local_2b8);
  }
  if (*(long *)(lVar3 + 0x28) != lVar6) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

