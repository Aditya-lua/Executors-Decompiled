/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9ae4c
 */

undefined8 CRYPTO_secure_used(void)

{
  int iVar1;
  undefined8 uVar2;
  
  iVar1 = CRYPTO_THREAD_read_lock(DAT_00d220f8);
  uVar2 = DAT_00d22100;
  if (iVar1 == 0) {
    uVar2 = 0;
  }
  else {
    CRYPTO_THREAD_unlock(DAT_00d220f8);
  }
  return uVar2;
}

