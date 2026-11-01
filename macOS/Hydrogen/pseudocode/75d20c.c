
undefined8 FUN_0075d20c(void)

{
  undefined8 uVar1;
  undefined4 *unaff_x19;
  long unaff_x22;
  long unaff_x23;
  
  uVar1 = func_0x0077e76c();
  if ((int)uVar1 != 0) {
    if ((*(char *)(unaff_x22 + 5) == ' ') || (unaff_x22 + 7 == unaff_x23)) {
      *unaff_x19 = 0x2a;
      uVar1 = 1;
    }
    else {
      uVar1 = 0;
    }
  }
  return uVar1;
}

