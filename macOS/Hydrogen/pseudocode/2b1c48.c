
undefined8 * FUN_002b1c48(byte *param_1,undefined8 param_2,ulong param_3,undefined8 param_4)

{
  int iVar1;
  undefined8 *puVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  code *pcVar5;
  
  puVar2 = (undefined8 *)func_0x0036e31c(0x248);
  if (puVar2 == (undefined8 *)0x0) {
    return (undefined8 *)0x0;
  }
  pcVar5 = *(code **)(param_1 + 0x10);
  if (pcVar5 == (code *)0x0) {
    uVar3 = 0x7c;
    uVar4 = 0x46;
  }
  else {
    if (*param_1 == param_3) {
      *puVar2 = param_1;
      iVar1 = (*pcVar5)(puVar2,param_2,param_3,param_4);
      if (iVar1 != 0) {
        return puVar2;
      }
      goto LAB_002b1cf0;
    }
    uVar3 = 0x78;
    uVar4 = 0x54;
  }
  func_0x0028f83c(0x1e,0,uVar3,"/aws-lc/crypto/fipsmodule/cipher/aead.c",uVar4);
LAB_002b1cf0:
  *puVar2 = 0;
  func_0x0036e3d8(puVar2);
  return (undefined8 *)0x0;
}

