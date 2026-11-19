; curl_mime_free @ 00925fbc
00925fbc	str x21,[sp, #-0x30]!
00925fc0	stp x20,x19,[sp, #0x10]
00925fc4	stp x29,x30,[sp, #0x20]
00925fc8	add x29,sp,#0x20
00925fcc	mov x19,x0
00925fd0	cbz x0,0x00926064
00925fd4	ldr x8,[x19]
00925fd8	cbz x8,0x00926010
00925fdc	mov w9,#0x1
00925fe0	str x9,[x8, #0x1b0]
00925fe4	ldr w9,[x8, #0x14]
00925fe8	stp xzr,xzr,[x8, #0x18]
00925fec	stp xzr,xzr,[x8, #0x28]
00925ff0	stp x8,xzr,[x8, #0x38]
00925ff4	and w9,w9,#0xfffffffb
00925ff8	str xzr,[x8, #0x70]
00925ffc	stp xzr,xzr,[x8, #0xa0]
00926000	str xzr,[x8, #0x98]
00926004	str wzr,[x8, #0x78]
00926008	stp wzr,w9,[x8, #0x10]
0092600c	str xzr,[x19]
00926010	ldr x20,[x19, #0x8]
00926014	cbz x20,0x00926044
00926018	adrp x21,0xcc4000
0092601c	add x21,x21,#0x678
00926020	ldr x8,[x20, #0x8]
00926024	mov x0,x20
00926028	str x8,[x19, #0x8]
0092602c	bl 0x00925eb8
00926030	ldr x8,[x21]
00926034	mov x0,x20
00926038	blr x8
0092603c	ldr x20,[x19, #0x8]
00926040	cbnz x20,0x00926020
00926044	adrp x8,0xcc4000
00926048	add x8,x8,#0x678
0092604c	mov x0,x19
00926050	ldp x29,x30,[sp, #0x20]
00926054	ldp x20,x19,[sp, #0x10]
00926058	ldr x1,[x8]
0092605c	ldr x21,[sp], #0x30
00926060	br x1
00926064	ldp x29,x30,[sp, #0x20]
00926068	ldp x20,x19,[sp, #0x10]
0092606c	ldr x21,[sp], #0x30
00926070	ret
