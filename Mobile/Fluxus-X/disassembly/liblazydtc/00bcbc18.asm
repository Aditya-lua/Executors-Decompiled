; std::__ndk1::error_category::equivalent @ 00bcbc18
00bcbc18	paciasp
00bcbc1c	stp x29,x30,[sp, #-0x20]!
00bcbc20	str x19,[sp, #0x10]
00bcbc24	mov x29,sp
00bcbc28	ldr x8,[x0]
00bcbc2c	mov x19,x2
00bcbc30	ldr x8,[x8, #0x18]
00bcbc34	blr x8
00bcbc38	ldr x8,[x19, #0x8]
00bcbc3c	ldr w9,[x19]
00bcbc40	cmp x8,x1
00bcbc44	ccmp w9,w0,#0x0,eq
00bcbc48	cset w0,eq
00bcbc4c	ldr x19,[sp, #0x10]
00bcbc50	ldp x29,x30,[sp], #0x20
00bcbc54	autiasp
00bcbc58	ret
