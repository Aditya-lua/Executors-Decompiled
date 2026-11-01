
/* WARNING: Possible PIC construction at 0x0047b44c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0047b468: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0047a260: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0047a27c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0047afa4: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0047b284: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0047b2a8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0047a330: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0047a410: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0047a4a4: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0047a39c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0047a42c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005d2b04: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0047a430) */
/* WARNING: Removing unreachable block (ram,0x0047a448) */
/* WARNING: Removing unreachable block (ram,0x0047a514) */
/* WARNING: Removing unreachable block (ram,0x0047a51c) */
/* WARNING: Removing unreachable block (ram,0x0047a450) */
/* WARNING: Removing unreachable block (ram,0x0047a3a0) */
/* WARNING: Removing unreachable block (ram,0x0047a3a8) */
/* WARNING: Removing unreachable block (ram,0x0047a3b4) */
/* WARNING: Removing unreachable block (ram,0x0047a3bc) */
/* WARNING: Removing unreachable block (ram,0x0047a504) */
/* WARNING: Removing unreachable block (ram,0x0047a50c) */
/* WARNING: Removing unreachable block (ram,0x0047a520) */
/* WARNING: Removing unreachable block (ram,0x0047a3c4) */
/* WARNING: Removing unreachable block (ram,0x0047a414) */
/* WARNING: Removing unreachable block (ram,0x0047a334) */
/* WARNING: Removing unreachable block (ram,0x0047b288) */
/* WARNING: Removing unreachable block (ram,0x0047b2ac) */
/* WARNING: Removing unreachable block (ram,0x0047b2b8) */
/* WARNING: Removing unreachable block (ram,0x0047b2d0) */
/* WARNING: Removing unreachable block (ram,0x0047b2f8) */
/* WARNING: Removing unreachable block (ram,0x0047b2d8) */
/* WARNING: Removing unreachable block (ram,0x0047b2c0) */
/* WARNING: Removing unreachable block (ram,0x0047b2a0) */
/* WARNING: Removing unreachable block (ram,0x0047afa8) */
/* WARNING: Removing unreachable block (ram,0x0047afb4) */
/* WARNING: Removing unreachable block (ram,0x0047afcc) */
/* WARNING: Removing unreachable block (ram,0x0047aff4) */
/* WARNING: Removing unreachable block (ram,0x0047afd4) */
/* WARNING: Removing unreachable block (ram,0x0047afbc) */
/* WARNING: Removing unreachable block (ram,0x0047a280) */
/* WARNING: Removing unreachable block (ram,0x0047a4a8) */
/* WARNING: Removing unreachable block (ram,0x0047a264) */
/* WARNING: Removing unreachable block (ram,0x0047b46c) */
/* WARNING: Removing unreachable block (ram,0x0047b450) */
/* WARNING: Removing unreachable block (ram,0x005d2b08) */

void FUN_0047b444(void)

{
  ulong *puVar1;
  undefined1 *puVar2;
  undefined1 *puVar3;
  long lVar4;
  long lVar5;
  ulong uVar6;
  undefined8 uVar7;
  ulong uVar8;
  ulong *unaff_x19;
  ulong *puVar9;
  long *plVar10;
  ulong *puVar11;
  ulong *unaff_x21;
  undefined8 unaff_x22;
  undefined8 unaff_x23;
  undefined8 unaff_x24;
  undefined1 *unaff_x29;
  undefined *puVar12;
  
  puVar11 = (ulong *)unaff_x19[1];
  puVar12 = (undefined *)0x47b450;
  puVar3 = (undefined1 *)register0x00000008;
  puVar1 = puVar11;
code_r0x0047a214:
  puVar9 = puVar1;
  *(undefined8 *)(puVar3 + -0x40) = unaff_x24;
  *(undefined8 *)(puVar3 + -0x38) = unaff_x23;
  *(undefined8 *)(puVar3 + -0x30) = unaff_x22;
  *(ulong **)(puVar3 + -0x28) = unaff_x21;
  *(ulong **)(puVar3 + -0x20) = puVar11;
  *(ulong **)(puVar3 + -0x18) = unaff_x19;
  *(undefined1 **)(puVar3 + -0x10) = unaff_x29;
  *(undefined **)(puVar3 + -8) = puVar12;
  unaff_x29 = puVar3 + -0x10;
  uVar8 = *puVar9;
  unaff_x19 = puVar9;
  if ((long)uVar8 < 5) {
    if (1 < (long)uVar8) {
      if (uVar8 == 2) goto code_r0x0047a424;
      if (uVar8 != 3) {
        if (uVar8 == 4) {
          return;
        }
        goto code_r0x0047a4b4;
      }
      uVar8 = puVar9[7];
      func_0x0047a214(uVar8);
      uVar6 = 0x40;
      uVar7 = 8;
      puVar12 = &UNK_0047a3a0;
      puVar2 = puVar3 + -0x40;
      goto code_r0x00187bd4;
    }
    if (uVar8 == 0) {
      puVar11 = puVar9 + 1;
      lVar4 = *(long *)*puVar11;
      *(long *)*puVar11 = lVar4 + -1;
      LORelease();
      if (lVar4 != 1) {
        return;
      }
      unaff_x29 = *(undefined1 **)(puVar3 + -0x10);
      puVar12 = *(undefined **)(puVar3 + -8);
      uVar7 = *(undefined8 *)(puVar3 + -0x20);
      puVar9 = *(ulong **)(puVar3 + -0x18);
      goto code_r0x005d2ac4;
    }
    if (uVar8 != 1) goto code_r0x0047a4b4;
    uVar6 = puVar9[1];
    if (uVar6 == 0) {
      return;
    }
code_r0x0047a3ec:
    uVar8 = puVar9[2];
    uVar7 = 1;
    goto code_r0x0047a53c;
  }
  if ((long)uVar8 < 8) {
    if (uVar8 == 5) {
      plVar10 = (long *)puVar9[2];
      for (uVar8 = puVar9[3]; uVar8 != 0; uVar8 = uVar8 - 1) {
        if (*plVar10 != 0xc) {
          func_0x00488078(plVar10);
        }
        func_0x00488078(plVar10 + 8);
        plVar10 = plVar10 + 0x10;
      }
      if (puVar9[1] == 0) {
        return;
      }
      uVar8 = puVar9[2];
      uVar6 = puVar9[1] << 7;
      goto code_r0x0047a538;
    }
    if (uVar8 == 6) {
      uVar6 = puVar9[1];
      if ((long)uVar6 < -0x7ffffffffffffffb) {
        return;
      }
      if (uVar6 == 0) {
        return;
      }
      goto code_r0x0047a3ec;
    }
    if (uVar8 != 7) goto code_r0x0047a4b4;
    unaff_x21 = (ulong *)puVar9[1];
    puVar12 = &UNK_0047a264;
    puVar3 = puVar3 + -0x40;
    puVar1 = unaff_x21;
    goto code_r0x0047a214;
  }
  if (uVar8 == 8) {
    puVar12 = &UNK_0047a4a8;
    puVar3 = puVar3 + -0x40;
    puVar1 = (ulong *)puVar9[1];
    unaff_x19 = (ulong *)puVar9[1];
    goto code_r0x0047a214;
  }
  if (uVar8 == 9) {
    uVar8 = puVar9[1];
    func_0x0047a214(uVar8);
    uVar6 = 0x40;
    uVar7 = 8;
    puVar12 = &UNK_0047a414;
    puVar2 = puVar3 + -0x40;
    goto code_r0x00187bd4;
  }
  if (uVar8 == 10) {
    lVar4 = *(long *)puVar9[4];
    *(long *)puVar9[4] = lVar4 + -1;
    LORelease();
    if (lVar4 == 1) {
      func_0x005d2b20();
    }
    uVar8 = puVar9[3];
    if (uVar8 == 0) goto code_r0x0047a4f0;
    lVar4 = puVar9[2] + 0x18;
    uVar7 = 0xffffffffffffffff;
    goto code_r0x0047a314;
  }
code_r0x0047a4b4:
  uVar8 = puVar9[1] ^ 0x8000000000000000;
  if (1 < uVar8) {
    uVar8 = 2;
  }
  if (uVar8 == 0) {
    return;
  }
  if (uVar8 != 1) {
    puVar11 = *(ulong **)(puVar3 + -0x20);
    unaff_x22 = *(undefined8 *)(puVar3 + -0x30);
    unaff_x24 = *(undefined8 *)(puVar3 + -0x40);
    unaff_x23 = *(undefined8 *)(puVar3 + -0x38);
    *(undefined8 *)(puVar3 + -0x40) = unaff_x24;
    *(undefined8 *)(puVar3 + -0x38) = unaff_x23;
    *(undefined8 *)(puVar3 + -0x30) = unaff_x22;
    *(undefined8 *)(puVar3 + -0x28) = *(undefined8 *)(puVar3 + -0x28);
    *(ulong **)(puVar3 + -0x20) = puVar11;
    *(undefined8 *)(puVar3 + -0x18) = *(undefined8 *)(puVar3 + -0x18);
    *(undefined8 *)(puVar3 + -0x10) = *(undefined8 *)(puVar3 + -0x10);
    *(undefined8 *)(puVar3 + -8) = *(undefined8 *)(puVar3 + -8);
    unaff_x29 = puVar3 + -0x10;
    unaff_x21 = (ulong *)puVar9[7];
    puVar12 = &UNK_0047b288;
    puVar3 = puVar3 + -0x40;
    puVar1 = unaff_x21;
    unaff_x19 = puVar9 + 1;
    goto code_r0x0047a214;
  }
  *(undefined8 *)(puVar3 + -0x40) = *(undefined8 *)(puVar3 + -0x40);
  *(undefined8 *)(puVar3 + -0x38) = *(undefined8 *)(puVar3 + -0x38);
  *(undefined8 *)(puVar3 + -0x30) = *(undefined8 *)(puVar3 + -0x30);
  *(undefined8 *)(puVar3 + -0x28) = *(undefined8 *)(puVar3 + -0x28);
  *(undefined8 *)(puVar3 + -0x20) = *(undefined8 *)(puVar3 + -0x20);
  *(undefined8 *)(puVar3 + -0x18) = *(undefined8 *)(puVar3 + -0x18);
  *(undefined8 *)(puVar3 + -0x10) = *(undefined8 *)(puVar3 + -0x10);
  *(undefined8 *)(puVar3 + -8) = *(undefined8 *)(puVar3 + -8);
  unaff_x29 = puVar3 + -0x10;
  uVar8 = puVar9[5];
  func_0x0047a214(uVar8);
  uVar6 = 0x40;
  uVar7 = 8;
  puVar12 = &UNK_0047afa8;
  puVar2 = puVar3 + -0x40;
  goto code_r0x00187bd4;
code_r0x0047a424:
  unaff_x21 = (ulong *)puVar9[4];
  puVar12 = &UNK_0047a430;
  puVar3 = puVar3 + -0x40;
  puVar1 = unaff_x21;
  goto code_r0x0047a214;
  while (lVar4 = lVar4 + 0x10, uVar8 != 0) {
code_r0x0047a314:
    uVar8 = uVar8 - 1;
    puVar11 = (ulong *)(lVar4 + -0x10);
    lVar5 = *(long *)*puVar11;
    *(long *)*puVar11 = lVar5 + -1;
    LORelease();
    if (lVar5 == 1) {
      puVar12 = &UNK_0047a334;
      puVar3 = puVar3 + -0x40;
code_r0x005d2ac4:
      uVar8 = *puVar11;
      uVar6 = *(ulong *)(uVar8 + 0x10);
      if (uVar6 == 0x8000000000000000 || uVar6 == 0) {
        uVar6 = 0x28;
        uVar7 = 8;
        puVar2 = puVar3;
      }
      else {
        puVar2 = puVar3 + -0x20;
        *(undefined8 *)(puVar3 + -0x20) = uVar7;
        *(ulong **)(puVar3 + -0x18) = puVar9;
        *(undefined1 **)(puVar3 + -0x10) = unaff_x29;
        *(undefined **)(puVar3 + -8) = puVar12;
        unaff_x29 = puVar3 + -0x10;
        uVar8 = *(ulong *)(uVar8 + 0x18);
        uVar7 = 1;
        puVar12 = &UNK_005d2b08;
      }
      goto code_r0x00187bd4;
    }
  }
code_r0x0047a4f0:
  if (puVar9[1] == 0) {
    return;
  }
  uVar8 = puVar9[2];
  uVar6 = puVar9[1] << 4;
code_r0x0047a538:
  uVar7 = 8;
code_r0x0047a53c:
  unaff_x29 = *(undefined1 **)(puVar3 + -0x10);
  puVar12 = *(undefined **)(puVar3 + -8);
  puVar2 = puVar3;
code_r0x00187bd4:
  *(undefined1 **)(puVar2 + -0x10) = unaff_x29;
  *(undefined **)(puVar2 + -8) = puVar12;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar8,uVar6,uVar7);
  return;
}

