/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098fdcc
 */

/* ix::WebSocket::ping(std::__ndk1::basic_string<char, std::__ndk1::char_traits<char>,
   std::__ndk1::allocator<char> > const&, ix::SendMessageKind) */

void ix::WebSocket::ping(undefined2 *param_1_00,undefined8 param_1,byte *param_3,undefined8 param_4)

{
  ulong uVar1;
  byte bVar2;
  long lVar3;
  code *pcVar4;
  byte *local_70;
  ulong uStack_68;
  long alStack_60 [4];
  long *local_40;
  long local_28;
  
  lVar3 = tpidr_el0;
  local_28 = *(long *)(lVar3 + 0x28);
  bVar2 = *param_3;
  uVar1 = (ulong)(bVar2 >> 1);
  if ((bVar2 & 1) != 0) {
    uVar1 = *(ulong *)(param_3 + 8);
  }
  if (uVar1 < 0x7e) {
    local_70 = *(byte **)(param_3 + 0x10);
    local_40 = (long *)0x0;
    if ((bVar2 & 1) == 0) {
      local_70 = param_3 + 1;
    }
                    /* try { // try from 0098fe24 to 0098fe33 has its CatchHandler @ 0098fe80 */
    uStack_68 = uVar1;
    sendMessage(param_1,&local_70,param_4,alStack_60);
    if (alStack_60 == local_40) {
      pcVar4 = *(code **)(*local_40 + 0x20);
    }
    else {
      if (local_40 == (long *)0x0) goto LAB_0098fe5c;
      pcVar4 = *(code **)(*local_40 + 0x28);
    }
    (*pcVar4)();
  }
  else {
    *param_1_00 = 0;
    *(undefined8 *)(param_1_00 + 4) = 0;
    *(undefined8 *)(param_1_00 + 8) = 0;
  }
LAB_0098fe5c:
  if (*(long *)(lVar3 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

