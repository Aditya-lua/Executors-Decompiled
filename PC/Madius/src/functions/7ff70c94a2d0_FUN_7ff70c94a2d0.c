/* 7ff70c94a2d0 FUN_7ff70c94a2d0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined4 * FUN_7ff70c94a2d0(undefined4 param_1,undefined4 param_2,undefined4 param_3)

{
  undefined4 *puVar1;
  int iVar2;
  undefined4 *puVar3;
  longlong lVar4;
  undefined1 auStack_48 [24];
  
  puVar3 = (undefined4 *)(*_DAT_7ff70cbebaf0)(1,0x1b8);
  if (puVar3 != (undefined4 *)0x0) {
    *puVar3 = 0xbab1e;
    FUN_7ff70c9849a0(puVar3 + 0x28,param_3);
    puVar1 = puVar3 + 0x38;
    FUN_7ff70c992990(puVar1,param_1,&UNK_7ff70c94f110,&UNK_7ff70c94f100,&UNK_7ff70c94f0f0);
    iVar2 = FUN_7ff70c9587e0(puVar3 + 0x44,param_2);
    if (iVar2 == 0) {
      FUN_7ff70c990fa0(puVar3 + 8,0);
      FUN_7ff70c990fa0(puVar3 + 0x10,0);
      FUN_7ff70c990fa0(puVar3 + 0x18,0);
      *(undefined1 *)((longlong)puVar3 + 0x1b1) = 1;
      puVar3[0x5c] = 0xffffffff;
      puVar3[0x68] = 100;
      lVar4 = func_0x7ff70d808d1b();
      LOCK();
      *(char *)(lVar4 + 0x48000001) = (char)((uint)((int)lVar4 + -0x77) >> 8);
      UNLOCK();
      if ((int)lVar4 != 0) {
        return puVar3;
      }
    }
    FUN_7ff70c992f20(puVar1,auStack_48);
    lVar4 = FUN_7ff70c992f40(auStack_48);
    if (lVar4 != 0) {
      do {
        FUN_7ff70c992c80(*(undefined8 *)(lVar4 + 0x18));
        lVar4 = FUN_7ff70c992f40(auStack_48);
      } while (lVar4 != 0);
    }
    FUN_7ff70c992c80(puVar1);
    FUN_7ff70c992c80(puVar3 + 0x28);
    FUN_7ff70c958860(puVar3 + 0x44);
    (*_DAT_7ff70cbebad8)(puVar3);
  }
  return (undefined4 *)0x0;
}


