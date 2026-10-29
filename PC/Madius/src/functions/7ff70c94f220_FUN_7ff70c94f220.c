/* 7ff70c94f220 FUN_7ff70c94f220 */

ulonglong FUN_7ff70c94f220(longlong param_1,undefined8 *param_2,undefined1 *param_3,
                          undefined4 *param_4,undefined1 param_5)

{
  int iVar1;
  ulonglong uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined *puVar5;
  undefined4 uStack_58;
  undefined4 uStack_54;
  undefined4 uStack_50;
  undefined4 uStack_4c;
  undefined8 uStack_48;
  undefined8 uStack_40;
  
  uVar2 = FUN_7ff70c956410(param_1,param_2,param_5);
  if (-1 < (longlong)uVar2) goto LAB_7ff70c94f2f9;
  if (*(int *)(param_1 + 0x58) == 4) {
    uStack_48 = *param_2;
    uStack_40 = param_2[1];
    uStack_58 = *(undefined4 *)(param_1 + 0xb00);
    uStack_54 = *(undefined4 *)(param_1 + 0xb04);
    uStack_50 = *(undefined4 *)(param_1 + 0xb08);
    uStack_4c = *(undefined4 *)(param_1 + 0xb0c);
    uVar3 = FUN_7ff70c9586d0(&uStack_48,&uStack_58);
    puVar5 = &UNK_7ff70cb821cf;
LAB_7ff70c94f2be:
    FUN_7ff70c9412d0(param_1,puVar5,uVar3);
    iVar1 = *(int *)(param_1 + 0x58);
  }
  else {
    if (*(int *)(param_1 + 0x58) == 3) {
      uStack_48 = *param_2;
      uStack_40 = param_2[1];
      uStack_58 = *(undefined4 *)(param_1 + 0xb00);
      uStack_54 = *(undefined4 *)(param_1 + 0xb04);
      uStack_50 = *(undefined4 *)(param_1 + 0xb08);
      uStack_4c = *(undefined4 *)(param_1 + 0xb0c);
      uVar3 = FUN_7ff70c9586d0(&uStack_48,&uStack_58);
      puVar5 = &UNK_7ff70cb821fd;
      goto LAB_7ff70c94f2be;
    }
    uVar3 = *(undefined8 *)(param_1 + 0x100);
    if (*(longlong *)(param_1 + 0xf0) == -1) {
      uStack_48 = *param_2;
      uStack_40 = param_2[1];
      uStack_58 = *(undefined4 *)(param_1 + 0xb00);
      uStack_54 = *(undefined4 *)(param_1 + 0xb04);
      uStack_50 = *(undefined4 *)(param_1 + 0xb08);
      uStack_4c = *(undefined4 *)(param_1 + 0xb0c);
      uVar4 = FUN_7ff70c9586d0(&uStack_48,&uStack_58);
      puVar5 = &UNK_7ff70cb8798c;
    }
    else {
      uStack_48 = *param_2;
      uStack_40 = param_2[1];
      uStack_58 = *(undefined4 *)(param_1 + 0xb00);
      uStack_54 = *(undefined4 *)(param_1 + 0xb04);
      uStack_50 = *(undefined4 *)(param_1 + 0xb08);
      uStack_4c = *(undefined4 *)(param_1 + 0xb0c);
      uVar4 = FUN_7ff70c9586d0(&uStack_48,&uStack_58);
      puVar5 = &UNK_7ff70cb879d3;
    }
    FUN_7ff70c9412d0(param_1,puVar5,uVar4,uVar3);
    iVar1 = *(int *)(param_1 + 0x58);
  }
  if (8 < iVar1) {
    FUN_7ff70c956760(*(undefined8 *)(param_1 + 0x20),2);
    *param_3 = 1;
  }
  *param_4 = 0x1c;
  FUN_7ff70c94acb0(param_1,0x1c,1);
LAB_7ff70c94f2f9:
  return uVar2 >> 0x3f;
}


