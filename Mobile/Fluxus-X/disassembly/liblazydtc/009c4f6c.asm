; FUN_009c4f6c @ 009c4f6c
009c4f6c	sub sp,sp,#0xa0
009c4f70	stp x26,x25,[sp, #0x50]
009c4f74	stp x24,x23,[sp, #0x60]
009c4f78	stp x22,x21,[sp, #0x70]
009c4f7c	stp x20,x19,[sp, #0x80]
009c4f80	stp x29,x30,[sp, #0x90]
009c4f84	ldr x8,[x0, #0x1db0]
009c4f88	str x27,[sp, #0x40]
009c4f8c	add x29,sp,#0x90
009c4f90	cbz x8,0x009c514c
009c4f94	mov x21,x2
009c4f98	mov x19,x0
009c4f9c	mov x22,x1
009c4fa0	mov x26,xzr
009c4fa4	mov w23,#0xffffffff
009c4fa8	mov w27,#0x28
009c4fac	ldr x8,[x19, #0x1da8]
009c4fb0	ldr x20,[x8, x26, LSL #0x3]
009c4fb4	ldr w8,[x20, #0xc]
009c4fb8	cmp w8,#0x40
009c4fbc	b.eq 0x009c4fdc
009c4fc0	cmp w8,#0x2a3
009c4fc4	b.eq 0x009c4fdc
009c4fc8	ldr w9,[x20, #0x14]
009c4fcc	cmp w9,#0x6
009c4fd0	b.eq 0x009c4fdc
009c4fd4	cmp w9,#0x74
009c4fd8	b.ne 0x009c4ff0
009c4fdc	ldr x8,[x19, #0x1db0]
009c4fe0	add x26,x26,#0x1
009c4fe4	cmp x26,x8
009c4fe8	b.cc 0x009c4fac
009c4fec	b 0x009c5144
009c4ff0	cbz w8,0x009c5004
009c4ff4	ldr x0,[x19, #0x9a8]
009c4ff8	ldr w1,[x20, #0x10]
009c4ffc	bl 0x00c34a20
009c5000	cbz x0,0x009c4fdc
009c5004	cbz x21,0x009c5048
009c5008	add x1,sp,#0x8
009c500c	mov x0,x21
009c5010	bl 0x00c35150
009c5014	cbz x0,0x009c4fdc
009c5018	ldr w8,[sp, #0x8]
009c501c	ldr w9,[x20, #0x18]
009c5020	cmp w9,w8
009c5024	b.ne 0x009c4fdc
009c5028	mov x0,x19
009c502c	mov x1,x20
009c5030	mov x2,x22
009c5034	mov x3,x21
009c5038	bl 0x009c6514
009c503c	mov x24,x21
009c5040	cbnz w0,0x009c5098
009c5044	b 0x009c4fdc
009c5048	ldrsw x8,[x20, #0x18]
009c504c	cmp w8,#0x8
009c5050	b.hi 0x009c4fdc
009c5054	ldr x9,[x19, #0x898]
009c5058	nop
009c505c	madd x10,x8,x27,x9
009c5060	ldr x2,[x10, #0x20]
009c5064	cbz x2,0x009c4fdc
009c5068	madd x8,x8,x27,x9
009c506c	ldr x3,[x8, #0x28]
009c5070	cbz x3,0x009c4fdc
009c5074	mov x0,x19
009c5078	mov x1,x20
009c507c	bl 0x009c6514
009c5080	cbz w0,0x009c4fdc
009c5084	ldr x8,[x19, #0x898]
009c5088	ldrsw x9,[x20, #0x18]
009c508c	nop
009c5090	madd x8,x9,x27,x8
009c5094	ldr x24,[x8, #0x28]
009c5098	ldr w8,[x20, #0x14]
009c509c	cmp w8,#0x390
009c50a0	b.eq 0x009c50e8
009c50a4	cmp w8,#0x198
009c50a8	b.ne 0x009c5144
009c50ac	cmn w23,#0x1
009c50b0	b.ne 0x009c5134
009c50b4	add x1,sp,#0x8
009c50b8	mov w2,#0x32
009c50bc	mov x0,x24
009c50c0	mov x3,xzr
009c50c4	bl 0x00c324a0
009c50c8	cmp w0,#0x1
009c50cc	b.lt 0x009c5130
009c50d0	add x0,sp,#0x8
009c50d4	bl 0x00c364a0
009c50d8	mov w23,w0
009c50dc	ldr w8,[x20, #0x20]
009c50e0	cbnz w8,0x009c513c
009c50e4	b 0x009c5144
009c50e8	cbz x24,0x009c4fdc
009c50ec	ldr w8,[x20, #0xc]
009c50f0	cbz w8,0x009c4fdc
009c50f4	ldr x0,[x19, #0x9a8]
009c50f8	ldr w1,[x20, #0x10]
009c50fc	bl 0x00c34a20
009c5100	cbz x0,0x009c4fdc
009c5104	mov x25,x0
009c5108	mov x0,x24
009c510c	bl 0x00c36440
009c5110	mov w24,w0
009c5114	mov x0,x25
009c5118	bl 0x00c34c20
009c511c	lsl w8,w0,#0x1
009c5120	add w8,w8,#0x2
009c5124	cmp w24,w8
009c5128	b.lt 0x009c4fdc
009c512c	b 0x009c5144
009c5130	mov w23,wzr
009c5134	ldr w8,[x20, #0x20]
009c5138	cbz w8,0x009c5144
009c513c	cmp w23,w8
009c5140	b.ne 0x009c4fdc
009c5144	ldr x8,[x19, #0x1db0]
009c5148	b 0x009c5154
009c514c	mov x26,xzr
009c5150	mov x20,xzr
009c5154	cmp x26,x8
009c5158	csel x0,xzr,x20,eq
009c515c	ldp x29,x30,[sp, #0x90]
009c5160	ldp x20,x19,[sp, #0x80]
009c5164	ldp x22,x21,[sp, #0x70]
009c5168	ldp x24,x23,[sp, #0x60]
009c516c	ldp x26,x25,[sp, #0x50]
009c5170	ldr x27,[sp, #0x40]
009c5174	add sp,sp,#0xa0
009c5178	ret
