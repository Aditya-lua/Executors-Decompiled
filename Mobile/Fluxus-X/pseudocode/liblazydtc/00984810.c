/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00984810
 */

/* ix::Socket::isReadyToRead(int) */

undefined8 __thiscall ix::Socket::isReadyToRead(Socket *this,int param_1)

{
  undefined8 uVar1;
  
  if (*(int *)(this + 8) == -1) {
    return 3;
  }
  uVar1 = poll(true,param_1,*(int *)(this + 8),this + 0x38);
  return uVar1;
}

