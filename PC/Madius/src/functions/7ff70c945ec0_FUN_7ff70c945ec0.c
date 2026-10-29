/* 7ff70c945ec0 FUN_7ff70c945ec0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

int FUN_7ff70c945ec0(undefined8 *param_1)

{
  int iVar1;
  undefined4 *puVar2;
  
  puVar2 = (undefined4 *)(*_DAT_7ff70cbebaf0)(1,0x13c8);
  if (puVar2 == (undefined4 *)0x0) {
    return 0x1b;
  }
  *puVar2 = 0xc0dedbad;
  iVar1 = FUN_7ff70c944ca0(puVar2,puVar2 + 0x368);
  if (iVar1 != 0) {
    (*_DAT_7ff70cbebad8)(puVar2);
    return iVar1;
  }
  FUN_7ff70c945cf0(puVar2);
  FUN_7ff70c94fcf0(puVar2 + 0x308,0x19000);
  FUN_7ff70c94f3e0(puVar2);
  *(undefined8 *)(puVar2 + 2) = 0xffffffffffffffff;
  puVar2[0x304] = 0xffffffff;
  puVar2[0x305] = 0xffffffff;
  puVar2[0x306] = 0xffffffff;
  puVar2[0x307] = 0xffffffff;
  *(byte *)(puVar2 + 0x2a9) = *(byte *)(puVar2 + 0x2a9) | 0x10;
  *(undefined8 *)(puVar2 + 0x314) = 0xffffffffffffffff;
  *param_1 = puVar2;
  return 0;
}


