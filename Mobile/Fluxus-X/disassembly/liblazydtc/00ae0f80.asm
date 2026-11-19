; SHA3_squeeze @ 00ae0f80
00ae0f80	stp x22,x21,[sp, #-0x30]!
00ae0f84	stp x20,x19,[sp, #0x10]
00ae0f88	stp x29,x30,[sp, #0x20]
00ae0f8c	add x29,sp,#0x20
00ae0f90	cbz x2,0x00ae1048
00ae0f94	mov x19,x2
00ae0f98	mov x20,x1
00ae0f9c	mov x21,x0
00ae0fa0	lsr x22,x3,#0x3
00ae0fa4	cmp x19,#0x0
00ae0fa8	cset w9,ne
00ae0fac	cbz x19,0x00ae101c
00ae0fb0	cbz x22,0x00ae101c
00ae0fb4	mov x8,xzr
00ae0fb8	ldr x9,[x21, x8, LSL #0x3]
00ae0fbc	cmp x19,#0x7
00ae0fc0	b.ls 0x00ae1030
00ae0fc4	lsr x10,x9,#0x8
00ae0fc8	strb w10,[x20, #0x1]
00ae0fcc	lsr x10,x9,#0x10
00ae0fd0	strb w10,[x20, #0x2]
00ae0fd4	lsr x10,x9,#0x18
00ae0fd8	strb w10,[x20, #0x3]
00ae0fdc	lsr x10,x9,#0x20
00ae0fe0	strb w10,[x20, #0x4]
00ae0fe4	lsr x10,x9,#0x28
00ae0fe8	strb w9,[x20]
00ae0fec	strb w10,[x20, #0x5]
00ae0ff0	lsr x10,x9,#0x30
00ae0ff4	lsr x9,x9,#0x38
00ae0ff8	subs x19,x19,#0x8
00ae0ffc	strb w10,[x20, #0x6]
00ae1000	strb w9,[x20, #0x7]
00ae1004	add x20,x20,#0x8
00ae1008	cset w9,ne
00ae100c	b.eq 0x00ae101c
00ae1010	add x8,x8,#0x1
00ae1014	cmp x8,x22
00ae1018	b.cc 0x00ae0fb8
00ae101c	cbz w9,0x00ae1028
00ae1020	mov x0,x21
00ae1024	bl 0x00ae0ddc
00ae1028	cbnz x19,0x00ae0fa4
00ae102c	b 0x00ae1048
00ae1030	mov x8,xzr
00ae1034	strb w9,[x20, x8]
00ae1038	add x8,x8,#0x1
00ae103c	cmp x19,x8
00ae1040	lsr x9,x9,#0x8
00ae1044	b.ne 0x00ae1034
00ae1048	ldp x29,x30,[sp, #0x20]
00ae104c	ldp x20,x19,[sp, #0x10]
00ae1050	ldp x22,x21,[sp], #0x30
00ae1054	ret
