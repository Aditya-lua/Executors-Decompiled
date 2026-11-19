/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009701d0
 */

void FUN_009701d0(long param_1,char *param_2)

{
  ulong uVar1;
  char *__src;
  long lVar2;
  int iVar3;
  uint uVar4;
  ENGINE *e;
  undefined8 uVar5;
  ulong e_00;
  long lVar6;
  char *buf;
  ulong len;
  char local_158 [256];
  long local_58;
  
  lVar2 = tpidr_el0;
  local_58 = *(long *)(lVar2 + 0x28);
  e = ENGINE_by_id(param_2);
  if (e == (ENGINE *)0x0) {
    FUN_00904b80(param_1,"SSL Engine \'%s\' not found",param_2);
    uVar5 = 0x35;
  }
  else {
    if (*(ENGINE **)(param_1 + 0xdc0) != (ENGINE *)0x0) {
      ENGINE_finish(*(ENGINE **)(param_1 + 0xdc0));
      ENGINE_free(*(ENGINE **)(param_1 + 0xdc0));
      *(undefined8 *)(param_1 + 0xdc0) = 0;
    }
    iVar3 = ENGINE_init(e);
    if (iVar3 == 0) {
      buf = local_158;
      ENGINE_free(e);
      e_00 = ERR_get_error();
      local_158[0] = '\0';
      uVar5 = OpenSSL_version(6);
      len = 0x100;
      uVar4 = curl_msnprintf(local_158,0x100,"%s/%s","OpenSSL",uVar5);
      if (uVar4 < 0xfe) {
        lVar6 = (long)(int)uVar4;
        (buf + lVar6)[0] = ':';
        (buf + lVar6)[1] = ' ';
        buf = local_158 + lVar6 + 2;
        *buf = '\0';
        len = 0xfe - lVar6;
      }
      ERR_error_string_n(e_00,buf,len);
      if (*buf == '\0') {
        uVar1 = 8;
        if (e_00 != 0) {
          uVar1 = 0xd;
        }
        if (uVar1 < len) {
          __src = "No error";
          if (e_00 != 0) {
            __src = "Unknown error";
          }
          strcpy(buf,__src);
        }
      }
      FUN_00904b80(param_1,"Failed to initialise SSL Engine \'%s\': %s",param_2,buf);
      uVar5 = 0x42;
    }
    else {
      uVar5 = 0;
      *(ENGINE **)(param_1 + 0xdc0) = e;
    }
  }
  if (*(long *)(lVar2 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar5);
  }
  return;
}

