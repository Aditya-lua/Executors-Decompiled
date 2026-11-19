/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00992470
 */

/* ix::WebSocketPerMessageDeflateOptions::WebSocketPerMessageDeflateOptions(std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >) */

void __thiscall
ix::WebSocketPerMessageDeflateOptions::WebSocketPerMessageDeflateOptions
          (WebSocketPerMessageDeflateOptions *this,WebSocketPerMessageDeflateOptions *param_2)

{
  size_t sVar1;
  void *pvVar2;
  ulong uVar3;
  long lVar4;
  int iVar5;
  basic_istream *pbVar6;
  char *pcVar7;
  long lVar8;
  uint uVar9;
  long lVar10;
  WebSocketPerMessageDeflateOptions WVar11;
  ulong uVar12;
  void *pvVar13;
  char *pcVar14;
  ulong uVar15;
  ulong local_1c0;
  ulong local_1b8;
  char *local_1b0;
  ulong local_1a8;
  ulong local_1a0;
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
  
  lVar4 = tpidr_el0;
  lVar10 = *(long *)(lVar4 + 0x28);
  removeSpaces(param_2,(basic_string_conflict *)param_2);
  if (((byte)*param_2 & 1) == 0) {
    *(undefined2 *)param_2 = 0;
  }
  else {
    **(undefined1 **)(param_2 + 0x10) = 0;
    *(undefined8 *)(param_2 + 8) = 0;
    if (((byte)*param_2 & 1) != 0) {
      operator_delete(*(void **)(param_2 + 0x10));
      *(undefined8 *)param_2 = 0;
    }
  }
  *(undefined ***)(param_2 + 0x10) = local_180;
  *(undefined8 *)(param_2 + 8) = uStack_188;
  *(undefined ***)param_2 = local_190;
  *(undefined4 *)this = 0xf000000;
  this[4] = (WebSocketPerMessageDeflateOptions)0xf;
  local_1a8 = 0;
  local_1a0 = 0;
  local_198 = (void *)0x0;
  local_180 = &PTR_FUN_00c4e508;
  local_110[0] = &PTR__basic_istream_00c4e640;
  uStack_188 = 0;
  local_190 = &PTR__basic_istream_00c4e618;
                    /* try { // try from 00992548 to 00992553 has its CatchHandler @ 00992aac */
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
                    /* try { // try from 009925c8 to 009925d3 has its CatchHandler @ 00992a78 */
  std::__ndk1::basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
  str((basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
      &ppuStack_178,(basic_string_conflict *)param_2);
  pvVar13 = (void *)((ulong)&local_1a8 | 1);
  pcVar14 = (char *)((ulong)&local_1c0 | 1);
LAB_00992600:
  do {
                    /* try { // try from 00992600 to 0099260f has its CatchHandler @ 00992ac8 */
    pbVar6 = std::__ndk1::getline<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                       ((basic_istream *)&local_190,(basic_string_conflict *)&local_1a8,';');
    uVar15 = local_1a8;
    if (((byte)pbVar6[*(long *)(*(long *)pbVar6 + -0x18) + 0x20] & 5) != 0) {
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
      if (*(long *)(lVar4 + 0x28) != lVar10) {
                    /* WARNING: Subroutine does not return */
        __stack_chk_fail();
      }
      return;
    }
    uVar12 = local_1a8 >> 1 & 0x7f;
    if ((local_1a8 & 1) != 0) {
      uVar12 = local_1a0;
    }
    if (uVar12 == 0x1a) {
      pvVar2 = pvVar13;
      if ((local_1a8 & 1) != 0) {
        pvVar2 = local_198;
      }
      iVar5 = memcmp(pvVar2,"server_no_context_takeover",0x1a);
      if (iVar5 == 0) {
        this[2] = (WebSocketPerMessageDeflateOptions)0x1;
      }
      iVar5 = memcmp(pvVar2,"client_no_context_takeover",0x1a);
      if (iVar5 == 0) {
        this[1] = (WebSocketPerMessageDeflateOptions)0x1;
      }
    }
    else if (uVar12 == 0x12) {
      pvVar2 = pvVar13;
      if ((local_1a8 & 1) != 0) {
        pvVar2 = local_198;
      }
      iVar5 = memcmp(pvVar2,"permessage-deflate",0x12);
      if (iVar5 == 0) {
        *this = (WebSocketPerMessageDeflateOptions)0x1;
      }
    }
                    /* try { // try from 009926c4 to 009926cb has its CatchHandler @ 00992ac4 */
    pcVar7 = operator_new(0x20);
    sVar1 = uVar12;
    if (0x16 < uVar12) {
      sVar1 = 0x17;
    }
    builtin_strncpy(pcVar7,"server_max_window_bits=",0x18);
    if (sVar1 == 0) {
LAB_00992714:
      operator_delete(pcVar7);
      if (0x16 < uVar12) {
        pvVar2 = pvVar13;
        uVar15 = local_1a8 >> 1 & 0x7f;
        if ((local_1a8 & 1) != 0) {
          pvVar2 = local_198;
          uVar15 = local_1a0;
        }
        uVar12 = uVar15;
        do {
          if (uVar12 == 0) {
            uVar12 = 0xffffffffffffffff;
            break;
          }
          lVar8 = uVar12 - 1;
          uVar12 = uVar12 - 1;
        } while (*(char *)((long)pvVar2 + lVar8) != '=');
        uVar12 = uVar12 + 1;
        uVar3 = uVar15 - uVar12;
        local_1c0 = 0;
        local_1b8 = 0;
        local_1b0 = (char *)0x0;
        if (uVar15 < uVar12) {
                    /* try { // try from 00992a4c to 00992a5b has its CatchHandler @ 00992a74 */
          std::__ndk1::__basic_string_common<true>::__throw_out_of_range();
LAB_00992a54:
                    /* WARNING: Subroutine does not return */
          std::__ndk1::__basic_string_common<true>::__throw_length_error();
        }
        if (0xffffffffffffffef < uVar3) goto LAB_00992a54;
        if (uVar3 < 0x17) {
          local_1c0 = (ulong)(byte)((int)uVar3 << 1);
          pcVar7 = pcVar14;
          if (uVar3 != 0) goto LAB_009927b8;
        }
        else {
          uVar15 = uVar3 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 009927a0 to 009927a7 has its CatchHandler @ 00992abc */
          pcVar7 = operator_new(uVar15);
          local_1c0 = uVar15 | 1;
          local_1b8 = uVar3;
          local_1b0 = pcVar7;
LAB_009927b8:
          memcpy(pcVar7,(void *)((long)pvVar2 + uVar12),uVar3);
        }
        pcVar7[uVar3] = '\0';
        pcVar7 = pcVar14;
        if ((local_1c0 & 1) != 0) {
          pcVar7 = local_1b0;
        }
        lVar8 = strtol(pcVar7,(char **)0x0,10);
        if ((local_1c0 & 1) != 0) {
          operator_delete(local_1b0);
        }
        uVar9 = (uint)lVar8;
        if ((uVar9 & 0xff) < 9) {
          uVar9 = 8;
        }
        WVar11 = SUB41(uVar9,0);
        if (0xe < (uVar9 & 0xff)) {
          WVar11 = (WebSocketPerMessageDeflateOptions)0xf;
        }
        this[4] = WVar11;
      }
    }
    else {
      pvVar2 = pvVar13;
      if ((uVar15 & 1) != 0) {
        pvVar2 = local_198;
      }
      iVar5 = memcmp(pvVar2,pcVar7,sVar1);
      if (iVar5 == 0) goto LAB_00992714;
      operator_delete(pcVar7);
    }
                    /* try { // try from 00992824 to 0099282b has its CatchHandler @ 00992ac0 */
    pcVar7 = operator_new(0x20);
    builtin_strncpy(pcVar7 + 0xf,"ow_bits=",8);
    uVar15 = local_1a8 >> 1 & 0x7f;
    if ((local_1a8 & 1) != 0) {
      uVar15 = local_1a0;
    }
    sVar1 = uVar15;
    if (0x16 < uVar15) {
      sVar1 = 0x17;
    }
    builtin_strncpy(pcVar7,"client_max_windo",0x10);
    pcVar7[0x17] = '\0';
    if (sVar1 == 0) {
LAB_00992884:
      operator_delete(pcVar7);
      if (0x16 < uVar15) {
        pvVar2 = pvVar13;
        uVar15 = local_1a8 >> 1 & 0x7f;
        if ((local_1a8 & 1) != 0) {
          pvVar2 = local_198;
          uVar15 = local_1a0;
        }
        uVar12 = uVar15;
        do {
          if (uVar12 == 0) {
            uVar12 = 0xffffffffffffffff;
            break;
          }
          lVar8 = uVar12 - 1;
          uVar12 = uVar12 - 1;
        } while (*(char *)((long)pvVar2 + lVar8) != '=');
        uVar12 = uVar12 + 1;
        uVar3 = uVar15 - uVar12;
        local_1c0 = 0;
        local_1b8 = 0;
        local_1b0 = (char *)0x0;
        if (uVar15 < uVar12) {
                    /* try { // try from 00992a5c to 00992a6b has its CatchHandler @ 00992a70 */
          std::__ndk1::__basic_string_common<true>::__throw_out_of_range();
LAB_00992a64:
                    /* WARNING: Subroutine does not return */
          std::__ndk1::__basic_string_common<true>::__throw_length_error();
        }
        if (0xffffffffffffffef < uVar3) goto LAB_00992a64;
        if (uVar3 < 0x17) {
          local_1c0 = (ulong)(byte)((int)uVar3 << 1);
          pcVar7 = pcVar14;
          if (uVar3 != 0) goto LAB_00992928;
        }
        else {
          uVar15 = uVar3 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 00992910 to 00992917 has its CatchHandler @ 00992ab8 */
          pcVar7 = operator_new(uVar15);
          local_1c0 = uVar15 | 1;
          local_1b8 = uVar3;
          local_1b0 = pcVar7;
LAB_00992928:
          memcpy(pcVar7,(void *)((long)pvVar2 + uVar12),uVar3);
        }
        pcVar7[uVar3] = '\0';
        pcVar7 = pcVar14;
        if ((local_1c0 & 1) != 0) {
          pcVar7 = local_1b0;
        }
        lVar8 = strtol(pcVar7,(char **)0x0,10);
        if ((local_1c0 & 1) != 0) {
          operator_delete(local_1b0);
        }
        uVar9 = (uint)lVar8;
        if ((uVar9 & 0xff) < 9) {
          uVar9 = 8;
        }
        if (0xe < (uVar9 & 0xff)) {
          uVar9 = 0xf;
        }
        WVar11 = (WebSocketPerMessageDeflateOptions)0x9;
        if ((uVar9 & 0xff) != 8) {
          WVar11 = SUB41(uVar9,0);
        }
        this[3] = WVar11;
      }
      goto LAB_00992600;
    }
    pvVar2 = pvVar13;
    if ((local_1a8 & 1) != 0) {
      pvVar2 = local_198;
    }
    iVar5 = memcmp(pvVar2,pcVar7,sVar1);
    if (iVar5 == 0) goto LAB_00992884;
    operator_delete(pcVar7);
  } while( true );
}

