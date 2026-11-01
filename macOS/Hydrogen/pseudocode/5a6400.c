
/* WARNING: Possible PIC construction at 0x005a6558: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005a65c4: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005a6570: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005a6588: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x005a6574) */
/* WARNING: Removing unreachable block (ram,0x005a655c) */
/* WARNING: Removing unreachable block (ram,0x005a658c) */
/* WARNING: Removing unreachable block (ram,0x005a6620) */
/* WARNING: Removing unreachable block (ram,0x005a6594) */
/* WARNING: Removing unreachable block (ram,0x005a6624) */

void FUN_005a6400(void)

{
  ulong uVar1;
  undefined1 *puVar2;
  undefined1 *puVar3;
  ulong *puVar4;
  ulong *puVar5;
  ulong uVar6;
  ulong uVar7;
  long lVar8;
  ulong *unaff_x19;
  undefined8 unaff_x20;
  ulong *unaff_x21;
  undefined8 unaff_x22;
  ulong unaff_x23;
  undefined8 unaff_x24;
  undefined8 unaff_x25;
  undefined8 unaff_x26;
  undefined1 *unaff_x29;
  undefined8 uVar9;
  undefined *puVar10;
  undefined1 uStack0000000000000058;
  
  func_0x0059e200();
  func_0x0059e2bc(&uStack0000000000000058);
  __Unwind_Resume();
  uVar9 = 0x5a64a8;
  puVar4 = (ulong *)func_0x007a2668();
  puVar3 = (undefined1 *)register0x00000008;
  while( true ) {
    while( true ) {
      puVar5 = puVar4;
      puVar2 = puVar3 + -0xa0;
      *(undefined8 *)(puVar3 + -0x50) = unaff_x26;
      *(undefined8 *)(puVar3 + -0x48) = unaff_x25;
      *(undefined8 *)(puVar3 + -0x40) = unaff_x24;
      *(ulong *)(puVar3 + -0x38) = unaff_x23;
      *(undefined8 *)(puVar3 + -0x30) = unaff_x22;
      *(ulong **)(puVar3 + -0x28) = unaff_x21;
      *(undefined8 *)(puVar3 + -0x20) = unaff_x20;
      *(ulong **)(puVar3 + -0x18) = unaff_x19;
      *(undefined1 **)(puVar3 + -0x10) = unaff_x29;
      *(undefined8 *)(puVar3 + -8) = uVar9;
      unaff_x29 = puVar3 + -0x10;
      unaff_x23 = *puVar5;
      uVar6 = unaff_x23 ^ 0x8000000000000000;
      if (0xb < uVar6) {
        uVar6 = 6;
      }
      if ((long)uVar6 < 7) break;
      if (uVar6 != 7) {
        if ((uVar6 != 8) && (uVar6 != 9)) {
          return;
        }
        *(undefined8 *)(puVar3 + -0x20) = *(undefined8 *)(puVar3 + -0x20);
        *(undefined8 *)(puVar3 + -0x18) = *(undefined8 *)(puVar3 + -0x18);
        *(undefined8 *)(puVar3 + -0x10) = *(undefined8 *)(puVar3 + -0x10);
        *(undefined8 *)(puVar3 + -8) = *(undefined8 *)(puVar3 + -8);
        uVar6 = puVar5[1];
        if (uVar6 == 0) {
          uVar7 = 0;
        }
        else {
          uVar1 = puVar5[2];
          uVar7 = puVar5[3];
          *(undefined8 *)(puVar3 + -0x80) = 0;
          *(ulong *)(puVar3 + -0x78) = uVar6;
          *(ulong *)(puVar3 + -0x70) = uVar1;
          *(undefined8 *)(puVar3 + -0x60) = 0;
          *(ulong *)(puVar3 + -0x58) = uVar6;
          *(ulong *)(puVar3 + -0x50) = uVar1;
        }
        uVar6 = (ulong)(uVar6 != 0);
        *(ulong *)(puVar3 + -0x88) = uVar6;
        *(ulong *)(puVar3 + -0x68) = uVar6;
        *(ulong *)(puVar3 + -0x48) = uVar7;
        func_0x005c7190(puVar3 + -0x40,puVar3 + -0x88);
        lVar8 = *(long *)(puVar3 + -0x40);
        while (lVar8 != 0) {
          *(undefined1 **)(puVar3 + -0x28) = puVar3 + -0x88;
          func_0x005c6384(lVar8 + *(long *)(puVar3 + -0x30) * 0x30);
          func_0x005c7190(puVar3 + -0x40,puVar3 + -0x88);
          lVar8 = *(long *)(puVar3 + -0x40);
        }
        return;
      }
      uVar9 = 0x5a655c;
      puVar3 = puVar3 + -0xa0;
      puVar4 = (ulong *)puVar5[1];
      unaff_x19 = (ulong *)puVar5[1];
    }
    if (uVar6 != 5) break;
    unaff_x21 = (ulong *)puVar5[1];
    uVar9 = 0x5a6574;
    puVar3 = puVar3 + -0xa0;
    puVar4 = unaff_x21;
    unaff_x19 = puVar5;
  }
  if (uVar6 != 6) {
    return;
  }
  uVar6 = puVar5[1];
  lVar8 = puVar5[2] + 1;
  uVar7 = uVar6;
  while (lVar8 = lVar8 + -1, lVar8 != 0) {
    func_0x0059dd3c(uVar7);
    uVar7 = uVar7 + 0x30;
  }
  if (unaff_x23 == 0) {
    uVar6 = puVar5[4];
    lVar8 = puVar5[5] + 1;
    uVar7 = uVar6;
    while (lVar8 = lVar8 + -1, lVar8 != 0) {
      func_0x0059dd3c(uVar7);
      uVar7 = uVar7 + 0x30;
    }
    unaff_x23 = puVar5[3];
    if (unaff_x23 == 0) {
      return;
    }
    unaff_x29 = *(undefined1 **)(puVar3 + -0x10);
    puVar10 = *(undefined **)(puVar3 + -8);
    puVar2 = puVar3;
  }
  else {
    puVar10 = &UNK_005a65c8;
  }
  *(undefined1 **)(puVar2 + -0x10) = unaff_x29;
  *(undefined **)(puVar2 + -8) = puVar10;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar6,unaff_x23 * 0x30,8);
  return;
}

