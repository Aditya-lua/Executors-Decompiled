; FUN_00c18ad8 @ 00c18ad8
00c18ad8	paciasp
00c18adc	stp x29,x30,[sp, #-0x40]!
00c18ae0	stp x24,x23,[sp, #0x10]
00c18ae4	stp x22,x21,[sp, #0x20]
00c18ae8	stp x20,x19,[sp, #0x30]
00c18aec	mov x29,sp
00c18af0	mov x20,x0
00c18af4	bl 0x00c10bfc
00c18af8	cbz x0,0x00c18c2c
00c18afc	mov x19,x0
00c18b00	mov x0,x20
00c18b04	bl 0x00c16098
00c18b08	cbz x0,0x00c18c2c
00c18b0c	ldp x21,x9,[x20]
00c18b10	cmp x21,x9
00c18b14	mov x8,x21
00c18b18	b.eq 0x00c18b34
00c18b1c	ldrb w8,[x21]
00c18b20	cmp w8,#0x6e
00c18b24	mov x8,x21
00c18b28	b.ne 0x00c18b34
00c18b2c	add x8,x21,#0x1
00c18b30	str x8,[x20]
00c18b34	cmp x9,x8
00c18b38	b.eq 0x00c18b4c
00c18b3c	ldrb w10,[x8]
00c18b40	sub w10,w10,#0x3a
00c18b44	cmn w10,#0xa
00c18b48	b.cs 0x00c18b60
00c18b4c	mov x21,xzr
00c18b50	mov x22,xzr
00c18b54	cmp x8,x9
00c18b58	b.ne 0x00c18b98
00c18b5c	b 0x00c18c28
00c18b60	ldrb w10,[x8]
00c18b64	sub w10,w10,#0x3a
00c18b68	cmn w10,#0xa
00c18b6c	b.cc 0x00c18b88
00c18b70	add x8,x8,#0x1
00c18b74	cmp x8,x9
00c18b78	str x8,[x20]
00c18b7c	b.ne 0x00c18b60
00c18b80	mov x10,x9
00c18b84	b 0x00c18b8c
00c18b88	mov x10,x8
00c18b8c	sub x22,x10,x21
00c18b90	cmp x8,x9
00c18b94	b.eq 0x00c18c28
00c18b98	ldrb w9,[x8]
00c18b9c	cmp w9,#0x45
00c18ba0	b.ne 0x00c18c28
00c18ba4	ldr x23,[x20, #0x1330]
00c18ba8	add x8,x8,#0x1
00c18bac	str x8,[x20]
00c18bb0	ldr x9,[x23, #0x8]
00c18bb4	sub x10,x9,#0xfc0
00c18bb8	cmn x10,#0xff1
00c18bbc	b.hi 0x00c18be4
00c18bc0	mov x24,x0
00c18bc4	mov w0,#0x1000
00c18bc8	bl 0x00c308d0
00c18bcc	cbz x0,0x00c18c44
00c18bd0	mov x9,xzr
00c18bd4	stp x23,xzr,[x0]
00c18bd8	mov x23,x0
00c18bdc	str x0,[x20, #0x1330]
00c18be0	mov x0,x24
00c18be4	add x8,x9,#0x30
00c18be8	add x9,x23,x9
00c18bec	mov w10,#0x45
00c18bf0	str x8,[x23, #0x8]
00c18bf4	adrp x8,0xcb2000
00c18bf8	add x8,x8,#0xa08
00c18bfc	str x8,[x9, #0x10]!
00c18c00	ldurh w8,[x9, #0x9]
00c18c04	strb w10,[x9, #0x8]
00c18c08	mov w10,#0x542
00c18c0c	and w8,w8,#0xf000
00c18c10	stp x19,x0,[x9, #0x10]
00c18c14	mov x0,x9
00c18c18	orr w8,w8,w10
00c18c1c	stp x21,x22,[x9, #0x20]
00c18c20	sturh w8,[x9, #0x9]
00c18c24	b 0x00c18c2c
00c18c28	mov x0,xzr
00c18c2c	ldp x20,x19,[sp, #0x30]
00c18c30	ldp x22,x21,[sp, #0x20]
00c18c34	ldp x24,x23,[sp, #0x10]
00c18c38	ldp x29,x30,[sp], #0x40
00c18c3c	autiasp
00c18c40	ret
00c18c44	bl 0x00c2fff0
