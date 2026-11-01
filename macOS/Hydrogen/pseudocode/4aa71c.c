
void FUN_004aa71c(void)

{
  long *plVar1;
  byte bVar2;
  long lVar3;
  undefined8 uVar4;
  undefined8 *puVar5;
  ulong uVar6;
  undefined8 *unaff_x20;
  undefined8 uVar7;
  long unaff_x21;
  long unaff_x22;
  undefined8 *puVar8;
  undefined1 auVar9 [16];
  
  while( true ) {
    unaff_x20 = unaff_x20 + 1;
    unaff_x21 = unaff_x21 + -1;
    if (unaff_x21 == 0) {
      return;
    }
    lVar3 = *(long *)*unaff_x20;
    *(long *)*unaff_x20 = lVar3 + unaff_x22;
    if (lVar3 < 0) break;
    func_0x0049ede4();
  }
  auVar9 = func_0x007a05dc();
  puVar5 = auVar9._8_8_;
  puVar8 = auVar9._0_8_;
  uVar6 = (ulong)*(byte *)(puVar8 + 1);
  bVar2 = *(byte *)((long)puVar8 + 9);
  plVar1 = (long *)*puVar5;
  lVar3 = puVar5[1];
  if ((uint)*(byte *)(puVar8 + 1) < (uint)bVar2) {
    uVar7 = *puVar8;
    puVar8 = (undefined8 *)(puVar5[2] + lVar3 * 0x40 + 8);
    do {
      uVar4 = func_0x00486da8(uVar7,uVar6);
      uVar6 = uVar6 + 1;
      puVar8[-1] = 0;
      *puVar8 = uVar4;
      lVar3 = lVar3 + 1;
      puVar8 = puVar8 + 8;
    } while ((uint)bVar2 != ((uint)uVar6 & 0xff));
  }
  *plVar1 = lVar3;
  return;
}

