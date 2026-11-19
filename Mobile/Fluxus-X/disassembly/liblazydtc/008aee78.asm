; FUN_008aee78 @ 008aee78
008aee78	sub sp,sp,#0x180
008aee7c	stp x29,x30,[sp, #0x150]
008aee80	str x28,[sp, #0x160]
008aee84	stp x20,x19,[sp, #0x170]
008aee88	add x29,sp,#0x150
008aee8c	mrs x20,tpidr_el0
008aee90	adrp x2,0x2b9000
008aee94	add x2,x2,#0x1b
008aee98	ldr x8,[x20, #0x28]
008aee9c	add x3,sp,#0x8
008aeea0	mov x19,x0
008aeea4	stur x8,[x29, #-0x8]
008aeea8	bl 0x008b3568
008aeeac	cbz w0,0x008aeed4
008aeeb0	ldr w3,[sp, #0x18]
008aeeb4	cmp w3,#0x1
008aeeb8	b.lt 0x008aeed4
008aeebc	ldr x2,[sp, #0x38]
008aeec0	adrp x1,0x2a7000
008aeec4	add x1,x1,#0x1bb
008aeec8	mov x0,x19
008aeecc	bl 0x008ac684
008aeed0	b 0x008aeef4
008aeed4	mov x0,x19
008aeed8	mov w1,#0x1
008aeedc	bl 0x008aa60c
008aeee0	adrp x1,0x2ab000
008aeee4	add x1,x1,#0x32c
008aeee8	mov x0,x19
008aeeec	mov x2,xzr
008aeef0	bl 0x008ac34c
008aeef4	ldr x8,[x20, #0x28]
008aeef8	ldur x9,[x29, #-0x8]
008aeefc	cmp x8,x9
008aef00	b.ne 0x008aef18
008aef04	ldp x20,x19,[sp, #0x170]
008aef08	ldr x28,[sp, #0x160]
008aef0c	ldp x29,x30,[sp, #0x150]
008aef10	add sp,sp,#0x180
008aef14	ret
008aef18	bl 0x00c2fec0
