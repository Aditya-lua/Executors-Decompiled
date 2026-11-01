
/* WARNING: Possible PIC construction at 0x003f616c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x003f61a8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x003f61dc: Changing call to branch */

void FUN_003f6154(long *param_1,undefined8 param_2)

{
  long lVar1;
  long *plVar2;
  long unaff_x29;
  undefined8 uStack_20;
  undefined8 uStack_8;
  
  if (*param_1 == 0) {
    plVar2 = (long *)__Unwind_Resume(param_2);
    uStack_8 = 0x3f6178;
    lVar1 = (long)register0x00000008 + -0x10;
    if (*plVar2 == 0x2f) {
      return;
    }
    uStack_20 = param_2;
    if (plVar2[0xb] == 0) {
      if (plVar2[0xe] != 0) {
        func_0x00187bd4(plVar2[0xf],plVar2[0xe] * 0x18,8);
      }
      if (plVar2[0x11] == 0) {
        if (plVar2[0x14] == 0) {
          return;
        }
      }
      else {
        uStack_8 = 0x3f61e0;
        register0x00000008 = (BADSPACEBASE *)&uStack_20;
        unaff_x29 = lVar1;
      }
    }
    else {
      uStack_8 = 0x3f61ac;
      register0x00000008 = (BADSPACEBASE *)&uStack_20;
      unaff_x29 = lVar1;
    }
  }
  else {
    uStack_8 = 0x3f6170;
  }
  *(long *)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined8 *)((long)register0x00000008 + -8) = uStack_8;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

