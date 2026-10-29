/* 7ff70c941fb0 FUN_7ff70c941fb0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined4 FUN_7ff70c941fb0(void)

{
  int iVar1;
  longlong lVar2;
  undefined4 *puVar3;
  undefined4 *puVar4;
  undefined8 *puVar5;
  
  if ((_DAT_7ff70cbec7c0 == (undefined4 *)&UNK_7ff70cb4fc28) &&
     (_DAT_7ff70cbec7d0 != (undefined4 *)0x0)) {
    lVar2 = FUN_7ff70c97f1a0(&UNK_7ff70cb8a70e);
    puVar4 = _DAT_7ff70cbec7d0;
    if ((lVar2 != 0) && (_DAT_7ff70cbec7d0 != (undefined4 *)0x0)) {
      puVar5 = (undefined8 *)0x7ff70cbec7d8;
      puVar3 = _DAT_7ff70cbec7d0;
      do {
        iVar1 = FUN_7ff70c959220(lVar2,*(undefined8 *)(puVar3 + 2));
        if (iVar1 != 0) {
          puVar4 = (undefined4 *)puVar5[-1];
          break;
        }
        puVar3 = (undefined4 *)*puVar5;
        puVar5 = puVar5 + 1;
        puVar4 = _DAT_7ff70cbec7d0;
      } while (puVar3 != (undefined4 *)0x0);
    }
    _DAT_7ff70cbec7c0 = puVar4;
    (*_DAT_7ff70cbebad8)(lVar2);
  }
  return *_DAT_7ff70cbec7c0;
}


