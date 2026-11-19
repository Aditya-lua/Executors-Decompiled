/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00980e70
 */

/* ix::ConnectionState::ConnectionState() */

void __thiscall ix::ConnectionState::ConnectionState(ConnectionState *this)

{
  char cVar1;
  bool bVar2;
  long lVar3;
  __ndk1 *this_00;
  ulong in_x1;
  long lVar4;
  ConnectionState *pCVar5;
  undefined8 local_50;
  undefined8 uStack_48;
  undefined8 local_40;
  
  lVar3 = tpidr_el0;
  lVar4 = *(long *)(lVar3 + 0x28);
  *(undefined ***)this = &PTR__ConnectionState_00c51d48;
  this[8] = (ConnectionState)0x0;
  pCVar5 = this + 0x10;
  *(undefined8 *)pCVar5 = 0;
  *(undefined8 *)(this + 0x18) = 0;
  *(undefined8 *)(this + 0x20) = 0;
  *(undefined8 *)(this + 0x50) = 0;
  *(undefined8 *)(this + 0x60) = 0;
  *(undefined8 *)(this + 0x68) = 0;
  *(undefined8 *)(this + 0x70) = 0;
  do {
    this_00 = _globalId;
    cVar1 = '\x01';
    bVar2 = (bool)ExclusiveMonitorPass(&_globalId,0x10);
    if (bVar2) {
      cVar1 = ExclusiveMonitorsStatus();
      _globalId = _globalId + 1;
    }
  } while (cVar1 != '\0');
                    /* try { // try from 00980edc to 00980ee3 has its CatchHandler @ 00980f4c */
  std::__ndk1::to_string(this_00,in_x1);
  if (((byte)*pCVar5 & 1) == 0) {
    *(undefined2 *)pCVar5 = 0;
  }
  else {
    **(undefined1 **)(this + 0x20) = 0;
    *(undefined8 *)(this + 0x18) = 0;
    if (((byte)this[0x10] & 1) != 0) {
      operator_delete(*(void **)(this + 0x20));
      *(undefined8 *)(this + 0x10) = 0;
    }
  }
  *(undefined8 *)(this + 0x20) = local_40;
  *(undefined8 *)(this + 0x18) = uStack_48;
  *(undefined8 *)pCVar5 = local_50;
  if (*(long *)(lVar3 + 0x28) != lVar4) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

