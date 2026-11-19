; FUN_0084f924 @ 0084f924
0084f924	adrp x8,0xd1b000
0084f928	adrp x9,0xc4a000
0084f92c	add x9,x9,#0x508
0084f930	ldr w8,[x8, #0x100]
0084f934	str x9,[x0]
0084f938	ldrb w9,[sp]
0084f93c	ldr x10,[sp, #0x8]
0084f940	str w8,[x0, #0x8]
0084f944	adrp x8,0xc49000
0084f948	add x8,x8,#0x768
0084f94c	ldr q0,[x1]
0084f950	strb wzr,[x0, #0x1c]
0084f954	str x8,[x0]
0084f958	stur q0,[x0, #0xc]
0084f95c	stp x2,x3,[x0, #0x20]
0084f960	str x4,[x0, #0x30]
0084f964	ldr w8,[x5, #0x10]
0084f968	ldr q0,[x5]
0084f96c	str w8,[x0, #0x48]
0084f970	stur q0,[x0, #0x38]
0084f974	ldr q0,[x6]
0084f978	ldr w8,[x6, #0x10]
0084f97c	str x7,[x0, #0x60]
0084f980	strb w9,[x0, #0x68]
0084f984	ldr x9,[sp, #0x10]
0084f988	stur q0,[x0, #0x4c]
0084f98c	str w8,[x0, #0x5c]
0084f990	ldr w8,[x10, #0x10]
0084f994	ldr q0,[x10]
0084f998	str w8,[x0, #0x7c]
0084f99c	stur q0,[x0, #0x6c]
0084f9a0	ldr q0,[x9]
0084f9a4	ldr w8,[x9, #0x10]
0084f9a8	str q0,[x0, #0x80]
0084f9ac	str w8,[x0, #0x90]
0084f9b0	ret
