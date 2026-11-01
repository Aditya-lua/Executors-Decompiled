
void FUN_006e3bc0(long param_1,undefined8 param_2)

{
  long lVar1;
  undefined8 *in_x9;
  long lVar2;
  long lVar3;
  long unaff_x19;
  int unaff_w20;
  undefined8 uVar4;
  
  *(undefined8 **)(unaff_x19 + 8) = in_x9;
  if (unaff_w20 != 0) {
    lVar2 = (long)unaff_w20;
    lVar3 = lVar2 << 4;
    do {
      lVar2 = lVar2 + -1;
      lVar1 = *(long *)(unaff_x19 + 8) + lVar3;
      uVar4 = *(undefined8 *)(lVar1 + -0x10);
      ((undefined8 *)(param_1 + lVar3))[1] = *(undefined8 *)(lVar1 + -8);
      *(undefined8 *)(param_1 + lVar3) = uVar4;
      lVar3 = lVar3 + -0x10;
    } while ((int)lVar2 != 0);
    in_x9 = *(undefined8 **)(unaff_x19 + 8);
  }
  *in_x9 = param_2;
  *(undefined4 *)((long)in_x9 + 0xc) = 7;
  *(long *)(unaff_x19 + 8) = *(long *)(unaff_x19 + 8) + 0x10;
  return;
}

