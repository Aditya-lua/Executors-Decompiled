/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098049c
 */

void FUN_0098049c(long param_1,long *param_2,undefined8 *param_3,undefined8 param_4,
                 undefined8 param_5,basic_string_conflict *param_6)

{
  __shared_weak_count *p_Var1;
  byte *pbVar2;
  ConnectionState *this;
  ulong uVar3;
  __shared_weak_count *this_00;
  __shared_weak_count *p_Var4;
  char cVar5;
  bool bVar6;
  long lVar7;
  char *pcVar8;
  int iVar9;
  long lVar10;
  byte *pbVar11;
  basic_ostream *pbVar12;
  long lVar13;
  byte *pbVar14;
  SocketServer *this_01;
  byte *pbVar15;
  byte *pbVar16;
  char local_2d8 [8];
  piecewise_construct_t *local_2d0 [2];
  void *local_2c0;
  __tree_node **local_2b8;
  __tree_node *local_2b0;
  undefined8 uStack_2a8;
  piecewise_construct_t local_2a0;
  undefined2 uStack_29f;
  undefined1 uStack_29d;
  undefined1 uStack_29c;
  undefined2 uStack_29b;
  undefined1 uStack_299;
  undefined1 uStack_298;
  undefined2 uStack_297;
  undefined1 uStack_295;
  undefined1 uStack_294;
  undefined2 uStack_293;
  undefined1 uStack_291;
  void *local_290;
  undefined8 local_288;
  undefined8 uStack_280;
  undefined8 local_278;
  undefined8 uStack_270;
  undefined8 uStack_268;
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
  
  lVar7 = tpidr_el0;
  lVar13 = *(long *)(lVar7 + 0x28);
  pbVar2 = (byte *)*param_2;
  this_00 = (__shared_weak_count *)param_2[1];
  *param_2 = 0;
  param_2[1] = 0;
  this = (ConnectionState *)*param_3;
  p_Var4 = (__shared_weak_count *)param_3[1];
  *param_3 = 0;
  param_3[1] = 0;
  this_01 = *(SocketServer **)(param_1 + 8);
  local_2b8 = &local_2b0;
  local_2b0 = (__tree_node *)0x0;
  uStack_2a8 = 0;
                    /* try { // try from 009804f4 to 009804fb has its CatchHandler @ 00980c94 */
  ix::userAgent();
  local_2d0[0] = &local_2a0;
  uStack_298 = 0;
  uStack_297 = 0;
  uStack_295 = 0;
  uStack_294 = 0;
  uStack_293 = 0;
  uStack_291 = 0;
  local_290 = (void *)0x0;
  local_2a0 = (piecewise_construct_t)0xc;
  uStack_29b = 0x7265;
  uStack_29f = 0x6553;
  uStack_29d = 0x72;
  uStack_29c = 0x76;
  uStack_299 = 0;
                    /* try { // try from 00980528 to 00980543 has its CatchHandler @ 00980c68 */
  lVar10 = std::__ndk1::
           __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
           ::
           __emplace_unique_key_args<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::piecewise_construct_t_const&,std::__ndk1::tuple<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>&&>,std::__ndk1::tuple<>>
                     ((basic_string_conflict *)&local_2b8,&local_2a0,(tuple *)&DAT_007497e2,
                      (tuple *)local_2d0);
  pbVar16 = (byte *)(lVar10 + 0x38);
  if ((*pbVar16 & 1) == 0) {
    pbVar16[0] = 0;
    pbVar16[1] = 0;
  }
  else {
    **(undefined1 **)(lVar10 + 0x48) = 0;
    *(undefined8 *)(lVar10 + 0x40) = 0;
    if ((*(byte *)(lVar10 + 0x38) & 1) != 0) {
      operator_delete(*(void **)(lVar10 + 0x48));
      *(undefined8 *)(lVar10 + 0x38) = 0;
    }
  }
  *(undefined ***)(lVar10 + 0x48) = local_180;
  *(undefined8 *)(lVar10 + 0x40) = uStack_188;
  *(undefined ***)pbVar16 = local_190;
  local_190 = (undefined **)0x0;
  uStack_188 = 0;
  local_180 = (void *)0x0;
  if ((((byte)local_2a0 & 1) != 0) && (operator_delete(local_290), ((ulong)local_190 & 1) != 0)) {
    operator_delete(local_180);
  }
  local_180 = &PTR_FUN_00c4e508;
  local_110[0] = &PTR__basic_istream_00c4e640;
  uStack_188 = 0;
  local_190 = &PTR__basic_istream_00c4e618;
                    /* try { // try from 009805f8 to 00980603 has its CatchHandler @ 00980c60 */
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
                    /* try { // try from 00980674 to 0098070f has its CatchHandler @ 00980cb4 */
  pbVar11 = (byte *)ix::ConnectionState::getRemoteIp(this);
  uVar3 = *(ulong *)(pbVar11 + 8);
  pbVar16 = *(byte **)(pbVar11 + 0x10);
  if ((*pbVar11 & 1) == 0) {
    pbVar16 = pbVar11 + 1;
    uVar3 = (ulong)(*pbVar11 >> 1);
  }
  pbVar12 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                      ((basic_ostream *)&local_180,(char *)pbVar16,uVar3);
  pbVar12 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                      (pbVar12,":",1);
  iVar9 = ix::ConnectionState::getRemotePort(this);
  pbVar12 = (basic_ostream *)
            std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::operator<<
                      ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar12,iVar9);
  pbVar12 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                      (pbVar12," ",1);
  uVar3 = (ulong)(pbVar2[0x18] >> 1);
  pbVar16 = pbVar2 + 0x19;
  if ((pbVar2[0x18] & 1) != 0) {
    uVar3 = *(ulong *)(pbVar2 + 0x20);
    pbVar16 = *(byte **)(pbVar2 + 0x28);
  }
  pbVar12 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                      (pbVar12,(char *)pbVar16,uVar3);
  pbVar12 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                      (pbVar12," ",1);
  local_2d0[0] = &local_2a0;
  uStack_294 = 0;
  uStack_293 = 0;
  uStack_291 = 0;
  local_290 = (void *)0x0;
  local_2a0 = (piecewise_construct_t)0x14;
  uStack_297 = 0x746e;
  uStack_29f = 0x7355;
  uStack_29d = 0x65;
  uStack_29c = 0x72;
  uStack_29b = 0x412d;
  uStack_299 = 0x67;
  uStack_298 = 0x65;
  uStack_295 = 0;
                    /* try { // try from 0098074c to 009807b7 has its CatchHandler @ 00980c9c */
  lVar10 = std::__ndk1::
           __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
           ::
           __emplace_unique_key_args<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::piecewise_construct_t_const&,std::__ndk1::tuple<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>&&>,std::__ndk1::tuple<>>
                     ((basic_string_conflict *)(pbVar2 + 0x60),&local_2a0,(tuple *)&DAT_007497e2,
                      (tuple *)local_2d0);
  uVar3 = (ulong)(*(byte *)(lVar10 + 0x38) >> 1);
  pcVar8 = (char *)(lVar10 + 0x39);
  if ((*(byte *)(lVar10 + 0x38) & 1) != 0) {
    uVar3 = *(ulong *)(lVar10 + 0x40);
    pcVar8 = *(char **)(lVar10 + 0x48);
  }
  pbVar12 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                      (pbVar12,pcVar8,uVar3);
  pbVar12 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                      (pbVar12," ",1);
  uVar3 = *(ulong *)(pbVar2 + 8);
  pbVar16 = *(byte **)(pbVar2 + 0x10);
  if ((*pbVar2 & 1) == 0) {
    pbVar16 = pbVar2 + 1;
    uVar3 = (ulong)(*pbVar2 >> 1);
  }
  std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
            (pbVar12,(char *)pbVar16,uVar3);
  if (((byte)local_2a0 & 1) != 0) {
    operator_delete(local_290);
  }
                    /* try { // try from 009807c8 to 009807d3 has its CatchHandler @ 00980c58 */
  std::__ndk1::basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
  str();
                    /* try { // try from 009807d4 to 009807df has its CatchHandler @ 00980c54 */
  ix::SocketServer::logInfo(this_01,(basic_string_conflict *)&local_2a0);
  if (((byte)local_2a0 & 1) != 0) {
    operator_delete(local_290);
  }
  local_290 = (void *)0x0;
  local_2a0 = (piecewise_construct_t)0x1c;
  uStack_29f = 0x3d3d;
  uStack_29d = 0x20;
  uStack_29c = 0x48;
  uStack_29b = 0x6165;
  uStack_299 = 100;
  uStack_298 = 0x65;
  uStack_297 = 0x7372;
  uStack_295 = 0x20;
  uStack_294 = 0x3d;
  uStack_293 = 0x203d;
  uStack_291 = 0;
                    /* try { // try from 00980818 to 00980823 has its CatchHandler @ 00980c50 */
  ix::SocketServer::logInfo(this_01,(basic_string_conflict *)&local_2a0);
  if (((byte)local_2a0 & 1) != 0) {
    operator_delete(local_290);
  }
  pbVar16 = pbVar2 + 0x68;
  if (*(byte **)(pbVar2 + 0x60) != pbVar16) {
    pbVar11 = *(byte **)(pbVar2 + 0x60);
    do {
      while( true ) {
        local_2a0 = (piecewise_construct_t)0xc8;
        uStack_29f = 0xc517;
        uStack_29d = 0;
        uStack_29c = 0;
        uStack_29b = 0;
        uStack_299 = 0;
        local_230[0] = &PTR__basic_ostream_00c517f0;
                    /* try { // try from 009808a4 to 009808af has its CatchHandler @ 00980cec */
        std::__ndk1::ios_base::init((ios_base *)local_230,(void *)((ulong)&local_2a0 | 8));
        local_1a0 = 0xffffffff;
        local_230[0] = &PTR_FUN_00c51798;
        local_1a8 = 0;
        uStack_298 = 0x28;
        uStack_297 = 0xc4e7;
        uStack_295 = 0;
        uStack_294 = 0;
        uStack_293 = 0;
        uStack_291 = 0;
        local_2a0 = (piecewise_construct_t)0x70;
        uStack_29f = 0xc517;
        uStack_29d = 0;
        uStack_29c = 0;
        uStack_29b = 0;
        uStack_299 = 0;
        std::__ndk1::locale::locale((locale *)&local_290);
        uStack_270 = 0;
        local_278 = 0;
        uStack_260 = 0;
        uStack_268 = 0;
        uStack_280 = 0;
        local_288 = 0;
        uStack_298 = 0x78;
        uStack_297 = 0xc4e6;
        uStack_295 = 0;
        uStack_294 = 0;
        uStack_293 = 0;
        uStack_291 = 0;
        uStack_250 = 0;
        local_258 = 0;
        uStack_240 = 0;
        local_248 = (void *)0x0;
        local_238 = 0x10;
        uVar3 = *(ulong *)(pbVar11 + 0x28);
        pbVar14 = *(byte **)(pbVar11 + 0x30);
        if ((pbVar11[0x20] & 1) == 0) {
          pbVar14 = pbVar11 + 0x21;
          uVar3 = (ulong)(pbVar11[0x20] >> 1);
        }
                    /* try { // try from 0098091c to 00980953 has its CatchHandler @ 00980d08 */
        pbVar12 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                            ((basic_ostream *)&local_2a0,(char *)pbVar14,uVar3);
        pbVar12 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                            (pbVar12,": ",2);
        uVar3 = (ulong)(pbVar11[0x38] >> 1);
        pbVar14 = pbVar11 + 0x39;
        if ((pbVar11[0x38] & 1) != 0) {
          uVar3 = *(ulong *)(pbVar11 + 0x40);
          pbVar14 = *(byte **)(pbVar11 + 0x48);
        }
        std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                  (pbVar12,(char *)pbVar14,uVar3);
                    /* try { // try from 00980954 to 0098095f has its CatchHandler @ 00980ce8 */
        std::__ndk1::
        basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::str();
                    /* try { // try from 00980960 to 0098096b has its CatchHandler @ 00980cc4 */
        ix::SocketServer::logInfo(this_01,(basic_string_conflict *)local_2d0);
        if (((ulong)local_2d0[0] & 1) != 0) {
          operator_delete(local_2c0);
        }
        local_230[0] = &PTR_FUN_00c51798;
        local_2a0 = (piecewise_construct_t)0x70;
        uStack_29f = 0xc517;
        uStack_29d = 0;
        uStack_29c = 0;
        uStack_29b = 0;
        uStack_299 = 0;
        uStack_298 = 0x78;
        uStack_297 = 0xc4e6;
        uStack_295 = 0;
        uStack_294 = 0;
        uStack_293 = 0;
        uStack_291 = 0;
        if ((local_258 & 1) != 0) {
          operator_delete(local_248);
        }
        uStack_298 = 0x28;
        uStack_297 = 0xc4e7;
        uStack_295 = 0;
        uStack_294 = 0;
        uStack_293 = 0;
        uStack_291 = 0;
        std::__ndk1::locale::~locale((locale *)&local_290);
        std::__ndk1::ios_base::~ios_base((ios_base *)local_230);
        pbVar14 = *(byte **)(pbVar11 + 8);
        if (*(byte **)(pbVar11 + 8) == (byte *)0x0) break;
        do {
          pbVar11 = pbVar14;
          pbVar14 = *(byte **)pbVar11;
        } while (*(byte **)pbVar11 != (byte *)0x0);
LAB_00980a0c:
        if (pbVar11 == pbVar16) goto LAB_00980a24;
      }
      pbVar14 = pbVar11 + 0x10;
      pbVar15 = *(byte **)pbVar14;
      if (*(byte **)pbVar15 != pbVar11) {
        do {
          lVar10 = *(long *)pbVar14;
          pbVar14 = (byte *)(lVar10 + 0x10);
          pbVar11 = *(byte **)pbVar14;
        } while (*(long *)pbVar11 != lVar10);
        goto LAB_00980a0c;
      }
      pbVar11 = pbVar15;
    } while (pbVar15 != pbVar16);
  }
LAB_00980a24:
  local_2a0 = (piecewise_construct_t)0x0;
  uStack_29f = 0;
  uStack_29d = 0;
  uStack_29c = 0;
  uStack_29b = 0;
  uStack_299 = 0;
  uStack_298 = 0;
  uStack_297 = 0;
  uStack_295 = 0;
  uStack_294 = 0;
  uStack_293 = 0;
  uStack_291 = 0;
  local_290 = (void *)0x0;
                    /* try { // try from 00980a2c to 00980a37 has its CatchHandler @ 00980c38 */
  ix::SocketServer::logInfo(this_01,(basic_string_conflict *)&local_2a0);
  if (((byte)local_2a0 & 1) != 0) {
    operator_delete(local_290);
  }
  uStack_293 = 0;
  uStack_291 = 0;
  local_2a0 = (piecewise_construct_t)0x16;
  local_290 = (void *)0x0;
  uStack_297 = 0x3d3d;
  uStack_295 = 0x20;
  uStack_294 = 0;
  uStack_29f = 0x3d3d;
  uStack_29d = 0x20;
  uStack_29c = 0x42;
  uStack_29b = 0x646f;
  uStack_299 = 0x79;
  uStack_298 = 0x20;
                    /* try { // try from 00980a7c to 00980a87 has its CatchHandler @ 00980c34 */
  ix::SocketServer::logInfo(this_01,(basic_string_conflict *)&local_2a0);
  if (((byte)local_2a0 & 1) != 0) {
    operator_delete(local_290);
  }
                    /* try { // try from 00980a9c to 00980aa3 has its CatchHandler @ 00980cb4 */
  ix::SocketServer::logInfo(this_01,(basic_string_conflict *)(pbVar2 + 0x48));
  local_2a0 = (piecewise_construct_t)0x0;
  uStack_29f = 0;
  uStack_29d = 0;
  uStack_29c = 0;
  uStack_29b = 0;
  uStack_299 = 0;
  uStack_298 = 0;
  uStack_297 = 0;
  uStack_295 = 0;
  uStack_294 = 0;
  uStack_293 = 0;
  uStack_291 = 0;
  local_290 = (void *)0x0;
                    /* try { // try from 00980aac to 00980ab7 has its CatchHandler @ 00980c30 */
  ix::SocketServer::logInfo(this_01,(basic_string_conflict *)&local_2a0);
  if (((byte)local_2a0 & 1) != 0) {
    operator_delete(local_290);
  }
  local_2d8[0] = '\0';
  local_2d8[1] = '\0';
  local_2d8[2] = '\0';
  local_2d8[3] = '\0';
  uStack_29c = 0;
  uStack_29b = 0;
  uStack_299 = 0;
  uStack_298 = 0;
  uStack_297 = 0;
  uStack_295 = 0;
  uStack_294 = 0;
  uStack_293 = 0;
  uStack_291 = 0;
  local_290 = (void *)0x0;
  local_2d0[0] = (piecewise_construct_t *)CONCAT44(local_2d0[0]._4_4_,200);
  local_2a0 = (piecewise_construct_t)0x4;
  uStack_29f = 0x4b4f;
  uStack_29d = 0;
                    /* try { // try from 00980af4 to 00980b1b has its CatchHandler @ 00980c2c */
  std::__ndk1::shared_ptr<ix::HttpResponse>::
  make_shared<int,char_const(&)[3],ix::HttpErrorCode,std::__ndk1::map<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,ix::CaseInsensitiveLess,std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>&,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>
            ((shared_ptr<ix::HttpResponse> *)local_2d0,(int *)&DAT_002af2e0,local_2d8,
             (HttpErrorCode *)&local_2b8,(map *)&local_2a0,param_6);
  if (((byte)local_2a0 & 1) != 0) {
    operator_delete(local_290);
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
  std::__ndk1::
  __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
  ::destroy((__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
             *)&local_2b8,local_2b0);
  if (p_Var4 != (__shared_weak_count *)0x0) {
    p_Var1 = p_Var4 + 8;
    do {
      lVar10 = *(long *)p_Var1;
      cVar5 = '\x01';
      bVar6 = (bool)ExclusiveMonitorPass(p_Var1,0x10);
      if (bVar6) {
        *(long *)p_Var1 = lVar10 + -1;
        cVar5 = ExclusiveMonitorsStatus();
      }
    } while (cVar5 != '\0');
    if (lVar10 == 0) {
      (**(code **)(*(long *)p_Var4 + 0x10))(p_Var4);
      std::__ndk1::__shared_weak_count::__release_weak(p_Var4);
    }
  }
  if (this_00 != (__shared_weak_count *)0x0) {
    p_Var4 = this_00 + 8;
    do {
      lVar10 = *(long *)p_Var4;
      cVar5 = '\x01';
      bVar6 = (bool)ExclusiveMonitorPass(p_Var4,0x10);
      if (bVar6) {
        *(long *)p_Var4 = lVar10 + -1;
        cVar5 = ExclusiveMonitorsStatus();
      }
    } while (cVar5 != '\0');
    if (lVar10 == 0) {
      (**(code **)(*(long *)this_00 + 0x10))(this_00);
      std::__ndk1::__shared_weak_count::__release_weak(this_00);
    }
  }
  if (*(long *)(lVar7 + 0x28) != lVar13) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

