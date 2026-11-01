
/* WARNING: Possible PIC construction at 0x005928bc: Changing call to branch */

void FUN_00592890(void)

{
  long lVar1;
  undefined8 uVar2;
  undefined8 *puVar3;
  long lVar4;
  undefined8 *unaff_x19;
  undefined8 *puVar5;
  long unaff_x22;
  
  while (unaff_x22 = unaff_x22 + -1, unaff_x22 != 0) {
    func_0x00592224();
  }
  if (unaff_x19[2] == 0) {
    __Unwind_Resume();
    puVar3 = (undefined8 *)func_0x007a2668();
    puVar5 = (undefined8 *)puVar3[1];
    if (puVar3[3] - (long)puVar5 != 0) {
      lVar4 = 1 - ((ulong)(puVar3[3] - (long)puVar5) >> 3);
      do {
        lVar1 = *(long *)*puVar5;
        *(long *)*puVar5 = lVar1 + -1;
        LORelease();
        if (lVar1 == 1) {
          func_0x005d2ac4(puVar5);
        }
        puVar5 = puVar5 + 1;
        lVar4 = lVar4 + 1;
      } while (lVar4 != 1);
    }
    if (puVar3[2] == 0) {
      return;
    }
    uVar2 = *puVar3;
    lVar4 = puVar3[2] << 3;
  }
  else {
    uVar2 = *unaff_x19;
    lVar4 = unaff_x19[2] << 4;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar2,lVar4,8);
  return;
}

