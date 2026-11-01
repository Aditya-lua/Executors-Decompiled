
void FUN_005f4370(undefined8 param_1)

{
  byte *pbVar1;
  uint uVar2;
  code *pcVar3;
  bool bVar4;
  undefined4 uVar5;
  int iVar6;
  undefined8 uVar7;
  ulong uVar8;
  byte *******pppppppbVar9;
  ulong *******pppppppuVar10;
  byte *pbVar11;
  byte *******pppppppbVar12;
  byte *******pppppppbVar13;
  ulong uVar14;
  ulong uVar15;
  uint uVar16;
  ulong uVar17;
  ulong uVar18;
  ulong uStack_5a0;
  ulong *******pppppppuStack_598;
  ulong uStack_590;
  undefined8 uStack_588;
  byte *******pppppppbStack_580;
  ulong uStack_578;
  undefined8 uStack_570;
  undefined1 auStack_568 [1024];
  undefined1 auStack_168 [256];
  long lStack_68;
  
  ___cxa_guard_abort(0xa3c130);
  uVar7 = __Unwind_Resume(param_1);
  ___cxa_guard_abort(0xa3c130);
  uVar7 = __Unwind_Resume(uVar7);
  ___cxa_guard_abort(0xa3c130);
  __Unwind_Resume(uVar7);
  lStack_68 = *(long *)PTR____stack_chk_guard_009b01e8;
  uRam0000000000a3c138 = 0;
  uRam0000000000a3c140 = 0;
  auStack_168[0] = 0;
  _uname(auStack_568);
  uVar8 = _strlen(auStack_168);
  if (0x7ffffffffffffff7 < uVar8) {
    func_0x0001748c(&pppppppbStack_580);
    goto code_r0x005f4c4c;
  }
  if (uVar8 < 0x17) {
    uStack_570 = CONCAT17((char)uVar8,(undefined7)uStack_570);
    pppppppbVar9 = (byte *******)&pppppppbStack_580;
    if (uVar8 != 0) goto code_r0x005f4470;
  }
  else {
    uVar14 = (uVar8 & 0xfffffffffffffff8) + 8;
    if ((uVar8 | 7) != 0x17) {
      uVar14 = uVar8 | 7;
    }
    pppppppbVar9 = (byte *******)__Znwm(uVar14 + 1);
    uStack_570 = uVar14 + 1 | 0x8000000000000000;
    pppppppbStack_580 = pppppppbVar9;
    uStack_578 = uVar8;
code_r0x005f4470:
    _memcpy(pppppppbVar9,auStack_168,uVar8);
  }
  *(byte *)((long)pppppppbVar9 + uVar8) = 0;
  uVar14 = (ulong)uStack_570._7_1_;
  uVar16 = (uint)(char)uStack_570._7_1_;
  uVar17 = (ulong)uVar16;
  uVar8 = uStack_578;
  pppppppbVar9 = pppppppbStack_580;
  if (-1 < (int)uVar16) {
    uVar8 = uVar14;
    pppppppbVar9 = (byte *******)&pppppppbStack_580;
  }
  if (uVar8 != 0) {
    pppppppbVar13 = pppppppbVar9;
    do {
      if (*(byte *)pppppppbVar13 - 0x30 < 10) {
        if (pppppppbVar13 != (byte *******)((long)pppppppbVar9 + uVar8)) {
          uVar8 = (long)pppppppbVar13 - (long)pppppppbVar9;
          if (uVar8 != 0xffffffffffffffff) {
            if ((int)uVar16 < 0) {
              uVar14 = uStack_578;
              pppppppbVar9 = pppppppbStack_580;
              if (uStack_578 < uVar8) goto code_r0x005f4c38;
            }
            else {
              if (uVar14 < uVar8) goto code_r0x005f4c38;
              pppppppbVar9 = (byte *******)&pppppppbStack_580;
            }
            uVar17 = uVar14 - uVar8;
            if (0x7ffffffffffffff7 < uVar17) {
              func_0x0001748c(&pppppppuStack_598);
              goto code_r0x005f4c4c;
            }
            if (uVar17 < 0x17) {
              uStack_588 = CONCAT17((char)uVar17,(undefined7)uStack_588);
              pppppppuVar10 = (ulong *******)&pppppppuStack_598;
              if (uVar14 != uVar8) goto code_r0x005f4574;
              *(undefined1 *)((long)pppppppuVar10 + uVar17) = 0;
              if (-1 < (long)uStack_588) goto code_r0x005f4530;
code_r0x005f4590:
              pppppppuVar10 = pppppppuStack_598;
              uVar5 = _atoi(pppppppuStack_598);
              uRam0000000000a3c138 = CONCAT44(uVar5,(undefined4)uRam0000000000a3c138);
              __ZdlPv(pppppppuVar10);
            }
            else {
              uVar14 = (uVar17 & 0xfffffffffffffff8) + 8;
              if ((uVar17 | 7) != 0x17) {
                uVar14 = uVar17 | 7;
              }
              pppppppuVar10 = (ulong *******)__Znwm(uVar14 + 1);
              uStack_588 = uVar14 + 1 | 0x8000000000000000;
              pppppppuStack_598 = pppppppuVar10;
              uStack_590 = uVar17;
code_r0x005f4574:
              _memmove(pppppppuVar10,(byte *)((long)pppppppbVar9 + uVar8),uVar17);
              *(undefined1 *)((long)pppppppuVar10 + uVar17) = 0;
              if ((long)uStack_588 < 0) goto code_r0x005f4590;
code_r0x005f4530:
              uVar5 = _atoi(&pppppppuStack_598);
              uRam0000000000a3c138 = CONCAT44(uVar5,(undefined4)uRam0000000000a3c138);
            }
            uVar14 = uStack_570 >> 0x38;
            uVar17 = uVar14;
          }
        }
        break;
      }
      pppppppbVar13 = (byte *******)((long)pppppppbVar13 + 1);
    } while (pppppppbVar13 != (byte *******)((long)pppppppbVar9 + uVar8));
  }
  uVar8 = uStack_578;
  uVar16 = (uint)uVar17;
  pppppppbVar9 = pppppppbStack_580;
  uVar18 = uStack_578;
  if (-1 < (char)uVar17) {
    pppppppbVar9 = (byte *******)&pppppppbStack_580;
    uVar18 = uVar14;
  }
  pbVar1 = (byte *)((long)pppppppbVar9 + uVar18);
  if (5 < (long)uVar18) {
    pppppppbVar13 = pppppppbVar9;
    uVar14 = uVar18;
    while (pbVar11 = (byte *)_memchr(pppppppbVar13,0x69,uVar14 - 5), pbVar11 != (byte *)0x0) {
      if (*(int *)pbVar11 == 0x6f685069 && *(short *)(pbVar11 + 4) == 0x656e) {
        if ((pbVar11 != pbVar1) && ((long)pbVar11 - (long)pppppppbVar9 != -1)) {
          uRam0000000000a3c138 = CONCAT44(uRam0000000000a3c138._4_4_,3);
          uVar2 = uRam0000000000a3c138._4_4_;
          goto joined_r0x005f4644;
        }
        break;
      }
      pppppppbVar13 = (byte *******)(pbVar11 + 1);
      uVar14 = (long)pbVar1 - (long)pppppppbVar13;
      if ((long)uVar14 < 6) break;
    }
  }
  if (3 < (long)uVar18) {
    pppppppbVar13 = pppppppbVar9;
    uVar14 = uVar18;
code_r0x005f4664:
    pbVar11 = (byte *)_memchr(pppppppbVar13,0x69,uVar14 - 3);
    pppppppbVar12 = pppppppbVar9;
    uVar15 = uVar18;
    if (pbVar11 != (byte *)0x0) {
      if (*(int *)pbVar11 != 0x646f5069) goto code_r0x005f4688;
      if ((pbVar11 != pbVar1) && ((long)pbVar11 - (long)pppppppbVar9 != -1)) {
        uRam0000000000a3c138 = CONCAT44(uRam0000000000a3c138._4_4_,4);
        uVar2 = uRam0000000000a3c138._4_4_;
joined_r0x005f4644:
        if (uVar2 < 6) goto code_r0x005f4a24;
        goto code_r0x005f4734;
      }
    }
    goto code_r0x005f46a0;
  }
  goto code_r0x005f479c;
code_r0x005f4688:
  pppppppbVar13 = (byte *******)(pbVar11 + 1);
  uVar14 = (long)pbVar1 - (long)pppppppbVar13;
  if ((long)uVar14 < 4) goto code_r0x005f46a0;
  goto code_r0x005f4664;
code_r0x005f46a0:
  pbVar11 = (byte *)_memchr(pppppppbVar12,0x69,uVar15 - 3);
  if (pbVar11 == (byte *)0x0) goto code_r0x005f473c;
  if (*(int *)pbVar11 == 0x64615069) {
    if ((pbVar11 != pbVar1) && ((long)pbVar11 - (long)pppppppbVar9 != -1)) {
      uRam0000000000a3c140 = 5;
      uRam0000000000a3c138 = CONCAT44(uRam0000000000a3c138._4_4_,5);
      if (uRam0000000000a3c138._4_4_ < 5) goto code_r0x005f4be4;
      goto code_r0x005f4734;
    }
    goto code_r0x005f473c;
  }
  uVar15 = (long)pbVar1 - (long)(pbVar11 + 1);
  pppppppbVar12 = (byte *******)(pbVar11 + 1);
  if ((long)uVar15 < 4) goto code_r0x005f473c;
  goto code_r0x005f46a0;
code_r0x005f4828:
  uRam0000000000a3c138 = CONCAT44(uRam0000000000a3c138._4_4_,1);
  uRam0000000000a3c140 = 1;
  goto code_r0x005f4be4;
code_r0x005f490c:
  uRam0000000000a3c138 = CONCAT44(uRam0000000000a3c138._4_4_,2);
  uRam0000000000a3c140 = 0;
  goto code_r0x005f4be4;
code_r0x005f49e8:
  pppppppbVar13 = (byte *******)(pbVar11 + 1);
  uVar14 = (long)pbVar1 - (long)pppppppbVar13;
  if ((long)uVar14 < 10) goto code_r0x005f4a34;
  goto code_r0x005f49c4;
code_r0x005f473c:
  if (7 < (long)uVar18) {
    pppppppbVar13 = pppppppbVar9;
    while (pbVar11 = (byte *)_memchr(pppppppbVar13,0x50,uVar18 - 7), pbVar11 != (byte *)0x0) {
      if (*(long *)pbVar11 == 0x63614d7265776f50) {
        if ((pbVar11 != pbVar1) && ((long)pbVar11 - (long)pppppppbVar9 != -1))
        goto code_r0x005f4828;
        break;
      }
      pppppppbVar13 = (byte *******)(pbVar11 + 1);
      uVar18 = (long)pbVar1 - (long)pppppppbVar13;
      if ((long)uVar18 < 8) break;
    }
  }
code_r0x005f479c:
  if (-1 < (char)uVar17) {
    uVar8 = uVar17 & 0xff;
  }
  pbVar1 = (byte *)((long)pppppppbVar9 + uVar8);
  if (0xe < (long)uVar8) {
    pppppppbVar13 = pppppppbVar9;
    uVar14 = uVar8;
    while (pbVar11 = (byte *)_memchr(pppppppbVar13,0x50,uVar14 - 0xe), pbVar11 != (byte *)0x0) {
      if (*(long *)pbVar11 == 0x614d207265776f50 && *(long *)(pbVar11 + 7) == 0x68736f746e696361) {
        if ((pbVar11 != pbVar1) && ((long)pbVar11 - (long)pppppppbVar9 != -1))
        goto code_r0x005f4828;
        break;
      }
      pppppppbVar13 = (byte *******)(pbVar11 + 1);
      uVar14 = (long)pbVar1 - (long)pppppppbVar13;
      if ((long)uVar14 < 0xf) break;
    }
  }
  if (2 < (long)uVar8) {
    pppppppbVar13 = pppppppbVar9;
    uVar14 = uVar8;
    while (pbVar11 = (byte *)_memchr(pppppppbVar13,0x4d,uVar14 - 2), pbVar11 != (byte *)0x0) {
      if (*(short *)pbVar11 == 0x614d && pbVar11[2] == 99) {
        if ((pbVar11 != pbVar1) && ((long)pbVar11 - (long)pppppppbVar9 != -1))
        goto code_r0x005f490c;
        break;
      }
      pppppppbVar13 = (byte *******)(pbVar11 + 1);
      uVar14 = (long)pbVar1 - (long)pppppppbVar13;
      if ((long)uVar14 < 3) break;
    }
    if (8 < (long)uVar8) {
      pppppppbVar13 = pppppppbVar9;
      uVar14 = uVar8;
      while (pbVar11 = (byte *)_memchr(pppppppbVar13,0x4d,uVar14 - 8), pbVar11 != (byte *)0x0) {
        if (*(long *)pbVar11 == 0x736f746e6963614d && pbVar11[8] == 0x68) {
          if ((pbVar11 != pbVar1) && ((long)pbVar11 - (long)pppppppbVar9 != -1))
          goto code_r0x005f490c;
          break;
        }
        pppppppbVar13 = (byte *******)(pbVar11 + 1);
        uVar14 = (long)pbVar1 - (long)pppppppbVar13;
        if ((long)uVar14 < 9) break;
      }
    }
    if (6 < (long)uVar8) {
      pppppppbVar13 = pppppppbVar9;
      uVar14 = uVar8;
      while (pbVar11 = (byte *)_memchr(pppppppbVar13,0x41,uVar14 - 6), pbVar11 != (byte *)0x0) {
        if (*(int *)pbVar11 == 0x6c707041 && *(int *)(pbVar11 + 3) == 0x5654656c) {
          if ((pbVar11 != pbVar1) && ((long)pbVar11 - (long)pppppppbVar9 != -1)) {
            uRam0000000000a3c140 = 6;
            uRam0000000000a3c138 = CONCAT44(uRam0000000000a3c138._4_4_,6);
            if (uRam0000000000a3c138._4_4_ < 4) goto code_r0x005f4a24;
            goto code_r0x005f4be4;
          }
          break;
        }
        pppppppbVar13 = (byte *******)(pbVar11 + 1);
        uVar14 = (long)pbVar1 - (long)pppppppbVar13;
        if ((long)uVar14 < 7) break;
      }
      if (9 < (long)uVar8) {
        pppppppbVar13 = pppppppbVar9;
        uVar14 = uVar8;
code_r0x005f49c4:
        pbVar11 = (byte *)_memchr(pppppppbVar13,0x41,uVar14 - 9);
        if (pbVar11 != (byte *)0x0) {
          if (*(long *)pbVar11 != 0x746157656c707041 || *(short *)(pbVar11 + 8) != 0x6863)
          goto code_r0x005f49e8;
          if ((pbVar11 != pbVar1) && ((long)pbVar11 - (long)pppppppbVar9 != -1)) {
            uRam0000000000a3c138 = CONCAT44(uRam0000000000a3c138._4_4_,7);
            if (uRam0000000000a3c138._4_4_ < 4) {
code_r0x005f4a24:
              uRam0000000000a3c140 = 5;
            }
            else {
code_r0x005f4734:
              uRam0000000000a3c140 = 6;
            }
            goto code_r0x005f4be4;
          }
        }
      }
    }
code_r0x005f4a34:
    if (4 < (long)uVar8) {
      pppppppbVar13 = pppppppbVar9;
      while (pbVar11 = (byte *)_memchr(pppppppbVar13,0x61,uVar8 - 4), pbVar11 != (byte *)0x0) {
        if (*(int *)pbVar11 == 0x366d7261 && pbVar11[4] == 0x34) {
          if ((pbVar11 != pbVar1) && ((long)pbVar11 - (long)pppppppbVar9 != -1)) {
            pppppppuStack_598 = (ulong *******)0x0;
            uStack_590 = 0;
            uStack_588 = 0;
            uStack_5a0 = 0x20;
            __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEmc
                      (&pppppppuStack_598,0x20,0);
            pppppppuVar10 = pppppppuStack_598;
            if (-1 < (long)uStack_588) {
              pppppppuVar10 = (ulong *******)&pppppppuStack_598;
            }
            iVar6 = _sysctlbyname("machdep.cpu.brand_string",pppppppuVar10,&uStack_5a0,0,0);
            if ((iVar6 == 0) && (uStack_5a0 != 0)) {
              pppppppuVar10 = pppppppuStack_598;
              if (-1 < (long)uStack_588) {
                pppppppuVar10 = (ulong *******)&pppppppuStack_598;
              }
              if (*(char *)((long)pppppppuVar10 + (uStack_5a0 - 1)) == '\0') {
                uStack_5a0 = uStack_5a0 - 1;
              }
              if ((long)uStack_588 < 0) {
                uVar8 = uStack_590;
                if (uStack_590 < uStack_5a0) goto code_r0x005f4b44;
                uStack_590 = uStack_5a0;
                pppppppuVar10 = pppppppuStack_598;
              }
              else {
                uVar8 = uStack_588 >> 0x38;
                if (uStack_588 >> 0x38 < uStack_5a0) {
code_r0x005f4b44:
                  __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEmc
                            (&pppppppuStack_598,uStack_5a0 - uVar8,0);
                  goto code_r0x005f4b60;
                }
                uStack_588 = CONCAT17((char)uStack_5a0,(undefined7)uStack_588) & 0x7fffffffffffffff;
                pppppppuVar10 = (ulong *******)&pppppppuStack_598;
              }
              *(undefined1 *)((long)pppppppuVar10 + uStack_5a0) = 0;
            }
code_r0x005f4b60:
            uVar8 = uStack_590;
            if (-1 < (long)uStack_588) {
              uVar8 = uStack_588 >> 0x38;
            }
            uRam0000000000a3c140 = 6;
            if (uVar8 == 8) {
              pppppppuVar10 = pppppppuStack_598;
              if (-1 < (long)uStack_588) {
                pppppppuVar10 = (ulong *******)&pppppppuStack_598;
              }
              uVar8 = ((ulong)*pppppppuVar10 & 0xff00ff00ff00ff00) >> 8 |
                      ((ulong)*pppppppuVar10 & 0xff00ff00ff00ff) << 8;
              uVar8 = (uVar8 & 0xffff0000ffff0000) >> 0x10 | (uVar8 & 0xffff0000ffff) << 0x10;
              uVar8 = uVar8 >> 0x20 | uVar8 << 0x20;
              bVar4 = 0x4170706c65204d31 < uVar8 == uVar8 < 0x4170706c65204d31;
              iVar6 = (uint)bVar4 << 1;
              uRam0000000000a3c140 = 6;
              if (bVar4) {
                uRam0000000000a3c140 = 7;
              }
            }
            else {
              iVar6 = 0;
            }
            uRam0000000000a3c138 = CONCAT44(uRam0000000000a3c138._4_4_,iVar6);
            if ((long)uStack_588 < 0) {
              __ZdlPv(pppppppuStack_598);
            }
            uVar16 = (uint)uStack_570._7_1_;
          }
          break;
        }
        pppppppbVar13 = (byte *******)(pbVar11 + 1);
        uVar8 = (long)pbVar1 - (long)pppppppbVar13;
        if ((long)uVar8 < 5) break;
      }
    }
  }
code_r0x005f4be4:
  if ((uVar16 >> 7 & 1) != 0) {
    __ZdlPv(pppppppbStack_580);
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_68) {
    return;
  }
  ___stack_chk_fail();
code_r0x005f4c38:
  func_0x00049dd0(&pppppppuStack_598);
code_r0x005f4c4c:
                    /* WARNING: Does not return */
  pcVar3 = (code *)SoftwareBreakpoint(1,0x5f4c50);
  (*pcVar3)();
}

