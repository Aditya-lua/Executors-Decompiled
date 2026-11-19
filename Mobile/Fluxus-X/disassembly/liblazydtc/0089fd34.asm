; FUN_0089fd34 @ 0089fd34
0089fd34	ldr w9,[x0]
0089fd38	mov w8,wzr
0089fd3c	cmp w9,#0x3
0089fd40	b.le 0x0089fdac
0089fd44	cmp w9,#0x5
0089fd48	b.gt 0x0089fde0
0089fd4c	cmp w9,#0x4
0089fd50	b.eq 0x0089fe1c
0089fd54	cmp w9,#0x5
0089fd58	b.ne 0x0089fea8
0089fd5c	ldr w8,[x1]
0089fd60	cmp w8,#0x5
0089fd64	b.ne 0x0089feb0
0089fd68	ldr d0,[x0, #0x8]
0089fd6c	ldr d1,[x1, #0x8]
0089fd70	fcmp d0,d1
0089fd74	b.ne 0x0089feb0
0089fd78	ldr d0,[x0, #0x10]
0089fd7c	ldr d1,[x1, #0x10]
0089fd80	fcmp d0,d1
0089fd84	b.ne 0x0089feb0
0089fd88	ldr d0,[x0, #0x18]
0089fd8c	ldr d1,[x1, #0x18]
0089fd90	fcmp d0,d1
0089fd94	b.ne 0x0089feb0
0089fd98	ldr d0,[x0, #0x20]
0089fd9c	ldr d1,[x1, #0x20]
0089fda0	fcmp d0,d1
0089fda4	cset w0,eq
0089fda8	ret
0089fdac	cmp w9,#0x1
0089fdb0	b.eq 0x0089fe0c
0089fdb4	cmp w9,#0x2
0089fdb8	b.eq 0x0089feb8
0089fdbc	cmp w9,#0x3
0089fdc0	b.ne 0x0089fea8
0089fdc4	ldr d0,[x0, #0x8]
0089fdc8	ldr d1,[x1, #0x8]
0089fdcc	ldr w8,[x1]
0089fdd0	fcmp d0,d1
0089fdd4	ccmp w8,#0x3,#0x0,eq
0089fdd8	cset w0,eq
0089fddc	ret
0089fde0	cmp w9,#0x6
0089fde4	b.eq 0x0089fe6c
0089fde8	cmp w9,#0x7
0089fdec	b.ne 0x0089fea8
0089fdf0	ldr w8,[x1]
0089fdf4	ldr x9,[x0, #0x8]
0089fdf8	ldr x10,[x1, #0x8]
0089fdfc	cmp w8,#0x7
0089fe00	ccmp x9,x10,#0x0,eq
0089fe04	cset w0,eq
0089fe08	ret
0089fe0c	ldr w8,[x1]
0089fe10	cmp w8,#0x1
0089fe14	cset w0,eq
0089fe18	ret
0089fe1c	ldr w8,[x1]
0089fe20	cmp w8,#0x4
0089fe24	b.ne 0x0089feb0
0089fe28	ldr s0,[x0, #0x8]
0089fe2c	ldr s1,[x1, #0x8]
0089fe30	fcmp s0,s1
0089fe34	b.ne 0x0089feb0
0089fe38	ldr s0,[x0, #0xc]
0089fe3c	ldr s1,[x1, #0xc]
0089fe40	fcmp s0,s1
0089fe44	b.ne 0x0089feb0
0089fe48	ldr s0,[x0, #0x10]
0089fe4c	ldr s1,[x1, #0x10]
0089fe50	fcmp s0,s1
0089fe54	b.ne 0x0089feb0
0089fe58	ldr s0,[x0, #0x14]
0089fe5c	ldr s1,[x1, #0x14]
0089fe60	fcmp s0,s1
0089fe64	cset w0,eq
0089fe68	ret
0089fe6c	ldr w8,[x1]
0089fe70	cmp w8,#0x6
0089fe74	b.ne 0x0089feb0
0089fe78	ldr w2,[x0, #0x4]
0089fe7c	ldr w8,[x1, #0x4]
0089fe80	cmp w2,w8
0089fe84	b.ne 0x0089feb0
0089fe88	stp x29,x30,[sp, #-0x10]!
0089fe8c	mov x29,sp
0089fe90	ldr x0,[x0, #0x8]
0089fe94	ldr x1,[x1, #0x8]
0089fe98	bl 0x00c300b0
0089fe9c	cmp w0,#0x0
0089fea0	cset w8,eq
0089fea4	ldp x29,x30,[sp], #0x10
0089fea8	mov w0,w8
0089feac	ret
0089feb0	mov w0,wzr
0089feb4	ret
0089feb8	ldr w8,[x1]
0089febc	ldrb w9,[x0, #0x8]
0089fec0	ldrb w10,[x1, #0x8]
0089fec4	cmp w8,#0x2
0089fec8	and w8,w9,#0xff
0089fecc	and w9,w10,#0xff
0089fed0	ccmp w8,w9,#0x0,eq
0089fed4	cset w0,eq
0089fed8	ret
