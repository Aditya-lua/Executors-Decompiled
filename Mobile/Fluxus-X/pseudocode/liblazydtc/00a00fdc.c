/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a00fdc
 */

int BIO_sock_should_retry(int i)

{
  int iVar1;
  int iVar2;
  int *piVar3;
  
  iVar2 = 0;
  if (i + 1U < 2) {
    piVar3 = (int *)__errno();
    iVar1 = *piVar3;
    iVar2 = 1;
    if ((((0x2c < iVar1 - 0x47U) || ((1L << ((ulong)(iVar1 - 0x47U) & 0x3f) & 0x181000000001U) == 0)
         ) && (iVar1 != 4)) && (iVar1 != 0xb)) {
      return 0;
    }
  }
  return iVar2;
}

