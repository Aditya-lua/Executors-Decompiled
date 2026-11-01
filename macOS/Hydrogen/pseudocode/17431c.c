
void FUN_0017431c(void)

{
  int *piVar1;
  long *plVar2;
  long lVar3;
  undefined8 *extraout_x8;
  undefined8 extraout_x9;
  undefined8 uVar4;
  undefined8 extraout_x9_00;
  undefined8 extraout_x9_01;
  undefined8 extraout_x9_02;
  code *extraout_x10;
  code *extraout_x10_00;
  code *extraout_x10_01;
  code *extraout_x10_02;
  code *pcVar5;
  undefined8 extraout_x11;
  
  func_0x00187bd4();
  piVar1 = (int *)__Unwind_Resume();
  if (*piVar1 == 1) {
    plVar2 = (long *)(*pcRam0000000000a2bc58)(piVar1,0xa2bc58);
    uVar4 = extraout_x9;
    if (*plVar2 != 1) {
      if (*plVar2 == 2) {
        return;
      }
      func_0x0079a048(0);
      uVar4 = 0xa2bc58;
    }
    lVar3 = (*extraout_x10)(uVar4);
    if (*(long *)(lVar3 + 8) == 0) {
      lVar3 = (*extraout_x10_00)(extraout_x9_00);
      uVar4 = extraout_x9_01;
      pcVar5 = extraout_x10_01;
      if (*(long *)(lVar3 + 0x20) != 0) {
        lVar3 = (*extraout_x10_01)(extraout_x9_01);
        *(undefined8 *)(lVar3 + 0x20) = extraout_x11;
        *extraout_x8 = 0;
        uVar4 = extraout_x9_02;
        pcVar5 = extraout_x10_02;
      }
      lVar3 = (*pcVar5)(uVar4);
      *(undefined8 *)(lVar3 + 8) = 0;
    }
  }
  return;
}

