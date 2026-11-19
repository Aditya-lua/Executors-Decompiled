/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008fb08c
 */

/* cpr::GlobalThreadPool::~GlobalThreadPool() */

void __thiscall cpr::GlobalThreadPool::~GlobalThreadPool(GlobalThreadPool *this)

{
  ThreadPool::~ThreadPool((ThreadPool *)this);
  operator_delete(this);
  return;
}

