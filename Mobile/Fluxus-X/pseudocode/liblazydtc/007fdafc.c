/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 007fdafc
 */

void _INIT_17(void)

{
  long lVar1;
  thread atStack_30 [8];
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  FUN_007fdc48(atStack_30,FUN_007fdb84);
                    /* try { // try from 007fdb28 to 007fdb2f has its CatchHandler @ 007fdb58 */
  std::__ndk1::thread::detach(atStack_30);
  std::__ndk1::thread::~thread(atStack_30);
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

