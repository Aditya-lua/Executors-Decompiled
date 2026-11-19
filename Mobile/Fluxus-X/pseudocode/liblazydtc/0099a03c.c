/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0099a03c
 */

/* bool 
   ix::WebSocketTransport::sendFragment<ix::IXWebSocketSendData::IXWebSocketSendData_const_iterator<char>
   >(ix::WebSocketTransport::wsheader_type::opcode_type, bool,
   ix::IXWebSocketSendData::IXWebSocketSendData_const_iterator<char>,
   ix::IXWebSocketSendData::IXWebSocketSendData_const_iterator<char>, bool) */

bool __thiscall
ix::WebSocketTransport::
sendFragment<ix::IXWebSocketSendData::IXWebSocketSendData_const_iterator<char>>
          (WebSocketTransport *this,int param_2,ulong param_3,long *param_4,long *param_5,
          ulong param_6)

{
  WebSocketTransport *pWVar1;
  long lVar2;
  byte bVar3;
  long lVar4;
  byte bVar5;
  long lVar6;
  ulong uVar7;
  long local_a0;
  long local_98;
  uchar local_8c [4];
  byte *local_88;
  byte *local_80;
  undefined8 local_78;
  byte local_6c;
  byte local_6b;
  byte local_6a;
  byte local_69;
  long local_68;
  
  lVar4 = tpidr_el0;
  local_68 = *(long *)(lVar4 + 0x28);
  uVar7 = *param_5 - *param_4;
  lVar6 = std::__ndk1::chrono::system_clock::now();
  lVar2 = 4;
  if (uVar7 < 0x7e) {
    lVar2 = 2;
  }
  lVar6 = lVar6 / 1000000;
  local_6c = (byte)((ulong)lVar6 >> 0x18);
  local_6b = (byte)((ulong)lVar6 >> 0x10);
  local_6a = (byte)((ulong)lVar6 >> 8);
  local_88 = (byte *)0x0;
  local_80 = (byte *)0x0;
  local_78 = 0;
  local_69 = (byte)lVar6;
  lVar6 = 6;
  if (uVar7 >> 0x10 == 0) {
    lVar6 = 0;
  }
  local_8c[0] = '\0';
                    /* try { // try from 0099a108 to 0099a113 has its CatchHandler @ 0099a31c */
  std::__ndk1::vector<unsigned_char,std::__ndk1::allocator<unsigned_char>>::assign
            ((vector<unsigned_char,std::__ndk1::allocator<unsigned_char>> *)&local_88,
             lVar2 + lVar6 + (ulong)(((byte)this[0x18] & 1) << 2),local_8c);
  *local_88 = (byte)param_2;
  if ((param_3 & 1) != 0) {
    *local_88 = *local_88 | 0x80;
  }
  if ((param_2 != 0) && ((param_6 & 1) != 0)) {
    *local_88 = *local_88 | 0x40;
  }
  pWVar1 = this + 0x18;
  bVar5 = (byte)uVar7;
  if (uVar7 < 0x7e) {
    local_88[1] = bVar5 | (char)*pWVar1 << 7;
    if (((byte)*pWVar1 & 1) != 0) {
      local_88[2] = local_6c;
      local_88[3] = local_6b;
      local_88[4] = local_6a;
      local_88[5] = local_69;
    }
  }
  else {
    bVar3 = (byte)(uVar7 >> 8);
    if (uVar7 >> 0x10 == 0) {
      local_88[1] = (char)*pWVar1 << 7 | 0x7e;
      local_88[2] = bVar3;
      local_88[3] = bVar5;
      if (((byte)*pWVar1 & 1) != 0) {
        local_88[4] = local_6c;
        local_88[5] = local_6b;
        local_88[6] = local_6a;
        local_88[7] = local_69;
      }
    }
    else {
      local_88[1] = (char)*pWVar1 << 7 | 0x7f;
      local_88[2] = (byte)(uVar7 >> 0x38);
      local_88[3] = (byte)(uVar7 >> 0x30);
      local_88[4] = (byte)(uVar7 >> 0x28);
      local_88[5] = (byte)(uVar7 >> 0x20);
      local_88[6] = (byte)(uVar7 >> 0x18);
      local_88[7] = (byte)(uVar7 >> 0x10);
      local_88[8] = bVar3;
      local_88[9] = bVar5;
      if (((byte)*pWVar1 & 1) != 0) {
        local_88[10] = local_6c;
        local_88[0xb] = local_6b;
        local_88[0xc] = local_6a;
        local_88[0xd] = local_69;
      }
    }
  }
  local_98 = *param_4;
  local_a0 = *param_5;
                    /* try { // try from 0099a2a4 to 0099a2bf has its CatchHandler @ 0099a318 */
  appendToSendBuffer<ix::IXWebSocketSendData::IXWebSocketSendData_const_iterator<char>>
            (this,&local_88,&local_98,&local_a0,uVar7,&local_6c);
                    /* try { // try from 0099a2c0 to 0099a2c7 has its CatchHandler @ 0099a314 */
  bVar5 = sendOnSocket(this);
  if (local_88 != (byte *)0x0) {
    local_80 = local_88;
    operator_delete(local_88);
  }
  if (*(long *)(lVar4 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return (bool)(bVar5 & 1);
}

