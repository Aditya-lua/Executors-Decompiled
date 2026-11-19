; SSL_get_psk_identity_hint @ 009b7ca0
009b7ca0	cbz x0,0x009b7cb0
009b7ca4	ldr x8,[x0, #0x918]
009b7ca8	cbz x8,0x009b7cb4
009b7cac	ldr x0,[x8, #0x2a0]
009b7cb0	ret
009b7cb4	mov x0,xzr
009b7cb8	ret
