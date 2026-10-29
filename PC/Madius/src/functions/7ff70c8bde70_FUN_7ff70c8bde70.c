/* 7ff70c8bde70 FUN_7ff70c8bde70 */

undefined8 FUN_7ff70c8bde70(undefined8 *param_1,undefined8 param_2)

{
  int iVar1;
  longlong lVar2;
  undefined8 *puVar3;
  longlong *plStack_38;
  longlong *plStack_30;
  undefined8 uStack_28;
  
  lVar2 = FUN_7ff70c8194a0();
  FUN_7ff70c8491c0(&UNK_7ff70cb8bd4c,0xbd8,0x4d0,8,0x10,0x14,2);
  puVar3 = (undefined8 *)FUN_7ff70c802100(0x70);
  *puVar3 = 0;
  puVar3[1] = 0;
  puVar3[2] = 0;
  puVar3[3] = 0;
  puVar3[4] = 0;
  puVar3[5] = 0;
  puVar3[6] = 0;
  puVar3[7] = 0;
  puVar3[8] = 0;
  puVar3[9] = 0;
  puVar3[10] = 0;
  puVar3[0xb] = 0;
  puVar3[0xc] = 0;
  puVar3[0xd] = 0x271000001388;
  *(undefined8 **)(lVar2 + 0x98) = puVar3;
  *(undefined **)(lVar2 + 0x88) = &UNK_7ff70cb8bc11;
  *(byte *)(lVar2 + 4) = *(byte *)(lVar2 + 4) | 0x18;
  lVar2 = FUN_7ff70c819540();
  *(undefined8 *)(lVar2 + 0x3c) = 0x400000004000;
  plStack_30 = (longlong *)0x0;
  plStack_38 = (longlong *)0x0;
  uStack_28 = 0;
  iVar1 = (**(code **)*param_1)(param_1,&UNK_7ff70cb1ebf0,&plStack_30);
  if (iVar1 == 0) {
    iVar1 = (**(code **)(*plStack_30 + 0x30))(plStack_30,&UNK_7ff70cb1ec00,&plStack_38);
    if (iVar1 == 0) {
      iVar1 = (**(code **)(*plStack_38 + 0x30))(plStack_38,&UNK_7ff70cb1ec10,&uStack_28);
      if (iVar1 == 0) {
        *puVar3 = param_1;
        puVar3[1] = param_2;
        puVar3[2] = uStack_28;
      }
    }
  }
  if (plStack_30 != (longlong *)0x0) {
    (**(code **)(*plStack_30 + 0x10))();
  }
  if (plStack_38 != (longlong *)0x0) {
    (**(code **)(*plStack_38 + 0x10))();
  }
  (**(code **)(*(longlong *)*puVar3 + 8))();
  (**(code **)(*(longlong *)puVar3[1] + 8))();
  return 1;
}


