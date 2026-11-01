
void FUN_004fc7c4(undefined8 param_1)

{
  bool bVar1;
  undefined *puVar2;
  undefined8 uVar3;
  code *pcVar4;
  bool in_ZR;
  ulong uVar5;
  ulong unaff_x21;
  long *plVar6;
  long unaff_x24;
  long lVar7;
  long unaff_x29;
  long lVar8;
  long lVar9;
  long in_stack_00000008;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined1 uStack0000000000000038;
  undefined8 uStack0000000000000040;
  undefined8 uStack0000000000000048;
  undefined8 uStack0000000000000050;
  ulong uStack0000000000000058;
  undefined8 uStack0000000000000060;
  undefined8 uStack0000000000000068;
  undefined8 uStack0000000000000070;
  undefined8 uStack0000000000000078;
  long lStack0000000000000080;
  undefined8 uStack0000000000000088;
  undefined8 in_stack_00000090;
  undefined8 in_stack_00000098;
  undefined8 uStack00000000000000a0;
  undefined8 in_stack_000000a8;
  ulong in_stack_000000b0;
  
  bVar1 = !in_ZR;
  _uStack0000000000000038 = (ulong)bVar1;
  uStack0000000000000040 = 0;
  uStack0000000000000060 = 0;
  lVar8 = -(ulong)((long)((ulong)CONCAT14(bVar1,(uint)bVar1) << 0x3f) < 0);
  lVar9 = -(ulong)((long)((ulong)bVar1 << 0x3f) < 0);
  uStack0000000000000050 =
       CONCAT17((byte)((ulong)in_stack_00000028 >> 0x38) & (byte)((ulong)lVar8 >> 0x38),
                CONCAT16((byte)((ulong)in_stack_00000028 >> 0x30) & (byte)((ulong)lVar8 >> 0x30),
                         CONCAT15((byte)((ulong)in_stack_00000028 >> 0x28) &
                                  (byte)((ulong)lVar8 >> 0x28),
                                  CONCAT14((byte)((ulong)in_stack_00000028 >> 0x20) &
                                           (byte)((ulong)lVar8 >> 0x20),
                                           CONCAT13((byte)((ulong)in_stack_00000028 >> 0x18) &
                                                    (byte)((ulong)lVar8 >> 0x18),
                                                    CONCAT12((byte)((ulong)in_stack_00000028 >> 0x10
                                                                   ) & (byte)((ulong)lVar8 >> 0x10),
                                                             CONCAT11((byte)((ulong)
                                                  in_stack_00000028 >> 8) &
                                                  (byte)((ulong)lVar8 >> 8),
                                                  (byte)in_stack_00000028 & (byte)lVar8)))))));
  uStack0000000000000078 =
       CONCAT17((byte)((ulong)in_stack_00000030 >> 0x38) & (byte)((ulong)lVar9 >> 0x38),
                CONCAT16((byte)((ulong)in_stack_00000030 >> 0x30) & (byte)((ulong)lVar9 >> 0x30),
                         CONCAT15((byte)((ulong)in_stack_00000030 >> 0x28) &
                                  (byte)((ulong)lVar9 >> 0x28),
                                  CONCAT14((byte)((ulong)in_stack_00000030 >> 0x20) &
                                           (byte)((ulong)lVar9 >> 0x20),
                                           CONCAT13((byte)((ulong)in_stack_00000030 >> 0x18) &
                                                    (byte)((ulong)lVar9 >> 0x18),
                                                    CONCAT12((byte)((ulong)in_stack_00000030 >> 0x10
                                                                   ) & (byte)((ulong)lVar9 >> 0x10),
                                                             CONCAT11((byte)((ulong)
                                                  in_stack_00000030 >> 8) &
                                                  (byte)((ulong)lVar9 >> 8),
                                                  (byte)in_stack_00000030 & (byte)lVar9)))))));
  lStack0000000000000080 = 0;
  plVar6 = *(long **)(in_stack_00000008 + 8);
  uStack0000000000000048 = param_1;
  uStack0000000000000058 = _uStack0000000000000038;
  uStack0000000000000068 = param_1;
  uStack0000000000000070 = uStack0000000000000050;
  while( true ) {
    func_0x005082b4(unaff_x29 + -0x88,&uStack0000000000000038);
    lVar8 = *(long *)(unaff_x29 + -0x88);
    if (lVar8 == 0) break;
    lVar9 = lVar8 + *(long *)(unaff_x29 + -0x78) * 0x20;
    lVar7 = *(long *)(lVar9 + 8);
    if (lVar7 == -0x8000000000000000) break;
    uVar3 = *(undefined8 *)(lVar9 + 0x10);
    uVar5 = *(ulong *)(lVar9 + 0x18);
    lVar9 = *(long *)(lVar8 + *(long *)(unaff_x29 + -0x78) * 8 + 0x168);
    lVar8 = lStack0000000000000080 + 1;
    bVar1 = lStack0000000000000080 != 0;
    lStack0000000000000080 = lVar8;
    if (bVar1) {
      lVar8 = plVar6[2];
      if (*plVar6 == lVar8) {
        func_0x007a5594(plVar6,lVar8,1,1,1);
        lVar8 = plVar6[2];
      }
      *(undefined1 *)(plVar6[1] + lVar8) = 10;
      plVar6[2] = lVar8 + 1;
    }
    func_0x004fcb64(&uStack0000000000000088,lVar9);
    puVar2 = &
             __ZN91__LT__RF_clap_builder__builder__styled_str__StyledStr_u20_as_u20_core__default__Default_GT_7default7DEFAULT17h290532f3983c5934E
    ;
    if (*(long *)(lVar9 + 0x158) != -0x8000000000000000) {
      puVar2 = (undefined *)(lVar9 + 0x158);
    }
    if (*(long *)(lVar9 + 0x140) != -0x8000000000000000) {
      puVar2 = (undefined *)(lVar9 + 0x140);
    }
    lVar8 = plVar6[2];
    uStack00000000000000a0 = lVar7;
    in_stack_000000a8 = uVar3;
    in_stack_000000b0 = uVar5;
    if ((ulong)(*plVar6 - lVar8) < 2) {
      func_0x007a5594(plVar6,lVar8,2,1,1);
      lVar8 = plVar6[2];
    }
    uVar5 = in_stack_000000b0;
    uVar3 = in_stack_000000a8;
    *(undefined2 *)(plVar6[1] + lVar8) = 0x2020;
    lVar8 = lVar8 + 2;
    plVar6[2] = lVar8;
    if ((ulong)(*plVar6 - lVar8) < in_stack_000000b0) {
      func_0x007a5594(plVar6,lVar8,in_stack_000000b0,1,1);
      lVar8 = plVar6[2];
    }
    _memcpy(plVar6[1] + lVar8,uVar3,uVar5);
    plVar6[2] = lVar8 + uVar5;
    if ((unaff_x21 & 1) == 0) {
      lVar8 = func_0x00512350(&uStack00000000000000a0);
      uVar5 = (unaff_x24 + 2) - lVar8;
      if (uVar5 >> 0x10 != 0) {
        *(undefined **)(unaff_x29 + -0x88) = &UNK_009e8630;
        *(undefined8 *)(unaff_x29 + -0x80) = 1;
        *(undefined8 *)(unaff_x29 + -0x70) = 0;
        *(undefined8 *)(unaff_x29 + -0x68) = 0;
        *(undefined8 *)(unaff_x29 + -0x78) = 8;
        func_0x007a2420(unaff_x29 + -0x88,&UNK_009e8798);
                    /* WARNING: Does not return */
        pcVar4 = (code *)SoftwareBreakpoint(1,0x4fcaa0);
        (*pcVar4)();
      }
      *(undefined **)(unaff_x29 + -0xa8) = &UNK_007fc120;
      *(undefined **)(unaff_x29 + -0xa0) = &DAT_00519924;
      *(undefined8 *)(unaff_x29 + -0x98) = 0;
      *(short *)(unaff_x29 + -0x90) = (short)uVar5;
      *(undefined **)(unaff_x29 + -0x88) = &UNK_007fc120;
      *(undefined8 *)(unaff_x29 + -0x80) = 1;
      *(undefined **)(unaff_x29 + -0x68) = &UNK_008a4188;
      *(undefined8 *)(unaff_x29 + -0x60) = 1;
      *(long *)(unaff_x29 + -0x78) = unaff_x29 + -0xa8;
      *(undefined8 *)(unaff_x29 + -0x70) = 2;
      func_0x0046849c(plVar6,&UNK_009e84b0,unaff_x29 + -0x88);
    }
    if (uStack00000000000000a0 != 0) {
      func_0x00187bd4(in_stack_000000a8,uStack00000000000000a0,1);
    }
    uVar3 = in_stack_00000090;
    func_0x004fab08(in_stack_00000008,0,puVar2,in_stack_00000090,in_stack_00000098);
    if (uStack0000000000000088 != 0) {
      func_0x00187bd4(uVar3,uStack0000000000000088,1);
    }
  }
  while( true ) {
    func_0x005082b4(unaff_x29 + -0x88,&uStack0000000000000038);
    if (*(long *)(unaff_x29 + -0x88) == 0) break;
    lVar8 = *(long *)(unaff_x29 + -0x88) + *(long *)(unaff_x29 + -0x78) * 0x20;
    lVar9 = *(long *)(lVar8 + 8);
    if (lVar9 != 0) {
      func_0x00187bd4(*(undefined8 *)(lVar8 + 0x10),lVar9,1);
    }
  }
  return;
}

