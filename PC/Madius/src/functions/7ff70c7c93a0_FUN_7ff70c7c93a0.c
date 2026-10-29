/* 7ff70c7c93a0 FUN_7ff70c7c93a0 */

void FUN_7ff70c7c93a0(longlong param_1,undefined4 param_2,char param_3)

{
  int iVar1;
  longlong lVar2;
  undefined8 *puVar3;
  undefined4 uVar4;
  undefined4 uVar5;
  undefined4 uVar6;
  undefined4 uVar7;
  undefined4 uVar8;
  undefined4 uVar9;
  undefined4 uVar10;
  undefined4 uVar11;
  undefined4 uVar12;
  undefined4 uVar13;
  undefined4 uVar14;
  undefined4 uVar15;
  undefined4 uVar16;
  undefined4 uVar17;
  undefined4 uVar18;
  int iVar19;
  undefined8 *puVar20;
  undefined8 uVar21;
  char cVar22;
  longlong lVar23;
  undefined4 *puVar24;
  int iVar25;
  ulonglong uVar26;
  longlong lVar27;
  undefined4 *puVar28;
  ulonglong uVar29;
  uint uVar30;
  int iVar31;
  
  *(char *)(param_1 + 0x51) = param_3;
  if (param_3 == '\0') {
    if (*(char *)(param_1 + 0x52) == '\0') {
      FUN_7ff70c80af70(&UNK_7ff70cb8decd);
    }
  }
  else {
    *(undefined1 *)(param_1 + 0x52) = 1;
    if (*(longlong *)(param_1 + 0x2b0) == 0) {
      FUN_7ff70c7c9780(param_1);
    }
  }
  if (((*(char *)(param_1 + 0x52) == '\x01') &&
      (*(char *)(*(longlong *)(param_1 + 0x2b0) + 0xb9) == '\x01')) &&
     (*(char *)(param_1 + 0x51) != '\0')) {
    FUN_7ff70c80af70(&UNK_7ff70cb8de48);
  }
  lVar2 = *(longlong *)(param_1 + 0x2b0);
  *(undefined4 *)(lVar2 + 0xa4) = param_2;
  lVar23 = (longlong)*(int *)(param_1 + 0x68);
  if (lVar23 != 0) {
    puVar3 = *(undefined8 **)(param_1 + 0x70);
    uVar26 = lVar23 * 8 - 8;
    puVar20 = puVar3;
    if ((~(uint)uVar26 & 0x38) != 0) {
      uVar29 = (ulonglong)(((uint)(uVar26 >> 3) & 0x1fffffff) + 1 & 7);
      do {
        *(undefined8 *)*puVar20 = 0;
        puVar20 = puVar20 + 1;
        uVar29 = uVar29 - 1;
      } while (uVar29 != 0);
    }
    if (0x37 < uVar26) {
      do {
        *(undefined8 *)*puVar20 = 0;
        *(undefined8 *)puVar20[1] = 0;
        *(undefined8 *)puVar20[2] = 0;
        *(undefined8 *)puVar20[3] = 0;
        *(undefined8 *)puVar20[4] = 0;
        *(undefined8 *)puVar20[5] = 0;
        *(undefined8 *)puVar20[6] = 0;
        *(undefined8 *)puVar20[7] = 0;
        puVar20 = puVar20 + 8;
      } while (puVar20 != puVar3 + lVar23);
    }
  }
  iVar31 = *(int *)(lVar2 + 0xe8);
  if (0 < iVar31) {
    iVar19 = *(int *)(lVar2 + 0xc0);
    if (0 < iVar19) {
      iVar31 = 0;
      uVar30 = 0;
      do {
        lVar23 = *(longlong *)(*(longlong *)(lVar2 + 0xd0) + (ulonglong)(uVar30 >> 5) * 8);
        lVar27 = (ulonglong)(uVar30 & 0x1f) * 0x68;
        if ((*(byte *)(lVar23 + 0x4f + lVar27) & 4) == 0) {
          puVar24 = (undefined4 *)(lVar23 + lVar27);
          iVar1 = iVar31 + 1;
          iVar25 = iVar31 + 0x1f;
          if (-1 < iVar31) {
            iVar25 = iVar31;
          }
          puVar28 = (undefined4 *)
                    ((longlong)(iVar31 % 0x20) * 0x68 +
                    *(longlong *)(*(longlong *)(lVar2 + 0xd0) + (longlong)(iVar25 >> 5) * 8));
          iVar31 = iVar1;
          if (puVar28 != puVar24) {
            uVar21 = *(undefined8 *)(puVar24 + 0x16);
            *(undefined8 *)(puVar28 + 0x14) = *(undefined8 *)(puVar24 + 0x14);
            *(undefined8 *)(puVar28 + 0x16) = uVar21;
            *(undefined8 *)(puVar28 + 0x18) = *(undefined8 *)(puVar24 + 0x18);
            uVar21 = *(undefined8 *)(puVar24 + 0x12);
            *(undefined8 *)(puVar28 + 0x10) = *(undefined8 *)(puVar24 + 0x10);
            *(undefined8 *)(puVar28 + 0x12) = uVar21;
            uVar4 = *puVar24;
            uVar5 = puVar24[1];
            uVar6 = puVar24[2];
            uVar7 = puVar24[3];
            uVar8 = puVar24[4];
            uVar9 = puVar24[5];
            uVar10 = puVar24[6];
            uVar11 = puVar24[7];
            uVar12 = puVar24[8];
            uVar13 = puVar24[9];
            uVar14 = puVar24[10];
            uVar15 = puVar24[0xb];
            uVar16 = puVar24[0xd];
            uVar17 = puVar24[0xe];
            uVar18 = puVar24[0xf];
            puVar28[0xc] = puVar24[0xc];
            puVar28[0xd] = uVar16;
            puVar28[0xe] = uVar17;
            puVar28[0xf] = uVar18;
            puVar28[8] = uVar12;
            puVar28[9] = uVar13;
            puVar28[10] = uVar14;
            puVar28[0xb] = uVar15;
            puVar28[4] = uVar8;
            puVar28[5] = uVar9;
            puVar28[6] = uVar10;
            puVar28[7] = uVar11;
            *puVar28 = uVar4;
            puVar28[1] = uVar5;
            puVar28[2] = uVar6;
            puVar28[3] = uVar7;
            FUN_7ff70c805e60(lVar2 + 0xd8,puVar28[0x15]);
            iVar19 = *(int *)(lVar2 + 0xc0);
          }
        }
        uVar30 = uVar30 + 1;
      } while ((int)uVar30 < iVar19);
      iVar31 = *(int *)(lVar2 + 0xe8);
    }
    *(int *)(lVar2 + 0xc0) = iVar19 - iVar31;
    *(undefined4 *)(lVar2 + 0xe8) = 0;
  }
  if (0 < *(int *)(param_1 + 0x40)) {
    iVar31 = 0;
    do {
      uVar26 = (ulonglong)iVar31;
      lVar2 = *(longlong *)(*(longlong *)(param_1 + 0x48) + uVar26 * 8);
      iVar19 = *(int *)(lVar2 + 4);
      if (iVar19 == 0) {
        iVar19 = 0;
        if (*(int *)(lVar2 + 0x44) < 0) {
          uVar21 = FUN_7ff70c802100(0);
          if (*(longlong *)(lVar2 + 0x48) != 0) {
            FUN_7ff70cb12b60(uVar21,*(longlong *)(lVar2 + 0x48),
                             (longlong)*(int *)(lVar2 + 0x40) << 3);
            FUN_7ff70c802510(*(undefined8 *)(lVar2 + 0x48));
          }
          *(undefined8 *)(lVar2 + 0x48) = uVar21;
          *(undefined4 *)(lVar2 + 0x44) = 0;
          iVar19 = *(int *)(lVar2 + 4);
        }
        *(undefined4 *)(lVar2 + 0x40) = 0;
        *(undefined8 *)(lVar2 + 0x38) = 0xffffffff;
        cVar22 = *(char *)(lVar2 + 0x57);
        if (iVar19 == 1) goto LAB_7ff70c7c9643;
LAB_7ff70c7c970a:
        if (iVar19 == 4 || cVar22 != '\x01') {
          if (iVar19 == 4) goto LAB_7ff70c7c9729;
        }
        else {
          *(undefined4 *)(lVar2 + 4) = 4;
LAB_7ff70c7c9729:
          *(int *)(lVar2 + 0x50) = *(int *)(lVar2 + 0x50) + 1;
          if ((*(longlong *)(lVar2 + 0x10) == 0) && (*(longlong *)(lVar2 + 8) == 0))
          goto LAB_7ff70c7c9647;
        }
      }
      else {
        cVar22 = *(char *)(lVar2 + 0x57);
        if (iVar19 != 1) goto LAB_7ff70c7c970a;
LAB_7ff70c7c9643:
        if (cVar22 == '\0') {
          *(undefined4 *)(lVar2 + 4) = 2;
          goto LAB_7ff70c7c9617;
        }
LAB_7ff70c7c9647:
        if (*(longlong *)(lVar2 + 0x28) != 0) {
          FUN_7ff70c802510();
        }
        *(undefined8 *)(lVar2 + 0x28) = 0;
        *(undefined1 *)(lVar2 + 0x56) = 0;
        if (*(longlong *)(lVar2 + 0x48) != 0) {
          FUN_7ff70c802510();
        }
        FUN_7ff70c802510(lVar2);
        FUN_7ff70cb12b70(*(longlong *)(param_1 + 0x48) + uVar26 * 8,
                         *(longlong *)(param_1 + 0x48) + uVar26 * 8 + 8,
                         (~uVar26 + (longlong)*(int *)(param_1 + 0x40)) * 8);
        *(int *)(param_1 + 0x40) = *(int *)(param_1 + 0x40) + -1;
        iVar31 = iVar31 + -1;
      }
LAB_7ff70c7c9617:
      iVar31 = iVar31 + 1;
    } while (iVar31 < *(int *)(param_1 + 0x40));
  }
  return;
}


