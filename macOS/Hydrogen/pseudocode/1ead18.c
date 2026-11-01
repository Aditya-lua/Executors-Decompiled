
void FUN_001ead18(void)

{
  long lVar1;
  code *pcVar2;
  undefined8 uVar3;
  undefined8 *puVar4;
  long lVar5;
  long *extraout_x8;
  undefined1 *puVar6;
  long lStack_c0;
  long lStack_b8;
  long lStack_b0;
  undefined1 *puStack_a8;
  long lStack_a0;
  long lStack_98;
  long lStack_90;
  long lStack_88;
  long lStack_80;
  long lStack_78;
  undefined1 *puStack_70;
  long lStack_68;
  
  func_0x00187bd4();
  uVar3 = __Unwind_Resume();
  func_0x001e0d0c();
  __Unwind_Resume(uVar3);
  func_0x007a2668();
  func_0x001eb220(&lStack_b0,s__008db086[0]);
  lVar1 = lStack_a0;
  puVar6 = puStack_a8;
  if (lStack_b0 != -0x7fffffffffffffd9) {
    extraout_x8[2] = lStack_a0;
    extraout_x8[3] = lStack_98;
    *extraout_x8 = lStack_b0;
    extraout_x8[1] = (long)puStack_a8;
    extraout_x8[4] = lStack_90;
    extraout_x8[5] = lStack_88;
    extraout_x8[6] = lStack_80;
    return;
  }
  lStack_c0 = lStack_90;
  lStack_b8 = lStack_88;
  func_0x00270d04(&lStack_b0,&lStack_c0);
  if (lStack_b0 == -0x7fffffffffffffff) {
    puVar4 = (undefined8 *)func_0x00187bd0(0x10,8);
    if (puVar4 != (undefined8 *)0x0) {
      puVar4[1] = 1;
      *puVar4 = 1;
      extraout_x8[1] = (long)puVar4;
      extraout_x8[2] = (long)&UNK_009c8188;
      *extraout_x8 = -0x7fffffffffffffda;
      func_0x002d8de8(lStack_b8);
      if (puVar6 == (undefined1 *)0x0) {
        return;
      }
      func_0x00187bd4(lVar1,puVar6,1);
      return;
    }
    func_0x007a1f18(8,0x10);
  }
  else {
    lStack_78 = lStack_b0;
    puStack_70 = puStack_a8;
    lStack_68 = lStack_a0;
    if (lStack_a0 < 0) {
      uVar3 = 0;
    }
    else {
      if (lStack_a0 == 0) {
        lVar5 = 1;
code_r0x001eaea8:
        _memcpy(lVar5,puStack_a8,lStack_a0);
        extraout_x8[2] = lVar1;
        extraout_x8[3] = lStack_98;
        extraout_x8[4] = lStack_a0;
        extraout_x8[5] = lVar5;
        extraout_x8[6] = lStack_a0;
        *extraout_x8 = -0x7fffffffffffffd9;
        extraout_x8[1] = (long)puVar6;
        if (lStack_b0 != -0x8000000000000000) {
          if (lStack_a0 != 0) {
            puVar6 = puStack_a8;
            do {
              *puVar6 = 0;
              lStack_a0 = lStack_a0 + -1;
              puVar6 = puVar6 + 1;
            } while (lStack_a0 != 0);
            lStack_b0 = lStack_78;
          }
          lStack_68 = 0;
          for (; lStack_b0 != 0; lStack_b0 = lStack_b0 + -1) {
            *puStack_a8 = 0;
            puStack_a8 = puStack_a8 + 1;
          }
          if (lStack_78 != -0x8000000000000000 && lStack_78 != 0) {
            func_0x00187bd4(puStack_70,lStack_78,1);
          }
        }
        func_0x002d8de8(lStack_b8);
        return;
      }
      uVar3 = 1;
      lVar5 = func_0x00187bd0(lStack_a0,1);
      if (lVar5 != 0) goto code_r0x001eaea8;
    }
    func_0x007a1f00(uVar3,lStack_a0,&UNK_009c3768);
  }
                    /* WARNING: Does not return */
  pcVar2 = (code *)SoftwareBreakpoint(1,0x1eaf74);
  (*pcVar2)();
}

