; ossl_ecx_key_fromdata @ 00a3db48
00a3db48	sub sp,sp,#0x50
00a3db4c	stp x22,x21,[sp, #0x20]
00a3db50	stp x20,x19,[sp, #0x30]
00a3db54	stp x29,x30,[sp, #0x40]
00a3db58	add x29,sp,#0x40
00a3db5c	stp xzr,xzr,[sp, #0x10]
00a3db60	cbz x0,0x00a3dc34
00a3db64	mov x21,x1
00a3db68	adrp x1,0x2ad000
00a3db6c	mov x19,x0
00a3db70	add x1,x1,#0x463
00a3db74	mov x0,x21
00a3db78	mov w22,w2
00a3db7c	bl 0x00c36530
00a3db80	mov x20,x0
00a3db84	cbz w22,0x00a3db9c
00a3db88	adrp x1,0x2a3000
00a3db8c	add x1,x1,#0xe83
00a3db90	mov x0,x21
00a3db94	bl 0x00c36530
00a3db98	b 0x00a3dba0
00a3db9c	mov x0,xzr
00a3dba0	orr x9,x20,x0
00a3dba4	mov w8,wzr
00a3dba8	cbz x9,0x00a3dc38
00a3dbac	cbz x0,0x00a3dbd8
00a3dbb0	ldr x2,[x19, #0x58]
00a3dbb4	add x21,x19,#0x50
00a3dbb8	add x3,sp,#0x18
00a3dbbc	mov x1,x21
00a3dbc0	bl 0x00c3ace0
00a3dbc4	cbz w0,0x00a3dc34
00a3dbc8	ldr x1,[sp, #0x18]
00a3dbcc	ldr x8,[x19, #0x58]
00a3dbd0	cmp x1,x8
00a3dbd4	b.ne 0x00a3dc50
00a3dbd8	add x8,x19,#0x11
00a3dbdc	str x8,[sp, #0x8]
00a3dbe0	cbz x20,0x00a3dc14
00a3dbe4	add x1,sp,#0x8
00a3dbe8	mov w2,#0x39
00a3dbec	add x3,sp,#0x10
00a3dbf0	mov x0,x20
00a3dbf4	bl 0x00c3ace0
00a3dbf8	cbz w0,0x00a3dc34
00a3dbfc	ldr x8,[sp, #0x10]
00a3dc00	ldr x9,[x19, #0x58]
00a3dc04	cmp x8,x9
00a3dc08	mov w8,wzr
00a3dc0c	b.eq 0x00a3dc20
00a3dc10	b 0x00a3dc38
00a3dc14	mov x0,x19
00a3dc18	bl 0x00a3da48
00a3dc1c	cbz w0,0x00a3dc34
00a3dc20	ldrb w8,[x19, #0x10]
00a3dc24	orr w8,w8,#0x1
00a3dc28	strb w8,[x19, #0x10]
00a3dc2c	mov w8,#0x1
00a3dc30	b 0x00a3dc38
00a3dc34	mov w8,wzr
00a3dc38	ldp x29,x30,[sp, #0x40]
00a3dc3c	ldp x20,x19,[sp, #0x30]
00a3dc40	ldp x22,x21,[sp, #0x20]
00a3dc44	mov w0,w8
00a3dc48	add sp,sp,#0x50
00a3dc4c	ret
00a3dc50	ldr x0,[x21]
00a3dc54	adrp x2,0x2a0000
00a3dc58	add x2,x2,#0x174
00a3dc5c	mov w3,#0x54
00a3dc60	bl 0x00c38e10
00a3dc64	mov w8,wzr
00a3dc68	str xzr,[x21]
00a3dc6c	b 0x00a3dc38
