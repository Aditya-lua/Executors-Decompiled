/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008fe004
 */

/* cpr::ThreadPool::~ThreadPool() */

void __thiscall cpr::ThreadPool::~ThreadPool(ThreadPool *this)

{
  ~ThreadPool(this);
  operator_delete(this);
  return;
}

