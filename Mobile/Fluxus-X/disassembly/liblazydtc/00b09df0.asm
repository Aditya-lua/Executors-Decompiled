; X509_STORE_load_path @ 00b09df0
00b09df0	stp x20,x19,[sp, #-0x20]!
00b09df4	stp x29,x30,[sp, #0x10]
00b09df8	add x29,sp,#0x10
00b09dfc	cbz x1,0x00b09e3c
00b09e00	mov x19,x1
00b09e04	mov x20,x0
00b09e08	bl 0x00c35b30
00b09e0c	mov x1,x0
00b09e10	mov x0,x20
00b09e14	bl 0x00c32c00
00b09e18	cbz x0,0x00b09e3c
00b09e1c	mov w1,#0x2
00b09e20	mov w3,#0x1
00b09e24	mov x2,x19
00b09e28	mov x4,xzr
00b09e2c	bl 0x00c35b10
00b09e30	cmp w0,#0x0
00b09e34	cset w0,gt
00b09e38	b 0x00b09e40
00b09e3c	mov w0,wzr
00b09e40	ldp x29,x30,[sp, #0x10]
00b09e44	ldp x20,x19,[sp], #0x20
00b09e48	ret
