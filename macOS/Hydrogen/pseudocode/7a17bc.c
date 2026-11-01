
void FUN_007a17bc(void)

{
  code *pcVar1;
  undefined1 in_ZR;
  long lVar2;
  long unaff_x19;
  long unaff_x20;
  undefined8 *puVar3;
  undefined8 *unaff_x21;
  long *plVar4;
  undefined8 uStack0000000000000020;
  
code_r0x007a17bc:
  puVar3 = unaff_x21;
  if (!(bool)in_ZR) goto LAB_007a1784;
  do {
    DataMemoryBarrier(2,1);
    func_0x00403874(&uStack0000000000000020);
    puVar3 = unaff_x21;
LAB_007a1784:
    do {
      if (puVar3 == (undefined8 *)0x0) {
        return;
      }
      unaff_x21 = (undefined8 *)puVar3[1];
      lVar2 = *(long *)*puVar3;
      *(long *)*puVar3 = lVar2 + unaff_x19;
      if (lVar2 < 0) {
                    /* WARNING: Does not return */
        pcVar1 = (code *)SoftwareBreakpoint(1,0x7a1824);
        (*pcVar1)();
      }
      plVar4 = (long *)*puVar3;
      *(char *)(puVar3 + 2) = (char)unaff_x19;
      lVar2 = plVar4[6];
      *(char *)(plVar4 + 6) = (char)unaff_x19;
      LORelease();
      uStack0000000000000020 = plVar4;
      if ((char)lVar2 != -1) {
        lVar2 = *plVar4;
        *plVar4 = lVar2 + unaff_x20;
        LORelease();
        in_ZR = lVar2 == 1;
        goto code_r0x007a17bc;
      }
      _dispatch_semaphore_signal(plVar4[5]);
      lVar2 = *plVar4;
      *plVar4 = lVar2 + unaff_x20;
      LORelease();
      puVar3 = unaff_x21;
    } while (lVar2 != 1);
  } while( true );
}

