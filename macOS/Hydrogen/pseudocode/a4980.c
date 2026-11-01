
void FUN_000a4980(ulong param_1,undefined8 param_2,undefined8 param_3,ulong param_4,ushort *param_5,
                 undefined8 param_6,byte *param_7,long param_8,undefined8 param_9,
                 undefined8 param_10,undefined8 *param_11,long param_12,long param_13,long param_14,
                 long param_15,int param_16,long param_17,byte *param_18,byte *param_19,
                 ushort *param_20,ushort *param_21,ushort *param_22,ushort *param_23,byte *param_24,
                 long param_25,long param_26)

{
  byte bVar1;
  ushort uVar2;
  int iVar3;
  byte *pbVar4;
  byte *pbVar5;
  ushort *in_x9;
  long lVar6;
  byte *pbVar7;
  byte *pbVar8;
  ushort *puVar9;
  ulong uVar10;
  ushort *puVar11;
  undefined8 *puVar12;
  byte *pbVar13;
  undefined8 *puVar14;
  byte *pbVar15;
  ushort *in_x14;
  ushort *puVar16;
  byte *pbVar17;
  byte *in_x15;
  byte *pbVar18;
  byte *in_x17;
  uint uVar19;
  ulong uVar20;
  byte *pbVar21;
  byte *pbVar22;
  byte *unaff_x23;
  byte *unaff_x25;
  ulong uVar23;
  long unaff_x29;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  undefined8 uVar27;
  undefined8 uVar28;
  undefined8 uVar29;
  undefined8 uVar30;
  
code_r0x000a4980:
  puVar9 = (ushort *)((long)in_x9 + param_4);
  pbVar4 = unaff_x25 + param_4;
  puVar16 = puVar9 + 1;
  uVar20 = (ulong)*puVar9;
  pbVar21 = pbVar4 + -uVar20;
  param_1 = param_1 & 0xf;
  if (param_1 == 0xf) goto LAB_000a4930;
code_r0x000a49a4:
  param_1 = param_1 + 4;
  if (pbVar4 + param_1 < in_x15) {
    if (unaff_x23 <= pbVar21 && 7 < (uint)uVar20) {
      *(undefined8 *)pbVar4 = *(undefined8 *)pbVar21;
      *(undefined8 *)(pbVar4 + 8) = *(undefined8 *)(pbVar21 + 8);
      *(undefined2 *)(pbVar4 + 0x10) = *(undefined2 *)(pbVar21 + 0x10);
      unaff_x25 = pbVar4 + param_1;
      goto LAB_000a4888;
    }
    do {
      if ((param_8 == 0) && (pbVar21 + *(long *)(unaff_x29 + -0x60) < unaff_x23)) goto LAB_000a52c8;
      pbVar22 = pbVar4 + param_1;
      unaff_x25 = pbVar22;
      if (pbVar21 < unaff_x23) {
        if (param_18 < pbVar22) goto LAB_000a52c8;
        uVar23 = (long)unaff_x23 - (long)pbVar21;
        if (uVar23 < param_1) {
          _memcpy(pbVar4,param_25 - uVar23,uVar23);
          unaff_x25 = pbVar4 + uVar23;
          if ((ulong)((long)unaff_x25 - (long)unaff_x23) < param_1 - uVar23) {
            param_5 = *(ushort **)(unaff_x29 + -0x70);
            in_x17 = *(byte **)(unaff_x29 + -0x68);
            param_7 = *(byte **)(unaff_x29 + -0x78);
            param_8 = param_26;
            in_x14 = param_20;
            in_x15 = param_19;
            if ((long)uVar23 < (long)param_1) {
              pbVar21 = (byte *)(param_12 + uVar20);
              if ((byte *)(param_12 + uVar20) <= pbVar4 + param_1) {
                pbVar21 = pbVar4 + param_1;
              }
              pbVar21 = pbVar21 + (param_15 - (param_17 + uVar20));
              pbVar4 = unaff_x23;
              if (((byte *)0x3f < pbVar21) && (0x3f < (ulong)((long)unaff_x25 - (long)unaff_x23))) {
                pbVar8 = (byte *)((ulong)pbVar21 & 0xffffffffffffffc0);
                unaff_x25 = unaff_x25 + (long)pbVar8;
                pbVar4 = unaff_x23 + (long)pbVar8;
                puVar12 = (undefined8 *)((long)param_11 + uVar20);
                puVar14 = param_11;
                pbVar5 = pbVar8;
                do {
                  uVar24 = puVar14[-4];
                  uVar26 = puVar14[-1];
                  uVar25 = puVar14[-2];
                  uVar28 = puVar14[1];
                  uVar27 = *puVar14;
                  uVar30 = puVar14[3];
                  uVar29 = puVar14[2];
                  puVar12[-3] = puVar14[-3];
                  puVar12[-4] = uVar24;
                  puVar12[-1] = uVar26;
                  puVar12[-2] = uVar25;
                  puVar12[1] = uVar28;
                  *puVar12 = uVar27;
                  puVar12[3] = uVar30;
                  puVar12[2] = uVar29;
                  pbVar5 = pbVar5 + -0x40;
                  puVar12 = puVar12 + 8;
                  puVar14 = puVar14 + 8;
                } while (pbVar5 != (byte *)0x0);
                if (pbVar21 == pbVar8) goto LAB_000a4888;
              }
              pbVar21 = unaff_x25;
              do {
                unaff_x25 = pbVar21 + 1;
                *pbVar21 = *pbVar4;
                pbVar4 = pbVar4 + 1;
                pbVar21 = unaff_x25;
              } while (unaff_x25 < pbVar22);
            }
            goto LAB_000a4888;
          }
          _memcpy();
        }
        else {
          _memmove(pbVar4,param_25 - uVar23,param_1);
        }
LAB_000a4b2c:
        param_5 = *(ushort **)(unaff_x29 + -0x70);
        in_x17 = *(byte **)(unaff_x29 + -0x68);
        param_7 = *(byte **)(unaff_x29 + -0x78);
        param_8 = param_26;
        in_x14 = param_20;
        in_x15 = param_19;
        unaff_x25 = pbVar22;
      }
      else {
        uVar19 = (uint)uVar20;
        if (uVar19 < 0x10) {
          if (uVar19 == 4) {
            iVar3 = *(int *)pbVar21;
          }
          else if (uVar19 == 2) {
            iVar3 = CONCAT22(*(undefined2 *)pbVar21,*(undefined2 *)pbVar21);
          }
          else {
            if (uVar19 != 1) {
              if (uVar19 < 8) {
                pbVar4[0] = 0;
                pbVar4[1] = 0;
                pbVar4[2] = 0;
                pbVar4[3] = 0;
                *pbVar4 = *pbVar21;
                pbVar4[1] = pbVar21[1];
                pbVar4[2] = pbVar21[2];
                pbVar4[3] = pbVar21[3];
                uVar19 = *(uint *)(&UNK_0080bed8 + uVar20 * 4);
                *(undefined4 *)(pbVar4 + 4) = *(undefined4 *)(pbVar21 + uVar19);
                pbVar5 = pbVar21 + uVar19 + -(long)*(int *)(&UNK_0080bef8 + uVar20 * 4);
              }
              else {
                pbVar5 = pbVar21 + 8;
                *(undefined8 *)pbVar4 = *(undefined8 *)pbVar21;
              }
              pbVar21 = pbVar4 + 8;
              pbVar8 = pbVar4 + param_1;
              if (pbVar4 + param_1 <= pbVar4 + 0x10) {
                pbVar8 = pbVar4 + 0x10;
              }
              pbVar7 = pbVar5;
              if (pbVar8 + (-9 - (long)pbVar4) < (byte *)0x38) {
              }
              else if ((byte *)0x3f < pbVar4 + (8 - (long)pbVar5)) {
                uVar20 = ((ulong)(pbVar8 + (-9 - (long)pbVar4)) >> 3) + 1;
                uVar10 = uVar20 & 0x3ffffffffffffff8;
                pbVar7 = pbVar5 + uVar10 * 8;
                pbVar21 = pbVar21 + uVar10 * 8;
                pbVar5 = pbVar5 + 0x20;
                pbVar4 = pbVar4 + 0x28;
                uVar23 = uVar10;
                do {
                  uVar24 = *(undefined8 *)(pbVar5 + -0x20);
                  uVar26 = *(undefined8 *)(pbVar5 + -8);
                  uVar25 = *(undefined8 *)(pbVar5 + -0x10);
                  uVar28 = *(undefined8 *)(pbVar5 + 8);
                  uVar27 = *(undefined8 *)pbVar5;
                  uVar30 = *(undefined8 *)(pbVar5 + 0x18);
                  uVar29 = *(undefined8 *)(pbVar5 + 0x10);
                  *(undefined8 *)(pbVar4 + -0x18) = *(undefined8 *)(pbVar5 + -0x18);
                  *(undefined8 *)(pbVar4 + -0x20) = uVar24;
                  *(undefined8 *)(pbVar4 + -8) = uVar26;
                  *(undefined8 *)(pbVar4 + -0x10) = uVar25;
                  *(undefined8 *)(pbVar4 + 8) = uVar28;
                  *(undefined8 *)pbVar4 = uVar27;
                  *(undefined8 *)(pbVar4 + 0x18) = uVar30;
                  *(undefined8 *)(pbVar4 + 0x10) = uVar29;
                  uVar23 = uVar23 - 8;
                  pbVar5 = pbVar5 + 0x40;
                  pbVar4 = pbVar4 + 0x40;
                } while (uVar23 != 0);
                param_5 = *(ushort **)(unaff_x29 + -0x70);
                in_x17 = *(byte **)(unaff_x29 + -0x68);
                param_7 = *(byte **)(unaff_x29 + -0x78);
                param_8 = param_26;
                in_x14 = param_20;
                in_x15 = param_19;
                if (uVar20 == uVar10) goto LAB_000a4888;
              }
              do {
                pbVar4 = pbVar21 + 8;
                *(undefined8 *)pbVar21 = *(undefined8 *)pbVar7;
                pbVar21 = pbVar4;
                pbVar7 = pbVar7 + 8;
              } while (pbVar4 < pbVar22);
              goto LAB_000a4b2c;
            }
            iVar3 = (uint)*pbVar21 * 0x1010101;
          }
          *(int *)pbVar4 = iVar3;
          *(int *)(pbVar4 + 4) = iVar3;
          param_5 = *(ushort **)(unaff_x29 + -0x70);
          in_x17 = *(byte **)(unaff_x29 + -0x68);
          param_7 = *(byte **)(unaff_x29 + -0x78);
          param_8 = param_26;
          in_x14 = param_20;
          in_x15 = param_19;
          if (8 < (long)param_1) {
            pbVar21 = pbVar4 + param_1;
            if (pbVar4 + param_1 <= pbVar4 + 0x10) {
              pbVar21 = pbVar4 + 0x10;
            }
            if (pbVar21 + (-9 - (long)pbVar4) < (byte *)0x78) {
              pbVar21 = pbVar4 + 8;
              pbVar5 = pbVar4;
            }
            else {
              uVar20 = ((ulong)(pbVar21 + (-9 - (long)pbVar4)) >> 3) + 1;
              uVar10 = uVar20 & 0x3ffffffffffffff0;
              pbVar5 = pbVar4 + uVar10 * 8;
              uVar24 = CONCAT44(iVar3,iVar3);
              uVar25 = CONCAT44(iVar3,iVar3);
              pbVar21 = pbVar4 + 0x48;
              uVar23 = uVar10;
              do {
                *(undefined8 *)(pbVar21 + -0x38) = uVar25;
                *(undefined8 *)(pbVar21 + -0x40) = uVar24;
                *(undefined8 *)(pbVar21 + -0x28) = uVar25;
                *(undefined8 *)(pbVar21 + -0x30) = uVar24;
                *(undefined8 *)(pbVar21 + -0x18) = uVar25;
                *(undefined8 *)(pbVar21 + -0x20) = uVar24;
                *(undefined8 *)(pbVar21 + -8) = uVar25;
                *(undefined8 *)(pbVar21 + -0x10) = uVar24;
                *(undefined8 *)(pbVar21 + 8) = uVar25;
                *(undefined8 *)pbVar21 = uVar24;
                *(undefined8 *)(pbVar21 + 0x18) = uVar25;
                *(undefined8 *)(pbVar21 + 0x10) = uVar24;
                *(undefined8 *)(pbVar21 + 0x28) = uVar25;
                *(undefined8 *)(pbVar21 + 0x20) = uVar24;
                *(undefined8 *)(pbVar21 + 0x38) = uVar25;
                *(undefined8 *)(pbVar21 + 0x30) = uVar24;
                pbVar21 = pbVar21 + 0x80;
                uVar23 = uVar23 - 0x10;
              } while (uVar23 != 0);
              param_5 = *(ushort **)(unaff_x29 + -0x70);
              in_x17 = *(byte **)(unaff_x29 + -0x68);
              param_7 = *(byte **)(unaff_x29 + -0x78);
              pbVar21 = pbVar4 + 8 + uVar10 * 8;
              if (uVar20 == uVar10) goto LAB_000a4888;
            }
            do {
              pbVar4 = pbVar21;
              *(int *)pbVar4 = iVar3;
              *(int *)(pbVar5 + 0xc) = iVar3;
              pbVar21 = pbVar4 + 8;
              pbVar5 = pbVar4;
            } while (pbVar4 + 8 < pbVar22);
            goto LAB_000a4b2c;
          }
        }
        else {
          do {
            pbVar21 = pbVar4 + -uVar20;
            uVar24 = *(undefined8 *)pbVar21;
            *(undefined8 *)(pbVar4 + 8) = *(undefined8 *)(pbVar21 + 8);
            *(undefined8 *)pbVar4 = uVar24;
            uVar24 = *(undefined8 *)(pbVar21 + 0x10);
            *(undefined8 *)(pbVar4 + 0x18) = *(undefined8 *)(pbVar21 + 0x18);
            *(undefined8 *)(pbVar4 + 0x10) = uVar24;
            pbVar4 = pbVar4 + 0x20;
          } while (pbVar4 < pbVar22);
        }
      }
LAB_000a4888:
      in_x9 = (ushort *)((long)puVar16 + 1);
      param_1 = (ulong)(byte)*puVar16;
      param_4 = (ulong)(byte)((byte)*puVar16 >> 4);
      if (param_4 != 0xf) {
        if (param_23 < in_x9) {
          pbVar4 = unaff_x25 + param_4;
          if (pbVar4 <= in_x17 + -0xc) goto LAB_000a4f08;
          goto LAB_000a528c;
        }
        uVar24 = *(undefined8 *)in_x9;
        *(undefined8 *)(unaff_x25 + 8) = *(undefined8 *)((long)puVar16 + 9);
        *(undefined8 *)unaff_x25 = uVar24;
        goto code_r0x000a4980;
      }
      if (in_x14 <= in_x9) goto LAB_000a52bc;
      puVar9 = puVar16 + 1;
      if (in_x14 < puVar9) goto LAB_000a52c4;
      param_4 = (ulong)*(byte *)in_x9;
      if (param_4 == 0xff) {
        do {
          puVar16 = (ushort *)((long)puVar9 + 1);
          if (in_x14 < puVar16) goto LAB_000a52c8;
          uVar2 = *puVar9;
          param_4 = param_4 + (byte)uVar2;
          puVar9 = puVar16;
        } while ((ulong)(byte)uVar2 == 0xff);
        if (param_4 == 0xffffffffffffffff) goto LAB_000a52c8;
      }
      else {
        puVar16 = puVar9;
      }
      param_4 = param_4 + 0xf;
      if ((CARRY8((ulong)unaff_x25,param_4)) || (CARRY8((ulong)puVar16,param_4))) goto LAB_000a52c8;
      puVar9 = (ushort *)((long)puVar16 + param_4);
      pbVar4 = unaff_x25 + param_4;
      if (param_7 < pbVar4 || param_22 < puVar9) goto code_r0x000a4ef8;
      do {
        uVar24 = *(undefined8 *)puVar16;
        *(undefined8 *)(unaff_x25 + 8) = *(undefined8 *)(puVar16 + 4);
        *(undefined8 *)unaff_x25 = uVar24;
        uVar24 = *(undefined8 *)(puVar16 + 8);
        *(undefined8 *)(unaff_x25 + 0x18) = *(undefined8 *)(puVar16 + 0xc);
        *(undefined8 *)(unaff_x25 + 0x10) = uVar24;
        unaff_x25 = unaff_x25 + 0x20;
        puVar16 = puVar16 + 0x10;
      } while (unaff_x25 < pbVar4);
      puVar16 = puVar9 + 1;
      uVar20 = (ulong)*puVar9;
      pbVar21 = pbVar4 + -uVar20;
      param_1 = param_1 & 0xf;
      if (param_1 != 0xf) goto code_r0x000a49a4;
LAB_000a4930:
      in_x9 = (ushort *)((long)puVar9 + 3);
      if (param_21 < in_x9) goto LAB_000a52bc;
      param_1 = (ulong)(byte)*puVar16;
      if (param_1 == 0xff) {
        do {
          puVar16 = (ushort *)((long)in_x9 + 1);
          if (param_21 < puVar16) goto LAB_000a52c8;
          uVar2 = *in_x9;
          param_1 = param_1 + (byte)uVar2;
          in_x9 = puVar16;
        } while ((ulong)(byte)uVar2 == 0xff);
        if (param_1 == 0xffffffffffffffff) goto LAB_000a52c8;
      }
      else {
        puVar16 = in_x9;
      }
      param_1 = param_1 + 0x13;
      if (CARRY8((ulong)pbVar4,param_1)) goto LAB_000a52c8;
      if (in_x15 <= pbVar4 + param_1) {
        break;
      }
    } while( true );
  }
  do {
    if ((param_8 == 0) && (pbVar21 + *(long *)(unaff_x29 + -0x60) < unaff_x23)) goto LAB_000a52c8;
    unaff_x25 = pbVar4 + param_1;
    if (pbVar21 < unaff_x23) {
      if (in_x17 + -5 < unaff_x25) goto LAB_000a52c8;
      uVar20 = (long)unaff_x23 - (long)pbVar21;
      if (uVar20 < param_1) {
        _memcpy(pbVar4,param_25 - uVar20,uVar20);
        pbVar22 = pbVar4 + uVar20;
        if ((ulong)((long)pbVar22 - (long)unaff_x23) < param_1 - uVar20) {
          if ((long)uVar20 < (long)param_1) {
            pbVar5 = pbVar21 + param_15;
            pbVar8 = pbVar4 + param_17;
            pbVar7 = pbVar4 + param_1;
            if (pbVar7 < pbVar8 + (1 - (long)pbVar5)) {
              pbVar7 = pbVar8 + (1 - (long)pbVar5);
            }
            uVar20 = (long)(pbVar5 + (long)pbVar7) - (long)pbVar8;
            pbVar5 = unaff_x23;
            if (uVar20 < 0x40) {
              param_5 = *(ushort **)(unaff_x29 + -0x70);
              in_x17 = *(byte **)(unaff_x29 + -0x68);
              param_7 = *(byte **)(unaff_x29 + -0x78);
LAB_000a520c:
              do {
                pbVar8 = pbVar22 + 1;
                *pbVar22 = *pbVar5;
                pbVar22 = pbVar8;
                pbVar5 = pbVar5 + 1;
              } while (pbVar8 < unaff_x25);
            }
            else {
              param_5 = *(ushort **)(unaff_x29 + -0x70);
              in_x17 = *(byte **)(unaff_x29 + -0x68);
              param_7 = *(byte **)(unaff_x29 + -0x78);
              if ((ulong)((long)pbVar22 - (long)unaff_x23) < 0x40) goto LAB_000a520c;
              uVar10 = uVar20 & 0xffffffffffffffc0;
              pbVar8 = pbVar22 + uVar10;
              pbVar22 = unaff_x23 + 0x20;
              pbVar4 = pbVar4 + ((long)(unaff_x23 + 0x20) - (long)pbVar21);
              uVar23 = uVar10;
              do {
                uVar24 = *(undefined8 *)(pbVar22 + -0x20);
                uVar26 = *(undefined8 *)(pbVar22 + -8);
                uVar25 = *(undefined8 *)(pbVar22 + -0x10);
                uVar28 = *(undefined8 *)(pbVar22 + 8);
                uVar27 = *(undefined8 *)pbVar22;
                uVar30 = *(undefined8 *)(pbVar22 + 0x18);
                uVar29 = *(undefined8 *)(pbVar22 + 0x10);
                *(undefined8 *)(pbVar4 + -0x18) = *(undefined8 *)(pbVar22 + -0x18);
                *(undefined8 *)(pbVar4 + -0x20) = uVar24;
                *(undefined8 *)(pbVar4 + -8) = uVar26;
                *(undefined8 *)(pbVar4 + -0x10) = uVar25;
                *(undefined8 *)(pbVar4 + 8) = uVar28;
                *(undefined8 *)pbVar4 = uVar27;
                *(undefined8 *)(pbVar4 + 0x18) = uVar30;
                *(undefined8 *)(pbVar4 + 0x10) = uVar29;
                uVar23 = uVar23 - 0x40;
                pbVar22 = pbVar22 + 0x40;
                pbVar4 = pbVar4 + 0x40;
              } while (uVar23 != 0);
              pbVar22 = pbVar8;
              pbVar5 = unaff_x23 + uVar10;
              if (uVar20 != uVar10) goto LAB_000a520c;
            }
            param_8 = param_26;
            unaff_x25 = pbVar8;
            goto LAB_000a51a8;
          }
          unaff_x25 = pbVar22;
        }
        else {
          _memcpy();
        }
      }
      else {
        _memmove(pbVar4,param_25 - uVar20,param_1);
      }
LAB_000a519c:
      param_5 = *(ushort **)(unaff_x29 + -0x70);
      in_x17 = *(byte **)(unaff_x29 + -0x68);
      param_7 = *(byte **)(unaff_x29 + -0x78);
      param_8 = param_26;
    }
    else {
      if (uVar20 < 8) {
        pbVar4[0] = 0;
        pbVar4[1] = 0;
        pbVar4[2] = 0;
        pbVar4[3] = 0;
        *pbVar4 = *pbVar21;
        pbVar4[1] = pbVar21[1];
        pbVar4[2] = pbVar21[2];
        pbVar4[3] = pbVar21[3];
        uVar19 = *(uint *)(&UNK_0080bed8 + uVar20 * 4);
        *(undefined4 *)(pbVar4 + 4) = *(undefined4 *)(pbVar21 + uVar19);
        pbVar22 = pbVar21 + uVar19 + -(long)*(int *)(&UNK_0080bef8 + uVar20 * 4);
      }
      else {
        pbVar22 = pbVar21 + 8;
        *(undefined8 *)pbVar4 = *(undefined8 *)pbVar21;
      }
      if (in_x17 + -0xc < unaff_x25) {
        pbVar21 = pbVar4 + 8;
        if (unaff_x25 <= in_x17 + -5) {
          pbVar5 = in_x17 + -7;
          if (pbVar21 < pbVar5) {
            pbVar8 = (byte *)(param_17 + param_13 + -7);
            if (pbVar8 <= pbVar4 + 0x10) {
              pbVar8 = pbVar4 + 0x10;
            }
            pbVar7 = pbVar22;
            if (pbVar8 + (-9 - (long)pbVar4) < (byte *)0x38) {
              pbVar13 = pbVar21;
LAB_000a53f0:
              do {
                pbVar8 = pbVar13 + 8;
                *(undefined8 *)pbVar13 = *(undefined8 *)pbVar7;
                pbVar7 = pbVar7 + 8;
                pbVar13 = pbVar8;
              } while (pbVar8 < pbVar5);
            }
            else {
              pbVar13 = pbVar21;
              if (pbVar4 + (8 - (long)pbVar22) < (byte *)0x40) goto LAB_000a53f0;
              uVar20 = ((ulong)(pbVar8 + (-9 - (long)pbVar4)) >> 3) + 1;
              uVar10 = uVar20 & 0x3ffffffffffffff8;
              pbVar7 = pbVar22 + uVar10 * 8;
              pbVar13 = pbVar21 + uVar10 * 8;
              pbVar8 = pbVar22 + 0x20;
              pbVar15 = pbVar4 + 0x28;
              uVar23 = uVar10;
              do {
                uVar24 = *(undefined8 *)(pbVar8 + -0x20);
                uVar26 = *(undefined8 *)(pbVar8 + -8);
                uVar25 = *(undefined8 *)(pbVar8 + -0x10);
                uVar28 = *(undefined8 *)(pbVar8 + 8);
                uVar27 = *(undefined8 *)pbVar8;
                uVar30 = *(undefined8 *)(pbVar8 + 0x18);
                uVar29 = *(undefined8 *)(pbVar8 + 0x10);
                *(undefined8 *)(pbVar15 + -0x18) = *(undefined8 *)(pbVar8 + -0x18);
                *(undefined8 *)(pbVar15 + -0x20) = uVar24;
                *(undefined8 *)(pbVar15 + -8) = uVar26;
                *(undefined8 *)(pbVar15 + -0x10) = uVar25;
                *(undefined8 *)(pbVar15 + 8) = uVar28;
                *(undefined8 *)pbVar15 = uVar27;
                *(undefined8 *)(pbVar15 + 0x18) = uVar30;
                *(undefined8 *)(pbVar15 + 0x10) = uVar29;
                uVar23 = uVar23 - 8;
                pbVar8 = pbVar8 + 0x40;
                pbVar15 = pbVar15 + 0x40;
              } while (uVar23 != 0);
              if (uVar20 != uVar10) goto LAB_000a53f0;
            }
            lVar6 = (long)pbVar5 - (long)pbVar21;
            pbVar21 = pbVar5;
            pbVar5 = pbVar22 + lVar6;
          }
          else {
            pbVar5 = pbVar22;
          }
          if (pbVar21 < unaff_x25) {
            pbVar8 = (byte *)(param_17 + param_13 + -7);
            if (pbVar8 <= pbVar4 + 8) {
              pbVar8 = pbVar4 + 8;
            }
            pbVar7 = pbVar4 + (param_1 - (long)pbVar8);
            if ((pbVar7 < (byte *)0x8) || (pbVar4 + (8 - (long)pbVar22) < (byte *)0x40)) {
              pbVar15 = pbVar21;
              pbVar13 = pbVar5;
            }
            else {
              pbVar17 = (byte *)0x0;
              if ((byte *)0x3f < pbVar7) {
                pbVar17 = (byte *)((ulong)pbVar7 & 0xffffffffffffffc0);
                pbVar15 = pbVar21 + 0x20;
                pbVar18 = pbVar22 + (long)(pbVar8 + (0x18 - (long)pbVar4));
                pbVar13 = pbVar17;
                do {
                  uVar24 = *(undefined8 *)(pbVar18 + -0x20);
                  uVar26 = *(undefined8 *)(pbVar18 + -8);
                  uVar25 = *(undefined8 *)(pbVar18 + -0x10);
                  uVar28 = *(undefined8 *)(pbVar18 + 8);
                  uVar27 = *(undefined8 *)pbVar18;
                  uVar30 = *(undefined8 *)(pbVar18 + 0x18);
                  uVar29 = *(undefined8 *)(pbVar18 + 0x10);
                  *(undefined8 *)(pbVar15 + -0x18) = *(undefined8 *)(pbVar18 + -0x18);
                  *(undefined8 *)(pbVar15 + -0x20) = uVar24;
                  *(undefined8 *)(pbVar15 + -8) = uVar26;
                  *(undefined8 *)(pbVar15 + -0x10) = uVar25;
                  *(undefined8 *)(pbVar15 + 8) = uVar28;
                  *(undefined8 *)pbVar15 = uVar27;
                  *(undefined8 *)(pbVar15 + 0x18) = uVar30;
                  *(undefined8 *)(pbVar15 + 0x10) = uVar29;
                  pbVar13 = pbVar13 + -0x40;
                  pbVar15 = pbVar15 + 0x40;
                  pbVar18 = pbVar18 + 0x40;
                } while (pbVar13 != (byte *)0x0);
                if (pbVar7 == pbVar17) goto LAB_000a519c;
                pbVar13 = pbVar5 + (long)pbVar17;
                pbVar15 = pbVar21 + (long)pbVar17;
                if (((ulong)pbVar7 & 0x38) == 0) goto LAB_000a545c;
              }
              pbVar18 = (byte *)((ulong)pbVar7 & 0xfffffffffffffff8);
              pbVar15 = pbVar21 + (long)pbVar18;
              pbVar13 = pbVar5 + (long)pbVar18;
              lVar6 = (long)pbVar17 - (long)pbVar18;
              pbVar21 = pbVar21 + (long)pbVar17;
              pbVar4 = pbVar22 + (long)(pbVar8 + (long)(pbVar17 + (-8 - (long)pbVar4)));
              do {
                *(undefined8 *)pbVar21 = *(undefined8 *)pbVar4;
                lVar6 = lVar6 + 8;
                pbVar21 = pbVar21 + 8;
                pbVar4 = pbVar4 + 8;
              } while (lVar6 != 0);
              if (pbVar7 == pbVar18) goto LAB_000a519c;
            }
LAB_000a545c:
            do {
              pbVar4 = pbVar15 + 1;
              *pbVar15 = *pbVar13;
              pbVar15 = pbVar4;
              pbVar13 = pbVar13 + 1;
            } while (pbVar4 < unaff_x25);
          }
          goto LAB_000a519c;
        }
        goto LAB_000a52c8;
      }
      *(undefined8 *)(pbVar4 + 8) = *(undefined8 *)pbVar22;
      if (0x10 < param_1) {
        pbVar21 = pbVar4 + 0x10;
        pbVar5 = pbVar4 + param_1;
        if (pbVar4 + param_1 <= pbVar4 + 0x18) {
          pbVar5 = pbVar4 + 0x18;
        }
        if ((segment_command_00000020.segname + 0xf < pbVar5 + (-0x11 - (long)pbVar4)) &&
           ((byte *)((long)&segment_command_00000020.vmaddr + 7) < pbVar4 + (8 - (long)pbVar22))) {
          uVar20 = ((ulong)(pbVar5 + (-0x11 - (long)pbVar4)) >> 3) + 1;
          uVar10 = uVar20 & 0x3ffffffffffffff8;
          pbVar21 = pbVar21 + uVar10 * 8;
          pbVar4 = pbVar4 + 0x20;
          pbVar5 = pbVar22 + 0x28;
          uVar23 = uVar10;
          do {
            uVar24 = *(undefined8 *)(pbVar5 + -0x20);
            uVar26 = *(undefined8 *)(pbVar5 + -8);
            uVar25 = *(undefined8 *)(pbVar5 + -0x10);
            uVar28 = *(undefined8 *)(pbVar5 + 8);
            uVar27 = *(undefined8 *)pbVar5;
            uVar30 = *(undefined8 *)(pbVar5 + 0x18);
            uVar29 = *(undefined8 *)(pbVar5 + 0x10);
            *(undefined8 *)(pbVar4 + -8) = *(undefined8 *)(pbVar5 + -0x18);
            *(undefined8 *)(pbVar4 + -0x10) = uVar24;
            *(undefined8 *)(pbVar4 + 8) = uVar26;
            *(undefined8 *)pbVar4 = uVar25;
            *(undefined8 *)(pbVar4 + 0x18) = uVar28;
            *(undefined8 *)(pbVar4 + 0x10) = uVar27;
            *(undefined8 *)(pbVar4 + 0x28) = uVar30;
            *(undefined8 *)(pbVar4 + 0x20) = uVar29;
            pbVar4 = pbVar4 + 0x40;
            uVar23 = uVar23 - 8;
            pbVar5 = pbVar5 + 0x40;
          } while (uVar23 != 0);
          pbVar22 = pbVar22 + uVar10 * 8;
          if (uVar20 == uVar10) goto LAB_000a51a8;
        }
        do {
          pbVar4 = pbVar21 + 8;
          *(undefined8 *)pbVar21 = *(undefined8 *)(pbVar22 + 8);
          pbVar21 = pbVar4;
          pbVar22 = pbVar22 + 8;
        } while (pbVar4 < unaff_x25);
      }
    }
LAB_000a51a8:
    in_x9 = (ushort *)((long)puVar16 + 1);
    bVar1 = (byte)*puVar16;
    while( true ) {
      param_1 = (ulong)bVar1;
      param_4 = (ulong)(bVar1 >> 4);
      if (param_4 == 0xf) break;
      if ((param_5 <= in_x9) || (param_7 < unaff_x25)) {
        pbVar4 = unaff_x25 + param_4;
        if (pbVar4 <= in_x17 + -0xc) goto LAB_000a4f08;
        goto LAB_000a528c;
      }
      uVar24 = *(undefined8 *)in_x9;
      *(undefined8 *)(unaff_x25 + 8) = *(undefined8 *)(in_x9 + 4);
      *(undefined8 *)unaff_x25 = uVar24;
      puVar9 = (ushort *)((long)in_x9 + param_4);
      param_1 = param_1 & 0xf;
      puVar16 = puVar9 + 1;
      uVar20 = (ulong)*puVar9;
      pbVar4 = unaff_x25 + param_4;
      pbVar21 = pbVar4 + -uVar20;
      if ((param_1 == 0xf) || (*puVar9 < 8 || pbVar21 < unaff_x23)) goto LAB_000a4fb4;
      *(undefined8 *)pbVar4 = *(undefined8 *)pbVar21;
      *(undefined8 *)(pbVar4 + 8) = *(undefined8 *)(pbVar21 + 8);
      *(undefined2 *)(pbVar4 + 0x10) = *(undefined2 *)(pbVar21 + 0x10);
      unaff_x25 = pbVar4 + param_1 + 4;
      in_x9 = (ushort *)((long)puVar9 + 3);
      bVar1 = (byte)puVar9[1];
    }
    puVar9 = (ushort *)(param_24 + -0xf);
    if (puVar9 <= in_x9) break;
    puVar16 = puVar16 + 1;
    if (puVar9 < puVar16) goto LAB_000a52c8;
    param_4 = (ulong)(byte)*in_x9;
    if (param_4 == 0xff) {
      do {
        puVar11 = puVar16;
        puVar16 = (ushort *)((long)puVar11 + 1);
        if (puVar9 < puVar16) goto LAB_000a52c8;
        param_4 = param_4 + (byte)*puVar11;
      } while ((ulong)(byte)*puVar11 == 0xff);
      if (param_4 == 0xffffffffffffffff) {
        puVar16 = (ushort *)((long)puVar11 + 1);
        goto LAB_000a52c8;
      }
    }
    param_4 = param_4 + 0xf;
    if ((CARRY8((ulong)unaff_x25,param_4)) || (CARRY8((ulong)puVar16,param_4))) goto LAB_000a52c8;
code_r0x000a4ef8:
    pbVar4 = unaff_x25 + param_4;
    in_x9 = puVar16;
    if (in_x17 + -0xc < pbVar4) goto LAB_000a528c;
LAB_000a4f08:
    puVar9 = (ushort *)((long)in_x9 + param_4);
    if (param_24 + -8 < puVar9) goto LAB_000a528c;
    pbVar21 = unaff_x25 + param_4;
    if (unaff_x25 + param_4 <= unaff_x25 + 8) {
      pbVar21 = unaff_x25 + 8;
    }
    if ((pbVar21 + ~(ulong)unaff_x25 < &segment_command_00000020.vmaddr) ||
       ((ulong)((long)unaff_x25 - (long)in_x9) < 0x40)) {
LAB_000a4f94:
      do {
        pbVar21 = unaff_x25 + 8;
        *(undefined8 *)unaff_x25 = *(undefined8 *)in_x9;
        in_x9 = in_x9 + 4;
        unaff_x25 = pbVar21;
      } while (pbVar21 < pbVar4);
    }
    else {
      uVar20 = ((ulong)(pbVar21 + ~(ulong)unaff_x25) >> 3) + 1;
      uVar10 = uVar20 & 0x3ffffffffffffff8;
      puVar16 = in_x9 + 0x10;
      pbVar21 = unaff_x25 + 0x20;
      uVar23 = uVar10;
      do {
        uVar24 = *(undefined8 *)(puVar16 + -0x10);
        uVar26 = *(undefined8 *)(puVar16 + -4);
        uVar25 = *(undefined8 *)(puVar16 + -8);
        uVar28 = *(undefined8 *)(puVar16 + 4);
        uVar27 = *(undefined8 *)puVar16;
        uVar30 = *(undefined8 *)(puVar16 + 0xc);
        uVar29 = *(undefined8 *)(puVar16 + 8);
        *(undefined8 *)(pbVar21 + -0x18) = *(undefined8 *)(puVar16 + -0xc);
        *(undefined8 *)(pbVar21 + -0x20) = uVar24;
        *(undefined8 *)(pbVar21 + -8) = uVar26;
        *(undefined8 *)(pbVar21 + -0x10) = uVar25;
        *(undefined8 *)(pbVar21 + 8) = uVar28;
        *(undefined8 *)pbVar21 = uVar27;
        *(undefined8 *)(pbVar21 + 0x18) = uVar30;
        *(undefined8 *)(pbVar21 + 0x10) = uVar29;
        uVar23 = uVar23 - 8;
        puVar16 = puVar16 + 0x20;
        pbVar21 = pbVar21 + 0x40;
      } while (uVar23 != 0);
      in_x9 = in_x9 + uVar10 * 4;
      unaff_x25 = unaff_x25 + uVar10 * 8;
      if (uVar20 != uVar10) goto LAB_000a4f94;
    }
    puVar16 = puVar9 + 1;
    uVar20 = (ulong)*puVar9;
    pbVar21 = pbVar4 + -uVar20;
    param_1 = param_1 & 0xf;
LAB_000a4fb4:
    puVar9 = puVar16;
    if (param_1 == 0xf) {
      puVar9 = (ushort *)((long)puVar16 + 1);
      if (param_24 + -4 < puVar9) goto LAB_000a52c4;
      uVar23 = (ulong)(byte)*puVar16;
      puVar11 = puVar9;
      if (uVar23 == 0xff) {
        do {
          puVar9 = (ushort *)((long)puVar11 + 1);
          puVar16 = puVar9;
          if (param_24 + -4 < puVar9) goto LAB_000a52c8;
          uVar2 = *puVar11;
          uVar23 = uVar23 + (byte)uVar2;
          puVar11 = puVar9;
        } while ((ulong)(byte)uVar2 == 0xff);
      }
      param_1 = uVar23 + 0xf;
      puVar16 = puVar9;
      if ((uVar23 == 0xffffffffffffffff) || (CARRY8((ulong)pbVar4,param_1))) goto LAB_000a52c8;
    }
    param_1 = param_1 + 4;
    puVar16 = puVar9;
  } while( true );
LAB_000a52bc:
  puVar16 = in_x9;
  goto LAB_000a52c8;
LAB_000a52c4:
  puVar16 = puVar9;
  goto LAB_000a52c8;
LAB_000a528c:
  puVar16 = in_x9;
  if (((byte *)((long)in_x9 + param_4) == param_24) && (pbVar4 <= in_x17)) {
    _memmove(unaff_x25,in_x9);
    uVar19 = (int)pbVar4 - (int)param_17;
    goto LAB_000a4df8;
  }
LAB_000a52c8:
  uVar19 = ~(uint)puVar16 + param_16;
LAB_000a4df8:
  if (0 < (int)uVar19) {
    *(ulong *)(param_14 + 0x18) = *(long *)(param_14 + 0x18) + (ulong)uVar19;
    *(ulong *)(param_14 + 8) = *(long *)(param_14 + 8) + (ulong)uVar19;
  }
  return;
}

