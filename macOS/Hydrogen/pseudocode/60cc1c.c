
long FUN_0060cc1c(void)

{
  code *pcVar1;
  undefined8 uVar2;
  long lVar3;
  undefined8 *puVar4;
  long lVar5;
  long unaff_x29;
  undefined1 uStack0000000000000008;
  undefined1 uStack0000000000000038;
  undefined1 uStack0000000000000068;
  undefined1 uStack0000000000000098;
  undefined1 auStack_58 [24];
  
  func_0x00087574();
  func_0x00610518(&uStack0000000000000098);
  uVar2 = __Unwind_Resume();
  func_0x00087574(unaff_x29 + -0x70);
  func_0x00610518(&uStack0000000000000098);
  uVar2 = __Unwind_Resume(uVar2);
  func_0x00610518(&uStack0000000000000098);
  uVar2 = __Unwind_Resume(uVar2);
  func_0x00087574(&uStack0000000000000068);
  func_0x00087574(&uStack0000000000000008);
  func_0x00087574(&uStack0000000000000038);
  func_0x00610518(&uStack0000000000000098);
  lVar3 = __Unwind_Resume(uVar2);
  puVar4 = (undefined8 *)func_0x0060d21c();
  *puVar4 = &UNK_009f5ed0;
  func_0x006001b4(puVar4 + 0x15,0,puVar4[6]);
  lVar5 = *(long *)(lVar3 + 0x30);
  *(undefined8 *)(lVar3 + 0xe0) = 0x1fffffffffffffff;
  *(long *)(lVar3 + 0xe8) = lVar5 * 5;
  func_0x006108a0();
  if (lVar5 == 0) {
    *(undefined8 *)(lVar3 + 0xf0) = 0;
    lVar5 = *(long *)(lVar3 + 0x30);
  }
  else {
    uVar2 = func_0x006115d0(lVar5 * 0x28);
    *(undefined8 *)(lVar3 + 0xf0) = uVar2;
    lVar5 = *(long *)(lVar3 + 0x30);
  }
  if ((lVar5 == 0) || ((**(byte **)(lVar3 + 0x38) & 1) == 0)) {
    uVar2 = ___cxa_allocate_exception(0x28);
    func_0x0000a968(auStack_58,
                    "MontgomeryRepresentation: Montgomery representation requires an odd modulus");
    func_0x0002703c(uVar2,auStack_58);
    ___cxa_throw(uVar2,&DAT_009b2ee0,&DAT_000270bc);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x60d194);
    (*pcVar1)();
  }
  func_0x005fc5c8(*(undefined8 *)(lVar3 + 200));
  return lVar3;
}

