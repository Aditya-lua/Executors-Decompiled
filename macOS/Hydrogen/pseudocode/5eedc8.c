
long FUN_005eedc8(undefined8 param_1,undefined8 param_2,ulong *param_3)

{
  ulong *puVar1;
  long lVar2;
  int iVar3;
  long *plVar4;
  ulong uVar5;
  long *plVar6;
  undefined8 *unaff_x19;
  int unaff_w28;
  undefined1 auVar7 [16];
  long lStack_70;
  char acStack_68 [8];
  long alStack_60 [3];
  ulong uStack_48;
  ulong uStack_40;
  long lStack_38;
  
  if (unaff_w28 < 0) {
    __ZdlPv(*unaff_x19);
  }
  auVar7 = __Unwind_Resume(param_1);
  plVar6 = auVar7._8_8_;
  plVar4 = auVar7._0_8_;
  uStack_40 = 0;
  lStack_38 = 0;
  uStack_48 = 0xffffffffffffffff;
  acStack_68[0] = '\0';
  alStack_60[0] = 0;
  alStack_60[1] = 0;
  lStack_70 = 0;
  iVar3 = (**(code **)(*plVar6 + 0x10))(plVar6,"IV",&UNK_009f5d40,acStack_68);
  if (iVar3 == 0) {
    iVar3 = (**(code **)(*plVar6 + 0x10))(plVar6,"IV",PTR___ZTIPKh_009b00f8,&lStack_70);
    if (iVar3 == 0) {
      func_0x005ee574(plVar4);
      uVar5 = 0;
    }
    else {
      func_0x005ee684(plVar4,lStack_70);
      uVar5 = (**(code **)(*plVar4 + 0x48))(plVar4);
      uVar5 = uVar5 & 0xffffffff;
    }
  }
  else {
    plVar6 = alStack_60;
    if (acStack_68[0] != '\0') {
      plVar6 = &lStack_38;
    }
    lStack_70 = *plVar6;
    func_0x005ee684(plVar4);
    puVar1 = (ulong *)(alStack_60 + 1);
    if (acStack_68[0] != '\0') {
      puVar1 = &uStack_40;
    }
    uVar5 = func_0x005ee798(plVar4,(int)*puVar1);
  }
  lVar2 = lStack_70;
  *param_3 = uVar5;
  uVar5 = uStack_48;
  if (uStack_40 <= uStack_48) {
    uVar5 = uStack_40;
  }
  if (lStack_38 != 0) {
    if (uVar5 != 0) {
      do {
        *(undefined1 *)(lStack_38 + -1 + uVar5) = 0;
        uVar5 = uVar5 - 1;
      } while (uVar5 != 0);
    }
    func_0x00611644();
  }
  return lVar2;
}

