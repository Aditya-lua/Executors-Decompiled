/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c31950
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int sched_yield(void)

{
  int iVar1;
  
  iVar1 = sched_yield();
  return iVar1;
}

