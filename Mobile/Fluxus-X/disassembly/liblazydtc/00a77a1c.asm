; EVP_PKEY_CTX_str2ctrl @ 00a77a1c
00a77a1c	str x21,[sp, #-0x30]!
00a77a20	mov x21,x0
00a77a24	mov x0,x2
00a77a28	stp x20,x19,[sp, #0x10]
00a77a2c	stp x29,x30,[sp, #0x20]
00a77a30	add x29,sp,#0x20
00a77a34	mov x19,x2
00a77a38	mov w20,w1
00a77a3c	bl 0x00c2ff50
00a77a40	lsr x8,x0,#0x1f
00a77a44	cbz x8,0x00a77a5c
00a77a48	ldp x29,x30,[sp, #0x20]
00a77a4c	ldp x20,x19,[sp, #0x10]
00a77a50	mov w0,#0xffffffff
00a77a54	ldr x21,[sp], #0x30
00a77a58	ret
00a77a5c	ldr x8,[x21, #0x78]
00a77a60	mov w1,w20
00a77a64	mov x3,x19
00a77a68	ldp x29,x30,[sp, #0x20]
00a77a6c	ldr x4,[x8, #0xc0]
00a77a70	ldp x20,x19,[sp, #0x10]
00a77a74	mov x2,x0
00a77a78	mov x0,x21
00a77a7c	ldr x21,[sp], #0x30
00a77a80	br x4
