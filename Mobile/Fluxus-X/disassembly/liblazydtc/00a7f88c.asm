; HMAC_CTX_reset @ 00a7f88c
00a7f88c	str x19,[sp, #-0x20]!
00a7f890	stp x29,x30,[sp, #0x10]
00a7f894	mov x19,x0
00a7f898	ldr x0,[x0, #0x10]
00a7f89c	add x29,sp,#0x10
00a7f8a0	bl 0x00c3c1a0
00a7f8a4	ldr x0,[x19, #0x18]
00a7f8a8	bl 0x00c3c1a0
00a7f8ac	ldr x0,[x19, #0x8]
00a7f8b0	bl 0x00c3c1a0
00a7f8b4	ldr x8,[x19, #0x10]
00a7f8b8	str xzr,[x19]
00a7f8bc	cbnz x8,0x00a7f8cc
00a7f8c0	bl 0x00c31fa0
00a7f8c4	str x0,[x19, #0x10]
00a7f8c8	cbz x0,0x00a7f8fc
00a7f8cc	ldr x8,[x19, #0x18]
00a7f8d0	cbnz x8,0x00a7f8e0
00a7f8d4	bl 0x00c31fa0
00a7f8d8	str x0,[x19, #0x18]
00a7f8dc	cbz x0,0x00a7f8fc
00a7f8e0	ldr x8,[x19, #0x8]
00a7f8e4	cbnz x8,0x00a7f8f4
00a7f8e8	bl 0x00c31fa0
00a7f8ec	str x0,[x19, #0x8]
00a7f8f0	cbz x0,0x00a7f8fc
00a7f8f4	mov w0,#0x1
00a7f8f8	b 0x00a7f91c
00a7f8fc	ldr x0,[x19, #0x10]
00a7f900	bl 0x00c3c1a0
00a7f904	ldr x0,[x19, #0x18]
00a7f908	bl 0x00c3c1a0
00a7f90c	ldr x0,[x19, #0x8]
00a7f910	bl 0x00c3c1a0
00a7f914	mov w0,wzr
00a7f918	str xzr,[x19]
00a7f91c	ldp x29,x30,[sp, #0x10]
00a7f920	ldr x19,[sp], #0x20
00a7f924	ret
