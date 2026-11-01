
void FUN_0028fb74(void)

{
  uint in_w8;
  uint in_w9;
  long unaff_x19;
  long *plVar1;
  uint unaff_w20;
  undefined8 unaff_x21;
  long unaff_x22;
  long lVar2;
  undefined1 auVar3 [16];
  
  if (in_w8 == in_w9) {
    _free();
  }
  else {
    lVar2 = unaff_x22 + (ulong)in_w8 * 0x18;
    _free(*(undefined8 *)(lVar2 + 8));
    *(undefined8 *)(lVar2 + 8) = unaff_x21;
  }
  if ((unaff_w20 >> 1 & 1) == 0) {
    return;
  }
  if (unaff_x19 == 0) {
    return;
  }
  if (pcRam0000000000a3bef0 == (code *)0x0) {
    plVar1 = (long *)(unaff_x19 + -8);
    if (*plVar1 + 8 != 0) {
      _bzero(plVar1,*plVar1 + 8);
    }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR__free_00a24e58)(plVar1);
    return;
  }
  if (lRam0000000000a3bee0 == 0) {
    func_0x0079fc6c();
  }
  else if (lRam0000000000a3bee8 != 0) {
                    /* WARNING: Could not recover jumptable at 0x0036e428. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*pcRam0000000000a3bef0)();
    return;
  }
  auVar3 = func_0x0079fc90();
  if (auVar3._8_8_ != 0) {
    _bzero(auVar3._0_8_);
  }
  return;
}

