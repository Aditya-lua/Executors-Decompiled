
undefined1  [16] FUN_00088c6c(void)

{
  int iVar1;
  undefined8 *puVar2;
  undefined8 uVar3;
  undefined8 *puVar4;
  long *unaff_x19;
  undefined8 *unaff_x20;
  undefined8 *unaff_x21;
  undefined8 *unaff_x23;
  undefined8 *puVar5;
  ulong unaff_x25;
  ulong unaff_x26;
  undefined1 auVar6 [16];
  
  do {
    iVar1 = _memcmp();
    if (iVar1 == 0) {
      if (unaff_x25 < unaff_x26) goto LAB_00088c30;
LAB_00088c88:
      iVar1 = _memcmp(unaff_x23);
      if (iVar1 == 0) {
        if (unaff_x25 <= unaff_x26) goto LAB_00088d30;
      }
      else if (-1 < iVar1) {
LAB_00088d30:
        uVar3 = 0;
        goto LAB_00088d34;
      }
      puVar4 = (undefined8 *)unaff_x20[1];
      if (puVar4 == (undefined8 *)0x0) {
        puVar5 = unaff_x20 + 1;
LAB_00088cc0:
        puVar2 = (undefined8 *)__Znwm(0x48);
        uVar3 = *unaff_x21;
        puVar2[5] = unaff_x21[1];
        puVar2[4] = uVar3;
        puVar2[6] = unaff_x21[2];
        *unaff_x21 = 0;
        unaff_x21[1] = 0;
        unaff_x21[2] = 0;
        *(undefined1 *)(puVar2 + 7) = 0;
        puVar2[8] = 0;
        *puVar2 = 0;
        puVar2[1] = 0;
        puVar2[2] = unaff_x20;
        *puVar5 = puVar2;
        puVar4 = puVar2;
        if (*(long *)*unaff_x19 != 0) {
          *unaff_x19 = *(long *)*unaff_x19;
          puVar4 = (undefined8 *)*puVar5;
        }
        func_0x0003767c(unaff_x19[1],puVar4);
        unaff_x19[2] = unaff_x19[2] + 1;
        uVar3 = 1;
        unaff_x20 = puVar2;
LAB_00088d34:
        auVar6._8_8_ = uVar3;
        auVar6._0_8_ = unaff_x20;
        return auVar6;
      }
    }
    else {
      if (-1 < iVar1) goto LAB_00088c88;
LAB_00088c30:
      puVar4 = (undefined8 *)*unaff_x20;
      puVar5 = unaff_x20;
      if (puVar4 == (undefined8 *)0x0) goto LAB_00088cc0;
    }
    unaff_x20 = puVar4;
    unaff_x23 = (undefined8 *)puVar4[4];
    unaff_x26 = puVar4[5];
    if (-1 < (char)*(byte *)((long)puVar4 + 0x37)) {
      unaff_x23 = puVar4 + 4;
      unaff_x26 = (ulong)*(byte *)((long)puVar4 + 0x37);
    }
  } while( true );
}

