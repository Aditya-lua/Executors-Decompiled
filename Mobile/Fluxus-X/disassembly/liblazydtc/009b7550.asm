; SSL_get_privatekey @ 009b7550
009b7550	ldr x8,[x0, #0x898]
009b7554	cbz x8,0x009b7564
009b7558	ldr x8,[x8]
009b755c	ldr x0,[x8, #0x8]
009b7560	ret
009b7564	mov x0,xzr
009b7568	ret
