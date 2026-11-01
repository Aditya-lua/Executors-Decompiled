
undefined8 FUN_00050f30(long param_1)

{
  if (*(long *)(param_1 + 0x20) == 0) {
    func_0x006e644c();
    ___cxa_begin_catch();
    ___cxa_end_catch();
  }
  else {
    if ((*(byte *)(param_1 + 0x38) & 1) != 0) {
      *(byte *)(param_1 + 0x38) = 0;
    }
    if (*(long *)(param_1 + 0x30) == 0) goto LAB_00050fc4;
    func_0x006e1e34();
    (*pcRam0000000000a27968)();
    func_0x006e3d18();
    func_0x006e3d18();
    func_0x006e2154();
    func_0x006e4c80();
  }
  func_0x006e1d54();
LAB_00050fc4:
  func_0x006e383c();
  return 1;
}

