; _INIT_9 @ 007fc304
007fc304	stp x29,x30,[sp, #-0x10]!
007fc308	mov x29,sp
007fc30c	adrp x8,0xcca000
007fc310	add x8,x8,#0x8d0
007fc314	ldarb w8,[x8]
007fc318	tbnz w8,#0x0,0x007fc3b0
007fc31c	adrp x0,0xcca000
007fc320	add x0,x0,#0x8d0
007fc324	bl 0x00c2fe90
007fc328	cbz w0,0x007fc3b0
007fc32c	adrp x8,0xcca000
007fc330	add x8,x8,#0xa18
007fc334	ldarb w9,[x8]
007fc338	adrp x8,0xcca000
007fc33c	add x8,x8,#0xa08
007fc340	tbz w9,#0x0,0x007fc3b8
007fc344	adrp x9,0xcca000
007fc348	ldrb w9,[x9, #0xa15]
007fc34c	cmp w9,#0x1
007fc350	b.ne 0x007fc398
007fc354	ldr s0,[x8, #0x8]
007fc358	adrp x9,0x29a000
007fc35c	mov w10,#0x67
007fc360	ldr d1,[x9, #0x400]
007fc364	adrp x9,0x29b000
007fc368	strb wzr,[x8, #0xd]
007fc36c	uxtl v0.8H,v0.8B
007fc370	ldr d2,[x9, #0xd78]
007fc374	ldrb w9,[x8, #0xc]
007fc378	eor w9,w9,w10
007fc37c	eor v0.8B,v0.8B,v1.8B
007fc380	ldr d1,[x8]
007fc384	strb w9,[x8, #0xc]
007fc388	eor v1.8B,v1.8B,v2.8B
007fc38c	uzp1 v0.8B,v0.8B,v0.8B
007fc390	str d1,[x8]
007fc394	str s0,[x8, #0x8]
007fc398	adrp x9,0xcca000
007fc39c	adrp x0,0xcca000
007fc3a0	add x0,x0,#0x8d0
007fc3a4	str x8,[x9, #0x8c8]
007fc3a8	ldp x29,x30,[sp], #0x10
007fc3ac	b 0x00c2fea0
007fc3b0	ldp x29,x30,[sp], #0x10
007fc3b4	ret
007fc3b8	adrp x0,0xcca000
007fc3bc	add x0,x0,#0xa18
007fc3c0	bl 0x00c2fe90
007fc3c4	adrp x8,0xcca000
007fc3c8	add x8,x8,#0xa08
007fc3cc	cbz w0,0x007fc344
007fc3d0	adrp x9,0x29a000
007fc3d4	adrp x10,0x29b000
007fc3d8	nop
007fc3dc	adr x0,0x7fded4
007fc3e0	ldr d0,[x9, #0xb90]
007fc3e4	ldr d1,[x10, #0x628]
007fc3e8	mov w9,#0x167
007fc3ec	adrp x2,0xc48000
007fc3f0	add x2,x2,#0x880
007fc3f4	adrp x1,0xcca000
007fc3f8	add x1,x1,#0xa08
007fc3fc	str d0,[x8]
007fc400	str s1,[x8, #0x8]
007fc404	strh w9,[x8, #0xc]
007fc408	bl 0x00c2fe70
007fc40c	adrp x0,0xcca000
007fc410	add x0,x0,#0xa18
007fc414	bl 0x00c2fea0
007fc418	adrp x8,0xcca000
007fc41c	add x8,x8,#0xa08
007fc420	b 0x007fc344
