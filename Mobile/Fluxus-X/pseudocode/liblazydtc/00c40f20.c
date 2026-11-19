/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c40f20
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int shutdown(int __fd,int __how)

{
  int iVar1;
  
  iVar1 = shutdown(__fd,__how);
  return iVar1;
}

