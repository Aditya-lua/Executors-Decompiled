; ECPKParameters_print_fp @ 00a36f90
00a36f90	stp x22,x21,[sp, #-0x30]!
00a36f94	stp x20,x19,[sp, #0x10]
00a36f98	stp x29,x30,[sp, #0x20]
00a36f9c	add x29,sp,#0x20
00a36fa0	mov w19,w2
00a36fa4	mov x20,x1
00a36fa8	mov x22,x0
00a36fac	bl 0x00c32270
00a36fb0	bl 0x00c32240
00a36fb4	cbz x0,0x00a36ff0
00a36fb8	mov w1,#0x6a
00a36fbc	mov x2,xzr
00a36fc0	mov x3,x22
00a36fc4	mov x21,x0
00a36fc8	bl 0x00c321a0
00a36fcc	mov x0,x21
00a36fd0	mov x1,x20
00a36fd4	mov w2,w19
00a36fd8	bl 0x00a37034
00a36fdc	mov w19,w0
00a36fe0	mov x0,x21
00a36fe4	bl 0x00c31a40
00a36fe8	mov w0,w19
00a36fec	b 0x00a37024
00a36ff0	bl 0x00c342a0
00a36ff4	adrp x0,0x2d9000
00a36ff8	adrp x2,0x2cf000
00a36ffc	add x0,x0,#0xb76
00a37000	add x2,x2,#0xab7
00a37004	mov w1,#0x1b
00a37008	bl 0x00c342b0
00a3700c	mov w1,#0x7
00a37010	mov w0,#0x10
00a37014	movk w1,#0x8, LSL #16
00a37018	mov x2,xzr
00a3701c	bl 0x00c342c0
00a37020	mov w0,wzr
00a37024	ldp x29,x30,[sp, #0x20]
00a37028	ldp x20,x19,[sp, #0x10]
00a3702c	ldp x22,x21,[sp], #0x30
00a37030	ret
