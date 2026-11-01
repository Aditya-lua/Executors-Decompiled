
undefined8 FUN_0052015c(undefined8 *param_1,long *param_2,byte *param_3,long param_4)

{
  byte bVar1;
  byte bVar2;
  undefined8 *in_x9;
  undefined8 *puVar3;
  byte *pbVar4;
  long lVar5;
  byte *pbVar6;
  
  do {
    do {
      puVar3 = in_x9;
      if (puVar3 == param_1) {
        *param_2 = (long)puVar3;
        return 0;
      }
      in_x9 = puVar3 + 2;
    } while (puVar3[1] != param_4);
    pbVar4 = (byte *)*puVar3;
    lVar5 = param_4;
    pbVar6 = param_3;
    do {
      if (lVar5 == 0) {
        *param_2 = (long)in_x9;
        return 1;
      }
      bVar1 = *pbVar4;
      lVar5 = lVar5 + -1;
      bVar2 = *pbVar6;
      pbVar4 = pbVar4 + 1;
      pbVar6 = pbVar6 + 1;
    } while (((uint)bVar1 | (uint)(bVar1 - 0x41 < 0x1a) << 5) ==
             ((uint)bVar2 | (uint)(bVar2 - 0x41 < 0x1a) << 5));
  } while( true );
}

