; mbedtls_cipher_update_ad @ 00b69e40
00b69e40	str x21,[sp, #-0x30]!
00b69e44	stp x20,x19,[sp, #0x10]
00b69e48	stp x29,x30,[sp, #0x20]
00b69e4c	add x29,sp,#0x20
00b69e50	ldr x8,[x0]
00b69e54	mov x19,x2
00b69e58	mov x21,x0
00b69e5c	mov x20,x1
00b69e60	cbz x8,0x00b69e90
00b69e64	ldr w8,[x8, #0x8]
00b69e68	and w9,w8,#0xf000
00b69e6c	cmp w9,#0x6, LSL #12
00b69e70	b.ne 0x00b69e98
00b69e74	ldr x0,[x21, #0x50]
00b69e78	mov x1,x20
00b69e7c	mov x2,x19
00b69e80	ldp x29,x30,[sp, #0x20]
00b69e84	ldp x20,x19,[sp, #0x10]
00b69e88	ldr x21,[sp], #0x30
00b69e8c	b 0x00c421f0
00b69e90	mov w0,#0xffff9f00
00b69e94	b 0x00b69ee0
00b69e98	and w8,w8,#0xff0000
00b69e9c	cmp w8,#0x4d0, LSL #12
00b69ea0	b.ne 0x00b69edc
00b69ea4	ldr w8,[x21, #0xc]
00b69ea8	ldr x0,[x21, #0x50]
00b69eac	add x1,x21,#0x38
00b69eb0	cmp w8,#0x1
00b69eb4	cset w2,ne
00b69eb8	bl 0x00c42120
00b69ebc	cbnz w0,0x00b69ee0
00b69ec0	ldr x0,[x21, #0x50]
00b69ec4	mov x1,x20
00b69ec8	mov x2,x19
00b69ecc	ldp x29,x30,[sp, #0x20]
00b69ed0	ldp x20,x19,[sp, #0x10]
00b69ed4	ldr x21,[sp], #0x30
00b69ed8	b 0x00c42140
00b69edc	mov w0,#0xffff9f80
00b69ee0	ldp x29,x30,[sp, #0x20]
00b69ee4	ldp x20,x19,[sp, #0x10]
00b69ee8	ldr x21,[sp], #0x30
00b69eec	ret
