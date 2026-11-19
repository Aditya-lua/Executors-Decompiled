/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008efa44
 */

/* cpr::Session::Delete() */

void cpr::Session::Delete(void)

{
  Session *in_x0;
  
  curl_easy_setopt(**(undefined8 **)(in_x0 + 0x18),0x50,0);
  curl_easy_setopt(**(undefined8 **)(in_x0 + 0x18),0x2c,0);
  curl_easy_setopt(**(undefined8 **)(in_x0 + 0x18),0x2734,"DELETE");
  prepareCommon();
  if (*(long *)(in_x0 + 0x2a0) == 0) {
    DoEasyPerform(in_x0);
    Complete();
    return;
  }
  intercept();
  return;
}

