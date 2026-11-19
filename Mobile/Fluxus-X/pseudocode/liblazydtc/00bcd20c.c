/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bcd20c
 */

/* std::__ndk1::thread::~thread() */

void __thiscall std::__ndk1::thread::~thread(thread *this)

{
  if (*(long *)this != 0) {
                    /* WARNING: Subroutine does not return */
    terminate();
  }
  return;
}

