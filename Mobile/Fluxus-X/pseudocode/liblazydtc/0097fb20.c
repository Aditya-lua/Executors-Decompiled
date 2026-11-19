/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0097fb20
 */

void FUN_0097fb20(long param_1,long *param_2,undefined8 *param_3,undefined8 param_4,
                 undefined8 param_5,basic_string_conflict *param_6)

{
  __shared_weak_count *p_Var1;
  byte *pbVar2;
  ConnectionState *this;
  ulong uVar3;
  __shared_weak_count *this_00;
  __shared_weak_count *p_Var4;
  char *pcVar5;
  byte bVar6;
  char cVar7;
  bool bVar8;
  long lVar9;
  int iVar10;
  long lVar11;
  byte *pbVar12;
  basic_ostream *pbVar13;
  long lVar14;
  byte *pbVar15;
  SocketServer *this_01;
  undefined4 local_1d0 [2];
  piecewise_construct_t local_1c8;
  undefined4 uStack_1c7;
  undefined2 uStack_1c3;
  undefined1 uStack_1c1;
  undefined1 local_1c0;
  undefined1 uStack_1bf;
  undefined1 uStack_1be;
  undefined1 uStack_1bd;
  undefined4 uStack_1bc;
  void *local_1b8;
  __tree_node **local_1b0;
  __tree_node *local_1a8;
  undefined8 uStack_1a0;
  piecewise_construct_t *local_198;
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
  
  lVar9 = tpidr_el0;
  lVar14 = *(long *)(lVar9 + 0x28);
  pbVar2 = (byte *)*param_2;
  this_00 = (__shared_weak_count *)param_2[1];
  *param_2 = 0;
  param_2[1] = 0;
  this = (ConnectionState *)*param_3;
  p_Var4 = (__shared_weak_count *)param_3[1];
  *param_3 = 0;
  param_3[1] = 0;
  this_01 = *(SocketServer **)(param_1 + 8);
  local_1b0 = &local_1a8;
  local_1a8 = (__tree_node *)0x0;
  uStack_1a0 = 0;
                    /* try { // try from 0097fb78 to 0097fb83 has its CatchHandler @ 0098010c */
  ix::userAgent();
  local_198 = &local_1c8;
  local_1c0 = 0;
  uStack_1bf = 0;
  uStack_1be = 0;
  uStack_1bd = 0;
  uStack_1bc = 0;
  local_1b8 = (void *)0x0;
  local_1c8 = (piecewise_construct_t)0xc;
  uStack_1c3 = 0x7265;
  uStack_1c7 = 0x76726553;
  uStack_1c1 = 0;
                    /* try { // try from 0097fbb4 to 0097fbcf has its CatchHandler @ 009800e0 */
  lVar11 = std::__ndk1::
           __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
           ::
           __emplace_unique_key_args<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::piecewise_construct_t_const&,std::__ndk1::tuple<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>&&>,std::__ndk1::tuple<>>
                     ((basic_string_conflict *)&local_1b0,&local_1c8,(tuple *)&DAT_007497e2,
                      (tuple *)&local_198);
  pbVar15 = (byte *)(lVar11 + 0x38);
  if ((*pbVar15 & 1) == 0) {
    pbVar15[0] = 0;
    pbVar15[1] = 0;
  }
  else {
    **(undefined1 **)(lVar11 + 0x48) = 0;
    *(undefined8 *)(lVar11 + 0x40) = 0;
    if ((*(byte *)(lVar11 + 0x38) & 1) != 0) {
      operator_delete(*(void **)(lVar11 + 0x48));
      *(undefined8 *)(lVar11 + 0x38) = 0;
    }
  }
  *(undefined ***)(lVar11 + 0x48) = local_180;
  *(undefined8 *)(lVar11 + 0x40) = uStack_188;
  *(undefined ***)pbVar15 = local_190;
  local_190 = (undefined **)0x0;
  uStack_188 = 0;
  local_180 = (void *)0x0;
  if ((((byte)local_1c8 & 1) != 0) && (operator_delete(local_1b8), ((ulong)local_190 & 1) != 0)) {
    operator_delete(local_180);
  }
  local_180 = &PTR_FUN_00c4e508;
  local_110[0] = &PTR__basic_istream_00c4e640;
  uStack_188 = 0;
  local_190 = &PTR__basic_istream_00c4e618;
                    /* try { // try from 0097fc80 to 0097fc8b has its CatchHandler @ 009800d8 */
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
                    /* try { // try from 0097fd00 to 0097fd97 has its CatchHandler @ 00980130 */
  pbVar12 = (byte *)ix::ConnectionState::getRemoteIp(this);
  uVar3 = *(ulong *)(pbVar12 + 8);
  pbVar15 = *(byte **)(pbVar12 + 0x10);
  if ((*pbVar12 & 1) == 0) {
    pbVar15 = pbVar12 + 1;
    uVar3 = (ulong)(*pbVar12 >> 1);
  }
  pbVar13 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                      ((basic_ostream *)&local_180,(char *)pbVar15,uVar3);
  pbVar13 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                      (pbVar13,":",1);
  iVar10 = ix::ConnectionState::getRemotePort(this);
  pbVar13 = (basic_ostream *)
            std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::operator<<
                      ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar13,iVar10);
  pbVar13 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                      (pbVar13," ",1);
  uVar3 = (ulong)(pbVar2[0x18] >> 1);
  pbVar15 = pbVar2 + 0x19;
  if ((pbVar2[0x18] & 1) != 0) {
    uVar3 = *(ulong *)(pbVar2 + 0x20);
    pbVar15 = *(byte **)(pbVar2 + 0x28);
  }
  pbVar13 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                      (pbVar13,(char *)pbVar15,uVar3);
  pbVar13 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                      (pbVar13," ",1);
  local_198 = &local_1c8;
  uStack_1bc = 0;
  local_1b8 = (void *)0x0;
  local_1c8 = (piecewise_construct_t)0x14;
  uStack_1bf = 0x6e;
  uStack_1be = 0x74;
  uStack_1c7 = 0x72657355;
  uStack_1c3 = 0x412d;
  uStack_1c1 = 0x67;
  local_1c0 = 0x65;
  uStack_1bd = 0;
                    /* try { // try from 0097fdd4 to 0097fe3b has its CatchHandler @ 00980118 */
  lVar11 = std::__ndk1::
           __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
           ::
           __emplace_unique_key_args<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::piecewise_construct_t_const&,std::__ndk1::tuple<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>&&>,std::__ndk1::tuple<>>
                     ((basic_string_conflict *)(pbVar2 + 0x60),&local_1c8,(tuple *)&DAT_007497e2,
                      (tuple *)&local_198);
  uVar3 = (ulong)(*(byte *)(lVar11 + 0x38) >> 1);
  pcVar5 = (char *)(lVar11 + 0x39);
  if ((*(byte *)(lVar11 + 0x38) & 1) != 0) {
    uVar3 = *(ulong *)(lVar11 + 0x40);
    pcVar5 = *(char **)(lVar11 + 0x48);
  }
  pbVar13 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                      (pbVar13,pcVar5,uVar3);
  pbVar13 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                      (pbVar13," ",1);
  uVar3 = *(ulong *)(pbVar2 + 8);
  pbVar15 = *(byte **)(pbVar2 + 0x10);
  if ((*pbVar2 & 1) == 0) {
    pbVar15 = pbVar2 + 1;
    uVar3 = (ulong)(*pbVar2 >> 1);
  }
  std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
            (pbVar13,(char *)pbVar15,uVar3);
  if (((byte)local_1c8 & 1) != 0) {
    operator_delete(local_1b8);
  }
                    /* try { // try from 0097fe4c to 0097fe57 has its CatchHandler @ 009800d0 */
  std::__ndk1::basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
  str();
                    /* try { // try from 0097fe58 to 0097fe63 has its CatchHandler @ 009800cc */
  ix::SocketServer::logInfo(this_01,(basic_string_conflict *)&local_1c8);
  if (((byte)local_1c8 & 1) != 0) {
    operator_delete(local_1b8);
  }
  bVar6 = pbVar2[0x18];
  uVar3 = (ulong)(bVar6 >> 1);
  if ((bVar6 & 1) != 0) {
    uVar3 = *(ulong *)(pbVar2 + 0x20);
  }
  if (uVar3 == 4) {
    pbVar15 = pbVar2 + 0x19;
    if ((bVar6 & 1) != 0) {
      pbVar15 = *(byte **)(pbVar2 + 0x28);
    }
    if (*(int *)pbVar15 == 0x54534f50) {
      local_1d0[0] = 0;
      local_1c8 = (piecewise_construct_t)0x0;
      uStack_1c7 = 0;
      uStack_1c3 = 0;
      uStack_1c1 = 0;
      local_1c0 = 0;
      uStack_1bf = 0;
      uStack_1be = 0;
      uStack_1bd = 0;
      uStack_1bc = 0;
      local_198 = (piecewise_construct_t *)CONCAT44(local_198._4_4_,200);
      local_1b8 = (void *)0x0;
                    /* try { // try from 00980090 to 009800af has its CatchHandler @ 009800c4 */
      std::__ndk1::shared_ptr<ix::HttpResponse>::
      make_shared<int,char_const(&)[3],ix::HttpErrorCode,std::__ndk1::map<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,ix::CaseInsensitiveLess,std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>&,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>
                ((shared_ptr<ix::HttpResponse> *)&local_198,(int *)&DAT_002af2e0,(char *)local_1d0,
                 (HttpErrorCode *)&local_1b0,(map *)&local_1c8,param_6);
      goto joined_r0x0097ff74;
    }
  }
  local_198 = &local_1c8;
  uStack_1be = 0;
  uStack_1bd = 0;
  uStack_1bc = 0;
  local_1b8 = (void *)0x0;
  local_1c8 = (piecewise_construct_t)0x10;
  uStack_1c7 = 0x61636f4c;
  uStack_1c3 = 0x6974;
  uStack_1c1 = 0x6f;
  local_1c0 = 0x6e;
  uStack_1bf = 0;
                    /* try { // try from 0097fee0 to 0097ff27 has its CatchHandler @ 00980114 */
  lVar11 = std::__ndk1::
           __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
           ::
           __emplace_unique_key_args<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::piecewise_construct_t_const&,std::__ndk1::tuple<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>&&>,std::__ndk1::tuple<>>
                     ((basic_string_conflict *)&local_1b0,&local_1c8,(tuple *)&DAT_007497e2,
                      (tuple *)&local_198);
  if ((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
      (lVar11 + 0x38) !=
      (basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
      (param_1 + 0x10)) {
    uVar3 = *(ulong *)(param_1 + 0x18);
    pcVar5 = *(char **)(param_1 + 0x20);
    if ((*(byte *)(param_1 + 0x10) & 1) == 0) {
      pcVar5 = (char *)(param_1 + 0x11);
      uVar3 = (ulong)(*(byte *)(param_1 + 0x10) >> 1);
    }
    std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
           (lVar11 + 0x38),pcVar5,uVar3);
  }
  if (((byte)local_1c8 & 1) != 0) {
    operator_delete(local_1b8);
  }
  local_1d0[0] = 0;
  local_1c8 = (piecewise_construct_t)0x0;
  uStack_1c7 = 0;
  uStack_1c3 = 0;
  uStack_1c1 = 0;
  local_1c0 = 0;
  uStack_1bf = 0;
  uStack_1be = 0;
  uStack_1bd = 0;
  uStack_1bc = 0;
  local_198 = (piecewise_construct_t *)CONCAT44(local_198._4_4_,0x12d);
  local_1b8 = (void *)0x0;
                    /* try { // try from 0097ff50 to 0097ff6f has its CatchHandler @ 009800c8 */
  std::__ndk1::shared_ptr<ix::HttpResponse>::
  make_shared<int,char_const(&)[3],ix::HttpErrorCode,std::__ndk1::map<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,ix::CaseInsensitiveLess,std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>&,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>
            ((shared_ptr<ix::HttpResponse> *)&local_198,(int *)&DAT_002af2e0,(char *)local_1d0,
             (HttpErrorCode *)&local_1b0,(map *)&local_1c8,param_6);
joined_r0x0097ff74:
  if (((byte)local_1c8 & 1) != 0) {
    operator_delete(local_1b8);
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
             *)&local_1b0,local_1a8);
  if (p_Var4 != (__shared_weak_count *)0x0) {
    p_Var1 = p_Var4 + 8;
    do {
      lVar11 = *(long *)p_Var1;
      cVar7 = '\x01';
      bVar8 = (bool)ExclusiveMonitorPass(p_Var1,0x10);
      if (bVar8) {
        *(long *)p_Var1 = lVar11 + -1;
        cVar7 = ExclusiveMonitorsStatus();
      }
    } while (cVar7 != '\0');
    if (lVar11 == 0) {
      (**(code **)(*(long *)p_Var4 + 0x10))(p_Var4);
      std::__ndk1::__shared_weak_count::__release_weak(p_Var4);
    }
  }
  if (this_00 != (__shared_weak_count *)0x0) {
    p_Var4 = this_00 + 8;
    do {
      lVar11 = *(long *)p_Var4;
      cVar7 = '\x01';
      bVar8 = (bool)ExclusiveMonitorPass(p_Var4,0x10);
      if (bVar8) {
        *(long *)p_Var4 = lVar11 + -1;
        cVar7 = ExclusiveMonitorsStatus();
      }
    } while (cVar7 != '\0');
    if (lVar11 == 0) {
      (**(code **)(*(long *)this_00 + 0x10))(this_00);
      std::__ndk1::__shared_weak_count::__release_weak(this_00);
    }
  }
  if (*(long *)(lVar9 + 0x28) != lVar14) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

