; BN_mod_exp_simple @ 00a1cdf4
00a1cdf4	sub sp,sp,#0x170
00a1cdf8	stp x26,x25,[sp, #0x120]
00a1cdfc	stp x20,x19,[sp, #0x150]
00a1ce00	mov x25,x1
00a1ce04	mov x20,x0
00a1ce08	mov w1,#0x4
00a1ce0c	mov x0,x2
00a1ce10	stp x28,x27,[sp, #0x110]
00a1ce14	stp x24,x23,[sp, #0x130]
00a1ce18	stp x22,x21,[sp, #0x140]
00a1ce1c	stp x29,x30,[sp, #0x160]
00a1ce20	add x29,sp,#0x160
00a1ce24	mov x19,x4
00a1ce28	mov x21,x3
00a1ce2c	mov x22,x2
00a1ce30	bl 0x00c38ce0
00a1ce34	cbnz w0,0x00a1ce58
00a1ce38	mov w1,#0x4
00a1ce3c	mov x0,x25
00a1ce40	bl 0x00c38ce0
00a1ce44	cbnz w0,0x00a1ce58
00a1ce48	mov w1,#0x4
00a1ce4c	mov x0,x21
00a1ce50	bl 0x00c38ce0
00a1ce54	cbz w0,0x00a1ceb0
00a1ce58	bl 0x00c342a0
00a1ce5c	adrp x0,0x2c9000
00a1ce60	adrp x2,0x2d1000
00a1ce64	add x0,x0,#0x65b
00a1ce68	add x2,x2,#0x799
00a1ce6c	mov w1,#0x52c
00a1ce70	bl 0x00c342b0
00a1ce74	mov w1,#0x101
00a1ce78	orr w0,wzr,#0x3
00a1ce7c	movk w1,#0xc, LSL #16
00a1ce80	mov x2,xzr
00a1ce84	bl 0x00c342c0
00a1ce88	mov w24,wzr
00a1ce8c	mov w0,w24
00a1ce90	ldp x29,x30,[sp, #0x160]
00a1ce94	ldp x20,x19,[sp, #0x150]
00a1ce98	ldp x22,x21,[sp, #0x140]
00a1ce9c	ldp x24,x23,[sp, #0x130]
00a1cea0	ldp x26,x25,[sp, #0x120]
00a1cea4	ldp x28,x27,[sp, #0x110]
00a1cea8	add sp,sp,#0x170
00a1ceac	ret
00a1ceb0	cmp x20,x21
00a1ceb4	b.eq 0x00a1cf20
00a1ceb8	mov x0,x22
00a1cebc	bl 0x00c322f0
00a1cec0	cbz w0,0x00a1cf4c
00a1cec4	mov w23,w0
00a1cec8	mov x0,x19
00a1cecc	bl 0x00c38a90
00a1ced0	mov x0,x19
00a1ced4	bl 0x00c38a40
00a1ced8	mov x24,x0
00a1cedc	mov x0,x19
00a1cee0	bl 0x00c38a40
00a1cee4	str x0,[sp, #0x8]
00a1cee8	cbz x0,0x00a1d194
00a1ceec	mov x1,x25
00a1cef0	mov x2,x21
00a1cef4	mov x3,x19
00a1cef8	mov x26,x0
00a1cefc	bl 0x00c38f30
00a1cf00	cbz w0,0x00a1d194
00a1cf04	mov x0,x26
00a1cf08	bl 0x00c369b0
00a1cf0c	cbz w0,0x00a1cf80
00a1cf10	mov x0,x20
00a1cf14	bl 0x00c38e00
00a1cf18	mov w24,#0x1
00a1cf1c	b 0x00a1d198
00a1cf20	bl 0x00c342a0
00a1cf24	adrp x0,0x2c9000
00a1cf28	adrp x2,0x2d1000
00a1cf2c	add x0,x0,#0x65b
00a1cf30	add x2,x2,#0x799
00a1cf34	mov w1,#0x531
00a1cf38	bl 0x00c342b0
00a1cf3c	mov w1,#0x106
00a1cf40	orr w0,wzr,#0x3
00a1cf44	movk w1,#0x8, LSL #16
00a1cf48	b 0x00a1ce80
00a1cf4c	mov w1,#0x1
00a1cf50	mov x0,x21
00a1cf54	bl 0x00c38c60
00a1cf58	cbz w0,0x00a1cf6c
00a1cf5c	mov x0,x20
00a1cf60	bl 0x00c38e00
00a1cf64	mov w24,#0x1
00a1cf68	b 0x00a1ce8c
00a1cf6c	mov w1,#0x1
00a1cf70	mov x0,x20
00a1cf74	bl 0x00c37720
00a1cf78	mov w24,w0
00a1cf7c	b 0x00a1ce8c
00a1cf80	cmp w23,#0x29f
00a1cf84	b.le 0x00a1cf90
00a1cf88	orr w8,wzr,#0x6
00a1cf8c	b 0x00a1cfbc
00a1cf90	cmp w23,#0xef
00a1cf94	b.le 0x00a1cfa0
00a1cf98	mov w8,#0x5
00a1cf9c	b 0x00a1cfbc
00a1cfa0	cmp w23,#0x4f
00a1cfa4	b.le 0x00a1cfb0
00a1cfa8	mov w8,#0x4
00a1cfac	b 0x00a1cfbc
00a1cfb0	cmp w23,#0x18
00a1cfb4	b.lt 0x00a1d040
00a1cfb8	orr w8,wzr,#0x3
00a1cfbc	mov x0,x24
00a1cfc0	mov x1,x26
00a1cfc4	mov x2,x26
00a1cfc8	mov x3,x21
00a1cfcc	mov x4,x19
00a1cfd0	str w8,[sp, #0x4]
00a1cfd4	bl 0x00c38ef0
00a1cfd8	cbz w0,0x00a1d194
00a1cfdc	ldr w8,[sp, #0x4]
00a1cfe0	mov w9,#0x1
00a1cfe4	sub w8,w8,#0x1
00a1cfe8	lsl w8,w9,w8
00a1cfec	cmp w8,#0x2
00a1cff0	b.lt 0x00a1d048
00a1cff4	mov x25,xzr
00a1cff8	sxtw x26,w8
00a1cffc	add x27,sp,#0x8
00a1d000	mov x0,x19
00a1d004	bl 0x00c38a40
00a1d008	add x8,x27,x25, LSL #0x3
00a1d00c	str x0,[x8, #0x8]
00a1d010	cbz x0,0x00a1d194
00a1d014	ldr x1,[x27, x25, LSL #0x3]
00a1d018	mov x2,x24
00a1d01c	mov x3,x21
00a1d020	mov x4,x19
00a1d024	bl 0x00c38ef0
00a1d028	cbz w0,0x00a1d194
00a1d02c	add x8,x25,#0x2
00a1d030	add x25,x25,#0x1
00a1d034	cmp x8,x26
00a1d038	b.lt 0x00a1d000
00a1d03c	b 0x00a1d048
00a1d040	mov w8,#0x1
00a1d044	str w8,[sp, #0x4]
00a1d048	cmp x20,x22
00a1d04c	b.eq 0x00a1d178
00a1d050	mov w1,#0x1
00a1d054	mov x0,x20
00a1d058	bl 0x00c37720
00a1d05c	cbz w0,0x00a1d194
00a1d060	sub w23,w23,#0x1
00a1d064	mov w27,#0x1
00a1d068	b 0x00a1d070
00a1d06c	sub w23,w23,#0x1
00a1d070	mov x0,x22
00a1d074	mov w1,w23
00a1d078	bl 0x00c38d00
00a1d07c	cbnz w0,0x00a1d0a8
00a1d080	cbnz w27,0x00a1d0a0
00a1d084	mov x0,x20
00a1d088	mov x1,x20
00a1d08c	mov x2,x20
00a1d090	mov x3,x21
00a1d094	mov x4,x19
00a1d098	bl 0x00c38ef0
00a1d09c	cbz w0,0x00a1d194
00a1d0a0	cbnz w23,0x00a1d06c
00a1d0a4	b 0x00a1d1a4
00a1d0a8	ldr w8,[sp, #0x4]
00a1d0ac	cmp w8,#0x2
00a1d0b0	b.cc 0x00a1d100
00a1d0b4	mov w25,wzr
00a1d0b8	sub w24,w23,#0x1
00a1d0bc	mov w26,#0x1
00a1d0c0	mov w28,#0x1
00a1d0c4	tbnz w24,#0x1f,0x00a1d108
00a1d0c8	mov x0,x22
00a1d0cc	mov w1,w24
00a1d0d0	bl 0x00c38d00
00a1d0d4	cbz w0,0x00a1d0e8
00a1d0d8	sub w8,w28,w25
00a1d0dc	lsl w8,w26,w8
00a1d0e0	orr w26,w8,#0x1
00a1d0e4	mov w25,w28
00a1d0e8	ldr w8,[sp, #0x4]
00a1d0ec	add w28,w28,#0x1
00a1d0f0	sub w24,w24,#0x1
00a1d0f4	cmp w28,w8
00a1d0f8	b.cc 0x00a1d0c4
00a1d0fc	b 0x00a1d108
00a1d100	mov w25,wzr
00a1d104	mov w26,#0x1
00a1d108	cbnz w27,0x00a1d13c
00a1d10c	tbnz w25,#0x1f,0x00a1d13c
00a1d110	mov w24,#0xffffffff
00a1d114	mov x0,x20
00a1d118	mov x1,x20
00a1d11c	mov x2,x20
00a1d120	mov x3,x21
00a1d124	mov x4,x19
00a1d128	bl 0x00c38ef0
00a1d12c	cbz w0,0x00a1d194
00a1d130	add w24,w24,#0x1
00a1d134	cmp w24,w25
00a1d138	b.lt 0x00a1d114
00a1d13c	asr w8,w26,#0x1
00a1d140	add x9,sp,#0x8
00a1d144	ldr x2,[x9, w8, SXTW #0x3]
00a1d148	mov x0,x20
00a1d14c	mov x1,x20
00a1d150	mov x3,x21
00a1d154	mov x4,x19
00a1d158	bl 0x00c38ef0
00a1d15c	cbz w0,0x00a1d194
00a1d160	sub w8,w23,#0x1
00a1d164	mov w27,wzr
00a1d168	subs w23,w8,w25
00a1d16c	mov w24,#0x1
00a1d170	b.pl 0x00a1d070
00a1d174	b 0x00a1d198
00a1d178	mov x0,x19
00a1d17c	bl 0x00c38a40
00a1d180	cbz x0,0x00a1d194
00a1d184	mov x1,x20
00a1d188	mov x22,x0
00a1d18c	bl 0x00c36990
00a1d190	cbnz x0,0x00a1d050
00a1d194	mov w24,wzr
00a1d198	mov x0,x19
00a1d19c	bl 0x00c38a20
00a1d1a0	b 0x00a1ce8c
00a1d1a4	mov w24,#0x1
00a1d1a8	b 0x00a1d198
