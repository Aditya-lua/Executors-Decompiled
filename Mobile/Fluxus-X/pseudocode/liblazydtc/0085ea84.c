/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0085ea84
 */

undefined1  [16] FUN_0085ea84(long param_1,long param_2,ulong param_3)

{
  undefined8 *puVar1;
  long lVar2;
  ulong uVar3;
  long lVar4;
  undefined8 *puVar5;
  undefined8 *puVar6;
  ulong uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined1 auVar11 [16];
  
  if (param_3 == 0) {
    lVar2 = 0;
  }
  else {
    lVar2 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),param_3 << 3);
    uVar3 = 0;
    if ((3 < param_3) && (0x1f < (ulong)(lVar2 - param_2))) {
      uVar3 = param_3 & 0xfffffffffffffffc;
      puVar5 = (undefined8 *)(lVar2 + 0x10);
      puVar6 = (undefined8 *)(param_2 + 0x10);
      uVar7 = uVar3;
      do {
        puVar1 = puVar6 + -1;
        uVar8 = puVar6[-2];
        uVar10 = puVar6[1];
        uVar9 = *puVar6;
        uVar7 = uVar7 - 4;
        puVar6 = puVar6 + 4;
        puVar5[-1] = *puVar1;
        puVar5[-2] = uVar8;
        puVar5[1] = uVar10;
        *puVar5 = uVar9;
        puVar5 = puVar5 + 4;
      } while (uVar7 != 0);
      if (param_3 == uVar3) goto LAB_0085eb18;
    }
    lVar4 = param_3 - uVar3;
    puVar5 = (undefined8 *)(param_2 + uVar3 * 8);
    puVar6 = (undefined8 *)(lVar2 + uVar3 * 8);
    do {
      lVar4 = lVar4 + -1;
      *puVar6 = *puVar5;
      puVar5 = puVar5 + 1;
      puVar6 = puVar6 + 1;
    } while (lVar4 != 0);
  }
LAB_0085eb18:
  auVar11._8_8_ = param_3;
  auVar11._0_8_ = lVar2;
  return auVar11;
}

