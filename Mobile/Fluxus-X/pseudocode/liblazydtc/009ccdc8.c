/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ccdc8
 */

ulong ssl3_setup_buffers(undefined8 param_1)

{
  int iVar1;
  ulong uVar2;
  
  uVar2 = ssl3_setup_read_buffer();
  if ((int)uVar2 != 0) {
    iVar1 = ssl3_setup_write_buffer(param_1,1,0);
    uVar2 = (ulong)(iVar1 != 0);
  }
  return uVar2;
}

