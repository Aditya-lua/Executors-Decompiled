
bool FUN_000833dc(void)

{
  code *pcVar1;
  undefined8 *puVar2;
  undefined8 uVar3;
  undefined8 *puVar4;
  char *pcVar5;
  long lVar6;
  long lVar7;
  ulong unaff_x21;
  undefined1 auVar8 [16];
  undefined1 auStack_48 [24];
  
  __ZdlPv();
  if ((unaff_x21 & 1) != 0) {
    ___cxa_free_exception();
  }
  auVar8 = __Unwind_Resume();
  puVar4 = auVar8._8_8_;
  puVar2 = auVar8._0_8_;
  pcVar5 = (char *)*puVar2;
  if (pcVar5 != (char *)*puVar4) {
    uVar3 = ___cxa_allocate_exception(0x20);
    func_0x0000a968(auStack_48,"cannot compare iterators of different containers");
    func_0x00083520(uVar3,0xd4,auStack_48,*puVar2);
    ___cxa_throw(uVar3,&UNK_009b9560,&DAT_000836e4);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x834e4);
    (*pcVar1)();
  }
  if (pcVar5 == (char *)0x0) {
    return true;
  }
  if (*pcVar5 == '\x02') {
    lVar6 = puVar2[2];
    lVar7 = puVar4[2];
  }
  else if (*pcVar5 == '\x01') {
    lVar6 = puVar2[1];
    lVar7 = puVar4[1];
  }
  else {
    lVar6 = puVar2[3];
    lVar7 = puVar4[3];
  }
  return lVar6 == lVar7;
}

