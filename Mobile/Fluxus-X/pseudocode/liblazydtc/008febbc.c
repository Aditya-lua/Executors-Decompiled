/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008febbc
 */

/* cpr::UnixSocket::GetUnixSocketString() const */

UnixSocket * __thiscall cpr::UnixSocket::GetUnixSocketString(UnixSocket *this)

{
  if (((byte)*this & 1) == 0) {
    return this + 1;
  }
  return *(UnixSocket **)(this + 0x10);
}

