/* 7ff70c956410 FUN_7ff70c956410 */

ulonglong FUN_7ff70c956410(longlong param_1,undefined8 *param_2,char param_3)

{
  longlong lVar1;
  ulonglong uVar2;
  ulonglong uVar3;
  ulonglong uVar4;
  undefined4 uStack_68;
  undefined4 uStack_64;
  undefined4 uStack_60;
  undefined4 uStack_5c;
  undefined8 uStack_58;
  undefined8 uStack_50;
  undefined8 auStack_40 [2];
  
  uVar4 = (ulonglong)*(uint *)(param_1 + 0x300);
  if (param_3 == '\0') {
    uVar2 = 0;
    if (uVar4 == 0) {
      return 0;
    }
  }
  else {
    uVar2 = 300000;
    if (*(uint *)(param_1 + 0x304) != 0) {
      uVar2 = (ulonglong)*(uint *)(param_1 + 0x304);
    }
  }
  if (param_2 == (undefined8 *)0x0) {
    param_2 = auStack_40;
    FUN_7ff70c958630(param_2);
  }
  if (uVar4 == 0) {
    uVar3 = 0;
  }
  else {
    uStack_58 = *param_2;
    uStack_50 = param_2[1];
    uStack_68 = *(undefined4 *)(param_1 + 0xb10);
    uStack_64 = *(undefined4 *)(param_1 + 0xb14);
    uStack_60 = *(undefined4 *)(param_1 + 0xb18);
    uStack_5c = *(undefined4 *)(param_1 + 0xb1c);
    lVar1 = FUN_7ff70c9586d0(&uStack_58,&uStack_68);
    uVar3 = uVar4 - lVar1;
  }
  if (param_3 != '\0') {
    uStack_58 = *param_2;
    uStack_50 = param_2[1];
    uStack_68 = *(undefined4 *)(param_1 + 0xb00);
    uStack_64 = *(undefined4 *)(param_1 + 0xb04);
    uStack_60 = *(undefined4 *)(param_1 + 0xb08);
    uStack_5c = *(undefined4 *)(param_1 + 0xb0c);
    lVar1 = FUN_7ff70c9586d0(&uStack_58,&uStack_68);
    uVar2 = uVar2 - lVar1;
    if ((longlong)uVar2 < (longlong)uVar3) {
      uVar3 = uVar2;
    }
    if (uVar4 == 0) {
      uVar3 = uVar2;
    }
  }
  return -(ulonglong)(uVar3 == 0) | uVar3;
}


