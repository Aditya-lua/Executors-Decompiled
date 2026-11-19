/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00984a1c
 */

/* ix::Socket::closeSocket(int) */

void ix::Socket::closeSocket(int param_1)

{
  ::close(param_1);
  return;
}

