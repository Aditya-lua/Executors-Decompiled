
undefined8 FUN_002b2edc(void)

{
  undefined8 uVar1;
  long *unaff_x19;
  long unaff_x21;
  
  _memcpy();
  if (((unaff_x21 == 0) && (-1 < *(char *)(*unaff_x19 + 0x14))) ||
     (uVar1 = (**(code **)(*unaff_x19 + 0x20))(), (int)uVar1 != 0)) {
    *(undefined4 *)((long)unaff_x19 + 100) = 0;
    *(undefined4 *)((long)unaff_x19 + 0x6c) = 0;
    *(undefined4 *)(unaff_x19 + 0x12) = 0;
    return 1;
  }
  return uVar1;
}

