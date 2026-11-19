; X509v3_asid_is_canonical @ 00af9478
00af9478	str x19,[sp, #-0x20]!
00af947c	stp x29,x30,[sp, #0x10]
00af9480	add x29,sp,#0x10
00af9484	cbz x0,0x00af94ac
00af9488	mov x19,x0
00af948c	ldr x0,[x0]
00af9490	bl 0x00af94bc
00af9494	cbz w0,0x00af94b0
00af9498	ldr x0,[x19, #0x8]
00af949c	bl 0x00af94bc
00af94a0	cmp w0,#0x0
00af94a4	cset w0,ne
00af94a8	b 0x00af94b0
00af94ac	mov w0,#0x1
00af94b0	ldp x29,x30,[sp, #0x10]
00af94b4	ldr x19,[sp], #0x20
00af94b8	ret
