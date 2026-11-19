/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008fe1dc
 */

/* cpr::ThreadPool::Wait() */

undefined8 __thiscall cpr::ThreadPool::Wait(ThreadPool *this)

{
  while ((*(int *)(this + 0x20) != 0 &&
         ((*(long *)(this + 0xa0) != 0 || (*(long *)(this + 0x30) != *(long *)(this + 0x28)))))) {
                    /* try { // try from 008fe218 to 008fe21b has its CatchHandler @ 008fe230 */
    sched_yield();
  }
  return 0;
}

