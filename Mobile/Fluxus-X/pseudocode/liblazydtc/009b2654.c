/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b2654
 */

int SSL_has_matching_session_id(SSL *ssl,uchar *id,uint id_len)

{
  uint uVar1;
  int iVar2;
  long lVar3;
  int local_3c0 [148];
  ulong local_170;
  undefined1 auStack_168 [328];
  
  uVar1 = 0;
  if (id_len < 0x21) {
    local_3c0[0] = ssl->version;
    local_170 = (ulong)id_len;
    memcpy(auStack_168,id,local_170);
    iVar2 = CRYPTO_THREAD_read_lock(*(undefined8 *)(*(long *)&ssl[4].mac_flags + 0x3c8));
    uVar1 = 0;
    if (iVar2 != 0) {
      lVar3 = OPENSSL_LH_retrieve(*(undefined8 *)(*(long *)&ssl[4].mac_flags + 0x30),local_3c0);
      CRYPTO_THREAD_unlock(*(undefined8 *)(*(long *)&ssl[4].mac_flags + 0x3c8));
      uVar1 = (uint)(lVar3 != 0);
    }
  }
  return uVar1;
}

