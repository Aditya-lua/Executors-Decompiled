
long thunk_FUN_00041d84(void)

{
  code *pcVar1;
  long lVar2;
  undefined8 *puVar3;
  char *pcVar4;
  long lVar5;
  long lVar6;
  undefined8 uVar7;
  undefined1 auVar8 [16];
  
  auVar8 = __Unwind_Resume();
  lVar5 = auVar8._8_8_;
  lVar2 = auVar8._0_8_;
  uVar7 = *(undefined8 *)(lVar5 + 8);
  *(undefined8 *)(lVar2 + 0x10) = *(undefined8 *)(lVar5 + 0x10);
  *(undefined8 *)(lVar2 + 8) = uVar7;
  lVar6 = *(long *)(lVar5 + 0x10);
  func_0x00041cd8(lVar6);
  if (lVar6 == 0) {
    *(undefined8 *)(lVar2 + 0x18) = 0;
    return lVar2;
  }
  lVar6 = func_0x006115d0(lVar6 << 2);
  *(long *)(lVar2 + 0x18) = lVar6;
  if ((lVar6 != 0) && (*(long *)(lVar5 + 0x18) != 0)) {
    if ((ulong)(*(long *)(lVar2 + 0x10) * 4) < (ulong)(*(long *)(lVar5 + 0x10) * 4)) {
      puVar3 = (undefined8 *)___cxa_allocate_exception(0x28);
      pcVar4 = (char *)__Znwm(0x20);
      uVar7 = CONCAT17(s_memcpy_s__buffer_overflow_008cf79f[0x10],
                       s_memcpy_s__buffer_overflow_008cf79f._9_7_);
      *(undefined8 *)(pcVar4 + 0x11) = s_memcpy_s__buffer_overflow_008cf79f._17_8_;
      *(undefined8 *)(pcVar4 + 9) = uVar7;
      uVar7 = s_memcpy_s__buffer_overflow_008cf79f._0_8_;
      *(ulong *)(pcVar4 + 8) =
           CONCAT71(s_memcpy_s__buffer_overflow_008cf79f._9_7_,
                    s_memcpy_s__buffer_overflow_008cf79f[8]);
      *(undefined8 *)pcVar4 = uVar7;
      pcVar4[0x19] = '\0';
      *puVar3 = &UNK_009b2ec8;
      *(undefined4 *)(puVar3 + 1) = 1;
      func_0x00017634(puVar3 + 2,pcVar4,0x19);
      *puVar3 = &UNK_009b2f08;
      ___cxa_throw(puVar3,&DAT_009b2ee0,&DAT_000270bc);
                    /* WARNING: Does not return */
      pcVar1 = (code *)SoftwareBreakpoint(1,0x41e98);
      (*pcVar1)();
    }
    _memcpy();
  }
  return lVar2;
}

