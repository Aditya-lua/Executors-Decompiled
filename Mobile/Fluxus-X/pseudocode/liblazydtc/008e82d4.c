/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e82d4
 */

/* cpr::Cookies::GetEncoded(cpr::CurlHolder const&) const */

void __thiscall cpr::Cookies::GetEncoded(Cookies *this,CurlHolder *param_1)

{
  ulong *puVar1;
  long lVar2;
  bool bVar3;
  basic_ostream *pbVar4;
  char *pcVar5;
  void *pvVar6;
  char *pcVar7;
  void *pvVar8;
  long lVar9;
  ulong *puVar10;
  void *pvVar11;
  ulong *puVar12;
  char *pcVar13;
  ulong uVar14;
  ulong uVar15;
  ulong local_230;
  ulong uStack_228;
  char *local_220;
  ulong local_210;
  ulong uStack_208;
  void *local_200;
  ulong local_1f0;
  ulong uStack_1e8;
  char *local_1e0;
  ulong local_1d0;
  ulong uStack_1c8;
  void *local_1c0;
  ulong local_1b0;
  ulong uStack_1a8;
  char *local_1a0;
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
  lVar9 = *(long *)(lVar2 + 0x28);
  local_180 = &PTR_FUN_00c4e508;
  local_110[0] = &PTR__basic_istream_00c4e640;
  uStack_188 = 0;
  local_190 = &PTR__basic_istream_00c4e618;
                    /* try { // try from 008e834c to 008e8357 has its CatchHandler @ 008e8b4c */
  std::__ndk1::ios_base::init((ios_base *)local_110,&ppuStack_178);
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
  puVar12 = *(ulong **)(this + 8);
  puVar1 = *(ulong **)(this + 0x10);
  if (puVar12 != puVar1) {
    pcVar7 = (char *)((ulong)&local_1f0 | 1);
    pvVar8 = (void *)((ulong)&local_210 | 1);
    pcVar13 = (char *)((ulong)&local_1b0 | 1);
    do {
      if (*this == (Cookies)0x0) {
        uStack_1a8 = 0;
        local_1a0 = (char *)0x0;
        local_1b0 = 0;
        if ((*puVar12 & 1) == 0) {
          local_1a0 = (char *)puVar12[2];
          bVar3 = false;
          uStack_1a8 = puVar12[1];
          local_1b0 = *puVar12;
        }
        else {
          uVar15 = puVar12[1];
          if (0xffffffffffffffef < uVar15) {
                    /* try { // try from 008e8b04 to 008e8b0b has its CatchHandler @ 008e8b10 */
                    /* WARNING: Subroutine does not return */
            std::__ndk1::__basic_string_common<true>::__throw_length_error();
          }
          pvVar11 = (void *)puVar12[2];
          if (uVar15 < 0x17) {
            local_1b0 = (ulong)(byte)((int)uVar15 << 1);
            pcVar5 = pcVar13;
            if (uVar15 != 0) goto LAB_008e852c;
          }
          else {
            uVar14 = uVar15 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 008e8514 to 008e851b has its CatchHandler @ 008e8b88 */
            pcVar5 = operator_new(uVar14);
            local_1b0 = uVar14 | 1;
            uStack_1a8 = uVar15;
            local_1a0 = pcVar5;
LAB_008e852c:
            memcpy(pcVar5,pvVar11,uVar15);
          }
          bVar3 = false;
          pcVar5[uVar15] = '\0';
        }
      }
      else {
        uStack_1c8 = 0;
        local_1c0 = (void *)0x0;
        local_1d0 = 0;
        if ((*puVar12 & 1) == 0) {
          local_1c0 = (void *)puVar12[2];
          uStack_1c8 = puVar12[1];
          local_1d0 = *puVar12;
        }
        else {
          uVar15 = puVar12[1];
          if (0xffffffffffffffef < uVar15) {
                    /* try { // try from 008e8afc to 008e8b03 has its CatchHandler @ 008e8b14 */
                    /* WARNING: Subroutine does not return */
            std::__ndk1::__basic_string_common<true>::__throw_length_error();
          }
          pvVar11 = (void *)puVar12[2];
          if (uVar15 < 0x17) {
            local_1d0 = (ulong)(byte)((int)uVar15 << 1);
            pvVar6 = (void *)((ulong)&local_1d0 | 1);
            if (uVar15 != 0) goto LAB_008e84e0;
          }
          else {
            uVar14 = uVar15 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 008e84c8 to 008e84cf has its CatchHandler @ 008e8bb4 */
            pvVar6 = operator_new(uVar14);
            local_1d0 = uVar14 | 1;
            uStack_1c8 = uVar15;
            local_1c0 = pvVar6;
LAB_008e84e0:
            memcpy(pvVar6,pvVar11,uVar15);
          }
          *(undefined1 *)((long)pvVar6 + uVar15) = 0;
        }
                    /* try { // try from 008e84f4 to 008e8503 has its CatchHandler @ 008e8c3c */
        CurlHolder::urlEncode((basic_string_conflict *)param_1);
        bVar3 = true;
      }
      uVar15 = local_1b0 >> 1 & 0x7f;
      pcVar5 = pcVar13;
      if ((local_1b0 & 1) != 0) {
        uVar15 = uStack_1a8;
        pcVar5 = local_1a0;
      }
                    /* try { // try from 008e855c to 008e8573 has its CatchHandler @ 008e8c6c */
      pbVar4 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                         ((basic_ostream *)&local_180,pcVar5,uVar15);
      std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>(pbVar4,"=",1);
      if ((local_1b0 & 1) != 0) {
        operator_delete(local_1a0);
      }
      if ((bVar3) && ((local_1d0 & 1) != 0)) {
        operator_delete(local_1c0);
      }
      uStack_1a8 = 0;
      local_1a0 = (char *)0x0;
      local_1b0 = 0;
      puVar10 = puVar12 + 3;
      if ((*puVar10 & 1) == 0) {
        local_1a0 = (char *)puVar12[5];
        uStack_1a8 = puVar12[4];
        local_1b0 = *puVar10;
      }
      else {
        uVar15 = puVar12[4];
        if (0xffffffffffffffef < uVar15) {
                    /* try { // try from 008e8acc to 008e8ad3 has its CatchHandler @ 008e8b38 */
                    /* WARNING: Subroutine does not return */
          std::__ndk1::__basic_string_common<true>::__throw_length_error();
        }
        pvVar11 = (void *)puVar12[5];
        if (uVar15 < 0x17) {
          local_1b0 = (ulong)(byte)((int)uVar15 << 1);
          pcVar5 = pcVar13;
          if (uVar15 != 0) goto LAB_008e860c;
        }
        else {
          uVar14 = uVar15 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 008e85f4 to 008e85fb has its CatchHandler @ 008e8bb8 */
          pcVar5 = operator_new(uVar14);
          local_1b0 = uVar14 | 1;
          uStack_1a8 = uVar15;
          local_1a0 = pcVar5;
LAB_008e860c:
          memcpy(pcVar5,pvVar11,uVar15);
        }
        pcVar5[uVar15] = '\0';
      }
      uVar15 = local_1b0 >> 1 & 0x7f;
      if ((local_1b0 & 1) != 0) {
        uVar15 = uStack_1a8;
      }
      if (uVar15 == 0) {
        bVar3 = false;
      }
      else {
        uStack_1e8 = 0;
        local_1e0 = (char *)0x0;
        local_1f0 = 0;
        if ((*puVar10 & 1) == 0) {
          local_1e0 = (char *)puVar12[5];
          uStack_1e8 = puVar12[4];
          local_1f0 = *puVar10;
        }
        else {
          uVar15 = puVar12[4];
          if (0xffffffffffffffef < uVar15) {
                    /* try { // try from 008e8ad4 to 008e8adb has its CatchHandler @ 008e8b34 */
                    /* WARNING: Subroutine does not return */
            std::__ndk1::__basic_string_common<true>::__throw_length_error();
          }
          pvVar11 = (void *)puVar12[5];
          if (uVar15 < 0x17) {
            local_1f0 = (ulong)(byte)((int)uVar15 << 1);
            pcVar5 = pcVar7;
            if (uVar15 != 0) goto LAB_008e86b8;
          }
          else {
            uVar14 = uVar15 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 008e86a0 to 008e86a7 has its CatchHandler @ 008e8b90 */
            pcVar5 = operator_new(uVar14);
            local_1f0 = uVar14 | 1;
            uStack_1e8 = uVar15;
            local_1e0 = pcVar5;
LAB_008e86b8:
            memcpy(pcVar5,pvVar11,uVar15);
          }
          pcVar5[uVar15] = '\0';
        }
        pcVar5 = pcVar7;
        if ((local_1f0 & 1) != 0) {
          pcVar5 = local_1e0;
        }
        if (*pcVar5 == '\"') {
          uStack_208 = 0;
          local_200 = (void *)0x0;
          local_210 = 0;
          if ((*puVar10 & 1) == 0) {
            local_200 = (void *)puVar12[5];
            uStack_208 = puVar12[4];
            local_210 = *puVar10;
          }
          else {
            uVar15 = puVar12[4];
            if (0xffffffffffffffef < uVar15) {
                    /* try { // try from 008e8adc to 008e8ae3 has its CatchHandler @ 008e8b24 */
                    /* WARNING: Subroutine does not return */
              std::__ndk1::__basic_string_common<true>::__throw_length_error();
            }
            pvVar11 = (void *)puVar12[5];
            if (uVar15 < 0x17) {
              local_210 = (ulong)(byte)((int)uVar15 << 1);
              pvVar6 = pvVar8;
              if (uVar15 != 0) goto LAB_008e8938;
            }
            else {
              uVar14 = uVar15 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 008e8920 to 008e8927 has its CatchHandler @ 008e8b5c */
              pvVar6 = operator_new(uVar14);
              local_210 = uVar14 | 1;
              uStack_208 = uVar15;
              local_200 = pvVar6;
LAB_008e8938:
              memcpy(pvVar6,pvVar11,uVar15);
            }
            *(undefined1 *)((long)pvVar6 + uVar15) = 0;
          }
          uVar15 = local_210 >> 1 & 0x7f;
          pvVar11 = pvVar8;
          if ((local_210 & 1) != 0) {
            uVar15 = uStack_208;
            pvVar11 = local_200;
          }
          bVar3 = *(char *)((long)pvVar11 + (uVar15 - 1)) == '\"';
          if ((local_210 & 1) != 0) {
            operator_delete(local_200);
          }
        }
        else {
          bVar3 = false;
        }
        if ((local_1f0 & 1) != 0) {
          operator_delete(local_1e0);
        }
      }
      if ((local_1b0 & 1) != 0) {
        operator_delete(local_1a0);
      }
      if (bVar3) {
        uStack_1a8 = 0;
        local_1a0 = (char *)0x0;
        local_1b0 = 0;
        if ((*puVar10 & 1) == 0) {
          local_1a0 = (char *)puVar12[5];
          uStack_1a8 = puVar12[4];
          local_1b0 = *puVar10;
        }
        else {
          uVar15 = puVar12[4];
          if (0xffffffffffffffef < uVar15) {
                    /* try { // try from 008e8aec to 008e8af3 has its CatchHandler @ 008e8b1c */
                    /* WARNING: Subroutine does not return */
            std::__ndk1::__basic_string_common<true>::__throw_length_error();
          }
          pvVar11 = (void *)puVar12[5];
          if (uVar15 < 0x17) {
            local_1b0 = (ulong)(byte)((int)uVar15 << 1);
            pcVar5 = pcVar13;
            if (uVar15 != 0) goto LAB_008e885c;
          }
          else {
            uVar14 = uVar15 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 008e8844 to 008e884b has its CatchHandler @ 008e8b8c */
            pcVar5 = operator_new(uVar14);
            local_1b0 = uVar14 | 1;
            uStack_1a8 = uVar15;
            local_1a0 = pcVar5;
LAB_008e885c:
            memcpy(pcVar5,pvVar11,uVar15);
          }
          pcVar5[uVar15] = '\0';
        }
        uVar15 = local_1b0 >> 1 & 0x7f;
        pcVar5 = pcVar13;
        if ((local_1b0 & 1) != 0) {
          uVar15 = uStack_1a8;
          pcVar5 = local_1a0;
        }
                    /* try { // try from 008e8888 to 008e888f has its CatchHandler @ 008e8c24 */
        std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                  ((basic_ostream *)&local_180,pcVar5,uVar15);
        if ((local_1b0 & 1) != 0) {
          pcVar5 = local_1a0;
LAB_008e8a08:
          operator_delete(pcVar5);
        }
      }
      else {
        if (*this == (Cookies)0x0) {
          uStack_1a8 = 0;
          local_1a0 = (char *)0x0;
          local_1b0 = 0;
          if ((*puVar10 & 1) == 0) {
            local_1a0 = (char *)puVar12[5];
            bVar3 = false;
            uStack_1a8 = puVar12[4];
            local_1b0 = *puVar10;
          }
          else {
            uVar15 = puVar12[4];
            if (0xffffffffffffffef < uVar15) {
                    /* try { // try from 008e8af4 to 008e8afb has its CatchHandler @ 008e8b18 */
                    /* WARNING: Subroutine does not return */
              std::__ndk1::__basic_string_common<true>::__throw_length_error();
            }
            pvVar11 = (void *)puVar12[5];
            if (uVar15 < 0x17) {
              local_1b0 = (ulong)(byte)((int)uVar15 << 1);
              pcVar5 = pcVar13;
              if (uVar15 != 0) goto LAB_008e89b0;
            }
            else {
              uVar14 = uVar15 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 008e8998 to 008e899f has its CatchHandler @ 008e8b58 */
              pcVar5 = operator_new(uVar14);
              local_1b0 = uVar14 | 1;
              uStack_1a8 = uVar15;
              local_1a0 = pcVar5;
LAB_008e89b0:
              memcpy(pcVar5,pvVar11,uVar15);
            }
            bVar3 = false;
            pcVar5[uVar15] = '\0';
          }
        }
        else {
          uStack_228 = 0;
          local_220 = (char *)0x0;
          local_230 = 0;
          if ((*puVar10 & 1) == 0) {
            local_220 = (char *)puVar12[5];
            uStack_228 = puVar12[4];
            local_230 = *puVar10;
          }
          else {
            uVar15 = puVar12[4];
            if (0xffffffffffffffef < uVar15) {
                    /* try { // try from 008e8ae4 to 008e8aeb has its CatchHandler @ 008e8b20 */
                    /* WARNING: Subroutine does not return */
              std::__ndk1::__basic_string_common<true>::__throw_length_error();
            }
            pvVar11 = (void *)puVar12[5];
            if (uVar15 < 0x17) {
              local_230 = (ulong)(byte)((int)uVar15 << 1);
              pcVar5 = (char *)((ulong)&local_230 | 1);
              if (uVar15 != 0) goto LAB_008e88ec;
            }
            else {
              uVar14 = uVar15 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 008e88d4 to 008e88db has its CatchHandler @ 008e8b84 */
              pcVar5 = operator_new(uVar14);
              local_230 = uVar14 | 1;
              uStack_228 = uVar15;
              local_220 = pcVar5;
LAB_008e88ec:
              memcpy(pcVar5,pvVar11,uVar15);
            }
            pcVar5[uVar15] = '\0';
          }
                    /* try { // try from 008e8900 to 008e890f has its CatchHandler @ 008e8bbc */
          CurlHolder::urlEncode((basic_string_conflict *)param_1);
          bVar3 = true;
        }
        uVar15 = local_1b0 >> 1 & 0x7f;
        pcVar5 = pcVar13;
        if ((local_1b0 & 1) != 0) {
          uVar15 = uStack_1a8;
          pcVar5 = local_1a0;
        }
                    /* try { // try from 008e89e0 to 008e89e7 has its CatchHandler @ 008e8bd8 */
        std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                  ((basic_ostream *)&local_180,pcVar5,uVar15);
        if ((local_1b0 & 1) != 0) {
          operator_delete(local_1a0);
        }
        if ((bVar3) && ((local_230 & 1) != 0)) {
          pcVar5 = local_220;
          goto LAB_008e8a08;
        }
      }
                    /* try { // try from 008e8a0c to 008e8a1f has its CatchHandler @ 008e8c58 */
      std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                ((basic_ostream *)&local_180,"; ",2);
      puVar12 = puVar12 + 0xf;
    } while (puVar1 != puVar12);
  }
                    /* try { // try from 008e8a2c to 008e8a33 has its CatchHandler @ 008e8b3c */
  std::__ndk1::basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
  str();
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
  if (*(long *)(lVar2 + 0x28) != lVar9) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

