; X509_ATTRIBUTE_set1_data @ 00b08b78
00b08b78	str x25,[sp, #-0x50]!
00b08b7c	stp x24,x23,[sp, #0x10]
00b08b80	stp x22,x21,[sp, #0x20]
00b08b84	stp x20,x19,[sp, #0x30]
00b08b88	stp x29,x30,[sp, #0x40]
00b08b8c	add x29,sp,#0x40
00b08b90	cbz x0,0x00b08d08
00b08b94	mov w23,w3
00b08b98	mov x21,x2
00b08b9c	mov w22,w1
00b08ba0	mov x20,x0
00b08ba4	tbz w1,#0xc,0x00b08c08
00b08ba8	ldr x0,[x20]
00b08bac	bl 0x00c37750
00b08bb0	mov w4,w0
00b08bb4	mov x0,xzr
00b08bb8	mov x1,x21
00b08bbc	mov w2,w23
00b08bc0	mov w3,w22
00b08bc4	bl 0x00c378e0
00b08bc8	cbz x0,0x00b08c40
00b08bcc	ldr w25,[x0, #0x4]
00b08bd0	mov x19,x0
00b08bd4	cbz w22,0x00b08c80
00b08bd8	bl 0x00c37a40
00b08bdc	mov x24,x0
00b08be0	cbz x0,0x00b08cc4
00b08be4	tbnz w22,#0xc,0x00b08c98
00b08be8	cmn w23,#0x1
00b08bec	b.ne 0x00b08c98
00b08bf0	mov x0,x24
00b08bf4	mov w1,w22
00b08bf8	mov x2,x21
00b08bfc	bl 0x00c37a70
00b08c00	cbnz w0,0x00b08cac
00b08c04	b 0x00b08cc4
00b08c08	cmn w23,#0x1
00b08c0c	b.eq 0x00b08c74
00b08c10	mov w0,w22
00b08c14	bl 0x00c378b0
00b08c18	mov x19,x0
00b08c1c	cbz x0,0x00b08c90
00b08c20	mov x0,x19
00b08c24	mov x1,x21
00b08c28	mov w2,w23
00b08c2c	bl 0x00c378a0
00b08c30	cbz w0,0x00b08c90
00b08c34	mov w25,w22
00b08c38	cbnz w22,0x00b08bd8
00b08c3c	b 0x00b08c80
00b08c40	bl 0x00c342a0
00b08c44	adrp x0,0x2ba000
00b08c48	adrp x2,0x2dc000
00b08c4c	add x0,x0,#0x8ba
00b08c50	add x2,x2,#0xafd
00b08c54	mov w1,#0x158
00b08c58	bl 0x00c342b0
00b08c5c	mov w1,#0xd
00b08c60	mov w0,#0xb
00b08c64	movk w1,#0x8, LSL #16
00b08c68	mov x2,xzr
00b08c6c	bl 0x00c342c0
00b08c70	b 0x00b08d04
00b08c74	mov x19,xzr
00b08c78	mov w25,wzr
00b08c7c	cbnz w22,0x00b08bd8
00b08c80	mov x0,x19
00b08c84	bl 0x00c37890
00b08c88	mov w0,#0x1
00b08c8c	b 0x00b08d08
00b08c90	mov x24,xzr
00b08c94	b 0x00b08cc4
00b08c98	mov x0,x24
00b08c9c	mov w1,w25
00b08ca0	mov x2,x19
00b08ca4	bl 0x00c37a60
00b08ca8	mov x19,xzr
00b08cac	ldr x0,[x20, #0x8]
00b08cb0	mov x1,x24
00b08cb4	bl 0x00c347a0
00b08cb8	cbz w0,0x00b08cc4
00b08cbc	mov w0,#0x1
00b08cc0	b 0x00b08d08
00b08cc4	bl 0x00c342a0
00b08cc8	adrp x0,0x2ba000
00b08ccc	adrp x2,0x2dc000
00b08cd0	add x0,x0,#0x8ba
00b08cd4	add x2,x2,#0xafd
00b08cd8	mov w1,#0x179
00b08cdc	bl 0x00c342b0
00b08ce0	mov w1,#0x100
00b08ce4	mov w0,#0xb
00b08ce8	movk w1,#0xc, LSL #16
00b08cec	mov x2,xzr
00b08cf0	bl 0x00c342c0
00b08cf4	mov x0,x24
00b08cf8	bl 0x00c37cc0
00b08cfc	mov x0,x19
00b08d00	bl 0x00c37890
00b08d04	mov w0,wzr
00b08d08	ldp x29,x30,[sp, #0x40]
00b08d0c	ldp x20,x19,[sp, #0x30]
00b08d10	ldp x22,x21,[sp, #0x20]
00b08d14	ldp x24,x23,[sp, #0x10]
00b08d18	ldr x25,[sp], #0x50
00b08d1c	ret
