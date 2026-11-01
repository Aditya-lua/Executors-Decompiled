
undefined8 FUN_0059be0c(undefined8 param_1)

{
  undefined8 uVar1;
  undefined8 *puVar2;
  undefined8 *unaff_x19;
  long unaff_x20;
  
  puVar2 = (undefined8 *)unaff_x19[8];
  if (puVar2 == (undefined8 *)unaff_x19[10]) {
    if (unaff_x19[9] != 0) {
      func_0x00187bd4(param_1,unaff_x19[9] << 3,8);
    }
    unaff_x19[7] = 0;
    if (unaff_x20 != 0) {
      if ((unaff_x19[3] != 0) && (unaff_x19[5] != 0)) {
        func_0x00187bd4(unaff_x19[3],unaff_x19[5] << 3,8);
      }
      if ((unaff_x19[7] != 0) && (unaff_x19[9] != 0)) {
        func_0x00187bd4(unaff_x19[7],unaff_x19[9] << 3,8);
      }
    }
    *unaff_x19 = 2;
    if ((unaff_x19[0xd] == 0) ||
       (puVar2 = (undefined8 *)unaff_x19[0xe], puVar2 == (undefined8 *)unaff_x19[0x10])) {
      uVar1 = 0;
    }
    else {
      uVar1 = *puVar2;
      unaff_x19[0xe] = puVar2 + 1;
    }
  }
  else {
    uVar1 = *puVar2;
    unaff_x19[8] = puVar2 + 1;
  }
  return uVar1;
}

