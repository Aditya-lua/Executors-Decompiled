
void FUN_005ec1f8(long param_1)

{
  ulong uVar1;
  long in_x9;
  uint *in_x10;
  undefined *in_x11;
  long in_x12;
  ulong *unaff_x19;
  
  if (param_1 == 2) {
    if ((*in_x10 & 1) != 0) {
      in_x9 = in_x9 + (*(long *)(in_x11 + 0x10) - 1U & 0xfffffffffffffff0) + 0x10;
    }
  }
  else {
    in_x11 = &UNK_009f4080;
    in_x9 = in_x12;
  }
  uVar1 = (**(code **)(in_x11 + 0x30))(in_x9);
  if (uVar1 != 5) {
    if (uVar1 == 6) {
      uVar1 = 0;
    }
    if (uVar1 < *unaff_x19) {
      *unaff_x19 = uVar1;
    }
  }
  return;
}

