/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00981fec
 */

/* ix::Http::parseRequestLine(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&) */

void __thiscall ix::Http::parseRequestLine(Http *this,basic_string_conflict *param_1)

{
  byte bVar1;
  long lVar2;
  basic_istream *pbVar3;
  ulong *in_x8;
  ulong uVar4;
  long lVar5;
  ulong *puVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  byte *pbVar12;
  void *pvVar13;
  ulong *puVar15;
  ulong *puVar14;
  ulong uVar16;
  ulong uVar17;
  ulong uVar18;
  ulong __n;
  void *pvVar19;
  ulong __n_00;
  ulong local_220;
  void *local_218;
  void *local_200;
  ulong local_1d8;
  ulong local_1d0;
  void *local_1c8;
  ulong *local_1c0;
  ulong *local_1b8;
  ulong *local_1b0;
  ulong local_1a8;
  ulong uStack_1a0;
  void *local_198;
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
  
  lVar2 = tpidr_el0;
  lVar5 = *(long *)(lVar2 + 0x28);
  local_1a8 = 0;
  uStack_1a0 = 0;
  local_198 = (void *)0x0;
  local_180 = &PTR_FUN_00c4e508;
  local_110[0] = &PTR__basic_istream_00c4e640;
  uStack_188 = 0;
  local_190 = &PTR__basic_istream_00c4e618;
                    /* try { // try from 00982064 to 0098206f has its CatchHandler @ 0098280c */
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
                    /* try { // try from 009820e4 to 009820ef has its CatchHandler @ 009827fc */
  std::__ndk1::basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
  str((basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
      &ppuStack_178,(basic_string_conflict *)this);
  local_1c0 = (ulong *)0x0;
  local_1b8 = (ulong *)0x0;
  local_1b0 = (ulong *)0x0;
  while( true ) {
                    /* try { // try from 0098210c to 009821ab has its CatchHandler @ 009828b4 */
    pbVar3 = std::__ndk1::getline<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                       ((basic_istream *)&local_190,(basic_string_conflict *)&local_1a8,' ');
    pvVar13 = local_198;
    uVar8 = uStack_1a0;
    puVar6 = local_1b8;
    if (((byte)pbVar3[*(long *)(*(long *)pbVar3 + -0x18) + 0x20] & 5) != 0) break;
    if (local_1b8 == local_1b0) {
      std::__ndk1::
      vector<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
      ::
      __push_back_slow_path<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const&>
                ((vector<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
                  *)&local_1c0,(basic_string_conflict *)&local_1a8);
    }
    else {
      local_1b8[1] = 0;
      local_1b8[2] = 0;
      *local_1b8 = 0;
      if ((local_1a8 & 1) == 0) {
        local_1b8[2] = (ulong)local_198;
        local_1b8[1] = uStack_1a0;
        *local_1b8 = local_1a8;
      }
      else {
        if (0xffffffffffffffef < uStack_1a0) {
                    /* try { // try from 0098273c to 00982743 has its CatchHandler @ 00982774 */
                    /* WARNING: Subroutine does not return */
          std::__ndk1::__basic_string_common<true>::__throw_length_error();
        }
        if (uStack_1a0 < 0x17) {
          pbVar12 = (byte *)((long)local_1b8 + 1);
          *(byte *)local_1b8 = (byte)((int)uStack_1a0 << 1);
          if (uStack_1a0 != 0) goto LAB_009821bc;
        }
        else {
          uVar17 = uStack_1a0 + 0x10 & 0xfffffffffffffff0;
          pbVar12 = operator_new(uVar17);
          puVar6[1] = uVar8;
          puVar6[2] = (ulong)pbVar12;
          *puVar6 = uVar17 | 1;
LAB_009821bc:
          memcpy(pbVar12,pvVar13,uVar8);
        }
        pbVar12[uVar8] = 0;
      }
      local_1b8 = local_1b8 + 3;
    }
  }
  if (local_1b8 == local_1c0) {
    uVar8 = 0;
    uVar9 = 0;
    uVar18 = 0;
    pvVar13 = (void *)0x0;
    uVar17 = 0;
  }
  else {
    local_1d0 = 0;
    local_1c8 = (void *)0x0;
    local_1d8 = 0;
    uVar8 = local_1c0[1];
    pbVar12 = (byte *)local_1c0[2];
    uVar17 = local_1d0;
    pvVar13 = local_1c8;
    uVar18 = local_1d8;
    puVar6 = local_1c0;
    if (((byte)*local_1c0 & 1) == 0) {
      pbVar12 = (byte *)((long)local_1c0 + 1);
      uVar8 = (ulong)(byte)((byte)*local_1c0 >> 1);
    }
    while( true ) {
      local_1d8 = uVar18;
      local_1d0 = uVar17;
      local_1c8 = pvVar13;
      local_1c0 = puVar6;
      if (uVar8 == 0) break;
      bVar1 = *pbVar12;
      if ((0x20 < bVar1) || ((1L << ((ulong)bVar1 & 0x3f) & 0x100002400U) == 0)) {
                    /* try { // try from 00982244 to 0098224b has its CatchHandler @ 0098288c */
        std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
        ::push_back((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                     *)&local_1d8,bVar1);
      }
      pbVar12 = pbVar12 + 1;
      uVar17 = local_1d0;
      pvVar13 = local_1c8;
      uVar18 = local_1d8;
      uVar8 = uVar8 - 1;
      puVar6 = local_1c0;
    }
    uVar9 = uVar18 & 0xffffffffffffff00;
    uVar8 = uVar18 & 0xffffffffffff0000;
  }
  if ((ulong)(((long)local_1b8 - (long)puVar6 >> 3) * -0x5555555555555555) < 2) {
    __n = 0;
    local_200 = (void *)0x0;
    uVar7 = 0;
    uVar10 = 0;
    uVar11 = 0;
LAB_0098240c:
    local_220 = 0;
    local_218 = (void *)0x0;
    uVar4 = 0;
    uVar16 = 0;
    __n_00 = 0;
  }
  else {
    local_1d0 = 0;
    local_1c8 = (void *)0x0;
    local_1d8 = 0;
    pbVar12 = (byte *)((long)local_1c0 + 0x19);
    uVar7 = (ulong)(byte)((byte)local_1c0[3] >> 1);
    if (((byte)local_1c0[3] & 1) != 0) {
      pbVar12 = (byte *)local_1c0[5];
      uVar7 = local_1c0[4];
    }
    if (uVar7 != 0) {
      do {
        bVar1 = *pbVar12;
        if ((0x20 < bVar1) || ((1L << ((ulong)bVar1 & 0x3f) & 0x100002400U) == 0)) {
                    /* try { // try from 009822f4 to 009822fb has its CatchHandler @ 00982854 */
          std::__ndk1::
          basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::push_back
                    ((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                      *)&local_1d8,bVar1);
        }
        uVar7 = uVar7 - 1;
        pbVar12 = pbVar12 + 1;
      } while (uVar7 != 0);
    }
    local_200 = local_1c8;
    __n = local_1d0;
    uVar7 = local_1d8;
    uVar10 = local_1d8 & 0xffffffffffffff00;
    uVar11 = local_1d8 & 0xffffffffffff0000;
    if ((ulong)(((long)local_1b8 - (long)local_1c0 >> 3) * -0x5555555555555555) < 3)
    goto LAB_0098240c;
    local_1d0 = 0;
    local_1c8 = (void *)0x0;
    local_1d8 = 0;
    pbVar12 = (byte *)((long)local_1c0 + 0x31);
    uVar16 = (ulong)(byte)((byte)local_1c0[6] >> 1);
    if (((byte)local_1c0[6] & 1) != 0) {
      pbVar12 = (byte *)local_1c0[8];
      uVar16 = local_1c0[7];
    }
    if (uVar16 != 0) {
      do {
        bVar1 = *pbVar12;
        if ((0x20 < bVar1) || ((1L << ((ulong)bVar1 & 0x3f) & 0x100002400U) == 0)) {
                    /* try { // try from 009823d0 to 009823d7 has its CatchHandler @ 00982814 */
          std::__ndk1::
          basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::push_back
                    ((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                      *)&local_1d8,bVar1);
        }
        uVar16 = uVar16 - 1;
        pbVar12 = pbVar12 + 1;
      } while (uVar16 != 0);
    }
    local_220 = local_1d8 & 0xffffffffffff0000;
    uVar4 = local_1d8 & 0xff00;
    uVar16 = local_1d8;
    __n_00 = local_1d0;
    local_218 = local_1c8;
  }
  *in_x8 = 0;
  in_x8[1] = 0;
  in_x8[2] = 0;
  if ((uVar18 & 1) == 0) {
    *in_x8 = uVar9 & 0xff00 | uVar8 | uVar18 & 0xff;
    in_x8[1] = uVar17;
    in_x8[2] = (ulong)pvVar13;
  }
  else {
    if (0xffffffffffffffef < uVar17) {
                    /* try { // try from 00982748 to 00982757 has its CatchHandler @ 009827ec */
                    /* WARNING: Subroutine does not return */
      std::__ndk1::__basic_string_common<true>::__throw_length_error();
    }
    if (uVar17 < 0x17) {
      pvVar19 = (void *)((long)in_x8 + 1);
      *(char *)in_x8 = (char)((int)uVar17 << 1);
      if (uVar17 != 0) goto LAB_009824c4;
    }
    else {
      uVar8 = uVar17 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 009824a4 to 009824ab has its CatchHandler @ 009827ec */
      pvVar19 = operator_new(uVar8);
      in_x8[1] = uVar17;
      in_x8[2] = (ulong)pvVar19;
      *in_x8 = uVar8 | 1;
LAB_009824c4:
      memcpy(pvVar19,pvVar13,uVar17);
    }
    *(undefined1 *)((long)pvVar19 + uVar17) = 0;
  }
  in_x8[3] = 0;
  in_x8[4] = 0;
  in_x8[5] = 0;
  if ((uVar7 & 1) == 0) {
    in_x8[3] = uVar10 & 0xff00 | uVar11 | uVar7 & 0xff;
    in_x8[4] = __n;
    in_x8[5] = (ulong)local_200;
  }
  else {
    if (0xffffffffffffffef < __n) {
                    /* try { // try from 00982758 to 00982767 has its CatchHandler @ 009827c8 */
                    /* WARNING: Subroutine does not return */
      std::__ndk1::__basic_string_common<true>::__throw_length_error();
    }
    if (__n < 0x17) {
      pvVar19 = (void *)((long)in_x8 + 0x19);
      *(char *)(in_x8 + 3) = (char)((int)__n << 1);
      if (__n != 0) goto LAB_0098257c;
    }
    else {
      uVar8 = __n + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 0098255c to 00982563 has its CatchHandler @ 009827c8 */
      pvVar19 = operator_new(uVar8);
      in_x8[4] = __n;
      in_x8[5] = (ulong)pvVar19;
      in_x8[3] = uVar8 | 1;
LAB_0098257c:
      memcpy(pvVar19,local_200,__n);
    }
    *(undefined1 *)((long)pvVar19 + __n) = 0;
  }
  in_x8[6] = 0;
  in_x8[7] = 0;
  in_x8[8] = 0;
  if ((uVar16 & 1) == 0) {
    in_x8[6] = uVar4 | local_220 | uVar16 & 0xff;
    in_x8[7] = __n_00;
    in_x8[8] = (ulong)local_218;
    goto joined_r0x009826a4;
  }
  if (0xffffffffffffffef < __n_00) {
                    /* try { // try from 00982768 to 00982773 has its CatchHandler @ 00982778 */
                    /* WARNING: Subroutine does not return */
    std::__ndk1::__basic_string_common<true>::__throw_length_error();
  }
  if (__n_00 < 0x17) {
    pvVar19 = (void *)((long)in_x8 + 0x31);
    *(char *)(in_x8 + 6) = (char)((int)__n_00 << 1);
    if (__n_00 != 0) goto LAB_00982680;
  }
  else {
    uVar8 = __n_00 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 0098265c to 00982663 has its CatchHandler @ 00982778 */
    pvVar19 = operator_new(uVar8);
    in_x8[7] = __n_00;
    in_x8[8] = (ulong)pvVar19;
    in_x8[6] = uVar8 | 1;
LAB_00982680:
    memcpy(pvVar19,local_218,__n_00);
  }
  *(undefined1 *)((long)pvVar19 + __n_00) = 0;
  operator_delete(local_218);
joined_r0x009826a4:
  if ((uVar7 & 1) != 0) {
    operator_delete(local_200);
  }
  if ((uVar18 & 1) != 0) {
    operator_delete(pvVar13);
  }
  puVar6 = local_1c0;
  if (local_1c0 != (ulong *)0x0) {
    if (local_1b8 != local_1c0) {
      puVar14 = local_1b8;
      do {
        puVar15 = puVar14 + -3;
        if ((*puVar15 & 1) != 0) {
          operator_delete((void *)puVar14[-1]);
        }
        puVar14 = puVar15;
      } while (puVar6 != puVar15);
    }
    local_1b8 = puVar6;
    operator_delete(local_1c0);
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
  if ((local_1a8 & 1) != 0) {
    operator_delete(local_198);
  }
  if (*(long *)(lVar2 + 0x28) != lVar5) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

