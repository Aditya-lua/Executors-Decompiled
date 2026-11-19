; blake3_hasher_init_derive_key_raw @ 008e02d8
008e02d8	stp x29,x30,[sp, #-0x30]!
008e02dc	str x28,[sp, #0x10]
008e02e0	stp x20,x19,[sp, #0x20]
008e02e4	mov x29,sp
008e02e8	sub sp,sp,#0x7a0
008e02ec	mrs x20,tpidr_el0
008e02f0	adrp x9,0x744000
008e02f4	add x9,x9,#0xed4
008e02f8	movi v2.2D,#0x0
008e02fc	ldr x8,[x20, #0x28]
008e0300	mov x19,x0
008e0304	ldp q0,q1,[x9]
008e0308	add x0,sp,#0x20
008e030c	stur x8,[x29, #-0x8]
008e0310	mov w8,#0x20
008e0314	strb w8,[sp, #0xaa]
008e0318	stp q0,q1,[sp, #0x20]
008e031c	stp q0,q1,[sp, #0x40]
008e0320	stp q2,q2,[sp, #0x60]
008e0324	stp q2,q2,[sp, #0x80]
008e0328	stur q2,[sp, #0x9a]
008e032c	strb wzr,[sp, #0xb0]
008e0330	bl 0x00c30a50
008e0334	add x0,sp,#0x20
008e0338	mov x2,sp
008e033c	mov x1,xzr
008e0340	mov w3,#0x20
008e0344	bl 0x00c30ad0
008e0348	ldp q0,q1,[sp]
008e034c	mov w8,#0x40
008e0350	str xzr,[x19, #0x40]
008e0354	strh wzr,[x19, #0x88]
008e0358	stp q0,q1,[x19]
008e035c	stp q0,q1,[x19, #0x20]
008e0360	movi v0.2D,#0x0
008e0364	strb w8,[x19, #0x8a]
008e0368	strb wzr,[x19, #0x90]
008e036c	stur q0,[x19, #0x48]
008e0370	stur q0,[x19, #0x58]
008e0374	stur q0,[x19, #0x68]
008e0378	stur q0,[x19, #0x78]
008e037c	ldr x8,[x20, #0x28]
008e0380	ldur x9,[x29, #-0x8]
008e0384	cmp x8,x9
008e0388	b.ne 0x008e03a0
008e038c	add sp,sp,#0x7a0
008e0390	ldp x20,x19,[sp, #0x20]
008e0394	ldr x28,[sp, #0x10]
008e0398	ldp x29,x30,[sp], #0x30
008e039c	ret
008e03a0	bl 0x00c2fec0
