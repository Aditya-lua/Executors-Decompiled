; std::__ndk1::locale::locale @ 00bfb0c4
00bfb0c4	paciasp
00bfb0c8	sub sp,sp,#0x70
00bfb0cc	stp x29,x30,[sp, #0x20]
00bfb0d0	stp x26,x25,[sp, #0x30]
00bfb0d4	stp x24,x23,[sp, #0x40]
00bfb0d8	stp x22,x21,[sp, #0x50]
00bfb0dc	stp x20,x19,[sp, #0x60]
00bfb0e0	add x29,sp,#0x20
00bfb0e4	cbz x2,0x00bfb1d4
00bfb0e8	mov x20,x0
00bfb0ec	mov w0,#0x138
00bfb0f0	mov w21,w3
00bfb0f4	mov x23,x2
00bfb0f8	mov x19,x1
00bfb0fc	bl 0x00c2fed0
00bfb100	ldr x22,[x19]
00bfb104	mov x19,x0
00bfb108	mov x0,x23
00bfb10c	bl 0x00c2ff50
00bfb110	cmn x0,#0x8
00bfb114	b.cs 0x00bfb1e0
00bfb118	mov x24,x0
00bfb11c	cmp x0,#0x17
00bfb120	b.cs 0x00bfb13c
00bfb124	lsl w8,w24,#0x1
00bfb128	add x9,sp,#0x8
00bfb12c	orr x25,x9,#0x1
00bfb130	strb w8,[sp, #0x8]
00bfb134	cbnz x24,0x00bfb164
00bfb138	b 0x00bfb174
00bfb13c	orr x8,x24,#0x7
00bfb140	mov w9,#0x1a
00bfb144	cmp x8,#0x17
00bfb148	csinc x26,x9,x8,eq
00bfb14c	mov x0,x26
00bfb150	bl 0x00c2fed0
00bfb154	orr x8,x26,#0x1
00bfb158	mov x25,x0
00bfb15c	stp x24,x0,[sp, #0x10]
00bfb160	str x8,[sp, #0x8]
00bfb164	mov x0,x25
00bfb168	mov x1,x23
00bfb16c	mov x2,x24
00bfb170	bl 0x00c2ffd0
00bfb174	strb wzr,[x25, x24]
00bfb178	add x2,sp,#0x8
00bfb17c	mov x0,x19
00bfb180	mov x1,x22
00bfb184	mov w3,w21
00bfb188	bl 0x00bf7758
00bfb18c	ldrb w8,[sp, #0x8]
00bfb190	tbz w8,#0x0,0x00bfb1a4
00bfb194	ldr x8,[sp, #0x8]
00bfb198	ldr x0,[sp, #0x18]
00bfb19c	and x1,x8,#-0x2
00bfb1a0	bl 0x00c2fe80
00bfb1a4	add x1,x19,#0x8
00bfb1a8	mov w0,#0x1
00bfb1ac	str x19,[x20]
00bfb1b0	bl 0x00c2bce0
00bfb1b4	ldp x20,x19,[sp, #0x60]
00bfb1b8	ldp x22,x21,[sp, #0x50]
00bfb1bc	ldp x24,x23,[sp, #0x40]
00bfb1c0	ldp x26,x25,[sp, #0x30]
00bfb1c4	ldp x29,x30,[sp, #0x20]
00bfb1c8	add sp,sp,#0x70
00bfb1cc	autiasp
00bfb1d0	ret
00bfb1d4	adrp x0,0x2c6000
00bfb1d8	add x0,x0,#0x9b4
00bfb1dc	bl 0x00c43d00
00bfb1e0	bl 0x007fe124
