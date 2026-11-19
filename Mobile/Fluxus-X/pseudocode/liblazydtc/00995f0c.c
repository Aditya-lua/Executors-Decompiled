/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00995f0c
 */

/* WARNING: Type propagation algorithm not settling */
/* WARNING: Restarted to delay deadcode elimination for space: stack */
/* ix::WebSocketTransport::connectToUrl(std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&,
   std::__ndk1::map<std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> >, std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> >, ix::CaseInsensitiveLess,
   std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const,
   std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >
   > > const&, int) */

void __thiscall
ix::WebSocketTransport::connectToUrl
          (WebSocketTransport *this,basic_string_conflict *param_1,map *param_2,int param_3)

{
  __tree_node *p_Var1;
  WebSocketTransport *pWVar2;
  WebSocketTransport *pWVar3;
  long lVar4;
  __tree_node *p_Var5;
  long lVar6;
  undefined1 *puVar7;
  undefined8 uVar8;
  ulong uVar9;
  undefined8 uVar10;
  int iVar11;
  ulong uVar12;
  ix *this_00;
  long *plVar13;
  WebSocketPerMessageDeflate *this_01;
  undefined8 uVar14;
  basic_ostream *pbVar15;
  basic_string_conflict *pbVar16;
  undefined8 *in_x8;
  long lVar17;
  int iVar18;
  WebSocketPerMessageDeflate *this_02;
  __tree_node *p_Var19;
  void *pvVar20;
  __tree_node *p_Var21;
  uint uVar22;
  void *pvVar23;
  ulong uVar24;
  ulong local_318;
  undefined8 uStack_310;
  undefined1 *local_308;
  ulong local_300;
  undefined8 uStack_2f8;
  void *local_2f0;
  __tree_node **local_2d8;
  __tree_node *local_2d0;
  undefined8 uStack_2c8;
  ulong local_2c0;
  undefined8 uStack_2b8;
  void *local_2b0;
  __tree_node **pp_Stack_2a8;
  __tree_node *local_2a0;
  undefined8 uStack_298;
  __tree_node **local_290;
  __tree_node *local_288;
  undefined8 uStack_280;
  undefined4 local_278;
  int iStack_274;
  ulong local_270;
  undefined8 uStack_268;
  undefined1 *local_260;
  __tree_node *local_258;
  __tree_node *local_250;
  long local_248;
  ulong local_240;
  undefined8 uStack_238;
  void *local_230;
  ulong local_228;
  undefined8 uStack_220;
  void *local_218;
  ulong local_210;
  ulong uStack_208;
  void *local_200;
  int local_1f4;
  ulong local_1f0;
  undefined8 local_1e8;
  void *local_1e0;
  ulong local_1d8;
  undefined8 local_1d0;
  void *local_1c8;
  ulong local_1c0;
  undefined8 local_1b8;
  void *local_1b0;
  ulong local_1a8;
  ulong local_1a0;
  void *local_198;
  WebSocketInitResult local_190;
  undefined7 uStack_18f;
  byte bStack_188;
  undefined1 uStack_187;
  undefined6 uStack_186;
  undefined **local_180;
  undefined **ppuStack_178;
  __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
  a_Stack_170 [8];
  __tree_node *local_168;
  undefined8 uStack_160;
  ulong local_158;
  undefined8 uStack_150;
  void *local_148;
  ulong uStack_140;
  ulong local_138;
  void *pvStack_130;
  void *local_128;
  undefined8 uStack_120;
  undefined4 local_118;
  undefined **local_110 [17];
  undefined8 local_88;
  undefined4 local_80;
  
  lVar6 = tpidr_el0;
  lVar17 = *(long *)(lVar6 + 0x28);
  std::__ndk1::mutex::lock((mutex *)(this + 0xb8));
  local_1a0 = 0;
  local_1a8 = 0;
  local_198 = (void *)0x0;
  local_1b8 = 0;
  local_1c0 = 0;
  local_1b0 = (void *)0x0;
  local_1d0 = 0;
  local_1d8 = 0;
  local_1c8 = (void *)0x0;
  local_1e8 = 0;
  local_1f0 = 0;
  local_1e0 = (void *)0x0;
  uStack_208 = 0;
  local_200 = (void *)0x0;
  local_210 = 0;
  if (((byte)*param_1 & 1) == 0) {
    local_200 = *(void **)(param_1 + 0x10);
    uStack_208 = *(ulong *)(param_1 + 8);
    local_210 = *(ulong *)param_1;
    goto LAB_00996014;
  }
  uVar12 = *(ulong *)(param_1 + 8);
  if (0xffffffffffffffef < uVar12) {
                    /* try { // try from 00996a7c to 00996a83 has its CatchHandler @ 00996ac8 */
                    /* WARNING: Subroutine does not return */
    std::__ndk1::__basic_string_common<true>::__throw_length_error();
  }
  pvVar20 = *(void **)(param_1 + 0x10);
  if (uVar12 < 0x17) {
    pvVar23 = (void *)((ulong)&local_210 | 1);
    local_210 = (ulong)(byte)((int)uVar12 << 1);
    if (uVar12 != 0) goto LAB_00996000;
  }
  else {
    uVar24 = uVar12 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 00995fe8 to 00995fef has its CatchHandler @ 00996ac8 */
    pvVar23 = operator_new(uVar24);
    local_210 = uVar24 | 1;
    uStack_208 = uVar12;
    local_200 = pvVar23;
LAB_00996000:
    memcpy(pvVar23,pvVar20,uVar12);
  }
  *(undefined1 *)((long)pvVar23 + uVar12) = 0;
LAB_00996014:
  local_290 = &local_288;
  bStack_188 = 0;
  uStack_187 = 0;
  uStack_186 = 0;
  local_190 = (WebSocketInitResult)0x0;
  uStack_18f = 0;
  local_180 = (undefined **)0x0;
  local_288 = (__tree_node *)0x0;
  uStack_280 = 0;
  local_300 = 0;
  uStack_2f8 = 0;
  local_2f0 = (void *)0x0;
                    /* try { // try from 00996038 to 00996053 has its CatchHandler @ 00996b74 */
  WebSocketInitResult::WebSocketInitResult
            ((WebSocketInitResult *)&local_278,0,0,&local_190,&local_290,&local_300);
  if ((local_300 & 1) != 0) {
    operator_delete(local_2f0);
  }
  std::__ndk1::
  __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
  ::destroy((__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
             *)&local_290,local_288);
  if (((byte)local_190 & 1) != 0) {
    operator_delete(local_180);
  }
  p_Var1 = (__tree_node *)(in_x8 + 5);
  uVar22 = 0;
  pWVar2 = this + 0xb0;
  pWVar3 = this + 0x178;
  do {
                    /* try { // try from 00996180 to 0099619b has its CatchHandler @ 00996cac */
    pbVar16 = (basic_string_conflict *)&local_1f0;
    uVar12 = UrlParser::parse((basic_string_conflict *)&local_210,
                              (basic_string_conflict *)&local_1a8,
                              (basic_string_conflict *)&local_1c0,
                              (basic_string_conflict *)&local_1d8,pbVar16,&local_1f4);
    if ((uVar12 & 1) == 0) {
      local_180 = &PTR_FUN_00c4e508;
      local_110[0] = &PTR__basic_istream_00c4e640;
      bStack_188 = 0;
      uStack_187 = 0;
      uStack_186 = 0;
      local_190 = (WebSocketInitResult)0x18;
      uStack_18f = 0xc4e6;
                    /* try { // try from 00996750 to 0099675b has its CatchHandler @ 00996ac0 */
      std::__ndk1::ios_base::init((ios_base *)local_110,&ppuStack_178);
      local_88 = 0;
      local_80 = 0xffffffff;
      local_190 = (WebSocketInitResult)0xe0;
      uStack_18f = 0xc4e4;
      local_110[0] = &PTR_FUN_00c4e530;
      ppuStack_178 = &PTR__basic_streambuf_00c4e728;
      local_180 = &PTR_FUN_00c4e508;
      std::__ndk1::locale::locale((locale *)a_Stack_170);
      uStack_140 = 0;
      local_148 = (void *)0x0;
      uStack_150 = 0;
      local_158 = 0;
      uStack_160 = 0;
      local_168 = (__tree_node *)0x0;
      ppuStack_178 = &PTR_LAB_00c4e678;
      uStack_120 = 0;
      local_128 = (void *)0x0;
      pvStack_130 = (void *)0x0;
      local_138 = 0;
      local_118 = 0x18;
                    /* try { // try from 009967d0 to 00996817 has its CatchHandler @ 00996b08 */
      pbVar15 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                          ((basic_ostream *)&local_180,"Could not parse url: \'",0x16);
      pbVar16 = param_1 + 1;
      uVar12 = (ulong)((byte)*param_1 >> 1);
      if (((byte)*param_1 & 1) != 0) {
        pbVar16 = *(basic_string_conflict **)(param_1 + 0x10);
        uVar12 = *(ulong *)(param_1 + 8);
      }
      pbVar15 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                          (pbVar15,(char *)pbVar16,uVar12);
      std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>(pbVar15,"\'",1);
                    /* try { // try from 00996818 to 00996823 has its CatchHandler @ 00996abc */
      std::__ndk1::basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
      ::str();
      pp_Stack_2a8 = &local_2a0;
      local_2a0 = (__tree_node *)0x0;
      uStack_298 = 0;
      local_2c0 = 0;
      uStack_2b8 = 0;
      local_2b0 = (void *)0x0;
                    /* try { // try from 00996838 to 00996853 has its CatchHandler @ 00996a88 */
      WebSocketInitResult::WebSocketInitResult();
      if ((local_2c0 & 1) != 0) {
        operator_delete(local_2b0);
      }
      std::__ndk1::
      __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
      ::destroy((__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                 *)&pp_Stack_2a8,local_2a0);
      if ((local_300 & 1) != 0) {
        operator_delete(local_2f0);
      }
      local_190 = (WebSocketInitResult)0xe0;
      uStack_18f = 0xc4e4;
      local_110[0] = &PTR_FUN_00c4e530;
      local_180 = &PTR_FUN_00c4e508;
      ppuStack_178 = &PTR_LAB_00c4e678;
      if ((local_138 & 1) != 0) {
        operator_delete(local_128);
      }
      ppuStack_178 = &PTR__basic_streambuf_00c4e728;
      std::__ndk1::locale::~locale((locale *)a_Stack_170);
      std::__ndk1::ios_base::~ios_base((ios_base *)local_110);
      goto joined_r0x009968dc;
    }
    this_00 = (ix *)0x0;
    local_2c0 = 0;
    uStack_2b8 = 0;
    uVar12 = local_1a8 >> 1 & 0x7f;
    if ((local_1a8 & 1) != 0) {
      uVar12 = local_1a0;
    }
    local_2b0 = (void *)0x0;
    if (uVar12 == 3) {
      pvVar20 = (void *)((ulong)&local_1a8 | 1);
      if ((local_1a8 & 1) != 0) {
        pvVar20 = local_198;
      }
      iVar11 = memcmp(pvVar20,&DAT_002b569e,3);
      this_00 = (ix *)(ulong)(iVar11 == 0);
    }
                    /* try { // try from 009961f0 to 00996203 has its CatchHandler @ 00996c78 */
    createSocket(this_00,true,(int)&local_2c0,(basic_string_conflict *)(this + 0x1b8),
                 (SocketTLSOptions *)pbVar16);
    uVar14 = CONCAT71(uStack_18f,local_190);
    local_190 = (WebSocketInitResult)0x0;
    uStack_18f = 0;
    plVar13 = *(long **)pWVar2;
    *(undefined8 *)pWVar2 = uVar14;
    if (plVar13 == (long *)0x0) {
      local_190 = (WebSocketInitResult)0x0;
      uStack_18f = 0;
    }
    else {
      (**(code **)(*plVar13 + 8))();
      plVar13 = (long *)CONCAT71(uStack_18f,local_190);
      local_190 = (WebSocketInitResult)0x0;
      uStack_18f = 0;
      if (plVar13 != (long *)0x0) {
        (**(code **)(*plVar13 + 8))();
      }
    }
                    /* try { // try from 00996244 to 0099624b has its CatchHandler @ 00996c74 */
    this_01 = operator_new(0x10);
                    /* try { // try from 00996250 to 00996253 has its CatchHandler @ 00996c64 */
    WebSocketPerMessageDeflate::WebSocketPerMessageDeflate(this_01);
    this_02 = *(WebSocketPerMessageDeflate **)pWVar3;
    *(WebSocketPerMessageDeflate **)pWVar3 = this_01;
    if (this_02 != (WebSocketPerMessageDeflate *)0x0) {
      WebSocketPerMessageDeflate::~WebSocketPerMessageDeflate(this_02);
      operator_delete(this_02);
    }
    if (*(long *)pWVar2 == 0) {
      bStack_188 = 0;
      uStack_187 = 0;
      uStack_186 = 0;
      local_190 = (WebSocketInitResult)0x0;
      uStack_18f = 0;
      local_180 = (undefined **)0x0;
      local_2d0 = (__tree_node *)0x0;
      uStack_2c8 = 0;
      local_2d8 = &local_2d0;
                    /* try { // try from 0099640c to 00996427 has its CatchHandler @ 00996c38 */
      WebSocketInitResult::WebSocketInitResult();
      if (((byte)local_190 & 1) != 0) {
        operator_delete(local_180);
      }
      std::__ndk1::
      __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
      ::destroy((__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                 *)&local_2d8,local_2d0);
LAB_00996520:
      iVar18 = 1;
      iVar11 = 1;
    }
    else {
                    /* try { // try from 00996278 to 0099628f has its CatchHandler @ 00996c60 */
      WebSocketHandshake::WebSocketHandshake
                ((WebSocketHandshake *)&local_300,(atomic *)(this + 0x240),pWVar2,pWVar3,
                 (WebSocketPerMessageDeflateOptions *)(this + 0x180),(atomic *)(this + 0x185));
                    /* try { // try from 00996294 to 009962b7 has its CatchHandler @ 00996c5c */
      WebSocketHandshake::clientHandshake
                ((basic_string_conflict *)&local_300,(map *)&local_210,
                 (basic_string_conflict *)param_2,(basic_string_conflict *)&local_1a8,
                 (basic_string_conflict *)&local_1c0,(int)&local_1d8,local_1f4);
      WebSocketInitResult::operator=((WebSocketInitResult *)&local_278,&local_190);
      if ((uStack_140 & 1) != 0) {
        operator_delete(pvStack_130);
      }
      if ((local_158 & 1) != 0) {
        operator_delete(local_148);
      }
      std::__ndk1::
      __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
      ::destroy(a_Stack_170,local_168);
      if ((bStack_188 & 1) != 0) {
        operator_delete(ppuStack_178);
      }
      if (99 < iStack_274 - 300U) {
        if ((local_278._0_1_ != (WebSocketInitResult)0x0) && (*(int *)(this + 0xe0) != 3)) {
                    /* try { // try from 00996460 to 00996467 has its CatchHandler @ 00996c60 */
          std::__ndk1::mutex::lock((mutex *)(this + 0x2b0));
          uVar14 = std::__ndk1::chrono::steady_clock::now();
          *(undefined8 *)(this + 0x2d8) = uVar14;
          std::__ndk1::mutex::unlock((mutex *)(this + 0x2b0));
          this[0x280] = (WebSocketTransport)0x0;
          *(undefined4 *)(this + 0xe0) = 3;
        }
        pvVar23 = local_218;
        uVar10 = uStack_220;
        uVar9 = local_228;
        pvVar20 = local_230;
        uVar8 = uStack_238;
        uVar24 = local_240;
        puVar7 = local_260;
        uVar14 = uStack_268;
        uVar12 = local_270;
        uStack_268 = 0;
        local_260 = (undefined1 *)0x0;
        local_270 = 0;
        *in_x8 = CONCAT44(iStack_274,local_278);
        in_x8[3] = puVar7;
        in_x8[2] = uVar14;
        in_x8[1] = uVar12;
        in_x8[4] = local_258;
        in_x8[5] = local_250;
        in_x8[6] = local_248;
        if (local_248 == 0) {
          in_x8[4] = p_Var1;
        }
        else {
          *(__tree_node **)(local_250 + 0x10) = p_Var1;
          local_250 = (__tree_node *)0x0;
          local_248 = 0;
          local_258 = (__tree_node *)&local_250;
        }
        uStack_238 = 0;
        local_230 = (void *)0x0;
        local_240 = 0;
        local_228 = 0;
        uStack_220 = 0;
        local_218 = (void *)0x0;
        in_x8[9] = pvVar20;
        in_x8[8] = uVar8;
        in_x8[7] = uVar24;
        in_x8[0xc] = pvVar23;
        in_x8[0xb] = uVar10;
        in_x8[10] = uVar9;
        goto LAB_00996520;
      }
      local_190 = (WebSocketInitResult)0x10;
      uStack_186 = 0;
      local_180 = (undefined **)0x0;
      uStack_18f = 0x6f697461636f4c;
      bStack_188 = 0x6e;
      uStack_187 = 0;
      if (local_250 == (__tree_node *)0x0) {
LAB_00996394:
        p_Var19 = (__tree_node *)&local_250;
      }
      else {
        p_Var19 = (__tree_node *)&local_250;
        p_Var21 = local_250;
        do {
                    /* try { // try from 00996350 to 0099635b has its CatchHandler @ 00996cc0 */
          uVar12 = CaseInsensitiveLess::operator()
                             ((CaseInsensitiveLess *)&local_248,
                              (basic_string_conflict *)(p_Var21 + 0x20),
                              (basic_string_conflict *)&local_190);
          lVar4 = 8;
          if ((uVar12 & 1) == 0) {
            lVar4 = 0;
            p_Var19 = p_Var21;
          }
          p_Var21 = *(__tree_node **)(p_Var21 + lVar4);
        } while (p_Var21 != (__tree_node *)0x0);
        if (p_Var19 == (__tree_node *)&local_250) goto LAB_00996394;
                    /* try { // try from 00996384 to 0099638f has its CatchHandler @ 00996ba4 */
        uVar12 = CaseInsensitiveLess::operator()
                           ((CaseInsensitiveLess *)&local_248,(basic_string_conflict *)&local_190,
                            (basic_string_conflict *)(p_Var19 + 0x20));
        if ((uVar12 & 1) != 0) goto LAB_00996394;
      }
      if (((byte)local_190 & 1) != 0) {
        operator_delete(local_180);
      }
      if (p_Var19 == (__tree_node *)&local_250) {
        local_180 = &PTR_FUN_00c4e508;
        local_110[0] = &PTR__basic_istream_00c4e640;
        bStack_188 = 0;
        uStack_187 = 0;
        uStack_186 = 0;
        local_190 = (WebSocketInitResult)0x18;
        uStack_18f = 0xc4e6;
                    /* try { // try from 0099657c to 00996583 has its CatchHandler @ 00996bac */
        std::__ndk1::ios_base::init((ios_base *)local_110,&ppuStack_178);
        local_88 = 0;
        local_80 = 0xffffffff;
        local_190 = (WebSocketInitResult)0xe0;
        uStack_18f = 0xc4e4;
        local_110[0] = &PTR_FUN_00c4e530;
        ppuStack_178 = &PTR__basic_streambuf_00c4e728;
        local_180 = &PTR_FUN_00c4e508;
        std::__ndk1::locale::locale((locale *)a_Stack_170);
        uStack_150 = 0;
        local_158 = 0;
        uStack_140 = 0;
        local_148 = (void *)0x0;
        uStack_160 = 0;
        local_168 = (__tree_node *)0x0;
        ppuStack_178 = &PTR_LAB_00c4e678;
        pvStack_130 = (void *)0x0;
        local_138 = 0;
        uStack_120 = 0;
        local_128 = (void *)0x0;
        local_118 = 0x18;
                    /* try { // try from 009965f0 to 0099664b has its CatchHandler @ 00996bc0 */
        pbVar15 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                            ((basic_ostream *)&local_180,
                             "Missing Location Header for HTTP Redirect response. ",0x34);
        pbVar15 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                            (pbVar15,"Rejecting connection to ",0x18);
        pbVar16 = param_1 + 1;
        uVar12 = (ulong)((byte)*param_1 >> 1);
        if (((byte)*param_1 & 1) != 0) {
          pbVar16 = *(basic_string_conflict **)(param_1 + 0x10);
          uVar12 = *(ulong *)(param_1 + 8);
        }
        pbVar15 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                            (pbVar15,(char *)pbVar16,uVar12);
        pbVar15 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                            (pbVar15,", status: ",10);
        std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::operator<<
                  ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar15,iStack_274);
                    /* try { // try from 0099664c to 00996657 has its CatchHandler @ 00996ba8 */
        std::__ndk1::
        basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::str();
        if ((local_270 & 1) != 0) {
          *local_260 = 0;
          uStack_268 = 0;
          if ((local_270 & 1) != 0) {
            operator_delete(local_260);
          }
        }
        local_260 = local_308;
        local_190 = (WebSocketInitResult)0xe0;
        uStack_18f = 0xc4e4;
        local_110[0] = &PTR_FUN_00c4e530;
        local_180 = &PTR_FUN_00c4e508;
        uStack_268 = uStack_310;
        local_270 = local_318;
        ppuStack_178 = &PTR_LAB_00c4e678;
        if ((local_138 & 1) != 0) {
          operator_delete(local_128);
        }
        ppuStack_178 = &PTR__basic_streambuf_00c4e728;
        std::__ndk1::locale::~locale((locale *)a_Stack_170);
        std::__ndk1::ios_base::~ios_base((ios_base *)local_110);
        iVar18 = 2;
        iVar11 = 2;
      }
      else {
        if ((__tree_node *)&local_210 != p_Var19 + 0x38) {
          p_Var21 = *(__tree_node **)(p_Var19 + 0x40);
          p_Var5 = *(__tree_node **)(p_Var19 + 0x48);
          if (((byte)p_Var19[0x38] & 1) == 0) {
            p_Var5 = p_Var19 + 0x39;
            p_Var21 = (__tree_node *)(ulong)((byte)p_Var19[0x38] >> 1);
          }
                    /* try { // try from 009963dc to 009963e3 has its CatchHandler @ 00996bbc */
          std::__ndk1::
          basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::assign
                    ((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                      *)&local_210,(char *)p_Var5,(ulong)p_Var21);
        }
        iVar18 = 4;
        iVar11 = 4;
      }
    }
    if ((local_2c0 & 1) != 0) {
      operator_delete(local_2b0);
      iVar11 = iVar18;
    }
    pvVar23 = local_218;
    uVar10 = uStack_220;
    uVar9 = local_228;
    pvVar20 = local_230;
    uVar8 = uStack_238;
    uVar24 = local_240;
    puVar7 = local_260;
    uVar14 = uStack_268;
    uVar12 = local_270;
    if (iVar11 != 4) {
      if (iVar11 != 2) goto joined_r0x009968dc;
      goto LAB_009968ec;
    }
    uVar22 = uVar22 + 1;
    if (9 < uVar22) {
LAB_009968ec:
      uStack_268 = 0;
      local_260 = (undefined1 *)0x0;
      local_270 = 0;
      *in_x8 = CONCAT44(iStack_274,local_278);
      in_x8[3] = puVar7;
      in_x8[2] = uVar14;
      in_x8[1] = uVar12;
      in_x8[4] = local_258;
      in_x8[5] = local_250;
      in_x8[6] = local_248;
      if (local_248 == 0) {
        in_x8[4] = p_Var1;
      }
      else {
        *(__tree_node **)(local_250 + 0x10) = p_Var1;
        local_250 = (__tree_node *)0x0;
        local_258 = (__tree_node *)&local_250;
      }
      uStack_238 = 0;
      local_230 = (void *)0x0;
      local_240 = 0;
      in_x8[9] = pvVar20;
      local_228 = 0;
      uStack_220 = 0;
      in_x8[8] = uVar8;
      in_x8[7] = uVar24;
      local_218 = (void *)0x0;
      in_x8[0xc] = pvVar23;
      in_x8[0xb] = uVar10;
      in_x8[10] = uVar9;
joined_r0x009968dc:
      if ((local_228 & 1) != 0) {
        operator_delete(local_218);
      }
      if ((local_240 & 1) != 0) {
        operator_delete(local_230);
      }
      std::__ndk1::
      __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
      ::destroy((__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                 *)&local_258,local_250);
      if ((local_270 & 1) != 0) {
        operator_delete(local_260);
      }
      if ((local_210 & 1) != 0) {
        operator_delete(local_200);
      }
      if ((local_1f0 & 1) != 0) {
        operator_delete(local_1e0);
      }
      if ((local_1d8 & 1) != 0) {
        operator_delete(local_1c8);
      }
      if ((local_1c0 & 1) != 0) {
        operator_delete(local_1b0);
      }
      if ((local_1a8 & 1) != 0) {
        operator_delete(local_198);
      }
      std::__ndk1::mutex::unlock((mutex *)(this + 0xb8));
      if (*(long *)(lVar6 + 0x28) != lVar17) {
                    /* WARNING: Subroutine does not return */
        __stack_chk_fail();
      }
      return;
    }
  } while( true );
}

