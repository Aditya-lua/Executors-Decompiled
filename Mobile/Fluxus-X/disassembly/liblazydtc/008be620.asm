; FUN_008be620 @ 008be620
008be620	stp x29,x30,[sp, #-0x30]!
008be624	str x21,[sp, #0x10]
008be628	stp x20,x19,[sp, #0x20]
008be62c	mov x29,sp
008be630	ldr x8,[x0, #0x50]
008be634	ldr x9,[x0, #0x18]
008be638	mov x20,x2
008be63c	mov w19,w1
008be640	cmp x8,x9
008be644	b.eq 0x008be654
008be648	add x8,x8,#0x30
008be64c	str x8,[x0, #0x50]
008be650	b 0x008be664
008be654	mov x21,x0
008be658	bl 0x008b4200
008be65c	mov x8,x0
008be660	mov x0,x21
008be664	str x20,[x8, #0x8]
008be668	ldr x10,[x20]
008be66c	ldrb w9,[x10, #0x6]
008be670	cbz w9,0x008be67c
008be674	mov x9,xzr
008be678	b 0x008be6b0
008be67c	adrp x9,0xd1f000
008be680	ldrb w11,[x9, #0xdf0]
008be684	ldr x9,[x10, #0x18]
008be688	cmp w11,#0x1
008be68c	b.ne 0x008be6b0
008be690	ldr x11,[x9, #0xd0]
008be694	cbz x11,0x008be6b0
008be698	str x11,[x10, #0x18]
008be69c	mov x9,x11
008be6a0	ldr x11,[x11, #0xd0]
008be6a4	cbnz x11,0x008be698
008be6a8	ldrb w11,[x9, #0x5]
008be6ac	strb w11,[x10, #0x4]
008be6b0	ldr x10,[x0, #0x68]
008be6b4	str xzr,[x8, #0x20]
008be6b8	ldr x11,[x0, #0x48]
008be6bc	ldr x12,[x0, #0x68]
008be6c0	str x9,[x8]
008be6c4	add x9,x20,#0x10
008be6c8	add x10,x10,#0x140
008be6cc	stp w19,wzr,[x8, #0x28]
008be6d0	stp x9,x10,[x8, #0x10]
008be6d4	sub x10,x11,x12
008be6d8	cmp x10,#0x140
008be6dc	str x9,[x0, #0x70]
008be6e0	b.gt 0x008be70c
008be6e4	ldr w8,[x0, #0x40]
008be6e8	lsl w9,w8,#0x1
008be6ec	add w10,w8,#0x14
008be6f0	cmp w8,#0x13
008be6f4	csel w1,w9,w10,gt
008be6f8	mov w2,#0x1
008be6fc	ldp x20,x19,[sp, #0x20]
008be700	ldr x21,[sp, #0x10]
008be704	ldp x29,x30,[sp], #0x30
008be708	b 0x008b3fdc
008be70c	ldp x20,x19,[sp, #0x20]
008be710	ldr x21,[sp, #0x10]
008be714	ldp x29,x30,[sp], #0x30
008be718	ret
