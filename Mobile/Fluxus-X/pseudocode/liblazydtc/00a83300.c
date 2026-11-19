/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a83300
 */

void OPENSSL_die(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  OPENSSL_showfatal("%s:%d: OpenSSL internal error: %s\n",param_2,param_3,param_1);
                    /* WARNING: Subroutine does not return */
  abort();
}

