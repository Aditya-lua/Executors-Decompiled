; FUN_00a79fd0 @ 00a79fd0
00a79fd0	stp x22,x21,[sp, #-0x30]!
00a79fd4	stp x20,x19,[sp, #0x10]
00a79fd8	stp x29,x30,[sp, #0x20]
00a79fdc	ldr x8,[x0, #0x88]
00a79fe0	ldr x22,[x0, #0x98]
00a79fe4	mov x21,x0
00a79fe8	mov x20,x1
00a79fec	add x29,sp,#0x20
00a79ff0	cbnz x8,0x00a79ffc
00a79ff4	ldr x8,[x22]
00a79ff8	cbz x8,0x00a7a040
00a79ffc	bl 0x00c3a830
00a7a000	cbz x0,0x00a7a094
00a7a004	mov x19,x0
00a7a008	mov w1,#0x198
00a7a00c	mov x0,x20
00a7a010	mov x2,x19
00a7a014	bl 0x00c39b70
00a7a018	cbz w0,0x00a7a034
00a7a01c	ldr x1,[x21, #0x88]
00a7a020	cbz x1,0x00a7a070
00a7a024	mov x0,x20
00a7a028	bl 0x00c32440
00a7a02c	cbnz w0,0x00a7a080
00a7a030	b 0x00a7a094
00a7a034	mov x0,x19
00a7a038	bl 0x00c3a7c0
00a7a03c	b 0x00a7a094
00a7a040	bl 0x00c342a0
00a7a044	adrp x0,0x2c1000
00a7a048	adrp x2,0x2d3000
00a7a04c	add x0,x0,#0xd1f
00a7a050	add x2,x2,#0xba8
00a7a054	mov w1,#0x1ca
00a7a058	bl 0x00c342b0
00a7a05c	mov w0,#0x10
00a7a060	mov w1,#0x8b
00a7a064	mov x2,xzr
00a7a068	bl 0x00c342c0
00a7a06c	b 0x00a7a094
00a7a070	ldr x1,[x22]
00a7a074	mov x0,x19
00a7a078	bl 0x00c3a880
00a7a07c	cbz w0,0x00a7a094
00a7a080	mov x0,x19
00a7a084	ldp x29,x30,[sp, #0x20]
00a7a088	ldp x20,x19,[sp, #0x10]
00a7a08c	ldp x22,x21,[sp], #0x30
00a7a090	b 0x00c3af80
00a7a094	ldp x29,x30,[sp, #0x20]
00a7a098	ldp x20,x19,[sp, #0x10]
00a7a09c	mov w0,wzr
00a7a0a0	ldp x22,x21,[sp], #0x30
00a7a0a4	ret
