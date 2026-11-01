
undefined8 FUN_001bc2bc(void)

{
  undefined8 uVar1;
  long lVar2;
  long unaff_x20;
  undefined8 auStack_48 [2];
  undefined8 uStack_38;
  
  uVar1 = func_0x007a28b0();
  if (unaff_x20 != 0) {
    func_0x00187bd4();
  }
  lVar2 = __Unwind_Resume(uVar1);
  auStack_48[0] = 0;
  uStack_38 = 0;
  if ((*(ulong *)(lVar2 + 0x48) & 0x7ffffffffffffff) == 0) {
    func_0x001e189c(auStack_48);
    return 0;
  }
                    /* WARNING: Could not recover jumptable at 0x001bc338. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar1 = (*(code *)(&LAB_001bc33c +
                    (ulong)(byte)(&UNK_0081dc0e)[*(ushort *)(*(long *)(lVar2 + 0x40) + 0x18)] * 4))
                    ();
  return uVar1;
}

