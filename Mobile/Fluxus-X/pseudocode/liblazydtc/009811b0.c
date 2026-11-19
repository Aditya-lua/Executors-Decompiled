/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009811b0
 */

/* ix::ConnectionState::isTerminated() const */

byte __thiscall ix::ConnectionState::isTerminated(ConnectionState *this)

{
  return (byte)this[8] & 1;
}

