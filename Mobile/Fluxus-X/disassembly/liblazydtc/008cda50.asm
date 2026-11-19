; FUN_008cda50 @ 008cda50
008cda50	stp x29,x30,[sp, #-0x20]!
008cda54	stp x20,x19,[sp, #0x10]
008cda58	mov x29,sp
008cda5c	mov w2,#0x4
008cda60	mov x19,x1
008cda64	mov x20,x0
008cda68	bl 0x008be028
008cda6c	ldr w8,[x0, #0xc]
008cda70	cmp w8,#0x7
008cda74	b.ne 0x008cdabc
008cda78	ldr x8,[x20, #0x68]
008cda7c	cmp x8,x19
008cda80	b.ls 0x008cdaa0
008cda84	ldur q0,[x8, #-0x10]
008cda88	sub x9,x8,#0x10
008cda8c	cmp x9,x19
008cda90	str q0,[x8]
008cda94	mov x8,x9
008cda98	b.hi 0x008cda84
008cda9c	ldr x8,[x20, #0x68]
008cdaa0	add x8,x8,#0x10
008cdaa4	str x8,[x20, #0x68]
008cdaa8	ldr q0,[x0]
008cdaac	str q0,[x19]
008cdab0	ldp x20,x19,[sp, #0x10]
008cdab4	ldp x29,x30,[sp], #0x20
008cdab8	ret
008cdabc	adrp x2,0x2c8000
008cdac0	add x2,x2,#0xca6
008cdac4	mov x0,x20
008cdac8	mov x1,x19
008cdacc	bl 0x008b399c
