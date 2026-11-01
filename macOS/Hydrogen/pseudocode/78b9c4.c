
undefined8 FUN_0078b9c4(long param_1)

{
  int iVar1;
  long lVar2;
  long lVar3;
  undefined1 *puVar4;
  undefined4 uVar5;
  long unaff_x29;
  undefined1 uStack0000000000000012;
  undefined1 uStack0000000000000030;
  
  *(undefined8 *)(unaff_x29 + -0x38) = **(undefined8 **)(param_1 + 0x1e8);
  func_0x00793a20(&uStack0000000000000030,200);
  _zlibVersion();
  func_0x00764560(&uStack0000000000000012,0x1e,"zlib/%s");
  uRam0000000000a40888._0_1_ = s_libcurl_8_12_1_008f6173[0];
  uRam0000000000a40888._1_1_ = s_libcurl_8_12_1_008f6173[1];
  uRam0000000000a40888._2_1_ = s_libcurl_8_12_1_008f6173[2];
  uRam0000000000a40888._3_1_ = s_libcurl_8_12_1_008f6173[3];
  uRam0000000000a40888._4_1_ = s_libcurl_8_12_1_008f6173[4];
  uRam0000000000a40888._5_1_ = s_libcurl_8_12_1_008f6173[5];
  uRam0000000000a4088e._0_1_ = s_libcurl_8_12_1_008f6173[6];
  uRam0000000000a4088e._1_1_ = s_libcurl_8_12_1_008f6173[7];
  uRam0000000000a40890._0_1_ = s_libcurl_8_12_1_008f6173[8];
  uRam0000000000a40890._1_1_ = s_libcurl_8_12_1_008f6173[9];
  uRam0000000000a40890._2_1_ = s_libcurl_8_12_1_008f6173[10];
  uRam0000000000a40890._3_1_ = s_libcurl_8_12_1_008f6173[0xb];
  uRam0000000000a40890._4_1_ = s_libcurl_8_12_1_008f6173[0xc];
  uRam0000000000a40890._5_1_ = s_libcurl_8_12_1_008f6173[0xd];
  lVar2 = _strlen(&uStack0000000000000030);
  if (lVar2 + 2U < 0x11e) {
    uRam0000000000a40896 = 0x20;
    ___memcpy_chk(0xa40897,&uStack0000000000000030,lVar2,0x11d);
    puVar4 = (undefined1 *)(lVar2 + 0xa40897);
    lVar3 = _strlen(&uStack0000000000000012);
    if (lVar3 + 2U < 0x11dU - lVar2) {
      *puVar4 = 0x20;
      _memcpy(lVar2 + 0xa40898,&uStack0000000000000012,lVar3);
      puVar4 = (undefined1 *)(lVar2 + 0xa40898 + lVar3);
    }
  }
  else {
    puVar4 = (undefined1 *)0xa40896;
  }
  *puVar4 = 0;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
    return 0xa40888;
  }
  ___stack_chk_fail();
  uVar5 = 0x5108028d;
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
    uVar5 = 0x5128028d;
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
  uRam0000000000a2b720 = uVar5;
  return 0xa2b700;
}

