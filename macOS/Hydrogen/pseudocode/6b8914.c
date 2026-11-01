
bool FUN_006b8914(undefined8 *param_1,uint *param_2)

{
  long lVar1;
  undefined8 uVar2;
  uint *in_x9;
  long in_x10;
  int in_w11;
  long lVar3;
  uint *in_x12;
  
  do {
    in_x10 = in_x10 + 8;
    if (in_x12 == param_2) {
      return true;
    }
    if (*in_x12 < *in_x9) {
      uVar2 = *(undefined8 *)in_x12;
      lVar1 = in_x10;
      do {
        lVar3 = lVar1;
        *(undefined8 *)((long)param_1 + lVar3 + 0x18) =
             *(undefined8 *)((long)param_1 + lVar3 + 0x10);
        if (lVar3 == -0x10) {
          *param_1 = uVar2;
          goto joined_r0x006b88b4;
        }
        lVar1 = lVar3 + -8;
      } while ((uint)uVar2 < *(uint *)((long)param_1 + lVar3 + 8));
      *(undefined8 *)((long)param_1 + lVar3 + 0x10) = uVar2;
joined_r0x006b88b4:
      in_w11 = in_w11 + 1;
      if (in_w11 == 8) {
        return in_x12 + 2 == param_2;
      }
    }
    in_x9 = in_x12;
    in_x12 = in_x12 + 2;
  } while( true );
}

