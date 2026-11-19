/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098d988
 */

/* ix::WebSocket::run() */

void __thiscall ix::WebSocket::run(WebSocket *this)

{
  long lVar1;
  uint uVar2;
  int iVar3;
  undefined4 uVar4;
  bool bVar5;
  code *pcVar6;
  undefined **local_70;
  WebSocket *pWStack_68;
  void *local_60;
  long *local_50;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  if (this[0x4e8] != (WebSocket)0x0) {
    getUrl();
                    /* try { // try from 0098d9c0 to 0098d9c7 has its CatchHandler @ 0098daa4 */
    setThreadName((basic_string_conflict *)&local_70);
    if (((ulong)local_70 & 1) != 0) {
      operator_delete(local_60);
    }
  }
  bVar5 = true;
  do {
    checkConnection(this,bVar5);
    uVar2 = WebSocketTransport::getReadyState((WebSocketTransport *)this);
    if (((3 < uVar2) || (uVar2 == 1)) ||
       ((((byte)this[0x400] & 1) != 0 &&
        (iVar3 = WebSocketTransport::getReadyState((WebSocketTransport *)this), iVar3 != 0)))) {
      if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
        __stack_chk_fail();
      }
      return;
    }
    uVar4 = WebSocketTransport::poll((WebSocketTransport *)this);
    local_70 = &PTR_LAB_00c52248;
    pWStack_68 = this;
    local_50 = (long *)&local_70;
                    /* try { // try from 0098da44 to 0098da4f has its CatchHandler @ 0098dac0 */
    WebSocketTransport::dispatch((WebSocketTransport *)this,uVar4,&local_70);
    if (&local_70 == (undefined ***)local_50) {
      pcVar6 = *(code **)(*local_50 + 0x20);
LAB_0098da74:
      (*pcVar6)();
    }
    else if (local_50 != (long *)0x0) {
      pcVar6 = *(code **)(*local_50 + 0x28);
      goto LAB_0098da74;
    }
    bVar5 = false;
  } while( true );
}

