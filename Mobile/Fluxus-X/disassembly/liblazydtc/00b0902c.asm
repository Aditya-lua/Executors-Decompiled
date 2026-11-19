; X509_NAME_hash_ex @ 00b0902c
00b0902c	sub sp,sp,#0x50
00b09030	mov x8,x1
00b09034	adrp x1,0x2d1000
00b09038	stp x22,x21,[sp, #0x20]
00b0903c	mov x22,x0
00b09040	add x1,x1,#0x42e
00b09044	mov x0,x8
00b09048	stp x20,x19,[sp, #0x30]
00b0904c	stp x29,x30,[sp, #0x40]
00b09050	add x29,sp,#0x40
00b09054	mov x20,x3
00b09058	bl 0x00c357f0
00b0905c	mov x19,x0
00b09060	mov x0,x22
00b09064	mov x1,xzr
00b09068	bl 0x00c350f0
00b0906c	cbz x20,0x00b09074
00b09070	str wzr,[x20]
00b09074	cbz x19,0x00b090cc
00b09078	mov x21,xzr
00b0907c	tbnz w0,#0x1f,0x00b090d0
00b09080	ldr x0,[x22, #0x18]
00b09084	ldrsw x1,[x22, #0x20]
00b09088	add x2,sp,#0xc
00b0908c	mov x3,xzr
00b09090	mov x4,x19
00b09094	mov x5,xzr
00b09098	bl 0x00c370c0
00b0909c	cbz w0,0x00b090cc
00b090a0	ldrb w21,[sp, #0xc]
00b090a4	ldrb w8,[sp, #0xd]
00b090a8	ldrb w9,[sp, #0xe]
00b090ac	ldrb w10,[sp, #0xf]
00b090b0	bfm x21,x8,#0x38,#0x7
00b090b4	bfm x21,x9,#0x30,#0x7
00b090b8	bfm x21,x10,#0x28,#0x7
00b090bc	cbz x20,0x00b090d0
00b090c0	mov w8,#0x1
00b090c4	str w8,[x20]
00b090c8	b 0x00b090d0
00b090cc	mov x21,xzr
00b090d0	mov x0,x19
00b090d4	bl 0x00c35800
00b090d8	mov x0,x21
00b090dc	ldp x29,x30,[sp, #0x40]
00b090e0	ldp x20,x19,[sp, #0x30]
00b090e4	ldp x22,x21,[sp, #0x20]
00b090e8	add sp,sp,#0x50
00b090ec	ret
