/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008fe19c
 */

/* cpr::ThreadPool::Pause() */

undefined8 __thiscall cpr::ThreadPool::Pause(ThreadPool *this)

{
  if (*(int *)(this + 0x20) == 1) {
    *(int *)(this + 0x20) = 2;
  }
  return 0;
}

