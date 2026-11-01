
bool FUN_002fca54(ulong param_1,long param_2)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  uint uVar4;
  bool bVar5;
  int iVar6;
  int iVar7;
  int iVar8;
  uint uVar9;
  ulong uVar10;
  undefined4 uVar11;
  long lVar12;
  ulong uVar13;
  long lVar14;
  uint uVar15;
  ulong uVar16;
  ulong uVar17;
  undefined8 uVar18;
  long *unaff_x19;
  undefined8 *puVar19;
  long unaff_x20;
  long unaff_x21;
  long *plVar20;
  long *unaff_x23;
  undefined8 *puVar21;
  long unaff_x24;
  uint unaff_w25;
  undefined8 *unaff_x26;
  ulong *unaff_x27;
  int unaff_w28;
  long unaff_x29;
  undefined1 auVar22 [16];
  ulong in_stack_00000018;
  long in_stack_00000020;
  uint uStack0000000000000028;
  int iStack000000000000002c;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  long in_stack_00000040;
  long in_stack_00000048;
  char *in_stack_00000050;
  long in_stack_00000058;
  long in_stack_00000060;
  
code_r0x002fca54:
  _bzero(param_2,(param_1 & 0xffffffff) * 8 + 8);
code_r0x002fca64:
  *(int *)(unaff_x19 + 1) = (int)in_stack_00000038;
code_r0x002fca6c:
  *(ulong *)(*unaff_x19 + in_stack_00000048 * 8) =
       *(ulong *)(*unaff_x19 + in_stack_00000048 * 8) | 0x10000000;
  iVar7 = (int)in_stack_00000040;
  if ((int)unaff_x27[1] <= iVar7) {
    iVar6 = func_0x0029afb8(unaff_x27,in_stack_00000030);
    if (iVar6 == 0) goto LAB_002fd00c;
    iVar6 = (int)unaff_x27[1];
    if (iVar6 <= iVar7) {
      _bzero(*unaff_x27 + (long)iVar6 * 8,(ulong)(uint)(iVar7 - iVar6) * 8 + 8);
    }
    *(int *)(unaff_x27 + 1) = (int)in_stack_00000030;
  }
  *(ulong *)(*unaff_x27 + in_stack_00000040 * 8) =
       *(ulong *)(*unaff_x27 + in_stack_00000040 * 8) | 1;
  if (*(long *)(unaff_x20 + 8) == 0) {
    lVar12 = func_0x0036e31c(0x18);
    if (lVar12 == 0) {
      *(undefined8 *)(unaff_x20 + 8) = 0;
      goto LAB_002fd00c;
    }
    *(undefined4 *)(lVar12 + 0x14) = 1;
    *(long *)(unaff_x20 + 8) = lVar12;
    if (*(long *)(unaff_x20 + 0x18) != 0) goto code_r0x002fcaf8;
LAB_002fcba0:
    lVar12 = func_0x0036e31c(0x18);
    if (lVar12 == 0) {
      *(undefined8 *)(unaff_x20 + 0x18) = 0;
      goto LAB_002fd00c;
    }
    *(undefined4 *)(lVar12 + 0x14) = 1;
    *(long *)(unaff_x20 + 0x18) = lVar12;
    if (*(long *)(unaff_x20 + 0x10) != 0) goto code_r0x002fcb00;
LAB_002fcbc0:
    lVar12 = func_0x0036e31c(0x18);
    if (lVar12 == 0) {
      *(undefined8 *)(unaff_x20 + 0x10) = 0;
      goto LAB_002fd00c;
    }
    *(undefined4 *)(lVar12 + 0x14) = 1;
    *(long *)(unaff_x20 + 0x10) = lVar12;
    if (*(long *)(unaff_x20 + 0x20) != 0) goto code_r0x002fcb08;
LAB_002fcbe0:
    lVar12 = func_0x0036e31c(0x18);
    if (lVar12 == 0) {
      *(undefined8 *)(unaff_x20 + 0x20) = 0;
      goto LAB_002fd00c;
    }
    *(undefined4 *)(lVar12 + 0x14) = 1;
    *(long *)(unaff_x20 + 0x20) = lVar12;
    if (*(long *)(unaff_x20 + 0x28) != 0) goto code_r0x002fcb10;
LAB_002fcc00:
    lVar12 = func_0x0036e31c(0x18);
    if (lVar12 == 0) {
      *(undefined8 *)(unaff_x20 + 0x28) = 0;
      goto LAB_002fd00c;
    }
    *(undefined4 *)(lVar12 + 0x14) = 1;
    *(long *)(unaff_x20 + 0x28) = lVar12;
    if (*(long *)(unaff_x20 + 0x30) != 0) goto code_r0x002fcb18;
LAB_002fcc20:
    lVar12 = func_0x0036e31c(0x18);
    if (lVar12 == 0) {
      *(undefined8 *)(unaff_x20 + 0x30) = 0;
      goto LAB_002fd00c;
    }
    *(undefined4 *)(lVar12 + 0x14) = 1;
    *(long *)(unaff_x20 + 0x30) = lVar12;
    if (*(long *)(unaff_x20 + 0x38) != 0) goto code_r0x002fcb20;
LAB_002fcc40:
    lVar12 = func_0x0036e31c(0x18);
    if (lVar12 == 0) {
      *(undefined8 *)(unaff_x20 + 0x38) = 0;
      goto LAB_002fd00c;
    }
    *(undefined4 *)(lVar12 + 0x14) = 1;
    *(long *)(unaff_x20 + 0x38) = lVar12;
    plVar20 = *(long **)(unaff_x20 + 0x10);
    if (plVar20 != unaff_x23) goto code_r0x002fcb2c;
LAB_002fcc64:
    uVar10 = 0x20;
    iVar7 = func_0x0029c164(unaff_x24,&_aws_lc_0_24_0_kBoringSSLRSASqrtTwo,0x20);
  }
  else {
    if (*(long *)(unaff_x20 + 0x18) == 0) goto LAB_002fcba0;
code_r0x002fcaf8:
    if (*(long *)(unaff_x20 + 0x10) == 0) goto LAB_002fcbc0;
code_r0x002fcb00:
    if (*(long *)(unaff_x20 + 0x20) == 0) goto LAB_002fcbe0;
code_r0x002fcb08:
    if (*(long *)(unaff_x20 + 0x28) == 0) goto LAB_002fcc00;
code_r0x002fcb10:
    if (*(long *)(unaff_x20 + 0x30) == 0) goto LAB_002fcc20;
code_r0x002fcb18:
    if (*(long *)(unaff_x20 + 0x38) == 0) goto LAB_002fcc40;
code_r0x002fcb20:
    plVar20 = *(long **)(unaff_x20 + 0x10);
    if (plVar20 == unaff_x23) goto LAB_002fcc64;
code_r0x002fcb2c:
    iVar7 = func_0x0029afb8(plVar20,(long)(int)unaff_x23[1]);
    if (iVar7 == 0) goto LAB_002fd00c;
    uVar11 = 0;
    if ((int)unaff_x23[1] != 0) {
      _memcpy(*plVar20,*unaff_x23,(long)(int)unaff_x23[1] << 3);
      uVar11 = (undefined4)unaff_x23[1];
    }
    *(undefined4 *)(plVar20 + 1) = uVar11;
    *(int *)(plVar20 + 2) = (int)unaff_x23[2];
    uVar10 = 0x20;
    iVar7 = func_0x0029c164(unaff_x24,&_aws_lc_0_24_0_kBoringSSLRSASqrtTwo,0x20);
  }
  if (iVar7 == 0) goto LAB_002fd00c;
  iVar7 = func_0x0029bf0c(unaff_x24);
  if (iVar7 == 0x800) {
    if (uStack0000000000000028 < 0x1000) {
      uVar10 = in_stack_00000018 >> 0x20;
      iVar7 = func_0x0029f130(unaff_x24,unaff_x24,in_stack_00000018 >> 0x20);
joined_r0x002fccf8:
      if (iVar7 == 0) goto LAB_002fd00c;
    }
    else if (uStack0000000000000028 != 0x1000) {
      iVar7 = func_0x0029b0e4(unaff_x24,1);
      if (iVar7 == 0) goto LAB_002fd00c;
      uVar10 = in_stack_00000018 & 0xffffffff;
      iVar7 = func_0x0029ed38(unaff_x24,unaff_x24,uVar10);
      goto joined_r0x002fccf8;
    }
    iVar7 = func_0x0029bf0c(unaff_x24);
    if (iStack000000000000002c != iVar7) goto code_r0x002fd4ec;
code_r0x002fcd40:
    do {
      iVar7 = func_0x0031de90(*(undefined8 *)(unaff_x20 + 0x20),iStack000000000000002c,
                              *(undefined8 *)(unaff_x20 + 0x10),0,unaff_x24,unaff_x19,unaff_x26,
                              in_stack_00000050);
      if (iVar7 == 0) goto LAB_002fd00c;
      if (in_stack_00000050 != (char *)0x0) {
        if (*in_stack_00000050 == '\x01') {
          iVar7 = (**(code **)(in_stack_00000050 + 0x10))(3,0);
          if (iVar7 == 0) goto LAB_002fd00c;
        }
        else {
          if (*in_stack_00000050 != '\x02') goto LAB_002fd00c;
          (**(code **)(in_stack_00000050 + 0x10))(3,0);
        }
      }
      iVar7 = func_0x0031de90(*(undefined8 *)(unaff_x20 + 0x28),iStack000000000000002c,
                              *(undefined8 *)(unaff_x20 + 0x10),*(undefined8 *)(unaff_x20 + 0x20),
                              unaff_x24,unaff_x19,unaff_x26,in_stack_00000050);
      if (iVar7 == 0) goto LAB_002fd00c;
      if (in_stack_00000050 != (char *)0x0) {
        if (*in_stack_00000050 == '\x01') {
          iVar7 = (**(code **)(in_stack_00000050 + 0x10))(3,1);
          if (iVar7 == 0) goto LAB_002fd00c;
        }
        else {
          if (*in_stack_00000050 != '\x02') goto LAB_002fd00c;
          (**(code **)(in_stack_00000050 + 0x10))(3,1);
        }
      }
      puVar19 = *(undefined8 **)(unaff_x20 + 0x20);
      puVar21 = *(undefined8 **)(unaff_x20 + 0x28);
      if ((puVar19 == (undefined8 *)0x0) || (puVar21 == (undefined8 *)0x0)) {
        if (puVar19 != (undefined8 *)0x0) goto code_r0x002fce74;
        puVar19 = (undefined8 *)0x0;
      }
      else {
        iVar7 = *(int *)(puVar19 + 2);
        if (iVar7 == *(int *)(puVar21 + 2)) {
          iVar8 = func_0x0029d99c(*puVar19,(long)*(int *)(puVar19 + 1),*puVar21,
                                  (long)*(int *)(puVar21 + 1));
          iVar6 = -iVar8;
          if (iVar7 == 0) {
            iVar6 = iVar8;
          }
          if (iVar6 < 0) goto code_r0x002fce74;
        }
        else if (iVar7 != 0) {
code_r0x002fce74:
          *(undefined8 **)(unaff_x20 + 0x20) = puVar21;
          *(undefined8 **)(unaff_x20 + 0x28) = puVar19;
          puVar19 = puVar21;
        }
      }
      func_0x00373e9c(0xa29210,&DAT_0029be70);
      iVar7 = func_0x0029b864(in_stack_00000060,puVar19,0xa398c0);
      if (iVar7 == 0) goto LAB_002fd00c;
      uVar18 = *(undefined8 *)(unaff_x20 + 0x28);
      func_0x00373e9c(0xa29210,&DAT_0029be70);
      iVar7 = func_0x0029b864(unaff_x21,uVar18,0xa398c0);
      if ((iVar7 == 0) ||
         (iVar7 = func_0x002a7f48(in_stack_00000058,in_stack_00000060,unaff_x21,unaff_x26),
         iVar7 == 0)) goto LAB_002fd00c;
      uVar10 = *(ulong *)(unaff_x20 + 0x10);
      iVar7 = func_0x002a5b4c(*(undefined8 *)(unaff_x20 + 0x18),unaff_x29 + -0x54,uVar10,
                              in_stack_00000058,unaff_x26);
      if (iVar7 == 0) goto LAB_002fd00c;
      puVar19 = *(undefined8 **)(unaff_x20 + 0x18);
      if (puVar19 == (undefined8 *)0x0) break;
      iVar7 = *(int *)(puVar19 + 2);
      if (iVar7 != (int)unaff_x27[2]) {
        if (iVar7 == 0) break;
        goto code_r0x002fcd40;
      }
      uVar10 = *unaff_x27;
      iVar8 = func_0x0029d99c(*puVar19,(long)*(int *)(puVar19 + 1),uVar10,(long)(int)unaff_x27[1]);
      iVar6 = -iVar8;
      if (iVar7 == 0) {
        iVar6 = iVar8;
      }
    } while (iVar6 < 1);
    iVar7 = func_0x0029bf0c(in_stack_00000060);
    if (iVar7 != iStack000000000000002c) goto code_r0x002fd4f0;
    iVar7 = func_0x0029bf0c(unaff_x21);
    if (iVar7 == iStack000000000000002c) {
      iVar7 = func_0x002a80fc(*(undefined8 *)(unaff_x20 + 8),*(undefined8 *)(unaff_x20 + 0x20),
                              *(undefined8 *)(unaff_x20 + 0x28),unaff_x26);
      if ((iVar7 != 0) &&
         (iVar7 = func_0x0029f764(0,*(undefined8 *)(unaff_x20 + 0x30),
                                  *(undefined8 *)(unaff_x20 + 0x18),in_stack_00000060,
                                  iStack000000000000002c,unaff_x26), iVar7 != 0)) {
        uVar10 = *(ulong *)(unaff_x20 + 0x18);
        iVar7 = func_0x0029f764(0,*(undefined8 *)(unaff_x20 + 0x38),uVar10,unaff_x21,
                                iStack000000000000002c,unaff_x26);
        if (iVar7 != 0) {
          plVar20 = *(long **)(unaff_x20 + 8);
          uVar9 = *(uint *)(plVar20 + 1);
          uVar13 = (ulong)uVar9;
          lVar12 = uVar13 * 8;
          do {
            lVar12 = lVar12 + -8;
            iVar7 = (int)uVar13;
            uVar13 = (ulong)(iVar7 - 1);
            if (iVar7 < 1) {
              *(uint *)(plVar20 + 1) = uVar9 & (int)uVar9 >> 0x1f;
              if (-1 < (int)uVar9) {
                *(undefined4 *)(plVar20 + 2) = 0;
              }
              goto code_r0x002fd0d4;
            }
          } while (*(long *)(*plVar20 + lVar12) == 0);
          *(int *)(plVar20 + 1) = iVar7;
code_r0x002fd0d4:
          uVar9 = func_0x0029bf0c();
          if (uVar9 != uStack0000000000000028) {
            uVar10 = 0x44;
            func_0x0028f83c(4,0,0x44,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x471);
            goto joined_r0x002fd12c;
          }
          iVar7 = func_0x002fbc24(unaff_x20,unaff_x26);
          if (iVar7 != 0) {
            iVar7 = func_0x002f77a0(unaff_x20);
            bVar5 = iVar7 == 0;
            if (!bVar5) goto joined_r0x002fd104;
            uVar10 = 0x7c;
            func_0x0028f83c(4,0,0x7c,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x47f);
            goto joined_r0x002fd104;
          }
        }
      }
LAB_002fd00c:
      uVar10 = 3;
      func_0x0028f83c(4,0,3,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x487);
joined_r0x002fd12c:
      bVar5 = true;
joined_r0x002fd104:
      if (unaff_x26 != (undefined8 *)0x0) {
        if (*(char *)(unaff_x26 + 5) == '\0') {
          if (unaff_x26[2] == 0) {
            func_0x0079db4c();
            goto code_r0x002fd4e8;
          }
          lVar12 = unaff_x26[2] + -1;
          unaff_x26[2] = lVar12;
          lVar12 = *(long *)(unaff_x26[1] + lVar12 * 8);
          unaff_x26[4] = lVar12;
          if (lVar12 != 0) goto code_r0x002fd4f8;
        }
        func_0x00373520(*unaff_x26,&DAT_00302244,&_aws_lc_0_24_0_BN_free);
        func_0x0036e3d8(unaff_x26[1]);
        func_0x0036e3d8(unaff_x26);
      }
      if (!bVar5) {
        if ((unaff_w28 == 0) || (iVar7 = func_0x002fb278(unaff_x20), iVar7 != 0)) {
          func_0x002f8cb0(in_stack_00000020);
          puVar19 = *(undefined8 **)(in_stack_00000020 + 8);
          if (puVar19 != (undefined8 *)0x0) {
            uVar9 = *(uint *)((long)puVar19 + 0x14);
            if ((uVar9 >> 1 & 1) == 0) {
              func_0x0036e3d8(*puVar19);
              uVar9 = *(uint *)((long)puVar19 + 0x14);
            }
            if ((uVar9 & 1) == 0) {
              *puVar19 = 0;
            }
            else {
              func_0x0036e3d8(puVar19);
            }
          }
          *(undefined8 *)(in_stack_00000020 + 8) = *(undefined8 *)(unaff_x20 + 8);
          *(undefined8 *)(unaff_x20 + 8) = 0;
          puVar19 = *(undefined8 **)(in_stack_00000020 + 0x10);
          if (puVar19 != (undefined8 *)0x0) {
            uVar9 = *(uint *)((long)puVar19 + 0x14);
            if ((uVar9 >> 1 & 1) == 0) {
              func_0x0036e3d8(*puVar19);
              uVar9 = *(uint *)((long)puVar19 + 0x14);
            }
            if ((uVar9 & 1) == 0) {
              *puVar19 = 0;
            }
            else {
              func_0x0036e3d8(puVar19);
            }
          }
          *(undefined8 *)(in_stack_00000020 + 0x10) = *(undefined8 *)(unaff_x20 + 0x10);
          *(undefined8 *)(unaff_x20 + 0x10) = 0;
          puVar19 = *(undefined8 **)(in_stack_00000020 + 0x18);
          if (puVar19 != (undefined8 *)0x0) {
            uVar9 = *(uint *)((long)puVar19 + 0x14);
            if ((uVar9 >> 1 & 1) == 0) {
              func_0x0036e3d8(*puVar19);
              uVar9 = *(uint *)((long)puVar19 + 0x14);
            }
            if ((uVar9 & 1) == 0) {
              *puVar19 = 0;
            }
            else {
              func_0x0036e3d8(puVar19);
            }
          }
          *(undefined8 *)(in_stack_00000020 + 0x18) = *(undefined8 *)(unaff_x20 + 0x18);
          *(undefined8 *)(unaff_x20 + 0x18) = 0;
          puVar19 = *(undefined8 **)(in_stack_00000020 + 0x20);
          if (puVar19 != (undefined8 *)0x0) {
            uVar9 = *(uint *)((long)puVar19 + 0x14);
            if ((uVar9 >> 1 & 1) == 0) {
              func_0x0036e3d8(*puVar19);
              uVar9 = *(uint *)((long)puVar19 + 0x14);
            }
            if ((uVar9 & 1) == 0) {
              *puVar19 = 0;
            }
            else {
              func_0x0036e3d8(puVar19);
            }
          }
          *(undefined8 *)(in_stack_00000020 + 0x20) = *(undefined8 *)(unaff_x20 + 0x20);
          *(undefined8 *)(unaff_x20 + 0x20) = 0;
          puVar19 = *(undefined8 **)(in_stack_00000020 + 0x28);
          if (puVar19 != (undefined8 *)0x0) {
            uVar9 = *(uint *)((long)puVar19 + 0x14);
            if ((uVar9 >> 1 & 1) == 0) {
              func_0x0036e3d8(*puVar19);
              uVar9 = *(uint *)((long)puVar19 + 0x14);
            }
            if ((uVar9 & 1) == 0) {
              *puVar19 = 0;
            }
            else {
              func_0x0036e3d8(puVar19);
            }
          }
          *(undefined8 *)(in_stack_00000020 + 0x28) = *(undefined8 *)(unaff_x20 + 0x28);
          *(undefined8 *)(unaff_x20 + 0x28) = 0;
          puVar19 = *(undefined8 **)(in_stack_00000020 + 0x30);
          if (puVar19 != (undefined8 *)0x0) {
            uVar9 = *(uint *)((long)puVar19 + 0x14);
            if ((uVar9 >> 1 & 1) == 0) {
              func_0x0036e3d8(*puVar19);
              uVar9 = *(uint *)((long)puVar19 + 0x14);
            }
            if ((uVar9 & 1) == 0) {
              *puVar19 = 0;
            }
            else {
              func_0x0036e3d8(puVar19);
            }
          }
          *(undefined8 *)(in_stack_00000020 + 0x30) = *(undefined8 *)(unaff_x20 + 0x30);
          *(undefined8 *)(unaff_x20 + 0x30) = 0;
          puVar19 = *(undefined8 **)(in_stack_00000020 + 0x38);
          if (puVar19 != (undefined8 *)0x0) {
            uVar9 = *(uint *)((long)puVar19 + 0x14);
            if ((uVar9 >> 1 & 1) == 0) {
              func_0x0036e3d8(*puVar19);
              uVar9 = *(uint *)((long)puVar19 + 0x14);
            }
            if ((uVar9 & 1) == 0) {
              *puVar19 = 0;
            }
            else {
              func_0x0036e3d8(puVar19);
            }
          }
          *(undefined8 *)(in_stack_00000020 + 0x38) = *(undefined8 *)(unaff_x20 + 0x38);
          *(undefined8 *)(unaff_x20 + 0x38) = 0;
          puVar19 = *(undefined8 **)(in_stack_00000020 + 0x40);
          if (puVar19 != (undefined8 *)0x0) {
            uVar9 = *(uint *)((long)puVar19 + 0x14);
            if ((uVar9 >> 1 & 1) == 0) {
              func_0x0036e3d8(*puVar19);
              uVar9 = *(uint *)((long)puVar19 + 0x14);
            }
            if ((uVar9 & 1) == 0) {
              *puVar19 = 0;
            }
            else {
              func_0x0036e3d8(puVar19);
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
          puVar19 = *(undefined8 **)(in_stack_00000020 + 0x140);
          if (puVar19 != (undefined8 *)0x0) {
            uVar9 = *(uint *)((long)puVar19 + 0x14);
            if ((uVar9 >> 1 & 1) == 0) {
              func_0x0036e3d8(*puVar19);
              uVar9 = *(uint *)((long)puVar19 + 0x14);
            }
            if ((uVar9 & 1) == 0) {
              *puVar19 = 0;
            }
            else {
              func_0x0036e3d8(puVar19);
            }
          }
          *(undefined8 *)(in_stack_00000020 + 0x140) = *(undefined8 *)(unaff_x20 + 0x140);
          *(undefined8 *)(unaff_x20 + 0x140) = 0;
          puVar19 = *(undefined8 **)(in_stack_00000020 + 0x148);
          if (puVar19 != (undefined8 *)0x0) {
            uVar9 = *(uint *)((long)puVar19 + 0x14);
            if ((uVar9 >> 1 & 1) == 0) {
              func_0x0036e3d8(*puVar19);
              uVar9 = *(uint *)((long)puVar19 + 0x14);
            }
            if ((uVar9 & 1) == 0) {
              *puVar19 = 0;
            }
            else {
              func_0x0036e3d8(puVar19);
            }
          }
          *(undefined8 *)(in_stack_00000020 + 0x148) = *(undefined8 *)(unaff_x20 + 0x148);
          *(undefined8 *)(unaff_x20 + 0x148) = 0;
          puVar19 = *(undefined8 **)(in_stack_00000020 + 0x150);
          if (puVar19 != (undefined8 *)0x0) {
            uVar9 = *(uint *)((long)puVar19 + 0x14);
            if ((uVar9 >> 1 & 1) == 0) {
              func_0x0036e3d8(*puVar19);
              uVar9 = *(uint *)((long)puVar19 + 0x14);
            }
            if ((uVar9 & 1) == 0) {
              *puVar19 = 0;
            }
            else {
              func_0x0036e3d8(puVar19);
            }
          }
          *(undefined8 *)(in_stack_00000020 + 0x150) = *(undefined8 *)(unaff_x20 + 0x150);
          *(undefined8 *)(unaff_x20 + 0x150) = 0;
          puVar19 = *(undefined8 **)(in_stack_00000020 + 0x158);
          if (puVar19 != (undefined8 *)0x0) {
            uVar9 = *(uint *)((long)puVar19 + 0x14);
            if ((uVar9 >> 1 & 1) == 0) {
              func_0x0036e3d8(*puVar19);
              uVar9 = *(uint *)((long)puVar19 + 0x14);
            }
            if ((uVar9 & 1) == 0) {
              *puVar19 = 0;
            }
            else {
              func_0x0036e3d8(puVar19);
            }
          }
          *(undefined8 *)(in_stack_00000020 + 0x158) = *(undefined8 *)(unaff_x20 + 0x158);
          *(undefined8 *)(unaff_x20 + 0x158) = 0;
          *(byte *)(in_stack_00000020 + 0x180) =
               *(byte *)(in_stack_00000020 + 0x180) & 0xfe | *(byte *)(unaff_x20 + 0x180) & 1;
          bVar5 = true;
code_r0x002fd4a8:
          func_0x002f7efc(unaff_x20);
        }
        else {
          func_0x002f7efc(unaff_x20);
          bVar5 = false;
        }
        return bVar5;
      }
      do {
        uVar9 = func_0x0028edc4();
        func_0x002f7efc(unaff_x20);
        bVar5 = false;
        unaff_x20 = 0;
        if (((2 < unaff_w25) || ((uVar9 & 0xff000000) != 0x4000000)) ||
           (unaff_w25 = unaff_w25 + 1, (uVar9 & 0xfff) != 0x8d)) goto code_r0x002fd4a8;
        func_0x0028f0e4();
        unaff_x20 = func_0x002f8ac4(0);
        if (unaff_x20 == 0) {
          bVar5 = false;
          goto code_r0x002fd4a8;
        }
        uVar4 = *(uint *)(unaff_x23 + 1);
        uVar10 = (ulong)uVar4;
        uVar9 = uVar4 & (int)uVar4 >> 0x1f;
        lVar12 = uVar10 * 8;
        do {
          lVar12 = lVar12 + -8;
          uVar15 = (uint)uVar10;
          uVar10 = (ulong)(uVar15 - 1);
          if ((int)uVar15 < 1) {
            if (-1 < (int)uVar4) goto code_r0x002fc954;
            lVar14 = *unaff_x23;
            goto code_r0x002fc8ac;
          }
          lVar14 = *unaff_x23;
        } while (*(long *)(lVar14 + lVar12) == 0);
        uVar9 = uVar15;
code_r0x002fc8ac:
        uVar13 = *(ulong *)(lVar14 + (long)(int)(uVar9 - 1) * 8);
        uVar16 = uVar13 >> 0x20;
        uVar10 = uVar16;
        if (uVar16 == 0) {
          uVar10 = uVar13;
        }
        uVar17 = uVar10 >> 0x10;
        uVar1 = uVar17;
        if (uVar17 == 0) {
          uVar1 = uVar10;
        }
        uVar10 = uVar1 >> 8;
        if (uVar1 < 0x100) {
          uVar10 = uVar1;
        }
        uVar2 = uVar10 >> 4;
        if (uVar10 < 0x10) {
          uVar2 = uVar10;
        }
        uVar3 = uVar2 >> 2;
        if (uVar2 < 4) {
          uVar3 = uVar2;
        }
        uVar9 = (uint)(uVar13 != 0) | (uVar9 - 1) * 0x40 | (uint)(uVar16 != 0) << 5 |
                (uint)(uVar17 != 0) << 4 | (uint)(0xff < uVar1) << 3 | (uint)(0xf < uVar10) << 2 |
                (uint)(3 < uVar2) << 1;
        if (1 < uVar3) {
          uVar9 = uVar9 + 1;
        }
        if (uVar9 < 0x21) goto code_r0x002fc954;
        func_0x0028f83c(4,0,0x65,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x3fd);
      } while( true );
    }
  }
  else {
code_r0x002fd4e8:
    func_0x0079f160();
code_r0x002fd4ec:
    func_0x0079f138();
code_r0x002fd4f0:
    func_0x0079f110();
  }
  func_0x0079f0e8();
code_r0x002fd4f8:
  auVar22 = func_0x0079db28();
  if ((auVar22._8_4_ < 0x800) || ((auVar22._8_8_ & 0x7f) != 0)) {
    func_0x0028f83c(4,0,0x68,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x4f3);
    return false;
  }
  puVar19 = (undefined8 *)func_0x0036e31c(0x18);
  if (puVar19 == (undefined8 *)0x0) {
    return false;
  }
  *(undefined4 *)((long)puVar19 + 0x14) = 1;
  if (*(int *)((long)puVar19 + 0xc) == 0) {
    puVar21 = (undefined8 *)func_0x0036e358(1,8);
    if (puVar21 == (undefined8 *)0x0) {
      bVar5 = false;
      uVar9 = *(uint *)((long)puVar19 + 0x14);
      goto joined_r0x002fd65c;
    }
    if (*(int *)(puVar19 + 1) != 0) {
      _memcpy(puVar21,*puVar19,(long)*(int *)(puVar19 + 1) << 3);
    }
    func_0x0036e3d8(*puVar19);
    *puVar19 = puVar21;
    *(undefined4 *)((long)puVar19 + 0xc) = 1;
  }
  else {
    puVar21 = (undefined8 *)*puVar19;
  }
  *(undefined4 *)(puVar19 + 2) = 0;
  *puVar21 = &UNK_00010001;
  *(undefined4 *)(puVar19 + 1) = 1;
  iVar7 = func_0x002fc6b0(auVar22._0_8_,auVar22._8_8_,puVar19,uVar10,1);
  bVar5 = iVar7 != 0;
  uVar9 = *(uint *)((long)puVar19 + 0x14);
joined_r0x002fd65c:
  if ((uVar9 >> 1 & 1) == 0) {
    func_0x0036e3d8(*puVar19);
    uVar9 = *(uint *)((long)puVar19 + 0x14);
  }
  if ((uVar9 & 1) == 0) {
    *puVar19 = 0;
    return bVar5;
  }
  func_0x0036e3d8(puVar19);
  return bVar5;
code_r0x002fc954:
  unaff_x26 = (undefined8 *)func_0x0036e31c(0x30);
  if (unaff_x26 != (undefined8 *)0x0) {
    unaff_x26[1] = 0;
    unaff_x26[2] = 0;
    unaff_x26[3] = 0;
    if (*(char *)(unaff_x26 + 5) == '\0') {
      uVar18 = unaff_x26[4];
      lVar12 = func_0x0036e48c(0,0x100);
      if (lVar12 == 0) {
        *(undefined2 *)(unaff_x26 + 5) = 0x101;
      }
      else {
        unaff_x26[3] = 0x20;
        *(undefined8 *)(lVar12 + unaff_x26[2] * 8) = uVar18;
        unaff_x26[1] = lVar12;
        unaff_x26[2] = unaff_x26[2] + 1;
      }
    }
    in_stack_00000058 = func_0x0029e340(unaff_x26);
    in_stack_00000060 = func_0x0029e340(unaff_x26);
    unaff_x21 = func_0x0029e340(unaff_x26);
    unaff_x24 = func_0x0029e340(unaff_x26);
    unaff_x19 = (long *)func_0x0029e340(unaff_x26);
    unaff_x27 = (ulong *)func_0x0029e340(unaff_x26);
    if ((((in_stack_00000058 == 0) || (in_stack_00000060 == 0)) ||
        ((unaff_x21 == 0 || ((unaff_x24 == 0 || (unaff_x19 == (long *)0x0)))))) ||
       (unaff_x27 == (ulong *)0x0)) goto LAB_002fd00c;
    iVar7 = (int)in_stack_00000048;
    if ((int)unaff_x19[1] <= iVar7) {
      iVar6 = func_0x0029afb8(unaff_x19,in_stack_00000038);
      if (iVar6 != 0) {
        iVar6 = (int)unaff_x19[1];
        if (iVar7 < iVar6) goto code_r0x002fca64;
        param_2 = *unaff_x19 + (long)iVar6 * 8;
        param_1 = (ulong)(uint)(iVar7 - iVar6);
        goto code_r0x002fca54;
      }
      goto LAB_002fd00c;
    }
    goto code_r0x002fca6c;
  }
  goto LAB_002fd00c;
}

