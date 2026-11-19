/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7483c
 */

bool mbedtls_des_key_check_weak(long *param_1)

{
  if (((((*param_1 == 0x101010101010101) || (*param_1 == -0x101010101010102)) ||
       (*param_1 == 0xe0e0e0e1f1f1f1f)) ||
      (((*param_1 == -0xe0e0e0e1f1f1f20 || (*param_1 == 0xe010e011f011f01)) ||
       ((*param_1 == 0x10e010e011f011f ||
        ((*param_1 == -0xefe0efe1ffe1fff || (*param_1 == 0x1f101f101e001e0)))))))) ||
     ((*param_1 == -0x1fe01fe01fe01ff ||
      (((((*param_1 == 0x1fe01fe01fe01fe || (*param_1 == -0xef10ef11fe01fe1)) ||
         (*param_1 == 0xef10ef11fe01fe0)) ||
        ((*param_1 == -0x1f101f101e001e1 || (*param_1 == 0xefe0efe1ffe1ffe)))) ||
       (*param_1 == -0x10e010e011f0120)))))) {
    return true;
  }
  return *param_1 == -0xe010e011f011f02;
}

