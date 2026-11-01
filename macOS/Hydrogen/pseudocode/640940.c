
long * FUN_00640940(undefined8 param_1,undefined8 param_2,code *param_3,ulong param_4)

{
  long *plVar1;
  code *pcVar2;
  long *plVar3;
  ulong uVar4;
  undefined8 uVar5;
  undefined1 auVar6 [16];
  undefined1 auStack_f0 [24];
  undefined1 auStack_d8 [24];
  undefined1 auStack_c0 [24];
  undefined1 auStack_a8 [24];
  undefined *puStack_90;
  undefined1 auStack_88 [8];
  ulong uStack_80;
  ulong uStack_78;
  long lStack_70;
  undefined1 auStack_68 [8];
  ulong uStack_60;
  ulong uStack_58;
  long lStack_50;
  undefined1 uStack_48;
  
  __ZdlPv();
  auVar6 = __Unwind_Resume();
  plVar3 = auVar6._0_8_;
  if ((char)plVar3[2] == '\0') {
    puStack_90 = &UNK_00a09a70;
    func_0x00675af8(auStack_88);
    func_0x00675af8(auStack_68);
    uStack_48 = 1;
    uVar4 = (**(code **)(*(long *)plVar3[1] + 0x10))
                      ((long *)plVar3[1],auVar6._8_8_,&UNK_00a09a80,&puStack_90);
    if ((uVar4 & 1) == 0) {
      uVar5 = ___cxa_allocate_exception(0x28);
      func_0x0000a968(auStack_f0,&UNK_008be5f9);
      func_0x0003a638(auStack_d8,auStack_f0,": Missing required parameter \'");
      func_0x0003a638(auStack_c0,auStack_d8,auVar6._8_8_);
      func_0x0003a638(auStack_a8,auStack_c0,"\'");
      func_0x0002703c(uVar5,auStack_a8);
      ___cxa_throw(uVar5,&DAT_009b2ee0,&DAT_000270bc);
                    /* WARNING: Does not return */
      pcVar2 = (code *)SoftwareBreakpoint(1,0x640ae4);
      (*pcVar2)();
    }
    plVar1 = (long *)(*plVar3 + ((long)param_4 >> 1));
    if ((param_4 & 1) != 0) {
      param_3 = *(code **)(*plVar1 + ((ulong)param_3 & 0xffffffff));
    }
    (*param_3)(plVar1,&puStack_90);
    puStack_90 = &UNK_00a09a70;
    if (uStack_58 <= uStack_60) {
      uStack_60 = uStack_58;
    }
    if (lStack_50 != 0) {
      if (uStack_60 != 0) {
        do {
          *(undefined8 *)(lStack_50 + -8 + uStack_60 * 8) = 0;
          uStack_60 = uStack_60 - 1;
        } while (uStack_60 != 0);
      }
      func_0x00611644();
    }
    if (uStack_78 <= uStack_80) {
      uStack_80 = uStack_78;
    }
    if (lStack_70 != 0) {
      if (uStack_80 != 0) {
        do {
          *(undefined8 *)(lStack_70 + -8 + uStack_80 * 8) = 0;
          uStack_80 = uStack_80 - 1;
        } while (uStack_80 != 0);
      }
      func_0x00611644();
    }
  }
  return plVar3;
}

