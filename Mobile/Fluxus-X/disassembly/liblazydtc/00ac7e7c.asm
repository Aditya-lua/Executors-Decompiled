; RAND_set_rand_engine @ 00ac7e7c
00ac7e7c	str x23,[sp, #-0x40]!
00ac7e80	stp x20,x19,[sp, #0x20]
00ac7e84	mov x19,x0
00ac7e88	adrp x0,0xd22000
00ac7e8c	adrp x1,0xac7000
00ac7e90	add x0,x0,#0x210
00ac7e94	add x1,x1,#0xbc0
00ac7e98	stp x22,x21,[sp, #0x10]
00ac7e9c	stp x29,x30,[sp, #0x30]
00ac7ea0	add x29,sp,#0x30
00ac7ea4	bl 0x00c34d60
00ac7ea8	mov w8,w0
00ac7eac	mov w0,wzr
00ac7eb0	cbz w8,0x00ac7f64
00ac7eb4	adrp x21,0xd22000
00ac7eb8	ldr w8,[x21, #0x214]
00ac7ebc	cbz w8,0x00ac7f64
00ac7ec0	cbz x19,0x00ac7ee4
00ac7ec4	mov x0,x19
00ac7ec8	bl 0x00c323b0
00ac7ecc	cbz w0,0x00ac7f64
00ac7ed0	mov x0,x19
00ac7ed4	bl 0x00c3bd90
00ac7ed8	mov x20,x0
00ac7edc	cbnz x0,0x00ac7ee8
00ac7ee0	b 0x00ac7f58
00ac7ee4	mov x20,xzr
00ac7ee8	adrp x22,0xd22000
00ac7eec	ldr x0,[x22, #0x200]
00ac7ef0	bl 0x00c356a0
00ac7ef4	cbz w0,0x00ac7f58
00ac7ef8	adrp x0,0xd22000
00ac7efc	adrp x1,0xac7000
00ac7f00	add x0,x0,#0x210
00ac7f04	add x1,x1,#0xbc0
00ac7f08	bl 0x00c34d60
00ac7f0c	cbz w0,0x00ac7f48
00ac7f10	ldr w8,[x21, #0x214]
00ac7f14	cbz w8,0x00ac7f48
00ac7f18	adrp x21,0xd22000
00ac7f1c	ldr x0,[x21, #0x208]
00ac7f20	bl 0x00c356a0
00ac7f24	cbz w0,0x00ac7f48
00ac7f28	adrp x23,0xd22000
00ac7f2c	ldr x0,[x23, #0x218]
00ac7f30	bl 0x00c32360
00ac7f34	ldr x0,[x21, #0x208]
00ac7f38	adrp x8,0xd22000
00ac7f3c	str x19,[x23, #0x218]
00ac7f40	str x20,[x8, #0x1f0]
00ac7f44	bl 0x00c35690
00ac7f48	ldr x0,[x22, #0x200]
00ac7f4c	bl 0x00c35690
00ac7f50	mov w0,#0x1
00ac7f54	b 0x00ac7f64
00ac7f58	mov x0,x19
00ac7f5c	bl 0x00c32360
00ac7f60	mov w0,wzr
00ac7f64	ldp x29,x30,[sp, #0x30]
00ac7f68	ldp x20,x19,[sp, #0x20]
00ac7f6c	ldp x22,x21,[sp, #0x10]
00ac7f70	ldr x23,[sp], #0x40
00ac7f74	ret
