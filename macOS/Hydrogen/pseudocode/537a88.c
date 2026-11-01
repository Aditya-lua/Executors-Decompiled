
undefined1  [16]
FUN_00537a88(undefined8 param_1,undefined8 param_2,undefined8 param_3,ulong param_4)

{
  ulong uVar1;
  int iVar2;
  long lVar3;
  undefined *puVar4;
  ulong uVar5;
  ulong uVar6;
  long unaff_x21;
  ulong unaff_x22;
  undefined1 auVar7 [16];
  undefined1 auVar8 [16];
  
  auVar7 = func_0x007a28a4(unaff_x21 + 1);
  auVar7._8_8_ = auVar7._8_8_;
  uVar1 = auVar7._8_8_ - param_4;
  if (auVar7._8_8_ < param_4) {
    uVar6 = 0;
  }
  else {
    if (uVar1 != 0) {
      unaff_x22 = 0;
      uVar6 = 1;
      uVar5 = param_4;
      do {
        if (auVar7._8_8_ < unaff_x22) {
          puVar4 = &UNK_009ebd90;
          auVar7 = func_0x007a28a4(auVar7._8_8_ + 1,auVar7._8_8_,&UNK_009ebd90);
          if (auVar7._8_8_ < uVar5) {
            lVar3 = 0;
          }
          else {
            lVar3 = auVar7._0_8_ + uVar5;
            iVar2 = _memcmp(auVar7._0_8_,puVar4,uVar5);
            if (iVar2 != 0) {
              lVar3 = 0;
            }
          }
          auVar7._8_8_ = auVar7._8_8_ - uVar5;
          auVar7._0_8_ = lVar3;
          return auVar7;
        }
        if ((param_4 <= auVar7._8_8_ - unaff_x22) &&
           (iVar2 = _memcmp(param_3,auVar7._0_8_ + unaff_x22,param_4), iVar2 == 0))
        goto LAB_00537b2c;
        unaff_x22 = unaff_x22 + 1;
      } while (unaff_x22 != uVar1);
    }
    iVar2 = _memcmp(param_3,auVar7._0_8_ + uVar1,param_4);
    uVar6 = (ulong)(iVar2 == 0);
    unaff_x22 = uVar1;
  }
LAB_00537b2c:
  auVar8._8_8_ = unaff_x22;
  auVar8._0_8_ = uVar6;
  return auVar8;
}

