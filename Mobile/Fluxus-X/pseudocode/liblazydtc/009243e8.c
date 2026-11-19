/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009243e8
 */

long FUN_009243e8(long param_1,void *param_2,ulong param_3,undefined4 *param_4)

{
  size_t __n;
  long lVar1;
  undefined4 uVar2;
  long lVar3;
  
  lVar3 = 0;
  do {
    if (param_3 == 0) {
LAB_00924490:
      uVar2 = 0;
LAB_00924494:
      *param_4 = uVar2;
      return lVar3;
    }
    lVar1 = FUN_009244cc(param_1);
    if (lVar1 == 0) {
      if ((*(ulong *)(param_1 + 0x20) < *(ulong *)(param_1 + 0x28)) ||
         ((*(byte *)(param_1 + 0x38) & 1) != 0)) {
        lVar3 = -1;
        uVar2 = 0x1b;
        goto LAB_00924494;
      }
LAB_0092448c:
      if (lVar3 == 0) {
        lVar3 = -1;
        uVar2 = 0x51;
        goto LAB_00924494;
      }
      goto LAB_00924490;
    }
    __n = *(long *)(lVar1 + 8) - *(long *)(lVar1 + 0x18);
    if (__n == 0) goto LAB_0092448c;
    if (param_3 <= __n) {
      __n = param_3;
    }
    memcpy((void *)(lVar1 + *(long *)(lVar1 + 0x18) + 0x20),param_2,__n);
    *(size_t *)(lVar1 + 0x18) = *(long *)(lVar1 + 0x18) + __n;
    if (__n == 0) goto LAB_0092448c;
    lVar3 = __n + lVar3;
    param_3 = param_3 - __n;
    param_2 = (void *)((long)param_2 + __n);
  } while( true );
}

