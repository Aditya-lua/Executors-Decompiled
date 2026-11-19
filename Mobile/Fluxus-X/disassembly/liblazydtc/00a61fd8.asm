; OSSL_ENCODER_to_data @ 00a61fd8
00a61fd8	sub sp,sp,#0x40
00a61fdc	stp x22,x21,[sp, #0x10]
00a61fe0	stp x20,x19,[sp, #0x20]
00a61fe4	stp x29,x30,[sp, #0x30]
00a61fe8	add x29,sp,#0x30
00a61fec	str xzr,[sp, #0x8]
00a61ff0	cbz x2,0x00a6206c
00a61ff4	mov x21,x2
00a61ff8	mov x20,x1
00a61ffc	mov x22,x0
00a62000	bl 0x00c32280
00a62004	bl 0x00c32240
00a62008	mov x19,x0
00a6200c	cbz x0,0x00a62064
00a62010	mov x0,x22
00a62014	mov x1,x19
00a62018	bl 0x00a61a4c
00a6201c	cbz w0,0x00a62064
00a62020	mov w1,#0x73
00a62024	add x3,sp,#0x8
00a62028	mov x0,x19
00a6202c	mov x2,xzr
00a62030	bl 0x00c321a0
00a62034	cmp x0,#0x1
00a62038	b.lt 0x00a62064
00a6203c	cbz x20,0x00a620a4
00a62040	ldr x8,[x20]
00a62044	cbz x8,0x00a620b4
00a62048	ldr x8,[sp, #0x8]
00a6204c	ldr x9,[x21]
00a62050	mov w22,wzr
00a62054	ldr x10,[x8]
00a62058	subs x9,x9,x10
00a6205c	b.cs 0x00a620bc
00a62060	b 0x00a620f8
00a62064	mov w22,wzr
00a62068	b 0x00a620f8
00a6206c	bl 0x00c342a0
00a62070	adrp x0,0x2a0000
00a62074	adrp x2,0x2cb000
00a62078	add x0,x0,#0x26d
00a6207c	add x2,x2,#0x957
00a62080	mov w1,#0x68
00a62084	bl 0x00c342b0
00a62088	mov w1,#0x102
00a6208c	mov w0,#0x3b
00a62090	movk w1,#0xc, LSL #16
00a62094	mov x2,xzr
00a62098	bl 0x00c342c0
00a6209c	mov w22,wzr
00a620a0	b 0x00a62100
00a620a4	ldr x8,[sp, #0x8]
00a620a8	ldr x8,[x8]
00a620ac	str x8,[x21]
00a620b0	b 0x00a620f4
00a620b4	ldr x8,[sp, #0x8]
00a620b8	ldr x9,[x8]
00a620bc	str x9,[x21]
00a620c0	ldr x0,[x20]
00a620c4	cbz x0,0x00a620e8
00a620c8	ldp x2,x1,[x8]
00a620cc	bl 0x00c2ffd0
00a620d0	ldr x8,[sp, #0x8]
00a620d4	ldr x9,[x20]
00a620d8	ldr x8,[x8]
00a620dc	add x8,x9,x8
00a620e0	str x8,[x20]
00a620e4	b 0x00a620f4
00a620e8	ldr x9,[x8, #0x8]
00a620ec	str x9,[x20]
00a620f0	str xzr,[x8, #0x8]
00a620f4	mov w22,#0x1
00a620f8	mov x0,x19
00a620fc	bl 0x00c31a40
00a62100	mov w0,w22
00a62104	ldp x29,x30,[sp, #0x30]
00a62108	ldp x20,x19,[sp, #0x20]
00a6210c	ldp x22,x21,[sp, #0x10]
00a62110	add sp,sp,#0x40
00a62114	ret
