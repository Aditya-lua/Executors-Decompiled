
void FUN_0025abe8(undefined8 param_1)

{
  long lVar1;
  undefined8 in_x9;
  undefined8 in_x10;
  undefined1 in_w11;
  long *unaff_x19;
  long lVar2;
  undefined8 *unaff_x20;
  long unaff_x21;
  undefined8 *puVar3;
  undefined8 unaff_x22;
  long lVar4;
  undefined8 unaff_x23;
  undefined4 uStack0000000000000048;
  undefined4 uStack000000000000004c;
  undefined8 uStack0000000000000050;
  undefined8 in_stack_00000080;
  undefined8 in_stack_000000b8;
  
  uStack0000000000000048 = CONCAT31((int3)in_stack_00000080,in_w11);
  uStack000000000000004c = (undefined4)((ulong)in_stack_00000080 >> 0x18);
  uStack0000000000000050 = in_stack_000000b8;
  unaff_x20[2] = unaff_x22;
  unaff_x20[1] = unaff_x23;
  unaff_x20[4] = in_x10;
  unaff_x20[3] = in_x9;
  unaff_x20[6] = in_stack_000000b8;
  unaff_x20[5] = CONCAT44(uStack000000000000004c,uStack0000000000000048);
  *unaff_x20 = param_1;
  lVar4 = *unaff_x19;
  if (unaff_x21 + -1 < lVar4) {
    if ((((*(byte *)(unaff_x19 + 3) & 1) == 0) &&
        (lVar1 = unaff_x19[4], lVar1 != -0x8000000000000000)) && (lVar1 != 0)) {
      func_0x00187bd4(unaff_x19[5],lVar1,1);
    }
    lVar1 = unaff_x19[1];
    lVar2 = unaff_x19[2];
    if (lVar2 != 0) {
      puVar3 = (undefined8 *)(lVar1 + 8);
      do {
        if (puVar3[-1] != 0) {
          func_0x00187bd4(*puVar3,puVar3[-1],1);
        }
        puVar3 = puVar3 + 3;
        lVar2 = lVar2 + -1;
      } while (lVar2 != 0);
    }
    if (lVar4 != 0) {
      func_0x00187bd4(lVar1,lVar4 * 0x18,8);
    }
  }
  return;
}

