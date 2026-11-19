/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00824394
 */

bool FUN_00824394(byte *param_1,char *param_2)

{
  size_t sVar1;
  byte bVar2;
  bool bVar3;
  int iVar4;
  size_t __n;
  byte *__s1;
  
  __n = strlen(param_2);
  bVar2 = *param_1;
  sVar1 = (ulong)(bVar2 >> 1);
  if ((bVar2 & 1) != 0) {
    sVar1 = *(size_t *)(param_1 + 8);
  }
  if (__n == sVar1) {
    if (__n == 0xffffffffffffffff) {
                    /* WARNING: Subroutine does not return */
                    /* try { // try from 00824408 to 0082440b has its CatchHandler @ 0082440c */
      FUN_00814f80();
    }
    __s1 = *(byte **)(param_1 + 0x10);
    if ((bVar2 & 1) == 0) {
      __s1 = param_1 + 1;
    }
    iVar4 = memcmp(__s1,param_2,__n);
    bVar3 = iVar4 == 0;
  }
  else {
    bVar3 = false;
  }
  return bVar3;
}

