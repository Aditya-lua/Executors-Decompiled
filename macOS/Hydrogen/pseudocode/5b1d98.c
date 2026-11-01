
/* WARNING: Possible PIC construction at 0x005b1ddc: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005ae1ec: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005ae858: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005b20dc: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x005ae85c) */
/* WARNING: Removing unreachable block (ram,0x005ae864) */
/* WARNING: Removing unreachable block (ram,0x005ae870) */
/* WARNING: Removing unreachable block (ram,0x005ae87c) */
/* WARNING: Removing unreachable block (ram,0x005ae894) */
/* WARNING: Removing unreachable block (ram,0x005ae8bc) */
/* WARNING: Removing unreachable block (ram,0x005ae89c) */
/* WARNING: Removing unreachable block (ram,0x005ae884) */
/* WARNING: Removing unreachable block (ram,0x005ae1f0) */
/* WARNING: Removing unreachable block (ram,0x005ae1fc) */
/* WARNING: Removing unreachable block (ram,0x005ae214) */
/* WARNING: Removing unreachable block (ram,0x005ae23c) */
/* WARNING: Removing unreachable block (ram,0x005ae21c) */
/* WARNING: Removing unreachable block (ram,0x005ae204) */
/* WARNING: Removing unreachable block (ram,0x005b20e0) */

long * FUN_005b1d98(undefined8 param_1)

{
  undefined1 *puVar1;
  long **pplVar2;
  long *plVar3;
  long *extraout_x8;
  ulong uVar4;
  long lVar5;
  undefined8 unaff_x19;
  long lVar6;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  undefined8 unaff_x24;
  long *plVar7;
  undefined1 *puVar8;
  undefined1 *unaff_x29;
  undefined *puVar9;
  long *plStack_80;
  long lStack_78;
  long lStack_70;
  long lStack_68;
  long lStack_60;
  long lStack_58;
  long lStack_50;
  undefined1 auStack_48 [8];
  undefined8 uStack_8;
  
  func_0x0059ce88(unaff_x21 + 0x40);
  lVar5 = unaff_x21 + 0x80;
  while (unaff_x23 = unaff_x23 + -1, unaff_x23 != 0) {
    lVar5 = lVar5 + 0x80;
    func_0x0059e65c();
    unaff_x21 = lVar5;
  }
  puVar1 = (undefined1 *)register0x00000008;
  if (unaff_x22 != 0) {
    uStack_8 = (undefined *)0x5b1de0;
    goto code_r0x00187bd4;
  }
  __Unwind_Resume(param_1);
  plVar3 = (long *)func_0x007a2668();
  pplVar2 = &plStack_80;
  uStack_8 = (undefined *)0x5b1dec;
  puVar8 = auStack_48 + 0x38;
  lVar5 = *plVar3;
  if (lVar5 < 6) {
    if (lVar5 < 3) {
      if (lVar5 == 0) {
        plStack_80 = (long *)plVar3[1];
        *extraout_x8 = (long)&UNK_008b0104;
        extraout_x8[1] = 0x28;
        *(undefined1 *)(extraout_x8 + 2) = 0x10;
        lVar5 = *plStack_80;
        *plStack_80 = lVar5 + -1;
        LORelease();
        if (lVar5 == 1) {
          plVar3 = (long *)func_0x005d2ac4(&plStack_80);
          return plVar3;
        }
        return plVar3;
      }
      if (lVar5 != 1) {
        *extraout_x8 = (long)&UNK_008b0155;
        extraout_x8[1] = 0x27;
        *(undefined1 *)(extraout_x8 + 2) = 0x10;
        plVar3 = plVar3 + 1;
        puVar9 = (undefined *)0x5b1dec;
        pplVar2 = (long **)register0x00000008;
        puVar8 = unaff_x29;
        goto code_r0x005ae1bc;
      }
      lVar5 = plVar3[1];
      plVar3 = (long *)plVar3[2];
      *extraout_x8 = (long)&UNK_008b012c;
      extraout_x8[1] = 0x29;
      *(undefined1 *)(extraout_x8 + 2) = 0x10;
    }
    else {
      if (lVar5 == 3) {
        *extraout_x8 = (long)&UNK_008b017c;
        extraout_x8[1] = 0x2d;
        *(undefined1 *)(extraout_x8 + 2) = 0x10;
        puVar1 = auStack_48 + 8;
        unaff_x29 = auStack_48 + 0x38;
        func_0x005adc80(plVar3[7]);
        uStack_8 = &UNK_005ae85c;
        goto code_r0x00187bd4;
      }
      if (lVar5 == 4) {
        *extraout_x8 = (long)&UNK_008b01a9;
        extraout_x8[1] = 0x29;
        *(undefined1 *)(extraout_x8 + 2) = 0x10;
        return plVar3;
      }
      lVar5 = plVar3[1];
      plVar7 = (long *)plVar3[2];
      lVar6 = plVar3[3];
      *extraout_x8 = (long)&UNK_008b01d2;
      extraout_x8[1] = 0x28;
      *(undefined1 *)(extraout_x8 + 2) = 0x10;
      for (; lVar6 != 0; lVar6 = lVar6 + -1) {
        if (*plVar7 != 0xc) {
          func_0x0059ce88(plVar7);
        }
        plVar3 = (long *)func_0x0059ce88(plVar7 + 8);
        plVar7 = plVar7 + 0x10;
      }
    }
    if (lVar5 == 0) {
      return plVar3;
    }
  }
  else {
    if (lVar5 < 9) {
      if (lVar5 == 6) {
        lVar5 = plVar3[1];
        plVar3 = (long *)plVar3[2];
        *extraout_x8 = (long)&UNK_008b01fa;
        extraout_x8[1] = 0x2a;
        *(undefined1 *)(extraout_x8 + 2) = 0x10;
        uVar4 = lVar5 + 0x8000000000000000;
        if (uVar4 < 5 && uVar4 != 3 || lVar5 == 0) {
          return plVar3;
        }
      }
      else {
        if (lVar5 == 7) {
          lStack_78 = plVar3[2];
          plStack_80 = (long *)plVar3[1];
          *extraout_x8 = (long)&UNK_008b0224;
          extraout_x8[1] = 0x28;
          *(undefined1 *)(extraout_x8 + 2) = 0x10;
          plVar3 = (long *)func_0x005ae2b8(&plStack_80);
          return plVar3;
        }
        lVar5 = plVar3[1];
        *extraout_x8 = (long)&UNK_008b024c;
        extraout_x8[1] = 0x28;
        *(undefined1 *)(extraout_x8 + 2) = 0x10;
        func_0x005adc80(lVar5);
      }
      goto code_r0x00187bd4;
    }
    if (lVar5 == 9) {
      lVar5 = plVar3[1];
      extraout_x8[1] = plVar3[2];
      *extraout_x8 = lVar5;
      extraout_x8[2] = plVar3[3];
      return plVar3;
    }
    if (lVar5 == 10) {
      lStack_78 = plVar3[2];
      plStack_80 = (long *)plVar3[1];
      lStack_68 = plVar3[4];
      lStack_70 = plVar3[3];
      *extraout_x8 = (long)&UNK_008b0274;
      extraout_x8[1] = 0x2a;
      *(undefined1 *)(extraout_x8 + 2) = 0x10;
      plVar3 = (long *)func_0x005ae94c(&plStack_80);
      return plVar3;
    }
    lStack_78 = plVar3[2];
    plStack_80 = (long *)plVar3[1];
    lStack_68 = plVar3[4];
    lStack_70 = plVar3[3];
    lStack_58 = plVar3[6];
    lStack_60 = plVar3[5];
    lStack_50 = plVar3[7];
    *extraout_x8 = (long)&UNK_008b029e;
    extraout_x8[1] = 0x29;
    *(undefined1 *)(extraout_x8 + 2) = 0x10;
    uVar4 = (ulong)plStack_80 ^ 0x8000000000000000;
    if (1 < uVar4) {
      uVar4 = 2;
    }
    if (uVar4 == 0) {
      return plVar3;
    }
    if (uVar4 != 1) {
      plVar3 = (long *)func_0x005ae828(plVar3 + 1);
      return plVar3;
    }
    plVar3 = (long *)((ulong)&plStack_80 | 8);
    puVar9 = &UNK_005b20e0;
code_r0x005ae1bc:
    puVar1 = (undefined1 *)((long)pplVar2 + -0x40);
    *(undefined8 *)((long)pplVar2 + -0x40) = unaff_x24;
    *(undefined8 *)((long)pplVar2 + -0x38) = 0;
    *(undefined8 *)((long)pplVar2 + -0x30) = 0;
    *(long *)((long)pplVar2 + -0x28) = unaff_x21;
    *(undefined8 *)((long)pplVar2 + -0x20) = param_1;
    *(undefined8 *)((long)pplVar2 + -0x18) = unaff_x19;
    *(undefined1 **)((long)pplVar2 + -0x10) = puVar8;
    *(undefined **)((long)pplVar2 + -8) = puVar9;
    unaff_x29 = (undefined1 *)((long)pplVar2 + -0x10);
    func_0x005adc80(plVar3[3]);
    uStack_8 = &UNK_005ae1f0;
  }
code_r0x00187bd4:
  *(undefined1 **)(puVar1 + -0x10) = unaff_x29;
  *(undefined **)(puVar1 + -8) = uStack_8;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  plVar3 = (long *)(*(code *)PTR__free_00a24e58)();
  return plVar3;
}

