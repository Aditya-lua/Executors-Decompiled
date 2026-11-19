; __cxa_begin_catch @ 00c2937c
00c2937c	paciasp
00c29380	str x30,[sp, #-0x20]!
00c29384	stp x20,x19,[sp, #0x10]
00c29388	ldr x20,[x0]
00c2938c	mov x19,x0
00c29390	bl 0x00c44720
00c29394	mov x8,#0x2b2b
00c29398	movk x8,#0x4743, LSL #16
00c2939c	movk x8,#0x4c4e, LSL #32
00c293a0	movk x8,#0x43, LSL #48
00c293a4	cmp x8,x20, LSR #0x8
00c293a8	sub x8,x19,#0x60
00c293ac	b.ne 0x00c293ec
00c293b0	ldur w10,[x19, #-0x28]
00c293b4	ldr x9,[x0]
00c293b8	cmp w10,#0x0
00c293bc	cneg w10,w10,mi
00c293c0	cmp x8,x9
00c293c4	add w10,w10,#0x1
00c293c8	stur w10,[x19, #-0x28]
00c293cc	b.eq 0x00c293d8
00c293d0	stur x9,[x19, #-0x30]
00c293d4	str x8,[x0]
00c293d8	ldr w8,[x0, #0x8]
00c293dc	sub w9,w8,#0x1
00c293e0	ldur x8,[x19, #-0x8]
00c293e4	str w9,[x0, #0x8]
00c293e8	b 0x00c293fc
00c293ec	ldr x9,[x0]
00c293f0	cbnz x9,0x00c29410
00c293f4	str x8,[x0]
00c293f8	add x8,x19,#0x20
00c293fc	ldp x20,x19,[sp, #0x10]
00c29400	mov x0,x8
00c29404	ldr x30,[sp], #0x20
00c29408	autiasp
00c2940c	ret
00c29410	bl 0x00c2fff0
