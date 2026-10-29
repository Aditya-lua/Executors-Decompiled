/* 7ff70c95f8e0 FUN_7ff70c95f8e0 */

int FUN_7ff70c95f8e0(undefined8 param_1,undefined1 *param_2,longlong param_3)

{
  int iVar1;
  uint uStack_3c;
  
  param_3 = param_3 + -1;
  if (param_3 != 0) {
    do {
      do {
        iVar1 = FUN_7ff70c942be0(param_1,&uStack_3c,4);
        if (iVar1 != 0) {
          if (iVar1 != 4) {
            return iVar1;
          }
          uStack_3c = 0;
          iVar1 = FUN_7ff70cb129d0(0,&uStack_3c,4,2);
          if (iVar1 != 0) {
            return 2;
          }
        }
      } while (0xfffffffb < uStack_3c);
      *param_2 = (&UNK_7ff70cb50f50)
                 [((uStack_3c >> 1) / 0x1f) * -0x3f + (uStack_3c >> 1) / 0x1f + uStack_3c];
      param_2 = param_2 + 1;
      param_3 = param_3 + -1;
    } while (param_3 != 0);
  }
  *param_2 = 0;
  return 0;
}


