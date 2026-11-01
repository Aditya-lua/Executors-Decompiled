
undefined1  [16] FUN_00512f50(long param_1,undefined8 param_2,long param_3,long param_4)

{
  undefined1 in_ZR;
  long in_x9;
  long *plVar1;
  long lVar2;
  undefined1 auVar3 [16];
  
  do {
    if ((bool)in_ZR) {
      auVar3._8_8_ = param_4;
      auVar3._0_8_ = param_3;
      return auVar3;
    }
    if (*(long *)(param_1 + 0x10) != 0) {
      plVar1 = (long *)(*(long *)(param_1 + 8) + 0x18);
      lVar2 = *(long *)(param_1 + 0x10) << 5;
      do {
        if (*(long *)*(undefined1 (*) [16])(plVar1 + -1) != param_3 || *plVar1 != param_4) {
          return *(undefined1 (*) [16])(plVar1 + -1);
        }
        plVar1 = plVar1 + 4;
        lVar2 = lVar2 + -0x20;
      } while (lVar2 != 0);
    }
    param_1 = param_1 + 0x18;
    in_ZR = param_1 == in_x9;
  } while( true );
}

