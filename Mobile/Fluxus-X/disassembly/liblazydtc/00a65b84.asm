; evp_keymgmt_util_cache_keydata @ 00a65b84
00a65b84	str x23,[sp, #-0x40]!
00a65b88	stp x22,x21,[sp, #0x10]
00a65b8c	stp x20,x19,[sp, #0x20]
00a65b90	stp x29,x30,[sp, #0x30]
00a65b94	add x29,sp,#0x30
00a65b98	cbz x2,0x00a65c00
00a65b9c	ldr x8,[x0, #0x78]
00a65ba0	mov w22,w3
00a65ba4	mov x23,x2
00a65ba8	mov x19,x1
00a65bac	mov x21,x0
00a65bb0	cbnz x8,0x00a65bc0
00a65bb4	bl 0x00c34780
00a65bb8	str x0,[x21, #0x78]
00a65bbc	cbz x0,0x00a65c38
00a65bc0	adrp x1,0x2cd000
00a65bc4	add x1,x1,#0xabe
00a65bc8	orr w0,wzr,#0x18
00a65bcc	mov w2,#0x110
00a65bd0	bl 0x00c32320
00a65bd4	cbz x0,0x00a65c38
00a65bd8	mov x20,x0
00a65bdc	stp x19,x23,[x0]
00a65be0	str w22,[x0, #0x10]
00a65be4	mov x0,x19
00a65be8	bl 0x00c3b6f0
00a65bec	cbz w0,0x00a65c08
00a65bf0	ldr x0,[x21, #0x78]
00a65bf4	mov x1,x20
00a65bf8	bl 0x00c347a0
00a65bfc	cbz w0,0x00a65c18
00a65c00	mov w0,#0x1
00a65c04	b 0x00a65c38
00a65c08	adrp x1,0x2cd000
00a65c0c	add x1,x1,#0xabe
00a65c10	mov w2,#0x118
00a65c14	b 0x00a65c2c
00a65c18	mov x0,x19
00a65c1c	bl 0x00c36350
00a65c20	adrp x1,0x2cd000
00a65c24	add x1,x1,#0xabe
00a65c28	mov w2,#0x11e
00a65c2c	mov x0,x20
00a65c30	bl 0x00c32310
00a65c34	mov w0,wzr
00a65c38	ldp x29,x30,[sp, #0x30]
00a65c3c	ldp x20,x19,[sp, #0x20]
00a65c40	ldp x22,x21,[sp, #0x10]
00a65c44	ldr x23,[sp], #0x40
00a65c48	ret
