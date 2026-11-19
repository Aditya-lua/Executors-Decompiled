; engine_pkey_asn1_meths_free @ 00a528d4
00a528d4	ldr x8,[x0, #0x50]
00a528d8	cbz x8,0x00a52958
00a528dc	sub sp,sp,#0x40
00a528e0	add x2,sp,#0x8
00a528e4	mov x1,xzr
00a528e8	mov w3,wzr
00a528ec	str x21,[sp, #0x10]
00a528f0	stp x20,x19,[sp, #0x20]
00a528f4	stp x29,x30,[sp, #0x30]
00a528f8	add x29,sp,#0x30
00a528fc	mov x19,x0
00a52900	blr x8
00a52904	cmp w0,#0x1
00a52908	b.lt 0x00a52948
00a5290c	mov x20,xzr
00a52910	mov w21,w0
00a52914	ldr x8,[sp, #0x8]
00a52918	ldr x9,[x19, #0x50]
00a5291c	add x1,sp,#0x18
00a52920	mov x0,x19
00a52924	ldr w3,[x8, x20, LSL #0x2]
00a52928	mov x2,xzr
00a5292c	blr x9
00a52930	cbz w0,0x00a5293c
00a52934	ldr x0,[sp, #0x18]
00a52938	bl 0x00c37b60
00a5293c	add x20,x20,#0x1
00a52940	cmp x21,x20
00a52944	b.ne 0x00a52914
00a52948	ldp x29,x30,[sp, #0x30]
00a5294c	ldp x20,x19,[sp, #0x20]
00a52950	ldr x21,[sp, #0x10]
00a52954	add sp,sp,#0x40
00a52958	ret
