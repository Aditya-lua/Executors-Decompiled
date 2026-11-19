/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098b524
 */

/* WARNING (jumptable): Heritage AFTER dead removal. Revisit: 0xfffffffffffffee8 */
/* WARNING: Type propagation algorithm not settling */
/* WARNING: Restarted to delay deadcode elimination for space: stack */
/* ix::UrlParser::parse(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >&, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >&, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >&, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >&, int&, bool&) */

undefined8
ix::UrlParser::parse
          (basic_string_conflict *param_1,basic_string_conflict *param_2,
          basic_string_conflict *param_3,basic_string_conflict *param_4,
          basic_string_conflict *param_5,int *param_6,bool *param_7)

{
  ulong uVar1;
  basic_string_conflict bVar2;
  long lVar3;
  ulong uVar4;
  ulong uVar5;
  basic_string_conflict *pbVar6;
  ulong uVar7;
  basic_string_conflict *pbVar8;
  basic_string_conflict *pbVar9;
  ulong uVar10;
  basic_string_conflict *pbVar11;
  basic_string_conflict *pbVar12;
  ulong uVar13;
  basic_string_conflict *pbVar14;
  basic_string_conflict *pbVar15;
  bool bVar16;
  int iVar17;
  int iVar18;
  char *pcVar19;
  basic_string_conflict *pbVar20;
  uint uVar21;
  long lVar22;
  byte bVar23;
  byte bVar24;
  uint uVar25;
  basic_string_conflict *pbVar26;
  basic_string_conflict *pbVar27;
  basic_string_conflict *pbVar28;
  basic_string_conflict *pbVar29;
  undefined8 uVar30;
  basic_string_conflict *pbVar31;
  byte *pbVar32;
  byte *pbVar33;
  basic_string_conflict *pbVar34;
  byte *pbVar35;
  int local_218;
  undefined8 local_210;
  basic_string_conflict *pbStack_208;
  basic_string_conflict *local_200;
  undefined8 local_1f8;
  basic_string_conflict *pbStack_1f0;
  basic_string_conflict *local_1e8;
  undefined8 local_1e0;
  basic_string_conflict *pbStack_1d8;
  basic_string_conflict *local_1d0;
  undefined8 local_1c8;
  basic_string_conflict *pbStack_1c0;
  basic_string_conflict *local_1b8;
  undefined8 local_1b0;
  basic_string_conflict *pbStack_1a8;
  basic_string_conflict *local_1a0;
  ulong local_198;
  basic_string_conflict *pbStack_190;
  basic_string_conflict *local_188;
  ulong local_180;
  basic_string_conflict *pbStack_178;
  basic_string_conflict *local_170;
  ulong local_168;
  basic_string_conflict *pbStack_160;
  basic_string_conflict *local_158;
  ulong local_150;
  basic_string_conflict *pbStack_148;
  basic_string_conflict *local_140;
  undefined4 local_138;
  undefined4 uStack_134;
  undefined8 uStack_130;
  basic_string_conflict *pbStack_128;
  basic_string_conflict *local_120;
  ulong local_118;
  basic_string_conflict *pbStack_110;
  basic_string_conflict *local_108;
  ulong local_100;
  basic_string_conflict *pbStack_f8;
  basic_string_conflict *local_f0;
  ulong local_e8;
  basic_string_conflict *pbStack_e0;
  basic_string_conflict *local_d8;
  ulong local_d0;
  basic_string_conflict *pbStack_c8;
  basic_string_conflict *local_c0;
  ulong local_b8;
  basic_string_conflict *pbStack_b0;
  basic_string_conflict *local_a8;
  ulong local_a0;
  basic_string_conflict *pbStack_98;
  basic_string_conflict *local_90;
  ulong local_88;
  basic_string_conflict *pbStack_80;
  basic_string_conflict *local_78;
  
  lVar3 = tpidr_el0;
  lVar22 = *(long *)(lVar3 + 0x28);
  pbVar20 = (basic_string_conflict *)0xc0;
  local_138 = 1;
  memset(&uStack_130,0,0xc0);
  pbVar26 = *(basic_string_conflict **)(param_1 + 0x10);
  if (((byte)*param_1 & 1) == 0) {
    pbVar26 = param_1 + 1;
  }
  pcVar19 = strchr((char *)pbVar26,0x3a);
  if (pcVar19 == (char *)0x0) {
    local_218 = 2;
LAB_0098b790:
    pbVar20 = (basic_string_conflict *)0xc0;
    memset(&local_210,0,0xc0);
joined_r0x0098c190:
    if ((local_88 & 1) != 0) {
      operator_delete(local_78);
    }
  }
  else {
    pbVar34 = (basic_string_conflict *)(pcVar19 + -(long)pbVar26);
    local_150 = 0;
    pbStack_148 = (basic_string_conflict *)0x0;
    local_140 = (basic_string_conflict *)0x0;
    if ((basic_string_conflict *)0xffffffffffffffef < pbVar34) {
                    /* try { // try from 0098c4cc to 0098c4d3 has its CatchHandler @ 0098c52c */
                    /* WARNING: Subroutine does not return */
      std::__ndk1::__basic_string_common<true>::__throw_length_error();
    }
    if (pbVar34 < (basic_string_conflict *)0x17) {
      pbVar27 = (basic_string_conflict *)((ulong)&local_150 | 1);
      local_150 = (ulong)(byte)((int)pbVar34 << 1);
      if (pbVar34 != (basic_string_conflict *)0x0) goto LAB_0098b618;
    }
    else {
                    /* try { // try from 0098b600 to 0098b607 has its CatchHandler @ 0098c52c */
      pbVar27 = operator_new((ulong)(pbVar34 + 0x10) & 0xfffffffffffffff0);
      local_150 = (ulong)(pbVar34 + 0x10) & 0xfffffffffffffff0 | 1;
      pbStack_148 = pbVar34;
      local_140 = pbVar27;
LAB_0098b618:
      pbVar20 = pbVar34;
      memcpy(pbVar27,pbVar26,(size_t)pbVar34);
    }
    pbVar27[(long)pbVar34] = (basic_string_conflict)0x0;
    if ((uStack_130 & 1) != 0) {
      *local_120 = (basic_string_conflict)0x0;
      pbStack_128 = (basic_string_conflict *)0x0;
      if ((uStack_130 & 1) != 0) {
        operator_delete(local_120);
      }
    }
    pbVar26 = local_140;
    pbVar27 = pbStack_148;
    uVar1 = local_150;
    local_120 = local_140;
    pbStack_128 = pbStack_148;
    uStack_130 = local_150;
    pbVar34 = (basic_string_conflict *)(local_150 >> 1 & 0x7f);
    if ((local_150 & 1) == 0) {
      pbVar31 = (basic_string_conflict *)((long)&uStack_130 + 1);
      pbVar29 = pbVar34;
    }
    else {
      pbVar31 = local_140;
      pbVar29 = pbStack_148;
    }
    if (pbVar29 != (basic_string_conflict *)0x0) {
      pbVar28 = pbVar31;
      do {
        bVar2 = *pbVar28;
        iVar17 = isalpha((uint)(byte)bVar2);
        if ((iVar17 == 0) &&
           ((0x2e < (byte)bVar2 || ((1L << ((ulong)(byte)bVar2 & 0x3f) & 0x680000000000U) == 0)))) {
          pbVar20 = (basic_string_conflict *)0xc0;
          local_218 = 3;
          memset(&local_210,0,0xc0);
          goto joined_r0x0098c190;
        }
        pbVar29 = pbVar29 + -1;
        pbVar28 = pbVar28 + 1;
      } while (pbVar29 != (basic_string_conflict *)0x0);
    }
    pbVar26 = pbVar26 + (long)pbVar27;
    if ((uVar1 & 1) == 0) {
      pbVar26 = pbVar34 + (long)&uStack_130 + 1;
    }
    for (; pbVar31 != pbVar26; pbVar31 = pbVar31 + 1) {
      iVar17 = tolower((uint)(byte)*pbVar31);
      *pbVar31 = SUB41(iVar17,0);
    }
    if (pcVar19[1] != '/') {
      local_218 = 4;
LAB_0098b764:
      pbVar20 = (basic_string_conflict *)0xc0;
      memset(&local_210,0,0xc0);
      goto joined_r0x0098c190;
    }
    if (pcVar19[2] != '/') {
      local_218 = 4;
      goto LAB_0098b790;
    }
    pbVar35 = (byte *)(pcVar19 + 3);
    bVar23 = *pbVar35;
    pbVar33 = pbVar35;
    if (bVar23 != 0) {
LAB_0098b740:
      if (bVar23 != 0x2f) {
        if (bVar23 != 0x40) goto code_r0x0098b750;
        bVar23 = *pbVar35;
        pbVar33 = pbVar35;
        while (((bVar23 != 0 && (bVar23 != 0x3a)) && (bVar23 != 0x40))) {
          pbVar33 = pbVar33 + 1;
          bVar23 = *pbVar33;
        }
        pbVar26 = (basic_string_conflict *)(pbVar33 + -(long)pbVar35);
        local_150 = 0;
        pbStack_148 = (basic_string_conflict *)0x0;
        local_140 = (basic_string_conflict *)0x0;
        if ((basic_string_conflict *)0xffffffffffffffef < pbVar26) {
                    /* try { // try from 0098c4e4 to 0098c4eb has its CatchHandler @ 0098c51c */
                    /* WARNING: Subroutine does not return */
          std::__ndk1::__basic_string_common<true>::__throw_length_error();
        }
        if (pbVar26 < (basic_string_conflict *)0x17) {
          pbVar34 = (basic_string_conflict *)((ulong)&local_150 | 1);
          local_150 = (ulong)(byte)((int)pbVar26 << 1);
          if (pbVar26 != (basic_string_conflict *)0x0) goto LAB_0098bcb8;
        }
        else {
                    /* try { // try from 0098bca0 to 0098bca7 has its CatchHandler @ 0098c51c */
          pbVar34 = operator_new((ulong)(pbVar26 + 0x10) & 0xfffffffffffffff0);
          local_150 = (ulong)(pbVar26 + 0x10) & 0xfffffffffffffff0 | 1;
          pbStack_148 = pbVar26;
          local_140 = pbVar34;
LAB_0098bcb8:
          pbVar20 = pbVar26;
          memcpy(pbVar34,pbVar35,(size_t)pbVar26);
        }
        pbVar34[(long)pbVar26] = (basic_string_conflict)0x0;
        if ((local_a0 & 1) != 0) {
          *local_90 = (basic_string_conflict)0x0;
          pbStack_98 = (basic_string_conflict *)0x0;
          if ((local_a0 & 1) != 0) {
            operator_delete(local_90);
          }
        }
        local_90 = local_140;
        pbStack_98 = pbStack_148;
        local_a0 = local_150;
        bVar23 = *pbVar33;
        if (bVar23 == 0x3a) {
          pbVar35 = pbVar33 + 1;
          for (pbVar33 = pbVar35; (*pbVar33 | 0x40) != 0x40; pbVar33 = pbVar33 + 1) {
          }
          pbVar26 = (basic_string_conflict *)(pbVar33 + -(long)pbVar35);
          local_150 = 0;
          pbStack_148 = (basic_string_conflict *)0x0;
          local_140 = (basic_string_conflict *)0x0;
          if ((basic_string_conflict *)0xffffffffffffffef < pbVar26) {
                    /* try { // try from 0098c4f4 to 0098c4fb has its CatchHandler @ 0098c514 */
                    /* WARNING: Subroutine does not return */
            std::__ndk1::__basic_string_common<true>::__throw_length_error();
          }
          if (pbVar26 < (basic_string_conflict *)0x17) {
            pbVar34 = (basic_string_conflict *)((ulong)&local_150 | 1);
            local_150 = (ulong)(byte)((int)pbVar26 << 1);
            if (pbVar26 != (basic_string_conflict *)0x0) goto LAB_0098bd94;
          }
          else {
                    /* try { // try from 0098bd7c to 0098bd83 has its CatchHandler @ 0098c514 */
            pbVar34 = operator_new((ulong)(pbVar26 + 0x10) & 0xfffffffffffffff0);
            local_150 = (ulong)(pbVar26 + 0x10) & 0xfffffffffffffff0 | 1;
            pbStack_148 = pbVar26;
            local_140 = pbVar34;
LAB_0098bd94:
            pbVar20 = pbVar26;
            memcpy(pbVar34,pbVar35,(size_t)pbVar26);
          }
          pbVar34[(long)pbVar26] = (basic_string_conflict)0x0;
          if ((local_88 & 1) != 0) {
            *local_78 = (basic_string_conflict)0x0;
            pbStack_80 = (basic_string_conflict *)0x0;
            if ((local_88 & 1) != 0) {
              operator_delete(local_78);
            }
          }
          local_78 = local_140;
          pbStack_80 = pbStack_148;
          local_88 = local_150;
          bVar23 = *pbVar33;
        }
        if (bVar23 == 0x40) {
          pbVar35 = pbVar33 + 1;
          goto LAB_0098be0c;
        }
        pbVar20 = (basic_string_conflict *)0xc0;
        local_218 = 5;
        memset(&local_210,0,0xc0);
        goto joined_r0x0098c190;
      }
    }
LAB_0098be0c:
    bVar23 = *pbVar35;
    pbVar33 = pbVar35;
    if (bVar23 != 0) {
      pbVar33 = pbVar35 + 1;
      bVar24 = bVar23;
      do {
        if ((bVar23 == 0x5b) && (bVar24 == 0x5d)) goto LAB_0098be5c;
        if ((bVar23 != 0x5b) && ((pbVar32 = pbVar33, bVar24 == 0x2f || (bVar24 == 0x3a)))) break;
        pbVar32 = pbVar33 + 1;
        bVar24 = *pbVar33;
        pbVar33 = pbVar32;
      } while (bVar24 != 0);
      pbVar33 = pbVar32 + -1;
    }
LAB_0098be5c:
    pbVar26 = (basic_string_conflict *)(pbVar33 + -(long)pbVar35);
    local_150 = 0;
    pbStack_148 = (basic_string_conflict *)0x0;
    local_140 = (basic_string_conflict *)0x0;
    if ((basic_string_conflict *)0xffffffffffffffef < pbVar26) {
                    /* try { // try from 0098c4d4 to 0098c4db has its CatchHandler @ 0098c524 */
                    /* WARNING: Subroutine does not return */
      std::__ndk1::__basic_string_common<true>::__throw_length_error();
    }
    if (pbVar26 < (basic_string_conflict *)0x17) {
      pbVar34 = (basic_string_conflict *)((ulong)&local_150 | 1);
      local_150 = (ulong)(byte)((int)pbVar26 << 1);
      if (pbVar26 != (basic_string_conflict *)0x0) goto LAB_0098beb0;
    }
    else {
                    /* try { // try from 0098be98 to 0098be9f has its CatchHandler @ 0098c524 */
      pbVar34 = operator_new((ulong)(pbVar26 + 0x10) & 0xfffffffffffffff0);
      local_150 = (ulong)(pbVar26 + 0x10) & 0xfffffffffffffff0 | 1;
      pbStack_148 = pbVar26;
      local_140 = pbVar34;
LAB_0098beb0:
      pbVar20 = pbVar26;
      memcpy(pbVar34,pbVar35,(size_t)pbVar26);
    }
    pbVar34[(long)pbVar26] = (basic_string_conflict)0x0;
    if ((local_118 & 1) != 0) {
      *local_108 = (basic_string_conflict)0x0;
      pbStack_110 = (basic_string_conflict *)0x0;
      if ((local_118 & 1) != 0) {
        operator_delete(local_108);
      }
    }
    local_108 = local_140;
    pbStack_110 = pbStack_148;
    local_118 = local_150;
    bVar23 = *pbVar33;
    if (bVar23 == 0x3a) {
      pbVar35 = pbVar33 + 1;
      bVar23 = *pbVar35;
      pbVar33 = pbVar35;
      while ((bVar23 != 0 && (bVar23 != 0x2f))) {
        pbVar33 = pbVar33 + 1;
        bVar23 = *pbVar33;
      }
      pbVar26 = (basic_string_conflict *)(pbVar33 + -(long)pbVar35);
      local_150 = 0;
      pbStack_148 = (basic_string_conflict *)0x0;
      local_140 = (basic_string_conflict *)0x0;
      if ((basic_string_conflict *)0xffffffffffffffef < pbVar26) {
                    /* try { // try from 0098c4dc to 0098c4e3 has its CatchHandler @ 0098c520 */
                    /* WARNING: Subroutine does not return */
        std::__ndk1::__basic_string_common<true>::__throw_length_error();
      }
      if (pbVar26 < (basic_string_conflict *)0x17) {
        pbVar34 = (basic_string_conflict *)((ulong)&local_150 | 1);
        local_150 = (ulong)(byte)((int)pbVar26 << 1);
        if (pbVar26 != (basic_string_conflict *)0x0) goto LAB_0098bfa0;
      }
      else {
                    /* try { // try from 0098bf84 to 0098bf8b has its CatchHandler @ 0098c520 */
        pbVar34 = operator_new((ulong)(pbVar26 + 0x10) & 0xfffffffffffffff0);
        local_150 = (ulong)(pbVar26 + 0x10) & 0xfffffffffffffff0 | 1;
        pbStack_148 = pbVar26;
        local_140 = pbVar34;
LAB_0098bfa0:
        pbVar20 = pbVar26;
        memcpy(pbVar34,pbVar35,(size_t)pbVar26);
      }
      pbVar34[(long)pbVar26] = (basic_string_conflict)0x0;
      if ((local_100 & 1) != 0) {
        *local_f0 = (basic_string_conflict)0x0;
        pbStack_f8 = (basic_string_conflict *)0x0;
        if ((local_100 & 1) != 0) {
          operator_delete(local_f0);
        }
      }
      local_f0 = local_140;
      pbStack_f8 = pbStack_148;
      local_100 = local_150;
      bVar23 = *pbVar33;
    }
    pbVar15 = local_78;
    pbVar14 = pbStack_80;
    uVar13 = local_88;
    pbVar12 = local_90;
    pbVar11 = pbStack_98;
    uVar10 = local_a0;
    pbVar9 = local_a8;
    pbVar8 = pbStack_b0;
    uVar7 = local_b8;
    pbVar6 = local_c0;
    pbVar28 = pbStack_c8;
    uVar5 = local_d0;
    pbVar29 = local_d8;
    pbVar31 = pbStack_e0;
    uVar4 = local_e8;
    pbVar27 = local_f0;
    pbVar34 = local_108;
    pbVar26 = pbStack_110;
    uVar1 = local_118;
    if (bVar23 == 0x2f) {
      pbVar33 = pbVar33 + 1;
      pbVar35 = pbVar33;
      while ((0x3f < *pbVar35 || ((1L << ((ulong)*pbVar35 & 0x3f) & 0x8000000800000001U) == 0))) {
        pbVar35 = pbVar35 + 1;
      }
      pbVar26 = (basic_string_conflict *)(pbVar35 + -(long)pbVar33);
      local_150 = 0;
      pbStack_148 = (basic_string_conflict *)0x0;
      local_140 = (basic_string_conflict *)0x0;
      if ((basic_string_conflict *)0xffffffffffffffef < pbVar26) {
                    /* try { // try from 0098c4ec to 0098c4f3 has its CatchHandler @ 0098c518 */
                    /* WARNING: Subroutine does not return */
        std::__ndk1::__basic_string_common<true>::__throw_length_error();
      }
      if (pbVar26 < (basic_string_conflict *)0x17) {
        pbVar34 = (basic_string_conflict *)((ulong)&local_150 | 1);
        local_150 = (ulong)(byte)((int)pbVar26 << 1);
        if (pbVar26 != (basic_string_conflict *)0x0) goto LAB_0098c1b8;
      }
      else {
                    /* try { // try from 0098c1a0 to 0098c1a7 has its CatchHandler @ 0098c518 */
        pbVar34 = operator_new((ulong)(pbVar26 + 0x10) & 0xfffffffffffffff0);
        local_150 = (ulong)(pbVar26 + 0x10) & 0xfffffffffffffff0 | 1;
        pbStack_148 = pbVar26;
        local_140 = pbVar34;
LAB_0098c1b8:
        pbVar20 = pbVar26;
        memcpy(pbVar34,pbVar33,(size_t)pbVar26);
      }
      pbVar34[(long)pbVar26] = (basic_string_conflict)0x0;
      if ((local_e8 & 1) != 0) {
        *local_d8 = (basic_string_conflict)0x0;
        pbStack_e0 = (basic_string_conflict *)0x0;
        if ((local_e8 & 1) != 0) {
          operator_delete(local_d8);
        }
      }
      local_d8 = local_140;
      pbStack_e0 = pbStack_148;
      local_e8 = local_150;
      bVar23 = *pbVar35;
      if (bVar23 == 0x3f) {
        pbVar33 = pbVar35 + 1;
        bVar23 = *pbVar33;
        pbVar35 = pbVar33;
        while ((bVar23 != 0 && (bVar23 != 0x23))) {
          pbVar35 = pbVar35 + 1;
          bVar23 = *pbVar35;
        }
        pbVar26 = (basic_string_conflict *)(pbVar35 + -(long)pbVar33);
        local_150 = 0;
        pbStack_148 = (basic_string_conflict *)0x0;
        local_140 = (basic_string_conflict *)0x0;
        if ((basic_string_conflict *)0xffffffffffffffef < pbVar26) {
                    /* try { // try from 0098c4fc to 0098c503 has its CatchHandler @ 0098c510 */
                    /* WARNING: Subroutine does not return */
          std::__ndk1::__basic_string_common<true>::__throw_length_error();
        }
        if (pbVar26 < (basic_string_conflict *)0x17) {
          pbVar34 = (basic_string_conflict *)((ulong)&local_150 | 1);
          local_150 = (ulong)(byte)((int)pbVar26 << 1);
          if (pbVar26 != (basic_string_conflict *)0x0) goto LAB_0098c2a0;
        }
        else {
                    /* try { // try from 0098c288 to 0098c28f has its CatchHandler @ 0098c510 */
          pbVar34 = operator_new((ulong)(pbVar26 + 0x10) & 0xfffffffffffffff0);
          local_150 = (ulong)(pbVar26 + 0x10) & 0xfffffffffffffff0 | 1;
          pbStack_148 = pbVar26;
          local_140 = pbVar34;
LAB_0098c2a0:
          pbVar20 = pbVar26;
          memcpy(pbVar34,pbVar33,(size_t)pbVar26);
        }
        pbVar34[(long)pbVar26] = (basic_string_conflict)0x0;
        if ((local_d0 & 1) != 0) {
          *local_c0 = (basic_string_conflict)0x0;
          pbStack_c8 = (basic_string_conflict *)0x0;
          if ((local_d0 & 1) != 0) {
            operator_delete(local_c0);
          }
        }
        local_c0 = local_140;
        pbStack_c8 = pbStack_148;
        local_d0 = local_150;
        bVar23 = *pbVar35;
      }
      if (bVar23 == 0x23) {
        pbVar33 = pbVar35 + 1;
        do {
          pbVar35 = pbVar35 + 1;
        } while (*pbVar35 != 0);
        pbVar26 = (basic_string_conflict *)(pbVar35 + -(long)pbVar33);
        local_150 = 0;
        pbStack_148 = (basic_string_conflict *)0x0;
        local_140 = (basic_string_conflict *)0x0;
        if ((basic_string_conflict *)0xffffffffffffffef < pbVar26) {
                    /* try { // try from 0098c504 to 0098c50b has its CatchHandler @ 0098c50c */
                    /* WARNING: Subroutine does not return */
          std::__ndk1::__basic_string_common<true>::__throw_length_error();
        }
        if (pbVar26 < (basic_string_conflict *)0x17) {
          pbVar34 = (basic_string_conflict *)((ulong)&local_150 | 1);
          local_150 = (ulong)(byte)((int)pbVar26 << 1);
          if (pbVar26 != (basic_string_conflict *)0x0) goto LAB_0098c388;
        }
        else {
                    /* try { // try from 0098c36c to 0098c373 has its CatchHandler @ 0098c50c */
          pbVar34 = operator_new((ulong)(pbVar26 + 0x10) & 0xfffffffffffffff0);
          local_150 = (ulong)(pbVar26 + 0x10) & 0xfffffffffffffff0 | 1;
          pbStack_148 = pbVar26;
          local_140 = pbVar34;
LAB_0098c388:
          pbVar20 = pbVar26;
          memcpy(pbVar34,pbVar33,(size_t)pbVar26);
        }
        pbVar34[(long)pbVar26] = (basic_string_conflict)0x0;
        if ((local_b8 & 1) != 0) {
          *local_a8 = (basic_string_conflict)0x0;
          pbStack_b0 = (basic_string_conflict *)0x0;
          if ((local_b8 & 1) != 0) {
            operator_delete(local_a8);
          }
        }
        local_a8 = local_140;
        pbStack_b0 = pbStack_148;
        local_b8 = local_150;
      }
      local_158 = local_78;
      pbStack_160 = pbStack_80;
      local_168 = local_88;
      pbStack_178 = pbStack_98;
      local_180 = local_a0;
      local_188 = local_a8;
      pbStack_190 = pbStack_b0;
      local_198 = local_b8;
      local_1a0 = local_c0;
      pbStack_1a8 = pbStack_c8;
      local_1b0 = local_d0;
      local_1b8 = local_d8;
      pbStack_1c0 = pbStack_e0;
      local_1c8 = local_e8;
      local_1d0 = local_f0;
      pbStack_1d8 = pbStack_f8;
      local_1e0 = local_100;
      local_138 = 0;
      pbStack_208 = pbStack_128;
      local_210 = uStack_130;
      local_200 = local_120;
      pbStack_128 = (basic_string_conflict *)0x0;
      local_120 = (basic_string_conflict *)0x0;
      uStack_130 = 0;
      pbStack_1f0 = pbStack_110;
      local_1f8 = local_118;
      local_1e8 = local_108;
      local_118 = 0;
      pbStack_110 = (basic_string_conflict *)0x0;
      local_108 = (basic_string_conflict *)0x0;
      local_100 = 0;
      pbStack_f8 = (basic_string_conflict *)0x0;
      local_f0 = (basic_string_conflict *)0x0;
      local_e8 = 0;
      pbStack_e0 = (basic_string_conflict *)0x0;
      local_d8 = (basic_string_conflict *)0x0;
      local_d0 = 0;
      pbStack_c8 = (basic_string_conflict *)0x0;
      local_c0 = (basic_string_conflict *)0x0;
      local_b8 = 0;
      pbStack_b0 = (basic_string_conflict *)0x0;
      local_a8 = (basic_string_conflict *)0x0;
      local_a0 = 0;
      pbStack_98 = (basic_string_conflict *)0x0;
      local_218 = 0;
      local_170 = local_90;
      local_90 = (basic_string_conflict *)0x0;
      local_88 = 0;
      pbStack_80 = (basic_string_conflict *)0x0;
      local_78 = (basic_string_conflict *)0x0;
    }
    else {
      if (bVar23 != 0) {
        local_218 = 7;
        goto LAB_0098b764;
      }
      local_138 = 0;
      local_218 = 0;
      pbStack_208 = pbStack_128;
      local_210 = uStack_130;
      local_200 = local_120;
      pbStack_128 = (basic_string_conflict *)0x0;
      local_120 = (basic_string_conflict *)0x0;
      uStack_130 = 0;
      local_118 = 0;
      pbStack_110 = (basic_string_conflict *)0x0;
      local_108 = (basic_string_conflict *)0x0;
      local_1e8 = pbVar34;
      pbStack_1d8 = pbStack_f8;
      local_1e0 = local_100;
      local_f0 = (basic_string_conflict *)0x0;
      local_e8 = 0;
      local_100 = 0;
      pbStack_f8 = (basic_string_conflict *)0x0;
      pbStack_e0 = (basic_string_conflict *)0x0;
      local_d8 = (basic_string_conflict *)0x0;
      pbStack_1c0 = pbVar31;
      local_1c8 = uVar4;
      local_d0 = 0;
      pbStack_c8 = (basic_string_conflict *)0x0;
      local_1b8 = pbVar29;
      pbStack_1a8 = pbVar28;
      local_1b0 = uVar5;
      local_1d0 = pbVar27;
      local_c0 = (basic_string_conflict *)0x0;
      local_b8 = 0;
      pbStack_b0 = (basic_string_conflict *)0x0;
      local_a8 = (basic_string_conflict *)0x0;
      pbStack_190 = pbVar8;
      local_198 = uVar7;
      local_a0 = 0;
      pbStack_98 = (basic_string_conflict *)0x0;
      local_188 = pbVar9;
      pbStack_1f0 = pbVar26;
      local_1f8 = uVar1;
      local_1a0 = pbVar6;
      pbStack_178 = pbVar11;
      local_180 = uVar10;
      local_90 = (basic_string_conflict *)0x0;
      local_88 = 0;
      pbStack_80 = (basic_string_conflict *)0x0;
      local_78 = (basic_string_conflict *)0x0;
      local_170 = pbVar12;
      local_158 = pbVar15;
      pbStack_160 = pbVar14;
      local_168 = uVar13;
    }
  }
  if ((local_a0 & 1) != 0) {
    operator_delete(local_90);
  }
  if ((local_b8 & 1) != 0) {
    operator_delete(local_a8);
  }
  if ((local_d0 & 1) != 0) {
    operator_delete(local_c0);
  }
  if ((local_e8 & 1) != 0) {
    operator_delete(local_d8);
  }
  if ((local_100 & 1) != 0) {
    operator_delete(local_f0);
  }
  if ((local_118 & 1) != 0) {
    operator_delete(local_108);
  }
  if ((uStack_130 & 1) != 0) {
    operator_delete(local_120);
  }
  uVar30 = 0;
  if (local_218 != 0) goto joined_r0x0098b7fc;
  if ((basic_string_conflict *)&local_210 != param_2) {
    if ((local_210 & 1) == 0) {
      pbVar20 = (basic_string_conflict *)(local_210 >> 1 & 0x7f);
      pbVar26 = (basic_string_conflict *)((long)&local_210 + 1);
    }
    else {
      pbVar20 = pbStack_208;
      pbVar26 = local_200;
    }
                    /* try { // try from 0098b900 to 0098b98f has its CatchHandler @ 0098c5f0 */
    std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)param_2
           ,(char *)pbVar26,(ulong)pbVar20);
  }
  if ((basic_string_conflict *)&local_1f8 != param_3) {
    if ((local_1f8 & 1) == 0) {
      pbVar20 = (basic_string_conflict *)(local_1f8 >> 1 & 0x7f);
      pbVar26 = (basic_string_conflict *)((long)&local_1f8 + 1);
    }
    else {
      pbVar20 = pbStack_1f0;
      pbVar26 = local_1e8;
    }
    std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)param_3
           ,(char *)pbVar26,(ulong)pbVar20);
  }
  if ((basic_string_conflict *)&local_1c8 != param_4) {
    if ((local_1c8 & 1) == 0) {
      pbVar20 = (basic_string_conflict *)(local_1c8 >> 1 & 0x7f);
      pbVar26 = (basic_string_conflict *)((long)&local_1c8 + 1);
    }
    else {
      pbVar20 = pbStack_1c0;
      pbVar26 = local_1b8;
    }
    std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)param_4
           ,(char *)pbVar26,(ulong)pbVar20);
  }
  if ((basic_string_conflict *)&local_1b0 != param_5) {
    if ((local_1b0 & 1) == 0) {
      pbVar20 = (basic_string_conflict *)(local_1b0 >> 1 & 0x7f);
      pbVar26 = (basic_string_conflict *)((long)&local_1b0 + 1);
    }
    else {
      pbVar20 = pbStack_1a8;
      pbVar26 = local_1a0;
    }
    std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)param_5
           ,(char *)pbVar26,(ulong)pbVar20);
  }
  bVar2 = *param_2;
  uVar1 = (ulong)((byte)bVar2 >> 1);
  if (((byte)bVar2 & 1) != 0) {
    uVar1 = *(ulong *)(param_2 + 8);
  }
  switch(uVar1) {
  case 2:
    pbVar26 = *(basic_string_conflict **)(param_2 + 0x10);
    if (((byte)bVar2 & 1) == 0) {
      pbVar26 = param_2 + 1;
    }
    uVar21 = (uint)*(ushort *)pbVar26;
    uVar25 = 0x7377;
    break;
  case 3:
    pbVar26 = *(basic_string_conflict **)(param_2 + 0x10);
    pcVar19 = "wss";
    if (((byte)bVar2 & 1) == 0) {
      pbVar26 = param_2 + 1;
    }
    pbVar20 = (basic_string_conflict *)0x3;
    goto LAB_0098ba68;
  case 4:
    pbVar26 = *(basic_string_conflict **)(param_2 + 0x10);
    if (((byte)bVar2 & 1) == 0) {
      pbVar26 = param_2 + 1;
    }
    uVar21 = *(uint *)pbVar26;
    uVar25 = 0x70747468;
    break;
  case 5:
    pbVar26 = *(basic_string_conflict **)(param_2 + 0x10);
    pcVar19 = "https";
    if (((byte)bVar2 & 1) == 0) {
      pbVar26 = param_2 + 1;
    }
    pbVar20 = (basic_string_conflict *)0x5;
LAB_0098ba68:
    iVar17 = memcmp(pbVar26,pcVar19,(size_t)pbVar20);
    bVar16 = iVar17 == 0;
    iVar17 = 0x1bb;
    goto LAB_0098ba74;
  default:
    iVar17 = -1;
    goto LAB_0098ba78;
  }
  bVar16 = uVar21 == uVar25;
  iVar17 = 0x50;
LAB_0098ba74:
  if (!bVar16) {
    iVar17 = -1;
  }
LAB_0098ba78:
  pbVar26 = (basic_string_conflict *)((long)&local_1e0 + 1);
  if ((local_1e0 & 1) != 0) {
    pbVar26 = local_1d0;
  }
  iVar18 = atoi((char *)pbVar26);
  if (0xfffe < iVar18 - 1U) {
    iVar18 = iVar17;
  }
  *param_6 = iVar18;
  *param_7 = iVar18 == iVar17;
  bVar16 = ((byte)*param_4 & 1) != 0;
  uVar1 = (ulong)((byte)*param_4 >> 1);
  if (bVar16) {
    uVar1 = *(ulong *)(param_4 + 8);
  }
  if (uVar1 == 0) {
                    /* try { // try from 0098bb1c to 0098bbbb has its CatchHandler @ 0098c5ec */
    std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)param_4
           ,"/",1);
  }
  else {
    pbVar26 = *(basic_string_conflict **)(param_4 + 0x10);
    if (!bVar16) {
      pbVar26 = param_4 + 1;
    }
    if (*pbVar26 != (basic_string_conflict)0x2f) {
                    /* try { // try from 0098bafc to 0098bb0b has its CatchHandler @ 0098c528 */
      std::__ndk1::operator+((__ndk1 *)0x2f,(char)param_4,pbVar20);
      if (((byte)*param_4 & 1) == 0) {
        *(undefined2 *)param_4 = 0;
      }
      else {
        **(undefined1 **)(param_4 + 0x10) = 0;
        *(undefined8 *)(param_4 + 8) = 0;
        if (((byte)*param_4 & 1) != 0) {
          operator_delete(*(void **)(param_4 + 0x10));
          *(undefined8 *)param_4 = 0;
        }
      }
      *(basic_string_conflict **)(param_4 + 0x10) = pbStack_128;
      *(ulong *)(param_4 + 8) = uStack_130;
      *(ulong *)param_4 = CONCAT44(uStack_134,local_138);
    }
  }
  uVar1 = (ulong)((byte)*param_5 >> 1);
  if (((byte)*param_5 & 1) != 0) {
    uVar1 = *(ulong *)(param_5 + 8);
  }
  if (uVar1 != 0) {
    std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    append((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)param_4
           ,"?",1);
    uVar1 = *(ulong *)(param_5 + 8);
    pbVar20 = *(basic_string_conflict **)(param_5 + 0x10);
    if (((byte)*param_5 & 1) == 0) {
      pbVar20 = param_5 + 1;
      uVar1 = (ulong)((byte)*param_5 >> 1);
    }
    std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    append((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)param_4
           ,(char *)pbVar20,uVar1);
  }
  uVar30 = 1;
joined_r0x0098b7fc:
  if ((local_168 & 1) != 0) {
    operator_delete(local_158);
  }
  if ((local_180 & 1) != 0) {
    operator_delete(local_170);
  }
  if ((local_198 & 1) != 0) {
    operator_delete(local_188);
  }
  if ((local_1b0 & 1) != 0) {
    operator_delete(local_1a0);
  }
  if ((local_1c8 & 1) != 0) {
    operator_delete(local_1b8);
  }
  if ((local_1e0 & 1) != 0) {
    operator_delete(local_1d0);
  }
  if ((local_1f8 & 1) != 0) {
    operator_delete(local_1e8);
  }
  if ((local_210 & 1) != 0) {
    operator_delete(local_200);
  }
  if (*(long *)(lVar3 + 0x28) != lVar22) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return uVar30;
code_r0x0098b750:
  pbVar33 = pbVar33 + 1;
  bVar23 = *pbVar33;
  if (bVar23 == 0) goto LAB_0098be0c;
  goto LAB_0098b740;
}

