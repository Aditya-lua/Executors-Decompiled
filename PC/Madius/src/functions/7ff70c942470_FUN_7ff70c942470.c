/* 7ff70c942470 FUN_7ff70c942470 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c942470(longlong param_1,longlong param_2)

{
  longlong lVar1;
  undefined8 *puVar2;
  
  lVar1 = *(longlong *)(param_1 + 0x6a8);
  if (lVar1 != 0) {
    puVar2 = *(undefined8 **)(param_1 + 0xc70);
    do {
      if (puVar2[3] == param_2) {
        if (puVar2[3] != 0) {
          (**(code **)(_DAT_7ff70cbec7c0 + 0x90))();
          puVar2[3] = 0;
          *(undefined4 *)(puVar2 + 5) = 0;
          (*_DAT_7ff70cbebad8)(puVar2[7]);
          puVar2[7] = 0;
          (*_DAT_7ff70cbebad8)(puVar2[8]);
          puVar2[8] = 0;
          (*_DAT_7ff70cbebad8)(puVar2[9]);
          puVar2[9] = 0;
          (*_DAT_7ff70cbebad8)(puVar2[10]);
          puVar2[10] = 0;
          (*_DAT_7ff70cbebad8)(puVar2[0xb]);
          puVar2[0xb] = 0;
          (*_DAT_7ff70cbebad8)(puVar2[0xc]);
          puVar2[0xc] = 0;
          (*_DAT_7ff70cbebad8)(puVar2[0xd]);
          puVar2[0xd] = 0;
          (*_DAT_7ff70cbebad8)(puVar2[0xf]);
          puVar2[0xf] = 0;
          (*_DAT_7ff70cbebad8)(puVar2[0x10]);
          puVar2[0x10] = 0;
          (*_DAT_7ff70cbebad8)(puVar2[0x11]);
          puVar2[0x11] = 0;
          (*_DAT_7ff70cbebad8)(puVar2[0x12]);
          puVar2[0x12] = 0;
          (*_DAT_7ff70cbebad8)(puVar2[0xe]);
          puVar2[0xe] = 0;
          (*_DAT_7ff70cbebad8)(*puVar2);
          *puVar2 = 0;
          (*_DAT_7ff70cbebad8)(puVar2[1]);
          puVar2[1] = 0;
        }
        return;
      }
      puVar2 = puVar2 + 0x15;
      lVar1 = lVar1 + -1;
    } while (lVar1 != 0);
  }
  return;
}


