
undefined8 FUN_00280464(long param_1)

{
  long unaff_x19;
  
  if ((*(int *)(param_1 + 0x20) != 0) && (*(long *)(unaff_x19 + 0x38) != 0)) {
    _fclose();
    *(undefined8 *)(unaff_x19 + 0x38) = 0;
  }
  *(undefined4 *)(unaff_x19 + 0x20) = 0;
  return 1;
}

