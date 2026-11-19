/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b184b0
 */

undefined8 FUN_00b184b0(long param_1,ulong param_2)

{
  undefined8 uVar1;
  char *pcVar2;
  undefined8 uVar3;
  
  if ((*(ulong *)(param_1 + 0x98) == 0) || (param_2 <= *(ulong *)(param_1 + 0x98))) {
    if ((*(ulong *)(param_1 + 0x90) == 0) || (*(ulong *)(param_1 + 0x90) == param_2)) {
      *(ulong *)(param_1 + 0x90) = param_2;
      return 1;
    }
    ERR_new();
    ERR_set_debug("crypto/http/http_client.c",0x1f0,"check_set_resp_len");
    uVar3 = *(undefined8 *)(param_1 + 0x90);
    pcVar2 = "ASN.1 length=%zu, Content-Length=%zu";
    uVar1 = 0x78;
  }
  else {
    ERR_new();
    ERR_set_debug("crypto/http/http_client.c",0x1eb,"check_set_resp_len");
    uVar3 = *(undefined8 *)(param_1 + 0x98);
    pcVar2 = "length=%zu, max=%zu";
    uVar1 = 0x75;
  }
  ERR_set_error(0x3d,uVar1,pcVar2,param_2,uVar3);
  return 0;
}

