; FUN_008aad54 @ 008aad54
008aad54	stp x29,x30,[sp, #-0x30]!
008aad58	str x21,[sp, #0x10]
008aad5c	stp x20,x19,[sp, #0x20]
008aad60	mov x29,sp
008aad64	ldrb w8,[x0, #0x2]
008aad68	mov x19,x0
008aad6c	mov w20,w1
008aad70	tbz w8,#0x2,0x008aad84
008aad74	add x2,x19,#0x38
008aad78	mov x0,x19
008aad7c	mov x1,x19
008aad80	bl 0x008b63a4
008aad84	cmp w20,#0x1
008aad88	b.lt 0x008aadc4
008aad8c	ldp x9,x8,[x19, #0x68]
008aad90	add x8,x8,w20, UXTW  #0x4
008aad94	sub x0,x8,#0x10
008aad98	cmp x0,x9
008aad9c	b.cc 0x008aade8
008aada0	adrp x8,0xd1f000
008aada4	add x8,x8,#0x1e0
008aada8	ldarb w9,[x8]
008aadac	adrp x8,0xd1f000
008aadb0	tbz w9,#0x0,0x008aaeb0
008aadb4	ldr x8,[x8, #0x1d8]
008aadb8	add x8,x8,#0x7f2, LSL #12
008aadbc	add x0,x8,#0xef0
008aadc0	b 0x008aade8
008aadc4	mov w8,#0xffffd8f1
008aadc8	cmp w20,w8
008aadcc	b.lt 0x008aaddc
008aadd0	ldr x8,[x19, #0x68]
008aadd4	add x0,x8,w20, SXTW  #0x4
008aadd8	b 0x008aade8
008aaddc	mov x0,x19
008aade0	mov w1,w20
008aade4	bl 0x008aea7c
008aade8	mov w8,#0xffffd8ee
008aadec	cmp w20,w8
008aadf0	b.eq 0x008aae30
008aadf4	mov w8,#0xffffd8ef
008aadf8	cmp w20,w8
008aadfc	b.ne 0x008aae40
008aae00	ldr x8,[x19, #0x50]
008aae04	ldr x9,[x19, #0x68]
008aae08	ldr x8,[x8, #0x8]
008aae0c	ldur w10,[x9, #-0x4]
008aae10	ldur x2,[x9, #-0x10]
008aae14	ldr x1,[x8]
008aae18	cmp w10,#0x5
008aae1c	str x2,[x1, #0x10]
008aae20	b.lt 0x008aae94
008aae24	ldrb w8,[x1, #0x2]
008aae28	tbnz w8,#0x2,0x008aae80
008aae2c	b 0x008aae94
008aae30	ldr x8,[x19, #0x68]
008aae34	ldur x8,[x8, #-0x10]
008aae38	str x8,[x19, #0x78]
008aae3c	b 0x008aae94
008aae40	ldr x8,[x19, #0x68]
008aae44	ldur q0,[x8, #-0x10]
008aae48	mov w8,#0xffffd8ed
008aae4c	cmp w20,w8
008aae50	str q0,[x0]
008aae54	b.gt 0x008aae94
008aae58	ldr x8,[x19, #0x68]
008aae5c	ldur w9,[x8, #-0x4]
008aae60	cmp w9,#0x5
008aae64	b.lt 0x008aae94
008aae68	ldr x9,[x19, #0x50]
008aae6c	ldr x9,[x9, #0x8]
008aae70	ldr x1,[x9]
008aae74	ldrb w9,[x1, #0x2]
008aae78	tbz w9,#0x2,0x008aae94
008aae7c	ldur x2,[x8, #-0x10]
008aae80	ldrb w8,[x2, #0x2]
008aae84	tst w8,#0x3
008aae88	b.eq 0x008aae94
008aae8c	mov x0,x19
008aae90	bl 0x008b6188
008aae94	ldr x8,[x19, #0x68]
008aae98	sub x8,x8,#0x10
008aae9c	str x8,[x19, #0x68]
008aaea0	ldp x20,x19,[sp, #0x20]
008aaea4	ldr x21,[sp, #0x10]
008aaea8	ldp x29,x30,[sp], #0x30
008aaeac	ret
008aaeb0	adrp x0,0xd1f000
008aaeb4	add x0,x0,#0x1e0
008aaeb8	bl 0x00c2fe90
008aaebc	adrp x8,0xd1f000
008aaec0	cbz w0,0x008aadb4
008aaec4	adrp x8,0xcca000
008aaec8	ldr x0,[x8, #0x8c8]
008aaecc	bl 0x007fe1ec
008aaed0	adrp x21,0xd1f000
008aaed4	str x0,[x21, #0x1d8]
008aaed8	adrp x0,0xd1f000
008aaedc	add x0,x0,#0x1e0
008aaee0	bl 0x00c2fea0
008aaee4	mov x8,x21
008aaee8	b 0x008aadb4
