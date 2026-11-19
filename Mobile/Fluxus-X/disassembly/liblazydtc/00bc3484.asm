; std::logic_error::operator= @ 00bc3484
00bc3484	paciasp
00bc3488	stp x29,x30,[sp, #-0x20]!
00bc348c	stp x20,x19,[sp, #0x10]
00bc3490	mov x29,sp
00bc3494	ldr x8,[x1, #0x8]
00bc3498	mov x19,x0
00bc349c	ldr x20,[x0, #0x8]
00bc34a0	str x8,[x0, #0x8]
00bc34a4	sub x1,x8,#0x8
00bc34a8	mov w0,#0x1
00bc34ac	bl 0x00c2bcb0
00bc34b0	sub x1,x20,#0x8
00bc34b4	mov w0,#0xffffffff
00bc34b8	bl 0x00c2bcb0
00bc34bc	cmp w0,#0x1
00bc34c0	b.pl 0x00bc34cc
00bc34c4	sub x0,x20,#0x18
00bc34c8	bl 0x00c301d0
00bc34cc	mov x0,x19
00bc34d0	ldp x20,x19,[sp, #0x10]
00bc34d4	ldp x29,x30,[sp], #0x20
00bc34d8	autiasp
00bc34dc	ret
