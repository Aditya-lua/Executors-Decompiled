
void FUN_00644174(long param_1,long param_2,undefined8 param_3,ulong param_4)

{
  code *pcVar1;
  int iVar2;
  undefined8 uVar3;
  ulong uVar4;
  undefined8 *puVar5;
  long lVar6;
  long unaff_x29;
  undefined1 auVar7 [16];
  undefined1 uStack0000000000000008;
  undefined1 uStack0000000000000028;
  undefined1 uStack00000000000000d0;
  int iStack_1bc;
  undefined1 auStack_1b8 [8];
  ulong uStack_1b0;
  ulong uStack_1a8;
  long lStack_1a0;
  undefined *apuStack_198 [2];
  ulong uStack_188;
  ulong uStack_180;
  long lStack_178;
  undefined1 auStack_164 [4];
  undefined *puStack_160;
  undefined *apuStack_158 [2];
  ulong uStack_148;
  ulong uStack_140;
  long lStack_138;
  undefined *apuStack_128 [2];
  ulong uStack_118;
  ulong uStack_110;
  long lStack_108;
  undefined1 uStack_f8;
  undefined1 auStack_f0 [56];
  undefined1 auStack_b8 [40];
  undefined8 uStack_90;
  char cStack_87;
  undefined *puStack_80;
  undefined *puStack_78;
  long lStack_48;
  
  do {
    *(undefined8 *)(param_2 + -8 + param_1 * 8) = 0;
    param_1 = param_1 + -1;
  } while (param_1 != 0);
  func_0x00611644();
  func_0x00612ba4(&uStack00000000000000d0);
  func_0x0003e9ec(&uStack0000000000000008);
  func_0x00087574(&uStack0000000000000028);
  func_0x00612ba4(unaff_x29 + -0xa8);
  func_0x00613f64(unaff_x29 + -0x70);
  auVar7 = __Unwind_Resume();
  lVar6 = auVar7._0_8_;
  lStack_48 = *(long *)PTR____stack_chk_guard_009b01e8;
  uVar3 = func_0x00612940(&puStack_80,auVar7._8_8_,0x30);
  puStack_80 = &UNK_009f6498;
  puStack_78 = &UNK_009f6630;
  func_0x00614fa8(uVar3,auStack_164,2,1,1);
  func_0x00612940(auStack_b8,&puStack_80,4);
  if (cStack_87 == '\0') {
    puVar5 = (undefined8 *)___cxa_allocate_exception(0x28);
    *(undefined4 *)(puVar5 + 1) = 1;
    puVar5[2] = 0x6f63656420524542;
    puVar5[3] = 0x726f727265206564;
    *(undefined1 *)(puVar5 + 4) = 0;
    *(undefined1 *)((long)puVar5 + 0x27) = 0x10;
    *puVar5 = &UNK_009f60b8;
    ___cxa_throw(puVar5,&UNK_009f6090,&DAT_0060f08c);
  }
  else {
    func_0x005fdd18(apuStack_198);
    uVar3 = 0;
    if (cStack_87 != '\0') {
      uVar3 = uStack_90;
    }
    func_0x005fe7ec(apuStack_198,auStack_b8,uVar3,0);
    func_0x00612a40(auStack_b8);
    if (((param_4 & 1) != 0) || (iVar2 = func_0x006140b8(&puStack_80), iVar2 == 0xa0)) {
      uVar4 = func_0x006129e8(&puStack_80);
      if (((uVar4 & 1) == 0) && (iVar2 = func_0x006140b8(&puStack_80), iVar2 == 0xa0)) {
        func_0x00612940(&puStack_160,&puStack_80,0xa0);
        func_0x00634c1c(lVar6 + 0x58,&puStack_160);
        func_0x00612a40(&puStack_160);
        func_0x00612ba4(&puStack_160);
      }
      uVar4 = func_0x006129e8(&puStack_80);
      if ((uVar4 & 1) == 0) {
        uStack_1a8 = 0;
        lStack_1a0 = 0;
        uStack_1b0 = 0xffffffffffffffff;
        func_0x00612940(auStack_f0,&puStack_80,0xa1);
        func_0x00612524(auStack_f0,auStack_1b8,&iStack_1bc);
        func_0x00612a40(auStack_f0);
        puStack_160 = &UNK_00a09a40;
        func_0x005fdd18(apuStack_158);
        func_0x005fdd18(apuStack_128);
        uStack_f8 = 1;
        if ((iStack_1bc != 0) ||
           (uVar4 = (**(code **)(**(long **)(lVar6 + 0x78) + 0x88))
                              (*(long **)(lVar6 + 0x78),&puStack_160,lStack_1a0,uStack_1a8),
           (uVar4 & 1) == 0)) {
          puVar5 = (undefined8 *)___cxa_allocate_exception(0x28);
          *(undefined4 *)(puVar5 + 1) = 1;
          puVar5[2] = 0x6f63656420524542;
          puVar5[3] = 0x726f727265206564;
          *(undefined1 *)(puVar5 + 4) = 0;
          *(undefined1 *)((long)puVar5 + 0x27) = 0x10;
          *puVar5 = &UNK_009f60b8;
          ___cxa_throw(puVar5,&UNK_009f6090,&DAT_0060f08c);
          goto code_r0x00644134;
        }
        puStack_160 = &UNK_00a09a40;
        apuStack_128[0] = &UNK_009f5d60;
        if (uStack_110 <= uStack_118) {
          uStack_118 = uStack_110;
        }
        if (lStack_108 != 0) {
          if (uStack_118 != 0) {
            do {
              *(undefined8 *)(lStack_108 + -8 + uStack_118 * 8) = 0;
              uStack_118 = uStack_118 - 1;
            } while (uStack_118 != 0);
          }
          func_0x00611644();
        }
        apuStack_158[0] = &UNK_009f5d60;
        if (uStack_140 <= uStack_148) {
          uStack_148 = uStack_140;
        }
        if (lStack_138 != 0) {
          if (uStack_148 != 0) {
            do {
              *(undefined8 *)(lStack_138 + -8 + uStack_148 * 8) = 0;
              uStack_148 = uStack_148 - 1;
            } while (uStack_148 != 0);
          }
          func_0x00611644();
        }
        func_0x00612ba4(auStack_f0);
        uVar4 = uStack_1b0;
        if (uStack_1a8 <= uStack_1b0) {
          uVar4 = uStack_1a8;
        }
        if (lStack_1a0 != 0) {
          if (uVar4 != 0) {
            do {
              *(undefined1 *)(lStack_1a0 + -1 + uVar4) = 0;
              uVar4 = uVar4 - 1;
            } while (uVar4 != 0);
          }
          func_0x00611644();
        }
      }
      func_0x00612a40(&puStack_80);
      (**(code **)(*(long *)(lVar6 + -8) + 0x28))((long *)(lVar6 + -8),apuStack_198);
      apuStack_198[0] = &UNK_009f5d60;
      if (uStack_180 <= uStack_188) {
        uStack_188 = uStack_180;
      }
      if (lStack_178 != 0) {
        if (uStack_188 != 0) {
          do {
            *(undefined8 *)(lStack_178 + -8 + uStack_188 * 8) = 0;
            uStack_188 = uStack_188 - 1;
          } while (uStack_188 != 0);
        }
        func_0x00611644();
      }
      func_0x00612ba4(auStack_b8);
      func_0x00613f64(&puStack_80);
      if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_48) {
        return;
      }
      ___stack_chk_fail();
    }
    puVar5 = (undefined8 *)___cxa_allocate_exception(0x28);
    *(undefined4 *)(puVar5 + 1) = 1;
    puVar5[2] = 0x6f63656420524542;
    puVar5[3] = 0x726f727265206564;
    *(undefined1 *)(puVar5 + 4) = 0;
    *(undefined1 *)((long)puVar5 + 0x27) = 0x10;
    *puVar5 = &UNK_009f60b8;
    ___cxa_throw(puVar5,&UNK_009f6090,&DAT_0060f08c);
  }
code_r0x00644134:
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x644138);
  (*pcVar1)();
}

