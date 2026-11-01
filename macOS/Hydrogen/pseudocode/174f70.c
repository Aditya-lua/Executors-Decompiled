
void FUN_00174f70(void)

{
  undefined8 *puVar1;
  long lVar2;
  undefined8 *extraout_x8;
  undefined8 unaff_x19;
  code *unaff_x21;
  long lVar3;
  undefined1 auVar4 [16];
  
  lVar2 = (*unaff_x21)();
  *(undefined8 *)(lVar2 + 8) = 0xffffffffffffffff;
  lVar3 = *(long *)(lVar2 + 0x20);
  if (lVar3 == *(long *)(lVar2 + 0x10)) {
    lVar2 = (*unaff_x21)();
    func_0x0018769c(lVar2 + 0x10,&UNK_009be338);
  }
  auVar4 = (*unaff_x21)();
  lVar2 = auVar4._0_8_;
  puVar1 = (undefined8 *)(*(long *)(lVar2 + 0x18) + lVar3 * 0x10);
  *puVar1 = unaff_x19;
  puVar1[1] = auVar4._8_8_;
  *(long *)(lVar2 + 0x20) = lVar3 + 1;
  *(long *)(lVar2 + 8) = *(long *)(lVar2 + 8) + 1;
  *extraout_x8 = 1;
  extraout_x8[1] = unaff_x19;
  extraout_x8[2] = 0;
  return;
}

