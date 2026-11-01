
/* WARNING: Possible PIC construction at 0x005cdd5c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005cdd78: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005cdf88: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005cdfd8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005cdffc: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005ce320: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005cdeac: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005cdf40: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005cde38: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005cdec8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005d2b04: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x005cdecc) */
/* WARNING: Removing unreachable block (ram,0x005cdee4) */
/* WARNING: Removing unreachable block (ram,0x005cdfac) */
/* WARNING: Removing unreachable block (ram,0x005cdfb4) */
/* WARNING: Removing unreachable block (ram,0x005cdeec) */
/* WARNING: Removing unreachable block (ram,0x005cde3c) */
/* WARNING: Removing unreachable block (ram,0x005cde44) */
/* WARNING: Removing unreachable block (ram,0x005cde50) */
/* WARNING: Removing unreachable block (ram,0x005cde58) */
/* WARNING: Removing unreachable block (ram,0x005cde60) */
/* WARNING: Removing unreachable block (ram,0x005cdeb0) */
/* WARNING: Removing unreachable block (ram,0x005ce324) */
/* WARNING: Removing unreachable block (ram,0x005cdfdc) */
/* WARNING: Removing unreachable block (ram,0x005ce000) */
/* WARNING: Removing unreachable block (ram,0x005ce008) */
/* WARNING: Removing unreachable block (ram,0x005ce020) */
/* WARNING: Removing unreachable block (ram,0x005ce028) */
/* WARNING: Removing unreachable block (ram,0x005ce010) */
/* WARNING: Removing unreachable block (ram,0x005cdff4) */
/* WARNING: Removing unreachable block (ram,0x005cdf8c) */
/* WARNING: Removing unreachable block (ram,0x005cdf94) */
/* WARNING: Removing unreachable block (ram,0x005ce048) */
/* WARNING: Removing unreachable block (ram,0x005ce050) */
/* WARNING: Removing unreachable block (ram,0x005ce02c) */
/* WARNING: Removing unreachable block (ram,0x005cdf9c) */
/* WARNING: Removing unreachable block (ram,0x005cdd7c) */
/* WARNING: Removing unreachable block (ram,0x005cdf44) */
/* WARNING: Removing unreachable block (ram,0x005cdd60) */
/* WARNING: Removing unreachable block (ram,0x005d2b08) */

void FUN_005cdd08(void)

{
  undefined1 *puVar1;
  undefined1 *puVar2;
  long *plVar3;
  long *plVar4;
  long *plVar5;
  long lVar6;
  undefined8 uVar7;
  long lVar8;
  ulong uVar9;
  long *unaff_x19;
  undefined8 unaff_x20;
  long lVar10;
  long *unaff_x21;
  undefined8 unaff_x22;
  undefined8 unaff_x23;
  undefined8 unaff_x24;
  undefined1 *unaff_x29;
  undefined *puVar11;
  
  __Unwind_Resume();
  puVar11 = (undefined *)0x5cdd10;
  plVar3 = (long *)func_0x007a2668();
  puVar2 = (undefined1 *)register0x00000008;
SUB_005cdd10:
  while( true ) {
    plVar4 = plVar3;
    *(undefined8 *)(puVar2 + -0x40) = unaff_x24;
    *(undefined8 *)(puVar2 + -0x38) = unaff_x23;
    *(undefined8 *)(puVar2 + -0x30) = unaff_x22;
    *(long **)(puVar2 + -0x28) = unaff_x21;
    *(undefined8 *)(puVar2 + -0x20) = unaff_x20;
    *(long **)(puVar2 + -0x18) = unaff_x19;
    *(undefined1 **)(puVar2 + -0x10) = unaff_x29;
    *(undefined **)(puVar2 + -8) = puVar11;
    unaff_x29 = puVar2 + -0x10;
    lVar8 = *plVar4;
    puVar1 = puVar2;
    unaff_x19 = plVar4;
    if (lVar8 < 5) break;
    if (lVar8 < 8) {
      if (lVar8 == 5) {
        plVar3 = (long *)plVar4[2];
        for (lVar8 = plVar4[3]; lVar8 != 0; lVar8 = lVar8 + -1) {
          if (*plVar3 != 0xc) {
            func_0x0059ce88(plVar3);
          }
          func_0x0059ce88(plVar3 + 8);
          plVar3 = plVar3 + 0x10;
        }
        if (plVar4[1] == 0) {
          return;
        }
        lVar8 = plVar4[2];
        lVar6 = plVar4[1] << 7;
        uVar7 = 8;
code_r0x005ce034:
        unaff_x29 = *(undefined1 **)(puVar2 + -0x10);
        puVar11 = *(undefined **)(puVar2 + -8);
        goto code_r0x00187bd4;
      }
      if (lVar8 == 6) {
        lVar6 = plVar4[1];
        if (lVar6 < -0x7ffffffffffffffb) {
          return;
        }
        if (lVar6 == 0) {
          return;
        }
        goto code_r0x005cde88;
      }
      if (lVar8 != 7) goto LAB_005cdf50;
      unaff_x21 = (long *)plVar4[1];
      puVar11 = (undefined *)0x5cdd60;
      puVar2 = puVar2 + -0x40;
      plVar3 = unaff_x21;
    }
    else {
      if (lVar8 != 8) {
        if (lVar8 == 9) {
          lVar8 = plVar4[1];
          func_0x005cdd10(lVar8);
          lVar6 = 0x40;
          uVar7 = 8;
          puVar11 = &UNK_005cdeb0;
          puVar1 = puVar2 + -0x40;
          goto code_r0x00187bd4;
        }
        if (lVar8 != 10) goto LAB_005cdf50;
        plVar3 = plVar4 + 1;
        *(undefined8 *)(puVar2 + -0x40) = *(undefined8 *)(puVar2 + -0x40);
        *(undefined8 *)(puVar2 + -0x38) = *(undefined8 *)(puVar2 + -0x38);
        *(undefined8 *)(puVar2 + -0x30) = *(undefined8 *)(puVar2 + -0x30);
        *(undefined8 *)(puVar2 + -0x28) = *(undefined8 *)(puVar2 + -0x28);
        *(undefined8 *)(puVar2 + -0x20) = *(undefined8 *)(puVar2 + -0x20);
        *(undefined8 *)(puVar2 + -0x18) = *(undefined8 *)(puVar2 + -0x18);
        *(undefined8 *)(puVar2 + -0x10) = *(undefined8 *)(puVar2 + -0x10);
        *(undefined8 *)(puVar2 + -8) = *(undefined8 *)(puVar2 + -8);
        unaff_x29 = puVar2 + -0x10;
        lVar8 = *(long *)plVar4[4];
        *(long *)plVar4[4] = lVar8 + -1;
        LORelease();
        if (lVar8 == 1) {
          func_0x005d2b20();
        }
        lVar8 = plVar4[3];
        if (lVar8 == 0) goto code_r0x005ce328;
        lVar10 = plVar4[2] + 0x18;
        goto code_r0x005ce304;
      }
      puVar11 = &LAB_005cdf44;
      puVar2 = puVar2 + -0x40;
      plVar3 = (long *)plVar4[1];
      unaff_x19 = (long *)plVar4[1];
    }
  }
  if (lVar8 < 2) {
    if (lVar8 == 0) {
      plVar5 = plVar4 + 1;
      lVar8 = *(long *)*plVar5;
      *(long *)*plVar5 = lVar8 + -1;
      LORelease();
      if (lVar8 != 1) {
        return;
      }
      unaff_x29 = *(undefined1 **)(puVar2 + -0x10);
      puVar11 = *(undefined **)(puVar2 + -8);
      lVar10 = *(long *)(puVar2 + -0x20);
      plVar3 = *(long **)(puVar2 + -0x18);
      goto code_r0x005d2ac4;
    }
    if (lVar8 == 1) {
      lVar6 = plVar4[1];
      if (lVar6 == 0) {
        return;
      }
code_r0x005cde88:
      lVar8 = plVar4[2];
      uVar7 = 1;
      goto code_r0x005ce034;
    }
  }
  else {
    if (lVar8 == 2) {
      unaff_x21 = (long *)plVar4[4];
      puVar11 = &UNK_005cdecc;
      puVar2 = puVar2 + -0x40;
      plVar3 = unaff_x21;
      goto SUB_005cdd10;
    }
    if (lVar8 == 3) {
      lVar8 = plVar4[7];
      func_0x005cdd10(lVar8);
      lVar6 = 0x40;
      uVar7 = 8;
      puVar11 = &UNK_005cde3c;
      puVar1 = puVar2 + -0x40;
      goto code_r0x00187bd4;
    }
    if (lVar8 == 4) {
      return;
    }
  }
LAB_005cdf50:
  uVar9 = plVar4[1] ^ 0x8000000000000000;
  if (1 < uVar9) {
    uVar9 = 2;
  }
  if (uVar9 == 0) {
    return;
  }
  if (uVar9 != 1) {
    unaff_x21 = (long *)plVar4[7];
    puVar11 = &UNK_005cdfdc;
    puVar2 = puVar2 + -0x40;
    plVar3 = unaff_x21;
    goto SUB_005cdd10;
  }
  lVar8 = plVar4[5];
  func_0x005cdd10(lVar8);
  lVar6 = 0x40;
  uVar7 = 8;
  puVar11 = &UNK_005cdf8c;
  puVar1 = puVar2 + -0x40;
  goto code_r0x00187bd4;
  while (lVar10 = lVar10 + 0x10, lVar8 != 0) {
code_r0x005ce304:
    lVar8 = lVar8 + -1;
    plVar5 = (long *)(lVar10 + -0x10);
    lVar6 = *(long *)*plVar5;
    *(long *)*plVar5 = lVar6 + -1;
    LORelease();
    if (lVar6 == 1) {
      puVar11 = &UNK_005ce324;
      puVar2 = puVar2 + -0x40;
code_r0x005d2ac4:
      lVar8 = *plVar5;
      lVar6 = *(long *)(lVar8 + 0x10);
      if (lVar6 == -0x8000000000000000 || lVar6 == 0) {
        lVar6 = 0x28;
        uVar7 = 8;
        puVar1 = puVar2;
      }
      else {
        puVar1 = puVar2 + -0x20;
        *(long *)(puVar2 + -0x20) = lVar10;
        *(long **)(puVar2 + -0x18) = plVar3;
        *(undefined1 **)(puVar2 + -0x10) = unaff_x29;
        *(undefined **)(puVar2 + -8) = puVar11;
        unaff_x29 = puVar2 + -0x10;
        lVar8 = *(long *)(lVar8 + 0x18);
        uVar7 = 1;
        puVar11 = &UNK_005d2b08;
      }
      goto code_r0x00187bd4;
    }
  }
code_r0x005ce328:
  if (*plVar3 == 0) {
    return;
  }
  lVar8 = plVar4[2];
  lVar6 = *plVar3 << 4;
  uVar7 = 8;
  unaff_x29 = *(undefined1 **)(puVar2 + -0x10);
  puVar11 = *(undefined **)(puVar2 + -8);
code_r0x00187bd4:
  *(undefined1 **)(puVar1 + -0x10) = unaff_x29;
  *(undefined **)(puVar1 + -8) = puVar11;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar8,lVar6,uVar7);
  return;
}

