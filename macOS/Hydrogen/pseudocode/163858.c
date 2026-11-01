
void FUN_00163858(void)

{
  long lVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  undefined8 *puVar5;
  undefined8 uVar6;
  undefined8 in_x3;
  undefined8 in_x4;
  undefined8 in_x5;
  undefined8 in_x6;
  long *extraout_x8;
  long lStack_98;
  long lStack_90;
  long lStack_88;
  long lStack_80;
  long lStack_78;
  undefined8 *puStack_70;
  long lStack_68;
  
  func_0x00187bd4();
  uVar6 = __Unwind_Resume();
  func_0x00164d68();
  __Unwind_Resume(uVar6);
  func_0x007a2668();
  func_0x00162910(&lStack_98);
  puVar5 = puStack_70;
  lVar4 = lStack_78;
  lVar3 = lStack_80;
  lVar2 = lStack_88;
  lVar1 = lStack_90;
  if (lStack_98 == -0x7fffffffffffffd9) {
    (*(code *)puStack_70[4])(&lStack_98,lStack_78,in_x3,in_x4,in_x5,in_x6);
    if (lStack_98 == -0x7fffffffffffffd9) {
      extraout_x8[5] = lStack_88;
      extraout_x8[4] = lStack_90;
      extraout_x8[6] = lStack_80;
      extraout_x8[2] = lVar2;
      extraout_x8[3] = lVar3;
      *extraout_x8 = -0x7fffffffffffffd9;
      extraout_x8[1] = lVar1;
      if ((code *)*puVar5 != (code *)0x0) {
        (*(code *)*puVar5)(lVar4);
      }
    }
    else {
      extraout_x8[5] = (long)puStack_70;
      extraout_x8[4] = lStack_78;
      extraout_x8[6] = lStack_68;
      extraout_x8[2] = lStack_88;
      extraout_x8[1] = lStack_90;
      extraout_x8[3] = lStack_80;
      *extraout_x8 = lStack_98;
      if (lVar1 != 0) {
        func_0x00187bd4(lVar2,lVar1,1);
      }
      if ((code *)*puVar5 != (code *)0x0) {
        (*(code *)*puVar5)(lVar4);
      }
    }
    if (puVar5[1] != 0) {
      func_0x00187bd4(lVar4,puVar5[1],puVar5[2]);
    }
  }
  else {
    extraout_x8[2] = lStack_88;
    extraout_x8[3] = lStack_80;
    *extraout_x8 = lStack_98;
    extraout_x8[1] = lStack_90;
    extraout_x8[4] = lStack_78;
    extraout_x8[5] = (long)puStack_70;
    extraout_x8[6] = lStack_68;
  }
  return;
}

