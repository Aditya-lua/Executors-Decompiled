/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c40410
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int tcgetattr(int __fd,termios *__termios_p)

{
  int iVar1;
  
  iVar1 = tcgetattr(__fd,__termios_p);
  return iVar1;
}

