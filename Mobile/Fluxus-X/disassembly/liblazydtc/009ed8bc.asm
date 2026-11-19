; ASN1_STRING_to_UTF8 @ 009ed8bc
009ed8bc	sub sp,sp,#0x40
009ed8c0	stp x29,x30,[sp, #0x30]
009ed8c4	add x29,sp,#0x30
009ed8c8	add x8,sp,#0x8
009ed8cc	str x19,[sp, #0x20]
009ed8d0	stur x8,[x29, #-0x8]
009ed8d4	cbz x1,0x009ed93c
009ed8d8	ldrsw x8,[x1, #0x4]
009ed8dc	cmp w8,#0x1e
009ed8e0	b.hi 0x009ed93c
009ed8e4	mov w9,#0xefff
009ed8e8	movk w9,#0x2a23, LSL #16
009ed8ec	lsr x9,x9,x8
009ed8f0	tbnz w9,#0x0,0x009ed93c
009ed8f4	adrp x9,0x74d000
009ed8f8	add x9,x9,#0xd74
009ed8fc	str wzr,[sp, #0x8]
009ed900	stp xzr,xzr,[sp, #0x10]
009ed904	ldrsb w9,[x9, x8]
009ed908	ldr x8,[x1, #0x8]
009ed90c	ldr w2,[x1]
009ed910	mov x19,x0
009ed914	orr w3,w9,#0x1000
009ed918	sub x0,x29,#0x8
009ed91c	mov w4,#0x2000
009ed920	mov x1,x8
009ed924	bl 0x00c37640
009ed928	tbnz w0,#0x1f,0x009ed940
009ed92c	ldr x8,[sp, #0x10]
009ed930	str x8,[x19]
009ed934	ldr w0,[sp, #0x8]
009ed938	b 0x009ed940
009ed93c	mov w0,#0xffffffff
009ed940	ldp x29,x30,[sp, #0x30]
009ed944	ldr x19,[sp, #0x20]
009ed948	add sp,sp,#0x40
009ed94c	ret
