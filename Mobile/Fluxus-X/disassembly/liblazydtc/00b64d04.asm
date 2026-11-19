; ossl_DER_w_algorithmIdentifier_RSA_PSS @ 00b64d04
00b64d04	str x23,[sp, #-0x40]!
00b64d08	stp x22,x21,[sp, #0x10]
00b64d0c	stp x20,x19,[sp, #0x20]
00b64d10	mov x22,x3
00b64d14	mov w19,w1
00b64d18	mov x20,x0
00b64d1c	stp x29,x30,[sp, #0x30]
00b64d20	add x29,sp,#0x30
00b64d24	cbz w2,0x00b64d44
00b64d28	cmp w2,#0x1, LSL #12
00b64d2c	mov w0,wzr
00b64d30	b.ne 0x00b64db4
00b64d34	adrp x21,0xcb5000
00b64d38	ldr x21,[x21, #0xa38]
00b64d3c	mov w23,#0x390
00b64d40	b 0x00b64d50
00b64d44	adrp x21,0xcb5000
00b64d48	ldr x21,[x21, #0xa40]
00b64d4c	orr w23,wzr,#0x6
00b64d50	mov x0,x20
00b64d54	mov w1,w19
00b64d58	bl 0x00c3e050
00b64d5c	cbz w0,0x00b64db4
00b64d60	cmp w23,#0x390
00b64d64	b.ne 0x00b64d88
00b64d68	mov x0,x22
00b64d6c	bl 0x00c3fb80
00b64d70	cbnz w0,0x00b64d88
00b64d74	mov w1,#0xffffffff
00b64d78	mov x0,x20
00b64d7c	mov x2,x22
00b64d80	bl 0x00b64a24
00b64d84	cbz w0,0x00b64db4
00b64d88	mov w1,#0xffffffff
00b64d8c	mov w3,#0xb
00b64d90	mov x0,x20
00b64d94	mov x2,x21
00b64d98	bl 0x00c3e0a0
00b64d9c	cbz w0,0x00b64db4
00b64da0	mov x0,x20
00b64da4	mov w1,w19
00b64da8	bl 0x00c3e060
00b64dac	cmp w0,#0x0
00b64db0	cset w0,ne
00b64db4	ldp x29,x30,[sp, #0x30]
00b64db8	ldp x20,x19,[sp, #0x20]
00b64dbc	ldp x22,x21,[sp, #0x10]
00b64dc0	ldr x23,[sp], #0x40
00b64dc4	ret
