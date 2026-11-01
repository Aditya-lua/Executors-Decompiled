
/* WARNING: Possible PIC construction at 0x0059cc54: Changing call to branch */

void FUN_0059cc2c(void)

{
  undefined1 *puVar1;
  long *plVar2;
  long lVar3;
  long lVar4;
  undefined1 *unaff_x29;
  undefined8 uVar5;
  undefined1 auStack_a0 [128];
  undefined1 auStack_6 [6];
  
  plVar2 = (long *)func_0x007a2668();
  puVar1 = auStack_6;
  lVar3 = *plVar2;
  if ((lVar3 == 0) || (lVar4 = plVar2[2], lVar4 == 0)) {
    lVar3 = plVar2[4];
    if ((lVar3 == 0) || (lVar4 = plVar2[6], lVar4 == 0)) {
      return;
    }
    uVar5 = 0x59cc30;
  }
  else {
    uVar5 = 0x59cc58;
    register0x00000008 = (BADSPACEBASE *)(auStack_a0 + 0x80);
    unaff_x29 = puVar1 + -10;
  }
  *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined8 *)((long)register0x00000008 + -8) = uVar5;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar3,lVar4,1);
  return;
}

