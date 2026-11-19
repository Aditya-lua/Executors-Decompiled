; FUN_008aac40 @ 008aac40
008aac40	stp x29,x30,[sp, #-0x20]!
008aac44	stp x20,x19,[sp, #0x10]
008aac48	mov x29,sp
008aac4c	ldrb w8,[x0, #0x2]
008aac50	mov x19,x0
008aac54	mov w20,w1
008aac58	tbz w8,#0x2,0x008aac6c
008aac5c	add x2,x19,#0x38
008aac60	mov x0,x19
008aac64	mov x1,x19
008aac68	bl 0x008b63a4
008aac6c	cmp w20,#0x1
008aac70	b.lt 0x008aacac
008aac74	ldp x9,x8,[x19, #0x68]
008aac78	add x8,x8,w20, UXTW  #0x4
008aac7c	sub x0,x8,#0x10
008aac80	cmp x0,x9
008aac84	b.cc 0x008aacd0
008aac88	adrp x8,0xd1f000
008aac8c	add x8,x8,#0x1e0
008aac90	adrp x20,0xd1f000
008aac94	ldarb w8,[x8]
008aac98	tbz w8,#0x0,0x008aad0c
008aac9c	ldr x8,[x20, #0x1d8]
008aaca0	add x8,x8,#0x7f2, LSL #12
008aaca4	add x0,x8,#0xef0
008aaca8	b 0x008aacd0
008aacac	mov w8,#0xffffd8f1
008aacb0	cmp w20,w8
008aacb4	b.lt 0x008aacc4
008aacb8	ldr x8,[x19, #0x68]
008aacbc	add x0,x8,w20, SXTW  #0x4
008aacc0	b 0x008aacd0
008aacc4	mov x0,x19
008aacc8	mov w1,w20
008aaccc	bl 0x008aea7c
008aacd0	ldr x8,[x19, #0x68]
008aacd4	cmp x8,x0
008aacd8	b.ls 0x008aacf8
008aacdc	ldur q0,[x8, #-0x10]
008aace0	sub x9,x8,#0x10
008aace4	cmp x9,x0
008aace8	str q0,[x8]
008aacec	mov x8,x9
008aacf0	b.hi 0x008aacdc
008aacf4	ldr x8,[x19, #0x68]
008aacf8	ldr q0,[x8]
008aacfc	str q0,[x0]
008aad00	ldp x20,x19,[sp, #0x10]
008aad04	ldp x29,x30,[sp], #0x20
008aad08	ret
008aad0c	adrp x0,0xd1f000
008aad10	add x0,x0,#0x1e0
008aad14	bl 0x00c2fe90
008aad18	cbz w0,0x008aac9c
008aad1c	adrp x8,0xcca000
008aad20	ldr x0,[x8, #0x8c8]
008aad24	bl 0x007fe1ec
008aad28	str x0,[x20, #0x1d8]
008aad2c	adrp x0,0xd1f000
008aad30	add x0,x0,#0x1e0
008aad34	bl 0x00c2fea0
008aad38	b 0x008aac9c
