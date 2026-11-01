
undefined8 FUN_00729cf4(ulong *param_1,undefined8 *param_2)

{
  ulong uVar1;
  undefined1 in_ZR;
  undefined8 *in_x9;
  undefined8 *puVar2;
  undefined8 *in_x10;
  undefined8 *in_x11;
  undefined8 *unaff_x19;
  undefined8 *unaff_x20;
  undefined8 *unaff_x21;
  ulong unaff_x22;
  
code_r0x00729cf4:
  if (!(bool)in_ZR) goto LAB_00729cdc;
  *unaff_x20 = in_x10;
  *in_x10 = 0;
  if (in_x9 != param_2) goto LAB_00729d3c;
LAB_00729d38:
  *unaff_x19 = in_x10;
LAB_00729d3c:
  puVar2 = (undefined8 *)unaff_x19[3];
  if (puVar2 == (undefined8 *)0x0) {
    if (((ulong)unaff_x19[4] <= (ulong)unaff_x19[5]) && ((*(byte *)(unaff_x19 + 7) >> 1 & 1) == 0))
    {
      *param_2 = unaff_x19[2];
      unaff_x19[2] = param_2;
      goto LAB_00729cbc;
    }
LAB_00729d94:
    (*(code *)*unaff_x21)();
  }
  else {
    if ((ulong)puVar2[3] <= (ulong)puVar2[2]) goto LAB_00729d94;
    *param_1 = 0;
    param_1[1] = 0;
    *param_2 = *puVar2;
    *puVar2 = param_2;
    puVar2[2] = puVar2[2] + 1;
  }
  unaff_x19[4] = unaff_x19[4] + -1;
LAB_00729cbc:
  do {
    param_2 = (undefined8 *)*unaff_x20;
    if (param_2 == (undefined8 *)0x0) goto code_r0x00729c74;
code_r0x00729cc4:
    param_1 = param_2 + 2;
    if ((ulong)param_2[3] <= *param_1) break;
code_r0x00729c74:
    if (unaff_x22 == 0) {
      return 0;
    }
    if (param_2 == (undefined8 *)0x0) {
      return 0x51;
    }
    uVar1 = param_2[3] - param_2[2];
    if (uVar1 == 0) goto code_r0x00729cc4;
    if (unaff_x22 < uVar1) {
      param_2[3] = param_2[3] - unaff_x22;
      unaff_x22 = 0;
      goto code_r0x00729cc4;
    }
    param_2[2] = 0;
    param_2[3] = 0;
    unaff_x22 = unaff_x22 - uVar1;
  } while( true );
  in_x9 = (undefined8 *)*unaff_x19;
  in_x11 = in_x9;
LAB_00729cdc:
  in_x10 = in_x11;
  if (in_x10 == (undefined8 *)0x0) {
    *unaff_x20 = 0;
  }
  else {
    if (in_x10 != param_2) {
      in_x11 = (undefined8 *)*in_x10;
      in_ZR = in_x11 == param_2;
      goto code_r0x00729cf4;
    }
    in_x10 = (undefined8 *)0x0;
    *unaff_x20 = 0;
  }
  if (in_x9 == param_2) goto LAB_00729d38;
  goto LAB_00729d3c;
}

