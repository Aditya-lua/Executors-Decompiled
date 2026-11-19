; std::runtime_error::runtime_error @ 00bc34e0
00bc34e0	paciasp
00bc34e4	stp x29,x30,[sp, #-0x30]!
00bc34e8	stp x22,x21,[sp, #0x10]
00bc34ec	stp x20,x19,[sp, #0x20]
00bc34f0	mov x29,sp
00bc34f4	adrp x8,0xcb5000
00bc34f8	mov x19,x0
00bc34fc	ldr x8,[x8, #0xb08]
00bc3500	add x8,x8,#0x10
00bc3504	str x8,[x0]
00bc3508	ldrb w8,[x1]
00bc350c	ldr x9,[x1, #0x10]
00bc3510	tst w8,#0x1
00bc3514	csinc x20,x9,x1,ne
00bc3518	mov x0,x20
00bc351c	bl 0x00c2ff50
00bc3520	mov x21,x0
00bc3524	add x0,x0,#0x19
00bc3528	bl 0x00c2fed0
00bc352c	add x22,x0,#0x18
00bc3530	stp x21,x21,[x0]
00bc3534	add x2,x21,#0x1
00bc3538	str wzr,[x0, #0x10]
00bc353c	mov x0,x22
00bc3540	mov x1,x20
00bc3544	bl 0x00c2ffd0
00bc3548	str x22,[x19, #0x8]
00bc354c	ldp x20,x19,[sp, #0x20]
00bc3550	ldp x22,x21,[sp, #0x10]
00bc3554	ldp x29,x30,[sp], #0x30
00bc3558	autiasp
00bc355c	ret
