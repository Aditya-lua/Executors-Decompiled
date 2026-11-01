
void FUN_001433dc(undefined8 param_1)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  uint in_w8;
  int in_w9;
  int in_w10;
  int in_w12;
  long unaff_x19;
  int unaff_w23;
  int unaff_w24;
  int unaff_w25;
  uint unaff_w26;
  
  if ((((in_w8 == unaff_w26) && (in_w12 == unaff_w25)) && (in_w10 == unaff_w24)) &&
     (in_w9 == unaff_w23)) {
    uVar3 = *(uint *)(unaff_x19 + 0x30);
  }
  else {
    *(undefined1 *)(unaff_x19 + 0x68) = 1;
    uVar3 = *(uint *)(unaff_x19 + 0x30);
  }
  if ((uVar3 != in_w8) || (*(int *)(unaff_x19 + 0x34) != in_w12)) {
    *(undefined8 *)(unaff_x19 + 0x30) = param_1;
    *(undefined1 *)(unaff_x19 + 0x68) = 1;
    func_0x001420d0();
    in_w8 = *(uint *)(unaff_x19 + 0x20);
  }
  uVar3 = (int)((ulong)(*(long *)(unaff_x19 + 0x10) - *(long *)(unaff_x19 + 8)) >> 3) * -0x55555555;
  if ((int)(in_w8 + 1) < (int)uVar3) {
    uVar3 = in_w8 + 1;
  }
  uVar1 = *(uint *)(unaff_x19 + 0x6c);
  if ((int)in_w8 <= (int)*(uint *)(unaff_x19 + 0x6c)) {
    uVar1 = in_w8;
  }
  uVar2 = *(uint *)(unaff_x19 + 0x70);
  if ((int)*(uint *)(unaff_x19 + 0x70) <= (int)uVar3) {
    uVar2 = uVar3;
  }
  uVar1 = uVar1 & ((int)uVar1 >> 0x1f ^ 0xffffffffU);
  uVar3 = uVar1;
  if ((int)uVar1 <= (int)uVar2) {
    uVar3 = uVar2;
  }
  *(uint *)(unaff_x19 + 0x6c) = uVar1;
  *(uint *)(unaff_x19 + 0x70) = uVar3;
  *(undefined1 *)(unaff_x19 + 0x248) = 1;
  return;
}

