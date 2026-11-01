
void FUN_0026bd10(undefined8 param_1)

{
  char cVar1;
  ulong uVar2;
  char *pcVar3;
  long *unaff_x19;
  long *unaff_x20;
  long lVar4;
  undefined8 *puVar5;
  long unaff_x21;
  char *unaff_x22;
  ulong unaff_x23;
  int unaff_w24;
  long lVar6;
  long lVar7;
  long in_stack_00000010;
  long in_stack_00000018;
  long in_stack_00000020;
  long in_stack_00000028;
  long in_stack_00000030;
  long in_stack_00000038;
  long in_stack_00000048;
  char *in_stack_00000050;
  long in_stack_00000058;
  long in_stack_00000060;
  long in_stack_00000068;
  long in_stack_00000070;
  long in_stack_00000078;
  
  func_0x00263a40(param_1,2);
  if (in_stack_00000048 != unaff_x21) {
    in_stack_00000028 = in_stack_00000068;
    in_stack_00000020 = in_stack_00000060;
    in_stack_00000038 = in_stack_00000078;
    in_stack_00000030 = in_stack_00000070;
    pcVar3 = (char *)((ulong)in_stack_00000050 >> 8);
    unaff_x22 = in_stack_00000050;
    goto LAB_0026bbc0;
  }
  if (in_stack_00000058 == 0) {
LAB_0026bd94:
    in_stack_00000048 = -0x8000000000000000;
    pcVar3 = (char *)((ulong)unaff_x22 >> 8);
  }
  else {
    cVar1 = *in_stack_00000050;
    if (cVar1 != '\0') {
      if (-1 < cVar1) {
LAB_0026bd38:
        uVar2 = (ulong)cVar1;
        if (in_stack_00000058 == 1) goto LAB_0026bda4;
      }
      goto LAB_0026bd94;
    }
    in_stack_00000058 = in_stack_00000058 + -1;
    if (in_stack_00000058 != 0) {
      cVar1 = in_stack_00000050[1];
      if (cVar1 < '\0') goto LAB_0026bd38;
      goto LAB_0026bd94;
    }
    uVar2 = 0;
LAB_0026bda4:
    pcVar3 = in_stack_00000050;
    if (unaff_w24 == 0) {
      if (((ulong)unaff_x22 & 1) == 0) {
        in_stack_00000048 = unaff_x21 + -0x24;
      }
      else {
        if (unaff_x23 <= (uVar2 & 0xff)) goto LAB_0026bd48;
        in_stack_00000048 = unaff_x21 + -0x13;
      }
    }
    else {
      if (((ulong)unaff_x22 & 1) == 0) {
LAB_0026bd48:
        if (in_stack_00000018 != in_stack_00000010) {
          lVar4 = *unaff_x19;
          lVar7 = unaff_x19[3];
          lVar6 = unaff_x19[2];
          unaff_x20[1] = unaff_x19[1];
          *unaff_x20 = lVar4;
          unaff_x20[3] = lVar7;
          unaff_x20[2] = lVar6;
          lVar4 = unaff_x19[4];
          unaff_x20[5] = unaff_x19[5];
          unaff_x20[4] = lVar4;
          unaff_x20[6] = unaff_x19[6];
          return;
        }
        *unaff_x20 = unaff_x21;
        lVar4 = *unaff_x19;
        if (lVar4 <= unaff_x21 + -1) {
          return;
        }
        if (((*(byte *)(unaff_x19 + 3) & 1) == 0) &&
           ((unaff_x19[4] | 0x8000000000000000U) != 0x8000000000000000)) {
          func_0x00187bd4(unaff_x19[5],unaff_x19[4],1);
        }
        lVar6 = unaff_x19[1];
        lVar7 = unaff_x19[2];
        if (lVar7 != 0) {
          puVar5 = (undefined8 *)(lVar6 + 8);
          do {
            if (puVar5[-1] != 0) {
              func_0x00187bd4(*puVar5,puVar5[-1],1);
            }
            puVar5 = puVar5 + 3;
            lVar7 = lVar7 + -1;
          } while (lVar7 != 0);
        }
        goto joined_r0x0026bc58;
      }
      in_stack_00000048 = unaff_x21 + -0x2a;
    }
  }
LAB_0026bbc0:
  unaff_x20[4] = in_stack_00000028;
  unaff_x20[3] = in_stack_00000020;
  *(char *)(unaff_x20 + 1) = (char)unaff_x22;
  *(int *)((long)unaff_x20 + 9) = (int)pcVar3;
  *(char *)((long)unaff_x20 + 0xf) = (char)((ulong)pcVar3 >> 0x30);
  *(short *)((long)unaff_x20 + 0xd) = (short)((ulong)pcVar3 >> 0x20);
  unaff_x20[2] = in_stack_00000058;
  unaff_x20[6] = in_stack_00000038;
  unaff_x20[5] = in_stack_00000030;
  *unaff_x20 = in_stack_00000048;
  lVar4 = *unaff_x19;
  if (lVar4 <= unaff_x21 + -1) {
    return;
  }
  if (((*(byte *)(unaff_x19 + 3) & 1) == 0) &&
     ((unaff_x19[4] | 0x8000000000000000U) != 0x8000000000000000)) {
    func_0x00187bd4(unaff_x19[5],unaff_x19[4],1);
  }
  lVar6 = unaff_x19[1];
  lVar7 = unaff_x19[2];
  if (lVar7 != 0) {
    puVar5 = (undefined8 *)(lVar6 + 8);
    do {
      if (puVar5[-1] != 0) {
        func_0x00187bd4(*puVar5,puVar5[-1],1);
      }
      puVar5 = puVar5 + 3;
      lVar7 = lVar7 + -1;
    } while (lVar7 != 0);
  }
joined_r0x0026bc58:
  if (lVar4 != 0) {
    func_0x00187bd4(lVar6,lVar4 * 0x18,8);
  }
  return;
}

