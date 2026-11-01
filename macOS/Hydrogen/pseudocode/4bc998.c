
/* WARNING: Possible PIC construction at 0x004bb540: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004bb55c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004bc180: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004bc4c8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004bc4ec: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004bb610: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004bb6f0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004bb750: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004bb67c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005d2b04: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x004bb680) */
/* WARNING: Removing unreachable block (ram,0x004bb688) */
/* WARNING: Removing unreachable block (ram,0x004bb694) */
/* WARNING: Removing unreachable block (ram,0x004bb69c) */
/* WARNING: Removing unreachable block (ram,0x004bb7c4) */
/* WARNING: Removing unreachable block (ram,0x004bb7cc) */
/* WARNING: Removing unreachable block (ram,0x004bb6a4) */
/* WARNING: Removing unreachable block (ram,0x004bb6f4) */
/* WARNING: Removing unreachable block (ram,0x004bb614) */
/* WARNING: Removing unreachable block (ram,0x004bc4cc) */
/* WARNING: Removing unreachable block (ram,0x004bc4f0) */
/* WARNING: Removing unreachable block (ram,0x004bc4fc) */
/* WARNING: Removing unreachable block (ram,0x004bc514) */
/* WARNING: Removing unreachable block (ram,0x004bc53c) */
/* WARNING: Removing unreachable block (ram,0x004bc51c) */
/* WARNING: Removing unreachable block (ram,0x004bc504) */
/* WARNING: Removing unreachable block (ram,0x004bc4e4) */
/* WARNING: Removing unreachable block (ram,0x004bc184) */
/* WARNING: Removing unreachable block (ram,0x004bc190) */
/* WARNING: Removing unreachable block (ram,0x004bc1a8) */
/* WARNING: Removing unreachable block (ram,0x004bc1d0) */
/* WARNING: Removing unreachable block (ram,0x004bc1b0) */
/* WARNING: Removing unreachable block (ram,0x004bc198) */
/* WARNING: Removing unreachable block (ram,0x004bb560) */
/* WARNING: Removing unreachable block (ram,0x004bb754) */
/* WARNING: Removing unreachable block (ram,0x004bb544) */
/* WARNING: Removing unreachable block (ram,0x005d2b08) */

void FUN_004bc998(void)

{
  undefined1 *puVar1;
  undefined1 *puVar2;
  long lVar3;
  ulong *puVar4;
  ulong *puVar5;
  long lVar6;
  undefined8 uVar7;
  ulong uVar8;
  ulong *unaff_x19;
  long *plVar9;
  ulong uVar10;
  undefined8 unaff_x20;
  ulong *unaff_x21;
  undefined8 unaff_x22;
  undefined8 unaff_x23;
  undefined8 unaff_x24;
  undefined1 *unaff_x29;
  undefined *puVar11;
  undefined *puStack_8;
  
  __Unwind_Resume();
  lVar6 = func_0x007a2668();
  puStack_8 = (undefined *)0x4bc9a0;
  func_0x004bb3f8();
  puVar2 = (undefined1 *)register0x00000008;
  puVar4 = (ulong *)(lVar6 + 0x18);
code_r0x004bb4f4:
  while( true ) {
    puVar5 = puVar4;
    *(undefined8 *)(puVar2 + -0x40) = unaff_x24;
    *(undefined8 *)(puVar2 + -0x38) = unaff_x23;
    *(undefined8 *)(puVar2 + -0x30) = unaff_x22;
    *(ulong **)(puVar2 + -0x28) = unaff_x21;
    *(undefined8 *)(puVar2 + -0x20) = unaff_x20;
    *(ulong **)(puVar2 + -0x18) = unaff_x19;
    *(undefined1 **)(puVar2 + -0x10) = unaff_x29;
    *(undefined **)(puVar2 + -8) = puStack_8;
    unaff_x29 = puVar2 + -0x10;
    uVar8 = *puVar5;
    if ((long)uVar8 < 5) break;
    if (7 < (long)uVar8) {
      if (uVar8 == 8) goto code_r0x004bb748;
      if (uVar8 == 9) {
        uVar10 = puVar5[1];
        func_0x004bb4f4(uVar10);
        uVar8 = 0x40;
        uVar7 = 8;
        puVar11 = &UNK_004bb6f4;
        puVar1 = puVar2 + -0x40;
        goto code_r0x00187bd4;
      }
      if (uVar8 != 10) goto code_r0x004bb774;
      lVar6 = *(long *)puVar5[4];
      *(long *)puVar5[4] = lVar6 + -1;
      LORelease();
      if (lVar6 == 1) {
        func_0x005d2b20();
      }
      uVar8 = puVar5[3];
      if (uVar8 == 0) goto code_r0x004bb7b0;
      lVar6 = puVar5[2] + 0x18;
      uVar7 = 0xffffffffffffffff;
      goto code_r0x004bb5f4;
    }
    if (uVar8 == 5) {
      plVar9 = (long *)puVar5[2];
      for (uVar8 = puVar5[3]; uVar8 != 0; uVar8 = uVar8 - 1) {
        if (*plVar9 != 0xc) {
          func_0x004ca6d8(plVar9);
        }
        func_0x004ca6d8(plVar9 + 8);
        plVar9 = plVar9 + 0x10;
      }
      if (puVar5[1] == 0) {
        return;
      }
      uVar10 = puVar5[2];
      uVar8 = puVar5[1] << 7;
      goto code_r0x004bb75c;
    }
    if (uVar8 == 6) {
      uVar8 = puVar5[1];
      if ((long)uVar8 < -0x7ffffffffffffffb) {
        return;
      }
      if (uVar8 == 0) {
        return;
      }
code_r0x004bb6cc:
      uVar10 = puVar5[2];
      uVar7 = 1;
      goto code_r0x004bb760;
    }
    if (uVar8 != 7) goto code_r0x004bb774;
    unaff_x21 = (ulong *)puVar5[1];
    puStack_8 = &UNK_004bb544;
    puVar2 = puVar2 + -0x40;
    puVar4 = unaff_x21;
    unaff_x19 = puVar5;
  }
  if ((long)uVar8 < 2) {
    if (uVar8 == 0) {
      puVar4 = puVar5 + 1;
      lVar6 = *(long *)*puVar4;
      *(long *)*puVar4 = lVar6 + -1;
      LORelease();
      if (lVar6 != 1) {
        return;
      }
      unaff_x29 = *(undefined1 **)(puVar2 + -0x10);
      puVar11 = *(undefined **)(puVar2 + -8);
      uVar7 = *(undefined8 *)(puVar2 + -0x20);
      puVar5 = *(ulong **)(puVar2 + -0x18);
      goto code_r0x005d2ac4;
    }
    if (uVar8 == 1) {
      uVar8 = puVar5[1];
      if (uVar8 == 0) {
        return;
      }
      goto code_r0x004bb6cc;
    }
  }
  else {
    if (uVar8 == 2) {
      puVar5 = puVar5 + 1;
      goto code_r0x004bb79c;
    }
    if (uVar8 == 3) {
      uVar10 = puVar5[7];
      func_0x004bb4f4(uVar10);
      uVar8 = 0x40;
      uVar7 = 8;
      puVar11 = &UNK_004bb680;
      puVar1 = puVar2 + -0x40;
      goto code_r0x00187bd4;
    }
    if (uVar8 == 4) {
      return;
    }
  }
code_r0x004bb774:
  unaff_x19 = puVar5 + 1;
  uVar8 = *unaff_x19 ^ 0x8000000000000000;
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
    unaff_x21 = (ulong *)puVar5[7];
    puStack_8 = &UNK_004bc4cc;
    puVar2 = puVar2 + -0x40;
    puVar4 = unaff_x21;
    goto code_r0x004bb4f4;
  }
  puVar5 = puVar5 + 2;
code_r0x004bb79c:
  *(undefined8 *)(puVar2 + -0x40) = *(undefined8 *)(puVar2 + -0x40);
  *(undefined8 *)(puVar2 + -0x38) = *(undefined8 *)(puVar2 + -0x38);
  *(undefined8 *)(puVar2 + -0x30) = *(undefined8 *)(puVar2 + -0x30);
  *(undefined8 *)(puVar2 + -0x28) = *(undefined8 *)(puVar2 + -0x28);
  *(undefined8 *)(puVar2 + -0x20) = *(undefined8 *)(puVar2 + -0x20);
  *(undefined8 *)(puVar2 + -0x18) = *(undefined8 *)(puVar2 + -0x18);
  *(undefined8 *)(puVar2 + -0x10) = *(undefined8 *)(puVar2 + -0x10);
  *(undefined8 *)(puVar2 + -8) = *(undefined8 *)(puVar2 + -8);
  unaff_x29 = puVar2 + -0x10;
  uVar10 = puVar5[3];
  func_0x004bb4f4(uVar10);
  uVar8 = 0x40;
  uVar7 = 8;
  puVar11 = &UNK_004bc184;
  puVar1 = puVar2 + -0x40;
  goto code_r0x00187bd4;
code_r0x004bb748:
  unaff_x19 = (ulong *)puVar5[1];
  puStack_8 = &UNK_004bb754;
  puVar2 = puVar2 + -0x40;
  puVar4 = unaff_x19;
  goto code_r0x004bb4f4;
  while (lVar6 = lVar6 + 0x10, uVar8 != 0) {
code_r0x004bb5f4:
    uVar8 = uVar8 - 1;
    puVar4 = (ulong *)(lVar6 + -0x10);
    lVar3 = *(long *)*puVar4;
    *(long *)*puVar4 = lVar3 + -1;
    LORelease();
    if (lVar3 == 1) {
      puVar11 = &UNK_004bb614;
      puVar2 = puVar2 + -0x40;
code_r0x005d2ac4:
      uVar10 = *puVar4;
      uVar8 = *(ulong *)(uVar10 + 0x10);
      if (uVar8 == 0x8000000000000000 || uVar8 == 0) {
        uVar8 = 0x28;
        uVar7 = 8;
        puVar1 = puVar2;
      }
      else {
        puVar1 = puVar2 + -0x20;
        *(undefined8 *)(puVar2 + -0x20) = uVar7;
        *(ulong **)(puVar2 + -0x18) = puVar5;
        *(undefined1 **)(puVar2 + -0x10) = unaff_x29;
        *(undefined **)(puVar2 + -8) = puVar11;
        unaff_x29 = puVar2 + -0x10;
        uVar10 = *(ulong *)(uVar10 + 0x18);
        uVar7 = 1;
        puVar11 = &UNK_005d2b08;
      }
      goto code_r0x00187bd4;
    }
  }
code_r0x004bb7b0:
  if (puVar5[1] == 0) {
    return;
  }
  uVar10 = puVar5[2];
  uVar8 = puVar5[1] << 4;
code_r0x004bb75c:
  uVar7 = 8;
code_r0x004bb760:
  unaff_x29 = *(undefined1 **)(puVar2 + -0x10);
  puVar11 = *(undefined **)(puVar2 + -8);
  puVar1 = puVar2;
code_r0x00187bd4:
  *(undefined1 **)(puVar1 + -0x10) = unaff_x29;
  *(undefined **)(puVar1 + -8) = puVar11;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar10,uVar8,uVar7);
  return;
}

