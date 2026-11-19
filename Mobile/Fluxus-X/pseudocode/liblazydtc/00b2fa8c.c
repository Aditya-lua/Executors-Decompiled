/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b2fa8c
 */

undefined8 ossl_blake2b_final(void *param_1,void *param_2)

{
  undefined8 *__src;
  undefined8 *puVar1;
  ulong uVar2;
  long lVar3;
  long lVar4;
  ulong uVar5;
  undefined8 *puVar6;
  undefined8 *puVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 local_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 local_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  
  uStack_58 = 0;
  local_60 = 0;
  uStack_48 = 0;
  uStack_50 = 0;
  uStack_78 = 0;
  local_80 = 0;
  uStack_68 = 0;
  uStack_70 = 0;
  *(undefined8 *)((long)param_2 + 0x50) = 0xffffffffffffffff;
  uVar5 = *(ulong *)((long)param_2 + 0xe8) + 7;
  __src = param_1;
  if ((*(ulong *)((long)param_2 + 0xe8) & 7) != 0) {
    __src = &local_80;
  }
  memset((void *)((long)param_2 + 0x60 + *(long *)((long)param_2 + 0xe0)),0,
         0x80 - *(long *)((long)param_2 + 0xe0));
  FUN_00b2dff0(param_2,(long)param_2 + 0x60,*(undefined8 *)((long)param_2 + 0xe0));
  if (0 < (int)(uVar5 >> 3)) {
    uVar2 = uVar5 >> 3 & 0xffffffff;
    lVar4 = 0;
    if ((3 < uVar2) &&
       (((void *)((long)param_2 + uVar2 * 8) <= __src ||
        (lVar4 = 0, (void *)((long)__src + uVar2 * 8) <= param_2)))) {
      uVar5 = uVar5 >> 3 & 3;
      lVar4 = uVar2 - uVar5;
      puVar6 = (undefined8 *)((long)__src + 0x10);
      puVar7 = (undefined8 *)((long)param_2 + 0x10);
      lVar3 = lVar4;
      do {
        puVar1 = puVar7 + -1;
        uVar8 = puVar7[-2];
        uVar10 = puVar7[1];
        uVar9 = *puVar7;
        lVar3 = lVar3 + -4;
        puVar7 = puVar7 + 4;
        puVar6[-1] = *puVar1;
        puVar6[-2] = uVar8;
        puVar6[1] = uVar10;
        *puVar6 = uVar9;
        puVar6 = puVar6 + 4;
      } while (lVar3 != 0);
      if (uVar5 == 0) goto LAB_00b2fb88;
    }
    lVar3 = uVar2 - lVar4;
    puVar6 = (undefined8 *)((long)__src + lVar4 * 8);
    puVar7 = (undefined8 *)((long)param_2 + lVar4 * 8);
    do {
      lVar3 = lVar3 + -1;
      *puVar6 = *puVar7;
      puVar6 = puVar6 + 1;
      puVar7 = puVar7 + 1;
    } while (lVar3 != 0);
  }
LAB_00b2fb88:
  if (__src != param_1) {
    memcpy(param_1,__src,*(size_t *)((long)param_2 + 0xe8));
    OPENSSL_cleanse(__src,0x40);
  }
  OPENSSL_cleanse(param_2,0xf0);
  return 1;
}

