/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0b6e4
 */

void FUN_00c0b6e4(undefined8 *param_1,ulong param_2)

{
  ulong uVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  ulong uVar4;
  long lVar5;
  ulong uVar6;
  void *__src;
  size_t __n;
  void *pvVar7;
  void *__dest;
  
  pvVar7 = (void *)param_1[1];
  if ((ulong)(param_1[2] - (long)pvVar7 >> 3) < param_2) {
    __src = (void *)*param_1;
    __n = (long)pvVar7 - (long)__src;
    uVar1 = ((long)__n >> 3) + param_2;
    if (uVar1 >> 0x3d != 0) {
      FUN_00c0b52c();
LAB_00c0b84c:
                    /* WARNING: Subroutine does not return */
      FUN_007fe1b8();
    }
    uVar4 = param_1[2] - (long)__src;
    uVar6 = (long)uVar4 >> 2;
    if (uVar6 <= uVar1) {
      uVar6 = uVar1;
    }
    if (0x7ffffffffffffff7 < uVar4) {
      uVar6 = 0x1fffffffffffffff;
    }
    if (uVar6 == 0) {
      puVar2 = (undefined8 *)0x0;
    }
    else if ((uVar6 < 0x1f) && ((*(byte *)(param_1 + 0x21) & 1) == 0)) {
      *(undefined1 *)(param_1 + 0x21) = 1;
      puVar2 = param_1 + 3;
    }
    else {
      if (uVar6 >> 0x3d != 0) goto LAB_00c0b84c;
      puVar2 = operator_new(uVar6 << 3);
    }
    pvVar7 = (void *)((long)puVar2 + __n);
    memset(pvVar7,0,param_2 * 8);
    __dest = (void *)((long)pvVar7 + ((long)__n >> 3) * -8);
    memcpy(__dest,__src,__n);
    puVar3 = (undefined8 *)*param_1;
    lVar5 = param_1[2];
    *param_1 = __dest;
    param_1[1] = (void *)((long)pvVar7 + param_2 * 8);
    param_1[2] = puVar2 + uVar6;
    if (puVar3 != (void *)0x0) {
      if (puVar3 != param_1 + 3) {
        operator_delete(puVar3,lVar5 - (long)puVar3);
        return;
      }
      *(undefined1 *)(param_1 + 0x21) = 0;
    }
  }
  else {
    if (param_2 != 0) {
      memset(pvVar7,0,param_2 * 8);
      pvVar7 = (void *)((long)pvVar7 + param_2 * 8);
    }
    param_1[1] = pvVar7;
  }
  return;
}

