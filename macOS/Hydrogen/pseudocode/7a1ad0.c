
void FUN_007a1ad0(long param_1,ulong *param_2,ulong param_3)

{
  ulong uVar1;
  bool bVar2;
  code *pcVar3;
  long lVar4;
  ulong uVar5;
  ulong uVar6;
  long *plVar7;
  ulong *puVar8;
  ulong *puVar9;
  ulong *puVar10;
  long *plStack_28;
  
  if (param_1 != 0x10) {
    return;
  }
  do {
    while (uVar6 = param_3 & 0xfffffffffffffffe, ((uint)param_3 >> 2 & 1) != 0) {
      bVar2 = *param_2 == param_3;
      param_3 = *param_2;
      if (bVar2) {
        *param_2 = uVar6;
        return;
      }
    }
    uVar6 = uVar6 + 4;
    bVar2 = *param_2 != param_3;
    param_3 = *param_2;
  } while (bVar2);
  *param_2 = uVar6;
  do {
    while( true ) {
      while( true ) {
        puVar8 = (ulong *)(uVar6 & 0xfffffffffffffff0);
        uVar5 = puVar8[2];
        if (uVar5 == 0) {
          puVar9 = puVar8;
          do {
            puVar10 = (ulong *)*puVar9;
            puVar10[1] = (ulong)puVar9;
            uVar5 = puVar10[2];
            puVar9 = puVar10;
          } while (uVar5 == 0);
        }
        puVar8[2] = uVar5;
        if ((uVar6 & 9) != 1) break;
        uVar5 = uVar6 & 0xfffffffffffffff3;
        bVar2 = *param_2 == uVar6;
        uVar6 = *param_2;
        if (bVar2) {
          *param_2 = uVar5;
          return;
        }
      }
      if ((((uint)uVar6 >> 3 & 1) != 0) || ((*(byte *)(uVar5 + 0x21) & 1) == 0)) break;
      if (*(ulong *)(uVar5 + 8) == 0) {
        bVar2 = *param_2 == uVar6;
        uVar6 = *param_2;
        if (bVar2) {
          *param_2 = 0;
          goto code_r0x00438058;
        }
      }
      else {
        puVar8[2] = *(ulong *)(uVar5 + 8);
        uVar1 = *param_2;
        if (uVar1 == uVar6) {
          *param_2 = uVar6 & 0xfffffffffffffff3;
          plVar7 = *(long **)(uVar5 + 0x18);
          if (plVar7 == (long *)0x0) goto code_r0x00438124;
          lVar4 = *plVar7;
          *plVar7 = lVar4 + 1;
          if (-1 < lVar4) {
            plVar7 = *(long **)(uVar5 + 0x18);
            *(undefined1 *)(uVar5 + 0x20) = 1;
            lVar4 = plVar7[6];
            *(char *)(plVar7 + 6) = '\x01';
            LORelease();
            plStack_28 = plVar7;
            if ((char)lVar4 == -1) {
              _dispatch_semaphore_signal(plVar7[5]);
            }
            lVar4 = *plVar7;
            *plVar7 = lVar4 + -1;
            LORelease();
            if (lVar4 == 1) {
              DataMemoryBarrier(2,1);
              func_0x00403874(&plStack_28);
              return;
            }
            return;
          }
          goto code_r0x00438130;
        }
        puVar8[2] = uVar5;
        uVar6 = uVar1;
      }
    }
    lVar4 = uVar6 << 0x3c;
    bVar2 = *param_2 != uVar6;
    uVar6 = *param_2;
  } while (bVar2);
  *param_2 = lVar4 >> 0x3f & 0x11;
code_r0x00438058:
  do {
    uVar6 = *(ulong *)(uVar5 + 8);
    plVar7 = *(long **)(uVar5 + 0x18);
    if (plVar7 == (long *)0x0) {
code_r0x00438124:
      func_0x007a23bc(&UNK_009dc2a8);
code_r0x00438130:
                    /* WARNING: Does not return */
      pcVar3 = (code *)SoftwareBreakpoint(1,0x438134);
      (*pcVar3)();
    }
    lVar4 = *plVar7;
    *plVar7 = lVar4 + 1;
    if (lVar4 < 0) goto code_r0x00438130;
    plVar7 = *(long **)(uVar5 + 0x18);
    *(undefined1 *)(uVar5 + 0x20) = 1;
    lVar4 = plVar7[6];
    *(char *)(plVar7 + 6) = '\x01';
    LORelease();
    plStack_28 = plVar7;
    if ((char)lVar4 == -1) {
      _dispatch_semaphore_signal(plVar7[5]);
      lVar4 = *plVar7;
      *plVar7 = lVar4 + -1;
      LORelease();
    }
    else {
      lVar4 = *plVar7;
      *plVar7 = lVar4 + -1;
      LORelease();
    }
    if (lVar4 == 1) {
      DataMemoryBarrier(2,1);
      func_0x00403874(&plStack_28);
    }
    uVar5 = uVar6;
    if (uVar6 == 0) {
      return;
    }
  } while( true );
}

