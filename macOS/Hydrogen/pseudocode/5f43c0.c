
void FUN_005f43c0(void)

{
  byte *pbVar1;
  uint uVar2;
  code *pcVar3;
  bool bVar4;
  undefined4 uVar5;
  int iVar6;
  ulong uVar7;
  byte *******pppppppbVar8;
  ulong *******pppppppuVar9;
  byte *pbVar10;
  byte *******pppppppbVar11;
  byte *******pppppppbVar12;
  ulong uVar13;
  ulong uVar14;
  uint uVar15;
  ulong uVar16;
  ulong uVar17;
  ulong uStack_540;
  ulong *******pppppppuStack_538;
  ulong uStack_530;
  undefined8 uStack_528;
  byte *******pppppppbStack_520;
  ulong uStack_518;
  undefined8 uStack_510;
  undefined1 auStack_508 [1024];
  undefined1 auStack_108 [256];
  long lStack_8;
  
  lStack_8 = *(long *)PTR____stack_chk_guard_009b01e8;
  uRam0000000000a3c138 = 0;
  uRam0000000000a3c140 = 0;
  auStack_108[0] = 0;
  _uname(auStack_508);
  uVar7 = _strlen(auStack_108);
  if (0x7ffffffffffffff7 < uVar7) {
    func_0x0001748c(&pppppppbStack_520);
    goto code_r0x005f4c4c;
  }
  if (uVar7 < 0x17) {
    uStack_510 = CONCAT17((char)uVar7,(undefined7)uStack_510);
    pppppppbVar8 = (byte *******)&pppppppbStack_520;
    if (uVar7 != 0) goto LAB_005f4470;
  }
  else {
    uVar13 = (uVar7 & 0xfffffffffffffff8) + 8;
    if ((uVar7 | 7) != 0x17) {
      uVar13 = uVar7 | 7;
    }
    pppppppbVar8 = (byte *******)__Znwm(uVar13 + 1);
    uStack_510 = uVar13 + 1 | 0x8000000000000000;
    pppppppbStack_520 = pppppppbVar8;
    uStack_518 = uVar7;
LAB_005f4470:
    _memcpy(pppppppbVar8,auStack_108,uVar7);
  }
  *(byte *)((long)pppppppbVar8 + uVar7) = 0;
  uVar13 = (ulong)uStack_510._7_1_;
  uVar15 = (uint)(char)uStack_510._7_1_;
  uVar16 = (ulong)uVar15;
  uVar7 = uStack_518;
  pppppppbVar8 = pppppppbStack_520;
  if (-1 < (int)uVar15) {
    uVar7 = uVar13;
    pppppppbVar8 = (byte *******)&pppppppbStack_520;
  }
  if (uVar7 != 0) {
    pppppppbVar12 = pppppppbVar8;
    do {
      if (*(byte *)pppppppbVar12 - 0x30 < 10) {
        if (pppppppbVar12 != (byte *******)((long)pppppppbVar8 + uVar7)) {
          uVar7 = (long)pppppppbVar12 - (long)pppppppbVar8;
          if (uVar7 != 0xffffffffffffffff) {
            if ((int)uVar15 < 0) {
              uVar13 = uStack_518;
              pppppppbVar8 = pppppppbStack_520;
              if (uStack_518 < uVar7) goto LAB_005f4c38;
            }
            else {
              if (uVar13 < uVar7) goto LAB_005f4c38;
              pppppppbVar8 = (byte *******)&pppppppbStack_520;
            }
            uVar16 = uVar13 - uVar7;
            if (0x7ffffffffffffff7 < uVar16) {
              func_0x0001748c(&pppppppuStack_538);
              goto code_r0x005f4c4c;
            }
            if (uVar16 < 0x17) {
              uStack_528 = CONCAT17((char)uVar16,(undefined7)uStack_528);
              pppppppuVar9 = (ulong *******)&pppppppuStack_538;
              if (uVar13 != uVar7) goto LAB_005f4574;
              *(undefined1 *)((long)pppppppuVar9 + uVar16) = 0;
              if (-1 < (long)uStack_528) goto LAB_005f4530;
LAB_005f4590:
              pppppppuVar9 = pppppppuStack_538;
              uVar5 = _atoi(pppppppuStack_538);
              uRam0000000000a3c138 = CONCAT44(uVar5,(undefined4)uRam0000000000a3c138);
              __ZdlPv(pppppppuVar9);
            }
            else {
              uVar13 = (uVar16 & 0xfffffffffffffff8) + 8;
              if ((uVar16 | 7) != 0x17) {
                uVar13 = uVar16 | 7;
              }
              pppppppuVar9 = (ulong *******)__Znwm(uVar13 + 1);
              uStack_528 = uVar13 + 1 | 0x8000000000000000;
              pppppppuStack_538 = pppppppuVar9;
              uStack_530 = uVar16;
LAB_005f4574:
              _memmove(pppppppuVar9,(byte *)((long)pppppppbVar8 + uVar7),uVar16);
              *(undefined1 *)((long)pppppppuVar9 + uVar16) = 0;
              if ((long)uStack_528 < 0) goto LAB_005f4590;
LAB_005f4530:
              uVar5 = _atoi(&pppppppuStack_538);
              uRam0000000000a3c138 = CONCAT44(uVar5,(undefined4)uRam0000000000a3c138);
            }
            uVar13 = uStack_510 >> 0x38;
            uVar16 = uVar13;
          }
        }
        break;
      }
      pppppppbVar12 = (byte *******)((long)pppppppbVar12 + 1);
    } while (pppppppbVar12 != (byte *******)((long)pppppppbVar8 + uVar7));
  }
  uVar7 = uStack_518;
  uVar15 = (uint)uVar16;
  pppppppbVar8 = pppppppbStack_520;
  uVar17 = uStack_518;
  if (-1 < (char)uVar16) {
    pppppppbVar8 = (byte *******)&pppppppbStack_520;
    uVar17 = uVar13;
  }
  pbVar1 = (byte *)((long)pppppppbVar8 + uVar17);
  if (5 < (long)uVar17) {
    pppppppbVar12 = pppppppbVar8;
    uVar13 = uVar17;
    while (pbVar10 = (byte *)_memchr(pppppppbVar12,0x69,uVar13 - 5), pbVar10 != (byte *)0x0) {
      if (*(int *)pbVar10 == 0x6f685069 && *(short *)(pbVar10 + 4) == 0x656e) {
        if ((pbVar10 != pbVar1) && ((long)pbVar10 - (long)pppppppbVar8 != -1)) {
          uRam0000000000a3c138 = CONCAT44(uRam0000000000a3c138._4_4_,3);
          uVar2 = uRam0000000000a3c138._4_4_;
          goto joined_r0x005f4644;
        }
        break;
      }
      pppppppbVar12 = (byte *******)(pbVar10 + 1);
      uVar13 = (long)pbVar1 - (long)pppppppbVar12;
      if ((long)uVar13 < 6) break;
    }
  }
  if (3 < (long)uVar17) {
    pppppppbVar12 = pppppppbVar8;
    uVar13 = uVar17;
LAB_005f4664:
    pbVar10 = (byte *)_memchr(pppppppbVar12,0x69,uVar13 - 3);
    pppppppbVar11 = pppppppbVar8;
    uVar14 = uVar17;
    if (pbVar10 != (byte *)0x0) {
      if (*(int *)pbVar10 != 0x646f5069) goto code_r0x005f4688;
      if ((pbVar10 != pbVar1) && ((long)pbVar10 - (long)pppppppbVar8 != -1)) {
        uRam0000000000a3c138 = CONCAT44(uRam0000000000a3c138._4_4_,4);
        uVar2 = uRam0000000000a3c138._4_4_;
joined_r0x005f4644:
        if (uVar2 < 6) goto LAB_005f4a24;
        goto LAB_005f4734;
      }
    }
    goto LAB_005f46a0;
  }
  goto LAB_005f479c;
code_r0x005f4688:
  pppppppbVar12 = (byte *******)(pbVar10 + 1);
  uVar13 = (long)pbVar1 - (long)pppppppbVar12;
  if ((long)uVar13 < 4) goto LAB_005f46a0;
  goto LAB_005f4664;
LAB_005f46a0:
  pbVar10 = (byte *)_memchr(pppppppbVar11,0x69,uVar14 - 3);
  if (pbVar10 == (byte *)0x0) goto LAB_005f473c;
  if (*(int *)pbVar10 == 0x64615069) {
    if ((pbVar10 != pbVar1) && ((long)pbVar10 - (long)pppppppbVar8 != -1)) {
      uRam0000000000a3c140 = 5;
      uRam0000000000a3c138 = CONCAT44(uRam0000000000a3c138._4_4_,5);
      if (uRam0000000000a3c138._4_4_ < 5) goto code_r0x005f4be4;
      goto LAB_005f4734;
    }
    goto LAB_005f473c;
  }
  uVar14 = (long)pbVar1 - (long)(pbVar10 + 1);
  pppppppbVar11 = (byte *******)(pbVar10 + 1);
  if ((long)uVar14 < 4) goto LAB_005f473c;
  goto LAB_005f46a0;
code_r0x005f4828:
  uRam0000000000a3c138 = CONCAT44(uRam0000000000a3c138._4_4_,1);
  uRam0000000000a3c140 = 1;
  goto code_r0x005f4be4;
code_r0x005f490c:
  uRam0000000000a3c138 = CONCAT44(uRam0000000000a3c138._4_4_,2);
  uRam0000000000a3c140 = 0;
  goto code_r0x005f4be4;
code_r0x005f49e8:
  pppppppbVar12 = (byte *******)(pbVar10 + 1);
  uVar13 = (long)pbVar1 - (long)pppppppbVar12;
  if ((long)uVar13 < 10) goto code_r0x005f4a34;
  goto code_r0x005f49c4;
LAB_005f473c:
  if (7 < (long)uVar17) {
    pppppppbVar12 = pppppppbVar8;
    while (pbVar10 = (byte *)_memchr(pppppppbVar12,0x50,uVar17 - 7), pbVar10 != (byte *)0x0) {
      if (*(long *)pbVar10 == 0x63614d7265776f50) {
        if ((pbVar10 != pbVar1) && ((long)pbVar10 - (long)pppppppbVar8 != -1))
        goto code_r0x005f4828;
        break;
      }
      pppppppbVar12 = (byte *******)(pbVar10 + 1);
      uVar17 = (long)pbVar1 - (long)pppppppbVar12;
      if ((long)uVar17 < 8) break;
    }
  }
LAB_005f479c:
  if (-1 < (char)uVar16) {
    uVar7 = uVar16 & 0xff;
  }
  pbVar1 = (byte *)((long)pppppppbVar8 + uVar7);
  if (0xe < (long)uVar7) {
    pppppppbVar12 = pppppppbVar8;
    uVar13 = uVar7;
    while (pbVar10 = (byte *)_memchr(pppppppbVar12,0x50,uVar13 - 0xe), pbVar10 != (byte *)0x0) {
      if (*(long *)pbVar10 == 0x614d207265776f50 && *(long *)(pbVar10 + 7) == 0x68736f746e696361) {
        if ((pbVar10 != pbVar1) && ((long)pbVar10 - (long)pppppppbVar8 != -1))
        goto code_r0x005f4828;
        break;
      }
      pppppppbVar12 = (byte *******)(pbVar10 + 1);
      uVar13 = (long)pbVar1 - (long)pppppppbVar12;
      if ((long)uVar13 < 0xf) break;
    }
  }
  if (2 < (long)uVar7) {
    pppppppbVar12 = pppppppbVar8;
    uVar13 = uVar7;
    while (pbVar10 = (byte *)_memchr(pppppppbVar12,0x4d,uVar13 - 2), pbVar10 != (byte *)0x0) {
      if (*(short *)pbVar10 == 0x614d && pbVar10[2] == 99) {
        if ((pbVar10 != pbVar1) && ((long)pbVar10 - (long)pppppppbVar8 != -1))
        goto code_r0x005f490c;
        break;
      }
      pppppppbVar12 = (byte *******)(pbVar10 + 1);
      uVar13 = (long)pbVar1 - (long)pppppppbVar12;
      if ((long)uVar13 < 3) break;
    }
    if (8 < (long)uVar7) {
      pppppppbVar12 = pppppppbVar8;
      uVar13 = uVar7;
      while (pbVar10 = (byte *)_memchr(pppppppbVar12,0x4d,uVar13 - 8), pbVar10 != (byte *)0x0) {
        if (*(long *)pbVar10 == 0x736f746e6963614d && pbVar10[8] == 0x68) {
          if ((pbVar10 != pbVar1) && ((long)pbVar10 - (long)pppppppbVar8 != -1))
          goto code_r0x005f490c;
          break;
        }
        pppppppbVar12 = (byte *******)(pbVar10 + 1);
        uVar13 = (long)pbVar1 - (long)pppppppbVar12;
        if ((long)uVar13 < 9) break;
      }
    }
    if (6 < (long)uVar7) {
      pppppppbVar12 = pppppppbVar8;
      uVar13 = uVar7;
      while (pbVar10 = (byte *)_memchr(pppppppbVar12,0x41,uVar13 - 6), pbVar10 != (byte *)0x0) {
        if (*(int *)pbVar10 == 0x6c707041 && *(int *)(pbVar10 + 3) == 0x5654656c) {
          if ((pbVar10 != pbVar1) && ((long)pbVar10 - (long)pppppppbVar8 != -1)) {
            uRam0000000000a3c140 = 6;
            uRam0000000000a3c138 = CONCAT44(uRam0000000000a3c138._4_4_,6);
            if (uRam0000000000a3c138._4_4_ < 4) goto LAB_005f4a24;
            goto code_r0x005f4be4;
          }
          break;
        }
        pppppppbVar12 = (byte *******)(pbVar10 + 1);
        uVar13 = (long)pbVar1 - (long)pppppppbVar12;
        if ((long)uVar13 < 7) break;
      }
      if (9 < (long)uVar7) {
        pppppppbVar12 = pppppppbVar8;
        uVar13 = uVar7;
code_r0x005f49c4:
        pbVar10 = (byte *)_memchr(pppppppbVar12,0x41,uVar13 - 9);
        if (pbVar10 != (byte *)0x0) {
          if (*(long *)pbVar10 != 0x746157656c707041 || *(short *)(pbVar10 + 8) != 0x6863)
          goto code_r0x005f49e8;
          if ((pbVar10 != pbVar1) && ((long)pbVar10 - (long)pppppppbVar8 != -1)) {
            uRam0000000000a3c138 = CONCAT44(uRam0000000000a3c138._4_4_,7);
            if (uRam0000000000a3c138._4_4_ < 4) {
LAB_005f4a24:
              uRam0000000000a3c140 = 5;
            }
            else {
LAB_005f4734:
              uRam0000000000a3c140 = 6;
            }
            goto code_r0x005f4be4;
          }
        }
      }
    }
code_r0x005f4a34:
    if (4 < (long)uVar7) {
      pppppppbVar12 = pppppppbVar8;
      while (pbVar10 = (byte *)_memchr(pppppppbVar12,0x61,uVar7 - 4), pbVar10 != (byte *)0x0) {
        if (*(int *)pbVar10 == 0x366d7261 && pbVar10[4] == 0x34) {
          if ((pbVar10 != pbVar1) && ((long)pbVar10 - (long)pppppppbVar8 != -1)) {
            pppppppuStack_538 = (ulong *******)0x0;
            uStack_530 = 0;
            uStack_528 = 0;
            uStack_540 = 0x20;
            __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEmc
                      (&pppppppuStack_538,0x20,0);
            pppppppuVar9 = pppppppuStack_538;
            if (-1 < (long)uStack_528) {
              pppppppuVar9 = (ulong *******)&pppppppuStack_538;
            }
            iVar6 = _sysctlbyname("machdep.cpu.brand_string",pppppppuVar9,&uStack_540,0,0);
            if ((iVar6 == 0) && (uStack_540 != 0)) {
              pppppppuVar9 = pppppppuStack_538;
              if (-1 < (long)uStack_528) {
                pppppppuVar9 = (ulong *******)&pppppppuStack_538;
              }
              if (*(char *)((long)pppppppuVar9 + (uStack_540 - 1)) == '\0') {
                uStack_540 = uStack_540 - 1;
              }
              if ((long)uStack_528 < 0) {
                uVar7 = uStack_530;
                if (uStack_530 < uStack_540) goto code_r0x005f4b44;
                uStack_530 = uStack_540;
                pppppppuVar9 = pppppppuStack_538;
              }
              else {
                uVar7 = uStack_528 >> 0x38;
                if (uStack_528 >> 0x38 < uStack_540) {
code_r0x005f4b44:
                  __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEmc
                            (&pppppppuStack_538,uStack_540 - uVar7,0);
                  goto code_r0x005f4b60;
                }
                uStack_528 = CONCAT17((char)uStack_540,(undefined7)uStack_528) & 0x7fffffffffffffff;
                pppppppuVar9 = (ulong *******)&pppppppuStack_538;
              }
              *(undefined1 *)((long)pppppppuVar9 + uStack_540) = 0;
            }
code_r0x005f4b60:
            uVar7 = uStack_530;
            if (-1 < (long)uStack_528) {
              uVar7 = uStack_528 >> 0x38;
            }
            uRam0000000000a3c140 = 6;
            if (uVar7 == 8) {
              pppppppuVar9 = pppppppuStack_538;
              if (-1 < (long)uStack_528) {
                pppppppuVar9 = (ulong *******)&pppppppuStack_538;
              }
              uVar7 = ((ulong)*pppppppuVar9 & 0xff00ff00ff00ff00) >> 8 |
                      ((ulong)*pppppppuVar9 & 0xff00ff00ff00ff) << 8;
              uVar7 = (uVar7 & 0xffff0000ffff0000) >> 0x10 | (uVar7 & 0xffff0000ffff) << 0x10;
              uVar7 = uVar7 >> 0x20 | uVar7 << 0x20;
              bVar4 = 0x4170706c65204d31 < uVar7 == uVar7 < 0x4170706c65204d31;
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
            if ((long)uStack_528 < 0) {
              __ZdlPv(pppppppuStack_538);
            }
            uVar15 = (uint)uStack_510._7_1_;
          }
          break;
        }
        pppppppbVar12 = (byte *******)(pbVar10 + 1);
        uVar7 = (long)pbVar1 - (long)pppppppbVar12;
        if ((long)uVar7 < 5) break;
      }
    }
  }
code_r0x005f4be4:
  if ((uVar15 >> 7 & 1) != 0) {
    __ZdlPv(pppppppbStack_520);
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_8) {
    return;
  }
  ___stack_chk_fail();
LAB_005f4c38:
  func_0x00049dd0(&pppppppuStack_538);
code_r0x005f4c4c:
                    /* WARNING: Does not return */
  pcVar3 = (code *)SoftwareBreakpoint(1,0x5f4c50);
  (*pcVar3)();
}

