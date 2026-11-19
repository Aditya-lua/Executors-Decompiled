/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ff868
 */

/* cpr::util::parseHeader(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >*, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >*) */

void __thiscall
cpr::util::parseHeader
          (util *this,basic_string_conflict *param_1,basic_string_conflict *param_2,
          basic_string_conflict *param_3)

{
  ulong uVar1;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> bVar2;
  long lVar3;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar4;
  bool bVar5;
  int iVar6;
  basic_istream *pbVar7;
  void *pvVar8;
  char *pcVar9;
  long lVar10;
  size_t sVar11;
  undefined8 *in_x8;
  ulong uVar12;
  long lVar13;
  ulong uVar14;
  char *pcVar15;
  ulong uVar16;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar17;
  undefined8 *puVar18;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar19;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *pbVar20;
  ulong uVar21;
  ulong local_1e8;
  ulong local_1e0;
  void *local_1d8;
  undefined8 local_1d0;
  ulong uStack_1c8;
  char *local_1c0;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *local_1b8;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *local_1b0;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *local_1a8;
  undefined1 auStack_1a0 [8];
  ulong *local_198;
  undefined **local_190;
  undefined8 uStack_188;
  undefined **local_180;
  locale alStack_178 [8];
  undefined8 local_170;
  undefined8 uStack_168;
  undefined8 local_160;
  undefined8 uStack_158;
  undefined8 uStack_150;
  undefined8 uStack_148;
  ulong local_140;
  undefined8 uStack_138;
  void *local_130;
  undefined8 uStack_128;
  undefined4 local_120;
  undefined **local_118 [17];
  undefined8 local_90;
  undefined4 local_88;
  
  lVar3 = tpidr_el0;
  lVar13 = *(long *)(lVar3 + 0x28);
  puVar18 = in_x8 + 1;
  *puVar18 = 0;
  in_x8[2] = 0;
  local_1b8 = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)0x0;
  local_1b0 = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)0x0;
  local_1a8 = (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)0x0;
  local_118[0] = &PTR__basic_istream_00c4f210;
  *in_x8 = puVar18;
  uStack_188 = 0;
  local_190 = &PTR__basic_istream_00c4f1e8;
                    /* try { // try from 008ff8ec to 008ff8f7 has its CatchHandler @ 00900218 */
  std::__ndk1::ios_base::init
            ((ios_base *)local_118,
             (basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
             &local_180);
  local_90 = 0;
  local_88 = 0xffffffff;
  local_190 = &PTR_LAB_00c4f190;
  local_118[0] = &PTR_FUN_00c4f1b8;
  local_180 = &PTR__basic_streambuf_00c4e728;
  std::__ndk1::locale::locale(alStack_178);
  uStack_158 = 0;
  local_160 = 0;
  uStack_148 = 0;
  uStack_150 = 0;
  uStack_168 = 0;
  local_170 = 0;
  local_180 = &PTR_LAB_00c4e678;
  uStack_138 = 0;
  local_140 = 0;
  uStack_128 = 0;
  local_130 = (void *)0x0;
  local_120 = 8;
                    /* try { // try from 008ff960 to 008ff96b has its CatchHandler @ 00900208 */
  std::__ndk1::basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
  str((basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
      &local_180,(basic_string_conflict *)this);
  local_1d0 = 0;
  uStack_1c8 = 0;
  local_1c0 = (char *)0x0;
                    /* try { // try from 008ff988 to 008ffa27 has its CatchHandler @ 00900280 */
  while (pbVar7 = std::__ndk1::
                  getline<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                            ((basic_istream *)&local_190,(basic_string_conflict *)&local_1d0,'\n'),
        pbVar4 = local_1b0, pcVar15 = local_1c0, uVar14 = uStack_1c8,
        ((byte)pbVar7[*(long *)(*(long *)pbVar7 + -0x18) + 0x20] & 5) == 0) {
    if (local_1b0 == local_1a8) {
      std::__ndk1::
      vector<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
      ::
      __push_back_slow_path<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const&>
                ((vector<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>
                  *)&local_1b8,(basic_string_conflict *)&local_1d0);
    }
    else {
      *(ulong *)(local_1b0 + 8) = 0;
      *(ulong *)(local_1b0 + 0x10) = 0;
      *(ulong *)local_1b0 = 0;
      if ((local_1d0 & 1) == 0) {
        *(char **)(local_1b0 + 0x10) = local_1c0;
        *(ulong *)(local_1b0 + 8) = uStack_1c8;
        *(ulong *)local_1b0 = local_1d0;
      }
      else {
        if (0xffffffffffffffef < uStack_1c8) {
                    /* try { // try from 009001d0 to 009001d7 has its CatchHandler @ 00900200 */
                    /* WARNING: Subroutine does not return */
          std::__ndk1::__basic_string_common<true>::__throw_length_error();
        }
        if (uStack_1c8 < 0x17) {
          pbVar20 = local_1b0 + 1;
          *local_1b0 = SUB41((int)uStack_1c8 << 1,0);
          if (uStack_1c8 != 0) goto LAB_008ffa38;
        }
        else {
          uVar21 = uStack_1c8 + 0x10 & 0xfffffffffffffff0;
          pbVar20 = operator_new(uVar21);
          *(ulong *)(pbVar4 + 8) = uVar14;
          *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
           (pbVar4 + 0x10) = pbVar20;
          *(ulong *)pbVar4 = uVar21 | 1;
LAB_008ffa38:
          memcpy(pbVar20,pcVar15,uVar14);
        }
        pbVar20[uVar14] =
             (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x0;
      }
      local_1b0 = local_1b0 + 0x18;
    }
  }
  if ((local_1d0 & 1) != 0) {
    operator_delete(local_1c0);
  }
  pbVar4 = local_1b0;
  if (local_1b8 == local_1b0) {
LAB_009000f0:
    local_190 = &PTR_LAB_00c4f190;
    local_118[0] = &PTR_FUN_00c4f1b8;
    local_180 = &PTR_LAB_00c4e678;
    if ((local_140 & 1) != 0) {
      operator_delete(local_130);
    }
    local_180 = &PTR__basic_streambuf_00c4e728;
    std::__ndk1::locale::~locale(alStack_178);
    std::__ndk1::ios_base::~ios_base((ios_base *)local_118);
    pbVar4 = local_1b8;
    if (local_1b8 !=
        (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)0x0) {
      if (local_1b0 != local_1b8) {
        pbVar20 = local_1b0;
        do {
          pbVar19 = pbVar20 + -0x18;
          if (((byte)*pbVar19 & 1) != 0) {
            operator_delete(*(void **)(pbVar20 + -8));
          }
          pbVar20 = pbVar19;
        } while (pbVar4 != pbVar19);
      }
      local_1b0 = pbVar4;
      operator_delete(local_1b8);
    }
    if (*(long *)(lVar3 + 0x28) != lVar13) {
                    /* WARNING: Subroutine does not return */
      __stack_chk_fail();
    }
    return;
  }
  pcVar15 = (char *)((ulong)&local_1d0 | 1);
  pbVar20 = local_1b8;
LAB_008ffac0:
  uStack_1c8 = 0;
  local_1c0 = (char *)0x0;
  local_1d0 = 0;
  pbVar19 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
             (pbVar20 + 0x10);
  uVar14 = (ulong)((byte)*pbVar20 >> 1);
  if (((byte)*pbVar20 & 1) == 0) {
    pbVar19 = pbVar20 + 1;
  }
  else {
    uVar14 = *(ulong *)(pbVar20 + 8);
  }
  if (4 < uVar14) {
    uVar14 = 5;
  }
  if (0xffffffffffffffef < uVar14) {
                    /* try { // try from 009001c8 to 009001cf has its CatchHandler @ 00900204 */
                    /* WARNING: Subroutine does not return */
    std::__ndk1::__basic_string_common<true>::__throw_length_error();
  }
  if (uVar14 < 0x17) {
    local_1d0 = (ulong)(byte)((int)uVar14 << 1);
    pcVar9 = pcVar15;
    if (uVar14 != 0) goto LAB_008ffb28;
  }
  else {
                    /* try { // try from 008ffb10 to 008ffb17 has its CatchHandler @ 0090026c */
    pcVar9 = operator_new(0x10);
    local_1d0 = 0x11;
    uStack_1c8 = uVar14;
    local_1c0 = pcVar9;
LAB_008ffb28:
    memcpy(pcVar9,pbVar19,uVar14);
  }
  uVar21 = local_1d0;
  pcVar9[uVar14] = '\0';
  bVar5 = false;
  uVar14 = local_1d0 >> 1 & 0x7f;
  if ((local_1d0 & 1) != 0) {
    uVar14 = uStack_1c8;
  }
  if (uVar14 == 5) {
    pcVar9 = pcVar15;
    if ((local_1d0 & 1) != 0) {
      pcVar9 = local_1c0;
    }
    iVar6 = memcmp(pcVar9,"HTTP/",5);
    bVar5 = iVar6 == 0;
  }
  pbVar19 = pbVar20 + 1;
  if ((uVar21 & 1) != 0) {
    operator_delete(local_1c0);
  }
  if (bVar5) {
    if (param_1 != (basic_string_conflict *)0x0 || param_2 != (basic_string_conflict *)0x0) {
      bVar2 = *pbVar20;
      if (((byte)bVar2 & 1) == 0) {
        uVar14 = (ulong)((byte)bVar2 >> 1);
        pbVar17 = pbVar19;
      }
      else {
        uVar14 = *(ulong *)(pbVar20 + 8);
        pbVar17 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                    **)(pbVar20 + 0x10);
      }
      uVar21 = uVar14;
      while (uVar21 != 0) {
        lVar10 = uVar21 - 1;
        uVar21 = uVar21 - 1;
        if ((0x3f < (ulong)(byte)pbVar17[lVar10]) ||
           ((1L << ((ulong)(byte)pbVar17[lVar10] & 0x3f) & 0x100002600U) == 0)) goto LAB_008ffbec;
      }
      uVar21 = 0xffffffffffffffff;
LAB_008ffbec:
      if (uVar21 + 1 < uVar14) {
        uVar14 = uVar21 + 1;
      }
      if (((byte)bVar2 & 1) == 0) {
        uVar21 = uVar14 - ((byte)bVar2 >> 1);
        if (uVar14 < (byte)bVar2 >> 1 || uVar21 == 0) goto LAB_008ffc08;
LAB_008ffc2c:
                    /* try { // try from 008ffc2c to 008ffc37 has its CatchHandler @ 0090023c */
        std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
        ::append(pbVar20,uVar21,'\0');
      }
      else {
        uVar21 = uVar14 - *(ulong *)(pbVar20 + 8);
        if (*(ulong *)(pbVar20 + 8) <= uVar14 && uVar21 != 0) goto LAB_008ffc2c;
LAB_008ffc08:
        if (((byte)bVar2 & 1) == 0) {
          pbVar20[uVar14 + 1] =
               (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x0;
          *pbVar20 = SUB41((int)uVar14 << 1,0);
        }
        else {
          *(undefined1 *)(*(long *)(pbVar20 + 0x10) + uVar14) = 0;
          *(ulong *)(pbVar20 + 8) = uVar14;
        }
      }
      if (pbVar20 !=
          (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)param_1
          && param_1 != (basic_string_conflict *)0x0) {
        uVar14 = (ulong)((byte)*pbVar20 >> 1);
        pbVar17 = pbVar19;
        if (((byte)*pbVar20 & 1) != 0) {
          uVar14 = *(ulong *)(pbVar20 + 8);
          pbVar17 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                      **)(pbVar20 + 0x10);
        }
                    /* try { // try from 008ffc74 to 008ffc7b has its CatchHandler @ 00900238 */
        std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
        ::assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
                 param_1,(char *)pbVar17,uVar14);
      }
      if (param_2 != (basic_string_conflict *)0x0) {
        bVar2 = *pbVar20;
        if (((byte)bVar2 & 1) == 0) {
          uVar14 = (ulong)((byte)bVar2 >> 1);
          pbVar17 = pbVar19;
        }
        else {
          uVar14 = *(ulong *)(pbVar20 + 8);
          pbVar17 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                      **)(pbVar20 + 0x10);
        }
        if (uVar14 != 0) {
          uVar21 = 0;
          do {
            if ((pbVar17[uVar21] ==
                 (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)
                 0x20) ||
               (pbVar17[uVar21] ==
                (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x9)
               ) {
              if ((uVar14 != uVar21) && (uVar21 != 0xffffffffffffffff)) {
                uVar21 = uVar21 + 1;
                if (((byte)bVar2 & 1) == 0) {
                  uVar14 = (ulong)((byte)bVar2 >> 1);
                  pbVar17 = pbVar19;
                }
                else {
                  uVar14 = *(ulong *)(pbVar20 + 8);
                  pbVar17 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                              **)(pbVar20 + 0x10);
                }
                if (uVar21 < uVar14) goto LAB_008ffd04;
              }
              break;
            }
            uVar21 = uVar21 + 1;
          } while (uVar14 != uVar21);
        }
      }
    }
    goto LAB_008ffdb8;
  }
  goto LAB_008ffdd4;
  while (uVar21 = uVar21 + 1, uVar14 != uVar21) {
LAB_008ffd04:
    if ((pbVar17[uVar21] ==
         (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x20) ||
       (pbVar17[uVar21] ==
        (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x9)) {
      if ((uVar14 != uVar21) && (uVar21 != 0xffffffffffffffff)) {
        if (((byte)bVar2 & 1) == 0) {
          uVar14 = (ulong)((byte)bVar2 >> 1);
          pbVar17 = pbVar19;
        }
        else {
          uVar14 = *(ulong *)(pbVar20 + 8);
          pbVar17 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                      **)(pbVar20 + 0x10);
        }
        uVar12 = uVar14;
        if (uVar21 + 1 <= uVar14) {
          uVar12 = uVar21 + 1;
        }
        sVar11 = uVar14 - uVar12;
        if (sVar11 != 0) {
          memmove(pbVar17,pbVar17 + uVar12,sVar11);
          bVar2 = *pbVar20;
        }
        if (((byte)bVar2 & 1) == 0) {
          *pbVar20 = SUB41((int)sVar11 << 1,0);
        }
        else {
          *(size_t *)(pbVar20 + 8) = sVar11;
        }
        pbVar17[sVar11] =
             (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x0;
        if (pbVar20 !=
            (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
            param_2) {
          uVar14 = (ulong)((byte)*pbVar20 >> 1);
          pbVar17 = pbVar19;
          if (((byte)*pbVar20 & 1) != 0) {
            uVar14 = *(ulong *)(pbVar20 + 8);
            pbVar17 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                        **)(pbVar20 + 0x10);
          }
                    /* try { // try from 008ffdb0 to 008ffdb7 has its CatchHandler @ 00900220 */
          std::__ndk1::
          basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::assign
                    ((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                      *)param_2,(char *)pbVar17,uVar14);
        }
      }
      break;
    }
  }
LAB_008ffdb8:
  FUN_00827168(in_x8,in_x8[1]);
  in_x8[1] = 0;
  in_x8[2] = 0;
  *in_x8 = puVar18;
LAB_008ffdd4:
  bVar2 = *pbVar20;
  if (((byte)bVar2 & 1) == 0) {
    if ((byte)bVar2 >> 1 == 0) goto LAB_009000e0;
  }
  else if (*(long *)(pbVar20 + 8) == 0) goto LAB_009000e0;
  if (((byte)bVar2 & 1) == 0) {
    sVar11 = (size_t)((byte)bVar2 >> 1);
    pbVar17 = pbVar19;
  }
  else {
    sVar11 = *(size_t *)(pbVar20 + 8);
    pbVar17 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
               (pbVar20 + 0x10);
  }
  if (((sVar11 == 0) || (pvVar8 = memchr(pbVar17,0x3a,sVar11), pvVar8 == (void *)0x0)) ||
     (uVar14 = (long)pvVar8 - (long)pbVar17, uVar14 == 0xffffffffffffffff)) goto LAB_009000e0;
  local_1d0 = 0;
  uStack_1c8 = 0;
  local_1c0 = (char *)0x0;
  uVar21 = uVar14 + 1;
  uVar12 = (ulong)((byte)bVar2 >> 1);
  if (((byte)bVar2 & 1) != 0) {
    uVar12 = *(ulong *)(pbVar20 + 8);
  }
  uVar16 = uVar12 - uVar21;
  if (uVar12 < uVar21) {
                    /* try { // try from 009001d8 to 009001e7 has its CatchHandler @ 009001fc */
    std::__ndk1::__basic_string_common<true>::__throw_out_of_range();
LAB_009001e0:
                    /* WARNING: Subroutine does not return */
    std::__ndk1::__basic_string_common<true>::__throw_length_error();
  }
  pbVar17 = pbVar19;
  if (((byte)bVar2 & 1) != 0) {
    pbVar17 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
               (pbVar20 + 0x10);
  }
  if (0xffffffffffffffef < uVar16) goto LAB_009001e0;
  if (uVar16 < 0x17) {
    local_1d0 = (ulong)(byte)((int)uVar16 << 1);
    pcVar9 = pcVar15;
    if (uVar16 != 0) goto LAB_008ffe9c;
  }
  else {
    uVar12 = uVar16 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 008ffe84 to 008ffe8b has its CatchHandler @ 00900234 */
    pcVar9 = operator_new(uVar12);
    local_1d0 = uVar12 | 1;
    uStack_1c8 = uVar16;
    local_1c0 = pcVar9;
LAB_008ffe9c:
    memcpy(pcVar9,pbVar17 + uVar21,uVar16);
  }
  pcVar9[uVar16] = '\0';
  uVar12 = local_1d0 & 0xff;
  pcVar9 = pcVar15;
  uVar21 = local_1d0 >> 1 & 0x7f;
  if ((local_1d0 & 1) != 0) {
    pcVar9 = local_1c0;
    uVar21 = uStack_1c8;
  }
  if (uVar21 != 0) {
    uVar16 = 0;
    do {
      if ((0x3f < (ulong)(byte)pcVar9[uVar16]) ||
         ((1L << ((ulong)(byte)pcVar9[uVar16] & 0x3f) & 0x100000200U) == 0)) {
        if (uVar16 != 0) goto LAB_008fff0c;
        goto LAB_008fff4c;
      }
      uVar16 = uVar16 + 1;
    } while (uVar21 != uVar16);
  }
  uVar16 = 0xffffffffffffffff;
LAB_008fff0c:
  uVar1 = uVar21;
  if (uVar16 <= uVar21) {
    uVar1 = uVar16;
  }
  sVar11 = uVar21 - uVar1;
  if (sVar11 != 0) {
    memmove(pcVar9,pcVar9 + uVar1,sVar11);
    uVar12 = local_1d0 & 0xff;
  }
  if ((uVar12 & 1) == 0) {
    local_1d0 = CONCAT71(local_1d0._1_7_,(char)((int)sVar11 << 1));
  }
  else {
    uStack_1c8 = sVar11;
  }
  pcVar9[sVar11] = '\0';
  uVar12 = local_1d0 & 0xff;
LAB_008fff4c:
  pcVar9 = pcVar15;
  uVar21 = uVar12 >> 1;
  if ((uVar12 & 1) != 0) {
    pcVar9 = local_1c0;
    uVar21 = uStack_1c8;
  }
  uVar16 = uVar21;
  while (uVar16 != 0) {
    lVar10 = uVar16 - 1;
    uVar16 = uVar16 - 1;
    if ((0x3f < (ulong)(byte)pcVar9[lVar10]) ||
       ((1L << ((ulong)(byte)pcVar9[lVar10] & 0x3f) & 0x100002600U) == 0)) goto LAB_008fff94;
  }
  uVar16 = 0xffffffffffffffff;
LAB_008fff94:
  if (uVar16 + 1 < uVar21) {
    uVar21 = uVar16 + 1;
  }
  uVar16 = uVar12 >> 1;
  if ((uVar12 & 1) != 0) {
    uVar16 = uStack_1c8;
  }
  if (uVar21 < uVar16 || uVar21 - uVar16 == 0) {
    if ((uVar12 & 1) == 0) {
      auStack_1a0[uVar21 - 0x2f] = 0;
      local_1d0 = CONCAT71(local_1d0._1_7_,(char)((int)uVar21 << 1));
    }
    else {
      local_1c0[uVar21] = '\0';
      uStack_1c8 = uVar21;
    }
  }
  else {
                    /* try { // try from 008fffb4 to 008fffbf has its CatchHandler @ 0090022c */
    std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    append((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
           &local_1d0,uVar21 - uVar16,'\0');
  }
  local_1e0 = 0;
  local_1d8 = (void *)0x0;
  local_1e8 = 0;
  uVar21 = (ulong)((byte)*pbVar20 >> 1);
  if (((byte)*pbVar20 & 1) != 0) {
    pbVar19 = *(basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> **)
               (pbVar20 + 0x10);
    uVar21 = *(ulong *)(pbVar20 + 8);
  }
  if (uVar14 <= uVar21) {
    uVar21 = uVar14;
  }
  if (0xffffffffffffffef < uVar21) {
                    /* try { // try from 009001e8 to 009001ef has its CatchHandler @ 009001f4 */
                    /* WARNING: Subroutine does not return */
    std::__ndk1::__basic_string_common<true>::__throw_length_error();
  }
  if (uVar21 < 0x17) {
    local_1e8 = (ulong)(byte)((int)uVar21 << 1);
    pvVar8 = (void *)((ulong)&local_1e8 | 1);
    if (uVar21 != 0) goto LAB_00900058;
  }
  else {
    uVar14 = uVar21 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 00900040 to 00900047 has its CatchHandler @ 00900224 */
    pvVar8 = operator_new(uVar14);
    local_1e8 = uVar14 | 1;
    local_1e0 = uVar21;
    local_1d8 = pvVar8;
LAB_00900058:
    memcpy(pvVar8,pbVar19,uVar21);
  }
  local_198 = &local_1e8;
  *(undefined1 *)((long)pvVar8 + uVar21) = 0;
                    /* try { // try from 00900074 to 009000bf has its CatchHandler @ 00900240 */
  lVar10 = FUN_00825c7c(in_x8,&local_1e8,&DAT_007462d9,&local_198,auStack_1a0);
  if ((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
      (lVar10 + 0x38) !=
      (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)&local_1d0)
  {
    pcVar9 = pcVar15;
    uVar14 = local_1d0 >> 1 & 0x7f;
    if ((local_1d0 & 1) != 0) {
      pcVar9 = local_1c0;
      uVar14 = uStack_1c8;
    }
    std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
           (lVar10 + 0x38),pcVar9,uVar14);
  }
  if ((local_1e8 & 1) != 0) {
    operator_delete(local_1d8);
  }
  if ((local_1d0 & 1) != 0) {
    operator_delete(local_1c0);
  }
LAB_009000e0:
  pbVar20 = pbVar20 + 0x18;
  if (pbVar20 == pbVar4) goto LAB_009000f0;
  goto LAB_008ffac0;
}

