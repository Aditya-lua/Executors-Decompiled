; curl_mime_addpart @ 00926a28
00926a28	stp x20,x19,[sp, #-0x20]!
00926a2c	stp x29,x30,[sp, #0x10]
00926a30	add x29,sp,#0x10
00926a34	mov x19,x0
00926a38	cbz x0,0x00926a9c
00926a3c	adrp x8,0xcc4000
00926a40	add x8,x8,#0x670
00926a44	mov w0,#0x1b8
00926a48	ldr x8,[x8]
00926a4c	blr x8
00926a50	mov x20,x0
00926a54	cbz x0,0x00926aa0
00926a58	add x0,x20,#0x8
00926a5c	mov w2,#0x1a8
00926a60	mov w1,wzr
00926a64	bl 0x00c301c0
00926a68	mov w8,#0x1
00926a6c	str wzr,[x20, #0x78]
00926a70	stp xzr,xzr,[x20, #0x80]
00926a74	str x19,[x20]
00926a78	str x8,[x20, #0x1b0]
00926a7c	ldr x8,[x19, #0x10]
00926a80	add x9,x19,#0x8
00926a84	add x10,x8,#0x8
00926a88	cmp x8,#0x0
00926a8c	csel x8,x9,x10,eq
00926a90	str x20,[x8]
00926a94	str x20,[x19, #0x10]
00926a98	b 0x00926aa0
00926a9c	mov x20,xzr
00926aa0	ldp x29,x30,[sp, #0x10]
00926aa4	mov x0,x20
00926aa8	ldp x20,x19,[sp], #0x20
00926aac	ret
