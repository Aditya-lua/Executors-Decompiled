
void FUN_007a187c(undefined8 param_1)

{
  char cVar1;
  long *plVar2;
  code *pcVar3;
  ulong *puVar4;
  long lVar5;
  int iVar6;
  ulong uVar7;
  ulong uVar8;
  uint uVar9;
  ulong uVar10;
  ulong uVar11;
  long unaff_x29;
  undefined4 in_wzr;
  undefined1 auVar12 [16];
  undefined1 auVar13 [12];
  undefined1 uStack0000000000000008;
  long lStack0000000000000018;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000028;
  ulong auStack_80 [2];
  undefined1 *puStack_70;
  long *plStack_68;
  char cStack_60;
  undefined1 uStack_5f;
  
  lStack0000000000000018 = unaff_x29 + -8;
  uStack0000000000000020 = 0;
  uStack0000000000000028 = 0;
  _uStack0000000000000008 = param_1;
  func_0x0041f554(unaff_x29 + -8,&uStack0000000000000008);
  func_0x003f77f4();
  auVar13 = func_0x007a144c();
  puVar4 = auVar13._0_8_;
  uVar11 = 0;
  auStack_80[1] = 0;
  auStack_80[0] = 0;
  plStack_68 = (long *)0x0;
  puStack_70 = (undefined1 *)0x0;
  uStack_5f = auVar13[8];
  cStack_60 = '\0';
  uVar10 = *puVar4;
  pcVar3 = (code *)&DAT_00437f1c;
  if (auVar13._8_4_ == 0) {
    pcVar3 = (code *)&DAT_00437f3c;
  }
LAB_007a1920:
  while( true ) {
    auVar12 = (*pcVar3)(uVar10);
    if ((auVar12._0_8_ & 1) != 0) {
      uVar7 = *puVar4;
      if (uVar7 == uVar10) {
        *puVar4 = auVar12._8_8_;
        if (plStack_68 != (long *)0x0) {
          lVar5 = *plStack_68;
          *plStack_68 = lVar5 + -1;
          LORelease();
          if (lVar5 == 1) {
            DataMemoryBarrier(2,1);
            func_0x00403874(&plStack_68);
          }
        }
        return;
      }
      goto LAB_007a191c;
    }
    uVar9 = (uint)uVar10;
    if (((uVar9 >> 1 & 1) != 0) || (6 < uVar11)) break;
    iVar6 = 1 << (ulong)((uint)uVar11 & 0x1f);
    do {
      InstructionSynchronizationBarrier();
      iVar6 = iVar6 + -1;
    } while (iVar6 != 0);
    uVar10 = *puVar4;
    uVar11 = uVar11 + 1;
  }
  if (plStack_68 == (long *)0x0) {
    func_0x0079fe64(&plStack_68);
  }
  cStack_60 = '\0';
  auStack_80[0] = uVar10 & 0xfffffffffffffff0;
  auStack_80[1] = 0;
  uVar8 = (ulong)auStack_80 | uVar10 & 9 | 2;
  if ((uVar9 >> 1 & 1) == 0) {
    uVar7 = *puVar4;
    puStack_70 = (undefined1 *)auStack_80;
    if (uVar7 != uVar10) {
LAB_007a191c:
      uVar10 = uVar7;
      goto LAB_007a1920;
    }
    *puVar4 = uVar8;
    puStack_70 = (undefined1 *)auStack_80;
  }
  else {
    puStack_70 = (undefined1 *)0x0;
    uVar7 = *puVar4;
    if (uVar7 != uVar10) goto LAB_007a191c;
    *puVar4 = uVar8 + 4;
    if ((uVar9 >> 2 & 1) == 0) {
      func_0x00437f68(puVar4);
    }
  }
  while (plVar2 = plStack_68, cStack_60 == '\0') {
    if (plStack_68 == (long *)0x0) {
      func_0x007a23bc(&UNK_009dc290);
                    /* WARNING: Does not return */
      pcVar3 = (code *)SoftwareBreakpoint(1,0x7a1a94);
      (*pcVar3)();
    }
    LOAcquire();
    cVar1 = (char)plStack_68[6];
    *(char *)(plStack_68 + 6) = cVar1 + -1;
    if (cVar1 != '\x01') {
      do {
        lVar5 = _dispatch_semaphore_wait(plVar2[5],0xffffffffffffffff);
      } while (lVar5 != 0);
      LOAcquire();
      *(char *)(plVar2 + 6) = (char)in_wzr;
    }
  }
  uVar11 = 0;
  uVar10 = *puVar4;
  goto LAB_007a1920;
}

