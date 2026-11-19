/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098d8f4
 */

/* ix::WebSocket::start() */

void __thiscall ix::WebSocket::start(WebSocket *this)

{
  long lVar1;
  WebSocket *local_48;
  code *local_40;
  undefined8 uStack_38;
  undefined8 local_30;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  if (*(long *)(this + 0x408) == 0) {
    uStack_38 = 0;
    local_40 = run;
    local_48 = this;
    FUN_0098db04(&local_30,&local_40,&local_48);
    if (*(long *)(this + 0x408) != 0) {
                    /* WARNING: Subroutine does not return */
      std::terminate();
    }
    *(undefined8 *)(this + 0x408) = local_30;
    local_30 = 0;
    std::__ndk1::thread::~thread((thread *)&local_30);
  }
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

