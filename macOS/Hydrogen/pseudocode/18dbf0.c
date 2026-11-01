
long thunk_FUN_0018dbf8(void)

{
  code *pcVar1;
  long lVar2;
  long unaff_x20;
  
  lVar2 = _CFArrayCreate(*(undefined8 *)PTR__kCFAllocatorDefault_009b0238);
  if (lVar2 == 0) {
    func_0x007a11c0(&UNK_00819f20,0x22,&UNK_009c0728);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x18dc64);
    (*pcVar1)();
  }
  if (unaff_x20 != 0) {
    func_0x00187bd4();
  }
  return lVar2;
}

