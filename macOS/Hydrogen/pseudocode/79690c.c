
undefined8 FUN_0079690c(undefined8 param_1)

{
  long lVar1;
  undefined4 *puVar2;
  long lVar3;
  undefined8 *unaff_x19;
  undefined8 unaff_x20;
  long unaff_x21;
  long unaff_x22;
  ulong uVar4;
  
  lVar1 = (**(code **)(unaff_x21 + 0x608))(param_1,0xa8);
  if (lVar1 == 0) {
    return 0x1b;
  }
  puVar2 = (undefined4 *)(**(code **)(unaff_x21 + 0x608))(1,0x28);
  if (puVar2 == (undefined4 *)0x0) {
    (*pcRam0000000000a2b5f0)(lVar1);
    return 0x1b;
  }
  *puVar2 = 0xe1551;
  puVar2[6] = 0x15180;
  *(long *)(puVar2 + 2) = lVar1;
  *(long *)(puVar2 + 4) = unaff_x22;
  *(undefined8 *)(puVar2 + 8) = 1;
  if (unaff_x22 != 0) {
    uVar4 = 0;
    lVar1 = 0x90;
    do {
      lVar3 = *(long *)(puVar2 + 2);
      *(undefined8 *)(lVar3 + lVar1) = unaff_x20;
      func_0x0075e3e8((undefined8 *)(lVar3 + lVar1) + -0xe,&DAT_007967cc);
      uVar4 = uVar4 + 1;
      lVar1 = lVar1 + 0xa8;
    } while (uVar4 < *(ulong *)(puVar2 + 4));
  }
  *unaff_x19 = puVar2;
  return 0;
}

