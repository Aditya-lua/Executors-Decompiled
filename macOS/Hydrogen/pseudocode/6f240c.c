
undefined8 FUN_006f240c(long param_1)

{
  long in_x9;
  ulong in_x10;
  
  *(ulong *)(in_x9 + 0x4b0) =
       param_1 * (in_x10 & 0xffffffff | 0x5851f42d00000000) + 0x399d2694695129de;
  func_0x006e6f34();
  if (cRam0000000000a336d0 != '\0') {
    func_0x006e3af8();
    func_0x006e45a4();
    func_0x006e3af8();
    func_0x006e45a4();
    func_0x006e3af8();
    func_0x006e45a4();
  }
  func_0x006e3850(0x400921fb54442d18);
  func_0x006e45a4();
  func_0x006e3850(0x7ff0000000000000);
  func_0x006e45a4();
  return 1;
}

