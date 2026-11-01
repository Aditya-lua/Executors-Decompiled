
void FUN_000832e4(void)

{
  code *pcVar1;
  undefined8 uVar2;
  undefined1 uStack0000000000000010;
  
  uVar2 = ___cxa_allocate_exception(0x20);
  func_0x0000a968(&uStack0000000000000010,"iterator out of range");
  func_0x00083520(uVar2,0xcd,&uStack0000000000000010);
  ___cxa_throw(uVar2,&UNK_009b9560,&DAT_000836e4);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x8339c);
  (*pcVar1)();
}

