
void FUN_0025fbe4(undefined8 param_1)

{
  long lVar1;
  undefined8 in_x9;
  undefined8 in_x10;
  undefined8 in_x11;
  long lVar2;
  long *unaff_x19;
  undefined8 *unaff_x20;
  undefined8 *puVar3;
  long unaff_x21;
  long lVar4;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  undefined8 in_stack_00000098;
  
  unaff_x20[2] = in_x10;
  unaff_x20[3] = in_x11;
  unaff_x20[4] = in_x9;
  unaff_x20[6] = in_stack_00000090;
  unaff_x20[5] = in_stack_00000088;
  unaff_x20[7] = in_stack_00000098;
  *unaff_x20 = 0x8000000000000001;
  unaff_x20[1] = param_1;
  lVar4 = *unaff_x19;
  if (unaff_x21 + -1 < lVar4) {
    if ((((*(byte *)(unaff_x19 + 3) & 1) == 0) &&
        (lVar1 = unaff_x19[4], lVar1 != -0x8000000000000000)) && (lVar1 != 0)) {
      func_0x00187bd4(unaff_x19[5],lVar1,1);
    }
    lVar1 = unaff_x19[1];
    lVar2 = unaff_x19[2];
    if (lVar2 != 0) {
      puVar3 = (undefined8 *)(lVar1 + 8);
      do {
        if (puVar3[-1] != 0) {
          func_0x00187bd4(*puVar3,puVar3[-1],1);
        }
        puVar3 = puVar3 + 3;
        lVar2 = lVar2 + -1;
      } while (lVar2 != 0);
    }
    if (lVar4 != 0) {
      func_0x00187bd4(lVar1,lVar4 * 0x18,8);
    }
  }
  return;
}

