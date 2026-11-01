
undefined8 FUN_006118e4(void)

{
  long lVar1;
  undefined8 *puVar2;
  long *plVar3;
  undefined8 uVar4;
  ulong uVar5;
  uint uVar6;
  undefined1 auVar7 [16];
  undefined1 uStack_62;
  undefined1 uStack_61;
  undefined1 auStack_60 [16];
  undefined1 *puStack_50;
  undefined8 uStack_48;
  byte bStack_31;
  undefined1 auStack_6 [6];
  
  auVar7 = ___cxa_throw();
  plVar3 = auVar7._0_8_;
  lVar1 = (**(code **)(*plVar3 + 0xa8))(plVar3,&bStack_31);
  if (lVar1 == 0) {
LAB_006119a0:
    puVar2 = (undefined8 *)___cxa_allocate_exception(0x28);
    *(undefined4 *)(puVar2 + 1) = 1;
    puVar2[2] = 0x6f63656420524542;
    puVar2[3] = 0x726f727265206564;
    *(undefined1 *)(puVar2 + 4) = 0;
    *(undefined1 *)((long)puVar2 + 0x27) = 0x10;
    *puVar2 = &UNK_009f60b8;
    plVar3 = (long *)___cxa_throw(puVar2,&UNK_009f6090,&DAT_0060f08c);
    uStack_48 = 0x611a00;
    uStack_62 = 5;
    puStack_50 = auStack_6 + -10;
    auStack_60 = auVar7;
    (**(code **)(*plVar3 + 0x38))(plVar3,&uStack_62,1,0,1);
    uStack_61 = 0;
    uVar4 = (**(code **)(*plVar3 + 0x38))(plVar3,&uStack_61,1,0,1);
    return uVar4;
  }
  if ((char)bStack_31 < '\0') {
    uVar5 = 0;
    uVar6 = bStack_31 & 0x7f;
    if ((bStack_31 & 0x7f) == 0) {
      *auVar7._8_8_ = 0;
      return 0;
    }
    do {
      if ((uVar5 >> 0x38 != 0) ||
         (lVar1 = (**(code **)(*plVar3 + 0xa8))(plVar3,&bStack_31), lVar1 == 0)) goto LAB_006119a0;
      uVar5 = (ulong)bStack_31 | uVar5 << 8;
      uVar6 = uVar6 - 1;
    } while (uVar6 != 0);
  }
  else {
    uVar5 = (ulong)bStack_31;
  }
  *auVar7._8_8_ = uVar5;
  return 1;
}

