
void FUN_00123040(undefined8 param_1)

{
  uint unaff_w20;
  long lVar1;
  uint unaff_w23;
  long unaff_x27;
  int unaff_w28;
  undefined4 unaff_s8;
  float unaff_s9;
  char *in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined1 uStack0000000000000030;
  undefined4 uStack0000000000000040;
  
  func_0x001069f4(param_1,unaff_s9 + *(float *)(&UNK_00003d38 + unaff_x27) * 0.5);
  if ((unaff_w20 >> 0x14 & 1) != 0) {
    uStack0000000000000040 =
         uStack0000000000000040 -
         (*(float *)(&UNK_00003d38 + unaff_x27) + *(float *)(&UNK_00003924 + unaff_x27));
  }
  if (*in_stack_00000000 != '\0') {
    func_0x000dc80c("###","###");
  }
  if (unaff_w28 != 0) {
    func_0x00131f98();
  }
  if ((unaff_w20 >> 1 & 1) == 0) {
    func_0x000bc130(unaff_s8,in_stack_00000008);
    if (((unaff_w23 ^ 1) & 1) != 0 || (unaff_w20 & 8) != 0) {
      return;
    }
  }
  else {
    func_0x000bca40(&uStack0000000000000030,&uStack0000000000000040,in_stack_00000008);
    if (((unaff_w23 ^ 1) & 1) != 0 || (unaff_w20 & 8) != 0) {
      return;
    }
  }
  lVar1 = *(long *)(lRam0000000000a334c0 + 0x4000);
  func_0x000d8630(0);
  *(int *)(lVar1 + 0x198) = *(int *)(lVar1 + 0x198) + 1;
  func_0x000d5164();
  return;
}

