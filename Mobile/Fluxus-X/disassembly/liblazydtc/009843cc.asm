; ix::Socket::Socket @ 009843cc
009843cc	stp x20,x19,[sp, #-0x20]!
009843d0	stp x29,x30,[sp, #0x10]
009843d4	add x29,sp,#0x10
009843d8	adrp x8,0xcb4000
009843dc	ldr x8,[x8, #0xfa8]
009843e0	mov x19,x0
009843e4	str w1,[x0, #0x8]
009843e8	stur xzr,[x0, #0x2c]
009843ec	add x8,x8,#0x10
009843f0	str x8,[x0]
009843f4	str xzr,[x19, #0xc]!
009843f8	stur xzr,[x0, #0x24]
009843fc	stur xzr,[x0, #0x1c]
00984400	stur xzr,[x0, #0x14]
00984404	add x8,x0,#0x38
00984408	bl 0x00c33490
0098440c	ldp x29,x30,[sp, #0x10]
00984410	ldp x20,x19,[sp], #0x20
00984414	ret
