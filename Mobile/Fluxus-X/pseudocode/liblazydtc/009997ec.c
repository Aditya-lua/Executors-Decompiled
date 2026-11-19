/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009997ec
 */

/* ix::WebSocketTransport::sendData(ix::WebSocketTransport::wsheader_type::opcode_type,
   ix::IXWebSocketSendData const&, bool, std::__ndk1::function<bool (int, int)> const&) */

void ix::WebSocketTransport::sendData
               (byte *param_1,WebSocketTransport *param_2,undefined4 param_3,
               basic_string_conflict *param_4,uint param_5,long param_6)

{
  mutex *this;
  ulong uVar1;
  WebSocketTransport *pWVar2;
  undefined4 uVar3;
  long lVar4;
  WebSocketTransport WVar5;
  long lVar6;
  bool bVar7;
  byte bVar8;
  ulong uVar9;
  void *__dest;
  long *plVar10;
  size_t __n;
  ulong uVar11;
  ulong uVar12;
  WebSocketTransport *pWVar13;
  ulong uVar14;
  long lVar15;
  void *__src;
  WebSocketTransport *pWVar16;
  WebSocketTransport *local_90;
  WebSocketTransport *pWStack_88;
  WebSocketTransport *local_80;
  WebSocketTransport *pWStack_78;
  undefined4 local_70;
  undefined4 uStack_6c;
  long local_68;
  
  lVar6 = tpidr_el0;
  local_68 = *(long *)(lVar6 + 0x28);
  if ((*(int *)(param_2 + 0xe0) == 3) || (*(int *)(param_2 + 0xe0) == 0)) {
    uVar14 = *(ulong *)(param_4 + 8);
    if ((param_5 & 1) == 0) {
      pWVar13 = *(WebSocketTransport **)param_4;
      pWVar16 = pWVar13 + uVar14;
      uVar9 = uVar14;
    }
    else {
                    /* try { // try from 0099985c to 00999867 has its CatchHandler @ 00999b28 */
      uVar9 = WebSocketPerMessageDeflate::compress
                        (*(IXWebSocketSendData **)(param_2 + 0x178),param_4);
      if ((uVar9 & 1) == 0) {
        param_1[0] = 0;
        param_1[1] = 1;
        goto LAB_0099989c;
      }
      WVar5 = param_2[0x1a0];
      if (((byte)WVar5 & 1) == 0) {
        uVar11 = *(ulong *)(param_2 + 0x1a8);
        uVar12 = (ulong)((byte)WVar5 >> 1);
        uVar9 = uVar12;
      }
      else {
        uVar11 = *(ulong *)(param_2 + 0x1a8);
        uVar12 = (ulong)((byte)WVar5 >> 1);
        uVar9 = uVar11;
      }
      pWVar13 = *(WebSocketTransport **)(param_2 + 0x1b0);
      if (((byte)WVar5 & 1) == 0) {
        pWVar13 = param_2 + 0x1a1;
      }
      else {
        uVar12 = uVar11;
      }
      pWVar16 = pWVar13 + uVar12;
    }
    this = (mutex *)(param_2 + 0x68);
                    /* try { // try from 009998c8 to 009998cf has its CatchHandler @ 00999b2c */
    std::__ndk1::mutex::lock(this);
    __src = *(void **)(param_2 + 0x50);
    if ((ulong)(*(long *)(param_2 + 0x60) - (long)__src) < uVar9) {
      lVar15 = *(long *)(param_2 + 0x58);
                    /* try { // try from 009998ec to 009998f3 has its CatchHandler @ 00999b14 */
      __dest = operator_new(uVar9);
      __n = lVar15 - (long)__src;
      if (0 < (long)__n) {
        memcpy(__dest,__src,__n);
      }
      *(void **)(param_2 + 0x50) = __dest;
      *(size_t *)(param_2 + 0x58) = (long)__dest + __n;
      *(ulong *)(param_2 + 0x60) = (long)__dest + uVar9;
      if (__src != (void *)0x0) {
        operator_delete(__src);
      }
    }
    std::__ndk1::mutex::unlock(this);
    uVar12 = uVar9 >> 0xf;
    if (uVar12 == 0) {
                    /* try { // try from 00999954 to 0099996f has its CatchHandler @ 00999b10 */
      local_80 = pWVar16;
      pWStack_78 = pWVar13;
      bVar7 = sendFragment<ix::IXWebSocketSendData::IXWebSocketSendData_const_iterator<char>>
                        (param_2,param_3,1,&pWStack_78,&local_80,param_5 & 1);
      plVar10 = *(long **)(param_6 + 0x20);
      if (plVar10 != (long *)0x0) {
        local_70 = 1;
        uStack_6c = 0;
                    /* try { // try from 00999994 to 0099999f has its CatchHandler @ 00999b30 */
        (**(code **)(*plVar10 + 0x30))(plVar10,&uStack_6c,&local_70);
      }
    }
    else {
      if (uVar12 != 0) {
        uVar11 = 0;
        do {
          while( true ) {
            bVar7 = uVar12 - 1 == uVar11;
            pWVar2 = pWVar13 + 0x8000;
            local_90 = pWVar16;
            if (!bVar7) {
              local_90 = pWVar2;
            }
            uVar3 = param_3;
            if (uVar11 != 0) {
              uVar3 = 0;
            }
                    /* try { // try from 009999d4 to 009999e7 has its CatchHandler @ 00999b38 */
            pWStack_88 = pWVar13;
            bVar7 = sendFragment<ix::IXWebSocketSendData::IXWebSocketSendData_const_iterator<char>>
                              (param_2,uVar3,bVar7,&pWStack_88,&local_90,param_5 & 1);
            if (!bVar7) {
              param_1[0] = 0;
              param_1[1] = 0;
              param_1[8] = 0;
              param_1[9] = 0;
              param_1[10] = 0;
              param_1[0xb] = 0;
              param_1[0xc] = 0;
              param_1[0xd] = 0;
              param_1[0xe] = 0;
              param_1[0xf] = 0;
              param_1[0x10] = 0;
              param_1[0x11] = 0;
              param_1[0x12] = 0;
              param_1[0x13] = 0;
              param_1[0x14] = 0;
              param_1[0x15] = 0;
              param_1[0x16] = 0;
              param_1[0x17] = 0;
              goto LAB_00999ab8;
            }
            plVar10 = *(long **)(param_6 + 0x20);
            uVar1 = uVar11 + 1;
            pWVar13 = pWVar2;
            if (plVar10 == (long *)0x0) break;
            local_70 = (undefined4)uVar12;
            uStack_6c = (undefined4)uVar11;
                    /* try { // try from 00999a04 to 00999a0f has its CatchHandler @ 00999b34 */
            bVar8 = (**(code **)(*plVar10 + 0x30))(plVar10,&uStack_6c,&local_70);
            uVar11 = uVar1;
            if ((bVar8 & uVar1 < uVar12) == 0) goto LAB_00999a40;
          }
          uVar11 = uVar1;
        } while (uVar1 < uVar12);
      }
LAB_00999a40:
      bVar7 = true;
    }
                    /* try { // try from 00999a48 to 00999a6f has its CatchHandler @ 00999b30 */
    std::__ndk1::mutex::lock(this);
    lVar15 = *(long *)(param_2 + 0x50);
    lVar4 = *(long *)(param_2 + 0x58);
    std::__ndk1::mutex::unlock(this);
    if (lVar15 != lVar4) {
      std::__ndk1::mutex::lock((mutex *)(param_2 + 0xb8));
                    /* try { // try from 00999a80 to 00999a83 has its CatchHandler @ 00999afc */
      Socket::wakeUpFromPoll(*(ulong *)(param_2 + 0xb0));
      std::__ndk1::mutex::unlock((mutex *)(param_2 + 0xb8));
      if (((byte)param_2[0x19] & 1) != 0) {
                    /* try { // try from 00999a98 to 00999a9f has its CatchHandler @ 00999b30 */
        bVar8 = flushSendBuffer(param_2);
        bVar7 = (bool)(bVar7 & bVar8);
      }
    }
    *param_1 = bVar7;
    param_1[1] = 0;
    *(ulong *)(param_1 + 8) = uVar14;
    *(ulong *)(param_1 + 0x10) = uVar9;
  }
  else {
    param_1[0] = 0;
    param_1[1] = 0;
LAB_0099989c:
    param_1[8] = 0;
    param_1[9] = 0;
    param_1[10] = 0;
    param_1[0xb] = 0;
    param_1[0xc] = 0;
    param_1[0xd] = 0;
    param_1[0xe] = 0;
    param_1[0xf] = 0;
    param_1[0x10] = 0;
    param_1[0x11] = 0;
    param_1[0x12] = 0;
    param_1[0x13] = 0;
    param_1[0x14] = 0;
    param_1[0x15] = 0;
    param_1[0x16] = 0;
    param_1[0x17] = 0;
  }
LAB_00999ab8:
  if (*(long *)(lVar6 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

