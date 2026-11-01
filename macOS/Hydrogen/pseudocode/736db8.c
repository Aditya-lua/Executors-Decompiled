
undefined8 FUN_00736db8(long *param_1)

{
  undefined4 *puVar1;
  byte bVar2;
  undefined4 *puVar3;
  undefined8 uVar4;
  long unaff_x20;
  undefined4 unaff_w22;
  undefined8 unaff_x23;
  undefined1 uStack0000000000000008;
  
  if (*param_1 == 0) {
    bVar2 = *(byte *)(unaff_x20 + 0x52a);
    _uStack0000000000000008 = 0;
    puVar3 = (undefined4 *)(*pcRam0000000000a2b608)(1,0x18);
    if (puVar3 == (undefined4 *)0x0) {
      (*pcRam0000000000a2b5f0)();
      uVar4 = 0x1b;
    }
    else {
      *puVar3 = 0;
      *(undefined8 *)(puVar3 + 2) = unaff_x23;
      puVar3[4] = unaff_w22;
      puVar3[5] = (uint)bVar2;
      uVar4 = func_0x00730fe0(&uStack0000000000000008,0xa2b4d0,puVar3);
      puVar1 = (undefined4 *)0x0;
      if ((int)uVar4 != 0) {
        puVar1 = puVar3;
      }
      (*pcRam0000000000a2b5f0)(puVar1);
      if ((int)uVar4 == 0) {
        func_0x00731058();
      }
    }
  }
  else {
    uVar4 = 0;
  }
  return uVar4;
}

