/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae7354
 */

void SRP_user_pwd_new(void)

{
  undefined8 *puVar1;
  
  puVar1 = CRYPTO_malloc(0x30,"crypto/srp/srp_vfy.c",0xc2);
  if (puVar1 != (undefined8 *)0x0) {
    puVar1[3] = 0;
    puVar1[2] = 0;
    puVar1[5] = 0;
    puVar1[4] = 0;
    puVar1[1] = 0;
    *puVar1 = 0;
  }
  return;
}

