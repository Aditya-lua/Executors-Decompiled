/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_180e87c00(void)

{
  undefined8 *unaff_RBX;
  undefined8 unaff_RBP;
  
  func_0x000180e67670();
  *unaff_RBX = unaff_RBP;
  if (unaff_RBX[9] != 0) {
    (*_DAT_1810c2500)();
    unaff_RBX[9] = unaff_RBP;
    unaff_RBX[5] = unaff_RBP;
    unaff_RBX[7] = unaff_RBP;
    *(char *)(unaff_RBX + 0xb) = (char)unaff_RBP;
  }
  if (unaff_RBX[10] != 0) {
    (*_DAT_1810c2500)();
    unaff_RBX[10] = unaff_RBP;
    unaff_RBX[6] = unaff_RBP;
    unaff_RBX[8] = unaff_RBP;
  }
  return;
}

