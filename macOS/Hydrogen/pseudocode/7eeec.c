
/* WARNING: Removing unreachable block (ram,0x0007ee40) */
/* WARNING: Removing unreachable block (ram,0x0007ee4c) */
/* WARNING: Removing unreachable block (ram,0x0007ee50) */
/* WARNING: Removing unreachable block (ram,0x0007ee70) */
/* WARNING: Removing unreachable block (ram,0x0007ee7c) */
/* WARNING: Removing unreachable block (ram,0x0007ee88) */
/* WARNING: Removing unreachable block (ram,0x0007ee8c) */
/* WARNING: Removing unreachable block (ram,0x0007eed0) */

undefined8 FUN_0007eeec(void)

{
  int iVar1;
  undefined4 *puVar2;
  long *plVar3;
  long lVar4;
  long unaff_x19;
  undefined8 *unaff_x20;
  undefined8 uVar5;
  undefined8 uStack0000000000000028;
  
  __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc();
  iVar1 = func_0x0007ef6c();
  if (9 < iVar1 - 0x30U) {
    *(char **)(unaff_x19 + 0x68) = "invalid number; expected digit after exponent sign";
    return 0xe;
  }
  __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc();
  iVar1 = func_0x0007ef6c();
  while (iVar1 - 0x30U < 10) {
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc();
    iVar1 = func_0x0007ef6c();
  }
  plVar3 = (long *)(unaff_x19 + 0x28);
  lVar4 = *plVar3;
  *(undefined1 *)(unaff_x19 + 0x18) = 1;
  *(long *)(unaff_x19 + 0x20) = *(long *)(unaff_x19 + 0x20) + -1;
  if (lVar4 == 0) {
    plVar3 = (long *)(unaff_x19 + 0x30);
    lVar4 = *plVar3;
    if (lVar4 == 0) goto code_r0x0007ee0c;
  }
  *plVar3 = lVar4 + -1;
code_r0x0007ee0c:
  if (*(int *)(unaff_x19 + 0x14) != -1) {
    *(long *)(unaff_x19 + 0x40) = *(long *)(unaff_x19 + 0x40) + -1;
  }
  uStack0000000000000028 = 0;
  puVar2 = (undefined4 *)___error();
  *puVar2 = 0;
  if (*(char *)(unaff_x19 + 0x67) < '\0') {
    unaff_x20 = (undefined8 *)*unaff_x20;
  }
  uVar5 = _strtod(unaff_x20,&uStack0000000000000028);
  *(undefined8 *)(unaff_x19 + 0x80) = uVar5;
  return 7;
}

