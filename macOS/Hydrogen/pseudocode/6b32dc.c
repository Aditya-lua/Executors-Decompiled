
void FUN_006b32dc(undefined8 param_1)

{
  ulong uVar1;
  code *pcVar2;
  ulong uVar3;
  undefined4 *puVar4;
  long unaff_x19;
  undefined8 *unaff_x20;
  long unaff_x21;
  undefined8 unaff_x22;
  long unaff_x23;
  undefined4 *puVar5;
  
  *(undefined8 *)(unaff_x19 + 0x290) = param_1;
  if (unaff_x21 != 0) {
    __ZdlPv();
  }
  *(undefined8 *)(unaff_x19 + 0x288) = unaff_x22;
  if (*(char *)(unaff_x19 + 0x2af) < '\0') {
    unaff_x20 = (undefined8 *)*unaff_x20;
  }
  puVar5 = *(undefined4 **)(unaff_x19 + 0x2f8);
  if (*(undefined4 **)(unaff_x19 + 0x300) <= puVar5) {
    puVar5 = (undefined4 *)func_0x006b7894(unaff_x19 + 0x2f0);
    goto code_r0x006b33ac;
  }
  puVar4 = puVar5 + 2;
  *puVar5 = *(undefined4 *)(unaff_x19 + 0x1b8);
  uVar3 = _strlen((long)unaff_x20 + unaff_x23);
  if (0x7ffffffffffffff7 < uVar3) {
    func_0x0001748c(puVar4);
                    /* WARNING: Does not return */
    pcVar2 = (code *)SoftwareBreakpoint(1,0x6b33e4);
    (*pcVar2)();
  }
  if (uVar3 < 0x17) {
    *(char *)((long)puVar5 + 0x1f) = (char)uVar3;
    if (uVar3 != 0) goto code_r0x006b3390;
  }
  else {
    uVar1 = (uVar3 & 0xfffffffffffffff8) + 8;
    if ((uVar3 | 7) != 0x17) {
      uVar1 = uVar3 | 7;
    }
    puVar4 = (undefined4 *)__Znwm(uVar1 + 1);
    *(ulong *)(puVar5 + 4) = uVar3;
    *(ulong *)(puVar5 + 6) = uVar1 + 1 | 0x8000000000000000;
    *(undefined4 **)(puVar5 + 2) = puVar4;
code_r0x006b3390:
    _memmove(puVar4,(long)unaff_x20 + unaff_x23,uVar3);
  }
  *(undefined1 *)((long)puVar4 + uVar3) = 0;
  puVar5 = puVar5 + 8;
  *(undefined4 **)(unaff_x19 + 0x2f8) = puVar5;
code_r0x006b33ac:
  *(undefined4 **)(unaff_x19 + 0x2f8) = puVar5;
  return;
}

