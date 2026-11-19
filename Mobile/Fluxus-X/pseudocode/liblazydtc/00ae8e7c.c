/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae8e7c
 */

long OPENSSL_sk_delete_ptr(int *param_1,long param_2)

{
  int iVar1;
  uint uVar2;
  long *__dest;
  int iVar3;
  long lVar4;
  long lVar5;
  
  if (param_1 != (int *)0x0) {
    iVar1 = *param_1;
    if (0 < iVar1) {
      __dest = *(long **)(param_1 + 2);
      lVar4 = 0;
      do {
        if (*__dest == param_2) {
          lVar5 = *__dest;
          iVar3 = (int)lVar4;
          if (iVar1 + -1 == iVar3) {
            *param_1 = iVar3;
            return lVar5;
          }
          uVar2 = (iVar1 + -1) - iVar3;
          memmove(__dest,__dest + 1,-(ulong)(uVar2 >> 0x1f) & 0xfffffff800000000 | (ulong)uVar2 << 3
                 );
          *param_1 = *param_1 + -1;
          return lVar5;
        }
        lVar4 = lVar4 + 1;
        __dest = __dest + 1;
      } while (lVar4 < iVar1);
    }
  }
  return 0;
}

