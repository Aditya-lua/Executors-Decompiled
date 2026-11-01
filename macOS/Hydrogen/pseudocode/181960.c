
undefined1  [16] FUN_00181960(undefined1 param_1 [16])

{
  long lVar1;
  ulong uVar2;
  undefined8 *puVar3;
  ulong uVar4;
  undefined8 *unaff_x19;
  long lVar5;
  ulong *puVar6;
  long unaff_x21;
  long *unaff_x22;
  ulong unaff_x23;
  long unaff_x24;
  undefined8 *unaff_x25;
  ulong *unaff_x26;
  ulong *unaff_x27;
  long unaff_x28;
  long unaff_x29;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined1 auVar10 [16];
  long in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 uStack0000000000000030;
  undefined8 in_stack_00000038;
  undefined8 uStack0000000000000048;
  long in_stack_00000050;
  long in_stack_00000058;
  ulong in_stack_00000060;
  char cStack0000000000000068;
  undefined7 uStack0000000000000069;
  ulong in_stack_00000070;
  long in_stack_00000078;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000088;
  undefined1 uStack0000000000000090;
  long lStack0000000000000098;
  long lStack00000000000000a0;
  ulong uStack00000000000000a8;
  undefined8 in_stack_000000b0;
  ulong in_stack_000000b8;
  long in_stack_000000c0;
  undefined8 in_stack_000000c8;
  undefined8 in_stack_000000d0;
  
  uStack00000000000000a8 = param_1._8_8_;
  lStack00000000000000a0 = param_1._0_8_;
code_r0x00181960:
  lStack0000000000000098 = in_stack_00000050;
  _uStack0000000000000090 = uStack0000000000000048;
  func_0x003f18a4(unaff_x29 + -0xa8,&uStack0000000000000090);
  lVar5 = unaff_x22[2];
  if (lVar5 == *unaff_x22) {
    func_0x001d8f4c();
  }
  puVar3 = (undefined8 *)(unaff_x22[1] + lVar5 * 0x48);
  uVar7 = unaff_x19[4];
  uVar9 = unaff_x19[7];
  uVar8 = unaff_x19[6];
  puVar3[5] = unaff_x19[5];
  puVar3[4] = uVar7;
  puVar3[7] = uVar9;
  puVar3[6] = uVar8;
  puVar3[8] = *(undefined8 *)(unaff_x29 + -0x68);
  uVar9 = *unaff_x19;
  uVar8 = unaff_x19[3];
  uVar7 = unaff_x19[2];
  puVar3[1] = unaff_x19[1];
  *puVar3 = uVar9;
  puVar3[3] = uVar8;
  puVar3[2] = uVar7;
  unaff_x22[2] = lVar5 + 1;
  if ((_uStack0000000000000090 != unaff_x23) && (_uStack0000000000000090 != 0)) {
    func_0x00187bd4(lStack0000000000000098,_uStack0000000000000090,1);
  }
  if ((uStack00000000000000a8 != unaff_x23) && (uStack00000000000000a8 != 0)) {
    func_0x00187bd4(in_stack_000000b0,uStack00000000000000a8,1);
  }
  if ((unaff_x24 <= in_stack_000000c0) && (in_stack_000000c0 != 0)) {
    func_0x00187bd4(in_stack_000000c8,in_stack_000000c0,1);
  }
  unaff_x28 = unaff_x28 + 1;
  puVar6 = unaff_x27;
  do {
    if ((uStack0000000000000030 != unaff_x23) && (uStack0000000000000030 != 0)) {
      func_0x00187bd4(in_stack_00000038,uStack0000000000000030,1);
    }
    if (puVar6 == unaff_x26) goto code_r0x00181b20;
    unaff_x27 = puVar6 + 3;
    uVar4 = *puVar6;
    if (uVar4 == 0x8000000000000001) {
      if ((long)unaff_x26 - (long)unaff_x27 != 0) {
        uVar4 = (ulong)((long)unaff_x26 - (long)unaff_x27) / 0x18;
        puVar6 = puVar6 + 4;
        do {
          uVar2 = puVar6[-1];
          if (uVar2 != 0x8000000000000000 && uVar2 != 0) {
            func_0x00187bd4(*puVar6,uVar2,1);
          }
          puVar6 = puVar6 + 3;
          uVar4 = uVar4 - 1;
        } while (uVar4 != 0);
      }
code_r0x00181b20:
      if (in_stack_00000000 != 0) {
        func_0x00187bd4(in_stack_00000008,in_stack_00000000 * 0x18,8);
      }
      auVar10._8_8_ = unaff_x21;
      auVar10._0_8_ = unaff_x28;
      return auVar10;
    }
    uVar2 = puVar6[1];
    unaff_x25[2] = puVar6[2];
    unaff_x25[1] = uVar2;
    uStack0000000000000030 = uVar4;
    func_0x0026de4c(&uStack0000000000000048,&uStack0000000000000030);
    uVar4 = in_stack_00000060;
    lVar1 = in_stack_00000058;
    lVar5 = in_stack_00000050;
    if (uStack0000000000000048 != 0x8000000000000001) break;
    if (unaff_x24 + 0x29 < in_stack_00000050) {
      if ((cStack0000000000000068 == '\0') &&
         ((in_stack_00000070 | 0x8000000000000000) != unaff_x23)) {
        func_0x00187bd4(in_stack_00000078,in_stack_00000070,1);
      }
      if (uVar4 != 0) {
        puVar3 = (undefined8 *)(lVar1 + 8);
        do {
          if (puVar3[-1] != 0) {
            func_0x00187bd4(*puVar3,puVar3[-1],1);
          }
          puVar3 = puVar3 + 3;
          uVar4 = uVar4 - 1;
        } while (uVar4 != 0);
      }
      unaff_x19 = (undefined8 *)(unaff_x29 + -0xa8);
      if (lVar5 != 0) {
        func_0x00187bd4(lVar1,lVar5 * 0x18,8);
      }
    }
    unaff_x21 = unaff_x21 + 1;
    unaff_x24 = -0x7ffffffffffffffe;
    unaff_x25 = &uStack0000000000000030;
    puVar6 = unaff_x27;
  } while( true );
  in_stack_000000b0 = CONCAT71(uStack0000000000000069,cStack0000000000000068);
  in_stack_000000b8 = in_stack_00000070;
  in_stack_000000c8 = in_stack_00000080;
  in_stack_000000c0 = in_stack_00000078;
  in_stack_000000d0 = in_stack_00000088;
  lStack00000000000000a0 = in_stack_00000058;
  uStack00000000000000a8 = in_stack_00000060;
  goto code_r0x00181960;
}

