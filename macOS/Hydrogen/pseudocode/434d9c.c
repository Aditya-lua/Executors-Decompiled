
void FUN_00434d9c(long param_1,undefined8 param_2)

{
  undefined8 *puVar1;
  long in_x9;
  undefined8 unaff_x19;
  undefined8 unaff_x20;
  long *unaff_x21;
  long unaff_x22;
  long unaff_x23;
  
  *(undefined8 *)(param_1 + unaff_x22 * 8) = unaff_x19;
  if (unaff_x23 == in_x9) {
    func_0x00404210(param_2,&UNK_009dbd58);
    param_1 = unaff_x21[4];
    unaff_x22 = unaff_x21[2];
  }
  *(undefined8 *)(param_1 + unaff_x23 * 8) = 0;
  unaff_x21[5] = unaff_x23 + 1;
  if (unaff_x22 == *unaff_x21) {
    func_0x00403e60();
  }
  puVar1 = (undefined8 *)(unaff_x21[1] + unaff_x22 * 0x10);
  *puVar1 = unaff_x19;
  puVar1[1] = unaff_x20;
  unaff_x21[2] = unaff_x22 + 1;
  return;
}

