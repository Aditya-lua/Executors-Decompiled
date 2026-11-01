
undefined1  [16] FUN_0008455c(long *param_1,undefined8 *param_2,ulong param_3)

{
  undefined1 uVar1;
  uint7 uVar2;
  code *pcVar3;
  undefined8 *puVar4;
  long *plVar5;
  ulong uVar6;
  ulong *puVar7;
  char *pcVar8;
  undefined1 *puVar9;
  ulong uVar10;
  undefined8 uVar11;
  long lVar12;
  undefined1 auVar13 [16];
  undefined1 uStack_80;
  uint7 uStack_7f;
  undefined8 uStack_78;
  undefined1 uStack_70;
  uint7 uStack_6f;
  undefined8 uStack_68;
  ulong uStack_58;
  undefined8 *puStack_50;
  undefined1 uStack_45;
  undefined4 uStack_44;
  
  if ((*(ulong *)(param_1[4] + (param_1[5] - 1U >> 3 & 0x1ffffffffffffff8)) >>
       (param_1[5] - 1U & 0x3f) & 1) == 0) {
    uVar11 = 0;
    lVar12 = 0;
    goto LAB_0008476c;
  }
  puStack_50 = (undefined8 *)0x0;
  uStack_58 = 3;
  puVar4 = (undefined8 *)__Znwm(0x18);
  if (*(char *)((long)param_2 + 0x17) < '\0') {
    func_0x00017634(puVar4,*param_2,param_2[1]);
  }
  else {
    uVar11 = *param_2;
    puVar4[1] = param_2[1];
    *puVar4 = uVar11;
    puVar4[2] = param_2[2];
  }
  puStack_50 = puVar4;
  if ((param_3 & 1) == 0) {
    uStack_44 = (undefined4)((ulong)(param_1[2] - param_1[1]) >> 3);
    uStack_45 = 5;
    plVar5 = (long *)param_1[0xf];
    if (plVar5 == (long *)0x0) {
      func_0x00056004();
                    /* WARNING: Does not return */
      pcVar3 = (code *)SoftwareBreakpoint(1,0x84794);
      (*pcVar3)();
    }
    uVar6 = (**(code **)(*plVar5 + 0x30))(plVar5,&uStack_44,&uStack_45,&uStack_58);
    uVar11 = _uStack_70;
    if ((uVar6 & 1) != 0) goto LAB_00084634;
LAB_0008472c:
    _uStack_70 = uVar11;
    uVar11 = 0;
    lVar12 = 0;
  }
  else {
LAB_00084634:
    puVar4 = puStack_50;
    uVar11 = _uStack_70;
    uVar2 = uStack_58._1_7_;
    uStack_70 = (undefined1)uStack_58;
    if (param_1[1] == param_1[2]) {
      uStack_58 = (ulong)uStack_58._1_7_ << 8;
      puStack_50 = (undefined8 *)0x0;
      puVar9 = (undefined1 *)*param_1;
      uVar1 = *puVar9;
      *puVar9 = uStack_70;
      _uStack_70 = CONCAT71(uVar2,uVar1);
      uStack_68 = *(undefined8 *)(puVar9 + 8);
      *(undefined8 **)(puVar9 + 8) = puVar4;
      func_0x00078220((ulong)&uStack_70 | 8);
      lVar12 = *param_1;
    }
    else {
      pcVar8 = *(char **)(param_1[2] + -8);
      if (pcVar8 == (char *)0x0) goto LAB_0008472c;
      _uStack_70 = uVar11;
      if (*pcVar8 == '\x02') {
        lVar12 = *(long *)(pcVar8 + 8);
        puVar7 = *(ulong **)(lVar12 + 8);
        if (puVar7 < *(ulong **)(lVar12 + 0x10)) {
          puVar7[1] = (ulong)puStack_50;
          *puVar7 = uStack_58;
          uStack_58 = uStack_58 & 0xffffffffffffff00;
          puStack_50 = (undefined8 *)0x0;
          puVar7 = puVar7 + 2;
        }
        else {
          puVar7 = (ulong *)func_0x00082e88(lVar12,&uStack_58);
        }
        *(ulong **)(lVar12 + 8) = puVar7;
        lVar12 = *(long *)(*(long *)(*(long *)(param_1[2] + -8) + 8) + 8) + -0x10;
      }
      else {
        uVar6 = param_1[8] - 1;
        uVar10 = *(ulong *)(param_1[7] + (uVar6 >> 3 & 0x1ffffffffffffff8));
        param_1[8] = uVar6;
        if ((uVar10 >> (uVar6 & 0x3f) & 1) == 0) goto LAB_0008472c;
        uStack_58 = (ulong)uStack_58._1_7_ << 8;
        puStack_50 = (undefined8 *)0x0;
        puVar9 = (undefined1 *)param_1[10];
        uVar1 = *puVar9;
        *puVar9 = uStack_70;
        _uStack_80 = CONCAT71(uVar2,uVar1);
        uStack_78 = *(undefined8 *)(puVar9 + 8);
        *(undefined8 **)(puVar9 + 8) = puVar4;
        func_0x00078220((ulong)&uStack_80 | 8);
        lVar12 = param_1[10];
      }
    }
    uVar11 = 1;
  }
  func_0x00078220(&puStack_50,uStack_58 & 0xff);
LAB_0008476c:
  auVar13._8_8_ = lVar12;
  auVar13._0_8_ = uVar11;
  return auVar13;
}

