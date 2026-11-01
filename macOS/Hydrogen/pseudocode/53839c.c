
bool FUN_0053839c(short *param_1)

{
  long in_x9;
  
  if ((char)*param_1 != '-') {
    return false;
  }
  if (in_x9 == 1) {
    return (char)*param_1 != '-';
  }
  return *param_1 != 0x2d2d;
}

