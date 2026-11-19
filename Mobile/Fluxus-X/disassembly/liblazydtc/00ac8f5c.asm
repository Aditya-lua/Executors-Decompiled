; RAND_set_seed_source_type @ 00ac8f5c
00ac8f5c	str x21,[sp, #-0x30]!
00ac8f60	stp x20,x19,[sp, #0x10]
00ac8f64	mov x20,x2
00ac8f68	adrp x2,0xc7c000
00ac8f6c	mov x21,x1
00ac8f70	add x2,x2,#0xa38
00ac8f74	mov w1,#0x5
00ac8f78	stp x29,x30,[sp, #0x20]
00ac8f7c	add x29,sp,#0x20
00ac8f80	bl 0x00c3b520
00ac8f84	cbz x0,0x00ac9068
00ac8f88	ldr x8,[x0, #0x10]
00ac8f8c	mov x19,x0
00ac8f90	cbz x8,0x00ac8fbc
00ac8f94	bl 0x00c342a0
00ac8f98	adrp x0,0x2da000
00ac8f9c	adrp x2,0x2b2000
00ac8fa0	add x0,x0,#0x554
00ac8fa4	add x2,x2,#0xa5b
00ac8fa8	mov w1,#0x34b
00ac8fac	bl 0x00c342b0
00ac8fb0	orr w0,wzr,#0xf
00ac8fb4	mov w1,#0x67
00ac8fb8	b 0x00ac905c
00ac8fbc	cbz x21,0x00ac8fdc
00ac8fc0	adrp x1,0x2da000
00ac8fc4	add x1,x1,#0x554
00ac8fc8	mov w2,#0x2e6
00ac8fcc	mov x0,x21
00ac8fd0	bl 0x00c34600
00ac8fd4	mov x21,x0
00ac8fd8	cbz x0,0x00ac9034
00ac8fdc	ldr x0,[x19, #0x40]
00ac8fe0	adrp x1,0x2da000
00ac8fe4	add x1,x1,#0x554
00ac8fe8	mov w2,#0x2ec
00ac8fec	bl 0x00c32310
00ac8ff0	str x21,[x19, #0x40]
00ac8ff4	cbz x20,0x00ac9014
00ac8ff8	adrp x1,0x2da000
00ac8ffc	add x1,x1,#0x554
00ac9000	mov w2,#0x2e6
00ac9004	mov x0,x20
00ac9008	bl 0x00c34600
00ac900c	mov x20,x0
00ac9010	cbz x0,0x00ac9034
00ac9014	ldr x0,[x19, #0x48]
00ac9018	adrp x1,0x2da000
00ac901c	add x1,x1,#0x554
00ac9020	mov w2,#0x2ec
00ac9024	bl 0x00c32310
00ac9028	mov w0,#0x1
00ac902c	str x20,[x19, #0x48]
00ac9030	b 0x00ac9068
00ac9034	bl 0x00c342a0
00ac9038	adrp x0,0x2da000
00ac903c	adrp x2,0x2a0000
00ac9040	add x0,x0,#0x554
00ac9044	add x2,x2,#0xb70
00ac9048	mov w1,#0x2e8
00ac904c	bl 0x00c342b0
00ac9050	mov w1,#0x100
00ac9054	orr w0,wzr,#0xf
00ac9058	movk w1,#0xc, LSL #16
00ac905c	mov x2,xzr
00ac9060	bl 0x00c342c0
00ac9064	mov w0,wzr
00ac9068	ldp x29,x30,[sp, #0x20]
00ac906c	ldp x20,x19,[sp, #0x10]
00ac9070	ldr x21,[sp], #0x30
00ac9074	ret
