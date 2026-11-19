; SSL_dup_CA_list @ 009acd28
009acd28	stp x22,x21,[sp, #-0x30]!
009acd2c	stp x20,x19,[sp, #0x10]
009acd30	stp x29,x30,[sp, #0x20]
009acd34	add x29,sp,#0x20
009acd38	mov x20,x0
009acd3c	bl 0x00c325e0
009acd40	mov w21,w0
009acd44	mov x0,xzr
009acd48	mov w1,w21
009acd4c	bl 0x00c34790
009acd50	mov x19,x0
009acd54	cbz x0,0x009acd94
009acd58	cmp w21,#0x1
009acd5c	b.lt 0x009ace0c
009acd60	mov w22,wzr
009acd64	mov x0,x20
009acd68	mov w1,w22
009acd6c	bl 0x00c32610
009acd70	bl 0x00c34f50
009acd74	cbz x0,0x009acdc8
009acd78	mov x1,x0
009acd7c	mov x0,x19
009acd80	bl 0x00c347a0
009acd84	add w22,w22,#0x1
009acd88	cmp w22,w21
009acd8c	b.lt 0x009acd64
009acd90	b 0x009ace0c
009acd94	bl 0x00c342a0
009acd98	adrp x0,0x2d5000
009acd9c	adrp x2,0x2bd000
009acda0	add x0,x0,#0x6b3
009acda4	add x2,x2,#0x48b
009acda8	mov w1,#0x1e7
009acdac	bl 0x00c342b0
009acdb0	mov w1,#0x100
009acdb4	mov w0,#0x14
009acdb8	movk w1,#0xc, LSL #16
009acdbc	mov x2,xzr
009acdc0	bl 0x00c342c0
009acdc4	b 0x009ace0c
009acdc8	bl 0x00c342a0
009acdcc	adrp x0,0x2d5000
009acdd0	adrp x2,0x2bd000
009acdd4	add x0,x0,#0x6b3
009acdd8	add x2,x2,#0x48b
009acddc	mov w1,#0x1ed
009acde0	bl 0x00c342b0
009acde4	mov w1,#0x100
009acde8	mov w0,#0x14
009acdec	movk w1,#0xc, LSL #16
009acdf0	mov x2,xzr
009acdf4	bl 0x00c342c0
009acdf8	adrp x1,0xcb5000
009acdfc	ldr x1,[x1, #0x140]
009ace00	mov x0,x19
009ace04	bl 0x00c32600
009ace08	mov x19,xzr
009ace0c	mov x0,x19
009ace10	ldp x29,x30,[sp, #0x20]
009ace14	ldp x20,x19,[sp, #0x10]
009ace18	ldp x22,x21,[sp], #0x30
009ace1c	ret
