/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098fa68
 */

/* ix::WebSocket::sendBinary(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&, std::__ndk1::function<bool (int, int)> const&) */

void __thiscall
ix::WebSocket::sendBinary(WebSocket *this,basic_string_conflict *param_1,function *param_2)

{
  long lVar1;
  bool bVar2;
  basic_string_conflict *local_38;
  ulong local_30;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  local_38 = *(basic_string_conflict **)(param_1 + 0x10);
  bVar2 = ((byte)*param_1 & 1) == 0;
  if (bVar2) {
    local_38 = param_1 + 1;
  }
  local_30 = (ulong)((byte)*param_1 >> 1);
  if (!bVar2) {
    local_30 = *(ulong *)(param_1 + 8);
  }
  sendMessage(this,&local_38,1,param_2);
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

