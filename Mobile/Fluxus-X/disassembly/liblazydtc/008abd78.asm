; FUN_008abd78 @ 008abd78
008abd78	stp x29,x30,[sp, #-0x20]!
008abd7c	str x19,[sp, #0x10]
008abd80	mov x29,sp
008abd84	cmp w1,#0x1
008abd88	b.lt 0x008abdc4
008abd8c	ldp x9,x8,[x0, #0x68]
008abd90	add x8,x8,w1, UXTW  #0x4
008abd94	sub x0,x8,#0x10
008abd98	cmp x0,x9
008abd9c	b.cc 0x008abde0
008abda0	adrp x8,0xd1f000
008abda4	add x8,x8,#0x1e0
008abda8	adrp x19,0xd1f000
008abdac	ldarb w8,[x8]
008abdb0	tbz w8,#0x0,0x008abe18
008abdb4	ldr x8,[x19, #0x1d8]
008abdb8	add x8,x8,#0x7f2, LSL #12
008abdbc	add x0,x8,#0xef0
008abdc0	b 0x008abde0
008abdc4	mov w8,#0xffffd8f1
008abdc8	cmp w1,w8
008abdcc	b.lt 0x008abddc
008abdd0	ldr x8,[x0, #0x68]
008abdd4	add x0,x8,w1, SXTW  #0x4
008abdd8	b 0x008abde0
008abddc	bl 0x008aea7c
008abde0	ldr w8,[x0, #0xc]
008abde4	cmp w8,#0x2
008abde8	b.eq 0x008abe00
008abdec	cmp w8,#0x8
008abdf0	b.ne 0x008abe08
008abdf4	ldr x8,[x0]
008abdf8	add x0,x8,#0x10
008abdfc	b 0x008abe0c
008abe00	ldr x0,[x0]
008abe04	b 0x008abe0c
008abe08	mov x0,xzr
008abe0c	ldr x19,[sp, #0x10]
008abe10	ldp x29,x30,[sp], #0x20
008abe14	ret
008abe18	adrp x0,0xd1f000
008abe1c	add x0,x0,#0x1e0
008abe20	bl 0x00c2fe90
008abe24	cbz w0,0x008abdb4
008abe28	adrp x8,0xcca000
008abe2c	ldr x0,[x8, #0x8c8]
008abe30	bl 0x007fe1ec
008abe34	str x0,[x19, #0x1d8]
008abe38	adrp x0,0xd1f000
008abe3c	add x0,x0,#0x1e0
008abe40	bl 0x00c2fea0
008abe44	b 0x008abdb4
