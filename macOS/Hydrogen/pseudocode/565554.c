
/* WARNING: Possible PIC construction at 0x0056553c: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0056571c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00565540) */
/* WARNING: Removing unreachable block (ram,0x00565720) */
/* WARNING: Removing unreachable block (ram,0x0056572c) */
/* WARNING: Removing unreachable block (ram,0x00565744) */
/* WARNING: Removing unreachable block (ram,0x0056576c) */
/* WARNING: Removing unreachable block (ram,0x0056574c) */
/* WARNING: Removing unreachable block (ram,0x00565734) */

void thunk_FUN_00565564(void)

{
  undefined1 *puVar1;
  long lVar2;
  long lVar3;
  long *unaff_x19;
  undefined8 *unaff_x21;
  long unaff_x22;
  long unaff_x23;
  undefined1 *unaff_x29;
  undefined *puVar4;
  undefined1 auStack_c0 [128];
  undefined1 auStack_6 [6];
  
  do {
    lVar2 = *(long *)*unaff_x21;
    *(long *)*unaff_x21 = lVar2 + unaff_x23;
    LORelease();
    if (lVar2 == 1) {
      func_0x005d2ac4(unaff_x21);
    }
    unaff_x21 = unaff_x21 + 1;
    unaff_x22 = unaff_x22 + -1;
  } while (unaff_x22 != 0);
  if (*unaff_x19 == 0) {
    __Unwind_Resume();
    func_0x007a2668();
    lVar2 = func_0x007a2668();
    puVar1 = auStack_c0 + 0x80;
    unaff_x29 = auStack_6 + -10;
    lVar2 = *(long *)(lVar2 + 0x18);
    func_0x005649d4(lVar2);
    lVar3 = 0x40;
    puVar4 = (undefined *)0x565720;
  }
  else {
    lVar2 = unaff_x19[1];
    lVar3 = *unaff_x19 << 3;
    puVar4 = &UNK_00565540;
    puVar1 = (undefined1 *)register0x00000008;
  }
  *(undefined1 **)(puVar1 + -0x10) = unaff_x29;
  *(undefined **)(puVar1 + -8) = puVar4;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar2,lVar3,8);
  return;
}

