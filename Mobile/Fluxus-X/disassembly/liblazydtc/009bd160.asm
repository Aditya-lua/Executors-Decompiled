; FUN_009bd160 @ 009bd160
009bd160	sub sp,sp,#0x40
009bd164	stp x22,x21,[sp, #0x10]
009bd168	stp x20,x19,[sp, #0x20]
009bd16c	mov x20,x7
009bd170	mov x19,x4
009bd174	mov x21,x3
009bd178	mov w22,w1
009bd17c	stp x29,x30,[sp, #0x30]
009bd180	add x29,sp,#0x30
009bd184	stp xzr,xzr,[sp]
009bd188	tbz w2,#0xc,0x009bd194
009bd18c	mov w8,wzr
009bd190	cbnz x6,0x009bd230
009bd194	add x1,sp,#0x8
009bd198	mov x2,sp
009bd19c	bl 0x00c35da0
009bd1a0	cbz w0,0x009bd22c
009bd1a4	ldp x8,x9,[sp]
009bd1a8	str xzr,[x21]
009bd1ac	str xzr,[x19]
009bd1b0	cbz x9,0x009bd21c
009bd1b4	cmp x8,#0x1
009bd1b8	b.lt 0x009bd21c
009bd1bc	sub x10,x8,#0x1
009bd1c0	cmp x10,#0x5
009bd1c4	b.cc 0x009bd21c
009bd1c8	cbz x8,0x009bd230
009bd1cc	and x10,x8,#-0x2
009bd1d0	cmp x10,#0x6
009bd1d4	b.eq 0x009bd21c
009bd1d8	ldrb w11,[x9, #0x6]
009bd1dc	ldrb w10,[x9, #0x7]
009bd1e0	sub x8,x8,#0x8
009bd1e4	bfm x10,x11,#0x38,#0x7
009bd1e8	subs x8,x8,x10
009bd1ec	b.cc 0x009bd21c
009bd1f0	ldrb w11,[x9, #0x4]
009bd1f4	ldrb w12,[x9, #0x5]
009bd1f8	bfm w12,w11,#0x18,#0x7
009bd1fc	add x11,x9,#0x8
009bd200	cmp w12,w22
009bd204	add x9,x11,x10
009bd208	b.ne 0x009bd1bc
009bd20c	mov w8,#0x1
009bd210	str x11,[x21]
009bd214	str x10,[x19]
009bd218	b 0x009bd230
009bd21c	mov w8,#0x50
009bd220	str w8,[x20]
009bd224	mov w8,#0xffffffff
009bd228	b 0x009bd230
009bd22c	mov w8,wzr
009bd230	ldp x29,x30,[sp, #0x30]
009bd234	ldp x20,x19,[sp, #0x20]
009bd238	ldp x22,x21,[sp, #0x10]
009bd23c	mov w0,w8
009bd240	add sp,sp,#0x40
009bd244	ret
