; mbedtls_ecdh_read_public @ 00b9b444
00b9b444	sub sp,sp,#0x40
00b9b448	str x21,[sp, #0x10]
00b9b44c	stp x20,x19,[sp, #0x20]
00b9b450	stp x29,x30,[sp, #0x30]
00b9b454	add x29,sp,#0x30
00b9b458	mrs x21,tpidr_el0
00b9b45c	ldr x8,[x21, #0x28]
00b9b460	mov x19,x2
00b9b464	mov x20,x1
00b9b468	str x8,[sp, #0x8]
00b9b46c	ldr w8,[x0, #0x8]
00b9b470	cmp w8,#0x1
00b9b474	b.ne 0x00b9b4b0
00b9b478	add x8,x0,#0x10
00b9b47c	add x1,x0,#0x110
00b9b480	mov x2,sp
00b9b484	mov x0,x8
00b9b488	mov x3,x19
00b9b48c	str x20,[sp]
00b9b490	bl 0x00c427c0
00b9b494	cbnz w0,0x00b9b4b4
00b9b498	ldr x8,[sp]
00b9b49c	sub x8,x8,x20
00b9b4a0	cmp x8,x19
00b9b4a4	mov w8,#0xffffb080
00b9b4a8	csel w0,wzr,w8,eq
00b9b4ac	b 0x00b9b4b4
00b9b4b0	mov w0,#0xffffb080
00b9b4b4	ldr x8,[x21, #0x28]
00b9b4b8	ldr x9,[sp, #0x8]
00b9b4bc	cmp x8,x9
00b9b4c0	b.ne 0x00b9b4d8
00b9b4c4	ldp x29,x30,[sp, #0x30]
00b9b4c8	ldp x20,x19,[sp, #0x20]
00b9b4cc	ldr x21,[sp, #0x10]
00b9b4d0	add sp,sp,#0x40
00b9b4d4	ret
00b9b4d8	bl 0x00c2fec0
