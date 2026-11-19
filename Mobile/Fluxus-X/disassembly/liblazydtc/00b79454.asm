; mbedtls_md_hmac_finish @ 00b79454
00b79454	sub sp,sp,#0x90
00b79458	str x23,[sp, #0x50]
00b7945c	stp x22,x21,[sp, #0x60]
00b79460	stp x20,x19,[sp, #0x70]
00b79464	stp x29,x30,[sp, #0x80]
00b79468	add x29,sp,#0x80
00b7946c	mrs x21,tpidr_el0
00b79470	ldr x8,[x21, #0x28]
00b79474	mov x19,x1
00b79478	mov x20,x0
00b7947c	stur x8,[x29, #-0x38]
00b79480	cbz x0,0x00b794f4
00b79484	ldr x8,[x20]
00b79488	cbz x8,0x00b794f4
00b7948c	ldr x22,[x20, #0x10]
00b79490	cbz x22,0x00b794f4
00b79494	ldrb w23,[x8, #0x5]
00b79498	add x1,sp,#0x8
00b7949c	mov x0,x20
00b794a0	bl 0x00c42820
00b794a4	cbnz w0,0x00b794f8
00b794a8	mov x0,x20
00b794ac	bl 0x00c42860
00b794b0	cbnz w0,0x00b794f8
00b794b4	ldr x8,[x20]
00b794b8	add x1,x22,x23
00b794bc	mov x0,x20
00b794c0	ldrb w2,[x8, #0x5]
00b794c4	bl 0x00c42870
00b794c8	cbnz w0,0x00b794f8
00b794cc	ldr x8,[x20]
00b794d0	add x1,sp,#0x8
00b794d4	mov x0,x20
00b794d8	ldrb w2,[x8, #0x4]
00b794dc	bl 0x00c42870
00b794e0	cbnz w0,0x00b794f8
00b794e4	mov x0,x20
00b794e8	mov x1,x19
00b794ec	bl 0x00c42820
00b794f0	b 0x00b794f8
00b794f4	mov w0,#0xffffaf00
00b794f8	ldr x8,[x21, #0x28]
00b794fc	ldur x9,[x29, #-0x38]
00b79500	cmp x8,x9
00b79504	b.ne 0x00b79520
00b79508	ldp x29,x30,[sp, #0x80]
00b7950c	ldp x20,x19,[sp, #0x70]
00b79510	ldp x22,x21,[sp, #0x60]
00b79514	ldr x23,[sp, #0x50]
00b79518	add sp,sp,#0x90
00b7951c	ret
00b79520	bl 0x00c2fec0
