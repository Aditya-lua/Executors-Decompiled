
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_006f4208(long param_1)

{
  undefined8 uVar1;
  undefined8 uVar2;
  long lVar3;
  long in_x9;
  undefined8 *unaff_x19;
  undefined8 uVar4;
  
  uVar2 = _UNK_008c7d28;
  uVar1 = _UNK_008c7d20;
  uVar4 = *(undefined8 *)(in_x9 + 0xd10);
  unaff_x19[1] = *(undefined8 *)(in_x9 + 0xd18);
  *unaff_x19 = uVar4;
  unaff_x19[3] = uVar2;
  unaff_x19[2] = uVar1;
  uVar4 = _UNK_008c7d48;
  uVar2 = _UNK_008c7d40;
  uVar1 = _UNK_008c7d30;
  unaff_x19[5] = _UNK_008c7d38;
  unaff_x19[4] = uVar1;
  unaff_x19[7] = uVar4;
  unaff_x19[6] = uVar2;
  uVar4 = _UNK_008c7d68;
  uVar2 = _UNK_008c7d60;
  uVar1 = _UNK_008c7d50;
  unaff_x19[9] = _UNK_008c7d58;
  unaff_x19[8] = uVar1;
  unaff_x19[0xb] = uVar4;
  unaff_x19[10] = uVar2;
  uVar4 = _UNK_008c7d88;
  uVar2 = _UNK_008c7d80;
  uVar1 = _UNK_008c7d70;
  unaff_x19[0xd] = _UNK_008c7d78;
  unaff_x19[0xc] = uVar1;
  unaff_x19[0xf] = uVar4;
  unaff_x19[0xe] = uVar2;
  *(undefined4 *)((long)unaff_x19 + 0x4a4) = 0x24;
  uVar1 = _UNK_008c7d90;
  unaff_x19[0x11] = _UNK_008c7d98;
  unaff_x19[0x10] = uVar1;
  do {
    *(char *)((long)unaff_x19 + (long)*(int *)((long)unaff_x19 + param_1 * 4) + 0xa0) =
         (char)param_1;
    param_1 = param_1 + 1;
  } while (param_1 < *(int *)((long)unaff_x19 + 0x4a4));
  lVar3 = 0x400;
  do {
    if (*(char *)((long)unaff_x19 + lVar3 + 0x9f) < '\0') {
      *(undefined1 *)((long)unaff_x19 + lVar3 + 0x9f) =
           *(undefined1 *)((long)unaff_x19 + lVar3 + 0xa0);
    }
    lVar3 = lVar3 + -1;
  } while (lVar3 != 0);
  return;
}

