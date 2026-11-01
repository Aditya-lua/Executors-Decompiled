
void FUN_00695248(int param_1)

{
  code *pcVar1;
  undefined8 uVar2;
  long unaff_x19;
  undefined1 uStack0000000000000008;
  
  *(int *)(unaff_x19 + 8) = param_1;
  if (param_1 == -1) {
    uVar2 = ___cxa_allocate_exception(0x28);
    func_0x0000a968(&uStack0000000000000008,"open /dev/random");
    func_0x00694c90(uVar2,&uStack0000000000000008);
    ___cxa_throw(uVar2,&UNK_00a14228,&DAT_00695014);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x6952b8);
    (*pcVar1)();
  }
  return;
}

