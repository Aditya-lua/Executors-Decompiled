/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009849b8
 */

/* ix::Socket::close() */

void __thiscall ix::Socket::close(Socket *this)

{
  std::__ndk1::mutex::lock((mutex *)(this + 0xc));
  if (*(int *)(this + 8) != -1) {
                    /* try { // try from 009849e8 to 009849eb has its CatchHandler @ 00984a08 */
    ::close(*(int *)(this + 8));
    *(undefined4 *)(this + 8) = 0xffffffff;
  }
  std::__ndk1::mutex::unlock((mutex *)(this + 0xc));
  return;
}

