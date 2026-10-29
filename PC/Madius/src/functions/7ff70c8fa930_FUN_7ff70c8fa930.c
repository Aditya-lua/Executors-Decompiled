/* 7ff70c8fa930 FUN_7ff70c8fa930 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 * FUN_7ff70c8fa930(undefined8 param_1)

{
  undefined4 uVar1;
  undefined4 uVar2;
  undefined4 uVar3;
  int iVar4;
  undefined8 *puVar5;
  
  puVar5 = (undefined8 *)(*_DAT_7ff70cbebad0)(0x60);
  if (puVar5 != (undefined8 *)0x0) {
    *puVar5 = 0;
    puVar5[1] = 0;
    puVar5[2] = 0;
    uVar3 = _UNK_7ff70cb1327c;
    uVar2 = _UNK_7ff70cb13278;
    uVar1 = _UNK_7ff70cb13274;
    *(undefined4 *)(puVar5 + 3) = _DAT_7ff70cb13270;
    *(undefined4 *)((longlong)puVar5 + 0x1c) = uVar1;
    *(undefined4 *)(puVar5 + 4) = uVar2;
    *(undefined4 *)((longlong)puVar5 + 0x24) = uVar3;
    puVar5[5] = 0x2d2d2d2d2d2d2d2d;
    iVar4 = FUN_7ff70c95f8e0(param_1,puVar5 + 6,0x17);
    if (iVar4 == 0) {
      *(undefined4 *)(puVar5 + 9) = 0;
      puVar5[10] = 0;
      puVar5[0xb] = 0;
      return puVar5;
    }
    (*_DAT_7ff70cbebad8)(puVar5);
  }
  return (undefined8 *)0x0;
}


