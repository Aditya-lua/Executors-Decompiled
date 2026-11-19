/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aee4f8
 */

char * UI_construct_prompt(UI *ui_method,char *object_desc,char *object_name)

{
  char *pcVar1;
  size_t sVar2;
  size_t sVar3;
  code *UNRECOVERED_JUMPTABLE;
  long lVar4;
  long lVar5;
  undefined2 local_44 [2];
  undefined4 local_40;
  undefined2 local_3c;
  undefined4 local_38;
  undefined2 local_34;
  undefined1 local_32;
  
  if (((ui_method != (UI *)0x0) && (*(long *)ui_method != 0)) &&
     (UNRECOVERED_JUMPTABLE = *(code **)(*(long *)ui_method + 0x40),
     UNRECOVERED_JUMPTABLE != (code *)0x0)) {
                    /* WARNING: Could not recover jumptable at 0x00aee540. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    pcVar1 = (char *)(*UNRECOVERED_JUMPTABLE)(ui_method,object_desc,object_name);
    return pcVar1;
  }
  local_32 = 0;
  local_34 = 0x2072;
  local_38 = 0x65746e45;
  local_3c = 0x20;
  local_40 = 0x726f6620;
  local_44[0] = 0x3a;
  if (object_desc != (char *)0x0) {
    sVar2 = strlen(object_desc);
    if (object_name == (char *)0x0) {
      lVar4 = sVar2 + 6;
    }
    else {
      sVar3 = strlen(object_name);
      lVar4 = sVar2 + sVar3 + 0xb;
    }
    lVar4 = (lVar4 << 0x20) + 0x200000000;
    lVar5 = lVar4 >> 0x20;
    pcVar1 = CRYPTO_malloc((int)((ulong)lVar4 >> 0x20),"crypto/ui/ui_lib.c",0x178);
    if (pcVar1 != (char *)0x0) {
      OPENSSL_strlcpy(pcVar1,&local_38,lVar5);
      OPENSSL_strlcat(pcVar1,object_desc,lVar5);
      if (object_name != (char *)0x0) {
        OPENSSL_strlcat(pcVar1,&local_40,lVar5);
        OPENSSL_strlcat(pcVar1,object_name,lVar5);
      }
      OPENSSL_strlcat(pcVar1,local_44,lVar5);
      return pcVar1;
    }
    ERR_new();
    ERR_set_debug("crypto/ui/ui_lib.c",0x179,"UI_construct_prompt");
    ERR_set_error(0x28,0xc0100,0);
  }
  return (char *)0x0;
}

