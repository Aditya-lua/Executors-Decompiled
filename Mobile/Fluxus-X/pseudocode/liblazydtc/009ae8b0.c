/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ae8b0
 */

undefined8 ssl_md(long param_1,uint param_2)

{
  undefined8 uVar1;
  
  uVar1 = 0;
  if ((param_2 & 0xff) < 0xe) {
    uVar1 = *(undefined8 *)(param_1 + (ulong)(param_2 & 0xff) * 8 + 0x540);
  }
  return uVar1;
}

