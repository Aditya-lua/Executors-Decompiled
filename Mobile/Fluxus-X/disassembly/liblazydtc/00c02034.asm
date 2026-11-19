; std::__ndk1::numpunct_byname<char>::numpunct_byname @ 00c02034
00c02034	paciasp
00c02038	stp x29,x30,[sp, #-0x20]!
00c0203c	stp x20,x19,[sp, #0x10]
00c02040	mov x29,sp
00c02044	mov w8,#0x2c2e
00c02048	str xzr,[x0, #0x28]
00c0204c	mov x19,x0
00c02050	strh w8,[x0, #0x10]
00c02054	adrp x8,0xcb5000
00c02058	sub x9,x2,#0x1
00c0205c	ldr x8,[x8, #0xe48]
00c02060	stp xzr,xzr,[x0, #0x18]
00c02064	add x8,x8,#0x10
00c02068	stp x8,x9,[x0]
00c0206c	bl 0x00c44620
00c02070	ldp x20,x19,[sp, #0x10]
00c02074	ldp x29,x30,[sp], #0x20
00c02078	autiasp
00c0207c	ret
