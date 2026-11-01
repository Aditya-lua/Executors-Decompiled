
bool FUN_00463894(uint *param_1,undefined8 *param_2)

{
  byte bVar1;
  bool bVar2;
  long in_x9;
  byte in_w10;
  
  if ((*param_1 & 1) == 0) {
    *param_2 = *param_2;
    param_2[1] = 0;
  }
  else {
    *param_2 = *param_2;
    param_2[1] = 0;
  }
  if (in_x9 == 0) {
    bVar2 = false;
  }
  else {
    bVar1 = 0;
    if (in_x9 != 1) {
      bVar1 = in_w10;
    }
    bVar2 = (bVar1 & ((byte)param_1[5] ^ 1)) == 0;
  }
  return bVar2;
}

