/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1563c
 */

int X509_REQ_set_subject_name(X509_REQ *req,X509_NAME *name)

{
  int iVar1;
  
  if (req == (X509_REQ *)0x0) {
    return 0;
  }
  *(undefined4 *)&req->signature = 1;
  iVar1 = X509_NAME_set((X509_NAME **)(req + 1),name);
  return iVar1;
}

