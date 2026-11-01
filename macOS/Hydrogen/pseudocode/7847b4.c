
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_007847b4(long param_1)

{
  ulong *puVar1;
  undefined8 uVar2;
  undefined *puVar3;
  int iVar4;
  undefined8 uVar5;
  
  puVar3 = PTR____stderrp_009b01f0;
  uVar5 = *(undefined8 *)PTR____stdinp_009b01f8;
  *(undefined8 *)(param_1 + 0x1e0) = *(undefined8 *)PTR____stdoutp_009b0200;
  *(undefined8 *)(param_1 + 0x1e8) = uVar5;
  *(undefined8 *)(param_1 + 0x1c8) = *(undefined8 *)puVar3;
  *(undefined **)(param_1 + 0x228) = PTR__fwrite_009b0228;
  *(undefined **)(param_1 + 0x240) = PTR__fread_009b0218;
  puVar1 = (ulong *)(param_1 + 0xa1a);
  *(undefined8 *)(param_1 + 0x2a8) = 0;
  *(undefined8 *)(param_1 + 0x2f8) = 0xffffffffffffffff;
  *(undefined8 *)(param_1 + 0x220) = 0xffffffffffffffff;
  *(undefined1 *)(param_1 + 0xa17) = 0;
  *(undefined4 *)(param_1 + 0x968) = 1;
  *(undefined1 *)(param_1 + 0x6bc) = 1;
  *(undefined8 *)(param_1 + 0x68c) = 0x3c00015180;
  *(undefined8 *)(param_1 + 0x1f8) = 1;
  *(undefined2 *)(param_1 + 0x688) = 0;
  *(undefined1 *)(param_1 + 0x68a) = 0;
  uVar5 = _UNK_008ce6b0;
  *(undefined8 *)(param_1 + 0x208) = _UNK_008ce6b8;
  *(undefined8 *)(param_1 + 0x200) = uVar5;
  *(undefined1 *)(param_1 + 0x68b) = 5;
  *puVar1 = *puVar1 & 0xffffffffffd0ffef | 0x2b0000;
  func_0x0075f708(param_1 + 0x338);
  func_0x00792fdc(param_1);
  *puVar1 = *puVar1 | 0x30000000000000;
  *(undefined4 *)(param_1 + 0x6d8) = 0x1a4;
  *(undefined8 *)(param_1 + 0x954) = 0xfffffffff;
  iVar4 = func_0x00793790();
  if (((iVar4 == 8) || (iVar4 = func_0x00793790(), iVar4 == 9)) ||
     ((uVar5 = func_0x00775ed0(param_1 + 0x710,"/etc/ssl/cert.pem"), (int)uVar5 == 0 &&
      (uVar5 = func_0x00775ed0(param_1 + 0x778,"/etc/ssl/cert.pem"), (int)uVar5 == 0)))) {
    uVar5 = 0;
    *(undefined8 *)(param_1 + 0x694) = 0x1000000004000;
    *(undefined8 *)(param_1 + 0x970) = 0;
    *(undefined8 *)(param_1 + 0x980) = 0;
    *(undefined8 *)(param_1 + 0x978) = 0;
    *(undefined4 *)(param_1 + 0x9ac) = 0x3c;
    *(undefined8 *)(param_1 + 0x9b0) = _UNK_008ce6e0;
    *(undefined8 *)(param_1 + 0x9b8) = 1000;
    *(undefined4 *)(param_1 + 0x9a0) = 200;
    *(undefined **)(param_1 + 0x9d0) = &UNK_0000ea60;
    *(undefined4 *)(param_1 + 0xa08) = 5;
    uVar2 = _UNK_008ce6c0;
    *(undefined8 *)(param_1 + 0x2e8) = _UNK_008ce6c8;
    *(undefined8 *)(param_1 + 0x2e0) = uVar2;
    *(undefined1 *)(param_1 + 0xa18) = 2;
    *puVar1 = *puVar1 & 0xff7ff1f7ffeffdbf | 0x80800000040;
  }
  return uVar5;
}

