
undefined1  [16] FUN_0045930c(void)

{
  undefined8 *puVar1;
  long lVar2;
  undefined8 *extraout_x1;
  long lVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined1 auVar6 [16];
  
  func_0x00187bd4();
  puVar1 = (undefined8 *)__Unwind_Resume();
  lVar3 = puVar1[1];
  if (lVar3 < 0) {
    uVar5 = 0;
LAB_0045938c:
    func_0x007a1f00(uVar5,lVar3,&UNK_009df720);
                    /* WARNING: Could not recover jumptable at 0x004593c0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    auVar6 = (**(code **)(extraout_x1[1] + 0x18))(*extraout_x1,&UNK_00890fc8,0x31);
    return auVar6;
  }
  uVar4 = *puVar1;
  if (lVar3 == 0) {
    lVar2 = 1;
  }
  else {
    uVar5 = 1;
    lVar2 = func_0x00187bd0(lVar3,1);
    if (lVar2 == 0) goto LAB_0045938c;
  }
  _memcpy(lVar2,uVar4,lVar3);
  auVar6._8_8_ = lVar3;
  auVar6._0_8_ = lVar2;
  return auVar6;
}

