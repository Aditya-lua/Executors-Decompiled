/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008fe1bc
 */

/* cpr::ThreadPool::Resume() */

undefined8 __thiscall cpr::ThreadPool::Resume(ThreadPool *this)

{
  if (*(int *)(this + 0x20) == 2) {
    *(int *)(this + 0x20) = 1;
  }
  return 0;
}

