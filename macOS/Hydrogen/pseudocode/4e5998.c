
void FUN_004e5998(long param_1)

{
  uint uVar1;
  undefined1 uVar2;
  code *pcVar3;
  uint *puVar4;
  undefined8 *puVar5;
  undefined8 uVar6;
  long lVar7;
  long extraout_x8;
  ulong *extraout_x8_00;
  undefined8 *puVar8;
  long unaff_x21;
  ulong uVar9;
  undefined8 uVar10;
  uint *puVar11;
  undefined1 auVar12 [16];
  long in_stack_00000040;
  undefined8 uStack_80;
  undefined8 *puStack_78;
  ulong uStack_70;
  uint uStack_64;
  
  if ((param_1 == 0) || (lVar7 = *(long *)(unaff_x21 + 0x10), lVar7 == 0)) {
    __Unwind_Resume();
    param_1 = in_stack_00000040;
    lVar7 = extraout_x8;
  }
  uVar6 = 8;
  func_0x00187bd4(param_1,lVar7 << 4,8);
  auVar12 = __Unwind_Resume();
  puVar11 = auVar12._0_8_;
  do {
    puVar4 = puVar11;
    if (puVar4 == auVar12._8_8_) {
      *extraout_x8_00 = 0;
      extraout_x8_00[1] = 8;
      extraout_x8_00[2] = 0;
      return;
    }
    puVar11 = puVar4 + 2;
  } while ((char)puVar4[1] != '\x01');
  uVar1 = *puVar4;
  uStack_80 = (ulong)uStack_80._4_4_ << 0x20;
  uVar2 = (undefined1)uVar1;
  if (uVar1 < 0x80) {
    uStack_80 = CONCAT71(uStack_80._1_7_,uVar2);
    uVar10 = 1;
  }
  else if (uVar1 < 0x800) {
    uStack_80 = CONCAT62(uStack_80._2_6_,CONCAT11(uVar2,(char)(uVar1 >> 6))) & 0xffffffffffff3fff |
                0x80c0;
    uVar10 = 2;
  }
  else if (uVar1 < 0x10000) {
    uVar9 = CONCAT62(uStack_80._2_6_,CONCAT11((char)(uVar1 >> 6),(char)(uVar1 >> 0xc))) &
            0xffffffffffff3fff;
    uStack_80._3_5_ = (undefined5)(uVar9 >> 0x18);
    uStack_80 = CONCAT53(uStack_80._3_5_,CONCAT12(uVar2,(short)uVar9)) & 0xffffffffff3fffff |
                0x8080e0;
    uVar10 = 3;
  }
  else {
    uVar9 = CONCAT62(uStack_80._2_6_,CONCAT11((char)(uVar1 >> 0xc),(char)(uVar1 >> 0x12))) &
            0xffffffffffff3fff;
    uStack_80._3_5_ = (undefined5)(uVar9 >> 0x18);
    uVar9 = CONCAT53(uStack_80._3_5_,CONCAT12((char)(uVar1 >> 6),(short)uVar9)) & 0xffffffffff3fffff
    ;
    uStack_80._4_4_ = (uint)(uVar9 >> 0x20);
    uStack_80 = CONCAT44(uStack_80._4_4_,CONCAT13(uVar2,(int3)uVar9)) & 0xffffffff3fffffff |
                0x808080f0;
    uVar10 = 4;
  }
  lVar7 = func_0x00187bd0(uVar10,1);
  if (lVar7 == 0) {
    func_0x007a1f00(1,uVar10,&UNK_009e7fe0);
  }
  else {
    _memcpy(lVar7,&uStack_80,uVar10);
    puVar5 = (undefined8 *)func_0x00187bd0(0x60,8);
    if (puVar5 != (undefined8 *)0x0) {
      *puVar5 = uVar10;
      puVar5[1] = lVar7;
      puVar5[2] = uVar10;
      uVar9 = 1;
      uStack_80 = 4;
      puStack_78 = puVar5;
      while( true ) {
        do {
          puVar4 = puVar11;
          if (puVar4 == auVar12._8_8_) {
            extraout_x8_00[1] = (ulong)puStack_78;
            *extraout_x8_00 = uStack_80;
            extraout_x8_00[2] = uVar9;
            return;
          }
          puVar11 = puVar4 + 2;
        } while ((char)puVar4[1] != '\x01');
        uVar1 = *puVar4;
        uVar2 = (undefined1)uVar1;
        if (uVar1 < 0x80) {
          uStack_64 = uVar1 & 0xff;
          uVar6 = 1;
        }
        else if (uVar1 < 0x800) {
          uStack_64 = (uint)(CONCAT11(uVar2,(char)(uVar1 >> 6)) & 0x3fff | 0x80c0);
          uVar6 = 2;
        }
        else if (uVar1 < 0x10000) {
          uStack_64 = (uint)(CONCAT12(uVar2,CONCAT11((char)(uVar1 >> 6),(char)(uVar1 >> 0xc))) &
                             0x3f3fff | 0x8080e0);
          uVar6 = 3;
        }
        else {
          uStack_64 = CONCAT13(uVar2,CONCAT12((char)(uVar1 >> 6),
                                              CONCAT11((char)(uVar1 >> 0xc),(char)(uVar1 >> 0x12))))
                      & 0x3f3f3fff | 0x808080f0;
          uVar6 = 4;
        }
        uStack_70 = uVar9;
        lVar7 = func_0x00187bd0(uVar6,1);
        if (lVar7 == 0) break;
        _memcpy(lVar7,&uStack_64,uVar6);
        if (uVar9 == uStack_80) {
          func_0x007a5594(&uStack_80,uVar9,1,8,0x18);
          puVar5 = puStack_78;
        }
        puVar8 = puVar5 + uVar9 * 3;
        *puVar8 = uVar6;
        puVar8[1] = lVar7;
        puVar8[2] = uVar6;
        uVar9 = uVar9 + 1;
      }
      func_0x007a1f00(1,uVar6,&UNK_009e7fe0);
      goto FUN_004e5cf0;
    }
  }
  func_0x007a1f00(8,0x60,uVar6);
FUN_004e5cf0:
                    /* WARNING: Does not return */
  pcVar3 = (code *)SoftwareBreakpoint(1,0x4e5cf4);
  (*pcVar3)();
}

