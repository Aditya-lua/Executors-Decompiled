/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008eab4c
 */

/* cpr::CurlHolder::~CurlHolder() */

void __thiscall cpr::CurlHolder::~CurlHolder(CurlHolder *this)

{
                    /* try { // try from 008eab60 to 008eab7b has its CatchHandler @ 008eab88 */
  curl_slist_free_all(*(undefined8 *)(this + 8));
  curl_slist_free_all(*(undefined8 *)(this + 0x10));
  curl_mime_free(*(undefined8 *)(this + 0x18));
  curl_easy_cleanup(*(undefined8 *)this);
  return;
}

