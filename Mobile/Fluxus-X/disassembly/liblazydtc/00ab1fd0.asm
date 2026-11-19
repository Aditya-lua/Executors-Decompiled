; i2a_ASN1_INTEGER @ 00ab1fd0
00ab1fd0	sub sp,sp,#0x60
00ab1fd4	stp x26,x25,[sp, #0x10]
00ab1fd8	stp x24,x23,[sp, #0x20]
00ab1fdc	stp x22,x21,[sp, #0x30]
00ab1fe0	stp x20,x19,[sp, #0x40]
00ab1fe4	stp x29,x30,[sp, #0x50]
00ab1fe8	add x29,sp,#0x50
00ab1fec	cbz x1,0x00ab20ec
00ab1ff0	ldrb w8,[x1, #0x5]
00ab1ff4	mov x21,x1
00ab1ff8	mov x20,x0
00ab1ffc	mov w19,wzr
00ab2000	tbz w8,#0x0,0x00ab2024
00ab2004	adrp x1,0x2cc000
00ab2008	add x1,x1,#0xc8b
00ab200c	mov w2,#0x1
00ab2010	mov x0,x20
00ab2014	mov w19,#0x1
00ab2018	bl 0x00c34240
00ab201c	cmp w0,#0x1
00ab2020	b.ne 0x00ab20f4
00ab2024	ldr w8,[x21]
00ab2028	cbz w8,0x00ab20fc
00ab202c	cmp w8,#0x1
00ab2030	b.lt 0x00ab211c
00ab2034	mov w24,#0x41d5
00ab2038	adrp x22,0x2cb000
00ab203c	adrp x26,0x2a3000
00ab2040	mov x23,xzr
00ab2044	movk w24,#0xd41d, LSL #16
00ab2048	mov w25,#0x23
00ab204c	add x22,x22,#0xf79
00ab2050	add x26,x26,#0x64c
00ab2054	cbz x23,0x00ab2098
00ab2058	and x8,x23,#0xffffffff
00ab205c	mul x8,x8,x24
00ab2060	lsr x8,x8,#0x20
00ab2064	sub w9,w23,w8
00ab2068	add w8,w8,w9, LSR #0x1
00ab206c	lsr w8,w8,#0x5
00ab2070	mul w8,w8,w25
00ab2074	cmp w8,w23
00ab2078	b.ne 0x00ab2098
00ab207c	mov w2,#0x2
00ab2080	mov x0,x20
00ab2084	mov x1,x22
00ab2088	bl 0x00c34240
00ab208c	cmp w0,#0x2
00ab2090	b.ne 0x00ab20f4
00ab2094	add w19,w19,#0x2
00ab2098	ldr x8,[x21, #0x8]
00ab209c	add x1,sp,#0xc
00ab20a0	mov w2,#0x2
00ab20a4	mov x0,x20
00ab20a8	ldrb w9,[x8, x23]
00ab20ac	lsr w9,w9,#0x4
00ab20b0	ldrb w9,[x26, w9, UXTW ]
00ab20b4	strb w9,[sp, #0xc]
00ab20b8	ldrb w8,[x8, x23]
00ab20bc	and x8,x8,#0xf
00ab20c0	ldrb w8,[x26, x8]
00ab20c4	strb w8,[sp, #0xd]
00ab20c8	bl 0x00c34240
00ab20cc	cmp w0,#0x2
00ab20d0	b.ne 0x00ab20f4
00ab20d4	ldrsw x8,[x21]
00ab20d8	add x23,x23,#0x1
00ab20dc	add w19,w19,#0x2
00ab20e0	cmp x23,x8
00ab20e4	b.lt 0x00ab2054
00ab20e8	b 0x00ab211c
00ab20ec	mov w19,wzr
00ab20f0	b 0x00ab211c
00ab20f4	mov w19,#0xffffffff
00ab20f8	b 0x00ab211c
00ab20fc	adrp x1,0x2bb000
00ab2100	add x1,x1,#0x974
00ab2104	mov w2,#0x2
00ab2108	mov x0,x20
00ab210c	bl 0x00c34240
00ab2110	orr w8,w19,#0x2
00ab2114	cmp w0,#0x2
00ab2118	csinv w19,w8,wzr,eq
00ab211c	mov w0,w19
00ab2120	ldp x29,x30,[sp, #0x50]
00ab2124	ldp x20,x19,[sp, #0x40]
00ab2128	ldp x22,x21,[sp, #0x30]
00ab212c	ldp x24,x23,[sp, #0x20]
00ab2130	ldp x26,x25,[sp, #0x10]
00ab2134	add sp,sp,#0x60
00ab2138	ret
