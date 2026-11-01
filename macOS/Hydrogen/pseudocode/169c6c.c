
void FUN_00169c6c(undefined8 param_1,undefined8 param_2,undefined8 param_3,byte *param_4,
                 undefined8 param_5,undefined8 param_6,long *param_7)

{
  bool in_ZR;
  bool in_CY;
  int iVar1;
  long lVar2;
  undefined1 *unaff_x19;
  long unaff_x20;
  long lVar3;
  long unaff_x29;
  undefined8 uStack0000000000000028;
  undefined4 in_stack_00000030;
  undefined8 uStack0000000000000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined4 in_stack_00000050;
  undefined1 uStack0000000000000058;
  
  if (!in_CY || in_ZR) {
    lVar3 = param_7[1];
    if ((*param_4 & 1) == 0) {
      uStack0000000000000038 = 0;
      in_stack_00000040 = 0;
      in_stack_00000050 = 0;
      in_stack_00000048 = 0;
      iVar1 = func_0x002b200c(param_2,lVar3,&uStack0000000000000038,&uStack0000000000000058,0x1c,0,0
                              ,lVar3);
      if (iVar1 != 1) {
        *unaff_x19 = 1;
        return;
      }
      *(undefined8 *)(unaff_x29 + -0x50) = in_stack_00000048;
      *(undefined4 *)(unaff_x29 + -0x48) = in_stack_00000050;
      if ((ulong)(*param_7 - unaff_x20) < 0x10) {
        func_0x0079a190();
        lVar3 = param_7[1];
        unaff_x20 = param_7[2];
      }
      ((undefined8 *)(lVar3 + unaff_x20))[1] = in_stack_00000040;
      *(undefined8 *)(lVar3 + unaff_x20) = uStack0000000000000038;
      param_7[2] = unaff_x20 + 0x10;
      *(undefined8 *)(unaff_x19 + 1) = *(undefined8 *)(unaff_x29 + -0x50);
      in_stack_00000030 = *(undefined4 *)(unaff_x29 + -0x48);
    }
    else {
      uStack0000000000000028 = *(undefined8 *)(param_4 + 1);
      in_stack_00000030 = *(undefined4 *)(param_4 + 9);
      lVar2 = unaff_x20;
      if ((ulong)(*param_7 - unaff_x20) < 0x10) {
        func_0x0079a190(param_7);
        lVar3 = param_7[1];
        lVar2 = param_7[2];
      }
      *(undefined8 *)(lVar3 + lVar2) = 0;
      ((undefined8 *)(lVar3 + lVar2))[1] = 0;
      param_7[2] = lVar2 + 0x10;
      iVar1 = func_0x002b1ed4(param_2,lVar3,&uStack0000000000000038,unaff_x20 + 0x10,
                              &uStack0000000000000028,0xc,lVar3);
      if (iVar1 != 1) {
        *unaff_x19 = 1;
        return;
      }
      *(undefined8 *)(unaff_x19 + 1) = uStack0000000000000028;
    }
    *(undefined4 *)(unaff_x19 + 9) = in_stack_00000030;
    *unaff_x19 = 0;
  }
  else {
    *unaff_x19 = 1;
    if (*param_4 != 0) {
      param_4[1] = 0;
      param_4[2] = 0;
      param_4[3] = 0;
      param_4[4] = 0;
      param_4[5] = 0;
      param_4[6] = 0;
      param_4[7] = 0;
      param_4[8] = 0;
      param_4[9] = 0;
      param_4[10] = 0;
      param_4[0xb] = 0;
      param_4[0xc] = 0;
    }
  }
  return;
}

