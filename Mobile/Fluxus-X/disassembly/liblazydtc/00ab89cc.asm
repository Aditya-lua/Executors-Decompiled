; PEM_write_bio_Parameters @ 00ab89cc
00ab89cc	sub sp,sp,#0x90
00ab89d0	stp x20,x19,[sp, #0x70]
00ab89d4	mov x20,x1
00ab89d8	adrp x2,0x2b9000
00ab89dc	adrp x3,0x2ab000
00ab89e0	mov x19,x0
00ab89e4	add x2,x2,#0x56f
00ab89e8	add x3,x3,#0xdf0
00ab89ec	mov w1,#0x84
00ab89f0	mov x0,x20
00ab89f4	mov x4,xzr
00ab89f8	str x21,[sp, #0x60]
00ab89fc	stp x29,x30,[sp, #0x80]
00ab8a00	add x29,sp,#0x80
00ab8a04	bl 0x00c3b960
00ab8a08	mov x21,x0
00ab8a0c	bl 0x00c3b7d0
00ab8a10	cbz w0,0x00ab8a30
00ab8a14	mov x0,x21
00ab8a18	mov x1,x19
00ab8a1c	bl 0x00c3b860
00ab8a20	mov w19,w0
00ab8a24	mov x0,x21
00ab8a28	bl 0x00c3b890
00ab8a2c	b 0x00ab8a98
00ab8a30	mov x0,x21
00ab8a34	bl 0x00c3b890
00ab8a38	ldr x8,[x20, #0x8]
00ab8a3c	cbz x8,0x00ab8a94
00ab8a40	ldr x9,[x8, #0x78]
00ab8a44	cbz x9,0x00ab8a94
00ab8a48	ldr x3,[x8, #0x10]
00ab8a4c	adrp x2,0x2bc000
00ab8a50	add x2,x2,#0x2f9
00ab8a54	add x0,sp,#0x10
00ab8a58	mov w1,#0x50
00ab8a5c	bl 0x00c34d30
00ab8a60	ldr x8,[x20, #0x8]
00ab8a64	add x1,sp,#0x10
00ab8a68	mov x2,x19
00ab8a6c	mov x3,x20
00ab8a70	ldr x0,[x8, #0x78]
00ab8a74	mov x4,xzr
00ab8a78	mov x5,xzr
00ab8a7c	mov w6,wzr
00ab8a80	mov x7,xzr
00ab8a84	str xzr,[sp]
00ab8a88	bl 0x00c36070
00ab8a8c	mov w19,w0
00ab8a90	b 0x00ab8a98
00ab8a94	mov w19,wzr
00ab8a98	mov w0,w19
00ab8a9c	ldp x29,x30,[sp, #0x80]
00ab8aa0	ldp x20,x19,[sp, #0x70]
00ab8aa4	ldr x21,[sp, #0x60]
00ab8aa8	add sp,sp,#0x90
00ab8aac	ret
