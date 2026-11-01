
/* WARNING: Removing unreachable block (ram,0x0043ca54) */
/* WARNING: Removing unreachable block (ram,0x0043ca64) */
/* WARNING: Removing unreachable block (ram,0x0043c8dc) */
/* WARNING: Removing unreachable block (ram,0x0043c8f0) */
/* WARNING: Removing unreachable block (ram,0x0043d26c) */
/* WARNING: Removing unreachable block (ram,0x0043c8f8) */
/* WARNING: Removing unreachable block (ram,0x0043c904) */
/* WARNING: Removing unreachable block (ram,0x0043c910) */
/* WARNING: Removing unreachable block (ram,0x0043c92c) */
/* WARNING: Removing unreachable block (ram,0x0043c674) */
/* WARNING: Removing unreachable block (ram,0x0043d138) */
/* WARNING: Removing unreachable block (ram,0x0043d204) */
/* WARNING: Removing unreachable block (ram,0x0043d24c) */

void FUN_0043b628(void)

{
  int7 *piVar1;
  int7 *piVar2;
  char *pcVar3;
  undefined8 uVar4;
  ulong uVar5;
  dword *pdVar6;
  long *plVar7;
  bool in_ZR;
  int iVar8;
  undefined8 *puVar9;
  ulong uVar10;
  int7 *piVar11;
  ulong uVar12;
  long *plVar13;
  undefined1 uVar14;
  long lVar15;
  undefined8 *puVar16;
  long lVar17;
  ulong uVar18;
  long unaff_x19;
  char *pcVar19;
  dword *pdVar20;
  long unaff_x21;
  ulong uVar21;
  code *pcVar22;
  bool bVar23;
  long unaff_x23;
  long unaff_x26;
  long unaff_x27;
  long *plVar24;
  undefined1 auVar25 [16];
  long in_stack_00000010;
  undefined8 in_stack_00000020;
  dword *in_stack_00000030;
  long *in_stack_00000038;
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
  long lVar26;
  long lVar27;
  long lVar28;
  long lVar29;
  long lVar30;
  long lVar31;
  ulong in_stack_00001e00;
  short in_stack_00001e40;
  char *in_stack_00002268;
  ulong in_stack_00002270;
  int7 *in_stack_00002278;
  dword *in_stack_00002280;
  undefined1 auStack_7ffffffe [2147483646];
  
  if (!in_ZR) {
    _memcpy(&uStack0000000000000050);
    _memcpy();
    _memcpy(auStack_7ffffffe + 0x800009ae,&uStack0000000000000050,0x250);
    if (unaff_x21 != unaff_x23) {
      _memcpy(&uStack0000000000000050,0xa29f08,0x250);
      _memcpy(0xa29f08,auStack_7ffffffe + 0x800009ae,0x250);
      _memcpy(auStack_7ffffffe + 0x800009ae,&uStack0000000000000050,0x250);
      if (unaff_x19 != 0xa29f08) {
        _memcpy(&uStack0000000000000050,0xa2a158,0x250);
        _memcpy(0xa2a158,auStack_7ffffffe + 0x800009ae,0x250);
        _memcpy(auStack_7ffffffe + 0x800009ae,&uStack0000000000000050,0x250);
        if (unaff_x19 != 0xa2a158) {
          _memcpy(&uStack0000000000000050,0xa2a3a8,0x250);
          _memcpy(0xa2a3a8,auStack_7ffffffe + 0x800009ae,0x250);
          _memcpy(auStack_7ffffffe + 0x800009ae,&uStack0000000000000050,0x250);
        }
      }
    }
  }
  uVar21 = unaff_x26 - unaff_x27;
  func_0x0043aa50(auStack_7ffffffe + 0x800009ae,0xa29cc0,uVar21);
  if (in_stack_000009b0 != 5) {
    bVar23 = false;
    uStack0000000000000050 = CONCAT44(in_stack_000009b4,in_stack_000009b0);
    pcVar22 = *(code **)(in_stack_00000010 + 0x20);
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
        uVar18 = uRam0000000000a29cd0;
        do {
          lVar31 = (uVar18 >> 1) + lVar17;
          if (*(ulong *)(lRam0000000000a29cc8 + lVar31 * 0x18 + 0x10) <= uVar21) {
            lVar17 = lVar31;
          }
          uVar18 = uVar18 - (uVar18 >> 1);
        } while (1 < uVar18);
      }
      (*pcVar22)(in_stack_00000020,auStack_7ffffffe + 0x8000177e);
      bVar23 = true;
    }
    if ((1 < (int)uStack0000000000000050 - 3U) && (in_stack_00000098 != 0)) {
      func_0x00187bd4(in_stack_00000088,in_stack_00000098 << 3,8);
    }
    if (bVar23) {
      return;
    }
  }
  if ((lRam0000000000a29cd8 == -0x8000000000000000) ||
     (puVar9 = (undefined8 *)func_0x004432ec(0xa29cd8,uVar21), puVar9 == (undefined8 *)0x0))
  goto code_r0x0043cef0;
  uVar18 = puVar9[4];
  plVar24 = (long *)(lRam0000000000a29d18 + uVar18 * 0x248);
  if (uRam0000000000a29d20 <= uVar18) goto code_r0x0043cef0;
  lVar17 = *plVar24;
  if (lVar17 == -0x7fffffffffffffff) {
    if (uRam0000000000a29d00 <= uVar18) goto code_r0x0043cef0;
    puVar16 = (undefined8 *)(lRam0000000000a29cf8 + uVar18 * 0x20);
    func_0x0043add8(&uStack0000000000000050,*puVar16,puVar16[1]);
    pdVar6 = in_stack_00000060;
    plVar7 = uStack0000000000000058;
    if ((int)uStack0000000000000050 == 1) {
      lVar17 = puVar16[2];
      uVar18 = puVar16[3];
      in_stack_00000030 = in_stack_00000060;
      lVar26 = 0;
      lVar27 = 8;
      lVar29 = 0;
      lVar28 = 0;
      lVar30 = 8;
      lVar31 = 0;
      in_stack_00000038 = uStack0000000000000058;
      plVar13 = uStack0000000000000058;
      pdVar20 = in_stack_00000060;
      if (lVar17 != 0) {
        if (in_stack_00000060 < &MACH_HEADER.cpusubtype) goto LAB_0043cc70;
        in_stack_00001530 = &MACH_HEADER.cpusubtype;
        lVar15 = *uStack0000000000000058;
        if (lVar15 == 0xa3e6e6968743c21) {
          uVar14 = 1;
code_r0x0043c54c:
          if (in_stack_00000060 == &MACH_HEADER.cpusubtype) {
            uVar10 = 0;
            in_stack_00001528 = (int *)0x0;
            pcVar19 = (char *)0x1;
            in_stack_00001530 = &MACH_HEADER.cpusubtype;
            in_stack_00001538 = &MACH_HEADER.cpusubtype;
          }
          else {
            func_0x0040b7cc(auStack_7ffffffe + 0x80001526,uStack0000000000000058,in_stack_00000060,
                            auStack_7ffffffe + 0x80002256,1,0);
            if (in_stack_00001528 == (int *)((long)&MACH_HEADER.magic + 2)) goto LAB_0043cc70;
            uVar10 = 0;
            pcVar19 = (char *)0x1;
            if (in_stack_00001540 < 9) {
              if (in_stack_00001540 == 1) {
                if (((char)*in_stack_00001538 == '/') && (&MACH_HEADER.cpusubtype < pdVar6)) {
                  func_0x0040b7cc(auStack_7ffffffe + 0x80001526,plVar7,pdVar6,
                                  auStack_7ffffffe + 0x80002256,1,0,uVar14);
                  if (in_stack_00001528 != (int *)((long)&MACH_HEADER.magic + 2)) {
                    if ((char)*in_stack_00001538 != '/') goto code_r0x0043c9d8;
                    if (((pdVar6 <= &MACH_HEADER.cpusubtype) ||
                        (func_0x0040b7cc(auStack_7ffffffe + 0x80001526,plVar7,pdVar6,
                                         auStack_7ffffffe + 0x80002256,1,0,uVar14),
                        in_stack_00001528 != (int *)((long)&MACH_HEADER.magic + 2))) &&
                       ((pdVar6 <= &MACH_HEADER.cpusubtype ||
                        (func_0x0040b7cc(auStack_7ffffffe + 0x80001526,plVar7,pdVar6,
                                         auStack_7ffffffe + 0x80002256,1,0,uVar14),
                        in_stack_00001528 != (int *)((long)&MACH_HEADER.magic + 2))))) {
                      uVar10 = 0;
                      pcVar19 = (char *)0x1;
                      in_stack_00001528 = (int *)0x0;
                      in_stack_00001538 = pdVar6;
                      goto code_r0x0043c9e4;
                    }
                  }
                  goto LAB_0043cc70;
                }
                goto code_r0x0043c9d8;
              }
              if (in_stack_00001540 == 2) {
                if ((short)*in_stack_00001538 != 0x2f2f) goto code_r0x0043c9d8;
                if (in_stack_00001548 == (int7 *)0x0) {
                  uVar10 = 0;
                  pcVar19 = (char *)0x1;
                }
                else {
                  if ((pdVar6 < in_stack_00001548) ||
                     ((ulong)((long)pdVar6 - (long)in_stack_00001548) < in_stack_00001550))
                  goto LAB_0043cc70;
                  pcVar19 = (char *)((long)plVar7 + (long)in_stack_00001548);
                  uVar10 = in_stack_00001550;
                }
              }
              else if (in_stack_00001540 == 7) {
                if (((*(int7 *)in_stack_00001538 == 0x2f34364d59532f) &&
                    (&MACH_HEADER.cpusubtype < pdVar6)) &&
                   (func_0x0040b7cc(auStack_7ffffffe + 0x80001526,plVar7,pdVar6,
                                    auStack_7ffffffe + 0x80002256,1,0,uVar14),
                   in_stack_00001528 == (int *)((long)&MACH_HEADER.magic + 2))) goto LAB_0043cc70;
                goto code_r0x0043c9d8;
              }
            }
            else if (in_stack_00001540 < 0x10) {
              if ((in_stack_00001540 == 9) || (in_stack_00001540 == 0xc)) {
code_r0x0043c9d8:
                pcVar19 = (char *)0x1;
                uVar10 = 0;
              }
            }
            else if ((in_stack_00001540 == 0x10) || (in_stack_00001540 == 0x13))
            goto code_r0x0043c9d8;
            in_stack_00001530 = &MACH_HEADER.cpusubtype;
            in_stack_00001528 = (int *)0x0;
            in_stack_00001538 = pdVar6;
          }
        }
        else {
          if (lVar15 == 0xa3e686372613c21) {
            uVar14 = 0;
            goto code_r0x0043c54c;
          }
          if ((lVar15 != 0xa3e66616769623c) || (in_stack_00000060 < section_00000068.segname + 8))
          goto LAB_0043cc70;
          auVar25 = func_0x0043fb2c(uStack0000000000000058 + 6,0x14,10);
          auVar25._8_8_ = auVar25._8_8_;
          if ((auVar25._0_8_ & 1) == 0) goto LAB_0043cc70;
          if (auVar25._8_8_ != (int7 *)0x0) {
            if ((auVar25._8_8_ <= pdVar6) && (0x6f < (ulong)((long)pdVar6 - (long)auVar25._8_8_))) {
              auVar25 = func_0x0043fb2c((char *)((long)plVar7 + (long)auVar25._8_8_) + 0x6c,4,10);
              if ((auVar25._0_8_ & 1) != 0) {
                piVar11 = auVar25._8_8_ + 0xe;
                if ((piVar11 <= pdVar6) && (auVar25._8_8_ <= (ulong)((long)pdVar6 - (long)piVar11)))
                {
                  piVar11 = (int7 *)(auVar25._8_8_ + (long)piVar11);
                  piVar1 = (int7 *)((long)piVar11 + 1);
                  if (piVar11 == (int7 *)0xffffffffffffffff) {
                    piVar1 = (int7 *)0xffffffffffffffff;
                  }
                  if (((ulong)piVar11 & 1) != 0) {
                    piVar11 = piVar1;
                  }
                  if (((piVar11 <= pdVar6) && (1 < (ulong)((long)pdVar6 - (long)piVar11))) &&
                     (*(short *)((long)plVar7 + (long)piVar11) == 0xa60)) {
                    uVar10 = func_0x0043fb2c((char *)((long)plVar7 + (long)auVar25._8_8_),0x14,10);
code_r0x0043bb10:
                    if ((uVar10 & 1) != 0) goto code_r0x0043cfd4;
                  }
                }
              }
            }
            goto LAB_0043cc70;
          }
          auVar25 = func_0x0043fb2c((char *)((long)plVar7 + 0x1c),0x14,10);
          auVar25._8_8_ = auVar25._8_8_;
          if ((auVar25._0_8_ & 1) == 0) goto LAB_0043cc70;
          if (auVar25._8_8_ != (int7 *)0x0) {
            if ((auVar25._8_8_ <= pdVar6) && (0x6f < (ulong)((long)pdVar6 - (long)auVar25._8_8_))) {
              auVar25 = func_0x0043fb2c((char *)((long)plVar7 + (long)auVar25._8_8_) + 0x6c,4,10);
              if ((auVar25._0_8_ & 1) != 0) {
                piVar11 = auVar25._8_8_ + 0xe;
                if ((piVar11 <= pdVar6) && (auVar25._8_8_ <= (ulong)((long)pdVar6 - (long)piVar11)))
                {
                  piVar11 = (int7 *)(auVar25._8_8_ + (long)piVar11);
                  piVar1 = (int7 *)((long)piVar11 + 1);
                  if (piVar11 == (int7 *)0xffffffffffffffff) {
                    piVar1 = (int7 *)0xffffffffffffffff;
                  }
                  if (((ulong)piVar11 & 1) != 0) {
                    piVar11 = piVar1;
                  }
                  if (((piVar11 <= pdVar6) && (1 < (ulong)((long)pdVar6 - (long)piVar11))) &&
                     (*(short *)((long)plVar7 + (long)piVar11) == 0xa60)) {
                    uVar10 = func_0x0043fb2c((char *)((long)plVar7 + (long)auVar25._8_8_),0x14,10);
                    goto code_r0x0043bb10;
                  }
                }
              }
            }
            goto LAB_0043cc70;
          }
code_r0x0043cfd4:
          auVar25 = func_0x0043fb2c(plVar7 + 1,0x14,10);
          auVar25._8_8_ = auVar25._8_8_;
          if ((auVar25._0_8_ & 1) == 0) goto LAB_0043cc70;
          if (auVar25._8_8_ != (int7 *)0x0) {
            if ((auVar25._8_8_ <= pdVar6) && (0x6f < (ulong)((long)pdVar6 - (long)auVar25._8_8_))) {
              auVar25 = func_0x0043fb2c((char *)((long)plVar7 + (long)auVar25._8_8_) + 0x6c,4,10);
              if ((auVar25._0_8_ & 1) != 0) {
                piVar11 = auVar25._8_8_ + 0xe;
                if ((piVar11 <= pdVar6) && (auVar25._8_8_ <= (ulong)((long)pdVar6 - (long)piVar11)))
                {
                  piVar11 = (int7 *)(auVar25._8_8_ + (long)piVar11);
                  piVar1 = (int7 *)((long)piVar11 + 1);
                  if (piVar11 == (int7 *)0xffffffffffffffff) {
                    piVar1 = (int7 *)0xffffffffffffffff;
                  }
                  if (((ulong)piVar11 & 1) != 0) {
                    piVar11 = piVar1;
                  }
                  if (((piVar11 <= pdVar6) && (1 < (ulong)((long)pdVar6 - (long)piVar11))) &&
                     (*(short *)((long)plVar7 + (long)piVar11) == 0xa60)) {
                    auVar25 = func_0x0043fb2c((char *)((long)plVar7 + (long)auVar25._8_8_),0x14,10);
                    uVar10 = auVar25._8_8_;
                    if ((((auVar25._0_8_ & 1) != 0) &&
                        (piVar11 = (int7 *)((long)piVar11 + 2), piVar11 != (int7 *)0x0)) &&
                       ((piVar11 <= pdVar6 &&
                        ((uVar10 <= (ulong)((long)pdVar6 - (long)piVar11) && (0x13 < uVar10)))))) {
                      auVar25 = func_0x0043fb2c((char *)((long)plVar7 + (long)piVar11),0x14,10);
                      in_stack_00001538 = auVar25._8_8_;
                      if (((auVar25._0_8_ & 1) != 0) &&
                         ((auVar25._8_8_ = 0, auVar25._0_8_ = in_stack_00001538,
                          SUB168(auVar25 * ZEXT816(0x14),8) == 0 &&
                          ((ulong)((long)in_stack_00001538 * 0x14) <= uVar10 - 0x14)))) {
                        in_stack_00001530 = (dword *)((char *)((long)plVar7 + (long)piVar11) + 0x14)
                        ;
                        goto LAB_0043d168;
                      }
                    }
                  }
                }
              }
            }
            goto LAB_0043cc70;
          }
          in_stack_00001538 = (dword *)0x0;
          in_stack_00001530 = (dword *)((long)&MACH_HEADER.magic + 1);
LAB_0043d168:
          pcVar19 = (char *)0x1;
          uVar10 = 0;
          uVar14 = 0;
          in_stack_00001528 = (int *)((long)&MACH_HEADER.magic + 1);
        }
code_r0x0043c9e4:
        if ((int)in_stack_00001528 != 0) goto code_r0x0043ca98;
code_r0x0043ca0c:
        if (in_stack_00001530 < in_stack_00001538) {
          func_0x0040b7cc(auStack_7ffffffe + 0x80002256,plVar7,pdVar6,auStack_7ffffffe + 0x8000152e,
                          pcVar19,uVar10,uVar14);
          pdVar20 = in_stack_00002280;
          auVar25._8_8_ = in_stack_00002278;
          pcVar3 = in_stack_00002268;
          uVar12 = in_stack_00002270;
joined_r0x0043ca80:
          if ((uVar12 != uVar18) || (iVar8 = _memcmp(pcVar3,lVar17,uVar18), iVar8 != 0)) {
            do {
              if (in_stack_00001528 == (int *)0x0) goto code_r0x0043ca0c;
code_r0x0043ca98:
              if (in_stack_00001538 == (dword *)0x0) goto LAB_0043cc70;
              in_stack_00001538 = (dword *)((long)in_stack_00001538 + -1);
              auVar25 = func_0x0043fb2c(in_stack_00001530,0x14,10);
              piVar11 = auVar25._8_8_;
              if ((((auVar25._0_8_ & 1) != 0) && (piVar11 <= pdVar6)) &&
                 (0x6f < (ulong)((long)pdVar6 - (long)piVar11))) {
                auVar25 = func_0x0043fb2c((char *)((long)plVar7 + (long)piVar11) + 0x6c,4,10);
                uVar12 = auVar25._8_8_;
                if ((auVar25._0_8_ & 1) != 0) {
                  piVar1 = piVar11 + 0xe;
                  if ((piVar1 <= pdVar6) && (uVar12 <= (ulong)((long)pdVar6 - (long)piVar1))) {
                    auVar25._8_8_ = (int7 *)(uVar12 + (long)piVar1);
                    piVar2 = (int7 *)((long)auVar25._8_8_ + 1);
                    if (auVar25._8_8_ == (int7 *)0xffffffffffffffff) {
                      piVar2 = (int7 *)0xffffffffffffffff;
                    }
                    if (((ulong)auVar25._8_8_ & 1) != 0) {
                      auVar25._8_8_ = piVar2;
                    }
                    if ((auVar25._8_8_ <= pdVar6 && 1 < (ulong)((long)pdVar6 - (long)auVar25._8_8_))
                       && (*(short *)((long)plVar7 + (long)auVar25._8_8_) == 0xa60)) {
                      auVar25 = func_0x0043fb2c((char *)((long)plVar7 + (long)piVar11),0x14,10);
                      pdVar20 = auVar25._8_8_;
                      if ((auVar25._0_8_ & 1) != 0) goto code_r0x0043cb54;
                    }
                  }
                }
              }
              in_stack_00001530 = (dword *)((long)&MACH_HEADER.magic + 1);
              in_stack_00001538 = (dword *)0x0;
            } while( true );
          }
          if (auVar25._8_8_ == (int7 *)0x0) {
            pdVar20 = (dword *)0x0;
            plVar13 = (long *)((long)&MACH_HEADER.magic + 1);
          }
          else {
            if ((pdVar6 < auVar25._8_8_) || ((int7 *)((long)pdVar6 - (long)auVar25._8_8_) < pdVar20)
               ) goto LAB_0043cc70;
            plVar13 = (long *)((long)plVar7 + (long)auVar25._8_8_);
          }
          goto code_r0x0043cbb4;
        }
LAB_0043cc70:
        func_0x003f7334(auStack_7ffffffe + 0x80001bee);
        _munmap(plVar7,pdVar6);
        goto code_r0x0043cc84;
      }
code_r0x0043cbb4:
      func_0x0043d660(auStack_7ffffffe + 0x80001526,plVar13,pdVar20);
      if (((in_stack_00001528 == (int *)0x0) || (*in_stack_00001528 == -0x30051202)) ||
         (func_0x0043d840(auStack_7ffffffe + 0x80001526,in_stack_00001528,in_stack_00001530,
                          in_stack_00001538), in_stack_00001528 == (int *)0x8000000000000000))
      goto LAB_0043cc70;
      in_stack_00001e00 = 0x8000000000000000;
      func_0x004385b0(&uStack0000000000000050,auStack_7ffffffe + 0x8000177e,
                      auStack_7ffffffe + 0x80001dfe,auStack_7ffffffe + 0x80001dfe);
      lVar17 = uStack0000000000000050;
      if (uStack0000000000000050 == -0x8000000000000000) goto LAB_0043cc70;
      _memcpy(auStack_7ffffffe + 0x800009ae,&uStack0000000000000058,0x200);
      lVar15 = *plVar24;
    }
    else {
code_r0x0043cc84:
      lVar17 = -0x8000000000000000;
      lVar15 = *plVar24;
      pdVar6 = in_stack_00000030;
      plVar7 = in_stack_00000038;
      lVar31 = in_stack_00001348;
      lVar30 = in_stack_00001340;
      lVar29 = in_stack_00001338;
      lVar28 = in_stack_00001330;
      lVar27 = in_stack_00001328;
      lVar26 = in_stack_00001320;
    }
    if ((lVar15 != -0x7fffffffffffffff) && (lVar15 != -0x8000000000000000)) {
      func_0x003f70a4(plVar24);
      _munmap(plVar24[0x41],plVar24[0x42]);
      func_0x003f7334(plVar24 + 0x43);
    }
    *plVar24 = lVar17;
    _memcpy(plVar24 + 1,auStack_7ffffffe + 0x800009ae,0x200);
    plVar24[0x41] = (long)plVar7;
    plVar24[0x42] = (long)pdVar6;
    plVar24[0x44] = lVar27;
    plVar24[0x43] = lVar26;
    plVar24[0x46] = lVar29;
    plVar24[0x45] = lVar28;
    plVar24[0x48] = lVar31;
    plVar24[0x47] = lVar30;
    if (lVar17 == -0x7fffffffffffffff) goto code_r0x0043cef0;
  }
  if ((lVar17 != -0x8000000000000000) && (uVar18 = plVar24[2], uVar18 != 0)) {
    lVar31 = plVar24[1];
    uVar4 = *puVar9;
    uVar10 = puVar9[1];
    lVar17 = 0;
    if (uVar18 != 1) {
      do {
        lVar30 = (uVar18 >> 1) + lVar17;
        puVar16 = (undefined8 *)(lVar31 + lVar30 * 0x18);
        uVar5 = puVar16[1];
        uVar12 = uVar5;
        if (uVar10 <= uVar5) {
          uVar12 = uVar10;
        }
        iVar8 = _memcmp(*puVar16,uVar4,uVar12);
        lVar29 = uVar5 - uVar10;
        if (iVar8 != 0) {
          lVar29 = (long)iVar8;
        }
        if (lVar29 < 1) {
          lVar17 = lVar30;
        }
        uVar18 = uVar18 - (uVar18 >> 1);
      } while (1 < uVar18);
    }
    puVar16 = (undefined8 *)(lVar31 + lVar17 * 0x18);
    uVar12 = puVar16[1];
    uVar18 = uVar12;
    if (uVar10 <= uVar12) {
      uVar18 = uVar10;
    }
    iVar8 = _memcmp(*puVar16,uVar4,uVar18);
    lVar30 = uVar12 - uVar10;
    if (iVar8 != 0) {
      lVar30 = (long)iVar8;
    }
    if ((lVar30 == 0) &&
       (func_0x0043aa50(auStack_7ffffffe + 0x800009ae,plVar24,
                        (uVar21 - puVar9[2]) + *(long *)(lVar31 + lVar17 * 0x18 + 0x10)),
       in_stack_000009b0 != 5)) {
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
        pcVar22 = *(code **)(in_stack_00000010 + 0x20);
        (*pcVar22)(in_stack_00000020,auStack_7ffffffe + 0x8000177e);
        while (func_0x0040f900(auStack_7ffffffe + 0x80001dfe,&uStack0000000000000050),
              in_stack_00001e00 < 2) {
          (*pcVar22)(in_stack_00000020,auStack_7ffffffe + 0x8000177e);
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
  if (uRam0000000000a29cd0 != 0) {
    if (uRam0000000000a29cd0 == 1) {
      uVar18 = 0;
    }
    else {
      uVar18 = 0;
      uVar10 = uRam0000000000a29cd0;
      do {
        uVar12 = (uVar10 >> 1) + uVar18;
        if (*(ulong *)(lRam0000000000a29cc8 + uVar12 * 0x18 + 0x10) <= uVar21) {
          uVar18 = uVar12;
        }
        uVar10 = uVar10 - (uVar10 >> 1);
      } while (1 < uVar10);
    }
    uVar10 = *(ulong *)(lRam0000000000a29cc8 + uVar18 * 0x18 + 0x10);
    if (uVar10 != uVar21) {
      if (uVar10 < uVar21) {
        uVar18 = uVar18 + 1;
      }
      if (uVar18 == 0) {
        return;
      }
      uVar18 = uVar18 - 1;
    }
    if (uVar18 < uRam0000000000a29cd0) {
      puVar9 = (undefined8 *)(lRam0000000000a29cc8 + uVar18 * 0x18);
      uStack0000000000000058 = (long *)*puVar9;
      in_stack_00000060 = (dword *)puVar9[1];
      uStack0000000000000050 = CONCAT44(uStack0000000000000050._4_4_,3);
      (**(code **)(in_stack_00000010 + 0x20))(in_stack_00000020,&uStack0000000000000050);
    }
  }
  return;
code_r0x0043cb54:
  pcVar3 = (char *)((long)plVar7 + (long)piVar1);
  auVar25._8_8_ = (int7 *)((long)auVar25._8_8_ + 2);
  in_stack_00001530 = in_stack_00001530 + 5;
  goto joined_r0x0043ca80;
}

