
bool FUN_002fceb0(void)

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
  long *plVar10;
  ulong uVar11;
  undefined4 uVar12;
  undefined8 *puVar13;
  ulong uVar14;
  long lVar15;
  long lVar16;
  uint uVar17;
  ulong uVar18;
  ulong uVar19;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  undefined8 uVar20;
  long *unaff_x23;
  undefined8 *puVar21;
  long unaff_x24;
  uint unaff_w25;
  undefined8 *unaff_x26;
  ulong *unaff_x27;
  long unaff_x29;
  undefined1 auVar22 [16];
  undefined8 in_stack_00000008;
  long in_stack_00000010;
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
  
code_r0x002fceb0:
  uVar20 = *(undefined8 *)(unaff_x20 + 0x28);
  func_0x00373e9c(0xa29210,&DAT_0029be70);
  iVar8 = func_0x0029b864(unaff_x21,uVar20,0xa398c0);
  if (iVar8 == 0) goto LAB_002fd00c;
  iVar8 = func_0x002a7f48(in_stack_00000058,in_stack_00000060,unaff_x21,unaff_x26);
  if (iVar8 == 0) goto LAB_002fd00c;
  uVar11 = *(ulong *)(unaff_x20 + 0x10);
  iVar8 = func_0x002a5b4c(*(undefined8 *)(unaff_x20 + 0x18),unaff_x29 + -0x54,uVar11,
                          in_stack_00000058,unaff_x26);
  if (iVar8 == 0) goto LAB_002fd00c;
  puVar13 = *(undefined8 **)(unaff_x20 + 0x18);
  if (puVar13 != (undefined8 *)0x0) {
    iVar8 = *(int *)(puVar13 + 2);
    if (iVar8 == (int)unaff_x27[2]) {
      uVar11 = *unaff_x27;
      iVar7 = func_0x0029d99c(*puVar13,(long)*(int *)(puVar13 + 1),uVar11,(long)(int)unaff_x27[1]);
      iVar6 = -iVar7;
      if (iVar8 == 0) {
        iVar6 = iVar7;
      }
      if (iVar6 < 1) goto LAB_002fcd40;
    }
    else if (iVar8 != 0) goto LAB_002fcd40;
  }
  iVar8 = func_0x0029bf0c(in_stack_00000060);
  if (iVar8 == iStack000000000000002c) {
    iVar8 = func_0x0029bf0c(in_stack_00000010);
    if (iVar8 == iStack000000000000002c) {
      iVar8 = func_0x002a80fc(*(undefined8 *)(unaff_x20 + 8),*(undefined8 *)(unaff_x20 + 0x20),
                              *(undefined8 *)(unaff_x20 + 0x28),unaff_x26);
      if (iVar8 == 0) goto LAB_002fd00c;
      iVar8 = func_0x0029f764(0,*(undefined8 *)(unaff_x20 + 0x30),*(undefined8 *)(unaff_x20 + 0x18),
                              in_stack_00000060,iStack000000000000002c,unaff_x26);
      if (iVar8 == 0) goto LAB_002fd00c;
      uVar11 = *(ulong *)(unaff_x20 + 0x18);
      iVar8 = func_0x0029f764(0,*(undefined8 *)(unaff_x20 + 0x38),uVar11,in_stack_00000010,
                              iStack000000000000002c,unaff_x26);
      if (iVar8 == 0) goto LAB_002fd00c;
      plVar10 = *(long **)(unaff_x20 + 8);
      uVar9 = *(uint *)(plVar10 + 1);
      uVar14 = (ulong)uVar9;
      lVar16 = uVar14 * 8;
      do {
        lVar16 = lVar16 + -8;
        iVar8 = (int)uVar14;
        uVar14 = (ulong)(iVar8 - 1);
        if (iVar8 < 1) {
          *(uint *)(plVar10 + 1) = uVar9 & (int)uVar9 >> 0x1f;
          if (-1 < (int)uVar9) {
            *(undefined4 *)(plVar10 + 2) = 0;
          }
          goto LAB_002fd0d4;
        }
      } while (*(long *)(*plVar10 + lVar16) == 0);
      *(int *)(plVar10 + 1) = iVar8;
LAB_002fd0d4:
      uVar9 = func_0x0029bf0c();
      if (uVar9 == uStack0000000000000028) {
        iVar8 = func_0x002fbc24(unaff_x20,unaff_x26);
        if (iVar8 == 0) goto LAB_002fd00c;
        iVar8 = func_0x002f77a0(unaff_x20);
        if (iVar8 == 0) {
          uVar11 = 0x7c;
          func_0x0028f83c(4,0,0x7c,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x47f);
          bVar5 = true;
        }
        else {
          bVar5 = false;
        }
      }
      else {
        uVar11 = 0x44;
        func_0x0028f83c(4,0,0x44,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x471);
        bVar5 = true;
      }
      if (unaff_x26 != (undefined8 *)0x0) goto LAB_002fd030;
LAB_002fd080:
      if (!bVar5) {
        if ((in_stack_00000008._4_4_ == 0) || (iVar8 = func_0x002fb278(unaff_x20), iVar8 != 0)) {
          func_0x002f8cb0(in_stack_00000020);
          puVar13 = *(undefined8 **)(in_stack_00000020 + 8);
          if (puVar13 != (undefined8 *)0x0) {
            uVar9 = *(uint *)((long)puVar13 + 0x14);
            if ((uVar9 >> 1 & 1) == 0) {
              func_0x0036e3d8(*puVar13);
              uVar9 = *(uint *)((long)puVar13 + 0x14);
            }
            if ((uVar9 & 1) == 0) {
              *puVar13 = 0;
            }
            else {
              func_0x0036e3d8(puVar13);
            }
          }
          *(undefined8 *)(in_stack_00000020 + 8) = *(undefined8 *)(unaff_x20 + 8);
          *(undefined8 *)(unaff_x20 + 8) = 0;
          puVar13 = *(undefined8 **)(in_stack_00000020 + 0x10);
          if (puVar13 != (undefined8 *)0x0) {
            uVar9 = *(uint *)((long)puVar13 + 0x14);
            if ((uVar9 >> 1 & 1) == 0) {
              func_0x0036e3d8(*puVar13);
              uVar9 = *(uint *)((long)puVar13 + 0x14);
            }
            if ((uVar9 & 1) == 0) {
              *puVar13 = 0;
            }
            else {
              func_0x0036e3d8(puVar13);
            }
          }
          *(undefined8 *)(in_stack_00000020 + 0x10) = *(undefined8 *)(unaff_x20 + 0x10);
          *(undefined8 *)(unaff_x20 + 0x10) = 0;
          puVar13 = *(undefined8 **)(in_stack_00000020 + 0x18);
          if (puVar13 != (undefined8 *)0x0) {
            uVar9 = *(uint *)((long)puVar13 + 0x14);
            if ((uVar9 >> 1 & 1) == 0) {
              func_0x0036e3d8(*puVar13);
              uVar9 = *(uint *)((long)puVar13 + 0x14);
            }
            if ((uVar9 & 1) == 0) {
              *puVar13 = 0;
            }
            else {
              func_0x0036e3d8(puVar13);
            }
          }
          *(undefined8 *)(in_stack_00000020 + 0x18) = *(undefined8 *)(unaff_x20 + 0x18);
          *(undefined8 *)(unaff_x20 + 0x18) = 0;
          puVar13 = *(undefined8 **)(in_stack_00000020 + 0x20);
          if (puVar13 != (undefined8 *)0x0) {
            uVar9 = *(uint *)((long)puVar13 + 0x14);
            if ((uVar9 >> 1 & 1) == 0) {
              func_0x0036e3d8(*puVar13);
              uVar9 = *(uint *)((long)puVar13 + 0x14);
            }
            if ((uVar9 & 1) == 0) {
              *puVar13 = 0;
            }
            else {
              func_0x0036e3d8(puVar13);
            }
          }
          *(undefined8 *)(in_stack_00000020 + 0x20) = *(undefined8 *)(unaff_x20 + 0x20);
          *(undefined8 *)(unaff_x20 + 0x20) = 0;
          puVar13 = *(undefined8 **)(in_stack_00000020 + 0x28);
          if (puVar13 != (undefined8 *)0x0) {
            uVar9 = *(uint *)((long)puVar13 + 0x14);
            if ((uVar9 >> 1 & 1) == 0) {
              func_0x0036e3d8(*puVar13);
              uVar9 = *(uint *)((long)puVar13 + 0x14);
            }
            if ((uVar9 & 1) == 0) {
              *puVar13 = 0;
            }
            else {
              func_0x0036e3d8(puVar13);
            }
          }
          *(undefined8 *)(in_stack_00000020 + 0x28) = *(undefined8 *)(unaff_x20 + 0x28);
          *(undefined8 *)(unaff_x20 + 0x28) = 0;
          puVar13 = *(undefined8 **)(in_stack_00000020 + 0x30);
          if (puVar13 != (undefined8 *)0x0) {
            uVar9 = *(uint *)((long)puVar13 + 0x14);
            if ((uVar9 >> 1 & 1) == 0) {
              func_0x0036e3d8(*puVar13);
              uVar9 = *(uint *)((long)puVar13 + 0x14);
            }
            if ((uVar9 & 1) == 0) {
              *puVar13 = 0;
            }
            else {
              func_0x0036e3d8(puVar13);
            }
          }
          *(undefined8 *)(in_stack_00000020 + 0x30) = *(undefined8 *)(unaff_x20 + 0x30);
          *(undefined8 *)(unaff_x20 + 0x30) = 0;
          puVar13 = *(undefined8 **)(in_stack_00000020 + 0x38);
          if (puVar13 != (undefined8 *)0x0) {
            uVar9 = *(uint *)((long)puVar13 + 0x14);
            if ((uVar9 >> 1 & 1) == 0) {
              func_0x0036e3d8(*puVar13);
              uVar9 = *(uint *)((long)puVar13 + 0x14);
            }
            if ((uVar9 & 1) == 0) {
              *puVar13 = 0;
            }
            else {
              func_0x0036e3d8(puVar13);
            }
          }
          *(undefined8 *)(in_stack_00000020 + 0x38) = *(undefined8 *)(unaff_x20 + 0x38);
          *(undefined8 *)(unaff_x20 + 0x38) = 0;
          puVar13 = *(undefined8 **)(in_stack_00000020 + 0x40);
          if (puVar13 != (undefined8 *)0x0) {
            uVar9 = *(uint *)((long)puVar13 + 0x14);
            if ((uVar9 >> 1 & 1) == 0) {
              func_0x0036e3d8(*puVar13);
              uVar9 = *(uint *)((long)puVar13 + 0x14);
            }
            if ((uVar9 & 1) == 0) {
              *puVar13 = 0;
            }
            else {
              func_0x0036e3d8(puVar13);
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
          puVar13 = *(undefined8 **)(in_stack_00000020 + 0x140);
          if (puVar13 != (undefined8 *)0x0) {
            uVar9 = *(uint *)((long)puVar13 + 0x14);
            if ((uVar9 >> 1 & 1) == 0) {
              func_0x0036e3d8(*puVar13);
              uVar9 = *(uint *)((long)puVar13 + 0x14);
            }
            if ((uVar9 & 1) == 0) {
              *puVar13 = 0;
            }
            else {
              func_0x0036e3d8(puVar13);
            }
          }
          *(undefined8 *)(in_stack_00000020 + 0x140) = *(undefined8 *)(unaff_x20 + 0x140);
          *(undefined8 *)(unaff_x20 + 0x140) = 0;
          puVar13 = *(undefined8 **)(in_stack_00000020 + 0x148);
          if (puVar13 != (undefined8 *)0x0) {
            uVar9 = *(uint *)((long)puVar13 + 0x14);
            if ((uVar9 >> 1 & 1) == 0) {
              func_0x0036e3d8(*puVar13);
              uVar9 = *(uint *)((long)puVar13 + 0x14);
            }
            if ((uVar9 & 1) == 0) {
              *puVar13 = 0;
            }
            else {
              func_0x0036e3d8(puVar13);
            }
          }
          *(undefined8 *)(in_stack_00000020 + 0x148) = *(undefined8 *)(unaff_x20 + 0x148);
          *(undefined8 *)(unaff_x20 + 0x148) = 0;
          puVar13 = *(undefined8 **)(in_stack_00000020 + 0x150);
          if (puVar13 != (undefined8 *)0x0) {
            uVar9 = *(uint *)((long)puVar13 + 0x14);
            if ((uVar9 >> 1 & 1) == 0) {
              func_0x0036e3d8(*puVar13);
              uVar9 = *(uint *)((long)puVar13 + 0x14);
            }
            if ((uVar9 & 1) == 0) {
              *puVar13 = 0;
            }
            else {
              func_0x0036e3d8(puVar13);
            }
          }
          *(undefined8 *)(in_stack_00000020 + 0x150) = *(undefined8 *)(unaff_x20 + 0x150);
          *(undefined8 *)(unaff_x20 + 0x150) = 0;
          puVar13 = *(undefined8 **)(in_stack_00000020 + 0x158);
          if (puVar13 != (undefined8 *)0x0) {
            uVar9 = *(uint *)((long)puVar13 + 0x14);
            if ((uVar9 >> 1 & 1) == 0) {
              func_0x0036e3d8(*puVar13);
              uVar9 = *(uint *)((long)puVar13 + 0x14);
            }
            if ((uVar9 & 1) == 0) {
              *puVar13 = 0;
            }
            else {
              func_0x0036e3d8(puVar13);
            }
          }
          *(undefined8 *)(in_stack_00000020 + 0x158) = *(undefined8 *)(unaff_x20 + 0x158);
          *(undefined8 *)(unaff_x20 + 0x158) = 0;
          *(byte *)(in_stack_00000020 + 0x180) =
               *(byte *)(in_stack_00000020 + 0x180) & 0xfe | *(byte *)(unaff_x20 + 0x180) & 1;
          bVar5 = true;
LAB_002fd4a8:
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
           (unaff_w25 = unaff_w25 + 1, (uVar9 & 0xfff) != 0x8d)) goto LAB_002fd4a8;
        func_0x0028f0e4();
        unaff_x20 = func_0x002f8ac4(0);
        if (unaff_x20 == 0) {
          bVar5 = false;
          goto LAB_002fd4a8;
        }
        uVar4 = *(uint *)(unaff_x23 + 1);
        uVar11 = (ulong)uVar4;
        uVar9 = uVar4 & (int)uVar4 >> 0x1f;
        lVar16 = uVar11 * 8;
        do {
          lVar16 = lVar16 + -8;
          uVar17 = (uint)uVar11;
          uVar11 = (ulong)(uVar17 - 1);
          if ((int)uVar17 < 1) {
            if (-1 < (int)uVar4) goto code_r0x002fc954;
            lVar15 = *unaff_x23;
            goto code_r0x002fc8ac;
          }
          lVar15 = *unaff_x23;
        } while (*(long *)(lVar15 + lVar16) == 0);
        uVar9 = uVar17;
code_r0x002fc8ac:
        uVar14 = *(ulong *)(lVar15 + (long)(int)(uVar9 - 1) * 8);
        uVar18 = uVar14 >> 0x20;
        uVar11 = uVar18;
        if (uVar18 == 0) {
          uVar11 = uVar14;
        }
        uVar19 = uVar11 >> 0x10;
        uVar1 = uVar19;
        if (uVar19 == 0) {
          uVar1 = uVar11;
        }
        uVar11 = uVar1 >> 8;
        if (uVar1 < 0x100) {
          uVar11 = uVar1;
        }
        uVar2 = uVar11 >> 4;
        if (uVar11 < 0x10) {
          uVar2 = uVar11;
        }
        uVar3 = uVar2 >> 2;
        if (uVar2 < 4) {
          uVar3 = uVar2;
        }
        uVar9 = (uint)(uVar14 != 0) | (uVar9 - 1) * 0x40 | (uint)(uVar18 != 0) << 5 |
                (uint)(uVar19 != 0) << 4 | (uint)(0xff < uVar1) << 3 | (uint)(0xf < uVar11) << 2 |
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
LAB_002fd4f0:
    func_0x0079f110();
  }
  func_0x0079f0e8();
LAB_002fd4f8:
  auVar22 = func_0x0079db28();
  if ((auVar22._8_4_ < 0x800) || ((auVar22._8_8_ & 0x7f) != 0)) {
    func_0x0028f83c(4,0,0x68,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x4f3);
    return false;
  }
  puVar13 = (undefined8 *)func_0x0036e31c(0x18);
  if (puVar13 == (undefined8 *)0x0) {
    return false;
  }
  *(undefined4 *)((long)puVar13 + 0x14) = 1;
  if (*(int *)((long)puVar13 + 0xc) == 0) {
    puVar21 = (undefined8 *)func_0x0036e358(1,8);
    if (puVar21 == (undefined8 *)0x0) {
      bVar5 = false;
      uVar9 = *(uint *)((long)puVar13 + 0x14);
      goto joined_r0x002fd65c;
    }
    if (*(int *)(puVar13 + 1) != 0) {
      _memcpy(puVar21,*puVar13,(long)*(int *)(puVar13 + 1) << 3);
    }
    func_0x0036e3d8(*puVar13);
    *puVar13 = puVar21;
    *(undefined4 *)((long)puVar13 + 0xc) = 1;
  }
  else {
    puVar21 = (undefined8 *)*puVar13;
  }
  *(undefined4 *)(puVar13 + 2) = 0;
  *puVar21 = &UNK_00010001;
  *(undefined4 *)(puVar13 + 1) = 1;
  iVar8 = func_0x002fc6b0(auVar22._0_8_,auVar22._8_8_,puVar13,uVar11,1);
  bVar5 = iVar8 != 0;
  uVar9 = *(uint *)((long)puVar13 + 0x14);
joined_r0x002fd65c:
  if ((uVar9 >> 1 & 1) == 0) {
    func_0x0036e3d8(*puVar13);
    uVar9 = *(uint *)((long)puVar13 + 0x14);
  }
  if ((uVar9 & 1) == 0) {
    *puVar13 = 0;
    return bVar5;
  }
  func_0x0036e3d8(puVar13);
  return bVar5;
code_r0x002fc954:
  unaff_x26 = (undefined8 *)func_0x0036e31c(0x30);
  if (unaff_x26 != (undefined8 *)0x0) {
    unaff_x26[1] = 0;
    unaff_x26[2] = 0;
    unaff_x26[3] = 0;
    if (*(char *)(unaff_x26 + 5) == '\0') {
      uVar20 = unaff_x26[4];
      lVar16 = func_0x0036e48c(0,0x100);
      if (lVar16 == 0) {
        *(undefined2 *)(unaff_x26 + 5) = 0x101;
      }
      else {
        unaff_x26[3] = 0x20;
        *(undefined8 *)(lVar16 + unaff_x26[2] * 8) = uVar20;
        unaff_x26[1] = lVar16;
        unaff_x26[2] = unaff_x26[2] + 1;
      }
    }
    in_stack_00000058 = func_0x0029e340(unaff_x26);
    in_stack_00000060 = func_0x0029e340(unaff_x26);
    in_stack_00000010 = func_0x0029e340(unaff_x26);
    unaff_x24 = func_0x0029e340(unaff_x26);
    unaff_x19 = (long *)func_0x0029e340(unaff_x26);
    unaff_x27 = (ulong *)func_0x0029e340(unaff_x26);
    if ((((in_stack_00000058 != 0) && (in_stack_00000060 != 0)) &&
        ((in_stack_00000010 != 0 && ((unaff_x24 != 0 && (unaff_x19 != (long *)0x0)))))) &&
       (unaff_x27 != (ulong *)0x0)) {
      iVar8 = (int)in_stack_00000048;
      if ((int)unaff_x19[1] <= iVar8) {
        iVar6 = func_0x0029afb8(unaff_x19,in_stack_00000038);
        if (iVar6 == 0) goto LAB_002fd00c;
        iVar6 = (int)unaff_x19[1];
        if (iVar6 <= iVar8) {
          _bzero(*unaff_x19 + (long)iVar6 * 8,(ulong)(uint)(iVar8 - iVar6) * 8 + 8);
        }
        *(int *)(unaff_x19 + 1) = (int)in_stack_00000038;
      }
      *(ulong *)(*unaff_x19 + in_stack_00000048 * 8) =
           *(ulong *)(*unaff_x19 + in_stack_00000048 * 8) | 0x10000000;
      iVar8 = (int)in_stack_00000040;
      if ((int)unaff_x27[1] <= iVar8) {
        iVar6 = func_0x0029afb8(unaff_x27,in_stack_00000030);
        if (iVar6 == 0) goto LAB_002fd00c;
        iVar6 = (int)unaff_x27[1];
        if (iVar6 <= iVar8) {
          _bzero(*unaff_x27 + (long)iVar6 * 8,(ulong)(uint)(iVar8 - iVar6) * 8 + 8);
        }
        *(int *)(unaff_x27 + 1) = (int)in_stack_00000030;
      }
      *(ulong *)(*unaff_x27 + in_stack_00000040 * 8) =
           *(ulong *)(*unaff_x27 + in_stack_00000040 * 8) | 1;
      if (*(long *)(unaff_x20 + 8) == 0) {
        lVar16 = func_0x0036e31c(0x18);
        if (lVar16 == 0) {
          *(undefined8 *)(unaff_x20 + 8) = 0;
          goto LAB_002fd00c;
        }
        *(undefined4 *)(lVar16 + 0x14) = 1;
        *(long *)(unaff_x20 + 8) = lVar16;
        lVar16 = *(long *)(unaff_x20 + 0x18);
      }
      else {
        lVar16 = *(long *)(unaff_x20 + 0x18);
      }
      if (lVar16 == 0) {
        lVar16 = func_0x0036e31c(0x18);
        if (lVar16 == 0) {
          *(undefined8 *)(unaff_x20 + 0x18) = 0;
          goto LAB_002fd00c;
        }
        *(undefined4 *)(lVar16 + 0x14) = 1;
        *(long *)(unaff_x20 + 0x18) = lVar16;
        lVar16 = *(long *)(unaff_x20 + 0x10);
      }
      else {
        lVar16 = *(long *)(unaff_x20 + 0x10);
      }
      if (lVar16 == 0) {
        lVar16 = func_0x0036e31c(0x18);
        if (lVar16 == 0) {
          *(undefined8 *)(unaff_x20 + 0x10) = 0;
          goto LAB_002fd00c;
        }
        *(undefined4 *)(lVar16 + 0x14) = 1;
        *(long *)(unaff_x20 + 0x10) = lVar16;
        lVar16 = *(long *)(unaff_x20 + 0x20);
      }
      else {
        lVar16 = *(long *)(unaff_x20 + 0x20);
      }
      if (lVar16 == 0) {
        lVar16 = func_0x0036e31c(0x18);
        if (lVar16 != 0) {
          *(undefined4 *)(lVar16 + 0x14) = 1;
          *(long *)(unaff_x20 + 0x20) = lVar16;
          if (*(long *)(unaff_x20 + 0x28) == 0) goto code_r0x002fcc00;
          goto code_r0x002fcb10;
        }
        *(undefined8 *)(unaff_x20 + 0x20) = 0;
      }
      else {
        if (*(long *)(unaff_x20 + 0x28) == 0) {
code_r0x002fcc00:
          lVar16 = func_0x0036e31c(0x18);
          if (lVar16 == 0) {
            *(undefined8 *)(unaff_x20 + 0x28) = 0;
            goto LAB_002fd00c;
          }
          *(undefined4 *)(lVar16 + 0x14) = 1;
          *(long *)(unaff_x20 + 0x28) = lVar16;
          if (*(long *)(unaff_x20 + 0x30) == 0) goto code_r0x002fcc20;
code_r0x002fcb18:
          lVar16 = *(long *)(unaff_x20 + 0x38);
        }
        else {
code_r0x002fcb10:
          if (*(long *)(unaff_x20 + 0x30) != 0) goto code_r0x002fcb18;
code_r0x002fcc20:
          lVar16 = func_0x0036e31c(0x18);
          if (lVar16 == 0) {
            *(undefined8 *)(unaff_x20 + 0x30) = 0;
            goto LAB_002fd00c;
          }
          *(undefined4 *)(lVar16 + 0x14) = 1;
          *(long *)(unaff_x20 + 0x30) = lVar16;
          lVar16 = *(long *)(unaff_x20 + 0x38);
        }
        if (lVar16 == 0) {
          lVar16 = func_0x0036e31c(0x18);
          if (lVar16 == 0) {
            *(undefined8 *)(unaff_x20 + 0x38) = 0;
            goto LAB_002fd00c;
          }
          *(undefined4 *)(lVar16 + 0x14) = 1;
          *(long *)(unaff_x20 + 0x38) = lVar16;
          plVar10 = *(long **)(unaff_x20 + 0x10);
        }
        else {
          plVar10 = *(long **)(unaff_x20 + 0x10);
        }
        if (plVar10 == unaff_x23) {
          uVar11 = 0x20;
          iVar8 = func_0x0029c164(unaff_x24,&_aws_lc_0_24_0_kBoringSSLRSASqrtTwo,0x20);
        }
        else {
          iVar8 = func_0x0029afb8(plVar10,(long)(int)unaff_x23[1]);
          if (iVar8 == 0) goto LAB_002fd00c;
          uVar12 = 0;
          if ((int)unaff_x23[1] != 0) {
            _memcpy(*plVar10,*unaff_x23,(long)(int)unaff_x23[1] << 3);
            uVar12 = (undefined4)unaff_x23[1];
          }
          *(undefined4 *)(plVar10 + 1) = uVar12;
          *(int *)(plVar10 + 2) = (int)unaff_x23[2];
          uVar11 = 0x20;
          iVar8 = func_0x0029c164(unaff_x24,&_aws_lc_0_24_0_kBoringSSLRSASqrtTwo,0x20);
        }
        if (iVar8 != 0) {
          iVar8 = func_0x0029bf0c(unaff_x24);
          if (iVar8 != 0x800) goto code_r0x002fd4e8;
          if (uStack0000000000000028 < 0x1000) {
            uVar11 = in_stack_00000018 >> 0x20;
            iVar8 = func_0x0029f130(unaff_x24,unaff_x24,in_stack_00000018 >> 0x20);
            if (iVar8 == 0) goto LAB_002fd00c;
          }
          else if (uStack0000000000000028 != 0x1000) {
            iVar8 = func_0x0029b0e4(unaff_x24,1);
            if (iVar8 != 0) {
              uVar11 = in_stack_00000018 & 0xffffffff;
              iVar8 = func_0x0029ed38(unaff_x24,unaff_x24,uVar11);
              if (iVar8 != 0) goto code_r0x002fccfc;
            }
            goto LAB_002fd00c;
          }
code_r0x002fccfc:
          iVar8 = func_0x0029bf0c(unaff_x24);
          if (iStack000000000000002c != iVar8) goto code_r0x002fd4ec;
LAB_002fcd40:
          iVar8 = func_0x0031de90(*(undefined8 *)(unaff_x20 + 0x20),iStack000000000000002c,
                                  *(undefined8 *)(unaff_x20 + 0x10),0,unaff_x24,unaff_x19,unaff_x26,
                                  in_stack_00000050);
          if (iVar8 != 0) {
            if (in_stack_00000050 == (char *)0x0) {
code_r0x002fcdb4:
              iVar8 = func_0x0031de90(*(undefined8 *)(unaff_x20 + 0x28),iStack000000000000002c,
                                      *(undefined8 *)(unaff_x20 + 0x10),
                                      *(undefined8 *)(unaff_x20 + 0x20),unaff_x24,unaff_x19,
                                      unaff_x26,in_stack_00000050);
              if (iVar8 != 0) {
                if (in_stack_00000050 == (char *)0x0) {
code_r0x002fce24:
                  puVar13 = *(undefined8 **)(unaff_x20 + 0x20);
                  puVar21 = *(undefined8 **)(unaff_x20 + 0x28);
                  if ((puVar13 == (undefined8 *)0x0) || (puVar21 == (undefined8 *)0x0)) {
                    if (puVar13 != (undefined8 *)0x0) goto code_r0x002fce74;
                    puVar13 = (undefined8 *)0x0;
                  }
                  else {
                    iVar8 = *(int *)(puVar13 + 2);
                    if (iVar8 == *(int *)(puVar21 + 2)) {
                      iVar7 = func_0x0029d99c(*puVar13,(long)*(int *)(puVar13 + 1),*puVar21,
                                              (long)*(int *)(puVar21 + 1));
                      iVar6 = -iVar7;
                      if (iVar8 == 0) {
                        iVar6 = iVar7;
                      }
                      if (iVar6 < 0) goto code_r0x002fce74;
                    }
                    else if (iVar8 != 0) {
code_r0x002fce74:
                      *(undefined8 **)(unaff_x20 + 0x20) = puVar21;
                      *(undefined8 **)(unaff_x20 + 0x28) = puVar13;
                      puVar13 = puVar21;
                    }
                  }
                  func_0x00373e9c(0xa29210,&DAT_0029be70);
                  iVar8 = func_0x0029b864(in_stack_00000060,puVar13,0xa398c0);
                  unaff_x21 = in_stack_00000010;
                  if (iVar8 != 0) goto code_r0x002fceb0;
                }
                else if (*in_stack_00000050 == '\x01') {
                  iVar8 = (**(code **)(in_stack_00000050 + 0x10))(3,1);
                  if (iVar8 != 0) goto code_r0x002fce24;
                }
                else if (*in_stack_00000050 == '\x02') {
                  (**(code **)(in_stack_00000050 + 0x10))(3,1);
                  goto code_r0x002fce24;
                }
              }
            }
            else if (*in_stack_00000050 == '\x01') {
              iVar8 = (**(code **)(in_stack_00000050 + 0x10))(3,0);
              if (iVar8 != 0) goto code_r0x002fcdb4;
            }
            else if (*in_stack_00000050 == '\x02') {
              (**(code **)(in_stack_00000050 + 0x10))(3,0);
              goto code_r0x002fcdb4;
            }
          }
        }
      }
    }
  }
LAB_002fd00c:
  uVar11 = 3;
  func_0x0028f83c(4,0,3,"/aws-lc/crypto/fipsmodule/rsa/rsa_impl.c",0x487);
  bVar5 = true;
  if (unaff_x26 == (undefined8 *)0x0) goto LAB_002fd080;
LAB_002fd030:
  if (*(char *)(unaff_x26 + 5) == '\0') {
    if (unaff_x26[2] == 0) {
      func_0x0079db4c();
code_r0x002fd4e8:
      func_0x0079f160();
code_r0x002fd4ec:
      func_0x0079f138();
      goto LAB_002fd4f0;
    }
    lVar16 = unaff_x26[2] + -1;
    unaff_x26[2] = lVar16;
    lVar16 = *(long *)(unaff_x26[1] + lVar16 * 8);
    unaff_x26[4] = lVar16;
    if (lVar16 != 0) goto LAB_002fd4f8;
  }
  func_0x00373520(*unaff_x26,&DAT_00302244,&_aws_lc_0_24_0_BN_free);
  func_0x0036e3d8(unaff_x26[1]);
  func_0x0036e3d8(unaff_x26);
  goto LAB_002fd080;
}

