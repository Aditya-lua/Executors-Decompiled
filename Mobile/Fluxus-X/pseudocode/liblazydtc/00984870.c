/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00984870
 */

/* ix::Socket::isWakeUpFromPollSupported() */

bool __thiscall ix::Socket::isWakeUpFromPollSupported(Socket *this)

{
  bool bVar1;
  int iVar2;
  long lVar3;
  
  iVar2 = (**(code **)(**(long **)(this + 0x38) + 0x30))();
  if (iVar2 == -1) {
    lVar3 = (**(code **)(**(long **)(this + 0x38) + 0x38))();
    bVar1 = lVar3 != 0;
  }
  else {
    bVar1 = true;
  }
  return bVar1;
}

