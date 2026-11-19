; dtls1_reset_seq_numbers @ 009ca4f4
009ca4f4	str x19,[sp, #-0x20]!
009ca4f8	stp x29,x30,[sp, #0x10]
009ca4fc	add x29,sp,#0x10
009ca500	tbnz w1,#0x0,0x009ca52c
009ca504	ldr x8,[x0, #0x1d10]
009ca508	ldr x9,[x0, #0x1d00]
009ca50c	mov w10,#0x1d00
009ca510	add x19,x0,x10
009ca514	str x9,[x8, #0x58]
009ca518	ldr x8,[x0, #0x1d10]
009ca51c	ldrh w9,[x8, #0x2]
009ca520	add w9,w9,#0x1
009ca524	strh w9,[x8, #0x2]
009ca528	b 0x009ca558
009ca52c	ldr x8,[x0, #0x1d10]
009ca530	ldrh w9,[x8]
009ca534	ldur q0,[x8, #0x18]
009ca538	add w9,w9,#0x1
009ca53c	stur q0,[x8, #0x8]
009ca540	strh w9,[x8]
009ca544	ldr x8,[x0, #0x1d10]
009ca548	mov w9,#0x1cf8
009ca54c	add x19,x0,x9
009ca550	stp xzr,xzr,[x8, #0x18]
009ca554	bl 0x00c340e0
009ca558	str xzr,[x19]
009ca55c	ldp x29,x30,[sp, #0x10]
009ca560	ldr x19,[sp], #0x20
009ca564	ret
