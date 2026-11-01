
undefined * FUN_00611cbc(code *param_1)

{
  undefined *puVar1;
  long lVar2;
  undefined8 *puVar3;
  long *plVar4;
  ulong uVar5;
  undefined1 in_w3;
  long *unaff_x19;
  long unaff_x20;
  undefined *unaff_x21;
  undefined1 auVar6 [16];
  undefined1 uStack_81;
  undefined *puStack_48;
  char cStack_39;
  undefined *puStack_38;
  
  uStack_81 = in_w3;
  puVar1 = (undefined *)(*param_1)();
  if (unaff_x21 <= puVar1) {
    puVar1 = *(undefined **)(unaff_x20 + 0x10);
    lVar2 = *(long *)(unaff_x20 + 0x18);
    if (puVar1 != unaff_x21) {
      if (lVar2 != 0) {
        if (puVar1 != (undefined *)0x0) {
          do {
            puVar1[lVar2 + -1] = 0;
            puVar1 = puVar1 + -1;
          } while (puVar1 != (undefined *)0x0);
        }
        func_0x00611644();
      }
      if (unaff_x21 == (undefined *)0x0) {
        lVar2 = 0;
      }
      else {
        lVar2 = func_0x006115d0();
      }
    }
    *(undefined **)(unaff_x20 + 0x10) = unaff_x21;
    *(long *)(unaff_x20 + 0x18) = lVar2;
    *(undefined8 *)(unaff_x20 + 8) = 0xffffffffffffffff;
    func_0x006853e4();
    puVar1 = (undefined *)(**(code **)(*unaff_x19 + 0xb0))();
    if (unaff_x21 == puVar1) {
      return unaff_x21;
    }
  }
  puVar3 = (undefined8 *)___cxa_allocate_exception(0x28);
  *(undefined4 *)(puVar3 + 1) = 1;
  puVar3[2] = 0x6f63656420524542;
  puVar3[3] = 0x726f727265206564;
  *(undefined1 *)(puVar3 + 4) = 0;
  *(undefined1 *)((long)puVar3 + 0x27) = 0x10;
  *puVar3 = &UNK_009f60b8;
  auVar6 = ___cxa_throw(puVar3,&UNK_009f6090,&DAT_0060f08c);
  plVar4 = auVar6._0_8_;
  lVar2 = (**(code **)(*plVar4 + 0xa8))(plVar4,&cStack_39);
  if (((lVar2 == 0 || cStack_39 != '\x04') ||
      (uVar5 = func_0x006118e8(plVar4,&puStack_48), (uVar5 & 1) == 0)) ||
     (puVar1 = (undefined *)(**(code **)(*plVar4 + 0x98))(plVar4), puVar1 < puStack_48)) {
    puVar3 = (undefined8 *)___cxa_allocate_exception(0x28);
    *(undefined4 *)(puVar3 + 1) = 1;
    puVar3[2] = 0x6f63656420524542;
    puVar3[3] = 0x726f727265206564;
    *(undefined1 *)(puVar3 + 4) = 0;
    *(undefined1 *)((long)puVar3 + 0x27) = 0x10;
    *puVar3 = &UNK_009f60b8;
    puVar1 = &DAT_0060f08c;
    auVar6 = ___cxa_throw(puVar3,&UNK_009f6090,&DAT_0060f08c);
    plVar4 = auVar6._0_8_;
    (**(code **)(*plVar4 + 0x38))(plVar4,&uStack_81,1,0,1);
    lVar2 = func_0x00611648(plVar4,puVar1);
    (**(code **)(*plVar4 + 0x38))(plVar4,auVar6._8_8_,puVar1,0,1);
    return puVar1 + lVar2 + 1;
  }
  puStack_38 = puStack_48;
  (**(code **)(*plVar4 + 0x118))(plVar4,auVar6._8_8_,&puStack_38,&UNK_008ba5c8,1);
  return puStack_48;
}

