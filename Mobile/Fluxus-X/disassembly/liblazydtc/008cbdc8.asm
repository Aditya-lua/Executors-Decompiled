; FUN_008cbdc8 @ 008cbdc8
008cbdc8	stp x29,x30,[sp, #-0x30]!
008cbdcc	str x21,[sp, #0x10]
008cbdd0	stp x20,x19,[sp, #0x20]
008cbdd4	mov x29,sp
008cbdd8	ldr w8,[x1, #0xc]
008cbddc	cmp w8,#0x3
008cbde0	b.le 0x008cbe28
008cbde4	cmp w8,#0x7
008cbde8	b.le 0x008cbe6c
008cbdec	cmp w8,#0x8
008cbdf0	b.eq 0x008cbec8
008cbdf4	cmp w8,#0xb
008cbdf8	b.eq 0x008cbe98
008cbdfc	cmp w8,#0xc
008cbe00	b.ne 0x008cbe98
008cbe04	ldr x8,[x1]
008cbe08	ldr x9,[x2]
008cbe0c	mov x20,x1
008cbe10	mov x19,x2
008cbe14	ldr x8,[x8, #0x10]
008cbe18	ldr x9,[x9, #0x10]
008cbe1c	ldr x1,[x8, #0x50]
008cbe20	ldr x2,[x9, #0x50]
008cbe24	b 0x008cbee0
008cbe28	cmp w8,#0x1
008cbe2c	b.gt 0x008cbe48
008cbe30	cbz w8,0x008cbf28
008cbe34	cmp w8,#0x1
008cbe38	b.ne 0x008cbe98
008cbe3c	ldr w8,[x1]
008cbe40	ldr w9,[x2]
008cbe44	b 0x008cbebc
008cbe48	cmp w8,#0x2
008cbe4c	b.eq 0x008cbea4
008cbe50	cmp w8,#0x3
008cbe54	b.ne 0x008cbe98
008cbe58	ldr d0,[x1]
008cbe5c	ldr d1,[x2]
008cbe60	fcmp d0,d1
008cbe64	cset w0,eq
008cbe68	b 0x008cbf7c
008cbe6c	cmp w8,#0x4
008cbe70	b.eq 0x008cbf44
008cbe74	cmp w8,#0x6
008cbe78	b.ne 0x008cbe98
008cbe7c	ldr x8,[x1]
008cbe80	ldr x9,[x2]
008cbe84	mov x20,x1
008cbe88	mov x19,x2
008cbe8c	ldr x1,[x8, #0x10]
008cbe90	ldr x2,[x9, #0x10]
008cbe94	b 0x008cbee0
008cbe98	ldr x8,[x1]
008cbe9c	ldr x9,[x2]
008cbea0	b 0x008cbf38
008cbea4	ldr x8,[x1]
008cbea8	ldr x9,[x2]
008cbeac	cmp x8,x9
008cbeb0	b.ne 0x008cbf78
008cbeb4	ldr w8,[x1, #0x8]
008cbeb8	ldr w9,[x2, #0x8]
008cbebc	cmp w8,w9
008cbec0	cset w0,eq
008cbec4	b 0x008cbf7c
008cbec8	ldr x8,[x1]
008cbecc	ldr x9,[x2]
008cbed0	mov x20,x1
008cbed4	mov x19,x2
008cbed8	ldr x1,[x8, #0x8]
008cbedc	ldr x2,[x9, #0x8]
008cbee0	mov x21,x0
008cbee4	bl 0x008cbf8c
008cbee8	cbz x0,0x008cbf30
008cbeec	ldr x1,[x21, #0x68]
008cbef0	mov x2,x0
008cbef4	mov x0,x21
008cbef8	mov x3,x20
008cbefc	mov x4,x19
008cbf00	bl 0x008cb070
008cbf04	ldr x8,[x21, #0x68]
008cbf08	ldr w9,[x8, #0xc]
008cbf0c	cbz w9,0x008cbf78
008cbf10	cmp w9,#0x1
008cbf14	b.ne 0x008cbf28
008cbf18	ldr w8,[x8]
008cbf1c	cmp w8,#0x0
008cbf20	cset w0,ne
008cbf24	b 0x008cbf7c
008cbf28	mov w0,#0x1
008cbf2c	b 0x008cbf7c
008cbf30	ldr x8,[x20]
008cbf34	ldr x9,[x19]
008cbf38	cmp x8,x9
008cbf3c	cset w0,eq
008cbf40	b 0x008cbf7c
008cbf44	ldr s0,[x1]
008cbf48	ldr s1,[x2]
008cbf4c	fcmp s0,s1
008cbf50	b.ne 0x008cbf78
008cbf54	ldr s0,[x1, #0x4]
008cbf58	ldr s1,[x2, #0x4]
008cbf5c	fcmp s0,s1
008cbf60	b.ne 0x008cbf78
008cbf64	ldr s0,[x1, #0x8]
008cbf68	ldr s1,[x2, #0x8]
008cbf6c	fcmp s0,s1
008cbf70	cset w0,eq
008cbf74	b 0x008cbf7c
008cbf78	mov w0,wzr
008cbf7c	ldp x20,x19,[sp, #0x20]
008cbf80	ldr x21,[sp, #0x10]
008cbf84	ldp x29,x30,[sp], #0x30
008cbf88	ret
