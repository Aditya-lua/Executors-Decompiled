/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab5a38
 */

void PEM_proc_type(char *buf,int type)

{
  size_t sVar1;
  char *param3;
  
  sVar1 = strlen(buf);
  if (type == 10) {
    param3 = "ENCRYPTED";
  }
  else if (type == 0x14) {
    param3 = "MIC-ONLY";
  }
  else if (type == 0x1e) {
    param3 = "MIC-CLEAR";
  }
  else {
    param3 = "BAD-TYPE";
  }
  BIO_snprintf(buf + sVar1,0x400 - sVar1,"Proc-Type: 4,%s\n",param3);
  return;
}

