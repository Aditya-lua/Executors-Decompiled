/* 7ff70c9dbde0 FUN_7ff70c9dbde0 */

undefined8 FUN_7ff70c9dbde0(undefined8 *param_1,undefined8 param_2,undefined8 param_3)

{
  longlong lVar1;
  undefined8 uVar2;
  longlong lVar3;
  ulonglong uVar4;
  char cVar5;
  undefined4 uStack_68;
  undefined4 uStack_64;
  undefined4 uStack_60;
  undefined4 uStack_5c;
  undefined4 uStack_58;
  undefined4 uStack_54;
  undefined4 uStack_50;
  undefined4 uStack_4c;
  undefined1 auStack_48 [8];
  undefined8 uStack_40;
  ulonglong uStack_38;
  
  *param_1 = 0;
  param_1[1] = param_2;
  param_1[2] = param_3;
  lVar1 = FUN_7ff70c9dc140(&uStack_68);
  if (lVar1 == 0) {
    return 0xffffffff;
  }
  uVar2 = CONCAT44(uStack_54,uStack_58);
  lVar1 = FUN_7ff70c9dc140(auStack_48,CONCAT44(uStack_5c,uStack_60),uVar2);
  if (lVar1 == 0) {
    return 0xffffffff;
  }
  lVar1 = FUN_7ff70c9dc140(param_1 + 0xc,lVar1,uVar2);
  if (lVar1 == 0) {
    return 0xffffffff;
  }
  lVar1 = FUN_7ff70c9dc140(param_1 + 0x10,lVar1,uVar2);
  if (lVar1 == 0) {
    return 0xffffffff;
  }
  param_1[4] = 0;
  param_1[5] = &UNK_7ff70cb6fe88;
  param_1[6] = &UNK_7ff70cb6fe89;
  lVar1 = FUN_7ff70c9dc140(&uStack_68,uStack_40,uStack_38);
  if (lVar1 == 0) {
    return 0xffffffff;
  }
  if (uStack_50._1_1_ == '\0') {
    lVar3 = FUN_7ff70c9dc140(param_1 + 4,CONCAT44(uStack_5c,uStack_60),CONCAT44(uStack_54,uStack_58)
                            );
    if (lVar3 == 0) {
      return 0xffffffff;
    }
    lVar1 = FUN_7ff70c9dc140(&uStack_68,lVar1,uStack_38);
    if (lVar1 == 0) {
      return 0xffffffff;
    }
  }
  *(undefined4 *)(param_1 + 10) = uStack_58;
  *(undefined4 *)((longlong)param_1 + 0x54) = uStack_54;
  *(undefined4 *)(param_1 + 0xb) = uStack_50;
  *(undefined4 *)((longlong)param_1 + 0x5c) = uStack_4c;
  *(undefined4 *)(param_1 + 8) = uStack_68;
  *(undefined4 *)((longlong)param_1 + 0x44) = uStack_64;
  *(undefined4 *)(param_1 + 9) = uStack_60;
  *(undefined4 *)((longlong)param_1 + 0x4c) = uStack_5c;
  uVar2 = FUN_7ff70c9dc140(param_1 + 0xc,lVar1,uStack_38);
  lVar1 = FUN_7ff70c9dc140(param_1 + 0x14,uVar2,uStack_38);
  if (lVar1 == 0) {
    return 0xffffffff;
  }
  lVar1 = FUN_7ff70c9dc140(&uStack_68,lVar1,uStack_38);
  if (lVar1 != 0) {
    uVar2 = CONCAT44(uStack_54,uStack_58);
    lVar3 = FUN_7ff70c9dc140(param_1 + 0x18,CONCAT44(uStack_5c,uStack_60),uVar2);
    if (lVar3 == 0) {
      return 0xffffffff;
    }
    lVar3 = FUN_7ff70c9dc140(param_1 + 0x1c,lVar3,uVar2);
    if (lVar3 == 0) {
      return 0xffffffff;
    }
    lVar1 = FUN_7ff70c9dc140(param_1 + 0x20,lVar1,uStack_38);
    if (lVar1 == 0) {
      return 0xffffffff;
    }
    uVar4 = FUN_7ff70c9dc140(param_1 + 0x24,lVar1,uStack_38);
    if (uVar4 != 0) {
      lVar1 = FUN_7ff70c9dc140(param_1 + 0x28,param_1[0x25],param_1[0x26]);
      if (lVar1 == 0) {
        return 0xffffffff;
      }
      lVar1 = FUN_7ff70c9dc140(param_1 + 0x2c,lVar1,param_1[0x26]);
      if (lVar1 == 0) {
        return 0xffffffff;
      }
      *(undefined1 *)((longlong)param_1 + 0x1b9) = 0;
      *(undefined1 *)((longlong)param_1 + 0x199) = 0;
      uStack_50._0_2_ = (ushort)(byte)uStack_50;
      *(undefined1 *)((longlong)param_1 + 0x1d9) = 0;
      param_1[0x34] = 0;
      param_1[0x30] = 0;
      param_1[0x32] = &UNK_7ff70cb923a7;
      param_1[0x31] = &UNK_7ff70cb923a7;
      param_1[0x36] = &UNK_7ff70cb923a7;
      param_1[0x35] = &UNK_7ff70cb923a7;
      param_1[0x38] = 0;
      param_1[0x3a] = &UNK_7ff70cb923a7;
      param_1[0x39] = &UNK_7ff70cb923a7;
      if (uVar4 < uStack_38) {
        uVar4 = FUN_7ff70c9dc140(&uStack_68,uVar4,uStack_38);
        if (uVar4 == 0) {
          return 0xffffffff;
        }
        if (uStack_50._1_1_ == '\x01') {
          *(undefined4 *)(param_1 + 0x32) = uStack_58;
          *(undefined4 *)((longlong)param_1 + 0x194) = uStack_54;
          *(undefined4 *)(param_1 + 0x33) = uStack_50;
          *(undefined4 *)((longlong)param_1 + 0x19c) = uStack_4c;
          *(undefined4 *)(param_1 + 0x30) = uStack_68;
          *(undefined4 *)((longlong)param_1 + 0x184) = uStack_64;
          *(undefined4 *)(param_1 + 0x31) = uStack_60;
          *(undefined4 *)((longlong)param_1 + 0x18c) = uStack_5c;
          if (uStack_38 <= uVar4) {
            return 0;
          }
          uVar4 = FUN_7ff70c9dc140(&uStack_68,uVar4,uStack_38);
          if (uVar4 == 0) {
            return 0xffffffff;
          }
        }
        cVar5 = uStack_50._1_1_;
        if (uStack_50._1_1_ == '\x02') {
          *(undefined4 *)(param_1 + 0x36) = uStack_58;
          *(undefined4 *)((longlong)param_1 + 0x1b4) = uStack_54;
          *(undefined4 *)(param_1 + 0x37) = uStack_50;
          *(undefined4 *)((longlong)param_1 + 0x1bc) = uStack_4c;
          *(undefined4 *)(param_1 + 0x34) = uStack_68;
          *(undefined4 *)((longlong)param_1 + 0x1a4) = uStack_64;
          *(undefined4 *)(param_1 + 0x35) = uStack_60;
          *(undefined4 *)((longlong)param_1 + 0x1ac) = uStack_5c;
          if (uStack_38 <= uVar4) {
            return 0;
          }
          lVar1 = FUN_7ff70c9dc140(&uStack_68,uVar4,uStack_38);
          if (lVar1 == 0) {
            return 0xffffffff;
          }
          cVar5 = uStack_50._1_1_;
        }
        if ((cVar5 == '\x03') &&
           (lVar1 = FUN_7ff70c9dc140(param_1 + 0x38,CONCAT44(uStack_5c,uStack_60),
                                     CONCAT44(uStack_54,uStack_58)), lVar1 == 0)) {
          return 0xffffffff;
        }
      }
      return 0;
    }
    return 0xffffffff;
  }
  return 0xffffffff;
}


