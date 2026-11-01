
void FUN_0014d208(long param_1)

{
  long lVar1;
  undefined8 uVar2;
  code *unaff_x20;
  undefined8 unaff_x21;
  
  uVar2 = *(undefined8 *)(param_1 + 0x10);
  if (unaff_x20 == (code *)0x0) {
    lVar1 = _malloc(&UNK_000176e0);
  }
  else {
    lVar1 = (*unaff_x20)(uVar2,&UNK_000176e0);
  }
  if (lVar1 == 0) {
    return;
  }
  *(code **)(&UNK_000075b0 + lVar1) = unaff_x20;
  *(undefined8 *)(&UNK_000075b8 + lVar1) = unaff_x21;
  *(undefined8 *)(&UNK_000075c0 + lVar1) = uVar2;
  *(undefined8 *)(&UNK_000075d8 + lVar1) = 0;
  *(undefined8 *)(&UNK_000074d8 + lVar1) = 0;
  *(undefined8 *)(&UNK_000075fc + lVar1) = 0;
  *(undefined8 *)(&UNK_00007648 + lVar1) = 0;
  *(undefined8 *)(&UNK_000075f0 + lVar1) = 0;
  *(undefined8 *)(&UNK_000075e8 + lVar1) = 0;
  *(undefined8 *)(&UNK_000176d8 + lVar1) = 0;
  *(undefined8 *)(&UNK_00007624 + lVar1) = 0;
  *(undefined8 *)(&UNK_0000761c + lVar1) = 0;
  *(undefined4 *)(&UNK_0000762c + lVar1) = 0;
  *(undefined4 *)(&UNK_000075e0 + lVar1) = 1;
  *(undefined8 *)(&UNK_00007608 + lVar1) = 0;
  *(undefined8 *)(&UNK_00007638 + lVar1) = 0x8000001;
  *(undefined8 *)(&UNK_0000766c + lVar1) = 0;
  *(undefined8 *)(&UNK_00007598 + lVar1) = 0;
  *(undefined8 *)(&UNK_00007610 + lVar1) = 0;
  *(undefined4 *)(&UNK_00007618 + lVar1) = 0;
  return;
}

