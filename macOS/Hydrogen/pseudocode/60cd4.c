
undefined1  [16] FUN_00060cd4(undefined8 *param_1)

{
  ulong uVar1;
  int iVar2;
  undefined8 *puVar3;
  undefined8 uVar4;
  long *unaff_x19;
  undefined8 *unaff_x20;
  undefined8 *unaff_x21;
  undefined8 *unaff_x23;
  ulong unaff_x25;
  undefined1 auVar5 [16];
  
code_r0x00060cd4:
  puVar3 = unaff_x20;
  if (param_1 == (undefined8 *)0x0) {
LAB_00060d5c:
    unaff_x20 = (undefined8 *)__Znwm(0x38);
    uVar4 = *unaff_x21;
    unaff_x20[5] = unaff_x21[1];
    unaff_x20[4] = uVar4;
    unaff_x20[6] = unaff_x21[2];
    *unaff_x21 = 0;
    unaff_x21[1] = 0;
    unaff_x21[2] = 0;
    *unaff_x20 = 0;
    unaff_x20[1] = 0;
    unaff_x20[2] = puVar3;
    *unaff_x23 = unaff_x20;
    puVar3 = unaff_x20;
    if (*(long *)*unaff_x19 != 0) {
      *unaff_x19 = *(long *)*unaff_x19;
      puVar3 = (undefined8 *)*unaff_x23;
    }
    func_0x0003767c(unaff_x19[1],puVar3);
    unaff_x19[2] = unaff_x19[2] + 1;
    uVar4 = 1;
code_r0x00060dc8:
    auVar5._8_8_ = uVar4;
    auVar5._0_8_ = unaff_x20;
    return auVar5;
  }
  do {
    unaff_x20 = param_1;
    uVar1 = unaff_x20[5];
    puVar3 = (undefined8 *)unaff_x20[4];
    if (-1 < (char)*(byte *)((long)unaff_x20 + 0x37)) {
      uVar1 = (ulong)*(byte *)((long)unaff_x20 + 0x37);
      puVar3 = unaff_x20 + 4;
    }
    iVar2 = _memcmp();
    if (iVar2 == 0) {
      if (unaff_x25 < uVar1) break;
    }
    else if (iVar2 < 0) break;
    iVar2 = _memcmp(puVar3);
    if (iVar2 == 0) {
      if (unaff_x25 <= uVar1) goto LAB_00060dc4;
    }
    else if (-1 < iVar2) {
LAB_00060dc4:
      uVar4 = 0;
      goto code_r0x00060dc8;
    }
    param_1 = (undefined8 *)unaff_x20[1];
    if ((undefined8 *)unaff_x20[1] == (undefined8 *)0x0) {
      unaff_x23 = unaff_x20 + 1;
      puVar3 = unaff_x20;
      goto LAB_00060d5c;
    }
  } while( true );
  param_1 = (undefined8 *)*unaff_x20;
  unaff_x23 = unaff_x20;
  goto code_r0x00060cd4;
}

