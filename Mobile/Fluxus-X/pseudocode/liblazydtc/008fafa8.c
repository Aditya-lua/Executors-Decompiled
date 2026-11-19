/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008fafa8
 */

/* cpr::GlobalThreadPool::GetInstance() */

ThreadPool * cpr::GlobalThreadPool::GetInstance(void)

{
  undefined4 uVar1;
  ThreadPool *pTVar2;
  
  if (s_pInstance == (ThreadPool *)0x0) {
    std::__ndk1::mutex::lock((mutex *)s_mutex);
    if (s_pInstance == (ThreadPool *)0x0) {
      pTVar2 = operator_new(0x100);
      uVar1 = std::__ndk1::thread::hardware_concurrency();
                    /* try { // try from 008fafec to 008faffb has its CatchHandler @ 008fb02c */
      ThreadPool::ThreadPool(pTVar2,1,uVar1,60000);
      s_pInstance = pTVar2;
      *(undefined ***)pTVar2 = &PTR__ThreadPool_00c4f0c8;
    }
    std::__ndk1::mutex::unlock((mutex *)s_mutex);
  }
  return s_pInstance;
}

