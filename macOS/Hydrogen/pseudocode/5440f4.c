
bool FUN_005440f4(void)

{
  bool bVar1;
  uint in_w8;
  undefined4 in_register_00004044;
  ulong in_x9;
  uint in_w11;
  undefined4 in_register_0000405c;
  ulong in_x12;
  
  if ((in_w11 & 1) == 0) {
    if (in_w8 != 0) goto LAB_00544138;
  }
  else if ((in_w8 & 1) == 0) {
LAB_00544138:
    bVar1 = CONCAT44(in_register_00004044,in_w8) <= CONCAT44(in_register_0000405c,in_w11);
    goto LAB_0054413c;
  }
  bVar1 = in_x9 <= in_x12;
LAB_0054413c:
  return !bVar1;
}

