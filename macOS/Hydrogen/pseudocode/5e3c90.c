
bool FUN_005e3c90(int *param_1)

{
  int iVar1;
  bool bVar2;
  long in_x9;
  ulong in_x10;
  long in_x11;
  ulong in_x12;
  ulong in_x13;
  long in_x14;
  
  do {
    if (in_x12 == in_x13) {
LAB_005e3cac:
      if (in_x11 != 0) {
        if (in_x10 <= in_x11 - 1U) {
          return true;
        }
        param_1 = (int *)(in_x9 + (in_x11 - 1U) * 4 + 4);
      }
      do {
        bVar2 = param_1 == (int *)(in_x9 + in_x10 * 4);
        if (bVar2) {
          return bVar2;
        }
        iVar1 = *param_1;
        param_1 = param_1 + 1;
      } while (iVar1 == 0);
      return bVar2;
    }
    if ((param_1[in_x13] & (*(uint *)(in_x14 + in_x13 * 4) ^ 0xffffffff)) != 0) {
      if (in_x13 < in_x12) {
        return false;
      }
      goto LAB_005e3cac;
    }
    in_x13 = in_x13 + 1;
  } while( true );
}

