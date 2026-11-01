
void FUN_001e40f8(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                 undefined8 param_5,undefined8 param_6,undefined8 param_7)

{
  long lVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  undefined8 *puVar5;
  long *extraout_x8;
  undefined1 *unaff_x19;
  long lStack_98;
  long lStack_90;
  long lStack_88;
  long lStack_80;
  long lStack_78;
  undefined8 *puStack_70;
  long lStack_68;
  
  *unaff_x19 = 0;
  unaff_x19[1] = 0;
  unaff_x19[2] = 0;
  unaff_x19[3] = 0;
  unaff_x19[4] = 0;
  unaff_x19[5] = 0;
  unaff_x19[6] = 0;
  unaff_x19[7] = 0;
  unaff_x19[8] = 0;
  unaff_x19[9] = 0;
  unaff_x19[10] = 0;
  unaff_x19[0xb] = 0;
  unaff_x19[0xc] = 0;
  unaff_x19[0xd] = 0;
  unaff_x19[0xe] = 0;
  unaff_x19[0xf] = 0;
  unaff_x19[0x10] = 0;
  unaff_x19[0x11] = 0;
  unaff_x19[0x12] = 0;
  unaff_x19[0x13] = 0;
  unaff_x19[0x14] = 0;
  unaff_x19[0x15] = 0;
  unaff_x19[0x16] = 0;
  unaff_x19[0x17] = 0;
  unaff_x19[0x18] = 0;
  unaff_x19[0x19] = 0;
  unaff_x19[0x1a] = 0;
  unaff_x19[0x1b] = 0;
  unaff_x19[0x1c] = 0;
  unaff_x19[0x1d] = 0;
  unaff_x19[0x1e] = 0;
  unaff_x19[0x1f] = 0;
  unaff_x19[0x20] = 0;
  unaff_x19[0x21] = 0;
  unaff_x19[0x22] = 0;
  unaff_x19[0x23] = 0;
  unaff_x19[0x24] = 0;
  unaff_x19[0x25] = 0;
  unaff_x19[0x26] = 0;
  unaff_x19[0x27] = 0;
  unaff_x19[0x28] = 0;
  unaff_x19[0x29] = 0;
  unaff_x19[0x2a] = 0;
  unaff_x19[0x2b] = 0;
  unaff_x19[0x2c] = 0;
  unaff_x19[0x2d] = 0;
  unaff_x19[0x2e] = 0;
  unaff_x19[0x2f] = 0;
  __Unwind_Resume(param_1);
  func_0x001e4c58(&lStack_98);
  puVar5 = puStack_70;
  lVar4 = lStack_78;
  lVar3 = lStack_80;
  lVar2 = lStack_88;
  lVar1 = lStack_90;
  if (lStack_98 == -0x7fffffffffffffd9) {
    (*(code *)puStack_70[4])(&lStack_98,lStack_78,param_4,param_5,param_6,param_7);
    if (lStack_98 == -0x7fffffffffffffd9) {
      extraout_x8[5] = lStack_88;
      extraout_x8[4] = lStack_90;
      extraout_x8[6] = lStack_80;
      extraout_x8[2] = lVar2;
      extraout_x8[3] = lVar3;
      *extraout_x8 = -0x7fffffffffffffd9;
      extraout_x8[1] = lVar1;
      if ((code *)*puVar5 != (code *)0x0) {
        (*(code *)*puVar5)(lVar4);
      }
    }
    else {
      extraout_x8[5] = (long)puStack_70;
      extraout_x8[4] = lStack_78;
      extraout_x8[6] = lStack_68;
      extraout_x8[2] = lStack_88;
      extraout_x8[1] = lStack_90;
      extraout_x8[3] = lStack_80;
      *extraout_x8 = lStack_98;
      if (lVar1 != 0) {
        func_0x00187bd4(lVar2,lVar1,1);
      }
      if ((code *)*puVar5 != (code *)0x0) {
        (*(code *)*puVar5)(lVar4);
      }
    }
    if (puVar5[1] != 0) {
      func_0x00187bd4(lVar4,puVar5[1],puVar5[2]);
    }
  }
  else {
    extraout_x8[2] = lStack_88;
    extraout_x8[3] = lStack_80;
    *extraout_x8 = lStack_98;
    extraout_x8[1] = lStack_90;
    extraout_x8[4] = lStack_78;
    extraout_x8[5] = (long)puStack_70;
    extraout_x8[6] = lStack_68;
  }
  return;
}

