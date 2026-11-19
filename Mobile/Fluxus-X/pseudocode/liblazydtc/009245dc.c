/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009245dc
 */

undefined8 FUN_009245dc(long param_1,void *param_2,ulong param_3,ulong *param_4)

{
  size_t __n;
  long lVar1;
  undefined8 uVar2;
  ulong uVar3;
  
  if (param_3 == 0) {
    uVar2 = 0;
    uVar3 = 0;
  }
  else {
    uVar3 = 0;
    do {
      lVar1 = FUN_009244cc(param_1);
      if (lVar1 == 0) {
        if ((*(ulong *)(param_1 + 0x20) < *(ulong *)(param_1 + 0x28)) ||
           ((*(byte *)(param_1 + 0x38) & 1) != 0)) {
          uVar3 = 0;
          uVar2 = 0x1b;
          goto LAB_009246b0;
        }
LAB_0092468c:
        if (uVar3 == 0) {
          uVar3 = 0;
          uVar2 = 0x51;
          goto LAB_009246b0;
        }
        break;
      }
      __n = *(long *)(lVar1 + 8) - *(long *)(lVar1 + 0x18);
      if (__n == 0) goto LAB_0092468c;
      if (param_3 <= __n) {
        __n = param_3;
      }
      memcpy((void *)(lVar1 + *(long *)(lVar1 + 0x18) + 0x20),param_2,__n);
      *(size_t *)(lVar1 + 0x18) = *(long *)(lVar1 + 0x18) + __n;
      if (__n == 0) goto LAB_0092468c;
      uVar3 = __n + uVar3;
      param_3 = param_3 - __n;
      param_2 = (void *)((long)param_2 + __n);
    } while (param_3 != 0);
    uVar2 = 0;
    uVar3 = uVar3 & ((long)uVar3 >> 0x3f ^ 0xffffffffffffffffU);
  }
LAB_009246b0:
  *param_4 = uVar3;
  return uVar2;
}

