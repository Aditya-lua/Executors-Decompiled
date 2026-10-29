/* 7ff70c7b1440 FUN_7ff70c7b1440 */

void FUN_7ff70c7b1440(undefined8 *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                     longlong *param_5)

{
  ulonglong uVar1;
  code *pcVar2;
  undefined8 uVar3;
  undefined8 *puVar4;
  ulonglong uVar5;
  longlong lVar6;
  undefined8 *puVar7;
  ulonglong uVar8;
  
  *param_1 = param_2;
  param_1[1] = 0;
  puVar4 = (undefined8 *)FUN_7ff70ca8ff40(0x88);
  param_1[1] = puVar4;
  puVar7 = (undefined8 *)*param_5;
  puVar4[6] = 0;
  puVar4[7] = 0;
  puVar4[4] = 0;
  puVar4[5] = 0;
  uVar1 = puVar7[2];
  if (0xf < (ulonglong)puVar7[3]) {
    puVar7 = (undefined8 *)*puVar7;
  }
  if (-1 < (longlong)uVar1) {
    if (uVar1 < 0x10) {
      puVar4[6] = uVar1;
      puVar4[7] = 0xf;
      uVar3 = puVar7[1];
      puVar4[4] = *puVar7;
      puVar4[5] = uVar3;
      puVar7 = puVar4;
    }
    else {
      uVar5 = uVar1 | 0xf;
      uVar8 = 0x16;
      if (0x16 < uVar5) {
        uVar8 = uVar5;
      }
      if (uVar5 < 0xfff) {
        uVar5 = FUN_7ff70ca8ff40(uVar8 + 1);
      }
      else {
        lVar6 = FUN_7ff70ca8ff40(uVar8 + 0x28);
        uVar5 = lVar6 + 0x27U & 0xffffffffffffffe0;
        *(longlong *)(uVar5 - 8) = lVar6;
      }
      puVar4[4] = uVar5;
      puVar4[6] = uVar1;
      puVar4[7] = uVar8;
      FUN_7ff70cb12b60(uVar5,puVar7,uVar1 + 1);
      puVar7 = (undefined8 *)param_1[1];
    }
    puVar4[8] = &UNK_7ff70cb14c68;
    puVar4[9] = 0;
    puVar4[10] = 0;
    puVar4[0xb] = 0;
    puVar4[0xc] = 0xf;
    puVar4[0xd] = 0;
    puVar4[0xe] = 0;
    puVar4[0xf] = 0;
    puVar4[0x10] = 0xf;
    *puVar7 = param_3;
    *(undefined8 *)(param_1[1] + 8) = param_3;
    *(undefined8 *)(param_1[1] + 0x10) = param_3;
    *(undefined1 *)(param_1[1] + 0x18) = 0;
    *(undefined1 *)(param_1[1] + 0x19) = 0;
    return;
  }
  FUN_7ff70ca00780();
  pcVar2 = (code *)swi(3);
  (*pcVar2)();
  return;
}


