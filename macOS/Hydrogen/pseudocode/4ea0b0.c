
/* WARNING: Possible PIC construction at 0x004ea108: Changing call to branch */

void FUN_004ea0b0(void)

{
  undefined1 *puVar1;
  long *plVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  undefined1 *unaff_x29;
  undefined1 auStack_c0 [128];
  undefined8 uStack_8;
  
  plVar2 = (long *)func_0x007a2668();
  uStack_8 = 0x4ea0b4;
  puVar1 = auStack_c0;
  lVar4 = plVar2[1];
  lVar5 = plVar2[2] + 1;
  lVar3 = lVar4;
  while (lVar5 = lVar5 + -1, lVar5 != 0) {
    func_0x004df40c(lVar3);
    lVar3 = lVar3 + 600;
  }
  if (*plVar2 == 0) {
    if (plVar2[3] == 0) {
      return;
    }
    lVar4 = plVar2[4];
    lVar5 = plVar2[3] << 5;
  }
  else {
    lVar5 = *plVar2 * 600;
    uStack_8 = 0x4ea10c;
    register0x00000008 = (BADSPACEBASE *)(auStack_c0 + 0x80);
    unaff_x29 = puVar1 + 0xb0;
  }
  *(undefined1 **)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined8 *)((long)register0x00000008 + -8) = uStack_8;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar4,lVar5,8);
  return;
}

