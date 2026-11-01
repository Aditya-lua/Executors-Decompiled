
undefined8 FUN_00514410(long param_1)

{
  undefined8 *puVar1;
  byte bVar2;
  byte bVar3;
  undefined8 *puVar4;
  byte *pbVar5;
  long lVar6;
  byte *pbVar7;
  long unaff_x19;
  byte *unaff_x20;
  
  puVar4 = *(undefined8 **)(param_1 + 8);
  if (*(long *)(param_1 + 0x38) == unaff_x19) {
    pbVar5 = *(byte **)(param_1 + 0x30);
    lVar6 = unaff_x19;
    pbVar7 = unaff_x20;
    do {
      if (lVar6 == 0) {
        return 1;
      }
      bVar2 = *pbVar5;
      lVar6 = lVar6 + -1;
      bVar3 = *pbVar7;
      pbVar5 = pbVar5 + 1;
      pbVar7 = pbVar7 + 1;
    } while (((uint)bVar2 | (uint)(bVar2 - 0x41 < 0x1a) << 5) ==
             ((uint)bVar3 | (uint)(bVar3 - 0x41 < 0x1a) << 5));
  }
  if (*(long *)(param_1 + 0x10) != 0) {
    puVar1 = puVar4 + *(long *)(param_1 + 0x10) * 2;
    do {
      if (puVar4[1] == unaff_x19) {
        pbVar5 = (byte *)*puVar4;
        lVar6 = unaff_x19;
        pbVar7 = unaff_x20;
        do {
          if (lVar6 == 0) {
            return 1;
          }
          bVar2 = *pbVar5;
          lVar6 = lVar6 + -1;
          bVar3 = *pbVar7;
          pbVar5 = pbVar5 + 1;
          pbVar7 = pbVar7 + 1;
        } while (((uint)bVar2 | (uint)(bVar2 - 0x41 < 0x1a) << 5) ==
                 ((uint)bVar3 | (uint)(bVar3 - 0x41 < 0x1a) << 5));
      }
      puVar4 = puVar4 + 2;
    } while (puVar4 != puVar1);
  }
  return 0;
}

