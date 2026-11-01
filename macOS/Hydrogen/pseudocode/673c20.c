
void thunk_FUN_00673c38(void)

{
  bool bVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  long lVar4;
  long *unaff_x21;
  undefined8 *unaff_x22;
  long unaff_x24;
  long unaff_x25;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined1 auVar7 [16];
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  
  do {
    uStack0000000000000018 = unaff_x22[1];
    uStack0000000000000010 = *unaff_x22;
    uStack0000000000000020 = unaff_x22[2];
    auVar7 = func_0x006741bc();
    puVar2 = auVar7._8_8_;
    if (*unaff_x21 == unaff_x24) {
      puVar3 = (undefined8 *)(unaff_x21[-1] + 0xfd8);
      if (puVar3 == puVar2) goto LAB_00673d04;
LAB_00673c7c:
      uVar6 = puVar3[1];
      uVar5 = *puVar3;
      puVar2[2] = puVar3[2];
      puVar2[1] = uVar6;
      *puVar2 = uVar5;
      puVar3[2] = uStack0000000000000020;
      puVar3[1] = uStack0000000000000018;
      *puVar3 = uStack0000000000000010;
      func_0x0067436c();
      lVar4 = *unaff_x21;
    }
    else {
      puVar3 = (undefined8 *)(unaff_x24 + -0x18);
      if (puVar3 != puVar2) goto LAB_00673c7c;
LAB_00673d04:
      puVar2[1] = uStack0000000000000018;
      *puVar2 = uStack0000000000000010;
      puVar2[2] = uStack0000000000000020;
      lVar4 = *unaff_x21;
    }
    if (unaff_x24 == lVar4) {
      unaff_x21 = unaff_x21 + -1;
      unaff_x24 = *unaff_x21 + 0xff0;
    }
    unaff_x24 = unaff_x24 + -0x18;
    bVar1 = unaff_x25 < 3;
    unaff_x25 = unaff_x25 + -1;
    if (bVar1) {
      return;
    }
  } while( true );
}

