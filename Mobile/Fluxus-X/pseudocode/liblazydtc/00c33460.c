/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c33460
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int poll(pollfd *__fds,nfds_t __nfds,int __timeout)

{
  int iVar1;
  
  iVar1 = poll(__fds,__nfds,__timeout);
  return iVar1;
}

