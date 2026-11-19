; SSL_accept @ 009b43d0
009b43d0	str x19,[sp, #-0x20]!
009b43d4	stp x29,x30,[sp, #0x10]
009b43d8	ldr x8,[x0, #0x30]
009b43dc	mov x19,x0
009b43e0	add x29,sp,#0x10
009b43e4	cbnz x8,0x009b4410
009b43e8	mov w8,#0x1
009b43ec	mov x0,x19
009b43f0	str w8,[x19, #0x38]
009b43f4	str wzr,[x19, #0x44]
009b43f8	bl 0x00c35cd0
009b43fc	ldr x8,[x19, #0x8]
009b4400	mov x0,x19
009b4404	ldr x8,[x8, #0x28]
009b4408	str x8,[x19, #0x30]
009b440c	bl 0x009b1b60
009b4410	ldp x29,x30,[sp, #0x10]
009b4414	mov x0,x19
009b4418	ldr x19,[sp], #0x20
009b441c	b 0x009b445c
