
undefined8 FUN_00050cac(ulong param_1)

{
  undefined1 in_CY;
  undefined8 *puVar1;
  ulong unaff_x20;
  undefined8 *unaff_x21;
  undefined8 *unaff_x22;
  undefined8 *puVar2;
  undefined8 in_stack_00000008;
  long in_stack_00000018;
  
  do {
    if ((bool)in_CY) {
      if (unaff_x20 <= param_1) goto LAB_00050d0c;
      puVar1 = (undefined8 *)unaff_x22[1];
      if (puVar1 == (undefined8 *)0x0) {
        puVar2 = unaff_x22 + 1;
code_r0x00050cc4:
        puVar1 = (undefined8 *)__Znwm(0x28);
        puVar1[4] = unaff_x20;
        *puVar1 = 0;
        puVar1[1] = 0;
        puVar1[2] = unaff_x22;
        *puVar2 = puVar1;
        if ((long *)*plRam0000000000a33948 != (long *)0x0) {
          puVar1 = (undefined8 *)*puVar2;
          plRam0000000000a33948 = (long *)*plRam0000000000a33948;
        }
        func_0x0003767c(*unaff_x21,puVar1);
        unaff_x21[1] = unaff_x21[1] + 1;
LAB_00050d0c:
        __ZNSt3__15mutex6unlockEv(0xa288e8);
        func_0x006e3c4c();
        func_0x006e3d18();
        func_0x006e4a40();
        if (in_stack_00000018 < 0) {
          __ZdlPv(in_stack_00000008);
        }
        return 1;
      }
    }
    else {
      puVar1 = (undefined8 *)*unaff_x22;
      puVar2 = unaff_x22;
      if (puVar1 == (undefined8 *)0x0) goto code_r0x00050cc4;
    }
    param_1 = puVar1[4];
    in_CY = param_1 <= unaff_x20;
    unaff_x22 = puVar1;
  } while( true );
}

