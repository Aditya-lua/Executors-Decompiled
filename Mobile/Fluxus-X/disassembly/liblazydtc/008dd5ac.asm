; LZ4_compress @ 008dd5ac
008dd5ac	stp x29,x30,[sp, #-0x20]!
008dd5b0	stp x28,x19,[sp, #0x10]
008dd5b4	mov x29,sp
008dd5b8	sub sp,sp,#0x4, LSL #12
008dd5bc	sub sp,sp,#0x30
008dd5c0	mrs x19,tpidr_el0
008dd5c4	mov w3,w2
008dd5c8	mov w9,#0x7e000000
008dd5cc	ldr x8,[x19, #0x28]
008dd5d0	mov x2,x1
008dd5d4	mov x1,x0
008dd5d8	cmp w3,w9
008dd5dc	stur x8,[x29, #-0x8]
008dd5e0	b.ls 0x008dd5ec
008dd5e4	mov w4,wzr
008dd5e8	b 0x008dd604
008dd5ec	mov w8,#0x8081
008dd5f0	movk w8,#0x8080, LSL #16
008dd5f4	umull x8,w3,w8
008dd5f8	lsr x8,x8,#0x27
008dd5fc	add w8,w3,w8
008dd600	add w4,w8,#0x10
008dd604	add x0,sp,#0x8
008dd608	mov w5,#0x1
008dd60c	bl 0x00c309d0
008dd610	ldr x8,[x19, #0x28]
008dd614	ldur x9,[x29, #-0x8]
008dd618	cmp x8,x9
008dd61c	b.ne 0x008dd634
008dd620	add sp,sp,#0x4, LSL #12
008dd624	add sp,sp,#0x30
008dd628	ldp x28,x19,[sp, #0x10]
008dd62c	ldp x29,x30,[sp], #0x20
008dd630	ret
008dd634	bl 0x00c2fec0
