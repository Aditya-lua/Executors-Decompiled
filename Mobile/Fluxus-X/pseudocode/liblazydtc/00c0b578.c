/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c0b578
 */

void FUN_00c0b578(undefined8 *param_1,void *param_2,long param_3,ulong param_4)

{
  ulong uVar1;
  size_t __n;
  undefined8 *puVar2;
  undefined8 *puVar3;
  ulong uVar4;
  long lVar5;
  ulong uVar6;
  ulong uVar7;
  void *__src;
  size_t sVar8;
  void *pvVar9;
  undefined8 *puVar10;
  void *__dest;
  undefined1 auVar11 [16];
  
  uVar6 = param_1[2];
  puVar10 = (undefined8 *)*param_1;
  if (param_4 <= (ulong)((long)(uVar6 - (long)puVar10) >> 3)) {
    puVar2 = (undefined8 *)param_1[1];
    sVar8 = (long)puVar2 - (long)puVar10;
    if ((ulong)((long)sVar8 >> 3) < param_4) {
      if (puVar2 != puVar10) {
        memmove(puVar10,param_2,sVar8);
        puVar2 = (undefined8 *)param_1[1];
      }
      __n = param_3 - (long)((long)param_2 + sVar8);
      if (__n != 0) {
        memmove(puVar2,(void *)((long)param_2 + sVar8),__n);
      }
      lVar5 = (long)puVar2 + __n;
      goto LAB_00c0b6c4;
    }
joined_r0x00c0b62c:
    sVar8 = param_3 - (long)param_2;
    if (sVar8 != 0) {
      memmove(puVar10,param_2,sVar8);
    }
    lVar5 = (long)puVar10 + sVar8;
LAB_00c0b6c4:
    param_1[1] = lVar5;
    return;
  }
  if (puVar10 != (undefined8 *)0x0) {
    param_1[1] = puVar10;
    if (puVar10 == param_1 + 3) {
      *(undefined1 *)(param_1 + 0x21) = 0;
    }
    else {
      operator_delete(puVar10,uVar6 - (long)puVar10);
    }
    uVar6 = 0;
    *param_1 = 0;
    param_1[1] = 0;
    param_1[2] = 0;
  }
  if (param_4 >> 0x3d == 0) {
    uVar1 = (long)uVar6 >> 2;
    if ((ulong)((long)uVar6 >> 2) <= param_4) {
      uVar1 = param_4;
    }
    if (0x7ffffffffffffff7 < uVar6) {
      uVar1 = 0x1fffffffffffffff;
    }
    if (uVar1 >> 0x3d == 0) {
      if ((uVar1 < 0x1f) && ((*(byte *)(param_1 + 0x21) & 1) == 0)) {
        puVar10 = param_1 + 3;
        *(undefined1 *)(param_1 + 0x21) = 1;
      }
      else {
        puVar10 = operator_new(uVar1 << 3);
      }
      *param_1 = puVar10;
      param_1[1] = puVar10;
      param_1[2] = puVar10 + uVar1;
      goto joined_r0x00c0b62c;
    }
  }
  auVar11 = FUN_00c0b52c();
  uVar6 = auVar11._8_8_;
  puVar10 = auVar11._0_8_;
  pvVar9 = (void *)puVar10[1];
  if ((ulong)(puVar10[2] - (long)pvVar9 >> 3) < uVar6) {
    __src = (void *)*puVar10;
    sVar8 = (long)pvVar9 - (long)__src;
    uVar1 = ((long)sVar8 >> 3) + uVar6;
    if (uVar1 >> 0x3d != 0) {
      FUN_00c0b52c();
LAB_00c0b84c:
                    /* WARNING: Subroutine does not return */
      FUN_007fe1b8();
    }
    uVar4 = puVar10[2] - (long)__src;
    uVar7 = (long)uVar4 >> 2;
    if (uVar7 <= uVar1) {
      uVar7 = uVar1;
    }
    if (0x7ffffffffffffff7 < uVar4) {
      uVar7 = 0x1fffffffffffffff;
    }
    if (uVar7 == 0) {
      puVar2 = (undefined8 *)0x0;
    }
    else if ((uVar7 < 0x1f) && ((*(byte *)(puVar10 + 0x21) & 1) == 0)) {
      *(undefined1 *)(puVar10 + 0x21) = 1;
      puVar2 = puVar10 + 3;
    }
    else {
      if (uVar7 >> 0x3d != 0) goto LAB_00c0b84c;
      puVar2 = operator_new(uVar7 << 3);
    }
    pvVar9 = (void *)((long)puVar2 + sVar8);
    memset(pvVar9,0,uVar6 * 8);
    __dest = (void *)((long)pvVar9 + ((long)sVar8 >> 3) * -8);
    memcpy(__dest,__src,sVar8);
    puVar3 = (undefined8 *)*puVar10;
    lVar5 = puVar10[2];
    *puVar10 = __dest;
    puVar10[1] = (void *)((long)pvVar9 + uVar6 * 8);
    puVar10[2] = puVar2 + uVar7;
    if (puVar3 != (void *)0x0) {
      if (puVar3 != puVar10 + 3) {
        operator_delete(puVar3,lVar5 - (long)puVar3);
        return;
      }
      *(undefined1 *)(puVar10 + 0x21) = 0;
    }
  }
  else {
    if (uVar6 != 0) {
      memset(pvVar9,0,uVar6 * 8);
      pvVar9 = (void *)((long)pvVar9 + uVar6 * 8);
    }
    puVar10[1] = pvVar9;
  }
  return;
}

