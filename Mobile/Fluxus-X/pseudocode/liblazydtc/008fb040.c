/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008fb040
 */

/* cpr::GlobalThreadPool::ExitInstance() */

void cpr::GlobalThreadPool::ExitInstance(void)

{
  std::__ndk1::mutex::lock((mutex *)s_mutex);
  if (s_pInstance != (long *)0x0) {
    (**(code **)(*s_pInstance + 8))();
    s_pInstance = (long *)0x0;
  }
  std::__ndk1::mutex::unlock((mutex *)s_mutex);
  return;
}

