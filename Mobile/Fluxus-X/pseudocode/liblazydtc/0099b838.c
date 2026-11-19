/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0099b838
 */

/* WARNING: Heritage AFTER dead removal. Example location: x0 : 0x0099c7f0 */
/* WARNING: Type propagation algorithm not settling */
/* WARNING: Restarted to delay deadcode elimination for space: register */
/* ix::WebSocketHandshake::clientHandshake(std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&,
   std::__ndk1::map<std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> >, std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> >, ix::CaseInsensitiveLess,
   std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const,
   std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > >
   > > const&, std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&,
   std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >
   const&, int, int) */

void ix::WebSocketHandshake::clientHandshake
               (basic_string_conflict *param_1,map *param_2,basic_string_conflict *param_3,
               basic_string_conflict *param_4,basic_string_conflict *param_5,int param_6,int param_7
               )

{
  function *pfVar1;
  size_t sVar2;
  __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
  *__s1;
  byte *pbVar3;
  map *pmVar4;
  __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
  _Var5;
  long lVar6;
  tuple tVar7;
  char cVar8;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> bVar9;
  function *__src;
  bool bVar10;
  uint uVar11;
  int iVar12;
  basic_ostream *pbVar13;
  ulong uVar14;
  undefined8 *puVar15;
  long *plVar16;
  __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
  *p_Var17;
  char *pcVar18;
  long lVar19;
  size_t sVar20;
  basic_string_conflict *extraout_x1;
  basic_string_conflict *extraout_x1_00;
  __tree_node_base *p_Var21;
  __tree_node *p_Var22;
  __tree_node_base *p_Var23;
  function *pfVar24;
  byte *pbVar25;
  uint in_w7;
  WebSocketInitResult *in_x8;
  code *pcVar26;
  __tree_node *p_Var27;
  __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
  *p_Var28;
  long lVar29;
  __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
  *__s2;
  basic_string_conflict *pbVar30;
  Socket *this;
  __tree_node_base *p_Var31;
  void *__src_00;
  function *__dest;
  long *__dest_00;
  basic_string_conflict *pbVar32;
  basic_string_conflict *pbVar33;
  ulong uVar34;
  basic_string_conflict *pbVar35;
  undefined8 uVar36;
  undefined8 uVar37;
  __tree_node_base *local_568;
  __tree_node_base *local_560;
  long local_558;
  tuple *local_550;
  undefined8 uStack_548;
  void *local_540;
  __tree_node **pp_Stack_538;
  __tree_node *local_530;
  undefined8 uStack_528;
  ulong local_520;
  ulong uStack_518;
  __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
  *local_510;
  __tree_node **local_500;
  __tree_node *local_4f8;
  undefined8 uStack_4f0;
  __tree_node **local_4e8;
  __tree_node *local_4e0;
  undefined8 uStack_4d8;
  __tree_node **local_4d0;
  __tree_node *local_4c8;
  undefined8 uStack_4c0;
  __tree_node_base *local_4b8;
  __tree_node_base *local_4b0;
  long local_4a8;
  tuple local_4a0;
  undefined7 uStack_49f;
  undefined1 uStack_498;
  undefined7 uStack_497;
  undefined1 uStack_490;
  undefined4 uStack_48f;
  undefined1 uStack_48b;
  undefined2 uStack_48a;
  __tree_node **local_488;
  __tree_node *local_480;
  undefined8 uStack_478;
  __tree_node_base *local_470;
  __tree_node_base *local_468;
  long local_460;
  ulong local_458;
  __tree_node *local_450;
  __tree_node *local_448 [2];
  __tree_node **local_438;
  __tree_node *local_430;
  undefined8 uStack_428;
  ulong local_420;
  function *pfStack_418;
  long *local_410;
  __tree_node **local_408;
  __tree_node *local_400;
  undefined8 uStack_3f8;
  ulong local_3f0;
  function *pfStack_3e8;
  function *local_3e0;
  ulong local_3d0;
  ulong uStack_3c8;
  function *pfStack_3c0;
  function *local_3b8;
  __tree_node **local_3b0;
  __tree_node *local_3a8;
  undefined8 local_3a0;
  byte local_398 [16];
  void *local_388;
  Base64 local_380 [8];
  ulong local_378;
  char *local_370;
  __tree_node **local_368;
  __tree_node *local_360;
  undefined8 local_358;
  ulong local_350;
  ulong local_348;
  char *local_340;
  WebSocketPerMessageDeflateOptions aWStack_338 [8];
  ulong local_330;
  function *pfStack_328;
  long *local_320;
  int local_318;
  undefined **local_310;
  undefined8 uStack_308;
  undefined **local_300;
  undefined **ppuStack_2f8;
  locale alStack_2f0 [8];
  undefined8 local_2e8;
  undefined8 uStack_2e0;
  undefined8 local_2d8;
  undefined8 uStack_2d0;
  undefined8 local_2c8;
  undefined8 uStack_2c0;
  ulong local_2b8;
  undefined8 uStack_2b0;
  void *local_2a8;
  undefined8 uStack_2a0;
  undefined4 local_298;
  undefined **local_290 [17];
  undefined8 local_208;
  undefined4 local_200;
  tuple local_1f0;
  undefined7 uStack_1ef;
  char cStack_1e8;
  undefined2 uStack_1e7;
  undefined1 uStack_1e5;
  undefined4 uStack_1e4;
  __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
  *local_1e0;
  basic_string_conflict local_1d0;
  undefined4 uStack_1cf;
  undefined2 uStack_1cb;
  undefined1 uStack_1c9;
  undefined1 uStack_1c8;
  undefined2 uStack_1c7;
  undefined1 uStack_1c5;
  undefined4 uStack_1c4;
  undefined5 local_1c0;
  undefined3 uStack_1bb;
  undefined5 uStack_1b8;
  undefined3 uStack_1b3;
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
  undefined **local_150 [17];
  undefined8 local_c8;
  undefined4 local_c0;
  function afStack_b0 [32];
  function *local_90;
  
  pbVar25 = (byte *)(ulong)(uint)param_6;
  lVar6 = tpidr_el0;
  lVar29 = *(long *)(lVar6 + 0x28);
  **(undefined1 **)param_1 = 0;
  makeCancellationRequestWithTimeout
            ((ix *)(ulong)in_w7,(int)*(undefined8 *)param_1,(atomic *)param_3);
  local_348 = 0;
  local_350 = 0;
  local_340 = (char *)0x0;
                    /* try { // try from 0099b8b8 to 0099b8cb has its CatchHandler @ 0099dc40 */
  uVar11 = (**(code **)(*(long *)**(undefined8 **)(param_1 + 8) + 0x18))
                     ((long *)**(undefined8 **)(param_1 + 8),param_5,param_7,&local_350,afStack_b0);
  if ((uVar11 & 1) == 0) {
    local_300 = &PTR_FUN_00c4e508;
    local_290[0] = &PTR__basic_istream_00c4e640;
    uStack_308 = 0;
    local_310 = &PTR__basic_istream_00c4e618;
                    /* try { // try from 0099bbd0 to 0099bbdb has its CatchHandler @ 0099dc34 */
    std::__ndk1::ios_base::init((ios_base *)local_290,&ppuStack_2f8);
    local_208 = 0;
    local_200 = 0xffffffff;
    local_310 = &PTR_LAB_00c4e4e0;
    local_290[0] = &PTR_FUN_00c4e530;
    ppuStack_2f8 = &PTR__basic_streambuf_00c4e728;
    local_300 = &PTR_FUN_00c4e508;
    std::__ndk1::locale::locale(alStack_2f0);
    uStack_2c0 = 0;
    local_2c8 = 0;
    uStack_2d0 = 0;
    local_2d8 = 0;
    uStack_2e0 = 0;
    local_2e8 = 0;
    ppuStack_2f8 = &PTR_LAB_00c4e678;
    uStack_2a0 = 0;
    local_2a8 = (void *)0x0;
    uStack_2b0 = 0;
    local_2b8 = 0;
    local_298 = 0x18;
                    /* try { // try from 0099bc54 to 0099bcd3 has its CatchHandler @ 0099dc50 */
    pbVar13 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                        ((basic_ostream *)&local_300,"Unable to connect to ",0x15);
    uVar14 = *(ulong *)(param_5 + 8);
    pbVar33 = *(basic_string_conflict **)(param_5 + 0x10);
    if (((byte)*param_5 & 1) == 0) {
      pbVar33 = param_5 + 1;
      uVar14 = (ulong)((byte)*param_5 >> 1);
    }
    pbVar13 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                        (pbVar13,(char *)pbVar33,uVar14);
    pbVar13 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                        (pbVar13," on port ",9);
    pbVar13 = (basic_ostream *)
              std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::operator<<
                        ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar13,param_7);
    pbVar13 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                        (pbVar13,", error: ",9);
    uVar14 = local_350 >> 1 & 0x7f;
    pcVar18 = (char *)((ulong)&local_350 | 1);
    if ((local_350 & 1) != 0) {
      uVar14 = local_348;
      pcVar18 = local_340;
    }
    std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
              (pbVar13,pcVar18,uVar14);
                    /* try { // try from 0099bcd4 to 0099bcdf has its CatchHandler @ 0099dc08 */
    std::__ndk1::basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    str();
    local_368 = &local_360;
    local_358 = 0;
    local_360 = (__tree_node *)0x0;
    local_3d0 = 0;
    uStack_3c8 = 0;
    pfStack_3c0 = (function *)0x0;
                    /* try { // try from 0099bcfc to 0099bd17 has its CatchHandler @ 0099dbd4 */
    WebSocketInitResult::WebSocketInitResult(in_x8,0,0,&local_1d0,&local_368,&local_3d0);
    if ((local_3d0 & 1) != 0) {
      operator_delete(pfStack_3c0);
    }
    std::__ndk1::
    __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
    ::destroy((__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
               *)&local_368,local_360);
    if (((byte)local_1d0 & 1) != 0) {
      operator_delete((void *)CONCAT35(uStack_1bb,local_1c0));
    }
    local_310 = &PTR_LAB_00c4e4e0;
    local_290[0] = &PTR_FUN_00c4e530;
    local_300 = &PTR_FUN_00c4e508;
    ppuStack_2f8 = &PTR_LAB_00c4e678;
    if ((local_2b8 & 1) != 0) {
      operator_delete(local_2a8);
    }
    ppuStack_2f8 = &PTR__basic_streambuf_00c4e728;
    std::__ndk1::locale::~locale(alStack_2f0);
    std::__ndk1::ios_base::~ios_base((ios_base *)local_290);
  }
  else {
                    /* try { // try from 0099b8d8 to 0099b8e3 has its CatchHandler @ 0099dc3c */
    genRandomString(uVar11);
                    /* try { // try from 0099b8e4 to 0099b8ef has its CatchHandler @ 0099dc14 */
    macaron::Base64::Encode(local_380,local_398);
    if ((local_398[0] & 1) != 0) {
      operator_delete(local_388);
    }
    local_300 = &PTR_FUN_00c4e508;
    local_290[0] = &PTR__basic_istream_00c4e640;
    uStack_308 = 0;
    local_310 = &PTR__basic_istream_00c4e618;
                    /* try { // try from 0099b944 to 0099b94f has its CatchHandler @ 0099dc0c */
    std::__ndk1::ios_base::init((ios_base *)local_290,&ppuStack_2f8);
    local_208 = 0;
    local_200 = 0xffffffff;
    local_310 = &PTR_LAB_00c4e4e0;
    local_290[0] = &PTR_FUN_00c4e530;
    ppuStack_2f8 = &PTR__basic_streambuf_00c4e728;
    local_300 = &PTR_FUN_00c4e508;
    std::__ndk1::locale::locale(alStack_2f0);
    uStack_2c0 = 0;
    local_2c8 = 0;
    uStack_2d0 = 0;
    local_2d8 = 0;
    uStack_2e0 = 0;
    local_2e8 = 0;
    ppuStack_2f8 = &PTR_LAB_00c4e678;
    uStack_2a0 = 0;
    local_2a8 = (void *)0x0;
    uStack_2b0 = 0;
    local_2b8 = 0;
    local_298 = 0x18;
                    /* try { // try from 0099b9c4 to 0099bae3 has its CatchHandler @ 0099dcb0 */
    pbVar13 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                        ((basic_ostream *)&local_300,"GET ",4);
    uVar14 = *(ulong *)(pbVar25 + 8);
    pbVar3 = *(byte **)(pbVar25 + 0x10);
    if ((*pbVar25 & 1) == 0) {
      pbVar3 = pbVar25 + 1;
      uVar14 = (ulong)(*pbVar25 >> 1);
    }
    pbVar13 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                        (pbVar13,(char *)pbVar3,uVar14);
    std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
              (pbVar13," HTTP/1.1\r\n",0xb);
    pbVar13 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                        ((basic_ostream *)&local_300,"Host: ",6);
    uVar14 = *(ulong *)(param_5 + 8);
    pbVar33 = *(basic_string_conflict **)(param_5 + 0x10);
    if (((byte)*param_5 & 1) == 0) {
      pbVar33 = param_5 + 1;
      uVar14 = (ulong)((byte)*param_5 >> 1);
    }
    pbVar13 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                        (pbVar13,(char *)pbVar33,uVar14);
    pbVar13 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                        (pbVar13,":",1);
    pbVar13 = (basic_ostream *)
              std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::operator<<
                        ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar13,param_7);
    std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>(pbVar13,"\r\n",2);
    std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
              ((basic_ostream *)&local_300,"Upgrade: websocket\r\n",0x14);
    std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
              ((basic_ostream *)&local_300,"Connection: Upgrade\r\n",0x15);
    std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
              ((basic_ostream *)&local_300,"Sec-WebSocket-Version: 13\r\n",0x1b);
    pbVar13 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                        ((basic_ostream *)&local_300,"Sec-WebSocket-Key: ",0x13);
    uVar14 = (ulong)((byte)local_380[0] >> 1);
    pcVar18 = (char *)((ulong)local_380 | 1);
    if (((byte)local_380[0] & 1) != 0) {
      uVar14 = local_378;
      pcVar18 = local_370;
    }
    pbVar13 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                        (pbVar13,pcVar18,uVar14);
    std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>(pbVar13,"\r\n",2);
    uStack_1c4 = 0;
    local_1c0 = 0;
    uStack_1bb = 0;
    local_1d0 = (basic_string_conflict)0x14;
    uStack_1c7 = 0x746e;
    uStack_1cf = 0x72657355;
    uStack_1cb = 0x412d;
    uStack_1c9 = 0x67;
    uStack_1c8 = 0x65;
    uStack_1c5 = 0;
    pbVar30 = param_3 + 8;
    pbVar32 = *(basic_string_conflict **)pbVar30;
    pbVar33 = pbVar30;
    if (pbVar32 != (basic_string_conflict *)0x0) {
      pbVar35 = pbVar30;
      do {
                    /* try { // try from 0099bb38 to 0099bb43 has its CatchHandler @ 0099de24 */
        uVar14 = CaseInsensitiveLess::operator()
                           ((CaseInsensitiveLess *)(param_3 + 0x10),pbVar32 + 0x20,&local_1d0);
        lVar19 = 8;
        if ((uVar14 & 1) == 0) {
          lVar19 = 0;
          pbVar35 = pbVar32;
        }
        pbVar32 = *(basic_string_conflict **)(pbVar32 + lVar19);
      } while (pbVar32 != (basic_string_conflict *)0x0);
                    /* try { // try from 0099bb64 to 0099bb6f has its CatchHandler @ 0099db28 */
      if ((pbVar35 != pbVar30) &&
         (uVar14 = CaseInsensitiveLess::operator()
                             ((CaseInsensitiveLess *)(param_3 + 0x10),&local_1d0,pbVar35 + 0x20),
         (uVar14 & 1) == 0)) {
        pbVar33 = pbVar35;
      }
    }
    if (((byte)local_1d0 & 1) != 0) {
      operator_delete((void *)CONCAT35(uStack_1bb,local_1c0));
    }
    if (pbVar33 == pbVar30) {
                    /* try { // try from 0099bdd4 to 0099bde7 has its CatchHandler @ 0099dcb0 */
      pbVar13 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                          ((basic_ostream *)&local_300,"User-Agent: ",0xc);
                    /* try { // try from 0099bdec to 0099bdf7 has its CatchHandler @ 0099db34 */
      userAgent();
      uVar14 = (ulong)((byte)local_1d0 >> 1);
      pcVar18 = (char *)((ulong)&local_1d0 | 1);
      if (((byte)local_1d0 & 1) != 0) {
        uVar14 = CONCAT44(uStack_1c4,CONCAT13(uStack_1c5,CONCAT21(uStack_1c7,uStack_1c8)));
        pcVar18 = (char *)CONCAT35(uStack_1bb,local_1c0);
      }
                    /* try { // try from 0099be18 to 0099be2f has its CatchHandler @ 0099db38 */
      pbVar13 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                          (pbVar13,pcVar18,uVar14);
      std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>(pbVar13,"\r\n",2);
      if (((byte)local_1d0 & 1) != 0) {
        operator_delete((void *)CONCAT35(uStack_1bb,local_1c0));
      }
    }
    local_1d0 = (basic_string_conflict)0xc;
    local_1c0 = 0;
    uStack_1bb = 0;
    uStack_1c8 = 0;
    uStack_1c7 = 0;
    uStack_1c5 = 0;
    uStack_1c4 = 0;
    uStack_1cb = 0x6e69;
    uStack_1cf = 0x6769724f;
    uStack_1c9 = 0;
    pbVar33 = *(basic_string_conflict **)pbVar30;
    if (pbVar33 == (basic_string_conflict *)0x0) {
LAB_0099bec0:
      pbVar32 = pbVar30;
    }
    else {
      pbVar32 = pbVar30;
      do {
                    /* try { // try from 0099be84 to 0099be8f has its CatchHandler @ 0099de00 */
        uVar14 = CaseInsensitiveLess::operator()
                           ((CaseInsensitiveLess *)(param_3 + 0x10),pbVar33 + 0x20,&local_1d0);
        lVar19 = 8;
        if ((uVar14 & 1) == 0) {
          lVar19 = 0;
          pbVar32 = pbVar33;
        }
        pbVar33 = *(basic_string_conflict **)(pbVar33 + lVar19);
      } while (pbVar33 != (basic_string_conflict *)0x0);
                    /* try { // try from 0099beb0 to 0099bebb has its CatchHandler @ 0099db24 */
      if ((pbVar32 == pbVar30) ||
         (uVar14 = CaseInsensitiveLess::operator()
                             ((CaseInsensitiveLess *)(param_3 + 0x10),&local_1d0,pbVar32 + 0x20),
         (uVar14 & 1) != 0)) goto LAB_0099bec0;
    }
    if (((byte)local_1d0 & 1) != 0) {
      operator_delete((void *)CONCAT35(uStack_1bb,local_1c0));
    }
    if (pbVar32 == pbVar30) {
                    /* try { // try from 0099bef0 to 0099bf7b has its CatchHandler @ 0099dcb0 */
      pbVar13 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                          ((basic_ostream *)&local_300,"Origin: ",8);
      uVar14 = *(ulong *)(param_4 + 8);
      pbVar33 = *(basic_string_conflict **)(param_4 + 0x10);
      if (((byte)*param_4 & 1) == 0) {
        pbVar33 = param_4 + 1;
        uVar14 = (ulong)((byte)*param_4 >> 1);
      }
      pbVar13 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                          (pbVar13,(char *)pbVar33,uVar14);
      pbVar13 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                          (pbVar13,"://",3);
      uVar14 = (ulong)((byte)*param_5 >> 1);
      pbVar33 = param_5 + 1;
      if (((byte)*param_5 & 1) != 0) {
        uVar14 = *(ulong *)(param_5 + 8);
        pbVar33 = *(basic_string_conflict **)(param_5 + 0x10);
      }
      pbVar13 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                          (pbVar13,(char *)pbVar33,uVar14);
      pbVar13 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                          (pbVar13,":",1);
      pbVar13 = (basic_ostream *)
                std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::operator<<
                          ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar13,param_7);
      std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>(pbVar13,"\r\n",2);
    }
    pbVar33 = *(basic_string_conflict **)param_3;
joined_r0x0099bf84:
    if (pbVar33 != pbVar30) {
      do {
        uVar14 = (ulong)((byte)pbVar33[0x20] >> 1);
        pbVar32 = pbVar33 + 0x21;
        if (((byte)pbVar33[0x20] & 1) != 0) {
          uVar14 = *(ulong *)(pbVar33 + 0x28);
          pbVar32 = *(basic_string_conflict **)(pbVar33 + 0x30);
        }
                    /* try { // try from 0099bfb4 to 0099bff3 has its CatchHandler @ 0099de04 */
        pbVar13 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                            ((basic_ostream *)&local_300,(char *)pbVar32,uVar14);
        pbVar13 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                            (pbVar13,": ",2);
        uVar14 = (ulong)((byte)pbVar33[0x38] >> 1);
        pbVar32 = pbVar33 + 0x39;
        if (((byte)pbVar33[0x38] & 1) != 0) {
          uVar14 = *(ulong *)(pbVar33 + 0x40);
          pbVar32 = *(basic_string_conflict **)(pbVar33 + 0x48);
        }
        pbVar13 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                            (pbVar13,(char *)pbVar32,uVar14);
        std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>(pbVar13,"\r\n",2)
        ;
        pbVar32 = *(basic_string_conflict **)(pbVar33 + 8);
        if (*(basic_string_conflict **)(pbVar33 + 8) == (basic_string_conflict *)0x0) {
          pbVar32 = pbVar33 + 0x10;
          bVar10 = *(basic_string_conflict **)*(basic_string_conflict **)pbVar32 == pbVar33;
          pbVar33 = *(basic_string_conflict **)pbVar32;
          if (bVar10) goto joined_r0x0099bf84;
          do {
            lVar19 = *(long *)pbVar32;
            pbVar32 = (basic_string_conflict *)(lVar19 + 0x10);
            pbVar33 = *(basic_string_conflict **)pbVar32;
          } while (*(long *)pbVar33 != lVar19);
        }
        else {
          do {
            pbVar33 = pbVar32;
            pbVar32 = *(basic_string_conflict **)pbVar33;
          } while (*(basic_string_conflict **)pbVar33 != (basic_string_conflict *)0x0);
        }
        if (pbVar33 == pbVar30) break;
      } while( true );
    }
    if ((**(byte **)(param_1 + 0x20) & 1) != 0) {
                    /* try { // try from 0099c060 to 0099c06b has its CatchHandler @ 0099db20 */
      WebSocketPerMessageDeflateOptions::generateHeader
                (*(WebSocketPerMessageDeflateOptions **)(param_1 + 0x18));
      uVar14 = (ulong)((byte)local_1d0 >> 1);
      pcVar18 = (char *)((ulong)&local_1d0 | 1);
      if (((byte)local_1d0 & 1) != 0) {
        uVar14 = CONCAT44(uStack_1c4,CONCAT13(uStack_1c5,CONCAT21(uStack_1c7,uStack_1c8)));
        pcVar18 = (char *)CONCAT35(uStack_1bb,local_1c0);
      }
                    /* try { // try from 0099c08c to 0099c093 has its CatchHandler @ 0099db1c */
      std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                ((basic_ostream *)&local_300,pcVar18,uVar14);
      if (((byte)local_1d0 & 1) != 0) {
        operator_delete((void *)CONCAT35(uStack_1bb,local_1c0));
      }
    }
                    /* try { // try from 0099c0a4 to 0099c0b7 has its CatchHandler @ 0099dcb0 */
    std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
              ((basic_ostream *)&local_300,"\r\n",2);
    this = (Socket *)**(undefined8 **)(param_1 + 8);
                    /* try { // try from 0099c0c0 to 0099c0cb has its CatchHandler @ 0099db30 */
    std::__ndk1::basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    str();
                    /* try { // try from 0099c0cc to 0099c0eb has its CatchHandler @ 0099db2c */
    pfVar24 = afStack_b0;
    uVar14 = Socket::writeBytes(this,&local_1d0,pfVar24);
    if (((byte)local_1d0 & 1) != 0) {
      operator_delete((void *)CONCAT35(uStack_1bb,local_1c0));
    }
    if ((uVar14 & 1) == 0) {
      local_3d0 = 0;
      uStack_3c8 = 0;
      pfStack_3c0 = (function *)0x0;
                    /* try { // try from 0099c1c4 to 0099c1cb has its CatchHandler @ 0099db08 */
      pfStack_3c0 = operator_new(0x20);
      uStack_3c8 = 0x1e;
      local_3d0 = 0x21;
      *(undefined8 *)(pfStack_3c0 + 0x16) = 0x206f742074736575;
      *(undefined8 *)(pfStack_3c0 + 0xe) = 0x7165722054454720;
      pfStack_3c0[0x1e] = (function)0x0;
      *(undefined8 *)(pfStack_3c0 + 8) = 0x4720676e69646e65;
      *(undefined8 *)pfStack_3c0 = 0x732064656c696146;
      uVar14 = *(ulong *)(param_2 + 8);
      pmVar4 = *(map **)(param_2 + 0x10);
      if (((byte)*param_2 & 1) == 0) {
        pmVar4 = param_2 + 1;
        uVar14 = (ulong)((byte)*param_2 >> 1);
      }
                    /* try { // try from 0099c214 to 0099c223 has its CatchHandler @ 0099daf4 */
      puVar15 = (undefined8 *)
                std::__ndk1::
                basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
                append((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                        *)&local_3d0,(char *)pmVar4,uVar14);
      local_1c0 = (undefined5)puVar15[2];
      uStack_1bb = (undefined3)((ulong)puVar15[2] >> 0x28);
      uVar37 = puVar15[1];
      uVar36 = *puVar15;
      local_3b0 = &local_3a8;
      uStack_1c8 = (undefined1)uVar37;
      uStack_1c7 = (undefined2)((ulong)uVar37 >> 8);
      uStack_1c5 = (undefined1)((ulong)uVar37 >> 0x18);
      uStack_1c4 = (undefined4)((ulong)uVar37 >> 0x20);
      local_1d0 = SUB81(uVar36,0);
      uStack_1cf = (undefined4)((ulong)uVar36 >> 8);
      uStack_1cb = (undefined2)((ulong)uVar36 >> 0x28);
      uStack_1c9 = (undefined1)((ulong)uVar36 >> 0x38);
      puVar15[1] = 0;
      puVar15[2] = 0;
      *puVar15 = 0;
      local_3a0 = 0;
      local_3a8 = (__tree_node *)0x0;
      pfStack_328 = (function *)0x0;
      local_330 = 0;
      local_320 = (long *)0x0;
                    /* try { // try from 0099c25c to 0099c277 has its CatchHandler @ 0099dab8 */
      WebSocketInitResult::WebSocketInitResult(in_x8,0,0,&local_1d0,&local_3b0,&local_330);
      if ((local_330 & 1) != 0) {
        operator_delete(local_320);
      }
      std::__ndk1::
      __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
      ::destroy((__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                 *)&local_3b0,local_3a8);
      if (((byte)local_1d0 & 1) != 0) {
        operator_delete((void *)CONCAT35(uStack_1bb,local_1c0));
      }
      if ((local_3d0 & 1) != 0) {
        local_3b8 = pfStack_3c0;
        goto LAB_0099c734;
      }
    }
    else {
                    /* try { // try from 0099c114 to 0099c123 has its CatchHandler @ 0099db0c */
      Socket::readLine((function *)**(undefined8 **)(param_1 + 8));
      __src = local_3b8;
      pfVar1 = pfStack_3c0;
      bVar9 = local_3d0._0_1_;
      local_3f0 = 0;
      pfStack_3e8 = (function *)0x0;
      local_3e0 = (function *)0x0;
      pbVar33 = extraout_x1;
      if ((uStack_3c8 & 1) == 0) {
        local_3e0 = local_3b8;
        pfStack_3e8 = pfStack_3c0;
        local_3f0 = uStack_3c8;
        if (local_3d0._0_1_ ==
            (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>)0x0)
        goto LAB_0099c350;
LAB_0099c150:
                    /* try { // try from 0099c150 to 0099c15b has its CatchHandler @ 0099daa0 */
        Http::parseStatusLine((Http *)&local_3f0,pbVar33);
        plVar16 = local_320;
        pfVar1 = pfStack_328;
        local_420 = 0;
        pfStack_418 = (function *)0x0;
        local_410 = (long *)0x0;
        if ((local_330 & 1) == 0) {
          local_410 = local_320;
          pfStack_418 = pfStack_328;
          local_420 = local_330;
        }
        else {
          if ((function *)0xffffffffffffffef < pfStack_328) {
                    /* try { // try from 0099d6b4 to 0099d6bb has its CatchHandler @ 0099d97c */
                    /* WARNING: Subroutine does not return */
            std::__ndk1::__basic_string_common<true>::__throw_length_error();
          }
          if (pfStack_328 < (function *)0x17) {
            __dest_00 = (long *)((ulong)&local_420 | 1);
            local_420 = (ulong)(byte)((int)pfStack_328 << 1);
            if (pfStack_328 != (function *)0x0) goto LAB_0099c454;
          }
          else {
            pfVar24 = pfStack_328 + 0x10;
                    /* try { // try from 0099c43c to 0099c443 has its CatchHandler @ 0099d97c */
            __dest_00 = operator_new((ulong)pfVar24 & 0xfffffffffffffff0);
            local_420 = (ulong)pfVar24 & 0xfffffffffffffff0 | 1;
            pfStack_418 = pfVar1;
            local_410 = __dest_00;
LAB_0099c454:
            pfVar24 = pfVar1;
            memcpy(__dest_00,plVar16,(size_t)pfVar1);
          }
          *(function *)((long)__dest_00 + (long)pfVar1) = (function)0x0;
        }
        pfVar1 = (function *)(local_420 >> 1 & 0x7f);
        if ((local_420 & 1) != 0) {
          pfVar1 = pfStack_418;
        }
        if (pfVar1 == (function *)0x8) {
          plVar16 = (long *)((ulong)&local_420 | 1);
          if ((local_420 & 1) != 0) {
            plVar16 = local_410;
          }
          if (*plVar16 != 0x312e312f50545448) goto LAB_0099c4b8;
          p_Var17 = *(__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                      **)(param_1 + 8);
                    /* try { // try from 0099c7a4 to 0099c7b3 has its CatchHandler @ 0099d94c */
          parseHttpHeaders((ix *)p_Var17,afStack_b0,pfVar24);
          cVar8 = (char)local_458;
          local_468 = (__tree_node_base *)0x0;
          local_460 = 0;
          local_470 = (__tree_node_base *)&local_468;
          p_Var21 = local_468;
          p_Var22 = local_450;
          while (local_468 = p_Var21, p_Var22 != (__tree_node *)local_448) {
                    /* try { // try from 0099c7dc to 0099c80f has its CatchHandler @ 0099dda0 */
            p_Var17 = (__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                       *)std::__ndk1::
                         __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                         ::
                         __find_equal<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>
                                   (p_Var17,(__tree_node_base *)&local_468,&local_1f0,&local_4a0,
                                    p_Var22 + 0x20);
            if (*(long *)p_Var17 == 0) {
              std::__ndk1::
              __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
              ::
              __construct_node<std::__ndk1::pair<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>const&>
                        ((pair *)&local_470);
              p_Var21 = (__tree_node_base *)
                        CONCAT17(uStack_1c9,CONCAT25(uStack_1cb,CONCAT41(uStack_1cf,local_1d0)));
              *(undefined8 *)p_Var21 = 0;
              *(undefined8 *)(p_Var21 + 8) = 0;
              *(ulong *)(p_Var21 + 0x10) = CONCAT71(uStack_1ef,local_1f0);
              *(__tree_node_base **)p_Var17 = p_Var21;
              if (*(__tree_node_base **)local_470 != (__tree_node_base *)0x0) {
                p_Var21 = *(__tree_node_base **)p_Var17;
                local_470 = *(__tree_node_base **)local_470;
              }
              std::__ndk1::__tree_balance_after_insert<std::__ndk1::__tree_node_base<void*>*>
                        (local_468,p_Var21);
              local_460 = local_460 + 1;
            }
            p_Var27 = *(__tree_node **)(p_Var22 + 8);
            p_Var21 = local_468;
            if (*(__tree_node **)(p_Var22 + 8) == (__tree_node *)0x0) {
              p_Var27 = p_Var22 + 0x10;
              bVar10 = (__tree_node *)*(__tree_node ***)*(__tree_node **)p_Var27 != p_Var22;
              p_Var22 = *(__tree_node **)p_Var27;
              if (bVar10) {
                do {
                  lVar19 = *(long *)p_Var27;
                  p_Var27 = (__tree_node *)(lVar19 + 0x10);
                  p_Var22 = *(__tree_node **)p_Var27;
                } while (*(long *)*(__tree_node **)p_Var27 != lVar19);
              }
            }
            else {
              do {
                p_Var22 = p_Var27;
                p_Var27 = *(__tree_node **)p_Var22;
              } while (p_Var27 != (__tree_node *)0x0);
            }
          }
          if (cVar8 == '\0') {
            uStack_1c8 = 0;
            uStack_1c7 = 0;
            uStack_1c5 = 0;
            uStack_1c4 = 0;
            local_1d0 = (basic_string_conflict)0x0;
            uStack_1cf = 0;
            uStack_1cb = 0;
            uStack_1c9 = 0;
            local_1c0 = 0;
            uStack_1bb = 0;
                    /* try { // try from 0099ca00 to 0099ca0f has its CatchHandler @ 0099d944 */
            pcVar18 = operator_new(0x20);
            local_1c0 = SUB85(pcVar18,0);
            uStack_1bb = (undefined3)((ulong)pcVar18 >> 0x28);
            uStack_1c8 = 0x1a;
            uStack_1c7 = 0;
            uStack_1c5 = 0;
            uStack_1c4 = 0;
            local_1d0 = (basic_string_conflict)0x21;
            uStack_1cf = 0;
            uStack_1cb = 0;
            uStack_1c9 = 0;
            builtin_strncpy(pcVar18,"Error parsing HTTP headers",0x1b);
            local_480 = (__tree_node *)0x0;
            uStack_478 = 0;
            local_488 = &local_480;
            cStack_1e8 = '\0';
            uStack_1e7 = 0;
            uStack_1e5 = 0;
            uStack_1e4 = 0;
            local_1f0 = (tuple)0x0;
            uStack_1ef = 0;
            local_1e0 = (__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                         *)0x0;
                    /* try { // try from 0099ca58 to 0099ca7b has its CatchHandler @ 0099d914 */
            WebSocketInitResult::WebSocketInitResult
                      (in_x8,0,local_318,&local_1d0,&local_488,&local_1f0);
            if (((byte)local_1f0 & 1) != 0) {
              operator_delete(local_1e0);
            }
            p_Var17 = (__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                       *)&local_488;
            p_Var22 = local_480;
LAB_0099ca94:
            std::__ndk1::
            __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
            ::destroy(p_Var17,p_Var22);
            if (((byte)local_1d0 & 1) != 0) {
              operator_delete((void *)CONCAT35(uStack_1bb,local_1c0));
            }
          }
          else if (local_318 == 0x65) {
            uStack_1c4 = 0;
            local_1c0 = 0;
            uStack_1bb = 0;
            local_1d0 = (basic_string_conflict)0x14;
            uStack_1c7 = 0x6e6f;
            uStack_1cf = 0x6e6e6f63;
            uStack_1cb = 0x6365;
            uStack_1c9 = 0x74;
            uStack_1c8 = 0x69;
            uStack_1c5 = 0;
            p_Var23 = (__tree_node_base *)&local_468;
            if (p_Var21 != (__tree_node_base *)0x0) {
              p_Var31 = (__tree_node_base *)&local_468;
              do {
                    /* try { // try from 0099c8f8 to 0099c903 has its CatchHandler @ 0099dcf0 */
                uVar14 = CaseInsensitiveLess::operator()
                                   ((CaseInsensitiveLess *)&local_460,
                                    (basic_string_conflict *)(p_Var21 + 0x20),&local_1d0);
                lVar19 = 8;
                if ((uVar14 & 1) == 0) {
                  lVar19 = 0;
                  p_Var31 = p_Var21;
                }
                p_Var21 = *(__tree_node_base **)(p_Var21 + lVar19);
              } while (p_Var21 != (__tree_node_base *)0x0);
                    /* try { // try from 0099c924 to 0099c92f has its CatchHandler @ 0099d780 */
              if ((p_Var31 != (__tree_node_base *)&local_468) &&
                 (uVar14 = CaseInsensitiveLess::operator()
                                     ((CaseInsensitiveLess *)&local_460,&local_1d0,
                                      (basic_string_conflict *)(p_Var31 + 0x20)), (uVar14 & 1) == 0)
                 ) {
                p_Var23 = p_Var31;
              }
            }
            if (((byte)local_1d0 & 1) != 0) {
              operator_delete((void *)CONCAT35(uStack_1bb,local_1c0));
            }
            if (p_Var23 == (__tree_node_base *)&local_468) {
              uStack_1c8 = 0;
              uStack_1c7 = 0;
              uStack_1c5 = 0;
              uStack_1c4 = 0;
              local_1d0 = (basic_string_conflict)0x0;
              uStack_1cf = 0;
              uStack_1cb = 0;
              uStack_1c9 = 0;
              local_1c0 = 0;
              uStack_1bb = 0;
                    /* try { // try from 0099c95c to 0099c963 has its CatchHandler @ 0099d81c */
              pcVar18 = operator_new(0x20);
              local_1c0 = SUB85(pcVar18,0);
              uStack_1bb = (undefined3)((ulong)pcVar18 >> 0x28);
              uStack_1c8 = 0x18;
              uStack_1c7 = 0;
              uStack_1c5 = 0;
              uStack_1c4 = 0;
              local_1d0 = (basic_string_conflict)0x21;
              uStack_1cf = 0;
              uStack_1cb = 0;
              uStack_1c9 = 0;
              local_4d0 = &local_4c8;
              builtin_strncpy(pcVar18,"Missing connection value",0x19);
              local_4c8 = (__tree_node *)0x0;
              uStack_4c0 = 0;
              cStack_1e8 = '\0';
              uStack_1e7 = 0;
              uStack_1e5 = 0;
              uStack_1e4 = 0;
              local_1f0 = (tuple)0x0;
              uStack_1ef = 0;
              local_1e0 = (__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                           *)0x0;
                    /* try { // try from 0099c9ac to 0099c9d7 has its CatchHandler @ 0099d7fc */
              WebSocketInitResult::WebSocketInitResult
                        (in_x8,0,0x65,&local_1d0,&local_4d0,&local_1f0);
              if (((byte)local_1f0 & 1) != 0) {
                operator_delete(local_1e0);
              }
              p_Var17 = (__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                         *)&local_4d0;
              p_Var22 = local_4c8;
              goto LAB_0099ca94;
            }
            uStack_1c4 = 0;
            local_1c0 = 0;
            uStack_1bb = 0;
            local_1d0 = (basic_string_conflict)0x14;
            uStack_1c7 = 0x6e6f;
            uStack_1cf = 0x6e6e6f63;
            uStack_1cb = 0x6365;
            uStack_1c9 = 0x74;
            uStack_1c8 = 0x69;
            uStack_1c5 = 0;
            local_1f0 = SUB81(&local_1d0,0);
            uStack_1ef = (undefined7)((ulong)&local_1d0 >> 8);
                    /* try { // try from 0099cd58 to 0099cd73 has its CatchHandler @ 0099d8d0 */
            lVar19 = std::__ndk1::
                     __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                     ::
                     __emplace_unique_key_args<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::piecewise_construct_t_const&,std::__ndk1::tuple<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>&&>,std::__ndk1::tuple<>>
                               ((basic_string_conflict *)&local_470,
                                (piecewise_construct_t *)&local_1d0,(tuple *)&DAT_0074aba8,
                                &local_1f0);
            uStack_1e7 = 0;
            uStack_1e5 = 0;
            uStack_1e4 = 0;
            local_1e0 = (void *)0x0;
            local_1f0 = (tuple)0xe;
            uStack_1ef = 0x65646172677055;
            cStack_1e8 = 0;
                    /* try { // try from 0099cda0 to 0099cda7 has its CatchHandler @ 0099d8b0 */
            uVar14 = CaseInsensitiveLess::cmp
                               ((basic_string_conflict *)(lVar19 + 0x38),
                                (basic_string_conflict *)&local_1f0);
            if (((byte)local_1f0 & 1) != 0) {
              operator_delete(local_1e0);
            }
            if (((byte)local_1d0 & 1) != 0) {
              operator_delete((void *)CONCAT35(uStack_1bb,local_1c0));
            }
            if ((uVar14 & 1) != 0) {
              local_1c0 = 0xc4e508;
              uStack_1bb = 0;
              local_150[0] = &PTR__basic_istream_00c4e640;
              uStack_1c8 = 0;
              uStack_1c7 = 0;
              uStack_1c5 = 0;
              uStack_1c4 = 0;
              local_1d0 = (basic_string_conflict)0x18;
              uStack_1cf = 0xc4e6;
              uStack_1cb = 0;
              uStack_1c9 = 0;
                    /* try { // try from 0099cdf8 to 0099ce03 has its CatchHandler @ 0099d7ec */
              std::__ndk1::ios_base::init((ios_base *)local_150,&uStack_1b8);
              local_c8 = 0;
              local_c0 = 0xffffffff;
              local_1d0 = (basic_string_conflict)0xe0;
              uStack_1cf = 0xc4e4;
              uStack_1cb = 0;
              uStack_1c9 = 0;
              local_150[0] = &PTR_FUN_00c4e530;
              uStack_1b8 = 0xc4e728;
              uStack_1b3 = 0;
              local_1c0 = 0xc4e508;
              uStack_1bb = 0;
              std::__ndk1::locale::locale(alStack_1b0);
              uStack_180 = 0;
              local_188 = 0;
              uStack_190 = 0;
              local_198 = 0;
              uStack_1a0 = 0;
              local_1a8 = 0;
              uStack_1b8 = 0xc4e678;
              uStack_1b3 = 0;
              uStack_160 = 0;
              local_168 = (void *)0x0;
              uStack_170 = 0;
              local_178 = 0;
              local_158 = 0x18;
                    /* try { // try from 0099ce78 to 0099ce8b has its CatchHandler @ 0099d7e4 */
              pbVar13 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                                  ((basic_ostream *)&local_1c0,"Invalid connection value: ",0x1a);
              uStack_1e4 = 0;
              local_1e0 = (__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                           *)0x0;
              local_1f0 = (tuple)0x14;
              uStack_1e7 = 0x6e6f;
              uStack_1ef = 0x7463656e6e6f63;
              cStack_1e8 = 'i';
              uStack_1e5 = 0;
              local_4a0 = SUB81(&local_1f0,0);
              uStack_49f = (undefined7)((ulong)&local_1f0 >> 8);
                    /* try { // try from 0099cebc to 0099cefb has its CatchHandler @ 0099d824 */
              lVar19 = std::__ndk1::
                       __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                       ::
                       __emplace_unique_key_args<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::piecewise_construct_t_const&,std::__ndk1::tuple<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>&&>,std::__ndk1::tuple<>>
                                 ((basic_string_conflict *)&local_470,
                                  (piecewise_construct_t *)&local_1f0,(tuple *)&DAT_0074aba8,
                                  &local_4a0);
              uVar14 = (ulong)(*(byte *)(lVar19 + 0x38) >> 1);
              pcVar18 = (char *)(lVar19 + 0x39);
              if ((*(byte *)(lVar19 + 0x38) & 1) != 0) {
                uVar14 = *(ulong *)(lVar19 + 0x40);
                pcVar18 = *(char **)(lVar19 + 0x48);
              }
              std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                        (pbVar13,pcVar18,uVar14);
              if (((byte)local_1f0 & 1) != 0) {
                operator_delete(local_1e0);
              }
                    /* try { // try from 0099cf14 to 0099cf27 has its CatchHandler @ 0099d7dc */
              std::__ndk1::
              basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::str
                        ();
              local_4e8 = &local_4e0;
              local_4e0 = (__tree_node *)0x0;
              uStack_4d8 = 0;
              local_4a0 = (tuple)0x0;
              uStack_49f = 0;
              uStack_498 = 0;
              uStack_497 = 0;
              uStack_490 = 0;
              uStack_48f = 0;
              uStack_48b = 0;
              uStack_48a = 0;
                    /* try { // try from 0099cf40 to 0099cf5b has its CatchHandler @ 0099d784 */
              WebSocketInitResult::WebSocketInitResult
                        (in_x8,0,0x65,&local_1f0,&local_4e8,&local_4a0);
              if (((byte)local_4a0 & 1) != 0) {
                operator_delete((void *)CONCAT26(uStack_48a,
                                                 CONCAT15(uStack_48b,CONCAT41(uStack_48f,uStack_490)
                                                         )));
              }
              std::__ndk1::
              __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
              ::destroy((__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                         *)&local_4e8,local_4e0);
              if (((byte)local_1f0 & 1) != 0) {
                p_Var17 = local_1e0;
                goto LAB_0099cf84;
              }
              goto LAB_0099cf88;
            }
            uStack_1c8 = 0;
            uStack_1c7 = 0;
            uStack_1c5 = 0;
            uStack_1c4 = 0;
            local_1d0 = (basic_string_conflict)0x0;
            uStack_1cf = 0;
            uStack_1cb = 0;
            uStack_1c9 = 0;
            uStack_1b8 = 0;
            local_1c0 = 0;
            uStack_1bb = 0;
                    /* try { // try from 0099d024 to 0099d02f has its CatchHandler @ 0099d7d4 */
            WebSocketHandshakeKeyGen::generate
                      ((basic_string_conflict *)local_380,(char *)&local_1d0);
            cStack_1e8 = '\0';
            uStack_1e7 = 0;
            uStack_1e5 = 0;
            uStack_1e4 = 0;
            local_1f0 = (tuple)0x0;
            uStack_1ef = 0;
            local_1e0 = (__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                         *)0x0;
            sVar20 = strlen((char *)&local_1d0);
            if (0xffffffffffffffef < sVar20) {
                    /* try { // try from 0099d6bc to 0099d6c3 has its CatchHandler @ 0099d744 */
                    /* WARNING: Subroutine does not return */
              std::__ndk1::__basic_string_common<true>::__throw_length_error();
            }
            if (sVar20 < 0x17) {
              p_Var17 = (__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                         *)((ulong)&local_1f0 | 1);
              local_1f0 = SUB41((int)sVar20 << 1,0);
              if (sVar20 != 0) goto LAB_0099d0a4;
            }
            else {
              uVar14 = sVar20 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 0099d084 to 0099d08b has its CatchHandler @ 0099d744 */
              p_Var17 = operator_new(uVar14);
              local_1f0 = (tuple)((byte)uVar14 | 1);
              uStack_1ef = (undefined7)(uVar14 >> 8);
              cStack_1e8 = (char)sVar20;
              uStack_1e7 = (undefined2)(sVar20 >> 8);
              uStack_1e5 = (undefined1)(sVar20 >> 0x18);
              uStack_1e4 = (undefined4)(sVar20 >> 0x20);
              local_1e0 = p_Var17;
LAB_0099d0a4:
              memcpy(p_Var17,&local_1d0,sVar20);
            }
            local_550 = &local_4a0;
            p_Var17[sVar20] =
                 (__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                  )0x0;
            uStack_48a = 0;
            local_4a0 = (tuple)0x28;
            uStack_48f = 0x74706563;
            uStack_497 = 0x612d74656b636f;
            uStack_490 = 99;
            uStack_49f = 0x6265772d636573;
            uStack_498 = 0x73;
            uStack_48b = 0;
                    /* try { // try from 0099d0f0 to 0099d10b has its CatchHandler @ 0099d7b0 */
            p_Var17 = (__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                       *)std::__ndk1::
                         __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                         ::
                         __emplace_unique_key_args<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::piecewise_construct_t_const&,std::__ndk1::tuple<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>&&>,std::__ndk1::tuple<>>
                                   ((basic_string_conflict *)&local_470,
                                    (piecewise_construct_t *)&local_4a0,(tuple *)&DAT_0074aba8,
                                    (tuple *)&local_550);
            tVar7 = local_1f0;
            _Var5 = p_Var17[0x38];
            sVar20 = (ulong)((byte)local_1f0 >> 1);
            if (((byte)local_1f0 & 1) != 0) {
              sVar20 = CONCAT44(uStack_1e4,CONCAT13(uStack_1e5,CONCAT21(uStack_1e7,cStack_1e8)));
            }
            sVar2 = (ulong)((byte)_Var5 >> 1);
            if (((byte)_Var5 & 1) != 0) {
              sVar2 = *(size_t *)(p_Var17 + 0x40);
            }
            if (sVar20 == sVar2) {
              __s2 = *(__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                       **)(p_Var17 + 0x48);
              p_Var28 = (__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                         *)((ulong)&local_1f0 | 1);
              __s1 = p_Var28;
              if (((byte)local_1f0 & 1) != 0) {
                __s1 = local_1e0;
              }
              if (((byte)_Var5 & 1) == 0) {
                __s2 = p_Var17 + 0x39;
              }
              if (((byte)local_1f0 & 1) == 0) {
                if (sVar20 != 0) {
                  lVar19 = -(ulong)((byte)local_1f0 >> 1);
                  do {
                    if (*p_Var28 != *__s2) {
                      bVar10 = true;
                      goto joined_r0x0099d1a0;
                    }
                    p_Var28 = p_Var28 + 1;
                    lVar19 = lVar19 + 1;
                    __s2 = __s2 + 1;
                  } while (lVar19 != 0);
                }
                bVar10 = false;
              }
              else if (sVar20 == 0) {
                bVar10 = false;
              }
              else {
                iVar12 = memcmp(__s1,__s2,sVar20);
                bVar10 = iVar12 != 0;
              }
            }
            else {
              bVar10 = true;
            }
joined_r0x0099d1a0:
            if (((byte)local_4a0 & 1) != 0) {
              operator_delete((void *)CONCAT26(uStack_48a,
                                               CONCAT15(uStack_48b,CONCAT41(uStack_48f,uStack_490)))
                             );
              tVar7 = local_1f0;
            }
            if (((byte)tVar7 & 1) != 0) {
              operator_delete(local_1e0);
            }
            if (bVar10) {
              cStack_1e8 = 0;
              uStack_1e7 = 0;
              uStack_1e5 = 0;
              uStack_1e4 = 0;
              local_1f0 = (tuple)0x0;
              uStack_1ef = 0;
              local_1e0 = (__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                           *)0x0;
                    /* try { // try from 0099d1d0 to 0099d1d7 has its CatchHandler @ 0099d778 */
              local_1e0 = operator_new(0x30);
              *(undefined2 *)(local_1e0 + 0x20) = 0x6575;
              local_500 = &local_4f8;
              cStack_1e8 = '\"';
              uStack_1e7 = 0;
              uStack_1e5 = 0;
              uStack_1e4 = 0;
              local_1f0 = (tuple)0x31;
              uStack_1ef = 0;
              *(undefined8 *)(local_1e0 + 8) = 0x536265572d636553;
              *(undefined8 *)local_1e0 = 0x2064696c61766e49;
              *(undefined8 *)(local_1e0 + 0x18) = 0x6c61762074706563;
              *(undefined8 *)(local_1e0 + 0x10) = 0x63412d74656b636f;
              local_1e0[0x22] =
                   (__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                    )0x0;
              local_4f8 = (__tree_node *)0x0;
              uStack_4f0 = 0;
              local_4a0 = (tuple)0x0;
              uStack_49f = 0;
              uStack_498 = 0;
              uStack_497 = 0;
              uStack_490 = 0;
              uStack_48f = 0;
              uStack_48b = 0;
              uStack_48a = 0;
                    /* try { // try from 0099d21c to 0099d23f has its CatchHandler @ 0099d74c */
              WebSocketInitResult::WebSocketInitResult
                        (in_x8,0,0x65,&local_1f0,&local_500,&local_4a0);
              if (((byte)local_4a0 & 1) != 0) {
                operator_delete((void *)CONCAT26(uStack_48a,
                                                 CONCAT15(uStack_48b,CONCAT41(uStack_48f,uStack_490)
                                                         )));
              }
              std::__ndk1::
              __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
              ::destroy((__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                         *)&local_500,local_4f8);
              if (((byte)local_1f0 & 1) != 0) {
                operator_delete(local_1e0);
              }
            }
            else {
              if ((**(byte **)(param_1 + 0x20) & 1) == 0) {
LAB_0099d568:
                local_4a0 = (tuple)0x0;
                uStack_49f = 0;
                uStack_498 = 0;
                uStack_497 = 0;
                uStack_490 = 0;
                uStack_48f = 0;
                uStack_48b = 0;
                uStack_48a = 0;
                local_560 = (__tree_node_base *)0x0;
                local_558 = 0;
                local_568 = (__tree_node_base *)&local_560;
                p_Var21 = local_470;
                while (p_Var21 != (__tree_node_base *)&local_468) {
                    /* try { // try from 0099d590 to 0099d5c3 has its CatchHandler @ 0099dcb4 */
                  p_Var17 = (__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                             *)std::__ndk1::
                               __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                               ::
                               __find_equal<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>
                                         (p_Var17,(__tree_node_base *)&local_560,&local_550,
                                          aWStack_338,p_Var21 + 0x20);
                  if (*(long *)p_Var17 == 0) {
                    std::__ndk1::
                    __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                    ::
                    __construct_node<std::__ndk1::pair<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>const&>
                              ((pair *)&local_568);
                    p_Var23 = (__tree_node_base *)CONCAT71(uStack_1ef,local_1f0);
                    *(undefined8 *)p_Var23 = 0;
                    *(undefined8 *)(p_Var23 + 8) = 0;
                    *(tuple **)(p_Var23 + 0x10) = local_550;
                    *(__tree_node_base **)p_Var17 = p_Var23;
                    if (*(__tree_node_base **)local_568 != (__tree_node_base *)0x0) {
                      p_Var23 = *(__tree_node_base **)p_Var17;
                      local_568 = *(__tree_node_base **)local_568;
                    }
                    std::__ndk1::__tree_balance_after_insert<std::__ndk1::__tree_node_base<void*>*>
                              (local_560,p_Var23);
                    local_558 = local_558 + 1;
                  }
                  p_Var23 = *(__tree_node_base **)(p_Var21 + 8);
                  if (*(__tree_node_base **)(p_Var21 + 8) == (__tree_node_base *)0x0) {
                    p_Var23 = p_Var21 + 0x10;
                    bVar10 = *(__tree_node_base **)*(__tree_node_base **)p_Var23 != p_Var21;
                    p_Var21 = *(__tree_node_base **)p_Var23;
                    if (bVar10) {
                      do {
                        lVar19 = *(long *)p_Var23;
                        p_Var23 = (__tree_node_base *)(lVar19 + 0x10);
                        p_Var21 = *(__tree_node_base **)p_Var23;
                      } while (*(long *)*(__tree_node_base **)p_Var23 != lVar19);
                    }
                  }
                  else {
                    do {
                      p_Var21 = p_Var23;
                      p_Var23 = *(__tree_node_base **)p_Var21;
                    } while (p_Var23 != (__tree_node_base *)0x0);
                  }
                }
                    /* try { // try from 0099d654 to 0099d66f has its CatchHandler @ 0099d720 */
                WebSocketInitResult::WebSocketInitResult(in_x8,1,0x65,&local_4a0,&local_568,pbVar25)
                ;
                std::__ndk1::
                __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                ::destroy((__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                           *)&local_568,(__tree_node *)local_560);
                if (((byte)local_4a0 & 1) == 0) goto LAB_0099cfd0;
                p_Var17 = (__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                           *)CONCAT26(uStack_48a,
                                      CONCAT15(uStack_48b,CONCAT41(uStack_48f,uStack_490)));
              }
              else {
                local_4a0 = (tuple)0x0;
                uStack_49f = 0;
                uStack_498 = 0;
                uStack_497 = 0;
                uStack_490 = 0;
                uStack_48f = 0;
                uStack_48b = 0;
                uStack_48a = 0;
                    /* try { // try from 0099d288 to 0099d28f has its CatchHandler @ 0099d718 */
                pcVar18 = operator_new(0x20);
                local_550 = &local_4a0;
                uStack_490 = SUB81(pcVar18,0);
                uStack_48f = (undefined4)((ulong)pcVar18 >> 8);
                uStack_48b = (undefined1)((ulong)pcVar18 >> 0x28);
                uStack_48a = (undefined2)((ulong)pcVar18 >> 0x30);
                builtin_strncpy(pcVar18,"sec-websocket-extensions",0x19);
                uStack_498 = 0x18;
                uStack_497 = 0;
                local_4a0 = (tuple)0x21;
                uStack_49f = 0;
                    /* try { // try from 0099d2c8 to 0099d403 has its CatchHandler @ 0099d724 */
                lVar19 = std::__ndk1::
                         __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                         ::
                         __emplace_unique_key_args<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::piecewise_construct_t_const&,std::__ndk1::tuple<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>&&>,std::__ndk1::tuple<>>
                                   ((basic_string_conflict *)&local_470,
                                    (piecewise_construct_t *)&local_4a0,(tuple *)&DAT_0074aba8,
                                    (tuple *)&local_550);
                local_1e0 = (__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                             *)0x0;
                cStack_1e8 = '\0';
                uStack_1e7 = 0;
                uStack_1e5 = 0;
                uStack_1e4 = 0;
                local_1f0 = (tuple)0x0;
                uStack_1ef = 0;
                if ((*(byte *)(lVar19 + 0x38) & 1) == 0) {
                  local_1e0 = *(__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                                **)(lVar19 + 0x48);
                  uVar37 = *(undefined8 *)(lVar19 + 0x40);
                  uVar36 = *(undefined8 *)(lVar19 + 0x38);
                  cStack_1e8 = (char)uVar37;
                  uStack_1e7 = (undefined2)((ulong)uVar37 >> 8);
                  uStack_1e5 = (undefined1)((ulong)uVar37 >> 0x18);
                  uStack_1e4 = (undefined4)((ulong)uVar37 >> 0x20);
                  local_1f0 = SUB81(uVar36,0);
                  uStack_1ef = (undefined7)((ulong)uVar36 >> 8);
                }
                else {
                  uVar14 = *(ulong *)(lVar19 + 0x40);
                  if (0xffffffffffffffef < uVar14) {
                    /* try { // try from 0099d6c4 to 0099d6cb has its CatchHandler @ 0099d724 */
                    /* WARNING: Subroutine does not return */
                    std::__ndk1::__basic_string_common<true>::__throw_length_error();
                  }
                  __src_00 = *(void **)(lVar19 + 0x48);
                  if (uVar14 < 0x17) {
                    p_Var17 = (__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                               *)((ulong)&local_1f0 | 1);
                    local_1f0 = SUB41((int)uVar14 << 1,0);
                    if (uVar14 != 0) goto LAB_0099d418;
                  }
                  else {
                    uVar34 = uVar14 + 0x10 & 0xfffffffffffffff0;
                    p_Var17 = operator_new(uVar34);
                    local_1f0 = (tuple)((byte)uVar34 | 1);
                    uStack_1ef = (undefined7)(uVar34 >> 8);
                    cStack_1e8 = (char)uVar14;
                    uStack_1e7 = (undefined2)(uVar14 >> 8);
                    uStack_1e5 = (undefined1)(uVar14 >> 0x18);
                    uStack_1e4 = (undefined4)(uVar14 >> 0x20);
                    local_1e0 = p_Var17;
LAB_0099d418:
                    memcpy(p_Var17,__src_00,uVar14);
                  }
                  p_Var17[uVar14] =
                       (__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                        )0x0;
                }
                if (((byte)local_4a0 & 1) != 0) {
                  operator_delete((void *)CONCAT26(uStack_48a,
                                                   CONCAT15(uStack_48b,
                                                            CONCAT41(uStack_48f,uStack_490))));
                }
                p_Var17 = local_1e0;
                local_520 = 0;
                uStack_518 = 0;
                local_510 = (__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                             *)0x0;
                if (((byte)local_1f0 & 1) == 0) {
                  uStack_518 = CONCAT44(uStack_1e4,
                                        CONCAT13(uStack_1e5,CONCAT21(uStack_1e7,cStack_1e8)));
                  local_520 = CONCAT71(uStack_1ef,local_1f0);
                  local_510 = local_1e0;
                }
                else {
                  uVar14 = CONCAT44(uStack_1e4,CONCAT13(uStack_1e5,CONCAT21(uStack_1e7,cStack_1e8)))
                  ;
                  if (0xffffffffffffffef < uVar14) {
                    /* try { // try from 0099d6cc to 0099d6d3 has its CatchHandler @ 0099d734 */
                    /* WARNING: Subroutine does not return */
                    std::__ndk1::__basic_string_common<true>::__throw_length_error();
                  }
                  if (uVar14 < 0x17) {
                    p_Var28 = (__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                               *)((ulong)&local_520 | 1);
                    local_520 = (ulong)(byte)(cStack_1e8 << 1);
                    if (uVar14 != 0) goto LAB_0099d458;
                  }
                  else {
                    uVar34 = uVar14 + 0x10 & 0xfffffffffffffff0;
                    /* try { // try from 0099d440 to 0099d447 has its CatchHandler @ 0099d734 */
                    p_Var28 = operator_new(uVar34);
                    local_520 = uVar34 | 1;
                    uStack_518 = uVar14;
                    local_510 = p_Var28;
LAB_0099d458:
                    memcpy(p_Var28,p_Var17,uVar14);
                  }
                  p_Var28[uVar14] =
                       (__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                        )0x0;
                }
                    /* try { // try from 0099d46c to 0099d477 has its CatchHandler @ 0099d704 */
                WebSocketPerMessageDeflateOptions::WebSocketPerMessageDeflateOptions
                          (aWStack_338,&local_520);
                if ((local_520 & 1) != 0) {
                  operator_delete(local_510);
                }
                    /* try { // try from 0099d488 to 0099d4a3 has its CatchHandler @ 0099d734 */
                p_Var17 = (__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                           *)WebSocketPerMessageDeflateOptions::enabled(aWStack_338);
                if (((ulong)p_Var17 & 1) == 0) {
                  **(undefined1 **)(param_1 + 0x20) = 0;
LAB_0099d558:
                  if (((byte)local_1f0 & 1) != 0) {
                    operator_delete(local_1e0);
                  }
                  goto LAB_0099d568;
                }
                p_Var17 = (__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                           *)WebSocketPerMessageDeflate::init
                                       ((WebSocketPerMessageDeflate *)
                                        **(undefined8 **)(param_1 + 0x10),aWStack_338);
                if (((ulong)p_Var17 & 1) != 0) goto LAB_0099d558;
                local_4a0 = (tuple)0x0;
                uStack_49f = 0;
                uStack_498 = 0;
                uStack_497 = 0;
                uStack_490 = 0;
                uStack_48f = 0;
                uStack_48b = 0;
                uStack_48a = 0;
                    /* try { // try from 0099d4b0 to 0099d4b7 has its CatchHandler @ 0099d700 */
                pcVar18 = operator_new(0x30);
                pp_Stack_538 = &local_530;
                uStack_490 = SUB81(pcVar18,0);
                uStack_48f = (undefined4)((ulong)pcVar18 >> 8);
                uStack_48b = (undefined1)((ulong)pcVar18 >> 0x28);
                uStack_48a = (undefined2)((ulong)pcVar18 >> 0x30);
                uStack_498 = 0x2f;
                uStack_497 = 0;
                local_4a0 = (tuple)0x31;
                uStack_49f = 0;
                builtin_strncpy(pcVar18,"Failed to initialize per message deflate engine",0x30);
                local_530 = (__tree_node *)0x0;
                uStack_528 = 0;
                local_550 = (tuple *)0x0;
                uStack_548 = 0;
                local_540 = (void *)0x0;
                    /* try { // try from 0099d4f8 to 0099d513 has its CatchHandler @ 0099d6d4 */
                WebSocketInitResult::WebSocketInitResult
                          (in_x8,0,0,&local_4a0,&pp_Stack_538,&local_550);
                if (((ulong)local_550 & 1) != 0) {
                  operator_delete(local_540);
                }
                std::__ndk1::
                __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                ::destroy((__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                           *)&pp_Stack_538,local_530);
                if (((byte)local_4a0 & 1) != 0) {
                  operator_delete((void *)CONCAT26(uStack_48a,
                                                   CONCAT15(uStack_48b,
                                                            CONCAT41(uStack_48f,uStack_490))));
                }
                if (((byte)local_1f0 & 1) == 0) goto LAB_0099cfd0;
                p_Var17 = local_1e0;
              }
              operator_delete(p_Var17);
            }
          }
          else {
            local_1c0 = 0xc4e508;
            uStack_1bb = 0;
            local_150[0] = &PTR__basic_istream_00c4e640;
            uStack_1c8 = 0;
            uStack_1c7 = 0;
            uStack_1c5 = 0;
            uStack_1c4 = 0;
            local_1d0 = (basic_string_conflict)0x18;
            uStack_1cf = 0xc4e6;
            uStack_1cb = 0;
            uStack_1c9 = 0;
                    /* try { // try from 0099cae4 to 0099caf7 has its CatchHandler @ 0099d8fc */
            std::__ndk1::ios_base::init((ios_base *)local_150,&uStack_1b8);
            local_c8 = 0;
            local_c0 = 0xffffffff;
            local_1d0 = (basic_string_conflict)0xe0;
            uStack_1cf = 0xc4e4;
            uStack_1cb = 0;
            uStack_1c9 = 0;
            local_150[0] = &PTR_FUN_00c4e530;
            uStack_1b8 = 0xc4e728;
            uStack_1b3 = 0;
            local_1c0 = 0xc4e508;
            uStack_1bb = 0;
            std::__ndk1::locale::locale(alStack_1b0);
            uStack_180 = 0;
            local_188 = 0;
            uStack_190 = 0;
            local_198 = 0;
            uStack_1a0 = 0;
            local_1a8 = 0;
            uStack_1b8 = 0xc4e678;
            uStack_1b3 = 0;
            uStack_160 = 0;
            local_168 = (void *)0x0;
            uStack_170 = 0;
            local_178 = 0;
            local_158 = 0x18;
                    /* try { // try from 0099cb64 to 0099cbe3 has its CatchHandler @ 0099d96c */
            pbVar13 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                                ((basic_ostream *)&local_1c0,
                                 "Expecting status 101 (Switching Protocol), got ",0x2f);
            pbVar13 = (basic_ostream *)
                      std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::operator<<
                                ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar13,
                                 local_318);
            pbVar13 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                                (pbVar13," status connecting to ",0x16);
            uVar14 = *(ulong *)(param_2 + 8);
            pmVar4 = *(map **)(param_2 + 0x10);
            if (((byte)*param_2 & 1) == 0) {
              pmVar4 = param_2 + 1;
              uVar14 = (ulong)((byte)*param_2 >> 1);
            }
            pbVar13 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                                (pbVar13,(char *)pmVar4,uVar14);
            p_Var17 = (__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                       *)std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                                   (pbVar13,", HTTP Status line: ",0x14);
            pfVar24 = (function *)(local_3f0 >> 1 & 0x7f);
            pfVar1 = (function *)((ulong)&local_3f0 | 1);
            if ((local_3f0 & 1) != 0) {
              pfVar24 = pfStack_3e8;
              pfVar1 = local_3e0;
            }
            std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                      ((basic_ostream *)p_Var17,(char *)pfVar1,(ulong)pfVar24);
                    /* try { // try from 0099cbe4 to 0099cbef has its CatchHandler @ 0099d8e4 */
            std::__ndk1::
            basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::str()
            ;
            local_4b0 = (__tree_node_base *)0x0;
            local_4a8 = 0;
            local_4b8 = (__tree_node_base *)&local_4b0;
            p_Var21 = local_470;
            while (p_Var21 != (__tree_node_base *)&local_468) {
                    /* try { // try from 0099cc10 to 0099cc43 has its CatchHandler @ 0099dd18 */
              p_Var17 = (__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                         *)std::__ndk1::
                           __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                           ::
                           __find_equal<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>
                                     (p_Var17,(__tree_node_base *)&local_4b0,&local_550,aWStack_338,
                                      p_Var21 + 0x20);
              if (*(long *)p_Var17 == 0) {
                std::__ndk1::
                __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                ::
                __construct_node<std::__ndk1::pair<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>const&>
                          ((pair *)&local_4b8);
                p_Var23 = (__tree_node_base *)CONCAT71(uStack_1ef,local_1f0);
                *(undefined8 *)p_Var23 = 0;
                *(undefined8 *)(p_Var23 + 8) = 0;
                *(tuple **)(p_Var23 + 0x10) = local_550;
                *(__tree_node_base **)p_Var17 = p_Var23;
                if (*(__tree_node_base **)local_4b8 != (__tree_node_base *)0x0) {
                  p_Var23 = *(__tree_node_base **)p_Var17;
                  local_4b8 = *(__tree_node_base **)local_4b8;
                }
                std::__ndk1::__tree_balance_after_insert<std::__ndk1::__tree_node_base<void*>*>
                          (local_4b0,p_Var23);
                local_4a8 = local_4a8 + 1;
              }
              p_Var23 = *(__tree_node_base **)(p_Var21 + 8);
              if (*(__tree_node_base **)(p_Var21 + 8) == (__tree_node_base *)0x0) {
                p_Var23 = p_Var21 + 0x10;
                bVar10 = (__tree_node_base *)*(__tree_node_base ***)*(__tree_node_base **)p_Var23 !=
                         p_Var21;
                p_Var21 = *(__tree_node_base **)p_Var23;
                if (bVar10) {
                  do {
                    lVar19 = *(long *)p_Var23;
                    p_Var23 = (__tree_node_base *)(lVar19 + 0x10);
                    p_Var21 = *(__tree_node_base **)p_Var23;
                  } while (*(long *)*(__tree_node_base **)p_Var23 != lVar19);
                }
              }
              else {
                do {
                  p_Var21 = p_Var23;
                  p_Var23 = *(__tree_node_base **)p_Var21;
                } while (p_Var23 != (__tree_node_base *)0x0);
              }
            }
                    /* try { // try from 0099ccd4 to 0099ccef has its CatchHandler @ 0099d8e0 */
            WebSocketInitResult::WebSocketInitResult
                      (in_x8,0,local_318,&local_4a0,&local_4b8,pbVar25);
            std::__ndk1::
            __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
            ::destroy((__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                       *)&local_4b8,(__tree_node *)local_4b0);
            if (((byte)local_4a0 & 1) != 0) {
              p_Var17 = (__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                         *)CONCAT26(uStack_48a,CONCAT15(uStack_48b,CONCAT41(uStack_48f,uStack_490)))
              ;
LAB_0099cf84:
              operator_delete(p_Var17);
            }
LAB_0099cf88:
            local_1d0 = (basic_string_conflict)0xe0;
            uStack_1cf = 0xc4e4;
            uStack_1cb = 0;
            uStack_1c9 = 0;
            local_150[0] = &PTR_FUN_00c4e530;
            local_1c0 = 0xc4e508;
            uStack_1bb = 0;
            uStack_1b8 = 0xc4e678;
            uStack_1b3 = 0;
            if ((local_178 & 1) != 0) {
              operator_delete(local_168);
            }
            uStack_1b8 = 0xc4e728;
            uStack_1b3 = 0;
            std::__ndk1::locale::~locale(alStack_1b0);
            std::__ndk1::ios_base::~ios_base((ios_base *)local_150);
          }
LAB_0099cfd0:
          std::__ndk1::
          __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
          ::destroy((__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                     *)&local_470,(__tree_node *)local_468);
          std::__ndk1::
          __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
          ::destroy((__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                     *)&local_450,local_448[0]);
          if ((local_420 & 1) == 0) goto LAB_0099c6f4;
LAB_0099c6ec:
          plVar16 = local_410;
          goto LAB_0099c6f0;
        }
LAB_0099c4b8:
        local_1c0 = 0xc4e508;
        uStack_1bb = 0;
        local_150[0] = &PTR__basic_istream_00c4e640;
        uStack_1c8 = 0;
        uStack_1c7 = 0;
        uStack_1c5 = 0;
        uStack_1c4 = 0;
        local_1d0 = (basic_string_conflict)0x18;
        uStack_1cf = 0xc4e6;
        uStack_1cb = 0;
        uStack_1c9 = 0;
                    /* try { // try from 0099c4f0 to 0099c4fb has its CatchHandler @ 0099da80 */
        std::__ndk1::ios_base::init((ios_base *)local_150,&uStack_1b8);
        local_c8 = 0;
        local_c0 = 0xffffffff;
        local_1d0 = (basic_string_conflict)0xe0;
        uStack_1cf = 0xc4e4;
        uStack_1cb = 0;
        uStack_1c9 = 0;
        local_150[0] = &PTR_FUN_00c4e530;
        uStack_1b8 = 0xc4e728;
        uStack_1b3 = 0;
        local_1c0 = 0xc4e508;
        uStack_1bb = 0;
        std::__ndk1::locale::locale(alStack_1b0);
        uStack_180 = 0;
        local_188 = 0;
        uStack_190 = 0;
        local_198 = 0;
        uStack_1a0 = 0;
        local_1a8 = 0;
        uStack_1b8 = 0xc4e678;
        uStack_1b3 = 0;
        uStack_160 = 0;
        local_168 = (void *)0x0;
        uStack_170 = 0;
        local_178 = 0;
        local_158 = 0x18;
                    /* try { // try from 0099c568 to 0099c62b has its CatchHandler @ 0099db50 */
        pbVar13 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                            ((basic_ostream *)&local_1c0,"Expecting HTTP/1.1, got ",0x18);
        pfVar24 = (function *)(local_420 >> 1 & 0x7f);
        plVar16 = (long *)((ulong)&local_420 | 1);
        if ((local_420 & 1) != 0) {
          pfVar24 = pfStack_418;
          plVar16 = local_410;
        }
        pbVar13 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                            (pbVar13,(char *)plVar16,(ulong)pfVar24);
        pbVar13 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                            (pbVar13,". ",2);
        pbVar13 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                            (pbVar13,"Rejecting connection to ",0x18);
        uVar14 = *(ulong *)(param_2 + 8);
        pmVar4 = *(map **)(param_2 + 0x10);
        if (((byte)*param_2 & 1) == 0) {
          pmVar4 = param_2 + 1;
          uVar14 = (ulong)((byte)*param_2 >> 1);
        }
        pbVar13 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                            (pbVar13,(char *)pmVar4,uVar14);
        pbVar13 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                            (pbVar13,", status: ",10);
        pbVar13 = (basic_ostream *)
                  std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::operator<<
                            ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar13,local_318
                            );
        pbVar13 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                            (pbVar13,", HTTP Status line: ",0x14);
        pfVar24 = (function *)(local_3f0 >> 1 & 0x7f);
        pfVar1 = (function *)((ulong)&local_3f0 | 1);
        if ((local_3f0 & 1) != 0) {
          pfVar24 = pfStack_3e8;
          pfVar1 = local_3e0;
        }
        std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                  (pbVar13,(char *)pfVar1,(ulong)pfVar24);
                    /* try { // try from 0099c62c to 0099c637 has its CatchHandler @ 0099da7c */
        std::__ndk1::
        basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::str();
        local_438 = &local_430;
        local_430 = (__tree_node *)0x0;
        uStack_428 = 0;
        cStack_1e8 = '\0';
        uStack_1e7 = 0;
        uStack_1e5 = 0;
        uStack_1e4 = 0;
        local_1f0 = (tuple)0x0;
        uStack_1ef = 0;
        local_1e0 = (__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                     *)0x0;
                    /* try { // try from 0099c654 to 0099c66f has its CatchHandler @ 0099da48 */
        WebSocketInitResult::WebSocketInitResult(in_x8,0,local_318,&local_458,&local_438,&local_1f0)
        ;
        if (((byte)local_1f0 & 1) != 0) {
          operator_delete(local_1e0);
        }
        std::__ndk1::
        __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
        ::destroy((__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                   *)&local_438,local_430);
        if ((local_458 & 1) != 0) {
          operator_delete(local_448[0]);
        }
        local_1d0 = (basic_string_conflict)0xe0;
        uStack_1cf = 0xc4e4;
        uStack_1cb = 0;
        uStack_1c9 = 0;
        local_150[0] = &PTR_FUN_00c4e530;
        local_1c0 = 0xc4e508;
        uStack_1bb = 0;
        uStack_1b8 = 0xc4e678;
        uStack_1b3 = 0;
        if ((local_178 & 1) != 0) {
          operator_delete(local_168);
        }
        uStack_1b8 = 0xc4e728;
        uStack_1b3 = 0;
        std::__ndk1::locale::~locale(alStack_1b0);
        std::__ndk1::ios_base::~ios_base((ios_base *)local_150);
        if ((local_420 & 1) != 0) goto LAB_0099c6ec;
      }
      else {
        if ((function *)0xffffffffffffffef < pfStack_3c0) {
                    /* try { // try from 0099d6ac to 0099d6b3 has its CatchHandler @ 0099d9b4 */
                    /* WARNING: Subroutine does not return */
          std::__ndk1::__basic_string_common<true>::__throw_length_error();
        }
        if (pfStack_3c0 < (function *)0x17) {
          __dest = (function *)((ulong)&local_3f0 | 1);
          local_3f0 = (ulong)(byte)((int)pfStack_3c0 << 1);
          if (pfStack_3c0 != (function *)0x0) goto LAB_0099c334;
        }
        else {
          pfVar24 = pfStack_3c0 + 0x10;
                    /* try { // try from 0099c31c to 0099c323 has its CatchHandler @ 0099d9b4 */
          __dest = operator_new((ulong)pfVar24 & 0xfffffffffffffff0);
          local_3f0 = (ulong)pfVar24 & 0xfffffffffffffff0 | 1;
          pfStack_3e8 = pfVar1;
          local_3e0 = __dest;
LAB_0099c334:
          pfVar24 = pfVar1;
          memcpy(__dest,__src,(size_t)pfVar1);
          pbVar33 = extraout_x1_00;
        }
        __dest[(long)pfVar1] = (function)0x0;
        if (bVar9 != (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                     )0x0) goto LAB_0099c150;
LAB_0099c350:
        pfStack_328 = (function *)0x0;
        local_330 = 0;
        local_320 = (long *)0x0;
                    /* try { // try from 0099c35c to 0099c363 has its CatchHandler @ 0099da20 */
        local_320 = operator_new(0x30);
        pfStack_328 = (function *)0x25;
        local_330 = 0x31;
        builtin_strncpy((char *)((long)local_320 + 0x1d),"ne from ",8);
        local_320[1] = 0x4820676e69646165;
        *local_320 = 0x722064656c696146;
        local_320[3] = 0x20656e696c207375;
        local_320[2] = 0x7461747320505454;
        *(char *)((long)local_320 + 0x25) = '\0';
        uVar14 = *(ulong *)(param_2 + 8);
        pmVar4 = *(map **)(param_2 + 0x10);
        if (((byte)*param_2 & 1) == 0) {
          pmVar4 = param_2 + 1;
          uVar14 = (ulong)((byte)*param_2 >> 1);
        }
                    /* try { // try from 0099c3ac to 0099c3bb has its CatchHandler @ 0099da08 */
        puVar15 = (undefined8 *)
                  std::__ndk1::
                  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
                  append((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                          *)&local_330,(char *)pmVar4,uVar14);
        local_1c0 = (undefined5)puVar15[2];
        uStack_1bb = (undefined3)((ulong)puVar15[2] >> 0x28);
        uVar37 = puVar15[1];
        uVar36 = *puVar15;
        local_408 = &local_400;
        uStack_1c8 = (undefined1)uVar37;
        uStack_1c7 = (undefined2)((ulong)uVar37 >> 8);
        uStack_1c5 = (undefined1)((ulong)uVar37 >> 0x18);
        uStack_1c4 = (undefined4)((ulong)uVar37 >> 0x20);
        local_1d0 = SUB81(uVar36,0);
        uStack_1cf = (undefined4)((ulong)uVar36 >> 8);
        uStack_1cb = (undefined2)((ulong)uVar36 >> 0x28);
        uStack_1c9 = (undefined1)((ulong)uVar36 >> 0x38);
        puVar15[1] = 0;
        puVar15[2] = 0;
        *puVar15 = 0;
        local_400 = (__tree_node *)0x0;
        uStack_3f8 = 0;
        local_458 = 0;
        local_450 = (__tree_node *)0x0;
        local_448[0] = (__tree_node *)0x0;
                    /* try { // try from 0099c3ec to 0099c407 has its CatchHandler @ 0099d9cc */
        WebSocketInitResult::WebSocketInitResult(in_x8,0,0,&local_1d0,&local_408,&local_458);
        if ((local_458 & 1) != 0) {
          operator_delete(local_448[0]);
        }
        std::__ndk1::
        __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
        ::destroy((__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
                   *)&local_408,local_400);
        if (((byte)local_1d0 & 1) == 0) goto LAB_0099c6f4;
        plVar16 = (long *)CONCAT35(uStack_1bb,local_1c0);
LAB_0099c6f0:
        operator_delete(plVar16);
      }
LAB_0099c6f4:
      if ((local_330 & 1) != 0) {
        operator_delete(local_320);
      }
      if ((local_3f0 & 1) != 0) {
        operator_delete(local_3e0);
      }
      if ((uStack_3c8 & 1) != 0) {
LAB_0099c734:
        operator_delete(local_3b8);
      }
    }
    local_310 = &PTR_LAB_00c4e4e0;
    local_290[0] = &PTR_FUN_00c4e530;
    local_300 = &PTR_FUN_00c4e508;
    ppuStack_2f8 = &PTR_LAB_00c4e678;
    if ((local_2b8 & 1) != 0) {
      operator_delete(local_2a8);
    }
    ppuStack_2f8 = &PTR__basic_streambuf_00c4e728;
    std::__ndk1::locale::~locale(alStack_2f0);
    std::__ndk1::ios_base::~ios_base((ios_base *)local_290);
    if (((byte)local_380[0] & 1) != 0) {
      operator_delete(local_370);
    }
  }
  if ((local_350 & 1) != 0) {
    operator_delete(local_340);
  }
  if (afStack_b0 == local_90) {
    pcVar26 = *(code **)(*(long *)local_90 + 0x20);
  }
  else {
    if (local_90 == (function *)0x0) goto LAB_0099c18c;
    pcVar26 = *(code **)(*(long *)local_90 + 0x28);
  }
  (*pcVar26)();
LAB_0099c18c:
  if (*(long *)(lVar6 + 0x28) != lVar29) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

