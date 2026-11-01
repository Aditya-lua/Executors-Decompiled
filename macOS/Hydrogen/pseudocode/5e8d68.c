
void FUN_005e8d68(ulong param_1)

{
  long lVar1;
  ulong uVar2;
  long lVar3;
  bool bVar4;
  code *pcVar5;
  byte bVar6;
  long lVar7;
  undefined8 *puVar8;
  undefined8 uVar9;
  long lVar10;
  undefined8 uVar11;
  undefined8 *unaff_x19;
  undefined8 unaff_x20;
  int *unaff_x21;
  long unaff_x22;
  undefined8 uStack0000000000000018;
  
  if ((param_1 & 0x7fffffffffffffff) == 0) {
    bVar6 = 0;
  }
  else {
    bVar6 = func_0x007a1140();
    bVar6 = bVar6 ^ 1;
  }
  if (cRam0000000000a2a9f0 != '\0') {
    uStack0000000000000018 = unaff_x22;
    func_0x007a2810(&UNK_008b9ba0,0x2b,&uStack0000000000000018,&UNK_009f3d60,&UNK_009f3d98);
code_r0x005e8db0:
                    /* WARNING: Does not return */
    pcVar5 = (code *)SoftwareBreakpoint(1,0x5e8db4);
    (*pcVar5)();
  }
  func_0x005ea7a8(unaff_x22 + 0x10);
  if (*unaff_x21 != 1) {
    uVar9 = 0;
    lVar7 = *(long *)(unaff_x21 + 2);
code_r0x005e8c7c:
    lVar10 = lRam0000000000a2aa08;
    uVar11 = *(undefined8 *)(unaff_x21 + 4);
    uStack0000000000000018 = uVar9;
    if (lRam0000000000a2aa08 == lRam0000000000a2a9f8) {
      func_0x005ea18c(0xa2a9f8,&UNK_009f3db0);
    }
    puVar8 = (undefined8 *)(*(long *)(unaff_x22 + 0x18) + lVar10 * 0x18);
    puVar8[1] = lVar7;
    *puVar8 = uStack0000000000000018;
    puVar8[2] = uVar11;
    uVar2 = lVar10 + 1;
    *(ulong *)(unaff_x22 + 0x20) = uVar2;
    *(bool *)unaff_x20 = uVar2 < 2;
    *(byte *)(unaff_x19 + 2) = bVar6;
    *unaff_x19 = 2;
    unaff_x19[1] = unaff_x22;
    return;
  }
  lVar7 = *(long *)(unaff_x21 + 2);
  uVar9 = 1;
  do {
    lVar10 = *(long *)(lVar7 + 8);
    while (lVar10 != -1) {
      if (lVar10 < 0) {
        func_0x007b1070(&UNK_009f3bc0,&UNK_009f3bd0);
        goto code_r0x005e8db0;
      }
      lVar1 = lVar10 + 1;
      lVar3 = *(long *)(lVar7 + 8);
      bVar4 = lVar3 == lVar10;
      lVar10 = lVar3;
      if (bVar4) {
        *(long *)(lVar7 + 8) = lVar1;
        goto code_r0x005e8c7c;
      }
    }
    InstructionSynchronizationBarrier();
  } while( true );
}

