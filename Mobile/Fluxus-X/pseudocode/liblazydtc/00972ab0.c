/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00972ab0
 */

/* WARNING: Type propagation algorithm not settling */
/* ix::HttpClient::request(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&,
   std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >
   const&, std::__ndk1::shared_ptr<ix::HttpRequestArgs>, int) */

void ix::HttpClient::request
               (undefined8 *param_1_00,long param_1,basic_string_conflict *param_2,byte *param_3,
               byte *param_5,long *param_6,int param_7)

{
  CaseInsensitiveLess *pCVar1;
  __shared_weak_count *p_Var2;
  long lVar3;
  size_t __n;
  size_t sVar4;
  char *pcVar5;
  byte *pbVar6;
  __shared_weak_count *p_Var7;
  byte bVar8;
  long lVar9;
  undefined **ppuVar10;
  undefined1 uVar11;
  undefined6 uVar12;
  undefined2 uVar13;
  undefined5 uVar14;
  basic_ostream bVar15;
  undefined1 uVar16;
  undefined1 uVar17;
  undefined1 uVar18;
  undefined1 uVar19;
  bool bVar20;
  char cVar21;
  int iVar22;
  ulong uVar23;
  ix *piVar24;
  long *plVar25;
  basic_ostream *pbVar26;
  basic_ostream<char,std::__ndk1::char_traits<char>> *this;
  ulong uVar27;
  undefined8 *puVar28;
  ulong uVar29;
  byte *pbVar30;
  atomic *paVar31;
  function *param2;
  basic_string_conflict *pbVar32;
  long lVar33;
  long lVar34;
  long *plVar35;
  code *pcVar36;
  long *plVar37;
  byte *pbVar38;
  uint *puVar39;
  undefined8 uVar40;
  int *piVar41;
  char *pcVar42;
  HttpResponse *pHVar43;
  void *pvVar44;
  uint uVar45;
  long *plVar46;
  __tree_node *p_Var47;
  void *pvVar48;
  char *pcVar49;
  __tree_node *p_Var50;
  undefined8 uVar51;
  undefined1 local_5d0;
  ulong local_5c8;
  void *pvStack_5c0;
  char *local_5b8;
  function *local_5b0;
  function *local_5a8;
  undefined8 local_5a0;
  void *pvStack_598;
  char *local_590;
  uint local_584;
  long local_580;
  __shared_weak_count *local_578;
  char local_570;
  undefined8 local_568;
  __tree_node *local_560 [2];
  ulong local_550;
  void *pvStack_548;
  char *local_540;
  uint local_530 [2];
  undefined8 local_528;
  void *pvStack_520;
  char *local_518;
  ulong local_510;
  ulong local_508;
  char *local_500;
  basic_string_conflict local_4f8 [8];
  ulong local_4f0;
  char *local_4e8;
  ulong local_4e0;
  undefined8 uStack_4d8;
  void *local_4d0;
  bool local_4c8 [4];
  uint local_4c4;
  ulong local_4c0;
  undefined8 uStack_4b8;
  void *local_4b0;
  ulong local_4a8;
  ulong local_4a0;
  char *local_498;
  ulong local_490;
  ulong local_488;
  char *local_480;
  ulong local_478;
  ulong local_470;
  char *local_468;
  ulong local_460;
  undefined8 local_458;
  void *local_450;
  ulong local_448;
  ulong local_440;
  void *local_438;
  __tree_node *local_430;
  __tree_node *local_428;
  undefined8 local_420;
  int local_414;
  undefined8 local_410;
  undefined8 uStack_408;
  undefined **local_400;
  undefined **ppuStack_3f8;
  locale alStack_3f0 [8];
  undefined8 local_3e8;
  undefined8 uStack_3e0;
  undefined8 local_3d8;
  undefined8 uStack_3d0;
  undefined8 local_3c8;
  undefined8 uStack_3c0;
  ulong local_3b8;
  undefined8 uStack_3b0;
  void *local_3a8;
  undefined8 uStack_3a0;
  undefined4 local_398;
  undefined **local_390 [17];
  undefined8 local_308;
  undefined4 local_300;
  undefined8 local_2f0;
  byte bStack_2e8;
  undefined1 uStack_2e7;
  undefined6 uStack_2e6;
  basic_ostream bStack_2e0;
  undefined2 uStack_2df;
  undefined5 uStack_2dd;
  undefined **ppuStack_2d8;
  long *local_2d0;
  undefined8 local_2c8;
  undefined8 uStack_2c0;
  undefined8 local_2b8;
  undefined8 uStack_2b0;
  undefined8 uStack_2a8;
  undefined8 uStack_2a0;
  ulong local_298;
  undefined8 uStack_290;
  void *local_288;
  undefined8 uStack_280;
  undefined4 local_278;
  undefined **local_270 [17];
  undefined8 local_1e8;
  undefined4 local_1e0;
  uint local_1d0;
  undefined1 uStack_1cc;
  undefined2 uStack_1cb;
  undefined1 uStack_1c9;
  undefined1 uStack_1c8;
  undefined1 uStack_1c7;
  undefined1 uStack_1c6;
  undefined1 uStack_1c5;
  undefined1 uStack_1c4;
  undefined1 uStack_1c3;
  undefined1 uStack_1c2;
  undefined1 uStack_1c1;
  basic_ostream bStack_1c0;
  undefined1 uStack_1bf;
  undefined1 uStack_1be;
  undefined2 uStack_1bd;
  undefined1 uStack_1bb;
  undefined1 uStack_1ba;
  undefined1 uStack_1b9;
  undefined **ppuStack_1b8;
  uint *local_1b0;
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
  undefined **local_150 [17];
  undefined8 local_c8;
  undefined4 local_c0;
  uint local_b0 [8];
  uint *local_90;
  
  lVar9 = tpidr_el0;
  lVar33 = *(long *)(lVar9 + 0x28);
  std::__ndk1::recursive_mutex::lock((recursive_mutex *)(param_1 + 0xa8));
  local_414 = 0;
  local_420 = 0;
  local_428 = (__tree_node *)0x0;
  local_440 = 0;
  local_448 = 0;
  local_438 = (void *)0x0;
  local_458 = 0;
  local_460 = 0;
  local_450 = (void *)0x0;
  local_470 = 0;
  local_478 = 0;
  local_468 = (char *)0x0;
  local_488 = 0;
  local_498 = (char *)0x0;
  local_490 = 0;
  local_480 = (char *)0x0;
  local_4a8 = 0;
  local_4a0 = 0;
  local_4c0 = 0;
  uStack_4b8 = 0;
  local_4b0 = (void *)0x0;
                    /* try { // try from 00972b58 to 00972b77 has its CatchHandler @ 009766dc */
  pbVar32 = (basic_string_conflict *)&local_4c0;
  local_430 = (__tree_node *)&local_428;
  uVar23 = UrlParser::parse(param_2,(basic_string_conflict *)&local_478,
                            (basic_string_conflict *)&local_490,(basic_string_conflict *)&local_4a8,
                            pbVar32,(int *)&local_4c4,local_4c8);
  if ((uVar23 & 1) == 0) {
    local_400 = &PTR_FUN_00c4e508;
    local_390[0] = &PTR__basic_istream_00c4e640;
    uStack_408 = 0;
    local_410 = &PTR__basic_istream_00c4e618;
                    /* try { // try from 00973314 to 0097331f has its CatchHandler @ 009765fc */
    std::__ndk1::ios_base::init((ios_base *)local_390,&ppuStack_3f8);
    local_308 = 0;
    local_300 = 0xffffffff;
    local_410 = &PTR_LAB_00c4e4e0;
    local_390[0] = &PTR_FUN_00c4e530;
    ppuStack_3f8 = &PTR__basic_streambuf_00c4e728;
    local_400 = &PTR_FUN_00c4e508;
    std::__ndk1::locale::locale(alStack_3f0);
    uStack_3c0 = 0;
    local_3c8 = 0;
    uStack_3d0 = 0;
    local_3d8 = 0;
    uStack_3e0 = 0;
    local_3e8 = 0;
    ppuStack_3f8 = &PTR_LAB_00c4e678;
    uStack_3a0 = 0;
    local_3a8 = (void *)0x0;
    uStack_3b0 = 0;
    local_3b8 = 0;
    local_398 = 0x18;
                    /* try { // try from 00973394 to 009733c3 has its CatchHandler @ 00976628 */
    pbVar26 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                        ((basic_ostream *)&local_400,"Cannot parse url: ",0x12);
    uVar23 = *(ulong *)(param_2 + 8);
    pbVar32 = *(basic_string_conflict **)(param_2 + 0x10);
    if (((byte)*param_2 & 1) == 0) {
      pbVar32 = param_2 + 1;
      uVar23 = (ulong)((byte)*param_2 >> 1);
    }
    std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
              (pbVar26,(char *)pbVar32,uVar23);
    local_2f0._0_4_ = 4;
                    /* try { // try from 009733cc to 009733d7 has its CatchHandler @ 009765f8 */
    std::__ndk1::basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    str();
                    /* try { // try from 009733d8 to 009733df has its CatchHandler @ 009765dc */
    puVar28 = operator_new(0x98);
    puVar28[2] = 0;
    *puVar28 = &PTR____shared_ptr_emplace_00c51878;
    puVar28[1] = 0;
                    /* try { // try from 00973400 to 00973423 has its CatchHandler @ 009765b8 */
    HttpResponse::HttpResponse
              ((HttpResponse *)(puVar28 + 3),local_414,(basic_string_conflict *)&local_460,
               (HttpErrorCode *)&local_2f0,(map *)&local_430,(basic_string_conflict *)&local_448,
               (basic_string_conflict *)&local_1d0,0,0);
    *param_1_00 = (HttpResponse *)(puVar28 + 3);
    param_1_00[1] = puVar28;
    if ((local_1d0 & 1) != 0) {
      operator_delete((void *)CONCAT17(uStack_1b9,
                                       CONCAT16(uStack_1ba,
                                                CONCAT15(uStack_1bb,
                                                         CONCAT23(uStack_1bd,
                                                                  CONCAT12(uStack_1be,
                                                                           CONCAT11(uStack_1bf,
                                                                                    bStack_1c0))))))
                     );
    }
    local_410 = &PTR_LAB_00c4e4e0;
    local_390[0] = &PTR_FUN_00c4e530;
    local_400 = &PTR_FUN_00c4e508;
    ppuStack_3f8 = &PTR_LAB_00c4e678;
    if ((local_3b8 & 1) != 0) {
      operator_delete(local_3a8);
    }
    ppuStack_3f8 = &PTR__basic_streambuf_00c4e728;
    std::__ndk1::locale::~locale(alStack_3f0);
    std::__ndk1::ios_base::~ios_base((ios_base *)local_390);
    goto joined_r0x00973494;
  }
  piVar24 = (ix *)0x0;
  uVar23 = local_478 >> 1 & 0x7f;
  if ((local_478 & 1) != 0) {
    uVar23 = local_470;
  }
  if (uVar23 == 5) {
    pcVar42 = (char *)((ulong)&local_478 | 1);
    if ((local_478 & 1) != 0) {
      pcVar42 = local_468;
    }
    iVar22 = memcmp(pcVar42,"https",5);
    piVar24 = (ix *)(ulong)(iVar22 == 0);
  }
  local_4e0 = 0;
  uStack_4d8 = 0;
  local_4d0 = (void *)0x0;
                    /* try { // try from 00972bdc to 00972beb has its CatchHandler @ 0097660c */
  createSocket(piVar24,true,(int)&local_4e0,(basic_string_conflict *)(param_1 + 0xd0),
               (SocketTLSOptions *)pbVar32);
  lVar34 = (long)local_410;
  local_410 = (undefined **)0x0;
  piVar24 = (ix *)(param_1 + 0xa0);
  plVar25 = *(long **)piVar24;
  *(long *)piVar24 = lVar34;
  if (plVar25 == (long *)0x0) {
    local_410._4_4_ = 0;
    if (lVar34 != 0) goto LAB_00972c30;
LAB_00973514:
    local_410 = (undefined **)CONCAT44(local_410._4_4_,5);
                    /* try { // try from 0097351c to 00973523 has its CatchHandler @ 00976514 */
    puVar28 = operator_new(0x98);
    puVar28[2] = 0;
    *puVar28 = &PTR____shared_ptr_emplace_00c51878;
    puVar28[1] = 0;
                    /* try { // try from 00973544 to 0097356b has its CatchHandler @ 009764f4 */
    HttpResponse::HttpResponse
              ((HttpResponse *)(puVar28 + 3),local_414,(basic_string_conflict *)&local_460,
               (HttpErrorCode *)&local_410,(map *)&local_430,(basic_string_conflict *)&local_448,
               (basic_string_conflict *)&local_4e0,0,0);
    *param_1_00 = (HttpResponse *)(puVar28 + 3);
    param_1_00[1] = puVar28;
  }
  else {
    (**(code **)(*plVar25 + 8))();
    plVar25 = (long *)local_410;
    local_410 = (undefined **)0x0;
    if (plVar25 != (long *)0x0) {
      (**(code **)(*plVar25 + 8))();
    }
    if (*(long *)piVar24 == 0) goto LAB_00973514;
LAB_00972c30:
    local_400 = &PTR_FUN_00c4e508;
    local_390[0] = &PTR__basic_istream_00c4e640;
    uStack_408 = 0;
    local_410 = &PTR__basic_istream_00c4e618;
                    /* try { // try from 00972c78 to 00972c83 has its CatchHandler @ 009765a8 */
    std::__ndk1::ios_base::init
              ((ios_base *)local_390,
               (basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
               &ppuStack_3f8);
    local_308 = 0;
    local_300 = 0xffffffff;
    local_410 = &PTR_LAB_00c4e4e0;
    local_390[0] = &PTR_FUN_00c4e530;
    ppuStack_3f8 = &PTR__basic_streambuf_00c4e728;
    local_400 = &PTR_FUN_00c4e508;
    std::__ndk1::locale::locale(alStack_3f0);
    uStack_3c0 = 0;
    local_3c8 = 0;
    uStack_3d0 = 0;
    local_3d8 = 0;
    uStack_3e0 = 0;
    local_3e8 = 0;
    ppuStack_3f8 = &PTR_LAB_00c4e678;
    uStack_3a0 = 0;
    local_3a8 = (void *)0x0;
    uStack_3b0 = 0;
    local_3b8 = 0;
    local_398 = 0x18;
    uVar23 = *(ulong *)(param_3 + 8);
    pbVar6 = *(byte **)(param_3 + 0x10);
    if ((*param_3 & 1) == 0) {
      pbVar6 = param_3 + 1;
      uVar23 = (ulong)(*param_3 >> 1);
    }
                    /* try { // try from 00972d10 to 00972e0b has its CatchHandler @ 009767a4 */
    pbVar26 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                        ((basic_ostream *)&local_400,(char *)pbVar6,uVar23);
    pbVar26 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                        (pbVar26," ",1);
    uVar23 = local_4a8 >> 1 & 0x7f;
    pcVar42 = (char *)((ulong)&local_4a8 | 1);
    if ((local_4a8 & 1) != 0) {
      uVar23 = local_4a0;
      pcVar42 = local_498;
    }
    pbVar26 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                        (pbVar26,pcVar42,uVar23);
    std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
              (pbVar26," HTTP/1.1\r\n",0xb);
    pbVar26 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                        ((basic_ostream *)&local_400,"Host: ",6);
    pcVar42 = (char *)((ulong)&local_490 | 1);
    uVar23 = local_490 >> 1 & 0x7f;
    pcVar49 = pcVar42;
    if ((local_490 & 1) != 0) {
      uVar23 = local_488;
      pcVar49 = local_480;
    }
    std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
              (pbVar26,pcVar49,uVar23);
    if (local_4c8[0] == false) {
      pbVar26 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                          ((basic_ostream *)&local_400,":",1);
      std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::operator<<
                ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar26,local_4c4);
    }
    std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
              ((basic_ostream *)&local_400,"\r\n",2);
    lVar34 = *param_6;
    if ((*(char *)(lVar34 + 0x89) != '\0') && (*(long *)(lVar34 + 0x110) == 0)) {
      pbVar26 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                          ((basic_ostream *)&local_400,"Accept-Encoding: gzip",0x15);
      std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>(pbVar26,"\r\n",2);
      lVar34 = *param_6;
    }
    plVar46 = *(long **)(lVar34 + 0x30);
    plVar25 = (long *)(lVar34 + 0x38);
    if (plVar46 != plVar25) {
      do {
        while( true ) {
          uVar23 = (ulong)(*(byte *)(plVar46 + 4) >> 1);
          pcVar49 = (char *)((long)plVar46 + 0x21);
          if ((*(byte *)(plVar46 + 4) & 1) != 0) {
            uVar23 = plVar46[5];
            pcVar49 = (char *)plVar46[6];
          }
                    /* try { // try from 00972e50 to 00972e8f has its CatchHandler @ 00976a50 */
          pbVar26 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                              ((basic_ostream *)&local_400,pcVar49,uVar23);
          pbVar26 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                              (pbVar26,": ",2);
          uVar23 = (ulong)(*(byte *)(plVar46 + 7) >> 1);
          pcVar49 = (char *)((long)plVar46 + 0x39);
          if ((*(byte *)(plVar46 + 7) & 1) != 0) {
            uVar23 = plVar46[8];
            pcVar49 = (char *)plVar46[9];
          }
          pbVar26 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                              (pbVar26,pcVar49,uVar23);
          std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                    (pbVar26,"\r\n",2);
          plVar35 = (long *)plVar46[1];
          if ((long *)plVar46[1] == (long *)0x0) break;
          do {
            plVar46 = plVar35;
            plVar35 = (long *)*plVar46;
          } while ((long *)*plVar46 != (long *)0x0);
LAB_00972ed4:
          if (plVar46 == plVar25) goto LAB_00972eec;
        }
        plVar35 = plVar46 + 2;
        plVar37 = (long *)*plVar35;
        if ((long *)*plVar37 != plVar46) {
          do {
            lVar34 = *plVar35;
            plVar35 = (long *)(lVar34 + 0x10);
            plVar46 = (long *)*plVar35;
          } while (*plVar46 != lVar34);
          goto LAB_00972ed4;
        }
        plVar46 = plVar37;
      } while (plVar37 != plVar25);
LAB_00972eec:
      lVar34 = *param_6;
      plVar25 = (long *)(lVar34 + 0x38);
    }
    bStack_1c0 = (basic_ostream)0x0;
    uStack_1bf = 0;
    uStack_1be = 0;
    uStack_1bd = 0;
    uStack_1bb = 0;
    uStack_1ba = 0;
    uStack_1b9 = 0;
    uStack_1c8 = 0;
    uStack_1c7 = 0;
    uStack_1c6 = 0;
    uStack_1c5 = 0;
    uStack_1c4 = 0;
    uStack_1c3 = 0;
    uStack_1c2 = 0;
    uStack_1c1 = 0;
    uStack_1cb = 0x7470;
    local_1d0 = 0x6363410c;
    uStack_1cc = 0x65;
    uStack_1c9 = 0;
    plVar46 = (long *)*plVar25;
    if (plVar46 == (long *)0x0) {
LAB_00972f80:
      plVar35 = plVar25;
    }
    else {
      plVar35 = plVar25;
      do {
                    /* try { // try from 00972f40 to 00972f4b has its CatchHandler @ 00976a1c */
        uVar23 = CaseInsensitiveLess::operator()
                           ((CaseInsensitiveLess *)(lVar34 + 0x40),
                            (basic_string_conflict *)(plVar46 + 4),
                            (basic_string_conflict *)&local_1d0);
        lVar3 = 8;
        if ((uVar23 & 1) == 0) {
          lVar3 = 0;
          plVar35 = plVar46;
        }
        plVar46 = *(long **)((long)plVar46 + lVar3);
      } while (plVar46 != (long *)0x0);
      if (plVar35 == plVar25) goto LAB_00972f80;
                    /* try { // try from 00972f70 to 00972f7b has its CatchHandler @ 00976404 */
      uVar23 = CaseInsensitiveLess::operator()
                         ((CaseInsensitiveLess *)(lVar34 + 0x40),(basic_string_conflict *)&local_1d0
                          ,(basic_string_conflict *)(plVar35 + 4));
      if ((uVar23 & 1) != 0) goto LAB_00972f80;
    }
    lVar34 = *param_6;
    if ((local_1d0 & 1) != 0) {
      operator_delete((void *)CONCAT17(uStack_1b9,
                                       CONCAT16(uStack_1ba,
                                                CONCAT15(uStack_1bb,
                                                         CONCAT23(uStack_1bd,
                                                                  CONCAT12(uStack_1be,
                                                                           CONCAT11(uStack_1bf,
                                                                                    bStack_1c0))))))
                     );
    }
    if (plVar35 == (long *)(lVar34 + 0x38)) {
                    /* try { // try from 00972fa8 to 00972fcb has its CatchHandler @ 009767a4 */
      pbVar26 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                          ((basic_ostream *)&local_400,"Accept: */*",0xb);
      std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>(pbVar26,"\r\n",2);
    }
    uStack_1c4 = 0;
    uStack_1c3 = 0;
    uStack_1c2 = 0;
    uStack_1c1 = 0;
    bStack_1c0 = (basic_ostream)0x0;
    uStack_1bf = 0;
    uStack_1be = 0;
    uStack_1bd = 0;
    uStack_1bb = 0;
    uStack_1ba = 0;
    uStack_1b9 = 0;
    uStack_1c7 = 0x6e;
    uStack_1c6 = 0x74;
    local_1d0 = 0x65735514;
    uStack_1cc = 0x72;
    uStack_1cb = 0x412d;
    uStack_1c9 = 0x67;
    uStack_1c8 = 0x65;
    uStack_1c5 = 0;
    plVar25 = (long *)(*param_6 + 0x38);
    plVar46 = (long *)*plVar25;
    if (plVar46 == (long *)0x0) {
LAB_00973060:
      plVar35 = plVar25;
    }
    else {
      pCVar1 = (CaseInsensitiveLess *)(*param_6 + 0x40);
      plVar35 = plVar25;
      do {
                    /* try { // try from 00973020 to 0097302b has its CatchHandler @ 00976a18 */
        uVar23 = CaseInsensitiveLess::operator()
                           (pCVar1,(basic_string_conflict *)(plVar46 + 4),
                            (basic_string_conflict *)&local_1d0);
        lVar34 = 8;
        if ((uVar23 & 1) == 0) {
          lVar34 = 0;
          plVar35 = plVar46;
        }
        plVar46 = *(long **)((long)plVar46 + lVar34);
      } while (plVar46 != (long *)0x0);
      if (plVar35 == plVar25) goto LAB_00973060;
                    /* try { // try from 00973050 to 0097305b has its CatchHandler @ 009763d8 */
      uVar23 = CaseInsensitiveLess::operator()
                         (pCVar1,(basic_string_conflict *)&local_1d0,
                          (basic_string_conflict *)(plVar35 + 4));
      if ((uVar23 & 1) != 0) goto LAB_00973060;
    }
    lVar34 = *param_6;
    if ((local_1d0 & 1) != 0) {
      operator_delete((void *)CONCAT17(uStack_1b9,
                                       CONCAT16(uStack_1ba,
                                                CONCAT15(uStack_1bb,
                                                         CONCAT23(uStack_1bd,
                                                                  CONCAT12(uStack_1be,
                                                                           CONCAT11(uStack_1bf,
                                                                                    bStack_1c0))))))
                     );
    }
    if (plVar35 == (long *)(lVar34 + 0x38)) {
                    /* try { // try from 00973088 to 0097309b has its CatchHandler @ 009767a4 */
      pbVar26 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                          ((basic_ostream *)&local_400,"User-Agent: ",0xc);
                    /* try { // try from 009730a0 to 009730ab has its CatchHandler @ 009763fc */
      userAgent();
      uVar23 = (ulong)((byte)local_1d0._0_1_ >> 1);
      pcVar49 = (char *)((ulong)&local_1d0 | 1);
      if ((local_1d0 & 1) != 0) {
        uVar23 = CONCAT17(uStack_1c1,
                          CONCAT16(uStack_1c2,
                                   CONCAT15(uStack_1c3,
                                            CONCAT14(uStack_1c4,
                                                     CONCAT13(uStack_1c5,
                                                              CONCAT12(uStack_1c6,
                                                                       CONCAT11(uStack_1c7,
                                                                                uStack_1c8)))))));
        pcVar49 = (char *)CONCAT17(uStack_1b9,
                                   CONCAT16(uStack_1ba,
                                            CONCAT15(uStack_1bb,
                                                     CONCAT23(uStack_1bd,
                                                              CONCAT12(uStack_1be,
                                                                       CONCAT11(uStack_1bf,
                                                                                bStack_1c0))))));
      }
                    /* try { // try from 009730cc to 009730e3 has its CatchHandler @ 00976468 */
      pbVar26 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                          (pbVar26,pcVar49,uVar23);
      std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>(pbVar26,"\r\n",2);
      if ((local_1d0 & 1) != 0) {
        operator_delete((void *)CONCAT17(uStack_1b9,
                                         CONCAT16(uStack_1ba,
                                                  CONCAT15(uStack_1bb,
                                                           CONCAT23(uStack_1bd,
                                                                    CONCAT12(uStack_1be,
                                                                             CONCAT11(uStack_1bf,
                                                                                      bStack_1c0))))
                                                 )));
      }
    }
    bStack_1c0 = (basic_ostream)0x0;
    uStack_1bf = 0;
    uStack_1be = 0;
    uStack_1bd = 0;
    uStack_1bb = 0;
    uStack_1ba = 0;
    uStack_1b9 = 0;
    uStack_1c8 = 0;
    uStack_1c7 = 0;
    uStack_1c6 = 0;
    uStack_1c5 = 0;
    uStack_1c4 = 0;
    uStack_1c3 = 0;
    uStack_1c2 = 0;
    uStack_1c1 = 0;
    uStack_1cb = 0x6e69;
    local_1d0 = 0x69724f0c;
    uStack_1cc = 0x67;
    uStack_1c9 = 0;
    plVar25 = (long *)(*param_6 + 0x38);
    plVar46 = (long *)*plVar25;
    if (plVar46 == (long *)0x0) {
LAB_00973184:
      plVar35 = plVar25;
    }
    else {
      pCVar1 = (CaseInsensitiveLess *)(*param_6 + 0x40);
      plVar35 = plVar25;
      do {
                    /* try { // try from 00973144 to 0097314f has its CatchHandler @ 00976a14 */
        uVar23 = CaseInsensitiveLess::operator()
                           (pCVar1,(basic_string_conflict *)(plVar46 + 4),
                            (basic_string_conflict *)&local_1d0);
        lVar34 = 8;
        if ((uVar23 & 1) == 0) {
          lVar34 = 0;
          plVar35 = plVar46;
        }
        plVar46 = *(long **)((long)plVar46 + lVar34);
      } while (plVar46 != (long *)0x0);
      if (plVar35 == plVar25) goto LAB_00973184;
                    /* try { // try from 00973174 to 0097317f has its CatchHandler @ 00976360 */
      uVar23 = CaseInsensitiveLess::operator()
                         (pCVar1,(basic_string_conflict *)&local_1d0,
                          (basic_string_conflict *)(plVar35 + 4));
      if ((uVar23 & 1) != 0) goto LAB_00973184;
    }
    lVar34 = *param_6;
    if ((local_1d0 & 1) != 0) {
      operator_delete((void *)CONCAT17(uStack_1b9,
                                       CONCAT16(uStack_1ba,
                                                CONCAT15(uStack_1bb,
                                                         CONCAT23(uStack_1bd,
                                                                  CONCAT12(uStack_1be,
                                                                           CONCAT11(uStack_1bf,
                                                                                    bStack_1c0))))))
                     );
    }
    if (plVar35 == (long *)(lVar34 + 0x38)) {
                    /* try { // try from 009731ac to 00973243 has its CatchHandler @ 009767a4 */
      pbVar26 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                          ((basic_ostream *)&local_400,"Origin: ",8);
      uVar23 = local_478 >> 1 & 0x7f;
      pcVar49 = (char *)((ulong)&local_478 | 1);
      if ((local_478 & 1) != 0) {
        uVar23 = local_470;
        pcVar49 = local_468;
      }
      pbVar26 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                          (pbVar26,pcVar49,uVar23);
      pbVar26 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                          (pbVar26,"://",3);
      pcVar49 = pcVar42;
      uVar23 = local_490 >> 1 & 0x7f;
      if ((local_490 & 1) != 0) {
        pcVar49 = local_480;
        uVar23 = local_488;
      }
      pbVar26 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                          (pbVar26,pcVar49,uVar23);
      pbVar26 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                          (pbVar26,":",1);
      pbVar26 = (basic_ostream *)
                std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::operator<<
                          ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar26,local_4c4);
      std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>(pbVar26,"\r\n",2);
    }
    bVar8 = *param_3;
    pbVar6 = param_3 + 1;
    uVar23 = (ulong)(bVar8 >> 1);
    __n = uVar23;
    if ((bVar8 & 1) != 0) {
      __n = *(size_t *)(param_3 + 8);
    }
    sVar4 = (ulong)(kPost >> 1);
    if ((kPost & 1) != 0) {
      sVar4 = DAT_00d20270;
    }
    if (__n == sVar4) {
      pbVar38 = pbVar6;
      if ((bVar8 & 1) != 0) {
        pbVar38 = *(byte **)(param_3 + 0x10);
      }
      pbVar30 = DAT_00d20278;
      if ((kPost & 1) == 0) {
        pbVar30 = &DAT_00d20269;
      }
      if ((bVar8 & 1) == 0) {
        if (__n != 0) {
          lVar34 = -uVar23;
          pbVar38 = pbVar6;
          do {
            if (*pbVar38 != *pbVar30) goto LAB_009735f0;
            pbVar38 = pbVar38 + 1;
            lVar34 = lVar34 + 1;
            pbVar30 = pbVar30 + 1;
          } while (lVar34 != 0);
        }
      }
      else if ((__n != 0) && (iVar22 = memcmp(pbVar38,pbVar30,__n), iVar22 != 0)) goto LAB_009735f0;
LAB_009736fc:
      if (*(char *)(*param_6 + 0x8a) != '\0') {
                    /* try { // try from 0097370c to 0097376f has its CatchHandler @ 009767a4 */
        pbVar26 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                            ((basic_ostream *)&local_400,"Content-Encoding: gzip",0x16);
        std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>(pbVar26,"\r\n",2)
        ;
      }
      pbVar26 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                          ((basic_ostream *)&local_400,"Content-Length: ",0x10);
      uVar23 = (ulong)(*param_5 >> 1);
      if ((*param_5 & 1) != 0) {
        uVar23 = *(ulong *)(param_5 + 8);
      }
      pbVar26 = (basic_ostream *)
                std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::operator<<
                          ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar26,uVar23);
      std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>(pbVar26,"\r\n",2);
      uStack_1c2 = 0;
      uStack_1c1 = 0;
      bStack_1c0 = (basic_ostream)0x0;
      uStack_1bf = 0;
      uStack_1be = 0;
      uStack_1bd = 0;
      uStack_1bb = 0;
      uStack_1ba = 0;
      uStack_1b9 = 0;
      uStack_1c7 = 0x54;
      uStack_1c6 = 0x79;
      uStack_1c5 = 0x70;
      uStack_1c4 = 0x65;
      local_1d0 = 0x6e6f4318;
      uStack_1cc = 0x74;
      uStack_1cb = 0x6e65;
      uStack_1c9 = 0x74;
      uStack_1c8 = 0x2d;
      uStack_1c3 = 0;
      plVar25 = (long *)(*param_6 + 0x38);
      plVar46 = (long *)*plVar25;
      if (plVar46 == (long *)0x0) {
LAB_00973808:
        plVar35 = plVar25;
      }
      else {
        pCVar1 = (CaseInsensitiveLess *)(*param_6 + 0x40);
        plVar35 = plVar25;
        do {
                    /* try { // try from 009737c8 to 009737d3 has its CatchHandler @ 00976a10 */
          uVar23 = CaseInsensitiveLess::operator()
                             (pCVar1,(basic_string_conflict *)(plVar46 + 4),
                              (basic_string_conflict *)&local_1d0);
          lVar34 = 8;
          if ((uVar23 & 1) == 0) {
            lVar34 = 0;
            plVar35 = plVar46;
          }
          plVar46 = *(long **)((long)plVar46 + lVar34);
        } while (plVar46 != (long *)0x0);
        if (plVar35 == plVar25) goto LAB_00973808;
                    /* try { // try from 009737f8 to 00973803 has its CatchHandler @ 0097630c */
        uVar23 = CaseInsensitiveLess::operator()
                           (pCVar1,(basic_string_conflict *)&local_1d0,
                            (basic_string_conflict *)(plVar35 + 4));
        if ((uVar23 & 1) != 0) goto LAB_00973808;
      }
      lVar34 = *param_6;
      if ((local_1d0 & 1) != 0) {
        operator_delete((void *)CONCAT17(uStack_1b9,
                                         CONCAT16(uStack_1ba,
                                                  CONCAT15(uStack_1bb,
                                                           CONCAT23(uStack_1bd,
                                                                    CONCAT12(uStack_1be,
                                                                             CONCAT11(uStack_1bf,
                                                                                      bStack_1c0))))
                                                 )));
      }
      if (plVar35 == (long *)(lVar34 + 0x38)) {
        bVar8 = *(byte *)(*param_6 + 0x60);
        if ((bVar8 & 1) == 0) {
          if (bVar8 >> 1 != 0) goto LAB_00973890;
        }
        else if (*(long *)(*param_6 + 0x68) != 0) {
LAB_00973890:
          pbVar26 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                              ((basic_ostream *)&local_400,
                               "Content-Type: multipart/form-data; boundary=",0x2c);
          lVar34 = *param_6;
          uVar23 = (ulong)(*(byte *)(lVar34 + 0x60) >> 1);
          pcVar49 = (char *)(lVar34 + 0x61);
          if ((*(byte *)(lVar34 + 0x60) & 1) != 0) {
            uVar23 = *(ulong *)(lVar34 + 0x68);
            pcVar49 = *(char **)(lVar34 + 0x70);
          }
          pbVar26 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                              (pbVar26,pcVar49,uVar23);
          std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                    (pbVar26,"\r\n",2);
          goto LAB_009738d8;
        }
                    /* try { // try from 00973844 to 0097390f has its CatchHandler @ 009767a4 */
        pbVar26 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                            ((basic_ostream *)&local_400,
                             "Content-Type: application/x-www-form-urlencoded",0x2f);
        std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>(pbVar26,"\r\n",2)
        ;
      }
LAB_009738d8:
      std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                ((basic_ostream *)&local_400,"\r\n",2);
      paVar31 = *(atomic **)(param_5 + 8);
      pbVar38 = *(byte **)(param_5 + 0x10);
      if ((*param_5 & 1) == 0) {
        pbVar38 = param_5 + 1;
        paVar31 = (atomic *)(ulong)(*param_5 >> 1);
      }
      std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                ((basic_ostream *)&local_400,(char *)pbVar38,(ulong)paVar31);
    }
    else {
LAB_009735f0:
      sVar4 = (ulong)(kPut >> 1);
      if ((kPut & 1) != 0) {
        sVar4 = DAT_00d202d0;
      }
      if (__n == sVar4) {
        pbVar38 = pbVar6;
        if ((bVar8 & 1) != 0) {
          pbVar38 = *(byte **)(param_3 + 0x10);
        }
        pbVar30 = DAT_00d202d8;
        if ((kPut & 1) == 0) {
          pbVar30 = &DAT_00d202c9;
        }
        if ((bVar8 & 1) == 0) {
          if (__n != 0) {
            lVar34 = -uVar23;
            pbVar38 = pbVar6;
            do {
              if (*pbVar38 != *pbVar30) goto LAB_00973674;
              pbVar38 = pbVar38 + 1;
              lVar34 = lVar34 + 1;
              pbVar30 = pbVar30 + 1;
            } while (lVar34 != 0);
          }
        }
        else if ((__n != 0) && (iVar22 = memcmp(pbVar38,pbVar30,__n), iVar22 != 0))
        goto LAB_00973674;
        goto LAB_009736fc;
      }
LAB_00973674:
      sVar4 = (ulong)(kPatch >> 1);
      if ((kPatch & 1) != 0) {
        sVar4 = DAT_00d202e8;
      }
      if (__n == sVar4) {
        pbVar38 = pbVar6;
        if ((bVar8 & 1) != 0) {
          pbVar38 = *(byte **)(param_3 + 0x10);
        }
        pbVar30 = DAT_00d202f0;
        if ((kPatch & 1) == 0) {
          pbVar30 = &DAT_00d202e1;
        }
        if ((bVar8 & 1) == 0) {
          if (__n != 0) {
            lVar34 = -uVar23;
            pbVar38 = pbVar6;
            do {
              if (*pbVar38 != *pbVar30) goto LAB_009736f4;
              pbVar38 = pbVar38 + 1;
              lVar34 = lVar34 + 1;
              pbVar30 = pbVar30 + 1;
            } while (lVar34 != 0);
          }
        }
        else if ((__n != 0) && (iVar22 = memcmp(pbVar38,pbVar30,__n), iVar22 != 0))
        goto LAB_009736f4;
        goto LAB_009736fc;
      }
LAB_009736f4:
      if (*(char *)(param_1 + 0x158) != '\0') goto LAB_009736fc;
      paVar31 = (atomic *)0x2;
      std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                ((basic_ostream *)&local_400,"\r\n",2);
    }
                    /* try { // try from 00973910 to 0097391b has its CatchHandler @ 00976464 */
    std::__ndk1::basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    str();
    local_510 = 0;
    local_508 = 0;
    local_500 = (char *)0x0;
                    /* try { // try from 00973930 to 00973943 has its CatchHandler @ 00976440 */
    makeCancellationRequestWithTimeout
              ((ix *)(ulong)*(uint *)(*param_6 + 0x78),(int)*param_6 + 0x120,paVar31);
    local_1d0 = 0xc518d0;
    uStack_1cc = 0;
    uStack_1cb = 0;
    uStack_1c9 = 0;
    uStack_1c8 = SUB81(local_b0,0);
    uStack_1c7 = (undefined1)((ulong)local_b0 >> 8);
    uStack_1c6 = (undefined1)((ulong)local_b0 >> 0x10);
    uStack_1c5 = (undefined1)((ulong)local_b0 >> 0x18);
    uStack_1c4 = (undefined1)((ulong)local_b0 >> 0x20);
    uStack_1c3 = (undefined1)((ulong)local_b0 >> 0x28);
    uStack_1c2 = (undefined1)((ulong)local_b0 >> 0x30);
    uStack_1c1 = (undefined1)((ulong)local_b0 >> 0x38);
    bStack_1c0 = SUB81(param_1,0);
    bVar15 = bStack_1c0;
    uStack_1bf = (undefined1)((ulong)param_1 >> 8);
    uVar11 = uStack_1bf;
    uStack_1be = (undefined1)((ulong)param_1 >> 0x10);
    uVar16 = uStack_1be;
    uStack_1bd = (undefined2)((ulong)param_1 >> 0x18);
    uVar13 = uStack_1bd;
    uStack_1bb = (undefined1)((ulong)param_1 >> 0x28);
    uVar17 = uStack_1bb;
    uStack_1ba = (undefined1)((ulong)param_1 >> 0x30);
    uVar18 = uStack_1ba;
    uStack_1b9 = (undefined1)((ulong)param_1 >> 0x38);
    uVar19 = uStack_1b9;
    paVar31 = (atomic *)(ulong)local_4c4;
                    /* try { // try from 00973974 to 00973983 has its CatchHandler @ 00976408 */
    local_1b0 = &local_1d0;
    uVar23 = (**(code **)(**(long **)(param_1 + 0xa0) + 0x18))
                       (*(long **)(param_1 + 0xa0),&local_490,paVar31,&local_510,&local_1d0);
    if (&local_1d0 == local_1b0) {
      pcVar36 = *(code **)(*(long *)local_1b0 + 0x20);
LAB_009739ac:
      (*pcVar36)();
    }
    else if (local_1b0 != (uint *)0x0) {
      pcVar36 = *(code **)(*(long *)local_1b0 + 0x28);
      goto LAB_009739ac;
    }
    if ((uVar23 & 1) == 0) {
      local_530[0] = 0xf;
      if ((*(byte *)(*param_6 + 0x120) & 1) == 0) {
        local_530[0] = 1;
      }
      bStack_1c0 = (basic_ostream)0x8;
      uStack_1bf = 0xe5;
      uStack_1be = 0xc4;
      uStack_1bd = 0;
      uStack_1bb = 0;
      uStack_1ba = 0;
      uStack_1b9 = 0;
      local_150[0] = &PTR__basic_istream_00c4e640;
      uStack_1c8 = 0;
      uStack_1c7 = 0;
      uStack_1c6 = 0;
      uStack_1c5 = 0;
      uStack_1c4 = 0;
      uStack_1c3 = 0;
      uStack_1c2 = 0;
      uStack_1c1 = 0;
      local_1d0 = 0xc4e618;
      uStack_1cc = 0;
      uStack_1cb = 0;
      uStack_1c9 = 0;
                    /* try { // try from 00973a4c to 00973a57 has its CatchHandler @ 009763c0 */
      std::__ndk1::ios_base::init((ios_base *)local_150,&ppuStack_1b8);
      local_c8 = 0;
      local_c0 = 0xffffffff;
      local_1d0 = 0xc4e4e0;
      uStack_1cc = 0;
      uStack_1cb = 0;
      uStack_1c9 = 0;
      local_150[0] = &PTR_FUN_00c4e530;
      ppuStack_1b8 = &PTR__basic_streambuf_00c4e728;
      bStack_1c0 = (basic_ostream)0x8;
      uStack_1bf = 0xe5;
      uStack_1be = 0xc4;
      uStack_1bd = 0;
      uStack_1bb = 0;
      uStack_1ba = 0;
      uStack_1b9 = 0;
      std::__ndk1::locale::locale((locale *)&local_1b0);
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
                    /* try { // try from 00973ac8 to 00973b33 has its CatchHandler @ 0097648c */
      pbVar26 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                          (&bStack_1c0,"Cannot connect to url: ",0x17);
      uVar23 = *(ulong *)(param_2 + 8);
      pbVar32 = *(basic_string_conflict **)(param_2 + 0x10);
      if (((byte)*param_2 & 1) == 0) {
        pbVar32 = param_2 + 1;
        uVar23 = (ulong)((byte)*param_2 >> 1);
      }
      pbVar26 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                          (pbVar26,(char *)pbVar32,uVar23);
      pbVar26 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                          (pbVar26," / error : ",0xb);
      uVar23 = local_510 >> 1 & 0x7f;
      pcVar42 = (char *)((ulong)&local_510 | 1);
      if ((local_510 & 1) != 0) {
        uVar23 = local_508;
        pcVar42 = local_500;
      }
      std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                (pbVar26,pcVar42,uVar23);
                    /* try { // try from 00973b34 to 00973b43 has its CatchHandler @ 009763bc */
      std::__ndk1::basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
      ::str();
                    /* try { // try from 00973b44 to 00973b4b has its CatchHandler @ 009763a4 */
      puVar28 = operator_new(0x98);
      puVar28[2] = 0;
      *puVar28 = &PTR____shared_ptr_emplace_00c51878;
      puVar28[1] = 0;
                    /* try { // try from 00973b6c to 00973b8f has its CatchHandler @ 00976384 */
      HttpResponse::HttpResponse
                ((HttpResponse *)(puVar28 + 3),local_414,(basic_string_conflict *)&local_460,
                 (HttpErrorCode *)local_530,(map *)&local_430,(basic_string_conflict *)&local_448,
                 (basic_string_conflict *)&local_2f0,0,0);
      *param_1_00 = (HttpResponse *)(puVar28 + 3);
      param_1_00[1] = puVar28;
      if (((uint)local_2f0 & 1) != 0) {
        operator_delete((void *)CONCAT53(uStack_2dd,CONCAT21(uStack_2df,bStack_2e0)));
      }
      ppuStack_1b8 = &PTR_LAB_00c4e678;
      local_1d0 = 0xc4e4e0;
      uStack_1cc = 0;
      uStack_1cb = 0;
      uStack_1c9 = 0;
      local_150[0] = &PTR_FUN_00c4e530;
      bStack_1c0 = (basic_ostream)0x8;
      uStack_1bf = 0xe5;
      uStack_1be = 0xc4;
      uStack_1bd = 0;
      uStack_1bb = 0;
      uStack_1ba = 0;
      uStack_1b9 = 0;
      if ((local_178 & 1) != 0) {
        operator_delete(local_168);
      }
      ppuStack_1b8 = &PTR__basic_streambuf_00c4e728;
      std::__ndk1::locale::~locale((locale *)&local_1b0);
      std::__ndk1::ios_base::~ios_base((ios_base *)local_150);
    }
    else {
                    /* try { // try from 009739c0 to 009739cb has its CatchHandler @ 009763c8 */
      makeCancellationRequestWithTimeout
                ((ix *)(ulong)*(uint *)(*param_6 + 0x7c),(int)*param_6 + 0x120,paVar31);
      puVar39 = local_90;
      local_90 = (uint *)0x0;
      if (local_b0 == puVar39) {
        pcVar36 = *(code **)(*(long *)puVar39 + 0x20);
LAB_00973c08:
        (*pcVar36)();
      }
      else if (puVar39 != (uint *)0x0) {
        pcVar36 = *(code **)(*(long *)puVar39 + 0x28);
        goto LAB_00973c08;
      }
      if (local_1b0 == (uint *)0x0) {
        puVar39 = (uint *)0x0;
        local_90 = (uint *)0x0;
      }
      else if (&local_1d0 == local_1b0) {
        local_90 = local_b0;
                    /* try { // try from 00973c54 to 00973c5f has its CatchHandler @ 00976234 */
        (**(code **)(*(long *)local_1b0 + 0x18))(local_1b0,local_b0);
        puVar39 = local_1b0;
      }
      else {
        local_90 = local_1b0;
        local_1b0 = (uint *)0x0;
        puVar39 = (uint *)0x0;
      }
      if (&local_1d0 == puVar39) {
        pcVar36 = *(code **)(*(long *)puVar39 + 0x20);
LAB_00973c8c:
        (*pcVar36)();
      }
      else if (puVar39 != (uint *)0x0) {
        pcVar36 = *(code **)(*(long *)puVar39 + 0x28);
        goto LAB_00973c8c;
      }
      if (*(char *)(*param_6 + 0x88) != '\0') {
        bStack_1c0 = (basic_ostream)0x8;
        uStack_1bf = 0xe5;
        uStack_1be = 0xc4;
        uStack_1bd = 0;
        uStack_1bb = 0;
        uStack_1ba = 0;
        uStack_1b9 = 0;
        local_150[0] = &PTR__basic_istream_00c4e640;
        uStack_1c8 = 0;
        uStack_1c7 = 0;
        uStack_1c6 = 0;
        uStack_1c5 = 0;
        uStack_1c4 = 0;
        uStack_1c3 = 0;
        uStack_1c2 = 0;
        uStack_1c1 = 0;
        local_1d0 = 0xc4e618;
        uStack_1cc = 0;
        uStack_1cb = 0;
        uStack_1c9 = 0;
                    /* try { // try from 00973ce0 to 00973ceb has its CatchHandler @ 00976358 */
        std::__ndk1::ios_base::init((ios_base *)local_150,&ppuStack_1b8);
        local_c8 = 0;
        local_c0 = 0xffffffff;
        local_1d0 = 0xc4e4e0;
        uStack_1cc = 0;
        uStack_1cb = 0;
        uStack_1c9 = 0;
        local_150[0] = &PTR_FUN_00c4e530;
        ppuStack_1b8 = &PTR__basic_streambuf_00c4e728;
        bStack_1c0 = (basic_ostream)0x8;
        uStack_1bf = 0xe5;
        uStack_1be = 0xc4;
        uStack_1bd = 0;
        uStack_1bb = 0;
        uStack_1ba = 0;
        uStack_1b9 = 0;
        std::__ndk1::locale::locale((locale *)&local_1b0);
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
                    /* try { // try from 00973d5c to 00973e0b has its CatchHandler @ 00976528 */
        pbVar26 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                            (&bStack_1c0,"Sending ",8);
        pbVar38 = pbVar6;
        uVar23 = (ulong)(*param_3 >> 1);
        if ((*param_3 & 1) != 0) {
          pbVar38 = *(byte **)(param_3 + 0x10);
          uVar23 = *(ulong *)(param_3 + 8);
        }
        pbVar26 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                            (pbVar26,(char *)pbVar38,uVar23);
        pbVar26 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                            (pbVar26," request ",9);
        pbVar26 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                            (pbVar26,"to ",3);
        uVar23 = local_490 >> 1 & 0x7f;
        if ((local_490 & 1) != 0) {
          pcVar42 = local_480;
          uVar23 = local_488;
        }
        pbVar26 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                            (pbVar26,pcVar42,uVar23);
        pbVar26 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                            (pbVar26,":",1);
        this = (basic_ostream<char,std::__ndk1::char_traits<char>> *)
               std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::operator<<
                         ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar26,local_4c4);
        std::__ndk1::ios_base::getloc();
                    /* try { // try from 00973e0c to 00973e2b has its CatchHandler @ 009763ec */
        plVar25 = (long *)std::__ndk1::locale::use_facet
                                    ((locale *)&local_2f0,(id *)&std::__ndk1::ctype<char>::id);
        cVar21 = (**(code **)(*plVar25 + 0x38))(plVar25,10);
        std::__ndk1::locale::~locale((locale *)&local_2f0);
                    /* try { // try from 00973e38 to 00973e9f has its CatchHandler @ 00976528 */
        std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::put(this,cVar21);
        std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::flush(this);
        pbVar26 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                            ((basic_ostream *)this,"request size: ",0xe);
        uVar23 = (ulong)((byte)local_4f8[0] >> 1);
        if (((byte)local_4f8[0] & 1) != 0) {
          uVar23 = local_4f0;
        }
        pbVar26 = (basic_ostream *)
                  std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::operator<<
                            ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar26,uVar23);
        pbVar26 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                            (pbVar26," bytes",6);
        std::__ndk1::ios_base::getloc();
                    /* try { // try from 00973ea0 to 00973ebf has its CatchHandler @ 009763e8 */
        plVar25 = (long *)std::__ndk1::locale::use_facet
                                    ((locale *)&local_2f0,(id *)&std::__ndk1::ctype<char>::id);
        cVar21 = (**(code **)(*plVar25 + 0x38))(plVar25,10);
        std::__ndk1::locale::~locale((locale *)&local_2f0);
                    /* try { // try from 00973ecc to 00973f0b has its CatchHandler @ 00976528 */
        std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::put
                  ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar26,cVar21);
        std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::flush
                  ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar26);
        pbVar26 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                            (pbVar26,"=============",0xd);
        std::__ndk1::ios_base::getloc();
                    /* try { // try from 00973f0c to 00973f2b has its CatchHandler @ 009763e4 */
        plVar25 = (long *)std::__ndk1::locale::use_facet
                                    ((locale *)&local_2f0,(id *)&std::__ndk1::ctype<char>::id);
        cVar21 = (**(code **)(*plVar25 + 0x38))(plVar25,10);
        std::__ndk1::locale::~locale((locale *)&local_2f0);
                    /* try { // try from 00973f38 to 00973f9b has its CatchHandler @ 00976528 */
        std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::put
                  ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar26,cVar21);
        std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::flush
                  ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar26);
        uVar23 = (ulong)((byte)local_4f8[0] >> 1);
        pcVar42 = (char *)((ulong)local_4f8 | 1);
        if (((byte)local_4f8[0] & 1) != 0) {
          uVar23 = local_4f0;
          pcVar42 = local_4e8;
        }
        pbVar26 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                            (pbVar26,pcVar42,uVar23);
        pbVar26 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                            (pbVar26,"=============",0xd);
        std::__ndk1::ios_base::getloc();
                    /* try { // try from 00973f9c to 00973fbb has its CatchHandler @ 009763e0 */
        plVar25 = (long *)std::__ndk1::locale::use_facet
                                    ((locale *)&local_2f0,(id *)&std::__ndk1::ctype<char>::id);
        cVar21 = (**(code **)(*plVar25 + 0x38))(plVar25,10);
        std::__ndk1::locale::~locale((locale *)&local_2f0);
                    /* try { // try from 00973fc8 to 00973fef has its CatchHandler @ 00976528 */
        std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::put
                  ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar26,cVar21);
        std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::flush
                  ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar26);
        std::__ndk1::ios_base::getloc();
                    /* try { // try from 00973ff0 to 0097400f has its CatchHandler @ 009763dc */
        plVar25 = (long *)std::__ndk1::locale::use_facet
                                    ((locale *)&local_2f0,(id *)&std::__ndk1::ctype<char>::id);
        cVar21 = (**(code **)(*plVar25 + 0x38))(plVar25,10);
        std::__ndk1::locale::~locale((locale *)&local_2f0);
                    /* try { // try from 0097401c to 0097402f has its CatchHandler @ 00976528 */
        std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::put
                  ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar26,cVar21);
        std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::flush
                  ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar26);
                    /* try { // try from 00974030 to 0097403b has its CatchHandler @ 00976354 */
        std::__ndk1::
        basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::str();
        lVar34 = *param_6;
        p_Var7 = (__shared_weak_count *)param_6[1];
        if (p_Var7 != (__shared_weak_count *)0x0) {
          p_Var2 = p_Var7 + 8;
          do {
            cVar21 = '\x01';
            bVar20 = (bool)ExclusiveMonitorPass(p_Var2,0x10);
            if (bVar20) {
              *(long *)p_Var2 = *(long *)p_Var2 + 1;
              cVar21 = ExclusiveMonitorsStatus();
            }
          } while (cVar21 != '\0');
        }
        plVar25 = *(long **)(lVar34 + 0xb0);
        if (plVar25 != (long *)0x0) {
                    /* try { // try from 00974068 to 0097406f has its CatchHandler @ 00976238 */
          (**(code **)(*plVar25 + 0x30))(plVar25,&local_2f0);
        }
        if (p_Var7 != (__shared_weak_count *)0x0) {
          p_Var2 = p_Var7 + 8;
          do {
            lVar34 = *(long *)p_Var2;
            cVar21 = '\x01';
            bVar20 = (bool)ExclusiveMonitorPass(p_Var2,0x10);
            if (bVar20) {
              *(long *)p_Var2 = lVar34 + -1;
              cVar21 = ExclusiveMonitorsStatus();
            }
          } while (cVar21 != '\0');
          if (lVar34 == 0) {
            (**(code **)(*(long *)p_Var7 + 0x10))(p_Var7);
            std::__ndk1::__shared_weak_count::__release_weak(p_Var7);
          }
        }
        if (((uint)local_2f0 & 1) != 0) {
          operator_delete((void *)CONCAT53(uStack_2dd,CONCAT21(uStack_2df,bStack_2e0)));
        }
        local_1d0 = 0xc4e4e0;
        uStack_1cc = 0;
        uStack_1cb = 0;
        uStack_1c9 = 0;
        local_150[0] = &PTR_FUN_00c4e530;
        bStack_1c0 = (basic_ostream)0x8;
        uStack_1bf = 0xe5;
        uStack_1be = 0xc4;
        uStack_1bd = 0;
        uStack_1bb = 0;
        uStack_1ba = 0;
        uStack_1b9 = 0;
        ppuStack_1b8 = &PTR_LAB_00c4e678;
        if ((local_178 & 1) != 0) {
          operator_delete(local_168);
        }
        ppuStack_1b8 = &PTR__basic_streambuf_00c4e728;
        std::__ndk1::locale::~locale((locale *)&local_1b0);
        std::__ndk1::ios_base::~ios_base((ios_base *)local_150);
      }
      local_1d0 = 0xc518d0;
      uStack_1cc = 0;
      uStack_1cb = 0;
      uStack_1c9 = 0;
      uStack_1c8 = SUB81(local_b0,0);
      uStack_1c7 = (undefined1)((ulong)local_b0 >> 8);
      uStack_1c6 = (undefined1)((ulong)local_b0 >> 0x10);
      uStack_1c5 = (undefined1)((ulong)local_b0 >> 0x18);
      uStack_1c4 = (undefined1)((ulong)local_b0 >> 0x20);
      uStack_1c3 = (undefined1)((ulong)local_b0 >> 0x28);
      uStack_1c2 = (undefined1)((ulong)local_b0 >> 0x30);
      uStack_1c1 = (undefined1)((ulong)local_b0 >> 0x38);
                    /* try { // try from 00974138 to 00974143 has its CatchHandler @ 00976364 */
      bStack_1c0 = bVar15;
      uStack_1bf = uVar11;
      uStack_1be = uVar16;
      uStack_1bd = uVar13;
      uStack_1bb = uVar17;
      uStack_1ba = uVar18;
      uStack_1b9 = uVar19;
      local_1b0 = &local_1d0;
      uVar23 = Socket::writeBytes(*(Socket **)(param_1 + 0xa0),local_4f8,(function *)&local_1d0);
      if (&local_1d0 == local_1b0) {
        pcVar36 = *(code **)(*(long *)local_1b0 + 0x20);
LAB_0097416c:
        (*pcVar36)();
      }
      else if (local_1b0 != (uint *)0x0) {
        pcVar36 = *(code **)(*(long *)local_1b0 + 0x28);
        goto LAB_0097416c;
      }
      if ((uVar23 & 1) == 0) {
        local_2f0._0_4_ = 6;
        if ((*(byte *)(*param_6 + 0x120) & 1) != 0) {
          local_2f0._0_4_ = 0xf;
        }
        uStack_1bb = 0;
        uStack_1ba = 0;
        uStack_1b9 = 0;
        uStack_1c7 = 0x65;
        uStack_1c6 = 0x6e;
        uStack_1c5 = 100;
        uStack_1c4 = 0x20;
        uStack_1c3 = 0x72;
        uStack_1c2 = 0x65;
        uStack_1c1 = 0x71;
        bStack_1c0 = (basic_ostream)0x75;
        local_1d0 = 0x6e614326;
        uStack_1cc = 0x6e;
        uStack_1cb = 0x746f;
        uStack_1c9 = 0x20;
        uStack_1c8 = 0x73;
        uStack_1bf = 0x65;
        uStack_1be = 0x73;
        uStack_1bd = 0x74;
                    /* try { // try from 00974228 to 0097422f has its CatchHandler @ 00976338 */
        puVar28 = operator_new(0x98);
        puVar28[2] = 0;
        *puVar28 = &PTR____shared_ptr_emplace_00c51878;
        puVar28[1] = 0;
                    /* try { // try from 00974250 to 0097427f has its CatchHandler @ 00976310 */
        HttpResponse::HttpResponse
                  ((HttpResponse *)(puVar28 + 3),local_414,(basic_string_conflict *)&local_460,
                   (HttpErrorCode *)&local_2f0,(map *)&local_430,(basic_string_conflict *)&local_448
                   ,(basic_string_conflict *)&local_1d0,0,0);
        *param_1_00 = (HttpResponse *)(puVar28 + 3);
        param_1_00[1] = puVar28;
        if ((local_1d0 & 1) != 0) {
          operator_delete((void *)CONCAT17(uStack_1b9,
                                           CONCAT16(uStack_1ba,
                                                    CONCAT15(uStack_1bb,
                                                             CONCAT23(uStack_1bd,
                                                                      CONCAT12(uStack_1be,
                                                                               CONCAT11(uStack_1bf,
                                                                                        bStack_1c0))
                                                                     )))));
        }
      }
      else {
        local_1d0 = 0xc518d0;
        uStack_1cc = 0;
        uStack_1cb = 0;
        uStack_1c9 = 0;
        uVar23 = (ulong)((byte)local_4f8[0] >> 1);
        if (((byte)local_4f8[0] & 1) != 0) {
          uVar23 = local_4f0;
        }
        uStack_1c8 = SUB81(local_b0,0);
        uStack_1c7 = (undefined1)((ulong)local_b0 >> 8);
        uStack_1c6 = (undefined1)((ulong)local_b0 >> 0x10);
        uStack_1c5 = (undefined1)((ulong)local_b0 >> 0x18);
        uStack_1c4 = (undefined1)((ulong)local_b0 >> 0x20);
        uStack_1c3 = (undefined1)((ulong)local_b0 >> 0x28);
        uStack_1c2 = (undefined1)((ulong)local_b0 >> 0x30);
        uStack_1c1 = (undefined1)((ulong)local_b0 >> 0x38);
        bStack_1c0 = bVar15;
        uStack_1bf = uVar11;
        uStack_1be = uVar16;
        uStack_1bd = uVar13;
        uStack_1bb = uVar17;
        uStack_1ba = uVar18;
        uStack_1b9 = uVar19;
        local_1b0 = &local_1d0;
                    /* try { // try from 009741ac to 009741b7 has its CatchHandler @ 00976340 */
        Socket::readLine(*(function **)(param_1 + 0xa0));
        if (&local_1d0 == local_1b0) {
          pcVar36 = *(code **)(*(long *)local_1b0 + 0x20);
LAB_009742a8:
          (*pcVar36)();
        }
        else if (local_1b0 != (uint *)0x0) {
          pcVar36 = *(code **)(*(long *)local_1b0 + 0x28);
          goto LAB_009742a8;
        }
        pcVar42 = local_518;
        pvVar44 = pvStack_520;
        local_550 = 0;
        pvStack_548 = (void *)0x0;
        local_540 = (char *)0x0;
        uVar45 = local_530[0] & 0xff;
        if ((local_528 & 1) == 0) {
          local_540 = local_518;
          pvStack_548 = pvStack_520;
          local_550 = local_528;
          if (uVar45 == 0) goto LAB_00974544;
LAB_009742dc:
          if (*(char *)(*param_6 + 0x88) == '\0') {
            pcVar42 = (char *)((ulong)&local_550 | 1);
          }
          else {
            bStack_1c0 = (basic_ostream)0x8;
            uStack_1bf = 0xe5;
            uStack_1be = 0xc4;
            uStack_1bd = 0;
            uStack_1bb = 0;
            uStack_1ba = 0;
            uStack_1b9 = 0;
            local_150[0] = &PTR__basic_istream_00c4e640;
            uStack_1c8 = 0;
            uStack_1c7 = 0;
            uStack_1c6 = 0;
            uStack_1c5 = 0;
            uStack_1c4 = 0;
            uStack_1c3 = 0;
            uStack_1c2 = 0;
            uStack_1c1 = 0;
            local_1d0 = 0xc4e618;
            uStack_1cc = 0;
            uStack_1cb = 0;
            uStack_1c9 = 0;
                    /* try { // try from 0097432c to 00974337 has its CatchHandler @ 0097622c */
            std::__ndk1::ios_base::init((ios_base *)local_150,&ppuStack_1b8);
            local_c8 = 0;
            local_c0 = 0xffffffff;
            local_1d0 = 0xc4e4e0;
            uStack_1cc = 0;
            uStack_1cb = 0;
            uStack_1c9 = 0;
            local_150[0] = &PTR_FUN_00c4e530;
            ppuStack_1b8 = &PTR__basic_streambuf_00c4e728;
            bStack_1c0 = (basic_ostream)0x8;
            uStack_1bf = 0xe5;
            uStack_1be = 0xc4;
            uStack_1bd = 0;
            uStack_1bb = 0;
            uStack_1ba = 0;
            uStack_1b9 = 0;
            std::__ndk1::locale::locale((locale *)&local_1b0);
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
                    /* try { // try from 009743a8 to 009743df has its CatchHandler @ 00976284 */
            pbVar26 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                                (&bStack_1c0,"Status line ",0xc);
            pcVar42 = (char *)((ulong)&local_550 | 1);
            pvVar44 = (void *)(local_550 >> 1 & 0x7f);
            pcVar49 = pcVar42;
            if ((local_550 & 1) != 0) {
              pvVar44 = pvStack_548;
              pcVar49 = local_540;
            }
            std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                      (pbVar26,pcVar49,(ulong)pvVar44);
                    /* try { // try from 009743e0 to 009743ef has its CatchHandler @ 00976228 */
            std::__ndk1::
            basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::str()
            ;
            lVar34 = *param_6;
            p_Var7 = (__shared_weak_count *)param_6[1];
            if (p_Var7 != (__shared_weak_count *)0x0) {
              p_Var2 = p_Var7 + 8;
              do {
                cVar21 = '\x01';
                bVar20 = (bool)ExclusiveMonitorPass(p_Var2,0x10);
                if (bVar20) {
                  *(long *)p_Var2 = *(long *)p_Var2 + 1;
                  cVar21 = ExclusiveMonitorsStatus();
                }
              } while (cVar21 != '\0');
            }
            plVar25 = *(long **)(lVar34 + 0xb0);
            if (plVar25 != (long *)0x0) {
                    /* try { // try from 00974424 to 0097442b has its CatchHandler @ 00976114 */
              (**(code **)(*plVar25 + 0x30))(plVar25,&local_2f0);
            }
            if (p_Var7 != (__shared_weak_count *)0x0) {
              p_Var2 = p_Var7 + 8;
              do {
                lVar34 = *(long *)p_Var2;
                cVar21 = '\x01';
                bVar20 = (bool)ExclusiveMonitorPass(p_Var2,0x10);
                if (bVar20) {
                  *(long *)p_Var2 = lVar34 + -1;
                  cVar21 = ExclusiveMonitorsStatus();
                }
              } while (cVar21 != '\0');
              if (lVar34 == 0) {
                (**(code **)(*(long *)p_Var7 + 0x10))(p_Var7);
                std::__ndk1::__shared_weak_count::__release_weak(p_Var7);
              }
            }
            if (((uint)local_2f0 & 1) != 0) {
              operator_delete((void *)CONCAT53(uStack_2dd,CONCAT21(uStack_2df,bStack_2e0)));
            }
            local_1d0 = 0xc4e4e0;
            uStack_1cc = 0;
            uStack_1cb = 0;
            uStack_1c9 = 0;
            local_150[0] = &PTR_FUN_00c4e530;
            bStack_1c0 = (basic_ostream)0x8;
            uStack_1bf = 0xe5;
            uStack_1be = 0xc4;
            uStack_1bd = 0;
            uStack_1bb = 0;
            uStack_1ba = 0;
            uStack_1b9 = 0;
            ppuStack_1b8 = &PTR_LAB_00c4e678;
            if ((local_178 & 1) != 0) {
              operator_delete(local_168);
            }
            ppuStack_1b8 = &PTR__basic_streambuf_00c4e728;
            std::__ndk1::locale::~locale((locale *)&local_1b0);
            std::__ndk1::ios_base::~ios_base((ios_base *)local_150);
          }
          pcVar49 = pcVar42;
          if ((local_550 & 1) != 0) {
            pcVar49 = local_540;
          }
          param2 = (function *)&local_414;
          iVar22 = sscanf(pcVar49,"HTTP/1.1 %d",(int *)param2);
          if (iVar22 != 1) {
            uStack_1c8 = 0;
            uStack_1c7 = 0;
            uStack_1c6 = 0;
            uStack_1c5 = 0;
            uStack_1c4 = 0;
            uStack_1c3 = 0;
            uStack_1c2 = 0;
            uStack_1c1 = 0;
            local_1d0 = 0;
            uStack_1cc = 0;
            uStack_1cb = 0;
            uStack_1c9 = 0;
            bStack_1c0 = (basic_ostream)0x0;
            uStack_1bf = 0;
            uStack_1be = 0;
            uStack_1bd = 0;
            uStack_1bb = 0;
            uStack_1ba = 0;
            uStack_1b9 = 0;
                    /* try { // try from 00974690 to 00974697 has its CatchHandler @ 009761a0 */
            pcVar42 = operator_new(0x30);
            bStack_1c0 = SUB81(pcVar42,0);
            uStack_1bf = (undefined1)((ulong)pcVar42 >> 8);
            uStack_1be = (undefined1)((ulong)pcVar42 >> 0x10);
            uStack_1bd = (undefined2)((ulong)pcVar42 >> 0x18);
            uStack_1bb = (undefined1)((ulong)pcVar42 >> 0x28);
            uStack_1ba = (undefined1)((ulong)pcVar42 >> 0x30);
            uStack_1b9 = (undefined1)((ulong)pcVar42 >> 0x38);
            builtin_strncpy(pcVar42,"Cannot parse response code from status line",0x2c);
            uStack_1c8 = 0x2b;
            uStack_1c7 = 0;
            uStack_1c6 = 0;
            uStack_1c5 = 0;
            uStack_1c4 = 0;
            uStack_1c3 = 0;
            uStack_1c2 = 0;
            uStack_1c1 = 0;
            local_1d0 = 0x31;
            uStack_1cc = 0;
            uStack_1cb = 0;
            uStack_1c9 = 0;
            local_2f0._0_4_ = 9;
                    /* try { // try from 009746cc to 009746df has its CatchHandler @ 0097619c */
            puVar28 = operator_new(0x98);
            puVar28[2] = 0;
            pHVar43 = (HttpResponse *)(puVar28 + 3);
            *puVar28 = &PTR____shared_ptr_emplace_00c51878;
            puVar28[1] = 0;
                    /* try { // try from 00974704 to 00974727 has its CatchHandler @ 00976188 */
            HttpResponse::HttpResponse
                      (pHVar43,local_414,(basic_string_conflict *)&local_460,
                       (HttpErrorCode *)&local_2f0,(map *)&local_430,
                       (basic_string_conflict *)&local_448,(basic_string_conflict *)&local_1d0,
                       uVar23,0);
            goto LAB_00974728;
          }
          local_1d0 = 0xc518d0;
          uStack_1cc = 0;
          uStack_1cb = 0;
          uStack_1c9 = 0;
          uStack_1c8 = SUB81(local_b0,0);
          uStack_1c7 = (undefined1)((ulong)local_b0 >> 8);
          uStack_1c6 = (undefined1)((ulong)local_b0 >> 0x10);
          uStack_1c5 = (undefined1)((ulong)local_b0 >> 0x18);
          uStack_1c4 = (undefined1)((ulong)local_b0 >> 0x20);
          uStack_1c3 = (undefined1)((ulong)local_b0 >> 0x28);
          uStack_1c2 = (undefined1)((ulong)local_b0 >> 0x30);
          uStack_1c1 = (undefined1)((ulong)local_b0 >> 0x38);
                    /* try { // try from 00974658 to 00974667 has its CatchHandler @ 009761a4 */
          bStack_1c0 = bVar15;
          uStack_1bf = uVar11;
          uStack_1be = uVar16;
          uStack_1bd = uVar13;
          uStack_1bb = uVar17;
          uStack_1ba = uVar18;
          uStack_1b9 = uVar19;
          local_1b0 = &local_1d0;
          parseHttpHeaders(piVar24,(unique_ptr *)&local_1d0,param2);
          if (&local_1d0 == local_1b0) {
            pcVar36 = *(code **)(*(long *)local_1b0 + 0x20);
LAB_00974748:
            (*pcVar36)();
          }
          else if (local_1b0 != (uint *)0x0) {
            pcVar36 = *(code **)(*(long *)local_1b0 + 0x28);
            goto LAB_00974748;
          }
                    /* try { // try from 0097475c to 00974763 has its CatchHandler @ 0097618c */
          std::__ndk1::
          __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
          ::
          __assign_multi<std::__ndk1::__tree_const_iterator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__tree_node<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,void*>*,long>>
                    ((__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                      *)&local_430,local_568,local_560);
          iVar22 = local_414;
          if (local_570 == '\0') {
            uStack_1c8 = 0;
            uStack_1c7 = 0;
            uStack_1c6 = 0;
            uStack_1c5 = 0;
            uStack_1c4 = 0;
            uStack_1c3 = 0;
            uStack_1c2 = 0;
            uStack_1c1 = 0;
            local_1d0 = 0;
            uStack_1cc = 0;
            uStack_1cb = 0;
            uStack_1c9 = 0;
            bStack_1c0 = (basic_ostream)0x0;
            uStack_1bf = 0;
            uStack_1be = 0;
            uStack_1bd = 0;
            uStack_1bb = 0;
            uStack_1ba = 0;
            uStack_1b9 = 0;
            local_2f0._0_4_ = 10;
            if ((*(byte *)(*param_6 + 0x120) & 1) != 0) {
              local_2f0._0_4_ = 0xf;
            }
                    /* try { // try from 00974ba8 to 00974baf has its CatchHandler @ 0097610c */
            pcVar42 = operator_new(0x20);
            bStack_1c0 = SUB81(pcVar42,0);
            uStack_1bf = (undefined1)((ulong)pcVar42 >> 8);
            uStack_1be = (undefined1)((ulong)pcVar42 >> 0x10);
            uStack_1bd = (undefined2)((ulong)pcVar42 >> 0x18);
            uStack_1bb = (undefined1)((ulong)pcVar42 >> 0x28);
            uStack_1ba = (undefined1)((ulong)pcVar42 >> 0x30);
            uStack_1b9 = (undefined1)((ulong)pcVar42 >> 0x38);
            uStack_1c8 = 0x19;
            uStack_1c7 = 0;
            uStack_1c6 = 0;
            uStack_1c5 = 0;
            uStack_1c4 = 0;
            uStack_1c3 = 0;
            uStack_1c2 = 0;
            uStack_1c1 = 0;
            local_1d0 = 0x21;
            uStack_1cc = 0;
            uStack_1cb = 0;
            uStack_1c9 = 0;
            builtin_strncpy(pcVar42,"Cannot parse http headers",0x1a);
                    /* try { // try from 00974bdc to 00974bef has its CatchHandler @ 00976104 */
            puVar28 = operator_new(0x98);
            puVar28[2] = 0;
            *puVar28 = &PTR____shared_ptr_emplace_00c51878;
            puVar28[1] = 0;
                    /* try { // try from 00974c14 to 00974c37 has its CatchHandler @ 009760e4 */
            HttpResponse::HttpResponse
                      ((HttpResponse *)(puVar28 + 3),local_414,(basic_string_conflict *)&local_460,
                       (HttpErrorCode *)&local_2f0,(map *)&local_430,
                       (basic_string_conflict *)&local_448,(basic_string_conflict *)&local_1d0,
                       uVar23,0);
            puVar39 = (uint *)CONCAT44(local_2f0._4_4_,(uint)local_2f0);
            *param_1_00 = (HttpResponse *)(puVar28 + 3);
            param_1_00[1] = puVar28;
joined_r0x00974c40:
            if ((local_1d0 & 1) != 0) {
LAB_00974c44:
              operator_delete((void *)CONCAT17(uStack_1b9,
                                               CONCAT16(uStack_1ba,
                                                        CONCAT15(uStack_1bb,
                                                                 CONCAT23(uStack_1bd,
                                                                          CONCAT12(uStack_1be,
                                                                                   CONCAT11(
                                                  uStack_1bf,bStack_1c0)))))));
              puVar39 = (uint *)CONCAT44(local_2f0._4_4_,(uint)local_2f0);
            }
          }
          else if ((local_414 - 0x12dU < 8) && (*(char *)(*param_6 + 0x80) != '\0')) {
            uStack_1c6 = 0;
            uStack_1c5 = 0;
            uStack_1c4 = 0;
            uStack_1c3 = 0;
            uStack_1c2 = 0;
            uStack_1c1 = 0;
            bStack_1c0 = (basic_ostream)0x0;
            uStack_1bf = 0;
            uStack_1be = 0;
            uStack_1bd = 0;
            uStack_1bb = 0;
            uStack_1ba = 0;
            uStack_1b9 = 0;
            local_1d0 = 0x636f4c10;
            uStack_1cc = 0x61;
            uStack_1cb = 0x6974;
            uStack_1c9 = 0x6f;
            uStack_1c8 = 0x6e;
            uStack_1c7 = 0;
            if (local_428 == (__tree_node *)0x0) {
LAB_00974820:
              p_Var47 = (__tree_node *)&local_428;
            }
            else {
              p_Var47 = (__tree_node *)&local_428;
              p_Var50 = local_428;
              do {
                    /* try { // try from 009747e0 to 009747eb has its CatchHandler @ 00976948 */
                uVar27 = CaseInsensitiveLess::operator()
                                   ((CaseInsensitiveLess *)&local_420,
                                    (basic_string_conflict *)(p_Var50 + 0x20),
                                    (basic_string_conflict *)&local_1d0);
                lVar34 = 8;
                if ((uVar27 & 1) == 0) {
                  lVar34 = 0;
                  p_Var47 = p_Var50;
                }
                p_Var50 = *(__tree_node **)(p_Var50 + lVar34);
              } while (p_Var50 != (__tree_node *)0x0);
              if (p_Var47 == (__tree_node *)&local_428) goto LAB_00974820;
                    /* try { // try from 00974810 to 0097481b has its CatchHandler @ 00975ee8 */
              uVar27 = CaseInsensitiveLess::operator()
                                 ((CaseInsensitiveLess *)&local_420,
                                  (basic_string_conflict *)&local_1d0,
                                  (basic_string_conflict *)(p_Var47 + 0x20));
              if ((uVar27 & 1) != 0) goto LAB_00974820;
            }
            if ((local_1d0 & 1) != 0) {
              operator_delete((void *)CONCAT17(uStack_1b9,
                                               CONCAT16(uStack_1ba,
                                                        CONCAT15(uStack_1bb,
                                                                 CONCAT23(uStack_1bd,
                                                                          CONCAT12(uStack_1be,
                                                                                   CONCAT11(
                                                  uStack_1bf,bStack_1c0)))))));
            }
            if (p_Var47 == (__tree_node *)&local_428) {
              uStack_1c8 = 0;
              uStack_1c7 = 0;
              uStack_1c6 = 0;
              uStack_1c5 = 0;
              uStack_1c4 = 0;
              uStack_1c3 = 0;
              uStack_1c2 = 0;
              uStack_1c1 = 0;
              local_1d0 = 0;
              uStack_1cc = 0;
              uStack_1cb = 0;
              uStack_1c9 = 0;
              bStack_1c0 = (basic_ostream)0x0;
              uStack_1bf = 0;
              uStack_1be = 0;
              uStack_1bd = 0;
              uStack_1bb = 0;
              uStack_1ba = 0;
              uStack_1b9 = 0;
                    /* try { // try from 00974f14 to 00974f1b has its CatchHandler @ 00975f84 */
              pcVar42 = operator_new(0x30);
              bStack_1c0 = SUB81(pcVar42,0);
              uStack_1bf = (undefined1)((ulong)pcVar42 >> 8);
              uStack_1be = (undefined1)((ulong)pcVar42 >> 0x10);
              uStack_1bd = (undefined2)((ulong)pcVar42 >> 0x18);
              uStack_1bb = (undefined1)((ulong)pcVar42 >> 0x28);
              uStack_1ba = (undefined1)((ulong)pcVar42 >> 0x30);
              uStack_1b9 = (undefined1)((ulong)pcVar42 >> 0x38);
              builtin_strncpy(pcVar42,"Missing location header for redirect",0x25);
              uStack_1c8 = 0x24;
              uStack_1c7 = 0;
              uStack_1c6 = 0;
              uStack_1c5 = 0;
              uStack_1c4 = 0;
              uStack_1c3 = 0;
              uStack_1c2 = 0;
              uStack_1c1 = 0;
              local_1d0 = 0x31;
              uStack_1cc = 0;
              uStack_1cb = 0;
              uStack_1c9 = 0;
              local_2f0._0_4_ = 0xb;
                    /* try { // try from 00974f54 to 00974f63 has its CatchHandler @ 00975f7c */
              puVar28 = operator_new(0x98);
              puVar28[2] = 0;
              *puVar28 = &PTR____shared_ptr_emplace_00c51878;
              puVar28[1] = 0;
                    /* try { // try from 00974f84 to 00974fa7 has its CatchHandler @ 00975f78 */
              HttpResponse::HttpResponse
                        ((HttpResponse *)(puVar28 + 3),local_414,(basic_string_conflict *)&local_460
                         ,(HttpErrorCode *)&local_2f0,(map *)&local_430,
                         (basic_string_conflict *)&local_448,(basic_string_conflict *)&local_1d0,
                         uVar23,0);
              puVar39 = (uint *)CONCAT44(local_2f0._4_4_,(uint)local_2f0);
              *param_1_00 = (HttpResponse *)(puVar28 + 3);
              param_1_00[1] = puVar28;
              goto joined_r0x00974c40;
            }
            if (*(int *)(*param_6 + 0x84) <= param_7) {
              bStack_1c0 = (basic_ostream)0x8;
              uStack_1bf = 0xe5;
              uStack_1be = 0xc4;
              uStack_1bd = 0;
              uStack_1bb = 0;
              uStack_1ba = 0;
              uStack_1b9 = 0;
              local_150[0] = &PTR__basic_istream_00c4e640;
              uStack_1c8 = 0;
              uStack_1c7 = 0;
              uStack_1c6 = 0;
              uStack_1c5 = 0;
              uStack_1c4 = 0;
              uStack_1c3 = 0;
              uStack_1c2 = 0;
              uStack_1c1 = 0;
              local_1d0 = 0xc4e618;
              uStack_1cc = 0;
              uStack_1cb = 0;
              uStack_1c9 = 0;
                    /* try { // try from 00974ff8 to 00975003 has its CatchHandler @ 00975f28 */
              std::__ndk1::ios_base::init((ios_base *)local_150,&ppuStack_1b8);
              local_c8 = 0;
              local_c0 = 0xffffffff;
              local_1d0 = 0xc4e4e0;
              uStack_1cc = 0;
              uStack_1cb = 0;
              uStack_1c9 = 0;
              local_150[0] = &PTR_FUN_00c4e530;
              ppuStack_1b8 = &PTR__basic_streambuf_00c4e728;
              bStack_1c0 = (basic_ostream)0x8;
              uStack_1bf = 0xe5;
              uStack_1be = 0xc4;
              uStack_1bd = 0;
              uStack_1bb = 0;
              uStack_1ba = 0;
              uStack_1b9 = 0;
              std::__ndk1::locale::locale((locale *)&local_1b0);
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
                    /* try { // try from 00975074 to 0097508f has its CatchHandler @ 00976000 */
              pbVar26 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                                  (&bStack_1c0,"Too many redirects: ",0x14);
              std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::operator<<
                        ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar26,param_7);
              local_5a8 = (function *)CONCAT44(local_5a8._4_4_,0xc);
                    /* try { // try from 00975098 to 009750a3 has its CatchHandler @ 00975f24 */
              std::__ndk1::
              basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::str
                        ();
                    /* try { // try from 009750a4 to 009750ab has its CatchHandler @ 00975f0c */
              puVar28 = operator_new(0x98);
              puVar28[2] = 0;
              *puVar28 = &PTR____shared_ptr_emplace_00c51878;
              puVar28[1] = 0;
                    /* try { // try from 009750cc to 009750ef has its CatchHandler @ 00975eec */
              HttpResponse::HttpResponse
                        ((HttpResponse *)(puVar28 + 3),local_414,(basic_string_conflict *)&local_460
                         ,(HttpErrorCode *)&local_5a8,(map *)&local_430,
                         (basic_string_conflict *)&local_448,(basic_string_conflict *)&local_2f0,
                         uVar23,0);
              *param_1_00 = (HttpResponse *)(puVar28 + 3);
              param_1_00[1] = puVar28;
              if (((uint)local_2f0 & 1) != 0) {
                operator_delete((void *)CONCAT53(uStack_2dd,CONCAT21(uStack_2df,bStack_2e0)));
              }
              local_1d0 = 0xc4e4e0;
              uStack_1cc = 0;
              uStack_1cb = 0;
              uStack_1c9 = 0;
              local_150[0] = &PTR_FUN_00c4e530;
              bStack_1c0 = (basic_ostream)0x8;
              uStack_1bf = 0xe5;
              uStack_1be = 0xc4;
              uStack_1bd = 0;
              uStack_1bb = 0;
              uStack_1ba = 0;
              uStack_1b9 = 0;
              ppuStack_1b8 = &PTR_LAB_00c4e678;
              if ((local_178 & 1) != 0) {
                operator_delete(local_168);
              }
              ppuStack_1b8 = &PTR__basic_streambuf_00c4e728;
              std::__ndk1::locale::~locale((locale *)&local_1b0);
              std::__ndk1::ios_base::~ios_base((ios_base *)local_150);
              puVar39 = (uint *)CONCAT44(local_2f0._4_4_,(uint)local_2f0);
              goto LAB_00975bfc;
            }
            local_5a8 = (function *)&local_2f0;
            uStack_2e6 = 0;
            bStack_2e0 = (basic_ostream)0x0;
            uStack_2df = 0;
            uStack_2dd = 0;
            local_2f0._0_4_ = 0x636f4c10;
            local_2f0._4_4_ = 0x6f697461;
            bStack_2e8 = 0x6e;
            uStack_2e7 = 0;
                    /* try { // try from 00974884 to 0097489f has its CatchHandler @ 00975f8c */
            lVar34 = std::__ndk1::
                     __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                     ::
                     __emplace_unique_key_args<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::piecewise_construct_t_const&,std::__ndk1::tuple<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>&&>,std::__ndk1::tuple<>>
                               ((basic_string_conflict *)&local_430,
                                (piecewise_construct_t *)&local_2f0,(tuple *)&DAT_00749500,
                                (tuple *)&local_5a8);
            bStack_1c0 = (basic_ostream)0x0;
            uStack_1bf = 0;
            uStack_1be = 0;
            uStack_1bd = 0;
            uStack_1bb = 0;
            uStack_1ba = 0;
            uStack_1b9 = 0;
            uStack_1c8 = 0;
            uStack_1c7 = 0;
            uStack_1c6 = 0;
            uStack_1c5 = 0;
            uStack_1c4 = 0;
            uStack_1c3 = 0;
            uStack_1c2 = 0;
            uStack_1c1 = 0;
            local_1d0 = 0;
            uStack_1cc = 0;
            uStack_1cb = 0;
            uStack_1c9 = 0;
            if ((*(byte *)(lVar34 + 0x38) & 1) == 0) {
              uVar40 = *(undefined8 *)(lVar34 + 0x48);
              bStack_1c0 = SUB81(uVar40,0);
              uStack_1bf = (undefined1)((ulong)uVar40 >> 8);
              uStack_1be = (undefined1)((ulong)uVar40 >> 0x10);
              uStack_1bd = (undefined2)((ulong)uVar40 >> 0x18);
              uStack_1bb = (undefined1)((ulong)uVar40 >> 0x28);
              uStack_1ba = (undefined1)((ulong)uVar40 >> 0x30);
              uStack_1b9 = (undefined1)((ulong)uVar40 >> 0x38);
              uVar51 = *(undefined8 *)(lVar34 + 0x40);
              uVar40 = *(undefined8 *)(lVar34 + 0x38);
              uStack_1c8 = (undefined1)uVar51;
              uStack_1c7 = (undefined1)((ulong)uVar51 >> 8);
              uStack_1c6 = (undefined1)((ulong)uVar51 >> 0x10);
              uStack_1c5 = (undefined1)((ulong)uVar51 >> 0x18);
              uStack_1c4 = (undefined1)((ulong)uVar51 >> 0x20);
              uStack_1c3 = (undefined1)((ulong)uVar51 >> 0x28);
              uStack_1c2 = (undefined1)((ulong)uVar51 >> 0x30);
              uStack_1c1 = (undefined1)((ulong)uVar51 >> 0x38);
              local_1d0 = (uint)uVar40;
              uStack_1cc = (undefined1)((ulong)uVar40 >> 0x20);
              uStack_1cb = (undefined2)((ulong)uVar40 >> 0x28);
              uStack_1c9 = (undefined1)((ulong)uVar40 >> 0x38);
            }
            else {
              uVar23 = *(ulong *)(lVar34 + 0x40);
              if (0xffffffffffffffef < uVar23) {
                    /* try { // try from 00975e60 to 00975e67 has its CatchHandler @ 00975f8c */
                    /* WARNING: Subroutine does not return */
                std::__ndk1::__basic_string_common<true>::__throw_length_error();
              }
              pvVar44 = *(void **)(lVar34 + 0x48);
              if (uVar23 < 0x17) {
                pvVar48 = (void *)((ulong)&local_1d0 | 1);
                local_1d0 = ((uint)uVar23 & 0x7f) << 1;
                if (uVar23 != 0) goto LAB_009751dc;
              }
              else {
                uVar27 = uVar23 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 009751c0 to 009751c7 has its CatchHandler @ 00975f8c */
                pvVar48 = operator_new(uVar27);
                local_1d0 = (uint)uVar27 | 1;
                bStack_1c0 = SUB81(pvVar48,0);
                uStack_1bf = (undefined1)((ulong)pvVar48 >> 8);
                uStack_1be = (undefined1)((ulong)pvVar48 >> 0x10);
                uStack_1bd = (undefined2)((ulong)pvVar48 >> 0x18);
                uStack_1bb = (undefined1)((ulong)pvVar48 >> 0x28);
                uStack_1ba = (undefined1)((ulong)pvVar48 >> 0x30);
                uStack_1b9 = (undefined1)((ulong)pvVar48 >> 0x38);
                uStack_1cc = (undefined1)(uVar27 >> 0x20);
                uStack_1cb = (undefined2)(uVar27 >> 0x28);
                uStack_1c9 = (undefined1)(uVar27 >> 0x38);
                uStack_1c8 = (undefined1)uVar23;
                uStack_1c7 = (undefined1)(uVar23 >> 8);
                uStack_1c6 = (undefined1)(uVar23 >> 0x10);
                uStack_1c5 = (undefined1)(uVar23 >> 0x18);
                uStack_1c4 = (undefined1)(uVar23 >> 0x20);
                uStack_1c3 = (undefined1)(uVar23 >> 0x28);
                uStack_1c2 = (undefined1)(uVar23 >> 0x30);
                uStack_1c1 = (undefined1)(uVar23 >> 0x38);
LAB_009751dc:
                memcpy(pvVar48,pvVar44,uVar23);
              }
              *(undefined1 *)((long)pvVar48 + uVar23) = 0;
            }
            if (((uint)local_2f0 & 1) != 0) {
              operator_delete((void *)CONCAT53(uStack_2dd,CONCAT21(uStack_2df,bStack_2e0)));
            }
            local_580 = *param_6;
            local_578 = (__shared_weak_count *)param_6[1];
            if (local_578 != (__shared_weak_count *)0x0) {
              p_Var7 = local_578 + 8;
              do {
                cVar21 = '\x01';
                bVar20 = (bool)ExclusiveMonitorPass(p_Var7,0x10);
                if (bVar20) {
                  *(long *)p_Var7 = *(long *)p_Var7 + 1;
                  cVar21 = ExclusiveMonitorsStatus();
                }
              } while (cVar21 != '\0');
            }
                    /* try { // try from 0097490c to 00974927 has its CatchHandler @ 00975f30 */
            request(param_1_00,param_1,&local_1d0,param_3,param_5,&local_580,param_7 + 1);
            p_Var7 = local_578;
            if (local_578 != (__shared_weak_count *)0x0) {
              p_Var2 = local_578 + 8;
              do {
                lVar34 = *(long *)p_Var2;
                cVar21 = '\x01';
                bVar20 = (bool)ExclusiveMonitorPass(p_Var2,0x10);
                if (bVar20) {
                  *(long *)p_Var2 = lVar34 + -1;
                  cVar21 = ExclusiveMonitorsStatus();
                }
              } while (cVar21 != '\0');
              if (lVar34 == 0) {
                (**(code **)(*(long *)local_578 + 0x10))(local_578);
                std::__ndk1::__shared_weak_count::__release_weak(p_Var7);
              }
            }
joined_r0x00975d74:
            if ((local_1d0 & 1) != 0) {
              operator_delete((void *)CONCAT17(uStack_1b9,
                                               CONCAT16(uStack_1ba,
                                                        CONCAT15(uStack_1bb,
                                                                 CONCAT23(uStack_1bd,
                                                                          CONCAT12(uStack_1be,
                                                                                   CONCAT11(
                                                  uStack_1bf,bStack_1c0)))))));
            }
            puVar39 = (uint *)CONCAT44(local_2f0._4_4_,(uint)local_2f0);
          }
          else {
            bVar8 = *param_3;
            uVar27 = (ulong)(bVar8 >> 1);
            if ((bVar8 & 1) != 0) {
              uVar27 = *(ulong *)(param_3 + 8);
            }
            if (uVar27 == 4) {
              if ((bVar8 & 1) != 0) {
                pbVar6 = *(byte **)(param_3 + 0x10);
              }
              if (*(int *)pbVar6 != 0x44414548) goto LAB_009749a8;
              local_2f0._0_4_ = 0;
              uStack_1c8 = 0;
              uStack_1c7 = 0;
              uStack_1c6 = 0;
              uStack_1c5 = 0;
              uStack_1c4 = 0;
              uStack_1c3 = 0;
              uStack_1c2 = 0;
              uStack_1c1 = 0;
              local_1d0 = 0;
              uStack_1cc = 0;
              uStack_1cb = 0;
              uStack_1c9 = 0;
              bStack_1c0 = (basic_ostream)0x0;
              uStack_1bf = 0;
              uStack_1be = 0;
              uStack_1bd = 0;
              uStack_1bb = 0;
              uStack_1ba = 0;
              uStack_1b9 = 0;
                    /* try { // try from 00974da0 to 00974da7 has its CatchHandler @ 00975fdc */
              puVar28 = operator_new(0x98);
              puVar28[2] = 0;
              *puVar28 = &PTR____shared_ptr_emplace_00c51878;
              puVar28[1] = 0;
                    /* try { // try from 00974dc4 to 00974df7 has its CatchHandler @ 00975fc8 */
              HttpResponse::HttpResponse
                        ((HttpResponse *)(puVar28 + 3),iVar22,(basic_string_conflict *)&local_460,
                         (HttpErrorCode *)&local_2f0,(map *)&local_430,
                         (basic_string_conflict *)&local_448,(basic_string_conflict *)&local_1d0,
                         uVar23,0);
              puVar39 = (uint *)CONCAT44(local_2f0._4_4_,(uint)local_2f0);
              *param_1_00 = (HttpResponse *)(puVar28 + 3);
              param_1_00[1] = puVar28;
            }
            else {
LAB_009749a8:
              bStack_1c0 = (basic_ostream)0x0;
              uStack_1bf = 0;
              uStack_1be = 0;
              uStack_1bd = 0;
              uStack_1bb = 0;
              uStack_1ba = 0;
              uStack_1b9 = 0;
              local_1d0 = 0x6e6f431c;
              uStack_1cc = 0x74;
              uStack_1cb = 0x6e65;
              uStack_1c9 = 0x74;
              uStack_1c8 = 0x2d;
              uStack_1c7 = 0x4c;
              uStack_1c6 = 0x65;
              uStack_1c5 = 0x6e;
              uStack_1c4 = 0x67;
              uStack_1c3 = 0x74;
              uStack_1c2 = 0x68;
              uStack_1c1 = 0;
              if (local_428 == (__tree_node *)0x0) {
LAB_00974a30:
                p_Var47 = (__tree_node *)&local_428;
              }
              else {
                p_Var47 = (__tree_node *)&local_428;
                p_Var50 = local_428;
                do {
                    /* try { // try from 009749f0 to 009749fb has its CatchHandler @ 00976950 */
                  uVar27 = CaseInsensitiveLess::operator()
                                     ((CaseInsensitiveLess *)&local_420,
                                      (basic_string_conflict *)(p_Var50 + 0x20),
                                      (basic_string_conflict *)&local_1d0);
                  lVar34 = 8;
                  if ((uVar27 & 1) == 0) {
                    lVar34 = 0;
                    p_Var47 = p_Var50;
                  }
                  p_Var50 = *(__tree_node **)(p_Var50 + lVar34);
                } while (p_Var50 != (__tree_node *)0x0);
                if (p_Var47 == (__tree_node *)&local_428) goto LAB_00974a30;
                    /* try { // try from 00974a20 to 00974a2b has its CatchHandler @ 00975fc0 */
                uVar27 = CaseInsensitiveLess::operator()
                                   ((CaseInsensitiveLess *)&local_420,
                                    (basic_string_conflict *)&local_1d0,
                                    (basic_string_conflict *)(p_Var47 + 0x20));
                if ((uVar27 & 1) != 0) goto LAB_00974a30;
              }
              if ((local_1d0 & 1) != 0) {
                operator_delete((void *)CONCAT17(uStack_1b9,
                                                 CONCAT16(uStack_1ba,
                                                          CONCAT15(uStack_1bb,
                                                                   CONCAT23(uStack_1bd,
                                                                            CONCAT12(uStack_1be,
                                                                                     CONCAT11(
                                                  uStack_1bf,bStack_1c0)))))));
              }
              if (p_Var47 == (__tree_node *)&local_428) {
                uStack_1bd = 0;
                uStack_1bb = 0;
                uStack_1ba = 0;
                uStack_1b9 = 0;
                uStack_1c7 = 0x2d;
                uStack_1c6 = 0x45;
                uStack_1c5 = 0x6e;
                uStack_1c4 = 99;
                uStack_1c3 = 0x6f;
                uStack_1c2 = 100;
                uStack_1c1 = 0x69;
                bStack_1c0 = (basic_ostream)0x6e;
                local_1d0 = 0x61725422;
                uStack_1cc = 0x6e;
                uStack_1cb = 0x6673;
                uStack_1c9 = 0x65;
                uStack_1c8 = 0x72;
                uStack_1bf = 0x67;
                uStack_1be = 0;
                if (local_428 == (__tree_node *)0x0) {
                  bVar20 = false;
                }
                else {
                  p_Var50 = local_428;
                  p_Var47 = (__tree_node *)&local_428;
                  do {
                    /* try { // try from 00974ca0 to 00974cab has its CatchHandler @ 00976914 */
                    uVar27 = CaseInsensitiveLess::operator()
                                       ((CaseInsensitiveLess *)&local_420,
                                        (basic_string_conflict *)(p_Var50 + 0x20),
                                        (basic_string_conflict *)&local_1d0);
                    lVar34 = 8;
                    if ((uVar27 & 1) == 0) {
                      lVar34 = 0;
                      p_Var47 = p_Var50;
                    }
                    p_Var50 = *(__tree_node **)(p_Var50 + lVar34);
                  } while (p_Var50 != (__tree_node *)0x0);
                  if (p_Var47 == (__tree_node *)&local_428) {
                    bVar20 = false;
                  }
                  else {
                    /* try { // try from 00974cd0 to 00974cdb has its CatchHandler @ 00975ea0 */
                    uVar27 = CaseInsensitiveLess::operator()
                                       ((CaseInsensitiveLess *)&local_420,
                                        (basic_string_conflict *)&local_1d0,
                                        (basic_string_conflict *)(p_Var47 + 0x20));
                    bVar20 = false;
                    if ((uVar27 & 1) == 0) {
                      local_5a8 = (function *)&local_2f0;
                      uStack_2dd = 0;
                      uStack_2e7 = 0x2d;
                      uStack_2e6 = 0x69646f636e45;
                      bStack_2e0 = (basic_ostream)0x6e;
                      local_2f0._0_4_ = 0x61725422;
                      local_2f0._4_4_ = 0x6566736e;
                      bStack_2e8 = 0x72;
                      uStack_2df = 0x67;
                    /* try { // try from 00974d10 to 00974d2b has its CatchHandler @ 00975e84 */
                      lVar34 = std::__ndk1::
                               __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                               ::
                               __emplace_unique_key_args<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::piecewise_construct_t_const&,std::__ndk1::tuple<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>&&>,std::__ndk1::tuple<>>
                                         ((basic_string_conflict *)&local_430,
                                          (piecewise_construct_t *)&local_2f0,(tuple *)&DAT_00749500
                                          ,(tuple *)&local_5a8);
                      bVar8 = *(byte *)(lVar34 + 0x38);
                      bVar20 = false;
                      uVar27 = (ulong)(bVar8 >> 1);
                      if ((bVar8 & 1) != 0) {
                        uVar27 = *(ulong *)(lVar34 + 0x40);
                      }
                      if (uVar27 == 7) {
                        pvVar44 = *(void **)(lVar34 + 0x48);
                        if ((bVar8 & 1) == 0) {
                          pvVar44 = (void *)(lVar34 + 0x39);
                        }
                        iVar22 = memcmp(pvVar44,"chunked",7);
                        bVar20 = iVar22 == 0;
                      }
                      if (((uint)local_2f0 & 1) != 0) {
                        operator_delete((void *)CONCAT53(uStack_2dd,CONCAT21(uStack_2df,bStack_2e0))
                                       );
                      }
                    }
                  }
                  if ((local_1d0 & 1) != 0) {
                    operator_delete((void *)CONCAT17(uStack_1b9,
                                                     CONCAT16(uStack_1ba,
                                                              CONCAT15(uStack_1bb,
                                                                       CONCAT23(uStack_1bd,
                                                                                CONCAT12(uStack_1be,
                                                                                         CONCAT11(
                                                  uStack_1bf,bStack_1c0)))))));
                  }
                }
                iVar22 = local_414;
                if (bVar20) {
                  bStack_1c0 = (basic_ostream)0x8;
                  uStack_1bf = 0xe5;
                  uStack_1be = 0xc4;
                  uStack_1bd = 0;
                  uStack_1bb = 0;
                  uStack_1ba = 0;
                  uStack_1b9 = 0;
                  local_150[0] = &PTR__basic_istream_00c4e640;
                  uStack_1c8 = 0;
                  uStack_1c7 = 0;
                  uStack_1c6 = 0;
                  uStack_1c5 = 0;
                  uStack_1c4 = 0;
                  uStack_1c3 = 0;
                  uStack_1c2 = 0;
                  uStack_1c1 = 0;
                  local_1d0 = 0xc4e618;
                  uStack_1cc = 0;
                  uStack_1cb = 0;
                  uStack_1c9 = 0;
                    /* try { // try from 00975254 to 0097525f has its CatchHandler @ 00975ed8 */
                  std::__ndk1::ios_base::init
                            ((ios_base *)local_150,
                             (basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                              *)&ppuStack_1b8);
                  local_c8 = 0;
                  local_c0 = 0xffffffff;
                  local_1d0 = 0xc4e4e0;
                  uStack_1cc = 0;
                  uStack_1cb = 0;
                  uStack_1c9 = 0;
                  local_150[0] = &PTR_FUN_00c4e530;
                  ppuStack_1b8 = &PTR__basic_streambuf_00c4e728;
                  bStack_1c0 = (basic_ostream)0x8;
                  uStack_1bf = 0xe5;
                  uStack_1be = 0xc4;
                  uStack_1bd = 0;
                  uStack_1bb = 0;
                  uStack_1ba = 0;
                  uStack_1b9 = 0;
                  std::__ndk1::locale::locale((locale *)&local_1b0);
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
                  do {
                    pcVar49 = local_5b8;
                    pvVar44 = pvStack_5c0;
                    uVar27 = local_5c8;
                    local_584 = (*(byte *)(*param_6 + 0x120) & 1) << 1 | 0xd;
                    bStack_2e8 = (byte)local_b0;
                    uStack_2e7 = (undefined1)((ulong)local_b0 >> 8);
                    uStack_2e6 = (undefined6)((ulong)local_b0 >> 0x10);
                    uStack_2df = (undefined2)((ulong)param_1 >> 8);
                    uVar13 = uStack_2df;
                    uStack_2dd = (undefined5)((ulong)param_1 >> 0x18);
                    uVar14 = uStack_2dd;
                    local_2f0._0_4_ = 0xc518d0;
                    local_2f0._4_4_ = 0;
                    bStack_2e0 = bVar15;
                    local_2d0 = &local_2f0;
                    /* try { // try from 00975388 to 00975393 has its CatchHandler @ 009767f8 */
                    Socket::readLine(*(function **)(param_1 + 0xa0));
                    local_530[0] = CONCAT31(local_530[0]._1_3_,local_5a8._0_1_);
                    if ((local_528 & 1) != 0) {
                      *local_518 = '\0';
                      pvStack_520 = (void *)0x0;
                      if ((local_528 & 1) != 0) {
                        operator_delete(local_518);
                      }
                    }
                    local_518 = local_590;
                    pvStack_520 = pvStack_598;
                    local_528 = local_5a0;
                    pvStack_598 = (void *)0x0;
                    local_590 = (char *)0x0;
                    local_5a0 = 0;
                    if (&local_2f0 == local_2d0) {
                      pcVar36 = *(code **)(*local_2d0 + 0x20);
LAB_0097540c:
                      (*pcVar36)();
                    }
                    else if (local_2d0 != (long *)0x0) {
                      pcVar36 = *(code **)(*local_2d0 + 0x28);
                      goto LAB_0097540c;
                    }
                    pcVar5 = (char *)((long)&local_528 + 1);
                    pvVar48 = (void *)(local_528 >> 1 & 0x7f);
                    if ((local_528 & 1) != 0) {
                      pcVar5 = local_518;
                      pvVar48 = pvStack_520;
                    }
                    /* try { // try from 0097542c to 00975433 has its CatchHandler @ 009767f0 */
                    std::__ndk1::
                    basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
                    assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                            *)&local_550,pcVar5,(ulong)pvVar48);
                    if (local_530[0]._0_1_ == (HttpErrorCode)0x0) {
                    /* try { // try from 00975d7c to 00975d83 has its CatchHandler @ 00975e7c */
                      puVar28 = operator_new(0x98);
                      puVar28[2] = 0;
                      *puVar28 = &PTR____shared_ptr_emplace_00c51878;
                      puVar28[1] = 0;
                    /* try { // try from 00975da4 to 00975dc7 has its CatchHandler @ 00975e68 */
                      HttpResponse::HttpResponse
                                ((HttpResponse *)(puVar28 + 3),local_414,
                                 (basic_string_conflict *)&local_460,(HttpErrorCode *)&local_584,
                                 (map *)&local_430,(basic_string_conflict *)&local_448,
                                 (basic_string_conflict *)&local_4e0,uVar23,0);
                      *param_1_00 = (HttpResponse *)(puVar28 + 3);
                      param_1_00[1] = puVar28;
                      iVar22 = 1;
                      goto LAB_00975dd4;
                    }
                    bStack_2e8 = 0;
                    uStack_2e7 = 0;
                    uStack_2e6 = 0;
                    local_2f0._0_4_ = 0;
                    local_2f0._4_4_ = 0;
                    bStack_2e0 = (basic_ostream)0x0;
                    uStack_2df = 0;
                    uStack_2dd = 0;
                    /* try { // try from 00975448 to 00975453 has its CatchHandler @ 009767d8 */
                    std::__ndk1::
                    basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                    ::str((basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                           *)&ppuStack_1b8,(basic_string_conflict *)&local_2f0);
                    if (((uint)local_2f0 & 1) != 0) {
                      operator_delete((void *)CONCAT53(uStack_2dd,CONCAT21(uStack_2df,bStack_2e0)));
                    }
                    lVar34 = *(long *)(CONCAT17(uStack_1b9,
                                                CONCAT16(uStack_1ba,
                                                         CONCAT15(uStack_1bb,
                                                                  CONCAT23(uStack_1bd,
                                                                           CONCAT12(uStack_1be,
                                                                                    CONCAT11(
                                                  uStack_1bf,bStack_1c0)))))) + -0x18);
                    pvVar48 = (void *)(local_550 >> 1 & 0x7f);
                    pcVar5 = pcVar42;
                    if ((local_550 & 1) != 0) {
                      pvVar48 = pvStack_548;
                      pcVar5 = local_540;
                    }
                    *(uint *)((basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                               *)&ppuStack_1b8 + lVar34) =
                         *(uint *)((basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                                    *)&ppuStack_1b8 + lVar34) & 0xffffffb5 | 8;
                    /* try { // try from 00975498 to 009754ab has its CatchHandler @ 00976830 */
                    std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                              (&bStack_1c0,pcVar5,(ulong)pvVar48);
                    std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::operator>>
                              ((basic_istream<char,std::__ndk1::char_traits<char>> *)&local_1d0,
                               (ulong *)&local_5b0);
                    lVar34 = *param_6;
                    if (*(char *)(lVar34 + 0x88) != '\0') {
                      bStack_2e0 = (basic_ostream)0x8;
                      uStack_2df = 0xc4e5;
                      uStack_2dd = 0;
                      local_270[0] = &PTR__basic_istream_00c4e640;
                      bStack_2e8 = 0;
                      uStack_2e7 = 0;
                      uStack_2e6 = 0;
                      local_2f0._0_4_ = 0xc4e618;
                      local_2f0._4_4_ = 0;
                    /* try { // try from 009754ec to 009754f7 has its CatchHandler @ 009767bc */
                      std::__ndk1::ios_base::init((ios_base *)local_270,&ppuStack_2d8);
                      local_1e8 = 0;
                      local_1e0 = 0xffffffff;
                      local_2f0._0_4_ = 0xc4e4e0;
                      local_2f0._4_4_ = 0;
                      local_270[0] = &PTR_FUN_00c4e530;
                      ppuStack_2d8 = &PTR__basic_streambuf_00c4e728;
                      bStack_2e0 = (basic_ostream)0x8;
                      uStack_2df = 0xc4e5;
                      uStack_2dd = 0;
                      std::__ndk1::locale::locale((locale *)&local_2d0);
                      uStack_2b0 = 0;
                      local_2b8 = 0;
                      uStack_2a0 = 0;
                      uStack_2a8 = 0;
                      uStack_2c0 = 0;
                      local_2c8 = 0;
                      ppuStack_2d8 = &PTR_LAB_00c4e678;
                      uStack_290 = 0;
                      local_298 = 0;
                      uStack_280 = 0;
                      local_288 = (void *)0x0;
                      local_278 = 0x18;
                    /* try { // try from 00975560 to 0097559f has its CatchHandler @ 00976838 */
                      pbVar26 = std::__ndk1::
                                __put_character_sequence<char,std::__ndk1::char_traits<char>>
                                          (&bStack_2e0,"Reading ",8);
                      pbVar26 = (basic_ostream *)
                                std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::
                                operator<<((basic_ostream<char,std::__ndk1::char_traits<char>> *)
                                           pbVar26,(ulong)local_5b0);
                      pbVar26 = std::__ndk1::
                                __put_character_sequence<char,std::__ndk1::char_traits<char>>
                                          (pbVar26," bytes",6);
                      std::__ndk1::ios_base::getloc();
                    /* try { // try from 009755a0 to 009755bf has its CatchHandler @ 009767c8 */
                      plVar25 = (long *)std::__ndk1::locale::use_facet
                                                  ((locale *)&local_5a8,
                                                   (id *)&std::__ndk1::ctype<char>::id);
                      cVar21 = (**(code **)(*plVar25 + 0x38))(plVar25,10);
                      std::__ndk1::locale::~locale((locale *)&local_5a8);
                    /* try { // try from 009755cc to 009755df has its CatchHandler @ 00976838 */
                      std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::put
                                ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar26,
                                 cVar21);
                      std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::flush
                                ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar26);
                    /* try { // try from 009755e0 to 009755eb has its CatchHandler @ 00976760 */
                      std::__ndk1::
                      basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                      ::str();
                      lVar34 = *param_6;
                      p_Var7 = (__shared_weak_count *)param_6[1];
                      if (p_Var7 != (__shared_weak_count *)0x0) {
                        p_Var2 = p_Var7 + 8;
                        do {
                          cVar21 = '\x01';
                          bVar20 = (bool)ExclusiveMonitorPass(p_Var2,0x10);
                          if (bVar20) {
                            *(long *)p_Var2 = *(long *)p_Var2 + 1;
                            cVar21 = ExclusiveMonitorsStatus();
                          }
                        } while (cVar21 != '\0');
                      }
                      plVar25 = *(long **)(lVar34 + 0xb0);
                      if (plVar25 != (long *)0x0) {
                    /* try { // try from 0097561c to 00975623 has its CatchHandler @ 00976710 */
                        (**(code **)(*plVar25 + 0x30))(plVar25,&local_5a8);
                      }
                      if (p_Var7 != (__shared_weak_count *)0x0) {
                        p_Var2 = p_Var7 + 8;
                        do {
                          lVar34 = *(long *)p_Var2;
                          cVar21 = '\x01';
                          bVar20 = (bool)ExclusiveMonitorPass(p_Var2,0x10);
                          if (bVar20) {
                            *(long *)p_Var2 = lVar34 + -1;
                            cVar21 = ExclusiveMonitorsStatus();
                          }
                        } while (cVar21 != '\0');
                        if (lVar34 == 0) {
                          (**(code **)(*(long *)p_Var7 + 0x10))(p_Var7);
                          std::__ndk1::__shared_weak_count::__release_weak(p_Var7);
                        }
                      }
                      if (((ulong)local_5a8 & 1) != 0) {
                        operator_delete(pvStack_598);
                      }
                      local_2f0._0_4_ = 0xc4e4e0;
                      local_2f0._4_4_ = 0;
                      local_270[0] = &PTR_FUN_00c4e530;
                      bStack_2e0 = (basic_ostream)0x8;
                      uStack_2df = 0xc4e5;
                      uStack_2dd = 0;
                      ppuStack_2d8 = &PTR_LAB_00c4e678;
                      if ((local_298 & 1) != 0) {
                        operator_delete(local_288);
                      }
                      ppuStack_2d8 = &PTR__basic_streambuf_00c4e728;
                      std::__ndk1::locale::~locale((locale *)&local_2d0);
                      std::__ndk1::ios_base::~ios_base((ios_base *)local_270);
                      lVar34 = *param_6;
                    }
                    local_2f0._0_4_ = 0xc518d0;
                    local_2f0._4_4_ = 0;
                    bStack_2e8 = (byte)local_b0;
                    bVar8 = bStack_2e8;
                    uStack_2e7 = (undefined1)((ulong)local_b0 >> 8);
                    uVar11 = uStack_2e7;
                    uStack_2e6 = (undefined6)((ulong)local_b0 >> 0x10);
                    uVar12 = uStack_2e6;
                    bStack_2e0 = bVar15;
                    uStack_2df = uVar13;
                    uStack_2dd = uVar14;
                    local_2d0 = &local_2f0;
                    /* try { // try from 00975704 to 0097570f has its CatchHandler @ 009767c4 */
                    Socket::readBytes(*(ulong *)(param_1 + 0xa0),local_5b0,
                                      (function *)(lVar34 + 0xc0),(function *)(lVar34 + 0xf0));
                    if (&local_2f0 == local_2d0) {
                      pcVar36 = *(code **)(*local_2d0 + 0x20);
LAB_00975734:
                      (*pcVar36)();
                    }
                    else if (local_2d0 != (long *)0x0) {
                      pcVar36 = *(code **)(*local_2d0 + 0x28);
                      goto LAB_00975734;
                    }
                    if (local_5a8._0_1_ == (tuple)0x0) {
                      local_2f0._0_4_ = (*(byte *)(*param_6 + 0x120) & 1) << 1 | 0xd;
                    /* try { // try from 009757f0 to 0097580b has its CatchHandler @ 009767a8 */
                      std::__ndk1::
                      basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                      ::assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                                *)&local_4e0,"Cannot read chunk",0x11);
                      puVar28 = operator_new(0x98);
                      pHVar43 = (HttpResponse *)(puVar28 + 3);
                      puVar28[1] = 0;
                      puVar28[2] = 0;
                      *puVar28 = &PTR____shared_ptr_emplace_00c51878;
                    /* try { // try from 00975824 to 00975847 has its CatchHandler @ 009766f0 */
                      HttpResponse::HttpResponse
                                (pHVar43,local_414,(basic_string_conflict *)&local_460,
                                 (HttpErrorCode *)&local_2f0,(map *)&local_430,
                                 (basic_string_conflict *)&local_448,
                                 (basic_string_conflict *)&local_4e0,uVar23,0);
LAB_00975934:
                      *param_1_00 = pHVar43;
                      param_1_00[1] = puVar28;
                      iVar22 = 1;
                    }
                    else {
                      if (*(long *)(*param_6 + 0x110) == 0) {
                        uVar29 = local_448 >> 1 & 0x7f;
                        if ((local_448 & 1) != 0) {
                          uVar29 = local_440;
                        }
                    /* try { // try from 00975768 to 00975793 has its CatchHandler @ 0097675c */
                        std::__ndk1::
                        basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                        ::reserve((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                                   *)&local_448,(ulong)(local_5b0 + uVar29));
                        pcVar5 = (char *)((long)&local_5a0 + 1);
                        pvVar48 = (void *)(local_5a0 >> 1 & 0x7f);
                        if ((local_5a0 & 1) != 0) {
                          pcVar5 = local_590;
                          pvVar48 = pvStack_598;
                        }
                        std::__ndk1::
                        basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                        ::append((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                                  *)&local_448,pcVar5,(ulong)pvVar48);
                      }
                      local_2f0._0_4_ = 0xc518d0;
                      local_2f0._4_4_ = 0;
                      bStack_2e8 = bVar8;
                      uStack_2e7 = uVar11;
                      uStack_2e6 = uVar12;
                      bStack_2e0 = bVar15;
                      uStack_2df = uVar13;
                      uStack_2dd = uVar14;
                      local_2d0 = &local_2f0;
                    /* try { // try from 009757b4 to 009757bf has its CatchHandler @ 00976764 */
                      Socket::readLine(*(function **)(param_1 + 0xa0));
                      local_530[0] = CONCAT31(local_530[0]._1_3_,local_5d0);
                      if ((local_528 & 1) != 0) {
                        *local_518 = '\0';
                        pvStack_520 = (void *)0x0;
                        if ((local_528 & 1) != 0) {
                          operator_delete(local_518);
                        }
                      }
                      pvStack_5c0 = (void *)0x0;
                      local_5b8 = (char *)0x0;
                      local_5c8 = 0;
                      local_518 = pcVar49;
                      pvStack_520 = pvVar44;
                      local_528 = uVar27;
                      if (&local_2f0 == local_2d0) {
                        pcVar36 = *(code **)(*local_2d0 + 0x20);
LAB_009758ac:
                        (*pcVar36)();
                      }
                      else if (local_2d0 != (long *)0x0) {
                        pcVar36 = *(code **)(*local_2d0 + 0x28);
                        goto LAB_009758ac;
                      }
                      if (local_530[0]._0_1_ == (HttpErrorCode)0x0) {
                        local_2f0._0_4_ = (*(byte *)(*param_6 + 0x120) & 1) << 1 | 0xd;
                    /* try { // try from 009758e8 to 009758ef has its CatchHandler @ 00976624 */
                        puVar28 = operator_new(0x98);
                        puVar28[2] = 0;
                        pHVar43 = (HttpResponse *)(puVar28 + 3);
                        *puVar28 = &PTR____shared_ptr_emplace_00c51878;
                        puVar28[1] = 0;
                    /* try { // try from 00975910 to 00975933 has its CatchHandler @ 00976620 */
                        HttpResponse::HttpResponse
                                  (pHVar43,local_414,(basic_string_conflict *)&local_460,
                                   (HttpErrorCode *)&local_2f0,(map *)&local_430,
                                   (basic_string_conflict *)&local_448,
                                   (basic_string_conflict *)&local_4e0,uVar23,0);
                        goto LAB_00975934;
                      }
                      iVar22 = 5;
                      if (local_5b0 != (function *)0x0) {
                        iVar22 = 0;
                      }
                    }
                    if ((local_5a0 & 1) != 0) {
                      operator_delete(local_590);
                    }
                  } while (iVar22 == 0);
                  if (iVar22 == 5) {
                    iVar22 = 0;
                  }
LAB_00975dd4:
                  local_1d0 = 0xc4e4e0;
                  uStack_1cc = 0;
                  uStack_1cb = 0;
                  uStack_1c9 = 0;
                  local_150[0] = &PTR_FUN_00c4e530;
                  bStack_1c0 = (basic_ostream)0x8;
                  uStack_1bf = 0xe5;
                  uStack_1be = 0xc4;
                  uStack_1bd = 0;
                  uStack_1bb = 0;
                  uStack_1ba = 0;
                  uStack_1b9 = 0;
                  ppuStack_1b8 = &PTR_LAB_00c4e678;
                  if ((local_178 & 1) != 0) {
                    operator_delete(local_168);
                  }
                  ppuStack_1b8 = &PTR__basic_streambuf_00c4e728;
                  std::__ndk1::locale::~locale((locale *)&local_1b0);
                  std::__ndk1::ios_base::~ios_base((ios_base *)local_150);
                  puVar39 = (uint *)CONCAT44(local_2f0._4_4_,(uint)local_2f0);
                  if (iVar22 != 0) goto LAB_00975bfc;
                }
                else if (local_414 != 0xcc) {
                  uStack_1b9 = 0;
                  uStack_1c7 = 0x65;
                  uStack_1c6 = 0x61;
                  uStack_1c5 = 100;
                  uStack_1c4 = 0x20;
                  uStack_1c3 = 0x68;
                  local_1d0 = 0x6e61432a;
                  uStack_1cc = 0x6e;
                  uStack_1cb = 0x746f;
                  uStack_1c9 = 0x20;
                  uStack_1c8 = 0x72;
                  uStack_1c2 = 0x74;
                  uStack_1c1 = 0x74;
                  bStack_1c0 = (basic_ostream)0x70;
                  uStack_1bf = 0x20;
                  uStack_1be = 0x62;
                  uStack_1bd = 0x646f;
                  uStack_1bb = 0x79;
                  uStack_1ba = 0;
                  local_2f0._0_4_ = 0xe;
                    /* try { // try from 00975d1c to 00975d23 has its CatchHandler @ 00975e98 */
                  puVar28 = operator_new(0x98);
                  puVar28[2] = 0;
                  *puVar28 = &PTR____shared_ptr_emplace_00c51878;
                  puVar28[1] = 0;
                    /* try { // try from 00975d40 to 00975d67 has its CatchHandler @ 00975e94 */
                  HttpResponse::HttpResponse
                            ((HttpResponse *)(puVar28 + 3),iVar22,
                             (basic_string_conflict *)&local_460,(HttpErrorCode *)&local_2f0,
                             (map *)&local_430,(basic_string_conflict *)&local_448,
                             (basic_string_conflict *)&local_1d0,uVar23,0);
                  *param_1_00 = (HttpResponse *)(puVar28 + 3);
                  param_1_00[1] = puVar28;
                  goto joined_r0x00975d74;
                }
              }
              else {
                uStack_1c8 = 0;
                uStack_1c7 = 0;
                uStack_1c6 = 0;
                uStack_1c5 = 0;
                uStack_1c4 = 0;
                uStack_1c3 = 0;
                uStack_1c2 = 0;
                uStack_1c1 = 0;
                local_1d0 = 0;
                uStack_1cc = 0;
                uStack_1cb = 0;
                uStack_1c9 = 0;
                local_5a8 = (function *)0xffffffffffffffff;
                bStack_1c0 = (basic_ostream)0x0;
                uStack_1bf = 0;
                uStack_1be = 0;
                uStack_1bd = 0;
                uStack_1bb = 0;
                uStack_1ba = 0;
                uStack_1b9 = 0;
                    /* try { // try from 00974a68 to 00974a73 has its CatchHandler @ 009760d0 */
                std::__ndk1::
                basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
                str((basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                     *)&ppuStack_3f8,(basic_string_conflict *)&local_1d0);
                if ((local_1d0 & 1) != 0) {
                  operator_delete((void *)CONCAT17(uStack_1b9,
                                                   CONCAT16(uStack_1ba,
                                                            CONCAT15(uStack_1bb,
                                                                     CONCAT23(uStack_1bd,
                                                                              CONCAT12(uStack_1be,
                                                                                       CONCAT11(
                                                  uStack_1bf,bStack_1c0)))))));
                }
                local_2f0 = &local_1d0;
                bStack_1c0 = (basic_ostream)0x0;
                uStack_1bf = 0;
                uStack_1be = 0;
                uStack_1bd = 0;
                uStack_1bb = 0;
                uStack_1ba = 0;
                uStack_1b9 = 0;
                local_1d0 = 0x6e6f431c;
                uStack_1cc = 0x74;
                uStack_1cb = 0x6e65;
                uStack_1c9 = 0x74;
                uStack_1c8 = 0x2d;
                uStack_1c7 = 0x4c;
                uStack_1c6 = 0x65;
                uStack_1c5 = 0x6e;
                uStack_1c4 = 0x67;
                uStack_1c3 = 0x74;
                uStack_1c2 = 0x68;
                uStack_1c1 = 0;
                    /* try { // try from 00974aa8 to 00974ae7 has its CatchHandler @ 009760d4 */
                lVar34 = std::__ndk1::
                         __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                         ::
                         __emplace_unique_key_args<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::piecewise_construct_t_const&,std::__ndk1::tuple<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>&&>,std::__ndk1::tuple<>>
                                   ((basic_string_conflict *)&local_430,
                                    (piecewise_construct_t *)&local_1d0,(tuple *)&DAT_00749500,
                                    (tuple *)&local_2f0);
                uVar27 = (ulong)(*(byte *)(lVar34 + 0x38) >> 1);
                pcVar42 = (char *)(lVar34 + 0x39);
                if ((*(byte *)(lVar34 + 0x38) & 1) != 0) {
                  uVar27 = *(ulong *)(lVar34 + 0x40);
                  pcVar42 = *(char **)(lVar34 + 0x48);
                }
                std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                          ((basic_ostream *)&local_400,pcVar42,uVar27);
                if ((local_1d0 & 1) != 0) {
                  operator_delete((void *)CONCAT17(uStack_1b9,
                                                   CONCAT16(uStack_1ba,
                                                            CONCAT15(uStack_1bb,
                                                                     CONCAT23(uStack_1bd,
                                                                              CONCAT12(uStack_1be,
                                                                                       CONCAT11(
                                                  uStack_1bf,bStack_1c0)))))));
                }
                    /* try { // try from 00974b08 to 00974b17 has its CatchHandler @ 009760c4 */
                std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::operator>>
                          ((basic_istream<char,std::__ndk1::char_traits<char>> *)&local_410,
                           (long *)&local_5a8);
                local_1d0 = 0xc518d0;
                uStack_1cc = 0;
                uStack_1cb = 0;
                uStack_1c9 = 0;
                uStack_1c8 = SUB81(local_b0,0);
                uStack_1c7 = (undefined1)((ulong)local_b0 >> 8);
                uStack_1c6 = (undefined1)((ulong)local_b0 >> 0x10);
                uStack_1c5 = (undefined1)((ulong)local_b0 >> 0x18);
                uStack_1c4 = (undefined1)((ulong)local_b0 >> 0x20);
                uStack_1c3 = (undefined1)((ulong)local_b0 >> 0x28);
                uStack_1c2 = (undefined1)((ulong)local_b0 >> 0x30);
                uStack_1c1 = (undefined1)((ulong)local_b0 >> 0x38);
                bStack_1c0 = bVar15;
                uStack_1bf = uVar11;
                uStack_1be = uVar16;
                uStack_1bd = uVar13;
                uStack_1bb = uVar17;
                uStack_1ba = uVar18;
                uStack_1b9 = uVar19;
                local_1b0 = &local_1d0;
                    /* try { // try from 00974b54 to 00974b5f has its CatchHandler @ 00976090 */
                Socket::readBytes(*(ulong *)(param_1 + 0xa0),local_5a8,(function *)(*param_6 + 0xc0)
                                  ,(function *)(*param_6 + 0xf0));
                if (&local_1d0 == local_1b0) {
                  pcVar36 = *(code **)(*(long *)local_1b0 + 0x20);
LAB_00974e14:
                  (*pcVar36)();
                }
                else if (local_1b0 != (uint *)0x0) {
                  pcVar36 = *(code **)(*(long *)local_1b0 + 0x28);
                  goto LAB_00974e14;
                }
                if (local_2f0._0_1_ == (HttpErrorCode)0x0) {
                  local_1d0 = (*(byte *)(*param_6 + 0x120) & 1) << 1 | 0xd;
                    /* try { // try from 00974e90 to 00974eab has its CatchHandler @ 0097607c */
                  std::__ndk1::
                  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
                  assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                          *)&local_4e0,"Cannot read chunk",0x11);
                  puVar28 = operator_new(0x98);
                  puVar28[2] = 0;
                  *puVar28 = &PTR____shared_ptr_emplace_00c51878;
                  puVar28[1] = 0;
                    /* try { // try from 00974ecc to 00974eef has its CatchHandler @ 00975fa0 */
                  HttpResponse::HttpResponse
                            ((HttpResponse *)(puVar28 + 3),local_414,
                             (basic_string_conflict *)&local_460,(HttpErrorCode *)&local_1d0,
                             (map *)&local_430,(basic_string_conflict *)&local_448,
                             (basic_string_conflict *)&local_4e0,uVar23,0);
                  *param_1_00 = (HttpResponse *)(puVar28 + 3);
                  param_1_00[1] = puVar28;
                  puVar39 = local_2f0;
                  if ((bStack_2e8 & 1) != 0) {
                    operator_delete(ppuStack_2d8);
                    puVar39 = local_2f0;
                  }
                  goto LAB_00975bfc;
                }
                if (*(long *)(*param_6 + 0x110) == 0) {
                    /* try { // try from 00974e30 to 00974e63 has its CatchHandler @ 00975fc4 */
                  std::__ndk1::
                  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
                  reserve((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                           *)&local_448,(ulong)local_5a8);
                  uVar27 = (ulong)(bStack_2e8 >> 1);
                  ppuVar10 = (undefined **)&uStack_2e7;
                  if ((bStack_2e8 & 1) != 0) {
                    uVar27 = CONCAT53(uStack_2dd,CONCAT21(uStack_2df,bStack_2e0));
                    ppuVar10 = ppuStack_2d8;
                  }
                  std::__ndk1::
                  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
                  append((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                          *)&local_448,(char *)ppuVar10,uVar27);
                }
                if ((bStack_2e8 & 1) != 0) {
                  operator_delete(ppuStack_2d8);
                }
              }
              local_2f0 = &local_1d0;
              uVar27 = local_448 >> 1 & 0x7f;
              if ((local_448 & 1) != 0) {
                uVar27 = local_440;
              }
              uStack_1be = 0;
              uStack_1bd = 0;
              uStack_1bb = 0;
              uStack_1ba = 0;
              uStack_1b9 = 0;
              uStack_1c7 = 0x45;
              uStack_1c6 = 0x6e;
              uStack_1c5 = 99;
              uStack_1c4 = 0x6f;
              uStack_1c3 = 100;
              uStack_1c2 = 0x69;
              uStack_1c1 = 0x6e;
              bStack_1c0 = (basic_ostream)0x67;
              local_1d0 = 0x6e6f4320;
              uStack_1cc = 0x74;
              uStack_1cb = 0x6e65;
              uStack_1c9 = 0x74;
              uStack_1c8 = 0x2d;
              uStack_1bf = 0;
                    /* try { // try from 009759e0 to 009759fb has its CatchHandler @ 00976078 */
              lVar34 = std::__ndk1::
                       __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                       ::
                       __emplace_unique_key_args<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::piecewise_construct_t_const&,std::__ndk1::tuple<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>&&>,std::__ndk1::tuple<>>
                                 ((basic_string_conflict *)&local_430,
                                  (piecewise_construct_t *)&local_1d0,(tuple *)&DAT_00749500,
                                  (tuple *)&local_2f0);
              bVar8 = *(byte *)(lVar34 + 0x38);
              bVar20 = false;
              uVar29 = (ulong)(bVar8 >> 1);
              if ((bVar8 & 1) != 0) {
                uVar29 = *(ulong *)(lVar34 + 0x40);
              }
              if (uVar29 == 4) {
                piVar41 = *(int **)(lVar34 + 0x48);
                if ((bVar8 & 1) == 0) {
                  piVar41 = (int *)(lVar34 + 0x39);
                }
                bVar20 = *piVar41 == 0x70697a67;
                if ((local_1d0 & 1) == 0) goto LAB_00975a60;
LAB_00975a48:
                operator_delete((void *)CONCAT17(uStack_1b9,
                                                 CONCAT16(uStack_1ba,
                                                          CONCAT15(uStack_1bb,
                                                                   CONCAT23(uStack_1bd,
                                                                            CONCAT12(uStack_1be,
                                                                                     CONCAT11(
                                                  uStack_1bf,bStack_1c0)))))));
                if (bVar20) {
LAB_00975a64:
                  uStack_1c8 = 0;
                  uStack_1c7 = 0;
                  uStack_1c6 = 0;
                  uStack_1c5 = 0;
                  uStack_1c4 = 0;
                  uStack_1c3 = 0;
                  uStack_1c2 = 0;
                  uStack_1c1 = 0;
                  local_1d0 = 0;
                  uStack_1cc = 0;
                  uStack_1cb = 0;
                  uStack_1c9 = 0;
                  bStack_1c0 = (basic_ostream)0x0;
                  uStack_1bf = 0;
                  uStack_1be = 0;
                  uStack_1bd = 0;
                  uStack_1bb = 0;
                  uStack_1ba = 0;
                  uStack_1b9 = 0;
                    /* try { // try from 00975a70 to 00975aab has its CatchHandler @ 00975ff0 */
                  uVar29 = gzipDecompress((basic_string_conflict *)&local_448,
                                          (basic_string_conflict *)&local_1d0);
                  if ((uVar29 & 1) == 0) {
                    bStack_2e8 = 0;
                    uStack_2e7 = 0;
                    uStack_2e6 = 0;
                    local_2f0._0_4_ = 0;
                    local_2f0._4_4_ = 0;
                    bStack_2e0 = (basic_ostream)0x0;
                    uStack_2df = 0;
                    uStack_2dd = 0;
                    /* try { // try from 00975b34 to 00975b3b has its CatchHandler @ 00975ed4 */
                    pcVar42 = operator_new(0x20);
                    bStack_2e0 = SUB81(pcVar42,0);
                    uStack_2df = (undefined2)((ulong)pcVar42 >> 8);
                    uStack_2dd = (undefined5)((ulong)pcVar42 >> 0x18);
                    builtin_strncpy(pcVar42,"Error decompressing payload",0x1c);
                    bStack_2e8 = 0x1b;
                    uStack_2e7 = 0;
                    uStack_2e6 = 0;
                    local_2f0._0_4_ = 0x21;
                    local_2f0._4_4_ = 0;
                    local_5a8 = (function *)CONCAT44(local_5a8._4_4_,3);
                    /* try { // try from 00975b70 to 00975b77 has its CatchHandler @ 00975ec8 */
                    puVar28 = operator_new(0x98);
                    puVar28[2] = 0;
                    *puVar28 = &PTR____shared_ptr_emplace_00c51878;
                    puVar28[1] = 0;
                    /* try { // try from 00975b98 to 00975bbb has its CatchHandler @ 00975ea4 */
                    HttpResponse::HttpResponse
                              ((HttpResponse *)(puVar28 + 3),local_414,
                               (basic_string_conflict *)&local_460,(HttpErrorCode *)&local_5a8,
                               (map *)&local_430,(basic_string_conflict *)&local_448,
                               (basic_string_conflict *)&local_2f0,uVar23,uVar27);
                    *param_1_00 = (HttpResponse *)(puVar28 + 3);
                    param_1_00[1] = puVar28;
                    if (((uint)local_2f0 & 1) != 0) {
                      operator_delete((void *)CONCAT53(uStack_2dd,CONCAT21(uStack_2df,bStack_2e0)));
                    }
                    goto joined_r0x00975d74;
                  }
                  uVar29 = (ulong)((byte)local_1d0._0_1_ >> 1);
                  pcVar42 = (char *)((ulong)&local_1d0 | 1);
                  if ((local_1d0 & 1) != 0) {
                    uVar29 = CONCAT17(uStack_1c1,
                                      CONCAT16(uStack_1c2,
                                               CONCAT15(uStack_1c3,
                                                        CONCAT14(uStack_1c4,
                                                                 CONCAT13(uStack_1c5,
                                                                          CONCAT12(uStack_1c6,
                                                                                   CONCAT11(
                                                  uStack_1c7,uStack_1c8)))))));
                    pcVar42 = (char *)CONCAT17(uStack_1b9,
                                               CONCAT16(uStack_1ba,
                                                        CONCAT15(uStack_1bb,
                                                                 CONCAT23(uStack_1bd,
                                                                          CONCAT12(uStack_1be,
                                                                                   CONCAT11(
                                                  uStack_1bf,bStack_1c0))))));
                  }
                  std::__ndk1::
                  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
                  assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                          *)&local_448,pcVar42,uVar29);
                  if ((local_1d0 & 1) != 0) {
                    operator_delete((void *)CONCAT17(uStack_1b9,
                                                     CONCAT16(uStack_1ba,
                                                              CONCAT15(uStack_1bb,
                                                                       CONCAT23(uStack_1bd,
                                                                                CONCAT12(uStack_1be,
                                                                                         CONCAT11(
                                                  uStack_1bf,bStack_1c0)))))));
                  }
                }
              }
              else {
                if ((local_1d0 & 1) != 0) goto LAB_00975a48;
LAB_00975a60:
                if (bVar20) goto LAB_00975a64;
              }
              local_2f0._0_4_ = 0;
              uStack_1c8 = 0;
              uStack_1c7 = 0;
              uStack_1c6 = 0;
              uStack_1c5 = 0;
              uStack_1c4 = 0;
              uStack_1c3 = 0;
              uStack_1c2 = 0;
              uStack_1c1 = 0;
              local_1d0 = 0;
              uStack_1cc = 0;
              uStack_1cb = 0;
              uStack_1c9 = 0;
              bStack_1c0 = (basic_ostream)0x0;
              uStack_1bf = 0;
              uStack_1be = 0;
              uStack_1bd = 0;
              uStack_1bb = 0;
              uStack_1ba = 0;
              uStack_1b9 = 0;
                    /* try { // try from 00975acc to 00975ad3 has its CatchHandler @ 00975fe8 */
              puVar28 = operator_new(0x98);
              puVar28[2] = 0;
              *puVar28 = &PTR____shared_ptr_emplace_00c51878;
              puVar28[1] = 0;
                    /* try { // try from 00975af4 to 00975b17 has its CatchHandler @ 00975fe4 */
              HttpResponse::HttpResponse
                        ((HttpResponse *)(puVar28 + 3),local_414,(basic_string_conflict *)&local_460
                         ,(HttpErrorCode *)&local_2f0,(map *)&local_430,
                         (basic_string_conflict *)&local_448,(basic_string_conflict *)&local_1d0,
                         uVar23,uVar27);
              puVar39 = (uint *)CONCAT44(local_2f0._4_4_,(uint)local_2f0);
              *param_1_00 = (HttpResponse *)(puVar28 + 3);
              param_1_00[1] = puVar28;
            }
            if ((local_1d0 & 1) != 0) goto LAB_00974c44;
          }
LAB_00975bfc:
          local_2f0 = puVar39;
          std::__ndk1::
          __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
          ::destroy((__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                     *)&local_568,local_560[0]);
        }
        else {
          if ((void *)0xffffffffffffffef < pvStack_520) {
                    /* try { // try from 00975e58 to 00975e5f has its CatchHandler @ 00976160 */
                    /* WARNING: Subroutine does not return */
            std::__ndk1::__basic_string_common<true>::__throw_length_error();
          }
          if (pvStack_520 < (void *)0x17) {
            pcVar49 = (char *)((ulong)&local_550 | 1);
            local_550 = (ulong)(byte)((int)pvStack_520 << 1);
            if (pvStack_520 != (void *)0x0) goto LAB_00974528;
          }
          else {
            uVar27 = (long)pvStack_520 + 0x10U & 0xfffffffffffffff0;
                    /* try { // try from 0097450c to 00974513 has its CatchHandler @ 00976160 */
            pcVar49 = operator_new(uVar27);
            local_550 = uVar27 | 1;
            pvStack_548 = pvVar44;
            local_540 = pcVar49;
LAB_00974528:
            memcpy(pcVar49,pcVar42,(size_t)pvVar44);
          }
          pcVar49[(long)pvVar44] = '\0';
          if (uVar45 != 0) goto LAB_009742dc;
LAB_00974544:
          uStack_1c8 = 0;
          uStack_1c7 = 0;
          uStack_1c6 = 0;
          uStack_1c5 = 0;
          uStack_1c4 = 0;
          uStack_1c3 = 0;
          uStack_1c2 = 0;
          uStack_1c1 = 0;
          local_1d0 = 0;
          uStack_1cc = 0;
          uStack_1cb = 0;
          uStack_1c9 = 0;
          bStack_1c0 = (basic_ostream)0x0;
          uStack_1bf = 0;
          uStack_1be = 0;
          uStack_1bd = 0;
          uStack_1bb = 0;
          uStack_1ba = 0;
          uStack_1b9 = 0;
          local_2f0._0_4_ = 8;
          if ((*(byte *)(*param_6 + 0x120) & 1) != 0) {
            local_2f0._0_4_ = 0xf;
          }
                    /* try { // try from 00974570 to 00974577 has its CatchHandler @ 00976208 */
          pcVar42 = operator_new(0x20);
          bStack_1c0 = SUB81(pcVar42,0);
          uStack_1bf = (undefined1)((ulong)pcVar42 >> 8);
          uStack_1be = (undefined1)((ulong)pcVar42 >> 0x10);
          uStack_1bd = (undefined2)((ulong)pcVar42 >> 0x18);
          uStack_1bb = (undefined1)((ulong)pcVar42 >> 0x28);
          uStack_1ba = (undefined1)((ulong)pcVar42 >> 0x30);
          uStack_1b9 = (undefined1)((ulong)pcVar42 >> 0x38);
          uStack_1c8 = 0x1b;
          uStack_1c7 = 0;
          uStack_1c6 = 0;
          uStack_1c5 = 0;
          uStack_1c4 = 0;
          uStack_1c3 = 0;
          uStack_1c2 = 0;
          uStack_1c1 = 0;
          local_1d0 = 0x21;
          uStack_1cc = 0;
          uStack_1cb = 0;
          uStack_1c9 = 0;
          builtin_strncpy(pcVar42,"Cannot retrieve status line",0x1c);
                    /* try { // try from 009745a4 to 009745b7 has its CatchHandler @ 009761f8 */
          puVar28 = operator_new(0x98);
          puVar28[2] = 0;
          pHVar43 = (HttpResponse *)(puVar28 + 3);
          *puVar28 = &PTR____shared_ptr_emplace_00c51878;
          puVar28[1] = 0;
                    /* try { // try from 009745dc to 009745ff has its CatchHandler @ 009761d8 */
          HttpResponse::HttpResponse
                    (pHVar43,local_414,(basic_string_conflict *)&local_460,
                     (HttpErrorCode *)&local_2f0,(map *)&local_430,
                     (basic_string_conflict *)&local_448,(basic_string_conflict *)&local_1d0,uVar23,
                     0);
LAB_00974728:
          *param_1_00 = pHVar43;
          param_1_00[1] = puVar28;
          if ((local_1d0 & 1) != 0) {
            operator_delete((void *)CONCAT17(uStack_1b9,
                                             CONCAT16(uStack_1ba,
                                                      CONCAT15(uStack_1bb,
                                                               CONCAT23(uStack_1bd,
                                                                        CONCAT12(uStack_1be,
                                                                                 CONCAT11(uStack_1bf
                                                                                          ,
                                                  bStack_1c0)))))));
          }
        }
        if ((local_550 & 1) != 0) {
          operator_delete(local_540);
        }
        if ((local_528 & 1) != 0) {
          operator_delete(local_518);
        }
      }
    }
    if (local_b0 == local_90) {
      pcVar36 = *(code **)(*(long *)local_90 + 0x20);
LAB_00975c58:
      (*pcVar36)();
    }
    else if (local_90 != (uint *)0x0) {
      pcVar36 = *(code **)(*(long *)local_90 + 0x28);
      goto LAB_00975c58;
    }
    if ((local_510 & 1) != 0) {
      operator_delete(local_500);
    }
    if (((byte)local_4f8[0] & 1) != 0) {
      operator_delete(local_4e8);
    }
    ppuStack_3f8 = &PTR_LAB_00c4e678;
    local_410 = &PTR_LAB_00c4e4e0;
    local_390[0] = &PTR_FUN_00c4e530;
    local_400 = &PTR_FUN_00c4e508;
    if ((local_3b8 & 1) != 0) {
      operator_delete(local_3a8);
    }
    ppuStack_3f8 = &PTR__basic_streambuf_00c4e728;
    std::__ndk1::locale::~locale(alStack_3f0);
    std::__ndk1::ios_base::~ios_base((ios_base *)local_390);
  }
  if ((local_4e0 & 1) != 0) {
    operator_delete(local_4d0);
  }
joined_r0x00973494:
  if ((local_4c0 & 1) != 0) {
    operator_delete(local_4b0);
  }
  if ((local_4a8 & 1) != 0) {
    operator_delete(local_498);
  }
  if ((local_490 & 1) != 0) {
    operator_delete(local_480);
  }
  if ((local_478 & 1) != 0) {
    operator_delete(local_468);
  }
  if ((local_460 & 1) != 0) {
    operator_delete(local_450);
  }
  if ((local_448 & 1) != 0) {
    operator_delete(local_438);
  }
  std::__ndk1::
  __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
  ::destroy((__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
             *)&local_430,local_428);
  std::__ndk1::recursive_mutex::unlock((recursive_mutex *)(param_1 + 0xa8));
  if (*(long *)(lVar9 + 0x28) != lVar33) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

