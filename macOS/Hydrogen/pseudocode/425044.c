
void FUN_00425044(void)

{
  long lVar1;
  ulong unaff_x19;
  long *unaff_x20;
  long lVar2;
  undefined8 in_stack_00000008;
  
  lVar1 = unaff_x20[1];
  lVar2 = unaff_x20[2];
  *(undefined1 *)(lVar1 + lVar2) = 0x2f;
  lVar2 = lVar2 + 1;
  unaff_x20[2] = lVar2;
  if ((ulong)(*unaff_x20 - lVar2) < unaff_x19) {
    func_0x007a0000();
    lVar1 = unaff_x20[1];
    lVar2 = unaff_x20[2];
  }
  _memcpy(lVar1 + lVar2,in_stack_00000008);
  unaff_x20[2] = lVar2 + unaff_x19;
  return;
}

