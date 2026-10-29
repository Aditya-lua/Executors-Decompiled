/* 7ff70c96bca0 FUN_7ff70c96bca0 */

void FUN_7ff70c96bca0(longlong *param_1,longlong param_2)

{
  longlong lVar1;
  undefined *puStack_48;
  undefined4 uStack_40;
  
  if (param_2 != 0) {
    lVar1 = param_1[2];
    do {
      puStack_48 = &UNK_7ff70cb83e3d;
      uStack_40 = 0x221;
      FUN_7ff70c962038(lVar1 != *param_1,1,&UNK_7ff70cb8f570,&UNK_7ff70cb8e428,&puStack_48,
                       &UNK_7ff70cb8561f);
      lVar1 = param_1[2] + -1;
      param_1[2] = lVar1;
      param_2 = param_2 + -1;
    } while (param_2 != 0);
  }
  return;
}


