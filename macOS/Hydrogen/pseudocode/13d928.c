
void FUN_0013d928(void)

{
  uint uVar1;
  int iVar2;
  char in_NG;
  bool in_ZR;
  char in_OV;
  byte bVar3;
  undefined8 uVar4;
  long lVar5;
  undefined8 *puVar6;
  long *plVar7;
  ulong uVar8;
  ulong uVar9;
  long lVar10;
  int iVar11;
  int iVar12;
  int iVar13;
  ulong uVar14;
  long unaff_x19;
  undefined8 *unaff_x20;
  uint uVar15;
  long *plVar16;
  long lVar17;
  long unaff_x24;
  long unaff_x25;
  uint uVar18;
  long unaff_x27;
  int iVar19;
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000010;
  long in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000030;
  undefined8 uStack0000000000000048;
  undefined8 in_stack_00000050;
  undefined7 uStack0000000000000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000098;
  
  if (in_ZR || in_NG != in_OV) {
    uVar4 = func_0x00137dcc();
    uVar15 = (uint)uVar4;
    iVar19 = (int)((ulong)uVar4 >> 0x20);
    if ((*(uint *)(unaff_x19 + 0x30) != uVar15) || (*(int *)(unaff_x19 + 0x34) != iVar19)) {
      *(undefined8 *)(unaff_x19 + 0x30) = uVar4;
      *(undefined1 *)(unaff_x19 + 0x68) = 1;
      func_0x001420d0();
      unaff_x25 = *(long *)(unaff_x19 + 8);
      unaff_x27 = *(long *)(unaff_x19 + 0x10);
    }
    plVar16 = (long *)(unaff_x25 + (long)(int)uVar15 * 0x18);
    uVar9 = (unaff_x27 - unaff_x25 >> 3) * -0x5555555555555555;
    if ((ulong)(long)(int)uVar15 < uVar9) {
      lVar10 = *(long *)(unaff_x25 + (long)(int)uVar15 * 0x18 + 8);
      lVar5 = *plVar16;
      lVar17 = lVar10 - lVar5;
      uVar8 = (lVar17 >> 2) * -0x5555555555555555;
      if (lVar17 == 0) {
        if (iVar19 != 0) goto code_r0x0013da44;
      }
      else {
        uVar14 = 0;
        iVar11 = 0;
        do {
          bVar3 = *(byte *)(lVar5 + uVar14 * 0xc);
          if (bVar3 == 9) {
            iVar13 = *(int *)(unaff_x19 + 0x54);
            iVar12 = 0;
            if (iVar13 != 0) {
              iVar12 = iVar11 / iVar13;
            }
            iVar11 = iVar13 + iVar12 * iVar13;
            bVar3 = 0;
code_r0x0013d8cc:
            iVar13 = 1;
            if ((bVar3 & 0xe0) == 0xc0) {
              iVar13 = 2;
            }
          }
          else {
            iVar11 = iVar11 + 1;
            if ((bVar3 & 0xfe) == 0xfc) {
              iVar13 = 6;
            }
            else if ((bVar3 & 0xfc) == 0xf8) {
              iVar13 = 5;
            }
            else if ((bVar3 & 0xf8) == 0xf0) {
              iVar13 = 4;
            }
            else {
              if ((bVar3 & 0xf0) != 0xe0) goto code_r0x0013d8cc;
              iVar13 = 3;
            }
          }
          uVar14 = (ulong)(uint)(iVar13 + (int)uVar14);
        } while (uVar14 < uVar8);
        if (iVar11 != iVar19) {
code_r0x0013da44:
          uVar18 = 0;
          if ((0 < iVar19) && (lVar10 != lVar5)) {
            iVar11 = 0;
            uVar9 = 0;
            do {
              bVar3 = *(byte *)(lVar5 + uVar9 * 0xc);
              iVar13 = (int)uVar9;
              if (bVar3 == 9) {
                iVar12 = *(int *)(unaff_x19 + 0x54);
                iVar2 = 0;
                if (iVar12 != 0) {
                  iVar2 = iVar11 / iVar12;
                }
                iVar11 = iVar12 + iVar2 * iVar12;
                bVar3 = 0;
code_r0x0013da98:
                iVar12 = 1;
                if ((bVar3 & 0xe0) == 0xc0) {
                  iVar12 = 2;
                }
                uVar18 = iVar12 + iVar13;
              }
              else {
                iVar11 = iVar11 + 1;
                if ((bVar3 & 0xfe) == 0xfc) {
                  uVar18 = iVar13 + 6;
                }
                else if ((bVar3 & 0xfc) == 0xf8) {
                  uVar18 = iVar13 + 5;
                }
                else if ((bVar3 & 0xf8) == 0xf0) {
                  uVar18 = iVar13 + 4;
                }
                else {
                  if ((bVar3 & 0xf0) != 0xe0) goto code_r0x0013da98;
                  uVar18 = iVar13 + 3;
                }
              }
              uVar9 = (ulong)uVar18;
            } while ((iVar11 < iVar19) && (uVar9 < uVar8));
          }
          goto LAB_0013d980;
        }
      }
code_r0x0013da04:
      if ((int)uVar9 - 1U == uVar15) goto code_r0x0013de68;
      if (_uStack0000000000000058 < 0) {
        in_stack_00000050 = 1;
        puVar6 = uStack0000000000000048;
      }
      else {
        _uStack0000000000000058 = CONCAT17(1,uStack0000000000000058);
        puVar6 = &uStack0000000000000048;
      }
      *(undefined2 *)puVar6 = 10;
      in_stack_00000060 = func_0x00137dcc();
      in_stack_00000068 = in_stack_00000060;
      func_0x00138148();
      uVar9 = (long)(int)uVar15 + 1;
      plVar7 = (long *)(*(long *)(unaff_x19 + 8) + uVar9 * 0x18);
      lVar17 = *plVar7;
      lVar5 = plVar7[1];
      func_0x00149130(plVar16,*(undefined8 *)(unaff_x25 + (long)(int)uVar15 * 0x18 + 8),lVar17,lVar5
                      ,(lVar5 - lVar17 >> 2) * -0x5555555555555555);
      func_0x0013aef4();
    }
    else {
      if (iVar19 == 0) goto code_r0x0013da04;
      uVar18 = 0xffffffff;
LAB_0013d980:
      in_stack_00000060 = func_0x00137dcc();
      in_stack_00000068 =
           CONCAT44((int)((ulong)in_stack_00000060 >> 0x20) + 1,(int)in_stack_00000060);
      func_0x001377f0(&uStack0000000000000008);
      if (_uStack0000000000000058 < 0) {
        __ZdlPv(uStack0000000000000048);
      }
      in_stack_00000050 = in_stack_00000010;
      uStack0000000000000048 = uStack0000000000000008;
      _uStack0000000000000058 = in_stack_00000018;
      bVar3 = *(byte *)(*plVar16 + (long)(int)uVar18 * 0xc);
      if ((bVar3 & 0xfe) == 0xfc) {
        bVar3 = 5;
      }
      else if ((bVar3 & 0xfc) == 0xf8) {
        bVar3 = 4;
      }
      else if ((bVar3 & 0xf8) == 0xf0) {
        bVar3 = 3;
      }
      else if ((bVar3 & 0xf0) == 0xe0) {
        bVar3 = 2;
      }
      else {
        bVar3 = (bVar3 & 0xe0) == 0xc0;
      }
      plVar7 = (long *)(unaff_x25 + (long)(int)uVar15 * 0x18 + 8);
      if ((int)uVar18 < (int)((ulong)(*plVar7 - *plVar16) >> 2) * -0x55555555) {
        lVar17 = *plVar16 + (long)(int)uVar18 * 0xc;
        lVar5 = *plVar7 - (lVar17 + 0xc);
        if (lVar5 != 0) {
          _memmove(lVar17,lVar17 + 0xc,lVar5 + -3);
        }
        lVar17 = lVar17 + lVar5;
        *plVar7 = lVar17;
        if ((bVar3 != 0) && ((int)uVar18 < (int)((ulong)(lVar17 - *plVar16) >> 2) * -0x55555555)) {
          lVar5 = *plVar16 + (long)(int)uVar18 * 0xc;
          lVar17 = lVar17 - (lVar5 + 0xc);
          if (lVar17 != 0) {
            _memmove(lVar5,lVar5 + 0xc,lVar17 + -3);
          }
          lVar5 = lVar5 + lVar17;
          *plVar7 = lVar5;
          if ((1 < bVar3) && ((int)uVar18 < (int)((ulong)(lVar5 - *plVar16) >> 2) * -0x55555555)) {
            lVar17 = *plVar16 + (long)(int)uVar18 * 0xc;
            lVar5 = lVar5 - (lVar17 + 0xc);
            if (lVar5 != 0) {
              _memmove(lVar17,lVar17 + 0xc,lVar5 + -3);
            }
            lVar17 = lVar17 + lVar5;
            *plVar7 = lVar17;
            if ((2 < bVar3) && ((int)uVar18 < (int)((ulong)(lVar17 - *plVar16) >> 2) * -0x55555555))
            {
              lVar5 = *plVar16 + (long)(int)uVar18 * 0xc;
              lVar17 = lVar17 - (lVar5 + 0xc);
              if (lVar17 != 0) {
                _memmove(lVar5,lVar5 + 0xc,lVar17 + -3);
              }
              lVar5 = lVar5 + lVar17;
              *plVar7 = lVar5;
              if ((3 < bVar3) && ((int)uVar18 < (int)((ulong)(lVar5 - *plVar16) >> 2) * -0x55555555)
                 ) {
                lVar17 = *plVar16 + (long)(int)uVar18 * 0xc;
                lVar5 = lVar5 - (lVar17 + 0xc);
                if (lVar5 != 0) {
                  _memmove(lVar17,lVar17 + 0xc,lVar5 + -3);
                }
                lVar17 = lVar17 + lVar5;
                *plVar7 = lVar17;
                if ((4 < bVar3) &&
                   ((int)uVar18 < (int)((ulong)(lVar17 - *plVar16) >> 2) * -0x55555555)) {
                  lVar5 = *plVar16 + (long)(int)uVar18 * 0xc;
                  lVar17 = lVar17 - (lVar5 + 0xc);
                  if (lVar17 != 0) {
                    _memmove(lVar5,lVar5 + 0xc,lVar17 + -3);
                  }
                  *plVar7 = lVar5 + lVar17;
                }
              }
            }
          }
        }
      }
      uVar9 = (ulong)(uVar15 + 1);
    }
    *(undefined1 *)(unaff_x19 + 0x5d) = 1;
    uVar1 = (int)((ulong)(*(long *)(unaff_x19 + 0x10) - *(long *)(unaff_x19 + 8)) >> 3) *
            -0x55555555;
    uVar18 = (uint)uVar9;
    if ((int)uVar1 <= (int)(uint)uVar9) {
      uVar18 = uVar1;
    }
    uVar1 = *(uint *)(unaff_x19 + 0x6c);
    if ((int)uVar15 <= (int)*(uint *)(unaff_x19 + 0x6c)) {
      uVar1 = uVar15;
    }
    uVar15 = *(uint *)(unaff_x19 + 0x70);
    if ((int)*(uint *)(unaff_x19 + 0x70) <= (int)uVar18) {
      uVar15 = uVar18;
    }
    uVar1 = uVar1 & ((int)uVar1 >> 0x1f ^ 0xffffffffU);
    uVar18 = uVar1;
    if ((int)uVar1 <= (int)uVar15) {
      uVar18 = uVar15;
    }
    *(uint *)(unaff_x19 + 0x6c) = uVar1;
    *(uint *)(unaff_x19 + 0x70) = uVar18;
    *(undefined1 *)(unaff_x19 + 0x248) = 1;
  }
  else {
    func_0x001377f0(&uStack0000000000000008);
    if (_uStack0000000000000058 < 0) {
      __ZdlPv(uStack0000000000000048);
    }
    in_stack_00000050 = in_stack_00000010;
    uStack0000000000000048 = uStack0000000000000008;
    _uStack0000000000000058 = in_stack_00000018;
    in_stack_00000068 = *(undefined8 *)(unaff_x19 + 0x28);
    in_stack_00000060 = *(undefined8 *)(unaff_x19 + 0x20);
    func_0x00143318();
  }
  uVar4 = *unaff_x20;
  *(undefined8 *)(unaff_x24 + 0x70) = unaff_x20[1];
  *(undefined8 *)(unaff_x24 + 0x68) = uVar4;
  in_stack_00000098 = unaff_x20[2];
  func_0x00139988();
code_r0x0013de68:
  if (_uStack0000000000000058 < 0) {
    __ZdlPv(uStack0000000000000048);
  }
  if (in_stack_00000030._7_1_ < '\0') {
    __ZdlPv(in_stack_00000020);
  }
  return;
}

