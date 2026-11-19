/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098f954
 */

/* ix::WebSocket::send(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&, bool, std::__ndk1::function<bool (int, int)> const&) */

void __thiscall
ix::WebSocket::send(WebSocket *this,basic_string_conflict *param_1,bool param_2,function *param_3)

{
  long lVar1;
  basic_string_conflict *pbVar2;
  basic_string_conflict bVar3;
  long lVar4;
  ulong uVar5;
  bool bVar6;
  undefined8 uVar7;
  undefined2 *in_x8;
  ulong uVar8;
  ulong uVar9;
  basic_string_conflict *pbVar10;
  basic_string_conflict *local_38;
  ulong local_30;
  long local_28;
  
  lVar4 = tpidr_el0;
  local_28 = *(long *)(lVar4 + 0x28);
  if (param_2) {
    local_38 = *(basic_string_conflict **)(param_1 + 0x10);
    uVar7 = 1;
    bVar6 = ((byte)*param_1 & 1) == 0;
    if (bVar6) {
      local_38 = param_1 + 1;
    }
    local_30 = (ulong)((byte)*param_1 >> 1);
    if (!bVar6) {
      local_30 = *(ulong *)(param_1 + 8);
    }
  }
  else {
    pbVar2 = *(basic_string_conflict **)(param_1 + 0x10);
    uVar5 = (ulong)((byte)*param_1 >> 1);
    if (((byte)*param_1 & 1) == 0) {
      pbVar2 = param_1 + 1;
    }
    else {
      uVar5 = *(ulong *)(param_1 + 8);
    }
    if (uVar5 != 0) {
      uVar8 = 0;
      uVar9 = uVar5;
      pbVar10 = pbVar2;
      do {
        bVar3 = *pbVar10;
        lVar1 = uVar8 * 0x10;
        uVar8 = (ulong)(byte)(&DAT_0074a0e4)
                             [((ulong)(byte)(&DAT_0074a0e4)[(byte)bVar3] | 0x100) + lVar1];
        if (uVar8 == 1) goto LAB_0098fa04;
        uVar9 = uVar9 - 1;
        pbVar10 = pbVar10 + 1;
      } while (uVar9 != 0);
      if ((&DAT_0074a0e4)[((ulong)(byte)(&DAT_0074a0e4)[(byte)bVar3] | 0x100) + lVar1] != 0) {
LAB_0098fa04:
        WebSocketTransport::close
                  ((WebSocketTransport *)this,0x3ef,
                   (basic_string_conflict *)
                   &WebSocketCloseConstants::kInvalidFramePayloadDataMessage,0,false);
        *in_x8 = 0;
        *(undefined8 *)(in_x8 + 4) = 0;
        *(undefined8 *)(in_x8 + 8) = 0;
        goto LAB_0098fa44;
      }
    }
    uVar7 = 0;
    local_38 = pbVar2;
    local_30 = uVar5;
  }
  sendMessage(this,&local_38,uVar7);
LAB_0098fa44:
  if (*(long *)(lVar4 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

