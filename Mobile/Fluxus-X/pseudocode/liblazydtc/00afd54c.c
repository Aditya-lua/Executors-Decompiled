/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00afd54c
 */

void SCT_print(int *param_1,BIO *param_2,int param_3,long param_4)

{
  int param2;
  int iVar1;
  long lVar2;
  char *pcVar3;
  ASN1_GENERALIZEDTIME *s;
  ulong uVar4;
  char acStack_64 [20];
  
  if (param_4 == 0) {
    lVar2 = 0;
  }
  else {
    lVar2 = CTLOG_STORE_get0_log_by_id
                      (param_4,*(undefined8 *)(param_1 + 6),*(undefined8 *)(param_1 + 8));
  }
  BIO_printf(param_2,"%*sSigned Certificate Timestamp:",param_3,"");
  param2 = param_3 + 4;
  BIO_printf(param_2,"\n%*sVersion   : ",param2,"");
  if (*param_1 != 0) {
    BIO_printf(param_2,"unknown\n%*s",param_3 + 0x10,"");
    BIO_hex_string(param_2,param_3 + 0x10,0x10,*(undefined8 *)(param_1 + 2),param_1[4]);
    return;
  }
  BIO_printf(param_2,"v1 (0x0)");
  if (lVar2 != 0) {
    pcVar3 = (char *)CTLOG_get0_name(lVar2);
    BIO_printf(param_2,"\n%*sLog       : %s",param2,"",pcVar3);
  }
  BIO_printf(param_2,"\n%*sLog ID    : ",param2,"");
  param_3 = param_3 + 0x10;
  BIO_hex_string(param_2,param_3,0x10,*(undefined8 *)(param_1 + 6),param_1[8]);
  BIO_printf(param_2,"\n%*sTimestamp : ",param2,"");
  uVar4 = *(ulong *)(param_1 + 10);
  s = ASN1_GENERALIZEDTIME_new();
  if (s != (ASN1_GENERALIZEDTIME *)0x0) {
    ASN1_GENERALIZEDTIME_adj(s,0,(int)(uVar4 / 86400000),(uVar4 % 86400000) / 1000);
    pcVar3 = (char *)ASN1_STRING_get0_data(s);
    BIO_snprintf(acStack_64,0x14,"%.14s.%03dZ",pcVar3,(int)uVar4 + (int)(uVar4 / 1000) * -1000);
    iVar1 = ASN1_GENERALIZEDTIME_set_string(s,acStack_64);
    if (iVar1 != 0) {
      ASN1_GENERALIZEDTIME_print(param_2,s);
    }
    ASN1_GENERALIZEDTIME_free(s);
  }
  BIO_printf(param_2,"\n%*sExtensions: ",param2,"");
  if (*(long *)(param_1 + 0xe) == 0) {
    BIO_printf(param_2,"none");
  }
  else {
    BIO_hex_string(param_2,param_3,0x10,*(undefined8 *)(param_1 + 0xc));
  }
  BIO_printf(param_2,"\n%*sSignature : ",param2,"");
  iVar1 = SCT_get_signature_nid(param_1);
  if (iVar1 == 0) {
    BIO_printf(param_2,"%02X%02X",(uint)*(byte *)(param_1 + 0x10),
               (uint)*(byte *)((long)param_1 + 0x41));
  }
  else {
    pcVar3 = OBJ_nid2ln(iVar1);
    BIO_printf(param_2,"%s",pcVar3);
  }
  BIO_printf(param_2,"\n%*s            ",param2,"");
  BIO_hex_string(param_2,param_3,0x10,*(undefined8 *)(param_1 + 0x12),param_1[0x14]);
  return;
}

