/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009247a8
 */

undefined8 FUN_009247a8(long *param_1,void *param_2,size_t param_3,ulong *param_4)

{
  void *__src;
  undefined8 uVar1;
  long lVar2;
  size_t __n;
  ulong uVar3;
  long *plVar4;
  
  if (param_3 != 0) {
    uVar3 = 0;
    do {
      lVar2 = *param_1;
      if (lVar2 == 0) break;
      plVar4 = (long *)(lVar2 + 0x10);
      __n = *(long *)(lVar2 + 0x18) - *plVar4;
      if (__n != 0) {
        __src = (void *)(lVar2 + *plVar4 + 0x20);
        if (param_3 < __n) {
          memcpy(param_2,__src,param_3);
          *plVar4 = *plVar4 + param_3;
          __n = param_3;
        }
        else {
          memcpy(param_2,__src,__n);
          *plVar4 = 0;
          *(undefined8 *)(lVar2 + 0x18) = 0;
        }
        uVar3 = __n + uVar3;
        param_2 = (void *)((long)param_2 + __n);
        param_3 = param_3 - __n;
      }
      FUN_009246cc(param_1);
    } while (param_3 != 0);
    if (uVar3 != 0) {
      uVar1 = 0;
      uVar3 = uVar3 & ((long)uVar3 >> 0x3f ^ 0xffffffffffffffffU);
      goto LAB_00924860;
    }
  }
  uVar3 = 0;
  uVar1 = 0x51;
LAB_00924860:
  *param_4 = uVar3;
  return uVar1;
}

