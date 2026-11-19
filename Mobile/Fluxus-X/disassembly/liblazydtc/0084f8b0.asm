; FUN_0084f8b0 @ 0084f8b0
0084f8b0	adrp x8,0xd1b000
0084f8b4	adrp x9,0xc4a000
0084f8b8	add x9,x9,#0x508
0084f8bc	ldr w8,[x8, #0x100]
0084f8c0	str x9,[x0]
0084f8c4	str w8,[x0, #0x8]
0084f8c8	adrp x8,0xc49000
0084f8cc	add x8,x8,#0x768
0084f8d0	ldr q0,[x1]
0084f8d4	strb wzr,[x0, #0x1c]
0084f8d8	str x8,[x0]
0084f8dc	stp x2,x3,[x0, #0x20]
0084f8e0	stur q0,[x0, #0xc]
0084f8e4	str x4,[x0, #0x30]
0084f8e8	ldr w8,[x5, #0x10]
0084f8ec	ldr q0,[x5]
0084f8f0	str w8,[x0, #0x48]
0084f8f4	stur q0,[x0, #0x38]
0084f8f8	ldr q0,[x6]
0084f8fc	ldr w8,[x6, #0x10]
0084f900	str xzr,[x0, #0x60]
0084f904	strb wzr,[x0, #0x68]
0084f908	stur q0,[x0, #0x4c]
0084f90c	str w8,[x0, #0x5c]
0084f910	strb wzr,[x0, #0x6c]
0084f914	strb wzr,[x0, #0x7c]
0084f918	strb wzr,[x0, #0x80]
0084f91c	strb wzr,[x0, #0x90]
0084f920	ret
