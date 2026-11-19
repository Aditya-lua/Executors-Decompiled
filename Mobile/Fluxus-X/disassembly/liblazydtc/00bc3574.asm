; std::runtime_error::runtime_error @ 00bc3574
00bc3574	paciasp
00bc3578	stp x29,x30,[sp, #-0x30]!
00bc357c	stp x22,x21,[sp, #0x10]
00bc3580	stp x20,x19,[sp, #0x20]
00bc3584	mov x29,sp
00bc3588	adrp x8,0xcb5000
00bc358c	mov x19,x0
00bc3590	mov x20,x1
00bc3594	ldr x8,[x8, #0xb08]
00bc3598	add x8,x8,#0x10
00bc359c	str x8,[x0]
00bc35a0	mov x0,x1
00bc35a4	bl 0x00c2ff50
00bc35a8	mov x21,x0
00bc35ac	add x0,x0,#0x19
00bc35b0	bl 0x00c2fed0
00bc35b4	add x22,x0,#0x18
00bc35b8	stp x21,x21,[x0]
00bc35bc	add x2,x21,#0x1
00bc35c0	str wzr,[x0, #0x10]
00bc35c4	mov x0,x22
00bc35c8	mov x1,x20
00bc35cc	bl 0x00c2ffd0
00bc35d0	str x22,[x19, #0x8]
00bc35d4	ldp x20,x19,[sp, #0x20]
00bc35d8	ldp x22,x21,[sp, #0x10]
00bc35dc	ldp x29,x30,[sp], #0x30
00bc35e0	autiasp
00bc35e4	ret
