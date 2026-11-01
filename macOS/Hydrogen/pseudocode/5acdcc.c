
undefined8 FUN_005acdcc(code *param_1,undefined8 param_2,long param_3)

{
  ulong uVar1;
  undefined8 uVar2;
  long lVar3;
  undefined8 *unaff_x19;
  long unaff_x20;
  long unaff_x23;
  
  uVar1 = (*param_1)(param_2,param_3 + 0xd73,3);
  if (((uVar1 & 1) == 0) && (uVar1 = func_0x005ab01c(), (uVar1 & 1) == 0)) {
    lVar3 = unaff_x23 * 0x40;
    do {
      lVar3 = lVar3 + -0x40;
      if (lVar3 == 0) {
        if (*(char *)(unaff_x20 + 0x31) == '\x01') {
          uVar2 = (**(code **)(((undefined8 *)*unaff_x19)[1] + 0x18))
                            (*(undefined8 *)*unaff_x19,&UNK_008aed76,0xc);
          return uVar2;
        }
        return 0;
      }
      uVar1 = (**(code **)(((undefined8 *)*unaff_x19)[1] + 0x18))
                        (*(undefined8 *)*unaff_x19,&UNK_008aec76,2);
    } while (((uVar1 & 1) == 0) && (uVar1 = func_0x005ab01c(), (uVar1 & 1) == 0));
  }
  return 1;
}

