/* 7ff70c958d60 FUN_7ff70c958d60 */

bool FUN_7ff70c958d60(longlong param_1,longlong param_2)

{
  ulonglong uVar1;
  longlong lVar2;
  int iVar3;
  undefined4 uStack_30;
  undefined4 uStack_2c;
  undefined4 uStack_28;
  undefined4 uStack_24;
  
  iVar3 = *(int *)(*(longlong *)(param_1 + 0xd8) + 0x170);
  if (iVar3 < 0) {
    iVar3 = *(int *)(*(longlong *)(param_1 + 0xd8) + 0x18) << 2;
  }
  FUN_7ff70c958630(&uStack_30);
  *(undefined4 *)(param_2 + 0x198) = uStack_30;
  *(undefined4 *)(param_2 + 0x19c) = uStack_2c;
  *(undefined4 *)(param_2 + 0x1a0) = uStack_28;
  *(undefined4 *)(param_2 + 0x1a4) = uStack_24;
  if (iVar3 != 0) {
    if (*(longlong *)(param_1 + 0xe8) == 0) {
      uVar1 = *(ulonglong *)(*(longlong *)(param_1 + 0xbf8) + 0x30);
    }
    else {
      FUN_7ff70c959850(param_1,5,2);
      uVar1 = *(ulonglong *)(*(longlong *)(param_1 + 0xbf8) + 0x30);
      if (*(longlong *)(param_1 + 0xe8) != 0) {
        FUN_7ff70c959890(param_1,5);
      }
    }
    if ((ulonglong)(longlong)iVar3 < uVar1) {
      if (*(char *)(param_1 + 0xa37) == '\x01') {
        FUN_7ff70c941400(param_1,&UNK_7ff70cb86ac7);
      }
      lVar2 = FUN_7ff70c958e50(param_1);
      if (lVar2 != 0) {
        FUN_7ff70c945f70(param_1,lVar2,0);
        goto LAB_7ff70c958e37;
      }
    }
  }
  lVar2 = 0;
LAB_7ff70c958e37:
  return lVar2 != param_2;
}


