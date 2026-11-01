
void FUN_001fbfc8(void)

{
  long *extraout_x8;
  undefined1 auVar1 [16];
  long lStack_430;
  long lStack_428;
  long lStack_420;
  long lStack_418;
  long lStack_410;
  long lStack_408;
  long lStack_400;
  long lStack_3f8;
  long lStack_3f0;
  long lStack_3e8;
  long lStack_3e0;
  long lStack_3d8;
  long lStack_3d0;
  long lStack_3c8;
  long lStack_3c0;
  undefined1 auStack_3b8 [904];
  
  auVar1 = func_0x007a247c(&UNK_00826a86,0x28,&UNK_009c5bd8);
  lStack_430 = 0;
  lStack_428 = 8;
  lStack_420 = 0;
  func_0x00253264(&lStack_3f8,auVar1._0_8_,auVar1._8_8_,&lStack_430,0);
  lStack_428 = lStack_3e8;
  lStack_430 = lStack_3f0;
  lStack_418 = lStack_3d8;
  lStack_420 = lStack_3e0;
  lStack_408 = lStack_3c8;
  lStack_410 = lStack_3d0;
  lStack_400 = lStack_3c0;
  if (lStack_3f8 == 2) {
    extraout_x8[2] = lStack_3e8;
    extraout_x8[1] = lStack_3f0;
    extraout_x8[4] = lStack_3d8;
    extraout_x8[3] = lStack_3e0;
    extraout_x8[6] = lStack_3c8;
    extraout_x8[5] = lStack_3d0;
    extraout_x8[7] = lStack_3c0;
  }
  else {
    _memcpy(extraout_x8 + 8,auStack_3b8,0x388);
    extraout_x8[2] = lStack_428;
    extraout_x8[1] = lStack_430;
    extraout_x8[4] = lStack_418;
    extraout_x8[3] = lStack_420;
    extraout_x8[6] = lStack_408;
    extraout_x8[5] = lStack_410;
    extraout_x8[7] = lStack_400;
    *(undefined2 *)(extraout_x8 + 0x79) = 0;
  }
  *extraout_x8 = lStack_3f8;
  return;
}

