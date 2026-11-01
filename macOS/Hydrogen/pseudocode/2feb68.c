
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_002feb68(void)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  uint uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  int iVar11;
  long lVar12;
  undefined8 *puVar13;
  undefined8 uVar14;
  undefined8 *puVar15;
  undefined8 uVar16;
  char *pcVar17;
  undefined8 uVar18;
  uint uVar19;
  long *plVar20;
  ulong uVar21;
  long *plVar22;
  ulong uVar23;
  long lVar24;
  ulong uVar25;
  uint uVar26;
  ulong uVar27;
  char *unaff_x19;
  long *unaff_x20;
  undefined8 *puVar28;
  bool bVar29;
  undefined8 *unaff_x24;
  undefined8 *unaff_x25;
  undefined8 *unaff_x26;
  long unaff_x29;
  undefined8 uVar30;
  undefined8 uVar31;
  undefined8 uStack00000000000000a0;
  undefined8 in_stack_000000a8;
  undefined8 in_stack_000000b0;
  undefined8 in_stack_000000b8;
  undefined4 in_stack_00000d20;
  undefined4 in_stack_00000d24;
  ulong in_stack_00000d28;
  long in_stack_00000d30;
  ulong in_stack_00000d38;
  char acStack_7ffffffe [6];
  long alStack_7ffffff8 [268435455];
  
  ___memset_chk();
  iVar11 = func_0x002fd75c(&UNK_00878915,acStack_7ffffffe + 0x8000133e,0x40,"ECDSA-sign signature");
  if (iVar11 == 0) {
    uVar18 = *unaff_x24;
    pcVar17 = "ECDSA-sign KAT failed.\n";
    uVar14 = 0x17;
    goto LAB_002fec50;
  }
  func_0x002c398c();
  unaff_x20 = (long *)func_0x0036e274(0x10);
  if (unaff_x20 == (long *)0x0) goto LAB_002fec7c;
  lVar12 = func_0x0036e31c(0x18);
  if (lVar12 != 0) {
    *(undefined4 *)(lVar12 + 0x14) = 1;
  }
  *unaff_x20 = lVar12;
  lVar12 = func_0x0036e31c(0x18);
  if (lVar12 == 0) {
    unaff_x20[1] = 0;
LAB_002fec70:
    func_0x002c398c(unaff_x20);
    unaff_x20 = (long *)0x0;
LAB_002fec7c:
    func_0x002c398c(unaff_x20);
    unaff_x20 = (long *)0x0;
  }
  else {
    *(undefined4 *)(lVar12 + 0x14) = 1;
    unaff_x20[1] = lVar12;
    puVar28 = (undefined8 *)*unaff_x20;
    if (puVar28 == (undefined8 *)0x0) goto LAB_002fec70;
    if (*(uint *)((long)puVar28 + 0xc) < 4) {
      if ((*(byte *)((long)puVar28 + 0x14) >> 1 & 1) == 0) {
        puVar13 = (undefined8 *)func_0x0036e358(4,8,lVar12);
        if (puVar13 != (undefined8 *)0x0) {
          if (*(int *)(puVar28 + 1) != 0) {
            _memcpy(puVar13,*puVar28,(long)*(int *)(puVar28 + 1) << 3);
          }
          func_0x0036e3d8(*puVar28);
          *puVar28 = puVar13;
          *(undefined4 *)((long)puVar28 + 0xc) = 4;
          lVar12 = unaff_x20[1];
          goto LAB_002fecc4;
        }
      }
      else {
        func_0x0028f83c(3,0,0x6a,"/aws-lc/crypto/fipsmodule/bn/bn.c",0x166);
      }
      goto LAB_002fec7c;
    }
    puVar13 = (undefined8 *)*puVar28;
LAB_002fecc4:
    *(undefined4 *)(puVar28 + 1) = 4;
    *(undefined4 *)(puVar28 + 2) = 0;
    uVar31 = _UNK_0082ff28;
    uVar18 = _UNK_0082ff20;
    uVar14 = _UNK_0082ff10;
    puVar13[1] = _UNK_0082ff18;
    *puVar13 = uVar14;
    puVar13[3] = uVar31;
    puVar13[2] = uVar18;
    lVar12 = func_0x0029c764(&UNK_00878995,0x20,lVar12);
    if (lVar12 == 0) goto LAB_002fec7c;
    func_0x00373e9c(0xa296c8,&DAT_002c21e4);
    in_stack_00000d20 = 0x40;
    iVar11 = func_0x002c0d58(&UNK_00878955,0x20,acStack_7ffffffe + 0x8000069e,
                             acStack_7ffffffe + 0x80000d1e,0xa3a728,0);
    if ((iVar11 != 0) &&
       (iVar11 = func_0x002c3b08(acStack_7ffffffe + 0x8000069e,0x40,unaff_x20), iVar11 != 0)) {
      func_0x00373e9c(0xa29738,&DAT_002c54ec);
      puVar28 = (undefined8 *)func_0x0036e274(0xe0);
      if (puVar28 != (undefined8 *)0x0) {
        uVar14 = func_0x002c6ae8(0xa3b640);
        *puVar28 = uVar14;
        puVar28[2] = 0;
        puVar28[1] = 0;
        puVar28[4] = 0;
        puVar28[3] = 0;
        puVar28[6] = 0;
        puVar28[5] = 0;
        puVar28[8] = 0;
        puVar28[7] = 0;
        puVar28[9] = 0;
        puVar28[0xb] = 0;
        puVar28[10] = 0;
        puVar28[0xd] = 0;
        puVar28[0xc] = 0;
        puVar28[0xf] = 0;
        puVar28[0xe] = 0;
        puVar28[0x11] = 0;
        puVar28[0x10] = 0;
        puVar28[0x12] = 0;
        puVar28[0x14] = 0;
        puVar28[0x13] = 0;
        puVar28[0x16] = 0;
        puVar28[0x15] = 0;
        puVar28[0x18] = 0;
        puVar28[0x17] = 0;
        puVar28[0x1a] = 0;
        puVar28[0x19] = 0;
        puVar28[0x1b] = 0;
      }
      puVar13 = (undefined8 *)func_0x0036e274(0xe0);
      if (puVar13 != (undefined8 *)0x0) {
        uVar14 = func_0x002c6ae8(0xa3b640);
        *puVar13 = uVar14;
        puVar13[2] = 0;
        puVar13[1] = 0;
        puVar13[4] = 0;
        puVar13[3] = 0;
        puVar13[6] = 0;
        puVar13[5] = 0;
        puVar13[8] = 0;
        puVar13[7] = 0;
        puVar13[9] = 0;
        puVar13[0xb] = 0;
        puVar13[10] = 0;
        puVar13[0xd] = 0;
        puVar13[0xc] = 0;
        puVar13[0xf] = 0;
        puVar13[0xe] = 0;
        puVar13[0x11] = 0;
        puVar13[0x10] = 0;
        puVar13[0x12] = 0;
        puVar13[0x14] = 0;
        puVar13[0x13] = 0;
        puVar13[0x16] = 0;
        puVar13[0x15] = 0;
        puVar13[0x18] = 0;
        puVar13[0x17] = 0;
        puVar13[0x1a] = 0;
        puVar13[0x19] = 0;
        puVar13[0x1b] = 0;
      }
      puVar15 = (undefined8 *)func_0x0036e31c(0x18);
      if (((((puVar15 == (undefined8 *)0x0) ||
            (*(undefined4 *)((long)puVar15 + 0x14) = 1, puVar28 == (undefined8 *)0x0)) ||
           (puVar13 == (undefined8 *)0x0)) ||
          ((iVar11 = func_0x002d2dc0(0xa3b640,puVar28,&UNK_008789b5,0x41,0), iVar11 == 0 ||
           (lVar12 = func_0x0029c764(&UNK_008789f6,0x20,puVar15), lVar12 == 0)))) ||
         ((iVar11 = func_0x002c98a8(0xa3b640,puVar13,0,puVar28,puVar15,0), iVar11 == 0 ||
          ((lVar12 = func_0x002cb544(0xa3b640,puVar13,4,acStack_7ffffffe + 0x8000165e,0x41),
           lVar12 == 0 ||
           (iVar11 = func_0x002fd75c(&UNK_00878a16,acStack_7ffffffe + 0x8000165e,0x41,
                                     "Z Computation Result"), iVar11 == 0)))))) {
        _fwrite("Z-computation KAT failed.\n",0x1a,1,*unaff_x24);
        func_0x002c3420();
        unaff_x19 = (char *)0x0;
        pcVar17 = (char *)0x0;
        if (puVar28 != (undefined8 *)0x0) goto code_r0x002fefa8;
      }
      else {
        func_0x002c3420();
        pcVar17 = (char *)((long)&MACH_HEADER.magic + 1);
code_r0x002fefa8:
        unaff_x19 = pcVar17;
        func_0x002c6434(*puVar28);
        func_0x0036e3d8(puVar28);
      }
      if (puVar13 != (undefined8 *)0x0) {
        func_0x002c6434(*puVar13);
        func_0x0036e3d8(puVar13);
      }
      if (puVar15 != (undefined8 *)0x0) {
        uVar19 = *(uint *)((long)puVar15 + 0x14);
        if ((uVar19 >> 1 & 1) == 0) {
          func_0x0036e3d8(*puVar15);
          uVar19 = *(uint *)((long)puVar15 + 0x14);
        }
        if ((uVar19 & 1) == 0) {
          *puVar15 = 0;
        }
        else {
          func_0x0036e3d8(puVar15);
        }
      }
      func_0x002c398c(unaff_x20);
      if ((int)unaff_x19 == 0) goto LAB_002fdd0c;
      unaff_x19 = (char *)func_0x0036e31c(0x18);
      if (unaff_x19 != (char *)0x0) {
        *(undefined4 *)(unaff_x19 + 0x14) = 1;
        func_0x0036e3d8(*(undefined8 *)unaff_x19);
        *(undefined **)unaff_x19 = &UNK_00878ab8;
        *(qword *)(unaff_x19 + 8) = 0x2000000020;
        *(undefined4 *)(unaff_x19 + 0x10) = 0;
        *(uint *)(unaff_x19 + 0x14) = *(uint *)(unaff_x19 + 0x14) | 2;
      }
      unaff_x20 = (long *)func_0x002c0f98(&UNK_00831198,0x20);
      if (unaff_x20 == (long *)0x0) goto code_r0x002ff104;
      puVar28 = (undefined8 *)func_0x0036e31c(0x18);
      if (puVar28 == (undefined8 *)0x0) goto code_r0x002ff0fc;
      *(undefined4 *)((long)puVar28 + 0x14) = 1;
      func_0x0036e3d8(*puVar28);
      *puVar28 = &UNK_00878eb8;
      puVar28[1] = 0x400000004;
      *(undefined4 *)(puVar28 + 2) = 0;
      *(uint *)((long)puVar28 + 0x14) = *(uint *)((long)puVar28 + 0x14) | 2;
      puVar13 = (undefined8 *)unaff_x20[4];
      if (puVar13 != (undefined8 *)0x0) {
        uVar19 = *(uint *)((long)puVar13 + 0x14);
        if ((uVar19 >> 1 & 1) == 0) {
          func_0x0036e3d8(*puVar13);
          uVar19 = *(uint *)((long)puVar13 + 0x14);
        }
        if ((uVar19 & 1) == 0) {
          *puVar13 = 0;
        }
        else {
          func_0x0036e3d8(puVar13);
        }
      }
      unaff_x20[4] = (long)puVar28;
      if (unaff_x19 == (char *)0x0) goto code_r0x002ff108;
      plVar20 = (long *)*unaff_x20;
      uVar4 = *(uint *)(plVar20 + 1);
      uVar23 = (ulong)uVar4;
      uVar19 = uVar4 & (int)uVar4 >> 0x1f;
      lVar12 = uVar23 * 8;
      do {
        lVar12 = lVar12 + -8;
        uVar26 = (uint)uVar23;
        uVar23 = (ulong)(uVar26 - 1);
        if ((int)uVar26 < 1) {
          if (-1 < (int)uVar4) goto code_r0x002ff108;
          lVar24 = *plVar20;
          goto code_r0x002ff66c;
        }
        lVar24 = *plVar20;
      } while (*(long *)(lVar24 + lVar12) == 0);
      uVar19 = uVar26;
code_r0x002ff66c:
      uVar21 = *(ulong *)(lVar24 + (long)(int)(uVar19 - 1) * 8);
      uVar25 = uVar21 >> 0x20;
      uVar23 = uVar25;
      if (uVar25 == 0) {
        uVar23 = uVar21;
      }
      uVar27 = uVar23 >> 0x10;
      uVar1 = uVar27;
      if (uVar27 == 0) {
        uVar1 = uVar23;
      }
      uVar23 = uVar1 >> 8;
      if (uVar1 < 0x100) {
        uVar23 = uVar1;
      }
      uVar2 = uVar23 >> 4;
      if (uVar23 < 0x10) {
        uVar2 = uVar23;
      }
      uVar3 = uVar2 >> 2;
      if (uVar2 < 4) {
        uVar3 = uVar2;
      }
      uVar19 = (uint)(uVar21 != 0) | (uVar19 - 1) * 0x40 | (uint)(uVar25 != 0) << 5 |
               (uint)(uVar27 != 0) << 4 | (uint)(0xff < uVar1) << 3 | (uint)(0xf < uVar23) << 2 |
               (uint)(3 < uVar2) << 1;
      if (1 < uVar3) {
        uVar19 = uVar19 + 1;
      }
      if ((uVar19 + 7 & 0xfffffff8) != 0x800) goto code_r0x002ff108;
      iVar11 = func_0x002c0134(acStack_7ffffffe + 0x8000165e,unaff_x19,unaff_x20);
      if (iVar11 != 0x100) goto code_r0x002ff108;
      iVar11 = func_0x002fd75c(&UNK_00878bb8,acStack_7ffffffe + 0x8000165e,0x100,"FFC DH");
      if (iVar11 == 0) goto code_r0x002ff108;
      puVar28 = (undefined8 *)func_0x0029c764(&UNK_00878cb8,0x100,0);
      plVar20 = (long *)func_0x0036e31c(0x108);
      if (plVar20 == (long *)0x0) {
code_r0x002ff854:
        func_0x002bf97c(plVar20);
        plVar20 = (long *)0x0;
      }
      else {
        func_0x00373d98(plVar20 + 6);
        *(undefined4 *)((long)plVar20 + 0x104) = 1;
        lVar12 = func_0x0029c764(&UNK_00878ed8,0x100,0);
        *plVar20 = lVar12;
        if (lVar12 == 0) goto code_r0x002ff854;
        lVar12 = func_0x0029c764(&UNK_00878fd8,0x1c,0);
        plVar20[2] = lVar12;
        if (lVar12 == 0) goto code_r0x002ff854;
        lVar12 = func_0x0029c764(&UNK_00878ff4,0x100,0);
        plVar20[1] = lVar12;
        if (lVar12 == 0) goto code_r0x002ff854;
        lVar12 = func_0x0029c764(&UNK_008790f4,0x1c,0);
        plVar20[4] = lVar12;
        if (lVar12 == 0) goto code_r0x002ff854;
        lVar12 = func_0x0029c764(&UNK_00879110,0x100,0);
        plVar20[3] = lVar12;
        if (lVar12 == 0) goto code_r0x002ff854;
        if (puVar28 != (undefined8 *)0x0) {
          plVar22 = (long *)*plVar20;
          uVar4 = *(uint *)(plVar22 + 1);
          uVar23 = (ulong)uVar4;
          uVar19 = uVar4 & (int)uVar4 >> 0x1f;
          lVar12 = uVar23 * 8;
          do {
            lVar12 = lVar12 + -8;
            uVar26 = (uint)uVar23;
            uVar23 = (ulong)(uVar26 - 1);
            if ((int)uVar26 < 1) {
              if (-1 < (int)uVar4) goto code_r0x002ff860;
              lVar24 = *plVar22;
              goto code_r0x002ff904;
            }
            lVar24 = *plVar22;
          } while (*(long *)(lVar24 + lVar12) == 0);
          uVar19 = uVar26;
code_r0x002ff904:
          uVar21 = *(ulong *)(lVar24 + (long)(int)(uVar19 - 1) * 8);
          uVar25 = uVar21 >> 0x20;
          uVar23 = uVar25;
          if (uVar25 == 0) {
            uVar23 = uVar21;
          }
          uVar27 = uVar23 >> 0x10;
          uVar1 = uVar27;
          if (uVar27 == 0) {
            uVar1 = uVar23;
          }
          uVar23 = uVar1 >> 8;
          if (uVar1 < 0x100) {
            uVar23 = uVar1;
          }
          uVar2 = uVar23 >> 4;
          if (uVar23 < 0x10) {
            uVar2 = uVar23;
          }
          uVar3 = uVar2 >> 2;
          if (uVar2 < 4) {
            uVar3 = uVar2;
          }
          uVar19 = (uint)(uVar21 != 0) | (uVar19 - 1) * 0x40 | (uint)(uVar25 != 0) << 5 |
                   (uint)(uVar27 != 0) << 4 | (uint)(0xff < uVar1) << 3 | (uint)(0xf < uVar23) << 2
                   | (uint)(3 < uVar2) << 1;
          if (1 < uVar3) {
            uVar19 = uVar19 + 1;
          }
          if ((((uVar19 + 7 & 0xfffffff8) == 0x800) &&
              (iVar11 = func_0x002c0134(acStack_7ffffffe + 0x8000069e,puVar28,plVar20),
              iVar11 == 0x100)) &&
             (iVar11 = func_0x002fd75c(&UNK_00878db8,acStack_7ffffffe + 0x8000069e,0x100,"FFC DH FB"
                                      ), iVar11 != 0)) {
            bVar29 = false;
            goto code_r0x002ff12c;
          }
        }
      }
code_r0x002ff860:
      bVar29 = true;
      _fwrite("FFDH FB failed.\n",0x10,1,*unaff_x24);
code_r0x002ff12c:
      do {
        func_0x002bf97c(unaff_x20);
        if (unaff_x19 != (char *)0x0) {
          uVar19 = *(uint *)(unaff_x19 + 0x14);
          if ((uVar19 >> 1 & 1) == 0) {
            func_0x0036e3d8(*(undefined8 *)unaff_x19);
            uVar19 = *(uint *)(unaff_x19 + 0x14);
          }
          if ((uVar19 & 1) == 0) {
            unaff_x19[0] = '\0';
            unaff_x19[1] = '\0';
            unaff_x19[2] = '\0';
            unaff_x19[3] = '\0';
            unaff_x19[4] = '\0';
            unaff_x19[5] = '\0';
            unaff_x19[6] = '\0';
            unaff_x19[7] = '\0';
          }
          else {
            func_0x0036e3d8(unaff_x19);
          }
        }
        func_0x002bf97c(plVar20);
        if (puVar28 != (undefined8 *)0x0) {
          uVar19 = *(uint *)((long)puVar28 + 0x14);
          if ((uVar19 >> 1 & 1) == 0) {
            func_0x0036e3d8(*puVar28);
            uVar19 = *(uint *)((long)puVar28 + 0x14);
          }
          if ((uVar19 & 1) == 0) {
            *puVar28 = 0;
          }
          else {
            func_0x0036e3d8(puVar28);
          }
        }
        if (bVar29) {
LAB_002fdd0c:
          uVar16 = 0;
        }
        else {
          unaff_x20 = (long *)(acStack_7ffffffe + 0x8000165e);
          _bzero(acStack_7ffffffe + 0x8000165e,0x660);
          _bzero(acStack_7ffffffe + 0x8000133e,800);
          uVar18 = _UNK_007fc2c8;
          uVar14 = _UNK_007fc2c0;
          unaff_x25[0x1a5] = _UNK_007fc2c8;
          unaff_x25[0x1a4] = uVar14;
          uVar5 = _UNK_0082fd28;
          uVar31 = _UNK_0082fd20;
          unaff_x25[0x1a7] = _UNK_0082fd28;
          unaff_x25[0x1a6] = uVar31;
          uVar7 = _UNK_0082fd38;
          uVar6 = _UNK_0082fd30;
          unaff_x25[0x1a9] = _UNK_0082fd38;
          unaff_x25[0x1a8] = uVar6;
          unaff_x25[0x1ab] = 0x300;
          unaff_x25[0x1aa] = 0x300;
          uVar16 = _UNK_0082fd48;
          uVar8 = _UNK_0082fd40;
          unaff_x25[0x1ad] = _UNK_0082fd48;
          unaff_x25[0x1ac] = uVar8;
          *(undefined8 *)(unaff_x29 + -0x60) = 0x300;
          unaff_x19 = &UNK_00879210;
          func_0x002e0668(unaff_x29 + -0xb0,acStack_7ffffffe + 0x8000133e,
                          acStack_7ffffffe + 0x8000165e,&UNK_00879210);
          _memcpy(acStack_7ffffffe + 0x8000195e,acStack_7ffffffe + 0x8000133e,800);
          func_0x002eafd4(acStack_7ffffffe + 0x8000133e,800,acStack_7ffffffe + 0x80001c7e);
          uVar10 = _UNK_00879248;
          uVar9 = _UNK_00879240;
          uVar30 = _UNK_00879230;
          unaff_x25[0x191] = _UNK_00879238;
          unaff_x25[400] = uVar30;
          unaff_x25[0x193] = uVar10;
          unaff_x25[0x192] = uVar9;
          iVar11 = func_0x002fd75c(&UNK_00879570,acStack_7ffffffe + 0x8000165e,0x660,
                                   "ML-KEM keyGen decaps");
          if ((iVar11 == 0) ||
             (iVar11 = func_0x002fd75c(&UNK_00879250,acStack_7ffffffe + 0x8000133e,800,
                                       "ML-KEM keyGen encaps"), iVar11 == 0)) goto LAB_002fdd0c;
          _memcpy(acStack_7ffffffe + 0x8000101e,&UNK_00879bd0,800);
          _bzero(acStack_7ffffffe + 0x80000d1e,0x300);
          unaff_x25[0x1a5] = uVar18;
          unaff_x25[0x1a4] = uVar14;
          unaff_x25[0x1a7] = uVar5;
          unaff_x25[0x1a6] = uVar31;
          unaff_x25[0x1a9] = uVar7;
          unaff_x25[0x1a8] = uVar6;
          unaff_x25[0x1ab] = 0x300;
          unaff_x25[0x1aa] = 0x300;
          unaff_x25[0x1ad] = uVar16;
          unaff_x25[0x1ac] = uVar8;
          *(undefined8 *)(unaff_x29 + -0x60) = 0x300;
          uVar10 = _UNK_00879f08;
          uVar9 = _UNK_00879f00;
          uVar30 = _UNK_00879ef0;
          unaff_x25[0x19d] = _UNK_00879ef8;
          unaff_x25[0x19c] = uVar30;
          unaff_x25[0x19f] = uVar10;
          unaff_x25[0x19e] = uVar9;
          func_0x002eafd4(acStack_7ffffffe + 0x8000101e,800,unaff_x29 + -0xd0);
          unaff_x19 = acStack_7ffffffe + 0x80001cbe;
          func_0x002e345c(unaff_x29 + -0xf0,0x40,acStack_7ffffffe + 0x80001cbe);
          func_0x002e5194(unaff_x29 + -0xb0,acStack_7ffffffe + 0x80000d1e,unaff_x29 + -0xf0,
                          acStack_7ffffffe + 0x8000101e,acStack_7ffffffe + 0x80001cde);
          uVar30 = unaff_x25[0x194];
          unaff_x26[0xcd] = unaff_x25[0x195];
          unaff_x26[0xcc] = uVar30;
          uVar30 = unaff_x25[0x196];
          unaff_x26[0xcf] = unaff_x25[0x197];
          unaff_x26[0xce] = uVar30;
          func_0x0036e464(unaff_x29 + -0xf0,0x40);
          func_0x0036e464(acStack_7ffffffe + 0x80001cbe,0x40);
          iVar11 = func_0x002fd75c(&UNK_00879f10,acStack_7ffffffe + 0x80000d1e,0x300,
                                   "ML-KEM encapsulate ciphertext");
          if ((iVar11 == 0) ||
             (iVar11 = func_0x002fd75c(&UNK_0087a210,acStack_7ffffffe + 0x80000cfe,0x20,
                                       "ML-KEM encapsulate shared secret"), iVar11 == 0))
          goto LAB_002fdd0c;
          _memcpy(acStack_7ffffffe + 0x8000069e,&UNK_0087a230,0x660);
          unaff_x19 = section_000002e8.segname + 8;
          _memcpy(acStack_7ffffffe + 0x8000039e,&UNK_0087a890,0x300);
          _memcpy(&uStack00000000000000a0,&UNK_0087abb0,0x300);
          unaff_x25[0x1a5] = uVar18;
          unaff_x25[0x1a4] = uVar14;
          unaff_x25[0x1a7] = uVar5;
          unaff_x25[0x1a6] = uVar31;
          unaff_x25[0x1a9] = uVar7;
          unaff_x25[0x1a8] = uVar6;
          unaff_x25[0x1ab] = 0x300;
          unaff_x25[0x1aa] = 0x300;
          unaff_x25[0x1ad] = uVar16;
          unaff_x25[0x1ac] = uVar8;
          *(undefined8 *)(unaff_x29 + -0x60) = 0x300;
          iVar11 = func_0x002eb798(unaff_x29 + -0xb0,acStack_7ffffffe + 0x80000cfe,
                                   acStack_7ffffffe + 0x8000039e,acStack_7ffffffe + 0x8000069e);
          if ((iVar11 != 0) ||
             (iVar11 = func_0x002fd75c(&UNK_0087ab90,acStack_7ffffffe + 0x80000cfe,0x20,
                                       "ML-KEM decapsulate non-rejection"), iVar11 == 0))
          goto LAB_002fdd0c;
          unaff_x25[0x1a5] = uVar18;
          unaff_x25[0x1a4] = uVar14;
          unaff_x25[0x1a7] = uVar5;
          unaff_x25[0x1a6] = uVar31;
          unaff_x25[0x1a9] = uVar7;
          unaff_x25[0x1a8] = uVar6;
          unaff_x25[0x1ab] = 0x300;
          unaff_x25[0x1aa] = 0x300;
          unaff_x25[0x1ad] = uVar16;
          unaff_x25[0x1ac] = uVar8;
          *(undefined8 *)(unaff_x29 + -0x60) = 0x300;
          iVar11 = func_0x002eb798(unaff_x29 + -0xb0,acStack_7ffffffe + 0x80000cfe,
                                   &uStack00000000000000a0,acStack_7ffffffe + 0x8000069e);
          if (iVar11 != 0) goto LAB_002fdd0c;
          uVar16 = func_0x002fd75c(&UNK_0087aeb0,acStack_7ffffffe + 0x80000cfe,0x20,
                                   "ML-KEM decapsulate implicit rejection");
          uVar8 = _UNK_0087afa8;
          uVar7 = _UNK_0087afa0;
          uVar6 = _UNK_0087af90;
          uVar5 = _UNK_0087af08;
          uVar31 = _UNK_0087af00;
          uVar18 = _UNK_0087aef8;
          uVar14 = _UNK_0087aef0;
          if ((int)uVar16 != 0) {
            in_stack_000000a8 = _UNK_0087aef8;
            uStack00000000000000a0 = _UNK_0087aef0;
            in_stack_000000b8 = _UNK_0087af08;
            in_stack_000000b0 = _UNK_0087af00;
            unaff_x25[0xd1] = _UNK_0087af98;
            unaff_x25[0xd0] = uVar6;
            unaff_x25[0xd3] = uVar8;
            unaff_x25[0xd2] = uVar7;
            uVar8 = _UNK_0087afc8;
            uVar7 = _UNK_0087afc0;
            uVar6 = _UNK_0087afb0;
            unaff_x25[0xd5] = _UNK_0087afb8;
            unaff_x25[0xd4] = uVar6;
            unaff_x25[0xd7] = uVar8;
            unaff_x25[0xd6] = uVar7;
            uVar8 = _UNK_0087af68;
            uVar7 = _UNK_0087af60;
            uVar6 = _UNK_0087af50;
            unaff_x25[0xc9] = _UNK_0087af58;
            unaff_x25[200] = uVar6;
            unaff_x25[0xcb] = uVar8;
            unaff_x25[0xca] = uVar7;
            uVar8 = _UNK_0087af88;
            uVar7 = _UNK_0087af80;
            uVar6 = _UNK_0087af70;
            unaff_x25[0xcd] = _UNK_0087af78;
            unaff_x25[0xcc] = uVar6;
            unaff_x25[0xcf] = uVar8;
            unaff_x25[0xce] = uVar7;
            uVar8 = _UNK_0087aee8;
            uVar7 = _UNK_0087aee0;
            uVar6 = _UNK_0087aed0;
            unaff_x26[1] = _UNK_0087aed8;
            *unaff_x26 = uVar6;
            unaff_x26[3] = uVar8;
            unaff_x26[2] = uVar7;
            unaff_x26[5] = uVar18;
            unaff_x26[4] = uVar14;
            unaff_x26[7] = uVar5;
            unaff_x26[6] = uVar31;
            unaff_x25[0x69] = 0;
            unaff_x25[0x68] = 0;
            unaff_x25[0x6b] = 0;
            unaff_x25[0x6a] = 0;
            unaff_x25[0x65] = 0;
            unaff_x25[100] = 0;
            unaff_x25[0x67] = 0;
            unaff_x25[0x66] = 0;
            func_0x002b64bc(acStack_7ffffffe + 0x8000133e,acStack_7ffffffe + 0x8000165e,0x80,
                            acStack_7ffffffe + 0x8000069e);
            iVar11 = func_0x002fd75c(&UNK_0087af10,acStack_7ffffffe + 0x8000133e,0x40,"ED25519 sign"
                                    );
            if (iVar11 == 0) {
              uVar18 = *unaff_x24;
              pcVar17 = "ED25519 sign failed.\n";
              uVar14 = 0x15;
            }
            else {
              unaff_x25[1] = unaff_x25[0x65];
              *unaff_x25 = unaff_x25[100];
              unaff_x25[3] = unaff_x25[0x67];
              unaff_x25[2] = unaff_x25[0x66];
              uVar31 = unaff_x25[0x69];
              uVar18 = unaff_x25[0x68];
              uVar14 = unaff_x25[0x6a];
              unaff_x26[0xd3] = unaff_x25[0x6b];
              unaff_x26[0xd2] = uVar14;
              unaff_x26[0xd1] = uVar31;
              unaff_x26[0xd0] = uVar18;
              if ((*(byte *)((long)unaff_x25 + 0x35f) < 0x20) &&
                 (in_stack_00000d38 < 0x1000000000000001)) {
                if (in_stack_00000d38 >> 0x3c == 0) {
code_r0x002ff5bc:
                  iVar11 = func_0x002b6a60(acStack_7ffffffe + 0x8000039e,&uStack00000000000000a0,
                                           acStack_7ffffffe + 0x8000101e,
                                           acStack_7ffffffe + 0x80000d1e,
                                           acStack_7ffffffe + 0x8000165e,0x80);
                  if ((iVar11 != 0) &&
                     (iVar11 = func_0x0036e62c(acStack_7ffffffe + 0x8000039e,
                                               acStack_7ffffffe + 0x8000101e,0x20), iVar11 == 0)) {
                    uVar16 = 1;
                    goto code_r0x002fdd10;
                  }
                }
                else if (in_stack_00000d30 == 0) {
                  if ((in_stack_00000d28 < 0x14def9dea2f79cd7) &&
                     ((in_stack_00000d28 != 0x14def9dea2f79cd6 ||
                      (CONCAT44(in_stack_00000d24,in_stack_00000d20) < 0x5812631a5cf5d3ed))))
                  goto code_r0x002ff5bc;
                }
              }
              uVar18 = *unaff_x24;
              pcVar17 = "ED25519 verify failed.\n";
              uVar14 = 0x17;
            }
            _fwrite(pcVar17,uVar14,1,uVar18);
            goto LAB_002fdd0c;
          }
        }
code_r0x002fdd10:
        if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x58)) {
          return;
        }
        ___stack_chk_fail(uVar16);
code_r0x002ff0fc:
        func_0x002bf97c(unaff_x20);
code_r0x002ff104:
        unaff_x20 = (long *)0x0;
code_r0x002ff108:
        bVar29 = true;
        _fwrite("FFDH failed.\n",0xd,1,*unaff_x24);
        puVar28 = (undefined8 *)0x0;
        plVar20 = (long *)0x0;
      } while( true );
    }
  }
  uVar18 = *unaff_x24;
  pcVar17 = "ECDSA-verify KAT failed.\n";
  uVar14 = 0x19;
LAB_002fec50:
  _fwrite(pcVar17,uVar14,1,uVar18);
  func_0x002c3420();
  func_0x002c398c(unaff_x20);
  goto LAB_002fdd0c;
}

