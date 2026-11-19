; FUN_008ca8f8 @ 008ca8f8
008ca8f8	stp x29,x30,[sp, #-0x30]!
008ca8fc	stp x22,x21,[sp, #0x10]
008ca900	stp x20,x19,[sp, #0x20]
008ca904	mov x29,sp
008ca908	ldr x20,[x0, #0x8]
008ca90c	mov w19,w2
008ca910	mov x8,x0
008ca914	cbz x20,0x008caa04
008ca918	ldr x9,[x8, #0x18]
008ca91c	cbz x9,0x008ca954
008ca920	ldp x9,x10,[x8, #0x20]
008ca924	mov w11,w19
008ca928	sub x10,x10,#0x1
008ca92c	and x11,x10,x11
008ca930	ldr x0,[x9, x11, LSL #0x3]
008ca934	cbz x0,0x008ca954
008ca938	ldr w12,[x0, #0x98]
008ca93c	cmp w12,w19
008ca940	b.eq 0x008caa10
008ca944	add x11,x11,#0x1
008ca948	and x11,x11,x10
008ca94c	ldr x0,[x9, x11, LSL #0x3]
008ca950	cbnz x0,0x008ca938
008ca954	ldr x21,[x8, #0x10]
008ca958	mov x0,x1
008ca95c	mov x22,x1
008ca960	bl 0x008b4cdc
008ca964	ldr x9,[x22, #0x60]
008ca968	mov w10,#0x5588
008ca96c	ldr x11,[x21, #0x70]
008ca970	str w19,[x0, #0x98]
008ca974	ldr w8,[x9, x10#0x0]
008ca978	str x11,[x0, #0x70]
008ca97c	cbz w8,0x008ca988
008ca980	add w11,w8,#0x1
008ca984	str w11,[x9, x10#0x0]
008ca988	ldr x9,[x20, #0x70]
008ca98c	str w8,[x0, #0xcc]
008ca990	ldr x8,[x21, #0x68]
008ca994	ldr x10,[x20]
008ca998	ldr w9,[x9, w19, UXTW #0x2]
008ca99c	str x8,[x0, #0x68]
008ca9a0	add x8,x10,x9
008ca9a4	ldrb w9,[x8]
008ca9a8	strb w9,[x0, #0x5]
008ca9ac	ldrb w9,[x8, #0x1]
008ca9b0	strb w9,[x0, #0x7]
008ca9b4	ldrb w9,[x8, #0x2]
008ca9b8	strb w9,[x0, #0x6]
008ca9bc	ldrb w9,[x20, #0x39]
008ca9c0	ldrb w10,[x8, #0x3]
008ca9c4	cmp w9,#0x4
008ca9c8	strb w10,[x0, #0x3]
008ca9cc	b.cc 0x008ca9d8
008ca9d0	ldrb w8,[x8, #0x4]
008ca9d4	strb w8,[x0, #0x4]
008ca9d8	adrp x8,0x364000
008ca9dc	add x8,x8,#0xcc0
008ca9e0	ldr w9,[x20, #0x20]
008ca9e4	str x8,[x0, #0x30]
008ca9e8	str x8,[x0, #0x18]
008ca9ec	mov w8,#0x1
008ca9f0	str w8,[x0, #0xb8]
008ca9f4	add w8,w9,#0x1
008ca9f8	str x20,[x0, #0xe8]
008ca9fc	str w8,[x20, #0x20]
008caa00	b 0x008caa10
008caa04	ldr x8,[x8]
008caa08	ldr x8,[x8, #0x8]
008caa0c	ldr x0,[x8, w19, UXTW #0x3]
008caa10	ldp x20,x19,[sp, #0x20]
008caa14	ldp x22,x21,[sp, #0x10]
008caa18	ldp x29,x30,[sp], #0x30
008caa1c	ret
