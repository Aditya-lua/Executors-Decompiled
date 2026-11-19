; curl_mvsnprintf @ 00928f98
00928f98	sub sp,sp,#0x60
00928f9c	str x19,[sp, #0x40]
00928fa0	stp x29,x30,[sp, #0x50]
00928fa4	add x29,sp,#0x50
00928fa8	mrs x19,tpidr_el0
00928fac	ldr x8,[x19, #0x28]
00928fb0	stur x8,[x29, #-0x18]
00928fb4	stp x0,xzr,[sp, #0x20]
00928fb8	str x1,[sp, #0x30]
00928fbc	ldr q0,[x3, #0x10]
00928fc0	nop
00928fc4	adr x1,0x92a2d0
00928fc8	add x0,sp,#0x20
00928fcc	str q0,[sp, #0x10]
00928fd0	ldr q0,[x3]
00928fd4	mov x3,sp
00928fd8	str q0,[sp]
00928fdc	bl 0x00929028
00928fe0	ldr x9,[sp, #0x30]
00928fe4	cbz x9,0x00929004
00928fe8	ldp x8,x10,[sp, #0x20]
00928fec	cmp x9,x10
00928ff0	b.ne 0x00929000
00928ff4	sturb wzr,[x8, #-0x1]
00928ff8	sub w0,w0,#0x1
00928ffc	b 0x00929004
00929000	strb wzr,[x8]
00929004	ldr x8,[x19, #0x28]
00929008	ldur x9,[x29, #-0x18]
0092900c	cmp x8,x9
00929010	b.ne 0x00929024
00929014	ldp x29,x30,[sp, #0x50]
00929018	ldr x19,[sp, #0x40]
0092901c	add sp,sp,#0x60
00929020	ret
00929024	bl 0x00c2fec0
