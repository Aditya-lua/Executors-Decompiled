
void FUN_0022d21c(long param_1)

{
  undefined8 *puVar1;
  undefined1 uVar2;
  byte bVar3;
  long *plVar4;
  long lVar5;
  ushort *puVar6;
  undefined *puVar7;
  long in_x9;
  long lVar8;
  char *pcVar9;
  ulong uVar10;
  bool bVar11;
  char *unaff_x21;
  ulong *unaff_x22;
  undefined8 *puVar12;
  long unaff_x23;
  bool bVar13;
  long unaff_x24;
  long unaff_x26;
  long unaff_x29;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined1 auVar18 [16];
  long in_stack_00000010;
  long in_stack_00000018;
  long in_stack_00000020;
  long in_stack_00000028;
  long in_stack_00000030;
  long in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 uStack0000000000000050;
  undefined8 in_stack_00000058;
  ulong in_stack_00000060;
  long in_stack_00000068;
  undefined8 in_stack_00000070;
  ushort in_stack_00000080;
  undefined8 uStack0000000000000088;
  undefined8 in_stack_00000090;
  undefined8 in_stack_00000098;
  undefined8 in_stack_000000a0;
  undefined8 in_stack_000000a8;
  undefined8 in_stack_000000b0;
  undefined8 in_stack_000000b8;
  undefined8 in_stack_000000c0;
  undefined8 in_stack_000000c8;
  undefined8 in_stack_000000d0;
  undefined8 in_stack_000000d8;
  undefined8 in_stack_000000e0;
  undefined8 in_stack_000000e8;
  undefined8 in_stack_000000f0;
  undefined8 in_stack_000000f8;
  undefined8 in_stack_00000100;
  undefined8 in_stack_00000108;
  undefined8 in_stack_00000110;
  undefined8 uStack0000000000000150;
  long in_stack_00000168;
  undefined8 in_stack_00000170;
  long in_stack_00000178;
  byte in_stack_00000190;
  long in_stack_00000198;
  undefined8 in_stack_000001a0;
  undefined8 in_stack_000001a8;
  undefined8 uStack00000000000001b0;
  long in_stack_000001b8;
  undefined8 in_stack_000001c0;
  undefined8 in_stack_000001c8;
  undefined8 in_stack_000001d0;
  undefined8 in_stack_000001d8;
  undefined8 in_stack_000001e0;
  char in_stack_00000228;
  byte in_stack_00000229;
  long in_stack_00000238;
  long in_stack_00000240;
  char *in_stack_000002c0;
  dword *in_stack_000002c8;
  char *in_stack_000002d0;
  ulong in_stack_000002d8;
  ulong in_stack_000002e0;
  ulong in_stack_000002e8;
  char *in_stack_00000310;
  dword *in_stack_00000318;
  char *in_stack_00000320;
  undefined8 in_stack_00000328;
  undefined8 in_stack_00000330;
  undefined8 in_stack_00000338;
  undefined8 in_stack_00000340;
  long in_stack_00000388;
  undefined8 in_stack_00000390;
  undefined8 in_stack_00000398;
  undefined8 in_stack_000003a0;
  undefined8 in_stack_000003a8;
  undefined8 in_stack_000003b0;
  undefined8 in_stack_000003b8;
  undefined8 in_stack_000003c0;
  char *in_stack_00000440;
  char *in_stack_00000448;
  dword *in_stack_00000450;
  char *in_stack_00000458;
  ulong in_stack_00000460;
  ulong in_stack_00000468;
  ulong in_stack_00000470;
  ulong in_stack_00000478;
  undefined1 auStack_7ffffffe [6];
  undefined8 auStack_7ffffff8 [268435455];
  
  lVar8 = in_x9 + 0x20;
  if ((ulong)(param_1 - lVar8) < 0x20) {
    func_0x0079b61c(auStack_7ffffffe + 0x80000236,lVar8,0x20,1,1);
    param_1 = in_stack_00000238;
    unaff_x26 = in_stack_00000240;
  }
  uVar10 = in_stack_00000060;
  uVar15 = in_stack_00000058;
  puVar12 = (undefined8 *)(unaff_x26 + lVar8);
  uVar14 = *(undefined8 *)(unaff_x24 + 0x1e8);
  uVar17 = *(undefined8 *)(unaff_x24 + 0x200);
  uVar16 = *(undefined8 *)(unaff_x24 + 0x1f8);
  puVar12[1] = *(undefined8 *)(unaff_x24 + 0x1f0);
  *puVar12 = uVar14;
  puVar12[3] = uVar17;
  puVar12[2] = uVar16;
  lVar8 = in_x9 + 0x40;
  if ((ulong)(param_1 - lVar8) < in_stack_00000060) {
    func_0x0079b61c(auStack_7ffffffe + 0x80000236,lVar8,in_stack_00000060,1,1);
    unaff_x26 = in_stack_00000240;
  }
  _memcpy(unaff_x26 + lVar8,uVar15,uVar10);
  lVar8 = *(long *)(in_stack_00000010 + 0x18);
  if (lVar8 != 0) {
    puVar6 = *(ushort **)(in_stack_00000010 + 0x10);
    bVar3 = (&UNK_00828c6a)[in_stack_00000080];
    if (bVar3 < 4) {
      if (bVar3 == 1) {
        lVar8 = lVar8 << 2;
        do {
          if ((1 << (ulong)(*puVar6 & 0x1f) & 0x38aaU) == 0) goto code_r0x0022d650;
          puVar6 = puVar6 + 2;
          lVar8 = lVar8 + -4;
        } while (lVar8 != 0);
      }
      else if (bVar3 == 3) {
        lVar8 = lVar8 << 2;
        do {
          if ((1 << (ulong)(*puVar6 & 0x1f) & 0x3f55U) == 0) goto code_r0x0022d650;
          puVar6 = puVar6 + 2;
          lVar8 = lVar8 + -4;
        } while (lVar8 != 0);
      }
    }
    else if (bVar3 == 4) {
      lVar8 = lVar8 << 2;
      do {
        if (*puVar6 == 0xb) goto code_r0x0022d650;
        puVar6 = puVar6 + 2;
        lVar8 = lVar8 + -4;
      } while (lVar8 != 0);
    }
    else if (bVar3 == 5) {
      lVar8 = lVar8 << 2;
      do {
        if (*puVar6 == 0xc) goto code_r0x0022d650;
        puVar6 = puVar6 + 2;
        lVar8 = lVar8 + -4;
      } while (lVar8 != 0);
    }
    else if (bVar3 == 6) {
      lVar8 = lVar8 << 2;
      do {
        if (0xc < *puVar6) goto code_r0x0022d650;
        puVar6 = puVar6 + 2;
        lVar8 = lVar8 + -4;
      } while (lVar8 != 0);
    }
  }
  *unaff_x22 = (ulong)(unaff_x21 + -0xd);
  *(undefined1 *)(unaff_x22 + 1) = 0x3d;
joined_r0x0022d7bc:
  if (in_stack_00000238 != 0) {
    func_0x00187bd4(unaff_x26,in_stack_00000238,1);
  }
  bVar13 = true;
  bVar11 = true;
code_r0x0022d4fc:
  lVar8 = *uStack00000000000001b0;
  *uStack00000000000001b0 = lVar8 + -1;
  LORelease();
  if (lVar8 == 1) {
    DataMemoryBarrier(2,1);
    func_0x001f9b44(&uStack00000000000001b0);
  }
  if (uStack0000000000000088 != -0x8000000000000000) {
    func_0x00222b5c(&uStack0000000000000088);
  }
  if ((((in_stack_00000190 & 1) == 0) && (in_stack_00000198 != -0x8000000000000000)) &&
     (in_stack_00000198 != 0)) {
    func_0x00187bd4(in_stack_000001a0,in_stack_00000198,1);
  }
  if (bVar13) {
    func_0x00221a70(in_stack_00000018);
  }
  if (bVar11) {
    if (in_stack_00000030 != 0) {
      puVar12 = (undefined8 *)(in_stack_00000028 + 8);
      do {
        lVar8 = puVar12[-1];
        if (lVar8 != -0x8000000000000000 && lVar8 != 0) {
          func_0x00187bd4(*puVar12,lVar8,1);
        }
        puVar12 = puVar12 + 3;
        in_stack_00000030 = in_stack_00000030 + -1;
      } while (in_stack_00000030 != 0);
    }
    if (in_stack_00000020 != 0) {
      func_0x00187bd4(in_stack_00000028,in_stack_00000020 * 0x18,8);
    }
  }
  if (in_stack_00000038 != 0) {
    func_0x00187bd4(in_stack_00000040,in_stack_00000038,1);
  }
  if (uStack0000000000000050 != 0) {
    func_0x00187bd4(in_stack_00000058,uStack0000000000000050,1);
  }
  if (in_stack_00000068 != 0) {
    func_0x00187bd4(in_stack_00000070,in_stack_00000068,1);
  }
code_r0x0022d614:
  func_0x00223280(&uStack0000000000000150);
  func_0x0022200c();
  func_0x00187bd4();
  return;
code_r0x0022d650:
  (**(code **)(uStack00000000000001b0[0x28] + 0x28))
            (auStack_7ffffffe + 0x8000030e,
             uStack00000000000001b0[0x27] +
             (*(long *)(uStack00000000000001b0[0x28] + 0x10) - 1U & 0xfffffffffffffff0) + 0x10,
             unaff_x26);
  if (in_stack_00000310 != unaff_x21) {
    *(dword **)(unaff_x29 + -0xd8) = in_stack_00000318;
    *(char **)(unaff_x29 + -0xe0) = in_stack_00000310;
    *(undefined8 *)(unaff_x29 + -200) = in_stack_00000328;
    *(char **)(unaff_x29 + -0xd0) = in_stack_00000320;
    *(undefined8 *)(unaff_x29 + -0xb8) = in_stack_00000338;
    *(undefined8 *)(unaff_x29 + -0xc0) = in_stack_00000330;
    *(undefined8 *)(unaff_x29 + -0xb0) = in_stack_00000340;
    func_0x002493e8(auStack_7ffffffe + 0x8000043e);
    in_stack_000002c0 = in_stack_00000448;
    in_stack_000002c8 = in_stack_00000450;
    in_stack_000002d0 = in_stack_00000458;
    in_stack_000002d8 = in_stack_00000460;
    in_stack_000002e0 = in_stack_00000468;
    in_stack_000002e8 = in_stack_00000470;
    if (in_stack_00000440 != unaff_x21) {
      unaff_x22[2] = (ulong)in_stack_00000450;
      unaff_x22[1] = (ulong)in_stack_00000448;
      unaff_x22[4] = in_stack_00000460;
      unaff_x22[3] = (ulong)in_stack_00000458;
      unaff_x22[6] = in_stack_00000470;
      unaff_x22[5] = in_stack_00000468;
      *unaff_x22 = (ulong)in_stack_00000440;
      goto joined_r0x0022d7bc;
    }
  }
  if (in_stack_00000238 != 0) {
    func_0x00187bd4(unaff_x26,in_stack_00000238,1);
  }
  uVar10 = in_stack_00000028 + in_stack_00000030 * 0x18;
  func_0x002189a8(auStack_7ffffffe + 0x8000030e,auStack_7ffffffe + 0x8000043e,&UNK_009c2468);
  func_0x0016e8dc(unaff_x23 + 0x2f0);
  *(dword **)(unaff_x23 + 0x2f8) = in_stack_00000318;
  *(char **)(unaff_x23 + 0x2f0) = in_stack_00000310;
  *(char **)(unaff_x23 + 0x300) = in_stack_00000320;
  if (uStack0000000000000150 == -0x7fffffffffffffff) {
    in_stack_00000310 = (char *)0x0;
    in_stack_00000320 = (char *)0x0;
    in_stack_00000318 = &MACH_HEADER.cpusubtype;
code_r0x0022d7d0:
    func_0x0022b99c(in_stack_00000018,auStack_7ffffffe + 0x8000043e);
  }
  else if (uStack0000000000000150 != -0x7ffffffffffffffe) {
    func_0x001a37dc(auStack_7ffffffe + 0x8000043e,in_stack_00000168 + 0x10,&UNK_009c8700);
    goto code_r0x0022d7d0;
  }
  func_0x001cbcb4(auStack_7ffffffe + 0x8000043e,*(undefined1 *)(in_stack_000001b8 + 0x50));
  if (in_stack_00000310 == (char *)0x8000000000000001) {
    unaff_x22[1] = (ulong)in_stack_00000320;
    *unaff_x22 = (ulong)in_stack_00000318;
    unaff_x22[3] = in_stack_00000460;
    unaff_x22[2] = uVar10;
    unaff_x22[5] = in_stack_00000470;
    unaff_x22[4] = in_stack_00000468;
    unaff_x22[6] = in_stack_00000478;
    bVar13 = true;
    bVar11 = false;
  }
  else {
    if (in_stack_00000310 == (char *)0x8000000000000000) {
      auVar18 = func_0x001fba6c(uStack00000000000001b0 + 2,in_stack_00000460 & 0xffff,
                                (short)(in_stack_00000460 >> 0x10),4);
      pcVar9 = (char *)0x8000000000000000;
      if (auVar18._0_8_ != 0) goto code_r0x0022d8b8;
code_r0x0022da40:
      func_0x00248ae4();
      *(undefined1 *)(unaff_x23 + 0x335) = 1;
      *unaff_x22 = (ulong)(unaff_x21 + -0xd);
      *(undefined1 *)(unaff_x22 + 1) = 0x36;
      bVar13 = true;
    }
    else {
      pcVar9 = (char *)((long)in_stack_00000318 + -1);
      in_stack_00000318 = (dword *)(in_stack_00000320 + 1);
      do {
        in_stack_00000318 = (dword *)((long)in_stack_00000318 + -1);
        if (in_stack_00000318 == (dword *)0x0) {
          pcVar9 = (char *)((long)&MACH_HEADER.magic + 1);
          break;
        }
        pcVar9 = pcVar9 + 1;
      } while (*pcVar9 == '\0');
      in_stack_00000320 = (char *)(in_stack_00000460 - 1);
      uVar10 = in_stack_00000468 + 1;
      do {
        uVar10 = uVar10 - 1;
        if (uVar10 == 0) {
          in_stack_00000320 = (char *)((long)&MACH_HEADER.magic + 1);
          break;
        }
        in_stack_00000320 = in_stack_00000320 + 1;
      } while (*in_stack_00000320 == '\0');
      auVar18 = func_0x00223690(auStack_7ffffffe + 0x8000030e,auStack_7ffffffe + 0x8000043e);
      lVar5 = auVar18._8_8_;
      plVar4 = auVar18._0_8_;
      lVar8 = 0;
      if (plVar4 != (long *)0x0) {
        lVar8 = *plVar4;
        lVar5 = plVar4[1];
      }
      auVar18._8_8_ = lVar5;
      auVar18._0_8_ = lVar8;
      if (lVar8 == 0) goto code_r0x0022da40;
code_r0x0022d8b8:
      *(undefined8 *)(unaff_x23 + 0x2c0) = 1;
      *(undefined1 (*) [16])(unaff_x23 + 0x2c8) = auVar18;
      (**(code **)(auVar18._8_8_ + 0x20))(auStack_7ffffffe + 0x8000043e);
      if (pcVar9 == unaff_x21) {
        uVar15 = *(undefined8 *)(in_stack_00000018 + 0x28);
        lVar8 = *(long *)(in_stack_00000018 + 0x30);
        uVar2 = *(undefined1 *)(in_stack_000001b8 + 0x50);
        (**(code **)(in_stack_00000320 + 0x38))(in_stack_00000318);
        func_0x0022baf8(auStack_7ffffffe + 0x8000027e,uVar2);
        if (in_stack_00000228 == '\x01') {
          (**(code **)(lVar8 + 0x18))(auStack_7ffffffe + 0x8000043e,uVar15);
          in_stack_000002c0 = pcVar9;
          in_stack_000002c8 = in_stack_00000318;
          in_stack_000002d0 = in_stack_00000320;
          in_stack_000002d8 = uVar10;
          in_stack_000002e0 = in_stack_00000460;
          in_stack_000002e8 = in_stack_00000468;
        }
        if ((uStack0000000000000150 + 0x7fffffffffffffffU < 2) ||
           (func_0x0022bd8c(auStack_7ffffffe + 0x8000043e,auStack_7ffffffe + 0x8000027e,
                            in_stack_00000170,*(undefined8 *)(in_stack_00000178 + 0x20),
                            *(undefined8 *)(in_stack_00000178 + 0x28)), pcVar9 == unaff_x21)) {
          puVar12 = (undefined8 *)(auStack_7ffffffe + 0x80000246);
          if (in_stack_00000310 != (char *)0x8000000000000000) {
            puVar12 = (undefined8 *)(auStack_7ffffffe + 0x8000026e);
          }
          puVar1 = (undefined8 *)(auStack_7ffffffe + 0x8000024e);
          if (in_stack_00000310 != (char *)0x8000000000000000) {
            puVar1 = (undefined8 *)(auStack_7ffffffe + 0x80000276);
          }
          func_0x001cab6c(auStack_7ffffffe + 0x80000386,in_stack_00000318,in_stack_00000320,*puVar12
                          ,*puVar1,auStack_7ffffffe + 0x8000043e,auStack_7ffffffe + 0x800003fe,
                          in_stack_00000010);
          if (in_stack_00000388 != 0) {
            if (*(long *)(unaff_x23 + 0x2c0) == 1) {
              *(undefined8 *)(unaff_x23 + 0x2c0) = 2;
            }
            func_0x00248ae4();
            (**(code **)(uStack00000000000001b0[0x23] + 0x20))
                      (uStack00000000000001b0[0x22] +
                       (*(long *)(uStack00000000000001b0[0x23] + 0x10) - 1U & 0xfffffffffffffff0) +
                       0x10,&UNK_00828b07,0xd,auStack_7ffffffe + 0x80000316,0x20,
                       auStack_7ffffffe + 0x80000356,0x30);
            func_0x0024901c();
            *(undefined1 *)(unaff_x23 + 0x49) = 2;
            func_0x0022c09c(auStack_7ffffffe + 0x8000030e,auStack_7ffffffe + 0x8000027e);
            if ((in_stack_00000229 & 1) == 0) {
              uVar10 = func_0x0020a620(0x1a8);
              _memcpy(uVar10,auStack_7ffffffe + 0x8000043e,0x1a8);
              puVar7 = &UNK_009c8478;
            }
            else {
              uVar10 = func_0x0020a620(0x198);
              _memcpy(uVar10,auStack_7ffffffe + 0x8000043e,0x198);
              puVar7 = &UNK_009c84c0;
            }
            unaff_x22[1] = uVar10;
            unaff_x22[2] = (ulong)puVar7;
            *unaff_x22 = (ulong)unaff_x21;
            func_0x001ad290(auStack_7ffffffe + 0x80000236);
            if (in_stack_00000038 != 0) {
              func_0x00187bd4(in_stack_00000040,in_stack_00000038,1);
            }
            func_0x0018d654(&uStack0000000000000050);
            goto code_r0x0022d614;
          }
          *(undefined8 *)(unaff_x29 + -0x98) = in_stack_00000398;
          *(undefined8 *)(unaff_x29 + -0xa0) = in_stack_00000390;
          *(undefined8 *)(unaff_x29 + -0x88) = in_stack_000003a8;
          *(undefined8 *)(unaff_x29 + -0x90) = in_stack_000003a0;
          *(undefined8 *)(unaff_x29 + -0x78) = in_stack_000003b8;
          *(undefined8 *)(unaff_x29 + -0x80) = in_stack_000003b0;
          *(undefined8 *)(unaff_x29 + -0x70) = in_stack_000003c0;
          func_0x00249594(auStack_7ffffffe + 0x8000043e);
          bVar13 = false;
          unaff_x22[1] = (ulong)in_stack_000002c0;
          *unaff_x22 = (ulong)(in_stack_00000228 == '\x01');
          unaff_x22[3] = (ulong)in_stack_000002d0;
          unaff_x22[2] = (ulong)in_stack_000002c8;
          unaff_x22[5] = in_stack_000002e0;
          unaff_x22[4] = in_stack_000002d8;
          unaff_x22[6] = in_stack_000002e8;
        }
        else {
          unaff_x22[2] = (ulong)in_stack_00000320;
          unaff_x22[1] = (ulong)in_stack_00000318;
          unaff_x22[4] = in_stack_00000460;
          unaff_x22[3] = uVar10;
          unaff_x22[6] = in_stack_00000470;
          unaff_x22[5] = in_stack_00000468;
          *unaff_x22 = (ulong)pcVar9;
          bVar13 = true;
        }
        func_0x00221a70(auStack_7ffffffe + 0x8000027e);
        if (bVar13) {
          func_0x00223208(in_stack_00000318,in_stack_00000320);
          bVar13 = false;
        }
        else {
          bVar13 = false;
        }
      }
      else {
        unaff_x22[4] = in_stack_00000460;
        unaff_x22[3] = uVar10;
        unaff_x22[6] = in_stack_00000470;
        unaff_x22[5] = in_stack_00000468;
        *unaff_x22 = (ulong)pcVar9;
        unaff_x22[1] = (ulong)in_stack_00000318;
        unaff_x22[2] = (ulong)in_stack_00000320;
        bVar13 = true;
      }
    }
    func_0x001ad290(auStack_7ffffffe + 0x80000236);
    bVar11 = false;
  }
  goto code_r0x0022d4fc;
}

