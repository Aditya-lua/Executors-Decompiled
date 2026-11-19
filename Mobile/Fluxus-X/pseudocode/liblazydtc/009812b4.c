/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009812b4
 */

/* ix::ConnectionState::~ConnectionState() */

void __thiscall ix::ConnectionState::~ConnectionState(ConnectionState *this)

{
  ConnectionState *pCVar1;
  code *pcVar2;
  
  *(undefined ***)this = &PTR__ConnectionState_00c51d48;
  if (((byte)this[0x60] & 1) != 0) {
    operator_delete(*(void **)(this + 0x70));
  }
  pCVar1 = *(ConnectionState **)(this + 0x50);
  if (this + 0x30 == pCVar1) {
    pcVar2 = *(code **)(*(long *)pCVar1 + 0x20);
  }
  else {
    if (pCVar1 == (ConnectionState *)0x0) goto LAB_00981310;
    pcVar2 = *(code **)(*(long *)pCVar1 + 0x28);
  }
  (*pcVar2)();
LAB_00981310:
  if (((byte)this[0x10] & 1) != 0) {
    operator_delete(*(void **)(this + 0x20));
  }
  operator_delete(this);
  return;
}

