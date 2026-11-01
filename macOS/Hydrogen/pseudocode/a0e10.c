
int FUN_000a0e10(byte *param_1,int param_2,undefined8 param_3,ushort *param_4,byte *param_5,
                ushort *param_6,int param_7,long param_8,long param_9)

{
  byte bVar1;
  ushort uVar2;
  ushort *puVar3;
  ushort *puVar4;
  ulong uVar5;
  byte *pbVar6;
  byte *pbVar7;
  byte *pbVar8;
  ulong uVar9;
  byte *pbVar10;
  byte *pbVar11;
  ulong uVar12;
  byte *in_x9;
  byte *in_x10;
  long in_x11;
  ushort *in_x12;
  byte *in_x13;
  int iVar13;
  byte *pbVar14;
  ulong in_x14;
  byte *pbVar15;
  ushort *puVar16;
  ushort *in_x15;
  ushort *puVar17;
  byte *pbVar18;
  byte *pbVar19;
  ushort *in_x16;
  long lVar20;
  byte *pbVar21;
  ushort *in_x17;
  byte *unaff_x19;
  ulong unaff_x21;
  uint uVar22;
  ulong uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined8 uVar26;
  undefined8 uVar27;
  undefined8 uVar28;
  undefined8 uVar29;
  undefined8 uVar30;
  
code_r0x000a0e10:
  do {
    puVar4 = (ushort *)((long)param_4 + 1);
    if (in_x16 < puVar4) goto LAB_000a1450;
    uVar2 = *param_4;
    in_x14 = in_x14 + (byte)uVar2;
    param_4 = puVar4;
    if ((ulong)(byte)uVar2 != 0xff) {
      if (in_x14 != 0xffffffffffffffff) {
LAB_000a0ce8:
        uVar5 = in_x14 + 0xf;
        if ((!CARRY8((ulong)param_1,uVar5)) && (!CARRY8((ulong)puVar4,uVar5))) {
          puVar16 = (ushort *)((long)puVar4 + uVar5);
          pbVar18 = param_1 + uVar5;
          if (in_x13 < pbVar18 || in_x17 < puVar16) goto code_r0x000a1118;
          do {
            uVar24 = *(undefined8 *)puVar4;
            *(undefined8 *)(param_1 + 8) = *(undefined8 *)(puVar4 + 4);
            *(undefined8 *)param_1 = uVar24;
            uVar24 = *(undefined8 *)(puVar4 + 8);
            *(undefined8 *)(param_1 + 0x18) = *(undefined8 *)(puVar4 + 0xc);
            *(undefined8 *)(param_1 + 0x10) = uVar24;
            param_1 = param_1 + 0x20;
            puVar4 = puVar4 + 0x10;
          } while (param_1 < pbVar18);
          puVar3 = puVar16 + 1;
          uVar23 = (ulong)*puVar16;
          pbVar14 = pbVar18 + -uVar23;
          uVar12 = unaff_x21 & 0xf;
          puVar4 = puVar3;
          if (uVar12 != 0xf) goto code_r0x000a0db8;
code_r0x000a0d50:
          puVar4 = (ushort *)((long)puVar16 + 3);
          if (puVar4 <= param_6) {
            uVar12 = (ulong)(byte)*puVar3;
            puVar16 = puVar4;
            if (uVar12 == 0xff) {
              do {
                puVar4 = (ushort *)((long)puVar16 + 1);
                if (param_6 < puVar4) goto LAB_000a1450;
                uVar2 = *puVar16;
                uVar12 = uVar12 + (byte)uVar2;
                puVar16 = puVar4;
              } while ((ulong)(byte)uVar2 == 0xff);
              if (uVar12 == 0xffffffffffffffff) goto LAB_000a1450;
            }
            uVar12 = uVar12 + 0x13;
            if (!CARRY8((ulong)pbVar18,uVar12)) {
              if (pbVar18 + uVar12 < param_5) {
                while (unaff_x19 <= pbVar14) {
                  param_1 = pbVar18 + uVar12;
                  uVar22 = (uint)uVar23;
                  if (uVar22 < 0x10) {
                    if (uVar22 == 4) {
                      iVar13 = *(int *)pbVar14;
                    }
                    else if (uVar22 == 2) {
                      iVar13 = CONCAT22(*(undefined2 *)pbVar14,*(undefined2 *)pbVar14);
                    }
                    else {
                      if (uVar22 != 1) {
                        if (uVar22 < 8) {
                          pbVar18[0] = 0;
                          pbVar18[1] = 0;
                          pbVar18[2] = 0;
                          pbVar18[3] = 0;
                          *pbVar18 = *pbVar14;
                          pbVar18[1] = pbVar14[1];
                          pbVar18[2] = pbVar14[2];
                          pbVar18[3] = pbVar14[3];
                          uVar22 = *(uint *)(param_8 + uVar23 * 4);
                          *(undefined4 *)(pbVar18 + 4) = *(undefined4 *)(pbVar14 + uVar22);
                          pbVar15 = pbVar14 + uVar22 + -(long)*(int *)(param_9 + uVar23 * 4);
                        }
                        else {
                          pbVar15 = pbVar14 + 8;
                          *(undefined8 *)pbVar18 = *(undefined8 *)pbVar14;
                        }
                        pbVar14 = pbVar18 + 8;
                        pbVar19 = pbVar18 + uVar12;
                        if (pbVar18 + uVar12 <= pbVar18 + 0x10) {
                          pbVar19 = pbVar18 + 0x10;
                        }
                        pbVar8 = pbVar15;
                        if (pbVar19 + (-9 - (long)pbVar18) < (byte *)0x38) {
                        }
                        else if ((byte *)0x3f < pbVar18 + (8 - (long)pbVar15)) {
                          uVar5 = ((ulong)(pbVar19 + (-9 - (long)pbVar18)) >> 3) + 1;
                          uVar23 = uVar5 & 0x3ffffffffffffff8;
                          pbVar8 = pbVar15 + uVar23 * 8;
                          pbVar14 = pbVar14 + uVar23 * 8;
                          pbVar15 = pbVar15 + 0x20;
                          pbVar18 = pbVar18 + 0x28;
                          uVar12 = uVar23;
                          do {
                            uVar24 = *(undefined8 *)(pbVar15 + -0x20);
                            uVar26 = *(undefined8 *)(pbVar15 + -8);
                            uVar25 = *(undefined8 *)(pbVar15 + -0x10);
                            uVar28 = *(undefined8 *)(pbVar15 + 8);
                            uVar27 = *(undefined8 *)pbVar15;
                            uVar30 = *(undefined8 *)(pbVar15 + 0x18);
                            uVar29 = *(undefined8 *)(pbVar15 + 0x10);
                            *(undefined8 *)(pbVar18 + -0x18) = *(undefined8 *)(pbVar15 + -0x18);
                            *(undefined8 *)(pbVar18 + -0x20) = uVar24;
                            *(undefined8 *)(pbVar18 + -8) = uVar26;
                            *(undefined8 *)(pbVar18 + -0x10) = uVar25;
                            *(undefined8 *)(pbVar18 + 8) = uVar28;
                            *(undefined8 *)pbVar18 = uVar27;
                            *(undefined8 *)(pbVar18 + 0x18) = uVar30;
                            *(undefined8 *)(pbVar18 + 0x10) = uVar29;
                            uVar12 = uVar12 - 8;
                            pbVar15 = pbVar15 + 0x40;
                            pbVar18 = pbVar18 + 0x40;
                          } while (uVar12 != 0);
                          if (uVar5 == uVar23) goto code_r0x000a0cb0;
                        }
                        do {
                          pbVar18 = pbVar14 + 8;
                          *(undefined8 *)pbVar14 = *(undefined8 *)pbVar8;
                          pbVar8 = pbVar8 + 8;
                          pbVar14 = pbVar18;
                        } while (pbVar18 < param_1);
                        goto code_r0x000a0cb0;
                      }
                      iVar13 = (uint)*pbVar14 * param_7;
                    }
                    *(int *)pbVar18 = iVar13;
                    *(int *)(pbVar18 + 4) = iVar13;
                    if (8 < (long)uVar12) {
                      pbVar14 = pbVar18 + uVar12;
                      if (pbVar18 + uVar12 <= pbVar18 + 0x10) {
                        pbVar14 = pbVar18 + 0x10;
                      }
                      if (pbVar14 + (-9 - (long)pbVar18) < (byte *)0x78) {
                        pbVar15 = pbVar18;
                        pbVar14 = pbVar18 + 8;
                      }
                      else {
                        uVar5 = ((ulong)(pbVar14 + (-9 - (long)pbVar18)) >> 3) + 1;
                        uVar23 = uVar5 & 0x3ffffffffffffff0;
                        pbVar14 = pbVar18 + 8 + uVar23 * 8;
                        pbVar15 = pbVar18 + uVar23 * 8;
                        uVar24 = CONCAT44(iVar13,iVar13);
                        uVar25 = CONCAT44(iVar13,iVar13);
                        pbVar18 = pbVar18 + 0x48;
                        uVar12 = uVar23;
                        do {
                          *(undefined8 *)(pbVar18 + -0x38) = uVar25;
                          *(undefined8 *)(pbVar18 + -0x40) = uVar24;
                          *(undefined8 *)(pbVar18 + -0x28) = uVar25;
                          *(undefined8 *)(pbVar18 + -0x30) = uVar24;
                          *(undefined8 *)(pbVar18 + -0x18) = uVar25;
                          *(undefined8 *)(pbVar18 + -0x20) = uVar24;
                          *(undefined8 *)(pbVar18 + -8) = uVar25;
                          *(undefined8 *)(pbVar18 + -0x10) = uVar24;
                          *(undefined8 *)(pbVar18 + 8) = uVar25;
                          *(undefined8 *)pbVar18 = uVar24;
                          *(undefined8 *)(pbVar18 + 0x18) = uVar25;
                          *(undefined8 *)(pbVar18 + 0x10) = uVar24;
                          *(undefined8 *)(pbVar18 + 0x28) = uVar25;
                          *(undefined8 *)(pbVar18 + 0x20) = uVar24;
                          *(undefined8 *)(pbVar18 + 0x38) = uVar25;
                          *(undefined8 *)(pbVar18 + 0x30) = uVar24;
                          pbVar18 = pbVar18 + 0x80;
                          uVar12 = uVar12 - 0x10;
                        } while (uVar12 != 0);
                        if (uVar5 == uVar23) goto code_r0x000a0cb0;
                      }
                      do {
                        pbVar18 = pbVar14 + 8;
                        *(int *)pbVar14 = iVar13;
                        *(int *)(pbVar15 + 0xc) = iVar13;
                        pbVar15 = pbVar14;
                        pbVar14 = pbVar18;
                      } while (pbVar18 < param_1);
                    }
                  }
                  else {
                    do {
                      pbVar14 = pbVar18 + -uVar23;
                      uVar24 = *(undefined8 *)pbVar14;
                      *(undefined8 *)(pbVar18 + 8) = *(undefined8 *)(pbVar14 + 8);
                      *(undefined8 *)pbVar18 = uVar24;
                      uVar24 = *(undefined8 *)(pbVar14 + 0x10);
                      *(undefined8 *)(pbVar18 + 0x18) = *(undefined8 *)(pbVar14 + 0x18);
                      *(undefined8 *)(pbVar18 + 0x10) = uVar24;
                      pbVar18 = pbVar18 + 0x20;
                    } while (pbVar18 < param_1);
                  }
code_r0x000a0cb0:
                  while( true ) {
                    puVar16 = (ushort *)((long)puVar4 + 1);
                    unaff_x21 = (ulong)(byte)*puVar4;
                    uVar5 = (ulong)(byte)((byte)*puVar4 >> 4);
                    if (uVar5 == 0xf) {
                      if (in_x16 <= puVar16) goto code_r0x000a13a0;
                      puVar4 = puVar4 + 1;
                      if (in_x16 < puVar4) goto LAB_000a1450;
                      in_x14 = (ulong)*(byte *)puVar16;
                      param_4 = puVar4;
                      if (in_x14 != 0xff) goto LAB_000a0ce8;
                      goto code_r0x000a0e10;
                    }
                    if (in_x15 < puVar16) goto code_r0x000a1300;
                    uVar24 = *(undefined8 *)puVar16;
                    *(undefined8 *)(param_1 + 8) = *(undefined8 *)((long)puVar4 + 9);
                    *(undefined8 *)param_1 = uVar24;
                    puVar16 = (ushort *)((long)puVar16 + uVar5);
                    pbVar18 = param_1 + uVar5;
                    puVar3 = puVar16 + 1;
                    uVar23 = (ulong)*puVar16;
                    pbVar14 = pbVar18 + -uVar23;
                    uVar12 = unaff_x21 & 0xf;
                    puVar4 = puVar3;
                    if (uVar12 == 0xf) goto code_r0x000a0d50;
code_r0x000a0db8:
                    uVar12 = uVar12 + 4;
                    param_1 = pbVar18 + uVar12;
                    if (param_5 <= param_1) goto code_r0x000a1220;
                    if (pbVar14 < unaff_x19 || (uint)uVar23 < 8) break;
                    *(undefined8 *)pbVar18 = *(undefined8 *)pbVar14;
                    *(undefined8 *)(pbVar18 + 8) = *(undefined8 *)(pbVar14 + 8);
                    *(undefined2 *)(pbVar18 + 0x10) = *(undefined2 *)(pbVar14 + 0x10);
                  }
                }
                goto LAB_000a1450;
              }
              break;
            }
          }
        }
      }
      goto LAB_000a1450;
    }
  } while( true );
code_r0x000a1220:
  if (unaff_x19 <= pbVar14) {
    param_1 = pbVar18 + uVar12;
    if (uVar23 < 8) {
      pbVar18[0] = 0;
      pbVar18[1] = 0;
      pbVar18[2] = 0;
      pbVar18[3] = 0;
      *pbVar18 = *pbVar14;
      pbVar18[1] = pbVar14[1];
      pbVar18[2] = pbVar14[2];
      pbVar18[3] = pbVar14[3];
      uVar22 = *(uint *)(&UNK_0080bed8 + uVar23 * 4);
      *(undefined4 *)(pbVar18 + 4) = *(undefined4 *)(pbVar14 + uVar22);
      pbVar15 = pbVar14 + uVar22 + -(long)*(int *)(&UNK_0080bef8 + uVar23 * 4);
      if (in_x10 + -0xc < param_1) goto code_r0x000a1404;
code_r0x000a124c:
      *(undefined8 *)(pbVar18 + 8) = *(undefined8 *)pbVar15;
      if (0x10 < uVar12) {
        pbVar14 = pbVar18 + 0x10;
        pbVar19 = pbVar18 + uVar12;
        if (pbVar18 + uVar12 <= pbVar18 + 0x18) {
          pbVar19 = pbVar18 + 0x18;
        }
        if ((segment_command_00000020.segname + 0xf < pbVar19 + (-0x11 - (long)pbVar18)) &&
           ((byte *)((long)&segment_command_00000020.vmaddr + 7) < pbVar18 + (8 - (long)pbVar15))) {
          uVar5 = ((ulong)(pbVar19 + (-0x11 - (long)pbVar18)) >> 3) + 1;
          uVar23 = uVar5 & 0x3ffffffffffffff8;
          pbVar14 = pbVar14 + uVar23 * 8;
          pbVar18 = pbVar18 + 0x20;
          uVar12 = uVar23;
          pbVar19 = pbVar15 + 0x28;
          do {
            uVar24 = *(undefined8 *)(pbVar19 + -0x20);
            uVar26 = *(undefined8 *)(pbVar19 + -8);
            uVar25 = *(undefined8 *)(pbVar19 + -0x10);
            uVar28 = *(undefined8 *)(pbVar19 + 8);
            uVar27 = *(undefined8 *)pbVar19;
            uVar30 = *(undefined8 *)(pbVar19 + 0x18);
            uVar29 = *(undefined8 *)(pbVar19 + 0x10);
            *(undefined8 *)(pbVar18 + -8) = *(undefined8 *)(pbVar19 + -0x18);
            *(undefined8 *)(pbVar18 + -0x10) = uVar24;
            *(undefined8 *)(pbVar18 + 8) = uVar26;
            *(undefined8 *)pbVar18 = uVar25;
            *(undefined8 *)(pbVar18 + 0x18) = uVar28;
            *(undefined8 *)(pbVar18 + 0x10) = uVar27;
            *(undefined8 *)(pbVar18 + 0x28) = uVar30;
            *(undefined8 *)(pbVar18 + 0x20) = uVar29;
            pbVar18 = pbVar18 + 0x40;
            uVar12 = uVar12 - 8;
            pbVar19 = pbVar19 + 0x40;
          } while (uVar12 != 0);
          pbVar15 = pbVar15 + uVar23 * 8;
          if (uVar5 == uVar23) goto code_r0x000a12a8;
        }
        do {
          pbVar18 = pbVar14 + 8;
          *(undefined8 *)pbVar14 = *(undefined8 *)(pbVar15 + 8);
          pbVar14 = pbVar18;
          pbVar15 = pbVar15 + 8;
        } while (pbVar18 < param_1);
      }
    }
    else {
      pbVar15 = pbVar14 + 8;
      *(undefined8 *)pbVar18 = *(undefined8 *)pbVar14;
      if (param_1 <= in_x10 + -0xc) goto code_r0x000a124c;
code_r0x000a1404:
      pbVar14 = pbVar18 + 8;
      if (in_x10 + -5 < param_1) goto LAB_000a1450;
      pbVar19 = in_x10 + -7;
      if (pbVar14 < pbVar19) {
        pbVar8 = unaff_x19 + in_x11 + -7;
        if (unaff_x19 + in_x11 + -7 <= pbVar18 + 0x10) {
          pbVar8 = pbVar18 + 0x10;
        }
        pbVar21 = pbVar15;
        if (pbVar8 + (-9 - (long)pbVar18) < (byte *)0x38) {
          pbVar7 = pbVar14;
code_r0x000a14d8:
          do {
            pbVar8 = pbVar7 + 8;
            *(undefined8 *)pbVar7 = *(undefined8 *)pbVar21;
            pbVar7 = pbVar8;
            pbVar21 = pbVar21 + 8;
          } while (pbVar8 < pbVar19);
        }
        else {
          pbVar7 = pbVar14;
          if (pbVar18 + (8 - (long)pbVar15) < (byte *)0x40) goto code_r0x000a14d8;
          uVar5 = ((ulong)(pbVar8 + (-9 - (long)pbVar18)) >> 3) + 1;
          uVar9 = uVar5 & 0x3ffffffffffffff8;
          pbVar21 = pbVar15 + uVar9 * 8;
          pbVar7 = pbVar14 + uVar9 * 8;
          pbVar8 = pbVar15 + 0x20;
          pbVar6 = pbVar18 + 0x28;
          uVar23 = uVar9;
          do {
            uVar24 = *(undefined8 *)(pbVar8 + -0x20);
            uVar26 = *(undefined8 *)(pbVar8 + -8);
            uVar25 = *(undefined8 *)(pbVar8 + -0x10);
            uVar28 = *(undefined8 *)(pbVar8 + 8);
            uVar27 = *(undefined8 *)pbVar8;
            uVar30 = *(undefined8 *)(pbVar8 + 0x18);
            uVar29 = *(undefined8 *)(pbVar8 + 0x10);
            *(undefined8 *)(pbVar6 + -0x18) = *(undefined8 *)(pbVar8 + -0x18);
            *(undefined8 *)(pbVar6 + -0x20) = uVar24;
            *(undefined8 *)(pbVar6 + -8) = uVar26;
            *(undefined8 *)(pbVar6 + -0x10) = uVar25;
            *(undefined8 *)(pbVar6 + 8) = uVar28;
            *(undefined8 *)pbVar6 = uVar27;
            *(undefined8 *)(pbVar6 + 0x18) = uVar30;
            *(undefined8 *)(pbVar6 + 0x10) = uVar29;
            uVar23 = uVar23 - 8;
            pbVar8 = pbVar8 + 0x40;
            pbVar6 = pbVar6 + 0x40;
          } while (uVar23 != 0);
          if (uVar5 != uVar9) goto code_r0x000a14d8;
        }
        lVar20 = (long)pbVar19 - (long)pbVar14;
        pbVar14 = pbVar19;
        pbVar19 = pbVar15 + lVar20;
      }
      else {
        pbVar19 = pbVar15;
      }
      if (pbVar14 < param_1) {
        pbVar8 = unaff_x19 + in_x11 + -7;
        if (unaff_x19 + in_x11 + -7 <= pbVar18 + 8) {
          pbVar8 = pbVar18 + 8;
        }
        pbVar21 = pbVar18 + (uVar12 - (long)pbVar8);
        if ((pbVar21 < (byte *)0x8) || (pbVar18 + (8 - (long)pbVar15) < (byte *)0x40)) {
          pbVar6 = pbVar14;
          pbVar7 = pbVar19;
        }
        else {
          pbVar10 = (byte *)0x0;
          if ((byte *)0x3f < pbVar21) {
            pbVar10 = (byte *)((ulong)pbVar21 & 0xffffffffffffffc0);
            pbVar6 = pbVar14 + 0x20;
            pbVar11 = pbVar15 + (long)(pbVar8 + (0x18 - (long)pbVar18));
            pbVar7 = pbVar10;
            do {
              uVar24 = *(undefined8 *)(pbVar11 + -0x20);
              uVar26 = *(undefined8 *)(pbVar11 + -8);
              uVar25 = *(undefined8 *)(pbVar11 + -0x10);
              uVar28 = *(undefined8 *)(pbVar11 + 8);
              uVar27 = *(undefined8 *)pbVar11;
              uVar30 = *(undefined8 *)(pbVar11 + 0x18);
              uVar29 = *(undefined8 *)(pbVar11 + 0x10);
              *(undefined8 *)(pbVar6 + -0x18) = *(undefined8 *)(pbVar11 + -0x18);
              *(undefined8 *)(pbVar6 + -0x20) = uVar24;
              *(undefined8 *)(pbVar6 + -8) = uVar26;
              *(undefined8 *)(pbVar6 + -0x10) = uVar25;
              *(undefined8 *)(pbVar6 + 8) = uVar28;
              *(undefined8 *)pbVar6 = uVar27;
              *(undefined8 *)(pbVar6 + 0x18) = uVar30;
              *(undefined8 *)(pbVar6 + 0x10) = uVar29;
              pbVar7 = pbVar7 + -0x40;
              pbVar6 = pbVar6 + 0x40;
              pbVar11 = pbVar11 + 0x40;
            } while (pbVar7 != (byte *)0x0);
            if (pbVar21 == pbVar10) goto code_r0x000a12a8;
            pbVar7 = pbVar19 + (long)pbVar10;
            pbVar6 = pbVar14 + (long)pbVar10;
            if (((ulong)pbVar21 & 0x38) == 0) goto code_r0x000a153c;
          }
          pbVar11 = (byte *)((ulong)pbVar21 & 0xfffffffffffffff8);
          pbVar6 = pbVar14 + (long)pbVar11;
          pbVar7 = pbVar19 + (long)pbVar11;
          lVar20 = (long)pbVar10 - (long)pbVar11;
          pbVar18 = pbVar15 + (long)(pbVar8 + (long)(pbVar10 + (-8 - (long)pbVar18)));
          pbVar14 = pbVar14 + (long)pbVar10;
          do {
            *(undefined8 *)pbVar14 = *(undefined8 *)pbVar18;
            lVar20 = lVar20 + 8;
            pbVar18 = pbVar18 + 8;
            pbVar14 = pbVar14 + 8;
          } while (lVar20 != 0);
          if (pbVar21 == pbVar11) goto code_r0x000a12a8;
        }
code_r0x000a153c:
        do {
          pbVar18 = pbVar6 + 1;
          *pbVar6 = *pbVar7;
          pbVar6 = pbVar18;
          pbVar7 = pbVar7 + 1;
        } while (pbVar18 < param_1);
      }
    }
code_r0x000a12a8:
    puVar16 = (ushort *)((long)puVar4 + 1);
    bVar1 = (byte)*puVar4;
    puVar3 = puVar4;
    while( true ) {
      unaff_x21 = (ulong)bVar1;
      uVar5 = (ulong)(bVar1 >> 4);
      if (uVar5 == 0xf) break;
      if ((in_x12 <= puVar16) || (in_x13 < param_1)) goto code_r0x000a1300;
      uVar24 = *(undefined8 *)puVar16;
      *(undefined8 *)(param_1 + 8) = *(undefined8 *)(puVar16 + 4);
      *(undefined8 *)param_1 = uVar24;
      puVar4 = (ushort *)((long)puVar16 + uVar5);
      uVar12 = unaff_x21 & 0xf;
      puVar3 = puVar4 + 1;
      uVar23 = (ulong)*puVar4;
      pbVar18 = param_1 + uVar5;
      pbVar14 = pbVar18 + -uVar23;
      if ((uVar12 == 0xf) || (*puVar4 < 8 || pbVar14 < unaff_x19)) goto code_r0x000a11d4;
      *(undefined8 *)pbVar18 = *(undefined8 *)pbVar14;
      *(undefined8 *)(pbVar18 + 8) = *(undefined8 *)(pbVar14 + 8);
      *(undefined2 *)(pbVar18 + 0x10) = *(undefined2 *)(pbVar14 + 0x10);
      param_1 = pbVar18 + uVar12 + 4;
      puVar16 = (ushort *)((long)puVar4 + 3);
      bVar1 = (byte)puVar4[1];
    }
    puVar17 = (ushort *)(in_x9 + -0xf);
    if (puVar17 <= puVar16) goto code_r0x000a13a0;
    puVar4 = puVar3 + 1;
    if (puVar17 < puVar4) goto LAB_000a1450;
    uVar5 = (ulong)(byte)*puVar16;
    if (uVar5 == 0xff) {
      do {
        puVar16 = puVar4;
        puVar4 = (ushort *)((long)puVar16 + 1);
        if (puVar17 < puVar4) goto LAB_000a1450;
        uVar5 = uVar5 + (byte)*puVar16;
      } while ((ulong)(byte)*puVar16 == 0xff);
      if (uVar5 == 0xffffffffffffffff) {
        puVar4 = (ushort *)((long)puVar16 + 1);
        goto LAB_000a1450;
      }
    }
    uVar5 = uVar5 + 0xf;
    if ((!CARRY8((ulong)param_1,uVar5)) && (!CARRY8((ulong)puVar4,uVar5))) {
code_r0x000a1118:
      pbVar18 = param_1 + uVar5;
      if (pbVar18 <= in_x10 + -0xc) goto code_r0x000a1128;
      goto code_r0x000a1314;
    }
  }
  goto LAB_000a1450;
code_r0x000a1300:
  puVar4 = puVar16;
  pbVar18 = param_1 + uVar5;
  if (in_x10 + -0xc < pbVar18) {
code_r0x000a1314:
    if (((byte *)((long)puVar4 + uVar5) == in_x9) && (pbVar18 <= in_x10)) {
      _memmove(param_1);
      return (int)pbVar18 - (int)unaff_x19;
    }
    goto LAB_000a1450;
  }
code_r0x000a1128:
  puVar16 = (ushort *)((long)puVar4 + uVar5);
  if (in_x9 + -8 < puVar16) goto code_r0x000a1314;
  pbVar14 = param_1 + uVar5;
  if (param_1 + uVar5 <= param_1 + 8) {
    pbVar14 = param_1 + 8;
  }
  if ((&segment_command_00000020.vmaddr <= pbVar14 + ~(ulong)param_1) &&
     (0x3f < (ulong)((long)param_1 - (long)puVar4))) {
    uVar5 = ((ulong)(pbVar14 + ~(ulong)param_1) >> 3) + 1;
    uVar23 = uVar5 & 0x3ffffffffffffff8;
    puVar3 = puVar4 + 0x10;
    uVar12 = uVar23;
    pbVar14 = param_1 + 0x20;
    do {
      uVar24 = *(undefined8 *)(puVar3 + -0x10);
      uVar26 = *(undefined8 *)(puVar3 + -4);
      uVar25 = *(undefined8 *)(puVar3 + -8);
      uVar28 = *(undefined8 *)(puVar3 + 4);
      uVar27 = *(undefined8 *)puVar3;
      uVar30 = *(undefined8 *)(puVar3 + 0xc);
      uVar29 = *(undefined8 *)(puVar3 + 8);
      *(undefined8 *)(pbVar14 + -0x18) = *(undefined8 *)(puVar3 + -0xc);
      *(undefined8 *)(pbVar14 + -0x20) = uVar24;
      *(undefined8 *)(pbVar14 + -8) = uVar26;
      *(undefined8 *)(pbVar14 + -0x10) = uVar25;
      *(undefined8 *)(pbVar14 + 8) = uVar28;
      *(undefined8 *)pbVar14 = uVar27;
      *(undefined8 *)(pbVar14 + 0x18) = uVar30;
      *(undefined8 *)(pbVar14 + 0x10) = uVar29;
      uVar12 = uVar12 - 8;
      puVar3 = puVar3 + 0x20;
      pbVar14 = pbVar14 + 0x40;
    } while (uVar12 != 0);
    puVar4 = puVar4 + uVar23 * 4;
    param_1 = param_1 + uVar23 * 8;
    if (uVar5 == uVar23) goto code_r0x000a11c4;
  }
  do {
    pbVar14 = param_1 + 8;
    *(undefined8 *)param_1 = *(undefined8 *)puVar4;
    puVar4 = puVar4 + 4;
    param_1 = pbVar14;
  } while (pbVar14 < pbVar18);
code_r0x000a11c4:
  puVar3 = puVar16 + 1;
  uVar23 = (ulong)*puVar16;
  pbVar14 = pbVar18 + -uVar23;
  uVar12 = unaff_x21 & 0xf;
code_r0x000a11d4:
  puVar4 = puVar3;
  if (uVar12 == 0xf) {
    puVar4 = (ushort *)((long)puVar3 + 1);
    if (in_x9 + -4 < puVar4) goto LAB_000a1450;
    uVar5 = (ulong)(byte)*puVar3;
    puVar16 = puVar4;
    if (uVar5 == 0xff) {
      do {
        puVar4 = (ushort *)((long)puVar16 + 1);
        if (in_x9 + -4 < puVar4) goto LAB_000a1450;
        uVar2 = *puVar16;
        uVar5 = uVar5 + (byte)uVar2;
        puVar16 = puVar4;
      } while ((ulong)(byte)uVar2 == 0xff);
    }
    uVar12 = uVar5 + 0xf;
    if ((uVar5 == 0xffffffffffffffff) || (CARRY8((ulong)pbVar18,uVar12))) goto LAB_000a1450;
  }
  uVar12 = uVar12 + 4;
  goto code_r0x000a1220;
code_r0x000a13a0:
  puVar4 = puVar16;
LAB_000a1450:
  return ~(uint)puVar4 + param_2;
}

