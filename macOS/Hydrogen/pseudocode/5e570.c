
void FUN_0005e570(void)

{
  long lVar1;
  long *plVar2;
  long in_x3;
  long in_x4;
  long lVar3;
  long *plVar4;
  long *plVar5;
  undefined1 auVar6 [16];
  char acStack_58 [8];
  undefined4 uStack_50;
  undefined1 uStack_4c;
  char cStack_41;
  
  auVar6 = __Unwind_Resume();
  lVar3 = auVar6._8_8_;
  lVar1 = auVar6._0_8_;
  cStack_41 = '\f';
  uStack_50 = 0x65707954;
  acStack_58[0] = s_Content_Type_008d186c[0];
  acStack_58[1] = s_Content_Type_008d186c[1];
  acStack_58[2] = s_Content_Type_008d186c[2];
  acStack_58[3] = s_Content_Type_008d186c[3];
  acStack_58[4] = s_Content_Type_008d186c[4];
  acStack_58[5] = s_Content_Type_008d186c[5];
  acStack_58[6] = s_Content_Type_008d186c[6];
  acStack_58[7] = s_Content_Type_008d186c[7];
  uStack_4c = 0;
  func_0x0005dd28(lVar1,acStack_58);
  if (cStack_41 < '\0') {
    __ZdlPv(acStack_58);
    *(long *)(lVar1 + 0x90) = lVar3;
  }
  else {
    *(long *)(lVar1 + 0x90) = lVar3;
  }
  if (lVar3 != 0) {
    plVar4 = (long *)(lVar1 + 0xb0);
    plVar2 = (long *)*plVar4;
    plVar5 = (long *)(lVar1 + 0x98);
    *plVar4 = 0;
    if (plVar2 == plVar5) {
      lVar3 = 4;
      plVar2 = plVar5;
code_r0x0005e620:
      (**(code **)(*plVar2 + lVar3 * 8))();
    }
    else if (plVar2 != (long *)0x0) {
      lVar3 = 5;
      goto code_r0x0005e620;
    }
    plVar2 = (long *)(in_x3 + 0x18);
    lVar3 = *plVar2;
    if (lVar3 == 0) {
      *plVar4 = 0;
    }
    else if (lVar3 == in_x3) {
      *plVar4 = (long)plVar5;
      (**(code **)(*(long *)*plVar2 + 0x18))((long *)*plVar2,plVar5);
    }
    else {
      *plVar4 = lVar3;
      *plVar2 = 0;
    }
  }
  plVar5 = (long *)(lVar1 + 0xd0);
  plVar2 = (long *)*plVar5;
  plVar4 = (long *)(lVar1 + 0xb8);
  *plVar5 = 0;
  if (plVar2 == plVar4) {
    lVar3 = 4;
    plVar2 = plVar4;
code_r0x0005e69c:
    (**(code **)(*plVar2 + lVar3 * 8))();
  }
  else if (plVar2 != (long *)0x0) {
    lVar3 = 5;
    goto code_r0x0005e69c;
  }
  plVar2 = (long *)(in_x4 + 0x18);
  lVar3 = *plVar2;
  if (lVar3 != 0) {
    if (lVar3 == in_x4) {
      *plVar5 = (long)plVar4;
      (**(code **)(*(long *)*plVar2 + 0x18))((long *)*plVar2,plVar4);
      goto code_r0x0005e6e8;
    }
    *plVar5 = lVar3;
    plVar5 = plVar2;
  }
  *plVar5 = 0;
code_r0x0005e6e8:
  *(undefined1 *)(lVar1 + 0xd8) = 0;
  return;
}

