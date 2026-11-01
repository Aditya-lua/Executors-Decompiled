
/* WARNING: Possible PIC construction at 0x00221d4c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00221d14: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00221cdc: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00221d18) */
/* WARNING: Removing unreachable block (ram,0x00221ce0) */
/* WARNING: Removing unreachable block (ram,0x00221ce8) */
/* WARNING: Removing unreachable block (ram,0x00221cec) */

void FUN_00221c20(void)

{
  undefined1 *puVar1;
  long lVar2;
  long lVar3;
  long *plVar4;
  long *unaff_x19;
  undefined1 *puVar5;
  undefined1 *unaff_x29;
  undefined1 auStack_a0 [128];
  undefined8 uStack_8;
  
  if (*unaff_x19 != -0x8000000000000000) {
    func_0x00222b5c();
  }
  func_0x00209524(unaff_x19 + 0x19);
  func_0x00221a70(unaff_x19 + 0x12);
  plVar4 = (long *)unaff_x19[0x32];
  if (plVar4 != (long *)0x0) {
    lVar2 = *plVar4;
    *plVar4 = lVar2 + -1;
    LORelease();
    if (lVar2 == 1) {
      DataMemoryBarrier(2,1);
      func_0x001fa0f4(unaff_x19 + 0x32);
    }
  }
  __Unwind_Resume();
  plVar4 = (long *)func_0x007a2668();
  puVar1 = auStack_a0 + 0x80;
  uStack_8 = 0x221c78;
  puVar5 = auStack_a0 + 0x90;
  lVar2 = *plVar4;
  if (lVar2 == -0x7ffffffffffffffe) {
    return;
  }
  if (-0x7fffffffffffffff < lVar2 && lVar2 != 0) {
    lVar3 = plVar4[1];
    uStack_8 = 0x221ce0;
    goto code_r0x00187bd4;
  }
  lVar2 = plVar4[0x1f];
  if (lVar2 < -0x7ffffffffffffffe || lVar2 == 0) {
    lVar2 = plVar4[0x3e];
    if (-0x7fffffffffffffff < lVar2 && lVar2 != 0) {
LAB_00221d0c:
      lVar3 = plVar4[0x3f];
      uStack_8 = 0x221d18;
      puVar1 = auStack_a0 + 0x80;
      goto code_r0x00187bd4;
    }
  }
  else {
    func_0x00187bd4(plVar4[0x20],lVar2,1);
    lVar2 = plVar4[0x3e];
    if (-0x7fffffffffffffff < lVar2 && lVar2 != 0) goto LAB_00221d0c;
  }
  lVar2 = plVar4[0x5d];
  if ((-0x7fffffffffffffff < lVar2) && (lVar2 != 0)) {
    func_0x00187bd4(plVar4[0x5e],lVar2,1);
  }
  lVar2 = plVar4[0x7c];
  if ((lVar2 < -0x7ffffffffffffffe) || (lVar2 == 0)) {
    lVar2 = plVar4[0x9b];
    if ((lVar2 < -0x7ffffffffffffffe) || (lVar2 == 0)) {
      return;
    }
    lVar3 = plVar4[0x9c];
    puVar1 = (undefined1 *)register0x00000008;
    puVar5 = unaff_x29;
  }
  else {
    lVar3 = plVar4[0x7d];
    uStack_8 = 0x221d50;
    puVar1 = auStack_a0 + 0x80;
  }
code_r0x00187bd4:
  *(undefined1 **)(puVar1 + -0x10) = puVar5;
  *(undefined8 *)(puVar1 + -8) = uStack_8;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar3,lVar2,1);
  return;
}

