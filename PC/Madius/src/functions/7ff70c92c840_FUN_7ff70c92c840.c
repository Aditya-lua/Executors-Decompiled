/* 7ff70c92c840 FUN_7ff70c92c840 */

undefined8 *
FUN_7ff70c92c840(undefined8 *param_1,longlong param_2,undefined8 *param_3,byte *param_4,
                byte *param_5)

{
  undefined1 uVar1;
  byte bVar2;
  undefined1 *puVar3;
  longlong lVar4;
  bool bVar5;
  byte bVar6;
  uint uVar7;
  ulonglong uVar8;
  ulonglong uVar9;
  undefined8 *puVar10;
  undefined1 *puVar11;
  byte *pbVar12;
  
joined_r0x7ff70c92c861:
  do {
    if (param_4 == param_5) {
      *param_1 = param_3;
      return param_1;
    }
    bVar6 = *param_4;
    pbVar12 = param_4 + 1;
    if (bVar6 == 0x24) {
      if (pbVar12 == param_5) {
        uVar8 = param_3[2];
        if (uVar8 < (ulonglong)param_3[3]) {
          param_3[2] = uVar8 + 1;
          puVar10 = param_3;
          if (0xf < (ulonglong)param_3[3]) {
            puVar10 = (undefined8 *)*param_3;
          }
          *(undefined2 *)((longlong)puVar10 + uVar8) = 0x24;
          param_4 = pbVar12;
        }
        else {
LAB_7ff70c92ca65:
          FUN_7ff70ca31d10(param_3,1);
          param_4 = pbVar12;
        }
        goto joined_r0x7ff70c92c861;
      }
      bVar6 = *pbVar12;
      if (bVar6 < 0x27) {
        if (bVar6 == 0x24) {
          uVar8 = param_3[2];
          if (uVar8 < (ulonglong)param_3[3]) {
            param_3[2] = uVar8 + 1;
            puVar10 = param_3;
            if (0xf < (ulonglong)param_3[3]) {
              puVar10 = (undefined8 *)*param_3;
            }
            *(undefined2 *)((longlong)puVar10 + uVar8) = 0x24;
          }
          else {
            FUN_7ff70ca31d10(param_3,1);
          }
        }
        else if (bVar6 == 0x26) {
          puVar10 = *(undefined8 **)(param_2 + 0x10);
          if (*(undefined8 **)(param_2 + 0x18) != puVar10) {
            puVar3 = (undefined1 *)puVar10[1];
            for (puVar11 = (undefined1 *)*puVar10; puVar11 != puVar3; puVar11 = puVar11 + 1) {
              while( true ) {
                uVar1 = *puVar11;
                uVar8 = param_3[2];
                if ((ulonglong)param_3[3] <= uVar8) break;
                param_3[2] = uVar8 + 1;
                puVar10 = param_3;
                if (0xf < (ulonglong)param_3[3]) {
                  puVar10 = (undefined8 *)*param_3;
                }
                *(undefined1 *)((longlong)puVar10 + uVar8) = uVar1;
                *(undefined1 *)((longlong)puVar10 + uVar8 + 1) = 0;
                puVar11 = puVar11 + 1;
                if (puVar11 == puVar3) goto LAB_7ff70c92cbda;
              }
              FUN_7ff70ca31d10(param_3,1);
            }
          }
        }
        else {
LAB_7ff70c92ca6f:
          bVar6 = bVar6 - 0x30;
          if (bVar6 < 10) {
            pbVar12 = param_4 + 2;
            uVar7 = (uint)bVar6;
            if ((pbVar12 == param_5) || (bVar2 = *pbVar12, 9 < (byte)(bVar2 - 0x30))) {
              bVar5 = false;
              if (bVar6 != 0) goto LAB_7ff70c92cbec;
            }
            else {
              pbVar12 = param_4 + 3;
              uVar7 = ((uint)bVar2 + ((uint)bVar6 + (uint)bVar6 * 4) * 2) - 0x30;
              bVar5 = true;
              if (uVar7 != 0) {
LAB_7ff70c92cbec:
                uVar8 = (ulonglong)uVar7;
                lVar4 = *(longlong *)(param_2 + 0x10);
                uVar9 = (*(longlong *)(param_2 + 0x18) - lVar4 >> 3) * -0x5555555555555555;
                param_4 = pbVar12;
                if (uVar8 <= uVar9 && uVar9 - uVar8 != 0) {
                  puVar3 = *(undefined1 **)(lVar4 + 8 + uVar8 * 0x18);
                  for (puVar11 = *(undefined1 **)(lVar4 + uVar8 * 0x18); puVar11 != puVar3;
                      puVar11 = puVar11 + 1) {
                    while( true ) {
                      uVar1 = *puVar11;
                      uVar8 = param_3[2];
                      if ((ulonglong)param_3[3] <= uVar8) break;
                      param_3[2] = uVar8 + 1;
                      puVar10 = param_3;
                      if (0xf < (ulonglong)param_3[3]) {
                        puVar10 = (undefined8 *)*param_3;
                      }
                      *(undefined1 *)((longlong)puVar10 + uVar8) = uVar1;
                      *(undefined1 *)((longlong)puVar10 + uVar8 + 1) = 0;
                      puVar11 = puVar11 + 1;
                      if (puVar11 == puVar3) goto joined_r0x7ff70c92c861;
                    }
                    FUN_7ff70ca31d10(param_3,1);
                  }
                }
                goto joined_r0x7ff70c92c861;
              }
            }
            uVar8 = param_3[2];
            if (uVar8 < (ulonglong)param_3[3]) {
              param_3[2] = uVar8 + 1;
              puVar10 = param_3;
              if (0xf < (ulonglong)param_3[3]) {
                puVar10 = (undefined8 *)*param_3;
              }
              *(undefined2 *)((longlong)puVar10 + uVar8) = 0x24;
              uVar8 = param_3[2];
              uVar9 = param_3[3];
              if (uVar8 < uVar9) goto LAB_7ff70c92cd05;
LAB_7ff70c92caf1:
              FUN_7ff70ca31d10(param_3,1);
            }
            else {
              FUN_7ff70ca31d10(param_3,1);
              uVar8 = param_3[2];
              uVar9 = param_3[3];
              if (uVar9 <= uVar8) goto LAB_7ff70c92caf1;
LAB_7ff70c92cd05:
              param_3[2] = uVar8 + 1;
              puVar10 = param_3;
              if (0xf < uVar9) {
                puVar10 = (undefined8 *)*param_3;
              }
              *(undefined2 *)((longlong)puVar10 + uVar8) = 0x30;
            }
            param_4 = pbVar12;
            if (bVar5) {
              uVar8 = param_3[2];
              if ((ulonglong)param_3[3] <= uVar8) goto LAB_7ff70c92ca65;
              param_3[2] = uVar8 + 1;
              puVar10 = param_3;
              if (0xf < (ulonglong)param_3[3]) {
                puVar10 = (undefined8 *)*param_3;
              }
              *(undefined2 *)((longlong)puVar10 + uVar8) = 0x30;
            }
            goto joined_r0x7ff70c92c861;
          }
          uVar8 = param_3[2];
          if (uVar8 < (ulonglong)param_3[3]) {
            param_3[2] = uVar8 + 1;
            puVar10 = param_3;
            if (0xf < (ulonglong)param_3[3]) {
              puVar10 = (undefined8 *)*param_3;
            }
            *(undefined2 *)((longlong)puVar10 + uVar8) = 0x24;
          }
          else {
            FUN_7ff70ca31d10(param_3,1);
          }
          bVar6 = param_4[1];
          uVar8 = param_3[2];
          if (uVar8 < (ulonglong)param_3[3]) {
            param_3[2] = uVar8 + 1;
            puVar10 = param_3;
            if (0xf < (ulonglong)param_3[3]) {
              puVar10 = (undefined8 *)*param_3;
            }
            *(byte *)((longlong)puVar10 + uVar8) = bVar6;
            *(undefined1 *)((longlong)puVar10 + uVar8 + 1) = 0;
          }
          else {
            FUN_7ff70ca31d10(param_3,1);
          }
        }
      }
      else if (bVar6 == 0x27) {
        puVar3 = *(undefined1 **)(param_2 + 0x48);
        for (puVar11 = *(undefined1 **)(param_2 + 0x40); puVar11 != puVar3; puVar11 = puVar11 + 1) {
          uVar1 = *puVar11;
          uVar8 = param_3[2];
          if (uVar8 < (ulonglong)param_3[3]) {
            param_3[2] = uVar8 + 1;
            puVar10 = param_3;
            if (0xf < (ulonglong)param_3[3]) {
              puVar10 = (undefined8 *)*param_3;
            }
            *(undefined1 *)((longlong)puVar10 + uVar8) = uVar1;
            *(undefined1 *)((longlong)puVar10 + uVar8 + 1) = 0;
          }
          else {
            FUN_7ff70ca31d10(param_3,1);
          }
        }
      }
      else {
        if (bVar6 != 0x60) goto LAB_7ff70c92ca6f;
        puVar3 = *(undefined1 **)(param_2 + 0x30);
        for (puVar11 = *(undefined1 **)(param_2 + 0x28); puVar11 != puVar3; puVar11 = puVar11 + 1) {
          while( true ) {
            uVar1 = *puVar11;
            uVar8 = param_3[2];
            if ((ulonglong)param_3[3] <= uVar8) break;
            param_3[2] = uVar8 + 1;
            puVar10 = param_3;
            if (0xf < (ulonglong)param_3[3]) {
              puVar10 = (undefined8 *)*param_3;
            }
            *(undefined1 *)((longlong)puVar10 + uVar8) = uVar1;
            *(undefined1 *)((longlong)puVar10 + uVar8 + 1) = 0;
            puVar11 = puVar11 + 1;
            if (puVar11 == puVar3) goto LAB_7ff70c92cbda;
          }
          FUN_7ff70ca31d10(param_3,1);
        }
      }
LAB_7ff70c92cbda:
      param_4 = param_4 + 2;
      goto joined_r0x7ff70c92c861;
    }
    uVar8 = param_3[2];
    if ((ulonglong)param_3[3] <= uVar8) goto LAB_7ff70c92ca65;
    param_3[2] = uVar8 + 1;
    puVar10 = param_3;
    if (0xf < (ulonglong)param_3[3]) {
      puVar10 = (undefined8 *)*param_3;
    }
    *(byte *)((longlong)puVar10 + uVar8) = bVar6;
    *(undefined1 *)((longlong)puVar10 + uVar8 + 1) = 0;
    param_4 = pbVar12;
  } while( true );
}


