/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b2672c
 */

ulong ossl_siv128_decrypt(long param_1,uchar *param_2,uchar *param_3,size_t param_4)

{
  int iVar1;
  EVP_CIPHER_CTX *ctx;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 local_60;
  ulong uStack_58;
  long local_50;
  long lStack_48;
  
  if (*(int *)(param_1 + 0x3c) != 0) {
    local_60 = *(undefined8 *)(param_1 + 0x10);
    *(int *)(param_1 + 0x3c) = *(int *)(param_1 + 0x3c) + -1;
    uStack_58 = *(ulong *)(param_1 + 0x18) & 0xffffff7fffffff7f;
    ctx = *(EVP_CIPHER_CTX **)(param_1 + 0x20);
    local_50 = CONCAT44(local_50._4_4_,(int)param_4);
    iVar1 = EVP_CipherInit_ex(ctx,(EVP_CIPHER *)0x0,(ENGINE *)0x0,(uchar *)0x0,(uchar *)&local_60,1)
    ;
    if (((iVar1 != 0) &&
        (iVar1 = EVP_EncryptUpdate(ctx,param_3,(int *)&local_50,param_2,(int)param_4), iVar1 != 0))
       && (iVar1 = FUN_00b2650c(param_1,&local_50,param_3,param_4), iVar1 != 0)) {
      uVar3 = *(undefined8 *)(param_1 + 0x18);
      uVar2 = *(undefined8 *)(param_1 + 0x10);
      local_50 = CONCAT17((byte)((ulong)local_50 >> 0x38) ^ (byte)((ulong)uVar2 >> 0x38),
                          CONCAT16((byte)((ulong)local_50 >> 0x30) ^ (byte)((ulong)uVar2 >> 0x30),
                                   CONCAT15((byte)((ulong)local_50 >> 0x28) ^
                                            (byte)((ulong)uVar2 >> 0x28),
                                            CONCAT14((byte)((ulong)local_50 >> 0x20) ^
                                                     (byte)((ulong)uVar2 >> 0x20),
                                                     CONCAT13((byte)((ulong)local_50 >> 0x18) ^
                                                              (byte)((ulong)uVar2 >> 0x18),
                                                              CONCAT12((byte)((ulong)local_50 >>
                                                                             0x10) ^
                                                                       (byte)((ulong)uVar2 >> 0x10),
                                                                       CONCAT11((byte)((ulong)
                                                  local_50 >> 8) ^ (byte)((ulong)uVar2 >> 8),
                                                  (byte)local_50 ^ (byte)uVar2)))))));
      lStack_48 = CONCAT17((byte)((ulong)lStack_48 >> 0x38) ^ (byte)((ulong)uVar3 >> 0x38),
                           CONCAT16((byte)((ulong)lStack_48 >> 0x30) ^ (byte)((ulong)uVar3 >> 0x30),
                                    CONCAT15((byte)((ulong)lStack_48 >> 0x28) ^
                                             (byte)((ulong)uVar3 >> 0x28),
                                             CONCAT14((byte)((ulong)lStack_48 >> 0x20) ^
                                                      (byte)((ulong)uVar3 >> 0x20),
                                                      CONCAT13((byte)((ulong)lStack_48 >> 0x18) ^
                                                               (byte)((ulong)uVar3 >> 0x18),
                                                               CONCAT12((byte)((ulong)lStack_48 >>
                                                                              0x10) ^
                                                                        (byte)((ulong)uVar3 >> 0x10)
                                                                        ,CONCAT11((byte)((ulong)
                                                  lStack_48 >> 8) ^ (byte)((ulong)uVar3 >> 8),
                                                  (byte)lStack_48 ^ (byte)uVar3)))))));
      if (lStack_48 == 0 && local_50 == 0) {
        *(undefined4 *)(param_1 + 0x38) = 0;
        goto LAB_00b26810;
      }
      OPENSSL_cleanse(param_3,param_4);
    }
  }
  param_4 = 0;
LAB_00b26810:
  return param_4 & 0xffffffff;
}

