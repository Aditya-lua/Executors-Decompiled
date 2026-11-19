; SSL_CTX_get0_privatekey @ 009b7588
009b7588	ldr x8,[x0, #0x158]
009b758c	cbz x8,0x009b759c
009b7590	ldr x8,[x8]
009b7594	ldr x0,[x8, #0x8]
009b7598	ret
009b759c	mov x0,xzr
009b75a0	ret
