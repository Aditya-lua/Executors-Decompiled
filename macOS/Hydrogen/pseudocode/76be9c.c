
undefined8 FUN_0076be9c(long param_1,ulong param_2,undefined8 *param_3)

{
  long lVar1;
  long lVar2;
  
  *param_3 = 0;
  lVar2 = *(long *)(param_1 + 0xd0);
  if (lVar2 == 0) {
    func_0x0073c9e4(param_1,"transfer has no multi handle");
    return 2;
  }
  if ((*(byte *)(lVar2 + 0x271) >> 6 & 1) != 0) {
    func_0x0073c9e4(param_1,"attempt to borrow xfer_sockbuf when already borrowed");
    return 0x51;
  }
  if (*(long *)(lVar2 + 0x118) != 0) {
    if (param_2 <= *(ulong *)(lVar2 + 0x120)) goto code_r0x0076bf20;
    (*pcRam0000000000a2b5f0)();
    lVar2 = *(long *)(param_1 + 0xd0);
    *(undefined8 *)(lVar2 + 0x118) = 0;
    *(undefined8 *)(lVar2 + 0x120) = 0;
  }
  lVar1 = (*pcRam0000000000a2b5e8)(param_2);
  lVar2 = *(long *)(param_1 + 0xd0);
  *(long *)(lVar2 + 0x118) = lVar1;
  if (lVar1 == 0) {
    func_0x0073c9e4(param_1,"could not allocate xfer_sockbuf of %zu bytes");
    return 0x1b;
  }
  *(ulong *)(lVar2 + 0x120) = param_2;
code_r0x0076bf20:
  *(byte *)(lVar2 + 0x271) = *(byte *)(lVar2 + 0x271) | 0x40;
  *param_3 = *(undefined8 *)(*(long *)(param_1 + 0xd0) + 0x118);
  return 0;
}

