
void FUN_0016c610(undefined8 param_1,long param_2)

{
  long lVar1;
  long unaff_x19;
  undefined8 *puVar2;
  undefined8 *unaff_x20;
  long unaff_x21;
  long unaff_x22;
  
code_r0x0016c610:
  func_0x00187bd4(param_1,param_2,1);
  lVar1 = unaff_x20[-1];
  if (lVar1 == unaff_x21 || lVar1 == 0) goto LAB_0016c5f8;
code_r0x0016c628:
  func_0x00187bd4(*unaff_x20,lVar1,1);
  lVar1 = unaff_x20[2];
  puVar2 = unaff_x20;
  if (lVar1 < unaff_x22 || lVar1 == 0) goto LAB_0016c5cc;
  do {
    func_0x00187bd4(unaff_x20[3],lVar1,1);
    puVar2 = unaff_x20;
LAB_0016c5cc:
    do {
      unaff_x20 = puVar2 + 9;
      unaff_x19 = unaff_x19 + -1;
      if (unaff_x19 == 0) {
        return;
      }
      param_2 = puVar2[5];
      if (param_2 != unaff_x21 && param_2 != 0) {
        param_1 = puVar2[6];
        goto code_r0x0016c610;
      }
      lVar1 = puVar2[8];
      if (lVar1 != unaff_x21 && lVar1 != 0) goto code_r0x0016c628;
LAB_0016c5f8:
      lVar1 = unaff_x20[2];
      puVar2 = unaff_x20;
    } while (lVar1 < unaff_x22 || lVar1 == 0);
  } while( true );
}

