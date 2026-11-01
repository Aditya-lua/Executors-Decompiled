
void FUN_00045a3c(long param_1,undefined8 param_2,long param_3)

{
  undefined8 uVar1;
  code *pcVar2;
  undefined8 *puVar3;
  char *pcVar4;
  long in_x9;
  undefined1 in_w10;
  long unaff_x19;
  
  *(undefined1 *)(unaff_x19 + 0x49) = in_w10;
  *(long *)(unaff_x19 + 0x60) = unaff_x19;
  if (*(long *)(param_3 + 0x60) != 0) {
    if ((ulong)(param_1 * 4) < (ulong)(in_x9 * 4)) {
      puVar3 = (undefined8 *)___cxa_allocate_exception(0x28);
      pcVar4 = (char *)__Znwm(0x20);
      uVar1 = CONCAT17(s_memcpy_s__buffer_overflow_008cf79f[0x10],
                       s_memcpy_s__buffer_overflow_008cf79f._9_7_);
      *(undefined8 *)(pcVar4 + 0x11) = s_memcpy_s__buffer_overflow_008cf79f._17_8_;
      *(undefined8 *)(pcVar4 + 9) = uVar1;
      uVar1 = s_memcpy_s__buffer_overflow_008cf79f._0_8_;
      *(ulong *)(pcVar4 + 8) =
           CONCAT71(s_memcpy_s__buffer_overflow_008cf79f._9_7_,
                    s_memcpy_s__buffer_overflow_008cf79f[8]);
      *(undefined8 *)pcVar4 = uVar1;
      pcVar4[0x19] = '\0';
      *puVar3 = &UNK_009b2ec8;
      *(undefined4 *)(puVar3 + 1) = 1;
      func_0x00017634(puVar3 + 2,pcVar4,0x19);
      *puVar3 = &UNK_009b2f08;
      ___cxa_throw(puVar3,&DAT_009b2ee0,&DAT_000270bc);
                    /* WARNING: Does not return */
      pcVar2 = (code *)SoftwareBreakpoint(1,0x45b0c);
      (*pcVar2)();
    }
    _memcpy();
  }
  return;
}

