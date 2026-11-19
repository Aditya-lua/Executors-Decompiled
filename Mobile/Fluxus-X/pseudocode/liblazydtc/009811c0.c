/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009811c0
 */

/* ix::ConnectionState::setTerminated() */

void __thiscall ix::ConnectionState::setTerminated(ConnectionState *this)

{
  this[8] = (ConnectionState)0x1;
  if (*(long **)(this + 0x50) == (long *)0x0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x009811dc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(**(long **)(this + 0x50) + 0x30))();
  return;
}

