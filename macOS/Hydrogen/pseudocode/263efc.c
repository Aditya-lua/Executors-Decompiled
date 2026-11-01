
void FUN_00263efc(undefined8 param_1,undefined8 param_2,undefined1 param_3,long *param_4,
                 undefined8 param_5)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  byte bVar4;
  char cVar5;
  byte bVar6;
  byte bVar7;
  byte bVar8;
  byte bVar9;
  long *plVar10;
  long lVar11;
  undefined8 *extraout_x8;
  long lVar12;
  ulong uVar13;
  ulong uVar14;
  long lVar15;
  undefined8 *puVar16;
  undefined1 auVar17 [12];
  undefined1 uStack_d1;
  undefined8 uStack_d0;
  undefined8 uStack_c8;
  undefined8 uStack_c0;
  undefined8 uStack_b8;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  undefined8 uStack_a0;
  undefined8 uStack_98;
  long lStack_90;
  ulong uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined1 *puStack_48;
  long *plStack_40;
  undefined8 *puStack_38;
  
  uStack_d1 = param_3;
  auVar17 = __Unwind_Resume();
  plVar10 = auVar17._0_8_;
  uStack_d0 = param_5;
  func_0x00264ad8(&uStack_c8,param_4);
  uVar3 = plVar10[1];
  uVar14 = plVar10[2];
  if (uVar14 < uVar3) {
    lVar12 = *plVar10;
    uVar13 = uVar14 + 1;
    plVar10[2] = uVar13;
    bVar4 = *(byte *)(lVar12 + uVar14);
    if (((bVar4 ^ 0xffffffff) & 0x1f) != 0 && uVar13 < uVar3) {
      uVar1 = uVar14 + 2;
      plVar10[2] = uVar1;
      bVar9 = *(byte *)(lVar12 + uVar13);
      uVar13 = uVar1;
      if ((char)bVar9 < '\0') {
        if (bVar9 < 0x83) {
          if (bVar9 == 0x81) {
            if (uVar1 < uVar3) {
              uVar13 = uVar14 + 3;
              plVar10[2] = uVar13;
              bVar9 = *(byte *)(lVar12 + uVar1);
              if ((char)bVar9 < '\0') goto code_r0x00263f78;
            }
          }
          else if (bVar9 == 0x82 && uVar1 < uVar3) {
            uVar2 = uVar14 + 3;
            plVar10[2] = uVar2;
            if (uVar2 < uVar3) {
              cVar5 = *(char *)(lVar12 + uVar1);
              uVar13 = uVar14 + 4;
              plVar10[2] = uVar13;
              if (cVar5 != '\0') {
                uVar14 = (ulong)CONCAT11(cVar5,*(undefined1 *)(lVar12 + uVar2));
LAB_0026412c:
                if (uVar14 < 0xffff) goto LAB_00263f7c;
              }
            }
          }
        }
        else if (bVar9 == 0x83) {
          if (uVar1 < uVar3) {
            uVar13 = uVar14 + 3;
            plVar10[2] = uVar13;
            if (uVar13 < uVar3) {
              bVar9 = *(byte *)(lVar12 + uVar1);
              uVar1 = uVar14 + 4;
              plVar10[2] = uVar1;
              if (uVar1 < uVar3) {
                bVar6 = *(byte *)(lVar12 + uVar13);
                uVar13 = uVar14 + 5;
                plVar10[2] = uVar13;
                if (bVar9 != 0) {
                  bVar8 = *(byte *)(lVar12 + uVar1);
                  uVar14 = (ulong)bVar9 << 0x10 | (ulong)bVar6 << 8;
code_r0x00264128:
                  uVar14 = uVar14 | bVar8;
                  goto LAB_0026412c;
                }
              }
            }
          }
        }
        else if (bVar9 == 0x84 && uVar1 < uVar3) {
          uVar13 = uVar14 + 3;
          plVar10[2] = uVar13;
          if (uVar13 < uVar3) {
            bVar9 = *(byte *)(lVar12 + uVar1);
            uVar1 = uVar14 + 4;
            plVar10[2] = uVar1;
            if (uVar1 < uVar3) {
              bVar6 = *(byte *)(lVar12 + uVar13);
              uVar2 = uVar14 + 5;
              plVar10[2] = uVar2;
              if (uVar2 < uVar3) {
                bVar7 = *(byte *)(lVar12 + uVar1);
                uVar13 = uVar14 + 6;
                plVar10[2] = uVar13;
                if (bVar9 != 0) {
                  bVar8 = *(byte *)(lVar12 + uVar2);
                  uVar14 = (ulong)bVar9 << 0x18 | (ulong)bVar6 << 0x10 | (ulong)bVar7 << 8;
                  goto code_r0x00264128;
                }
              }
            }
          }
        }
      }
      else {
code_r0x00263f78:
        uVar14 = (ulong)bVar9;
LAB_00263f7c:
        if (((!CARRY8(uVar13,uVar14)) && (uVar14 + uVar13 <= uVar3)) &&
           (plVar10[2] = uVar14 + uVar13, (auVar17._8_4_ & 0xff) == (uint)bVar4)) {
          lStack_90 = lVar12 + uVar13;
          uStack_78 = uStack_c0;
          uStack_80 = uStack_c8;
          uStack_68 = uStack_b0;
          uStack_70 = uStack_b8;
          uStack_58 = uStack_a0;
          uStack_60 = uStack_a8;
          puStack_48 = &uStack_d1;
          uStack_50 = uStack_98;
          puStack_38 = &uStack_d0;
          uStack_88 = uVar14;
          plStack_40 = param_4;
          func_0x0025ed04(extraout_x8,&lStack_90,&uStack_80,&puStack_48);
          lVar12 = *param_4;
          goto joined_r0x00264168;
        }
      }
    }
  }
  extraout_x8[1] = uStack_c0;
  *extraout_x8 = uStack_c8;
  extraout_x8[3] = uStack_b0;
  extraout_x8[2] = uStack_b8;
  extraout_x8[5] = uStack_a0;
  extraout_x8[4] = uStack_a8;
  extraout_x8[6] = uStack_98;
  lVar12 = *param_4;
joined_r0x00264168:
  if (-0x7fffffffffffffd5 < lVar12) {
    if ((((*(byte *)(param_4 + 3) & 1) == 0) && (lVar11 = param_4[4], lVar11 != -0x8000000000000000)
        ) && (lVar11 != 0)) {
      func_0x00187bd4(param_4[5],lVar11,1);
    }
    lVar11 = param_4[1];
    lVar15 = param_4[2];
    if (lVar15 != 0) {
      puVar16 = (undefined8 *)(lVar11 + 8);
      do {
        if (puVar16[-1] != 0) {
          func_0x00187bd4(*puVar16,puVar16[-1],1);
        }
        puVar16 = puVar16 + 3;
        lVar15 = lVar15 + -1;
      } while (lVar15 != 0);
    }
    if (lVar12 != 0) {
      func_0x00187bd4(lVar11,lVar12 * 0x18,8);
    }
  }
  return;
}

