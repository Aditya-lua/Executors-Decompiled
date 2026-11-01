
/* WARNING: Possible PIC construction at 0x004ea05c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004ea090: Changing call to branch */
/* WARNING: Possible PIC construction at 0x004ea108: Changing call to branch */

void FUN_004ea030(void)

{
  undefined1 *puVar1;
  undefined1 in_ZR;
  long lVar2;
  long *plVar3;
  long lVar4;
  long lVar5;
  undefined8 uVar6;
  long unaff_x19;
  long unaff_x21;
  long unaff_x22;
  undefined1 *unaff_x29;
  undefined1 auStack_c0 [128];
  undefined8 uStack_8;
  
  while (!(bool)in_ZR) {
    func_0x00489dec(unaff_x21);
    unaff_x22 = unaff_x22 + -1;
    unaff_x21 = unaff_x21 + 0x20;
    in_ZR = unaff_x22 == 0;
  }
  if (*(long *)(unaff_x19 + 0x38) == 0) {
    func_0x0049c600();
    func_0x004e9e80(*(undefined8 *)(unaff_x19 + 0x68),*(undefined8 *)(unaff_x19 + 0x70));
    lVar5 = *(long *)(unaff_x19 + 0x50);
    if ((lVar5 < -0x7ffffffffffffffe) || (lVar5 == 0)) {
      func_0x00187bd4();
      __Unwind_Resume();
      func_0x007a2668();
      plVar3 = (long *)func_0x007a2668();
      uStack_8 = 0x4ea0b4;
      puVar1 = auStack_c0;
      lVar2 = plVar3[1];
      lVar5 = plVar3[2] + 1;
      lVar4 = lVar2;
      while (lVar5 = lVar5 + -1, lVar5 != 0) {
        func_0x004df40c(lVar4);
        lVar4 = lVar4 + 600;
      }
      if (*plVar3 == 0) {
        if (plVar3[3] == 0) {
          return;
        }
        lVar2 = plVar3[4];
        lVar5 = plVar3[3] << 5;
        uVar6 = 8;
      }
      else {
        lVar5 = *plVar3 * 600;
        uVar6 = 8;
        uStack_8 = 0x4ea10c;
        register0x00000008 = (BADSPACEBASE *)(auStack_c0 + 0x80);
        unaff_x29 = puVar1 + 0xb0;
      }
    }
    else {
      lVar2 = *(long *)(unaff_x19 + 0x58);
      uVar6 = 1;
      uStack_8 = 0x4ea094;
    }
  }
  else {
    lVar2 = *(long *)(unaff_x19 + 0x40);
    lVar5 = *(long *)(unaff_x19 + 0x38) << 5;
    uVar6 = 8;
    uStack_8 = 0x4ea060;
  }
  *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined8 *)((long)register0x00000008 + -8) = uStack_8;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar2,lVar5,uVar6);
  return;
}

