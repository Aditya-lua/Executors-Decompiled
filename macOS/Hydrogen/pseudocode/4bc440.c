
/* WARNING: Possible PIC construction at 0x004bc440: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004bb550: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004bc170: Changing call to branch */
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
/* WARNING: Removing unreachable block (ram,0x004bc174) */
/* WARNING: Removing unreachable block (ram,0x004bc190) */
/* WARNING: Removing unreachable block (ram,0x004bc1a8) */
/* WARNING: Removing unreachable block (ram,0x004bc1d0) */
/* WARNING: Removing unreachable block (ram,0x004bc1b0) */
/* WARNING: Removing unreachable block (ram,0x004bc198) */
/* WARNING: Removing unreachable block (ram,0x004bb554) */
/* WARNING: Removing unreachable block (ram,0x004bb754) */
/* WARNING: Removing unreachable block (ram,0x004bc444) */
/* WARNING: Removing unreachable block (ram,0x005d2b08) */

void FUN_004bc440(ulong *param_1)

{
  undefined1 *puVar1;
  undefined1 *puVar2;
  long lVar3;
  long lVar4;
  ulong *puVar5;
  undefined8 uVar6;
  ulong uVar7;
  ulong *unaff_x19;
  long *plVar8;
  ulong *unaff_x20;
  ulong uVar9;
  ulong *unaff_x21;
  undefined8 unaff_x22;
  undefined8 unaff_x23;
  undefined8 unaff_x24;
  undefined1 *unaff_x29;
  undefined *puVar10;
  code *pcVar11;
  
  pcVar11 = FUN_004bc440 + 4;
  puVar2 = (undefined1 *)register0x00000008;
code_r0x004bb4f4:
  *(undefined8 *)(puVar2 + -0x40) = unaff_x24;
  *(undefined8 *)(puVar2 + -0x38) = unaff_x23;
  *(undefined8 *)(puVar2 + -0x30) = unaff_x22;
  *(ulong **)(puVar2 + -0x28) = unaff_x21;
  *(ulong **)(puVar2 + -0x20) = unaff_x20;
  *(ulong **)(puVar2 + -0x18) = unaff_x19;
  *(undefined1 **)(puVar2 + -0x10) = unaff_x29;
  *(code **)(puVar2 + -8) = pcVar11;
  unaff_x29 = puVar2 + -0x10;
  uVar7 = *param_1;
  if (4 < (long)uVar7) {
    if ((long)uVar7 < 8) {
      if (uVar7 == 5) {
        plVar8 = (long *)param_1[2];
        for (uVar7 = param_1[3]; uVar7 != 0; uVar7 = uVar7 - 1) {
          if (*plVar8 != 0xc) {
            func_0x004ca6d8(plVar8);
          }
          func_0x004ca6d8(plVar8 + 8);
          plVar8 = plVar8 + 0x10;
        }
        if (param_1[1] == 0) {
          return;
        }
        uVar9 = param_1[2];
        uVar7 = param_1[1] << 7;
        goto code_r0x004bb75c;
      }
      if (uVar7 == 6) {
        uVar7 = param_1[1];
        if ((long)uVar7 < -0x7ffffffffffffffb) {
          return;
        }
        goto joined_r0x004bb6c8;
      }
      if (uVar7 != 7) goto code_r0x004bb774;
      uVar9 = param_1[1];
      func_0x004bb4f4(uVar9);
      uVar7 = 0x40;
      uVar6 = 8;
      puVar10 = &UNK_004bb554;
      puVar1 = puVar2 + -0x40;
      goto code_r0x00187bd4;
    }
    if (uVar7 == 8) goto code_r0x004bb748;
    if (uVar7 == 9) {
      uVar9 = param_1[1];
      func_0x004bb4f4(uVar9);
      uVar7 = 0x40;
      uVar6 = 8;
      puVar10 = &UNK_004bb6f4;
      puVar1 = puVar2 + -0x40;
      goto code_r0x00187bd4;
    }
    if (uVar7 != 10) goto code_r0x004bb774;
    lVar3 = *(long *)param_1[4];
    *(long *)param_1[4] = lVar3 + -1;
    LORelease();
    if (lVar3 == 1) {
      func_0x005d2b20();
    }
    uVar7 = param_1[3];
    if (uVar7 == 0) goto code_r0x004bb7b0;
    lVar3 = param_1[2] + 0x18;
    uVar6 = 0xffffffffffffffff;
    goto code_r0x004bb5f4;
  }
  if ((long)uVar7 < 2) {
    if (uVar7 == 0) {
      puVar5 = param_1 + 1;
      lVar3 = *(long *)*puVar5;
      *(long *)*puVar5 = lVar3 + -1;
      LORelease();
      if (lVar3 != 1) {
        return;
      }
      unaff_x29 = *(undefined1 **)(puVar2 + -0x10);
      puVar10 = *(undefined **)(puVar2 + -8);
      uVar6 = *(undefined8 *)(puVar2 + -0x20);
      param_1 = *(ulong **)(puVar2 + -0x18);
      goto code_r0x005d2ac4;
    }
    if (uVar7 == 1) {
      uVar7 = param_1[1];
joined_r0x004bb6c8:
      if (uVar7 == 0) {
        return;
      }
      uVar9 = param_1[2];
      uVar6 = 1;
      goto code_r0x004bb760;
    }
code_r0x004bb774:
    unaff_x19 = param_1 + 1;
    uVar7 = *unaff_x19 ^ 0x8000000000000000;
    if (1 < uVar7) {
      uVar7 = 2;
    }
    if (uVar7 == 0) {
      return;
    }
    if (uVar7 != 1) {
      unaff_x20 = *(ulong **)(puVar2 + -0x20);
      unaff_x22 = *(undefined8 *)(puVar2 + -0x30);
      unaff_x24 = *(undefined8 *)(puVar2 + -0x40);
      unaff_x23 = *(undefined8 *)(puVar2 + -0x38);
      *(undefined8 *)(puVar2 + -0x40) = unaff_x24;
      *(undefined8 *)(puVar2 + -0x38) = unaff_x23;
      *(undefined8 *)(puVar2 + -0x30) = unaff_x22;
      *(undefined8 *)(puVar2 + -0x28) = *(undefined8 *)(puVar2 + -0x28);
      *(ulong **)(puVar2 + -0x20) = unaff_x20;
      *(undefined8 *)(puVar2 + -0x18) = *(undefined8 *)(puVar2 + -0x18);
      *(undefined8 *)(puVar2 + -0x10) = *(undefined8 *)(puVar2 + -0x10);
      *(undefined8 *)(puVar2 + -8) = *(undefined8 *)(puVar2 + -8);
      unaff_x29 = puVar2 + -0x10;
      param_1 = (ulong *)param_1[7];
      pcVar11 = (code *)0x4bc4cc;
      puVar2 = puVar2 + -0x40;
      unaff_x21 = param_1;
      goto code_r0x004bb4f4;
    }
    unaff_x19 = param_1 + 2;
  }
  else {
    if (uVar7 != 2) {
      if (uVar7 != 3) {
        if (uVar7 == 4) {
          return;
        }
        goto code_r0x004bb774;
      }
      uVar9 = param_1[7];
      func_0x004bb4f4(uVar9);
      uVar7 = 0x40;
      uVar6 = 8;
      puVar10 = &UNK_004bb680;
      puVar1 = puVar2 + -0x40;
      goto code_r0x00187bd4;
    }
    unaff_x19 = param_1 + 1;
  }
  unaff_x22 = *(undefined8 *)(puVar2 + -0x30);
  unaff_x21 = *(ulong **)(puVar2 + -0x28);
  unaff_x24 = *(undefined8 *)(puVar2 + -0x40);
  unaff_x23 = *(undefined8 *)(puVar2 + -0x38);
  *(undefined8 *)(puVar2 + -0x40) = unaff_x24;
  *(undefined8 *)(puVar2 + -0x38) = unaff_x23;
  *(undefined8 *)(puVar2 + -0x30) = unaff_x22;
  *(ulong **)(puVar2 + -0x28) = unaff_x21;
  *(undefined8 *)(puVar2 + -0x20) = *(undefined8 *)(puVar2 + -0x20);
  *(undefined8 *)(puVar2 + -0x18) = *(undefined8 *)(puVar2 + -0x18);
  *(undefined8 *)(puVar2 + -0x10) = *(undefined8 *)(puVar2 + -0x10);
  *(undefined8 *)(puVar2 + -8) = *(undefined8 *)(puVar2 + -8);
  unaff_x29 = puVar2 + -0x10;
  param_1 = (ulong *)unaff_x19[3];
  pcVar11 = (code *)&UNK_004bc174;
  puVar2 = puVar2 + -0x40;
  unaff_x20 = param_1;
  goto code_r0x004bb4f4;
code_r0x004bb748:
  param_1 = (ulong *)param_1[1];
  pcVar11 = (code *)&UNK_004bb754;
  puVar2 = puVar2 + -0x40;
  unaff_x19 = param_1;
  goto code_r0x004bb4f4;
  while (lVar3 = lVar3 + 0x10, uVar7 != 0) {
code_r0x004bb5f4:
    uVar7 = uVar7 - 1;
    puVar5 = (ulong *)(lVar3 + -0x10);
    lVar4 = *(long *)*puVar5;
    *(long *)*puVar5 = lVar4 + -1;
    LORelease();
    if (lVar4 == 1) {
      puVar10 = &UNK_004bb614;
      puVar2 = puVar2 + -0x40;
code_r0x005d2ac4:
      uVar9 = *puVar5;
      uVar7 = *(ulong *)(uVar9 + 0x10);
      if (uVar7 == 0x8000000000000000 || uVar7 == 0) {
        uVar7 = 0x28;
        uVar6 = 8;
        puVar1 = puVar2;
      }
      else {
        puVar1 = puVar2 + -0x20;
        *(undefined8 *)(puVar2 + -0x20) = uVar6;
        *(ulong **)(puVar2 + -0x18) = param_1;
        *(undefined1 **)(puVar2 + -0x10) = unaff_x29;
        *(undefined **)(puVar2 + -8) = puVar10;
        unaff_x29 = puVar2 + -0x10;
        uVar9 = *(ulong *)(uVar9 + 0x18);
        uVar6 = 1;
        puVar10 = &UNK_005d2b08;
      }
      goto code_r0x00187bd4;
    }
  }
code_r0x004bb7b0:
  if (param_1[1] == 0) {
    return;
  }
  uVar9 = param_1[2];
  uVar7 = param_1[1] << 4;
code_r0x004bb75c:
  uVar6 = 8;
code_r0x004bb760:
  unaff_x29 = *(undefined1 **)(puVar2 + -0x10);
  puVar10 = *(undefined **)(puVar2 + -8);
  puVar1 = puVar2;
code_r0x00187bd4:
  *(undefined1 **)(puVar1 + -0x10) = unaff_x29;
  *(undefined **)(puVar1 + -8) = puVar10;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar9,uVar7,uVar6);
  return;
}

