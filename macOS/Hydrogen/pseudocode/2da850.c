
undefined8 * FUN_002da850(undefined8 *param_1)

{
  int iVar1;
  undefined8 *puVar2;
  code *pcVar3;
  long unaff_x19;
  long lVar4;
  undefined8 unaff_x20;
  int unaff_w21;
  int *piVar5;
  
  if ((*(int *)(param_1 + 0x108) == unaff_w21) ||
     (param_1 = (undefined8 *)0xa3a600, iRam0000000000a3b048 == unaff_w21)) {
    piVar5 = (int *)*param_1;
  }
  else {
    puVar2 = (undefined8 *)func_0x00294600();
    piVar5 = (int *)*puVar2;
    if (((*piVar5 != unaff_w21) && (piVar5 = (int *)puVar2[1], *piVar5 != unaff_w21)) &&
       (piVar5 = (int *)puVar2[2], *piVar5 != unaff_w21)) {
      func_0x0028f83c(6,0,0x80,"/aws-lc/crypto/fipsmodule/evp/evp_ctx.c",0x77);
      func_0x0028fa74("algorithm %d");
      return (undefined8 *)0x0;
    }
  }
  puVar2 = (undefined8 *)func_0x0036e31c(0x48);
  if (puVar2 != (undefined8 *)0x0) {
    *puVar2 = piVar5;
    puVar2[1] = unaff_x20;
    *(undefined4 *)(puVar2 + 4) = 0;
    if (unaff_x19 != 0) {
      func_0x003707e8();
      puVar2[2] = unaff_x19;
    }
    if ((*(code **)(piVar5 + 2) != (code *)0x0) &&
       (iVar1 = (**(code **)(piVar5 + 2))(puVar2), iVar1 < 1)) {
      lVar4 = puVar2[2];
      if ((lVar4 != 0) && (iVar1 = func_0x00370810(lVar4), iVar1 != 0)) {
        if ((*(long *)(lVar4 + 0x10) != 0) &&
           (pcVar3 = *(code **)(*(long *)(lVar4 + 0x10) + 0xa0), pcVar3 != (code *)0x0)) {
          (*pcVar3)(lVar4);
          *(undefined8 *)(lVar4 + 8) = 0;
          *(undefined4 *)(lVar4 + 4) = 0;
        }
        func_0x0036e3d8(lVar4);
      }
      func_0x0036e3d8(puVar2);
      return (undefined8 *)0x0;
    }
  }
  return puVar2;
}

