; ssl3_pending @ 009ca8a0
009ca8a0	sub sp,sp,#0x30
009ca8a4	stp x20,x19,[sp, #0x10]
009ca8a8	stp x29,x30,[sp, #0x20]
009ca8ac	ldr w8,[x0, #0xc64]
009ca8b0	mov x19,xzr
009ca8b4	add x29,sp,#0x20
009ca8b8	cmp w8,#0xf1
009ca8bc	b.eq 0x009ca944
009ca8c0	ldr x8,[x0, #0x8]
009ca8c4	mov x20,x0
009ca8c8	mov x19,xzr
009ca8cc	ldr x8,[x8, #0xc0]
009ca8d0	ldrb w8,[x8, #0x60]
009ca8d4	tbz w8,#0x3,0x009ca910
009ca8d8	ldr x8,[x20, #0x1d10]
009ca8dc	ldr x0,[x8, #0x50]
009ca8e0	bl 0x00c34550
009ca8e4	str x0,[sp, #0x8]
009ca8e8	add x0,sp,#0x8
009ca8ec	bl 0x00c34560
009ca8f0	mov x19,xzr
009ca8f4	cbz x0,0x009ca910
009ca8f8	ldr x8,[x0, #0x8]
009ca8fc	add x0,sp,#0x8
009ca900	ldr x8,[x8, #0x48]
009ca904	add x19,x8,x19
009ca908	bl 0x00c34560
009ca90c	cbnz x0,0x009ca8f8
009ca910	ldr x8,[x20, #0xc68]
009ca914	cbz x8,0x009ca944
009ca918	mov w10,#0x12b0
009ca91c	mov x9,xzr
009ca920	add x10,x20,x10
009ca924	ldur w11,[x10, #-0x4]
009ca928	cmp w11,#0x17
009ca92c	b.ne 0x009ca944
009ca930	ldr x11,[x10], #0x50
009ca934	add x9,x9,#0x1
009ca938	cmp x9,x8
009ca93c	add x19,x11,x19
009ca940	b.cc 0x009ca924
009ca944	mov x0,x19
009ca948	ldp x29,x30,[sp, #0x20]
009ca94c	ldp x20,x19,[sp, #0x10]
009ca950	add sp,sp,#0x30
009ca954	ret
