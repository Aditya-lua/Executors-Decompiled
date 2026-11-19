/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00861ad0
 */

undefined1  [16] FUN_00861ad0(long param_1,undefined8 *param_2)

{
  long lVar1;
  undefined8 *puVar2;
  long lVar3;
  ulong uVar4;
  long lVar5;
  undefined8 *puVar6;
  undefined8 *puVar7;
  ulong uVar8;
  ulong uVar9;
  long lVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined1 auVar14 [16];
  
  uVar9 = param_2[2];
  if (uVar9 == 0) {
    lVar3 = 0;
  }
  else {
    lVar1 = param_2[1];
    lVar10 = *(long *)*param_2;
    lVar3 = FUN_0084e938(*(undefined8 *)(param_1 + 0xe8),uVar9 << 3);
    if ((uVar9 < 8) || (lVar5 = lVar1 * 8 + lVar10, (ulong)(lVar3 - lVar5) < 0x20)) {
      uVar4 = 0;
    }
    else {
      uVar4 = uVar9 & 0xfffffffffffffffc;
      puVar6 = (undefined8 *)(lVar3 + 0x10);
      puVar7 = (undefined8 *)(lVar5 + 0x10);
      uVar8 = uVar4;
      do {
        puVar2 = puVar7 + -1;
        uVar11 = puVar7[-2];
        uVar13 = puVar7[1];
        uVar12 = *puVar7;
        uVar8 = uVar8 - 4;
        puVar7 = puVar7 + 4;
        puVar6[-1] = *puVar2;
        puVar6[-2] = uVar11;
        puVar6[1] = uVar13;
        *puVar6 = uVar12;
        puVar6 = puVar6 + 4;
      } while (uVar8 != 0);
      if (uVar9 == uVar4) goto LAB_00861b48;
    }
    lVar5 = uVar9 - uVar4;
    puVar6 = (undefined8 *)(lVar10 + uVar4 * 8 + lVar1 * 8);
    puVar7 = (undefined8 *)(lVar3 + uVar4 * 8);
    do {
      lVar5 = lVar5 + -1;
      *puVar7 = *puVar6;
      puVar6 = puVar6 + 1;
      puVar7 = puVar7 + 1;
    } while (lVar5 != 0);
  }
LAB_00861b48:
  auVar14._8_8_ = uVar9;
  auVar14._0_8_ = lVar3;
  return auVar14;
}

