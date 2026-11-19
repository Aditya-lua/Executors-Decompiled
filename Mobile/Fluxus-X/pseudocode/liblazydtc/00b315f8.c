/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b315f8
 */

undefined8 ossl_blake2s_final(void *param_1,void *param_2)

{
  undefined8 *__src;
  undefined8 *puVar1;
  ulong uVar2;
  long lVar3;
  long lVar4;
  ulong uVar5;
  undefined4 *puVar6;
  undefined8 *puVar7;
  undefined4 *puVar8;
  undefined8 *puVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 local_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  
  uStack_58 = 0;
  local_60 = 0;
  uStack_48 = 0;
  uStack_50 = 0;
  *(undefined4 *)((long)param_2 + 0x28) = 0xffffffff;
  uVar5 = *(ulong *)((long)param_2 + 0x78) + 3;
  __src = param_1;
  if ((*(ulong *)((long)param_2 + 0x78) & 3) != 0) {
    __src = &local_60;
  }
  memset((void *)((long)param_2 + 0x30 + *(long *)((long)param_2 + 0x70)),0,
         0x40 - *(long *)((long)param_2 + 0x70));
  FUN_00b2ff90(param_2,(long)param_2 + 0x30,*(undefined8 *)((long)param_2 + 0x70));
  if (0 < (int)(uVar5 >> 2)) {
    uVar2 = uVar5 >> 2 & 0xffffffff;
    lVar4 = 0;
    if ((7 < uVar2) &&
       (((void *)((long)param_2 + uVar2 * 4) <= __src ||
        (lVar4 = 0, (void *)((long)__src + uVar2 * 4) <= param_2)))) {
      uVar5 = uVar5 >> 2 & 7;
      lVar4 = uVar2 - uVar5;
      puVar7 = (undefined8 *)((long)__src + 0x10);
      puVar9 = (undefined8 *)((long)param_2 + 0x10);
      lVar3 = lVar4;
      do {
        puVar1 = puVar9 + -1;
        uVar10 = puVar9[-2];
        uVar12 = puVar9[1];
        uVar11 = *puVar9;
        lVar3 = lVar3 + -8;
        puVar9 = puVar9 + 4;
        puVar7[-1] = *puVar1;
        puVar7[-2] = uVar10;
        puVar7[1] = uVar12;
        *puVar7 = uVar11;
        puVar7 = puVar7 + 4;
      } while (lVar3 != 0);
      if (uVar5 == 0) goto LAB_00b316f0;
    }
    lVar3 = uVar2 - lVar4;
    puVar6 = (undefined4 *)((long)__src + lVar4 * 4);
    puVar8 = (undefined4 *)((long)param_2 + lVar4 * 4);
    do {
      lVar3 = lVar3 + -1;
      *puVar6 = *puVar8;
      puVar6 = puVar6 + 1;
      puVar8 = puVar8 + 1;
    } while (lVar3 != 0);
  }
LAB_00b316f0:
  if (__src != param_1) {
    memcpy(param_1,__src,*(size_t *)((long)param_2 + 0x78));
    OPENSSL_cleanse(__src,0x20);
  }
  OPENSSL_cleanse(param_2,0x80);
  return 1;
}

