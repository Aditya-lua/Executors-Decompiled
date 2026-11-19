/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0097c88c
 */

/* ix::HttpServer::getTimeoutSecs() */

undefined4 __thiscall ix::HttpServer::getTimeoutSecs(HttpServer *this)

{
  return *(undefined4 *)(this + 800);
}

