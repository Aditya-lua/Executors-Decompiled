
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_006e4f50(undefined8 param_1,long param_2)

{
  long *plVar1;
  long lVar2;
  long unaff_x19;
  long unaff_x20;
  undefined8 unaff_x21;
  
  *(undefined8 *)(param_2 + 0x18) = unaff_x21;
  *(undefined8 *)(param_2 + 0x20) = param_1;
  *(long *)(param_2 + 0x28) = param_2 + 0x28;
  plVar1 = *(long **)(unaff_x19 + 8);
  *plVar1 = param_2;
  *(undefined4 *)((long)plVar1 + 0xc) = 7;
  lVar2 = *(long *)(unaff_x19 + 8);
  *(long *)(unaff_x19 + 8) = lVar2 + 0x10;
  *(undefined8 *)(lVar2 + 0x10) = *(undefined8 *)(unaff_x20 + 8);
  *(undefined8 *)(lVar2 + 0x18) = _UNK_008300d0;
  *(long *)(unaff_x19 + 8) = *(long *)(unaff_x19 + 8) + 0x10;
  func_0x006ee550();
  return;
}

