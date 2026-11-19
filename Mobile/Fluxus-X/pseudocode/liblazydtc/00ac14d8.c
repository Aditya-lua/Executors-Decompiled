/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac14d8
 */

void BIO_set_cipher(BIO *b,EVP_CIPHER *c,uchar *k,uchar *i,int enc)

{
  int iVar1;
  long lVar2;
  code *pcVar3;
  long lVar4;
  uchar *puVar5;
  uchar *puVar6;
  ulong uVar7;
  long in_x5;
  code *pcVar8;
  undefined1 auVar9 [12];
  
  uVar7 = (ulong)(uint)enc;
  puVar5 = k;
  puVar6 = i;
  lVar2 = BIO_get_data();
  iVar1 = (int)puVar6;
  if (lVar2 == 0) {
    return;
  }
  auVar9 = BIO_get_callback_ex(b);
  pcVar3 = auVar9._0_8_;
  if (pcVar3 == (code *)0x0) {
    pcVar8 = (code *)BIO_get_callback(b,auVar9._8_4_,(char *)puVar5,iVar1,uVar7,in_x5);
    if (pcVar8 == (code *)0x0) goto LAB_00ac1588;
    lVar4 = (*pcVar8)(b,6,c,4,(long)enc,0);
  }
  else {
    lVar4 = (*pcVar3)(b,6,c,0,4,(long)enc,1,0);
    pcVar8 = (code *)0x0;
  }
  if (lVar4 < 1) {
    return;
  }
LAB_00ac1588:
  BIO_set_init(b,1);
  iVar1 = EVP_CipherInit_ex(*(EVP_CIPHER_CTX **)(lVar2 + 0x18),c,(ENGINE *)0x0,k,i,enc);
  if (iVar1 != 0) {
    if (pcVar3 == (code *)0x0) {
      if (pcVar8 != (code *)0x0) {
        (*pcVar8)(b,6,c,4,(long)enc,1);
      }
    }
    else {
      (*pcVar3)(b,0x86,c,0,4,(long)enc,1,0);
    }
  }
  return;
}

