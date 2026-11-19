; ossl_pw_clear_passphrase_cache @ 00aa0c7c
00aa0c7c	str x19,[sp, #-0x20]!
00aa0c80	stp x29,x30,[sp, #0x10]
00aa0c84	mov x19,x0
00aa0c88	ldr x0,[x0, #0x20]
00aa0c8c	ldr x1,[x19, #0x28]
00aa0c90	adrp x2,0x2b0000
00aa0c94	add x2,x2,#0x38e
00aa0c98	mov w3,#0x1d
00aa0c9c	add x29,sp,#0x10
00aa0ca0	bl 0x00c345e0
00aa0ca4	str xzr,[x19, #0x20]
00aa0ca8	ldp x29,x30,[sp, #0x10]
00aa0cac	ldr x19,[sp], #0x20
00aa0cb0	ret
