
void FUN_00401a94(long param_1,undefined8 param_2,long param_3)

{
  long lVar1;
  long in_x9;
  long lVar2;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  
  if (param_1 == 0) {
    lVar1 = unaff_x21;
  }
  else {
    lVar1 = unaff_x21 + in_x9 * 8;
    lVar2 = unaff_x22;
    do {
      lVar1 = *(long *)(lVar1 + 0x118);
      lVar2 = lVar2 + -1;
    } while (lVar2 != 0);
    in_x9 = 0;
  }
  *(long *)(param_3 + 8) = lVar1;
  *(undefined8 *)(param_3 + 0x10) = 0;
  *(long *)(param_3 + 0x18) = in_x9;
  *unaff_x19 = unaff_x21;
  unaff_x19[1] = unaff_x22;
  unaff_x19[2] = unaff_x20;
  return;
}

