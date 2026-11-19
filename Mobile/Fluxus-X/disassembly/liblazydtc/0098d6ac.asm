; ix::WebSocket::enablePerMessageDeflate @ 0098d6ac
0098d6ac	sub sp,sp,#0x40
0098d6b0	str x21,[sp, #0x10]
0098d6b4	stp x20,x19,[sp, #0x20]
0098d6b8	stp x29,x30,[sp, #0x30]
0098d6bc	add x29,sp,#0x30
0098d6c0	mrs x21,tpidr_el0
0098d6c4	ldr x8,[x21, #0x28]
0098d6c8	add x19,x0,#0x3a0
0098d6cc	mov x20,x0
0098d6d0	mov x0,x19
0098d6d4	str x8,[sp, #0x8]
0098d6d8	bl 0x00c2ff10
0098d6dc	adrp x8,0xcb5000
0098d6e0	adrp x9,0xcb5000
0098d6e4	ldr x8,[x8, #0x30]
0098d6e8	ldr x9,[x9, #0x38]
0098d6ec	ldrb w4,[x8]
0098d6f0	ldrb w5,[x9]
0098d6f4	mov x0,sp
0098d6f8	mov w1,#0x1
0098d6fc	mov w2,wzr
0098d700	mov w3,wzr
0098d704	bl 0x00c33900
0098d708	ldrb w8,[sp, #0x4]
0098d70c	mov x0,x19
0098d710	strb w8,[x20, #0x314]
0098d714	ldr w8,[sp]
0098d718	str w8,[x20, #0x310]
0098d71c	bl 0x00c2ff20
0098d720	ldr x8,[x21, #0x28]
0098d724	ldr x9,[sp, #0x8]
0098d728	cmp x8,x9
0098d72c	b.ne 0x0098d744
0098d730	ldp x29,x30,[sp, #0x30]
0098d734	ldp x20,x19,[sp, #0x20]
0098d738	ldr x21,[sp, #0x10]
0098d73c	add sp,sp,#0x40
0098d740	ret
0098d744	bl 0x00c2fec0
