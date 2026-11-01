
/* WARNING: Removing unreachable block (ram,0x0042b108) */

void FUN_0042b0a8(undefined2 *param_1,undefined8 param_2,ulong param_3)

{
  undefined *puVar1;
  char cVar2;
  int iVar3;
  uint *puVar4;
  undefined8 uVar5;
  ulong uVar6;
  undefined8 *puVar7;
  ulong uStack_2c0;
  undefined *puStack_2b8;
  undefined1 auStack_228 [384];
  int aiStack_a8 [2];
  undefined8 uStack_a0;
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 uStack_48;
  undefined8 uStack_40;
  undefined8 uStack_38;
  undefined8 uStack_30;
  undefined8 uStack_28;
  undefined8 uStack_20;
  undefined8 uStack_18;
  undefined8 uStack_10;
  undefined8 uStack_8;
  
  if (param_3 < 0x180) {
    _memcpy(auStack_228,param_2,param_3);
    auStack_228[param_3] = 0;
    func_0x00462a54(aiStack_a8,auStack_228,param_3 + 1);
    if (aiStack_a8[0] == 1) {
      puStack_2b8 = &UNK_009dae48;
    }
    else {
      uStack_18 = 0;
      uStack_20 = 0;
      uStack_8 = 0;
      uStack_10 = 0;
      uStack_38 = 0;
      uStack_40 = 0;
      uStack_28 = 0;
      uStack_30 = 0;
      uStack_58 = 0;
      uStack_60 = 0;
      uStack_48 = 0;
      uStack_50 = 0;
      uStack_78 = 0;
      uStack_80 = 0;
      uStack_68 = 0;
      uStack_70 = 0;
      uStack_88 = 0;
      uStack_90 = 0;
      iVar3 = _stat(uStack_a0,&uStack_90);
      if (iVar3 != -1) goto LAB_0042b268;
      puVar4 = (uint *)___error();
      puStack_2b8 = (undefined *)((ulong)*puVar4 << 0x20 | 2);
    }
  }
  else {
    func_0x007a0b8c(&uStack_2c0,param_2,param_3,&DAT_003f4af4);
    if ((uStack_2c0 & 1) == 0) {
LAB_0042b268:
      *param_1 = 0x100;
      return;
    }
  }
  puVar1 = puStack_2b8;
  uVar6 = (ulong)puStack_2b8 & 3;
  if (uVar6 < 2) {
    if (uVar6 == 0) {
      if (puStack_2b8[0x10] != '\0') goto LAB_0042b23c;
LAB_0042b1d0:
      *param_1 = 0;
      if (uVar6 != 1) {
        return;
      }
    }
    else {
      if (puStack_2b8[0xf] != '\0') goto LAB_0042b23c;
      *param_1 = 0;
    }
    uVar5 = *(undefined8 *)(puVar1 + -1);
    puVar7 = *(undefined8 **)(puVar1 + 7);
    if ((code *)*puVar7 != (code *)0x0) {
      (*(code *)*puVar7)(uVar5);
    }
    if (puVar7[1] != 0) {
      func_0x00187bd4(uVar5,puVar7[1],puVar7[2]);
    }
    func_0x00187bd4(puVar1 + -1,0x18,8);
  }
  else {
    if (uVar6 == 2) {
      cVar2 = func_0x004307b8((ulong)puStack_2b8 >> 0x20);
      if (cVar2 == '\0') goto LAB_0042b1d0;
    }
    else if ((ulong)puStack_2b8 >> 0x20 == 0) {
      *param_1 = 0;
      return;
    }
LAB_0042b23c:
    *(undefined **)(param_1 + 4) = puVar1;
    *(undefined1 *)param_1 = 1;
  }
  return;
}

