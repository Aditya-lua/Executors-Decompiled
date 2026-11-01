
void FUN_0078baec(void)

{
  int iVar1;
  long lVar2;
  uint unaff_w20;
  uint uVar3;
  
  uVar3 = unaff_w20 & 0xffff | 0x51080000;
  func_0x00793a20(0xa409b8,0x50);
  uRam0000000000a2b728 = 0xa409b8;
  uRam0000000000a2b738 = _zlibVersion();
  pcRam0000000000a40a08 = "alt-svc";
  pcRam0000000000a40a10 = "AsynchDNS";
  pcRam0000000000a40a18 = "HSTS";
  iVar1 = func_0x00795250(0,0x10);
  if (iVar1 == 0) {
    lVar2 = 3;
  }
  else {
    pcRam0000000000a40a20 = "HTTPS-proxy";
    uVar3 = uVar3 + 0x200000;
    lVar2 = 4;
  }
  lVar2 = lVar2 * 8;
  *(char **)(lVar2 + 0xa40a08) = "IPv6";
  *(char **)(lVar2 + 0xa40a10) = "Largefile";
  *(char **)(lVar2 + 0xa40a18) = "libz";
  *(char **)(lVar2 + 0xa40a20) = "SSL";
  *(char **)(lVar2 + 0xa40a28) = "threadsafe";
  *(char **)(lVar2 + 0xa40a30) = "UnixSockets";
  *(undefined8 *)(lVar2 + 0xa40a38) = 0;
  uRam0000000000a2b720 = uVar3;
  return;
}

