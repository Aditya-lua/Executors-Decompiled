/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098fadc
 */

/* ix::WebSocket::sendText(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&, std::__ndk1::function<bool (int, int)> const&) */

void ix::WebSocket::sendText(basic_string_conflict *param_1,function *param_2)

{
  long lVar1;
  function *pfVar2;
  function fVar3;
  long lVar4;
  ulong uVar5;
  undefined2 *in_x8;
  ulong uVar6;
  ulong uVar7;
  function *pfVar8;
  function *local_38;
  ulong uStack_30;
  long local_28;
  
  lVar4 = tpidr_el0;
  local_28 = *(long *)(lVar4 + 0x28);
  pfVar2 = *(function **)(param_2 + 0x10);
  uVar5 = (ulong)((byte)*param_2 >> 1);
  if (((byte)*param_2 & 1) == 0) {
    pfVar2 = param_2 + 1;
  }
  else {
    uVar5 = *(ulong *)(param_2 + 8);
  }
  if (uVar5 != 0) {
    uVar6 = 0;
    uVar7 = uVar5;
    pfVar8 = pfVar2;
    do {
      fVar3 = *pfVar8;
      lVar1 = uVar6 * 0x10;
      uVar6 = (ulong)(byte)(&DAT_0074a0e4)
                           [((ulong)(byte)(&DAT_0074a0e4)[(byte)fVar3] | 0x100) + lVar1];
      if (uVar6 == 1) goto LAB_0098fb58;
      uVar7 = uVar7 - 1;
      pfVar8 = pfVar8 + 1;
    } while (uVar7 != 0);
    if ((&DAT_0074a0e4)[((ulong)(byte)(&DAT_0074a0e4)[(byte)fVar3] | 0x100) + lVar1] != 0) {
LAB_0098fb58:
      WebSocketTransport::close
                ((WebSocketTransport *)param_1,0x3ef,
                 (basic_string_conflict *)&WebSocketCloseConstants::kInvalidFramePayloadDataMessage,
                 0,false);
      *in_x8 = 0;
      *(undefined8 *)(in_x8 + 4) = 0;
      *(undefined8 *)(in_x8 + 8) = 0;
      goto LAB_0098fb98;
    }
  }
  local_38 = pfVar2;
  uStack_30 = uVar5;
  sendMessage(param_1,&local_38,0);
LAB_0098fb98:
  if (*(long *)(lVar4 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

