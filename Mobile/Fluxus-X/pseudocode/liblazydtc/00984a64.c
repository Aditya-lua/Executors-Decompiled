/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00984a64
 */

/* ix::Socket::getErrno() */

undefined4 ix::Socket::getErrno(void)

{
  undefined4 *puVar1;
  
  puVar1 = (undefined4 *)__errno();
  return *puVar1;
}

