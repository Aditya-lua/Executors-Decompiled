; FUN_00ae8f98 @ 00ae8f98
00ae8f98	sub sp,sp,#0x40
00ae8f9c	stp x22,x21,[sp, #0x10]
00ae8fa0	stp x20,x19,[sp, #0x20]
00ae8fa4	stp x29,x30,[sp, #0x30]
00ae8fa8	add x29,sp,#0x30
00ae8fac	str x1,[sp, #0x8]
00ae8fb0	cbz x0,0x00ae90d0
00ae8fb4	mov x21,x1
00ae8fb8	ldrsw x1,[x0]
00ae8fbc	mov x20,x0
00ae8fc0	cbz w1,0x00ae90d0
00ae8fc4	mov x19,x3
00ae8fc8	ldr x3,[x20, #0x18]
00ae8fcc	cbz x3,0x00ae8fe4
00ae8fd0	ldr w8,[x20, #0x10]
00ae8fd4	mov w22,w2
00ae8fd8	cbz w8,0x00ae9018
00ae8fdc	cbnz x21,0x00ae9038
00ae8fe0	b 0x00ae90d0
00ae8fe4	cmp w1,#0x1
00ae8fe8	b.lt 0x00ae900c
00ae8fec	ldr x8,[x20, #0x8]
00ae8ff0	mov x0,xzr
00ae8ff4	ldr x9,[x8, x0, LSL #0x3]
00ae8ff8	cmp x9,x21
00ae8ffc	b.eq 0x00ae90e8
00ae9000	add x0,x0,#0x1
00ae9004	cmp x0,x1
00ae9008	b.lt 0x00ae8ff4
00ae900c	cbz x19,0x00ae90d0
00ae9010	str wzr,[x19]
00ae9014	b 0x00ae90d0
00ae9018	cmp w1,#0x2
00ae901c	b.lt 0x00ae902c
00ae9020	ldr x0,[x20, #0x8]
00ae9024	mov w2,#0x8
00ae9028	bl 0x00c31d30
00ae902c	mov w8,#0x1
00ae9030	str w8,[x20, #0x10]
00ae9034	cbz x21,0x00ae90d0
00ae9038	ldr x1,[x20, #0x8]
00ae903c	ldr w2,[x20]
00ae9040	ldr x4,[x20, #0x18]
00ae9044	orr w8,w22,#0x2
00ae9048	cmp x19,#0x0
00ae904c	csel w5,w8,w22,ne
00ae9050	add x0,sp,#0x8
00ae9054	mov w3,#0x8
00ae9058	bl 0x00c3de50
00ae905c	mov x21,x0
00ae9060	cbz x19,0x00ae90bc
00ae9064	str wzr,[x19]
00ae9068	cbz x21,0x00ae90d0
00ae906c	ldr x8,[x20, #0x8]
00ae9070	ldrsw x9,[x20]
00ae9074	add x8,x8,x9, LSL #0x3
00ae9078	cmp x8,x21
00ae907c	b.ls 0x00ae90c0
00ae9080	mov x22,x21
00ae9084	ldr x8,[x20, #0x18]
00ae9088	add x0,sp,#0x8
00ae908c	mov x1,x22
00ae9090	blr x8
00ae9094	cbnz w0,0x00ae90bc
00ae9098	ldr w8,[x19]
00ae909c	add x22,x22,#0x8
00ae90a0	add w8,w8,#0x1
00ae90a4	str w8,[x19]
00ae90a8	ldr x8,[x20, #0x8]
00ae90ac	ldrsw x9,[x20]
00ae90b0	add x8,x8,x9, LSL #0x3
00ae90b4	cmp x22,x8
00ae90b8	b.cc 0x00ae9084
00ae90bc	cbz x21,0x00ae90d0
00ae90c0	ldr x8,[x20, #0x8]
00ae90c4	sub x8,x21,x8
00ae90c8	lsr x0,x8,#0x3
00ae90cc	b 0x00ae90d4
00ae90d0	mov w0,#0xffffffff
00ae90d4	ldp x29,x30,[sp, #0x30]
00ae90d8	ldp x20,x19,[sp, #0x20]
00ae90dc	ldp x22,x21,[sp, #0x10]
00ae90e0	add sp,sp,#0x40
00ae90e4	ret
00ae90e8	cbz x19,0x00ae90d4
00ae90ec	mov w8,#0x1
00ae90f0	str w8,[x19]
00ae90f4	b 0x00ae90d4
