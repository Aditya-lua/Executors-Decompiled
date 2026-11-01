
/* WARNING: Removing unreachable block (ram,0x0043c674) */
/* WARNING: Removing unreachable block (ram,0x0043d138) */
/* WARNING: Removing unreachable block (ram,0x0043c8dc) */
/* WARNING: Removing unreachable block (ram,0x0043c8f0) */
/* WARNING: Removing unreachable block (ram,0x0043d26c) */
/* WARNING: Removing unreachable block (ram,0x0043c8f8) */
/* WARNING: Removing unreachable block (ram,0x0043c904) */
/* WARNING: Removing unreachable block (ram,0x0043c910) */
/* WARNING: Removing unreachable block (ram,0x0043c92c) */
/* WARNING: Type propagation algorithm not settling */

void FUN_0043c3c8(void)

{
  int7 *piVar1;
  int7 *piVar2;
  int7 *piVar3;
  long lVar4;
  long lVar5;
  undefined8 uVar6;
  ulong uVar7;
  char *pcVar8;
  dword *pdVar9;
  int iVar10;
  long *plVar11;
  long lVar12;
  undefined8 *puVar13;
  ulong uVar14;
  ulong uVar15;
  ulong uVar16;
  long unaff_x19;
  long lVar17;
  char *pcVar18;
  dword *pdVar19;
  ulong unaff_x21;
  code *pcVar20;
  long *unaff_x22;
  bool bVar21;
  long unaff_x24;
  undefined1 *unaff_x26;
  long *unaff_x27;
  long *unaff_x28;
  undefined1 auVar22 [16];
  undefined4 in_stack_00000008;
  long in_stack_00000010;
  long in_stack_00000018;
  undefined8 in_stack_00000020;
  ulong in_stack_00000028;
  dword *in_stack_00000030;
  long *in_stack_00000038;
  undefined8 *in_stack_00000040;
  undefined8 uStack0000000000000050;
  undefined8 uStack0000000000000058;
  dword *in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  long in_stack_00000098;
  undefined8 in_stack_000000a0;
  int in_stack_000009b0;
  undefined4 in_stack_000009b4;
  long *in_stack_000009b8;
  dword *in_stack_000009c0;
  undefined8 in_stack_000009c8;
  undefined8 in_stack_000009d0;
  undefined8 in_stack_000009d8;
  undefined8 in_stack_000009e0;
  undefined8 in_stack_000009e8;
  undefined8 in_stack_000009f0;
  long in_stack_000009f8;
  undefined8 in_stack_00000a00;
  long in_stack_00001320;
  long in_stack_00001328;
  long in_stack_00001330;
  long in_stack_00001338;
  long in_stack_00001340;
  long in_stack_00001348;
  int *in_stack_00001528;
  dword *in_stack_00001530;
  dword *in_stack_00001538;
  long in_stack_00001540;
  int7 *in_stack_00001548;
  ulong in_stack_00001550;
  long in_stack_00001bf0;
  long in_stack_00001bf8;
  long in_stack_00001c00;
  long in_stack_00001c08;
  long in_stack_00001c10;
  long in_stack_00001c18;
  ulong in_stack_00001e00;
  short in_stack_00001e40;
  dword *in_stack_00002258;
  char *in_stack_00002268;
  ulong in_stack_00002270;
  int7 *in_stack_00002278;
  dword *in_stack_00002280;
  undefined1 auStack_7ffffffe [2147483646];
  
  _munmap();
  func_0x003f7334(unaff_x19 + 0x10);
  lVar17 = *(long *)(unaff_x19 + 0x40);
  pdVar19 = (dword *)(lVar17 + 1);
  _memcpy(auStack_7ffffffe + 0x800009ae,auStack_7ffffffe + 0x80001dfe,0x250);
  if (&MACH_HEADER.cputype < pdVar19) {
    func_0x007a28b0(pdVar19,4,&UNK_009dc360);
    func_0x007a2570();
code_r0x0043d1b0:
    in_stack_00001530 = pdVar19;
    if (in_stack_00002258 < in_stack_00000030) {
      func_0x0040b7cc(auStack_7ffffffe + 0x80001526,in_stack_00000038,in_stack_00000030,
                      auStack_7ffffffe + 0x80002256,1,0,in_stack_00000008);
      if (in_stack_00001528 == (int *)((long)&MACH_HEADER.magic + 2)) goto code_r0x0043cc70;
      if (in_stack_00001540 == 0xd) {
        in_stack_00001530 = in_stack_00002258;
        if (*(long *)in_stack_00001538 != 0x424d595343453c2f ||
            *(int5 *)(in_stack_00001538 + 2) != 0x2f3e534c4f) {
          in_stack_00001530 = pdVar19;
        }
      }
    }
    uVar15 = 0;
    pcVar18 = (char *)0x1;
    in_stack_00001528 = (int *)0x0;
    in_stack_00001538 = in_stack_00000030;
    goto code_r0x0043c9e4;
  }
  if (pdVar19 != (dword *)0x0) {
    lVar17 = lVar17 * 0x250 + 0x250;
    lVar12 = 0xa29cb8;
    do {
      _memcpy(&uStack0000000000000050,lVar12,0x250);
      _memcpy(lVar12,auStack_7ffffffe + 0x800009ae,0x250);
      _memcpy(auStack_7ffffffe + 0x800009ae,&uStack0000000000000050,0x250);
      lVar17 = lVar17 + -0x250;
      lVar12 = lVar12 + 0x250;
    } while (lVar17 != 0);
  }
  *(dword **)(unaff_x24 + 0x5f8) = pdVar19;
  unaff_x21 = (long)unaff_x26 - (long)unaff_x27;
  func_0x0043aa50(auStack_7ffffffe + 0x800009ae,0xa29cc0,unaff_x21);
  unaff_x27 = (long *)0xa29cc8;
  if (in_stack_000009b0 != 5) {
    bVar21 = false;
    uStack0000000000000050 = CONCAT44(in_stack_000009b4,in_stack_000009b0);
    pcVar20 = *(code **)(in_stack_00000010 + 0x20);
    uStack0000000000000058 = in_stack_000009b8;
    in_stack_00000060 = in_stack_000009c0;
    in_stack_00000068 = in_stack_000009c8;
    in_stack_00000070 = in_stack_000009d0;
    in_stack_00000078 = in_stack_000009d8;
    in_stack_00000080 = in_stack_000009e0;
    in_stack_00000088 = in_stack_000009e8;
    in_stack_00000090 = in_stack_000009f0;
    in_stack_00000098 = in_stack_000009f8;
    in_stack_000000a0 = in_stack_00000a00;
    while (func_0x0040f900(auStack_7ffffffe + 0x80001dfe,&uStack0000000000000050),
          in_stack_00001e00 < 2) {
      if (((in_stack_00001e40 == 2) && (uRam0000000000a29cd0 != 0)) && (uRam0000000000a29cd0 != 1))
      {
        lVar17 = 0;
        uVar15 = uRam0000000000a29cd0;
        do {
          lVar12 = (uVar15 >> 1) + lVar17;
          if (*(ulong *)(lRam0000000000a29cc8 + lVar12 * 0x18 + 0x10) <= unaff_x21) {
            lVar17 = lVar12;
          }
          uVar15 = uVar15 - (uVar15 >> 1);
        } while (1 < uVar15);
      }
      (*pcVar20)(in_stack_00000020,auStack_7ffffffe + 0x8000177e);
      bVar21 = true;
    }
    if ((1 < (int)uStack0000000000000050 - 3U) && (in_stack_00000098 != 0)) {
      func_0x00187bd4(in_stack_00000088,in_stack_00000098 << 3,8);
    }
    if (bVar21) {
      return;
    }
  }
  unaff_x26 = auStack_7ffffffe + 0x80001526;
  if ((lRam0000000000a29cd8 == -0x8000000000000000) ||
     (in_stack_00000040 = (undefined8 *)func_0x004432ec(0xa29cd8,unaff_x21),
     in_stack_00000040 == (undefined8 *)0x0)) goto code_r0x0043cef0;
  uVar15 = in_stack_00000040[4];
  unaff_x22 = (long *)(lRam0000000000a29d18 + uVar15 * 0x248);
  if (uRam0000000000a29d20 <= uVar15) goto code_r0x0043cef0;
  lVar17 = *unaff_x22;
  if (lVar17 == -0x7fffffffffffffff) {
    if (uRam0000000000a29d00 <= uVar15) goto code_r0x0043cef0;
    puVar13 = (undefined8 *)(lRam0000000000a29cf8 + uVar15 * 0x20);
    func_0x0043add8(&uStack0000000000000050,*puVar13,puVar13[1]);
    pdVar9 = in_stack_00000060;
    plVar11 = uStack0000000000000058;
    unaff_x28 = unaff_x22;
    if ((int)uStack0000000000000050 == 1) {
      in_stack_00000018 = puVar13[2];
      in_stack_00000028 = puVar13[3];
      in_stack_00000030 = in_stack_00000060;
      in_stack_00001bf0 = 0;
      in_stack_00001bf8 = 8;
      in_stack_00001c08 = 0;
      in_stack_00001c00 = 0;
      in_stack_00001c10 = 8;
      in_stack_00001c18 = 0;
      in_stack_00000038 = uStack0000000000000058;
      pdVar19 = in_stack_00000060;
      if (in_stack_00000018 != 0) {
        if (in_stack_00000060 < &MACH_HEADER.cpusubtype) goto code_r0x0043cc70;
        pdVar19 = &MACH_HEADER.cpusubtype;
        lVar17 = *uStack0000000000000058;
        in_stack_00002258 = pdVar19;
        if (lVar17 == 0xa3e6e6968743c21) {
          in_stack_00000008 = 1;
code_r0x0043c54c:
          if (in_stack_00000060 == &MACH_HEADER.cpusubtype) {
            uVar15 = 0;
            in_stack_00001528 = (int *)0x0;
            pcVar18 = (char *)0x1;
            in_stack_00001530 = &MACH_HEADER.cpusubtype;
            in_stack_00001538 = &MACH_HEADER.cpusubtype;
          }
          else {
            func_0x0040b7cc(auStack_7ffffffe + 0x80001526,uStack0000000000000058,in_stack_00000060,
                            auStack_7ffffffe + 0x80002256,1,0);
            if (in_stack_00001528 == (int *)((long)&MACH_HEADER.magic + 2)) goto code_r0x0043cc70;
            uVar15 = 0;
            pcVar18 = (char *)0x1;
            if (in_stack_00001540 < 9) {
              if (in_stack_00001540 == 1) {
                if (((char)*in_stack_00001538 == '/') && (&MACH_HEADER.cpusubtype < pdVar9)) {
                  func_0x0040b7cc(auStack_7ffffffe + 0x80001526,plVar11,pdVar9,
                                  auStack_7ffffffe + 0x80002256,1,0,in_stack_00000008);
                  if (in_stack_00001528 != (int *)((long)&MACH_HEADER.magic + 2)) {
                    if ((char)*in_stack_00001538 != '/') goto code_r0x0043c9d8;
                    if ((pdVar9 <= &MACH_HEADER.cpusubtype) ||
                       (func_0x0040b7cc(auStack_7ffffffe + 0x80001526,plVar11,pdVar9,
                                        auStack_7ffffffe + 0x80002256,1,0,in_stack_00000008),
                       in_stack_00001528 != (int *)((long)&MACH_HEADER.magic + 2)))
                    goto code_r0x0043d1b0;
                  }
                  goto code_r0x0043cc70;
                }
                goto code_r0x0043c9d8;
              }
              if (in_stack_00001540 == 2) {
                if ((short)*in_stack_00001538 != 0x2f2f) goto code_r0x0043c9d8;
                if (in_stack_00001548 == (int7 *)0x0) {
                  uVar15 = 0;
                  pcVar18 = (char *)0x1;
                }
                else {
                  if ((pdVar9 < in_stack_00001548) ||
                     ((ulong)((long)pdVar9 - (long)in_stack_00001548) < in_stack_00001550))
                  goto code_r0x0043cc70;
                  pcVar18 = (char *)((long)plVar11 + (long)in_stack_00001548);
                  uVar15 = in_stack_00001550;
                }
              }
              else if (in_stack_00001540 == 7) {
                if (((*(int7 *)in_stack_00001538 == 0x2f34364d59532f) &&
                    (&MACH_HEADER.cpusubtype < pdVar9)) &&
                   (func_0x0040b7cc(auStack_7ffffffe + 0x80001526,plVar11,pdVar9,
                                    auStack_7ffffffe + 0x80002256,1,0,in_stack_00000008),
                   in_stack_00001528 == (int *)((long)&MACH_HEADER.magic + 2)))
                goto code_r0x0043cc70;
                goto code_r0x0043c9d8;
              }
            }
            else if (in_stack_00001540 < 0x10) {
              if ((in_stack_00001540 == 9) || (in_stack_00001540 == 0xc)) {
code_r0x0043c9d8:
                pcVar18 = (char *)0x1;
                uVar15 = 0;
              }
            }
            else if ((in_stack_00001540 == 0x10) || (in_stack_00001540 == 0x13))
            goto code_r0x0043c9d8;
            in_stack_00001530 = &MACH_HEADER.cpusubtype;
            in_stack_00001528 = (int *)0x0;
            in_stack_00001538 = pdVar9;
          }
        }
        else {
          if (lVar17 == 0xa3e686372613c21) {
            in_stack_00000008 = 0;
            goto code_r0x0043c54c;
          }
          if ((lVar17 != 0xa3e66616769623c) || (in_stack_00000060 < section_00000068.segname + 8))
          goto code_r0x0043cc70;
          auVar22 = func_0x0043fb2c(uStack0000000000000058 + 6,0x14,10);
          auVar22._8_8_ = auVar22._8_8_;
          if ((auVar22._0_8_ & 1) == 0) goto code_r0x0043cc70;
          if (auVar22._8_8_ != (int7 *)0x0) {
            if ((auVar22._8_8_ <= pdVar9) && (0x6f < (ulong)((long)pdVar9 - (long)auVar22._8_8_))) {
              auVar22 = func_0x0043fb2c((char *)((long)plVar11 + (long)auVar22._8_8_) + 0x6c,4,10);
              if ((auVar22._0_8_ & 1) != 0) {
                piVar2 = auVar22._8_8_ + 0xe;
                if ((piVar2 <= pdVar9) && (auVar22._8_8_ <= (ulong)((long)pdVar9 - (long)piVar2))) {
                  piVar2 = (int7 *)(auVar22._8_8_ + (long)piVar2);
                  piVar1 = (int7 *)((long)piVar2 + 1);
                  if (piVar2 == (int7 *)0xffffffffffffffff) {
                    piVar1 = (int7 *)0xffffffffffffffff;
                  }
                  if (((ulong)piVar2 & 1) != 0) {
                    piVar2 = piVar1;
                  }
                  if (((piVar2 <= pdVar9) && (1 < (ulong)((long)pdVar9 - (long)piVar2))) &&
                     (*(short *)((long)plVar11 + (long)piVar2) == 0xa60)) {
                    uVar15 = func_0x0043fb2c((char *)((long)plVar11 + (long)auVar22._8_8_),0x14,10);
LAB_0043bb10:
                    if ((uVar15 & 1) != 0) goto code_r0x0043cfd4;
                  }
                }
              }
            }
            goto code_r0x0043cc70;
          }
          auVar22 = func_0x0043fb2c((char *)((long)plVar11 + 0x1c),0x14,10);
          auVar22._8_8_ = auVar22._8_8_;
          if ((auVar22._0_8_ & 1) == 0) goto code_r0x0043cc70;
          if (auVar22._8_8_ != (int7 *)0x0) {
            if ((auVar22._8_8_ <= pdVar9) && (0x6f < (ulong)((long)pdVar9 - (long)auVar22._8_8_))) {
              auVar22 = func_0x0043fb2c((char *)((long)plVar11 + (long)auVar22._8_8_) + 0x6c,4,10);
              if ((auVar22._0_8_ & 1) != 0) {
                piVar2 = auVar22._8_8_ + 0xe;
                if ((piVar2 <= pdVar9) && (auVar22._8_8_ <= (ulong)((long)pdVar9 - (long)piVar2))) {
                  piVar2 = (int7 *)(auVar22._8_8_ + (long)piVar2);
                  piVar1 = (int7 *)((long)piVar2 + 1);
                  if (piVar2 == (int7 *)0xffffffffffffffff) {
                    piVar1 = (int7 *)0xffffffffffffffff;
                  }
                  if (((ulong)piVar2 & 1) != 0) {
                    piVar2 = piVar1;
                  }
                  if (((piVar2 <= pdVar9) && (1 < (ulong)((long)pdVar9 - (long)piVar2))) &&
                     (*(short *)((long)plVar11 + (long)piVar2) == 0xa60)) {
                    uVar15 = func_0x0043fb2c((char *)((long)plVar11 + (long)auVar22._8_8_),0x14,10);
                    goto LAB_0043bb10;
                  }
                }
              }
            }
            goto code_r0x0043cc70;
          }
code_r0x0043cfd4:
          auVar22 = func_0x0043fb2c(plVar11 + 1,0x14,10);
          auVar22._8_8_ = auVar22._8_8_;
          if ((auVar22._0_8_ & 1) == 0) goto code_r0x0043cc70;
          if (auVar22._8_8_ != (int7 *)0x0) {
            if ((auVar22._8_8_ <= pdVar9) && (0x6f < (ulong)((long)pdVar9 - (long)auVar22._8_8_))) {
              auVar22 = func_0x0043fb2c((char *)((long)plVar11 + (long)auVar22._8_8_) + 0x6c,4,10);
              if ((auVar22._0_8_ & 1) != 0) {
                piVar2 = auVar22._8_8_ + 0xe;
                if ((piVar2 <= pdVar9) && (auVar22._8_8_ <= (ulong)((long)pdVar9 - (long)piVar2))) {
                  piVar2 = (int7 *)(auVar22._8_8_ + (long)piVar2);
                  piVar1 = (int7 *)((long)piVar2 + 1);
                  if (piVar2 == (int7 *)0xffffffffffffffff) {
                    piVar1 = (int7 *)0xffffffffffffffff;
                  }
                  if (((ulong)piVar2 & 1) != 0) {
                    piVar2 = piVar1;
                  }
                  if (((piVar2 <= pdVar9) && (1 < (ulong)((long)pdVar9 - (long)piVar2))) &&
                     (*(short *)((long)plVar11 + (long)piVar2) == 0xa60)) {
                    auVar22 = func_0x0043fb2c((char *)((long)plVar11 + (long)auVar22._8_8_),0x14,10)
                    ;
                    uVar15 = auVar22._8_8_;
                    if ((((auVar22._0_8_ & 1) != 0) &&
                        (piVar2 = (int7 *)((long)piVar2 + 2), piVar2 != (int7 *)0x0)) &&
                       ((piVar2 <= pdVar9 &&
                        ((uVar15 <= (ulong)((long)pdVar9 - (long)piVar2) && (0x13 < uVar15)))))) {
                      auVar22 = func_0x0043fb2c((char *)((long)plVar11 + (long)piVar2),0x14,10);
                      in_stack_00001538 = auVar22._8_8_;
                      if (((auVar22._0_8_ & 1) != 0) &&
                         ((auVar22._8_8_ = 0, auVar22._0_8_ = in_stack_00001538,
                          SUB168(auVar22 * ZEXT816(0x14),8) == 0 &&
                          ((ulong)((long)in_stack_00001538 * 0x14) <= uVar15 - 0x14)))) {
                        in_stack_00001530 = (dword *)((char *)((long)plVar11 + (long)piVar2) + 0x14)
                        ;
                        goto code_r0x0043d168;
                      }
                    }
                  }
                }
              }
            }
            goto code_r0x0043cc70;
          }
          in_stack_00001538 = (dword *)0x0;
          in_stack_00001530 = (dword *)((long)&MACH_HEADER.magic + 1);
code_r0x0043d168:
          pcVar18 = (char *)0x1;
          uVar15 = 0;
          in_stack_00000008 = 0;
          in_stack_00001528 = (int *)((long)&MACH_HEADER.magic + 1);
        }
code_r0x0043c9e4:
        unaff_x26[0x38] = (char)in_stack_00000008;
        if ((int)in_stack_00001528 != 0) goto code_r0x0043ca98;
        while (in_stack_00001530 < in_stack_00001538) {
          func_0x0040b7cc(auStack_7ffffffe + 0x80002256,in_stack_00000038,in_stack_00000030,
                          auStack_7ffffffe + 0x8000152e,pcVar18,uVar15,unaff_x26[0x38]);
          pdVar9 = in_stack_00001538;
          pcVar8 = in_stack_00002268;
          auVar22._8_8_ = in_stack_00002278;
          pdVar19 = in_stack_00002280;
          uVar14 = in_stack_00002270;
          if (in_stack_00002258 != (dword *)((long)&MACH_HEADER.magic + 2)) goto joined_r0x0043ca80;
          while (in_stack_00001530 = pdVar9, in_stack_00001528 != (int *)0x0) {
code_r0x0043ca98:
            if (in_stack_00001538 == (dword *)0x0) goto code_r0x0043cc70;
            in_stack_00001538 = (dword *)((long)in_stack_00001538 + -1);
            auVar22 = func_0x0043fb2c(in_stack_00001530,0x14,10);
            auVar22._8_8_ = auVar22._8_8_;
            if ((((auVar22._0_8_ & 1) == 0) || (in_stack_00000030 < auVar22._8_8_)) ||
               ((ulong)((long)in_stack_00000030 - (long)auVar22._8_8_) < 0x70)) {
code_r0x0043cb70:
              in_stack_00001538 = (dword *)0x0;
              pdVar9 = (dword *)((long)&MACH_HEADER.magic + 1);
            }
            else {
              auVar22 = func_0x0043fb2c((char *)((long)in_stack_00000038 + (long)auVar22._8_8_) +
                                        0x6c,4,10);
              uVar14 = auVar22._8_8_;
              if ((auVar22._0_8_ & 1) == 0) goto code_r0x0043cb70;
              piVar2 = auVar22._8_8_ + 0xe;
              if ((in_stack_00000030 < piVar2) ||
                 ((ulong)((long)in_stack_00000030 - (long)piVar2) < uVar14)) goto code_r0x0043cb70;
              piVar3 = (int7 *)(uVar14 + (long)piVar2);
              piVar1 = (int7 *)((long)piVar3 + 1);
              if (piVar3 == (int7 *)0xffffffffffffffff) {
                piVar1 = (int7 *)0xffffffffffffffff;
              }
              if (((ulong)piVar3 & 1) != 0) {
                piVar3 = piVar1;
              }
              if ((in_stack_00000030 < piVar3 || (ulong)((long)in_stack_00000030 - (long)piVar3) < 2
                  ) || (*(short *)((long)in_stack_00000038 + (long)piVar3) != 0xa60))
              goto code_r0x0043cb70;
              auVar22 = func_0x0043fb2c((char *)((long)in_stack_00000038 + (long)auVar22._8_8_),0x14
                                        ,10);
              if ((auVar22._0_8_ & 1) == 0) goto code_r0x0043cb70;
              in_stack_00001530 = in_stack_00001530 + 5;
              pcVar8 = (char *)((long)in_stack_00000038 + (long)piVar2);
              auVar22._8_8_ = (int7 *)((long)piVar3 + 2);
              pdVar19 = auVar22._8_8_;
joined_r0x0043ca80:
              pdVar9 = in_stack_00001530;
              if ((uVar14 == in_stack_00000028) &&
                 (iVar10 = _memcmp(pcVar8,in_stack_00000018,in_stack_00000028), iVar10 == 0)) {
                if (auVar22._8_8_ == (int7 *)0x0) {
                  pdVar19 = (dword *)0x0;
                  plVar11 = (long *)((long)&MACH_HEADER.magic + 1);
                }
                else {
                  if ((in_stack_00000030 < auVar22._8_8_) ||
                     ((int7 *)((long)in_stack_00000030 - (long)auVar22._8_8_) < pdVar19))
                  goto code_r0x0043cc70;
                  plVar11 = (long *)((long)in_stack_00000038 + (long)auVar22._8_8_);
                }
                goto code_r0x0043cbb4;
              }
            }
          }
        }
code_r0x0043cc70:
        func_0x003f7334(auStack_7ffffffe + 0x80001bee);
        _munmap(in_stack_00000038,in_stack_00000030);
        goto code_r0x0043cc84;
      }
code_r0x0043cbb4:
      func_0x0043d660(auStack_7ffffffe + 0x80001526,plVar11,pdVar19);
      if (((in_stack_00001528 == (int *)0x0) || (*in_stack_00001528 == -0x30051202)) ||
         (func_0x0043d840(auStack_7ffffffe + 0x80001526,in_stack_00001528,in_stack_00001530,
                          in_stack_00001538), in_stack_00001528 == (int *)0x8000000000000000))
      goto code_r0x0043cc70;
      in_stack_00001e00 = 0x8000000000000000;
      func_0x004385b0(&uStack0000000000000050,auStack_7ffffffe + 0x8000177e,
                      auStack_7ffffffe + 0x80001dfe,auStack_7ffffffe + 0x80001dfe);
      lVar17 = uStack0000000000000050;
      if (uStack0000000000000050 == -0x8000000000000000) goto code_r0x0043cc70;
      _memcpy(auStack_7ffffffe + 0x800009ae,&uStack0000000000000058,0x200);
      lVar12 = *unaff_x22;
      plVar11 = unaff_x22;
      unaff_x22 = unaff_x28;
    }
    else {
code_r0x0043cc84:
      lVar17 = -0x8000000000000000;
      lVar12 = *unaff_x22;
      plVar11 = unaff_x22;
      unaff_x22 = unaff_x28;
      in_stack_00001bf0 = in_stack_00001320;
      in_stack_00001bf8 = in_stack_00001328;
      in_stack_00001c00 = in_stack_00001330;
      in_stack_00001c08 = in_stack_00001338;
      in_stack_00001c10 = in_stack_00001340;
      in_stack_00001c18 = in_stack_00001348;
    }
    if ((lVar12 != -0x7fffffffffffffff) && (lVar12 != -0x8000000000000000)) {
      func_0x003f70a4(plVar11);
      _munmap(plVar11[0x41],plVar11[0x42]);
      func_0x003f7334(plVar11 + 0x43);
    }
    *plVar11 = lVar17;
    _memcpy(plVar11 + 1,auStack_7ffffffe + 0x800009ae,0x200);
    plVar11[0x41] = (long)in_stack_00000038;
    plVar11[0x42] = (long)in_stack_00000030;
    plVar11[0x44] = in_stack_00001bf8;
    plVar11[0x43] = in_stack_00001bf0;
    plVar11[0x46] = in_stack_00001c08;
    plVar11[0x45] = in_stack_00001c00;
    plVar11[0x48] = in_stack_00001c18;
    plVar11[0x47] = in_stack_00001c10;
    if (lVar17 == -0x7fffffffffffffff) goto code_r0x0043cef0;
  }
  if ((lVar17 != -0x8000000000000000) && (uVar15 = unaff_x22[2], uVar15 != 0)) {
    lVar12 = unaff_x22[1];
    uVar6 = *in_stack_00000040;
    uVar14 = in_stack_00000040[1];
    lVar17 = 0;
    if (uVar15 != 1) {
      do {
        lVar4 = (uVar15 >> 1) + lVar17;
        puVar13 = (undefined8 *)(lVar12 + lVar4 * 0x18);
        uVar7 = puVar13[1];
        uVar16 = uVar7;
        if (uVar14 <= uVar7) {
          uVar16 = uVar14;
        }
        iVar10 = _memcmp(*puVar13,uVar6,uVar16);
        lVar5 = uVar7 - uVar14;
        if (iVar10 != 0) {
          lVar5 = (long)iVar10;
        }
        if (lVar5 < 1) {
          lVar17 = lVar4;
        }
        uVar15 = uVar15 - (uVar15 >> 1);
      } while (1 < uVar15);
    }
    puVar13 = (undefined8 *)(lVar12 + lVar17 * 0x18);
    uVar16 = puVar13[1];
    uVar15 = uVar16;
    if (uVar14 <= uVar16) {
      uVar15 = uVar14;
    }
    iVar10 = _memcmp(*puVar13,uVar6,uVar15);
    lVar4 = uVar16 - uVar14;
    if (iVar10 != 0) {
      lVar4 = (long)iVar10;
    }
    if ((lVar4 == 0) &&
       (func_0x0043aa50(auStack_7ffffffe + 0x800009ae,unaff_x22,
                        (unaff_x21 - in_stack_00000040[2]) +
                        *(long *)(lVar12 + lVar17 * 0x18 + 0x10)), in_stack_000009b0 != 5)) {
      uStack0000000000000050 = CONCAT44(in_stack_000009b4,in_stack_000009b0);
      in_stack_00000068 = in_stack_000009c8;
      in_stack_00000070 = in_stack_000009d0;
      in_stack_00000078 = in_stack_000009d8;
      in_stack_00000080 = in_stack_000009e0;
      in_stack_00000088 = in_stack_000009e8;
      in_stack_00000090 = in_stack_000009f0;
      in_stack_00000098 = in_stack_000009f8;
      in_stack_000000a0 = in_stack_00000a00;
      func_0x0040f900(auStack_7ffffffe + 0x80001dfe,&uStack0000000000000050);
      if (in_stack_00001e00 < 2) {
        pcVar20 = *(code **)(in_stack_00000010 + 0x20);
        (*pcVar20)(in_stack_00000020,auStack_7ffffffe + 0x8000177e);
        while (func_0x0040f900(auStack_7ffffffe + 0x80001dfe,&uStack0000000000000050),
              in_stack_00001e00 < 2) {
          (*pcVar20)(in_stack_00000020,auStack_7ffffffe + 0x8000177e);
        }
      }
      if ((1 < (int)uStack0000000000000050 - 3U) && (in_stack_00000098 != 0)) {
        func_0x00187bd4(in_stack_00000088,in_stack_00000098 << 3,8);
      }
      if (in_stack_00001e00 < 2) {
        return;
      }
    }
  }
code_r0x0043cef0:
  uVar15 = unaff_x27[1];
  if (uVar15 != 0) {
    lVar17 = *unaff_x27;
    if (uVar15 == 1) {
      uVar14 = 0;
    }
    else {
      uVar14 = 0;
      uVar16 = uVar15;
      do {
        uVar7 = (uVar16 >> 1) + uVar14;
        if (*(ulong *)(lVar17 + uVar7 * 0x18 + 0x10) <= unaff_x21) {
          uVar14 = uVar7;
        }
        uVar16 = uVar16 - (uVar16 >> 1);
      } while (1 < uVar16);
    }
    uVar16 = *(ulong *)(lVar17 + uVar14 * 0x18 + 0x10);
    if (uVar16 != unaff_x21) {
      if (uVar16 < unaff_x21) {
        uVar14 = uVar14 + 1;
      }
      if (uVar14 == 0) {
        return;
      }
      uVar14 = uVar14 - 1;
    }
    if (uVar14 < uVar15) {
      puVar13 = (undefined8 *)(lVar17 + uVar14 * 0x18);
      uStack0000000000000058 = (long *)*puVar13;
      in_stack_00000060 = (dword *)puVar13[1];
      uStack0000000000000050 = CONCAT44(uStack0000000000000050._4_4_,3);
      (**(code **)(in_stack_00000010 + 0x20))(in_stack_00000020,&uStack0000000000000050);
    }
  }
  return;
}

