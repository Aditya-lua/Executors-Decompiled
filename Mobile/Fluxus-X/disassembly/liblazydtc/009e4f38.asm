; FUN_009e4f38 @ 009e4f38
009e4f38	str x21,[sp, #-0x30]!
009e4f3c	stp x20,x19,[sp, #0x10]
009e4f40	stp x29,x30,[sp, #0x20]
009e4f44	ldr w8,[x0, #0x9f4]
009e4f48	ldr w21,[x1]
009e4f4c	mov x20,x1
009e4f50	mov x19,x0
009e4f54	add x29,sp,#0x20
009e4f58	cbz w8,0x009e4f9c
009e4f5c	cmp w21,w8
009e4f60	b.eq 0x009e4f9c
009e4f64	ldr x9,[x19, #0x8]
009e4f68	ldr x9,[x9, #0xc0]
009e4f6c	ldrb w9,[x9, #0x60]
009e4f70	tbnz w9,#0x3,0x009e4f80
009e4f74	cmp w21,w8
009e4f78	b.ge 0x009e4f9c
009e4f7c	b 0x009e4fe8
009e4f80	cmp w21,#0x100
009e4f84	orr w9,wzr,#0xff00
009e4f88	csel w10,w9,w21,eq
009e4f8c	cmp w8,#0x100
009e4f90	csel w8,w9,w8,eq
009e4f94	cmp w10,w8
009e4f98	b.gt 0x009e4fe8
009e4f9c	mov w1,#0x9
009e4fa0	mov x0,x19
009e4fa4	mov w2,wzr
009e4fa8	mov w3,w21
009e4fac	mov x4,xzr
009e4fb0	bl 0x00c34a30
009e4fb4	cbz w0,0x009e4fe8
009e4fb8	ldr w8,[x19, #0x9f8]
009e4fbc	cbz w8,0x009e500c
009e4fc0	cmp w21,w8
009e4fc4	b.eq 0x009e500c
009e4fc8	ldr x9,[x19, #0x8]
009e4fcc	ldr x9,[x9, #0xc0]
009e4fd0	ldrb w9,[x9, #0x60]
009e4fd4	tbnz w9,#0x3,0x009e4ff0
009e4fd8	cmp w21,w8
009e4fdc	b.lt 0x009e500c
009e4fe0	mov w0,#0xa6
009e4fe4	b 0x009e5048
009e4fe8	mov w0,#0x18c
009e4fec	b 0x009e5048
009e4ff0	cmp w21,#0x100
009e4ff4	orr w9,wzr,#0xff00
009e4ff8	csel w10,w9,w21,eq
009e4ffc	cmp w8,#0x100
009e5000	csel w8,w9,w8,eq
009e5004	cmp w10,w8
009e5008	b.le 0x009e4fe0
009e500c	ldr x8,[x19, #0x9e8]
009e5010	ldr x9,[x20, #0x8]
009e5014	tst x9,x8
009e5018	b.eq 0x009e5024
009e501c	mov w0,#0x102
009e5020	b 0x009e5048
009e5024	ldrb w8,[x20, #0x4]
009e5028	tbz w8,#0x1,0x009e5044
009e502c	ldr x8,[x19, #0x898]
009e5030	ldrb w8,[x8, #0x1e]
009e5034	tst w8,#0x3
009e5038	b.eq 0x009e5044
009e503c	mov w0,#0x9e
009e5040	b 0x009e5048
009e5044	mov w0,wzr
009e5048	ldp x29,x30,[sp, #0x20]
009e504c	ldp x20,x19,[sp, #0x10]
009e5050	ldr x21,[sp], #0x30
009e5054	ret
