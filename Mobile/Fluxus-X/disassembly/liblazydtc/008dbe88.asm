; FUN_008dbe88 @ 008dbe88
008dbe88	stp x29,x30,[sp, #-0x60]!
008dbe8c	stp x28,x27,[sp, #0x10]
008dbe90	stp x26,x25,[sp, #0x20]
008dbe94	stp x24,x23,[sp, #0x30]
008dbe98	stp x22,x21,[sp, #0x40]
008dbe9c	stp x20,x19,[sp, #0x50]
008dbea0	mov x29,sp
008dbea4	add x26,x1,w2, SXTW 
008dbea8	mov x20,x4
008dbeac	mov x22,x1
008dbeb0	mov x19,x0
008dbeb4	add x27,x3,x4
008dbeb8	mov x21,x0
008dbebc	mov x23,x1
008dbec0	b 0x008dbed4
008dbec4	add x23,x23,x24
008dbec8	sub x8,x26,x23
008dbecc	cmp x8,#0x5
008dbed0	b.cc 0x008dc078
008dbed4	ldrb w25,[x21], #0x1
008dbed8	lsr x24,x25,#0x4
008dbedc	cmp w24,#0xf
008dbee0	b.ne 0x008dbefc
008dbee4	mov x8,xzr
008dbee8	ldrb w9,[x21], #0x1
008dbeec	cmp x9,#0xff
008dbef0	add x8,x8,x9
008dbef4	b.eq 0x008dbee8
008dbef8	add x24,x8,#0xf
008dbefc	sub x8,x26,x23
008dbf00	cmp x8,x24
008dbf04	b.cc 0x008dc078
008dbf08	mov x0,x23
008dbf0c	mov x1,x21
008dbf10	mov x2,x24
008dbf14	bl 0x00c2ff60
008dbf18	add x23,x23,x24
008dbf1c	add x21,x21,x24
008dbf20	sub x9,x26,x23
008dbf24	cmp x9,#0xb
008dbf28	b.ls 0x008dc070
008dbf2c	and x10,x25,#0xf
008dbf30	ldrh w8,[x21], #0x2
008dbf34	cmp w10,#0xf
008dbf38	b.ne 0x008dbf54
008dbf3c	mov x10,xzr
008dbf40	ldrb w11,[x21], #0x1
008dbf44	cmp x11,#0xff
008dbf48	add x10,x10,x11
008dbf4c	b.eq 0x008dbf40
008dbf50	add x10,x10,#0xf
008dbf54	add x24,x10,#0x4
008dbf58	cmp x9,x24
008dbf5c	b.cc 0x008dc078
008dbf60	sub x9,x23,x22
008dbf64	add x10,x9,x20
008dbf68	cmp x10,x8
008dbf6c	b.cc 0x008dc078
008dbf70	subs x9,x9,x8
008dbf74	b.cs 0x008dbf9c
008dbf78	add x1,x27,x9
008dbf7c	mov x0,x23
008dbf80	sub x25,x27,x1
008dbf84	subs x28,x24,x25
008dbf88	b.cs 0x008dbfa8
008dbf8c	mov x2,x24
008dbf90	bl 0x00c2ff60
008dbf94	mov x28,xzr
008dbf98	b 0x008dbfb4
008dbf9c	sub x8,x23,x8
008dbfa0	cbnz x24,0x008dbfc4
008dbfa4	b 0x008dbec4
008dbfa8	mov x2,x25
008dbfac	bl 0x00c2ff60
008dbfb0	mov x24,x25
008dbfb4	add x23,x23,x24
008dbfb8	mov x24,x28
008dbfbc	mov x8,x22
008dbfc0	cbz x24,0x008dbec4
008dbfc4	cmp x24,#0x8
008dbfc8	mov x9,xzr
008dbfcc	b.cc 0x008dc050
008dbfd0	sub x10,x23,x8
008dbfd4	cmp x10,#0x20
008dbfd8	b.cc 0x008dc050
008dbfdc	cmp x24,#0x20
008dbfe0	b.cs 0x008dbfec
008dbfe4	mov x9,xzr
008dbfe8	b 0x008dc024
008dbfec	and x9,x24,#-0x20
008dbff0	add x10,x8,#0x10
008dbff4	add x11,x23,#0x10
008dbff8	mov x12,x9
008dbffc	ldp q0,q1,[x10, #-0x10]
008dc000	subs x12,x12,#0x20
008dc004	add x10,x10,#0x20
008dc008	stp q0,q1,[x11, #-0x10]
008dc00c	add x11,x11,#0x20
008dc010	b.ne 0x008dbffc
008dc014	cmp x24,x9
008dc018	b.eq 0x008dbec4
008dc01c	tst x24,#0x18
008dc020	b.eq 0x008dc050
008dc024	mov x12,x9
008dc028	and x9,x24,#-0x8
008dc02c	add x10,x8,x12
008dc030	add x11,x23,x12
008dc034	sub x12,x12,x9
008dc038	ldr d0,[x10], #0x8
008dc03c	adds x12,x12,#0x8
008dc040	str d0,[x11], #0x8
008dc044	b.ne 0x008dc038
008dc048	cmp x24,x9
008dc04c	b.eq 0x008dbec4
008dc050	add x8,x8,x9
008dc054	add x10,x23,x9
008dc058	sub x9,x24,x9
008dc05c	ldrb w11,[x8], #0x1
008dc060	subs x9,x9,#0x1
008dc064	strb w11,[x10], #0x1
008dc068	b.ne 0x008dc05c
008dc06c	b 0x008dbec4
008dc070	cmp x23,x26
008dc074	b.eq 0x008dc098
008dc078	mov w0,#0xffffffff
008dc07c	ldp x20,x19,[sp, #0x50]
008dc080	ldp x22,x21,[sp, #0x40]
008dc084	ldp x24,x23,[sp, #0x30]
008dc088	ldp x26,x25,[sp, #0x20]
008dc08c	ldp x28,x27,[sp, #0x10]
008dc090	ldp x29,x30,[sp], #0x60
008dc094	ret
008dc098	sub w0,w21,w19
008dc09c	b 0x008dc07c
