; ssl_hmac_size @ 009c3bb0
009c3bb0	ldr x8,[x0]
009c3bb4	cbz x8,0x009c3bc0
009c3bb8	mov x0,x8
009c3bbc	b 0x00c36380
009c3bc0	ldr x8,[x0, #0x8]
009c3bc4	cbz x8,0x009c3bcc
009c3bc8	b 0x00c36670
009c3bcc	mov x0,xzr
009c3bd0	ret
