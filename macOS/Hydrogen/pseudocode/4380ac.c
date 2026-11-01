
void FUN_004380ac(void)

{
  code *pcVar1;
  long lVar2;
  long *plVar3;
  long unaff_x19;
  long unaff_x20;
  long lVar4;
  long unaff_x21;
  undefined8 uStack0000000000000008;
  
  do {
    DataMemoryBarrier(2,1);
    func_0x00403874(&uStack0000000000000008);
    lVar4 = unaff_x21;
LAB_00438050:
    do {
      if (lVar4 == 0) {
        return;
      }
      unaff_x21 = *(long *)(lVar4 + 8);
      plVar3 = *(long **)(lVar4 + 0x18);
      if (plVar3 == (long *)0x0) {
        func_0x007a23bc(&UNK_009dc2a8);
code_r0x00438130:
                    /* WARNING: Does not return */
        pcVar1 = (code *)SoftwareBreakpoint(1,0x438134);
        (*pcVar1)();
      }
      lVar2 = *plVar3;
      *plVar3 = lVar2 + unaff_x19;
      if (lVar2 < 0) goto code_r0x00438130;
      plVar3 = *(long **)(lVar4 + 0x18);
      *(char *)(lVar4 + 0x20) = (char)unaff_x19;
      lVar2 = plVar3[6];
      *(char *)(plVar3 + 6) = (char)unaff_x19;
      LORelease();
      lVar4 = unaff_x21;
      uStack0000000000000008 = plVar3;
      if ((char)lVar2 == -1) {
        _dispatch_semaphore_signal(plVar3[5]);
        lVar2 = *plVar3;
        *plVar3 = lVar2 + unaff_x20;
        LORelease();
        if (lVar2 == 1) break;
        goto LAB_00438050;
      }
      lVar2 = *plVar3;
      *plVar3 = lVar2 + unaff_x20;
      LORelease();
    } while (lVar2 != 1);
  } while( true );
}

