/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00989220
 */

/* ix::SocketServer::run() */

void __thiscall ix::SocketServer::run(SocketServer *this)

{
  mutex *this_00;
  __shared_weak_count *p_Var1;
  __shared_weak_count *p_Var2;
  char cVar3;
  bool bVar4;
  long lVar5;
  ConnectionState *pCVar6;
  int iVar7;
  uint uVar8;
  int iVar9;
  undefined8 *puVar10;
  basic_ostream *pbVar11;
  char *pcVar12;
  size_t sVar13;
  ulong uVar14;
  long lVar15;
  long *plVar16;
  int extraout_w1;
  void *pvVar17;
  basic_string_conflict *pbVar18;
  SocketTLSOptions *in_x4;
  long lVar19;
  void *pvVar20;
  code *pcVar21;
  SocketServer *local_238;
  undefined8 local_230;
  undefined8 uStack_228;
  long local_218;
  long *local_210;
  ulong local_208;
  undefined8 local_200;
  void *local_1f8;
  socklen_t local_1ec;
  ConnectionState *local_1e8;
  __shared_weak_count *local_1e0;
  void *local_1d8;
  ConnectionState *local_1d0;
  __shared_weak_count *local_1c8;
  void *local_1c0 [4];
  sockaddr local_1a0;
  ConnectionState *local_190;
  __shared_weak_count *p_Stack_188;
  undefined **local_180;
  undefined **ppuStack_178;
  ConnectionState **local_170;
  undefined8 local_168;
  undefined8 uStack_160;
  undefined8 local_158;
  undefined8 uStack_150;
  undefined8 uStack_148;
  undefined8 uStack_140;
  byte local_138;
  undefined8 uStack_130;
  void *local_128;
  undefined8 uStack_120;
  undefined4 local_118;
  undefined **local_110 [17];
  undefined8 local_88;
  undefined4 local_80;
  
  lVar5 = tpidr_el0;
  lVar19 = *(long *)(lVar5 + 0x28);
  SocketConnect::configure(*(int *)(this + 0x3c));
  std::__ndk1::to_string((__ndk1 *)(ulong)*(uint *)(this + 8),extraout_w1);
                    /* try { // try from 00989264 to 0098927b has its CatchHandler @ 00989ff4 */
  puVar10 = (undefined8 *)
            std::__ndk1::
            basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::insert
                      ((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                        *)&local_1d0,0,"Srv:ac:",7);
  local_180 = (undefined **)puVar10[2];
  p_Stack_188 = (__shared_weak_count *)puVar10[1];
  local_190 = (ConnectionState *)*puVar10;
  *puVar10 = 0;
  puVar10[1] = 0;
  puVar10[2] = 0;
                    /* try { // try from 00989298 to 0098929f has its CatchHandler @ 00989fd4 */
  setThreadName((basic_string_conflict *)&local_190);
  if (((ulong)local_190 & 1) != 0) {
    operator_delete(local_180);
  }
  if (((ulong)local_1d0 & 1) != 0) {
    operator_delete(local_1c0[0]);
  }
  this_00 = (mutex *)(this + 0x44);
  pvVar20 = (void *)((ulong)&local_1d0 | 1);
  do {
    if (((byte)this[0x40] & 1) != 0) break;
    iVar7 = Socket::poll(true,-1,*(int *)(this + 0x3c),this + 0x1d8);
    pvVar17 = pvVar20;
    if (iVar7 == 0) {
      local_1ec = 0x10;
      local_1a0.sa_family = 0;
      local_1a0.sa_data[0] = '\0';
      local_1a0.sa_data[1] = '\0';
      local_1a0.sa_data[2] = '\0';
      local_1a0.sa_data[3] = '\0';
      local_1a0.sa_data[4] = '\0';
      local_1a0.sa_data[5] = '\0';
      local_1a0.sa_data[6] = '\0';
      local_1a0.sa_data[7] = '\0';
      local_1a0.sa_data[8] = '\0';
      local_1a0.sa_data[9] = '\0';
      local_1a0.sa_data[10] = '\0';
      local_1a0.sa_data[0xb] = '\0';
      local_1a0.sa_data[0xc] = '\0';
      local_1a0.sa_data[0xd] = '\0';
      iVar7 = accept(*(int *)(this + 0x3c),&local_1a0,&local_1ec);
      if (iVar7 < 0) {
        uVar14 = Socket::isWaitNeeded();
        if ((uVar14 & 1) == 0) {
          iVar7 = Socket::getErrno();
          local_180 = &PTR_FUN_00c4e508;
          local_110[0] = &PTR__basic_istream_00c4e640;
          p_Stack_188 = (__shared_weak_count *)0x0;
          local_190 = (ConnectionState *)&PTR__basic_istream_00c4e618;
                    /* try { // try from 00989600 to 0098960b has its CatchHandler @ 0098a19c */
          std::__ndk1::ios_base::init((ios_base *)local_110,&ppuStack_178);
          local_80 = 0xffffffff;
          local_190 = (ConnectionState *)&PTR_LAB_00c4e4e0;
          local_88 = 0;
          local_110[0] = &PTR_FUN_00c4e530;
          ppuStack_178 = &PTR__basic_streambuf_00c4e728;
          local_180 = &PTR_FUN_00c4e508;
          std::__ndk1::locale::locale((locale *)&local_170);
          uStack_150 = 0;
          local_158 = 0;
          uStack_140 = 0;
          uStack_148 = 0;
          uStack_160 = 0;
          local_168 = 0;
          ppuStack_178 = &PTR_LAB_00c4e678;
          uStack_130 = 0;
          local_138 = 0;
          uStack_120 = 0;
          local_128 = (void *)0x0;
          local_118 = 0x18;
                    /* try { // try from 00989668 to 009896b3 has its CatchHandler @ 0098a2b0 */
          pbVar11 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                              ((basic_ostream *)&local_180,
                               "SocketServer::run() error accepting connection: ",0x30);
          pbVar11 = (basic_ostream *)
                    std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::operator<<
                              ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar11,iVar7);
          pbVar11 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                              (pbVar11,", ",2);
          pcVar12 = strerror(iVar7);
          sVar13 = strlen(pcVar12);
          std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                    (pbVar11,pcVar12,sVar13);
                    /* try { // try from 009896b4 to 009896bf has its CatchHandler @ 0098a158 */
          std::__ndk1::
          basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::str();
                    /* try { // try from 009896c0 to 009896cb has its CatchHandler @ 0098a154 */
          std::__ndk1::mutex::lock(this_00);
          if (((ulong)local_1d0 & 1) != 0) {
            pvVar17 = local_1c0[0];
          }
          goto LAB_009894c0;
        }
        goto LAB_00989878;
      }
      uVar14 = (**(code **)(*(long *)this + 0x20))(this);
      if (*(ulong *)(this + 0x30) <= uVar14) {
        local_180 = &PTR_FUN_00c4e508;
        local_110[0] = &PTR__basic_istream_00c4e640;
        p_Stack_188 = (__shared_weak_count *)0x0;
        local_190 = (ConnectionState *)&PTR__basic_istream_00c4e618;
                    /* try { // try from 00989724 to 0098972f has its CatchHandler @ 0098a228 */
        std::__ndk1::ios_base::init((ios_base *)local_110,&ppuStack_178);
        local_80 = 0xffffffff;
        local_88 = 0;
        local_190 = (ConnectionState *)&PTR_LAB_00c4e4e0;
        local_110[0] = &PTR_FUN_00c4e530;
        ppuStack_178 = &PTR__basic_streambuf_00c4e728;
        local_180 = &PTR_FUN_00c4e508;
        std::__ndk1::locale::locale((locale *)&local_170);
        uStack_150 = 0;
        local_158 = 0;
        uStack_140 = 0;
        uStack_148 = 0;
        uStack_160 = 0;
        local_168 = 0;
        ppuStack_178 = &PTR_LAB_00c4e678;
        uStack_130 = 0;
        local_138 = 0;
        uStack_120 = 0;
        local_128 = (void *)0x0;
        local_118 = 0x18;
                    /* try { // try from 00989788 to 009897c7 has its CatchHandler @ 0098a2c0 */
        pbVar11 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                            ((basic_ostream *)&local_180,
                             "SocketServer::run() reached max connections = ",0x2e);
        pbVar11 = (basic_ostream *)
                  std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::operator<<
                            ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar11,
                             *(ulong *)(this + 0x30));
        pbVar11 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                            (pbVar11,". ",2);
        std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                  (pbVar11,"Not accepting connection",0x18);
                    /* try { // try from 009897c8 to 009897d3 has its CatchHandler @ 0098a1b8 */
        std::__ndk1::
        basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::str();
                    /* try { // try from 009897d4 to 009897df has its CatchHandler @ 0098a1a0 */
        std::__ndk1::mutex::lock(this_00);
        if (((ulong)local_1d0 & 1) != 0) {
          pvVar17 = local_1c0[0];
        }
        fprintf((FILE *)sched_yield,"%s\n",pvVar17);
        std::__ndk1::mutex::unlock(this_00);
        if (((ulong)local_1d0 & 1) != 0) {
          operator_delete(local_1c0[0]);
        }
                    /* try { // try from 00989824 to 0098982b has its CatchHandler @ 0098a2c0 */
        Socket::closeSocket(iVar7);
        local_190 = (ConnectionState *)&PTR_LAB_00c4e4e0;
        local_110[0] = &PTR_FUN_00c4e530;
        local_180 = &PTR_FUN_00c4e508;
        ppuStack_178 = &PTR_LAB_00c4e678;
        if ((local_138 & 1) != 0) {
          operator_delete(local_128);
        }
        ppuStack_178 = &PTR__basic_streambuf_00c4e728;
        std::__ndk1::locale::~locale((locale *)&local_170);
        goto LAB_00989874;
      }
      local_200 = 0;
      local_1f8 = (void *)0x0;
      local_208 = 0;
      if (*(int *)(this + 0x38) == 2) {
                    /* try { // try from 00989580 to 009895bb has its CatchHandler @ 0098a27c */
        lVar15 = inet_ntop(2,(void *)((ulong)&local_1a0 | 4),(char *)&local_1e8,0x10);
        if (lVar15 != 0) {
          uVar8 = network_to_host_short(local_1a0.sa_data._0_2_);
          sVar13 = strlen((char *)&local_1e8);
          std::__ndk1::
          basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::assign
                    ((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
                      *)&local_208,(char *)&local_1e8,sVar13);
          goto LAB_009898c8;
        }
                    /* try { // try from 00989b34 to 00989b37 has its CatchHandler @ 0098a0f4 */
        iVar9 = Socket::getErrno();
        local_180 = &PTR_FUN_00c4e508;
        local_110[0] = &PTR__basic_istream_00c4e640;
        p_Stack_188 = (__shared_weak_count *)0x0;
        local_190 = (ConnectionState *)&PTR__basic_istream_00c4e618;
                    /* try { // try from 00989b74 to 00989b7f has its CatchHandler @ 0098a0e4 */
        std::__ndk1::ios_base::init((ios_base *)local_110,&ppuStack_178);
        local_88 = 0;
        local_80 = 0xffffffff;
        local_190 = (ConnectionState *)&PTR_LAB_00c4e4e0;
        local_110[0] = &PTR_FUN_00c4e530;
        ppuStack_178 = &PTR__basic_streambuf_00c4e728;
        local_180 = &PTR_FUN_00c4e508;
        std::__ndk1::locale::locale((locale *)&local_170);
        uStack_150 = 0;
        local_158 = 0;
        uStack_140 = 0;
        uStack_148 = 0;
        uStack_160 = 0;
        local_168 = 0;
        ppuStack_178 = &PTR_LAB_00c4e678;
        uStack_130 = 0;
        local_138 = 0;
        uStack_120 = 0;
        local_128 = (void *)0x0;
        local_118 = 0x18;
                    /* try { // try from 00989be0 to 00989c2f has its CatchHandler @ 0098a1c0 */
        pbVar11 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                            ((basic_ostream *)&local_180,
                             "SocketServer::run() error calling inet_ntop (ipv4): ",0x34);
        pbVar11 = (basic_ostream *)
                  std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::operator<<
                            ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar11,iVar9);
        pbVar11 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                            (pbVar11,", ",2);
        pcVar12 = strerror(iVar9);
        sVar13 = strlen(pcVar12);
        std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                  (pbVar11,pcVar12,sVar13);
                    /* try { // try from 00989c30 to 00989c3b has its CatchHandler @ 0098a0e0 */
        std::__ndk1::
        basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::str();
                    /* try { // try from 00989c3c to 00989c47 has its CatchHandler @ 0098a098 */
        std::__ndk1::mutex::lock(this_00);
        if (((ulong)local_1d0 & 1) != 0) {
          pvVar17 = local_1c0[0];
        }
        fprintf((FILE *)sched_yield,"%s\n",pvVar17);
        std::__ndk1::mutex::unlock(this_00);
        if (((ulong)local_1d0 & 1) != 0) {
          operator_delete(local_1c0[0]);
        }
                    /* try { // try from 00989c8c to 00989c93 has its CatchHandler @ 0098a1c0 */
        Socket::closeSocket(iVar7);
LAB_00989df8:
        local_190 = (ConnectionState *)&PTR_LAB_00c4e4e0;
        local_110[0] = &PTR_FUN_00c4e530;
        local_180 = &PTR_FUN_00c4e508;
        ppuStack_178 = &PTR_LAB_00c4e678;
        if ((local_138 & 1) != 0) {
          operator_delete(local_128);
        }
        ppuStack_178 = &PTR__basic_streambuf_00c4e728;
        std::__ndk1::locale::~locale((locale *)&local_170);
        std::__ndk1::ios_base::~ios_base((ios_base *)local_110);
        iVar7 = 3;
      }
      else {
                    /* try { // try from 0098988c to 009898c7 has its CatchHandler @ 0098a278 */
        lVar15 = inet_ntop(10,(void *)((ulong)&local_1a0 | 4),(char *)&local_1d0,0x2e);
        if (lVar15 == 0) {
                    /* try { // try from 00989c98 to 00989c9b has its CatchHandler @ 0098a0f8 */
          iVar9 = Socket::getErrno();
          local_180 = &PTR_FUN_00c4e508;
          local_110[0] = &PTR__basic_istream_00c4e640;
          p_Stack_188 = (__shared_weak_count *)0x0;
          local_190 = (ConnectionState *)&PTR__basic_istream_00c4e618;
                    /* try { // try from 00989cd8 to 00989ce3 has its CatchHandler @ 0098a0e8 */
          std::__ndk1::ios_base::init((ios_base *)local_110,&ppuStack_178);
          local_88 = 0;
          local_80 = 0xffffffff;
          local_190 = (ConnectionState *)&PTR_LAB_00c4e4e0;
          local_110[0] = &PTR_FUN_00c4e530;
          ppuStack_178 = &PTR__basic_streambuf_00c4e728;
          local_180 = &PTR_FUN_00c4e508;
          std::__ndk1::locale::locale((locale *)&local_170);
          uStack_150 = 0;
          local_158 = 0;
          uStack_140 = 0;
          uStack_148 = 0;
          uStack_160 = 0;
          local_168 = 0;
          ppuStack_178 = &PTR_LAB_00c4e678;
          uStack_130 = 0;
          local_138 = 0;
          uStack_120 = 0;
          local_128 = (void *)0x0;
          local_118 = 0x18;
                    /* try { // try from 00989d44 to 00989d93 has its CatchHandler @ 0098a1bc */
          pbVar11 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                              ((basic_ostream *)&local_180,
                               "SocketServer::run() error calling inet_ntop (ipv6): ",0x34);
          pbVar11 = (basic_ostream *)
                    std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::operator<<
                              ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar11,iVar9);
          pbVar11 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                              (pbVar11,", ",2);
          pcVar12 = strerror(iVar9);
          sVar13 = strlen(pcVar12);
          std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                    (pbVar11,pcVar12,sVar13);
                    /* try { // try from 00989d94 to 00989d9f has its CatchHandler @ 0098a0dc */
          std::__ndk1::
          basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::str();
                    /* try { // try from 00989da0 to 00989dab has its CatchHandler @ 0098a0b4 */
          std::__ndk1::mutex::lock(this_00);
          pvVar17 = (void *)((ulong)&local_1e8 | 1);
          if (((ulong)local_1e8 & 1) != 0) {
            pvVar17 = local_1d8;
          }
          fprintf((FILE *)sched_yield,"%s\n",pvVar17);
          std::__ndk1::mutex::unlock(this_00);
          if (((ulong)local_1e8 & 1) != 0) {
            operator_delete(local_1d8);
          }
                    /* try { // try from 00989df0 to 00989df7 has its CatchHandler @ 0098a1bc */
          Socket::closeSocket(iVar7);
          goto LAB_00989df8;
        }
        uVar8 = network_to_host_short(local_1a0.sa_data._0_2_);
        sVar13 = strlen((char *)&local_1d0);
        std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
        ::assign((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
                 &local_208,(char *)&local_1d0,sVar13);
LAB_009898c8:
        local_1e8 = (ConnectionState *)0x0;
        local_1e0 = (__shared_weak_count *)0x0;
        if (*(long **)(this + 0x140) != (long *)0x0) {
                    /* try { // try from 009898dc to 009898e3 has its CatchHandler @ 0098a10c */
          (**(code **)(**(long **)(this + 0x140) + 0x30))(&local_190);
          p_Var1 = p_Stack_188;
          local_1e8 = local_190;
          p_Var2 = local_1e0;
          local_190 = (ConnectionState *)0x0;
          p_Stack_188 = (__shared_weak_count *)0x0;
          local_1e0 = p_Var1;
          if (p_Var2 != (__shared_weak_count *)0x0) {
            p_Var1 = p_Var2 + 8;
            do {
              lVar15 = *(long *)p_Var1;
              cVar3 = '\x01';
              bVar4 = (bool)ExclusiveMonitorPass(p_Var1,0x10);
              if (bVar4) {
                *(long *)p_Var1 = lVar15 + -1;
                cVar3 = ExclusiveMonitorsStatus();
              }
            } while (cVar3 != '\0');
            if (lVar15 == 0) {
              (**(code **)(*(long *)p_Var2 + 0x10))(p_Var2);
              std::__ndk1::__shared_weak_count::__release_weak(p_Var2);
            }
          }
          p_Var2 = p_Stack_188;
          if (p_Stack_188 != (__shared_weak_count *)0x0) {
            p_Var1 = p_Stack_188 + 8;
            do {
              lVar15 = *(long *)p_Var1;
              cVar3 = '\x01';
              bVar4 = (bool)ExclusiveMonitorPass(p_Var1,0x10);
              if (bVar4) {
                *(long *)p_Var1 = lVar15 + -1;
                cVar3 = ExclusiveMonitorsStatus();
              }
            } while (cVar3 != '\0');
            if (lVar15 == 0) {
              (**(code **)(*(long *)p_Stack_188 + 0x10))(p_Stack_188);
              std::__ndk1::__shared_weak_count::__release_weak(p_Var2);
            }
          }
        }
        local_190 = (ConnectionState *)&PTR_LAB_00c52088;
                    /* try { // try from 00989998 to 0098999f has its CatchHandler @ 0098a15c */
        p_Stack_188 = (__shared_weak_count *)this;
        local_170 = &local_190;
        ConnectionState::setOnSetTerminatedCallback(local_1e8,(function *)&local_190);
        if (&local_190 == local_170) {
          pcVar21 = *(code **)(*local_170 + 0x20);
LAB_009899c4:
          (*pcVar21)();
        }
        else if (local_170 != (ConnectionState **)0x0) {
          pcVar21 = *(code **)(*local_170 + 0x28);
          goto LAB_009899c4;
        }
                    /* try { // try from 009899cc to 009899df has its CatchHandler @ 0098a230 */
        ConnectionState::setRemoteIp(local_1e8,(basic_string_conflict *)&local_208);
        ConnectionState::setRemotePort(local_1e8,uVar8 & 0xffff);
        if (((byte)this[0x40] & 1) == 0) {
          p_Stack_188 = (__shared_weak_count *)0x0;
          local_180 = (undefined **)0x0;
          local_190 = (ConnectionState *)0x0;
                    /* try { // try from 009899f8 to 00989a0b has its CatchHandler @ 0098a0fc */
          pbVar18 = (basic_string_conflict *)&local_190;
          createSocket((ix *)(ulong)(byte)this[0x1b0],SUB41(iVar7,0),(int)pbVar18,
                       (basic_string_conflict *)(this + 0x150),in_x4);
          if (local_210 == (long *)0x0) {
                    /* try { // try from 00989e50 to 00989e63 has its CatchHandler @ 0098a094 */
            std::__ndk1::operator+
                      ((__ndk1 *)"SocketServer::run() cannot create socket: ",(char *)&local_190,
                       pbVar18);
                    /* try { // try from 00989e64 to 00989e6b has its CatchHandler @ 0098a07c */
            std::__ndk1::mutex::lock(this_00);
            if (((ulong)local_1d0 & 1) != 0) {
              pvVar17 = local_1c0[0];
            }
            fprintf((FILE *)sched_yield,"%s\n",pvVar17);
            std::__ndk1::mutex::unlock(this_00);
            if (((ulong)local_1d0 & 1) != 0) {
              operator_delete(local_1c0[0]);
            }
                    /* try { // try from 00989eb0 to 00989eb7 has its CatchHandler @ 0098a11c */
            Socket::closeSocket(iVar7);
LAB_00989f24:
            iVar7 = 3;
          }
          else {
                    /* try { // try from 00989a18 to 00989a33 has its CatchHandler @ 0098a11c */
            SocketConnect::configure(iVar7);
            uVar14 = (**(code **)(*local_210 + 0x10))(local_210,&local_190);
            if ((uVar14 & 1) == 0) {
                    /* try { // try from 00989ebc to 00989ecf has its CatchHandler @ 0098a078 */
              std::__ndk1::operator+
                        ((__ndk1 *)"SocketServer::run() tls accept failed: ",(char *)&local_190,
                         pbVar18);
                    /* try { // try from 00989ed0 to 00989ed7 has its CatchHandler @ 0098a070 */
              std::__ndk1::mutex::lock(this_00);
              if (((ulong)local_1d0 & 1) != 0) {
                pvVar17 = local_1c0[0];
              }
              fprintf((FILE *)sched_yield,"%s\n",pvVar17);
              std::__ndk1::mutex::unlock(this_00);
              if (((ulong)local_1d0 & 1) != 0) {
                operator_delete(local_1c0[0]);
              }
                    /* try { // try from 00989f1c to 00989f23 has its CatchHandler @ 0098a11c */
              Socket::closeSocket(iVar7);
              goto LAB_00989f24;
            }
                    /* try { // try from 00989a38 to 00989a3f has its CatchHandler @ 0098a074 */
            std::__ndk1::mutex::lock((mutex *)(this + 0xa0));
            uStack_228 = 1;
            local_230 = 0x18;
                    /* try { // try from 00989a4c to 00989a63 has its CatchHandler @ 0098a060 */
            in_x4 = (SocketTLSOptions *)&local_1e8;
            local_238 = this;
            FUN_0098a948(&local_218,&local_230,&local_238,&local_210);
            pCVar6 = local_1e8;
            lVar15 = local_218;
            local_1d0 = local_1e8;
            local_1c8 = local_1e0;
            if (local_1e0 != (__shared_weak_count *)0x0) {
              p_Var2 = local_1e0 + 8;
              do {
                cVar3 = '\x01';
                bVar4 = (bool)ExclusiveMonitorPass(p_Var2,0x10);
                if (bVar4) {
                  *(long *)p_Var2 = *(long *)p_Var2 + 1;
                  cVar3 = ExclusiveMonitorsStatus();
                }
              } while (cVar3 != '\0');
            }
            local_218 = 0;
            local_1c0[0] = (void *)lVar15;
                    /* try { // try from 00989a90 to 00989a97 has its CatchHandler @ 0098a010 */
            plVar16 = operator_new(0x28);
            p_Var2 = local_1c8;
            local_1c0[0] = (void *)0x0;
            plVar16[1] = (long)(this + 0x88);
            plVar16[2] = (long)pCVar6;
            local_1d0 = (ConnectionState *)0x0;
            local_1c8 = (__shared_weak_count *)0x0;
            plVar16[3] = (long)p_Var2;
            plVar16[4] = lVar15;
            lVar15 = *(long *)(this + 0x88);
            *plVar16 = lVar15;
            *(long **)(lVar15 + 8) = plVar16;
            *(long **)(this + 0x88) = plVar16;
            *(long *)(this + 0x98) = *(long *)(this + 0x98) + 1;
            std::__ndk1::thread::~thread((thread *)local_1c0);
            p_Var2 = local_1c8;
            if (local_1c8 != (__shared_weak_count *)0x0) {
              p_Var1 = local_1c8 + 8;
              do {
                lVar15 = *(long *)p_Var1;
                cVar3 = '\x01';
                bVar4 = (bool)ExclusiveMonitorPass(p_Var1,0x10);
                if (bVar4) {
                  *(long *)p_Var1 = lVar15 + -1;
                  cVar3 = ExclusiveMonitorsStatus();
                }
              } while (cVar3 != '\0');
              if (lVar15 == 0) {
                (**(code **)(*(long *)local_1c8 + 0x10))(local_1c8);
                std::__ndk1::__shared_weak_count::__release_weak(p_Var2);
              }
            }
            std::__ndk1::thread::~thread((thread *)&local_218);
            std::__ndk1::mutex::unlock((mutex *)(this + 0xa0));
            iVar7 = 0;
          }
          plVar16 = local_210;
          local_210 = (long *)0x0;
          if (plVar16 != (long *)0x0) {
            (**(code **)(*plVar16 + 8))();
          }
          p_Var2 = local_1e0;
          if (((ulong)local_190 & 1) != 0) {
            operator_delete(local_180);
            p_Var2 = local_1e0;
          }
        }
        else {
          iVar7 = 1;
          p_Var2 = local_1e0;
        }
        local_1e0 = p_Var2;
        if (p_Var2 != (__shared_weak_count *)0x0) {
          p_Var1 = p_Var2 + 8;
          do {
            lVar15 = *(long *)p_Var1;
            cVar3 = '\x01';
            bVar4 = (bool)ExclusiveMonitorPass(p_Var1,0x10);
            if (bVar4) {
              *(long *)p_Var1 = lVar15 + -1;
              cVar3 = ExclusiveMonitorsStatus();
            }
          } while (cVar3 != '\0');
          if (lVar15 == 0) {
            (**(code **)(*(long *)p_Var2 + 0x10))(p_Var2);
            std::__ndk1::__shared_weak_count::__release_weak(p_Var2);
          }
        }
      }
      if ((local_208 & 1) != 0) {
        operator_delete(local_1f8);
      }
    }
    else {
      if (iVar7 == 3) {
        local_180 = &PTR_FUN_00c4e508;
        local_110[0] = &PTR__basic_istream_00c4e640;
        p_Stack_188 = (__shared_weak_count *)0x0;
        local_190 = (ConnectionState *)&PTR__basic_istream_00c4e618;
                    /* try { // try from 009893f0 to 009893fb has its CatchHandler @ 0098a2b8 */
        std::__ndk1::ios_base::init((ios_base *)local_110,&ppuStack_178);
        local_80 = 0xffffffff;
        local_88 = 0;
        local_190 = (ConnectionState *)&PTR_LAB_00c4e4e0;
        local_110[0] = &PTR_FUN_00c4e530;
        ppuStack_178 = &PTR__basic_streambuf_00c4e728;
        local_180 = &PTR_FUN_00c4e508;
        std::__ndk1::locale::locale((locale *)&local_170);
        uStack_150 = 0;
        local_158 = 0;
        uStack_140 = 0;
        uStack_148 = 0;
        uStack_160 = 0;
        local_168 = 0;
        ppuStack_178 = &PTR_LAB_00c4e678;
        uStack_130 = 0;
        local_138 = 0;
        uStack_120 = 0;
        local_128 = (void *)0x0;
        local_118 = 0x18;
                    /* try { // try from 00989454 to 00989487 has its CatchHandler @ 0098a308 */
        pbVar11 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                            ((basic_ostream *)&local_180,"SocketServer::run() error in select: ",
                             0x25);
        iVar7 = Socket::getErrno();
        pcVar12 = strerror(iVar7);
        sVar13 = strlen(pcVar12);
        std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                  (pbVar11,pcVar12,sVar13);
                    /* try { // try from 00989488 to 00989493 has its CatchHandler @ 0098a2b4 */
        std::__ndk1::
        basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::str();
                    /* try { // try from 00989494 to 0098949f has its CatchHandler @ 0098a298 */
        std::__ndk1::mutex::lock(this_00);
        if (((ulong)local_1d0 & 1) != 0) {
          pvVar17 = local_1c0[0];
        }
LAB_009894c0:
        fprintf((FILE *)sched_yield,"%s\n",pvVar17);
        std::__ndk1::mutex::unlock(this_00);
        if (((ulong)local_1d0 & 1) != 0) {
          operator_delete(local_1c0[0]);
        }
        local_190 = (ConnectionState *)&PTR_LAB_00c4e4e0;
        local_110[0] = &PTR_FUN_00c4e530;
        local_180 = &PTR_FUN_00c4e508;
        ppuStack_178 = &PTR_LAB_00c4e678;
        if ((local_138 & 1) != 0) {
          operator_delete(local_128);
        }
        ppuStack_178 = &PTR__basic_streambuf_00c4e728;
        std::__ndk1::locale::~locale((locale *)&local_170);
LAB_00989874:
        std::__ndk1::ios_base::~ios_base((ios_base *)local_110);
      }
LAB_00989878:
      iVar7 = 3;
    }
  } while (iVar7 != 1);
  if (*(long *)(lVar5 + 0x28) != lVar19) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

