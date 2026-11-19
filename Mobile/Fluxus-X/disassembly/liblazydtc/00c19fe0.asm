; FUN_00c19fe0 @ 00c19fe0
00c19fe0	paciasp
00c19fe4	stp x29,x30,[sp, #-0x40]!
00c19fe8	stp x24,x23,[sp, #0x10]
00c19fec	stp x22,x21,[sp, #0x20]
00c19ff0	stp x20,x19,[sp, #0x30]
00c19ff4	mov x29,sp
00c19ff8	ldr x24,[x0, #0x1330]
00c19ffc	mov x21,x4
00c1a000	mov x20,x3
00c1a004	mov x19,x2
00c1a008	mov x22,x1
00c1a00c	ldr x8,[x24, #0x8]
00c1a010	sub x9,x8,#0xfc0
00c1a014	cmn x9,#0xff1
00c1a018	b.hi 0x00c1a03c
00c1a01c	mov x23,x0
00c1a020	mov w0,#0x1000
00c1a024	bl 0x00c308d0
00c1a028	cbz x0,0x00c1a0a8
00c1a02c	mov x8,xzr
00c1a030	stp x24,xzr,[x0]
00c1a034	mov x24,x0
00c1a038	str x0,[x23, #0x1330]
00c1a03c	add x9,x8,#0x30
00c1a040	add x0,x24,x8
00c1a044	ldr x8,[x22]
00c1a048	str x9,[x24, #0x8]
00c1a04c	adrp x9,0xcb1000
00c1a050	add x9,x9,#0xa18
00c1a054	str x9,[x0, #0x10]!
00c1a058	ldurh w9,[x0, #0x9]
00c1a05c	mov w10,#0x36
00c1a060	ldrh w11,[x21]
00c1a064	strb w10,[x0, #0x8]
00c1a068	ldr x10,[x20]
00c1a06c	str x8,[x0, #0x10]
00c1a070	and w8,w9,#0xf000
00c1a074	mov w9,#0x540
00c1a078	bfxil w8,w11,#0x0,#0x6
00c1a07c	ldr q0,[x19]
00c1a080	orr w8,w8,w9
00c1a084	stur q0,[x0, #0x18]
00c1a088	sturh w8,[x0, #0x9]
00c1a08c	str x10,[x0, #0x28]
00c1a090	ldp x20,x19,[sp, #0x30]
00c1a094	ldp x22,x21,[sp, #0x20]
00c1a098	ldp x24,x23,[sp, #0x10]
00c1a09c	ldp x29,x30,[sp], #0x40
00c1a0a0	autiasp
00c1a0a4	ret
00c1a0a8	bl 0x00c2fff0
