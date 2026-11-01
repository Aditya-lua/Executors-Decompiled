
void FUN_00207d38(ulong param_1,undefined8 param_2,ulong param_3)

{
  ulong uVar1;
  bool bVar2;
  code *pcVar3;
  undefined1 in_ZR;
  long lVar4;
  ulong uVar5;
  ulong *puVar6;
  ulong in_x9;
  ulong uVar7;
  long *plVar8;
  ulong *puVar9;
  ulong *puVar10;
  ulong *unaff_x19;
  undefined8 uStack0000000000000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  
code_r0x00207d38:
  uVar7 = 0;
  if (!(bool)in_ZR) {
    uVar7 = in_x9 | 1;
  }
  bVar2 = *unaff_x19 == param_3;
  param_3 = *unaff_x19;
  if (bVar2) {
    *unaff_x19 = uVar7;
    return;
  }
  while( true ) {
    if (((uint)param_3 >> 1 & 1) == 0) goto LAB_00207d34;
    if (((uint)param_3 >> 3 & 1) == 0) break;
    uVar7 = param_3 & param_1;
    bVar2 = *unaff_x19 == param_3;
    param_3 = *unaff_x19;
    if (bVar2) {
      *unaff_x19 = uVar7;
      return;
    }
  }
  puVar6 = (ulong *)(param_3 & 0xfffffffffffffff0);
  plVar8 = (long *)puVar6[2];
  if (plVar8 == (long *)0x0) {
    puVar9 = puVar6;
    do {
      puVar10 = (ulong *)*puVar9;
      puVar10[1] = (ulong)puVar9;
      plVar8 = (long *)puVar10[2];
      puVar9 = puVar10;
    } while (plVar8 == (long *)0x0);
  }
  puVar6[2] = (ulong)plVar8;
  LOAcquire();
  lVar4 = *plVar8;
  *plVar8 = lVar4 + -0x10;
  LORelease();
  if (lVar4 != 0x10) {
    return;
  }
  do {
    while (uVar7 = param_3 & 0xfffffffffffffffe, ((uint)param_3 >> 2 & 1) != 0) {
      bVar2 = *unaff_x19 == param_3;
      param_3 = *unaff_x19;
      if (bVar2) {
        *unaff_x19 = uVar7;
        return;
      }
    }
    uVar7 = uVar7 + 4;
    bVar2 = *unaff_x19 != param_3;
    param_3 = *unaff_x19;
  } while (bVar2);
  *unaff_x19 = uVar7;
  while( true ) {
    while( true ) {
      while( true ) {
        while( true ) {
          puVar6 = (ulong *)(uVar7 & 0xfffffffffffffff0);
          uVar5 = puVar6[2];
          if (uVar5 == 0) {
            puVar9 = puVar6;
            do {
              puVar10 = (ulong *)*puVar9;
              puVar10[1] = (ulong)puVar9;
              uVar5 = puVar10[2];
              puVar9 = puVar10;
            } while (uVar5 == 0);
          }
          puVar6[2] = uVar5;
          if ((uVar7 & 9) != 1) break;
          uVar5 = uVar7 & 0xfffffffffffffff3;
          bVar2 = *unaff_x19 == uVar7;
          uVar7 = *unaff_x19;
          if (bVar2) {
            *unaff_x19 = uVar5;
            return;
          }
        }
        if ((((uint)uVar7 >> 3 & 1) == 0) && ((*(byte *)(uVar5 + 0x21) & 1) != 0)) break;
        lVar4 = uVar7 << 0x3c;
        bVar2 = *unaff_x19 == uVar7;
        uVar7 = *unaff_x19;
        if (bVar2) {
          *unaff_x19 = lVar4 >> 0x3f & 0x11;
          goto code_r0x00438058;
        }
      }
      if (*(ulong *)(uVar5 + 8) != 0) break;
      bVar2 = *unaff_x19 == uVar7;
      uVar7 = *unaff_x19;
      if (bVar2) {
        *unaff_x19 = 0;
        goto code_r0x00438058;
      }
    }
    puVar6[2] = *(ulong *)(uVar5 + 8);
    uVar1 = *unaff_x19;
    if (uVar1 == uVar7) break;
    puVar6[2] = uVar5;
    uVar7 = uVar1;
  }
  *unaff_x19 = uVar7 & 0xfffffffffffffff3;
  plVar8 = *(long **)(uVar5 + 0x18);
  if (plVar8 != (long *)0x0) {
    lVar4 = *plVar8;
    *plVar8 = lVar4 + 1;
    if (-1 < lVar4) {
      plVar8 = *(long **)(uVar5 + 0x18);
      *(undefined1 *)(uVar5 + 0x20) = 1;
      lVar4 = plVar8[6];
      *(char *)(plVar8 + 6) = '\x01';
      LORelease();
      uStack0000000000000038 = plVar8;
      if ((char)lVar4 == -1) {
        _dispatch_semaphore_signal(plVar8[5]);
      }
      lVar4 = *plVar8;
      *plVar8 = lVar4 + -1;
      LORelease();
      if (lVar4 == 1) {
        DataMemoryBarrier(2,1);
        func_0x00403874(&uStack0000000000000038);
        return;
      }
      return;
    }
    goto code_r0x00438130;
  }
code_r0x00438124:
  func_0x007a23bc(&UNK_009dc2a8);
code_r0x00438130:
                    /* WARNING: Does not return */
  pcVar3 = (code *)SoftwareBreakpoint(1,0x438134);
  (*pcVar3)();
LAB_00207d34:
  in_x9 = param_3 - 0x11;
  in_ZR = in_x9 == 0;
  goto code_r0x00207d38;
code_r0x00438058:
  uVar7 = *(ulong *)(uVar5 + 8);
  plVar8 = *(long **)(uVar5 + 0x18);
  if (plVar8 == (long *)0x0) goto code_r0x00438124;
  lVar4 = *plVar8;
  *plVar8 = lVar4 + 1;
  if (lVar4 < 0) goto code_r0x00438130;
  plVar8 = *(long **)(uVar5 + 0x18);
  *(undefined1 *)(uVar5 + 0x20) = 1;
  lVar4 = plVar8[6];
  *(char *)(plVar8 + 6) = '\x01';
  LORelease();
  uStack0000000000000038 = plVar8;
  if ((char)lVar4 == -1) {
    _dispatch_semaphore_signal(plVar8[5]);
    lVar4 = *plVar8;
    *plVar8 = lVar4 + -1;
    LORelease();
  }
  else {
    lVar4 = *plVar8;
    *plVar8 = lVar4 + -1;
    LORelease();
  }
  if (lVar4 == 1) {
    DataMemoryBarrier(2,1);
    func_0x00403874(&uStack0000000000000038);
  }
  uVar5 = uVar7;
  if (uVar7 == 0) {
    return;
  }
  goto code_r0x00438058;
}

