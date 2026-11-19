; ix::SelectInterruptPipe::read @ 00985eb4
00985eb4	sub sp,sp,#0x40
00985eb8	str x21,[sp, #0x10]
00985ebc	stp x20,x19,[sp, #0x20]
00985ec0	stp x29,x30,[sp, #0x30]
00985ec4	add x29,sp,#0x30
00985ec8	mrs x21,tpidr_el0
00985ecc	ldr x8,[x21, #0x28]
00985ed0	add x19,x0,#0x10
00985ed4	mov x20,x0
00985ed8	mov x0,x19
00985edc	str x8,[sp, #0x8]
00985ee0	bl 0x00c2ff10
00985ee4	ldr w20,[x20, #0x8]
00985ee8	str xzr,[sp]
00985eec	mov x1,sp
00985ef0	mov w2,#0x8
00985ef4	mov w0,w20
00985ef8	bl 0x00c31ef0
00985efc	cmn x0,#0x1
00985f00	b.ne 0x00985f14
00985f04	bl 0x00c30710
00985f08	ldr w8,[x0]
00985f0c	cmp w8,#0x4
00985f10	b.eq 0x00985eec
00985f14	ldr x20,[sp]
00985f18	mov x0,x19
00985f1c	bl 0x00c2ff20
00985f20	ldr x8,[x21, #0x28]
00985f24	ldr x9,[sp, #0x8]
00985f28	cmp x8,x9
00985f2c	b.ne 0x00985f48
00985f30	mov x0,x20
00985f34	ldp x29,x30,[sp, #0x30]
00985f38	ldp x20,x19,[sp, #0x20]
00985f3c	ldr x21,[sp, #0x10]
00985f40	add sp,sp,#0x40
00985f44	ret
00985f48	bl 0x00c2fec0
