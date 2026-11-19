/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7d790
 */

undefined8 mbedtls_mpi_copy(long *param_1,long *param_2)

{
  size_t sVar1;
  long lVar2;
  void *__dest;
  ulong uVar3;
  size_t __n;
  long lVar4;
  void *__src;
  ulong uVar5;
  
  if (param_1 != param_2) {
    uVar3 = (ulong)*(ushort *)((long)param_2 + 10);
    if (uVar3 == 0) {
      if ((ulong)*(ushort *)((long)param_1 + 10) != 0) {
        *(undefined2 *)(param_1 + 1) = 1;
        memset((void *)*param_1,0,(ulong)*(ushort *)((long)param_1 + 10) << 3);
      }
    }
    else {
      sVar1 = uVar3 << 3;
      lVar2 = -uVar3;
      do {
        lVar4 = lVar2;
        __n = sVar1;
        if (lVar4 == -1) break;
        sVar1 = __n - 8;
        lVar2 = lVar4 + 1;
      } while (*(long *)(*param_2 + __n + -8) == 0);
      uVar5 = (ulong)*(ushort *)((long)param_1 + 10);
      uVar3 = -lVar4;
      *(short *)(param_1 + 1) = (short)param_2[1];
      if (uVar3 < uVar5 || -uVar5 == lVar4) {
        memset((void *)(*param_1 + __n),0,(uVar5 + lVar4) * 8);
        __dest = (void *)*param_1;
      }
      else {
        if ((9999 < uVar3 && lVar4 != -10000) || (__dest = calloc(uVar3,8), __dest == (void *)0x0))
        {
          return 0xfffffff0;
        }
        __src = (void *)*param_1;
        if (__src != (void *)0x0) {
          memcpy(__dest,__src,uVar5 << 3);
          mbedtls_zeroize_and_free(__src,uVar5 << 3);
        }
        *(short *)((long)param_1 + 10) = (short)uVar3;
        *param_1 = (long)__dest;
      }
      memcpy(__dest,(void *)*param_2,__n);
    }
  }
  return 0;
}

