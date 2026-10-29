/* 7ff70c8f54d0 FUN_7ff70c8f54d0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_7ff70c8f54d0(void)

{
  char cVar1;
  longlong lVar2;
  
  FUN_7ff70c9429b0(0x7ff70cc1a820,0x50);
  _DAT_7ff70cbebb70 = 0x7ff70cc1a820;
  _DAT_7ff70cbebb80 = FUN_7ff70c95af30();
  _DAT_7ff70cc1a870 = &UNK_7ff70cb8917e;
  _DAT_7ff70cc1a878 = &UNK_7ff70cb89ae6;
  _DAT_7ff70cc1a880 = &UNK_7ff70cb89a74;
  cVar1 = FUN_7ff70c943d00(0,0x10);
  if (cVar1 == '\0') {
    _DAT_7ff70cbebb68 = 0x510c0b9d;
    lVar2 = 3;
  }
  else {
    _DAT_7ff70cc1a888 = &UNK_7ff70cb7fbce;
    _DAT_7ff70cbebb68 = 0x512c0b9d;
    lVar2 = 4;
  }
  *(undefined **)(&DAT_7ff70cc1a870 + lVar2 * 8) = &UNK_7ff70cb8b3d7;
  *(undefined **)(&DAT_7ff70cc1a878 + lVar2 * 8) = &UNK_7ff70cb81b66;
  *(undefined **)(&DAT_7ff70cc1a880 + lVar2 * 8) = &UNK_7ff70cb86e68;
  *(undefined **)(&DAT_7ff70cc1a888 + lVar2 * 8) = &UNK_7ff70cb7fba2;
  *(undefined **)(lVar2 * 8 + 0x7ff70cc1a890) = &UNK_7ff70cb89fb0;
  *(undefined **)(lVar2 * 8 + 0x7ff70cc1a898) = &UNK_7ff70cb89cdf;
  *(undefined **)(lVar2 * 8 + 0x7ff70cc1a8a0) = &UNK_7ff70cb89fd6;
  *(undefined **)(lVar2 * 8 + 0x7ff70cc1a8a8) = &UNK_7ff70cb8a206;
  *(undefined **)(lVar2 * 8 + 0x7ff70cc1a8b0) = &UNK_7ff70cb873a0;
  *(undefined **)(lVar2 * 8 + 0x7ff70cc1a8b8) = &UNK_7ff70cb8194a;
  *(undefined8 *)(lVar2 * 8 + 0x7ff70cc1a8c0) = 0;
  return 0x7ff70cbebb48;
}


