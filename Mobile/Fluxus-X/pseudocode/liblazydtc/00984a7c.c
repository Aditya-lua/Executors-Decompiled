/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00984a7c
 */

/* ix::Socket::isWaitNeeded() */

undefined8 ix::Socket::isWaitNeeded(void)

{
  int *piVar1;
  
  piVar1 = (int *)__errno();
  if ((*piVar1 == 0xb) || (*piVar1 == 0x73)) {
    return 1;
  }
  return 0;
}

