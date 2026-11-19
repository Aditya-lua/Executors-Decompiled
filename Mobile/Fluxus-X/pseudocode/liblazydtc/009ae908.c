/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ae908
 */

undefined8 ssl_prf_md(long param_1)

{
  uint uVar1;
  undefined8 uVar2;
  long lVar3;
  
  lVar3 = *(long *)(param_1 + 0x9a8);
  uVar1 = ssl_get_algorithm2();
  uVar1 = uVar1 >> 8 & 0xff;
  uVar2 = 0;
  if (uVar1 < 0xe) {
    uVar2 = *(undefined8 *)(lVar3 + (ulong)uVar1 * 8 + 0x540);
  }
  return uVar2;
}

