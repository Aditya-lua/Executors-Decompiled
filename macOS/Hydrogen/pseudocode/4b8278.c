
/* WARNING: Possible PIC construction at 0x004b82e0: Changing call to branch */

void FUN_004b8278(long param_1)

{
  long lVar1;
  undefined8 uVar2;
  undefined8 *puVar3;
  long unaff_x19;
  long lVar4;
  undefined8 *puVar5;
  long unaff_x23;
  undefined8 *in_stack_00000008;
  
  while( true ) {
    func_0x004b77d0(param_1);
    unaff_x23 = unaff_x23 + -1;
    if (unaff_x23 == 0) break;
    param_1 = unaff_x19;
    unaff_x19 = unaff_x19 + 0x18;
  }
  if (in_stack_00000008[2] == 0) {
    __Unwind_Resume();
    func_0x007a2668();
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
    lVar4 = puVar3[2];
    if (lVar4 == 0) {
      return;
    }
    uVar2 = *puVar3;
  }
  else {
    uVar2 = *in_stack_00000008;
    lVar4 = in_stack_00000008[2] * 3;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar2,lVar4 << 3,8);
  return;
}

