; FUN_008acdb8 @ 008acdb8
008acdb8	stp x29,x30,[sp, #-0x20]!
008acdbc	stp x20,x19,[sp, #0x10]
008acdc0	mov x29,sp
008acdc4	ldrb w8,[x0, #0x2]
008acdc8	mov x19,x0
008acdcc	mov w20,w1
008acdd0	tbz w8,#0x2,0x008acde4
008acdd4	add x2,x19,#0x38
008acdd8	mov x0,x19
008acddc	mov x1,x19
008acde0	bl 0x008b63a4
008acde4	cmp w20,#0x1
008acde8	b.lt 0x008ace24
008acdec	ldp x9,x8,[x19, #0x68]
008acdf0	add x8,x8,w20, UXTW  #0x4
008acdf4	sub x0,x8,#0x10
008acdf8	cmp x0,x9
008acdfc	b.cc 0x008ace48
008ace00	adrp x8,0xd1f000
008ace04	add x8,x8,#0x1e0
008ace08	adrp x20,0xd1f000
008ace0c	ldarb w8,[x8]
008ace10	tbz w8,#0x0,0x008ace78
008ace14	ldr x8,[x20, #0x1d8]
008ace18	add x8,x8,#0x7f2, LSL #12
008ace1c	add x0,x8,#0xef0
008ace20	b 0x008ace48
008ace24	mov w8,#0xffffd8f1
008ace28	cmp w20,w8
008ace2c	b.lt 0x008ace3c
008ace30	ldr x8,[x19, #0x68]
008ace34	add x0,x8,w20, SXTW  #0x4
008ace38	b 0x008ace48
008ace3c	mov x0,x19
008ace40	mov w1,w20
008ace44	bl 0x008aea7c
008ace48	ldr x8,[x19, #0x68]
008ace4c	ldr x0,[x0]
008ace50	sub x1,x8,#0x10
008ace54	bl 0x008bb604
008ace58	ldr x8,[x19, #0x68]
008ace5c	ldr q0,[x0]
008ace60	stur q0,[x8, #-0x10]
008ace64	ldr x8,[x19, #0x68]
008ace68	ldur w0,[x8, #-0x4]
008ace6c	ldp x20,x19,[sp, #0x10]
008ace70	ldp x29,x30,[sp], #0x20
008ace74	ret
008ace78	adrp x0,0xd1f000
008ace7c	add x0,x0,#0x1e0
008ace80	bl 0x00c2fe90
008ace84	cbz w0,0x008ace14
008ace88	adrp x8,0xcca000
008ace8c	ldr x0,[x8, #0x8c8]
008ace90	bl 0x007fe1ec
008ace94	str x0,[x20, #0x1d8]
008ace98	adrp x0,0xd1f000
008ace9c	add x0,x0,#0x1e0
008acea0	bl 0x00c2fea0
008acea4	b 0x008ace14
