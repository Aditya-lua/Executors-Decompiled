
/* WARNING: Possible PIC construction at 0x00564a20: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00564a3c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0056571c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00565958: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0056597c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00564af0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00564bd0: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00564c64: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00564b5c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00564bec: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005d2b04: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00564bf0) */
/* WARNING: Removing unreachable block (ram,0x00564c08) */
/* WARNING: Removing unreachable block (ram,0x00564cd4) */
/* WARNING: Removing unreachable block (ram,0x00564cdc) */
/* WARNING: Removing unreachable block (ram,0x00564c10) */
/* WARNING: Removing unreachable block (ram,0x00564b60) */
/* WARNING: Removing unreachable block (ram,0x00564b68) */
/* WARNING: Removing unreachable block (ram,0x00564b74) */
/* WARNING: Removing unreachable block (ram,0x00564b7c) */
/* WARNING: Removing unreachable block (ram,0x00564cc4) */
/* WARNING: Removing unreachable block (ram,0x00564ccc) */
/* WARNING: Removing unreachable block (ram,0x00564ce0) */
/* WARNING: Removing unreachable block (ram,0x00564b84) */
/* WARNING: Removing unreachable block (ram,0x00564bd4) */
/* WARNING: Removing unreachable block (ram,0x00564af4) */
/* WARNING: Removing unreachable block (ram,0x0056595c) */
/* WARNING: Removing unreachable block (ram,0x00565980) */
/* WARNING: Removing unreachable block (ram,0x0056598c) */
/* WARNING: Removing unreachable block (ram,0x005659a4) */
/* WARNING: Removing unreachable block (ram,0x005659cc) */
/* WARNING: Removing unreachable block (ram,0x005659ac) */
/* WARNING: Removing unreachable block (ram,0x00565994) */
/* WARNING: Removing unreachable block (ram,0x00565974) */
/* WARNING: Removing unreachable block (ram,0x00565720) */
/* WARNING: Removing unreachable block (ram,0x0056572c) */
/* WARNING: Removing unreachable block (ram,0x00565744) */
/* WARNING: Removing unreachable block (ram,0x0056576c) */
/* WARNING: Removing unreachable block (ram,0x0056574c) */
/* WARNING: Removing unreachable block (ram,0x00565734) */
/* WARNING: Removing unreachable block (ram,0x00564a40) */
/* WARNING: Removing unreachable block (ram,0x00564c68) */
/* WARNING: Removing unreachable block (ram,0x00564a24) */
/* WARNING: Removing unreachable block (ram,0x005d2b08) */

void FUN_00565b00(ulong *param_1)

{
  undefined1 *puVar1;
  undefined1 *puVar2;
  long lVar3;
  long lVar4;
  ulong *puVar5;
  ulong uVar6;
  undefined8 uVar7;
  ulong uVar8;
  ulong *puVar9;
  long *plVar10;
  ulong *unaff_x21;
  undefined8 unaff_x22;
  undefined8 unaff_x23;
  undefined8 unaff_x24;
  undefined1 *unaff_x29;
  undefined *puVar11;
  undefined *unaff_x30;
  undefined8 in_stack_00000000;
  ulong *in_stack_00000008;
  undefined1 uStack0000000000000020;
  
  puVar2 = &uStack0000000000000020;
code_r0x005649d4:
  puVar9 = param_1;
  *(undefined8 *)(puVar2 + -0x40) = unaff_x24;
  *(undefined8 *)(puVar2 + -0x38) = unaff_x23;
  *(undefined8 *)(puVar2 + -0x30) = unaff_x22;
  *(ulong **)(puVar2 + -0x28) = unaff_x21;
  *(undefined8 *)(puVar2 + -0x20) = in_stack_00000000;
  *(ulong **)(puVar2 + -0x18) = in_stack_00000008;
  *(undefined1 **)(puVar2 + -0x10) = unaff_x29;
  *(undefined **)(puVar2 + -8) = unaff_x30;
  unaff_x29 = puVar2 + -0x10;
  uVar8 = *puVar9;
  in_stack_00000008 = puVar9;
  if ((long)uVar8 < 5) {
    if (1 < (long)uVar8) {
      if (uVar8 == 2) goto code_r0x00564be4;
      if (uVar8 != 3) {
        if (uVar8 == 4) {
          return;
        }
        goto code_r0x00564c74;
      }
      uVar8 = puVar9[7];
      func_0x005649d4(uVar8);
      uVar6 = 0x40;
      uVar7 = 8;
      puVar11 = &UNK_00564b60;
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
    if (uVar8 != 1) goto code_r0x00564c74;
    uVar6 = puVar9[1];
    if (uVar6 == 0) {
      return;
    }
code_r0x00564bac:
    uVar8 = puVar9[2];
    uVar7 = 1;
    goto code_r0x00564cfc;
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
      goto code_r0x00564cf8;
    }
    if (uVar8 == 6) {
      uVar6 = puVar9[1];
      if ((long)uVar6 < -0x7ffffffffffffffb) {
        return;
      }
      if (uVar6 == 0) {
        return;
      }
      goto code_r0x00564bac;
    }
    if (uVar8 != 7) goto code_r0x00564c74;
    unaff_x21 = (ulong *)puVar9[1];
    unaff_x30 = &UNK_00564a24;
    puVar2 = puVar2 + -0x40;
    param_1 = unaff_x21;
    goto code_r0x005649d4;
  }
  if (uVar8 == 8) {
    unaff_x30 = &UNK_00564c68;
    puVar2 = puVar2 + -0x40;
    param_1 = (ulong *)puVar9[1];
    in_stack_00000008 = (ulong *)puVar9[1];
    goto code_r0x005649d4;
  }
  if (uVar8 == 9) {
    uVar8 = puVar9[1];
    func_0x005649d4(uVar8);
    uVar6 = 0x40;
    uVar7 = 8;
    puVar11 = &UNK_00564bd4;
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
    if (uVar8 == 0) goto code_r0x00564cb0;
    lVar3 = puVar9[2] + 0x18;
    uVar7 = 0xffffffffffffffff;
    goto code_r0x00564ad4;
  }
code_r0x00564c74:
  uVar8 = puVar9[1] ^ 0x8000000000000000;
  if (1 < uVar8) {
    uVar8 = 2;
  }
  if (uVar8 == 0) {
    return;
  }
  if (uVar8 != 1) {
    in_stack_00000000 = *(undefined8 *)(puVar2 + -0x20);
    unaff_x22 = *(undefined8 *)(puVar2 + -0x30);
    unaff_x24 = *(undefined8 *)(puVar2 + -0x40);
    unaff_x23 = *(undefined8 *)(puVar2 + -0x38);
    *(undefined8 *)(puVar2 + -0x40) = unaff_x24;
    *(undefined8 *)(puVar2 + -0x38) = unaff_x23;
    *(undefined8 *)(puVar2 + -0x30) = unaff_x22;
    *(undefined8 *)(puVar2 + -0x28) = *(undefined8 *)(puVar2 + -0x28);
    *(undefined8 *)(puVar2 + -0x20) = in_stack_00000000;
    *(undefined8 *)(puVar2 + -0x18) = *(undefined8 *)(puVar2 + -0x18);
    *(undefined8 *)(puVar2 + -0x10) = *(undefined8 *)(puVar2 + -0x10);
    *(undefined8 *)(puVar2 + -8) = *(undefined8 *)(puVar2 + -8);
    unaff_x29 = puVar2 + -0x10;
    unaff_x21 = (ulong *)puVar9[7];
    unaff_x30 = &UNK_0056595c;
    puVar2 = puVar2 + -0x40;
    param_1 = unaff_x21;
    in_stack_00000008 = puVar9 + 1;
    goto code_r0x005649d4;
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
  func_0x005649d4(uVar8);
  uVar6 = 0x40;
  uVar7 = 8;
  puVar11 = &UNK_00565720;
  puVar1 = puVar2 + -0x40;
  goto code_r0x00187bd4;
code_r0x00564be4:
  unaff_x21 = (ulong *)puVar9[4];
  unaff_x30 = &UNK_00564bf0;
  puVar2 = puVar2 + -0x40;
  param_1 = unaff_x21;
  goto code_r0x005649d4;
  while (lVar3 = lVar3 + 0x10, uVar8 != 0) {
code_r0x00564ad4:
    uVar8 = uVar8 - 1;
    puVar5 = (ulong *)(lVar3 + -0x10);
    lVar4 = *(long *)*puVar5;
    *(long *)*puVar5 = lVar4 + -1;
    LORelease();
    if (lVar4 == 1) {
      puVar11 = &UNK_00564af4;
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
code_r0x00564cb0:
  if (puVar9[1] == 0) {
    return;
  }
  uVar8 = puVar9[2];
  uVar6 = puVar9[1] << 4;
code_r0x00564cf8:
  uVar7 = 8;
code_r0x00564cfc:
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

