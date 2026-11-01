
void FUN_0023b51c(void)

{
  undefined8 uVar1;
  long *unaff_x20;
  undefined8 *unaff_x21;
  undefined8 uStack00000000000000a0;
  undefined1 auStack_7ffffffe [2147483646];
  
  uVar1 = func_0x0020a620();
  _memcpy(uVar1,auStack_7ffffffe + 0x800003fe,0x188);
  unaff_x21[1] = uVar1;
  unaff_x21[2] = &UNK_009c95a8;
  *unaff_x21 = 0x8000000000000027;
  if (uStack00000000000000a0 != -0x8000000000000000) {
    func_0x001bf1c4(&uStack00000000000000a0);
  }
  if (*unaff_x20 != 0) {
    func_0x00187bd4(unaff_x20[1],*unaff_x20 << 2,2);
  }
  return;
}

