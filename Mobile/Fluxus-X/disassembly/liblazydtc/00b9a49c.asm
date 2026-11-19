; mbedtls_psa_ecp_import_key @ 00b9a49c
00b9a49c	sub sp,sp,#0x60
00b9a4a0	stp x26,x25,[sp, #0x10]
00b9a4a4	stp x24,x23,[sp, #0x20]
00b9a4a8	stp x22,x21,[sp, #0x30]
00b9a4ac	stp x20,x19,[sp, #0x40]
00b9a4b0	stp x29,x30,[sp, #0x50]
00b9a4b4	add x29,sp,#0x50
00b9a4b8	mrs x26,tpidr_el0
00b9a4bc	ldr x8,[x26, #0x28]
00b9a4c0	mov x25,x0
00b9a4c4	mov x20,x4
00b9a4c8	mov x21,x3
00b9a4cc	str x8,[sp, #0x8]
00b9a4d0	str xzr,[sp]
00b9a4d4	ldrh w8,[x0, #0x2]
00b9a4d8	ldrh w0,[x0]
00b9a4dc	mov x3,x2
00b9a4e0	mov x2,x1
00b9a4e4	mov x4,sp
00b9a4e8	mov x1,x8
00b9a4ec	mov x22,x6
00b9a4f0	mov x19,x5
00b9a4f4	bl 0x00c42f80
00b9a4f8	mov w23,w0
00b9a4fc	cbz w0,0x00b9a508
00b9a500	ldr x24,[sp]
00b9a504	b 0x00b9a540
00b9a508	ldr x24,[sp]
00b9a50c	ldrh w0,[x25]
00b9a510	mov w10,#0x4141
00b9a514	mov x2,x21
00b9a518	ldr x8,[x24, #0x80]
00b9a51c	and w9,w0,#0xffffcfff
00b9a520	cmp w9,w10
00b9a524	mov x1,x24
00b9a528	cinc x8,x8,eq
00b9a52c	mov x3,x20
00b9a530	mov x4,x19
00b9a534	str x8,[x22]
00b9a538	bl 0x00c42f40
00b9a53c	mov w23,w0
00b9a540	mov x0,x24
00b9a544	bl 0x00c426e0
00b9a548	mov x0,x24
00b9a54c	bl 0x00c30960
00b9a550	ldr x8,[x26, #0x28]
00b9a554	ldr x9,[sp, #0x8]
00b9a558	cmp x8,x9
00b9a55c	b.ne 0x00b9a580
00b9a560	mov w0,w23
00b9a564	ldp x29,x30,[sp, #0x50]
00b9a568	ldp x20,x19,[sp, #0x40]
00b9a56c	ldp x22,x21,[sp, #0x30]
00b9a570	ldp x24,x23,[sp, #0x20]
00b9a574	ldp x26,x25,[sp, #0x10]
00b9a578	add sp,sp,#0x60
00b9a57c	ret
00b9a580	bl 0x00c2fec0
