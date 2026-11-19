/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00999428
 */

/* ix::WebSocketTransport::emitMessage(ix::WebSocketTransport::MessageKind,
   std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> >
   const&, bool, std::__ndk1::function<void (std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&, unsigned long, bool,
   ix::WebSocketTransport::MessageKind)> const&) */

void __thiscall
ix::WebSocketTransport::emitMessage
          (WebSocketTransport *this,int param_2,basic_string_conflict *param_3,ulong param_4,
          long param_5)

{
  long lVar1;
  ulong uVar2;
  WebSocketTransport WVar3;
  basic_string_conflict bVar4;
  long lVar5;
  byte bVar6;
  long *plVar7;
  undefined8 *puVar8;
  ulong uVar9;
  WebSocketTransport *pWVar10;
  basic_string_conflict *pbVar11;
  ulong uVar12;
  int local_58;
  byte local_54 [4];
  ulong local_50;
  long local_48;
  
  lVar5 = tpidr_el0;
  local_48 = *(long *)(lVar5 + 0x28);
  bVar4 = *param_3;
  uVar2 = (ulong)((byte)bVar4 >> 1);
  if (((byte)bVar4 & 1) != 0) {
    uVar2 = *(ulong *)(param_3 + 8);
  }
  if ((param_2 == 4) || ((param_4 & 1) == 0)) {
    if (param_2 == 0) {
      pbVar11 = *(basic_string_conflict **)(param_3 + 0x10);
      if (((byte)bVar4 & 1) == 0) {
        pbVar11 = param_3 + 1;
      }
      if (uVar2 != 0) {
        uVar12 = 0;
        uVar9 = uVar2;
        do {
          bVar4 = *pbVar11;
          lVar1 = uVar12 * 0x10;
          uVar12 = (ulong)(byte)(&DAT_0074a981)
                                [((ulong)(byte)(&DAT_0074a981)[(byte)bVar4] | 0x100) + lVar1];
          if (uVar12 == 1) goto LAB_009995a4;
          uVar9 = uVar9 - 1;
          pbVar11 = pbVar11 + 1;
        } while (uVar9 != 0);
        if ((&DAT_0074a981)[((ulong)(byte)(&DAT_0074a981)[(byte)bVar4] | 0x100) + lVar1] != 0)
        goto LAB_009995a4;
      }
    }
    local_54[0] = 0;
    plVar7 = *(long **)(param_5 + 0x20);
    if (plVar7 == (long *)0x0) goto LAB_009995f4;
    local_58 = param_2;
    local_50 = uVar2;
    (**(code **)(*plVar7 + 0x30))(plVar7,param_3,&local_50,local_54,&local_58);
  }
  else {
    bVar6 = WebSocketPerMessageDeflate::decompress
                      (*(WebSocketPerMessageDeflate **)(this + 0x178),param_3,
                       (basic_string_conflict *)(this + 0x188));
    if (param_2 == 0) {
      pWVar10 = *(WebSocketTransport **)(this + 0x198);
      uVar9 = (ulong)((byte)this[0x188] >> 1);
      if (((byte)this[0x188] & 1) == 0) {
        pWVar10 = this + 0x189;
      }
      else {
        uVar9 = *(ulong *)(this + 400);
      }
      if (uVar9 != 0) {
        uVar12 = 0;
        do {
          WVar3 = *pWVar10;
          lVar1 = uVar12 * 0x10;
          uVar12 = (ulong)(byte)(&DAT_0074a981)
                                [((ulong)(byte)(&DAT_0074a981)[(byte)WVar3] | 0x100) + lVar1];
          if (uVar12 == 1) goto LAB_009995a4;
          uVar9 = uVar9 - 1;
          pWVar10 = pWVar10 + 1;
        } while (uVar9 != 0);
        if ((&DAT_0074a981)[((ulong)(byte)(&DAT_0074a981)[(byte)WVar3] | 0x100) + lVar1] != 0) {
LAB_009995a4:
          close(this,0x3ef,
                (basic_string_conflict *)&WebSocketCloseConstants::kInvalidFramePayloadDataMessage,0
                ,false);
          goto LAB_009995c8;
        }
      }
    }
    local_54[0] = ~bVar6 & 1;
    plVar7 = *(long **)(param_5 + 0x20);
    if (plVar7 == (long *)0x0) {
LAB_009995f4:
      local_58 = param_2;
      local_50 = uVar2;
      puVar8 = (undefined8 *)__cxa_allocate_exception(8);
      *puVar8 = &PTR__bad_function_call_00cac7b8;
                    /* WARNING: Subroutine does not return */
      __cxa_throw(puVar8,&std::__ndk1::bad_function_call::typeinfo,
                  std::bad_exception::~bad_exception);
    }
    local_58 = param_2;
    local_50 = uVar2;
    (**(code **)(*plVar7 + 0x30))
              (plVar7,(basic_string_conflict *)(this + 0x188),&local_50,local_54,&local_58);
  }
LAB_009995c8:
  if (*(long *)(lVar5 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

