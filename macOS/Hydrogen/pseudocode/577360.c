
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

undefined1 * FUN_00577360(void)

{
  undefined1 auVar1 [16];
  undefined1 *puVar2;
  int iVar3;
  long *plVar4;
  long lVar5;
  ulong uVar6;
  ulong uVar7;
  long lVar8;
  long lVar9;
  undefined8 unaff_x19;
  long *plVar10;
  undefined1 *puVar11;
  undefined8 unaff_x20;
  long *plVar12;
  long unaff_x21;
  undefined1 *unaff_x22;
  long *unaff_x23;
  long *unaff_x24;
  undefined1 *unaff_x29;
  undefined *puVar13;
  undefined1 auVar14 [16];
  undefined1 uStack0000000000000018;
  
  auVar1._8_8_ = unaff_x19;
  auVar1._0_8_ = unaff_x20;
  func_0x00187bd4();
  func_0x005761f0(&uStack0000000000000018);
  __Unwind_Resume();
  puVar13 = &SUB_005774ac;
  auVar14 = func_0x007a2668();
  puVar2 = (undefined1 *)register0x00000008;
code_r0x005774ac:
  do {
    while( true ) {
      plVar4 = auVar14._8_8_;
      plVar10 = auVar14._0_8_;
      *(long **)(puVar2 + -0x40) = unaff_x24;
      *(long **)(puVar2 + -0x38) = unaff_x23;
      *(undefined1 **)(puVar2 + -0x30) = unaff_x22;
      *(long *)(puVar2 + -0x28) = unaff_x21;
      *(undefined1 (*) [16])(puVar2 + -0x20) = auVar1;
      *(undefined1 **)(puVar2 + -0x10) = unaff_x29;
      *(undefined **)(puVar2 + -8) = puVar13;
      unaff_x29 = puVar2 + -0x10;
      lVar5 = *plVar10;
      if (lVar5 != *plVar4) {
        return (undefined1 *)0x0;
      }
      auVar1 = auVar14;
      if (lVar5 != 7) break;
      auVar14._8_8_ = plVar4[1];
      auVar14._0_8_ = plVar10[1];
      puVar13 = &UNK_005774ec;
      puVar2 = puVar2 + -0x40;
    }
    if (4 < lVar5) {
      if (lVar5 < 9) {
        if (lVar5 == 5) {
          unaff_x21 = plVar10[3];
          if (unaff_x21 != plVar4[3]) {
            return (undefined1 *)0x0;
          }
          plVar12 = (long *)plVar10[2];
          plVar10 = (long *)plVar4[2];
          auVar1._8_8_ = plVar10;
          auVar1._0_8_ = (ulong)plVar12;
          unaff_x22 = (undefined1 *)(ulong)(unaff_x21 == 0);
          if (unaff_x21 == 0) {
            return (undefined1 *)0x1;
          }
          if (*plVar12 == 0xc) {
            if (*plVar10 != 0xc) {
              return unaff_x22;
            }
          }
          else {
            if (*plVar10 == 0xc) {
              return unaff_x22;
            }
            uVar6 = func_0x005774ac(plVar12,plVar10);
            if ((uVar6 & 1) == 0) {
              return unaff_x22;
            }
          }
          unaff_x23 = plVar12 + 0x10;
          unaff_x24 = plVar10 + 0x10;
          auVar14._8_8_ = plVar10 + 8;
          auVar14._0_8_ = plVar12 + 8;
          puVar13 = &UNK_00577760;
          puVar2 = puVar2 + -0x40;
          goto code_r0x005774ac;
        }
        if (lVar5 != 6) {
          auVar14._8_8_ = plVar4[1];
          auVar14._0_8_ = plVar10[1];
          puVar13 = &UNK_005777ec;
          puVar2 = puVar2 + -0x40;
          goto code_r0x005774ac;
        }
        uVar6 = plVar10[1] ^ 0x8000000000000000;
        if (4 < uVar6) {
          uVar6 = 3;
        }
        uVar7 = plVar4[1] ^ 0x8000000000000000;
        if (4 < uVar7) {
          uVar7 = 3;
        }
        if (uVar6 != uVar7) {
          return (undefined1 *)0x0;
        }
        if (1 < (long)uVar6) {
          if (uVar6 == 2) {
            return (undefined1 *)(ulong)((double)plVar10[2] == (double)plVar4[2]);
          }
          if (uVar6 != 3) {
            if (*(float *)(plVar10 + 2) != *(float *)(plVar4 + 2)) {
              return (undefined1 *)0x0;
            }
            if (*(float *)((long)plVar10 + 0x14) == *(float *)((long)plVar4 + 0x14)) {
              return (undefined1 *)(ulong)(*(float *)(plVar10 + 3) == *(float *)(plVar4 + 3));
            }
            return (undefined1 *)0x0;
          }
          goto code_r0x00577694;
        }
        if (uVar6 != 0) {
          return (undefined1 *)(ulong)((char)plVar10[2] == (char)plVar4[2]);
        }
      }
      else {
        if (lVar5 == 9) {
          puVar11 = (undefined1 *)func_0x005774ac(plVar10[1],plVar4[1]);
          if ((int)puVar11 == 0) {
            return puVar11;
          }
          auVar14._8_8_ = plVar4[2];
          auVar14._0_8_ = plVar10[2];
          puVar13 = &UNK_005777d0;
          puVar2 = puVar2 + -0x40;
          goto code_r0x005774ac;
        }
        if (lVar5 == 10) {
          if (plVar10[4] != plVar4[4]) {
            return (undefined1 *)0x0;
          }
          if (plVar10[3] != plVar4[3]) {
            return (undefined1 *)0x0;
          }
          lVar5 = plVar10[3] + 1;
          plVar10 = (long *)(plVar10[2] + 8);
          plVar4 = (long *)(plVar4[2] + 8);
          while( true ) {
            lVar5 = lVar5 + -1;
            if (lVar5 == 0) {
              return (undefined1 *)0x1;
            }
            if (plVar10[-1] != plVar4[-1]) break;
            lVar8 = *plVar4;
            lVar9 = *plVar10;
            plVar10 = plVar10 + 2;
            plVar4 = plVar4 + 2;
            if (lVar9 != lVar8) {
              return (undefined1 *)(ulong)(lVar5 == 0);
            }
          }
          return (undefined1 *)(ulong)(lVar5 == 0);
        }
        uVar6 = plVar10[1] ^ 0x8000000000000000;
        if (1 < uVar6) {
          uVar6 = 2;
        }
        uVar7 = plVar4[1] ^ 0x8000000000000000;
        if (1 < uVar7) {
          uVar7 = 2;
        }
        if (uVar6 != uVar7) {
          return (undefined1 *)0x0;
        }
        if (uVar6 == 2) {
          unaff_x24 = *(long **)(puVar2 + -0x40);
          unaff_x23 = *(long **)(puVar2 + -0x38);
          *(undefined8 *)(puVar2 + -0x30) = *(undefined8 *)(puVar2 + -0x30);
          *(undefined8 *)(puVar2 + -0x28) = *(undefined8 *)(puVar2 + -0x28);
          *(undefined8 *)(puVar2 + -0x20) = *(undefined8 *)(puVar2 + -0x20);
          *(undefined8 *)(puVar2 + -0x18) = *(undefined8 *)(puVar2 + -0x18);
          *(undefined8 *)(puVar2 + -0x10) = *(undefined8 *)(puVar2 + -0x10);
          *(undefined8 *)(puVar2 + -8) = *(undefined8 *)(puVar2 + -8);
          unaff_x29 = puVar2 + -0x10;
          iVar3 = func_0x005774ac(plVar10[7],plVar4[7]);
          if ((((iVar3 == 0) || (plVar10[3] != plVar4[3])) ||
              (iVar3 = _memcmp(plVar10[2],plVar4[2]), iVar3 != 0)) ||
             (lVar5 = plVar10[6], lVar5 != plVar4[6])) {
            puVar11 = (undefined1 *)0x0;
          }
          else {
            auVar14._8_8_ = plVar4[5];
            auVar14._0_8_ = plVar10[5];
            puVar11 = (undefined1 *)(ulong)(lVar5 == 0);
            auVar1[8] = lVar5 == 0;
            auVar1._0_8_ = lVar5;
            auVar1._9_7_ = 0;
            if (lVar5 != 0) {
              unaff_x21 = plVar10[5] + 0x40;
              unaff_x22 = (undefined1 *)(plVar4[5] + 0x40);
              puVar13 = &UNK_00577ba4;
              puVar2 = puVar2 + -0x30;
              goto code_r0x005774ac;
            }
          }
          return puVar11;
        }
        if (uVar6 == 1) {
          unaff_x24 = *(long **)(puVar2 + -0x40);
          unaff_x23 = *(long **)(puVar2 + -0x38);
          *(undefined8 *)(puVar2 + -0x30) = *(undefined8 *)(puVar2 + -0x30);
          *(undefined8 *)(puVar2 + -0x28) = *(undefined8 *)(puVar2 + -0x28);
          *(undefined8 *)(puVar2 + -0x20) = *(undefined8 *)(puVar2 + -0x20);
          *(undefined8 *)(puVar2 + -0x18) = *(undefined8 *)(puVar2 + -0x18);
          *(undefined8 *)(puVar2 + -0x10) = *(undefined8 *)(puVar2 + -0x10);
          *(undefined8 *)(puVar2 + -8) = *(undefined8 *)(puVar2 + -8);
          unaff_x29 = puVar2 + -0x10;
          iVar3 = func_0x005774ac(plVar10[5],plVar4[5]);
          if ((iVar3 == 0) || (lVar5 = plVar10[4], lVar5 != plVar4[4])) {
            puVar11 = (undefined1 *)0x0;
          }
          else {
            auVar14._8_8_ = plVar4[3];
            auVar14._0_8_ = plVar10[3];
            puVar11 = (undefined1 *)(ulong)(lVar5 == 0);
            auVar1[8] = lVar5 == 0;
            auVar1._0_8_ = lVar5;
            auVar1._9_7_ = 0;
            if (lVar5 != 0) {
              unaff_x21 = plVar10[3] + 0x40;
              unaff_x22 = (undefined1 *)(plVar4[3] + 0x40);
              puVar13 = &UNK_00577a8c;
              puVar2 = puVar2 + -0x30;
              goto code_r0x005774ac;
            }
          }
          return puVar11;
        }
      }
code_r0x00577880:
      return (undefined1 *)((long)&MACH_HEADER.magic + 1);
    }
    if (lVar5 < 2) {
      if (lVar5 == 0) {
        return (undefined1 *)(ulong)(plVar10[1] == plVar4[1]);
      }
code_r0x00577694:
      if (plVar10[3] == plVar4[3]) {
        iVar3 = _memcmp(plVar10[2],plVar4[2]);
        return (undefined1 *)(ulong)(iVar3 == 0);
      }
      return (undefined1 *)0x0;
    }
    if (lVar5 != 2) {
      if (lVar5 != 3) goto code_r0x00577880;
      puVar11 = (undefined1 *)func_0x005774ac(plVar10[7],plVar4[7]);
      if ((int)puVar11 == 0) {
        return puVar11;
      }
      if (plVar10[3] != plVar4[3]) {
        return (undefined1 *)0x0;
      }
      iVar3 = _memcmp(plVar10[2],plVar4[2]);
      if (iVar3 != 0) {
        return (undefined1 *)0x0;
      }
      unaff_x24 = *(long **)(puVar2 + -0x40);
      unaff_x23 = *(long **)(puVar2 + -0x38);
      *(undefined8 *)(puVar2 + -0x30) = *(undefined8 *)(puVar2 + -0x30);
      *(undefined8 *)(puVar2 + -0x28) = *(undefined8 *)(puVar2 + -0x28);
      *(undefined8 *)(puVar2 + -0x20) = *(undefined8 *)(puVar2 + -0x20);
      *(undefined8 *)(puVar2 + -0x18) = *(undefined8 *)(puVar2 + -0x18);
      *(undefined8 *)(puVar2 + -0x10) = *(undefined8 *)(puVar2 + -0x10);
      *(undefined8 *)(puVar2 + -8) = *(undefined8 *)(puVar2 + -8);
      unaff_x29 = puVar2 + -0x10;
      lVar5 = plVar10[6];
      if (lVar5 == plVar4[6]) {
        auVar14._8_8_ = plVar4[5];
        auVar14._0_8_ = plVar10[5];
        puVar11 = (undefined1 *)(ulong)(lVar5 == 0);
        auVar1[8] = lVar5 == 0;
        auVar1._0_8_ = lVar5;
        auVar1._9_7_ = 0;
        if (lVar5 != 0) {
          unaff_x21 = plVar10[5] + 0x40;
          unaff_x22 = (undefined1 *)(plVar4[5] + 0x40);
          puVar13 = &UNK_00577afc;
          puVar2 = puVar2 + -0x30;
          goto code_r0x005774ac;
        }
      }
      else {
        puVar11 = (undefined1 *)0x0;
      }
      return puVar11;
    }
    puVar11 = (undefined1 *)func_0x005774ac(plVar10[4],plVar4[4]);
    if ((int)puVar11 == 0) {
      return puVar11;
    }
    lVar5 = plVar10[3];
    if (lVar5 != plVar4[3]) {
      return (undefined1 *)0x0;
    }
    auVar14._8_8_ = plVar4[2];
    auVar14._0_8_ = plVar10[2];
    auVar1._1_7_ = 0;
    auVar1[0] = lVar5 == 0;
    auVar1._8_8_ = lVar5;
    if (lVar5 == 0) {
      return (undefined1 *)0x1;
    }
    unaff_x21 = plVar10[2] + 0x40;
    unaff_x22 = (undefined1 *)(plVar4[2] + 0x40);
    puVar13 = &UNK_00577708;
    puVar2 = puVar2 + -0x40;
  } while( true );
}

