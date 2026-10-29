/* 7ff70c8c1b00 FUN_7ff70c8c1b00 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined4 *
FUN_7ff70c8c1b00(undefined4 *param_1,undefined8 *param_2,undefined8 *param_3,undefined4 param_4,
                undefined8 *param_5)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  void *pvVar9;
  undefined4 uStack_48;
  undefined4 uStack_44;
  undefined4 uStack_40;
  undefined4 uStack_3c;
  
  uVar2 = *param_5;
  uVar3 = param_5[1];
  uVar8 = *param_3;
  uVar4 = param_3[1];
  uVar5 = *param_2;
  uVar6 = param_2[1];
  uVar1 = param_2[2];
  uVar7 = FUN_7ff70cb12700();
  uStack_48 = (undefined4)uVar8;
  uStack_44 = (undefined4)((ulonglong)uVar8 >> 0x20);
  uStack_40 = (undefined4)uVar4;
  uStack_3c = (undefined4)((ulonglong)uVar4 >> 0x20);
  *param_1 = uStack_48;
  param_1[1] = uStack_44;
  param_1[2] = uStack_40;
  param_1[3] = uStack_3c;
  param_1[4] = param_4;
  *(undefined8 *)(param_1 + 6) = uVar7;
  pvVar9 = ThreadLocalStoragePointer;
  if (*(char *)(*(longlong *)
                 ((longlong)ThreadLocalStoragePointer + (ulonglong)_DAT_7ff70cc1a960 * 8) + 0x10) ==
      '\x01') {
    uVar8 = *(undefined8 *)
             (*(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)_DAT_7ff70cc1a960 * 8)
             + 8);
  }
  else {
    *(undefined1 *)
     (*(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)_DAT_7ff70cc1a960 * 8) + 0x10)
         = 1;
    uVar8 = func_0x7ff70da664e2();
    *(undefined8 *)(*(longlong *)((ulonglong)_DAT_00000058 + (longlong)pvVar9 * 8) + 8) = uVar8;
  }
  *(undefined8 *)(param_1 + 8) = uVar8;
  *(undefined8 *)(param_1 + 10) = 0;
  *(undefined8 *)(param_1 + 0xc) = 0;
  *(undefined8 *)(param_1 + 0xe) = uVar5;
  *(undefined8 *)(param_1 + 0x10) = uVar6;
  *(undefined8 *)(param_1 + 0x12) = uVar1;
  *(undefined8 *)(param_1 + 0x14) = uVar2;
  *(undefined8 *)(param_1 + 0x16) = uVar3;
  return param_1;
}


