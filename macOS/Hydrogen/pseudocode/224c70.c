
ulong thunk_FUN_00224cc4(undefined8 param_1,undefined8 param_2,long *param_3)

{
  bool bVar1;
  undefined1 uVar2;
  ushort uVar3;
  undefined2 uVar4;
  undefined2 uVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  uint uVar9;
  ulong uVar10;
  long *plVar11;
  undefined8 uVar12;
  long lVar13;
  long lVar14;
  ulong unaff_x19;
  long *unaff_x20;
  long lVar15;
  ulong uVar16;
  undefined1 auVar17 [16];
  undefined1 uStack0000000000000008;
  long lStack_88;
  undefined8 uStack_80;
  ulong uStack_78;
  
  lVar6 = *unaff_x20;
  *unaff_x20 = lVar6 + -1;
  LORelease();
  if (lVar6 == 1) {
    DataMemoryBarrier(2,1);
    func_0x001fa0f4(&uStack0000000000000008);
  }
  if ((unaff_x19 & 1) != 0) {
    func_0x0016b144();
  }
  __Unwind_Resume();
  auVar17 = func_0x007a2668();
  lVar6 = *auVar17._8_8_;
  do {
    lVar15 = *(long *)(lVar6 + 8);
    while (lVar15 != -1) {
      if (lVar15 < 0) goto LAB_00224e50;
      lVar7 = lVar15 + 1;
      lVar13 = *(long *)(lVar6 + 8);
      bVar1 = lVar13 == lVar15;
      lVar15 = lVar13;
      if (bVar1) {
        *(long *)(lVar6 + 8) = lVar7;
        lVar15 = *(long *)(auVar17._0_8_ + 0x28);
        if (lVar6 != -1) {
          lVar13 = auVar17._8_8_[1];
          lVar7 = *(long *)(lVar6 + 8);
          *(long *)(lVar6 + 8) = lVar7 + -1;
          LORelease();
          if (lVar7 == 1) {
            DataMemoryBarrier(2,1);
            uVar16 = *(ulong *)(lVar13 + 0x10);
            if (uVar16 < 9) {
              uVar16 = 8;
            }
            uVar10 = *(long *)(lVar13 + 8) + uVar16 + 0xf & -uVar16;
            if (uVar10 != 0) {
              func_0x00187bd4(lVar6,uVar10,uVar16);
            }
          }
        }
        lVar7 = *param_3;
        do {
          lVar13 = *(long *)(lVar7 + 8);
          while (lVar13 != -1) {
            if (lVar13 < 0) {
LAB_00224e50:
              auVar17 = func_0x0079b7bc(&UNK_009c5940,&UNK_009c5950);
              plVar11 = auVar17._8_8_;
              lVar6 = auVar17._0_8_;
              lVar15 = plVar11[2];
              if (*(long *)(lVar6 + 0x60) == -0x7fffffffffffffff) {
                if (lVar15 == *plVar11) {
                  func_0x00458a18(plVar11,&UNK_009c9a90);
                }
                *(undefined1 *)(plVar11[1] + lVar15) = 0;
                plVar11[2] = lVar15 + 1;
              }
              else {
                if (lVar15 == *plVar11) {
                  func_0x00458a18(plVar11,&UNK_009c9a90);
                }
                *(undefined1 *)(plVar11[1] + lVar15) = 1;
                plVar11[2] = lVar15 + 1;
                func_0x0045d400(&lStack_88,*(undefined8 *)(lVar6 + 0x68),
                                *(undefined8 *)(lVar6 + 0x70),&UNK_009c7090);
                lVar15 = plVar11[2];
                if (lVar15 == *plVar11) {
                  func_0x00458a18(plVar11,&UNK_009c9a90);
                }
                *(char *)(plVar11[1] + lVar15) = (char)uStack_78;
                lVar15 = lVar15 + 1;
                plVar11[2] = lVar15;
                if ((ulong)(*plVar11 - lVar15) < uStack_78) {
                  func_0x0079b61c(plVar11,lVar15,uStack_78,1,1);
                  lVar15 = plVar11[2];
                }
                _memcpy(plVar11[1] + lVar15,uStack_80,uStack_78);
                plVar11[2] = lVar15 + uStack_78;
                if (lStack_88 != 0) {
                  func_0x00187bd4(uStack_80,lStack_88,1);
                }
              }
              uVar3 = *(ushort *)(lVar6 + 0x80);
              if (uVar3 < 5) {
                if (uVar3 < 2) {
                  if (uVar3 == 0) {
                    uVar9 = 2;
                  }
                  else {
                    uVar9 = 0x300;
                  }
                }
                else if (uVar3 == 2) {
                  uVar9 = 0x301;
                }
                else if (uVar3 == 3) {
                  uVar9 = 0x302;
                }
                else {
                  uVar9 = 0x303;
                }
              }
              else if (uVar3 < 7) {
                if (uVar3 == 5) {
                  uVar9 = 0x304;
                }
                else {
                  uVar9 = 0xfeff;
                }
              }
              else if (uVar3 == 7) {
                uVar9 = 0xfefd;
              }
              else if (uVar3 == 8) {
                uVar9 = 0xfefc;
              }
              else {
                uVar9 = (uint)*(ushort *)(lVar6 + 0x82);
              }
              lVar15 = plVar11[2];
              if ((ulong)(*plVar11 - lVar15) < 2) {
                func_0x0079b61c(plVar11,lVar15,2,1,1);
                lVar15 = plVar11[2];
              }
              *(ushort *)(plVar11[1] + lVar15) =
                   (ushort)(uVar9 >> 8) | (ushort)((uVar9 & 0xff00ff) << 8);
              lVar15 = lVar15 + 2;
              plVar11[2] = lVar15;
              uVar4 = *(undefined2 *)(lVar6 + 0x84);
              uVar5 = *(undefined2 *)(lVar6 + 0x86);
              if ((ulong)(*plVar11 - lVar15) < 2) {
                func_0x0079b61c(plVar11,lVar15,2,1,1);
                lVar15 = plVar11[2];
              }
              uVar9 = func_0x001f5ae0(uVar4,uVar5);
              *(ushort *)(plVar11[1] + lVar15) =
                   (ushort)(uVar9 >> 8) & 0xff | (ushort)((uVar9 & 0xff00ff) << 8);
              lVar7 = lVar15 + 2;
              plVar11[2] = lVar7;
              uVar16 = *(ulong *)(lVar6 + 0x10);
              if (lVar7 == *plVar11) {
                func_0x00458a18(plVar11,&UNK_009c9a90);
              }
              *(char *)(plVar11[1] + lVar7) = (char)uVar16;
              lVar15 = lVar15 + 3;
              plVar11[2] = lVar15;
              uVar12 = *(undefined8 *)(lVar6 + 8);
              if ((ulong)(*plVar11 - lVar15) < uVar16) {
                func_0x0079b61c(plVar11,lVar15,uVar16,1,1);
                lVar15 = plVar11[2];
              }
              _memcpy(plVar11[1] + lVar15,uVar12,uVar16);
              lVar15 = lVar15 + uVar16;
              plVar11[2] = lVar15;
              uVar2 = *(undefined1 *)(lVar6 + 0x8c);
              if (lVar15 == *plVar11) {
                func_0x00458a18(plVar11,&UNK_009c9a90);
              }
              *(undefined1 *)(plVar11[1] + lVar15) = uVar2;
              lVar7 = lVar15 + 1;
              plVar11[2] = lVar7;
              if (*(long *)(lVar6 + 0x30) == -0x8000000000000000) {
                if (lVar7 == *plVar11) {
                  func_0x00458a18(plVar11,&UNK_009c9a90);
                }
                *(undefined1 *)(plVar11[1] + lVar7) = 0;
                lVar15 = lVar15 + 2;
                plVar11[2] = lVar15;
                lVar13 = *(long *)(lVar6 + 0x48);
                lVar7 = *plVar11;
              }
              else {
                if (lVar7 == *plVar11) {
                  func_0x00458a18(plVar11,&UNK_009c9a90);
                }
                *(undefined1 *)(plVar11[1] + lVar7) = 1;
                plVar11[2] = lVar15 + 2;
                func_0x001a5e70((long *)(lVar6 + 0x30),plVar11);
                lVar13 = *(long *)(lVar6 + 0x48);
                lVar15 = plVar11[2];
                lVar7 = *plVar11;
              }
              if (lVar13 == -0x8000000000000000) {
                if (lVar15 == lVar7) {
                  func_0x00458a18(plVar11,&UNK_009c9a90);
                }
                *(undefined1 *)(plVar11[1] + lVar15) = 0;
                lVar15 = lVar15 + 1;
              }
              else {
                if (lVar15 == lVar7) {
                  func_0x00458a18(plVar11,&UNK_009c9a90);
                }
                *(undefined1 *)(plVar11[1] + lVar15) = 1;
                lVar7 = lVar15 + 1;
                plVar11[2] = lVar7;
                uVar16 = *(ulong *)(lVar6 + 0x58);
                if (lVar7 == *plVar11) {
                  func_0x00458a18(plVar11,&UNK_009c9a90);
                }
                *(char *)(plVar11[1] + lVar7) = (char)uVar16;
                lVar15 = lVar15 + 2;
                plVar11[2] = lVar15;
                uVar12 = *(undefined8 *)(lVar6 + 0x50);
                if ((ulong)(*plVar11 - lVar15) < uVar16) {
                  func_0x0079b61c(plVar11,lVar15,uVar16,1,1);
                  lVar15 = plVar11[2];
                }
                _memcpy(plVar11[1] + lVar15,uVar12,uVar16);
                lVar15 = lVar15 + uVar16;
              }
              plVar11[2] = lVar15;
              uVar12 = *(undefined8 *)(lVar6 + 0x20);
              uVar16 = *(ulong *)(lVar6 + 0x28);
              if ((ulong)(*plVar11 - lVar15) < 2) {
                func_0x0079b61c(plVar11,lVar15,2,1,1);
                lVar15 = plVar11[2];
              }
              *(ushort *)(plVar11[1] + lVar15) =
                   (ushort)(uVar16 >> 8) & 0xff | (ushort)(((uint)uVar16 & 0xff00ff) << 8);
              lVar15 = lVar15 + 2;
              plVar11[2] = lVar15;
              if ((ulong)(*plVar11 - lVar15) < uVar16) {
                func_0x0079b61c(plVar11,lVar15,uVar16,1,1);
                lVar15 = plVar11[2];
              }
              uVar10 = _memcpy(plVar11[1] + lVar15,uVar12,uVar16);
              lVar15 = lVar15 + uVar16;
              plVar11[2] = lVar15;
              uVar16 = *(ulong *)(lVar6 + 0x78);
              if ((ulong)(*plVar11 - lVar15) < 8) {
                uVar10 = func_0x0079b61c(plVar11,lVar15,8,1,1);
                lVar15 = plVar11[2];
              }
              uVar16 = (uVar16 & 0xff00ff00ff00ff00) >> 8 | (uVar16 & 0xff00ff00ff00ff) << 8;
              uVar16 = (uVar16 & 0xffff0000ffff0000) >> 0x10 | (uVar16 & 0xffff0000ffff) << 0x10;
              *(ulong *)(plVar11[1] + lVar15) = uVar16 >> 0x20 | uVar16 << 0x20;
              lVar15 = lVar15 + 8;
              plVar11[2] = lVar15;
              uVar9 = *(uint *)(lVar6 + 0x88);
              if ((ulong)(*plVar11 - lVar15) < 4) {
                uVar10 = func_0x0079b61c(plVar11,lVar15,4,1,1);
                lVar15 = plVar11[2];
              }
              uVar9 = (uVar9 & 0xff00ff00) >> 8 | (uVar9 & 0xff00ff) << 8;
              *(uint *)(plVar11[1] + lVar15) = uVar9 >> 0x10 | uVar9 << 0x10;
              plVar11[2] = lVar15 + 4;
              return uVar10;
            }
            lVar8 = lVar13 + 1;
            lVar14 = *(long *)(lVar7 + 8);
            bVar1 = lVar14 == lVar13;
            lVar13 = lVar14;
            if (bVar1) {
              *(long *)(lVar7 + 8) = lVar8;
              lVar13 = *(long *)(auVar17._0_8_ + 0x38);
              if (lVar7 != -1) {
                lVar14 = param_3[1];
                lVar8 = *(long *)(lVar7 + 8);
                *(long *)(lVar7 + 8) = lVar8 + -1;
                LORelease();
                if (lVar8 == 1) {
                  DataMemoryBarrier(2,1);
                  uVar16 = *(ulong *)(lVar14 + 0x10);
                  if (uVar16 < 9) {
                    uVar16 = 8;
                  }
                  uVar16 = *(long *)(lVar14 + 8) + uVar16 + 0xf & -uVar16;
                  if (uVar16 != 0) {
                    func_0x00187bd4(lVar7,uVar16);
                  }
                }
              }
              return (ulong)(lVar6 == lVar15 && lVar7 == lVar13);
            }
          }
          InstructionSynchronizationBarrier();
        } while( true );
      }
    }
    InstructionSynchronizationBarrier();
  } while( true );
}

