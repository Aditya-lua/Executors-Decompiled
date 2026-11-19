; BN_cmp @ 00a02660
00a02660	mov x8,x0
00a02664	cbz x0,0x00a026ec
00a02668	cbz x1,0x00a026ec
00a0266c	ldr w9,[x8, #0x10]
00a02670	ldr w10,[x1, #0x10]
00a02674	mov w11,#0x1
00a02678	cmp w9,#0x0
00a0267c	cneg w0,w11,ne
00a02680	cmp w9,w10
00a02684	b.ne 0x00a026e8
00a02688	ldrsw x10,[x8, #0x8]
00a0268c	ldr w11,[x1, #0x8]
00a02690	cmp w9,#0x0
00a02694	mov w9,#0xffffffff
00a02698	cneg w9,w9,ne
00a0269c	cmp w10,w11
00a026a0	b.gt 0x00a026e8
00a026a4	cmp w10,w11
00a026a8	b.lt 0x00a026e4
00a026ac	sub x10,x10,#0x1
00a026b0	add x11,x10,#0x1
00a026b4	cmp x11,#0x1
00a026b8	b.lt 0x00a02700
00a026bc	ldr x11,[x8]
00a026c0	ldr x12,[x1]
00a026c4	lsl x13,x10,#0x3
00a026c8	ldr x11,[x11, x13#0x0]
00a026cc	ldr x12,[x12, x13#0x0]
00a026d0	cmp x11,x12
00a026d4	b.hi 0x00a026e8
00a026d8	cmp x11,x12
00a026dc	sub x10,x10,#0x1
00a026e0	b.cs 0x00a026b0
00a026e4	mov w0,w9
00a026e8	ret
00a026ec	cmp x1,#0x0
00a026f0	cset w9,ne
00a026f4	cmp x8,#0x0
00a026f8	csinv w0,w9,wzr,eq
00a026fc	ret
00a02700	mov w0,wzr
00a02704	ret
