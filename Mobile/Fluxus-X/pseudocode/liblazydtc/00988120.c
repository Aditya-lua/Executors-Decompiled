/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00988120
 */

/* ix::SocketServer::listen() */

void ix::SocketServer::listen(void)

{
  long lVar1;
  int iVar2;
  long in_x0;
  ulong uVar3;
  void *__dest;
  void *__dest_00;
  basic_ostream *pbVar4;
  char *pcVar5;
  size_t sVar6;
  undefined1 *in_x8;
  undefined8 uVar7;
  undefined4 local_1ec;
  ulong local_1e8;
  ulong local_1e0;
  char *local_1d8;
  undefined **local_1d0;
  undefined8 uStack_1c8;
  undefined **local_1c0;
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
  undefined **local_150 [17];
  undefined8 local_c8;
  undefined4 local_c0;
  sockaddr local_b0;
  undefined8 local_a0;
  sockaddr local_98;
  undefined8 local_88;
  long local_78;
  
  lVar1 = tpidr_el0;
  local_78 = *(long *)(lVar1 + 0x28);
  local_1e0 = 0;
  local_1d8 = (char *)0x0;
  local_1e8 = 0;
                    /* try { // try from 0098816c to 00988197 has its CatchHandler @ 0098911c */
  uVar3 = (**(code **)(**(long **)(in_x0 + 0x1d8) + 0x10))(*(long **)(in_x0 + 0x1d8),&local_1e8);
  if ((uVar3 & 1) == 0) {
    local_1c0 = &PTR_FUN_00c4e508;
    local_150[0] = &PTR__basic_istream_00c4e640;
    uStack_1c8 = 0;
    local_1d0 = &PTR__basic_istream_00c4e618;
                    /* try { // try from 00988234 to 0098823f has its CatchHandler @ 0098905c */
    std::__ndk1::ios_base::init((ios_base *)local_150,&ppuStack_1b8);
    local_c8 = 0;
    local_c0 = 0xffffffff;
    local_1d0 = &PTR_LAB_00c4e4e0;
    local_150[0] = &PTR_FUN_00c4e530;
    ppuStack_1b8 = &PTR__basic_streambuf_00c4e728;
    local_1c0 = &PTR_FUN_00c4e508;
    std::__ndk1::locale::locale(alStack_1b0);
    uStack_180 = 0;
    local_188 = 0;
    uStack_190 = 0;
    local_198 = 0;
    uStack_1a0 = 0;
    local_1a8 = 0;
    uStack_170 = 0;
    local_178 = 0;
    ppuStack_1b8 = &PTR_LAB_00c4e678;
    uStack_160 = 0;
    local_168 = (void *)0x0;
    local_158 = 0x18;
                    /* try { // try from 009882b4 to 009882eb has its CatchHandler @ 009890bc */
    pbVar4 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                       ((basic_ostream *)&local_1c0,
                        "SocketServer::listen() error in SelectInterrupt::init: ",0x37);
    uVar3 = local_1e8 >> 1 & 0x7f;
    pcVar5 = (char *)((ulong)&local_1e8 | 1);
    if ((local_1e8 & 1) != 0) {
      uVar3 = local_1e0;
      pcVar5 = local_1d8;
    }
    std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>(pbVar4,pcVar5,uVar3);
                    /* try { // try from 009882ec to 009882f7 has its CatchHandler @ 00989058 */
    std::__ndk1::basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    str();
    *in_x8 = 0;
    local_1d0 = &PTR_LAB_00c4e4e0;
    local_150[0] = &PTR_FUN_00c4e530;
    local_1c0 = &PTR_FUN_00c4e508;
    ppuStack_1b8 = &PTR_LAB_00c4e678;
    *(undefined8 *)(in_x8 + 0x18) = local_88;
    *(undefined8 *)(in_x8 + 0x10) = local_98.sa_data._6_8_;
    *(ulong *)(in_x8 + 8) =
         CONCAT44(local_98.sa_data._2_4_,CONCAT22(local_98.sa_data._0_2_,local_98.sa_family));
    if ((local_178 & 1) != 0) {
      operator_delete(local_168);
    }
LAB_00988340:
    ppuStack_1b8 = &PTR__basic_streambuf_00c4e728;
    std::__ndk1::locale::~locale(alStack_1b0);
  }
  else {
    if ((*(uint *)(in_x0 + 0x38) | 8) != 10) {
                    /* try { // try from 00988394 to 0098839b has its CatchHandler @ 00988fb8 */
      __dest = operator_new(0x60);
      memcpy(__dest,
             "SocketServer::listen() AF_INET and AF_INET6 are currently the only supported address families"
             ,0x5d);
      *(undefined1 *)((long)__dest + 0x5d) = 0;
      *in_x8 = 0;
      *(undefined8 *)(in_x8 + 0x10) = 0;
      *(undefined8 *)(in_x8 + 0x18) = 0;
      *(undefined8 *)(in_x8 + 8) = 0;
                    /* try { // try from 009883c0 to 009883c7 has its CatchHandler @ 00988fa0 */
      __dest_00 = operator_new(0x60);
      *(void **)(in_x8 + 0x18) = __dest_00;
      *(undefined8 *)(in_x8 + 0x10) = 0x5d;
      *(undefined8 *)(in_x8 + 8) = 0x61;
      memcpy(__dest_00,__dest,0x5d);
      *(undefined1 *)((long)__dest_00 + 0x5d) = 0;
      operator_delete(__dest);
      goto joined_r0x00988930;
    }
    iVar2 = socket(*(uint *)(in_x0 + 0x38),1,0);
    *(int *)(in_x0 + 0x3c) = iVar2;
    if (iVar2 < 0) {
      local_1c0 = &PTR_FUN_00c4e508;
      local_150[0] = &PTR__basic_istream_00c4e640;
      uStack_1c8 = 0;
      local_1d0 = &PTR__basic_istream_00c4e618;
                    /* try { // try from 0098843c to 00988447 has its CatchHandler @ 00988f94 */
      std::__ndk1::ios_base::init((ios_base *)local_150,&ppuStack_1b8);
      local_c8 = 0;
      local_c0 = 0xffffffff;
      local_1d0 = &PTR_LAB_00c4e4e0;
      local_150[0] = &PTR_FUN_00c4e530;
      ppuStack_1b8 = &PTR__basic_streambuf_00c4e728;
      local_1c0 = &PTR_FUN_00c4e508;
      std::__ndk1::locale::locale(alStack_1b0);
      uStack_180 = 0;
      local_188 = 0;
      uStack_190 = 0;
      local_198 = 0;
      uStack_1a0 = 0;
      local_1a8 = 0;
      uStack_170 = 0;
      local_178 = 0;
      ppuStack_1b8 = &PTR_LAB_00c4e678;
      uStack_160 = 0;
      local_168 = (void *)0x0;
      local_158 = 0x18;
                    /* try { // try from 009884bc to 009884f3 has its CatchHandler @ 00989018 */
      pbVar4 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                         ((basic_ostream *)&local_1c0,
                          "SocketServer::listen() error creating socket): ",0x2f);
      iVar2 = Socket::getErrno();
      pcVar5 = strerror(iVar2);
      sVar6 = strlen(pcVar5);
      std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                (pbVar4,pcVar5,sVar6);
                    /* try { // try from 009884f4 to 009884ff has its CatchHandler @ 00988f90 */
      std::__ndk1::basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
      ::str();
      *in_x8 = 0;
      local_1d0 = &PTR_LAB_00c4e4e0;
      local_150[0] = &PTR_FUN_00c4e530;
      local_1c0 = &PTR_FUN_00c4e508;
      ppuStack_1b8 = &PTR_LAB_00c4e678;
      *(undefined8 *)(in_x8 + 0x18) = local_88;
      *(undefined8 *)(in_x8 + 0x10) = local_98.sa_data._6_8_;
      *(ulong *)(in_x8 + 8) =
           CONCAT44(local_98.sa_data._2_4_,CONCAT22(local_98.sa_data._0_2_,local_98.sa_family));
      if ((local_178 & 1) != 0) {
        operator_delete(local_168);
      }
      goto LAB_00988340;
    }
    local_1ec = 1;
                    /* try { // try from 009881a8 to 009881bb has its CatchHandler @ 00989014 */
    iVar2 = setsockopt(iVar2,1,2,&local_1ec,4);
    if (iVar2 < 0) {
      local_1c0 = &PTR_FUN_00c4e508;
      local_150[0] = &PTR__basic_istream_00c4e640;
      uStack_1c8 = 0;
      local_1d0 = &PTR__basic_istream_00c4e618;
                    /* try { // try from 00988590 to 0098859b has its CatchHandler @ 00988f80 */
      std::__ndk1::ios_base::init((ios_base *)local_150,&ppuStack_1b8);
      local_c8 = 0;
      local_c0 = 0xffffffff;
      local_1d0 = &PTR_LAB_00c4e4e0;
      local_150[0] = &PTR_FUN_00c4e530;
      ppuStack_1b8 = &PTR__basic_streambuf_00c4e728;
      local_1c0 = &PTR_FUN_00c4e508;
      std::__ndk1::locale::locale(alStack_1b0);
      uStack_180 = 0;
      local_188 = 0;
      uStack_190 = 0;
      local_198 = 0;
      uStack_1a0 = 0;
      local_1a8 = 0;
      uStack_170 = 0;
      local_178 = 0;
      ppuStack_1b8 = &PTR_LAB_00c4e678;
      uStack_160 = 0;
      local_168 = (void *)0x0;
      local_158 = 0x18;
                    /* try { // try from 00988610 to 009886a7 has its CatchHandler @ 00989064 */
      pbVar4 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                         ((basic_ostream *)&local_1c0,
                          "SocketServer::listen() error calling setsockopt(SO_REUSEADDR) ",0x3e);
      pbVar4 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                         (pbVar4,"at address ",0xb);
      uVar3 = (ulong)(*(byte *)(in_x0 + 0x10) >> 1);
      pcVar5 = (char *)(in_x0 + 0x11);
      if ((*(byte *)(in_x0 + 0x10) & 1) != 0) {
        uVar3 = *(ulong *)(in_x0 + 0x18);
        pcVar5 = *(char **)(in_x0 + 0x20);
      }
      pbVar4 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                         (pbVar4,pcVar5,uVar3);
      pbVar4 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                         (pbVar4,":",1);
      pbVar4 = (basic_ostream *)
               std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::operator<<
                         ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar4,
                          *(int *)(in_x0 + 8));
      pbVar4 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                         (pbVar4," : ",3);
      iVar2 = Socket::getErrno();
      pcVar5 = strerror(iVar2);
      sVar6 = strlen(pcVar5);
      std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                (pbVar4,pcVar5,sVar6);
      Socket::closeSocket(*(int *)(in_x0 + 0x3c));
                    /* try { // try from 009886a8 to 009886b3 has its CatchHandler @ 00988f7c */
      std::__ndk1::basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>
      ::str();
LAB_009886b4:
      *in_x8 = 0;
      local_1d0 = &PTR_LAB_00c4e4e0;
      local_150[0] = &PTR_FUN_00c4e530;
      local_1c0 = &PTR_FUN_00c4e508;
      *(undefined8 *)(in_x8 + 0x18) = local_88;
      *(undefined8 *)(in_x8 + 0x10) = local_98.sa_data._6_8_;
      *(ulong *)(in_x8 + 8) =
           CONCAT44(local_98.sa_data._2_4_,CONCAT22(local_98.sa_data._0_2_,local_98.sa_family));
      ppuStack_1b8 = &PTR_LAB_00c4e678;
      if ((local_178 & 1) != 0) {
        operator_delete(local_168);
      }
      ppuStack_1b8 = &PTR__basic_streambuf_00c4e728;
      std::__ndk1::locale::~locale(alStack_1b0);
    }
    else {
      iVar2 = *(int *)(in_x0 + 0x38);
      if (iVar2 == 2) {
        local_b0.sa_family = 2;
        local_b0.sa_data._0_2_ = *(ushort *)(in_x0 + 8) >> 8 | *(ushort *)(in_x0 + 8) << 8;
        if ((*(byte *)(in_x0 + 0x10) & 1) == 0) {
          pcVar5 = (char *)(in_x0 + 0x11);
        }
        else {
          pcVar5 = *(char **)(in_x0 + 0x20);
        }
                    /* try { // try from 00988758 to 00988777 has its CatchHandler @ 00988f8c */
        iVar2 = inet_pton(2,pcVar5,(void *)((ulong)&local_b0 | 4));
        if (iVar2 < 1) {
          local_1c0 = &PTR_FUN_00c4e508;
          local_150[0] = &PTR__basic_istream_00c4e640;
          uStack_1c8 = 0;
          local_1d0 = &PTR__basic_istream_00c4e618;
                    /* try { // try from 00988974 to 0098897f has its CatchHandler @ 00988f74 */
          std::__ndk1::ios_base::init((ios_base *)local_150,&ppuStack_1b8);
          local_c8 = 0;
          local_c0 = 0xffffffff;
          local_1d0 = &PTR_LAB_00c4e4e0;
          local_150[0] = &PTR_FUN_00c4e530;
          ppuStack_1b8 = &PTR__basic_streambuf_00c4e728;
          local_1c0 = &PTR_FUN_00c4e508;
          std::__ndk1::locale::locale(alStack_1b0);
          uStack_180 = 0;
          local_188 = 0;
          uStack_190 = 0;
          local_198 = 0;
          uStack_1a0 = 0;
          local_1a8 = 0;
          uStack_170 = 0;
          local_178 = 0;
          ppuStack_1b8 = &PTR_LAB_00c4e678;
          uStack_160 = 0;
          local_168 = (void *)0x0;
          local_158 = 0x18;
                    /* try { // try from 009889f4 to 00988a87 has its CatchHandler @ 00988fc4 */
          pbVar4 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                             ((basic_ostream *)&local_1c0,
                              "SocketServer::listen() error calling inet_pton ",0x2f);
          pbVar4 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                             (pbVar4,"at address ",0xb);
          uVar3 = *(ulong *)(in_x0 + 0x18);
          pcVar5 = *(char **)(in_x0 + 0x20);
          if ((*(byte *)(in_x0 + 0x10) & 1) == 0) {
            pcVar5 = (char *)(in_x0 + 0x11);
            uVar3 = (ulong)(*(byte *)(in_x0 + 0x10) >> 1);
          }
          pbVar4 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                             (pbVar4,pcVar5,uVar3);
          pbVar4 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                             (pbVar4,":",1);
          pbVar4 = (basic_ostream *)
                   std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::operator<<
                             ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar4,
                              *(int *)(in_x0 + 8));
          pbVar4 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                             (pbVar4," : ",3);
          iVar2 = Socket::getErrno();
          pcVar5 = strerror(iVar2);
          sVar6 = strlen(pcVar5);
          std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                    (pbVar4,pcVar5,sVar6);
          Socket::closeSocket(*(int *)(in_x0 + 0x3c));
                    /* try { // try from 00988a88 to 00988a93 has its CatchHandler @ 00988f6c */
          std::__ndk1::
          basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::str();
        }
        else {
          iVar2 = bind(*(int *)(in_x0 + 0x3c),&local_b0,0x10);
          if (-1 < iVar2) goto LAB_00988908;
          local_1c0 = &PTR_FUN_00c4e508;
          local_150[0] = &PTR__basic_istream_00c4e640;
          uStack_1c8 = 0;
          local_1d0 = &PTR__basic_istream_00c4e618;
                    /* try { // try from 009887b8 to 009887c3 has its CatchHandler @ 00988f5c */
          std::__ndk1::ios_base::init((ios_base *)local_150,&ppuStack_1b8);
          local_c8 = 0;
          local_c0 = 0xffffffff;
          local_1d0 = &PTR_LAB_00c4e4e0;
          local_150[0] = &PTR_FUN_00c4e530;
          ppuStack_1b8 = &PTR__basic_streambuf_00c4e728;
          local_1c0 = &PTR_FUN_00c4e508;
          std::__ndk1::locale::locale(alStack_1b0);
          uStack_180 = 0;
          local_188 = 0;
          uStack_190 = 0;
          local_198 = 0;
          uStack_1a0 = 0;
          local_1a8 = 0;
          uStack_170 = 0;
          local_178 = 0;
          ppuStack_1b8 = &PTR_LAB_00c4e678;
          uStack_160 = 0;
          local_168 = (void *)0x0;
          local_158 = 0x18;
                    /* try { // try from 00988838 to 009888cb has its CatchHandler @ 00988f9c */
          pbVar4 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                             ((basic_ostream *)&local_1c0,
                              "SocketServer::listen() error calling bind ",0x2a);
          pbVar4 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                             (pbVar4,"at address ",0xb);
          uVar3 = *(ulong *)(in_x0 + 0x18);
          pcVar5 = *(char **)(in_x0 + 0x20);
          if ((*(byte *)(in_x0 + 0x10) & 1) == 0) {
            pcVar5 = (char *)(in_x0 + 0x11);
            uVar3 = (ulong)(*(byte *)(in_x0 + 0x10) >> 1);
          }
          pbVar4 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                             (pbVar4,pcVar5,uVar3);
          pbVar4 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                             (pbVar4,":",1);
          pbVar4 = (basic_ostream *)
                   std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::operator<<
                             ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar4,
                              *(int *)(in_x0 + 8));
          pbVar4 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                             (pbVar4," : ",3);
          iVar2 = Socket::getErrno();
          pcVar5 = strerror(iVar2);
          sVar6 = strlen(pcVar5);
          std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                    (pbVar4,pcVar5,sVar6);
          Socket::closeSocket(*(int *)(in_x0 + 0x3c));
                    /* try { // try from 009888cc to 009888d7 has its CatchHandler @ 00988f54 */
          std::__ndk1::
          basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::str();
        }
        *in_x8 = 0;
        uVar7 = CONCAT44(local_98.sa_data._2_4_,CONCAT22(local_98.sa_data._0_2_,local_98.sa_family))
        ;
      }
      else {
        local_98.sa_family = (sa_family_t)iVar2;
        local_98.sa_data._0_2_ = *(ushort *)(in_x0 + 8) >> 8 | *(ushort *)(in_x0 + 8) << 8;
        if ((*(byte *)(in_x0 + 0x10) & 1) == 0) {
          pcVar5 = (char *)(in_x0 + 0x11);
        }
        else {
          pcVar5 = *(char **)(in_x0 + 0x20);
        }
                    /* try { // try from 009888e8 to 00988903 has its CatchHandler @ 00988f88 */
        iVar2 = inet_pton(iVar2,pcVar5,local_98.sa_data + 6);
        if (iVar2 < 1) {
          local_1c0 = &PTR_FUN_00c4e508;
          local_150[0] = &PTR__basic_istream_00c4e640;
          uStack_1c8 = 0;
          local_1d0 = &PTR__basic_istream_00c4e618;
                    /* try { // try from 00988b00 to 00988b0b has its CatchHandler @ 00988f70 */
          std::__ndk1::ios_base::init((ios_base *)local_150,&ppuStack_1b8);
          local_c8 = 0;
          local_c0 = 0xffffffff;
          local_1d0 = &PTR_LAB_00c4e4e0;
          local_150[0] = &PTR_FUN_00c4e530;
          ppuStack_1b8 = &PTR__basic_streambuf_00c4e728;
          local_1c0 = &PTR_FUN_00c4e508;
          std::__ndk1::locale::locale(alStack_1b0);
          uStack_180 = 0;
          local_188 = 0;
          uStack_190 = 0;
          local_198 = 0;
          uStack_1a0 = 0;
          local_1a8 = 0;
          uStack_170 = 0;
          local_178 = 0;
          ppuStack_1b8 = &PTR_LAB_00c4e678;
          uStack_160 = 0;
          local_168 = (void *)0x0;
          local_158 = 0x18;
                    /* try { // try from 00988b80 to 00988c13 has its CatchHandler @ 00988fc0 */
          pbVar4 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                             ((basic_ostream *)&local_1c0,
                              "SocketServer::listen() error calling inet_pton ",0x2f);
          pbVar4 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                             (pbVar4,"at address ",0xb);
          uVar3 = *(ulong *)(in_x0 + 0x18);
          pcVar5 = *(char **)(in_x0 + 0x20);
          if ((*(byte *)(in_x0 + 0x10) & 1) == 0) {
            pcVar5 = (char *)(in_x0 + 0x11);
            uVar3 = (ulong)(*(byte *)(in_x0 + 0x10) >> 1);
          }
          pbVar4 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                             (pbVar4,pcVar5,uVar3);
          pbVar4 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                             (pbVar4,":",1);
          pbVar4 = (basic_ostream *)
                   std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::operator<<
                             ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar4,
                              *(int *)(in_x0 + 8));
          pbVar4 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                             (pbVar4," : ",3);
          iVar2 = Socket::getErrno();
          pcVar5 = strerror(iVar2);
          sVar6 = strlen(pcVar5);
          std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                    (pbVar4,pcVar5,sVar6);
          Socket::closeSocket(*(int *)(in_x0 + 0x3c));
                    /* try { // try from 00988c14 to 00988c1f has its CatchHandler @ 00988f68 */
          std::__ndk1::
          basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::str();
        }
        else {
          iVar2 = bind(*(int *)(in_x0 + 0x3c),&local_98,0x1c);
          if (-1 < iVar2) {
LAB_00988908:
                    /* try { // try from 00988910 to 00988913 has its CatchHandler @ 00989014 */
            iVar2 = ::listen(*(int *)(in_x0 + 0x3c),*(int *)(in_x0 + 0x28));
            if (-1 < iVar2) {
              *(undefined8 *)(in_x8 + 8) = 0;
              *(undefined8 *)(in_x8 + 0x10) = 0;
              *(undefined8 *)(in_x8 + 0x18) = 0;
              *in_x8 = 1;
              in_x8[9] = 0;
              goto joined_r0x00988930;
            }
            local_1c0 = &PTR_FUN_00c4e508;
            local_150[0] = &PTR__basic_istream_00c4e640;
            uStack_1c8 = 0;
            local_1d0 = &PTR__basic_istream_00c4e618;
                    /* try { // try from 00988c60 to 00988c6b has its CatchHandler @ 00988f64 */
            std::__ndk1::ios_base::init((ios_base *)local_150,&ppuStack_1b8);
            local_c8 = 0;
            local_c0 = 0xffffffff;
            local_1d0 = &PTR_LAB_00c4e4e0;
            local_150[0] = &PTR_FUN_00c4e530;
            ppuStack_1b8 = &PTR__basic_streambuf_00c4e728;
            local_1c0 = &PTR_FUN_00c4e508;
            std::__ndk1::locale::locale(alStack_1b0);
            uStack_180 = 0;
            local_188 = 0;
            uStack_190 = 0;
            local_198 = 0;
            uStack_1a0 = 0;
            local_1a8 = 0;
            uStack_170 = 0;
            local_178 = 0;
            ppuStack_1b8 = &PTR_LAB_00c4e678;
            uStack_160 = 0;
            local_168 = (void *)0x0;
            local_158 = 0x18;
                    /* try { // try from 00988ce0 to 00988d77 has its CatchHandler @ 00988fbc */
            pbVar4 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                               ((basic_ostream *)&local_1c0,
                                "SocketServer::listen() error calling listen ",0x2c);
            pbVar4 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                               (pbVar4,"at address ",0xb);
            uVar3 = (ulong)(*(byte *)(in_x0 + 0x10) >> 1);
            pcVar5 = (char *)(in_x0 + 0x11);
            if ((*(byte *)(in_x0 + 0x10) & 1) != 0) {
              uVar3 = *(ulong *)(in_x0 + 0x18);
              pcVar5 = *(char **)(in_x0 + 0x20);
            }
            pbVar4 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                               (pbVar4,pcVar5,uVar3);
            pbVar4 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                               (pbVar4,":",1);
            pbVar4 = (basic_ostream *)
                     std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::operator<<
                               ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar4,
                                *(int *)(in_x0 + 8));
            pbVar4 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                               (pbVar4," : ",3);
            iVar2 = Socket::getErrno();
            pcVar5 = strerror(iVar2);
            sVar6 = strlen(pcVar5);
            std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                      (pbVar4,pcVar5,sVar6);
            Socket::closeSocket(*(int *)(in_x0 + 0x3c));
                    /* try { // try from 00988d78 to 00988d83 has its CatchHandler @ 00988f60 */
            std::__ndk1::
            basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::str()
            ;
            goto LAB_009886b4;
          }
          local_1c0 = &PTR_FUN_00c4e508;
          local_150[0] = &PTR__basic_istream_00c4e640;
          uStack_1c8 = 0;
          local_1d0 = &PTR__basic_istream_00c4e618;
                    /* try { // try from 00988dc4 to 00988dcf has its CatchHandler @ 00988f58 */
          std::__ndk1::ios_base::init((ios_base *)local_150,&ppuStack_1b8);
          local_c8 = 0;
          local_c0 = 0xffffffff;
          local_1d0 = &PTR_LAB_00c4e4e0;
          local_150[0] = &PTR_FUN_00c4e530;
          ppuStack_1b8 = &PTR__basic_streambuf_00c4e728;
          local_1c0 = &PTR_FUN_00c4e508;
          std::__ndk1::locale::locale(alStack_1b0);
          uStack_180 = 0;
          local_188 = 0;
          uStack_190 = 0;
          local_198 = 0;
          uStack_1a0 = 0;
          local_1a8 = 0;
          uStack_170 = 0;
          local_178 = 0;
          ppuStack_1b8 = &PTR_LAB_00c4e678;
          uStack_160 = 0;
          local_168 = (void *)0x0;
          local_158 = 0x18;
                    /* try { // try from 00988e44 to 00988ed7 has its CatchHandler @ 00988f98 */
          pbVar4 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                             ((basic_ostream *)&local_1c0,
                              "SocketServer::listen() error calling bind ",0x2a);
          pbVar4 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                             (pbVar4,"at address ",0xb);
          uVar3 = *(ulong *)(in_x0 + 0x18);
          pcVar5 = *(char **)(in_x0 + 0x20);
          if ((*(byte *)(in_x0 + 0x10) & 1) == 0) {
            pcVar5 = (char *)(in_x0 + 0x11);
            uVar3 = (ulong)(*(byte *)(in_x0 + 0x10) >> 1);
          }
          pbVar4 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                             (pbVar4,pcVar5,uVar3);
          pbVar4 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                             (pbVar4,":",1);
          pbVar4 = (basic_ostream *)
                   std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::operator<<
                             ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar4,
                              *(int *)(in_x0 + 8));
          pbVar4 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                             (pbVar4," : ",3);
          iVar2 = Socket::getErrno();
          pcVar5 = strerror(iVar2);
          sVar6 = strlen(pcVar5);
          std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                    (pbVar4,pcVar5,sVar6);
          Socket::closeSocket(*(int *)(in_x0 + 0x3c));
                    /* try { // try from 00988ed8 to 00988ee3 has its CatchHandler @ 00988f50 */
          std::__ndk1::
          basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::str();
        }
        *in_x8 = 0;
        uVar7 = CONCAT44(local_b0.sa_data._2_4_,CONCAT22(local_b0.sa_data._0_2_,local_b0.sa_family))
        ;
        local_88 = local_a0;
        local_98.sa_data._6_8_ = local_b0.sa_data._6_8_;
      }
      ppuStack_1b8 = &PTR_LAB_00c4e678;
      local_1c0 = &PTR_FUN_00c4e508;
      local_150[0] = &PTR_FUN_00c4e530;
      local_1d0 = &PTR_LAB_00c4e4e0;
      *(undefined8 *)(in_x8 + 0x18) = local_88;
      *(undefined8 *)(in_x8 + 0x10) = local_98.sa_data._6_8_;
      *(undefined8 *)(in_x8 + 8) = uVar7;
      if (((byte)local_178 & 1) != 0) {
        operator_delete(local_168);
      }
      ppuStack_1b8 = &PTR__basic_streambuf_00c4e728;
      std::__ndk1::locale::~locale(alStack_1b0);
    }
  }
  std::__ndk1::ios_base::~ios_base((ios_base *)local_150);
joined_r0x00988930:
  if ((local_1e8 & 1) != 0) {
    operator_delete(local_1d8);
  }
  if (*(long *)(lVar1 + 0x28) != local_78) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

