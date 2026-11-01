
bool FUN_004480ac(void)

{
  bool bVar1;
  int in_w8;
  int in_w9;
  short *unaff_x19;
  
  if (in_w8 == in_w9) {
    bVar1 = true;
  }
  else if (*unaff_x19 == 0x524c) {
    bVar1 = true;
  }
  else if (*unaff_x19 == 0x4350) {
    bVar1 = true;
  }
  else if ((*unaff_x19 == 0x3053) || (*unaff_x19 == 0x3153)) {
    bVar1 = true;
  }
  else if ((*unaff_x19 == 0x3253) || (*unaff_x19 == 0x3353)) {
    bVar1 = true;
  }
  else if ((*unaff_x19 == 0x3453) || (*unaff_x19 == 0x3553)) {
    bVar1 = true;
  }
  else if ((*unaff_x19 == 0x3653) || (*unaff_x19 == 0x3753)) {
    bVar1 = true;
  }
  else if (*unaff_x19 == 0x3853) {
    bVar1 = true;
  }
  else {
    bVar1 = *unaff_x19 == 0x3953;
  }
  return bVar1;
}

