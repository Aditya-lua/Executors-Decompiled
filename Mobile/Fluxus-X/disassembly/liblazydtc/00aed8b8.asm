; UI_free @ 00aed8b8
00aed8b8	cbz x0,0x00aed92c
00aed8bc	str x19,[sp, #-0x20]!
00aed8c0	stp x29,x30,[sp, #0x10]
00aed8c4	ldrb w8,[x0, #0x28]
00aed8c8	mov x19,x0
00aed8cc	add x29,sp,#0x10
00aed8d0	tbz w8,#0x1,0x00aed8e8
00aed8d4	ldr x8,[x19]
00aed8d8	ldr x1,[x19, #0x10]
00aed8dc	mov x0,x19
00aed8e0	ldr x8,[x8, #0x38]
00aed8e4	blr x8
00aed8e8	ldr x0,[x19, #0x8]
00aed8ec	adrp x1,0xaed000
00aed8f0	add x1,x1,#0x930
00aed8f4	bl 0x00c32600
00aed8f8	add x2,x19,#0x18
00aed8fc	mov w0,#0xb
00aed900	mov x1,x19
00aed904	bl 0x00c356c0
00aed908	ldr x0,[x19, #0x30]
00aed90c	bl 0x00c34d40
00aed910	ldp x29,x30,[sp, #0x10]
00aed914	adrp x1,0x2a0000
00aed918	add x1,x1,#0xc2f
00aed91c	mov w2,#0x53
00aed920	mov x0,x19
00aed924	ldr x19,[sp], #0x20
00aed928	b 0x00c32310
00aed92c	ret
