
undefined8 FUN_003073a0(long param_1)

{
  undefined8 in_x3;
  long unaff_x19;
  int unaff_w20;
  
  if ((*(int *)(param_1 + 0x1c) != 0) && (*(char *)(unaff_x19 + 0x132) != '\0')) {
    if ((long)unaff_w20 == (ulong)*(uint *)(unaff_x19 + 0x13c)) {
      if (*(uint *)(unaff_x19 + 0x13c) != 0) {
        _memcpy(in_x3,unaff_x19 + 0x148);
      }
      *(undefined4 *)(unaff_x19 + 0x131) = 0;
      return 1;
    }
  }
  return 0;
}

