; SSL_CTX_dane_clear_flags @ 009b28fc
009b28fc	ldr x8,[x0, #0x3b0]
009b2900	bic x9,x8,x1
009b2904	str x9,[x0, #0x3b0]
009b2908	mov x0,x8
009b290c	ret
