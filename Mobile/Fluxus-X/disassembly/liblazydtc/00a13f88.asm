; SCT_set1_extensions @ 00a13f88
00a13f88	stp x22,x21,[sp, #-0x30]!
00a13f8c	stp x20,x19,[sp, #0x10]
00a13f90	stp x29,x30,[sp, #0x20]
00a13f94	mov x22,x0
00a13f98	mov x20,x0
00a13f9c	ldr x0,[x22, #0x30]!
00a13fa0	mov x21,x1
00a13fa4	adrp x1,0x2a7000
00a13fa8	mov x19,x2
00a13fac	add x1,x1,#0xdc3
00a13fb0	mov w2,#0x99
00a13fb4	add x29,sp,#0x20
00a13fb8	bl 0x00c32310
00a13fbc	mov w0,#0x1
00a13fc0	str wzr,[x22, #0x30]
00a13fc4	stp xzr,xzr,[x22]
00a13fc8	cbz x21,0x00a14030
00a13fcc	cbz x19,0x00a14030
00a13fd0	adrp x2,0x2a7000
00a13fd4	add x2,x2,#0xdc3
00a13fd8	mov w3,#0x9f
00a13fdc	mov x0,x21
00a13fe0	mov x1,x19
00a13fe4	bl 0x00c345f0
00a13fe8	str x0,[x22]
00a13fec	cbz x0,0x00a13ffc
00a13ff0	mov w0,#0x1
00a13ff4	str x19,[x20, #0x38]
00a13ff8	b 0x00a14030
00a13ffc	bl 0x00c342a0
00a14000	adrp x0,0x2a7000
00a14004	adrp x2,0x2c3000
00a14008	add x0,x0,#0xdc3
00a1400c	add x2,x2,#0x79d
00a14010	mov w1,#0xa1
00a14014	bl 0x00c342b0
00a14018	mov w1,#0x100
00a1401c	mov w0,#0x32
00a14020	movk w1,#0xc, LSL #16
00a14024	mov x2,xzr
00a14028	bl 0x00c342c0
00a1402c	mov w0,wzr
00a14030	ldp x29,x30,[sp, #0x20]
00a14034	ldp x20,x19,[sp, #0x10]
00a14038	ldp x22,x21,[sp], #0x30
00a1403c	ret
