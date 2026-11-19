; s2i_ASN1_OCTET_STRING @ 00b04a18
00b04a18	sub sp,sp,#0x30
00b04a1c	stp x20,x19,[sp, #0x10]
00b04a20	stp x29,x30,[sp, #0x20]
00b04a24	add x29,sp,#0x20
00b04a28	mov x20,x2
00b04a2c	bl 0x00c38170
00b04a30	mov x19,x0
00b04a34	cbz x0,0x00b04a58
00b04a38	add x1,sp,#0x8
00b04a3c	mov x0,x20
00b04a40	bl 0x00c396a0
00b04a44	str x0,[x19, #0x8]
00b04a48	cbz x0,0x00b04a8c
00b04a4c	ldr x8,[sp, #0x8]
00b04a50	str w8,[x19]
00b04a54	b 0x00b04a98
00b04a58	bl 0x00c342a0
00b04a5c	adrp x0,0x2c2000
00b04a60	adrp x2,0x2c4000
00b04a64	add x0,x0,#0x5ae
00b04a68	add x2,x2,#0x34f
00b04a6c	mov w1,#0x28
00b04a70	bl 0x00c342b0
00b04a74	mov w1,#0x100
00b04a78	mov w0,#0x22
00b04a7c	movk w1,#0xc, LSL #16
00b04a80	mov x2,xzr
00b04a84	bl 0x00c342c0
00b04a88	b 0x00b04a98
00b04a8c	mov x0,x19
00b04a90	bl 0x00c35530
00b04a94	mov x19,xzr
00b04a98	mov x0,x19
00b04a9c	ldp x29,x30,[sp, #0x20]
00b04aa0	ldp x20,x19,[sp, #0x10]
00b04aa4	add sp,sp,#0x30
00b04aa8	ret
