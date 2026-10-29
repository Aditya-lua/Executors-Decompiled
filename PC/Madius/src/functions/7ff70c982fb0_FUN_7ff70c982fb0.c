/* 7ff70c982fb0 FUN_7ff70c982fb0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_7ff70c982fb0(void)

{
  char cVar1;
  code *pcVar2;
  undefined *puVar3;
  
  if (_DAT_7ff70cc1ae48 == 0) {
    cVar1 = FUN_7ff70c983220(4,0,0,2,2);
    puVar3 = &UNK_7ff70cb84e2d;
    if (cVar1 != '\0') {
      puVar3 = &UNK_7ff70cb84dd4;
    }
    _DAT_7ff70cc1ae48 = FUN_7ff70c944ad0(puVar3);
    if (_DAT_7ff70cc1ae48 == 0) {
      return 2;
    }
    pcVar2 = (code *)func_0x7ff70d86f20f(_DAT_7ff70cc1ae48,&UNK_7ff70cb8ac44);
    if (pcVar2 == (code *)0x0) {
      return 2;
    }
    _DAT_7ff70cc1ae50 = (*pcVar2)();
    if (_DAT_7ff70cc1ae50 == 0) {
      return 2;
    }
  }
  return 0;
}


