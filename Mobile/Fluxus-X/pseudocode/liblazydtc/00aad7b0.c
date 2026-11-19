/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aad7b0
 */

void OBJ_NAME_do_all(int type,fn *fn,void *arg)

{
  int local_28 [2];
  fn *local_20;
  void *pvStack_18;
  
  local_28[0] = type;
  local_20 = fn;
  pvStack_18 = arg;
  OPENSSL_LH_doall_arg(DAT_00d22178,&LAB_00aad7ec,local_28);
  return;
}

