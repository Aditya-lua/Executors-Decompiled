/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00941a24
 */

char * curl_multi_strerror(int param_1)

{
  if (param_1 + 1U < 0xe) {
    return (&PTR_s_Please_call_curl_multi_perform___00c4ffd0)[(int)(param_1 + 1U)];
  }
  return "Unknown error";
}

