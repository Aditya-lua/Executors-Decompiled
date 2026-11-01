
/* WARNING: Possible PIC construction at 0x0056e3ac: Changing call to branch */
/* WARNING: Possible PIC construction at 0x0056e508: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0056e50c) */
/* WARNING: Removing unreachable block (ram,0x0056e518) */
/* WARNING: Removing unreachable block (ram,0x0056e530) */
/* WARNING: Removing unreachable block (ram,0x0056e558) */
/* WARNING: Removing unreachable block (ram,0x0056e538) */
/* WARNING: Removing unreachable block (ram,0x0056e520) */

void FUN_0056e378(undefined8 param_1)

{
  undefined1 *puVar1;
  undefined8 uVar2;
  long lVar3;
  long *plVar4;
  long unaff_x19;
  long unaff_x21;
  long unaff_x22;
  undefined1 *unaff_x29;
  undefined *puVar5;
  undefined1 auStack_c0 [128];
  
  while (unaff_x22 = unaff_x22 + -1, unaff_x22 != 0) {
    func_0x00553cb8(unaff_x21);
    unaff_x21 = unaff_x21 + 0x40;
  }
  if (*(long *)(unaff_x19 + 0x38) == 0) {
    plVar4 = *(long **)(unaff_x19 + 0x50);
    lVar3 = *plVar4;
    *plVar4 = lVar3 + -1;
    LORelease();
    if (lVar3 == 1) {
      func_0x005d2c74((undefined8 *)(unaff_x19 + 0x50));
    }
    __Unwind_Resume(param_1);
    func_0x007a2668();
    lVar3 = func_0x007a2668();
    puVar1 = auStack_c0 + 0x80;
    unaff_x29 = auStack_c0 + 0xb0;
    uVar2 = *(undefined8 *)(lVar3 + 0x18);
    func_0x0056d75c(uVar2);
    lVar3 = 0x40;
    puVar5 = &UNK_0056e50c;
  }
  else {
    uVar2 = *(undefined8 *)(unaff_x19 + 0x40);
    lVar3 = *(long *)(unaff_x19 + 0x38) << 6;
    puVar5 = (undefined *)0x56e3b0;
    puVar1 = (undefined1 *)register0x00000008;
  }
  *(undefined1 **)(puVar1 + -0x10) = unaff_x29;
  *(undefined **)(puVar1 + -8) = puVar5;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar2,lVar3,8);
  return;
}

