/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009bd920
 */

bool FUN_009bd920(SSL *param_1,uchar *param_2,uint *param_3)

{
  int iVar1;
  uint uVar2;
  
  uVar2 = 0;
  do {
    iVar1 = RAND_bytes_ex(**(undefined8 **)&param_1[3].ex_data.dummy,param_2,*param_3,0);
    if (iVar1 < 1) {
      return false;
    }
    iVar1 = SSL_has_matching_session_id(param_1,param_2,*param_3);
  } while ((iVar1 != 0) && (uVar2 = uVar2 + 1, uVar2 < 10));
  return uVar2 < 10;
}

