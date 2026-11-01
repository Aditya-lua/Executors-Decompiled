
void FUN_00060f58(undefined8 *param_1,undefined1 param_2 [16],undefined1 param_3 [16],long param_4)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  undefined8 *puVar4;
  undefined8 *puVar5;
  int iVar6;
  undefined8 in_x9;
  undefined8 in_x10;
  long *unaff_x19;
  undefined8 *unaff_x20;
  undefined8 *unaff_x22;
  undefined8 *puVar7;
  
  *(long *)(param_4 + 0x28) = param_2._8_8_;
  *(long *)(param_4 + 0x20) = param_2._0_8_;
  *(undefined8 *)(param_4 + 0x30) = in_x9;
  *(long *)(param_4 + 0x40) = param_3._8_8_;
  *(long *)(param_4 + 0x38) = param_3._0_8_;
  *(undefined8 *)(param_4 + 0x48) = in_x10;
  if (param_1 == (undefined8 *)0x0) {
    puVar7 = unaff_x22;
  }
  else {
    puVar4 = (undefined8 *)unaff_x20[4];
    uVar1 = unaff_x20[5];
    if (-1 < (char)*(byte *)((long)unaff_x20 + 0x37)) {
      puVar4 = unaff_x20 + 4;
      uVar1 = (ulong)*(byte *)((long)unaff_x20 + 0x37);
    }
    do {
      while( true ) {
        puVar7 = param_1;
        uVar2 = puVar7[5];
        puVar5 = (undefined8 *)puVar7[4];
        if (-1 < (char)*(byte *)((long)puVar7 + 0x37)) {
          uVar2 = (ulong)*(byte *)((long)puVar7 + 0x37);
          puVar5 = puVar7 + 4;
        }
        uVar3 = uVar2;
        if (uVar1 <= uVar2) {
          uVar3 = uVar1;
        }
        iVar6 = _memcmp(puVar4,puVar5,uVar3);
        if (iVar6 != 0) break;
        if (uVar2 <= uVar1) goto LAB_00060fdc;
LAB_00060f8c:
        param_1 = (undefined8 *)*puVar7;
        unaff_x22 = puVar7;
        if ((undefined8 *)*puVar7 == (undefined8 *)0x0) goto LAB_00060ff0;
      }
      if (iVar6 < 0) goto LAB_00060f8c;
LAB_00060fdc:
      param_1 = (undefined8 *)puVar7[1];
    } while ((undefined8 *)puVar7[1] != (undefined8 *)0x0);
    unaff_x22 = puVar7 + 1;
  }
LAB_00060ff0:
  *unaff_x20 = 0;
  unaff_x20[1] = 0;
  unaff_x20[2] = puVar7;
  *unaff_x22 = unaff_x20;
  if (*(long *)*unaff_x19 != 0) {
    *unaff_x19 = *(long *)*unaff_x19;
  }
  func_0x0003767c(unaff_x19[1]);
  unaff_x19[2] = unaff_x19[2] + 1;
  return;
}

