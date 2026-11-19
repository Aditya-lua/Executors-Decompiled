; SSL_SESSION_get0_ticket @ 009be948
009be948	ldr x8,[x0, #0x340]
009be94c	str x8,[x2]
009be950	cbz x1,0x009be95c
009be954	ldr x8,[x0, #0x338]
009be958	str x8,[x1]
009be95c	ret
