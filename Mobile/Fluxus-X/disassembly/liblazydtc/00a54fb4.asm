; ERR_set_error_data @ 00a54fb4
00a54fb4	stp x20,x19,[sp, #-0x20]!
00a54fb8	stp x29,x30,[sp, #0x10]
00a54fbc	add x29,sp,#0x10
00a54fc0	mov w19,w1
00a54fc4	mov x20,x0
00a54fc8	bl 0x00c2ff50
00a54fcc	ldp x29,x30,[sp, #0x10]
00a54fd0	add x1,x0,#0x1
00a54fd4	mov w3,#0x1
00a54fd8	mov x0,x20
00a54fdc	mov w2,w19
00a54fe0	ldp x20,x19,[sp], #0x20
00a54fe4	b 0x00a54fe8
00a54fe8	str x25,[sp, #-0x50]!
00a54fec	stp x24,x23,[sp, #0x10]
00a54ff0	stp x22,x21,[sp, #0x20]
00a54ff4	stp x20,x19,[sp, #0x30]
00a54ff8	stp x29,x30,[sp, #0x40]
00a54ffc	add x29,sp,#0x40
00a55000	mov w23,w3
00a55004	mov w19,w2
00a55008	mov x20,x1
00a5500c	mov x21,x0
00a55010	bl 0x00a54260
00a55014	cbz x0,0x00a550c4
00a55018	ldrsw x9,[x0, #0x380]
00a5501c	mov x22,x0
00a55020	add x24,x0,x9, LSL #0x2
00a55024	ldrb w8,[x24, #0x200]
00a55028	tbnz w8,#0x0,0x00a55040
00a5502c	mov w8,wzr
00a55030	add x9,x22,x9, LSL #0x3
00a55034	str xzr,[x9, #0x100]
00a55038	str xzr,[x9, #0x180]
00a5503c	b 0x00a5507c
00a55040	add x25,x22,x9, LSL #0x3
00a55044	ldr x0,[x25, #0x100]
00a55048	cbz w23,0x00a55070
00a5504c	adrp x1,0x2d3000
00a55050	add x1,x1,#0xaa2
00a55054	orr w2,wzr,#0x18
00a55058	add x23,x25,#0x100
00a5505c	bl 0x00c32310
00a55060	mov w8,wzr
00a55064	str xzr,[x23]
00a55068	str xzr,[x25, #0x180]
00a5506c	b 0x00a5507c
00a55070	cbz x0,0x00a55084
00a55074	strb wzr,[x0]
00a55078	mov w8,#0x1
00a5507c	add x9,x24,#0x200
00a55080	str w8,[x9]
00a55084	ldrsw x8,[x22, #0x380]
00a55088	add x9,x22,x8, LSL #0x2
00a5508c	ldrb w10,[x9, #0x200]
00a55090	add x22,x22,x8, LSL #0x3
00a55094	add x23,x9,#0x200
00a55098	add x24,x22,#0x100
00a5509c	tbz w10,#0x0,0x00a550b4
00a550a0	ldr x0,[x24]
00a550a4	adrp x1,0x2d3000
00a550a8	add x1,x1,#0xaa2
00a550ac	mov w2,#0x49
00a550b0	bl 0x00c32310
00a550b4	mov w0,#0x1
00a550b8	str x21,[x24]
00a550bc	str x20,[x22, #0x180]
00a550c0	str w19,[x23]
00a550c4	ldp x29,x30,[sp, #0x40]
00a550c8	ldp x20,x19,[sp, #0x30]
00a550cc	ldp x22,x21,[sp, #0x20]
00a550d0	ldp x24,x23,[sp, #0x10]
00a550d4	ldr x25,[sp], #0x50
00a550d8	ret
