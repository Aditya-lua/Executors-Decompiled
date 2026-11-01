
void FUN_001a2dd8(long param_1)

{
  code *pcVar1;
  long *unaff_x19;
  long unaff_x20;
  long *plVar2;
  long unaff_x22;
  long lVar3;
  undefined8 uVar4;
  long unaff_x25;
  long lVar5;
  long unaff_x27;
  undefined8 uStack0000000000000000;
  long lStack0000000000000010;
  
  lStack0000000000000010 = param_1;
  if (unaff_x25 != 0) {
    lVar5 = 0;
    uStack0000000000000000 = 1;
    plVar2 = (long *)(param_1 + 0x10);
    do {
      if (unaff_x20 == 0) break;
      lVar3 = *(long *)(unaff_x27 + 0x10);
      if (lVar3 < 0) {
        uStack0000000000000000 = 0;
code_r0x001a2e94:
        func_0x007a1f00(uStack0000000000000000,unaff_x22,&UNK_009c24c0);
                    /* WARNING: Does not return */
        pcVar1 = (code *)SoftwareBreakpoint(1,0x1a2eac);
        (*pcVar1)();
      }
      uVar4 = *(undefined8 *)(unaff_x27 + 8);
      if (lVar3 == 0) {
        unaff_x22 = 1;
      }
      else {
        unaff_x22 = func_0x00187bd0(lVar3,1);
        if (unaff_x22 == 0) {
          unaff_x22 = lVar3;
          goto code_r0x001a2e94;
        }
      }
      unaff_x27 = unaff_x27 + 0x18;
      lVar5 = lVar5 + 1;
      _memcpy(unaff_x22,uVar4,lVar3);
      plVar2[-2] = lVar3;
      plVar2[-1] = unaff_x22;
      unaff_x20 = unaff_x20 + -0x18;
      *plVar2 = lVar3;
      plVar2 = plVar2 + 3;
    } while (unaff_x25 != lVar5);
  }
  unaff_x19[1] = lStack0000000000000010;
  *unaff_x19 = unaff_x25;
  unaff_x19[2] = unaff_x25;
  return;
}

