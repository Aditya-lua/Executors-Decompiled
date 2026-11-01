
/* WARNING: Possible PIC construction at 0x005a90d8: Changing call to branch */
/* WARNING: Possible PIC construction at 0x005a9114: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x005a9118) */

void FUN_005a8fb4(void)

{
  undefined8 **ppuVar1;
  long lVar2;
  undefined8 uVar3;
  undefined8 *puVar4;
  long unaff_x19;
  long *unaff_x21;
  undefined8 *unaff_x22;
  long unaff_x23;
  long unaff_x24;
  undefined1 *unaff_x29;
  undefined *puVar5;
  undefined8 *puStack_30;
  undefined1 auStack_6 [6];
  
  do {
    func_0x005d2ac4(unaff_x22);
    do {
      unaff_x22 = unaff_x22 + 2;
      unaff_x23 = unaff_x23 + -1;
      if (unaff_x23 == 0) {
        if (*unaff_x21 == 0) {
          __Unwind_Resume();
          puVar4 = (undefined8 *)func_0x007a2668();
          ppuVar1 = &puStack_30;
          unaff_x29 = auStack_6 + -10;
          uVar3 = *puVar4;
          puStack_30 = unaff_x22;
          func_0x005a8ab4(uVar3);
          lVar2 = 0x40;
          puVar5 = &UNK_005a9118;
        }
        else {
          uVar3 = *(undefined8 *)(unaff_x19 + 0x10);
          lVar2 = *unaff_x21 << 4;
          puVar5 = &LAB_005a90dc;
          ppuVar1 = (undefined8 **)register0x00000008;
        }
        *(undefined1 **)((long)ppuVar1 + -0x10) = unaff_x29;
        *(undefined **)((long)ppuVar1 + -8) = puVar5;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)PTR__free_00a24e58)(uVar3,lVar2,8);
        return;
      }
      lVar2 = *(long *)*unaff_x22;
      *(long *)*unaff_x22 = lVar2 + unaff_x24;
      LORelease();
    } while (lVar2 != 1);
  } while( true );
}

