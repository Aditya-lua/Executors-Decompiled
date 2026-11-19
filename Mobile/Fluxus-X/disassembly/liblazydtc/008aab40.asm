; FUN_008aab40 @ 008aab40
008aab40	stp x29,x30,[sp, #-0x20]!
008aab44	str x19,[sp, #0x10]
008aab48	mov x29,sp
008aab4c	cmp w1,#0x1
008aab50	b.lt 0x008aab8c
008aab54	ldp x9,x8,[x0, #0x68]
008aab58	add x8,x8,w1, UXTW  #0x4
008aab5c	sub x8,x8,#0x10
008aab60	cmp x8,x9
008aab64	b.cc 0x008aabc0
008aab68	adrp x8,0xd1f000
008aab6c	add x8,x8,#0x1e0
008aab70	adrp x19,0xd1f000
008aab74	ldarb w8,[x8]
008aab78	tbz w8,#0x0,0x008aabe4
008aab7c	ldr x8,[x19, #0x1d8]
008aab80	add x8,x8,#0x7f2, LSL #12
008aab84	add x8,x8,#0xef0
008aab88	b 0x008aabc0
008aab8c	mov w8,#0xffffd8f1
008aab90	cmp w1,w8
008aab94	b.lt 0x008aaba4
008aab98	ldr x8,[x0, #0x68]
008aab9c	add x8,x8,w1, SXTW  #0x4
008aaba0	b 0x008aabc0
008aaba4	mov x19,x0
008aaba8	bl 0x008aea7c
008aabac	mov x8,x0
008aabb0	mov x0,x19
008aabb4	b 0x008aabc0
008aabb8	ldr q0,[x8]
008aabbc	stur q0,[x8, #-0x10]
008aabc0	ldr x9,[x0, #0x68]
008aabc4	add x8,x8,#0x10
008aabc8	cmp x8,x9
008aabcc	b.cc 0x008aabb8
008aabd0	sub x8,x9,#0x10
008aabd4	str x8,[x0, #0x68]
008aabd8	ldr x19,[sp, #0x10]
008aabdc	ldp x29,x30,[sp], #0x20
008aabe0	ret
008aabe4	adrp x8,0xd1f000
008aabe8	add x8,x8,#0x1e0
008aabec	str x0,[x29, #0x18]
008aabf0	mov x0,x8
008aabf4	bl 0x00c2fe90
008aabf8	mov w8,w0
008aabfc	ldr x0,[x29, #0x18]
008aac00	cbz w8,0x008aab7c
008aac04	adrp x8,0xcca000
008aac08	ldr x0,[x8, #0x8c8]
008aac0c	bl 0x007fe1ec
008aac10	str x0,[x19, #0x1d8]
008aac14	adrp x0,0xd1f000
008aac18	add x0,x0,#0x1e0
008aac1c	bl 0x00c2fea0
008aac20	ldr x0,[x29, #0x18]
008aac24	b 0x008aab7c
