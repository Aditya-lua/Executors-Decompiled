/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae8f10
 */

undefined8 OPENSSL_sk_delete(uint *param_1,uint param_2)

{
  undefined8 *__dest;
  uint uVar1;
  undefined8 uVar2;
  
  uVar2 = 0;
  if ((param_1 != (uint *)0x0) && (-1 < (int)param_2)) {
    uVar1 = *param_1;
    uVar2 = 0;
    if ((int)param_2 < (int)uVar1) {
      __dest = (undefined8 *)(*(long *)(param_1 + 2) + (long)(int)param_2 * 8);
      uVar2 = *__dest;
      if (uVar1 - 1 != param_2) {
        memmove(__dest,(void *)(*(long *)(param_1 + 2) + (long)(int)param_2 * 8 + 8),
                -(ulong)(uVar1 + ~param_2 >> 0x1f) & 0xfffffff800000000 |
                (ulong)(uVar1 + ~param_2) << 3);
        param_2 = *param_1 - 1;
      }
      *param_1 = param_2;
    }
  }
  return uVar2;
}

