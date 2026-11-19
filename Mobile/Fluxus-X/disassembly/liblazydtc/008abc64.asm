; FUN_008abc64 @ 008abc64
008abc64	stp x29,x30,[sp, #-0x20]!
008abc68	str x19,[sp, #0x10]
008abc6c	mov x29,sp
008abc70	cmp w1,#0x1
008abc74	b.lt 0x008abcb0
008abc78	ldp x9,x8,[x0, #0x68]
008abc7c	add x8,x8,w1, UXTW  #0x4
008abc80	sub x0,x8,#0x10
008abc84	cmp x0,x9
008abc88	b.cc 0x008abccc
008abc8c	adrp x8,0xd1f000
008abc90	add x8,x8,#0x1e0
008abc94	adrp x19,0xd1f000
008abc98	ldarb w8,[x8]
008abc9c	tbz w8,#0x0,0x008abd30
008abca0	ldr x8,[x19, #0x1d8]
008abca4	add x8,x8,#0x7f2, LSL #12
008abca8	add x0,x8,#0xef0
008abcac	b 0x008abccc
008abcb0	mov w8,#0xffffd8f1
008abcb4	cmp w1,w8
008abcb8	b.lt 0x008abcc8
008abcbc	ldr x8,[x0, #0x68]
008abcc0	add x0,x8,w1, SXTW  #0x4
008abcc4	b 0x008abccc
008abcc8	bl 0x008aea7c
008abccc	ldr w9,[x0, #0xc]
008abcd0	mov w8,wzr
008abcd4	cmp w9,#0x7
008abcd8	b.gt 0x008abcfc
008abcdc	cmp w9,#0x5
008abce0	b.eq 0x008abd18
008abce4	cmp w9,#0x6
008abce8	b.ne 0x008abd20
008abcec	ldr x0,[x0]
008abcf0	ldr x19,[sp, #0x10]
008abcf4	ldp x29,x30,[sp], #0x20
008abcf8	b 0x008bcf64
008abcfc	cmp w9,#0x8
008abd00	b.eq 0x008abd0c
008abd04	cmp w9,#0xa
008abd08	b.ne 0x008abd20
008abd0c	ldr x8,[x0]
008abd10	ldr w8,[x8, #0x4]
008abd14	b 0x008abd20
008abd18	ldr x8,[x0]
008abd1c	ldr w8,[x8, #0x14]
008abd20	mov w0,w8
008abd24	ldr x19,[sp, #0x10]
008abd28	ldp x29,x30,[sp], #0x20
008abd2c	ret
008abd30	adrp x0,0xd1f000
008abd34	add x0,x0,#0x1e0
008abd38	bl 0x00c2fe90
008abd3c	cbz w0,0x008abca0
008abd40	adrp x8,0xcca000
008abd44	ldr x0,[x8, #0x8c8]
008abd48	bl 0x007fe1ec
008abd4c	str x0,[x19, #0x1d8]
008abd50	adrp x0,0xd1f000
008abd54	add x0,x0,#0x1e0
008abd58	bl 0x00c2fea0
008abd5c	b 0x008abca0
