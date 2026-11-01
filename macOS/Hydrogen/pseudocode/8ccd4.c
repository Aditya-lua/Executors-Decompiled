
void FUN_0008ccd4(undefined1 param_1 [16],undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  uint *puVar1;
  ulong uVar2;
  long lVar3;
  undefined8 uVar4;
  undefined1 auVar5 [16];
  
  func_0x007b7700();
  func_0x007b6f00();
  func_0x007b7600();
  auVar5 = func_0x007b6f00();
  func_0x007b7940(auVar5._0_8_,auVar5._8_8_,0);
  auVar5 = func_0x007b6f00();
  func_0x007b7720(auVar5._0_8_,auVar5._8_8_,0);
  func_0x000d7988("1.90.2 WIP",&UNK_000038e0,0x448,8,0x10,0x14,2);
  func_0x000bd8f4(0);
  puVar1 = (uint *)func_0x000c2db8();
  *puVar1 = *puVar1 | 0x31;
  func_0x000ee928(0);
  func_0x007b6f00();
  uVar2 = func_0x0015fc74();
  if ((uVar2 & 1) != 0) {
    func_0x007b6900();
    uVar2 = func_0x0014b9e8();
    if ((uVar2 & 1) != 0) {
      if (lRam0000000000a33458 != 0) {
        uVar4 = func_0x007b63e0();
        func_0x007b6f00();
        func_0x007b77c0(uVar4,param_2,param_3,param_4);
        auVar5 = func_0x007b6f00();
        func_0x007b74e0(auVar5._0_8_,auVar5._8_8_,0x12);
        lVar3 = lRam0000000000a33458;
        auVar5 = func_0x007b6f00();
        func_0x007b62c0(lVar3,auVar5._8_8_,auVar5._0_8_,1,0);
        lVar3 = func_0x007b7f20(lRam0000000000a33458);
        if (lVar3 != 0) {
          auVar5 = func_0x007b7f20(lRam0000000000a33458);
          func_0x007b6ea0(auVar5._0_8_,auVar5._8_8_,lRam0000000000a33458);
        }
      }
      return;
    }
  }
  uVar4 = _abort();
                    /* WARNING: Could not recover jumptable at 0x007b7ef0. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__objc_msgSend_009b0450)(uVar4,PTR_s_view_00a27368);
  return;
}

