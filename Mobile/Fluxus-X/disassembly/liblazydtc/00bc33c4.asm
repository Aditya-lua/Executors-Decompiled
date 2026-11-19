; std::logic_error::logic_error @ 00bc33c4
00bc33c4	paciasp
00bc33c8	stp x29,x30,[sp, #-0x30]!
00bc33cc	stp x22,x21,[sp, #0x10]
00bc33d0	stp x20,x19,[sp, #0x20]
00bc33d4	mov x29,sp
00bc33d8	adrp x8,0xcb5000
00bc33dc	mov x19,x0
00bc33e0	mov x20,x1
00bc33e4	ldr x8,[x8, #0xb00]
00bc33e8	add x8,x8,#0x10
00bc33ec	str x8,[x0]
00bc33f0	mov x0,x1
00bc33f4	bl 0x00c2ff50
00bc33f8	mov x21,x0
00bc33fc	add x0,x0,#0x19
00bc3400	bl 0x00c2fed0
00bc3404	add x22,x0,#0x18
00bc3408	stp x21,x21,[x0]
00bc340c	add x2,x21,#0x1
00bc3410	str wzr,[x0, #0x10]
00bc3414	mov x0,x22
00bc3418	mov x1,x20
00bc341c	bl 0x00c2ffd0
00bc3420	str x22,[x19, #0x8]
00bc3424	ldp x20,x19,[sp, #0x20]
00bc3428	ldp x22,x21,[sp, #0x10]
00bc342c	ldp x29,x30,[sp], #0x30
00bc3430	autiasp
00bc3434	ret
