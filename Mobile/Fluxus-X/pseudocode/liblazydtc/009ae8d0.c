/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ae8d0
 */

undefined8 ssl_handshake_md(long param_1)

{
  uint uVar1;
  undefined8 uVar2;
  long lVar3;
  
  lVar3 = *(long *)(param_1 + 0x9a8);
  uVar1 = ssl_get_algorithm2();
  uVar2 = 0;
  if ((uVar1 & 0xff) < 0xe) {
    uVar2 = *(undefined8 *)(lVar3 + (ulong)(uVar1 & 0xff) * 8 + 0x540);
  }
  return uVar2;
}

