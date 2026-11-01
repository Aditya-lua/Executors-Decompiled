
/* WARNING: Possible PIC construction at 0x00590ecc: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00590ee8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00591c2c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00591e68: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00591e8c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00590f9c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0059107c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00591110: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00591008: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00591098: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005d2b04: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0059109c) */
/* WARNING: Removing unreachable block (ram,0x005910b4) */
/* WARNING: Removing unreachable block (ram,0x00591180) */
/* WARNING: Removing unreachable block (ram,0x00591188) */
/* WARNING: Removing unreachable block (ram,0x005910bc) */
/* WARNING: Removing unreachable block (ram,0x0059100c) */
/* WARNING: Removing unreachable block (ram,0x00591014) */
/* WARNING: Removing unreachable block (ram,0x00591020) */
/* WARNING: Removing unreachable block (ram,0x00591028) */
/* WARNING: Removing unreachable block (ram,0x00591170) */
/* WARNING: Removing unreachable block (ram,0x00591178) */
/* WARNING: Removing unreachable block (ram,0x0059118c) */
/* WARNING: Removing unreachable block (ram,0x00591030) */
/* WARNING: Removing unreachable block (ram,0x00591080) */
/* WARNING: Removing unreachable block (ram,0x00590fa0) */
/* WARNING: Removing unreachable block (ram,0x00591e6c) */
/* WARNING: Removing unreachable block (ram,0x00591e90) */
/* WARNING: Removing unreachable block (ram,0x00591e9c) */
/* WARNING: Removing unreachable block (ram,0x00591eb4) */
/* WARNING: Removing unreachable block (ram,0x00591edc) */
/* WARNING: Removing unreachable block (ram,0x00591ebc) */
/* WARNING: Removing unreachable block (ram,0x00591ea4) */
/* WARNING: Removing unreachable block (ram,0x00591e84) */
/* WARNING: Removing unreachable block (ram,0x00591c30) */
/* WARNING: Removing unreachable block (ram,0x00591c3c) */
/* WARNING: Removing unreachable block (ram,0x00591c54) */
/* WARNING: Removing unreachable block (ram,0x00591c7c) */
/* WARNING: Removing unreachable block (ram,0x00591c5c) */
/* WARNING: Removing unreachable block (ram,0x00591c44) */
/* WARNING: Removing unreachable block (ram,0x00590eec) */
/* WARNING: Removing unreachable block (ram,0x00591114) */
/* WARNING: Removing unreachable block (ram,0x00590ed0) */
/* WARNING: Removing unreachable block (ram,0x005d2b08) */

void FUN_00590e70(void)

{
  undefined1 *puVar1;
  undefined1 *puVar2;
  long lVar3;
  long lVar4;
  ulong *puVar5;
  ulong uVar6;
  undefined8 uVar7;
  ulong uVar8;
  ulong *unaff_x19;
  ulong *puVar9;
  undefined8 unaff_x20;
  long *plVar10;
  ulong *unaff_x21;
  undefined8 unaff_x22;
  undefined8 unaff_x23;
  undefined8 unaff_x24;
  undefined1 *unaff_x29;
  undefined *puVar11;
  
  func_0x00592064();
  __Unwind_Resume();
  puVar11 = (undefined *)0x590e80;
  puVar5 = (ulong *)func_0x007a2668();
  puVar2 = (undefined1 *)register0x00000008;
SUB_00590e80:
  puVar9 = puVar5;
  *(undefined8 *)(puVar2 + -0x40) = unaff_x24;
  *(undefined8 *)(puVar2 + -0x38) = unaff_x23;
  *(undefined8 *)(puVar2 + -0x30) = unaff_x22;
  *(ulong **)(puVar2 + -0x28) = unaff_x21;
  *(undefined8 *)(puVar2 + -0x20) = unaff_x20;
  *(ulong **)(puVar2 + -0x18) = unaff_x19;
  *(undefined1 **)(puVar2 + -0x10) = unaff_x29;
  *(undefined **)(puVar2 + -8) = puVar11;
  unaff_x29 = puVar2 + -0x10;
  uVar8 = *puVar9;
  unaff_x19 = puVar9;
  if ((long)uVar8 < 5) {
    if (1 < (long)uVar8) {
      if (uVar8 == 2) goto code_r0x00591090;
      if (uVar8 != 3) {
        if (uVar8 == 4) {
          return;
        }
        goto code_r0x00591120;
      }
      uVar8 = puVar9[7];
      func_0x00590e80(uVar8);
      uVar6 = 0x40;
      uVar7 = 8;
      puVar11 = &UNK_0059100c;
      puVar1 = puVar2 + -0x40;
      goto code_r0x00187bd4;
    }
    if (uVar8 == 0) {
      puVar5 = puVar9 + 1;
      lVar3 = *(long *)*puVar5;
      *(long *)*puVar5 = lVar3 + -1;
      LORelease();
      if (lVar3 != 1) {
        return;
      }
      unaff_x29 = *(undefined1 **)(puVar2 + -0x10);
      puVar11 = *(undefined **)(puVar2 + -8);
      uVar7 = *(undefined8 *)(puVar2 + -0x20);
      puVar9 = *(ulong **)(puVar2 + -0x18);
      goto code_r0x005d2ac4;
    }
    if (uVar8 != 1) goto code_r0x00591120;
    uVar6 = puVar9[1];
    if (uVar6 == 0) {
      return;
    }
code_r0x00591058:
    uVar8 = puVar9[2];
    uVar7 = 1;
    goto code_r0x005911a8;
  }
  if ((long)uVar8 < 8) {
    if (uVar8 == 5) {
      plVar10 = (long *)puVar9[2];
      for (uVar8 = puVar9[3]; uVar8 != 0; uVar8 = uVar8 - 1) {
        if (*plVar10 != 0xc) {
          func_0x00553cb8(plVar10);
        }
        func_0x00553cb8(plVar10 + 8);
        plVar10 = plVar10 + 0x10;
      }
      if (puVar9[1] == 0) {
        return;
      }
      uVar8 = puVar9[2];
      uVar6 = puVar9[1] << 7;
      goto code_r0x005911a4;
    }
    if (uVar8 == 6) {
      uVar6 = puVar9[1];
      if ((long)uVar6 < -0x7ffffffffffffffb) {
        return;
      }
      if (uVar6 == 0) {
        return;
      }
      goto code_r0x00591058;
    }
    if (uVar8 != 7) goto code_r0x00591120;
    unaff_x21 = (ulong *)puVar9[1];
    puVar11 = &UNK_00590ed0;
    puVar2 = puVar2 + -0x40;
    puVar5 = unaff_x21;
    goto SUB_00590e80;
  }
  if (uVar8 == 8) {
    puVar11 = &UNK_00591114;
    puVar2 = puVar2 + -0x40;
    puVar5 = (ulong *)puVar9[1];
    unaff_x19 = (ulong *)puVar9[1];
    goto SUB_00590e80;
  }
  if (uVar8 == 9) {
    uVar8 = puVar9[1];
    func_0x00590e80(uVar8);
    uVar6 = 0x40;
    uVar7 = 8;
    puVar11 = &UNK_00591080;
    puVar1 = puVar2 + -0x40;
    goto code_r0x00187bd4;
  }
  if (uVar8 == 10) {
    lVar3 = *(long *)puVar9[4];
    *(long *)puVar9[4] = lVar3 + -1;
    LORelease();
    if (lVar3 == 1) {
      func_0x005d2b20();
    }
    uVar8 = puVar9[3];
    if (uVar8 == 0) goto code_r0x0059115c;
    lVar3 = puVar9[2] + 0x18;
    uVar7 = 0xffffffffffffffff;
    goto code_r0x00590f80;
  }
code_r0x00591120:
  uVar8 = puVar9[1] ^ 0x8000000000000000;
  if (1 < uVar8) {
    uVar8 = 2;
  }
  if (uVar8 == 0) {
    return;
  }
  if (uVar8 != 1) {
    unaff_x20 = *(undefined8 *)(puVar2 + -0x20);
    unaff_x22 = *(undefined8 *)(puVar2 + -0x30);
    unaff_x24 = *(undefined8 *)(puVar2 + -0x40);
    unaff_x23 = *(undefined8 *)(puVar2 + -0x38);
    *(undefined8 *)(puVar2 + -0x40) = unaff_x24;
    *(undefined8 *)(puVar2 + -0x38) = unaff_x23;
    *(undefined8 *)(puVar2 + -0x30) = unaff_x22;
    *(undefined8 *)(puVar2 + -0x28) = *(undefined8 *)(puVar2 + -0x28);
    *(undefined8 *)(puVar2 + -0x20) = unaff_x20;
    *(undefined8 *)(puVar2 + -0x18) = *(undefined8 *)(puVar2 + -0x18);
    *(undefined8 *)(puVar2 + -0x10) = *(undefined8 *)(puVar2 + -0x10);
    *(undefined8 *)(puVar2 + -8) = *(undefined8 *)(puVar2 + -8);
    unaff_x29 = puVar2 + -0x10;
    unaff_x21 = (ulong *)puVar9[7];
    puVar11 = &UNK_00591e6c;
    puVar2 = puVar2 + -0x40;
    puVar5 = unaff_x21;
    unaff_x19 = puVar9 + 1;
    goto SUB_00590e80;
  }
  *(undefined8 *)(puVar2 + -0x40) = *(undefined8 *)(puVar2 + -0x40);
  *(undefined8 *)(puVar2 + -0x38) = *(undefined8 *)(puVar2 + -0x38);
  *(undefined8 *)(puVar2 + -0x30) = *(undefined8 *)(puVar2 + -0x30);
  *(undefined8 *)(puVar2 + -0x28) = *(undefined8 *)(puVar2 + -0x28);
  *(undefined8 *)(puVar2 + -0x20) = *(undefined8 *)(puVar2 + -0x20);
  *(undefined8 *)(puVar2 + -0x18) = *(undefined8 *)(puVar2 + -0x18);
  *(undefined8 *)(puVar2 + -0x10) = *(undefined8 *)(puVar2 + -0x10);
  *(undefined8 *)(puVar2 + -8) = *(undefined8 *)(puVar2 + -8);
  unaff_x29 = puVar2 + -0x10;
  uVar8 = puVar9[5];
  func_0x00590e80(uVar8);
  uVar6 = 0x40;
  uVar7 = 8;
  puVar11 = (undefined *)0x591c30;
  puVar1 = puVar2 + -0x40;
  goto code_r0x00187bd4;
code_r0x00591090:
  unaff_x21 = (ulong *)puVar9[4];
  puVar11 = &UNK_0059109c;
  puVar2 = puVar2 + -0x40;
  puVar5 = unaff_x21;
  goto SUB_00590e80;
  while (lVar3 = lVar3 + 0x10, uVar8 != 0) {
code_r0x00590f80:
    uVar8 = uVar8 - 1;
    puVar5 = (ulong *)(lVar3 + -0x10);
    lVar4 = *(long *)*puVar5;
    *(long *)*puVar5 = lVar4 + -1;
    LORelease();
    if (lVar4 == 1) {
      puVar11 = &UNK_00590fa0;
      puVar2 = puVar2 + -0x40;
code_r0x005d2ac4:
      uVar8 = *puVar5;
      uVar6 = *(ulong *)(uVar8 + 0x10);
      if (uVar6 == 0x8000000000000000 || uVar6 == 0) {
        uVar6 = 0x28;
        uVar7 = 8;
        puVar1 = puVar2;
      }
      else {
        puVar1 = puVar2 + -0x20;
        *(undefined8 *)(puVar2 + -0x20) = uVar7;
        *(ulong **)(puVar2 + -0x18) = puVar9;
        *(undefined1 **)(puVar2 + -0x10) = unaff_x29;
        *(undefined **)(puVar2 + -8) = puVar11;
        unaff_x29 = puVar2 + -0x10;
        uVar8 = *(ulong *)(uVar8 + 0x18);
        uVar7 = 1;
        puVar11 = &UNK_005d2b08;
      }
      goto code_r0x00187bd4;
    }
  }
code_r0x0059115c:
  if (puVar9[1] == 0) {
    return;
  }
  uVar8 = puVar9[2];
  uVar6 = puVar9[1] << 4;
code_r0x005911a4:
  uVar7 = 8;
code_r0x005911a8:
  unaff_x29 = *(undefined1 **)(puVar2 + -0x10);
  puVar11 = *(undefined **)(puVar2 + -8);
  puVar1 = puVar2;
code_r0x00187bd4:
  *(undefined1 **)(puVar1 + -0x10) = unaff_x29;
  *(undefined **)(puVar1 + -8) = puVar11;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar8,uVar6,uVar7);
  return;
}

