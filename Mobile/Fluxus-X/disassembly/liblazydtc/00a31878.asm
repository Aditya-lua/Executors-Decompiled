; EC_POINT_is_on_curve @ 00a31878
00a31878	stp x29,x30,[sp, #-0x10]!
00a3187c	ldr x8,[x0]
00a31880	mov x29,sp
00a31884	ldr x3,[x8, #0xc0]
00a31888	cbz x3,0x00a318c0
00a3188c	ldr x9,[x1]
00a31890	cmp x8,x9
00a31894	b.eq 0x00a318fc
00a31898	bl 0x00c342a0
00a3189c	adrp x0,0x29e000
00a318a0	adrp x2,0x2ab000
00a318a4	add x0,x0,#0xa7
00a318a8	add x2,x2,#0xf99
00a318ac	mov w1,#0x3ef
00a318b0	bl 0x00c342b0
00a318b4	mov w0,#0x10
00a318b8	mov w1,#0x65
00a318bc	b 0x00a318e8
00a318c0	bl 0x00c342a0
00a318c4	adrp x0,0x29e000
00a318c8	adrp x2,0x2ab000
00a318cc	add x0,x0,#0xa7
00a318d0	add x2,x2,#0xf99
00a318d4	mov w1,#0x3eb
00a318d8	bl 0x00c342b0
00a318dc	mov w1,#0x101
00a318e0	mov w0,#0x10
00a318e4	movk w1,#0xc, LSL #16
00a318e8	mov x2,xzr
00a318ec	bl 0x00c342c0
00a318f0	mov w0,wzr
00a318f4	ldp x29,x30,[sp], #0x10
00a318f8	ret
00a318fc	ldr w8,[x0, #0x20]
00a31900	cbz w8,0x00a31914
00a31904	ldr w9,[x1, #0x8]
00a31908	cbz w9,0x00a31914
00a3190c	cmp w8,w9
00a31910	b.ne 0x00a31898
00a31914	ldp x29,x30,[sp], #0x10
00a31918	br x3
