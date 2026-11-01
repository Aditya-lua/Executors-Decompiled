
void FUN_006b32fc(void)

{
  long lVar1;
  ulong uVar2;
  code *pcVar3;
  ulong uVar4;
  undefined4 *puVar5;
  long unaff_x19;
  long unaff_x20;
  long unaff_x23;
  undefined4 *puVar6;
  long lStack0000000000000000;
  
  lVar1 = unaff_x20 + unaff_x23;
  puVar6 = *(undefined4 **)(unaff_x19 + 0x2f8);
  lStack0000000000000000 = lVar1;
  if (*(undefined4 **)(unaff_x19 + 0x300) <= puVar6) {
    puVar6 = (undefined4 *)func_0x006b7894(unaff_x19 + 0x2f0);
    goto LAB_006b33ac;
  }
  puVar5 = puVar6 + 2;
  *puVar6 = *(undefined4 *)(unaff_x19 + 0x1b8);
  uVar4 = _strlen(lVar1);
  if (0x7ffffffffffffff7 < uVar4) {
    func_0x0001748c(puVar5);
                    /* WARNING: Does not return */
    pcVar3 = (code *)SoftwareBreakpoint(1,0x6b33e4);
    (*pcVar3)();
  }
  if (uVar4 < 0x17) {
    *(char *)((long)puVar6 + 0x1f) = (char)uVar4;
    if (uVar4 != 0) goto LAB_006b3390;
  }
  else {
    uVar2 = (uVar4 & 0xfffffffffffffff8) + 8;
    if ((uVar4 | 7) != 0x17) {
      uVar2 = uVar4 | 7;
    }
    puVar5 = (undefined4 *)__Znwm(uVar2 + 1);
    *(ulong *)(puVar6 + 4) = uVar4;
    *(ulong *)(puVar6 + 6) = uVar2 + 1 | 0x8000000000000000;
    *(undefined4 **)(puVar6 + 2) = puVar5;
LAB_006b3390:
    _memmove(puVar5,lVar1,uVar4);
  }
  *(undefined1 *)((long)puVar5 + uVar4) = 0;
  puVar6 = puVar6 + 8;
  *(undefined4 **)(unaff_x19 + 0x2f8) = puVar6;
LAB_006b33ac:
  *(undefined4 **)(unaff_x19 + 0x2f8) = puVar6;
  return;
}

