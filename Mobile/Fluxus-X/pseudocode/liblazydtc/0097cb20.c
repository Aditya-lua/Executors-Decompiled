/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0097cb20
 */

void FUN_0097cb20(long param_1,long *param_2,undefined8 *param_3,undefined8 param_4,
                 undefined8 param_5,basic_string_conflict *param_6)

{
  __shared_weak_count *p_Var1;
  int *piVar2;
  ulong *puVar3;
  ConnectionState *this;
  __shared_weak_count *this_00;
  __shared_weak_count *p_Var4;
  char cVar5;
  bool bVar6;
  long lVar7;
  char *pcVar8;
  char *__n;
  char *__src;
  piecewise_construct_t pVar9;
  piecewise_construct_t pVar10;
  undefined1 uVar11;
  undefined1 uVar12;
  undefined1 uVar13;
  undefined1 uVar14;
  undefined1 uVar15;
  undefined1 uVar16;
  undefined1 uVar17;
  undefined1 uVar18;
  undefined1 uVar19;
  undefined1 uVar20;
  undefined1 uVar21;
  undefined1 uVar22;
  undefined1 uVar23;
  undefined1 uVar24;
  piecewise_construct_t pVar25;
  basic_filebuf<char,std::__ndk1::char_traits<char>> bVar26;
  int iVar27;
  long lVar28;
  int *piVar29;
  undefined8 *puVar30;
  char *pcVar31;
  char *pcVar32;
  byte *pbVar33;
  basic_ostream *pbVar34;
  ulong extraout_x1;
  basic_string_conflict *extraout_x1_00;
  basic_string_conflict *extraout_x1_01;
  basic_string_conflict *extraout_x1_02;
  basic_string_conflict *pbVar35;
  ulong uVar36;
  undefined8 uVar37;
  char *pcVar38;
  long lVar39;
  char *pcVar40;
  char *pcVar41;
  SocketServer *this_01;
  ulong uVar42;
  byte *pbVar43;
  ulong uVar44;
  ulong uVar45;
  void *pvVar46;
  undefined8 uVar47;
  undefined8 uVar48;
  undefined1 auVar49 [16];
  uint local_288;
  undefined2 uStack_284;
  undefined2 uStack_282;
  undefined1 uStack_280;
  undefined2 local_27f;
  undefined1 local_27d;
  undefined2 uStack_27c;
  undefined1 local_27a;
  undefined1 uStack_279;
  void *local_278;
  byte local_270 [16];
  char *local_260;
  __tree_node **local_258;
  __tree_node *local_250;
  undefined8 uStack_248;
  ulong local_240;
  ulong uStack_238;
  char *local_230;
  piecewise_construct_t local_220;
  undefined4 uStack_21f;
  char cStack_21b;
  char cStack_21a;
  char cStack_219;
  piecewise_construct_t pStack_218;
  undefined1 uStack_217;
  undefined1 uStack_216;
  undefined1 uStack_215;
  undefined1 uStack_214;
  undefined1 uStack_213;
  undefined1 uStack_212;
  undefined1 uStack_211;
  char *local_210;
  long local_208;
  undefined8 local_200;
  char *pcStack_1f8;
  char *local_1f0;
  uint *local_1e0;
  undefined4 local_1d8;
  undefined2 local_1d4;
  undefined1 local_1d2;
  piecewise_construct_t local_1d0;
  undefined7 uStack_1cf;
  piecewise_construct_t pStack_1c8;
  undefined4 uStack_1c7;
  undefined1 uStack_1c3;
  undefined2 uStack_1c2;
  basic_filebuf<char,std::__ndk1::char_traits<char>> local_1c0;
  undefined1 uStack_1bf;
  undefined6 uStack_1be;
  undefined **ppuStack_1b8;
  locale alStack_1b0 [8];
  undefined8 local_1a8;
  undefined8 uStack_1a0;
  undefined8 local_198;
  undefined8 uStack_190;
  undefined8 local_188;
  undefined8 uStack_180;
  ulong local_178;
  undefined8 uStack_170;
  void *local_168;
  undefined8 uStack_160;
  undefined4 local_158;
  undefined **local_150;
  FILE *local_148;
  undefined4 local_128;
  undefined **local_118 [10];
  undefined8 local_c8;
  undefined4 local_c0;
  undefined8 local_90;
  undefined4 local_88;
  
  lVar7 = tpidr_el0;
  lVar39 = *(long *)(lVar7 + 0x28);
  puVar3 = (ulong *)*param_2;
  this_00 = (__shared_weak_count *)param_2[1];
  *param_2 = 0;
  param_2[1] = 0;
  this = (ConnectionState *)*param_3;
  p_Var4 = (__shared_weak_count *)param_3[1];
  *param_3 = 0;
  param_3[1] = 0;
  this_01 = *(SocketServer **)(param_1 + 8);
  uStack_238 = 0;
  local_230 = (char *)0x0;
  local_240 = 0;
  if ((*puVar3 & 1) == 0) {
    local_230 = (char *)puVar3[2];
    uStack_238 = puVar3[1];
    local_240 = *puVar3;
  }
  else {
    uVar45 = puVar3[1];
    if (0xffffffffffffffef < uVar45) {
                    /* try { // try from 0097df74 to 0097df7b has its CatchHandler @ 0097dfc8 */
                    /* WARNING: Subroutine does not return */
      std::__ndk1::__basic_string_common<true>::__throw_length_error();
    }
    pvVar46 = (void *)puVar3[2];
    if (uVar45 < 0x17) {
      pcVar40 = (char *)((ulong)&local_240 | 1);
      local_240 = (ulong)(byte)((int)uVar45 << 1);
      if (uVar45 != 0) goto LAB_0097cbe0;
    }
    else {
      uVar36 = uVar45 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 0097cbc8 to 0097cbcf has its CatchHandler @ 0097dfc8 */
      pcVar40 = operator_new(uVar36);
      local_240 = uVar36 | 1;
      uStack_238 = uVar45;
      local_230 = pcVar40;
LAB_0097cbe0:
      memcpy(pcVar40,pvVar46,uVar45);
    }
    pcVar40[uVar45] = '\0';
  }
  uVar45 = local_240 >> 1 & 0x7f;
  if ((local_240 & 1) != 0) {
    uVar45 = uStack_238;
  }
  if (uVar45 == 0) {
LAB_0097cc34:
                    /* try { // try from 0097cc34 to 0097cc47 has its CatchHandler @ 0097e054 */
    std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
           &local_240,"/index.html",0xb);
  }
  else if (uVar45 == 1) {
    pcVar40 = (char *)((ulong)&local_240 | 1);
    if ((local_240 & 1) != 0) {
      pcVar40 = local_230;
    }
    if (*pcVar40 == '/') goto LAB_0097cc34;
  }
  local_258 = &local_250;
  local_250 = (__tree_node *)0x0;
  uStack_248 = 0;
                    /* try { // try from 0097cc58 to 0097cc5f has its CatchHandler @ 0097e140 */
  ix::userAgent();
  local_200 = &local_220;
  pStack_218 = (piecewise_construct_t)0x0;
  uStack_217 = 0;
  uStack_216 = 0;
  uStack_215 = 0;
  uStack_214 = 0;
  uStack_213 = 0;
  uStack_212 = 0;
  uStack_211 = 0;
  local_210 = (void *)0x0;
  local_220 = (piecewise_construct_t)0xc;
  cStack_21b = 0x65;
  cStack_21a = 0x72;
  uStack_21f = 0x76726553;
  cStack_219 = 0;
                    /* try { // try from 0097cc90 to 0097ccab has its CatchHandler @ 0097e110 */
  lVar28 = std::__ndk1::
           __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
           ::
           __emplace_unique_key_args<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::piecewise_construct_t_const&,std::__ndk1::tuple<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>&&>,std::__ndk1::tuple<>>
                     ((basic_string_conflict *)&local_258,&local_220,(tuple *)&DAT_007497e2,
                      (tuple *)&local_200);
  pbVar43 = (byte *)(lVar28 + 0x38);
  if ((*pbVar43 & 1) == 0) {
    pbVar43[0] = 0;
    pbVar43[1] = 0;
  }
  else {
    **(undefined1 **)(lVar28 + 0x48) = 0;
    *(undefined8 *)(lVar28 + 0x40) = 0;
    if ((*(byte *)(lVar28 + 0x38) & 1) != 0) {
      operator_delete(*(void **)(lVar28 + 0x48));
      *(undefined8 *)(lVar28 + 0x38) = 0;
    }
  }
  *(ulong *)(lVar28 + 0x48) = CONCAT62(uStack_1be,CONCAT11(uStack_1bf,local_1c0));
  *(ulong *)(lVar28 + 0x40) =
       CONCAT26(uStack_1c2,CONCAT15(uStack_1c3,CONCAT41(uStack_1c7,pStack_1c8)));
  *(ulong *)pbVar43 = CONCAT71(uStack_1cf,local_1d0);
  local_1d0 = (piecewise_construct_t)0x0;
  uStack_1cf = 0;
  pStack_1c8 = (piecewise_construct_t)0x0;
  uStack_1c7 = 0;
  uStack_1c3 = 0;
  uStack_1c2 = 0;
  local_1c0 = (basic_filebuf<char,std::__ndk1::char_traits<char>>)0x0;
  uStack_1bf = 0;
  uStack_1be = 0;
  if ((((byte)local_220 & 1) != 0) && (operator_delete(local_210), ((byte)local_1d0 & 1) != 0)) {
    operator_delete((void *)CONCAT62(uStack_1be,CONCAT11(uStack_1bf,local_1c0)));
  }
  uVar45 = local_240 >> 1 & 0x7f;
  pcVar40 = (char *)((ulong)&local_240 | 1);
  if ((local_240 & 1) != 0) {
    uVar45 = uStack_238;
    pcVar40 = local_230;
  }
  piVar2 = (int *)(pcVar40 + uVar45);
  if (4 < (long)uVar45) {
    pcVar31 = pcVar40;
    uVar36 = uVar45;
    do {
      if ((uVar36 - 4 == 0) || (piVar29 = memchr(pcVar31,0x2e,uVar36 - 4), piVar29 == (int *)0x0))
      break;
      iVar27 = memcmp(piVar29,".html",5);
      if (iVar27 == 0) {
        if ((piVar29 != piVar2) && ((long)piVar29 - (long)pcVar40 != -1)) goto LAB_0097cebc;
        break;
      }
      pcVar31 = (char *)((long)piVar29 + 1);
      uVar36 = (long)piVar2 - (long)pcVar31;
    } while (4 < (long)uVar36);
  }
  if (3 < (long)uVar45) {
    pcVar31 = pcVar40;
    uVar36 = uVar45;
    do {
      pcVar32 = pcVar40;
      uVar44 = uVar45;
      if ((uVar36 - 3 == 0) || (piVar29 = memchr(pcVar31,0x2e,uVar36 - 3), piVar29 == (int *)0x0))
      break;
      if (*piVar29 == 0x6d74682e) {
        if ((piVar29 != piVar2) && ((long)piVar29 - (long)pcVar40 != -1)) goto LAB_0097cebc;
        break;
      }
      pcVar31 = (char *)((long)piVar29 + 1);
      uVar36 = (long)piVar2 - (long)pcVar31;
    } while (3 < (long)uVar36);
    do {
      if ((uVar44 - 3 == 0) || (piVar29 = memchr(pcVar32,0x2e,uVar44 - 3), piVar29 == (int *)0x0))
      break;
      if (*piVar29 == 0x7373632e) {
        if ((piVar29 != piVar2) && ((long)piVar29 - (long)pcVar40 != -1)) {
          puVar30 = (undefined8 *)0x0;
          uStack_216 = 0;
          uStack_215 = 0;
          uStack_214 = 0;
          uStack_213 = 0;
          local_220 = (piecewise_construct_t)0x10;
          uStack_21f = 0x74786574;
          cStack_21b = '/';
          cStack_21a = 'c';
          cStack_219 = 's';
          pStack_218 = (piecewise_construct_t)0x73;
          uStack_217 = 0;
          goto LAB_0097d32c;
        }
        break;
      }
      uVar44 = (long)piVar2 - ((long)piVar29 + 1);
      pcVar32 = (char *)((long)piVar29 + 1);
    } while (3 < (long)uVar44);
  }
  if (2 < (long)uVar45) {
    pcVar31 = pcVar40;
    uVar36 = uVar45;
    do {
      if ((uVar36 - 2 == 0) || (piVar29 = memchr(pcVar31,0x2e,uVar36 - 2), piVar29 == (int *)0x0))
      break;
      iVar27 = memcmp(piVar29,&DAT_002cb28b,3);
      if (iVar27 == 0) {
        if ((piVar29 != piVar2) && ((long)piVar29 - (long)pcVar40 != -1)) goto LAB_0097d0c8;
        break;
      }
      pcVar31 = (char *)((long)piVar29 + 1);
      uVar36 = (long)piVar2 - (long)pcVar31;
    } while (2 < (long)uVar36);
  }
  if (3 < (long)uVar45) {
    pcVar31 = pcVar40;
    uVar36 = uVar45;
    do {
      pcVar32 = pcVar40;
      uVar44 = uVar45;
      if ((uVar36 - 3 == 0) || (piVar29 = memchr(pcVar31,0x2e,uVar36 - 3), piVar29 == (int *)0x0))
      break;
      if (*piVar29 == 0x736a6d2e) {
        if ((piVar29 != piVar2) && ((long)piVar29 - (long)pcVar40 != -1)) goto LAB_0097d0c8;
        break;
      }
      pcVar31 = (char *)((long)piVar29 + 1);
      uVar36 = (long)piVar2 - (long)pcVar31;
    } while (3 < (long)uVar36);
    do {
      pcVar31 = pcVar40;
      uVar36 = uVar45;
      if ((uVar44 - 3 == 0) || (piVar29 = memchr(pcVar32,0x2e,uVar44 - 3), piVar29 == (int *)0x0))
      break;
      if (*piVar29 == 0x6f63692e) {
        if ((piVar29 != piVar2) && ((long)piVar29 - (long)pcVar40 != -1)) {
          puVar30 = (undefined8 *)0x0;
          local_220 = (piecewise_construct_t)0x18;
          uStack_217 = 0x69;
          uStack_216 = 99;
          uStack_215 = 0x6f;
          uStack_214 = 0x6e;
          uStack_21f = 0x67616d69;
          cStack_21b = 'e';
          cStack_21a = '/';
          cStack_219 = 'x';
          pStack_218 = (piecewise_construct_t)0x2d;
          uStack_213 = 0;
          goto LAB_0097d32c;
        }
        break;
      }
      uVar44 = (long)piVar2 - ((long)piVar29 + 1);
      pcVar32 = (char *)((long)piVar29 + 1);
    } while (3 < (long)uVar44);
    do {
      pcVar32 = pcVar40;
      uVar44 = uVar45;
      if ((uVar36 - 3 == 0) || (piVar29 = memchr(pcVar31,0x2e,uVar36 - 3), piVar29 == (int *)0x0))
      break;
      if (*piVar29 == 0x676e702e) {
        if ((piVar29 != piVar2) && ((long)piVar29 - (long)pcVar40 != -1)) {
          uVar37._0_1_ = 'i';
          uVar37._1_1_ = 'm';
          uVar37._2_1_ = 'a';
          uVar37._3_1_ = 'g';
          uVar37._4_1_ = 'e';
          uVar37._5_1_ = '/';
          uVar37._6_1_ = 'p';
          uVar37._7_1_ = 'n';
          uStack_217 = 0x67;
          goto LAB_0097d25c;
        }
        break;
      }
      uVar36 = (long)piVar2 - ((long)piVar29 + 1);
      pcVar31 = (char *)((long)piVar29 + 1);
    } while (3 < (long)uVar36);
    do {
      if ((uVar44 - 3 == 0) || (piVar29 = memchr(pcVar32,0x2e,uVar44 - 3), piVar29 == (int *)0x0))
      break;
      if (*piVar29 == 0x67706a2e) {
        if ((piVar29 != piVar2) && ((long)piVar29 - (long)pcVar40 != -1)) goto LAB_0097d2bc;
        break;
      }
      uVar44 = (long)piVar2 - ((long)piVar29 + 1);
      pcVar32 = (char *)((long)piVar29 + 1);
    } while (3 < (long)uVar44);
  }
  if (4 < (long)uVar45) {
    pcVar31 = pcVar40;
    uVar36 = uVar45;
    do {
      if ((uVar36 - 4 == 0) || (piVar29 = memchr(pcVar31,0x2e,uVar36 - 4), piVar29 == (int *)0x0))
      break;
      iVar27 = memcmp(piVar29,".jpeg",5);
      if (iVar27 == 0) {
        if ((piVar29 != piVar2) && ((long)piVar29 - (long)pcVar40 != -1)) goto LAB_0097d2bc;
        break;
      }
      pcVar31 = (char *)((long)piVar29 + 1);
      uVar36 = (long)piVar2 - (long)pcVar31;
    } while (4 < (long)uVar36);
  }
  if (3 < (long)uVar45) {
    pcVar31 = pcVar40;
    uVar36 = uVar45;
    do {
      pcVar32 = pcVar40;
      if ((uVar36 - 3 == 0) || (piVar29 = memchr(pcVar31,0x2e,uVar36 - 3), piVar29 == (int *)0x0))
      break;
      if (*piVar29 == 0x6669672e) {
        if ((piVar29 != piVar2) && ((long)piVar29 - (long)pcVar40 != -1)) {
          uVar37._0_1_ = 'i';
          uVar37._1_1_ = 'm';
          uVar37._2_1_ = 'a';
          uVar37._3_1_ = 'g';
          uVar37._4_1_ = 'e';
          uVar37._5_1_ = '/';
          uVar37._6_1_ = 'g';
          uVar37._7_1_ = 'i';
          uStack_217 = 0x66;
          goto LAB_0097d25c;
        }
        break;
      }
      pcVar31 = (char *)((long)piVar29 + 1);
      uVar36 = (long)piVar2 - (long)pcVar31;
    } while (3 < (long)uVar36);
    do {
      if ((uVar45 - 3 == 0) || (piVar29 = memchr(pcVar32,0x2e,uVar45 - 3), piVar29 == (int *)0x0))
      break;
      if (*piVar29 == 0x6776732e) {
        if ((piVar29 != piVar2) && ((long)piVar29 - (long)pcVar40 != -1)) {
          puVar30 = (undefined8 *)0x0;
          local_220 = (piecewise_construct_t)0x1a;
          uStack_21f = 0x67616d69;
          cStack_21b = 'e';
          cStack_21a = '/';
          cStack_219 = 's';
          pStack_218 = (piecewise_construct_t)0x76;
          uStack_217 = 0x67;
          uStack_216 = 0x2b;
          uStack_215 = 0x78;
          uStack_214 = 0x6d;
          uStack_213 = 0x6c;
          goto LAB_0097d32c;
        }
        break;
      }
      uVar45 = (long)piVar2 - ((long)piVar29 + 1);
      pcVar32 = (char *)((long)piVar29 + 1);
    } while (3 < (long)uVar45);
  }
  local_220 = (piecewise_construct_t)0x0;
  uStack_21f = 0;
  cStack_21b = 0;
  cStack_21a = 0;
  cStack_219 = 0;
  pStack_218 = (piecewise_construct_t)0x0;
  uStack_217 = 0;
  uStack_216 = 0;
  uStack_215 = 0;
  uStack_214 = 0;
  uStack_213 = 0;
  uStack_212 = 0;
  uStack_211 = 0;
  puVar30 = operator_new(0x20);
  pcVar40 = "application/octet-stream";
  goto LAB_0097d178;
LAB_0097d0c8:
  local_220 = (piecewise_construct_t)0x0;
  uStack_21f = 0;
  cStack_21b = 0;
  cStack_21a = 0;
  cStack_219 = 0;
  pStack_218 = (piecewise_construct_t)0x0;
  uStack_217 = 0;
  uStack_216 = 0;
  uStack_215 = 0;
  uStack_214 = 0;
  uStack_213 = 0;
  uStack_212 = 0;
  uStack_211 = 0;
                    /* try { // try from 0097d0cc to 0097d167 has its CatchHandler @ 0097e068 */
  puVar30 = operator_new(0x20);
  pcVar40 = "application/x-javascript";
LAB_0097d178:
  uVar37 = *(undefined8 *)(pcVar40 + 0x10);
  uVar48 = *(undefined8 *)(pcVar40 + 8);
  uVar47 = *(undefined8 *)pcVar40;
  *(undefined1 *)(puVar30 + 3) = 0;
  pStack_218 = (piecewise_construct_t)0x18;
  uStack_217 = 0;
  uStack_216 = 0;
  uStack_215 = 0;
  uStack_214 = 0;
  uStack_213 = 0;
  local_220 = (piecewise_construct_t)0x21;
  uStack_21f = 0;
  cStack_21b = '\0';
  cStack_21a = '\0';
  cStack_219 = '\0';
  puVar30[2] = uVar37;
  puVar30[1] = uVar48;
  *puVar30 = uVar47;
  goto LAB_0097d32c;
LAB_0097d2bc:
  puVar30 = (undefined8 *)0x0;
  uStack_214 = 0;
  uStack_213 = 0;
  local_220 = (piecewise_construct_t)0x14;
  uStack_217 = 0x65;
  uStack_216 = 0x67;
  uStack_21f = 0x67616d69;
  cStack_21b = 'e';
  cStack_21a = '/';
  cStack_219 = 'j';
  pStack_218 = (piecewise_construct_t)0x70;
  uStack_215 = 0;
  goto LAB_0097d32c;
LAB_0097cebc:
  uVar37._0_1_ = 't';
  uVar37._1_1_ = 'e';
  uVar37._2_1_ = 'x';
  uVar37._3_1_ = 't';
  uVar37._4_1_ = '/';
  uVar37._5_1_ = 'h';
  uVar37._6_1_ = 't';
  uVar37._7_1_ = 'm';
  uStack_217 = 0x6c;
LAB_0097d25c:
  uStack_213 = 0;
  uStack_214 = 0;
  uStack_215 = 0;
  local_220 = (piecewise_construct_t)0x12;
  puVar30 = (undefined8 *)0x0;
  uStack_216 = 0;
  uStack_21f = (undefined4)uVar37;
  cStack_21b = SUB81(uVar37,4);
  cStack_21a = SUB81(uVar37,5);
  cStack_219 = SUB81(uVar37,6);
  pStack_218 = SUB81(uVar37,7);
LAB_0097d32c:
  uStack_211 = 0;
  uStack_212 = 0;
  local_200 = &local_1d0;
  uStack_1c2 = 0;
  local_1c0 = (basic_filebuf<char,std::__ndk1::char_traits<char>>)0x0;
  uStack_1bf = 0;
  uStack_1be = 0;
  local_1d0 = (piecewise_construct_t)0x18;
  uStack_1c7 = 0x65707954;
  uStack_1cf = 0x746e65746e6f43;
  pStack_1c8 = (piecewise_construct_t)0x2d;
  uStack_1c3 = 0;
                    /* try { // try from 0097d364 to 0097d37f has its CatchHandler @ 0097e0e8 */
  pbVar35 = (basic_string_conflict *)&DAT_007497e2;
  lVar28 = std::__ndk1::
           __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
           ::
           __emplace_unique_key_args<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::piecewise_construct_t_const&,std::__ndk1::tuple<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>&&>,std::__ndk1::tuple<>>
                     ((basic_string_conflict *)&local_258,&local_1d0,(tuple *)&DAT_007497e2,
                      (tuple *)&local_200);
  pbVar43 = (byte *)(lVar28 + 0x38);
  if ((*pbVar43 & 1) == 0) {
    *(undefined2 *)(lVar28 + 0x38) = 0;
  }
  else {
    **(undefined1 **)(lVar28 + 0x48) = 0;
    *(undefined8 *)(lVar28 + 0x40) = 0;
    if ((*(byte *)(lVar28 + 0x38) & 1) != 0) {
      operator_delete(*(void **)(lVar28 + 0x48));
      pbVar43[0] = 0;
      pbVar43[1] = 0;
      pbVar43[2] = 0;
      pbVar43[3] = 0;
      pbVar43[4] = 0;
      pbVar43[5] = 0;
      pbVar43[6] = 0;
      pbVar43[7] = 0;
    }
  }
  *(ulong *)(lVar28 + 0x40) =
       CONCAT17(uStack_211,
                CONCAT16(uStack_212,
                         CONCAT15(uStack_213,
                                  CONCAT14(uStack_214,
                                           CONCAT13(uStack_215,
                                                    CONCAT12(uStack_216,
                                                             CONCAT11(uStack_217,pStack_218)))))));
  *(ulong *)pbVar43 =
       CONCAT17(cStack_219,CONCAT16(cStack_21a,CONCAT15(cStack_21b,CONCAT41(uStack_21f,local_220))))
  ;
  *(undefined8 **)(lVar28 + 0x48) = puVar30;
  local_220 = (piecewise_construct_t)0x0;
  uStack_21f = 0;
  cStack_21b = 0;
  cStack_21a = 0;
  cStack_219 = 0;
  pStack_218 = (piecewise_construct_t)0x0;
  uStack_217 = 0;
  uStack_216 = 0;
  uStack_215 = 0;
  uStack_214 = 0;
  uStack_213 = 0;
  uStack_212 = 0;
  uStack_211 = 0;
  if (((byte)local_1d0 & 1) != 0) {
    operator_delete((void *)CONCAT62(uStack_1be,CONCAT11(uStack_1bf,local_1c0)));
  }
                    /* try { // try from 0097d3dc to 0097d3ef has its CatchHandler @ 0097e0e4 */
  std::__ndk1::operator+((__ndk1 *)&DAT_002ab502,(char *)&local_240,pbVar35);
  local_200 = (piecewise_construct_t *)0x0;
  pcStack_1f8 = (char *)0x0;
  local_1f0 = (char *)0x0;
  local_118[0] = &PTR__basic_istream_00c51c70;
  pStack_1c8 = (piecewise_construct_t)0x0;
  uStack_1c7 = 0;
  uStack_1c3 = 0;
  uStack_1c2 = 0;
  local_1d0 = (piecewise_construct_t)0x48;
  uStack_1cf = 0xc51c;
                    /* try { // try from 0097d424 to 0097d42f has its CatchHandler @ 0097e0d8 */
  std::__ndk1::ios_base::init((ios_base *)local_118,&local_1c0);
  local_90 = 0;
  local_88 = 0xffffffff;
  local_1d0 = (piecewise_construct_t)0xf0;
  uStack_1cf = 0xc51b;
  local_118[0] = &PTR_LAB_00c51c18;
                    /* try { // try from 0097d454 to 0097d45b has its CatchHandler @ 0097e0d4 */
  std::__ndk1::basic_filebuf<char,std::__ndk1::char_traits<char>>::basic_filebuf(&local_1c0);
  if (local_148 == (FILE *)0x0) {
    pcVar40 = (char *)((ulong)local_270 | 1);
    if ((local_270[0] & 1) != 0) {
      pcVar40 = local_260;
    }
    local_148 = fopen(pcVar40,"r");
    if (local_148 == (FILE *)0x0) goto LAB_0097d464;
    local_128 = 8;
LAB_0097d4e4:
                    /* try { // try from 0097d4e4 to 0097d4f3 has its CatchHandler @ 0097e0b0 */
    std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::seekg
              ((basic_istream<char,std::__ndk1::char_traits<char>> *)&local_1d0,0,2);
                    /* try { // try from 0097d4f4 to 0097d54b has its CatchHandler @ 0097e170 */
    std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::tellg
              ((basic_istream<char,std::__ndk1::char_traits<char>> *)&local_1d0);
    std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::seekg
              ((basic_istream<char,std::__ndk1::char_traits<char>> *)&local_1d0,0,0);
    uVar45 = (long)pcStack_1f8 - (long)local_200;
    if (extraout_x1 < uVar45 || extraout_x1 - uVar45 == 0) {
      if (extraout_x1 < uVar45) {
        pcStack_1f8 = (char *)(local_200 + extraout_x1);
      }
    }
    else {
      std::__ndk1::vector<unsigned_char,std::__ndk1::allocator<unsigned_char>>::__append
                ((vector<unsigned_char,std::__ndk1::allocator<unsigned_char>> *)&local_200,
                 extraout_x1 - uVar45);
    }
    std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::read
              ((basic_istream<char,std::__ndk1::char_traits<char>> *)&local_1d0,(char *)local_200,
               extraout_x1);
    pcVar40 = (char *)local_200;
    local_220 = (piecewise_construct_t)0x1;
    local_210 = (char *)0x0;
    local_208 = 0;
    uVar45 = (long)pcStack_1f8 - (long)local_200;
    pStack_218 = (piecewise_construct_t)0x0;
    uStack_217 = 0;
    uStack_216 = 0;
    uStack_215 = 0;
    uStack_214 = 0;
    uStack_213 = 0;
    uStack_212 = 0;
    uStack_211 = 0;
    if (uVar45 != 0) {
      if ((long)uVar45 < 0) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 0097df84 to 0097df87 has its CatchHandler @ 0097e01c */
        std::__ndk1::__vector_base_common<true>::__throw_length_error();
      }
                    /* try { // try from 0097d56c to 0097d573 has its CatchHandler @ 0097e01c */
      local_210 = operator_new(uVar45);
LAB_0097d574:
      lVar28 = (long)local_210 + uVar45;
      pStack_218 = SUB81(local_210,0);
      uStack_217 = (undefined1)((ulong)local_210 >> 8);
      uStack_216 = (undefined1)((ulong)local_210 >> 0x10);
      uStack_215 = (undefined1)((ulong)local_210 >> 0x18);
      uStack_214 = (undefined1)((ulong)local_210 >> 0x20);
      uStack_213 = (undefined1)((ulong)local_210 >> 0x28);
      uStack_212 = (undefined1)((ulong)local_210 >> 0x30);
      uStack_211 = (undefined1)((ulong)local_210 >> 0x38);
      local_208 = lVar28;
      memcpy(local_210,pcVar40,uVar45);
      local_210 = (char *)lVar28;
    }
  }
  else {
LAB_0097d464:
    lVar28 = *(long *)(CONCAT71(uStack_1cf,local_1d0) + -0x18);
                    /* try { // try from 0097d47c to 0097d47f has its CatchHandler @ 0097e0b4 */
    std::__ndk1::ios_base::clear
              ((ios_base *)(alStack_1b0 + lVar28 + -0x20),*(uint *)(alStack_1b0 + lVar28) | 4);
    pcVar40 = (char *)local_200;
    if (local_148 != (FILE *)0x0) goto LAB_0097d4e4;
    local_220 = (piecewise_construct_t)0x0;
    local_210 = (char *)0x0;
    local_208 = 0;
    pStack_218 = (piecewise_construct_t)0x0;
    uStack_217 = 0;
    uStack_216 = 0;
    uStack_215 = 0;
    uStack_214 = 0;
    uStack_213 = 0;
    uStack_212 = 0;
    uStack_211 = 0;
    uVar45 = (long)pcStack_1f8 - (long)local_200;
    if (uVar45 != 0) {
      if ((long)uVar45 < 0) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 0097dfa0 to 0097dfa3 has its CatchHandler @ 0097dfc4 */
        std::__ndk1::__vector_base_common<true>::__throw_length_error();
      }
                    /* try { // try from 0097d4a4 to 0097d4ab has its CatchHandler @ 0097dfc4 */
      local_210 = operator_new(uVar45);
      goto LAB_0097d574;
    }
  }
  local_1d0 = (piecewise_construct_t)0xf0;
  uStack_1cf = 0xc51b;
  local_118[0] = &PTR_LAB_00c51c18;
  std::__ndk1::basic_filebuf<char,std::__ndk1::char_traits<char>>::~basic_filebuf(&local_1c0);
  std::__ndk1::ios_base::~ios_base((ios_base *)local_118);
  if (local_200 != (piecewise_construct_t *)0x0) {
    pcStack_1f8 = (char *)local_200;
    operator_delete(local_200);
  }
  pvVar46 = (void *)CONCAT17(uStack_211,
                             CONCAT16(uStack_212,
                                      CONCAT15(uStack_213,
                                               CONCAT14(uStack_214,
                                                        CONCAT13(uStack_215,
                                                                 CONCAT12(uStack_216,
                                                                          CONCAT11(uStack_217,
                                                                                   pStack_218)))))))
  ;
  local_1d0 = (piecewise_construct_t)0x0;
  uStack_1cf = 0;
  pStack_1c8 = (piecewise_construct_t)0x0;
  uStack_1c7 = 0;
  uStack_1c3 = 0;
  uStack_1c2 = 0;
  local_1c0 = (basic_filebuf<char,std::__ndk1::char_traits<char>>)0x0;
  uStack_1bf = 0;
  uStack_1be = 0;
  uVar45 = (long)local_210 - (long)pvVar46;
  if (uVar45 == 0) {
    pcVar40 = (char *)0x0;
    pcVar31 = (char *)0x0;
  }
  else {
    if ((long)uVar45 < 0) {
                    /* try { // try from 0097df6c to 0097df73 has its CatchHandler @ 0097e084 */
                    /* WARNING: Subroutine does not return */
      std::__ndk1::__vector_base_common<true>::__throw_length_error();
    }
                    /* try { // try from 0097d5d8 to 0097d5df has its CatchHandler @ 0097e084 */
    pcVar31 = operator_new(uVar45);
    pcVar40 = pcVar31 + uVar45;
    local_1d0 = SUB81(pcVar31,0);
    uStack_1cf = (undefined7)((ulong)pcVar31 >> 8);
    uStack_1c7 = (undefined4)((ulong)pcVar31 >> 8);
    uStack_1c3 = (undefined1)((ulong)pcVar31 >> 0x28);
    uStack_1c2 = (undefined2)((ulong)pcVar31 >> 0x30);
    local_1c0 = SUB81(pcVar40,0);
    bVar26 = local_1c0;
    uStack_1bf = (undefined1)((ulong)pcVar40 >> 8);
    uStack_1be = (undefined6)((ulong)pcVar40 >> 0x10);
    pStack_1c8 = local_1d0;
    memcpy(pcVar31,pvVar46,uVar45);
    uStack_1c7 = (undefined4)((ulong)pcVar40 >> 8);
    uStack_1c3 = (undefined1)((ulong)pcVar40 >> 0x28);
    uStack_1c2 = (undefined2)((ulong)pcVar40 >> 0x30);
    pStack_1c8 = (piecewise_construct_t)bVar26;
  }
  uVar45 = (long)pcVar40 - (long)pcVar31;
  local_200 = (piecewise_construct_t *)0x0;
  pcStack_1f8 = (char *)0x0;
  local_1f0 = (char *)0x0;
  if (0xffffffffffffffef < uVar45) {
                    /* try { // try from 0097df60 to 0097df67 has its CatchHandler @ 0097e03c */
                    /* WARNING: Subroutine does not return */
    std::__ndk1::__basic_string_common<true>::__throw_length_error();
  }
  if (uVar45 < 0x17) {
    local_200 = (piecewise_construct_t *)(ulong)(byte)((int)uVar45 << 1);
    pcVar32 = (char *)((ulong)&local_200 | 1);
    __n = pcStack_1f8;
    uVar36 = (ulong)local_200;
    __src = local_1f0;
    pVar9 = local_220;
  }
  else {
    uVar36 = uVar45 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 0097d65c to 0097d663 has its CatchHandler @ 0097e03c */
    pcVar32 = operator_new(uVar36);
    __n = (char *)uVar45;
    uVar36 = uVar36 | 1;
    __src = pcVar32;
    pVar9 = local_220;
  }
  if (pcVar31 != pcVar40) {
    pcVar38 = pcVar32;
    if ((uVar45 < 0x20) || ((pcVar32 < pcVar40 && (pcVar31 < pcVar32 + uVar45)))) {
LAB_0097d6dc:
      do {
        pcVar41 = pcVar31 + 1;
        *pcVar38 = *pcVar31;
        pcVar38 = pcVar38 + 1;
        pcVar31 = pcVar41;
      } while (pcVar40 != pcVar41);
    }
    else {
      uVar42 = uVar45 & 0xffffffffffffffe0;
      pcVar38 = pcVar31 + 0x10;
      pcVar41 = pcVar32 + 0x10;
      uVar44 = uVar42;
      do {
        pcVar8 = pcVar38 + -8;
        uVar37 = *(undefined8 *)(pcVar38 + -0x10);
        uVar48 = *(undefined8 *)(pcVar38 + 8);
        uVar47 = *(undefined8 *)pcVar38;
        pcVar38 = pcVar38 + 0x20;
        uVar44 = uVar44 - 0x20;
        *(undefined8 *)(pcVar41 + -8) = *(undefined8 *)pcVar8;
        *(undefined8 *)(pcVar41 + -0x10) = uVar37;
        *(undefined8 *)(pcVar41 + 8) = uVar48;
        *(undefined8 *)pcVar41 = uVar47;
        pcVar41 = pcVar41 + 0x20;
      } while (uVar44 != 0);
      pcVar38 = pcVar32 + uVar42;
      pcVar31 = pcVar31 + uVar42;
      if (uVar42 != uVar45) goto LAB_0097d6dc;
    }
    pcVar32 = pcVar32 + uVar45;
  }
  *pcVar32 = '\0';
  local_200._0_1_ = SUB81(uVar36,0);
  pVar25 = local_200._0_1_;
  local_200._1_4_ = (undefined4)(uVar36 >> 8);
  local_200._5_2_ = (undefined2)(uVar36 >> 0x28);
  local_200._7_1_ = (undefined1)(uVar36 >> 0x38);
  local_1d8 = local_200._1_4_;
  local_1d4 = local_200._5_2_;
  local_1d2 = local_200._7_1_;
  local_220 = pVar9;
  local_200 = (piecewise_construct_t *)uVar36;
  pcStack_1f8 = __n;
  local_1f0 = __src;
  if ((void *)CONCAT71(uStack_1cf,local_1d0) != (void *)0x0) {
    uStack_1c7 = (undefined4)uStack_1cf;
    uStack_1c3 = (undefined1)((uint7)uStack_1cf >> 0x20);
    uStack_1c2 = (undefined2)((uint7)uStack_1cf >> 0x28);
    pStack_1c8 = local_1d0;
    operator_delete((void *)CONCAT71(uStack_1cf,local_1d0));
  }
  local_210 = (char *)CONCAT17(uStack_211,
                               CONCAT16(uStack_212,
                                        CONCAT15(uStack_213,
                                                 CONCAT14(uStack_214,
                                                          CONCAT13(uStack_215,
                                                                   CONCAT12(uStack_216,
                                                                            CONCAT11(uStack_217,
                                                                                     pStack_218)))))
                                       ));
  if (local_210 != (void *)0x0) {
    operator_delete(local_210);
  }
  if (pVar9 == (piecewise_construct_t)0x0) {
    local_200 = (piecewise_construct_t *)CONCAT44(local_200._4_4_,0x194);
    local_288 = 0;
    pStack_1c8 = (piecewise_construct_t)0x0;
    uStack_1c7 = 0;
    uStack_1c3 = 0;
    uStack_1c2 = 0;
    local_1c0 = (basic_filebuf<char,std::__ndk1::char_traits<char>>)0x0;
    uStack_1bf = 0;
    uStack_1be = 0;
    local_220 = (piecewise_construct_t)0x0;
    uStack_21f = 0;
    cStack_21b = 0;
    cStack_21a = 0;
    cStack_219 = 0;
    pStack_218 = (piecewise_construct_t)0x0;
    uStack_217 = 0;
    uStack_216 = 0;
    uStack_215 = 0;
    uStack_214 = 0;
    uStack_213 = 0;
    uStack_212 = 0;
    uStack_211 = 0;
    local_1d0 = SUB81(&pStack_1c8,0);
    uStack_1cf = (undefined7)((ulong)&pStack_1c8 >> 8);
    local_210 = (char *)0x0;
                    /* try { // try from 0097d7a0 to 0097d7bf has its CatchHandler @ 0097dfe0 */
    std::__ndk1::shared_ptr<ix::HttpResponse>::
    make_shared<int,char_const(&)[10],ix::HttpErrorCode,std::__ndk1::map<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,ix::CaseInsensitiveLess,std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>
              ((shared_ptr<ix::HttpResponse> *)&local_200,(int *)"Not Found",(char *)&local_288,
               (HttpErrorCode *)&local_1d0,(map *)&local_220,param_6);
    if (((byte)local_220 & 1) != 0) {
      operator_delete(local_210);
    }
    std::__ndk1::
    __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
    ::destroy((__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
               *)&local_1d0,
              (__tree_node *)
              CONCAT26(uStack_1c2,CONCAT15(uStack_1c3,CONCAT41(uStack_1c7,pStack_1c8))));
    goto joined_r0x0097d7e8;
  }
  local_220 = (piecewise_construct_t)0x0;
  uStack_21f = 0;
  cStack_21b = 0;
  cStack_21a = 0;
  cStack_219 = 0;
  pStack_218 = (piecewise_construct_t)0x0;
  pVar9 = pStack_218;
  uStack_217 = 0;
  uVar11 = uStack_217;
  uStack_216 = 0;
  uVar13 = uStack_216;
  uStack_215 = 0;
  uVar15 = uStack_215;
  uStack_214 = 0;
  uVar17 = uStack_214;
  uStack_213 = 0;
  uVar19 = uStack_213;
  uStack_212 = 0;
  uVar21 = uStack_212;
  uStack_211 = 0;
  uVar23 = uStack_211;
  local_210 = (char *)0x0;
  pStack_218 = SUB81(__n,0);
  pVar10 = pStack_218;
  uStack_217 = (undefined1)((ulong)__n >> 8);
  uVar12 = uStack_217;
  uStack_216 = (undefined1)((ulong)__n >> 0x10);
  uVar14 = uStack_216;
  uStack_215 = (undefined1)((ulong)__n >> 0x18);
  uVar16 = uStack_215;
  uStack_214 = (undefined1)((ulong)__n >> 0x20);
  uVar18 = uStack_214;
  uStack_213 = (undefined1)((ulong)__n >> 0x28);
  uVar20 = uStack_213;
  uStack_212 = (undefined1)((ulong)__n >> 0x30);
  uVar22 = uStack_212;
  uStack_211 = (undefined1)((ulong)__n >> 0x38);
  uVar24 = uStack_211;
  if ((uVar36 & 1) == 0) {
    local_220 = pVar25;
    uStack_21f = local_1d8;
    cStack_21b = (char)local_1d4;
    cStack_21a = (char)((ushort)local_1d4 >> 8);
    cStack_219 = local_1d2;
    local_210 = __src;
  }
  else {
    pStack_218 = pVar9;
    uStack_217 = uVar11;
    uStack_216 = uVar13;
    uStack_215 = uVar15;
    uStack_214 = uVar17;
    uStack_213 = uVar19;
    uStack_212 = uVar21;
    uStack_211 = uVar23;
    if (0xffffffffffffffef < __n) {
                    /* try { // try from 0097df88 to 0097df8f has its CatchHandler @ 0097dfa4 */
                    /* WARNING: Subroutine does not return */
      std::__ndk1::__basic_string_common<true>::__throw_length_error();
    }
    if (__n < 0x17) {
      pcVar40 = (char *)((ulong)&local_220 | 1);
      local_220 = SUB41((int)__n << 1,0);
      if (__n != (char *)0x0) goto LAB_0097d838;
    }
    else {
      uVar45 = (long)__n + 0x10U & 0xfffffffffffffff0;
                    /* try { // try from 0097d820 to 0097d827 has its CatchHandler @ 0097dfa4 */
      pcVar40 = operator_new(uVar45);
      local_220 = (piecewise_construct_t)((byte)uVar45 | 1);
      uStack_21f = (undefined4)(uVar45 >> 8);
      cStack_21b = (char)(uVar45 >> 0x28);
      cStack_21a = (char)(uVar45 >> 0x30);
      cStack_219 = (char)(uVar45 >> 0x38);
      pStack_218 = pVar10;
      uStack_217 = uVar12;
      uStack_216 = uVar14;
      uStack_215 = uVar16;
      uStack_214 = uVar18;
      uStack_213 = uVar20;
      uStack_212 = uVar22;
      uStack_211 = uVar24;
      local_210 = pcVar40;
LAB_0097d838:
      memcpy(pcVar40,__src,(size_t)__n);
    }
    pcVar40[(long)__n] = '\0';
  }
  local_1d0 = (piecewise_construct_t)0x1e;
  uStack_1c7 = 0x646f636e;
  uStack_1c3 = 0x69;
  uStack_1c2 = 0x676e;
  uStack_1bf = 0;
  uStack_1be = 0;
  uStack_1cf = 0x2d747065636341;
  pStack_1c8 = (piecewise_construct_t)0x65;
  local_1c0 = (basic_filebuf<char,std::__ndk1::char_traits<char>>)0x0;
  local_288 = (uint)&local_1d0;
  uStack_284 = (undefined2)((ulong)&local_1d0 >> 0x20);
  uStack_282 = (undefined2)((ulong)&local_1d0 >> 0x30);
                    /* try { // try from 0097d880 to 0097d89b has its CatchHandler @ 0097e0c0 */
  auVar49 = std::__ndk1::
            __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
            ::
            __emplace_unique_key_args<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::piecewise_construct_t_const&,std::__ndk1::tuple<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>&&>,std::__ndk1::tuple<>>
                      ((basic_string_conflict *)(puVar3 + 0xc),&local_1d0,(tuple *)&DAT_007497e2,
                       (tuple *)&local_288);
  pbVar35 = auVar49._8_8_;
  lVar28 = auVar49._0_8_;
  pcStack_1f8 = (char *)0x0;
  local_1f0 = (char *)0x0;
  local_200 = (piecewise_construct_t *)0x0;
  if ((*(byte *)(lVar28 + 0x38) & 1) == 0) {
    local_1f0 = *(char **)(lVar28 + 0x48);
    pcStack_1f8 = *(char **)(lVar28 + 0x40);
    local_200 = *(piecewise_construct_t **)(lVar28 + 0x38);
  }
  else {
    uVar45 = *(ulong *)(lVar28 + 0x40);
    if (0xffffffffffffffef < uVar45) {
                    /* try { // try from 0097df90 to 0097df97 has its CatchHandler @ 0097e0c0 */
                    /* WARNING: Subroutine does not return */
      std::__ndk1::__basic_string_common<true>::__throw_length_error();
    }
    pvVar46 = *(void **)(lVar28 + 0x48);
    if (uVar45 < 0x17) {
      pcVar40 = (char *)((ulong)&local_200 | 1);
      local_200 = (piecewise_construct_t *)(ulong)(byte)((int)uVar45 << 1);
      if (uVar45 != 0) goto LAB_0097d9d8;
    }
    else {
      uVar44 = uVar45 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 0097d9c0 to 0097d9c7 has its CatchHandler @ 0097e0c0 */
      pcVar40 = operator_new(uVar44);
      local_200 = (piecewise_construct_t *)(uVar44 | 1);
      pcStack_1f8 = (char *)uVar45;
      local_1f0 = pcVar40;
LAB_0097d9d8:
      memcpy(pcVar40,pvVar46,uVar45);
      pbVar35 = extraout_x1_02;
    }
    pcVar40[uVar45] = '\0';
  }
  if (((byte)local_1d0 & 1) != 0) {
    operator_delete((void *)CONCAT62(uStack_1be,CONCAT11(uStack_1bf,local_1c0)));
    pbVar35 = extraout_x1_00;
  }
  pcVar40 = (char *)((ulong)local_200 >> 1 & 0x7f);
  if (((ulong)local_200 & 1) != 0) {
    pcVar40 = pcStack_1f8;
  }
  if (pcVar40 == (char *)0x1) {
    pcVar40 = (char *)((ulong)&local_200 | 1);
    if (((ulong)local_200 & 1) != 0) {
      pcVar40 = local_1f0;
    }
    if (*pcVar40 == '*') {
LAB_0097d90c:
                    /* try { // try from 0097d90c to 0097d917 has its CatchHandler @ 0097dfb4 */
      ix::gzipCompress((ix *)&local_220,pbVar35);
      if (((byte)local_220 & 1) != 0) {
        *local_210 = '\0';
        pStack_218 = (piecewise_construct_t)0x0;
        uStack_217 = 0;
        uStack_216 = 0;
        uStack_215 = 0;
        uStack_214 = 0;
        uStack_213 = 0;
        uStack_212 = 0;
        uStack_211 = 0;
        if (((byte)local_220 & 1) != 0) {
          operator_delete(local_210);
        }
      }
      local_220 = local_1d0;
      local_210 = (char *)CONCAT62(uStack_1be,CONCAT11(uStack_1bf,local_1c0));
      uStack_1be = 0;
      local_1d0 = (piecewise_construct_t)0x20;
      pStack_218 = pStack_1c8;
      uStack_217 = (undefined1)uStack_1c7;
      uStack_216 = (undefined1)((uint)uStack_1c7 >> 8);
      uStack_215 = (undefined1)((uint)uStack_1c7 >> 0x10);
      uStack_214 = (undefined1)((uint)uStack_1c7 >> 0x18);
      uStack_213 = uStack_1c3;
      uStack_212 = (undefined1)uStack_1c2;
      uStack_211 = (undefined1)((ushort)uStack_1c2 >> 8);
      uStack_21f = (undefined4)uStack_1cf;
      cStack_21b = (char)((uint7)uStack_1cf >> 0x20);
      cStack_21a = (char)((uint7)uStack_1cf >> 0x28);
      cStack_219 = (char)((uint7)uStack_1cf >> 0x30);
      uStack_1c7 = 0x6f636e45;
      uStack_1c3 = 100;
      uStack_1c2 = 0x6e69;
      local_1c0 = (basic_filebuf<char,std::__ndk1::char_traits<char>>)0x67;
      uStack_1cf = 0x746e65746e6f43;
      pStack_1c8 = (piecewise_construct_t)0x2d;
      uStack_1bf = 0;
      local_288 = (uint)&local_1d0;
      uStack_284 = (undefined2)((ulong)&local_1d0 >> 0x20);
      uStack_282 = (undefined2)((ulong)&local_1d0 >> 0x30);
                    /* try { // try from 0097da54 to 0097da83 has its CatchHandler @ 0097dfdc */
      lVar28 = std::__ndk1::
               __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
               ::
               __emplace_unique_key_args<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::piecewise_construct_t_const&,std::__ndk1::tuple<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>&&>,std::__ndk1::tuple<>>
                         ((basic_string_conflict *)&local_258,&local_1d0,(tuple *)&DAT_007497e2,
                          (tuple *)&local_288);
      std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
      assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
             (lVar28 + 0x38),"gzip",4);
      if (((byte)local_1d0 & 1) != 0) {
        operator_delete((void *)CONCAT62(uStack_1be,CONCAT11(uStack_1bf,local_1c0)));
      }
    }
  }
  else {
    pcVar31 = (char *)((ulong)&local_200 | 1);
    if (((ulong)local_200 & 1) != 0) {
      pcVar31 = local_1f0;
    }
    if (3 < (long)pcVar40) {
      piVar2 = (int *)(pcVar31 + (long)pcVar40);
      pcVar32 = pcVar31;
      do {
        if (((long)pcVar40 - 3U == 0) ||
           (piVar29 = memchr(pcVar32,0x67,(long)pcVar40 - 3U), piVar29 == (int *)0x0)) break;
        if (*piVar29 == 0x70697a67) {
          if ((piVar29 != piVar2) && (pbVar35 = extraout_x1_01, (long)piVar29 - (long)pcVar31 != -1)
             ) goto LAB_0097d90c;
          break;
        }
        pcVar32 = (char *)((long)piVar29 + 1);
        pcVar40 = (char *)((long)piVar2 - (long)pcVar32);
      } while (3 < (long)pcVar40);
    }
  }
  local_1d0 = (piecewise_construct_t)0x1e;
  uStack_1c7 = 0x646f636e;
  uStack_1c3 = 0x69;
  uStack_1c2 = 0x676e;
  uStack_1bf = 0;
  uStack_1be = 0;
  uStack_1cf = 0x2d747065636341;
  pStack_1c8 = (piecewise_construct_t)0x45;
  local_1c0 = (basic_filebuf<char,std::__ndk1::char_traits<char>>)0x0;
  local_288 = (uint)&local_1d0;
  uStack_284 = (undefined2)((ulong)&local_1d0 >> 0x20);
  uStack_282 = (undefined2)((ulong)&local_1d0 >> 0x30);
                    /* try { // try from 0097dac4 to 0097daf3 has its CatchHandler @ 0097e150 */
  lVar28 = std::__ndk1::
           __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
           ::
           __emplace_unique_key_args<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::piecewise_construct_t_const&,std::__ndk1::tuple<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>&&>,std::__ndk1::tuple<>>
                     ((basic_string_conflict *)&local_258,&local_1d0,(tuple *)&DAT_007497e2,
                      (tuple *)&local_288);
  std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
  assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
         (lVar28 + 0x38),"gzip",4);
  if (((byte)local_1d0 & 1) != 0) {
    operator_delete((void *)CONCAT62(uStack_1be,CONCAT11(uStack_1bf,local_1c0)));
  }
  local_1c0 = (basic_filebuf<char,std::__ndk1::char_traits<char>>)0x8;
  uStack_1bf = 0xe5;
  uStack_1be = 0xc4;
  local_150 = &PTR__basic_istream_00c4e640;
  pStack_1c8 = (piecewise_construct_t)0x0;
  uStack_1c7 = 0;
  uStack_1c3 = 0;
  uStack_1c2 = 0;
  local_1d0 = (piecewise_construct_t)0x18;
  uStack_1cf = 0xc4e6;
                    /* try { // try from 0097db40 to 0097db4b has its CatchHandler @ 0097e07c */
  std::__ndk1::ios_base::init((ios_base *)&local_150,&ppuStack_1b8);
  local_c8 = 0;
  local_c0 = 0xffffffff;
  local_1d0 = (piecewise_construct_t)0xe0;
  uStack_1cf = 0xc4e4;
  local_150 = &PTR_FUN_00c4e530;
  ppuStack_1b8 = &PTR__basic_streambuf_00c4e728;
  local_1c0 = (basic_filebuf<char,std::__ndk1::char_traits<char>>)0x8;
  uStack_1bf = 0xe5;
  uStack_1be = 0xc4;
  std::__ndk1::locale::locale(alStack_1b0);
  uStack_180 = 0;
  local_188 = 0;
  uStack_190 = 0;
  local_198 = 0;
  uStack_1a0 = 0;
  local_1a8 = 0;
  ppuStack_1b8 = &PTR_LAB_00c4e678;
  uStack_160 = 0;
  local_168 = (void *)0x0;
  uStack_170 = 0;
  local_178 = 0;
  local_158 = 0x18;
                    /* try { // try from 0097dbbc to 0097dc53 has its CatchHandler @ 0097e1c0 */
  pbVar33 = (byte *)ix::ConnectionState::getRemoteIp(this);
  uVar45 = *(ulong *)(pbVar33 + 8);
  pbVar43 = *(byte **)(pbVar33 + 0x10);
  if ((*pbVar33 & 1) == 0) {
    pbVar43 = pbVar33 + 1;
    uVar45 = (ulong)(*pbVar33 >> 1);
  }
  pbVar34 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                      ((basic_ostream *)&local_1c0,(char *)pbVar43,uVar45);
  pbVar34 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                      (pbVar34,":",1);
  iVar27 = ix::ConnectionState::getRemotePort(this);
  pbVar34 = (basic_ostream *)
            std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::operator<<
                      ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar34,iVar27);
  pbVar34 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                      (pbVar34," ",1);
  uVar45 = (ulong)(byte)((byte)puVar3[3] >> 1);
  pbVar43 = (byte *)((long)puVar3 + 0x19);
  if (((byte)puVar3[3] & 1) != 0) {
    uVar45 = puVar3[4];
    pbVar43 = (byte *)puVar3[5];
  }
  pbVar34 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                      (pbVar34,(char *)pbVar43,uVar45);
  pbVar34 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                      (pbVar34," ",1);
  local_1e0 = &local_288;
  uStack_27c = 0;
  local_27a = 0;
  uStack_279 = 0;
  local_278 = (void *)0x0;
  local_27f = 0x746e;
  local_288 = 0x65735514;
  uStack_284 = 0x2d72;
  uStack_282 = 0x6741;
  uStack_280 = 0x65;
  local_27d = 0;
                    /* try { // try from 0097dc8c to 0097dd1f has its CatchHandler @ 0097e1a8 */
  lVar28 = std::__ndk1::
           __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
           ::
           __emplace_unique_key_args<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::piecewise_construct_t_const&,std::__ndk1::tuple<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>&&>,std::__ndk1::tuple<>>
                     ((basic_string_conflict *)(puVar3 + 0xc),(piecewise_construct_t *)&local_288,
                      (tuple *)&DAT_007497e2,(tuple *)&local_1e0);
  uVar45 = (ulong)(*(byte *)(lVar28 + 0x38) >> 1);
  pcVar40 = (char *)(lVar28 + 0x39);
  if ((*(byte *)(lVar28 + 0x38) & 1) != 0) {
    uVar45 = *(ulong *)(lVar28 + 0x40);
    pcVar40 = *(char **)(lVar28 + 0x48);
  }
  pbVar34 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                      (pbVar34,pcVar40,uVar45);
  pbVar34 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                      (pbVar34," ",1);
  uVar45 = puVar3[1];
  pbVar43 = (byte *)puVar3[2];
  if (((byte)*puVar3 & 1) == 0) {
    pbVar43 = (byte *)((long)puVar3 + 1);
    uVar45 = (ulong)(byte)((byte)*puVar3 >> 1);
  }
  pbVar34 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                      (pbVar34,(char *)pbVar43,uVar45);
  pbVar34 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                      (pbVar34," ",1);
  uVar45 = (ulong)((byte)local_220 >> 1);
  if (((byte)local_220 & 1) != 0) {
    uVar45 = CONCAT17(uStack_211,
                      CONCAT16(uStack_212,
                               CONCAT15(uStack_213,
                                        CONCAT14(uStack_214,
                                                 CONCAT13(uStack_215,
                                                          CONCAT12(uStack_216,
                                                                   CONCAT11(uStack_217,pStack_218)))
                                                ))));
  }
  std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::operator<<
            ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar34,uVar45);
  if ((local_288 & 1) != 0) {
    operator_delete(local_278);
  }
                    /* try { // try from 0097dd34 to 0097dd3f has its CatchHandler @ 0097e074 */
  std::__ndk1::basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
  str();
                    /* try { // try from 0097dd40 to 0097dd4b has its CatchHandler @ 0097e070 */
  ix::SocketServer::logInfo(this_01,(basic_string_conflict *)&local_288);
  if ((local_288 & 1) != 0) {
    operator_delete(local_278);
  }
  local_1e0 = &local_288;
  uStack_279 = 0;
  local_278 = (void *)0x0;
  local_288 = 0x6363411a;
  uStack_284 = 0x7065;
  uStack_282 = 0x2d74;
  uStack_280 = 0x52;
  local_27f = 0x6e61;
  local_27d = 0x67;
  uStack_27c = 0x7365;
  local_27a = 0;
                    /* try { // try from 0097dd90 to 0097ddbf has its CatchHandler @ 0097e14c */
  lVar28 = std::__ndk1::
           __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
           ::
           __emplace_unique_key_args<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::piecewise_construct_t_const&,std::__ndk1::tuple<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>&&>,std::__ndk1::tuple<>>
                     ((basic_string_conflict *)&local_258,(piecewise_construct_t *)&local_288,
                      (tuple *)&DAT_007497e2,(tuple *)&local_1e0);
  std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
  assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
         (lVar28 + 0x38),"none",4);
  if ((local_288 & 1) != 0) {
    operator_delete(local_278);
  }
  local_288 = 200;
  local_1e0 = (uint *)((ulong)local_1e0 & 0xffffffff00000000);
                    /* try { // try from 0097dddc to 0097ddfb has its CatchHandler @ 0097e06c */
  std::__ndk1::shared_ptr<ix::HttpResponse>::
  make_shared<int,char_const(&)[3],ix::HttpErrorCode,std::__ndk1::map<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,ix::CaseInsensitiveLess,std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>&,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>&>
            ((shared_ptr<ix::HttpResponse> *)&local_288,(int *)&DAT_002af2e0,(char *)&local_1e0,
             (HttpErrorCode *)&local_258,(map *)&local_220,param_6);
  local_1d0 = (piecewise_construct_t)0xe0;
  uStack_1cf = 0xc4e4;
  local_150 = &PTR_FUN_00c4e530;
  local_1c0 = (basic_filebuf<char,std::__ndk1::char_traits<char>>)0x8;
  uStack_1bf = 0xe5;
  uStack_1be = 0xc4;
  ppuStack_1b8 = &PTR_LAB_00c4e678;
  if ((local_178 & 1) != 0) {
    operator_delete(local_168);
  }
  ppuStack_1b8 = &PTR__basic_streambuf_00c4e728;
  std::__ndk1::locale::~locale(alStack_1b0);
  std::__ndk1::ios_base::~ios_base((ios_base *)&local_150);
  if (((ulong)local_200 & 1) != 0) {
    operator_delete(local_1f0);
  }
  if (((byte)local_220 & 1) != 0) {
    operator_delete(local_210);
  }
joined_r0x0097d7e8:
  if ((uVar36 & 1) != 0) {
    operator_delete(__src);
  }
  if ((local_270[0] & 1) != 0) {
    operator_delete(local_260);
  }
  std::__ndk1::
  __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
  ::destroy((__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
             *)&local_258,local_250);
  if ((local_240 & 1) != 0) {
    operator_delete(local_230);
  }
  if (p_Var4 != (__shared_weak_count *)0x0) {
    p_Var1 = p_Var4 + 8;
    do {
      lVar28 = *(long *)p_Var1;
      cVar5 = '\x01';
      bVar6 = (bool)ExclusiveMonitorPass(p_Var1,0x10);
      if (bVar6) {
        *(long *)p_Var1 = lVar28 + -1;
        cVar5 = ExclusiveMonitorsStatus();
      }
    } while (cVar5 != '\0');
    if (lVar28 == 0) {
      (**(code **)(*(long *)p_Var4 + 0x10))(p_Var4);
      std::__ndk1::__shared_weak_count::__release_weak(p_Var4);
    }
  }
  if (this_00 != (__shared_weak_count *)0x0) {
    p_Var4 = this_00 + 8;
    do {
      lVar28 = *(long *)p_Var4;
      cVar5 = '\x01';
      bVar6 = (bool)ExclusiveMonitorPass(p_Var4,0x10);
      if (bVar6) {
        *(long *)p_Var4 = lVar28 + -1;
        cVar5 = ExclusiveMonitorsStatus();
      }
    } while (cVar5 != '\0');
    if (lVar28 == 0) {
      (**(code **)(*(long *)this_00 + 0x10))(this_00);
      std::__ndk1::__shared_weak_count::__release_weak(this_00);
    }
  }
  if (*(long *)(lVar7 + 0x28) != lVar39) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

