
void FUN_005f44a8(ulong param_1)

{
  long *plVar1;
  uint uVar2;
  code *pcVar3;
  bool bVar4;
  int iVar5;
  ulong *puVar6;
  long *plVar7;
  undefined8 *puVar8;
  undefined8 *puVar9;
  ulong uVar10;
  byte *in_x9;
  ulong uVar11;
  int iVar12;
  byte *pbVar13;
  byte *in_x11;
  uint uVar14;
  ulong unaff_x19;
  ulong unaff_x21;
  int *unaff_x23;
  undefined8 *unaff_x24;
  ulong unaff_x25;
  ulong uVar15;
  undefined8 *unaff_x26;
  long unaff_x29;
  ulong uStack0000000000000000;
  ulong uStack0000000000000008;
  ulong in_stack_00000010;
  undefined7 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  ulong in_stack_00000028;
  undefined8 in_stack_00000030;
  
  pbVar13 = in_x9;
  do {
    if (*pbVar13 - 0x30 < 10) {
      if (pbVar13 != in_x11) {
        uVar15 = (long)pbVar13 - (long)in_x9;
        if (uVar15 != 0xffffffffffffffff) {
          if ((int)unaff_x19 < 0) {
            if (unaff_x21 < uVar15) goto LAB_005f4c38;
          }
          else {
            if (param_1 < uVar15) goto LAB_005f4c38;
            unaff_x26 = &uStack0000000000000020;
            unaff_x21 = param_1;
          }
          uVar10 = unaff_x21 - uVar15;
          if (unaff_x25 < uVar10) {
            func_0x0001748c(&uStack0000000000000008);
            goto code_r0x005f4c4c;
          }
          if (uVar10 < 0x17) {
            _uStack0000000000000018 = CONCAT17((char)uVar10,uStack0000000000000018);
            puVar6 = &uStack0000000000000008;
            if (unaff_x21 != uVar15) goto LAB_005f4574;
            *(undefined1 *)((long)puVar6 + uVar10) = 0;
            if (-1 < (long)_uStack0000000000000018) goto LAB_005f4530;
LAB_005f4590:
            puVar6 = (ulong *)uStack0000000000000008;
            uRam0000000000a3c13c = _atoi(uStack0000000000000008);
            __ZdlPv(puVar6);
          }
          else {
            uVar11 = (uVar10 & 0xfffffffffffffff8) + 8;
            if ((uVar10 | 7) != 0x17) {
              uVar11 = uVar10 | 7;
            }
            puVar6 = (ulong *)__Znwm(uVar11 + 1);
            _uStack0000000000000018 = uVar11 + 1 | 0x8000000000000000;
            uStack0000000000000008 = (ulong)puVar6;
            in_stack_00000010 = uVar10;
LAB_005f4574:
            _memmove(puVar6,(long)unaff_x26 + uVar15,uVar10);
            *(undefined1 *)((long)puVar6 + uVar10) = 0;
            if ((long)_uStack0000000000000018 < 0) goto LAB_005f4590;
LAB_005f4530:
            uRam0000000000a3c13c = _atoi(&uStack0000000000000008);
          }
          param_1 = (ulong)in_stack_00000030._7_1_;
          unaff_x19 = param_1;
          unaff_x21 = in_stack_00000028;
          unaff_x26 = uStack0000000000000020;
        }
      }
      break;
    }
    pbVar13 = pbVar13 + 1;
  } while (pbVar13 != in_x11);
  uVar14 = (uint)unaff_x19;
  uVar15 = unaff_x21;
  if (-1 < (char)unaff_x19) {
    unaff_x26 = unaff_x24;
    uVar15 = param_1;
  }
  plVar1 = (long *)((long)unaff_x26 + uVar15);
  if (5 < (long)uVar15) {
    puVar9 = unaff_x26;
    uVar10 = uVar15;
    while (plVar7 = (long *)_memchr(puVar9,0x69,uVar10 - 5), plVar7 != (long *)0x0) {
      if ((int)*plVar7 == 0x6f685069 && *(short *)((long)plVar7 + 4) == 0x656e) {
        if ((plVar7 != plVar1) && ((long)plVar7 - (long)unaff_x26 != -1)) {
          *unaff_x23 = 3;
          uVar2 = unaff_x23[1];
          goto joined_r0x005f4644;
        }
        break;
      }
      puVar9 = (undefined8 *)((long)plVar7 + 1);
      uVar10 = (long)plVar1 - (long)puVar9;
      if ((long)uVar10 < 6) break;
    }
  }
  if (3 < (long)uVar15) {
    puVar9 = unaff_x26;
    uVar10 = uVar15;
LAB_005f4664:
    plVar7 = (long *)_memchr(puVar9,0x69,uVar10 - 3);
    puVar8 = unaff_x26;
    uVar11 = uVar15;
    if (plVar7 != (long *)0x0) {
      if ((int)*plVar7 != 0x646f5069) goto code_r0x005f4688;
      if ((plVar7 != plVar1) && ((long)plVar7 - (long)unaff_x26 != -1)) {
        *unaff_x23 = 4;
        uVar2 = unaff_x23[1];
joined_r0x005f4644:
        if (uVar2 < 6) goto LAB_005f4a24;
        goto LAB_005f4734;
      }
    }
    goto LAB_005f46a0;
  }
  goto LAB_005f479c;
code_r0x005f4688:
  puVar9 = (undefined8 *)((long)plVar7 + 1);
  uVar10 = (long)plVar1 - (long)puVar9;
  if ((long)uVar10 < 4) goto LAB_005f46a0;
  goto LAB_005f4664;
LAB_005f46a0:
  plVar7 = (long *)_memchr(puVar8,0x69,uVar11 - 3);
  if (plVar7 == (long *)0x0) goto LAB_005f473c;
  if ((int)*plVar7 == 0x64615069) {
    if ((plVar7 != plVar1) && ((long)plVar7 - (long)unaff_x26 != -1)) {
      uRam0000000000a3c140 = 5;
      *unaff_x23 = 5;
      if (4 < (uint)unaff_x23[1]) goto LAB_005f4734;
      goto code_r0x005f4be4;
    }
    goto LAB_005f473c;
  }
  uVar11 = (long)plVar1 - ((long)plVar7 + 1);
  puVar8 = (undefined8 *)((long)plVar7 + 1);
  if ((long)uVar11 < 4) goto LAB_005f473c;
  goto LAB_005f46a0;
code_r0x005f4828:
  *unaff_x23 = 1;
  unaff_x23[2] = 1;
  goto code_r0x005f4be4;
code_r0x005f490c:
  *unaff_x23 = 2;
  unaff_x23[2] = 0;
  goto code_r0x005f4be4;
LAB_005f473c:
  if (7 < (long)uVar15) {
    puVar9 = unaff_x26;
    while (plVar7 = (long *)_memchr(puVar9,0x50,uVar15 - 7), plVar7 != (long *)0x0) {
      if (*plVar7 == 0x63614d7265776f50) {
        if ((plVar7 != plVar1) && ((long)plVar7 - (long)unaff_x26 != -1)) goto code_r0x005f4828;
        break;
      }
      puVar9 = (undefined8 *)((long)plVar7 + 1);
      uVar15 = (long)plVar1 - (long)puVar9;
      if ((long)uVar15 < 8) break;
    }
  }
LAB_005f479c:
  if (-1 < (char)unaff_x19) {
    unaff_x21 = unaff_x19 & 0xff;
  }
  plVar1 = (long *)((long)unaff_x26 + unaff_x21);
  if (0xe < (long)unaff_x21) {
    puVar9 = unaff_x26;
    uVar15 = unaff_x21;
    while (plVar7 = (long *)_memchr(puVar9,0x50,uVar15 - 0xe), plVar7 != (long *)0x0) {
      if (*plVar7 == 0x614d207265776f50 && *(long *)((long)plVar7 + 7) == 0x68736f746e696361) {
        if ((plVar7 != plVar1) && ((long)plVar7 - (long)unaff_x26 != -1)) goto code_r0x005f4828;
        break;
      }
      puVar9 = (undefined8 *)((long)plVar7 + 1);
      uVar15 = (long)plVar1 - (long)puVar9;
      if ((long)uVar15 < 0xf) break;
    }
  }
  if (2 < (long)unaff_x21) {
    puVar9 = unaff_x26;
    uVar15 = unaff_x21;
    while (plVar7 = (long *)_memchr(puVar9,0x4d,uVar15 - 2), plVar7 != (long *)0x0) {
      if ((short)*plVar7 == 0x614d && *(char *)((long)plVar7 + 2) == 'c') {
        if ((plVar7 != plVar1) && ((long)plVar7 - (long)unaff_x26 != -1)) goto code_r0x005f490c;
        break;
      }
      puVar9 = (undefined8 *)((long)plVar7 + 1);
      uVar15 = (long)plVar1 - (long)puVar9;
      if ((long)uVar15 < 3) break;
    }
    if (8 < (long)unaff_x21) {
      puVar9 = unaff_x26;
      uVar15 = unaff_x21;
      while (plVar7 = (long *)_memchr(puVar9,0x4d,uVar15 - 8), plVar7 != (long *)0x0) {
        if (*plVar7 == 0x736f746e6963614d && (char)plVar7[1] == 'h') {
          if ((plVar7 != plVar1) && ((long)plVar7 - (long)unaff_x26 != -1)) goto code_r0x005f490c;
          break;
        }
        puVar9 = (undefined8 *)((long)plVar7 + 1);
        uVar15 = (long)plVar1 - (long)puVar9;
        if ((long)uVar15 < 9) break;
      }
    }
    if (6 < (long)unaff_x21) {
      puVar9 = unaff_x26;
      uVar15 = unaff_x21;
      while (plVar7 = (long *)_memchr(puVar9,0x41,uVar15 - 6), plVar7 != (long *)0x0) {
        if ((int)*plVar7 == 0x6c707041 && *(int *)((long)plVar7 + 3) == 0x5654656c) {
          if ((plVar7 != plVar1) && ((long)plVar7 - (long)unaff_x26 != -1)) {
            uRam0000000000a3c140 = 6;
            *unaff_x23 = 6;
            if ((uint)unaff_x23[1] < 4) goto LAB_005f4a24;
            goto code_r0x005f4be4;
          }
          break;
        }
        puVar9 = (undefined8 *)((long)plVar7 + 1);
        uVar15 = (long)plVar1 - (long)puVar9;
        if ((long)uVar15 < 7) break;
      }
      if (9 < (long)unaff_x21) {
        puVar9 = unaff_x26;
        uVar15 = unaff_x21;
        while (plVar7 = (long *)_memchr(puVar9,0x41,uVar15 - 9), plVar7 != (long *)0x0) {
          if (*plVar7 == 0x746157656c707041 && (short)plVar7[1] == 0x6863) {
            if ((plVar7 != plVar1) && ((long)plVar7 - (long)unaff_x26 != -1)) {
              *unaff_x23 = 7;
              if ((uint)unaff_x23[1] < 4) {
LAB_005f4a24:
                uRam0000000000a3c140 = 5;
              }
              else {
LAB_005f4734:
                uRam0000000000a3c140 = 6;
              }
              goto code_r0x005f4be4;
            }
            break;
          }
          puVar9 = (undefined8 *)((long)plVar7 + 1);
          uVar15 = (long)plVar1 - (long)puVar9;
          if ((long)uVar15 < 10) break;
        }
      }
    }
    if (4 < (long)unaff_x21) {
      puVar9 = unaff_x26;
      while (plVar7 = (long *)_memchr(puVar9,0x61,unaff_x21 - 4), plVar7 != (long *)0x0) {
        if ((int)*plVar7 == 0x366d7261 && *(char *)((long)plVar7 + 4) == '4') {
          if ((plVar7 != plVar1) && ((long)plVar7 - (long)unaff_x26 != -1)) {
            uStack0000000000000008 = 0;
            in_stack_00000010 = 0;
            _uStack0000000000000018 = 0;
            uStack0000000000000000 = 0x20;
            __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEmc
                      (&uStack0000000000000008,0x20,0);
            puVar6 = (ulong *)uStack0000000000000008;
            if (-1 < (long)_uStack0000000000000018) {
              puVar6 = &uStack0000000000000008;
            }
            iVar5 = _sysctlbyname("machdep.cpu.brand_string",puVar6);
            if (iVar5 == 0) {
              puVar6 = (ulong *)uStack0000000000000008;
              if (-1 < (long)_uStack0000000000000018) {
                puVar6 = &uStack0000000000000008;
              }
              if (*(char *)((long)puVar6 + 0x1f) == '\0') {
                uStack0000000000000000 = 0x1f;
              }
              if ((long)_uStack0000000000000018 < 0) {
                uVar15 = in_stack_00000010;
                if (in_stack_00000010 < uStack0000000000000000) goto code_r0x005f4b44;
                in_stack_00000010 = uStack0000000000000000;
                puVar6 = (ulong *)uStack0000000000000008;
              }
              else {
                uVar15 = _uStack0000000000000018 >> 0x38;
                if (_uStack0000000000000018 >> 0x38 < uStack0000000000000000) {
code_r0x005f4b44:
                  __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEmc
                            (&uStack0000000000000008,uStack0000000000000000 - uVar15,0);
                  goto code_r0x005f4b60;
                }
                _uStack0000000000000018 =
                     CONCAT17((char)uStack0000000000000000,uStack0000000000000018);
                puVar6 = &uStack0000000000000008;
              }
              *(undefined1 *)((long)puVar6 + uStack0000000000000000) = 0;
            }
code_r0x005f4b60:
            uVar15 = in_stack_00000010;
            if (-1 < (long)_uStack0000000000000018) {
              uVar15 = _uStack0000000000000018 >> 0x38;
            }
            iVar5 = 6;
            if (uVar15 == 8) {
              puVar6 = (ulong *)uStack0000000000000008;
              if (-1 < (long)_uStack0000000000000018) {
                puVar6 = &uStack0000000000000008;
              }
              uVar15 = (*puVar6 & 0xff00ff00ff00ff00) >> 8 | (*puVar6 & 0xff00ff00ff00ff) << 8;
              uVar15 = (uVar15 & 0xffff0000ffff0000) >> 0x10 | (uVar15 & 0xffff0000ffff) << 0x10;
              uVar15 = uVar15 >> 0x20 | uVar15 << 0x20;
              bVar4 = 0x4170706c65204d31 < uVar15 == uVar15 < 0x4170706c65204d31;
              iVar12 = (uint)bVar4 << 1;
              iVar5 = 6;
              if (bVar4) {
                iVar5 = 7;
              }
            }
            else {
              iVar12 = 0;
            }
            *unaff_x23 = iVar12;
            unaff_x23[2] = iVar5;
            if ((long)_uStack0000000000000018 < 0) {
              __ZdlPv(uStack0000000000000008);
            }
            uVar14 = (uint)in_stack_00000030._7_1_;
          }
          break;
        }
        puVar9 = (undefined8 *)((long)plVar7 + 1);
        unaff_x21 = (long)plVar1 - (long)puVar9;
        if ((long)unaff_x21 < 5) break;
      }
    }
  }
code_r0x005f4be4:
  if ((uVar14 >> 7 & 1) != 0) {
    __ZdlPv(uStack0000000000000020);
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x58)) {
    return;
  }
  ___stack_chk_fail();
LAB_005f4c38:
  func_0x00049dd0(&uStack0000000000000008);
code_r0x005f4c4c:
                    /* WARNING: Does not return */
  pcVar3 = (code *)SoftwareBreakpoint(1,0x5f4c50);
  (*pcVar3)();
}

