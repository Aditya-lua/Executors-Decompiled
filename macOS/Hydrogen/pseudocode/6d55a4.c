
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_006d55a4(void)

{
  int iVar1;
  undefined8 *unaff_x19;
  
  iVar1 = _strcmp();
  if (iVar1 == 0) {
    *unaff_x19 = _UNK_008174a8;
    unaff_x19[1] = 0x7ff0000000000000;
    return;
  }
  *unaff_x19 = 0;
  unaff_x19[1] = 0;
  unaff_x19[2] = 0;
  return;
}

