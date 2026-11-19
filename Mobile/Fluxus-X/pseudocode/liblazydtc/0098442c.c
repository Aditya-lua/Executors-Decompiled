/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098442c
 */

/* ix::Socket::~Socket() */

void __thiscall ix::Socket::~Socket(Socket *this)

{
  long *plVar1;
  mutex *this_00;
  
  this_00 = (mutex *)(this + 0xc);
  *(undefined ***)this = &PTR__Socket_00c51e28;
                    /* try { // try from 00984454 to 0098445b has its CatchHandler @ 009844c4 */
  std::__ndk1::mutex::lock(this_00);
  if (*(int *)(this + 8) != -1) {
                    /* try { // try from 00984470 to 00984473 has its CatchHandler @ 009844b4 */
    ::close(*(int *)(this + 8));
    *(undefined4 *)(this + 8) = 0xffffffff;
  }
  std::__ndk1::mutex::unlock(this_00);
  plVar1 = *(long **)(this + 0x38);
  *(undefined8 *)(this + 0x38) = 0;
  if (plVar1 != (long *)0x0) {
    (**(code **)(*plVar1 + 8))();
  }
  std::__ndk1::mutex::~mutex(this_00);
  return;
}

