
void FUN_000494ac(void)

{
  undefined8 uVar1;
  code *pcVar2;
  bool in_ZR;
  bool in_CY;
  undefined8 *puVar3;
  char *pcVar4;
  
  if (!in_CY || in_ZR) {
    _memcpy();
    return;
  }
  puVar3 = (undefined8 *)___cxa_allocate_exception(0x28);
  pcVar4 = (char *)__Znwm(0x20);
  uVar1 = CONCAT17(s_memcpy_s__buffer_overflow_008cf79f[0x10],
                   s_memcpy_s__buffer_overflow_008cf79f._9_7_);
  *(undefined8 *)(pcVar4 + 0x11) = s_memcpy_s__buffer_overflow_008cf79f._17_8_;
  *(undefined8 *)(pcVar4 + 9) = uVar1;
  uVar1 = s_memcpy_s__buffer_overflow_008cf79f._0_8_;
  *(ulong *)(pcVar4 + 8) =
       CONCAT71(s_memcpy_s__buffer_overflow_008cf79f._9_7_,s_memcpy_s__buffer_overflow_008cf79f[8]);
  *(undefined8 *)pcVar4 = uVar1;
  pcVar4[0x19] = '\0';
  *puVar3 = &UNK_009b2ec8;
  *(undefined4 *)(puVar3 + 1) = 1;
  func_0x00017634(puVar3 + 2,pcVar4,0x19);
  *puVar3 = &UNK_009b2f08;
  ___cxa_throw(puVar3,&DAT_009b2ee0,&DAT_000270bc);
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x49564);
  (*pcVar2)();
}

