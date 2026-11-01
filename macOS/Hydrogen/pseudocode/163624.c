
void FUN_00163624(void)

{
  undefined8 uVar1;
  undefined8 in_x4;
  undefined8 in_x5;
  undefined8 in_x6;
  undefined8 in_x7;
  long *extraout_x8;
  long lStack_88;
  long lStack_80;
  undefined8 *puStack_78;
  long lStack_70;
  long lStack_68;
  long lStack_60;
  long lStack_58;
  
  uVar1 = __Unwind_Resume();
  func_0x00164d68();
  __Unwind_Resume(uVar1);
  func_0x007a2668();
  func_0x00161a88(&lStack_88);
  if (lStack_88 == -0x7fffffffffffffd9) {
    (*(code *)puStack_78[4])(extraout_x8,lStack_80,in_x4,in_x5,in_x6,in_x7);
    if ((code *)*puStack_78 != (code *)0x0) {
      (*(code *)*puStack_78)(lStack_80);
    }
    if (puStack_78[1] != 0) {
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR__free_00a24e58)(lStack_80,puStack_78[1],puStack_78[2]);
      return;
    }
  }
  else {
    extraout_x8[4] = lStack_68;
    extraout_x8[3] = lStack_70;
    extraout_x8[6] = lStack_58;
    extraout_x8[5] = lStack_60;
    *extraout_x8 = lStack_88;
    extraout_x8[1] = lStack_80;
    extraout_x8[2] = (long)puStack_78;
  }
  return;
}

