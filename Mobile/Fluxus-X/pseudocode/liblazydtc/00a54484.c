/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a54484
 */

undefined8
FUN_00a54484(int param_1,undefined8 *param_2,undefined4 *param_3,undefined8 *param_4,long *param_5,
            undefined4 *param_6)

{
  long lVar1;
  undefined4 *puVar2;
  bool bVar3;
  long lVar4;
  undefined8 uVar5;
  long lVar6;
  long lVar7;
  undefined1 *puVar8;
  undefined8 *puVar9;
  uint uVar10;
  undefined4 uVar11;
  undefined1 *puVar12;
  uint uVar13;
  
  lVar4 = ossl_err_get_state_int();
  if (lVar4 != 0) {
    uVar10 = *(uint *)(lVar4 + 900);
    uVar13 = *(uint *)(lVar4 + 0x380);
    if (uVar10 != uVar13) {
      do {
        lVar7 = (long)(int)uVar13;
        if ((*(byte *)(lVar4 + (-(ulong)(uVar13 >> 0x1f) & 0xfffffffc00000000 | (ulong)uVar13 << 2))
             >> 1 & 1) == 0) {
          uVar13 = uVar10 + 0x10;
          if (-1 < (int)(uVar10 + 1)) {
            uVar13 = uVar10 + 1;
          }
          uVar13 = (uVar10 + 1) - (uVar13 & 0xfffffff0);
          lVar6 = (long)(int)uVar13;
          if ((*(byte *)(lVar4 + (-(ulong)(uVar13 >> 0x1f) & 0xfffffffc00000000 | (ulong)uVar13 << 2
                                 )) >> 1 & 1) == 0) {
            if (param_1 == 2) {
              uVar5 = *(undefined8 *)(lVar4 + lVar7 * 8 + 0x80);
              bVar3 = false;
            }
            else {
              puVar9 = (undefined8 *)(lVar4 + lVar6 * 8 + 0x80);
              uVar5 = *puVar9;
              lVar7 = lVar6;
              if (param_1 == 0) {
                *(uint *)(lVar4 + 900) = uVar13;
                bVar3 = true;
                *puVar9 = 0;
              }
              else {
                bVar3 = false;
              }
            }
            if (param_2 != (undefined8 *)0x0) {
              puVar8 = *(undefined1 **)(lVar4 + lVar7 * 8 + 0x240);
              puVar12 = &DAT_002ab32c;
              if (puVar8 != (undefined1 *)0x0) {
                puVar12 = puVar8;
              }
              *param_2 = puVar12;
            }
            if (param_3 != (undefined4 *)0x0) {
              *param_3 = *(undefined4 *)(lVar4 + lVar7 * 4 + 0x2c0);
            }
            if (param_4 != (undefined8 *)0x0) {
              puVar8 = *(undefined1 **)(lVar4 + lVar7 * 8 + 0x300);
              puVar12 = &DAT_002ab32c;
              if (puVar8 != (undefined1 *)0x0) {
                puVar12 = puVar8;
              }
              *param_4 = puVar12;
            }
            if (param_6 != (undefined4 *)0x0) {
              *param_6 = *(undefined4 *)(lVar4 + lVar7 * 4 + 0x200);
            }
            if (param_5 == (long *)0x0) {
              if (!bVar3) {
                return uVar5;
              }
              lVar6 = lVar4 + lVar7 * 4;
              lVar4 = lVar4 + lVar7 * 8;
              puVar2 = (undefined4 *)(lVar6 + 0x200);
              puVar9 = (undefined8 *)(lVar4 + 0x100);
              if ((*(byte *)(lVar6 + 0x200) & 1) == 0) {
                *puVar9 = 0;
                *(undefined8 *)(lVar4 + 0x180) = 0;
                *puVar2 = 0;
                return uVar5;
              }
              puVar12 = (undefined1 *)*puVar9;
              if (puVar12 == (undefined1 *)0x0) {
                return uVar5;
              }
              *puVar12 = 0;
              *puVar2 = 1;
              return uVar5;
            }
            lVar4 = *(long *)(lVar4 + lVar7 * 8 + 0x100);
            *param_5 = lVar4;
            if (lVar4 != 0) {
              return uVar5;
            }
            *param_5 = (long)&DAT_002ab32c;
            if (param_6 == (undefined4 *)0x0) {
              return uVar5;
            }
            *param_6 = 0;
            return uVar5;
          }
          *(uint *)(lVar4 + 900) = uVar13;
          lVar7 = lVar4 + lVar6 * 4;
          lVar1 = lVar4 + lVar6 * 8;
          puVar9 = (undefined8 *)(lVar1 + 0x100);
          if ((*(byte *)(lVar7 + 0x200) & 1) == 0) {
            uVar11 = 0;
            *puVar9 = 0;
            *(undefined8 *)(lVar1 + 0x180) = 0;
LAB_00a545f4:
            *(undefined4 *)(lVar7 + 0x200) = uVar11;
          }
          else {
            puVar12 = (undefined1 *)*puVar9;
            if (puVar12 != (undefined1 *)0x0) {
              *puVar12 = 0;
              uVar11 = 1;
              goto LAB_00a545f4;
            }
          }
          puVar2 = (undefined4 *)(lVar4 + lVar6 * 4);
          lVar7 = lVar4 + lVar6 * 8;
          puVar2[0x10] = 0;
          *puVar2 = 0;
          *(undefined8 *)(lVar7 + 0x80) = 0;
          puVar2[0xb0] = 0xffffffff;
          CRYPTO_free(*(void **)(lVar7 + 0x240));
          *(undefined8 *)(lVar7 + 0x240) = 0;
          CRYPTO_free(*(void **)(lVar7 + 0x300));
          *(undefined8 *)(lVar7 + 0x300) = 0;
          uVar13 = *(uint *)(lVar4 + 0x380);
        }
        else {
          lVar6 = lVar4 + lVar7 * 4;
          lVar1 = lVar4 + lVar7 * 8;
          puVar9 = (undefined8 *)(lVar1 + 0x100);
          if ((*(byte *)(lVar6 + 0x200) & 1) == 0) {
            uVar11 = 0;
            *puVar9 = 0;
            *(undefined8 *)(lVar1 + 0x180) = 0;
LAB_00a54584:
            *(undefined4 *)(lVar6 + 0x200) = uVar11;
          }
          else {
            puVar12 = (undefined1 *)*puVar9;
            if (puVar12 != (undefined1 *)0x0) {
              *puVar12 = 0;
              uVar11 = 1;
              goto LAB_00a54584;
            }
          }
          puVar2 = (undefined4 *)(lVar4 + lVar7 * 4);
          lVar7 = lVar4 + lVar7 * 8;
          puVar2[0x10] = 0;
          *puVar2 = 0;
          *(undefined8 *)(lVar7 + 0x80) = 0;
          puVar2[0xb0] = 0xffffffff;
          CRYPTO_free(*(void **)(lVar7 + 0x240));
          *(undefined8 *)(lVar7 + 0x240) = 0;
          CRYPTO_free(*(void **)(lVar7 + 0x300));
          *(undefined8 *)(lVar7 + 0x300) = 0;
          uVar13 = *(int *)(lVar4 + 0x380) - 1;
          if (*(int *)(lVar4 + 0x380) < 1) {
            uVar13 = 0xf;
          }
          *(uint *)(lVar4 + 0x380) = uVar13;
        }
        uVar10 = *(uint *)(lVar4 + 900);
      } while (uVar10 != uVar13);
    }
  }
  return 0;
}

