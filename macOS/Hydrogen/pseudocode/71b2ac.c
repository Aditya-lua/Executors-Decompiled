
void FUN_0071b2ac(void)

{
  undefined4 uVar1;
  undefined1 uVar2;
  long lVar3;
  undefined8 *puVar4;
  long unaff_x19;
  long *unaff_x20;
  undefined4 unaff_w21;
  undefined8 *unaff_x22;
  long unaff_x23;
  undefined8 uVar5;
  undefined8 unaff_x24;
  long unaff_x26;
  long lVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  
  func_0x00721808();
  func_0x007244d4();
  lVar6 = *(long *)(unaff_x23 + 0x84);
  if (*(int *)(unaff_x23 + 0x80) == 0x3a) {
    func_0x00710d48();
  }
  else {
    func_0x0072447c();
  }
  uVar1 = *(undefined4 *)(unaff_x23 + 0x114);
  if ((*(int *)(unaff_x23 + 0x80) != 0x26) && (*(int *)(unaff_x23 + 0x80) != 0x7c)) {
    func_0x0071f5c8();
    *(undefined4 *)(unaff_x23 + 0x114) = uVar1;
  }
  lVar3 = func_0x0071cf0c();
  *(undefined4 *)(unaff_x23 + 0x114) = uVar1;
  uVar5 = *(undefined8 *)(unaff_x19 + 4);
  uVar7 = *(undefined8 *)(lVar3 + 0x14);
  uVar9 = unaff_x22[1];
  uVar8 = *unaff_x22;
  uVar2 = *(undefined1 *)(unaff_x22 + 2);
  puVar4 = (undefined8 *)func_0x00704c24(*(undefined8 *)(unaff_x23 + 0xd8),0x38);
  *puVar4 = unaff_x24;
  puVar4[1] = lVar3;
  puVar4[2] = uVar5;
  puVar4[3] = uVar7;
  *(undefined4 *)(puVar4 + 4) = unaff_w21;
  *(undefined8 *)((long)puVar4 + 0x2c) = uVar9;
  *(undefined8 *)((long)puVar4 + 0x24) = uVar8;
  *(undefined1 *)((long)puVar4 + 0x34) = uVar2;
  lVar3 = *(long *)(unaff_x19 + 4);
  *unaff_x20 = (long)puVar4;
  unaff_x20[1] = lVar3;
  unaff_x20[2] = unaff_x26;
  unaff_x20[3] = lVar6;
  return;
}

