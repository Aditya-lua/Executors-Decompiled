/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00997740
 */

/* ix::WebSocketTransport::sendHeartBeat(ix::SendMessageKind) */

void ix::WebSocketTransport::sendHeartBeat(char *param_1,IXWebSocketSendData *param_2,int param_3)

{
  IXWebSocketSendData *pIVar1;
  char cVar2;
  bool bVar3;
  long lVar4;
  basic_ostream *pbVar5;
  undefined8 uVar6;
  ulong uVar7;
  code *pcVar8;
  long lVar9;
  void *local_1f8;
  ulong local_1f0;
  void *local_1e8;
  void *local_1e0;
  ulong uStack_1d8;
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
  byte local_b0 [8];
  ulong local_a8;
  void *local_a0;
  byte *local_90;
  
  lVar4 = tpidr_el0;
  lVar9 = *(long *)(lVar4 + 0x28);
  param_2[0x280] = (IXWebSocketSendData)0x0;
  local_1c0 = &PTR_FUN_00c4e508;
  local_150[0] = &PTR__basic_istream_00c4e640;
  uStack_1c8 = 0;
  local_1d0 = &PTR__basic_istream_00c4e618;
                    /* try { // try from 009977bc to 009977c7 has its CatchHandler @ 00997b94 */
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
  ppuStack_1b8 = &PTR_LAB_00c4e678;
  uStack_160 = 0;
  local_168 = (void *)0x0;
  uStack_170 = 0;
  local_178 = 0;
  local_158 = 0x18;
  uVar7 = (ulong)((byte)param_2[0x288] >> 1);
  pIVar1 = param_2 + 0x289;
  if (((byte)param_2[0x288] & 1) != 0) {
    uVar7 = *(ulong *)(param_2 + 0x290);
    pIVar1 = *(IXWebSocketSendData **)(param_2 + 0x298);
  }
                    /* try { // try from 0099785c to 009978bf has its CatchHandler @ 00997b9c */
  std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
            ((basic_ostream *)&local_1c0,(char *)pIVar1,uVar7);
  if (param_2[0x281] == (IXWebSocketSendData)0x0) {
    pbVar5 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                       ((basic_ostream *)&local_1c0,"::",2);
    pbVar5 = (basic_ostream *)
             std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::operator<<
                       ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar5,
                        *(int *)(param_2 + 0x27c));
    pbVar5 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                       (pbVar5,"s",1);
    pbVar5 = std::__ndk1::__put_character_sequence<char,std::__ndk1::char_traits<char>>
                       (pbVar5,"::",2);
    pIVar1 = param_2 + 0x2a8;
    do {
      uVar7 = *(ulong *)pIVar1;
      cVar2 = '\x01';
      bVar3 = (bool)ExclusiveMonitorPass(pIVar1,0x10);
      if (bVar3) {
        *(ulong *)pIVar1 = uVar7 + 1;
        cVar2 = ExclusiveMonitorsStatus();
      }
    } while (cVar2 != '\0');
    std::__ndk1::basic_ostream<char,std::__ndk1::char_traits<char>>::operator<<
              ((basic_ostream<char,std::__ndk1::char_traits<char>> *)pbVar5,uVar7);
  }
  if (param_3 == 0) {
                    /* try { // try from 009979a0 to 009979af has its CatchHandler @ 00997b2c */
    std::__ndk1::basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    str();
    local_90 = (byte *)0x0;
    uStack_1d8 = (ulong)local_1f8 >> 1 & 0x7f;
    local_1e0 = (void *)((ulong)&local_1f8 | 1);
    if (((ulong)local_1f8 & 1) != 0) {
      uStack_1d8 = local_1f0;
      local_1e0 = local_1e8;
    }
                    /* try { // try from 009979e0 to 009979fb has its CatchHandler @ 00997b28 */
    sendData(param_1,param_2,1,&local_1e0,(byte)param_2[0x185] & 1,local_b0);
    if (local_b0 == local_90) {
      pcVar8 = *(code **)(*(long *)local_90 + 0x20);
LAB_00997a60:
      (*pcVar8)();
    }
    else if (local_90 != (byte *)0x0) {
      pcVar8 = *(code **)(*(long *)local_90 + 0x28);
      goto LAB_00997a60;
    }
    if (((ulong)local_1f8 & 1) != 0) {
      operator_delete(local_1e8);
    }
    if (*param_1 == '\0') goto LAB_00997a98;
                    /* try { // try from 00997a80 to 00997a87 has its CatchHandler @ 00997b20 */
    std::__ndk1::mutex::lock((mutex *)(param_2 + 0x2b0));
  }
  else {
    if (param_3 != 1) {
      if (param_3 == 2) {
                    /* try { // try from 009978d4 to 009978e3 has its CatchHandler @ 00997b90 */
        std::__ndk1::
        basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::str();
        local_1f0 = (ulong)(local_b0[0] >> 1);
        local_1f8 = (void *)((ulong)local_b0 | 1);
        if ((local_b0[0] & 1) != 0) {
          local_1f0 = local_a8;
          local_1f8 = local_a0;
        }
                    /* try { // try from 00997904 to 00997913 has its CatchHandler @ 00997b78 */
        sendPing(param_2);
        if ((local_b0[0] & 1) != 0) {
          operator_delete(local_a0);
        }
      }
      else {
        param_1[0] = '\0';
        param_1[1] = '\0';
        param_1[8] = '\0';
        param_1[9] = '\0';
        param_1[10] = '\0';
        param_1[0xb] = '\0';
        param_1[0xc] = '\0';
        param_1[0xd] = '\0';
        param_1[0xe] = '\0';
        param_1[0xf] = '\0';
        param_1[0x10] = '\0';
        param_1[0x11] = '\0';
        param_1[0x12] = '\0';
        param_1[0x13] = '\0';
        param_1[0x14] = '\0';
        param_1[0x15] = '\0';
        param_1[0x16] = '\0';
        param_1[0x17] = '\0';
      }
      goto LAB_00997a98;
    }
                    /* try { // try from 00997928 to 00997937 has its CatchHandler @ 00997b74 */
    std::__ndk1::basic_stringbuf<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    str();
    local_90 = (byte *)0x0;
    uStack_1d8 = (ulong)local_1f8 >> 1 & 0x7f;
    local_1e0 = (void *)((ulong)&local_1f8 | 1);
    if (((ulong)local_1f8 & 1) != 0) {
      uStack_1d8 = local_1f0;
      local_1e0 = local_1e8;
    }
                    /* try { // try from 00997968 to 00997983 has its CatchHandler @ 00997b30 */
    sendData(param_1,param_2,2,&local_1e0,(byte)param_2[0x185] & 1,local_b0);
    if (local_b0 == local_90) {
      pcVar8 = *(code **)(*(long *)local_90 + 0x20);
LAB_00997a2c:
      (*pcVar8)();
    }
    else if (local_90 != (byte *)0x0) {
      pcVar8 = *(code **)(*(long *)local_90 + 0x28);
      goto LAB_00997a2c;
    }
    if (((ulong)local_1f8 & 1) != 0) {
      operator_delete(local_1e8);
    }
    if (*param_1 == '\0') goto LAB_00997a98;
                    /* try { // try from 00997a4c to 00997a53 has its CatchHandler @ 00997b24 */
    std::__ndk1::mutex::lock((mutex *)(param_2 + 0x2b0));
  }
  uVar6 = std::__ndk1::chrono::steady_clock::now();
  *(undefined8 *)(param_2 + 0x2d8) = uVar6;
  std::__ndk1::mutex::unlock((mutex *)(param_2 + 0x2b0));
LAB_00997a98:
  local_1d0 = &PTR_LAB_00c4e4e0;
  local_150[0] = &PTR_FUN_00c4e530;
  local_1c0 = &PTR_FUN_00c4e508;
  ppuStack_1b8 = &PTR_LAB_00c4e678;
  if ((local_178 & 1) != 0) {
    operator_delete(local_168);
  }
  ppuStack_1b8 = &PTR__basic_streambuf_00c4e728;
  std::__ndk1::locale::~locale(alStack_1b0);
  std::__ndk1::ios_base::~ios_base((ios_base *)local_150);
  if (*(long *)(lVar4 + 0x28) != lVar9) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

