
void FUN_005f478c(long param_1)

{
  long *plVar1;
  code *pcVar2;
  bool in_ZR;
  bool bVar3;
  int iVar4;
  long *plVar5;
  ulong *puVar6;
  int iVar7;
  ulong uVar8;
  uint uVar9;
  ulong unaff_x19;
  long unaff_x20;
  ulong unaff_x21;
  int unaff_w22;
  int *unaff_x23;
  long unaff_x29;
  ulong uStack0000000000000000;
  ulong uStack0000000000000008;
  ulong in_stack_00000010;
  undefined7 uStack0000000000000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000030;
  
  uVar9 = (uint)unaff_x19;
  if ((in_ZR) || (param_1 - unaff_x20 == -1)) {
    if (-1 < unaff_w22) {
      unaff_x21 = unaff_x19 & 0xff;
    }
    plVar1 = (long *)(unaff_x20 + unaff_x21);
    if (0xe < (long)unaff_x21) {
      while (plVar5 = (long *)_memchr(), plVar5 != (long *)0x0) {
        if (*plVar5 == 0x614d207265776f50 && *(long *)((long)plVar5 + 7) == 0x68736f746e696361) {
          if ((plVar5 != plVar1) && ((long)plVar5 - unaff_x20 != -1)) goto FUN_005f4828;
          break;
        }
        if ((long)plVar1 - ((long)plVar5 + 1) < 0xf) break;
      }
    }
    if (2 < (long)unaff_x21) {
      while (plVar5 = (long *)_memchr(), plVar5 != (long *)0x0) {
        if ((short)*plVar5 == 0x614d && *(char *)((long)plVar5 + 2) == 'c') {
          if ((plVar5 != plVar1) && ((long)plVar5 - unaff_x20 != -1)) goto code_r0x005f490c;
          break;
        }
        if ((long)plVar1 - ((long)plVar5 + 1) < 3) break;
      }
      if (8 < (long)unaff_x21) {
        while (plVar5 = (long *)_memchr(), plVar5 != (long *)0x0) {
          if (*plVar5 == 0x736f746e6963614d && (char)plVar5[1] == 'h') {
            if ((plVar5 != plVar1) && ((long)plVar5 - unaff_x20 != -1)) goto code_r0x005f490c;
            break;
          }
          if ((long)plVar1 - ((long)plVar5 + 1) < 9) break;
        }
      }
      if (6 < (long)unaff_x21) {
        while (plVar5 = (long *)_memchr(), plVar5 != (long *)0x0) {
          if ((int)*plVar5 == 0x6c707041 && *(int *)((long)plVar5 + 3) == 0x5654656c) {
            if ((plVar5 != plVar1) && ((long)plVar5 - unaff_x20 != -1)) {
              uRam0000000000a3c140 = 6;
              *unaff_x23 = 6;
              if (3 < (uint)unaff_x23[1]) goto LAB_005f4be4;
              goto code_r0x005f4a24;
            }
            break;
          }
          if ((long)plVar1 - ((long)plVar5 + 1) < 7) break;
        }
        if (9 < (long)unaff_x21) {
          while (plVar5 = (long *)_memchr(), plVar5 != (long *)0x0) {
            if (*plVar5 == 0x746157656c707041 && (short)plVar5[1] == 0x6863) {
              if ((plVar5 != plVar1) && ((long)plVar5 - unaff_x20 != -1)) {
                *unaff_x23 = 7;
                if ((uint)unaff_x23[1] < 4) {
code_r0x005f4a24:
                  uRam0000000000a3c140 = 5;
                }
                else {
                  uRam0000000000a3c140 = 6;
                }
                goto LAB_005f4be4;
              }
              break;
            }
            if ((long)plVar1 - ((long)plVar5 + 1) < 10) break;
          }
        }
      }
      if (4 < (long)unaff_x21) {
        while (plVar5 = (long *)_memchr(), plVar5 != (long *)0x0) {
          if ((int)*plVar5 == 0x366d7261 && *(char *)((long)plVar5 + 4) == '4') {
            if ((plVar5 != plVar1) && ((long)plVar5 - unaff_x20 != -1)) {
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
              iVar4 = _sysctlbyname("machdep.cpu.brand_string",puVar6);
              if (iVar4 == 0) {
                puVar6 = (ulong *)uStack0000000000000008;
                if (-1 < (long)_uStack0000000000000018) {
                  puVar6 = &uStack0000000000000008;
                }
                if (*(char *)((long)puVar6 + 0x1f) == '\0') {
                  uStack0000000000000000 = 0x1f;
                }
                if ((long)_uStack0000000000000018 < 0) {
                  uVar8 = in_stack_00000010;
                  if (in_stack_00000010 < uStack0000000000000000) goto code_r0x005f4b44;
                  in_stack_00000010 = uStack0000000000000000;
                  puVar6 = (ulong *)uStack0000000000000008;
                }
                else {
                  uVar8 = _uStack0000000000000018 >> 0x38;
                  if (_uStack0000000000000018 >> 0x38 < uStack0000000000000000) {
code_r0x005f4b44:
                    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEmc
                              (&uStack0000000000000008,uStack0000000000000000 - uVar8,0);
                    goto code_r0x005f4b60;
                  }
                  _uStack0000000000000018 =
                       CONCAT17((char)uStack0000000000000000,uStack0000000000000018);
                  puVar6 = &uStack0000000000000008;
                }
                *(undefined1 *)((long)puVar6 + uStack0000000000000000) = 0;
              }
code_r0x005f4b60:
              uVar8 = in_stack_00000010;
              if (-1 < (long)_uStack0000000000000018) {
                uVar8 = _uStack0000000000000018 >> 0x38;
              }
              iVar4 = 6;
              if (uVar8 == 8) {
                puVar6 = (ulong *)uStack0000000000000008;
                if (-1 < (long)_uStack0000000000000018) {
                  puVar6 = &uStack0000000000000008;
                }
                uVar8 = (*puVar6 & 0xff00ff00ff00ff00) >> 8 | (*puVar6 & 0xff00ff00ff00ff) << 8;
                uVar8 = (uVar8 & 0xffff0000ffff0000) >> 0x10 | (uVar8 & 0xffff0000ffff) << 0x10;
                uVar8 = uVar8 >> 0x20 | uVar8 << 0x20;
                bVar3 = 0x4170706c65204d31 < uVar8 == uVar8 < 0x4170706c65204d31;
                iVar7 = (uint)bVar3 << 1;
                iVar4 = 6;
                if (bVar3) {
                  iVar4 = 7;
                }
              }
              else {
                iVar7 = 0;
              }
              *unaff_x23 = iVar7;
              unaff_x23[2] = iVar4;
              if ((long)_uStack0000000000000018 < 0) {
                __ZdlPv(uStack0000000000000008);
              }
              uVar9 = (uint)in_stack_00000030._7_1_;
            }
            break;
          }
          if ((long)plVar1 - ((long)plVar5 + 1) < 5) break;
        }
      }
    }
  }
  else {
FUN_005f4828:
    *unaff_x23 = 1;
    unaff_x23[2] = 1;
  }
LAB_005f4be4:
  if ((uVar9 >> 7 & 1) != 0) {
    __ZdlPv(in_stack_00000020);
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x58)) {
    ___stack_chk_fail();
    func_0x00049dd0(&uStack0000000000000008);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x5f4c50);
    (*pcVar2)();
  }
  return;
code_r0x005f490c:
  *unaff_x23 = 2;
  unaff_x23[2] = 0;
  goto LAB_005f4be4;
}

