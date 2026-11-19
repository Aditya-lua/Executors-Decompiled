; FUN_0084efe4 @ 0084efe4
0084efe4	adrp x8,0xd1b000
0084efe8	adrp x9,0xc4a000
0084efec	add x9,x9,#0x508
0084eff0	ldr w8,[x8, #0x70]
0084eff4	str x9,[x0]
0084eff8	ldr x9,[sp, #0x8]
0084effc	ldp x11,x10,[sp, #0x10]
0084f000	str w8,[x0, #0x8]
0084f004	adrp x8,0xc49000
0084f008	add x8,x8,#0x538
0084f00c	ldr q0,[x1]
0084f010	str x8,[x0]
0084f014	ldr x8,[sp, #0x20]
0084f018	stur q0,[x0, #0xc]
0084f01c	ldr q0,[x2]
0084f020	str q0,[x0, #0x20]
0084f024	ldr q0,[x3]
0084f028	str q0,[x0, #0x30]
0084f02c	ldr q0,[x4]
0084f030	str x5,[x0, #0x50]
0084f034	str q0,[x0, #0x40]
0084f038	ldr q0,[x6]
0084f03c	str x8,[x0, #0x68]
0084f040	ldr x8,[sp]
0084f044	strb w7,[x0, #0x70]
0084f048	stur q0,[x0, #0x58]
0084f04c	ldr q0,[x8]
0084f050	ldr x8,[sp, #0x28]
0084f054	stur q0,[x0, #0x74]
0084f058	stp x8,x9,[x0, #0x88]
0084f05c	ldr x8,[x10]
0084f060	ldr x9,[sp, #0x30]
0084f064	stp x11,x8,[x0, #0x98]
0084f068	ldr q0,[x9]
0084f06c	ldr w8,[x9, #0x10]
0084f070	stur q0,[x0, #0xa8]
0084f074	str w8,[x0, #0xb8]
0084f078	ret
