/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00999d08
 */

/* ix::WebSocketTransport::sendCloseFrame(unsigned short, std::__ndk1::basic_string<char,
   std::__ndk1::char_traits<char>, std::__ndk1::allocator<char> > const&) */

void __thiscall
ix::WebSocketTransport::sendCloseFrame
          (WebSocketTransport *this,ushort param_1,basic_string_conflict *param_2)

{
  ulong uVar1;
  basic_string_conflict *pbVar2;
  long lVar3;
  code *pcVar4;
  undefined1 auStack_b0 [24];
  void *local_98;
  ulong uStack_90;
  undefined8 local_88;
  ulong local_80;
  void *local_78;
  long alStack_70 [4];
  long *local_50;
  long local_38;
  
  lVar3 = tpidr_el0;
  local_38 = *(long *)(lVar3 + 0x28);
  if (param_1 == 0x3ed) {
    local_98 = (void *)((ulong)&local_88 | 1);
    local_88 = 0;
    local_80 = 0;
    local_78 = (void *)0x0;
    uStack_90 = 0;
    local_50 = (long *)0x0;
                    /* try { // try from 00999d58 to 00999d77 has its CatchHandler @ 00999e78 */
    sendData(auStack_b0,this,8,&local_98,0,alStack_70);
  }
  else {
    local_80 = 0;
    local_78 = (void *)0x0;
    local_88 = (ulong)CONCAT12((char)param_1,CONCAT11((char)(param_1 >> 8),4));
    uVar1 = *(ulong *)(param_2 + 8);
    pbVar2 = *(basic_string_conflict **)(param_2 + 0x10);
    if (((byte)*param_2 & 1) == 0) {
      pbVar2 = param_2 + 1;
      uVar1 = (ulong)((byte)*param_2 >> 1);
    }
                    /* try { // try from 00999db8 to 00999dbf has its CatchHandler @ 00999e68 */
    std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::
    append((basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> *)
           &local_88,(char *)pbVar2,uVar1);
    local_50 = (long *)0x0;
    uStack_90 = local_88 >> 1 & 0x7f;
    local_98 = (void *)((ulong)&local_88 | 1);
    if ((local_88 & 1) != 0) {
      uStack_90 = local_80;
      local_98 = local_78;
    }
                    /* try { // try from 00999de4 to 00999e03 has its CatchHandler @ 00999e64 */
    sendData(auStack_b0,this,8,&local_98,0,alStack_70);
  }
  if (alStack_70 == local_50) {
    pcVar4 = *(code **)(*local_50 + 0x20);
  }
  else {
    if (local_50 == (long *)0x0) goto LAB_00999e2c;
    pcVar4 = *(code **)(*local_50 + 0x28);
  }
  (*pcVar4)();
LAB_00999e2c:
  if ((local_88 & 1) != 0) {
    operator_delete(local_78);
  }
  if (*(long *)(lVar3 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

