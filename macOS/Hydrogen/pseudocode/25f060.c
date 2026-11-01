
void FUN_0025f060(long param_1)

{
  long lVar1;
  undefined8 in_x9;
  undefined1 in_w11;
  undefined4 in_w12;
  undefined4 in_register_00004064;
  long lVar2;
  long *unaff_x19;
  undefined8 *unaff_x20;
  long lVar3;
  undefined8 *puVar4;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  
  unaff_x20[4] = in_stack_00000028;
  unaff_x20[3] = in_stack_00000020;
  *unaff_x20 = 0x800000000000001f;
  *(undefined1 *)(unaff_x20 + 1) = in_w11;
  *(undefined4 *)((long)unaff_x20 + 9) = in_w12;
  *(char *)((long)unaff_x20 + 0xf) = (char)((uint)in_register_00004064 >> 0x10);
  *(short *)((long)unaff_x20 + 0xd) = (short)in_register_00004064;
  unaff_x20[2] = in_x9;
  unaff_x20[6] = in_stack_00000038;
  unaff_x20[5] = in_stack_00000030;
  lVar3 = *unaff_x19;
  if (param_1 + 0x27 < lVar3) {
    if ((((*(byte *)(unaff_x19 + 3) & 1) == 0) &&
        (lVar1 = unaff_x19[4], lVar1 != -0x8000000000000000)) && (lVar1 != 0)) {
      func_0x00187bd4(unaff_x19[5],lVar1,1);
    }
    lVar1 = unaff_x19[1];
    lVar2 = unaff_x19[2];
    if (lVar2 != 0) {
      puVar4 = (undefined8 *)(lVar1 + 8);
      do {
        if (puVar4[-1] != 0) {
          func_0x00187bd4(*puVar4,puVar4[-1],1);
        }
        puVar4 = puVar4 + 3;
        lVar2 = lVar2 + -1;
      } while (lVar2 != 0);
    }
    if (lVar3 != 0) {
      func_0x00187bd4(lVar1,lVar3 * 0x18,8);
    }
  }
  return;
}

