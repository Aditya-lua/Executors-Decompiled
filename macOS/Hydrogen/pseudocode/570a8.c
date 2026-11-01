
undefined8 * FUN_000570a8(void)

{
  char cVar1;
  long lVar2;
  undefined8 *puVar3;
  undefined8 *puVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined1 auVar7 [16];
  
  __ZdlPv();
  auVar7 = __Unwind_Resume();
  puVar3 = auVar7._8_8_;
  lVar2 = auVar7._0_8_;
  puVar4 = puVar3 + 1;
  *puVar3 = &UNK_009b7bd0;
  if (*(char *)(lVar2 + 0x1f) < '\0') {
    func_0x00017634(puVar4,*(undefined8 *)(lVar2 + 8),*(undefined8 *)(lVar2 + 0x10));
    cVar1 = *(char *)(lVar2 + 0x37);
  }
  else {
    uVar6 = *(undefined8 *)(lVar2 + 0x10);
    uVar5 = *(undefined8 *)(lVar2 + 8);
    puVar3[3] = *(undefined8 *)(lVar2 + 0x18);
    puVar3[2] = uVar6;
    *puVar4 = uVar5;
    cVar1 = *(char *)(lVar2 + 0x37);
  }
  if (cVar1 < '\0') {
    func_0x00017634(puVar3 + 4,*(undefined8 *)(lVar2 + 0x20),*(undefined8 *)(lVar2 + 0x28));
  }
  else {
    uVar6 = *(undefined8 *)(lVar2 + 0x28);
    uVar5 = *(undefined8 *)(lVar2 + 0x20);
    puVar3[6] = *(undefined8 *)(lVar2 + 0x30);
    puVar3[5] = uVar6;
    puVar3[4] = uVar5;
  }
  if (*(char *)(lVar2 + 0x4f) < '\0') {
    func_0x00017634(puVar3 + 7,*(undefined8 *)(lVar2 + 0x38),*(undefined8 *)(lVar2 + 0x40));
  }
  else {
    uVar6 = *(undefined8 *)(lVar2 + 0x40);
    uVar5 = *(undefined8 *)(lVar2 + 0x38);
    puVar3[9] = *(undefined8 *)(lVar2 + 0x48);
    puVar3[8] = uVar6;
    puVar3[7] = uVar5;
  }
  puVar3[0xb] = 0;
  puVar3[10] = puVar3 + 0xb;
  puVar3[0xc] = 0;
  func_0x00056498(puVar3 + 10,*(undefined8 *)(lVar2 + 0x50),lVar2 + 0x58);
  puVar3[0xe] = 0;
  puVar3[0xd] = puVar3 + 0xe;
  puVar3[0xf] = 0;
  func_0x00056498(puVar3 + 0xd,*(undefined8 *)(lVar2 + 0x68),lVar2 + 0x70);
  return puVar4;
}

