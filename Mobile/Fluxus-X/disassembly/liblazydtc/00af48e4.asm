; X509V3_EXT_REQ_add_nconf @ 00af48e4
00af48e4	sub sp,sp,#0x30
00af48e8	stp x20,x19,[sp, #0x10]
00af48ec	mov x19,x3
00af48f0	add x3,sp,#0x8
00af48f4	stp x29,x30,[sp, #0x20]
00af48f8	add x29,sp,#0x20
00af48fc	str xzr,[sp, #0x8]
00af4900	bl 0x00af47a0
00af4904	ldr x8,[sp, #0x8]
00af4908	mov w20,w0
00af490c	cbz x19,0x00af492c
00af4910	cbz w20,0x00af492c
00af4914	cbz x8,0x00af492c
00af4918	mov x0,x19
00af491c	mov x1,x8
00af4920	bl 0x00c407c0
00af4924	ldr x8,[sp, #0x8]
00af4928	mov w20,w0
00af492c	adrp x1,0xcb5000
00af4930	ldr x1,[x1, #0x1a0]
00af4934	mov x0,x8
00af4938	bl 0x00c32600
00af493c	mov w0,w20
00af4940	ldp x29,x30,[sp, #0x20]
00af4944	ldp x20,x19,[sp, #0x10]
00af4948	add sp,sp,#0x30
00af494c	ret
