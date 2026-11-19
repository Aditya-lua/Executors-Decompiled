/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00959a84
 */

undefined4
FUN_00959a84(undefined1 *param_1,ulong param_2,ulong param_3,ulong param_4,undefined8 param_5,
            undefined8 param_6)

{
  undefined1 uVar1;
  undefined4 uVar2;
  long lVar3;
  ulong uVar4;
  undefined1 *puVar5;
  ulong uVar6;
  undefined1 *puVar7;
  undefined8 *puVar8;
  long lVar9;
  ulong uVar10;
  undefined8 uVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  
  if ((param_2 < 0x7a1201) && (param_4 < 0x7a1201)) {
    lVar3 = (*(code *)PTR_malloc_00cc4670)((param_4 + param_2) * 2 | 1);
    if (lVar3 != 0) {
      if (param_2 != 0) {
        puVar5 = (undefined1 *)(lVar3 + 1);
        uVar4 = param_2;
        do {
          uVar1 = FUN_009416cc(*param_1);
          puVar5[-1] = uVar1;
          *puVar5 = 0;
          uVar4 = uVar4 - 1;
          param_1 = param_1 + 1;
          puVar5 = puVar5 + 2;
        } while (uVar4 != 0);
      }
      if (param_4 != 0) {
        uVar6 = 0;
        uVar4 = param_2 * 2;
        if (0x1f < param_4) {
          uVar6 = param_4 - 1;
          if (((CARRY8(uVar6 * 2,lVar3 + uVar4)) || (CARRY8(uVar6,uVar6))) ||
             (CARRY8(uVar6 * 2,lVar3 + (uVar4 | 1)))) {
            uVar6 = 0;
          }
          else if ((param_3 + param_4 <= lVar3 + uVar4) ||
                  (uVar6 = 0, lVar3 + uVar4 + param_4 * 2 <= param_3)) {
            uVar6 = param_4 & 0xffffffffffffffe0;
            puVar8 = (undefined8 *)(param_3 + 0x10);
            puVar5 = (undefined1 *)(lVar3 + uVar4 + 0x20);
            uVar10 = uVar6;
            do {
              uVar12 = puVar8[-1];
              uVar11 = puVar8[-2];
              uVar14 = puVar8[1];
              uVar13 = *puVar8;
              uVar10 = uVar10 - 0x20;
              puVar8 = puVar8 + 4;
              puVar5[-0x20] = (char)uVar11;
              puVar5[-0x1f] = 0;
              puVar5[-0x1e] = (char)((ulong)uVar11 >> 8);
              puVar5[-0x1d] = 0;
              puVar5[-0x1c] = (char)((ulong)uVar11 >> 0x10);
              puVar5[-0x1b] = 0;
              puVar5[-0x1a] = (char)((ulong)uVar11 >> 0x18);
              puVar5[-0x19] = 0;
              puVar5[-0x18] = (char)((ulong)uVar11 >> 0x20);
              puVar5[-0x17] = 0;
              puVar5[-0x16] = (char)((ulong)uVar11 >> 0x28);
              puVar5[-0x15] = 0;
              puVar5[-0x14] = (char)((ulong)uVar11 >> 0x30);
              puVar5[-0x13] = 0;
              puVar5[-0x12] = (char)((ulong)uVar11 >> 0x38);
              puVar5[-0x11] = 0;
              puVar5[-0x10] = (char)uVar12;
              puVar5[-0xf] = 0;
              puVar5[-0xe] = (char)((ulong)uVar12 >> 8);
              puVar5[-0xd] = 0;
              puVar5[-0xc] = (char)((ulong)uVar12 >> 0x10);
              puVar5[-0xb] = 0;
              puVar5[-10] = (char)((ulong)uVar12 >> 0x18);
              puVar5[-9] = 0;
              puVar5[-8] = (char)((ulong)uVar12 >> 0x20);
              puVar5[-7] = 0;
              puVar5[-6] = (char)((ulong)uVar12 >> 0x28);
              puVar5[-5] = 0;
              puVar5[-4] = (char)((ulong)uVar12 >> 0x30);
              puVar5[-3] = 0;
              puVar5[-2] = (char)((ulong)uVar12 >> 0x38);
              puVar5[-1] = 0;
              *puVar5 = (char)uVar13;
              puVar5[1] = 0;
              puVar5[2] = (char)((ulong)uVar13 >> 8);
              puVar5[3] = 0;
              puVar5[4] = (char)((ulong)uVar13 >> 0x10);
              puVar5[5] = 0;
              puVar5[6] = (char)((ulong)uVar13 >> 0x18);
              puVar5[7] = 0;
              puVar5[8] = (char)((ulong)uVar13 >> 0x20);
              puVar5[9] = 0;
              puVar5[10] = (char)((ulong)uVar13 >> 0x28);
              puVar5[0xb] = 0;
              puVar5[0xc] = (char)((ulong)uVar13 >> 0x30);
              puVar5[0xd] = 0;
              puVar5[0xe] = (char)((ulong)uVar13 >> 0x38);
              puVar5[0xf] = 0;
              puVar5[0x10] = (char)uVar14;
              puVar5[0x11] = 0;
              puVar5[0x12] = (char)((ulong)uVar14 >> 8);
              puVar5[0x13] = 0;
              puVar5[0x14] = (char)((ulong)uVar14 >> 0x10);
              puVar5[0x15] = 0;
              puVar5[0x16] = (char)((ulong)uVar14 >> 0x18);
              puVar5[0x17] = 0;
              puVar5[0x18] = (char)((ulong)uVar14 >> 0x20);
              puVar5[0x19] = 0;
              puVar5[0x1a] = (char)((ulong)uVar14 >> 0x28);
              puVar5[0x1b] = 0;
              puVar5[0x1c] = (char)((ulong)uVar14 >> 0x30);
              puVar5[0x1d] = 0;
              puVar5[0x1e] = (char)((ulong)uVar14 >> 0x38);
              puVar5[0x1f] = 0;
              puVar5 = puVar5 + 0x40;
            } while (uVar10 != 0);
            if (uVar6 == param_4) goto LAB_00959c0c;
          }
        }
        lVar9 = param_4 - uVar6;
        puVar5 = (undefined1 *)(lVar3 + uVar4 + uVar6 * 2 + 1);
        puVar7 = (undefined1 *)(param_3 + uVar6);
        do {
          uVar1 = *puVar7;
          *puVar5 = 0;
          lVar9 = lVar9 + -1;
          puVar5[-1] = uVar1;
          puVar5 = puVar5 + 2;
          puVar7 = puVar7 + 1;
        } while (lVar9 != 0);
      }
LAB_00959c0c:
      uVar2 = FUN_00923334(&PTR_LAB_00c502e0,param_5,0x10,lVar3,(param_4 + param_2) * 2,param_6);
      (*(code *)PTR_free_00cc4678)(lVar3);
      return uVar2;
    }
  }
  return 0x1b;
}

