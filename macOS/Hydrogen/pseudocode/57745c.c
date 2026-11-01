
/* WARNING: Possible PIC construction at 0x005774e8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005777e8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0057775c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00577a88: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00577ba0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005777cc: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00577af8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00577704: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00577afc) */
/* WARNING: Removing unreachable block (ram,0x00577b0c) */
/* WARNING: Removing unreachable block (ram,0x005777d0) */
/* WARNING: Removing unreachable block (ram,0x005777d4) */
/* WARNING: Removing unreachable block (ram,0x00577ba4) */
/* WARNING: Removing unreachable block (ram,0x00577bb4) */
/* WARNING: Removing unreachable block (ram,0x00577a8c) */
/* WARNING: Removing unreachable block (ram,0x00577a9c) */
/* WARNING: Removing unreachable block (ram,0x00577760) */
/* WARNING: Removing unreachable block (ram,0x005777ec) */
/* WARNING: Removing unreachable block (ram,0x005777fc) */
/* WARNING: Removing unreachable block (ram,0x005774ec) */
/* WARNING: Removing unreachable block (ram,0x005774f0) */
/* WARNING: Removing unreachable block (ram,0x00577508) */
/* WARNING: Removing unreachable block (ram,0x00577708) */
/* WARNING: Removing unreachable block (ram,0x0057771c) */

long * thunk_FUN_00577464(undefined8 param_1)

{
  undefined1 *puVar1;
  int iVar2;
  long *plVar3;
  long *plVar4;
  long *plVar5;
  long *plVar6;
  long lVar7;
  ulong uVar8;
  ulong uVar9;
  long lVar10;
  long lVar11;
  long *unaff_x20;
  long unaff_x21;
  long *unaff_x22;
  long *unaff_x23;
  long *unaff_x24;
  undefined1 *unaff_x29;
  undefined *puVar12;
  undefined1 auVar13 [16];
  undefined1 uStack0000000000000020;
  
  func_0x00187bd4();
  plVar3 = (long *)__Unwind_Resume(param_1);
  func_0x005761f0(&uStack0000000000000020);
  __Unwind_Resume(plVar3);
  puVar12 = (undefined *)0x5774ac;
  auVar13 = func_0x007a2668();
  puVar1 = (undefined1 *)register0x00000008;
SUB_005774ac:
  do {
    while( true ) {
      plVar6 = auVar13._8_8_;
      plVar4 = auVar13._0_8_;
      *(long **)(puVar1 + -0x40) = unaff_x24;
      *(long **)(puVar1 + -0x38) = unaff_x23;
      *(long **)(puVar1 + -0x30) = unaff_x22;
      *(long *)(puVar1 + -0x28) = unaff_x21;
      *(long **)(puVar1 + -0x20) = unaff_x20;
      *(long **)(puVar1 + -0x18) = plVar3;
      *(undefined1 **)(puVar1 + -0x10) = unaff_x29;
      *(undefined **)(puVar1 + -8) = puVar12;
      unaff_x29 = puVar1 + -0x10;
      lVar7 = *plVar4;
      if (lVar7 != *plVar6) {
        return (long *)0x0;
      }
      plVar3 = plVar6;
      unaff_x20 = plVar4;
      if (lVar7 != 7) break;
      auVar13._8_8_ = plVar6[1];
      auVar13._0_8_ = plVar4[1];
      puVar12 = (undefined *)0x5774ec;
      puVar1 = puVar1 + -0x40;
    }
    if (4 < lVar7) {
      if (lVar7 < 9) {
        if (lVar7 == 5) {
          unaff_x21 = plVar4[3];
          if (unaff_x21 != plVar6[3]) {
            return (long *)0x0;
          }
          unaff_x20 = (long *)plVar4[2];
          plVar3 = (long *)plVar6[2];
          unaff_x22 = (long *)(ulong)(unaff_x21 == 0);
          if (unaff_x21 == 0) {
            return (long *)0x1;
          }
          if (*unaff_x20 == 0xc) {
            if (*plVar3 != 0xc) {
              return unaff_x22;
            }
          }
          else {
            if (*plVar3 == 0xc) {
              return unaff_x22;
            }
            uVar8 = func_0x005774ac(unaff_x20,plVar3);
            if ((uVar8 & 1) == 0) {
              return unaff_x22;
            }
          }
          unaff_x23 = unaff_x20 + 0x10;
          unaff_x24 = plVar3 + 0x10;
          auVar13._8_8_ = plVar3 + 8;
          auVar13._0_8_ = unaff_x20 + 8;
          puVar12 = (undefined *)0x577760;
          puVar1 = puVar1 + -0x40;
          goto SUB_005774ac;
        }
        if (lVar7 != 6) {
          auVar13._8_8_ = plVar6[1];
          auVar13._0_8_ = plVar4[1];
          puVar12 = (undefined *)0x5777ec;
          puVar1 = puVar1 + -0x40;
          goto SUB_005774ac;
        }
        uVar8 = plVar4[1] ^ 0x8000000000000000;
        if (4 < uVar8) {
          uVar8 = 3;
        }
        uVar9 = plVar6[1] ^ 0x8000000000000000;
        if (4 < uVar9) {
          uVar9 = 3;
        }
        if (uVar8 != uVar9) {
          return (long *)0x0;
        }
        if (1 < (long)uVar8) {
          if (uVar8 == 2) {
            return (long *)(ulong)((double)plVar4[2] == (double)plVar6[2]);
          }
          if (uVar8 != 3) {
            if (*(float *)(plVar4 + 2) != *(float *)(plVar6 + 2)) {
              return (long *)0x0;
            }
            if (*(float *)((long)plVar4 + 0x14) == *(float *)((long)plVar6 + 0x14)) {
              return (long *)(ulong)(*(float *)(plVar4 + 3) == *(float *)(plVar6 + 3));
            }
            return (long *)0x0;
          }
          goto LAB_00577694;
        }
        if (uVar8 != 0) {
          return (long *)(ulong)((char)plVar4[2] == (char)plVar6[2]);
        }
      }
      else {
        if (lVar7 == 9) {
          plVar5 = (long *)func_0x005774ac(plVar4[1],plVar6[1]);
          if ((int)plVar5 == 0) {
            return plVar5;
          }
          auVar13._8_8_ = plVar6[2];
          auVar13._0_8_ = plVar4[2];
          puVar12 = (undefined *)0x5777d0;
          puVar1 = puVar1 + -0x40;
          goto SUB_005774ac;
        }
        if (lVar7 == 10) {
          if (plVar4[4] != plVar6[4]) {
            return (long *)0x0;
          }
          if (plVar4[3] != plVar6[3]) {
            return (long *)0x0;
          }
          lVar7 = plVar4[3] + 1;
          plVar3 = (long *)(plVar4[2] + 8);
          plVar4 = (long *)(plVar6[2] + 8);
          while( true ) {
            lVar7 = lVar7 + -1;
            if (lVar7 == 0) {
              return (long *)0x1;
            }
            if (plVar3[-1] != plVar4[-1]) break;
            lVar10 = *plVar4;
            lVar11 = *plVar3;
            plVar3 = plVar3 + 2;
            plVar4 = plVar4 + 2;
            if (lVar11 != lVar10) {
              return (long *)(ulong)(lVar7 == 0);
            }
          }
          return (long *)(ulong)(lVar7 == 0);
        }
        uVar8 = plVar4[1] ^ 0x8000000000000000;
        if (1 < uVar8) {
          uVar8 = 2;
        }
        uVar9 = plVar6[1] ^ 0x8000000000000000;
        if (1 < uVar9) {
          uVar9 = 2;
        }
        if (uVar8 != uVar9) {
          return (long *)0x0;
        }
        if (uVar8 == 2) {
          unaff_x24 = *(long **)(puVar1 + -0x40);
          unaff_x23 = *(long **)(puVar1 + -0x38);
          *(undefined8 *)(puVar1 + -0x30) = *(undefined8 *)(puVar1 + -0x30);
          *(undefined8 *)(puVar1 + -0x28) = *(undefined8 *)(puVar1 + -0x28);
          *(undefined8 *)(puVar1 + -0x20) = *(undefined8 *)(puVar1 + -0x20);
          *(undefined8 *)(puVar1 + -0x18) = *(undefined8 *)(puVar1 + -0x18);
          *(undefined8 *)(puVar1 + -0x10) = *(undefined8 *)(puVar1 + -0x10);
          *(undefined8 *)(puVar1 + -8) = *(undefined8 *)(puVar1 + -8);
          unaff_x29 = puVar1 + -0x10;
          iVar2 = func_0x005774ac(plVar4[7],plVar6[7]);
          if ((((iVar2 == 0) || (plVar4[3] != plVar6[3])) ||
              (iVar2 = _memcmp(plVar4[2],plVar6[2]), iVar2 != 0)) ||
             (unaff_x20 = (long *)plVar4[6], unaff_x20 != (long *)plVar6[6])) {
            plVar3 = (long *)0x0;
          }
          else {
            auVar13._8_8_ = plVar6[5];
            auVar13._0_8_ = plVar4[5];
            plVar3 = (long *)(ulong)(unaff_x20 == (long *)0x0);
            if (unaff_x20 != (long *)0x0) {
              unaff_x21 = plVar4[5] + 0x40;
              unaff_x22 = (long *)(plVar6[5] + 0x40);
              puVar12 = &UNK_00577ba4;
              puVar1 = puVar1 + -0x30;
              goto SUB_005774ac;
            }
          }
          return plVar3;
        }
        if (uVar8 == 1) {
          unaff_x24 = *(long **)(puVar1 + -0x40);
          unaff_x23 = *(long **)(puVar1 + -0x38);
          *(undefined8 *)(puVar1 + -0x30) = *(undefined8 *)(puVar1 + -0x30);
          *(undefined8 *)(puVar1 + -0x28) = *(undefined8 *)(puVar1 + -0x28);
          *(undefined8 *)(puVar1 + -0x20) = *(undefined8 *)(puVar1 + -0x20);
          *(undefined8 *)(puVar1 + -0x18) = *(undefined8 *)(puVar1 + -0x18);
          *(undefined8 *)(puVar1 + -0x10) = *(undefined8 *)(puVar1 + -0x10);
          *(undefined8 *)(puVar1 + -8) = *(undefined8 *)(puVar1 + -8);
          unaff_x29 = puVar1 + -0x10;
          iVar2 = func_0x005774ac(plVar4[5],plVar6[5]);
          if ((iVar2 == 0) || (unaff_x20 = (long *)plVar4[4], unaff_x20 != (long *)plVar6[4])) {
            plVar3 = (long *)0x0;
          }
          else {
            auVar13._8_8_ = plVar6[3];
            auVar13._0_8_ = plVar4[3];
            plVar3 = (long *)(ulong)(unaff_x20 == (long *)0x0);
            if (unaff_x20 != (long *)0x0) {
              unaff_x21 = plVar4[3] + 0x40;
              unaff_x22 = (long *)(plVar6[3] + 0x40);
              puVar12 = &UNK_00577a8c;
              puVar1 = puVar1 + -0x30;
              goto SUB_005774ac;
            }
          }
          return plVar3;
        }
      }
LAB_00577880:
      return (long *)((long)&MACH_HEADER.magic + 1);
    }
    if (lVar7 < 2) {
      if (lVar7 == 0) {
        return (long *)(ulong)(plVar4[1] == plVar6[1]);
      }
LAB_00577694:
      if (plVar4[3] == plVar6[3]) {
        iVar2 = _memcmp(plVar4[2],plVar6[2]);
        return (long *)(ulong)(iVar2 == 0);
      }
      return (long *)0x0;
    }
    if (lVar7 != 2) {
      if (lVar7 != 3) goto LAB_00577880;
      plVar3 = (long *)func_0x005774ac(plVar4[7],plVar6[7]);
      if ((int)plVar3 == 0) {
        return plVar3;
      }
      if (plVar4[3] != plVar6[3]) {
        return (long *)0x0;
      }
      iVar2 = _memcmp(plVar4[2],plVar6[2]);
      if (iVar2 != 0) {
        return (long *)0x0;
      }
      unaff_x24 = *(long **)(puVar1 + -0x40);
      unaff_x23 = *(long **)(puVar1 + -0x38);
      *(undefined8 *)(puVar1 + -0x30) = *(undefined8 *)(puVar1 + -0x30);
      *(undefined8 *)(puVar1 + -0x28) = *(undefined8 *)(puVar1 + -0x28);
      *(undefined8 *)(puVar1 + -0x20) = *(undefined8 *)(puVar1 + -0x20);
      *(undefined8 *)(puVar1 + -0x18) = *(undefined8 *)(puVar1 + -0x18);
      *(undefined8 *)(puVar1 + -0x10) = *(undefined8 *)(puVar1 + -0x10);
      *(undefined8 *)(puVar1 + -8) = *(undefined8 *)(puVar1 + -8);
      unaff_x29 = puVar1 + -0x10;
      unaff_x20 = (long *)plVar4[6];
      if (unaff_x20 == (long *)plVar6[6]) {
        auVar13._8_8_ = plVar6[5];
        auVar13._0_8_ = plVar4[5];
        plVar3 = (long *)(ulong)(unaff_x20 == (long *)0x0);
        if (unaff_x20 != (long *)0x0) {
          unaff_x21 = plVar4[5] + 0x40;
          unaff_x22 = (long *)(plVar6[5] + 0x40);
          puVar12 = &UNK_00577afc;
          puVar1 = puVar1 + -0x30;
          goto SUB_005774ac;
        }
      }
      else {
        plVar3 = (long *)0x0;
      }
      return plVar3;
    }
    plVar3 = (long *)func_0x005774ac(plVar4[4],plVar6[4]);
    if ((int)plVar3 == 0) {
      return plVar3;
    }
    plVar3 = (long *)plVar4[3];
    if (plVar3 != (long *)plVar6[3]) {
      return (long *)0x0;
    }
    auVar13._8_8_ = plVar6[2];
    auVar13._0_8_ = plVar4[2];
    unaff_x20 = (long *)(ulong)(plVar3 == (long *)0x0);
    if (plVar3 == (long *)0x0) {
      return (long *)0x1;
    }
    unaff_x21 = plVar4[2] + 0x40;
    unaff_x22 = (long *)(plVar6[2] + 0x40);
    puVar12 = (undefined *)0x577708;
    puVar1 = puVar1 + -0x40;
  } while( true );
}

