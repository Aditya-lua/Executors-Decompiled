/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009e3dc8
 */

undefined8 tls_process_change_cipher_spec(int *param_1,long param_2)

{
  int iVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  long lVar4;
  
  lVar4 = *(long *)(param_2 + 8);
  if ((*(byte *)(*(long *)(*(long *)(param_1 + 2) + 0xc0) + 0x60) >> 3 & 1) == 0) {
    if (lVar4 != 0) {
      ERR_new();
      uVar2 = 0x2eb;
LAB_009e3e44:
      ERR_set_debug("ssl/statem/statem_lib.c",uVar2,"tls_process_change_cipher_spec");
      uVar2 = 0x32;
      uVar3 = 0x67;
      goto LAB_009e3e50;
    }
  }
  else if (((lVar4 != 2) && (*param_1 == 0x100)) || ((lVar4 != 0 && (*param_1 != 0x100)))) {
    ERR_new();
    uVar2 = 0x2e6;
    goto LAB_009e3e44;
  }
  if (*(long *)(param_1 + 0xb8) == 0) {
    ERR_new();
    ERR_set_debug("ssl/statem/statem_lib.c",0x2f2,"tls_process_change_cipher_spec");
    uVar2 = 10;
    uVar3 = 0x85;
  }
  else {
    param_1[0x66] = 1;
    iVar1 = ssl3_do_change_cipher_spec(param_1);
    if (iVar1 != 0) {
      if (((*(byte *)(*(long *)(*(long *)(param_1 + 2) + 0xc0) + 0x60) >> 3 & 1) != 0) &&
         (dtls1_reset_seq_numbers(param_1,1), *param_1 == 0x100)) {
        *(short *)(*(long *)(param_1 + 0x12e) + 0x110) =
             *(short *)(*(long *)(param_1 + 0x12e) + 0x110) + 1;
      }
      return 3;
    }
    ERR_new();
    ERR_set_debug("ssl/statem/statem_lib.c",0x2f8,"tls_process_change_cipher_spec");
    uVar2 = 0x50;
    uVar3 = 0xc0103;
  }
LAB_009e3e50:
  ossl_statem_fatal(param_1,uVar2,uVar3,0);
  return 0;
}

