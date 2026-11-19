/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00993860
 */

/* ix::WebSocketServer::handleUpgrade(std::__ndk1::unique_ptr<ix::Socket,
   std::__ndk1::default_delete<ix::Socket> >, std::__ndk1::shared_ptr<ix::ConnectionState>,
   std::__ndk1::shared_ptr<ix::HttpRequest>) */

void __thiscall
ix::WebSocketServer::handleUpgrade
          (WebSocketServer *this,undefined8 *param_2,basic_string_conflict *param_3,
          undefined8 *param_4)

{
  WebSocket *this_00;
  __shared_weak_count *p_Var1;
  __shared_weak_count *p_Var2;
  mutex *this_01;
  WebSocketServer *pWVar3;
  __tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
  *p_Var4;
  undefined8 uVar5;
  undefined4 uVar6;
  WebSocketServer WVar7;
  char cVar8;
  bool bVar9;
  long lVar10;
  char *pcVar11;
  __shared_weak_count *this_02;
  long *plVar12;
  ulong uVar13;
  void *pvVar14;
  __tree_node_base *p_Var15;
  basic_ostream *pbVar16;
  undefined8 *puVar17;
  WebSocketServer *pWVar18;
  basic_string_conflict *pbVar19;
  long lVar20;
  WebSocket *pWVar21;
  code *pcVar22;
  WebSocketServer *pWVar23;
  long lVar24;
  __shared_weak_count *p_Var25;
  basic_string_conflict local_248 [16];
  void *local_238;
  undefined8 local_230;
  __shared_weak_count *local_228;
  long *local_220;
  char local_218 [4];
  int local_214;
  byte local_210;
  char acStack_20f [7];
  ulong local_208;
  char *local_200;
  __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
  a_Stack_1f8 [8];
  __tree_node *local_1f0;
  byte local_1e0;
  void *local_1d0;
  byte local_1c8;
  void *local_1b8;
  undefined8 local_1b0;
  __shared_weak_count *local_1a8;
  WebSocket *local_1a0;
  __shared_weak_count *local_198;
  basic_string_conflict local_190;
  undefined7 uStack_18f;
  undefined1 uStack_188;
  undefined7 uStack_187;
  basic_ostream local_180;
  undefined4 uStack_17f;
  undefined1 uStack_17b;
  undefined2 uStack_17a;
  undefined **ppuStack_178;
  basic_string_conflict *local_170;
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
  
  lVar10 = tpidr_el0;
  lVar20 = *(long *)(lVar10 + 0x28);
  pbVar19 = param_3;
  pcVar11 = (char *)(**(code **)(**(long **)param_3 + 0x18))(*(long **)param_3);
  std::__ndk1::operator+((__ndk1 *)"Srv:ws:",pcVar11,pbVar19);
                    /* try { // try from 009938c4 to 009938cb has its CatchHandler @ 00994390 */
  setThreadName(&local_190);
  if (((byte)local_190 & 1) != 0) {
    operator_delete((void *)CONCAT26(uStack_17a,CONCAT15(uStack_17b,CONCAT41(uStack_17f,local_180)))
                   );
  }
  this_02 = operator_new(0x510);
  *(undefined8 *)(this_02 + 0x10) = 0;
  p_Var25 = this_02 + 8;
  *(long *)p_Var25 = 0;
  this_00 = (WebSocket *)(this_02 + 0x20);
  *(undefined ***)this_02 = &PTR____shared_ptr_emplace_00c52448;
                    /* try { // try from 00993908 to 0099390f has its CatchHandler @ 00994374 */
  WebSocket::WebSocket(this_00);
                    /* try { // try from 00993910 to 0099391b has its CatchHandler @ 009943ac */
  WebSocket::setAutoThreadName(this_00,false);
  plVar12 = *(long **)(this + 0x270);
  if (plVar12 == (long *)0x0) {
    if (*(long *)(this + 0x2a0) == 0) {
      local_190 = (basic_string_conflict)0x0;
      uStack_18f = 0;
      uStack_188 = 0;
      uStack_187 = 0;
      local_180 = (basic_ostream)0x0;
      uStack_17f = 0;
      uStack_17b = 0;
      uStack_17a = 0;
                    /* try { // try from 00993b08 to 00993b0f has its CatchHandler @ 009940dc */
      pvVar14 = operator_new(0x60);
      local_180 = SUB81(pvVar14,0);
      uStack_17f = (undefined4)((ulong)pvVar14 >> 8);
      uStack_17b = (undefined1)((ulong)pvVar14 >> 0x28);
      uStack_17a = (undefined2)((ulong)pvVar14 >> 0x30);
      uStack_188 = 0x50;
      uStack_187 = 0;
      local_190 = (basic_string_conflict)0x61;
      uStack_18f = 0;
      memcpy(pvVar14,
             "WebSocketServer Application developer error: No server callback is registerered.",0x50
            );
      *(undefined1 *)((long)pvVar14 + 0x50) = 0;
                    /* try { // try from 00993b38 to 00993b43 has its CatchHandler @ 009940d8 */
      SocketServer::logError((SocketServer *)this,&local_190);
      if (((byte)local_190 & 1) != 0) {
        operator_delete((void *)CONCAT26(uStack_17a,
                                         CONCAT15(uStack_17b,CONCAT41(uStack_17f,local_180))));
      }
      local_190 = (basic_string_conflict)0x0;
      uStack_18f = 0;
      uStack_188 = 0;
      uStack_187 = 0;
      local_180 = (basic_ostream)0x0;
      uStack_17f = 0;
      uStack_17b = 0;
      uStack_17a = 0;
                    /* try { // try from 00993b5c to 00993b63 has its CatchHandler @ 009940d0 */
      pvVar14 = operator_new(0x50);
      local_180 = SUB81(pvVar14,0);
      uStack_17f = (undefined4)((ulong)pvVar14 >> 8);
      uStack_17b = (undefined1)((ulong)pvVar14 >> 0x28);
      uStack_17a = (undefined2)((ulong)pvVar14 >> 0x30);
      uStack_188 = 0x46;
      uStack_187 = 0;
      local_190 = (basic_string_conflict)0x51;
      uStack_18f = 0;
      memcpy(pvVar14,"Missing call to setOnConnectionCallback or setOnClientMessageCallback.",0x46);
      *(undefined1 *)((long)pvVar14 + 0x46) = 0;
                    /* try { // try from 00993b8c to 00993b97 has its CatchHandler @ 009940cc */
      SocketServer::logError((SocketServer *)this,&local_190);
      if (((byte)local_190 & 1) != 0) {
        operator_delete((void *)CONCAT26(uStack_17a,
                                         CONCAT15(uStack_17b,CONCAT41(uStack_17f,local_180))));
      }
                    /* try { // try from 00993bac to 00993baf has its CatchHandler @ 009943ac */
      ConnectionState::setTerminated(*(ConnectionState **)param_3);
      goto LAB_00994038;
    }
    uVar5 = *(undefined8 *)param_3;
    lVar24 = *(long *)(param_3 + 8);
    if (lVar24 != 0) {
      plVar12 = (long *)(lVar24 + 8);
      do {
        cVar8 = '\x01';
        bVar9 = (bool)ExclusiveMonitorPass(plVar12,0x10);
        if (bVar9) {
          *plVar12 = *plVar12 + 1;
          cVar8 = ExclusiveMonitorsStatus();
        }
      } while (cVar8 != '\0');
    }
    local_170 = (basic_string_conflict *)0x0;
                    /* try { // try from 00993ab0 to 00993ab7 has its CatchHandler @ 0099414c */
    local_170 = operator_new(0x28);
    *(WebSocket **)(local_170 + 0x10) = this_00;
    *(undefined8 *)(local_170 + 0x18) = uVar5;
    *(long *)(local_170 + 0x20) = lVar24;
    *(undefined ***)local_170 = &PTR_LAB_00c52348;
    *(WebSocketServer **)(local_170 + 8) = this;
                    /* try { // try from 00993ad4 to 00993ae3 has its CatchHandler @ 00994118 */
    WebSocket::setOnMessageCallback(this_00,(function *)&local_190);
    if (&local_190 == local_170) {
      pcVar22 = *(code **)(*(long *)local_170 + 0x20);
    }
    else {
      if (local_170 == (basic_string_conflict *)0x0) goto LAB_00993bc0;
      pcVar22 = *(code **)(*(long *)local_170 + 0x28);
    }
    (*pcVar22)();
  }
  else {
    p_Var1 = this_02 + 0x10;
    do {
      cVar8 = '\x01';
      bVar9 = (bool)ExclusiveMonitorPass(p_Var1,0x10);
      if (bVar9) {
        *(long *)p_Var1 = *(long *)p_Var1 + 1;
        cVar8 = ExclusiveMonitorsStatus();
      }
    } while (cVar8 != '\0');
    local_1b0 = *(undefined8 *)param_3;
    local_1a8 = *(__shared_weak_count **)(param_3 + 8);
    local_1a0 = this_00;
    local_198 = this_02;
    if (local_1a8 != (__shared_weak_count *)0x0) {
      p_Var1 = local_1a8 + 8;
      do {
        cVar8 = '\x01';
        bVar9 = (bool)ExclusiveMonitorPass(p_Var1,0x10);
        if (bVar9) {
          *(long *)p_Var1 = *(long *)p_Var1 + 1;
          cVar8 = ExclusiveMonitorsStatus();
        }
      } while (cVar8 != '\0');
      plVar12 = *(long **)(this + 0x270);
      if (plVar12 == (long *)0x0) {
        puVar17 = (undefined8 *)__cxa_allocate_exception(8);
        *puVar17 = &PTR__bad_function_call_00cac7b8;
                    /* try { // try from 009940b0 to 009940c3 has its CatchHandler @ 00994288 */
                    /* WARNING: Subroutine does not return */
        __cxa_throw(puVar17,&std::__ndk1::bad_function_call::typeinfo,
                    std::bad_exception::~bad_exception);
      }
    }
                    /* try { // try from 00993978 to 00993983 has its CatchHandler @ 00994288 */
    (**(code **)(*plVar12 + 0x30))(plVar12,&local_1a0,&local_1b0);
    p_Var1 = local_1a8;
    if (local_1a8 != (__shared_weak_count *)0x0) {
      p_Var2 = local_1a8 + 8;
      do {
        lVar24 = *(long *)p_Var2;
        cVar8 = '\x01';
        bVar9 = (bool)ExclusiveMonitorPass(p_Var2,0x10);
        if (bVar9) {
          *(long *)p_Var2 = lVar24 + -1;
          cVar8 = ExclusiveMonitorsStatus();
        }
      } while (cVar8 != '\0');
      if (lVar24 == 0) {
        (**(code **)(*(long *)local_1a8 + 0x10))(local_1a8);
        std::__ndk1::__shared_weak_count::__release_weak(p_Var1);
      }
    }
    if (local_198 != (__shared_weak_count *)0x0) {
      std::__ndk1::__shared_weak_count::__release_weak(local_198);
    }
                    /* try { // try from 009939c8 to 009939cf has its CatchHandler @ 009943ac */
    uVar13 = WebSocket::isOnMessageCallbackRegistered(this_00);
    if ((uVar13 & 1) == 0) {
      local_190 = (basic_string_conflict)0x0;
      uStack_18f = 0;
      uStack_188 = 0;
      uStack_187 = 0;
      local_180 = (basic_ostream)0x0;
      uStack_17f = 0;
      uStack_17b = 0;
      uStack_17a = 0;
                    /* try { // try from 009939dc to 009939e3 has its CatchHandler @ 009941a8 */
      pvVar14 = operator_new(0x60);
      local_180 = SUB81(pvVar14,0);
      uStack_17f = (undefined4)((ulong)pvVar14 >> 8);
      uStack_17b = (undefined1)((ulong)pvVar14 >> 0x28);
      uStack_17a = (undefined2)((ulong)pvVar14 >> 0x30);
      uStack_188 = 0x53;
      uStack_187 = 0;
      local_190 = (basic_string_conflict)0x61;
      uStack_18f = 0;
      memcpy(pvVar14,
             "WebSocketServer Application developer error: Server callback improperly registered.",
             0x53);
      *(undefined1 *)((long)pvVar14 + 0x53) = 0;
                    /* try { // try from 00993a0c to 00993a17 has its CatchHandler @ 00994194 */
      SocketServer::logError((SocketServer *)this,&local_190);
      if (((byte)local_190 & 1) != 0) {
        operator_delete((void *)CONCAT26(uStack_17a,
                                         CONCAT15(uStack_17b,CONCAT41(uStack_17f,local_180))));
      }
      local_190 = (basic_string_conflict)0x0;
      uStack_18f = 0;
      uStack_188 = 0;
      uStack_187 = 0;
      local_180 = (basic_ostream)0x0;
      uStack_17f = 0;
      uStack_17b = 0;
      uStack_17a = 0;
                    /* try { // try from 00993a30 to 00993a37 has its CatchHandler @ 0099418c */
      pvVar14 = operator_new(0x50);
      local_180 = SUB81(pvVar14,0);
      uStack_17f = (undefined4)((ulong)pvVar14 >> 8);
      uStack_17b = (undefined1)((ulong)pvVar14 >> 0x28);
      uStack_17a = (undefined2)((ulong)pvVar14 >> 0x30);
      uStack_188 = 0x44;
      uStack_187 = 0;
      local_190 = (basic_string_conflict)0x51;
      uStack_18f = 0;
      memcpy(pvVar14,"Missing call to setOnMessageCallback inside setOnConnectionCallback.",0x44);
      *(undefined1 *)((long)pvVar14 + 0x44) = 0;
                    /* try { // try from 00993a60 to 00993a6b has its CatchHandler @ 00994188 */
      SocketServer::logError((SocketServer *)this,&local_190);
      if (((byte)local_190 & 1) != 0) {
        operator_delete((void *)CONCAT26(uStack_17a,
                                         CONCAT15(uStack_17b,CONCAT41(uStack_17f,local_180))));
      }
                    /* try { // try from 00993a80 to 00993a83 has its CatchHandler @ 009943ac */
      ConnectionState::setTerminated(*(ConnectionState **)param_3);
      goto LAB_00994038;
    }
  }
LAB_00993bc0:
                    /* try { // try from 00993bc0 to 00993be3 has its CatchHandler @ 009943ac */
  WebSocket::disableAutomaticReconnection(this_00);
  if (this[0x240] == (WebSocketServer)0x0) {
    WebSocket::disablePong(this_00);
  }
  else {
    WebSocket::enablePong(this_00);
  }
  this_01 = (mutex *)(this + 0x2b0);
                    /* try { // try from 00993be8 to 00993bef has its CatchHandler @ 00994280 */
  std::__ndk1::mutex::lock(this_01);
  pWVar3 = this + 0x2e0;
  pWVar23 = pWVar3;
  if (*(WebSocketServer **)(this + 0x2e0) == (WebSocketServer *)0x0) {
    pWVar18 = pWVar3;
  }
  else {
    pWVar18 = *(WebSocketServer **)(this + 0x2e0);
    while( true ) {
      while (pWVar21 = *(WebSocket **)(pWVar18 + 0x20), this_00 > pWVar21 || pWVar21 == this_00) {
        if (this_00 <= pWVar21) goto LAB_00993c50;
        pWVar23 = pWVar18 + 8;
        if (*(WebSocketServer **)pWVar23 == (WebSocketServer *)0x0) goto LAB_00993c50;
        pWVar18 = *(WebSocketServer **)pWVar23;
      }
      pWVar23 = pWVar18;
      if (*(WebSocketServer **)pWVar18 == (WebSocketServer *)0x0) break;
      pWVar18 = *(WebSocketServer **)pWVar18;
    }
  }
LAB_00993c50:
  p_Var4 = (__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
            *)(this + 0x2d8);
  if (*(long *)pWVar23 == 0) {
                    /* try { // try from 00993c60 to 00993c6b has its CatchHandler @ 00994108 */
    p_Var15 = operator_new(0x30);
    *(WebSocket **)(p_Var15 + 0x20) = this_00;
    *(__shared_weak_count **)(p_Var15 + 0x28) = this_02;
    do {
      cVar8 = '\x01';
      bVar9 = (bool)ExclusiveMonitorPass(p_Var25,0x10);
      if (bVar9) {
        *(long *)p_Var25 = *(long *)p_Var25 + 1;
        cVar8 = ExclusiveMonitorsStatus();
      }
    } while (cVar8 != '\0');
    *(undefined8 *)p_Var15 = 0;
    *(undefined8 *)(p_Var15 + 8) = 0;
    *(WebSocketServer **)(p_Var15 + 0x10) = pWVar18;
    *(__tree_node_base **)pWVar23 = p_Var15;
    if (**(long **)p_Var4 != 0) {
      *(long *)p_Var4 = **(long **)p_Var4;
      p_Var15 = *(__tree_node_base **)pWVar23;
    }
    std::__ndk1::__tree_balance_after_insert<std::__ndk1::__tree_node_base<void*>*>
              (*(__tree_node_base **)(this + 0x2e0),p_Var15);
    *(long *)(this + 0x2e8) = *(long *)(this + 0x2e8) + 1;
  }
  std::__ndk1::mutex::unlock(this_01);
  local_220 = (long *)*param_2;
  *param_2 = 0;
  local_230 = *param_4;
  uVar6 = *(undefined4 *)(this + 0x23c);
  WVar7 = this[0x241];
  local_228 = (__shared_weak_count *)param_4[1];
  if (local_228 != (__shared_weak_count *)0x0) {
    p_Var1 = local_228 + 8;
    do {
      cVar8 = '\x01';
      bVar9 = (bool)ExclusiveMonitorPass(p_Var1,0x10);
      if (bVar9) {
        *(long *)p_Var1 = *(long *)p_Var1 + 1;
        cVar8 = ExclusiveMonitorsStatus();
      }
    } while (cVar8 != '\0');
  }
                    /* try { // try from 00993d04 to 00993d17 has its CatchHandler @ 00994228 */
  WebSocket::connectToSocket
            (local_218,this_00,&local_220,uVar6,WVar7 != (WebSocketServer)0x0,&local_230);
  p_Var1 = local_228;
  if (local_228 != (__shared_weak_count *)0x0) {
    p_Var2 = local_228 + 8;
    do {
      lVar24 = *(long *)p_Var2;
      cVar8 = '\x01';
      bVar9 = (bool)ExclusiveMonitorPass(p_Var2,0x10);
      if (bVar9) {
        *(long *)p_Var2 = lVar24 + -1;
        cVar8 = ExclusiveMonitorsStatus();
      }
    } while (cVar8 != '\0');
    if (lVar24 == 0) {
      (**(code **)(*(long *)local_228 + 0x10))(local_228);
      std::__ndk1::__shared_weak_count::__release_weak(p_Var1);
    }
  }
  plVar12 = local_220;
  local_220 = (long *)0x0;
  if (plVar12 != (long *)0x0) {
    (**(code **)(*plVar12 + 8))();
  }
  if (local_218[0] == '\0') {
    local_180 = (basic_ostream)0x8;
    uStack_17f = 0xc4e5;
    uStack_17b = 0;
    uStack_17a = 0;
    local_110[0] = &PTR__basic_istream_00c4e640;
    uStack_188 = 0;
    uStack_187 = 0;
    local_190 = (basic_string_conflict)0x18;
    uStack_18f = 0xc4e6;
                    /* try { // try from 00993dc4 to 00993dcb has its CatchHandler @ 00994100 */
    std::__ndk1::ios_base::init((ios_base *)local_110,&ppuStack_178);
    local_88 = 0;
    local_80 = 0xffffffff;
    local_190 = (basic_string_conflict)0xe0;
    uStack_18f = 0xc4e4;
    local_110[0] = &PTR_FUN_00c4e530;
    ppuStack_178 = &PTR__basic_streambuf_00c4e728;
    local_180 = (basic_ostream)0x8;
    uStack_17f = 0xc4e5;
    uStack_17b = 0;
    uStack_17a = 0;
    std::__ndk1::locale::locale((locale *)&local_170);
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
                    /* try { // try from 00993e44 to 00993e93 has its CatchHandler @ 009942d4 */
    pbVar16 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                        (&local_180,"WebSocketServer::handleConnection() HTTP status: ",0x31);
    pbVar16 = (basic_ostream *)
              std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::operator<<
                        ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar16,local_214);
    pbVar16 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                        (pbVar16," error: ",8);
    uVar13 = (ulong)(local_210 >> 1);
    pcVar11 = acStack_20f;
    if ((local_210 & 1) != 0) {
      uVar13 = local_208;
      pcVar11 = local_200;
    }
    std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
              (pbVar16,pcVar11,uVar13);
                    /* try { // try from 00993e94 to 00993e9f has its CatchHandler @ 009940fc */
    std::__ndk1::basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    str();
                    /* try { // try from 00993ea0 to 00993eb3 has its CatchHandler @ 009940e4 */
    SocketServer::logError((SocketServer *)this,local_248);
    if (((byte)local_248[0] & 1) != 0) {
      operator_delete(local_238);
    }
    local_190 = (basic_string_conflict)0xe0;
    uStack_18f = 0xc4e4;
    local_110[0] = &PTR_FUN_00c4e530;
    local_180 = (basic_ostream)0x8;
    uStack_17f = 0xc4e5;
    uStack_17b = 0;
    uStack_17a = 0;
    ppuStack_178 = &PTR_LAB_00c4e678;
    if ((local_138 & 1) != 0) {
      operator_delete(local_128);
    }
    ppuStack_178 = &PTR__basic_streambuf_00c4e728;
    std::__ndk1::locale::~locale((locale *)&local_170);
    std::__ndk1::ios_base::~ios_base((ios_base *)local_110);
  }
  else {
                    /* try { // try from 00993d78 to 00993d7f has its CatchHandler @ 009941b0 */
    WebSocket::run(this_00);
  }
  local_170 = (basic_string_conflict *)0x0;
                    /* try { // try from 00993f20 to 00993f2f has its CatchHandler @ 009941ec */
  WebSocket::setOnMessageCallback(this_00,(function *)&local_190);
  if (&local_190 == local_170) {
    pcVar22 = *(code **)(*(long *)local_170 + 0x20);
LAB_00993f54:
    (*pcVar22)();
  }
  else if (local_170 != (basic_string_conflict *)0x0) {
    pcVar22 = *(code **)(*(long *)local_170 + 0x28);
    goto LAB_00993f54;
  }
                    /* try { // try from 00993f58 to 00993f5f has its CatchHandler @ 009941dc */
  std::__ndk1::mutex::lock(this_01);
  pWVar23 = *(WebSocketServer **)pWVar3;
  if (pWVar23 == (WebSocketServer *)0x0) {
LAB_00993f98:
    uStack_17a = 0;
    local_190 = (basic_string_conflict)0x28;
    uStack_17f = 0x746e6569;
    uStack_187 = 0x63206574656c65;
    local_180 = (basic_ostream)0x6c;
    uStack_18f = 0x20746f6e6e6143;
    uStack_188 = 100;
    uStack_17b = 0;
                    /* try { // try from 00993fc8 to 00993fd3 has its CatchHandler @ 009941b4 */
    SocketServer::logError((SocketServer *)this,&local_190);
    if (((byte)local_190 & 1) != 0) {
      operator_delete((void *)CONCAT26(uStack_17a,
                                       CONCAT15(uStack_17b,CONCAT41(uStack_17f,local_180))));
    }
  }
  else {
    pWVar18 = pWVar3;
    do {
      if (*(WebSocket **)(pWVar23 + 0x20) >= this_00) {
        pWVar18 = pWVar23;
      }
      pWVar23 = *(WebSocketServer **)
                 (pWVar23 + (ulong)(*(WebSocket **)(pWVar23 + 0x20) < this_00) * 8);
    } while (pWVar23 != (WebSocketServer *)0x0);
    if ((pWVar18 == pWVar3) || (this_00 < *(WebSocket **)(pWVar18 + 0x20))) goto LAB_00993f98;
                    /* try { // try from 00993fe8 to 00993fef has its CatchHandler @ 009940c4 */
    std::__ndk1::
    __tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>
    ::erase(p_Var4);
  }
  std::__ndk1::mutex::unlock(this_01);
  if ((local_1c8 & 1) != 0) {
    operator_delete(local_1b8);
  }
  if ((local_1e0 & 1) != 0) {
    operator_delete(local_1d0);
  }
  std::__ndk1::
  __tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>
  ::destroy(a_Stack_1f8,local_1f0);
  if ((local_210 & 1) != 0) {
    operator_delete(local_200);
  }
LAB_00994038:
  do {
    lVar24 = *(long *)p_Var25;
    cVar8 = '\x01';
    bVar9 = (bool)ExclusiveMonitorPass(p_Var25,0x10);
    if (bVar9) {
      *(long *)p_Var25 = lVar24 + -1;
      cVar8 = ExclusiveMonitorsStatus();
    }
  } while (cVar8 != '\0');
  if (lVar24 == 0) {
    (**(code **)(*(long *)this_02 + 0x10))(this_02);
    std::__ndk1::__shared_weak_count::__release_weak(this_02);
  }
  if (*(long *)(lVar10 + 0x28) != lVar20) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

