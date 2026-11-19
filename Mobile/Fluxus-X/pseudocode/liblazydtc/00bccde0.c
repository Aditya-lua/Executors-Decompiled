/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bccde0
 */

/* std::__ndk1::timed_mutex::timed_mutex() */

void __thiscall std::__ndk1::timed_mutex::timed_mutex(timed_mutex *this)

{
  *(undefined8 *)(this + 0x51) = 0;
  *(undefined8 *)(this + 0x49) = 0;
  *(undefined8 *)(this + 0x18) = 0;
  *(undefined8 *)(this + 0x10) = 0;
  *(undefined8 *)(this + 0x28) = 0;
  *(undefined8 *)(this + 0x20) = 0;
  *(undefined8 *)(this + 0x38) = 0;
  *(undefined8 *)(this + 0x30) = 0;
  *(undefined8 *)(this + 0x48) = 0;
  *(undefined8 *)(this + 0x40) = 0;
  *(undefined8 *)(this + 8) = 0;
  *(undefined8 *)this = 0;
  return;
}

