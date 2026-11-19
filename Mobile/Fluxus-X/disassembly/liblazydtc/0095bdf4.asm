; FUN_0095bdf4 @ 0095bdf4
0095bdf4	sub sp,sp,#0x70
0095bdf8	stp x24,x23,[sp, #0x30]
0095bdfc	stp x22,x21,[sp, #0x40]
0095be00	stp x20,x19,[sp, #0x50]
0095be04	stp x29,x30,[sp, #0x60]
0095be08	add x29,sp,#0x60
0095be0c	mrs x22,tpidr_el0
0095be10	ldr x8,[x22, #0x28]
0095be14	mov x19,x0
0095be18	str x8,[sp, #0x28]
0095be1c	ldr x8,[x0, #0x1a0]
0095be20	ldr x23,[x0, #0x20]
0095be24	ldr x24,[x8, #0x10]
0095be28	cbz x24,0x0095bf48
0095be2c	ldr x20,[x8, #0x8]
0095be30	cbz x20,0x0095be98
0095be34	ldrb w9,[x20]
0095be38	cbz w9,0x0095be98
0095be3c	ldrb w8,[x23, #0x4f8]
0095be40	adrp x21,0x2ab000
0095be44	add x21,x21,#0x32c
0095be48	tbz w8,#0x3,0x0095be6c
0095be4c	adrp x1,0x2b9000
0095be50	add x1,x1,#0x4de
0095be54	mov x0,x20
0095be58	bl 0x00c301f0
0095be5c	adrp x8,0x2cf000
0095be60	add x8,x8,#0x2f6
0095be64	cmp w0,#0x0
0095be68	csel x21,x8,x21,eq
0095be6c	ldr x4,[x24]
0095be70	adrp x2,0x2a3000
0095be74	add x1,x23,#0x428
0095be78	add x2,x2,#0x8d3
0095be7c	mov x0,x19
0095be80	mov x3,x20
0095be84	mov x5,x21
0095be88	bl 0x009453ec
0095be8c	mov w21,w0
0095be90	cbnz w21,0x0095c00c
0095be94	b 0x0095c000
0095be98	movi v0.2D,#0x0
0095be9c	stur q0,[sp, #0x18]
0095bea0	stur q0,[sp, #0x8]
0095bea4	ldr x8,[x8, #0x10]
0095bea8	adrp x9,0xcb4000
0095beac	ldr x8,[x8]
0095beb0	ldr x9,[x9, #0xdf0]
0095beb4	mov x10,x8
0095beb8	ldr x9,[x9]
0095bebc	ldrb w11,[x10], #0x1
0095bec0	cmp w11,#0x3c
0095bec4	csel x0,x10,x8,eq
0095bec8	blr x9
0095becc	mov x20,x0
0095bed0	cbz x0,0x0095bf84
0095bed4	mov x0,x20
0095bed8	bl 0x00c2ff50
0095bedc	cbz x0,0x0095bef4
0095bee0	sub x8,x0,#0x1
0095bee4	ldrb w9,[x20, x8]
0095bee8	cmp w9,#0x3e
0095beec	b.ne 0x0095bef4
0095bef0	strb wzr,[x20, x8]
0095bef4	mov w1,#0x40
0095bef8	mov x0,x20
0095befc	bl 0x00c30890
0095bf00	str x0,[sp, #0x18]
0095bf04	cbz x0,0x0095bf20
0095bf08	strb wzr,[x0]
0095bf0c	ldr x8,[sp, #0x18]
0095bf10	add x0,sp,#0x8
0095bf14	add x8,x8,#0x1
0095bf18	str x8,[sp, #0x18]
0095bf1c	bl 0x0095c6d4
0095bf20	ldrb w8,[x23, #0x4f8]
0095bf24	adrp x24,0x2ab000
0095bf28	add x24,x24,#0x32c
0095bf2c	mov x21,x24
0095bf30	tbz w8,#0x3,0x0095bfb0
0095bf34	ldr x8,[sp, #0x10]
0095bf38	cbz x8,0x0095bf8c
0095bf3c	adrp x21,0x2cf000
0095bf40	add x21,x21,#0x2f6
0095bf44	b 0x0095bfb0
0095bf48	ldr x8,[x8, #0x8]
0095bf4c	adrp x3,0x2cf000
0095bf50	add x1,x23,#0x428
0095bf54	add x3,x3,#0x300
0095bf58	cbz x8,0x0095bf68
0095bf5c	ldrb w9,[x8]
0095bf60	cmp w9,#0x0
0095bf64	csel x3,x3,x8,eq
0095bf68	adrp x2,0x2b6000
0095bf6c	add x2,x2,#0xc62
0095bf70	mov x0,x19
0095bf74	bl 0x009453ec
0095bf78	mov w21,w0
0095bf7c	cbnz w21,0x0095c00c
0095bf80	b 0x0095c000
0095bf84	mov w21,#0x1b
0095bf88	b 0x0095c00c
0095bf8c	mov x0,x20
0095bf90	bl 0x0095c6a8
0095bf94	adrp x21,0x2cf000
0095bf98	add x21,x21,#0x2f6
0095bf9c	tbz w0,#0x0,0x0095bfb0
0095bfa0	ldr x0,[sp, #0x18]
0095bfa4	bl 0x0095c6a8
0095bfa8	tst w0,#0x1
0095bfac	csel x21,x24,x21,ne
0095bfb0	ldr x8,[sp, #0x18]
0095bfb4	adrp x9,0x2b9000
0095bfb8	add x9,x9,#0x4dc
0095bfbc	adrp x2,0x2ab000
0095bfc0	cmp x8,#0x0
0095bfc4	add x1,x23,#0x428
0095bfc8	csel x4,x9,x24,ne
0095bfcc	csel x5,x8,x24,ne
0095bfd0	add x2,x2,#0x806
0095bfd4	mov x0,x19
0095bfd8	mov x3,x20
0095bfdc	mov x6,x21
0095bfe0	bl 0x009453ec
0095bfe4	adrp x8,0xcc4000
0095bfe8	add x8,x8,#0x678
0095bfec	mov w21,w0
0095bff0	mov x0,x20
0095bff4	ldr x8,[x8]
0095bff8	blr x8
0095bffc	cbnz w21,0x0095c00c
0095c000	ldr x8,[x19, #0x20]
0095c004	orr w9,wzr,#0x7
0095c008	str w9,[x8, #0x4e8]
0095c00c	ldr x8,[x22, #0x28]
0095c010	ldr x9,[sp, #0x28]
0095c014	cmp x8,x9
0095c018	b.ne 0x0095c038
0095c01c	mov w0,w21
0095c020	ldp x29,x30,[sp, #0x60]
0095c024	ldp x20,x19,[sp, #0x50]
0095c028	ldp x22,x21,[sp, #0x40]
0095c02c	ldp x24,x23,[sp, #0x30]
0095c030	add sp,sp,#0x70
0095c034	ret
0095c038	bl 0x00c2fec0
