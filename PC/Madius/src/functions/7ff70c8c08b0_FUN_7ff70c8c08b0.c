/* 7ff70c8c08b0 FUN_7ff70c8c08b0 */

undefined8 * FUN_7ff70c8c08b0(undefined8 *param_1,undefined8 param_2,undefined4 param_3)

{
  ulonglong uVar1;
  undefined *puVar2;
  undefined8 *puVar3;
  undefined *puStack_70;
  undefined *apuStack_68 [4];
  undefined4 auStack_48 [2];
  undefined *puStack_40;
  undefined8 *puStack_38;
  undefined8 *puStack_30;
  undefined8 *puStack_28;
  undefined8 uStack_20;
  
  uStack_20 = 0xfffffffffffffffe;
  puStack_38 = param_1 + 1;
  param_1[1] = 0;
  param_1[2] = 0;
  *param_1 = &UNK_7ff70cb21e78;
  puStack_28 = param_1 + 3;
  param_1[3] = 0;
  param_1[4] = 0;
  param_1[5] = 0;
  param_1[6] = 0xf;
  puStack_40 = &UNK_7ff70cb75fc0;
  auStack_48[0] = param_3;
  puStack_30 = param_1;
  FUN_7ff70ca2fff0(&puStack_70,auStack_48,param_2);
  puStack_70 = &UNK_7ff70cb74118;
  puVar2 = &UNK_7ff70cb84352;
  if (apuStack_68[0] != (undefined *)0x0) {
    puVar2 = apuStack_68[0];
  }
  uVar1 = FUN_7ff70cb12e80(puVar2);
  if ((ulonglong)puStack_30[6] < uVar1) {
    FUN_7ff70ca005a0(puStack_28,uVar1);
  }
  else {
    puVar3 = puStack_28;
    if (0xf < (ulonglong)puStack_30[6]) {
      puVar3 = (undefined8 *)puStack_30[3];
    }
    puStack_30[5] = uVar1;
    FUN_7ff70cb12b70(puVar3,puVar2,uVar1);
    *(undefined1 *)((longlong)puVar3 + uVar1) = 0;
  }
  puStack_70 = &UNK_7ff70cb740d8;
  FUN_7ff70cb12ae0(apuStack_68);
  return puStack_30;
}


