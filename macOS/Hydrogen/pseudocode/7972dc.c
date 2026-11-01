
undefined8 FUN_007972dc(undefined8 param_1,undefined8 param_2,undefined8 param_3,long *param_4)

{
  bool bVar1;
  undefined *puVar2;
  undefined8 uVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  long *plVar7;
  long lVar8;
  ulong uVar9;
  long lVar10;
  int *piVar11;
  long unaff_x29;
  undefined1 auVar12 [16];
  long lStack_68;
  
  uVar3 = func_0x00740a18();
  if (((((((int)uVar3 == 0) && (uVar3 = func_0x00740a18(), (int)uVar3 == 0)) &&
        (uVar3 = func_0x00740a18(), (int)uVar3 == 0)) &&
       ((uVar3 = func_0x00740a18(), (int)uVar3 == 0 && (uVar3 = func_0x00740a18(), (int)uVar3 == 0))
       )) && ((uVar3 = func_0x00740a18(), (int)uVar3 == 0 &&
              ((uVar3 = func_0x00740a18(), (int)uVar3 == 0 &&
               (uVar3 = func_0x00740a18(), (int)uVar3 == 0)))))) &&
     (uVar3 = func_0x00740a18(), (int)uVar3 == 0)) {
    uVar3 = func_0x00740a18();
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x18)) {
    return uVar3;
  }
  auVar12 = ___stack_chk_fail();
  lVar6 = auVar12._8_8_;
  uVar3 = auVar12._0_8_;
  if (((*(long *)(lVar6 + 0xe0) != 0) &&
      (piVar11 = *(int **)(*(long *)(lVar6 + 0xe0) + 0x108), piVar11 != (int *)0x0)) ||
     ((*(long *)(lVar6 + 0xd0) != 0 &&
      (piVar11 = *(int **)(*(long *)(lVar6 + 0xd0) + 0xe8), piVar11 != (int *)0x0)))) {
    if (*piVar11 == 0xe1551) {
      lVar4 = func_0x00795598(uVar3,lVar6);
      if ((*(byte *)(lVar4 + 0x69) >> 3 & 1) == 0) goto LAB_007975a8;
      if (*piVar11 != 0xe1551) {
        if (param_4 == (long *)0x0) {
          return 0x2b;
        }
        lVar6 = func_0x00740a58(param_4 + 8);
        if (lVar6 != 0) {
          func_0x0075e5fc(param_4 + 8);
          return 0x2b;
        }
        if (*param_4 != 0) {
          (*pcRam0000000000a2b5f0)();
          *param_4 = 0;
        }
        param_4[1] = 0;
        if (param_4[6] != 0) {
          (*pcRam0000000000a2b5f0)();
          param_4[6] = 0;
        }
        param_4[7] = 0;
        *(undefined4 *)(param_4 + 3) = 0;
        param_4[2] = 0;
        (*pcRam0000000000a2b5f0)(param_4[4]);
        param_4[4] = 0;
        (*pcRam0000000000a2b5f0)(param_4);
        return 0x2b;
      }
      if ((*(long *)(lVar6 + 0xe0) != 0) && ((*(byte *)(*(long *)(lVar6 + 0xe0) + 4) >> 4 & 1) != 0)
         ) {
        func_0x00779cfc(lVar6,4,2);
      }
      lStack_68 = 0;
      uVar3 = func_0x007955b8(uVar3);
      lVar4 = _time(0);
      if (*(long *)(piVar11 + 4) == 0) {
        if (param_4 != (long *)0x0) {
code_r0x00797778:
          lVar4 = func_0x00740a58(param_4 + 8);
          if (lVar4 == 0) {
            if (*param_4 != 0) {
              (*pcRam0000000000a2b5f0)();
              *param_4 = 0;
            }
            param_4[1] = 0;
            if (param_4[6] != 0) {
              (*pcRam0000000000a2b5f0)();
              param_4[6] = 0;
            }
            param_4[7] = 0;
            *(undefined4 *)(param_4 + 3) = 0;
            param_4[2] = 0;
            (*pcRam0000000000a2b5f0)(param_4[4]);
            param_4[4] = 0;
            (*pcRam0000000000a2b5f0)(param_4);
          }
          else {
            func_0x0075e5fc(param_4 + 8);
          }
        }
      }
      else {
        lVar10 = param_4[2];
        if (lVar10 < 1) {
          lVar10 = lVar4 + piVar11[6];
          param_4[2] = lVar10;
        }
        puVar2 = &UNK_00093a80;
        if ((int)param_4[3] != 0x304) {
          puVar2 = &UNK_00015180;
        }
        if ((long)(puVar2 + lVar4) < lVar10) {
          param_4[2] = (long)(puVar2 + lVar4);
        }
        else if ((0 < lVar10) && (lVar10 < lVar4)) {
          if ((*(char *)(lVar6 + 0xa1d) < '\0') &&
             (((*(long *)(
                         "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                         + lVar6 + 0x18) == 0 ||
               (0 < *(int *)(*(long *)(
                                      "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                      + lVar6 + 0x18) + 8))) && (0 < iRam0000000000a2b590)))) {
            func_0x0073d22c(lVar6,"add, session already expired");
          }
          goto code_r0x00797778;
        }
        uVar3 = func_0x00798460(lVar6,piVar11,param_3,uVar3,&lStack_68);
        lVar10 = lStack_68;
        if (((int)uVar3 == 0) && (lStack_68 != 0)) {
          if ((int)param_4[3] == 0x304) {
            func_0x00798224(lStack_68,lVar4);
            lVar4 = lVar10 + 0x20;
            lVar5 = func_0x00740a58(lVar4);
            if (lVar5 != 0) {
              do {
                plVar7 = (long *)func_0x00156654(lVar5);
                lVar5 = func_0x006f4058(lVar5);
                if ((int)plVar7[3] != 0x304) {
                  lVar8 = func_0x00740a58(plVar7 + 8);
                  if (lVar8 == 0) {
                    if (*plVar7 != 0) {
                      (*pcRam0000000000a2b5f0)();
                      *plVar7 = 0;
                    }
                    plVar7[1] = 0;
                    if (plVar7[6] != 0) {
                      (*pcRam0000000000a2b5f0)();
                      plVar7[6] = 0;
                    }
                    plVar7[7] = 0;
                    *(undefined4 *)(plVar7 + 3) = 0;
                    plVar7[2] = 0;
                    (*pcRam0000000000a2b5f0)(plVar7[4]);
                    plVar7[4] = 0;
                    (*pcRam0000000000a2b5f0)(plVar7);
                  }
                  else {
                    func_0x0075e5fc(plVar7 + 8);
                  }
                }
              } while (lVar5 != 0);
            }
            func_0x0075e474(lVar4,param_4,param_4 + 8);
            uVar9 = func_0x006f4058(lVar4);
            if (*(ulong *)(lVar10 + 0x90) < uVar9) {
              do {
                func_0x00740a58(lVar4);
                func_0x0075e5fc();
                uVar9 = func_0x006f4058(lVar4);
              } while (*(ulong *)(lVar10 + 0x90) < uVar9);
            }
            goto code_r0x007979a4;
          }
          lVar4 = lStack_68 + 0x20;
          func_0x0075e680(lVar4,0);
          func_0x0075e474(lVar4,param_4,param_4 + 8);
        }
        else {
          if (((*(char *)(lVar6 + 0xa1d) < '\0') &&
              ((*(long *)(
                         "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                         + lVar6 + 0x18) == 0 ||
               (0 < *(int *)(*(long *)(
                                      "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                      + lVar6 + 0x18) + 8))))) && (0 < iRam0000000000a2b590)) {
            func_0x0073d22c(lVar6,"unable to add scache peer: %d");
          }
          lVar4 = func_0x00740a58(param_4 + 8);
          if (lVar4 == 0) {
            if (*param_4 != 0) {
              (*pcRam0000000000a2b5f0)();
              *param_4 = 0;
            }
            param_4[1] = 0;
            if (param_4[6] != 0) {
              (*pcRam0000000000a2b5f0)();
              param_4[6] = 0;
            }
            param_4[7] = 0;
            *(undefined4 *)(param_4 + 3) = 0;
            param_4[2] = 0;
            (*pcRam0000000000a2b5f0)(param_4[4]);
            param_4[4] = 0;
            (*pcRam0000000000a2b5f0)(param_4);
          }
          else {
            func_0x0075e5fc(param_4 + 8);
          }
code_r0x007979a4:
          if ((int)uVar3 != 0) {
            func_0x0073c9e4(lVar6,"[SCACHE] failed to add session for %s, error=%d");
            goto code_r0x00797a9c;
          }
          if (lVar6 == 0) goto code_r0x00797a98;
        }
        if (*(char *)(lVar6 + 0xa1d) < '\0') {
          if (*(long *)("/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                       + lVar6 + 0x18) == 0) {
            if (0 < iRam0000000000a2b590) goto code_r0x00797a20;
          }
          else {
            bVar1 = *(int *)(*(long *)(
                                      "/System/Library/Frameworks/CoreGraphics.framework/Versions/A/CoreGraphics"
                                      + lVar6 + 0x18) + 8) < 1;
            if ((!bVar1 && iRam0000000000a2b590 != 0) && (bVar1 || -1 < iRam0000000000a2b590)) {
code_r0x00797a20:
              if (lVar10 != 0) {
                func_0x006f4058(lVar10 + 0x20);
              }
              func_0x0073d22c(lVar6,
                              "added session for %s [proto=0x%x, valid_secs=%ld, alpn=%s, earlydata=%zu, quic_tp=%s], peer has %zu sessions now"
                             );
            }
          }
        }
      }
code_r0x00797a98:
      uVar3 = 0;
code_r0x00797a9c:
      if (*(long *)(lVar6 + 0xe0) == 0) {
        return uVar3;
      }
      if ((*(byte *)(*(long *)(lVar6 + 0xe0) + 4) >> 4 & 1) == 0) {
        return uVar3;
      }
      func_0x00779d40(lVar6,4);
      return uVar3;
    }
    func_0x0073c9e4(lVar6,"transfer would use an invalid scache at %p, denied");
  }
  func_0x00795598(uVar3,lVar6);
LAB_007975a8:
  if (param_4 != (long *)0x0) {
    lVar6 = func_0x00740a58(param_4 + 8);
    if (lVar6 == 0) {
      if (*param_4 != 0) {
        (*pcRam0000000000a2b5f0)();
        *param_4 = 0;
      }
      param_4[1] = 0;
      if (param_4[6] != 0) {
        (*pcRam0000000000a2b5f0)();
        param_4[6] = 0;
      }
      param_4[7] = 0;
      *(undefined4 *)(param_4 + 3) = 0;
      param_4[2] = 0;
      (*pcRam0000000000a2b5f0)(param_4[4]);
      param_4[4] = 0;
      (*pcRam0000000000a2b5f0)(param_4);
    }
    else {
      func_0x0075e5fc(param_4 + 8);
    }
  }
  return 0;
}

