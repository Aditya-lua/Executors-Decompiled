
void FUN_00506024(long param_1)

{
  int iVar1;
  ulong uVar2;
  long *plVar3;
  long unaff_x19;
  undefined8 *puVar4;
  long lVar5;
  long lVar6;
  long unaff_x20;
  undefined8 *puVar7;
  long *unaff_x21;
  long *unaff_x22;
  long lVar8;
  undefined8 *unaff_x23;
  long unaff_x24;
  undefined8 *puVar9;
  long *plVar10;
  long unaff_x25;
  long unaff_x26;
  undefined8 *unaff_x27;
  long unaff_x28;
  long unaff_x29;
  long *in_stack_00000008;
  undefined8 in_stack_00000010;
  long in_stack_00000018;
  long in_stack_00000020;
  undefined8 in_stack_00000028;
  undefined8 uStack0000000000000030;
  undefined8 *in_stack_00000038;
  long in_stack_00000040;
  undefined8 uStack0000000000000048;
  long in_stack_00000050;
  long lStack0000000000000058;
  undefined8 uStack0000000000000060;
  long in_stack_00000068;
  long in_stack_00000070;
  
code_r0x00506024:
  *(undefined8 **)(param_1 + unaff_x20 * 8) = unaff_x23;
  lStack0000000000000058 = unaff_x20 + 1;
code_r0x00506030:
  lVar6 = in_stack_00000070;
  if (in_stack_00000070 == uStack0000000000000060) {
    func_0x0050c0c0(&uStack0000000000000060,&UNK_009e8c20);
  }
  plVar10 = (long *)(in_stack_00000068 + lVar6 * 0x10);
  *plVar10 = unaff_x24;
  plVar10[1] = unaff_x25;
  in_stack_00000070 = lVar6 + 1;
  if (unaff_x22 == unaff_x21) goto code_r0x00505e2c;
code_r0x00505f2c:
  plVar10 = unaff_x22;
  if (unaff_x28 == 0) {
    do {
      plVar3 = plVar10 + 4;
      if (*plVar10 == 0) {
        unaff_x22 = plVar10 + 4;
        goto code_r0x00505fb8;
      }
      plVar10 = plVar3;
    } while (plVar3 != unaff_x21);
  }
  else {
    do {
      unaff_x22 = plVar10 + 4;
      if (*plVar10 == 0) goto code_r0x00505fb8;
      *(undefined8 *)(unaff_x29 + -0x68) = in_stack_00000028;
      *(long **)(unaff_x29 + -0x60) = plVar10;
      lVar6 = in_stack_00000020;
      do {
        lVar8 = *(long *)(lVar6 + 8);
        lVar5 = *(long *)(lVar6 + 0x10);
        lVar6 = lVar6 + 0x18;
        *(long *)(unaff_x29 + -0x58) = unaff_x29 + -0x68;
        lVar5 = lVar5 * 0x18;
        while (lVar5 != 0) {
          uVar2 = func_0x0052467c(unaff_x29 + -0x58,lVar8);
          lVar8 = lVar8 + 0x18;
          lVar5 = lVar5 + -0x18;
          if ((uVar2 & 1) != 0) goto code_r0x00505fb8;
        }
      } while (lVar6 != in_stack_00000018);
      plVar10 = unaff_x22;
    } while (unaff_x22 != unaff_x21);
  }
code_r0x00505e2c:
  do {
    lVar6 = in_stack_00000040;
    puVar4 = in_stack_00000038;
    if (lStack0000000000000058 == 0) {
      in_stack_00000008[1] = in_stack_00000068;
      *in_stack_00000008 = uStack0000000000000060;
      in_stack_00000008[2] = in_stack_00000070;
      if (uStack0000000000000048 != 0) {
        func_0x00187bd4(in_stack_00000050,uStack0000000000000048 << 3,8);
      }
      if (uStack0000000000000030 != 0) {
        func_0x00187bd4(in_stack_00000038,uStack0000000000000030 << 3,8);
      }
      return;
    }
    lStack0000000000000058 = lStack0000000000000058 + -1;
    puVar7 = *(undefined8 **)(in_stack_00000050 + lStack0000000000000058 * 8);
    if (in_stack_00000040 != 0) {
      lVar5 = puVar7[1];
      lVar8 = in_stack_00000040 << 3;
      puVar9 = in_stack_00000038;
      do {
        if ((((undefined8 *)*puVar9)[1] == lVar5) &&
           (iVar1 = _memcmp(*(undefined8 *)*puVar9,*puVar7,lVar5), iVar1 == 0))
        goto code_r0x00505e2c;
        lVar8 = lVar8 + -8;
        puVar9 = puVar9 + 1;
      } while (lVar8 != 0);
    }
    if (lVar6 == uStack0000000000000030) {
      func_0x0050c238(&uStack0000000000000030,&UNK_009e8bf0);
      puVar4 = in_stack_00000038;
    }
    puVar4[lVar6] = puVar7;
    in_stack_00000040 = lVar6 + 1;
    lVar5 = puVar7[1];
    lVar8 = unaff_x19;
    lVar6 = unaff_x26;
    do {
      if ((*(long *)(lVar6 + 0x220) == lVar5) &&
         (iVar1 = _memcmp(*(undefined8 *)(lVar6 + 0x218),*puVar7,lVar5), iVar1 == 0)) {
        if ((*(long *)(lVar6 + 0xc0) != 0) && (in_stack_00000010._4_4_ != 0)) {
          unaff_x22 = *(long **)(lVar6 + 0xb8);
          unaff_x21 = unaff_x22 + *(long *)(lVar6 + 0xc0) * 4;
          goto code_r0x00505f2c;
        }
        break;
      }
      lVar6 = lVar6 + 600;
      lVar8 = lVar8 + -600;
    } while (lVar8 != 0);
  } while( true );
code_r0x00505fb8:
  unaff_x24 = plVar10[2];
  unaff_x25 = plVar10[3];
  lVar6 = unaff_x19;
  unaff_x23 = unaff_x27;
  do {
    if (unaff_x23[1] == unaff_x25) {
      iVar1 = _memcmp(*unaff_x23,unaff_x24,unaff_x25);
      unaff_x20 = lStack0000000000000058;
      if (iVar1 == 0) {
        if (unaff_x23[-0x2b] != 0) {
          if (lStack0000000000000058 == uStack0000000000000048) {
            func_0x0050c238(&uStack0000000000000048,&UNK_009e8c08);
          }
          param_1 = in_stack_00000050;
          goto code_r0x00506024;
        }
        break;
      }
    }
    unaff_x23 = unaff_x23 + 0x4b;
    lVar6 = lVar6 + -600;
  } while (lVar6 != 0);
  goto code_r0x00506030;
}

