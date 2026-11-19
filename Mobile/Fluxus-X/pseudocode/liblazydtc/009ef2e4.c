/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ef2e4
 */

uint ossl_asn1_time_print_ex(BIO *param_1,int *param_2,ulong param_3)

{
  char cVar1;
  int iVar2;
  int iVar3;
  char *pcVar4;
  ulong uVar5;
  char *pcVar6;
  long lVar7;
  long lVar8;
  uint local_88;
  uint local_84;
  uint local_80;
  uint local_7c;
  int local_78;
  int local_74;
  
  iVar2 = ossl_asn1_time_to_tm(&local_88);
  if (iVar2 == 0) {
    iVar2 = BIO_write(param_1,"Bad time value",0xe);
    return -(uint)(iVar2 != 0);
  }
  iVar2 = *param_2;
  lVar7 = *(long *)(param_2 + 2);
  cVar1 = *(char *)(lVar7 + iVar2 + -1);
  if (param_2[1] == 0x18) {
    if ((iVar2 < 0x10) || (pcVar6 = (char *)(lVar7 + 0xe), *pcVar6 != '.')) {
      pcVar6 = (char *)0x0;
      uVar5 = 0;
    }
    else {
      lVar8 = 0xf;
      do {
        iVar3 = ossl_ascii_isdigit(*(undefined1 *)(lVar7 + lVar8));
        if (iVar3 == 0) break;
        lVar8 = lVar8 + 1;
      } while (lVar8 < iVar2);
      uVar5 = (ulong)((int)lVar8 - 0xe);
    }
    if ((param_3 & 0xf) == 1) {
      pcVar4 = "Z";
      if (cVar1 != 'Z') {
        pcVar4 = "";
      }
      iVar2 = BIO_printf(param_1,"%4d-%02d-%02d %02d:%02d:%02d%.*s%s",local_74 + 0x76c,local_78 + 1,
                         local_7c,local_80,local_84,local_88,(int)uVar5,pcVar6,pcVar4);
      goto LAB_009ef4e4;
    }
    pcVar4 = "%s %2d %02d:%02d:%02d%.*s %d%s";
  }
  else {
    if ((param_3 & 0xf) == 1) {
      pcVar6 = "Z";
      if (cVar1 != 'Z') {
        pcVar6 = "";
      }
      iVar2 = BIO_printf(param_1,"%4d-%02d-%02d %02d:%02d:%02d%s",local_74 + 0x76c,local_78 + 1,
                         local_7c,local_80,local_84,local_88,pcVar6);
      goto LAB_009ef4e4;
    }
    uVar5 = (ulong)(local_74 + 0x76c);
    pcVar6 = " GMT";
    if (cVar1 != 'Z') {
      pcVar6 = "";
    }
    pcVar4 = "%s %2d %02d:%02d:%02d %d%s";
  }
  iVar2 = BIO_printf(param_1,pcVar4,&UNK_0074df50 + (long)local_78 * 4,(ulong)local_7c,
                     (ulong)local_80,(ulong)local_84,(ulong)local_88,uVar5,pcVar6);
LAB_009ef4e4:
  return (uint)(0 < iVar2);
}

