/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098912c
 */

/* ix::SocketServer::start() */

void __thiscall ix::SocketServer::start(SocketServer *this)

{
  long lVar1;
  long lVar2;
  SocketServer *local_48;
  code *local_40;
  undefined8 uStack_38;
  undefined8 local_30;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  this[0x40] = (SocketServer)0x0;
  if (*(long *)(this + 0x70) == 0) {
    uStack_38 = 0;
    local_40 = run;
    local_48 = this;
    FUN_0098a358(&local_30,&local_40,&local_48);
    if (*(long *)(this + 0x70) != 0) goto LAB_0098921c;
    *(undefined8 *)(this + 0x70) = local_30;
    local_30 = 0;
    std::__ndk1::thread::~thread((thread *)&local_30);
    lVar2 = *(long *)(this + 0x80);
  }
  else {
    lVar2 = *(long *)(this + 0x80);
  }
  if (lVar2 == 0) {
    uStack_38 = 0;
    local_40 = runGC;
    local_48 = this;
    FUN_0098a358(&local_30,&local_40,&local_48);
    if (*(long *)(this + 0x80) != 0) {
LAB_0098921c:
                    /* WARNING: Subroutine does not return */
      std::terminate();
    }
    *(undefined8 *)(this + 0x80) = local_30;
    local_30 = 0;
    std::__ndk1::thread::~thread((thread *)&local_30);
  }
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

