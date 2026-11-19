/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aaea18
 */

int OBJ_create_objects(BIO *in)

{
  char cVar1;
  int iVar2;
  int iVar3;
  char *sn;
  char *ln;
  char *pcVar4;
  char acStack_241 [513];
  
  iVar2 = BIO_gets(in,acStack_241 + 1,0x200);
  if (iVar2 < 1) {
    return 0;
  }
  ln = (char *)0x0;
  iVar3 = 0;
LAB_00aaea54:
  acStack_241[iVar2] = '\0';
  iVar2 = ossl_ctype_check(acStack_241[1],7);
  if (iVar2 == 0) {
    return iVar3;
  }
  for (sn = acStack_241 + 1; (iVar2 = ossl_isdigit(*sn), iVar2 != 0 || (*sn == '.')); sn = sn + 1) {
  }
  if (*sn != '\0') {
    *sn = '\0';
    do {
      sn = sn + 1;
      iVar2 = ossl_ctype_check(*sn,8);
    } while (iVar2 != 0);
    cVar1 = *sn;
    if (cVar1 != '\0') {
      pcVar4 = sn;
LAB_00aaeab4:
      iVar2 = ossl_ctype_check(cVar1,8);
      if (iVar2 == 0) goto code_r0x00aaeac4;
      if (*pcVar4 != '\0') {
        *pcVar4 = '\0';
        do {
          pcVar4 = pcVar4 + 1;
          iVar2 = ossl_ctype_check(*pcVar4,8);
        } while (iVar2 != 0);
        ln = (char *)0x0;
        if (*pcVar4 != '\0') {
          ln = pcVar4;
        }
        goto joined_r0x00aaeb0c;
      }
      goto LAB_00aaeb14;
    }
  }
  sn = (char *)0x0;
  if (acStack_241[1] == '\0') {
    return iVar3;
  }
  goto LAB_00aaeb20;
code_r0x00aaeac4:
  pcVar4 = pcVar4 + 1;
  cVar1 = *pcVar4;
  if (cVar1 == '\0') goto LAB_00aaeb14;
  goto LAB_00aaeab4;
LAB_00aaeb14:
  ln = (char *)0x0;
joined_r0x00aaeb0c:
  if (acStack_241[1] == '\0') {
    return iVar3;
  }
LAB_00aaeb20:
  iVar2 = OBJ_create(acStack_241 + 1,sn,ln);
  if (iVar2 == 0) {
    return iVar3;
  }
  iVar3 = iVar3 + 1;
  iVar2 = BIO_gets(in,acStack_241 + 1,0x200);
  if (iVar2 < 1) {
    return iVar3;
  }
  goto LAB_00aaea54;
}

