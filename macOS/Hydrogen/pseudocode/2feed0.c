
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_002feed0(undefined8 param_1,long param_2)

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
  char *pcVar12;
  undefined8 *puVar13;
  undefined8 uVar14;
  char *pcVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  uint uVar18;
  long *plVar19;
  ulong uVar20;
  long *plVar21;
  ulong uVar22;
  long lVar23;
  long lVar24;
  ulong uVar25;
  uint uVar26;
  ulong uVar27;
  long *unaff_x20;
  undefined8 *unaff_x21;
  undefined8 *unaff_x22;
  undefined8 *puVar28;
  bool bVar29;
  undefined8 *unaff_x23;
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
  ulong in_stack_00000d20;
  ulong in_stack_00000d28;
  long in_stack_00000d30;
  ulong in_stack_00000d38;
  char acStack_7ffffffe [6];
  long alStack_7ffffff8 [268435455];
  
  iVar11 = func_0x002fd75c(param_1,param_2 + 0x660,0x41);
  if (iVar11 == 0) {
    _fwrite("Z-computation KAT failed.\n",0x1a,1,*unaff_x24);
    func_0x002c3420();
    pcVar12 = (char *)0x0;
    pcVar15 = (char *)0x0;
    if (unaff_x21 != (undefined8 *)0x0) goto LAB_002fefa8;
  }
  else {
    func_0x002c3420();
    pcVar15 = (char *)((long)&MACH_HEADER.magic + 1);
LAB_002fefa8:
    pcVar12 = pcVar15;
    func_0x002c6434(*unaff_x21);
    func_0x0036e3d8();
  }
  if (unaff_x22 != (undefined8 *)0x0) {
    func_0x002c6434(*unaff_x22);
    func_0x0036e3d8();
  }
  if (unaff_x23 != (undefined8 *)0x0) {
    uVar18 = *(uint *)((long)unaff_x23 + 0x14);
    if ((uVar18 >> 1 & 1) == 0) {
      func_0x0036e3d8(*unaff_x23);
      uVar18 = *(uint *)((long)unaff_x23 + 0x14);
    }
    if ((uVar18 & 1) == 0) {
      *unaff_x23 = 0;
    }
    else {
      func_0x0036e3d8();
    }
  }
  func_0x002c398c();
  if ((int)pcVar12 == 0) goto code_r0x002fdd0c;
  pcVar12 = (char *)func_0x0036e31c(0x18);
  if (pcVar12 != (char *)0x0) {
    *(undefined4 *)(pcVar12 + 0x14) = 1;
    func_0x0036e3d8(*(undefined8 *)pcVar12);
    *(undefined **)pcVar12 = &UNK_00878ab8;
    *(qword *)(pcVar12 + 8) = 0x2000000020;
    *(undefined4 *)(pcVar12 + 0x10) = 0;
    *(uint *)(pcVar12 + 0x14) = *(uint *)(pcVar12 + 0x14) | 2;
  }
  unaff_x20 = (long *)func_0x002c0f98(&UNK_00831198,0x20);
  if (unaff_x20 == (long *)0x0) goto code_r0x002ff104;
  puVar13 = (undefined8 *)func_0x0036e31c(0x18);
  if (puVar13 == (undefined8 *)0x0) goto code_r0x002ff0fc;
  *(undefined4 *)((long)puVar13 + 0x14) = 1;
  func_0x0036e3d8(*puVar13);
  *puVar13 = &UNK_00878eb8;
  puVar13[1] = 0x400000004;
  *(undefined4 *)(puVar13 + 2) = 0;
  *(uint *)((long)puVar13 + 0x14) = *(uint *)((long)puVar13 + 0x14) | 2;
  puVar28 = (undefined8 *)unaff_x20[4];
  if (puVar28 != (undefined8 *)0x0) {
    uVar18 = *(uint *)((long)puVar28 + 0x14);
    if ((uVar18 >> 1 & 1) == 0) {
      func_0x0036e3d8(*puVar28);
      uVar18 = *(uint *)((long)puVar28 + 0x14);
    }
    if ((uVar18 & 1) == 0) {
      *puVar28 = 0;
    }
    else {
      func_0x0036e3d8(puVar28);
    }
  }
  unaff_x20[4] = (long)puVar13;
  if (pcVar12 == (char *)0x0) goto code_r0x002ff108;
  plVar19 = (long *)*unaff_x20;
  uVar4 = *(uint *)(plVar19 + 1);
  uVar22 = (ulong)uVar4;
  uVar18 = uVar4 & (int)uVar4 >> 0x1f;
  lVar23 = uVar22 * 8;
  do {
    lVar23 = lVar23 + -8;
    uVar26 = (uint)uVar22;
    uVar22 = (ulong)(uVar26 - 1);
    if ((int)uVar26 < 1) {
      if (-1 < (int)uVar4) goto code_r0x002ff108;
      lVar24 = *plVar19;
      goto code_r0x002ff66c;
    }
    lVar24 = *plVar19;
  } while (*(long *)(lVar24 + lVar23) == 0);
  uVar18 = uVar26;
code_r0x002ff66c:
  uVar20 = *(ulong *)(lVar24 + (long)(int)(uVar18 - 1) * 8);
  uVar25 = uVar20 >> 0x20;
  uVar22 = uVar25;
  if (uVar25 == 0) {
    uVar22 = uVar20;
  }
  uVar27 = uVar22 >> 0x10;
  uVar1 = uVar27;
  if (uVar27 == 0) {
    uVar1 = uVar22;
  }
  uVar22 = uVar1 >> 8;
  if (uVar1 < 0x100) {
    uVar22 = uVar1;
  }
  uVar2 = uVar22 >> 4;
  if (uVar22 < 0x10) {
    uVar2 = uVar22;
  }
  uVar3 = uVar2 >> 2;
  if (uVar2 < 4) {
    uVar3 = uVar2;
  }
  uVar18 = (uint)(uVar20 != 0) | (uVar18 - 1) * 0x40 | (uint)(uVar25 != 0) << 5 |
           (uint)(uVar27 != 0) << 4 | (uint)(0xff < uVar1) << 3 | (uint)(0xf < uVar22) << 2 |
           (uint)(3 < uVar2) << 1;
  if (1 < uVar3) {
    uVar18 = uVar18 + 1;
  }
  if ((uVar18 + 7 & 0xfffffff8) != 0x800) goto code_r0x002ff108;
  iVar11 = func_0x002c0134(acStack_7ffffffe + 0x8000165e,pcVar12,unaff_x20);
  if (iVar11 != 0x100) goto code_r0x002ff108;
  iVar11 = func_0x002fd75c(&UNK_00878bb8,acStack_7ffffffe + 0x8000165e,0x100,"FFC DH");
  if (iVar11 == 0) goto code_r0x002ff108;
  puVar13 = (undefined8 *)func_0x0029c764(&UNK_00878cb8,0x100,0);
  plVar19 = (long *)func_0x0036e31c(0x108);
  if (plVar19 == (long *)0x0) {
code_r0x002ff854:
    func_0x002bf97c(plVar19);
    plVar19 = (long *)0x0;
  }
  else {
    func_0x00373d98(plVar19 + 6);
    *(undefined4 *)((long)plVar19 + 0x104) = 1;
    lVar23 = func_0x0029c764(&UNK_00878ed8,0x100,0);
    *plVar19 = lVar23;
    if (lVar23 == 0) goto code_r0x002ff854;
    lVar23 = func_0x0029c764(&UNK_00878fd8,0x1c,0);
    plVar19[2] = lVar23;
    if (lVar23 == 0) goto code_r0x002ff854;
    lVar23 = func_0x0029c764(&UNK_00878ff4,0x100,0);
    plVar19[1] = lVar23;
    if (lVar23 == 0) goto code_r0x002ff854;
    lVar23 = func_0x0029c764(&UNK_008790f4,0x1c,0);
    plVar19[4] = lVar23;
    if (lVar23 == 0) goto code_r0x002ff854;
    lVar23 = func_0x0029c764(&UNK_00879110,0x100,0);
    plVar19[3] = lVar23;
    if (lVar23 == 0) goto code_r0x002ff854;
    if (puVar13 != (undefined8 *)0x0) {
      plVar21 = (long *)*plVar19;
      uVar4 = *(uint *)(plVar21 + 1);
      uVar22 = (ulong)uVar4;
      uVar18 = uVar4 & (int)uVar4 >> 0x1f;
      lVar23 = uVar22 * 8;
      do {
        lVar23 = lVar23 + -8;
        uVar26 = (uint)uVar22;
        uVar22 = (ulong)(uVar26 - 1);
        if ((int)uVar26 < 1) {
          if (-1 < (int)uVar4) goto code_r0x002ff860;
          lVar24 = *plVar21;
          goto code_r0x002ff904;
        }
        lVar24 = *plVar21;
      } while (*(long *)(lVar24 + lVar23) == 0);
      uVar18 = uVar26;
code_r0x002ff904:
      uVar20 = *(ulong *)(lVar24 + (long)(int)(uVar18 - 1) * 8);
      uVar25 = uVar20 >> 0x20;
      uVar22 = uVar25;
      if (uVar25 == 0) {
        uVar22 = uVar20;
      }
      uVar27 = uVar22 >> 0x10;
      uVar1 = uVar27;
      if (uVar27 == 0) {
        uVar1 = uVar22;
      }
      uVar22 = uVar1 >> 8;
      if (uVar1 < 0x100) {
        uVar22 = uVar1;
      }
      uVar2 = uVar22 >> 4;
      if (uVar22 < 0x10) {
        uVar2 = uVar22;
      }
      uVar3 = uVar2 >> 2;
      if (uVar2 < 4) {
        uVar3 = uVar2;
      }
      uVar18 = (uint)(uVar20 != 0) | (uVar18 - 1) * 0x40 | (uint)(uVar25 != 0) << 5 |
               (uint)(uVar27 != 0) << 4 | (uint)(0xff < uVar1) << 3 | (uint)(0xf < uVar22) << 2 |
               (uint)(3 < uVar2) << 1;
      if (1 < uVar3) {
        uVar18 = uVar18 + 1;
      }
      if ((((uVar18 + 7 & 0xfffffff8) == 0x800) &&
          (iVar11 = func_0x002c0134(acStack_7ffffffe + 0x8000069e,puVar13,plVar19), iVar11 == 0x100)
          ) && (iVar11 = func_0x002fd75c(&UNK_00878db8,acStack_7ffffffe + 0x8000069e,0x100,
                                         "FFC DH FB"), iVar11 != 0)) {
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
    if (pcVar12 != (char *)0x0) {
      uVar18 = *(uint *)(pcVar12 + 0x14);
      if ((uVar18 >> 1 & 1) == 0) {
        func_0x0036e3d8(*(undefined8 *)pcVar12);
        uVar18 = *(uint *)(pcVar12 + 0x14);
      }
      if ((uVar18 & 1) == 0) {
        pcVar12[0] = '\0';
        pcVar12[1] = '\0';
        pcVar12[2] = '\0';
        pcVar12[3] = '\0';
        pcVar12[4] = '\0';
        pcVar12[5] = '\0';
        pcVar12[6] = '\0';
        pcVar12[7] = '\0';
      }
      else {
        func_0x0036e3d8(pcVar12);
      }
    }
    func_0x002bf97c(plVar19);
    if (puVar13 != (undefined8 *)0x0) {
      uVar18 = *(uint *)((long)puVar13 + 0x14);
      if ((uVar18 >> 1 & 1) == 0) {
        func_0x0036e3d8(*puVar13);
        uVar18 = *(uint *)((long)puVar13 + 0x14);
      }
      if ((uVar18 & 1) == 0) {
        *puVar13 = 0;
      }
      else {
        func_0x0036e3d8(puVar13);
      }
    }
    if (bVar29) {
code_r0x002fdd0c:
      uVar14 = 0;
    }
    else {
      unaff_x20 = (long *)(acStack_7ffffffe + 0x8000165e);
      _bzero(acStack_7ffffffe + 0x8000165e,0x660);
      _bzero(acStack_7ffffffe + 0x8000133e,800);
      uVar17 = _UNK_007fc2c8;
      uVar16 = _UNK_007fc2c0;
      unaff_x25[0x1a5] = _UNK_007fc2c8;
      unaff_x25[0x1a4] = uVar16;
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
      uVar14 = _UNK_0082fd48;
      uVar8 = _UNK_0082fd40;
      unaff_x25[0x1ad] = _UNK_0082fd48;
      unaff_x25[0x1ac] = uVar8;
      *(undefined8 *)(unaff_x29 + -0x60) = 0x300;
      pcVar12 = &UNK_00879210;
      func_0x002e0668(unaff_x29 + -0xb0,acStack_7ffffffe + 0x8000133e,acStack_7ffffffe + 0x8000165e,
                      &UNK_00879210);
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
                                   "ML-KEM keyGen encaps"), iVar11 == 0)) goto code_r0x002fdd0c;
      _memcpy(acStack_7ffffffe + 0x8000101e,&UNK_00879bd0,800);
      _bzero(acStack_7ffffffe + 0x80000d1e,0x300);
      unaff_x25[0x1a5] = uVar17;
      unaff_x25[0x1a4] = uVar16;
      unaff_x25[0x1a7] = uVar5;
      unaff_x25[0x1a6] = uVar31;
      unaff_x25[0x1a9] = uVar7;
      unaff_x25[0x1a8] = uVar6;
      unaff_x25[0x1ab] = 0x300;
      unaff_x25[0x1aa] = 0x300;
      unaff_x25[0x1ad] = uVar14;
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
      pcVar12 = acStack_7ffffffe + 0x80001cbe;
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
      goto code_r0x002fdd0c;
      _memcpy(acStack_7ffffffe + 0x8000069e,&UNK_0087a230,0x660);
      pcVar12 = section_000002e8.segname + 8;
      _memcpy(acStack_7ffffffe + 0x8000039e,&UNK_0087a890,0x300);
      _memcpy(&uStack00000000000000a0,&UNK_0087abb0,0x300);
      unaff_x25[0x1a5] = uVar17;
      unaff_x25[0x1a4] = uVar16;
      unaff_x25[0x1a7] = uVar5;
      unaff_x25[0x1a6] = uVar31;
      unaff_x25[0x1a9] = uVar7;
      unaff_x25[0x1a8] = uVar6;
      unaff_x25[0x1ab] = 0x300;
      unaff_x25[0x1aa] = 0x300;
      unaff_x25[0x1ad] = uVar14;
      unaff_x25[0x1ac] = uVar8;
      *(undefined8 *)(unaff_x29 + -0x60) = 0x300;
      iVar11 = func_0x002eb798(unaff_x29 + -0xb0,acStack_7ffffffe + 0x80000cfe,
                               acStack_7ffffffe + 0x8000039e,acStack_7ffffffe + 0x8000069e);
      if ((iVar11 != 0) ||
         (iVar11 = func_0x002fd75c(&UNK_0087ab90,acStack_7ffffffe + 0x80000cfe,0x20,
                                   "ML-KEM decapsulate non-rejection"), iVar11 == 0))
      goto code_r0x002fdd0c;
      unaff_x25[0x1a5] = uVar17;
      unaff_x25[0x1a4] = uVar16;
      unaff_x25[0x1a7] = uVar5;
      unaff_x25[0x1a6] = uVar31;
      unaff_x25[0x1a9] = uVar7;
      unaff_x25[0x1a8] = uVar6;
      unaff_x25[0x1ab] = 0x300;
      unaff_x25[0x1aa] = 0x300;
      unaff_x25[0x1ad] = uVar14;
      unaff_x25[0x1ac] = uVar8;
      *(undefined8 *)(unaff_x29 + -0x60) = 0x300;
      iVar11 = func_0x002eb798(unaff_x29 + -0xb0,acStack_7ffffffe + 0x80000cfe,
                               &uStack00000000000000a0,acStack_7ffffffe + 0x8000069e);
      if (iVar11 != 0) goto code_r0x002fdd0c;
      uVar14 = func_0x002fd75c(&UNK_0087aeb0,acStack_7ffffffe + 0x80000cfe,0x20,
                               "ML-KEM decapsulate implicit rejection");
      uVar8 = _UNK_0087afa8;
      uVar7 = _UNK_0087afa0;
      uVar6 = _UNK_0087af90;
      uVar5 = _UNK_0087af08;
      uVar31 = _UNK_0087af00;
      uVar17 = _UNK_0087aef8;
      uVar16 = _UNK_0087aef0;
      if ((int)uVar14 != 0) {
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
        unaff_x26[5] = uVar17;
        unaff_x26[4] = uVar16;
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
        iVar11 = func_0x002fd75c(&UNK_0087af10,acStack_7ffffffe + 0x8000133e,0x40,"ED25519 sign");
        if (iVar11 == 0) {
          uVar17 = *unaff_x24;
          pcVar15 = "ED25519 sign failed.\n";
          uVar16 = 0x15;
        }
        else {
          unaff_x25[1] = unaff_x25[0x65];
          *unaff_x25 = unaff_x25[100];
          unaff_x25[3] = unaff_x25[0x67];
          unaff_x25[2] = unaff_x25[0x66];
          uVar31 = unaff_x25[0x69];
          uVar17 = unaff_x25[0x68];
          uVar16 = unaff_x25[0x6a];
          unaff_x26[0xd3] = unaff_x25[0x6b];
          unaff_x26[0xd2] = uVar16;
          unaff_x26[0xd1] = uVar31;
          unaff_x26[0xd0] = uVar17;
          if ((*(byte *)((long)unaff_x25 + 0x35f) < 0x20) &&
             (in_stack_00000d38 < 0x1000000000000001)) {
            if (in_stack_00000d38 >> 0x3c == 0) {
code_r0x002ff5bc:
              iVar11 = func_0x002b6a60(acStack_7ffffffe + 0x8000039e,&uStack00000000000000a0,
                                       acStack_7ffffffe + 0x8000101e,acStack_7ffffffe + 0x80000d1e,
                                       acStack_7ffffffe + 0x8000165e,0x80);
              if ((iVar11 != 0) &&
                 (iVar11 = func_0x0036e62c(acStack_7ffffffe + 0x8000039e,
                                           acStack_7ffffffe + 0x8000101e,0x20), iVar11 == 0)) {
                uVar14 = 1;
                goto code_r0x002fdd10;
              }
            }
            else if (in_stack_00000d30 == 0) {
              if ((in_stack_00000d28 < 0x14def9dea2f79cd7) &&
                 ((in_stack_00000d28 != 0x14def9dea2f79cd6 ||
                  (in_stack_00000d20 < 0x5812631a5cf5d3ed)))) goto code_r0x002ff5bc;
            }
          }
          uVar17 = *unaff_x24;
          pcVar15 = "ED25519 verify failed.\n";
          uVar16 = 0x17;
        }
        _fwrite(pcVar15,uVar16,1,uVar17);
        goto code_r0x002fdd0c;
      }
    }
code_r0x002fdd10:
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x58)) {
      return;
    }
    ___stack_chk_fail(uVar14);
code_r0x002ff0fc:
    func_0x002bf97c(unaff_x20);
code_r0x002ff104:
    unaff_x20 = (long *)0x0;
code_r0x002ff108:
    bVar29 = true;
    _fwrite("FFDH failed.\n",0xd,1,*unaff_x24);
    puVar13 = (undefined8 *)0x0;
    plVar19 = (long *)0x0;
  } while( true );
}

