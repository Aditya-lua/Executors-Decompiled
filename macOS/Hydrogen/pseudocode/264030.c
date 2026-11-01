
void FUN_00264030(long param_1)

{
  ulong uVar1;
  char cVar2;
  bool in_CY;
  long lVar3;
  ulong in_x9;
  uint in_w10;
  long in_x11;
  long in_x12;
  ulong uVar4;
  long in_x13;
  long *unaff_x19;
  long lVar5;
  undefined8 *unaff_x20;
  long unaff_x21;
  long lVar6;
  uint unaff_w22;
  undefined8 *puVar7;
  long unaff_x29;
  undefined1 uStack000000000000000f;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 uStack0000000000000050;
  ulong in_stack_00000058;
  undefined8 uStack0000000000000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  undefined1 *in_stack_00000098;
  
  if (!in_CY) {
    cVar2 = *(char *)(param_1 + in_x11);
    uVar1 = in_x12 + 4;
    *(ulong *)(unaff_x21 + 0x10) = uVar1;
    if ((((cVar2 != '\0') &&
         (uVar4 = (ulong)CONCAT11(cVar2,*(undefined1 *)(param_1 + in_x13)), uVar4 < 0xffff)) &&
        (!CARRY8(uVar1,uVar4))) &&
       ((uVar4 + uVar1 <= in_x9 &&
        (*(ulong *)(unaff_x21 + 0x10) = uVar4 + uVar1, (unaff_w22 & 0xff) == in_w10)))) {
      uStack0000000000000050 = param_1 + uVar1;
      in_stack_00000068 = in_stack_00000020;
      uStack0000000000000060 = in_stack_00000018;
      in_stack_00000078 = in_stack_00000030;
      in_stack_00000070 = in_stack_00000028;
      in_stack_00000088 = in_stack_00000040;
      in_stack_00000080 = in_stack_00000038;
      in_stack_00000098 = &uStack000000000000000f;
      in_stack_00000090 = in_stack_00000048;
      in_stack_00000058 = uVar4;
      func_0x0025ed04(&uStack0000000000000050,&uStack0000000000000060,unaff_x29 + -0x38);
      lVar6 = *unaff_x19;
      goto joined_r0x00264168;
    }
  }
  unaff_x20[1] = in_stack_00000020;
  *unaff_x20 = in_stack_00000018;
  unaff_x20[3] = in_stack_00000030;
  unaff_x20[2] = in_stack_00000028;
  unaff_x20[5] = in_stack_00000040;
  unaff_x20[4] = in_stack_00000038;
  unaff_x20[6] = in_stack_00000048;
  lVar6 = *unaff_x19;
joined_r0x00264168:
  if (-0x7fffffffffffffd5 < lVar6) {
    if ((((*(byte *)(unaff_x19 + 3) & 1) == 0) &&
        (lVar3 = unaff_x19[4], lVar3 != -0x8000000000000000)) && (lVar3 != 0)) {
      func_0x00187bd4(unaff_x19[5],lVar3,1);
    }
    lVar3 = unaff_x19[1];
    lVar5 = unaff_x19[2];
    if (lVar5 != 0) {
      puVar7 = (undefined8 *)(lVar3 + 8);
      do {
        if (puVar7[-1] != 0) {
          func_0x00187bd4(*puVar7,puVar7[-1],1);
        }
        puVar7 = puVar7 + 3;
        lVar5 = lVar5 + -1;
      } while (lVar5 != 0);
    }
    if (lVar6 != 0) {
      func_0x00187bd4(lVar3,lVar6 * 0x18,8);
    }
  }
  return;
}

