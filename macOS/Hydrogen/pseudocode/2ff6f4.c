
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_002ff6f4(void)

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
  undefined8 uVar12;
  undefined8 *puVar13;
  long *plVar14;
  long lVar15;
  char *pcVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  int in_w8;
  uint uVar19;
  long *plVar20;
  ulong uVar21;
  ulong uVar22;
  long lVar23;
  ulong uVar24;
  uint uVar25;
  ulong uVar26;
  char *unaff_x19;
  char *unaff_x20;
  bool bVar27;
  undefined8 *unaff_x24;
  undefined8 *unaff_x25;
  undefined8 *unaff_x26;
  long unaff_x29;
  undefined8 uVar28;
  undefined8 uVar29;
  undefined8 uStack00000000000000a0;
  undefined8 in_stack_000000a8;
  undefined8 in_stack_000000b0;
  undefined8 in_stack_000000b8;
  ulong in_stack_00000d20;
  ulong in_stack_00000d28;
  long in_stack_00000d30;
  ulong in_stack_00000d38;
  char acStack_7ffffffe [2147483646];
  
  if (in_w8 != 0x800) goto LAB_002ff108;
  iVar11 = func_0x002c0134(acStack_7ffffffe + 0x8000165e);
  if (iVar11 != 0x100) goto LAB_002ff108;
  iVar11 = func_0x002fd75c(&UNK_00878bb8,acStack_7ffffffe + 0x8000165e,0x100,"FFC DH");
  if (iVar11 == 0) goto LAB_002ff108;
  puVar13 = (undefined8 *)func_0x0029c764(&UNK_00878cb8,0x100,0);
  plVar14 = (long *)func_0x0036e31c(0x108);
  if (plVar14 == (long *)0x0) {
LAB_002ff854:
    func_0x002bf97c(plVar14);
    plVar14 = (long *)0x0;
  }
  else {
    func_0x00373d98(plVar14 + 6);
    *(undefined4 *)((long)plVar14 + 0x104) = 1;
    lVar15 = func_0x0029c764(&UNK_00878ed8,0x100,0);
    *plVar14 = lVar15;
    if (lVar15 == 0) goto LAB_002ff854;
    lVar15 = func_0x0029c764(&UNK_00878fd8,0x1c,0);
    plVar14[2] = lVar15;
    if (lVar15 == 0) goto LAB_002ff854;
    lVar15 = func_0x0029c764(&UNK_00878ff4,0x100,0);
    plVar14[1] = lVar15;
    if (lVar15 == 0) goto LAB_002ff854;
    lVar15 = func_0x0029c764(&UNK_008790f4,0x1c,0);
    plVar14[4] = lVar15;
    if (lVar15 == 0) goto LAB_002ff854;
    lVar15 = func_0x0029c764(&UNK_00879110,0x100,0);
    plVar14[3] = lVar15;
    if (lVar15 == 0) goto LAB_002ff854;
    if (puVar13 != (undefined8 *)0x0) {
      plVar20 = (long *)*plVar14;
      uVar4 = *(uint *)(plVar20 + 1);
      uVar22 = (ulong)uVar4;
      uVar19 = uVar4 & (int)uVar4 >> 0x1f;
      lVar15 = uVar22 * 8;
      do {
        lVar15 = lVar15 + -8;
        uVar25 = (uint)uVar22;
        uVar22 = (ulong)(uVar25 - 1);
        if ((int)uVar25 < 1) {
          if (-1 < (int)uVar4) goto LAB_002ff860;
          lVar23 = *plVar20;
          goto LAB_002ff904;
        }
        lVar23 = *plVar20;
      } while (*(long *)(lVar23 + lVar15) == 0);
      uVar19 = uVar25;
LAB_002ff904:
      uVar21 = *(ulong *)(lVar23 + (long)(int)(uVar19 - 1) * 8);
      uVar24 = uVar21 >> 0x20;
      uVar22 = uVar24;
      if (uVar24 == 0) {
        uVar22 = uVar21;
      }
      uVar26 = uVar22 >> 0x10;
      uVar1 = uVar26;
      if (uVar26 == 0) {
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
      uVar19 = (uint)(uVar21 != 0) | (uVar19 - 1) * 0x40 | (uint)(uVar24 != 0) << 5 |
               (uint)(uVar26 != 0) << 4 | (uint)(0xff < uVar1) << 3 | (uint)(0xf < uVar22) << 2 |
               (uint)(3 < uVar2) << 1;
      if (1 < uVar3) {
        uVar19 = uVar19 + 1;
      }
      if ((((uVar19 + 7 & 0xfffffff8) == 0x800) &&
          (iVar11 = func_0x002c0134(acStack_7ffffffe + 0x8000069e,puVar13,plVar14), iVar11 == 0x100)
          ) && (iVar11 = func_0x002fd75c(&UNK_00878db8,acStack_7ffffffe + 0x8000069e,0x100,
                                         "FFC DH FB"), iVar11 != 0)) {
        bVar27 = false;
        goto LAB_002ff12c;
      }
    }
  }
LAB_002ff860:
  bVar27 = true;
  _fwrite("FFDH FB failed.\n",0x10,1,*unaff_x24);
LAB_002ff12c:
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
    func_0x002bf97c(plVar14);
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
    if (bVar27) {
code_r0x002fdd0c:
      uVar12 = 0;
    }
    else {
      unaff_x20 = acStack_7ffffffe + 0x8000165e;
      _bzero(acStack_7ffffffe + 0x8000165e,0x660);
      _bzero(acStack_7ffffffe + 0x8000133e,800);
      uVar18 = _UNK_007fc2c8;
      uVar17 = _UNK_007fc2c0;
      unaff_x25[0x1a5] = _UNK_007fc2c8;
      unaff_x25[0x1a4] = uVar17;
      uVar5 = _UNK_0082fd28;
      uVar29 = _UNK_0082fd20;
      unaff_x25[0x1a7] = _UNK_0082fd28;
      unaff_x25[0x1a6] = uVar29;
      uVar7 = _UNK_0082fd38;
      uVar6 = _UNK_0082fd30;
      unaff_x25[0x1a9] = _UNK_0082fd38;
      unaff_x25[0x1a8] = uVar6;
      unaff_x25[0x1ab] = 0x300;
      unaff_x25[0x1aa] = 0x300;
      uVar12 = _UNK_0082fd48;
      uVar8 = _UNK_0082fd40;
      unaff_x25[0x1ad] = _UNK_0082fd48;
      unaff_x25[0x1ac] = uVar8;
      *(undefined8 *)(unaff_x29 + -0x60) = 0x300;
      unaff_x19 = &UNK_00879210;
      func_0x002e0668(unaff_x29 + -0xb0,acStack_7ffffffe + 0x8000133e,acStack_7ffffffe + 0x8000165e,
                      &UNK_00879210);
      _memcpy(acStack_7ffffffe + 0x8000195e,acStack_7ffffffe + 0x8000133e,800);
      func_0x002eafd4(acStack_7ffffffe + 0x8000133e,800,acStack_7ffffffe + 0x80001c7e);
      uVar10 = _UNK_00879248;
      uVar9 = _UNK_00879240;
      uVar28 = _UNK_00879230;
      unaff_x25[0x191] = _UNK_00879238;
      unaff_x25[400] = uVar28;
      unaff_x25[0x193] = uVar10;
      unaff_x25[0x192] = uVar9;
      iVar11 = func_0x002fd75c(&UNK_00879570,acStack_7ffffffe + 0x8000165e,0x660,
                               "ML-KEM keyGen decaps");
      if ((iVar11 == 0) ||
         (iVar11 = func_0x002fd75c(&UNK_00879250,acStack_7ffffffe + 0x8000133e,800,
                                   "ML-KEM keyGen encaps"), iVar11 == 0)) goto code_r0x002fdd0c;
      _memcpy(acStack_7ffffffe + 0x8000101e,&UNK_00879bd0,800);
      _bzero(acStack_7ffffffe + 0x80000d1e,0x300);
      unaff_x25[0x1a5] = uVar18;
      unaff_x25[0x1a4] = uVar17;
      unaff_x25[0x1a7] = uVar5;
      unaff_x25[0x1a6] = uVar29;
      unaff_x25[0x1a9] = uVar7;
      unaff_x25[0x1a8] = uVar6;
      unaff_x25[0x1ab] = 0x300;
      unaff_x25[0x1aa] = 0x300;
      unaff_x25[0x1ad] = uVar12;
      unaff_x25[0x1ac] = uVar8;
      *(undefined8 *)(unaff_x29 + -0x60) = 0x300;
      uVar10 = _UNK_00879f08;
      uVar9 = _UNK_00879f00;
      uVar28 = _UNK_00879ef0;
      unaff_x25[0x19d] = _UNK_00879ef8;
      unaff_x25[0x19c] = uVar28;
      unaff_x25[0x19f] = uVar10;
      unaff_x25[0x19e] = uVar9;
      func_0x002eafd4(acStack_7ffffffe + 0x8000101e,800,unaff_x29 + -0xd0);
      unaff_x19 = acStack_7ffffffe + 0x80001cbe;
      func_0x002e345c(unaff_x29 + -0xf0,0x40,acStack_7ffffffe + 0x80001cbe);
      func_0x002e5194(unaff_x29 + -0xb0,acStack_7ffffffe + 0x80000d1e,unaff_x29 + -0xf0,
                      acStack_7ffffffe + 0x8000101e,acStack_7ffffffe + 0x80001cde);
      uVar28 = unaff_x25[0x194];
      unaff_x26[0xcd] = unaff_x25[0x195];
      unaff_x26[0xcc] = uVar28;
      uVar28 = unaff_x25[0x196];
      unaff_x26[0xcf] = unaff_x25[0x197];
      unaff_x26[0xce] = uVar28;
      func_0x0036e464(unaff_x29 + -0xf0,0x40);
      func_0x0036e464(acStack_7ffffffe + 0x80001cbe,0x40);
      iVar11 = func_0x002fd75c(&UNK_00879f10,acStack_7ffffffe + 0x80000d1e,0x300,
                               "ML-KEM encapsulate ciphertext");
      if ((iVar11 == 0) ||
         (iVar11 = func_0x002fd75c(&UNK_0087a210,acStack_7ffffffe + 0x80000cfe,0x20,
                                   "ML-KEM encapsulate shared secret"), iVar11 == 0))
      goto code_r0x002fdd0c;
      _memcpy(acStack_7ffffffe + 0x8000069e,&UNK_0087a230,0x660);
      unaff_x19 = section_000002e8.segname + 8;
      _memcpy(acStack_7ffffffe + 0x8000039e,&UNK_0087a890,0x300);
      _memcpy(&uStack00000000000000a0,&UNK_0087abb0,0x300);
      unaff_x25[0x1a5] = uVar18;
      unaff_x25[0x1a4] = uVar17;
      unaff_x25[0x1a7] = uVar5;
      unaff_x25[0x1a6] = uVar29;
      unaff_x25[0x1a9] = uVar7;
      unaff_x25[0x1a8] = uVar6;
      unaff_x25[0x1ab] = 0x300;
      unaff_x25[0x1aa] = 0x300;
      unaff_x25[0x1ad] = uVar12;
      unaff_x25[0x1ac] = uVar8;
      *(undefined8 *)(unaff_x29 + -0x60) = 0x300;
      iVar11 = func_0x002eb798(unaff_x29 + -0xb0,acStack_7ffffffe + 0x80000cfe,
                               acStack_7ffffffe + 0x8000039e,acStack_7ffffffe + 0x8000069e);
      if ((iVar11 != 0) ||
         (iVar11 = func_0x002fd75c(&UNK_0087ab90,acStack_7ffffffe + 0x80000cfe,0x20,
                                   "ML-KEM decapsulate non-rejection"), iVar11 == 0))
      goto code_r0x002fdd0c;
      unaff_x25[0x1a5] = uVar18;
      unaff_x25[0x1a4] = uVar17;
      unaff_x25[0x1a7] = uVar5;
      unaff_x25[0x1a6] = uVar29;
      unaff_x25[0x1a9] = uVar7;
      unaff_x25[0x1a8] = uVar6;
      unaff_x25[0x1ab] = 0x300;
      unaff_x25[0x1aa] = 0x300;
      unaff_x25[0x1ad] = uVar12;
      unaff_x25[0x1ac] = uVar8;
      *(undefined8 *)(unaff_x29 + -0x60) = 0x300;
      iVar11 = func_0x002eb798(unaff_x29 + -0xb0,acStack_7ffffffe + 0x80000cfe,
                               &uStack00000000000000a0,acStack_7ffffffe + 0x8000069e);
      if (iVar11 != 0) goto code_r0x002fdd0c;
      uVar12 = func_0x002fd75c(&UNK_0087aeb0,acStack_7ffffffe + 0x80000cfe,0x20,
                               "ML-KEM decapsulate implicit rejection");
      uVar8 = _UNK_0087afa8;
      uVar7 = _UNK_0087afa0;
      uVar6 = _UNK_0087af90;
      uVar5 = _UNK_0087af08;
      uVar29 = _UNK_0087af00;
      uVar18 = _UNK_0087aef8;
      uVar17 = _UNK_0087aef0;
      if ((int)uVar12 != 0) {
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
        unaff_x26[4] = uVar17;
        unaff_x26[7] = uVar5;
        unaff_x26[6] = uVar29;
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
          uVar18 = *unaff_x24;
          pcVar16 = "ED25519 sign failed.\n";
          uVar17 = 0x15;
        }
        else {
          unaff_x25[1] = unaff_x25[0x65];
          *unaff_x25 = unaff_x25[100];
          unaff_x25[3] = unaff_x25[0x67];
          unaff_x25[2] = unaff_x25[0x66];
          uVar29 = unaff_x25[0x69];
          uVar18 = unaff_x25[0x68];
          uVar17 = unaff_x25[0x6a];
          unaff_x26[0xd3] = unaff_x25[0x6b];
          unaff_x26[0xd2] = uVar17;
          unaff_x26[0xd1] = uVar29;
          unaff_x26[0xd0] = uVar18;
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
                uVar12 = 1;
                goto code_r0x002fdd10;
              }
            }
            else if (in_stack_00000d30 == 0) {
              if ((in_stack_00000d28 < 0x14def9dea2f79cd7) &&
                 ((in_stack_00000d28 != 0x14def9dea2f79cd6 ||
                  (in_stack_00000d20 < 0x5812631a5cf5d3ed)))) goto code_r0x002ff5bc;
            }
          }
          uVar18 = *unaff_x24;
          pcVar16 = "ED25519 verify failed.\n";
          uVar17 = 0x17;
        }
        _fwrite(pcVar16,uVar17,1,uVar18);
        goto code_r0x002fdd0c;
      }
    }
code_r0x002fdd10:
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x58)) {
      return;
    }
    ___stack_chk_fail(uVar12);
    func_0x002bf97c(unaff_x20);
    unaff_x20 = (char *)0x0;
LAB_002ff108:
    bVar27 = true;
    _fwrite("FFDH failed.\n",0xd,1,*unaff_x24);
    puVar13 = (undefined8 *)0x0;
    plVar14 = (long *)0x0;
  } while( true );
}

