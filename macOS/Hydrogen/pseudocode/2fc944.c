
/* WARNING: Type propagation algorithm not settling */

bool FUN_002fc944(undefined8 param_1,undefined8 param_2,undefined8 param_3,char *param_4)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  undefined8 *puVar4;
  uint uVar5;
  bool bVar6;
  int iVar7;
  int iVar8;
  int iVar9;
  uint uVar10;
  undefined8 *puVar11;
  long lVar12;
  long lVar13;
  long *plVar14;
  ulong *puVar15;
  undefined4 uVar16;
  long lVar17;
  ulong uVar18;
  ulong uVar19;
  long lVar20;
  long lVar21;
  uint uVar22;
  ulong uVar23;
  ulong uVar24;
  undefined8 uVar25;
  long unaff_x20;
  long *plVar26;
  long *unaff_x23;
  undefined8 *puVar27;
  uint unaff_w25;
  int unaff_w28;
  long unaff_x29;
  undefined1 auVar28 [16];
  ulong in_stack_00000018;
  long in_stack_00000020;
  uint uStack0000000000000028;
  int iStack000000000000002c;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  long in_stack_00000040;
  long in_stack_00000048;
  char *in_stack_00000050;
  
code_r0x002fc944:
  func_0x0028f83c(param_1,param_2,param_3,param_4 + 0x171,0x3fd);
  do {
    uVar10 = func_0x0028edc4();
    func_0x002f7efc(unaff_x20);
    bVar6 = false;
    unaff_x20 = 0;
    if (((2 < unaff_w25) || ((uVar10 & 0xff000000) != 0x4000000)) ||
       (unaff_w25 = unaff_w25 + 1, (uVar10 & 0xfff) != 0x8d)) goto LAB_002fd4a8;
    func_0x0028f0e4();
    unaff_x20 = func_0x002f8ac4(0);
    if (unaff_x20 == 0) {
      bVar6 = false;
      goto LAB_002fd4a8;
    }
    uVar5 = *(uint *)(unaff_x23 + 1);
    uVar18 = (ulong)uVar5;
    uVar10 = uVar5 & (int)uVar5 >> 0x1f;
    lVar20 = uVar18 * 8;
    do {
      lVar20 = lVar20 + -8;
      uVar22 = (uint)uVar18;
      uVar18 = (ulong)(uVar22 - 1);
      if ((int)uVar22 < 1) {
        if (-1 < (int)uVar5) goto code_r0x002fc954;
        lVar21 = *unaff_x23;
        goto code_r0x002fc8ac;
      }
      lVar21 = *unaff_x23;
    } while (*(long *)(lVar21 + lVar20) == 0);
    uVar10 = uVar22;
code_r0x002fc8ac:
    uVar19 = *(ulong *)(lVar21 + (long)(int)(uVar10 - 1) * 8);
    uVar23 = uVar19 >> 0x20;
    uVar18 = uVar23;
    if (uVar23 == 0) {
      uVar18 = uVar19;
    }
    uVar24 = uVar18 >> 0x10;
    uVar1 = uVar24;
    if (uVar24 == 0) {
      uVar1 = uVar18;
    }
    uVar18 = uVar1 >> 8;
    if (uVar1 < 0x100) {
      uVar18 = uVar1;
    }
    uVar2 = uVar18 >> 4;
    if (uVar18 < 0x10) {
      uVar2 = uVar18;
    }
    uVar3 = uVar2 >> 2;
    if (uVar2 < 4) {
      uVar3 = uVar2;
    }
    uVar10 = (uint)(uVar19 != 0) | (uVar10 - 1) * 0x40 | (uint)(uVar23 != 0) << 5 |
             (uint)(uVar24 != 0) << 4 | (uint)(0xff < uVar1) << 3 | (uint)(0xf < uVar18) << 2 |
             (uint)(3 < uVar2) << 1;
    if (1 < uVar3) {
      uVar10 = uVar10 + 1;
    }
    if (0x20 < uVar10) break;
code_r0x002fc954:
    puVar11 = (undefined8 *)func_0x0036e31c(0x30);
    if (puVar11 != (undefined8 *)0x0) {
      puVar11[1] = 0;
      puVar11[2] = 0;
      puVar11[3] = 0;
      if (*(char *)(puVar11 + 5) == '\0') {
        uVar25 = puVar11[4];
        lVar20 = func_0x0036e48c(0,0x100);
        if (lVar20 == 0) {
          *(undefined2 *)(puVar11 + 5) = 0x101;
        }
        else {
          puVar11[3] = 0x20;
          *(undefined8 *)(lVar20 + puVar11[2] * 8) = uVar25;
          puVar11[1] = lVar20;
          puVar11[2] = puVar11[2] + 1;
        }
      }
      lVar20 = func_0x0029e340(puVar11);
      lVar21 = func_0x0029e340(puVar11);
      lVar12 = func_0x0029e340(puVar11);
      lVar13 = func_0x0029e340(puVar11);
      plVar14 = (long *)func_0x0029e340(puVar11);
      puVar15 = (ulong *)func_0x0029e340(puVar11);
      if ((((lVar20 == 0) || (lVar21 == 0)) ||
          ((lVar12 == 0 || ((lVar13 == 0 || (plVar14 == (long *)0x0)))))) ||
         (puVar15 == (ulong *)0x0)) goto LAB_002fd00c;
      iVar8 = (int)in_stack_00000048;
      if ((int)plVar14[1] <= iVar8) {
        iVar7 = func_0x0029afb8(plVar14,in_stack_00000038);
        if (iVar7 == 0) goto LAB_002fd00c;
        iVar7 = (int)plVar14[1];
        if (iVar7 <= iVar8) {
          _bzero(*plVar14 + (long)iVar7 * 8,(ulong)(uint)(iVar8 - iVar7) * 8 + 8);
        }
        *(int *)(plVar14 + 1) = (int)in_stack_00000038;
      }
      *(ulong *)(*plVar14 + in_stack_00000048 * 8) =
           *(ulong *)(*plVar14 + in_stack_00000048 * 8) | 0x10000000;
      iVar8 = (int)in_stack_00000040;
      if ((int)puVar15[1] <= iVar8) {
        iVar7 = func_0x0029afb8(puVar15,in_stack_00000030);
        if (iVar7 == 0) goto LAB_002fd00c;
        iVar7 = (int)puVar15[1];
        if (iVar7 <= iVar8) {
          _bzero(*puVar15 + (long)iVar7 * 8,(ulong)(uint)(iVar8 - iVar7) * 8 + 8);
        }
        *(int *)(puVar15 + 1) = (int)in_stack_00000030;
      }
      *(ulong *)(*puVar15 + in_stack_00000040 * 8) =
           *(ulong *)(*puVar15 + in_stack_00000040 * 8) | 1;
      if (*(long *)(unaff_x20 + 8) == 0) {
        lVar17 = func_0x0036e31c(0x18);
        if (lVar17 == 0) {
          *(undefined8 *)(unaff_x20 + 8) = 0;
          goto LAB_002fd00c;
        }
        *(undefined4 *)(lVar17 + 0x14) = 1;
        *(long *)(unaff_x20 + 8) = lVar17;
        lVar17 = *(long *)(unaff_x20 + 0x18);
      }
      else {
        lVar17 = *(long *)(unaff_x20 + 0x18);
      }
      if (lVar17 == 0) {
        lVar17 = func_0x0036e31c(0x18);
        if (lVar17 == 0) {
          *(undefined8 *)(unaff_x20 + 0x18) = 0;
          goto LAB_002fd00c;
        }
        *(undefined4 *)(lVar17 + 0x14) = 1;
        *(long *)(unaff_x20 + 0x18) = lVar17;
        lVar17 = *(long *)(unaff_x20 + 0x10);
      }
      else {
        lVar17 = *(long *)(unaff_x20 + 0x10);
      }
      if (lVar17 == 0) {
        lVar17 = func_0x0036e31c(0x18);
        if (lVar17 == 0) {
          *(undefined8 *)(unaff_x20 + 0x10) = 0;
          goto LAB_002fd00c;
        }
        *(undefined4 *)(lVar17 + 0x14) = 1;
        *(long *)(unaff_x20 + 0x10) = lVar17;
        lVar17 = *(long *)(unaff_x20 + 0x20);
      }
      else {
        lVar17 = *(long *)(unaff_x20 + 0x20);
      }
      if (lVar17 == 0) {
        lVar17 = func_0x0036e31c(0x18);
        if (lVar17 == 0) {
          *(undefined8 *)(unaff_x20 + 0x20) = 0;
          goto LAB_002fd00c;
        }
        *(undefined4 *)(lVar17 + 0x14) = 1;
        *(long *)(unaff_x20 + 0x20) = lVar17;
        lVar17 = *(long *)(unaff_x20 + 0x28);
      }
      else {
        lVar17 = *(long *)(unaff_x20 + 0x28);
      }
      if (lVar17 == 0) {
        lVar17 = func_0x0036e31c(0x18);
        if (lVar17 == 0) {
          *(undefined8 *)(unaff_x20 + 0x28) = 0;
          goto LAB_002fd00c;
        }
        *(undefined4 *)(lVar17 + 0x14) = 1;
        *(long *)(unaff_x20 + 0x28) = lVar17;
        lVar17 = *(long *)(unaff_x20 + 0x30);
      }
      else {
        lVar17 = *(long *)(unaff_x20 + 0x30);
      }
      if (lVar17 == 0) {
        lVar17 = func_0x0036e31c(0x18);
        if (lVar17 == 0) {
          *(undefined8 *)(unaff_x20 + 0x30) = 0;
          goto LAB_002fd00c;
        }
        *(undefined4 *)(lVar17 + 0x14) = 1;
        *(long *)(unaff_x20 + 0x30) = lVar17;
        lVar17 = *(long *)(unaff_x20 + 0x38);
      }
      else {
        lVar17 = *(long *)(unaff_x20 + 0x38);
      }
      if (lVar17 == 0) {
        lVar17 = func_0x0036e31c(0x18);
        if (lVar17 != 0) {
          *(undefined4 *)(lVar17 + 0x14) = 1;
          *(long *)(unaff_x20 + 0x38) = lVar17;
          plVar26 = *(long **)(unaff_x20 + 0x10);
          if (plVar26 == unaff_x23) goto code_r0x002fcc64;
          goto code_r0x002fcb2c;
        }
        *(undefined8 *)(unaff_x20 + 0x38) = 0;
        goto LAB_002fd00c;
      }
      plVar26 = *(long **)(unaff_x20 + 0x10);
      if (plVar26 == unaff_x23) {
code_r0x002fcc64:
        uVar18 = 0x20;
        iVar8 = func_0x0029c164(lVar13,&_aws_lc_0_24_0_kBoringSSLRSASqrtTwo,0x20);
      }
      else {
code_r0x002fcb2c:
        iVar8 = func_0x0029afb8(plVar26,(long)(int)unaff_x23[1]);
        if (iVar8 == 0) goto LAB_002fd00c;
        uVar16 = 0;
        if ((int)unaff_x23[1] != 0) {
          _memcpy(*plVar26,*unaff_x23,(long)(int)unaff_x23[1] << 3);
          uVar16 = (undefined4)unaff_x23[1];
        }
        *(undefined4 *)(plVar26 + 1) = uVar16;
        *(int *)(plVar26 + 2) = (int)unaff_x23[2];
        uVar18 = 0x20;
        iVar8 = func_0x0029c164(lVar13,&_aws_lc_0_24_0_kBoringSSLRSASqrtTwo,0x20);
      }
      if (iVar8 == 0) goto LAB_002fd00c;
      iVar8 = func_0x0029bf0c(lVar13);
      if (iVar8 != 0x800) goto code_r0x002fd4e8;
      if (uStack0000000000000028 < 0x1000) {
        uVar18 = in_stack_00000018 >> 0x20;
        iVar8 = func_0x0029f130(lVar13,lVar13,in_stack_00000018 >> 0x20);
        if (iVar8 == 0) goto LAB_002fd00c;
      }
      else if (uStack0000000000000028 != 0x1000) {
        iVar8 = func_0x0029b0e4(lVar13,1);
        if (iVar8 != 0) {
          uVar18 = in_stack_00000018 & 0xffffffff;
          iVar8 = func_0x0029ed38(lVar13,lVar13,uVar18);
          if (iVar8 != 0) goto code_r0x002fccfc;
        }
        goto LAB_002fd00c;
      }
code_r0x002fccfc:
      iVar8 = func_0x0029bf0c(lVar13);
      if (iStack000000000000002c != iVar8) goto code_r0x002fd4ec;
LAB_002fcd40:
      do {
        iVar8 = func_0x0031de90(*(undefined8 *)(unaff_x20 + 0x20),iStack000000000000002c,
                                *(undefined8 *)(unaff_x20 + 0x10),0,lVar13,plVar14,puVar11,
                                in_stack_00000050);
        if (iVar8 == 0) goto LAB_002fd00c;
        if (in_stack_00000050 != (char *)0x0) {
          if (*in_stack_00000050 == '\x01') {
            iVar8 = (**(code **)(in_stack_00000050 + 0x10))(3,0);
            if (iVar8 == 0) goto LAB_002fd00c;
          }
          else {
            if (*in_stack_00000050 != '\x02') goto LAB_002fd00c;
            (**(code **)(in_stack_00000050 + 0x10))(3,0);
          }
        }
        iVar8 = func_0x0031de90(*(undefined8 *)(unaff_x20 + 0x28),iStack000000000000002c,
                                *(undefined8 *)(unaff_x20 + 0x10),*(undefined8 *)(unaff_x20 + 0x20),
                                lVar13,plVar14,puVar11,in_stack_00000050);
        if (iVar8 == 0) goto LAB_002fd00c;
        if (in_stack_00000050 != (char *)0x0) {
          if (*in_stack_00000050 == '\x01') {
            iVar8 = (**(code **)(in_stack_00000050 + 0x10))(3,1);
            if (iVar8 == 0) goto LAB_002fd00c;
          }
          else {
            if (*in_stack_00000050 != '\x02') goto LAB_002fd00c;
            (**(code **)(in_stack_00000050 + 0x10))(3,1);
          }
        }
        puVar27 = *(undefined8 **)(unaff_x20 + 0x20);
        puVar4 = *(undefined8 **)(unaff_x20 + 0x28);
        if ((puVar27 == (undefined8 *)0x0) || (puVar4 == (undefined8 *)0x0)) {
          if (puVar27 != (undefined8 *)0x0) goto code_r0x002fce74;
          puVar27 = (undefined8 *)0x0;
        }
        else {
          iVar8 = *(int *)(puVar27 + 2);
          if (iVar8 == *(int *)(puVar4 + 2)) {
            iVar9 = func_0x0029d99c(*puVar27,(long)*(int *)(puVar27 + 1),*puVar4,
                                    (long)*(int *)(puVar4 + 1));
            iVar7 = -iVar9;
            if (iVar8 == 0) {
              iVar7 = iVar9;
            }
            if (iVar7 < 0) goto code_r0x002fce74;
          }
          else if (iVar8 != 0) {
code_r0x002fce74:
            *(undefined8 **)(unaff_x20 + 0x20) = puVar4;
            *(undefined8 **)(unaff_x20 + 0x28) = puVar27;
            puVar27 = puVar4;
          }
        }
        func_0x00373e9c(0xa29210,&DAT_0029be70);
        iVar8 = func_0x0029b864(lVar21,puVar27,0xa398c0);
        if (iVar8 == 0) goto LAB_002fd00c;
        uVar25 = *(undefined8 *)(unaff_x20 + 0x28);
        func_0x00373e9c(0xa29210,&DAT_0029be70);
        iVar8 = func_0x0029b864(lVar12,uVar25,0xa398c0);
        if ((iVar8 == 0) || (iVar8 = func_0x002a7f48(lVar20,lVar21,lVar12,puVar11), iVar8 == 0))
        goto LAB_002fd00c;
        uVar18 = *(ulong *)(unaff_x20 + 0x10);
        iVar8 = func_0x002a5b4c(*(undefined8 *)(unaff_x20 + 0x18),unaff_x29 + -0x54,uVar18,lVar20,
                                puVar11);
        if (iVar8 == 0) goto LAB_002fd00c;
        puVar27 = *(undefined8 **)(unaff_x20 + 0x18);
        if (puVar27 == (undefined8 *)0x0) break;
        iVar8 = *(int *)(puVar27 + 2);
        if (iVar8 == (int)puVar15[2]) {
          uVar18 = *puVar15;
          iVar9 = func_0x0029d99c(*puVar27,(long)*(int *)(puVar27 + 1),uVar18,(long)(int)puVar15[1])
          ;
          iVar7 = -iVar9;
          if (iVar8 == 0) {
            iVar7 = iVar9;
          }
          if (0 < iVar7) break;
          goto LAB_002fcd40;
        }
      } while (iVar8 != 0);
      iVar8 = func_0x0029bf0c(lVar21);
      if (iVar8 != iStack000000000000002c) goto LAB_002fd4f0;
      iVar8 = func_0x0029bf0c(lVar12);
      if (iVar8 == iStack000000000000002c) {
        iVar8 = func_0x002a80fc(*(undefined8 *)(unaff_x20 + 8),*(undefined8 *)(unaff_x20 + 0x20),
                                *(undefined8 *)(unaff_x20 + 0x28),puVar11);
        if ((iVar8 == 0) ||
           (iVar8 = func_0x0029f764(0,*(undefined8 *)(unaff_x20 + 0x30),
                                    *(undefined8 *)(unaff_x20 + 0x18),lVar21,iStack000000000000002c,
                                    puVar11), iVar8 == 0)) goto LAB_002fd00c;
        uVar18 = *(ulong *)(unaff_x20 + 0x18);
        iVar8 = func_0x0029f764(0,*(undefined8 *)(unaff_x20 + 0x38),uVar18,lVar12,
                                iStack000000000000002c,puVar11);
        if (iVar8 == 0) goto LAB_002fd00c;
        plVar14 = *(long **)(unaff_x20 + 8);
        uVar10 = *(uint *)(plVar14 + 1);
        uVar19 = (ulong)uVar10;
        lVar20 = uVar19 * 8;
        do {
          lVar20 = lVar20 + -8;
          iVar8 = (int)uVar19;
          uVar19 = (ulong)(iVar8 - 1);
          if (iVar8 < 1) {
            *(uint *)(plVar14 + 1) = uVar10 & (int)uVar10 >> 0x1f;
            if (-1 < (int)uVar10) {
              *(undefined4 *)(plVar14 + 2) = 0;
            }
            goto LAB_002fd0d4;
          }
        } while (*(long *)(*plVar14 + lVar20) == 0);
        *(int *)(plVar14 + 1) = iVar8;
LAB_002fd0d4:
        uVar10 = func_0x0029bf0c();
        if (uVar10 != uStack0000000000000028) {
          uVar18 = 0x44;
          func_0x0028f83c(4,0,0x44,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x471);
          goto joined_r0x002fd154;
        }
        iVar8 = func_0x002fbc24(unaff_x20,puVar11);
        if (iVar8 == 0) goto LAB_002fd00c;
        iVar8 = func_0x002f77a0(unaff_x20);
        if (iVar8 == 0) {
          uVar18 = 0x7c;
          func_0x0028f83c(4,0,0x7c,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x47f);
          goto joined_r0x002fd154;
        }
        bVar6 = false;
        goto joined_r0x002fd104;
      }
LAB_002fd4f4:
      func_0x0079f0e8();
LAB_002fd4f8:
      auVar28 = func_0x0079db28();
      if ((auVar28._8_4_ < 0x800) || ((auVar28._8_8_ & 0x7f) != 0)) {
        func_0x0028f83c(4,0,0x68,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x4f3);
        return false;
      }
      puVar11 = (undefined8 *)func_0x0036e31c(0x18);
      if (puVar11 == (undefined8 *)0x0) {
        return false;
      }
      *(undefined4 *)((long)puVar11 + 0x14) = 1;
      if (*(int *)((long)puVar11 + 0xc) == 0) {
        puVar27 = (undefined8 *)func_0x0036e358(1,8);
        if (puVar27 == (undefined8 *)0x0) {
          bVar6 = false;
          uVar10 = *(uint *)((long)puVar11 + 0x14);
          goto joined_r0x002fd65c;
        }
        if (*(int *)(puVar11 + 1) != 0) {
          _memcpy(puVar27,*puVar11,(long)*(int *)(puVar11 + 1) << 3);
        }
        func_0x0036e3d8(*puVar11);
        *puVar11 = puVar27;
        *(undefined4 *)((long)puVar11 + 0xc) = 1;
      }
      else {
        puVar27 = (undefined8 *)*puVar11;
      }
      *(undefined4 *)(puVar11 + 2) = 0;
      *puVar27 = &UNK_00010001;
      *(undefined4 *)(puVar11 + 1) = 1;
      iVar8 = func_0x002fc6b0(auVar28._0_8_,auVar28._8_8_,puVar11,uVar18,1);
      bVar6 = iVar8 != 0;
      uVar10 = *(uint *)((long)puVar11 + 0x14);
joined_r0x002fd65c:
      if ((uVar10 >> 1 & 1) == 0) {
        func_0x0036e3d8(*puVar11);
        uVar10 = *(uint *)((long)puVar11 + 0x14);
      }
      if ((uVar10 & 1) == 0) {
        *puVar11 = 0;
        return bVar6;
      }
      func_0x0036e3d8(puVar11);
      return bVar6;
    }
LAB_002fd00c:
    uVar18 = 3;
    func_0x0028f83c(4,0,3,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x487);
joined_r0x002fd154:
    bVar6 = true;
joined_r0x002fd104:
    if (puVar11 != (undefined8 *)0x0) {
      if (*(char *)(puVar11 + 5) == '\0') {
        if (puVar11[2] == 0) {
          func_0x0079db4c();
code_r0x002fd4e8:
          func_0x0079f160();
code_r0x002fd4ec:
          func_0x0079f138();
LAB_002fd4f0:
          func_0x0079f110();
          goto LAB_002fd4f4;
        }
        lVar20 = puVar11[2] + -1;
        puVar11[2] = lVar20;
        lVar20 = *(long *)(puVar11[1] + lVar20 * 8);
        puVar11[4] = lVar20;
        if (lVar20 != 0) goto LAB_002fd4f8;
      }
      func_0x00373520(*puVar11,&DAT_00302244,&_aws_lc_0_24_0_BN_free);
      func_0x0036e3d8(puVar11[1]);
      func_0x0036e3d8(puVar11);
    }
    if (!bVar6) {
      if ((unaff_w28 == 0) || (iVar8 = func_0x002fb278(unaff_x20), iVar8 != 0)) {
        func_0x002f8cb0(in_stack_00000020);
        puVar11 = *(undefined8 **)(in_stack_00000020 + 8);
        if (puVar11 != (undefined8 *)0x0) {
          uVar10 = *(uint *)((long)puVar11 + 0x14);
          if ((uVar10 >> 1 & 1) == 0) {
            func_0x0036e3d8(*puVar11);
            uVar10 = *(uint *)((long)puVar11 + 0x14);
          }
          if ((uVar10 & 1) == 0) {
            *puVar11 = 0;
          }
          else {
            func_0x0036e3d8(puVar11);
          }
        }
        *(undefined8 *)(in_stack_00000020 + 8) = *(undefined8 *)(unaff_x20 + 8);
        *(undefined8 *)(unaff_x20 + 8) = 0;
        puVar11 = *(undefined8 **)(in_stack_00000020 + 0x10);
        if (puVar11 != (undefined8 *)0x0) {
          uVar10 = *(uint *)((long)puVar11 + 0x14);
          if ((uVar10 >> 1 & 1) == 0) {
            func_0x0036e3d8(*puVar11);
            uVar10 = *(uint *)((long)puVar11 + 0x14);
          }
          if ((uVar10 & 1) == 0) {
            *puVar11 = 0;
          }
          else {
            func_0x0036e3d8(puVar11);
          }
        }
        *(undefined8 *)(in_stack_00000020 + 0x10) = *(undefined8 *)(unaff_x20 + 0x10);
        *(undefined8 *)(unaff_x20 + 0x10) = 0;
        puVar11 = *(undefined8 **)(in_stack_00000020 + 0x18);
        if (puVar11 != (undefined8 *)0x0) {
          uVar10 = *(uint *)((long)puVar11 + 0x14);
          if ((uVar10 >> 1 & 1) == 0) {
            func_0x0036e3d8(*puVar11);
            uVar10 = *(uint *)((long)puVar11 + 0x14);
          }
          if ((uVar10 & 1) == 0) {
            *puVar11 = 0;
          }
          else {
            func_0x0036e3d8(puVar11);
          }
        }
        *(undefined8 *)(in_stack_00000020 + 0x18) = *(undefined8 *)(unaff_x20 + 0x18);
        *(undefined8 *)(unaff_x20 + 0x18) = 0;
        puVar11 = *(undefined8 **)(in_stack_00000020 + 0x20);
        if (puVar11 != (undefined8 *)0x0) {
          uVar10 = *(uint *)((long)puVar11 + 0x14);
          if ((uVar10 >> 1 & 1) == 0) {
            func_0x0036e3d8(*puVar11);
            uVar10 = *(uint *)((long)puVar11 + 0x14);
          }
          if ((uVar10 & 1) == 0) {
            *puVar11 = 0;
          }
          else {
            func_0x0036e3d8(puVar11);
          }
        }
        *(undefined8 *)(in_stack_00000020 + 0x20) = *(undefined8 *)(unaff_x20 + 0x20);
        *(undefined8 *)(unaff_x20 + 0x20) = 0;
        puVar11 = *(undefined8 **)(in_stack_00000020 + 0x28);
        if (puVar11 != (undefined8 *)0x0) {
          uVar10 = *(uint *)((long)puVar11 + 0x14);
          if ((uVar10 >> 1 & 1) == 0) {
            func_0x0036e3d8(*puVar11);
            uVar10 = *(uint *)((long)puVar11 + 0x14);
          }
          if ((uVar10 & 1) == 0) {
            *puVar11 = 0;
          }
          else {
            func_0x0036e3d8(puVar11);
          }
        }
        *(undefined8 *)(in_stack_00000020 + 0x28) = *(undefined8 *)(unaff_x20 + 0x28);
        *(undefined8 *)(unaff_x20 + 0x28) = 0;
        puVar11 = *(undefined8 **)(in_stack_00000020 + 0x30);
        if (puVar11 != (undefined8 *)0x0) {
          uVar10 = *(uint *)((long)puVar11 + 0x14);
          if ((uVar10 >> 1 & 1) == 0) {
            func_0x0036e3d8(*puVar11);
            uVar10 = *(uint *)((long)puVar11 + 0x14);
          }
          if ((uVar10 & 1) == 0) {
            *puVar11 = 0;
          }
          else {
            func_0x0036e3d8(puVar11);
          }
        }
        *(undefined8 *)(in_stack_00000020 + 0x30) = *(undefined8 *)(unaff_x20 + 0x30);
        *(undefined8 *)(unaff_x20 + 0x30) = 0;
        puVar11 = *(undefined8 **)(in_stack_00000020 + 0x38);
        if (puVar11 != (undefined8 *)0x0) {
          uVar10 = *(uint *)((long)puVar11 + 0x14);
          if ((uVar10 >> 1 & 1) == 0) {
            func_0x0036e3d8(*puVar11);
            uVar10 = *(uint *)((long)puVar11 + 0x14);
          }
          if ((uVar10 & 1) == 0) {
            *puVar11 = 0;
          }
          else {
            func_0x0036e3d8(puVar11);
          }
        }
        *(undefined8 *)(in_stack_00000020 + 0x38) = *(undefined8 *)(unaff_x20 + 0x38);
        *(undefined8 *)(unaff_x20 + 0x38) = 0;
        puVar11 = *(undefined8 **)(in_stack_00000020 + 0x40);
        if (puVar11 != (undefined8 *)0x0) {
          uVar10 = *(uint *)((long)puVar11 + 0x14);
          if ((uVar10 >> 1 & 1) == 0) {
            func_0x0036e3d8(*puVar11);
            uVar10 = *(uint *)((long)puVar11 + 0x14);
          }
          if ((uVar10 & 1) == 0) {
            *puVar11 = 0;
          }
          else {
            func_0x0036e3d8(puVar11);
          }
        }
        *(undefined8 *)(in_stack_00000020 + 0x40) = *(undefined8 *)(unaff_x20 + 0x40);
        *(undefined8 *)(unaff_x20 + 0x40) = 0;
        func_0x002a34e0(*(undefined8 *)(in_stack_00000020 + 0x128));
        *(undefined8 *)(in_stack_00000020 + 0x128) = *(undefined8 *)(unaff_x20 + 0x128);
        *(undefined8 *)(unaff_x20 + 0x128) = 0;
        func_0x002a34e0(*(undefined8 *)(in_stack_00000020 + 0x130));
        *(undefined8 *)(in_stack_00000020 + 0x130) = *(undefined8 *)(unaff_x20 + 0x130);
        *(undefined8 *)(unaff_x20 + 0x130) = 0;
        func_0x002a34e0(*(undefined8 *)(in_stack_00000020 + 0x138));
        *(undefined8 *)(in_stack_00000020 + 0x138) = *(undefined8 *)(unaff_x20 + 0x138);
        *(undefined8 *)(unaff_x20 + 0x138) = 0;
        puVar11 = *(undefined8 **)(in_stack_00000020 + 0x140);
        if (puVar11 != (undefined8 *)0x0) {
          uVar10 = *(uint *)((long)puVar11 + 0x14);
          if ((uVar10 >> 1 & 1) == 0) {
            func_0x0036e3d8(*puVar11);
            uVar10 = *(uint *)((long)puVar11 + 0x14);
          }
          if ((uVar10 & 1) == 0) {
            *puVar11 = 0;
          }
          else {
            func_0x0036e3d8(puVar11);
          }
        }
        *(undefined8 *)(in_stack_00000020 + 0x140) = *(undefined8 *)(unaff_x20 + 0x140);
        *(undefined8 *)(unaff_x20 + 0x140) = 0;
        puVar11 = *(undefined8 **)(in_stack_00000020 + 0x148);
        if (puVar11 != (undefined8 *)0x0) {
          uVar10 = *(uint *)((long)puVar11 + 0x14);
          if ((uVar10 >> 1 & 1) == 0) {
            func_0x0036e3d8(*puVar11);
            uVar10 = *(uint *)((long)puVar11 + 0x14);
          }
          if ((uVar10 & 1) == 0) {
            *puVar11 = 0;
          }
          else {
            func_0x0036e3d8(puVar11);
          }
        }
        *(undefined8 *)(in_stack_00000020 + 0x148) = *(undefined8 *)(unaff_x20 + 0x148);
        *(undefined8 *)(unaff_x20 + 0x148) = 0;
        puVar11 = *(undefined8 **)(in_stack_00000020 + 0x150);
        if (puVar11 != (undefined8 *)0x0) {
          uVar10 = *(uint *)((long)puVar11 + 0x14);
          if ((uVar10 >> 1 & 1) == 0) {
            func_0x0036e3d8(*puVar11);
            uVar10 = *(uint *)((long)puVar11 + 0x14);
          }
          if ((uVar10 & 1) == 0) {
            *puVar11 = 0;
          }
          else {
            func_0x0036e3d8(puVar11);
          }
        }
        *(undefined8 *)(in_stack_00000020 + 0x150) = *(undefined8 *)(unaff_x20 + 0x150);
        *(undefined8 *)(unaff_x20 + 0x150) = 0;
        puVar11 = *(undefined8 **)(in_stack_00000020 + 0x158);
        if (puVar11 != (undefined8 *)0x0) {
          uVar10 = *(uint *)((long)puVar11 + 0x14);
          if ((uVar10 >> 1 & 1) == 0) {
            func_0x0036e3d8(*puVar11);
            uVar10 = *(uint *)((long)puVar11 + 0x14);
          }
          if ((uVar10 & 1) == 0) {
            *puVar11 = 0;
          }
          else {
            func_0x0036e3d8(puVar11);
          }
        }
        *(undefined8 *)(in_stack_00000020 + 0x158) = *(undefined8 *)(unaff_x20 + 0x158);
        *(undefined8 *)(unaff_x20 + 0x158) = 0;
        *(byte *)(in_stack_00000020 + 0x180) =
             *(byte *)(in_stack_00000020 + 0x180) & 0xfe | *(byte *)(unaff_x20 + 0x180) & 1;
        bVar6 = true;
LAB_002fd4a8:
        func_0x002f7efc(unaff_x20);
      }
      else {
        func_0x002f7efc(unaff_x20);
        bVar6 = false;
      }
      return bVar6;
    }
  } while( true );
  param_1 = 4;
  param_2 = 0;
  param_3 = 0x65;
  param_4 = "= 0";
  goto code_r0x002fc944;
}

