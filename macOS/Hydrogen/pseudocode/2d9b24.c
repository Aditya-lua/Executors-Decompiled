
undefined8 FUN_002d9b24(long param_1)

{
  int in_w8;
  code *pcVar1;
  int unaff_w19;
  long unaff_x20;
  int *unaff_x21;
  
  if ((in_w8 != unaff_w19) && (unaff_x21 = *(int **)(param_1 + 0x38), *unaff_x21 != unaff_w19)) {
    unaff_x21 = *(int **)(param_1 + 0x40);
    if (*unaff_x21 != unaff_w19) {
      func_0x0028f83c(6,0,0x80,"/aws-lc/crypto/fipsmodule/evp/evp.c",0x1cb);
      func_0x0028fa74("algorithm %d");
      return 0;
    }
  }
  if (unaff_x20 != 0) {
    if ((*(long *)(unaff_x20 + 0x10) != 0) &&
       (pcVar1 = *(code **)(*(long *)(unaff_x20 + 0x10) + 0xa0), pcVar1 != (code *)0x0)) {
      (*pcVar1)();
      *(undefined8 *)(unaff_x20 + 8) = 0;
      unaff_w19 = *unaff_x21;
    }
    *(int **)(unaff_x20 + 0x10) = unaff_x21;
    *(int *)(unaff_x20 + 4) = unaff_w19;
  }
  return 1;
}

