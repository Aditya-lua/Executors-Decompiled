
/* WARNING: Possible PIC construction at 0x0053cef8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0053cf14: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0053dbbc: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0053ddf8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0053de1c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0053cfc8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0053d0a8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0053d108: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0053d034: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005d2b04: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0053d038) */
/* WARNING: Removing unreachable block (ram,0x0053d040) */
/* WARNING: Removing unreachable block (ram,0x0053d04c) */
/* WARNING: Removing unreachable block (ram,0x0053d054) */
/* WARNING: Removing unreachable block (ram,0x0053d17c) */
/* WARNING: Removing unreachable block (ram,0x0053d184) */
/* WARNING: Removing unreachable block (ram,0x0053d05c) */
/* WARNING: Removing unreachable block (ram,0x0053d0ac) */
/* WARNING: Removing unreachable block (ram,0x0053cfcc) */
/* WARNING: Removing unreachable block (ram,0x0053ddfc) */
/* WARNING: Removing unreachable block (ram,0x0053de20) */
/* WARNING: Removing unreachable block (ram,0x0053de2c) */
/* WARNING: Removing unreachable block (ram,0x0053de44) */
/* WARNING: Removing unreachable block (ram,0x0053de6c) */
/* WARNING: Removing unreachable block (ram,0x0053de4c) */
/* WARNING: Removing unreachable block (ram,0x0053de34) */
/* WARNING: Removing unreachable block (ram,0x0053de14) */
/* WARNING: Removing unreachable block (ram,0x0053dbc0) */
/* WARNING: Removing unreachable block (ram,0x0053dbcc) */
/* WARNING: Removing unreachable block (ram,0x0053dbe4) */
/* WARNING: Removing unreachable block (ram,0x0053dc0c) */
/* WARNING: Removing unreachable block (ram,0x0053dbec) */
/* WARNING: Removing unreachable block (ram,0x0053dbd4) */
/* WARNING: Removing unreachable block (ram,0x0053cf18) */
/* WARNING: Removing unreachable block (ram,0x0053d10c) */
/* WARNING: Removing unreachable block (ram,0x0053cefc) */
/* WARNING: Removing unreachable block (ram,0x005d2b08) */

void FUN_0053e2b0(void)

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
  
  func_0x004d0c00();
  lVar6 = __Unwind_Resume();
  puStack_8 = (undefined *)0x53e2bc;
  func_0x0053cdb0();
  puVar2 = (undefined1 *)register0x00000008;
  puVar4 = (ulong *)(lVar6 + 0x18);
code_r0x0053ceac:
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
      if (uVar8 == 8) goto code_r0x0053d100;
      if (uVar8 == 9) {
        uVar10 = puVar5[1];
        func_0x0053ceac(uVar10);
        uVar8 = 0x40;
        uVar7 = 8;
        puVar11 = &UNK_0053d0ac;
        puVar1 = puVar2 + -0x40;
        goto code_r0x00187bd4;
      }
      if (uVar8 != 10) goto code_r0x0053d12c;
      lVar6 = *(long *)puVar5[4];
      *(long *)puVar5[4] = lVar6 + -1;
      LORelease();
      if (lVar6 == 1) {
        func_0x005d2b20();
      }
      uVar8 = puVar5[3];
      if (uVar8 == 0) goto code_r0x0053d168;
      lVar6 = puVar5[2] + 0x18;
      uVar7 = 0xffffffffffffffff;
      goto code_r0x0053cfac;
    }
    if (uVar8 == 5) {
      plVar9 = (long *)puVar5[2];
      for (uVar8 = puVar5[3]; uVar8 != 0; uVar8 = uVar8 - 1) {
        if (*plVar9 != 0xc) {
          func_0x00553cb8(plVar9);
        }
        func_0x00553cb8(plVar9 + 8);
        plVar9 = plVar9 + 0x10;
      }
      if (puVar5[1] == 0) {
        return;
      }
      uVar10 = puVar5[2];
      uVar8 = puVar5[1] << 7;
      goto code_r0x0053d114;
    }
    if (uVar8 == 6) {
      uVar8 = puVar5[1];
      if ((long)uVar8 < -0x7ffffffffffffffb) {
        return;
      }
      if (uVar8 == 0) {
        return;
      }
code_r0x0053d084:
      uVar10 = puVar5[2];
      uVar7 = 1;
      goto code_r0x0053d118;
    }
    if (uVar8 != 7) goto code_r0x0053d12c;
    unaff_x21 = (ulong *)puVar5[1];
    puStack_8 = &UNK_0053cefc;
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
      goto code_r0x0053d084;
    }
  }
  else {
    if (uVar8 == 2) {
      puVar5 = puVar5 + 1;
      goto code_r0x0053d154;
    }
    if (uVar8 == 3) {
      uVar10 = puVar5[7];
      func_0x0053ceac(uVar10);
      uVar8 = 0x40;
      uVar7 = 8;
      puVar11 = &UNK_0053d038;
      puVar1 = puVar2 + -0x40;
      goto code_r0x00187bd4;
    }
    if (uVar8 == 4) {
      return;
    }
  }
code_r0x0053d12c:
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
    puStack_8 = &UNK_0053ddfc;
    puVar2 = puVar2 + -0x40;
    puVar4 = unaff_x21;
    goto code_r0x0053ceac;
  }
  puVar5 = puVar5 + 2;
code_r0x0053d154:
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
  func_0x0053ceac(uVar10);
  uVar8 = 0x40;
  uVar7 = 8;
  puVar11 = &UNK_0053dbc0;
  puVar1 = puVar2 + -0x40;
  goto code_r0x00187bd4;
code_r0x0053d100:
  unaff_x19 = (ulong *)puVar5[1];
  puStack_8 = &UNK_0053d10c;
  puVar2 = puVar2 + -0x40;
  puVar4 = unaff_x19;
  goto code_r0x0053ceac;
  while (lVar6 = lVar6 + 0x10, uVar8 != 0) {
code_r0x0053cfac:
    uVar8 = uVar8 - 1;
    puVar4 = (ulong *)(lVar6 + -0x10);
    lVar3 = *(long *)*puVar4;
    *(long *)*puVar4 = lVar3 + -1;
    LORelease();
    if (lVar3 == 1) {
      puVar11 = &UNK_0053cfcc;
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
code_r0x0053d168:
  if (puVar5[1] == 0) {
    return;
  }
  uVar10 = puVar5[2];
  uVar8 = puVar5[1] << 4;
code_r0x0053d114:
  uVar7 = 8;
code_r0x0053d118:
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

