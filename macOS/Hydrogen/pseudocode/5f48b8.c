
void FUN_005f48b8(void)

{
  code *pcVar1;
  bool bVar2;
  int iVar3;
  long *plVar4;
  ulong *puVar5;
  int iVar6;
  ulong uVar7;
  uint unaff_w19;
  long unaff_x20;
  long *unaff_x21;
  long unaff_x22;
  int *unaff_x23;
  long unaff_x24;
  uint unaff_w25;
  long unaff_x29;
  ulong uStack0000000000000000;
  ulong uStack0000000000000008;
  ulong in_stack_00000010;
  undefined7 uStack0000000000000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000030;
  
  while (plVar4 = (long *)_memchr(), plVar4 != (long *)0x0) {
    if (*plVar4 == unaff_x24 && *(byte *)(plVar4 + 1) == unaff_w25) {
      if ((plVar4 != unaff_x21) && ((long)plVar4 - unaff_x20 != -1)) {
        *unaff_x23 = 2;
        unaff_x23[2] = 0;
        goto LAB_005f4be4;
      }
      break;
    }
    if ((long)unaff_x21 - ((long)plVar4 + 1) < 9) break;
  }
  if (6 < unaff_x22) {
    while (plVar4 = (long *)_memchr(), plVar4 != (long *)0x0) {
      if ((int)*plVar4 == 0x6c707041 && *(int *)((long)plVar4 + 3) == 0x5654656c) {
        if ((plVar4 != unaff_x21) && ((long)plVar4 - unaff_x20 != -1)) {
          uRam0000000000a3c140 = 6;
          *unaff_x23 = 6;
          if (3 < (uint)unaff_x23[1]) goto LAB_005f4be4;
          goto LAB_005f4a24;
        }
        break;
      }
      if ((long)unaff_x21 - ((long)plVar4 + 1) < 7) break;
    }
    if (9 < unaff_x22) {
      while (plVar4 = (long *)_memchr(), plVar4 != (long *)0x0) {
        if (*plVar4 == 0x746157656c707041 && (short)plVar4[1] == 0x6863) {
          if ((plVar4 != unaff_x21) && ((long)plVar4 - unaff_x20 != -1)) {
            *unaff_x23 = 7;
            if ((uint)unaff_x23[1] < 4) {
LAB_005f4a24:
              uRam0000000000a3c140 = 5;
            }
            else {
              uRam0000000000a3c140 = 6;
            }
            goto LAB_005f4be4;
          }
          break;
        }
        if ((long)unaff_x21 - ((long)plVar4 + 1) < 10) break;
      }
    }
  }
  if (4 < unaff_x22) {
    while (plVar4 = (long *)_memchr(), plVar4 != (long *)0x0) {
      if ((int)*plVar4 == 0x366d7261 && *(char *)((long)plVar4 + 4) == '4') {
        if ((plVar4 != unaff_x21) && ((long)plVar4 - unaff_x20 != -1)) {
          uStack0000000000000008 = 0;
          in_stack_00000010 = 0;
          _uStack0000000000000018 = 0;
          uStack0000000000000000 = 0x20;
          __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEmc
                    (&uStack0000000000000008,0x20,0);
          puVar5 = (ulong *)uStack0000000000000008;
          if (-1 < (long)_uStack0000000000000018) {
            puVar5 = &uStack0000000000000008;
          }
          iVar3 = _sysctlbyname("machdep.cpu.brand_string",puVar5);
          if (iVar3 == 0) {
            puVar5 = (ulong *)uStack0000000000000008;
            if (-1 < (long)_uStack0000000000000018) {
              puVar5 = &uStack0000000000000008;
            }
            if (*(char *)((long)puVar5 + 0x1f) == '\0') {
              uStack0000000000000000 = 0x1f;
            }
            if ((long)_uStack0000000000000018 < 0) {
              uVar7 = in_stack_00000010;
              if (in_stack_00000010 < uStack0000000000000000) goto LAB_005f4b44;
              in_stack_00000010 = uStack0000000000000000;
              puVar5 = (ulong *)uStack0000000000000008;
            }
            else {
              uVar7 = _uStack0000000000000018 >> 0x38;
              if (_uStack0000000000000018 >> 0x38 < uStack0000000000000000) {
LAB_005f4b44:
                __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEmc
                          (&uStack0000000000000008,uStack0000000000000000 - uVar7,0);
                goto LAB_005f4b60;
              }
              _uStack0000000000000018 =
                   CONCAT17((char)uStack0000000000000000,uStack0000000000000018);
              puVar5 = &uStack0000000000000008;
            }
            *(undefined1 *)((long)puVar5 + uStack0000000000000000) = 0;
          }
LAB_005f4b60:
          uVar7 = in_stack_00000010;
          if (-1 < (long)_uStack0000000000000018) {
            uVar7 = _uStack0000000000000018 >> 0x38;
          }
          iVar3 = 6;
          if (uVar7 == 8) {
            puVar5 = (ulong *)uStack0000000000000008;
            if (-1 < (long)_uStack0000000000000018) {
              puVar5 = &uStack0000000000000008;
            }
            uVar7 = (*puVar5 & 0xff00ff00ff00ff00) >> 8 | (*puVar5 & 0xff00ff00ff00ff) << 8;
            uVar7 = (uVar7 & 0xffff0000ffff0000) >> 0x10 | (uVar7 & 0xffff0000ffff) << 0x10;
            uVar7 = uVar7 >> 0x20 | uVar7 << 0x20;
            bVar2 = 0x4170706c65204d31 < uVar7 == uVar7 < 0x4170706c65204d31;
            iVar6 = (uint)bVar2 << 1;
            iVar3 = 6;
            if (bVar2) {
              iVar3 = 7;
            }
          }
          else {
            iVar6 = 0;
          }
          *unaff_x23 = iVar6;
          unaff_x23[2] = iVar3;
          if ((long)_uStack0000000000000018 < 0) {
            __ZdlPv(uStack0000000000000008);
          }
          unaff_w19 = (uint)in_stack_00000030._7_1_;
        }
        break;
      }
      if ((long)unaff_x21 - ((long)plVar4 + 1) < 5) break;
    }
  }
LAB_005f4be4:
  if ((unaff_w19 >> 7 & 1) != 0) {
    __ZdlPv(in_stack_00000020);
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x58)) {
    ___stack_chk_fail();
    func_0x00049dd0(&uStack0000000000000008);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x5f4c50);
    (*pcVar1)();
  }
  return;
}

