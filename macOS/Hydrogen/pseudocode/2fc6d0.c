
/* WARNING: Type propagation algorithm not settling */

bool FUN_002fc6d0(long param_1,uint param_2,long *param_3,char *param_4,int param_5)

{
  int iVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  undefined8 *puVar5;
  uint uVar6;
  uint uVar7;
  uint uVar8;
  bool bVar9;
  uint uVar10;
  int iVar11;
  int iVar12;
  uint uVar13;
  long lVar14;
  undefined8 *puVar15;
  long lVar16;
  long lVar17;
  long *plVar18;
  ulong *puVar19;
  undefined4 uVar20;
  long lVar21;
  ulong uVar22;
  ulong uVar23;
  long lVar24;
  long lVar25;
  uint uVar26;
  ulong uVar27;
  ulong uVar28;
  undefined8 uVar29;
  long *plVar30;
  undefined8 *puVar31;
  uint uVar32;
  long unaff_x29;
  undefined1 auVar33 [16];
  
  uVar10 = param_2 & 0xffffff80;
  if (0xff < (int)uVar10) {
    uVar32 = 0;
    uVar7 = uVar10 >> 1;
    uVar8 = uVar7 - 100 >> 6;
    param_2 = param_2 >> 7;
    do {
      func_0x0028f0e4();
      lVar14 = func_0x002f8ac4(0);
      if (lVar14 == 0) {
        bVar9 = false;
        goto LAB_002fd4a8;
      }
      uVar6 = *(uint *)(param_3 + 1);
      uVar22 = (ulong)uVar6;
      uVar13 = uVar6 & (int)uVar6 >> 0x1f;
      lVar24 = uVar22 * 8;
      do {
        lVar24 = lVar24 + -8;
        uVar26 = (uint)uVar22;
        uVar22 = (ulong)(uVar26 - 1);
        if ((int)uVar26 < 1) {
          if (-1 < (int)uVar6) goto code_r0x002fc954;
          lVar25 = *param_3;
          goto code_r0x002fc8ac;
        }
        lVar25 = *param_3;
      } while (*(long *)(lVar25 + lVar24) == 0);
      uVar13 = uVar26;
code_r0x002fc8ac:
      uVar23 = *(ulong *)(lVar25 + (long)(int)(uVar13 - 1) * 8);
      uVar27 = uVar23 >> 0x20;
      uVar22 = uVar27;
      if (uVar27 == 0) {
        uVar22 = uVar23;
      }
      uVar28 = uVar22 >> 0x10;
      uVar2 = uVar28;
      if (uVar28 == 0) {
        uVar2 = uVar22;
      }
      uVar22 = uVar2 >> 8;
      if (uVar2 < 0x100) {
        uVar22 = uVar2;
      }
      uVar3 = uVar22 >> 4;
      if (uVar22 < 0x10) {
        uVar3 = uVar22;
      }
      uVar4 = uVar3 >> 2;
      if (uVar3 < 4) {
        uVar4 = uVar3;
      }
      uVar13 = (uint)(uVar23 != 0) | (uVar13 - 1) * 0x40 | (uint)(uVar27 != 0) << 5 |
               (uint)(uVar28 != 0) << 4 | (uint)(0xff < uVar2) << 3 | (uint)(0xf < uVar22) << 2 |
               (uint)(3 < uVar3) << 1;
      if (1 < uVar4) {
        uVar13 = uVar13 + 1;
      }
      if (uVar13 < 0x21) {
code_r0x002fc954:
        puVar15 = (undefined8 *)func_0x0036e31c(0x30);
        if (puVar15 != (undefined8 *)0x0) {
          puVar15[1] = 0;
          puVar15[2] = 0;
          puVar15[3] = 0;
          if (*(char *)(puVar15 + 5) == '\0') {
            uVar29 = puVar15[4];
            lVar24 = func_0x0036e48c(0,0x100);
            if (lVar24 == 0) {
              *(undefined2 *)(puVar15 + 5) = 0x101;
            }
            else {
              puVar15[3] = 0x20;
              *(undefined8 *)(lVar24 + puVar15[2] * 8) = uVar29;
              puVar15[1] = lVar24;
              puVar15[2] = puVar15[2] + 1;
            }
          }
          lVar24 = func_0x0029e340(puVar15);
          lVar25 = func_0x0029e340(puVar15);
          lVar16 = func_0x0029e340(puVar15);
          lVar17 = func_0x0029e340(puVar15);
          plVar18 = (long *)func_0x0029e340(puVar15);
          puVar19 = (ulong *)func_0x0029e340(puVar15);
          if ((((lVar24 == 0) || (lVar25 == 0)) || (lVar16 == 0)) ||
             (((lVar17 == 0 || (plVar18 == (long *)0x0)) || (puVar19 == (ulong *)0x0))))
          goto LAB_002fd00c;
          if ((int)plVar18[1] <= (int)uVar8) {
            iVar11 = func_0x0029afb8(plVar18,uVar8 + 1);
            if (iVar11 == 0) goto LAB_002fd00c;
            iVar11 = (int)plVar18[1];
            if (iVar11 <= (int)uVar8) {
              _bzero(*plVar18 + (long)iVar11 * 8,(ulong)(uVar8 - iVar11) * 8 + 8);
            }
            *(uint *)(plVar18 + 1) = uVar8 + 1;
          }
          *(ulong *)(*plVar18 + (ulong)uVar8 * 8) =
               *(ulong *)(*plVar18 + (ulong)uVar8 * 8) | 0x10000000;
          if ((int)puVar19[1] <= (int)param_2) {
            iVar11 = func_0x0029afb8(puVar19,param_2 + 1);
            if (iVar11 == 0) goto LAB_002fd00c;
            iVar11 = (int)puVar19[1];
            if (iVar11 <= (int)param_2) {
              _bzero(*puVar19 + (long)iVar11 * 8,(ulong)(param_2 - iVar11) * 8 + 8);
            }
            *(uint *)(puVar19 + 1) = param_2 + 1;
          }
          *(ulong *)(*puVar19 + (ulong)param_2 * 8) = *(ulong *)(*puVar19 + (ulong)param_2 * 8) | 1;
          if (*(long *)(lVar14 + 8) == 0) {
            lVar21 = func_0x0036e31c(0x18);
            if (lVar21 == 0) {
              *(undefined8 *)(lVar14 + 8) = 0;
              goto LAB_002fd00c;
            }
            *(undefined4 *)(lVar21 + 0x14) = 1;
            *(long *)(lVar14 + 8) = lVar21;
            lVar21 = *(long *)(lVar14 + 0x18);
          }
          else {
            lVar21 = *(long *)(lVar14 + 0x18);
          }
          if (lVar21 == 0) {
            lVar21 = func_0x0036e31c(0x18);
            if (lVar21 == 0) {
              *(undefined8 *)(lVar14 + 0x18) = 0;
              goto LAB_002fd00c;
            }
            *(undefined4 *)(lVar21 + 0x14) = 1;
            *(long *)(lVar14 + 0x18) = lVar21;
            lVar21 = *(long *)(lVar14 + 0x10);
          }
          else {
            lVar21 = *(long *)(lVar14 + 0x10);
          }
          if (lVar21 == 0) {
            lVar21 = func_0x0036e31c(0x18);
            if (lVar21 == 0) {
              *(undefined8 *)(lVar14 + 0x10) = 0;
              goto LAB_002fd00c;
            }
            *(undefined4 *)(lVar21 + 0x14) = 1;
            *(long *)(lVar14 + 0x10) = lVar21;
            lVar21 = *(long *)(lVar14 + 0x20);
          }
          else {
            lVar21 = *(long *)(lVar14 + 0x20);
          }
          if (lVar21 == 0) {
            lVar21 = func_0x0036e31c(0x18);
            if (lVar21 == 0) {
              *(undefined8 *)(lVar14 + 0x20) = 0;
              goto LAB_002fd00c;
            }
            *(undefined4 *)(lVar21 + 0x14) = 1;
            *(long *)(lVar14 + 0x20) = lVar21;
            lVar21 = *(long *)(lVar14 + 0x28);
          }
          else {
            lVar21 = *(long *)(lVar14 + 0x28);
          }
          if (lVar21 == 0) {
            lVar21 = func_0x0036e31c(0x18);
            if (lVar21 == 0) {
              *(undefined8 *)(lVar14 + 0x28) = 0;
              goto LAB_002fd00c;
            }
            *(undefined4 *)(lVar21 + 0x14) = 1;
            *(long *)(lVar14 + 0x28) = lVar21;
            lVar21 = *(long *)(lVar14 + 0x30);
          }
          else {
            lVar21 = *(long *)(lVar14 + 0x30);
          }
          if (lVar21 == 0) {
            lVar21 = func_0x0036e31c(0x18);
            if (lVar21 == 0) {
              *(undefined8 *)(lVar14 + 0x30) = 0;
              goto LAB_002fd00c;
            }
            *(undefined4 *)(lVar21 + 0x14) = 1;
            *(long *)(lVar14 + 0x30) = lVar21;
            lVar21 = *(long *)(lVar14 + 0x38);
          }
          else {
            lVar21 = *(long *)(lVar14 + 0x38);
          }
          if (lVar21 == 0) {
            lVar21 = func_0x0036e31c(0x18);
            if (lVar21 != 0) {
              *(undefined4 *)(lVar21 + 0x14) = 1;
              *(long *)(lVar14 + 0x38) = lVar21;
              plVar30 = *(long **)(lVar14 + 0x10);
              if (plVar30 == param_3) goto code_r0x002fcc64;
              goto code_r0x002fcb2c;
            }
            *(undefined8 *)(lVar14 + 0x38) = 0;
            goto LAB_002fd00c;
          }
          plVar30 = *(long **)(lVar14 + 0x10);
          if (plVar30 == param_3) {
code_r0x002fcc64:
            uVar22 = 0x20;
            iVar11 = func_0x0029c164(lVar17,&_aws_lc_0_24_0_kBoringSSLRSASqrtTwo,0x20);
          }
          else {
code_r0x002fcb2c:
            iVar11 = func_0x0029afb8(plVar30,(long)(int)param_3[1]);
            if (iVar11 == 0) goto LAB_002fd00c;
            uVar20 = 0;
            if ((int)param_3[1] != 0) {
              _memcpy(*plVar30,*param_3,(long)(int)param_3[1] << 3);
              uVar20 = (undefined4)param_3[1];
            }
            *(undefined4 *)(plVar30 + 1) = uVar20;
            *(int *)(plVar30 + 2) = (int)param_3[2];
            uVar22 = 0x20;
            iVar11 = func_0x0029c164(lVar17,&_aws_lc_0_24_0_kBoringSSLRSASqrtTwo,0x20);
          }
          if (iVar11 == 0) goto LAB_002fd00c;
          iVar11 = func_0x0029bf0c(lVar17);
          if (iVar11 != 0x800) goto code_r0x002fd4e8;
          if (uVar10 < 0x1000) {
            uVar22 = (ulong)(0x800 - uVar7);
            iVar11 = func_0x0029f130(lVar17,lVar17,uVar22);
            if (iVar11 == 0) goto LAB_002fd00c;
          }
          else if (uVar10 != 0x1000) {
            iVar11 = func_0x0029b0e4(lVar17,1);
            if (iVar11 != 0) {
              uVar22 = (ulong)(uVar7 - 0x800);
              iVar11 = func_0x0029ed38(lVar17,lVar17,uVar22);
              if (iVar11 != 0) goto code_r0x002fccfc;
            }
            goto LAB_002fd00c;
          }
code_r0x002fccfc:
          uVar13 = func_0x0029bf0c(lVar17);
          if (uVar7 != uVar13) goto code_r0x002fd4ec;
LAB_002fcd40:
          do {
            iVar11 = func_0x0031de90(*(undefined8 *)(lVar14 + 0x20),uVar7,
                                     *(undefined8 *)(lVar14 + 0x10),0,lVar17,plVar18,puVar15,param_4
                                    );
            if (iVar11 == 0) goto LAB_002fd00c;
            if (param_4 != (char *)0x0) {
              if (*param_4 == '\x01') {
                iVar11 = (**(code **)(param_4 + 0x10))(3,0);
                if (iVar11 == 0) goto LAB_002fd00c;
              }
              else {
                if (*param_4 != '\x02') goto LAB_002fd00c;
                (**(code **)(param_4 + 0x10))(3,0);
              }
            }
            iVar11 = func_0x0031de90(*(undefined8 *)(lVar14 + 0x28),uVar7,
                                     *(undefined8 *)(lVar14 + 0x10),*(undefined8 *)(lVar14 + 0x20),
                                     lVar17,plVar18,puVar15,param_4);
            if (iVar11 == 0) goto LAB_002fd00c;
            if (param_4 != (char *)0x0) {
              if (*param_4 == '\x01') {
                iVar11 = (**(code **)(param_4 + 0x10))(3,1);
                if (iVar11 == 0) goto LAB_002fd00c;
              }
              else {
                if (*param_4 != '\x02') goto LAB_002fd00c;
                (**(code **)(param_4 + 0x10))(3,1);
              }
            }
            puVar31 = *(undefined8 **)(lVar14 + 0x20);
            puVar5 = *(undefined8 **)(lVar14 + 0x28);
            if ((puVar31 == (undefined8 *)0x0) || (puVar5 == (undefined8 *)0x0)) {
              if (puVar31 != (undefined8 *)0x0) goto code_r0x002fce74;
              puVar31 = (undefined8 *)0x0;
            }
            else {
              iVar11 = *(int *)(puVar31 + 2);
              if (iVar11 == *(int *)(puVar5 + 2)) {
                iVar12 = func_0x0029d99c(*puVar31,(long)*(int *)(puVar31 + 1),*puVar5,
                                         (long)*(int *)(puVar5 + 1));
                iVar1 = -iVar12;
                if (iVar11 == 0) {
                  iVar1 = iVar12;
                }
                if (iVar1 < 0) goto code_r0x002fce74;
              }
              else if (iVar11 != 0) {
code_r0x002fce74:
                *(undefined8 **)(lVar14 + 0x20) = puVar5;
                *(undefined8 **)(lVar14 + 0x28) = puVar31;
                puVar31 = puVar5;
              }
            }
            func_0x00373e9c(0xa29210,&DAT_0029be70);
            iVar11 = func_0x0029b864(lVar25,puVar31,0xa398c0);
            if (iVar11 == 0) goto LAB_002fd00c;
            uVar29 = *(undefined8 *)(lVar14 + 0x28);
            func_0x00373e9c(0xa29210,&DAT_0029be70);
            iVar11 = func_0x0029b864(lVar16,uVar29,0xa398c0);
            if ((iVar11 == 0) ||
               (iVar11 = func_0x002a7f48(lVar24,lVar25,lVar16,puVar15), iVar11 == 0))
            goto LAB_002fd00c;
            uVar22 = *(ulong *)(lVar14 + 0x10);
            iVar11 = func_0x002a5b4c(*(undefined8 *)(lVar14 + 0x18),unaff_x29 + -0x54,uVar22,lVar24,
                                     puVar15);
            if (iVar11 == 0) goto LAB_002fd00c;
            puVar31 = *(undefined8 **)(lVar14 + 0x18);
            if (puVar31 == (undefined8 *)0x0) break;
            iVar11 = *(int *)(puVar31 + 2);
            if (iVar11 == (int)puVar19[2]) {
              uVar22 = *puVar19;
              iVar12 = func_0x0029d99c(*puVar31,(long)*(int *)(puVar31 + 1),uVar22,
                                       (long)(int)puVar19[1]);
              iVar1 = -iVar12;
              if (iVar11 == 0) {
                iVar1 = iVar12;
              }
              if (0 < iVar1) break;
              goto LAB_002fcd40;
            }
          } while (iVar11 != 0);
          uVar13 = func_0x0029bf0c(lVar25);
          if (uVar13 != uVar7) goto LAB_002fd4f0;
          uVar13 = func_0x0029bf0c(lVar16);
          if (uVar13 == uVar7) {
            iVar11 = func_0x002a80fc(*(undefined8 *)(lVar14 + 8),*(undefined8 *)(lVar14 + 0x20),
                                     *(undefined8 *)(lVar14 + 0x28),puVar15);
            if ((iVar11 == 0) ||
               (iVar11 = func_0x0029f764(0,*(undefined8 *)(lVar14 + 0x30),
                                         *(undefined8 *)(lVar14 + 0x18),lVar25,uVar7,puVar15),
               iVar11 == 0)) goto LAB_002fd00c;
            uVar22 = *(ulong *)(lVar14 + 0x18);
            iVar11 = func_0x0029f764(0,*(undefined8 *)(lVar14 + 0x38),uVar22,lVar16,uVar7,puVar15);
            if (iVar11 == 0) goto LAB_002fd00c;
            plVar18 = *(long **)(lVar14 + 8);
            uVar13 = *(uint *)(plVar18 + 1);
            uVar23 = (ulong)uVar13;
            lVar24 = uVar23 * 8;
            do {
              lVar24 = lVar24 + -8;
              iVar11 = (int)uVar23;
              uVar23 = (ulong)(iVar11 - 1);
              if (iVar11 < 1) {
                *(uint *)(plVar18 + 1) = uVar13 & (int)uVar13 >> 0x1f;
                if (-1 < (int)uVar13) {
                  *(undefined4 *)(plVar18 + 2) = 0;
                }
                goto LAB_002fd0d4;
              }
            } while (*(long *)(*plVar18 + lVar24) == 0);
            *(int *)(plVar18 + 1) = iVar11;
LAB_002fd0d4:
            uVar13 = func_0x0029bf0c();
            if (uVar13 != uVar10) {
              uVar22 = 0x44;
              func_0x0028f83c(4,0,0x44,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x471);
              goto joined_r0x002fd154;
            }
            iVar11 = func_0x002fbc24(lVar14,puVar15);
            if (iVar11 == 0) goto LAB_002fd00c;
            iVar11 = func_0x002f77a0(lVar14);
            if (iVar11 == 0) {
              uVar22 = 0x7c;
              func_0x0028f83c(4,0,0x7c,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x47f);
              goto joined_r0x002fd154;
            }
            bVar9 = false;
            goto joined_r0x002fd104;
          }
LAB_002fd4f4:
          func_0x0079f0e8();
LAB_002fd4f8:
          auVar33 = func_0x0079db28();
          if ((auVar33._8_4_ < 0x800) || ((auVar33._8_8_ & 0x7f) != 0)) {
            func_0x0028f83c(4,0,0x68,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x4f3);
            return false;
          }
          puVar15 = (undefined8 *)func_0x0036e31c(0x18);
          if (puVar15 == (undefined8 *)0x0) {
            return false;
          }
          *(undefined4 *)((long)puVar15 + 0x14) = 1;
          if (*(int *)((long)puVar15 + 0xc) == 0) {
            puVar31 = (undefined8 *)func_0x0036e358(1,8);
            if (puVar31 == (undefined8 *)0x0) {
              bVar9 = false;
              uVar10 = *(uint *)((long)puVar15 + 0x14);
              goto joined_r0x002fd65c;
            }
            if (*(int *)(puVar15 + 1) != 0) {
              _memcpy(puVar31,*puVar15,(long)*(int *)(puVar15 + 1) << 3);
            }
            func_0x0036e3d8(*puVar15);
            *puVar15 = puVar31;
            *(undefined4 *)((long)puVar15 + 0xc) = 1;
          }
          else {
            puVar31 = (undefined8 *)*puVar15;
          }
          *(undefined4 *)(puVar15 + 2) = 0;
          *puVar31 = &UNK_00010001;
          *(undefined4 *)(puVar15 + 1) = 1;
          iVar11 = func_0x002fc6b0(auVar33._0_8_,auVar33._8_8_,puVar15,uVar22,1);
          bVar9 = iVar11 != 0;
          uVar10 = *(uint *)((long)puVar15 + 0x14);
joined_r0x002fd65c:
          if ((uVar10 >> 1 & 1) == 0) {
            func_0x0036e3d8(*puVar15);
            uVar10 = *(uint *)((long)puVar15 + 0x14);
          }
          if ((uVar10 & 1) == 0) {
            *puVar15 = 0;
            return bVar9;
          }
          func_0x0036e3d8(puVar15);
          return bVar9;
        }
LAB_002fd00c:
        uVar22 = 3;
        func_0x0028f83c(4,0,3,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x487);
joined_r0x002fd154:
        bVar9 = true;
joined_r0x002fd104:
        if (puVar15 != (undefined8 *)0x0) {
          if (*(char *)(puVar15 + 5) == '\0') {
            if (puVar15[2] == 0) {
              func_0x0079db4c();
code_r0x002fd4e8:
              func_0x0079f160();
code_r0x002fd4ec:
              func_0x0079f138();
LAB_002fd4f0:
              func_0x0079f110();
              goto LAB_002fd4f4;
            }
            lVar24 = puVar15[2] + -1;
            puVar15[2] = lVar24;
            lVar24 = *(long *)(puVar15[1] + lVar24 * 8);
            puVar15[4] = lVar24;
            if (lVar24 != 0) goto LAB_002fd4f8;
          }
          func_0x00373520(*puVar15,&DAT_00302244,&_aws_lc_0_24_0_BN_free);
          func_0x0036e3d8(puVar15[1]);
          func_0x0036e3d8(puVar15);
        }
        if (!bVar9) {
          if ((param_5 != 0) && (iVar11 = func_0x002fb278(lVar14), iVar11 == 0)) {
            func_0x002f7efc(lVar14);
            return false;
          }
          func_0x002f8cb0(param_1);
          puVar15 = *(undefined8 **)(param_1 + 8);
          if (puVar15 != (undefined8 *)0x0) {
            uVar10 = *(uint *)((long)puVar15 + 0x14);
            if ((uVar10 >> 1 & 1) == 0) {
              func_0x0036e3d8(*puVar15);
              uVar10 = *(uint *)((long)puVar15 + 0x14);
            }
            if ((uVar10 & 1) == 0) {
              *puVar15 = 0;
            }
            else {
              func_0x0036e3d8(puVar15);
            }
          }
          *(undefined8 *)(param_1 + 8) = *(undefined8 *)(lVar14 + 8);
          *(undefined8 *)(lVar14 + 8) = 0;
          puVar15 = *(undefined8 **)(param_1 + 0x10);
          if (puVar15 != (undefined8 *)0x0) {
            uVar10 = *(uint *)((long)puVar15 + 0x14);
            if ((uVar10 >> 1 & 1) == 0) {
              func_0x0036e3d8(*puVar15);
              uVar10 = *(uint *)((long)puVar15 + 0x14);
            }
            if ((uVar10 & 1) == 0) {
              *puVar15 = 0;
            }
            else {
              func_0x0036e3d8(puVar15);
            }
          }
          *(undefined8 *)(param_1 + 0x10) = *(undefined8 *)(lVar14 + 0x10);
          *(undefined8 *)(lVar14 + 0x10) = 0;
          puVar15 = *(undefined8 **)(param_1 + 0x18);
          if (puVar15 != (undefined8 *)0x0) {
            uVar10 = *(uint *)((long)puVar15 + 0x14);
            if ((uVar10 >> 1 & 1) == 0) {
              func_0x0036e3d8(*puVar15);
              uVar10 = *(uint *)((long)puVar15 + 0x14);
            }
            if ((uVar10 & 1) == 0) {
              *puVar15 = 0;
            }
            else {
              func_0x0036e3d8(puVar15);
            }
          }
          *(undefined8 *)(param_1 + 0x18) = *(undefined8 *)(lVar14 + 0x18);
          *(undefined8 *)(lVar14 + 0x18) = 0;
          puVar15 = *(undefined8 **)(param_1 + 0x20);
          if (puVar15 != (undefined8 *)0x0) {
            uVar10 = *(uint *)((long)puVar15 + 0x14);
            if ((uVar10 >> 1 & 1) == 0) {
              func_0x0036e3d8(*puVar15);
              uVar10 = *(uint *)((long)puVar15 + 0x14);
            }
            if ((uVar10 & 1) == 0) {
              *puVar15 = 0;
            }
            else {
              func_0x0036e3d8(puVar15);
            }
          }
          *(undefined8 *)(param_1 + 0x20) = *(undefined8 *)(lVar14 + 0x20);
          *(undefined8 *)(lVar14 + 0x20) = 0;
          puVar15 = *(undefined8 **)(param_1 + 0x28);
          if (puVar15 != (undefined8 *)0x0) {
            uVar10 = *(uint *)((long)puVar15 + 0x14);
            if ((uVar10 >> 1 & 1) == 0) {
              func_0x0036e3d8(*puVar15);
              uVar10 = *(uint *)((long)puVar15 + 0x14);
            }
            if ((uVar10 & 1) == 0) {
              *puVar15 = 0;
            }
            else {
              func_0x0036e3d8(puVar15);
            }
          }
          *(undefined8 *)(param_1 + 0x28) = *(undefined8 *)(lVar14 + 0x28);
          *(undefined8 *)(lVar14 + 0x28) = 0;
          puVar15 = *(undefined8 **)(param_1 + 0x30);
          if (puVar15 != (undefined8 *)0x0) {
            uVar10 = *(uint *)((long)puVar15 + 0x14);
            if ((uVar10 >> 1 & 1) == 0) {
              func_0x0036e3d8(*puVar15);
              uVar10 = *(uint *)((long)puVar15 + 0x14);
            }
            if ((uVar10 & 1) == 0) {
              *puVar15 = 0;
            }
            else {
              func_0x0036e3d8(puVar15);
            }
          }
          *(undefined8 *)(param_1 + 0x30) = *(undefined8 *)(lVar14 + 0x30);
          *(undefined8 *)(lVar14 + 0x30) = 0;
          puVar15 = *(undefined8 **)(param_1 + 0x38);
          if (puVar15 != (undefined8 *)0x0) {
            uVar10 = *(uint *)((long)puVar15 + 0x14);
            if ((uVar10 >> 1 & 1) == 0) {
              func_0x0036e3d8(*puVar15);
              uVar10 = *(uint *)((long)puVar15 + 0x14);
            }
            if ((uVar10 & 1) == 0) {
              *puVar15 = 0;
            }
            else {
              func_0x0036e3d8(puVar15);
            }
          }
          *(undefined8 *)(param_1 + 0x38) = *(undefined8 *)(lVar14 + 0x38);
          *(undefined8 *)(lVar14 + 0x38) = 0;
          puVar15 = *(undefined8 **)(param_1 + 0x40);
          if (puVar15 != (undefined8 *)0x0) {
            uVar10 = *(uint *)((long)puVar15 + 0x14);
            if ((uVar10 >> 1 & 1) == 0) {
              func_0x0036e3d8(*puVar15);
              uVar10 = *(uint *)((long)puVar15 + 0x14);
            }
            if ((uVar10 & 1) == 0) {
              *puVar15 = 0;
            }
            else {
              func_0x0036e3d8(puVar15);
            }
          }
          *(undefined8 *)(param_1 + 0x40) = *(undefined8 *)(lVar14 + 0x40);
          *(undefined8 *)(lVar14 + 0x40) = 0;
          func_0x002a34e0(*(undefined8 *)(param_1 + 0x128));
          *(undefined8 *)(param_1 + 0x128) = *(undefined8 *)(lVar14 + 0x128);
          *(undefined8 *)(lVar14 + 0x128) = 0;
          func_0x002a34e0(*(undefined8 *)(param_1 + 0x130));
          *(undefined8 *)(param_1 + 0x130) = *(undefined8 *)(lVar14 + 0x130);
          *(undefined8 *)(lVar14 + 0x130) = 0;
          func_0x002a34e0(*(undefined8 *)(param_1 + 0x138));
          *(undefined8 *)(param_1 + 0x138) = *(undefined8 *)(lVar14 + 0x138);
          *(undefined8 *)(lVar14 + 0x138) = 0;
          puVar15 = *(undefined8 **)(param_1 + 0x140);
          if (puVar15 != (undefined8 *)0x0) {
            uVar10 = *(uint *)((long)puVar15 + 0x14);
            if ((uVar10 >> 1 & 1) == 0) {
              func_0x0036e3d8(*puVar15);
              uVar10 = *(uint *)((long)puVar15 + 0x14);
            }
            if ((uVar10 & 1) == 0) {
              *puVar15 = 0;
            }
            else {
              func_0x0036e3d8(puVar15);
            }
          }
          *(undefined8 *)(param_1 + 0x140) = *(undefined8 *)(lVar14 + 0x140);
          *(undefined8 *)(lVar14 + 0x140) = 0;
          puVar15 = *(undefined8 **)(param_1 + 0x148);
          if (puVar15 != (undefined8 *)0x0) {
            uVar10 = *(uint *)((long)puVar15 + 0x14);
            if ((uVar10 >> 1 & 1) == 0) {
              func_0x0036e3d8(*puVar15);
              uVar10 = *(uint *)((long)puVar15 + 0x14);
            }
            if ((uVar10 & 1) == 0) {
              *puVar15 = 0;
            }
            else {
              func_0x0036e3d8(puVar15);
            }
          }
          *(undefined8 *)(param_1 + 0x148) = *(undefined8 *)(lVar14 + 0x148);
          *(undefined8 *)(lVar14 + 0x148) = 0;
          puVar15 = *(undefined8 **)(param_1 + 0x150);
          if (puVar15 != (undefined8 *)0x0) {
            uVar10 = *(uint *)((long)puVar15 + 0x14);
            if ((uVar10 >> 1 & 1) == 0) {
              func_0x0036e3d8(*puVar15);
              uVar10 = *(uint *)((long)puVar15 + 0x14);
            }
            if ((uVar10 & 1) == 0) {
              *puVar15 = 0;
            }
            else {
              func_0x0036e3d8(puVar15);
            }
          }
          *(undefined8 *)(param_1 + 0x150) = *(undefined8 *)(lVar14 + 0x150);
          *(undefined8 *)(lVar14 + 0x150) = 0;
          puVar15 = *(undefined8 **)(param_1 + 0x158);
          if (puVar15 != (undefined8 *)0x0) {
            uVar10 = *(uint *)((long)puVar15 + 0x14);
            if ((uVar10 >> 1 & 1) == 0) {
              func_0x0036e3d8(*puVar15);
              uVar10 = *(uint *)((long)puVar15 + 0x14);
            }
            if ((uVar10 & 1) == 0) {
              *puVar15 = 0;
            }
            else {
              func_0x0036e3d8(puVar15);
            }
          }
          *(undefined8 *)(param_1 + 0x158) = *(undefined8 *)(lVar14 + 0x158);
          *(undefined8 *)(lVar14 + 0x158) = 0;
          *(byte *)(param_1 + 0x180) =
               *(byte *)(param_1 + 0x180) & 0xfe | *(byte *)(lVar14 + 0x180) & 1;
          bVar9 = true;
          goto LAB_002fd4a8;
        }
      }
      else {
        func_0x0028f83c(4,0,0x65,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x3fd);
      }
      uVar13 = func_0x0028edc4();
      func_0x002f7efc(lVar14);
      bVar9 = false;
      lVar14 = 0;
      if (((2 < uVar32) || ((uVar13 & 0xff000000) != 0x4000000)) ||
         (uVar32 = uVar32 + 1, (uVar13 & 0xfff) != 0x8d)) goto LAB_002fd4a8;
    } while( true );
  }
  func_0x0028f0e4();
  lVar14 = func_0x002f8ac4(0);
  if (lVar14 == 0) {
LAB_002fd15c:
    bVar9 = false;
    lVar14 = 0;
  }
  else {
    func_0x0028f83c(4,0,0x7e,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x3f2);
    uVar10 = func_0x0028edc4();
    func_0x002f7efc(lVar14);
    if ((uVar10 & 0xff000fff) == 0x400008d) {
      func_0x0028f0e4();
      lVar14 = func_0x002f8ac4(0);
      if (lVar14 == 0) goto LAB_002fd15c;
      func_0x0028f83c(4,0,0x7e,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x3f2);
      uVar10 = func_0x0028edc4();
      func_0x002f7efc(lVar14);
      if ((uVar10 & 0xff000fff) == 0x400008d) {
        func_0x0028f0e4();
        lVar14 = func_0x002f8ac4(0);
        if (lVar14 == 0) goto LAB_002fd15c;
        func_0x0028f83c(4,0,0x7e,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x3f2);
        uVar10 = func_0x0028edc4();
        func_0x002f7efc(lVar14);
        if ((uVar10 & 0xff000fff) == 0x400008d) {
          func_0x0028f0e4();
          lVar14 = func_0x002f8ac4(0);
          if (lVar14 == 0) goto LAB_002fd15c;
          func_0x0028f83c(4,0,0x7e,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x3f2);
          func_0x0028edc4();
          func_0x002f7efc(lVar14);
        }
      }
    }
    lVar14 = 0;
    bVar9 = false;
  }
LAB_002fd4a8:
  func_0x002f7efc(lVar14);
  return bVar9;
}

