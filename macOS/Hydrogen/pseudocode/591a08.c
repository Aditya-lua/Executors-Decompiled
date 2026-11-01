
/* WARNING: Possible PIC construction at 0x005919dc: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00591c2c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00591c30) */
/* WARNING: Removing unreachable block (ram,0x00591c3c) */
/* WARNING: Removing unreachable block (ram,0x00591c54) */
/* WARNING: Removing unreachable block (ram,0x00591c7c) */
/* WARNING: Removing unreachable block (ram,0x00591c5c) */
/* WARNING: Removing unreachable block (ram,0x00591c44) */

void FUN_00591a08(void)

{
  undefined1 *puVar1;
  long lVar2;
  undefined8 uVar3;
  long *plVar4;
  long unaff_x19;
  undefined8 *unaff_x21;
  long unaff_x22;
  long unaff_x23;
  undefined1 *unaff_x29;
  undefined *puVar5;
  undefined1 auStack_c0 [128];
  
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
  if (*(long *)(unaff_x19 + 0x20) == 0) {
    func_0x00591fa8(unaff_x19 + 0x38);
    plVar4 = *(long **)(unaff_x19 + 0x50);
    lVar2 = *plVar4;
    *plVar4 = lVar2 + -1;
    LORelease();
    if (lVar2 == 1) {
      func_0x005d2c74((undefined8 *)(unaff_x19 + 0x50));
    }
    __Unwind_Resume();
    func_0x007a2668();
    lVar2 = func_0x007a2668();
    puVar1 = auStack_c0 + 0x80;
    unaff_x29 = auStack_c0 + 0xb0;
    uVar3 = *(undefined8 *)(lVar2 + 0x18);
    func_0x00590e80(uVar3);
    lVar2 = 0x40;
    puVar5 = (undefined *)0x591c30;
  }
  else {
    uVar3 = *(undefined8 *)(unaff_x19 + 0x28);
    lVar2 = *(long *)(unaff_x19 + 0x20) << 3;
    puVar5 = &UNK_005919e0;
    puVar1 = (undefined1 *)register0x00000008;
  }
  *(undefined1 **)(puVar1 + -0x10) = unaff_x29;
  *(undefined **)(puVar1 + -8) = puVar5;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar3,lVar2,8);
  return;
}

