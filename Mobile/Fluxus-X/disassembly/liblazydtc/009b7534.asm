; SSL_get_certificate @ 009b7534
009b7534	ldr x8,[x0, #0x898]
009b7538	cbz x8,0x009b7548
009b753c	ldr x8,[x8]
009b7540	ldr x0,[x8]
009b7544	ret
009b7548	mov x0,xzr
009b754c	ret
