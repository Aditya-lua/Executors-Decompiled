
undefined8 FUN_006a494c(void)

{
  int iVar1;
  undefined8 uVar2;
  uint in_w8;
  long *unaff_x19;
  
  if (*(char *)((long)unaff_x19 + 0x21) != '\0') {
    uVar2 = __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm
                      (unaff_x19[3],"PublicExponent",0xe);
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE6appendEPKcm(uVar2,";",1);
    in_w8 = (uint)*(byte *)(unaff_x19 + 4);
  }
  if (in_w8 != 0) {
    return 1;
  }
  iVar1 = _strcmp("PublicExponent",unaff_x19[1]);
  if (iVar1 == 0) {
    func_0x0003eef0("PublicExponent",&UNK_009f5fc0,unaff_x19[2]);
    func_0x005ffccc(unaff_x19[3],*unaff_x19 + 0x48);
    *(undefined1 *)(unaff_x19 + 4) = 1;
    return 1;
  }
  return 0;
}

