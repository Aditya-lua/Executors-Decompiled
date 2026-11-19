/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009862d4
 */

/* ix::SocketConnect::configure(int) */

void ix::SocketConnect::configure(int param_1)

{
  long lVar1;
  int iVar2;
  undefined4 local_2c;
  long local_28;
  
  lVar1 = tpidr_el0;
  local_28 = *(long *)(lVar1 + 0x28);
  local_2c = 1;
  setsockopt(param_1,6,1,&local_2c,4);
  iVar2 = fcntl(param_1,4,0x800);
  if (*(long *)(lVar1 + 0x28) != local_28) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(iVar2);
  }
  return;
}

