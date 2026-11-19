/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ee438
 */

undefined8 FUN_009ee438(ulong param_1,ulong *param_2)

{
  int iVar1;
  undefined8 uVar2;
  uint uVar3;
  ulong uVar4;
  ulong uVar5;
  
  uVar4 = *param_2;
  uVar3 = (uint)param_1;
  if (0x7ffffffe < param_1) {
    uVar3 = 0x7fffffff;
  }
  if ((uVar4 & 1) != 0) {
    iVar1 = ossl_isdigit(uVar3);
    if (iVar1 == 0 && uVar3 != 0x20) {
      uVar4 = uVar4 & 0xfffffffffffffffe;
    }
  }
  uVar5 = uVar4;
  if (((uint)uVar4 >> 1 & 1) != 0) {
    iVar1 = ossl_ctype_check(uVar3,0x800);
    uVar5 = uVar4 & 0xfffffffffffffffd;
    if (iVar1 != 0) {
      uVar5 = uVar4;
    }
  }
  if ((uVar5 & 0x10) != 0 && (uVar3 & 0x7fffff80) != 0) {
    uVar5 = uVar5 & 0xffffffffffffffef;
  }
  uVar4 = uVar5 & 0xfffffffffffffffb;
  if (((uint)(0xff < param_1) & (uint)(uVar5 >> 2) & 1) == 0) {
    uVar4 = uVar5;
  }
  uVar5 = uVar4 & 0xfffffffffffff7ff;
  if (((uint)(param_1 >> 0x10 != 0) & (uint)(uVar4 >> 0xb) & 1) == 0) {
    uVar5 = uVar4;
  }
  uVar4 = uVar5;
  if ((((uint)uVar5 >> 0xd & 1) != 0) &&
     (uVar4 = uVar5 & 0xffffffffffffdfff, param_1 >> 0xb != 0x1b && param_1 >> 0x10 < 0x11)) {
    uVar4 = uVar5;
  }
  if (uVar4 == 0) {
    uVar2 = 0xffffffff;
  }
  else {
    uVar2 = 1;
    *param_2 = uVar4;
  }
  return uVar2;
}

