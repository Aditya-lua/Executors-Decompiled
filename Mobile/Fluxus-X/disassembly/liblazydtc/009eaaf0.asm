; tls_process_next_proto @ 009eaaf0
009eaaf0	str x21,[sp, #-0x30]!
009eaaf4	stp x20,x19,[sp, #0x10]
009eaaf8	stp x29,x30,[sp, #0x20]
009eaafc	ldr x8,[x1, #0x8]
009eab00	mov x19,x0
009eab04	add x29,sp,#0x20
009eab08	cbz x8,0x009eab4c
009eab0c	ldr x21,[x1]
009eab10	sub x8,x8,#0x1
009eab14	ldrb w20,[x21], #0x1
009eab18	subs x9,x8,x20
009eab1c	b.cc 0x009eab4c
009eab20	add x8,x21,x20
009eab24	stp x8,x9,[x1]
009eab28	b.eq 0x009eab4c
009eab2c	ldrb w10,[x8]
009eab30	sub x9,x9,#0x1
009eab34	subs x9,x9,x10
009eab38	b.cc 0x009eab4c
009eab3c	add x8,x8,x10
009eab40	add x8,x8,#0x1
009eab44	stp x8,x9,[x1]
009eab48	b.eq 0x009eab90
009eab4c	bl 0x00c342a0
009eab50	adrp x0,0x2bd000
009eab54	adrp x2,0x2a2000
009eab58	add x0,x0,#0x74c
009eab5c	add x2,x2,#0xe8
009eab60	orr w1,wzr,#0xff0
009eab64	bl 0x00c342b0
009eab68	mov w1,#0x32
009eab6c	mov w2,#0x9f
009eab70	mov x0,x19
009eab74	mov x3,xzr
009eab78	bl 0x00c34410
009eab7c	mov w0,wzr
009eab80	ldp x29,x30,[sp, #0x20]
009eab84	ldp x20,x19,[sp, #0x10]
009eab88	ldr x21,[sp], #0x30
009eab8c	ret
009eab90	ldr x0,[x19, #0xb18]
009eab94	adrp x1,0x2d1000
009eab98	add x1,x1,#0x573
009eab9c	mov w2,#0x1c6
009eaba0	bl 0x00c32310
009eaba4	str xzr,[x19, #0xb18]
009eaba8	cbz w20,0x009eabfc
009eabac	adrp x2,0x2d1000
009eabb0	add x2,x2,#0x573
009eabb4	mov w3,#0x1cf
009eabb8	mov x0,x21
009eabbc	mov x1,x20
009eabc0	bl 0x00c345f0
009eabc4	str x0,[x19, #0xb18]
009eabc8	cbnz x0,0x009eac00
009eabcc	str xzr,[x19, #0xb20]
009eabd0	bl 0x00c342a0
009eabd4	adrp x0,0x2bd000
009eabd8	adrp x2,0x2a2000
009eabdc	add x0,x0,#0x74c
009eabe0	add x2,x2,#0xe8
009eabe4	mov w1,#0xff6
009eabe8	bl 0x00c342b0
009eabec	mov w2,#0x103
009eabf0	mov w1,#0x50
009eabf4	movk w2,#0xc, LSL #16
009eabf8	b 0x009eab70
009eabfc	mov x20,xzr
009eac00	orr w0,wzr,#0x3
009eac04	str x20,[x19, #0xb20]
009eac08	b 0x009eab80
