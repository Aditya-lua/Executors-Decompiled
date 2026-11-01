
long FUN_0060cc68(void)

{
  code *pcVar1;
  long lVar2;
  undefined8 *puVar3;
  undefined8 uVar4;
  long lVar5;
  undefined1 uStack0000000000000008;
  undefined1 uStack0000000000000038;
  undefined1 uStack0000000000000098;
  undefined1 auStack_58 [24];
  
  func_0x00087574();
  func_0x00087574(&uStack0000000000000008);
  func_0x00087574(&uStack0000000000000038);
  func_0x00610518(&uStack0000000000000098);
  lVar2 = __Unwind_Resume();
  puVar3 = (undefined8 *)func_0x0060d21c();
  *puVar3 = &UNK_009f5ed0;
  func_0x006001b4(puVar3 + 0x15,0,puVar3[6]);
  lVar5 = *(long *)(lVar2 + 0x30);
  *(undefined8 *)(lVar2 + 0xe0) = 0x1fffffffffffffff;
  *(long *)(lVar2 + 0xe8) = lVar5 * 5;
  func_0x006108a0();
  if (lVar5 == 0) {
    *(undefined8 *)(lVar2 + 0xf0) = 0;
    lVar5 = *(long *)(lVar2 + 0x30);
  }
  else {
    uVar4 = func_0x006115d0(lVar5 * 0x28);
    *(undefined8 *)(lVar2 + 0xf0) = uVar4;
    lVar5 = *(long *)(lVar2 + 0x30);
  }
  if ((lVar5 == 0) || ((**(byte **)(lVar2 + 0x38) & 1) == 0)) {
    uVar4 = ___cxa_allocate_exception(0x28);
    func_0x0000a968(auStack_58,
                    "MontgomeryRepresentation: Montgomery representation requires an odd modulus");
    func_0x0002703c(uVar4,auStack_58);
    ___cxa_throw(uVar4,&DAT_009b2ee0,&DAT_000270bc);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x60d194);
    (*pcVar1)();
  }
  func_0x005fc5c8(*(undefined8 *)(lVar2 + 200));
  return lVar2;
}

