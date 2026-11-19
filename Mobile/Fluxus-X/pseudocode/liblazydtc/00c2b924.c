/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c2b924
 */

void _INIT_0(void)

{
  uint uVar1;
  int iVar2;
  char acStack_6c [92];
  
  uVar1 = getauxval(0x10);
  if ((uVar1 >> 8 & 1) == 0) {
    DAT_00d280e0 = 0;
    return;
  }
  iVar2 = __system_property_get("ro.arch",acStack_6c);
  if (iVar2 < 1) {
    DAT_00d280e0 = 1;
    return;
  }
  iVar2 = strncmp(acStack_6c,"exynos9810",10);
  DAT_00d280e0 = iVar2 != 0;
  return;
}

