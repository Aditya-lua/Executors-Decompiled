; ix::WebSocket::disablePerMessageDeflate @ 0098d75c
0098d75c	sub sp,sp,#0x40
0098d760	str x21,[sp, #0x10]
0098d764	stp x20,x19,[sp, #0x20]
0098d768	stp x29,x30,[sp, #0x30]
0098d76c	add x29,sp,#0x30
0098d770	mrs x21,tpidr_el0
0098d774	ldr x8,[x21, #0x28]
0098d778	add x19,x0,#0x3a0
0098d77c	mov x20,x0
0098d780	mov x0,x19
0098d784	str x8,[sp, #0x8]
0098d788	bl 0x00c2ff10
0098d78c	adrp x8,0xcb5000
0098d790	adrp x9,0xcb5000
0098d794	ldr x8,[x8, #0x30]
0098d798	ldr x9,[x9, #0x38]
0098d79c	ldrb w4,[x8]
0098d7a0	ldrb w5,[x9]
0098d7a4	mov x0,sp
0098d7a8	mov w1,wzr
0098d7ac	mov w2,wzr
0098d7b0	mov w3,wzr
0098d7b4	bl 0x00c33900
0098d7b8	ldrb w8,[sp, #0x4]
0098d7bc	mov x0,x19
0098d7c0	strb w8,[x20, #0x314]
0098d7c4	ldr w8,[sp]
0098d7c8	str w8,[x20, #0x310]
0098d7cc	bl 0x00c2ff20
0098d7d0	ldr x8,[x21, #0x28]
0098d7d4	ldr x9,[sp, #0x8]
0098d7d8	cmp x8,x9
0098d7dc	b.ne 0x0098d7f4
0098d7e0	ldp x29,x30,[sp, #0x30]
0098d7e4	ldp x20,x19,[sp, #0x20]
0098d7e8	ldr x21,[sp, #0x10]
0098d7ec	add sp,sp,#0x40
0098d7f0	ret
0098d7f4	bl 0x00c2fec0
