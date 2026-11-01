
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_002ff900(void)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  uint uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 uVar11;
  int iVar12;
  undefined8 uVar13;
  char *pcVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  int in_w8;
  long *in_x9;
  ulong uVar17;
  ulong uVar18;
  ulong uVar19;
  char *unaff_x19;
  char *unaff_x20;
  undefined8 *unaff_x21;
  undefined8 unaff_x22;
  bool bVar20;
  undefined8 *unaff_x24;
  undefined8 *unaff_x25;
  undefined8 *unaff_x26;
  long unaff_x29;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uStack00000000000000a0;
  undefined8 in_stack_000000a8;
  undefined8 in_stack_000000b0;
  undefined8 in_stack_000000b8;
  ulong in_stack_00000d20;
  ulong in_stack_00000d28;
  long in_stack_00000d30;
  ulong in_stack_00000d38;
  char acStack_7ffffffe [2147483646];
  
  uVar17 = *(ulong *)(*in_x9 + (long)(in_w8 + -1) * 8);
  uVar18 = uVar17 >> 0x20;
  uVar2 = uVar18;
  if (uVar18 == 0) {
    uVar2 = uVar17;
  }
  uVar19 = uVar2 >> 0x10;
  uVar1 = uVar19;
  if (uVar19 == 0) {
    uVar1 = uVar2;
  }
  uVar2 = uVar1 >> 8;
  if (uVar1 < 0x100) {
    uVar2 = uVar1;
  }
  uVar3 = uVar2 >> 4;
  if (uVar2 < 0x10) {
    uVar3 = uVar2;
  }
  uVar4 = uVar3 >> 2;
  if (uVar3 < 4) {
    uVar4 = uVar3;
  }
  uVar5 = (uint)(uVar17 != 0) | (in_w8 + -1) * 0x40 | (uint)(uVar18 != 0) << 5 |
          (uint)(uVar19 != 0) << 4 | (uint)(0xff < uVar1) << 3 | (uint)(0xf < uVar2) << 2 |
          (uint)(3 < uVar3) << 1;
  if (1 < uVar4) {
    uVar5 = uVar5 + 1;
  }
  if ((((uVar5 + 7 & 0xfffffff8) == 0x800) &&
      (iVar12 = func_0x002c0134(acStack_7ffffffe + 0x8000069e), iVar12 == 0x100)) &&
     (iVar12 = func_0x002fd75c(&UNK_00878db8,acStack_7ffffffe + 0x8000069e,0x100,"FFC DH FB"),
     iVar12 != 0)) {
    bVar20 = false;
  }
  else {
    bVar20 = true;
    _fwrite("FFDH FB failed.\n",0x10,1,*unaff_x24);
  }
  do {
    func_0x002bf97c(unaff_x20);
    if (unaff_x19 != (char *)0x0) {
      uVar5 = *(uint *)(unaff_x19 + 0x14);
      if ((uVar5 >> 1 & 1) == 0) {
        func_0x0036e3d8(*(undefined8 *)unaff_x19);
        uVar5 = *(uint *)(unaff_x19 + 0x14);
      }
      if ((uVar5 & 1) == 0) {
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
    func_0x002bf97c(unaff_x22);
    if (unaff_x21 != (undefined8 *)0x0) {
      uVar5 = *(uint *)((long)unaff_x21 + 0x14);
      if ((uVar5 >> 1 & 1) == 0) {
        func_0x0036e3d8(*unaff_x21);
        uVar5 = *(uint *)((long)unaff_x21 + 0x14);
      }
      if ((uVar5 & 1) == 0) {
        *unaff_x21 = 0;
      }
      else {
        func_0x0036e3d8(unaff_x21);
      }
    }
    if (bVar20) {
code_r0x002fdd0c:
      uVar13 = 0;
    }
    else {
      unaff_x20 = acStack_7ffffffe + 0x8000165e;
      _bzero(acStack_7ffffffe + 0x8000165e,0x660);
      _bzero(acStack_7ffffffe + 0x8000133e,800);
      uVar16 = _UNK_007fc2c8;
      uVar15 = _UNK_007fc2c0;
      unaff_x25[0x1a5] = _UNK_007fc2c8;
      unaff_x25[0x1a4] = uVar15;
      uVar6 = _UNK_0082fd28;
      uVar22 = _UNK_0082fd20;
      unaff_x25[0x1a7] = _UNK_0082fd28;
      unaff_x25[0x1a6] = uVar22;
      uVar8 = _UNK_0082fd38;
      uVar7 = _UNK_0082fd30;
      unaff_x25[0x1a9] = _UNK_0082fd38;
      unaff_x25[0x1a8] = uVar7;
      unaff_x25[0x1ab] = 0x300;
      unaff_x25[0x1aa] = 0x300;
      uVar13 = _UNK_0082fd48;
      uVar9 = _UNK_0082fd40;
      unaff_x25[0x1ad] = _UNK_0082fd48;
      unaff_x25[0x1ac] = uVar9;
      *(undefined8 *)(unaff_x29 + -0x60) = 0x300;
      unaff_x19 = &UNK_00879210;
      func_0x002e0668(unaff_x29 + -0xb0,acStack_7ffffffe + 0x8000133e,acStack_7ffffffe + 0x8000165e,
                      &UNK_00879210);
      _memcpy(acStack_7ffffffe + 0x8000195e,acStack_7ffffffe + 0x8000133e,800);
      func_0x002eafd4(acStack_7ffffffe + 0x8000133e,800,acStack_7ffffffe + 0x80001c7e);
      uVar11 = _UNK_00879248;
      uVar10 = _UNK_00879240;
      uVar21 = _UNK_00879230;
      unaff_x25[0x191] = _UNK_00879238;
      unaff_x25[400] = uVar21;
      unaff_x25[0x193] = uVar11;
      unaff_x25[0x192] = uVar10;
      iVar12 = func_0x002fd75c(&UNK_00879570,acStack_7ffffffe + 0x8000165e,0x660,
                               "ML-KEM keyGen decaps");
      if ((iVar12 == 0) ||
         (iVar12 = func_0x002fd75c(&UNK_00879250,acStack_7ffffffe + 0x8000133e,800,
                                   "ML-KEM keyGen encaps"), iVar12 == 0)) goto code_r0x002fdd0c;
      _memcpy(acStack_7ffffffe + 0x8000101e,&UNK_00879bd0,800);
      _bzero(acStack_7ffffffe + 0x80000d1e,0x300);
      unaff_x25[0x1a5] = uVar16;
      unaff_x25[0x1a4] = uVar15;
      unaff_x25[0x1a7] = uVar6;
      unaff_x25[0x1a6] = uVar22;
      unaff_x25[0x1a9] = uVar8;
      unaff_x25[0x1a8] = uVar7;
      unaff_x25[0x1ab] = 0x300;
      unaff_x25[0x1aa] = 0x300;
      unaff_x25[0x1ad] = uVar13;
      unaff_x25[0x1ac] = uVar9;
      *(undefined8 *)(unaff_x29 + -0x60) = 0x300;
      uVar11 = _UNK_00879f08;
      uVar10 = _UNK_00879f00;
      uVar21 = _UNK_00879ef0;
      unaff_x25[0x19d] = _UNK_00879ef8;
      unaff_x25[0x19c] = uVar21;
      unaff_x25[0x19f] = uVar11;
      unaff_x25[0x19e] = uVar10;
      func_0x002eafd4(acStack_7ffffffe + 0x8000101e,800,unaff_x29 + -0xd0);
      unaff_x19 = acStack_7ffffffe + 0x80001cbe;
      func_0x002e345c(unaff_x29 + -0xf0,0x40,acStack_7ffffffe + 0x80001cbe);
      func_0x002e5194(unaff_x29 + -0xb0,acStack_7ffffffe + 0x80000d1e,unaff_x29 + -0xf0,
                      acStack_7ffffffe + 0x8000101e,acStack_7ffffffe + 0x80001cde);
      uVar21 = unaff_x25[0x194];
      unaff_x26[0xcd] = unaff_x25[0x195];
      unaff_x26[0xcc] = uVar21;
      uVar21 = unaff_x25[0x196];
      unaff_x26[0xcf] = unaff_x25[0x197];
      unaff_x26[0xce] = uVar21;
      func_0x0036e464(unaff_x29 + -0xf0,0x40);
      func_0x0036e464(acStack_7ffffffe + 0x80001cbe,0x40);
      iVar12 = func_0x002fd75c(&UNK_00879f10,acStack_7ffffffe + 0x80000d1e,0x300,
                               "ML-KEM encapsulate ciphertext");
      if ((iVar12 == 0) ||
         (iVar12 = func_0x002fd75c(&UNK_0087a210,acStack_7ffffffe + 0x80000cfe,0x20,
                                   "ML-KEM encapsulate shared secret"), iVar12 == 0))
      goto code_r0x002fdd0c;
      _memcpy(acStack_7ffffffe + 0x8000069e,&UNK_0087a230,0x660);
      unaff_x19 = section_000002e8.segname + 8;
      _memcpy(acStack_7ffffffe + 0x8000039e,&UNK_0087a890,0x300);
      _memcpy(&uStack00000000000000a0,&UNK_0087abb0,0x300);
      unaff_x25[0x1a5] = uVar16;
      unaff_x25[0x1a4] = uVar15;
      unaff_x25[0x1a7] = uVar6;
      unaff_x25[0x1a6] = uVar22;
      unaff_x25[0x1a9] = uVar8;
      unaff_x25[0x1a8] = uVar7;
      unaff_x25[0x1ab] = 0x300;
      unaff_x25[0x1aa] = 0x300;
      unaff_x25[0x1ad] = uVar13;
      unaff_x25[0x1ac] = uVar9;
      *(undefined8 *)(unaff_x29 + -0x60) = 0x300;
      iVar12 = func_0x002eb798(unaff_x29 + -0xb0,acStack_7ffffffe + 0x80000cfe,
                               acStack_7ffffffe + 0x8000039e,acStack_7ffffffe + 0x8000069e);
      if ((iVar12 != 0) ||
         (iVar12 = func_0x002fd75c(&UNK_0087ab90,acStack_7ffffffe + 0x80000cfe,0x20,
                                   "ML-KEM decapsulate non-rejection"), iVar12 == 0))
      goto code_r0x002fdd0c;
      unaff_x25[0x1a5] = uVar16;
      unaff_x25[0x1a4] = uVar15;
      unaff_x25[0x1a7] = uVar6;
      unaff_x25[0x1a6] = uVar22;
      unaff_x25[0x1a9] = uVar8;
      unaff_x25[0x1a8] = uVar7;
      unaff_x25[0x1ab] = 0x300;
      unaff_x25[0x1aa] = 0x300;
      unaff_x25[0x1ad] = uVar13;
      unaff_x25[0x1ac] = uVar9;
      *(undefined8 *)(unaff_x29 + -0x60) = 0x300;
      iVar12 = func_0x002eb798(unaff_x29 + -0xb0,acStack_7ffffffe + 0x80000cfe,
                               &uStack00000000000000a0,acStack_7ffffffe + 0x8000069e);
      if (iVar12 != 0) goto code_r0x002fdd0c;
      uVar13 = func_0x002fd75c(&UNK_0087aeb0,acStack_7ffffffe + 0x80000cfe,0x20,
                               "ML-KEM decapsulate implicit rejection");
      uVar9 = _UNK_0087afa8;
      uVar8 = _UNK_0087afa0;
      uVar7 = _UNK_0087af90;
      uVar6 = _UNK_0087af08;
      uVar22 = _UNK_0087af00;
      uVar16 = _UNK_0087aef8;
      uVar15 = _UNK_0087aef0;
      if ((int)uVar13 != 0) {
        in_stack_000000a8 = _UNK_0087aef8;
        uStack00000000000000a0 = _UNK_0087aef0;
        in_stack_000000b8 = _UNK_0087af08;
        in_stack_000000b0 = _UNK_0087af00;
        unaff_x25[0xd1] = _UNK_0087af98;
        unaff_x25[0xd0] = uVar7;
        unaff_x25[0xd3] = uVar9;
        unaff_x25[0xd2] = uVar8;
        uVar9 = _UNK_0087afc8;
        uVar8 = _UNK_0087afc0;
        uVar7 = _UNK_0087afb0;
        unaff_x25[0xd5] = _UNK_0087afb8;
        unaff_x25[0xd4] = uVar7;
        unaff_x25[0xd7] = uVar9;
        unaff_x25[0xd6] = uVar8;
        uVar9 = _UNK_0087af68;
        uVar8 = _UNK_0087af60;
        uVar7 = _UNK_0087af50;
        unaff_x25[0xc9] = _UNK_0087af58;
        unaff_x25[200] = uVar7;
        unaff_x25[0xcb] = uVar9;
        unaff_x25[0xca] = uVar8;
        uVar9 = _UNK_0087af88;
        uVar8 = _UNK_0087af80;
        uVar7 = _UNK_0087af70;
        unaff_x25[0xcd] = _UNK_0087af78;
        unaff_x25[0xcc] = uVar7;
        unaff_x25[0xcf] = uVar9;
        unaff_x25[0xce] = uVar8;
        uVar9 = _UNK_0087aee8;
        uVar8 = _UNK_0087aee0;
        uVar7 = _UNK_0087aed0;
        unaff_x26[1] = _UNK_0087aed8;
        *unaff_x26 = uVar7;
        unaff_x26[3] = uVar9;
        unaff_x26[2] = uVar8;
        unaff_x26[5] = uVar16;
        unaff_x26[4] = uVar15;
        unaff_x26[7] = uVar6;
        unaff_x26[6] = uVar22;
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
        iVar12 = func_0x002fd75c(&UNK_0087af10,acStack_7ffffffe + 0x8000133e,0x40,"ED25519 sign");
        if (iVar12 == 0) {
          uVar16 = *unaff_x24;
          pcVar14 = "ED25519 sign failed.\n";
          uVar15 = 0x15;
        }
        else {
          unaff_x25[1] = unaff_x25[0x65];
          *unaff_x25 = unaff_x25[100];
          unaff_x25[3] = unaff_x25[0x67];
          unaff_x25[2] = unaff_x25[0x66];
          uVar22 = unaff_x25[0x69];
          uVar16 = unaff_x25[0x68];
          uVar15 = unaff_x25[0x6a];
          unaff_x26[0xd3] = unaff_x25[0x6b];
          unaff_x26[0xd2] = uVar15;
          unaff_x26[0xd1] = uVar22;
          unaff_x26[0xd0] = uVar16;
          if ((*(byte *)((long)unaff_x25 + 0x35f) < 0x20) &&
             (in_stack_00000d38 < 0x1000000000000001)) {
            if (in_stack_00000d38 >> 0x3c == 0) {
code_r0x002ff5bc:
              iVar12 = func_0x002b6a60(acStack_7ffffffe + 0x8000039e,&uStack00000000000000a0,
                                       acStack_7ffffffe + 0x8000101e,acStack_7ffffffe + 0x80000d1e,
                                       acStack_7ffffffe + 0x8000165e,0x80);
              if ((iVar12 != 0) &&
                 (iVar12 = func_0x0036e62c(acStack_7ffffffe + 0x8000039e,
                                           acStack_7ffffffe + 0x8000101e,0x20), iVar12 == 0)) {
                uVar13 = 1;
                goto code_r0x002fdd10;
              }
            }
            else if (in_stack_00000d30 == 0) {
              if ((in_stack_00000d28 < 0x14def9dea2f79cd7) &&
                 ((in_stack_00000d28 != 0x14def9dea2f79cd6 ||
                  (in_stack_00000d20 < 0x5812631a5cf5d3ed)))) goto code_r0x002ff5bc;
            }
          }
          uVar16 = *unaff_x24;
          pcVar14 = "ED25519 verify failed.\n";
          uVar15 = 0x17;
        }
        _fwrite(pcVar14,uVar15,1,uVar16);
        goto code_r0x002fdd0c;
      }
    }
code_r0x002fdd10:
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x58)) {
      return;
    }
    ___stack_chk_fail(uVar13);
    func_0x002bf97c(unaff_x20);
    unaff_x20 = (char *)0x0;
    bVar20 = true;
    _fwrite("FFDH failed.\n",0xd,1,*unaff_x24);
    unaff_x21 = (undefined8 *)0x0;
    unaff_x22 = 0;
  } while( true );
}

