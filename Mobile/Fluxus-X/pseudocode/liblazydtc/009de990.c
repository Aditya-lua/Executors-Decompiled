/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009de990
 */

undefined4 tls_process_cert_status(void)

{
  int iVar1;
  undefined4 uVar2;
  
  iVar1 = tls_process_cert_status_body();
  uVar2 = 0;
  if (iVar1 != 0) {
    uVar2 = 3;
  }
  return uVar2;
}

