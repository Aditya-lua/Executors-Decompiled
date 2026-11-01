
void FUN_0024cdb8(undefined8 param_1)

{
  undefined1 uVar1;
  bool bVar2;
  long in_x9;
  long lVar3;
  long *in_x10;
  long in_x12;
  undefined8 *unaff_x19;
  long unaff_x20;
  undefined8 unaff_x25;
  
  do {
    in_x12 = *in_x10 + in_x12;
    bVar2 = in_x9 != -1;
    in_x9 = in_x9 + 1;
    in_x10 = in_x10 + 3;
  } while (bVar2);
  lVar3 = *(long *)(unaff_x20 + 0x80);
  uVar1 = *(undefined1 *)(unaff_x20 + 0x337);
  unaff_x19[1] = param_1;
  unaff_x19[2] = in_x12 - lVar3;
  *(undefined1 *)(unaff_x19 + 3) = uVar1;
  *unaff_x19 = unaff_x25;
  return;
}

