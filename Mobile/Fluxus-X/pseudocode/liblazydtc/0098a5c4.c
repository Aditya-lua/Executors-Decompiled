/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098a5c4
 */

/* ix::SocketServer::wait() */

void __thiscall ix::SocketServer::wait(SocketServer *this)

{
  long lVar1;
  mutex *local_38;
  char local_30;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  local_38 = (mutex *)(this + 0xf8);
  local_30 = '\x01';
  std::__ndk1::mutex::lock(local_38);
  std::__ndk1::condition_variable::wait((condition_variable *)(this + 200),(unique_lock *)&local_38)
  ;
  if (local_30 != '\0') {
    std::__ndk1::mutex::unlock(local_38);
  }
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

