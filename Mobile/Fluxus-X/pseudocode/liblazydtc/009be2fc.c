/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009be2fc
 */

undefined8 FUN_009be2fc(long param_1,long param_2,int param_3)

{
  undefined8 *puVar1;
  uchar *puVar2;
  undefined8 *puVar3;
  bool bVar4;
  undefined8 uVar5;
  long lVar6;
  SSL_SESSION *ses;
  undefined8 *puVar7;
  undefined8 *puVar8;
  
  if ((param_2 != 0) && (*(long *)(param_2 + 0x250) != 0)) {
    if ((param_3 != 0) &&
       (uVar5 = CRYPTO_THREAD_write_lock(*(undefined8 *)(param_1 + 0x3c8)), (int)uVar5 == 0)) {
      return uVar5;
    }
    lVar6 = OPENSSL_LH_retrieve(*(undefined8 *)(param_1 + 0x30),param_2);
    if (lVar6 == 0) {
      ses = (SSL_SESSION *)0x0;
      bVar4 = false;
    }
    else {
      ses = (SSL_SESSION *)OPENSSL_LH_delete(*(undefined8 *)(param_1 + 0x30),lVar6);
      puVar7 = *(undefined8 **)(ses[1].krb5_client_princ + 0x40);
      if ((puVar7 != (undefined8 *)0x0) &&
         (puVar8 = *(undefined8 **)(ses[1].krb5_client_princ + 0x38), puVar8 != (undefined8 *)0x0))
      {
        puVar1 = (undefined8 *)(param_1 + 0x48);
        puVar2 = ses[1].krb5_client_princ + 0x38;
        puVar3 = (undefined8 *)(param_1 + 0x40);
        if (puVar7 == puVar1) {
          if (puVar8 == puVar3) {
            *puVar3 = 0;
            *(undefined8 *)(param_1 + 0x48) = 0;
          }
          else {
            *puVar1 = puVar8;
            puVar8[0x65] = puVar1;
          }
        }
        else if (puVar8 == puVar3) {
          *puVar3 = puVar7;
          puVar7[100] = puVar3;
        }
        else {
          puVar7[100] = puVar8;
          *(undefined8 **)(*(long *)puVar2 + 0x328) = puVar7;
        }
        ses[1].krb5_client_princ[0xa8] = '\0';
        ses[1].krb5_client_princ[0xa9] = '\0';
        ses[1].krb5_client_princ[0xaa] = '\0';
        ses[1].krb5_client_princ[0xab] = '\0';
        ses[1].krb5_client_princ[0xac] = '\0';
        ses[1].krb5_client_princ[0xad] = '\0';
        ses[1].krb5_client_princ[0xae] = '\0';
        ses[1].krb5_client_princ[0xaf] = '\0';
        puVar2[0] = '\0';
        puVar2[1] = '\0';
        puVar2[2] = '\0';
        puVar2[3] = '\0';
        puVar2[4] = '\0';
        puVar2[5] = '\0';
        puVar2[6] = '\0';
        puVar2[7] = '\0';
        ses[1].krb5_client_princ[0x40] = '\0';
        ses[1].krb5_client_princ[0x41] = '\0';
        ses[1].krb5_client_princ[0x42] = '\0';
        ses[1].krb5_client_princ[0x43] = '\0';
        ses[1].krb5_client_princ[0x44] = '\0';
        ses[1].krb5_client_princ[0x45] = '\0';
        ses[1].krb5_client_princ[0x46] = '\0';
        ses[1].krb5_client_princ[0x47] = '\0';
      }
      bVar4 = true;
    }
    *(undefined4 *)(param_2 + 0x2b0) = 1;
    if (param_3 != 0) {
      CRYPTO_THREAD_unlock(*(undefined8 *)(param_1 + 0x3c8));
    }
    if (*(code **)(param_1 + 0x68) != (code *)0x0) {
      (**(code **)(param_1 + 0x68))(param_1,param_2);
    }
    if (bVar4) {
      SSL_SESSION_free(ses);
      return 1;
    }
  }
  return 0;
}

