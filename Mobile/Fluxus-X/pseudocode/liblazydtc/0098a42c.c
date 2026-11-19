/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0098a42c
 */

/* ix::SocketServer::runGC() */

void ix::SocketServer::runGC(void)

{
  SocketServer SVar1;
  long lVar2;
  SocketServer *in_x0;
  undefined8 *puVar3;
  int in_w1;
  long lVar4;
  basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>> local_88 [16];
  void *local_78;
  mutex *local_70;
  undefined8 uStack_68;
  void *local_60;
  long local_58;
  
  lVar2 = tpidr_el0;
  local_58 = *(long *)(lVar2 + 0x28);
  std::__ndk1::to_string((__ndk1 *)(ulong)*(uint *)(in_x0 + 8),in_w1);
                    /* try { // try from 0098a464 to 0098a47b has its CatchHandler @ 0098a5a8 */
  puVar3 = (undefined8 *)
           std::__ndk1::
           basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::insert
                     (local_88,0,"Srv:gc:",7);
  local_60 = (void *)puVar3[2];
  uStack_68 = puVar3[1];
  local_70 = (mutex *)*puVar3;
  *puVar3 = 0;
  puVar3[1] = 0;
  puVar3[2] = 0;
                    /* try { // try from 0098a494 to 0098a49b has its CatchHandler @ 0098a578 */
  setThreadName((basic_string_conflict *)&local_70);
  if (((ulong)local_70 & 1) != 0) {
    operator_delete(local_60);
  }
  if (((byte)local_88[0] & 1) != 0) {
    operator_delete(local_78);
  }
  do {
    closeTerminatedThreads(in_x0);
    if (((byte)in_x0[0x78] & 1) != 0) {
      std::__ndk1::mutex::lock((mutex *)(in_x0 + 0xa0));
      lVar4 = *(long *)(in_x0 + 0x98);
      std::__ndk1::mutex::unlock((mutex *)(in_x0 + 0xa0));
      if (lVar4 == 0) {
        if (*(long *)(lVar2 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
          __stack_chk_fail();
        }
        return;
      }
    }
    if (((byte)in_x0[0x78] & 1) == 0) {
      uStack_68 = CONCAT71(uStack_68._1_7_,1);
      local_70 = (mutex *)(in_x0 + 0x210);
      std::__ndk1::mutex::lock((mutex *)(in_x0 + 0x210));
      SVar1 = in_x0[0x238];
      while (SVar1 == (SocketServer)0x0) {
        std::__ndk1::condition_variable::wait
                  ((condition_variable *)(in_x0 + 0x1e0),(unique_lock *)&local_70);
        SVar1 = in_x0[0x238];
      }
      in_x0[0x238] = (SocketServer)0x0;
      if ((char)uStack_68 != '\0') {
        std::__ndk1::mutex::unlock(local_70);
      }
    }
  } while( true );
}

