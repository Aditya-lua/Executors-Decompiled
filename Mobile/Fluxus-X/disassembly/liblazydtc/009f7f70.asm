; ossl_asn1_enc_save @ 009f7f70
009f7f70	str x21,[sp, #-0x30]!
009f7f74	stp x20,x19,[sp, #0x10]
009f7f78	mov w20,w2
009f7f7c	stp x29,x30,[sp, #0x20]
009f7f80	add x29,sp,#0x20
009f7f84	cbz x0,0x009f8000
009f7f88	ldr x8,[x0]
009f7f8c	cbz x8,0x009f8000
009f7f90	ldr x9,[x3, #0x20]
009f7f94	cbz x9,0x009f8000
009f7f98	ldrb w10,[x9, #0x8]
009f7f9c	tbz w10,#0x1,0x009f8000
009f7fa0	ldrsw x9,[x9, #0x20]
009f7fa4	adds x21,x8,x9
009f7fa8	b.eq 0x009f8000
009f7fac	ldr x0,[x21]
009f7fb0	mov x19,x1
009f7fb4	adrp x1,0x2c3000
009f7fb8	add x1,x1,#0x6e8
009f7fbc	mov w2,#0xa8
009f7fc0	bl 0x00c32310
009f7fc4	cmp w20,#0x1
009f7fc8	b.lt 0x009f8014
009f7fcc	sxtw x20,w20
009f7fd0	adrp x1,0x2c3000
009f7fd4	add x1,x1,#0x6e8
009f7fd8	mov w2,#0xab
009f7fdc	mov x0,x20
009f7fe0	bl 0x00c32320
009f7fe4	str x0,[x21]
009f7fe8	cbz x0,0x009f801c
009f7fec	mov x1,x19
009f7ff0	mov x2,x20
009f7ff4	bl 0x00c2ffd0
009f7ff8	str x20,[x21, #0x8]
009f7ffc	str wzr,[x21, #0x10]
009f8000	mov w0,#0x1
009f8004	ldp x29,x30,[sp, #0x20]
009f8008	ldp x20,x19,[sp, #0x10]
009f800c	ldr x21,[sp], #0x30
009f8010	ret
009f8014	mov w0,wzr
009f8018	b 0x009f8004
009f801c	bl 0x00c342a0
009f8020	adrp x0,0x2c3000
009f8024	adrp x2,0x2ab000
009f8028	add x0,x0,#0x6e8
009f802c	add x2,x2,#0xe0c
009f8030	mov w1,#0xac
009f8034	bl 0x00c342b0
009f8038	mov w1,#0x100
009f803c	mov w0,#0xd
009f8040	movk w1,#0xc, LSL #16
009f8044	mov x2,xzr
009f8048	bl 0x00c342c0
009f804c	mov w0,wzr
009f8050	b 0x009f8004
